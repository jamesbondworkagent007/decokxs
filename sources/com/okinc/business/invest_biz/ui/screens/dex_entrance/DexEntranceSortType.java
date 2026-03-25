package com.okinc.business.invest_biz.ui.screens.dex_entrance;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class DexEntranceSortType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DexEntranceSortType[] $VALUES;
    private final String value;
    public static final DexEntranceSortType TVL = new DexEntranceSortType("TVL", 0, "TVL");
    public static final DexEntranceSortType RATE = new DexEntranceSortType("RATE", 1, "RATE");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DexEntranceSortType[] $values() {
        return new DexEntranceSortType[]{TVL, RATE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DexEntranceSortType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private DexEntranceSortType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        DexEntranceSortType[] dexEntranceSortTypeArr$values = $values();
        $VALUES = dexEntranceSortTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dexEntranceSortTypeArr$values);
    }

    public static DexEntranceSortType valueOf(String str) {
        return (DexEntranceSortType) Enum.valueOf(DexEntranceSortType.class, str);
    }

    public static DexEntranceSortType[] values() {
        return (DexEntranceSortType[]) $VALUES.clone();
    }
}
