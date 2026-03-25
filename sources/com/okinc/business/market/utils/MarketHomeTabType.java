package com.okinc.business.market.utils;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class MarketHomeTabType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MarketHomeTabType[] $VALUES;
    public static final MarketHomeTabType FAVORITE = new MarketHomeTabType("FAVORITE", 0);
    public static final MarketHomeTabType INDEX = new MarketHomeTabType("INDEX", 1);
    public static final MarketHomeTabType HOT = new MarketHomeTabType("HOT", 2);
    public static final MarketHomeTabType UP_RANK = new MarketHomeTabType("UP_RANK", 3);
    public static final MarketHomeTabType NEW_COIN = new MarketHomeTabType("NEW_COIN", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MarketHomeTabType[] $values() {
        return new MarketHomeTabType[]{FAVORITE, INDEX, HOT, UP_RANK, NEW_COIN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MarketHomeTabType> getEntries() {
        return $ENTRIES;
    }

    private MarketHomeTabType(String str, int i) {
    }

    static {
        MarketHomeTabType[] marketHomeTabTypeArr$values = $values();
        $VALUES = marketHomeTabTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(marketHomeTabTypeArr$values);
    }

    public static MarketHomeTabType valueOf(String str) {
        return (MarketHomeTabType) Enum.valueOf(MarketHomeTabType.class, str);
    }

    public static MarketHomeTabType[] values() {
        return (MarketHomeTabType[]) $VALUES.clone();
    }
}
