package com.okinc.business.trade.features.home.ui.cefi.common;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedAssetSort {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedAssetSort[] $VALUES;
    public static final AdvancedAssetSort DEFAULT = new AdvancedAssetSort("DEFAULT", 0);
    public static final AdvancedAssetSort VALUE = new AdvancedAssetSort("VALUE", 1);
    public static final AdvancedAssetSort PNL = new AdvancedAssetSort("PNL", 2);
    public static final AdvancedAssetSort PNL_PERCENT = new AdvancedAssetSort("PNL_PERCENT", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedAssetSort[] $values() {
        return new AdvancedAssetSort[]{DEFAULT, VALUE, PNL, PNL_PERCENT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedAssetSort> getEntries() {
        return $ENTRIES;
    }

    private AdvancedAssetSort(String str, int i) {
    }

    static {
        AdvancedAssetSort[] advancedAssetSortArr$values = $values();
        $VALUES = advancedAssetSortArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedAssetSortArr$values);
    }

    public static AdvancedAssetSort valueOf(String str) {
        return (AdvancedAssetSort) Enum.valueOf(AdvancedAssetSort.class, str);
    }

    public static AdvancedAssetSort[] values() {
        return (AdvancedAssetSort[]) $VALUES.clone();
    }
}
