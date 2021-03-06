package org.prom5.framework.models.logabstraction;

import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;

import org.prom5.analysis.log.scale.ProcessInstanceScale;
import org.prom5.framework.log.AuditTrailEntry;
import org.prom5.framework.log.LogEvent;
import org.prom5.framework.log.LogReader;
import org.prom5.framework.log.ProcessInstance;
import org.prom5.framework.ui.Message;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2004</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class PrefixAbstraction extends ProcessInstanceBasedAbstraction {

	private ProcessInstance pi;

	public PrefixAbstraction(LogReader log, ProcessInstance instance, ProcessInstanceScale scale) {
		super(scale, log);
		this.pi = instance;
		addInstance(instance);
	}

	public double calculateFitness(LogAbstraction logAbstraction) {
		return calculateFitnessResult(logAbstraction).fitness;
	}

	protected FitnessResult calculateFitnessResult(LogAbstraction logAbstraction) {
		FitnessResult result = new FitnessResult();
		PrefixAbstraction abstr = (PrefixAbstraction) logAbstraction;
		if (abstr.pi.getAuditTrailEntryList().size() >= pi.getAuditTrailEntryList().size()) {
			result.fitness = 0.0;
			result.doesFit = false;
			return result;
		}
		for (int i = 0; i < abstr.pi.getAuditTrailEntryList().size(); i++) {
			try {
				if (!same(this.pi.getAuditTrailEntryList().get(i),
						abstr.pi.getAuditTrailEntryList().get(i))) {
					result.fitness = 0.0;
					result.doesFit = false;
					return result;
				}
			} catch (IOException ex) {
				Message.add("Error while reading log file", Message.ERROR);
				result.fitness = 0.0;
				result.doesFit = false;
				return result;
			} catch (IndexOutOfBoundsException ex) {
				Message.add("Error while reading log file", Message.ERROR);
				result.fitness = 0.0;
				result.doesFit = false;
				return result;
			}
		}
		result.fitness = 1.0;
		result.doesFit = true;
		result.lastFitIndex= abstr.pi.getAuditTrailEntryList().size()-1;
		return result;
	}

	protected boolean same(AuditTrailEntry ate1, AuditTrailEntry ate2) {
		return ate1.getElement().equals(ate2.getElement()) &&
				ate1.getType().equals(ate2.getType());
	}

	public ProcessInstance getPi() {
		return pi;
	}

	public SortedSet getPossibleNextLogEvents(LogAbstraction partialTrace) {
		PrefixAbstraction partial = (PrefixAbstraction) partialTrace;
		FitnessResult fit = calculateFitnessResult(partial);
		TreeSet<LogEvent> result = new TreeSet();
		if (fit.doesFit && pi.getAuditTrailEntryList().size() > fit.lastFitIndex+1) {
			AuditTrailEntry ate = null;
			try {
				ate = pi.getAuditTrailEntryList().get(fit.lastFitIndex+1);
			} catch (IOException ex) {
				Message.add("Error while reading log file", Message.ERROR);
			} catch (IndexOutOfBoundsException ex) {
				Message.add("Error while reading log file", Message.ERROR);
			}
			LogEvent evt = new LogEvent(ate.getName(), ate.getType());
			result.add(evt);
		}
		return result;
	}

}
