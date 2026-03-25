package o;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;

/* JADX INFO: renamed from: o.xwo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56121xwo {
    public static final C56121xwo copydefault = new C56121xwo();
    public static final java.util.HashMap<java.lang.String, java.lang.String> EZpvd = new java.util.HashMap<>();
    public static final int AEQbTJ = 8;

    private C56121xwo() {
    }

    public final void AEQbTJ() {
        java.util.HashMap<java.lang.String, java.lang.String> map = EZpvd;
        map.put("InstrumentListener", "instruments");
        map.put("OpenInterestListener", "open-interest");
        map.put("TickersListener", "tickers");
        map.put("TradeListener", "trades");
        map.put("TradeAggregatedListener", "aggregated-trades");
        map.put("books_grouped_listener", "books-grouped");
        map.put("MarkPriceListener", "mark-price");
        map.put("OptionMarkPriceListener", "instrument-family-mark-price");
        map.put("EstimatedPriceListener", "estimated-price");
        map.put("LimitPriceListener", "price-limit");
        map.put("OptSummaryListener", "opt-summary");
        map.put("FundingRateListener", "funding-rate");
        map.put("IndexTickersListener", "index-tickers");
        map.put("AccountListener", MTAnalysisConstants.Account.KEY_ACCOUNT);
        map.put("AccountSummaryListener", "account-summary");
        map.put("TradeGreeksListener", "account-greeks");
        map.put("TradePositionListener", "positions");
        map.put("TradeOrderListener", "orders");
        map.put("TradeAllOrderListener", "group-order-priv");
        map.put("TradeStrategyOrderListener", "orders-algo");
        map.put("OptionTradeListener", "instrument-family-open-interest");
        map.put("OptionTickersListener", "bt-tickers");
        map.put("SlowIndexTickersListener", "index-tickers-3s");
        map.put("cup_ticker_listener", "cup-tickers-3s");
        map.put("multi_ticker_listener", "tickers-3s");
        map.put("OrderPositionCountListener", "private-summary");
        map.put("FindMovementListener", "notable-market-changes");
        map.put("FindConceptUpListener", "plate-rank");
        map.put("FindConceptDownListener", "plate-rank");
        map.put("BotUserSummaryListener", "algo-user-summary");
        map.put("TradeMessageNotifyListener", "trade-message-notify");
        map.put("CountDownBizInfoListener", "new-inst-countdown");
        map.put("CallAuctionBizInfoListener", "call-auction-details");
        map.put("PreQuoteBizInfoListener", "pre-quote-details");
        map.put("BestQuotesListener", "best-quotes");
        map.put("RFQSListener", "rfqs");
        map.put("MarketBooksListener", "books5");
        map.put("DexStatusListener", "dex-account-status");
        map.put("OptionsPositionListener", "options-simple-position");
        map.put("SimpleOptionListener", "options-simple-recommend");
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        java.lang.String str2 = EZpvd.get(str);
        return str2 == null ? "" : str2;
    }
}
