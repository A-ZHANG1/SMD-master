/**
 *
 */
package org.prom5.analysis.log.scale;

import org.prom5.framework.log.LogReader;
import org.prom5.framework.log.ProcessInstance;
import org.prom5.framework.util.MethodsForWorkflowLogDataStructures;

/**
 * This scale weighs a process instance based on the overall
 * duration of execution (i.e. the runtime).
 *
 * @author Christian W. Guenther (christian@deckfour.org)
 *
 */
public class GroupedLogScale implements ProcessInstanceScale {

	protected boolean positivelyCorrelated;

	/**
	 * Creates a new duration scale which is <b>negatively correlated</b>,
	 * i.e. shorter instances will be weighed higher.
	 */
	public GroupedLogScale() {
		this(false);
	}

	/**
	 * Creates a new duration scale
	 * @param isPositivelyCorrelated Whether this instance is positively correlated
	 * to the instance duration, i.e. if set to <code>true</code> longer-running
	 * instances will yield a higher weight. If set to <code>false</code>, shorter
	 * instances will be weighed higher.
	 */
	public GroupedLogScale(boolean isPositivelyCorrelated) {
		positivelyCorrelated = isPositivelyCorrelated;
	}

	/* (non-Javadoc)
	 * @see org.processmining.analysis.log.scale.ProcessInstanceScale#weigh(org.processmining.framework.log.ProcessInstance)
	 */
	public double weigh(ProcessInstance instance) {
		return (double) MethodsForWorkflowLogDataStructures.getNumberSimilarProcessInstances(instance);
	}

	public String getName() {
		return "Grouped Log Scale";
	}

	public String getHtmlDescription() {
		return "Calculates how many process instances are represented by this one.";
	}

	public void initializeScale(LogReader log) {
		// TODO Auto-generated method stub

	}

	public void updateScale(ProcessInstance instance, LogReader log) {
		// TODO Auto-generated method stub

	}

}
