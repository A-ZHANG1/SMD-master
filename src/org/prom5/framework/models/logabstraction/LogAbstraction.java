package org.prom5.framework.models.logabstraction;

import java.util.SortedSet;

import org.prom5.framework.log.LogEvent;
import org.prom5.framework.log.LogReader;
import org.prom5.framework.models.recommendation.Recommendation;

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
public abstract class LogAbstraction {

	protected final LogReader log;

	public LogAbstraction(LogReader log) {
		this.log = log;
	}

	// The implementing class can assume that the provided LogAbstraction partialTrace is
	// of the same class, i.e. this.getClass().equals(partialTrace.getClass()) = true
	public abstract SortedSet<LogEvent> getPossibleNextLogEvents(LogAbstraction partialTrace);

	// The implementing class can assume that the provided LogAbstraction partialTrace is
	// of the same class, i.e. this.getClass().equals(partialTrace.getClass()) = true
	//
	// The implementing class can assume that the LogEvent provided is in the set returned by
	// getPossibleNextLogEvents(partialTrace), i.e. in all instances
	// represented by this abstraction, the given LogEvent is a possible
	// next step.
	public abstract Recommendation getRecommendation(LogEvent logEventToDo, LogAbstraction partialTrace, SortedSet<LogEvent>enabledEvents);


}
