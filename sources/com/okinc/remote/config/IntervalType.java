package com.okinc.remote.config;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class IntervalType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IntervalType[] $VALUES;
    public static final IntervalType LEFT_OPEN = new IntervalType("LEFT_OPEN", 0);
    public static final IntervalType LEFT_CLOSED = new IntervalType("LEFT_CLOSED", 1);
    public static final IntervalType RIGHT_OPEN = new IntervalType("RIGHT_OPEN", 2);
    public static final IntervalType RIGHT_CLOSED = new IntervalType("RIGHT_CLOSED", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IntervalType[] $values() {
        return new IntervalType[]{LEFT_OPEN, LEFT_CLOSED, RIGHT_OPEN, RIGHT_CLOSED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IntervalType> getEntries() {
        return $ENTRIES;
    }

    static {
        IntervalType[] intervalTypeArr$values = $values();
        $VALUES = intervalTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(intervalTypeArr$values);
    }

    private IntervalType(String str, int i) {
    }

    public static IntervalType valueOf(String str) {
        return (IntervalType) Enum.valueOf(IntervalType.class, str);
    }

    public static IntervalType[] values() {
        return (IntervalType[]) $VALUES.clone();
    }
}
