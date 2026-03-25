package com.okinc.business.market.features.module.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class MarketSortBy {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MarketSortBy[] $VALUES;
    public static final MarketSortBy VOLUME = new MarketSortBy("VOLUME", 0);
    public static final MarketSortBy MCAP = new MarketSortBy("MCAP", 1);
    public static final MarketSortBy PRICE = new MarketSortBy("PRICE", 2);
    public static final MarketSortBy CHANGE = new MarketSortBy("CHANGE", 3);
    public static final MarketSortBy RANK = new MarketSortBy("RANK", 4);
    public static final MarketSortBy NONE = new MarketSortBy("NONE", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MarketSortBy[] $values() {
        return new MarketSortBy[]{VOLUME, MCAP, PRICE, CHANGE, RANK, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MarketSortBy> getEntries() {
        return $ENTRIES;
    }

    private MarketSortBy(String str, int i) {
    }

    static {
        MarketSortBy[] marketSortByArr$values = $values();
        $VALUES = marketSortByArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(marketSortByArr$values);
    }

    public static MarketSortBy valueOf(String str) {
        return (MarketSortBy) Enum.valueOf(MarketSortBy.class, str);
    }

    public static MarketSortBy[] values() {
        return (MarketSortBy[]) $VALUES.clone();
    }
}
