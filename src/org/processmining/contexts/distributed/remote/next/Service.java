/**
 *
 */
package org.processmining.contexts.distributed.remote.next;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author christian
 * 
 */
public class Service {

	protected ServerSocket serverSocket;
	protected int port;
	protected ServiceHandler handler;
	protected boolean running;
	protected Thread serverThread;

	public Service(int aPort, ServiceHandler aHandler) {
		port = aPort;
		handler = aHandler;
		serverSocket = null;
		running = false;
		serverThread = null;
	}

	public void start() throws IOException {
		running = true;
		serverSocket = new ServerSocket(port);
		serverThread = new Thread() {
			public void run() {
				while (running == true) {
					try {
						// wait for and handle incoming connections
						//System.out.println("Wait for connection");
						Socket clientSocket = serverSocket.accept();
						handleConnection(clientSocket);
					} catch (IOException e) {
						// No connections were made yet, and this.stop() was called.

						//System.err.println("Fatal error in server thread on port " + port);
						//System.err.println("Accept failed with IO Exception:");
						//e.printStackTrace();
						interrupt();
						return;
					}
				}
			}
		};
		serverThread.start();
	}

	public void stop() {
		if (serverThread != null) {
			if (serverThread.isAlive()) {
				try {
					serverSocket.close();
				} catch (IOException ex) {
					// No connections were made yet, so the serverthread was
					// blocked in the accept() method.
				}
				running = false;
			}
		}
	}

	protected void handleConnection(final Socket socket) {
		ConnectionHandlerThread handlerThread = new ConnectionHandlerThread(socket);
		handlerThread.start();
	}

	protected class ConnectionHandlerThread extends Thread {

		protected Socket clientSocket;

		public ConnectionHandlerThread(Socket aSocket) {
			clientSocket = aSocket;
		}

		public void run() {
			try {
				DataInputStream in = new DataInputStream(clientSocket.getInputStream());
				DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
				handler.handleRequest(in, out);
			} catch (IOException e) {
				// abort and give up
				System.err.println("Fatal error handling connection,");
				System.err.println("failed with IO Exception:");
				e.printStackTrace();
			} finally {
				// clean up connection
				try {
					if (clientSocket != null) {
						clientSocket.close();
					}
				} catch (IOException ie) { /* this one's forsaken.. */
				}
			}
		}
	}

}
