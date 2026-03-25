package com.okinc.dexkline.dex.api.enums;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class KlineDexPageFromType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KlineDexPageFromType[] $VALUES;
    private final String value;
    public static final KlineDexPageFromType HOMEPAGE_DEX_LIST = new KlineDexPageFromType("HOMEPAGE_DEX_LIST", 0, "homepage_dex_list");
    public static final KlineDexPageFromType HOMEPAGE_FAVORITE_LIST = new KlineDexPageFromType("HOMEPAGE_FAVORITE_LIST", 1, "homepage_favorite_list");
    public static final KlineDexPageFromType MARKET_DEX_LIST = new KlineDexPageFromType("MARKET_DEX_LIST", 2, "market_dex_list");
    public static final KlineDexPageFromType MARKET_FAVORITE_LIST = new KlineDexPageFromType("MARKET_FAVORITE_LIST", 3, "market_favorite_list");
    public static final KlineDexPageFromType EXPLORE_DEX_LIST = new KlineDexPageFromType("EXPLORE_DEX_LIST", 4, "explore_dex_list");
    public static final KlineDexPageFromType EXPLORE_FAVORITE_LIST = new KlineDexPageFromType("EXPLORE_FAVORITE_LIST", 5, "explore_favorite_list");
    public static final KlineDexPageFromType GLOBAL_SEARCH = new KlineDexPageFromType("GLOBAL_SEARCH", 6, "global_search");
    public static final KlineDexPageFromType TRADING_NAVIGATION = new KlineDexPageFromType("TRADING_NAVIGATION", 7, "trading_navigation");
    public static final KlineDexPageFromType TRADE_SWAP = new KlineDexPageFromType("TRADE_SWAP", 8, "trade_swap");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KlineDexPageFromType[] $values() {
        return new KlineDexPageFromType[]{HOMEPAGE_DEX_LIST, HOMEPAGE_FAVORITE_LIST, MARKET_DEX_LIST, MARKET_FAVORITE_LIST, EXPLORE_DEX_LIST, EXPLORE_FAVORITE_LIST, GLOBAL_SEARCH, TRADING_NAVIGATION, TRADE_SWAP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KlineDexPageFromType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private KlineDexPageFromType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        KlineDexPageFromType[] klineDexPageFromTypeArr$values = $values();
        $VALUES = klineDexPageFromTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(klineDexPageFromTypeArr$values);
    }

    public static KlineDexPageFromType valueOf(String str) {
        return (KlineDexPageFromType) Enum.valueOf(KlineDexPageFromType.class, str);
    }

    public static KlineDexPageFromType[] values() {
        return (KlineDexPageFromType[]) $VALUES.clone();
    }
}
