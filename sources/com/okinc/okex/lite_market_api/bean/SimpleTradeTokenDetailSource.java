package com.okinc.okex.lite_market_api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class SimpleTradeTokenDetailSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SimpleTradeTokenDetailSource[] $VALUES;
    private final String type;
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_SEARCH = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_SEARCH", 0, "token_detail_from_search");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_DEEPLINK = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_DEEPLINK", 1, "token_detail_from_deeplink");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_TOP_MOVERS = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_TOP_MOVERS", 2, "token_detail_from_top_movers");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_MOST_TRADED = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_MOST_TRADED", 3, "token_detail_from_most_trade");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_HOT_CRYPTO = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_HOT_CRYPTO", 4, "token_detail_from_hot_crypto");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_BTC_ETH = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_BTC_ETH", 5, "token_detail_from_btc_eth");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_FAVORITES = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_FAVORITES", 6, "token_detail_from_favorites");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_ALL_FILTER = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_ALL_FILTER", 7, "token_detail_from_all_filter");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_GAINERS_FILTER = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_GAINERS_FILTER", 8, "token_detail_from_gainers_filter");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_LOSERS_FILTER = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_LOSERS_FILTER", 9, "token_detail_from_losers_filter");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_HOT_FILTER = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_HOT_FILTER", 10, "token_detail_from_hot_filter");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_NEW_FILTER = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_NEW_FILTER", 11, "token_detail_from_new_filter");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_TOKEN_RECOMMENDATION = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_TOKEN_RECOMMENDATION", 12, "token_detail_from_token_recommendation");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_TRENDING_MEMES = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_TRENDING_MEMES", 13, "token_detail_from_trending_memes");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_MARKET_BRIEFING = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_MARKET_BRIEFING", 14, "token_detail_from_market_briefing");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_MARKET_BRIEFING_DETAIL = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_MARKET_BRIEFING_DETAIL", 15, "token_detail_from_market_briefing_detail");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_UNKNOWN = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_UNKNOWN", 16, "token_detail_from_unknown");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_NEW_TOKEN = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_NEW_TOKEN", 17, "token_detail_from_new_token");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_DEX_VIEW_OKX = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_DEX_VIEW_OKX", 18, "token_detail_from_dex_view_okx");
    public static final SimpleTradeTokenDetailSource TOKEN_DETAIL_FROM_TRENDING_DEX = new SimpleTradeTokenDetailSource("TOKEN_DETAIL_FROM_TRENDING_DEX", 19, "token_detail_from_trending_dex");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SimpleTradeTokenDetailSource[] $values() {
        return new SimpleTradeTokenDetailSource[]{TOKEN_DETAIL_FROM_SEARCH, TOKEN_DETAIL_FROM_DEEPLINK, TOKEN_DETAIL_FROM_TOP_MOVERS, TOKEN_DETAIL_FROM_MOST_TRADED, TOKEN_DETAIL_FROM_HOT_CRYPTO, TOKEN_DETAIL_FROM_BTC_ETH, TOKEN_DETAIL_FROM_FAVORITES, TOKEN_DETAIL_FROM_ALL_FILTER, TOKEN_DETAIL_FROM_GAINERS_FILTER, TOKEN_DETAIL_FROM_LOSERS_FILTER, TOKEN_DETAIL_FROM_HOT_FILTER, TOKEN_DETAIL_FROM_NEW_FILTER, TOKEN_DETAIL_FROM_TOKEN_RECOMMENDATION, TOKEN_DETAIL_FROM_TRENDING_MEMES, TOKEN_DETAIL_FROM_MARKET_BRIEFING, TOKEN_DETAIL_FROM_MARKET_BRIEFING_DETAIL, TOKEN_DETAIL_FROM_UNKNOWN, TOKEN_DETAIL_FROM_NEW_TOKEN, TOKEN_DETAIL_FROM_DEX_VIEW_OKX, TOKEN_DETAIL_FROM_TRENDING_DEX};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SimpleTradeTokenDetailSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private SimpleTradeTokenDetailSource(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        SimpleTradeTokenDetailSource[] simpleTradeTokenDetailSourceArr$values = $values();
        $VALUES = simpleTradeTokenDetailSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(simpleTradeTokenDetailSourceArr$values);
    }

    public static SimpleTradeTokenDetailSource valueOf(String str) {
        return (SimpleTradeTokenDetailSource) Enum.valueOf(SimpleTradeTokenDetailSource.class, str);
    }

    public static SimpleTradeTokenDetailSource[] values() {
        return (SimpleTradeTokenDetailSource[]) $VALUES.clone();
    }
}
