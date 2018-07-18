package org.prom5.analysis.traceclustering.ui;

import com.fluxicon.slickerbox.components.SlickTabbedPane;
import org.prom5.analysis.traceclustering.algorithm.ClusteringInput;
import org.prom5.analysis.traceclustering.model.ClusterSet;

/**
 *
 * @author Minseok Song
 *
 */
public class SOMClusterView extends SlickTabbedPane {

	protected ClusterSet clusters;
	protected ClusteringInput input;

	public SOMClusterView(ClusterSet clusters, ClusteringInput input, int colNumber, int rowNumber, int aScatteredRatio, String aBackgroundStyle, String aColorStyle, double[][] uMatrix) {
		this.clusters = clusters;
		this.input = input;
		this.addTab("Self Organizing Map", new SOMUI(clusters, colNumber, rowNumber, aScatteredRatio, aBackgroundStyle, aColorStyle, uMatrix));
		//		this.addTab("Comparison matrix", new DisjointClusterSetUI(clusters, input));
		this.addTab("Cluster inspector", new ClusterSetView(clusters));
	}

}