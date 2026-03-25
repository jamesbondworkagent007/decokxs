package com.okinc.localization.util.format;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class PrecisionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PrecisionType[] $VALUES;
    public static final PrecisionType MIN = new PrecisionType("MIN", 0);
    public static final PrecisionType MAX = new PrecisionType("MAX", 1);
    public static final PrecisionType MIN_MAX = new PrecisionType("MIN_MAX", 2);
    public static final PrecisionType FIXED = new PrecisionType("FIXED", 3);
    public static final PrecisionType INCREMENT = new PrecisionType("INCREMENT", 4);
    public static final PrecisionType Significant = new PrecisionType("Significant", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PrecisionType[] $values() {
        return new PrecisionType[]{MIN, MAX, MIN_MAX, FIXED, INCREMENT, Significant};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PrecisionType> getEntries() {
        return $ENTRIES;
    }

    private PrecisionType(String str, int i) {
    }

    static {
        PrecisionType[] precisionTypeArr$values = $values();
        $VALUES = precisionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(precisionTypeArr$values);
    }

    public static PrecisionType valueOf(String str) {
        return (PrecisionType) Enum.valueOf(PrecisionType.class, str);
    }

    public static PrecisionType[] values() {
        return (PrecisionType[]) $VALUES.clone();
    }
}
