package com.okinc.unify_trade.bot.dcd.config;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class DcdProductSortCategory {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DcdProductSortCategory[] $VALUES;
    public static final DcdProductSortCategory STRIKE = new DcdProductSortCategory("STRIKE", 0);
    public static final DcdProductSortCategory TERM = new DcdProductSortCategory("TERM", 1);
    public static final DcdProductSortCategory APR = new DcdProductSortCategory("APR", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DcdProductSortCategory[] $values() {
        return new DcdProductSortCategory[]{STRIKE, TERM, APR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DcdProductSortCategory> getEntries() {
        return $ENTRIES;
    }

    private DcdProductSortCategory(String str, int i) {
    }

    static {
        DcdProductSortCategory[] dcdProductSortCategoryArr$values = $values();
        $VALUES = dcdProductSortCategoryArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dcdProductSortCategoryArr$values);
    }

    public static DcdProductSortCategory valueOf(String str) {
        return (DcdProductSortCategory) Enum.valueOf(DcdProductSortCategory.class, str);
    }

    public static DcdProductSortCategory[] values() {
        return (DcdProductSortCategory[]) $VALUES.clone();
    }
}
