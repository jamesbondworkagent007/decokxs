package com.okinc.kline.features.settings.main.data.datasource;

import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.oSK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class TradingDisplayType implements oSK {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradingDisplayType[] $VALUES;
    public static final TradingDisplayType OpenOrders = new TradingDisplayType("OpenOrders", 0);
    public static final TradingDisplayType HistoricalOrder = new TradingDisplayType("HistoricalOrder", 1);
    public static final TradingDisplayType AverageCost = new TradingDisplayType("AverageCost", 2);
    public static final TradingDisplayType CostOfPositions = new TradingDisplayType("CostOfPositions", 3);
    public static final TradingDisplayType BreakEvenPrice = new TradingDisplayType("BreakEvenPrice", 4);
    public static final TradingDisplayType LipPrice = new TradingDisplayType("LipPrice", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradingDisplayType[] $values() {
        return new TradingDisplayType[]{OpenOrders, HistoricalOrder, AverageCost, CostOfPositions, BreakEvenPrice, LipPrice};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradingDisplayType> getEntries() {
        return $ENTRIES;
    }

    private TradingDisplayType(String str, int i) {
    }

    static {
        TradingDisplayType[] tradingDisplayTypeArr$values = $values();
        $VALUES = tradingDisplayTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradingDisplayTypeArr$values);
    }

    public static TradingDisplayType valueOf(String str) {
        return (TradingDisplayType) Enum.valueOf(TradingDisplayType.class, str);
    }

    public static TradingDisplayType[] values() {
        return (TradingDisplayType[]) $VALUES.clone();
    }
}
