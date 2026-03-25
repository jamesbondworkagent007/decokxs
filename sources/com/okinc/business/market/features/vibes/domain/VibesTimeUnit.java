package com.okinc.business.market.features.vibes.domain;

import com.ibm.icu.text.DateFormat;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class VibesTimeUnit {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ VibesTimeUnit[] $VALUES;
    private final int value;
    public static final VibesTimeUnit M = new VibesTimeUnit("M", 0, 1);
    public static final VibesTimeUnit H = new VibesTimeUnit(DateFormat.HOUR24, 1, 2);
    public static final VibesTimeUnit D = new VibesTimeUnit("D", 2, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ VibesTimeUnit[] $values() {
        return new VibesTimeUnit[]{M, H, D};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<VibesTimeUnit> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private VibesTimeUnit(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        VibesTimeUnit[] vibesTimeUnitArr$values = $values();
        $VALUES = vibesTimeUnitArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(vibesTimeUnitArr$values);
    }

    public static VibesTimeUnit valueOf(String str) {
        return (VibesTimeUnit) Enum.valueOf(VibesTimeUnit.class, str);
    }

    public static VibesTimeUnit[] values() {
        return (VibesTimeUnit[]) $VALUES.clone();
    }
}
