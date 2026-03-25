package com.ibm.icu.number;

import o.C7188afC;

/* JADX INFO: loaded from: classes22.dex */
public abstract class NumberRangeFormatter {
    public static final C7188afC EZpvd = new C7188afC();

    public enum RangeCollapse {
        AUTO,
        NONE,
        UNIT,
        ALL
    }

    public enum RangeIdentityFallback {
        SINGLE_VALUE,
        APPROXIMATELY_OR_SINGLE_VALUE,
        APPROXIMATELY,
        RANGE
    }

    public enum RangeIdentityResult {
        EQUAL_BEFORE_ROUNDING,
        EQUAL_AFTER_ROUNDING,
        NOT_EQUAL
    }

    private NumberRangeFormatter() {
    }
}
