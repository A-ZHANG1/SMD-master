package org.prom5.mining.organizationmining.model;

import java.util.Iterator;

import org.prom5.framework.log.LogReader;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2004</p>
 *
 * <p>Company: </p>
 *
 * @author Minseok Song
 * @version 1.0
 */
public class AHCTreeNode extends Cluster{

	private Cluster left = null;
	private Cluster right = null;
	private double  distance = 0.0;
	private double[] center;

	public AHCTreeNode(LogReader aLog, String aName, AHCTreeNode left, AHCTreeNode right, double distance)
	{
		super(aLog, aName);
		this.left  = left;
		this.right = right;
		this.distance = distance;
		double[] leftCenter = null, rightCenter = null;
		int leftSize=0, rightSize=0;

		// generate trace list with left node
		if(left!=null&&left.getOriginatorList()!=null){
			Iterator itr = left.getOriginatorList().iterator();
			while(itr.hasNext()){
				this.addOriginator((String)itr.next());
			}
			leftCenter = left.getCenter();
			leftSize = left.size();
		}

		// generate trace list with right node
		if(right!=null&&right.getOriginatorList()!=null){
			Iterator itr = right.getOriginatorList().iterator();
			while(itr.hasNext()){
				this.addOriginator((String)itr.next());
			}
			rightCenter = right.getCenter();
			rightSize = right.size();
		}

		//calculate new center
		if(leftCenter!=null&&rightCenter!=null){
			center = new double[leftCenter.length];

			for (int i = 0; i < center.length; i++) {
				center[i] = (leftCenter[i] * leftSize + rightCenter[i] * rightSize) / (leftSize +
							rightSize);
			}
		}
	}

	public AHCTreeNode(LogReader aLog, String aName, double center[])
	{
		super(aLog, aName);
		this.left  = null;
		this.right = null;
		this.distance = 0;
		this.center = center;
	}



	public Cluster getLeft()
	{
		return left;
	}

	public Cluster getRight()
	{
		return right;
	}

	public double getDistance()
	{
		return distance;
	}

	public void setCenter(double[] center)
	{
		this.center = center;
	}

	public double[] getCenter()
	{
			return center;
	}
}
