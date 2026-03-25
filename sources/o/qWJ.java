package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qWJ {
    public static /* synthetic */ MarketUserFavorite convertToUserFavorite$default(WatchListData watchListData, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = C55686xod.KWHzl();
        }
        return EZpvd(watchListData, str);
    }

    public static final MarketUserFavorite EZpvd(@NotNull WatchListData watchListData, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String instId = watchListData.getInstId();
        java.lang.String instType = watchListData.getInstType();
        java.lang.String alias = watchListData.getAlias();
        java.lang.String expTime = watchListData.getExpTime();
        if (expTime.length() == 0) {
            expTime = "0";
        }
        return new MarketUserFavorite(0L, instId, str, instType, alias, expTime, watchListData.getChainId(), watchListData.getTokenContractAddress(), watchListData.getTokenSymbol(), watchListData.getTokenName(), 1, null);
    }

    public static final java.lang.String OLrzqt(@NotNull WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "FUTURES")) {
            BizInstrument watchMarketInstrument$default = xUD.getWatchMarketInstrument$default(watchListData.getInstType(), watchListData.getInstType(), watchListData.getInstId(), watchListData.getAlias(), false, 16, null);
            return (watchMarketInstrument$default == null || !watchMarketInstrument$default.isPreMarketPair()) ? "SWAP" : "pre_market";
        }
        return watchListData.getInstType();
    }

    public static final java.lang.String AEQbTJ(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES")) {
            return bizInstrument.isPreMarketPair() ? "pre_market" : "SWAP";
        }
        return bizInstrument.getInstType();
    }

    public static final java.lang.String OLrzqt(@NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        if (Intrinsics.EZpvd((java.lang.Object) coinQuote.getInstType(), (java.lang.Object) "FUTURES")) {
            return coinQuote.isPreMarket() ? "pre_market" : "SWAP";
        }
        return coinQuote.getInstType();
    }

    public static final WatchListData EZpvd(@NotNull MarketUserFavorite marketUserFavorite) {
        Intrinsics.checkNotNullParameter(marketUserFavorite, "");
        java.lang.String instId = marketUserFavorite.getInstId();
        java.lang.String instType = marketUserFavorite.getInstType();
        java.lang.String alias = marketUserFavorite.getAlias();
        java.lang.String expTime = marketUserFavorite.getExpTime();
        java.lang.String chainId = marketUserFavorite.getChainId();
        java.lang.String str = chainId == null ? "" : chainId;
        java.lang.String tokenContractAddress = marketUserFavorite.getTokenContractAddress();
        java.lang.String str2 = tokenContractAddress == null ? "" : tokenContractAddress;
        java.lang.String tokenSymbol = marketUserFavorite.getTokenSymbol();
        java.lang.String str3 = tokenSymbol == null ? "" : tokenSymbol;
        java.lang.String tokenName = marketUserFavorite.getTokenName();
        return new WatchListData(alias, expTime, instId, instType, str, str2, str3, tokenName == null ? "" : tokenName);
    }

    public static final WatchListData OLrzqt(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        xUV xuv = xUV.EZpvd;
        java.lang.String strOLrzqt = xuv.OLrzqt(bizInstrument);
        java.lang.String strKWHzl = xuv.KWHzl(bizInstrument);
        java.lang.String strCopydefault = xuv.copydefault(bizInstrument);
        java.lang.String str = strCopydefault == null ? "" : strCopydefault;
        java.lang.String strAEQbTJ = xuv.AEQbTJ(bizInstrument);
        return new WatchListData(str, strAEQbTJ == null ? "" : strAEQbTJ, strKWHzl, strOLrzqt, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null);
    }

    public static final WatchListData OLrzqt(@NotNull DexInstrument dexInstrument) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        return new WatchListData((java.lang.String) null, (java.lang.String) null, "", "CEDEFI", dexInstrument.getChainId(), dexInstrument.getTokenContractAddress(), dexInstrument.getTokenSymbol(), dexInstrument.getTokenName(), 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ MarketUserFavorite toMarketUserFavorite$default(BizInstrument bizInstrument, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = C55686xod.KWHzl();
        }
        return EZpvd(bizInstrument, str);
    }

    public static final MarketUserFavorite EZpvd(@NotNull BizInstrument bizInstrument, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        xUV xuv = xUV.EZpvd;
        java.lang.String strKWHzl = xuv.KWHzl(bizInstrument);
        java.lang.String strOLrzqt = xuv.OLrzqt(bizInstrument);
        java.lang.String strCopydefault = xuv.copydefault(bizInstrument);
        java.lang.String str2 = strCopydefault == null ? "" : strCopydefault;
        java.lang.String strAEQbTJ = xuv.AEQbTJ(bizInstrument);
        if (strAEQbTJ == null) {
            strAEQbTJ = "0";
        } else if (strAEQbTJ.length() == 0) {
            strAEQbTJ = "0 ";
        }
        return new MarketUserFavorite(0L, strKWHzl, str, strOLrzqt, str2, strAEQbTJ, null, null, null, null, 961, null);
    }

    public static /* synthetic */ MarketUserFavorite dexToMarketUserFavorite$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = C55686xod.KWHzl();
        }
        return OLrzqt(str, str2, str3, str4);
    }

    public static final MarketUserFavorite OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new MarketUserFavorite(0L, "", str4, str, null, null, str2, str3, null, null, 817, null);
    }

    public static final BizInstrument EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xUD.getWatchMarketInstrument$default(str2, str, null, null, false, 28, null);
    }

    public static final BizInstrument KWHzl(@NotNull WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        return xUD.getWatchMarketInstrument$default(watchListData.getInstType(), watchListData.getInstId(), watchListData.getInstId(), watchListData.getAlias(), false, 16, null);
    }

    public static final WatchListData AEQbTJ(@NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        BizInstrument watchMarketInstrument$default = xUD.getWatchMarketInstrument$default(coinQuote.getInstType(), coinQuote.getInstId(), null, null, false, 28, null);
        if (watchMarketInstrument$default == null) {
            return null;
        }
        xUV xuv = xUV.EZpvd;
        java.lang.String strOLrzqt = xuv.OLrzqt(watchMarketInstrument$default);
        java.lang.String strKWHzl = xuv.KWHzl(watchMarketInstrument$default);
        java.lang.String strCopydefault = xuv.copydefault(watchMarketInstrument$default);
        java.lang.String str = strCopydefault == null ? "" : strCopydefault;
        java.lang.String strAEQbTJ = xuv.AEQbTJ(watchMarketInstrument$default);
        return new WatchListData(str, strAEQbTJ == null ? "" : strAEQbTJ, strKWHzl, strOLrzqt, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null);
    }
}
