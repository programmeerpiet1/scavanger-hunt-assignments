package com.github.programmeerpiet1.scavangerhunt.assignments;

import com.github.programmeerpiet1.scavangerhunt.assignments.domain.Piet;

public abstract class Assignment<T> {
    protected final Piet[] pietjes;

    public Assignment(final Piet[] pietjes) {
        this.pietjes = pietjes;
    }

    public abstract T run();
}
