package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import com.okinc.unify_trade.trade.model.CoinMarketData;
import com.okinc.unify_trade.trade.model.FutureSourceData;
import com.okinc.unify_trade.trade.model.IndexSourceData;
import com.okinc.unify_trade.trade.model.OptionSourceData;
import com.okinc.unify_trade.trade.model.SpotSourceData;
import com.okinc.unify_trade.trade.model.SwapSourceData;
import com.okinc.unify_trade.trade.model.WatchMarketData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pWr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38381pWr {
    public static final C38381pWr KWHzl = new C38381pWr();

    private C38381pWr() {
    }

    public static /* synthetic */ CoinQuote convertToCoinQuote$default(C38381pWr c38381pWr, IndexSourceData indexSourceData, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c38381pWr.OLrzqt(indexSourceData, z);
    }

    public final CoinQuote OLrzqt(@NotNull IndexSourceData indexSourceData, boolean z) {
        Intrinsics.checkNotNullParameter(indexSourceData, "");
        return AEQbTJ(indexSourceData, z);
    }

    public final CoinQuote OLrzqt(@NotNull MarketDataSource marketDataSource) {
        CoinQuote coinQuoteOLrzqt;
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        if (marketDataSource instanceof WatchMarketData) {
            coinQuoteOLrzqt = KWHzl((WatchMarketData) marketDataSource);
        } else if (marketDataSource instanceof CoinMarketData) {
            coinQuoteOLrzqt = KWHzl((CoinMarketData) marketDataSource);
        } else if (marketDataSource instanceof SpotSourceData) {
            coinQuoteOLrzqt = copydefault((SpotSourceData) marketDataSource);
        } else if (marketDataSource instanceof SwapSourceData) {
            coinQuoteOLrzqt = AEQbTJ((SwapSourceData) marketDataSource);
        } else if (marketDataSource instanceof FutureSourceData) {
            coinQuoteOLrzqt = AEQbTJ((FutureSourceData) marketDataSource);
        } else {
            coinQuoteOLrzqt = marketDataSource instanceof OptionSourceData ? OLrzqt((OptionSourceData) marketDataSource) : null;
        }
        if (coinQuoteOLrzqt != null) {
            coinQuoteOLrzqt.setHot(marketDataSource.isHot());
        }
        if (coinQuoteOLrzqt != null) {
            coinQuoteOLrzqt.setNewLabel(marketDataSource.getIsnewLabel());
        }
        return coinQuoteOLrzqt;
    }

    public final CoinQuote KWHzl(@NotNull WatchMarketData watchMarketData) {
        Intrinsics.checkNotNullParameter(watchMarketData, "");
        java.lang.String fullName = watchMarketData.isCoin() ? watchMarketData.getFullName() : watchMarketData.getRight();
        java.lang.String coinName = watchMarketData.isCoin() ? watchMarketData.getCoinName() : watchMarketData.getLeft();
        xTM xtm = xTM.AEQbTJ;
        java.lang.String strCopydefault = xtm.copydefault(watchMarketData);
        java.lang.String str = strCopydefault == null ? "" : strCopydefault;
        java.lang.String tradeLeverage = watchMarketData.getTradeLeverage();
        java.lang.String coinUrl = watchMarketData.getCoinUrl();
        java.lang.String strEZpvd = xtm.EZpvd(watchMarketData);
        java.lang.String str2 = strEZpvd == null ? "" : strEZpvd;
        boolean zAEQbTJ = AEQbTJ(watchMarketData);
        double dAEQbTJ = C33129mqd.AEQbTJ(watchMarketData.getTradePriceLimitNum());
        java.lang.String tradePriceLimit = watchMarketData.getTradePriceLimit();
        java.lang.String coinName2 = watchMarketData.isCoin() ? watchMarketData.getCoinName() : C54762xUj.EZpvd.copydefault(watchMarketData);
        java.lang.String coinName3 = watchMarketData.isCoin() ? watchMarketData.getCoinName() : C54762xUj.EZpvd.AEQbTJ(watchMarketData);
        java.lang.Boolean boolIsWatching = watchMarketData.isWatching();
        boolean zBooleanValue = boolIsWatching != null ? boolIsWatching.booleanValue() : false;
        java.lang.String bizType = watchMarketData.getBizType();
        java.lang.String bizInstId = watchMarketData.getBizInstId();
        java.lang.String quoteCcyUSDPrice = watchMarketData.getQuoteCcyUSDPrice();
        java.lang.String str3 = quoteCcyUSDPrice == null ? "" : quoteCcyUSDPrice;
        java.lang.String alias = watchMarketData.getAlias();
        java.lang.String instId = watchMarketData.getInstId();
        CountDownInfo countDownInfoOLrzqt = OLrzqt(instId != null ? instId : "", watchMarketData.getInstType());
        boolean zIsPreMarket = watchMarketData.isPreMarket();
        boolean zIsRebase = watchMarketData.isRebase();
        double dAEQbTJ2 = C33129mqd.AEQbTJ(watchMarketData.getTickerPrice());
        java.lang.Double sortTurnover = watchMarketData.getSortTurnover();
        double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dDoubleValue2 = sortTurnover != null ? sortTurnover.doubleValue() : 0.0d;
        java.lang.Double sortVolume = watchMarketData.getSortVolume();
        if (sortVolume != null) {
            dDoubleValue = sortVolume.doubleValue();
        }
        return new CoinQuote(fullName, coinName, str, dAEQbTJ, tradePriceLimit, str2, zAEQbTJ, tradeLeverage, coinName2, coinName3, zBooleanValue, bizType, bizInstId, coinUrl, str3, dDoubleValue2, dDoubleValue, dAEQbTJ2, alias, countDownInfoOLrzqt, zIsPreMarket, zIsRebase, false, false, watchMarketData.getDisplayId(), watchMarketData.getDisplayQuoteSymbol(), 12582912, null);
    }

    public final CountDownInfo OLrzqt(java.lang.String str, java.lang.String str2) {
        CountDownInfo countDownInfoAEQbTJ;
        if ((!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SPOT") && !Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP")) || (countDownInfoAEQbTJ = xUD.AEQbTJ(str, str2)) == null) {
            return null;
        }
        if (!countDownInfoAEQbTJ.countDownTimeExpire() || countDownInfoAEQbTJ.getShowType() == CountDownType.SHOW_EXPECT) {
            return countDownInfoAEQbTJ;
        }
        return null;
    }

    public final CoinQuote KWHzl(@NotNull CoinMarketData coinMarketData) {
        Intrinsics.checkNotNullParameter(coinMarketData, "");
        java.lang.String symbolName = coinMarketData.getSymbolName();
        java.lang.String symbol = coinMarketData.getSymbol();
        java.lang.String strOLrzqt = xTM.AEQbTJ.OLrzqt(coinMarketData);
        java.lang.String url = coinMarketData.getUrl();
        double dAEQbTJ = C33129mqd.AEQbTJ(coinMarketData.getTradePriceLimitNum());
        java.lang.String priceLimit = coinMarketData.getPriceLimit();
        java.lang.Boolean boolIsWatching = coinMarketData.isWatching();
        return new CoinQuote(symbolName, symbol, strOLrzqt, dAEQbTJ, priceLimit, "", false, "", "", "", boolIsWatching != null ? boolIsWatching.booleanValue() : false, coinMarketData.getBizType(), coinMarketData.getBizInstId(), url, null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, coinMarketData.isPreMarket(), false, false, false, null, null, 66043904, null);
    }

    public final CoinQuote copydefault(@NotNull SpotSourceData spotSourceData) {
        Intrinsics.checkNotNullParameter(spotSourceData, "");
        java.lang.String chargeSymbol = spotSourceData.getChargeSymbol();
        java.lang.String tradeSymbol = spotSourceData.getTradeSymbol();
        xTM xtm = xTM.AEQbTJ;
        java.lang.String strKWHzl = xtm.KWHzl(spotSourceData);
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        java.lang.String lever = spotSourceData.getLever();
        java.lang.String coinUrl = spotSourceData.getCoinUrl();
        java.lang.String spotCupTicker$default = xTM.formatSpotCupTicker$default(xtm, spotSourceData, false, 2, null);
        double dAEQbTJ = C33129mqd.AEQbTJ(spotSourceData.getTradePriceLimitNum());
        java.lang.String tradePriceLimit = spotSourceData.getTradePriceLimit();
        java.lang.String strEZpvd = xUW.KWHzl.EZpvd(spotSourceData);
        java.lang.String strAEQbTJ = C54762xUj.EZpvd.AEQbTJ(spotSourceData);
        java.lang.Boolean boolIsWatching = spotSourceData.isWatching();
        boolean zBooleanValue = boolIsWatching != null ? boolIsWatching.booleanValue() : false;
        java.lang.String bizType = spotSourceData.getBizType();
        java.lang.String bizInstId = spotSourceData.getBizInstId();
        java.lang.String quoteCcyUSDPrice = spotSourceData.getQuoteCcyUSDPrice();
        return new CoinQuote(chargeSymbol, tradeSymbol, strKWHzl, dAEQbTJ, tradePriceLimit, spotCupTicker$default, true, lever, strEZpvd, strAEQbTJ, zBooleanValue, bizType, bizInstId, coinUrl, quoteCcyUSDPrice != null ? quoteCcyUSDPrice : "", AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, spotSourceData.isPreMarket(), false, false, false, spotSourceData.getDisplayId(), spotSourceData.getDisplayQuoteSymbol(), 15695872, null);
    }

    public final CoinQuote AEQbTJ(@NotNull SwapSourceData swapSourceData) {
        Intrinsics.checkNotNullParameter(swapSourceData, "");
        java.lang.String quoteSymbol = swapSourceData.getQuoteSymbol();
        java.lang.String str = quoteSymbol == null ? "" : quoteSymbol;
        java.lang.String baseSymbol = swapSourceData.getBaseSymbol();
        java.lang.String str2 = baseSymbol == null ? "" : baseSymbol;
        xTM xtm = xTM.AEQbTJ;
        java.lang.String strEZpvd = xtm.EZpvd(swapSourceData);
        java.lang.String coinUrl = swapSourceData.getCoinUrl();
        java.lang.String futureChargePrice$default = xTM.formatFutureChargePrice$default(xtm, swapSourceData, false, 2, null);
        boolean zCopydefault = copydefault(swapSourceData);
        double dAEQbTJ = C33129mqd.AEQbTJ(swapSourceData.getTradePriceLimitNum());
        java.lang.String tradePriceLimit = swapSourceData.getTradePriceLimit();
        xUW xuw = xUW.KWHzl;
        java.lang.String strEZpvd2 = xuw.EZpvd(swapSourceData);
        java.lang.String strAEQbTJ = xuw.AEQbTJ(swapSourceData);
        java.lang.Boolean boolIsWatching = swapSourceData.isWatching();
        return new CoinQuote(str, str2, strEZpvd, dAEQbTJ, tradePriceLimit, futureChargePrice$default, zCopydefault, "", strEZpvd2, strAEQbTJ, boolIsWatching != null ? boolIsWatching.booleanValue() : false, swapSourceData.getBizType(), swapSourceData.getBizInstId(), coinUrl, null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, swapSourceData.isPreMarket(), swapSourceData.isRebase(), false, false, null, null, 63946752, null);
    }

    public final CoinQuote AEQbTJ(FutureSourceData futureSourceData) {
        java.lang.String quoteSymbol = futureSourceData.getQuoteSymbol();
        java.lang.String str = quoteSymbol == null ? "" : quoteSymbol;
        java.lang.String baseSymbol = futureSourceData.getBaseSymbol();
        java.lang.String str2 = baseSymbol == null ? "" : baseSymbol;
        xTM xtm = xTM.AEQbTJ;
        java.lang.String strEZpvd = xtm.EZpvd(futureSourceData);
        java.lang.String coinUrl = futureSourceData.getCoinUrl();
        java.lang.String futureChargePrice$default = xTM.formatFutureChargePrice$default(xtm, futureSourceData, false, 2, null);
        boolean zCopydefault = copydefault(futureSourceData);
        double dAEQbTJ = C33129mqd.AEQbTJ(futureSourceData.getTradePriceLimitNum());
        java.lang.String tradePriceLimit = futureSourceData.getTradePriceLimit();
        xUW xuw = xUW.KWHzl;
        java.lang.String strEZpvd2 = xuw.EZpvd(futureSourceData);
        java.lang.String strAEQbTJ = xuw.AEQbTJ(futureSourceData);
        java.lang.Boolean boolIsWatching = futureSourceData.isWatching();
        return new CoinQuote(str, str2, strEZpvd, dAEQbTJ, tradePriceLimit, futureChargePrice$default, zCopydefault, "", strEZpvd2, strAEQbTJ, boolIsWatching != null ? boolIsWatching.booleanValue() : false, futureSourceData.getBizType(), futureSourceData.getBizInstId(), coinUrl, null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, futureSourceData.isPreMarket(), futureSourceData.isRebase(), false, false, null, null, 63946752, null);
    }

    public final CoinQuote OLrzqt(@NotNull OptionSourceData optionSourceData) {
        Intrinsics.checkNotNullParameter(optionSourceData, "");
        java.lang.String quoteSymbol = optionSourceData.getQuoteSymbol();
        java.lang.String str = quoteSymbol == null ? "" : quoteSymbol;
        java.lang.String baseSymbol = optionSourceData.getBaseSymbol();
        java.lang.String str2 = baseSymbol == null ? "" : baseSymbol;
        java.lang.String optionChargePrice$default = xTM.formatOptionChargePrice$default(xTM.AEQbTJ, optionSourceData, false, 2, null);
        java.lang.String coinUrl = optionSourceData.getCoinUrl();
        double dAEQbTJ = C33129mqd.AEQbTJ(optionSourceData.getTradePriceLimitNum());
        java.lang.String tradePriceLimit = optionSourceData.getTradePriceLimit();
        xUW xuw = xUW.KWHzl;
        java.lang.String strEZpvd = xuw.EZpvd(optionSourceData);
        java.lang.String strAEQbTJ = xuw.AEQbTJ(optionSourceData);
        java.lang.Boolean boolIsWatching = optionSourceData.isWatching();
        return new CoinQuote(str, str2, optionChargePrice$default, dAEQbTJ, tradePriceLimit, "", false, "", strEZpvd, strAEQbTJ, boolIsWatching != null ? boolIsWatching.booleanValue() : false, optionSourceData.getInstType(), optionSourceData.getBizInstId(), coinUrl, null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, false, false, false, false, null, null, 67092480, null);
    }

    public static /* synthetic */ CoinQuote convertIndexSourceToCoinQuote$default(C38381pWr c38381pWr, IndexSourceData indexSourceData, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c38381pWr.AEQbTJ(indexSourceData, z);
    }

    public final CoinQuote AEQbTJ(@NotNull IndexSourceData indexSourceData, boolean z) {
        Intrinsics.checkNotNullParameter(indexSourceData, "");
        java.lang.String instId = indexSourceData.getInstId();
        xTM xtm = xTM.AEQbTJ;
        return new CoinQuote("", instId, xtm.copydefault(indexSourceData), indexSourceData.getPriceLimitNum(), indexSourceData.getPriceLimit(), (KWHzl() && z) ? xtm.copydefault(indexSourceData) : xtm.KWHzl(OLrzqt(), indexSourceData), xtm.AEQbTJ(OLrzqt(), indexSourceData), "", "", "", false, "INDEX", indexSourceData.getIndex(), xUW.KWHzl.copydefault(indexSourceData), null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, false, false, false, false, null, null, 67092480, null);
    }

    public final CoinQuote OLrzqt(@NotNull pWA pwa) {
        Intrinsics.checkNotNullParameter(pwa, "");
        return new CoinQuote("", "", "", AudioStats.AUDIO_AMPLITUDE_NONE, "", "", false, "", "", "", pwa.djBIcL(), "OPTION", pwa.KWHzl(), "", null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, false, false, false, false, null, null, 67092480, null);
    }

    public final boolean AEQbTJ(@NotNull WatchMarketData watchMarketData) {
        Intrinsics.checkNotNullParameter(watchMarketData, "");
        return (watchMarketData.isCoin() || (KWHzl() && watchMarketData.isPositiveContract() != null && Intrinsics.EZpvd(watchMarketData.isPositiveContract(), java.lang.Boolean.FALSE)) || Intrinsics.EZpvd((java.lang.Object) watchMarketData.getInstType(), (java.lang.Object) "OPTION")) ? false : true;
    }

    public final boolean copydefault(MarketDataSource marketDataSource) {
        return !KWHzl() || Intrinsics.EZpvd(marketDataSource.isPositiveContract(), java.lang.Boolean.TRUE);
    }

    public final boolean KWHzl() {
        java.lang.String strOLrzqt = OLrzqt();
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strOLrzqt.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "USD");
    }

    public final java.lang.String OLrzqt() {
        return ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).zLjUOn().getIsoCode();
    }
}
