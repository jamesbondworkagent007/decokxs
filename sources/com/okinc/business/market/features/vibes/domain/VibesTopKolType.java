package com.okinc.business.market.features.vibes.domain;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class VibesTopKolType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ VibesTopKolType[] $VALUES;
    public static final VibesTopKolType TOP_10 = new VibesTopKolType("TOP_10", 0, 1);
    public static final VibesTopKolType TOP_50 = new VibesTopKolType("TOP_50", 1, 2);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ VibesTopKolType[] $values() {
        return new VibesTopKolType[]{TOP_10, TOP_50};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<VibesTopKolType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private VibesTopKolType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        VibesTopKolType[] vibesTopKolTypeArr$values = $values();
        $VALUES = vibesTopKolTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(vibesTopKolTypeArr$values);
    }

    public static VibesTopKolType valueOf(String str) {
        return (VibesTopKolType) Enum.valueOf(VibesTopKolType.class, str);
    }

    public static VibesTopKolType[] values() {
        return (VibesTopKolType[]) $VALUES.clone();
    }
}
