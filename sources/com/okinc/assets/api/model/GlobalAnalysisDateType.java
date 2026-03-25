package com.okinc.assets.api.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class GlobalAnalysisDateType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GlobalAnalysisDateType[] $VALUES;
    public static final GlobalAnalysisDateType SEVEN_DAYS = new GlobalAnalysisDateType("SEVEN_DAYS", 0);
    public static final GlobalAnalysisDateType THIRTY_DAYS = new GlobalAnalysisDateType("THIRTY_DAYS", 1);
    public static final GlobalAnalysisDateType NINETY_DAYS = new GlobalAnalysisDateType("NINETY_DAYS", 2);
    public static final GlobalAnalysisDateType OTHERS = new GlobalAnalysisDateType("OTHERS", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GlobalAnalysisDateType[] $values() {
        return new GlobalAnalysisDateType[]{SEVEN_DAYS, THIRTY_DAYS, NINETY_DAYS, OTHERS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GlobalAnalysisDateType> getEntries() {
        return $ENTRIES;
    }

    private GlobalAnalysisDateType(String str, int i) {
    }

    static {
        GlobalAnalysisDateType[] globalAnalysisDateTypeArr$values = $values();
        $VALUES = globalAnalysisDateTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(globalAnalysisDateTypeArr$values);
    }

    public static GlobalAnalysisDateType valueOf(String str) {
        return (GlobalAnalysisDateType) Enum.valueOf(GlobalAnalysisDateType.class, str);
    }

    public static GlobalAnalysisDateType[] values() {
        return (GlobalAnalysisDateType[]) $VALUES.clone();
    }
}
