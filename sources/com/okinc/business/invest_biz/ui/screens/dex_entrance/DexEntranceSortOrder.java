package com.okinc.business.invest_biz.ui.screens.dex_entrance;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class DexEntranceSortOrder {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DexEntranceSortOrder[] $VALUES;
    public static final DexEntranceSortOrder ASC = new DexEntranceSortOrder("ASC", 0, "ASC");
    public static final DexEntranceSortOrder DESC = new DexEntranceSortOrder("DESC", 1, "DESC");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DexEntranceSortOrder[] $values() {
        return new DexEntranceSortOrder[]{ASC, DESC};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DexEntranceSortOrder> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private DexEntranceSortOrder(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        DexEntranceSortOrder[] dexEntranceSortOrderArr$values = $values();
        $VALUES = dexEntranceSortOrderArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dexEntranceSortOrderArr$values);
    }

    public static DexEntranceSortOrder valueOf(String str) {
        return (DexEntranceSortOrder) Enum.valueOf(DexEntranceSortOrder.class, str);
    }

    public static DexEntranceSortOrder[] values() {
        return (DexEntranceSortOrder[]) $VALUES.clone();
    }
}
