package com.okinc.business.defi.api.model.tx.signdata;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class IntervalMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IntervalMode[] $VALUES;
    public static final IntervalMode NONE = new IntervalMode("NONE", 0);
    public static final IntervalMode RANGE = new IntervalMode("RANGE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IntervalMode[] $values() {
        return new IntervalMode[]{NONE, RANGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IntervalMode> getEntries() {
        return $ENTRIES;
    }

    private IntervalMode(String str, int i) {
    }

    static {
        IntervalMode[] intervalModeArr$values = $values();
        $VALUES = intervalModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(intervalModeArr$values);
    }

    public static IntervalMode valueOf(String str) {
        return (IntervalMode) Enum.valueOf(IntervalMode.class, str);
    }

    public static IntervalMode[] values() {
        return (IntervalMode[]) $VALUES.clone();
    }
}
