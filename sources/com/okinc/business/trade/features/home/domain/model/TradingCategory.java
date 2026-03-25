package com.okinc.business.trade.features.home.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TradingCategory {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradingCategory[] $VALUES;
    public static final TradingCategory Modes = new TradingCategory("Modes", 0);
    public static final TradingCategory Tools = new TradingCategory("Tools", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradingCategory[] $values() {
        return new TradingCategory[]{Modes, Tools};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradingCategory> getEntries() {
        return $ENTRIES;
    }

    private TradingCategory(String str, int i) {
    }

    static {
        TradingCategory[] tradingCategoryArr$values = $values();
        $VALUES = tradingCategoryArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradingCategoryArr$values);
    }

    public static TradingCategory valueOf(String str) {
        return (TradingCategory) Enum.valueOf(TradingCategory.class, str);
    }

    public static TradingCategory[] values() {
        return (TradingCategory[]) $VALUES.clone();
    }
}
