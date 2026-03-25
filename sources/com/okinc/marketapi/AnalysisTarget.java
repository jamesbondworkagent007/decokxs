package com.okinc.marketapi;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class AnalysisTarget {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AnalysisTarget[] $VALUES;
    public static final AnalysisTarget SPOT = new AnalysisTarget("SPOT", 0);
    public static final AnalysisTarget FUTURES = new AnalysisTarget("FUTURES", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AnalysisTarget[] $values() {
        return new AnalysisTarget[]{SPOT, FUTURES};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AnalysisTarget> getEntries() {
        return $ENTRIES;
    }

    private AnalysisTarget(String str, int i) {
    }

    static {
        AnalysisTarget[] analysisTargetArr$values = $values();
        $VALUES = analysisTargetArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(analysisTargetArr$values);
    }

    public static AnalysisTarget valueOf(String str) {
        return (AnalysisTarget) Enum.valueOf(AnalysisTarget.class, str);
    }

    public static AnalysisTarget[] values() {
        return (AnalysisTarget[]) $VALUES.clone();
    }
}
