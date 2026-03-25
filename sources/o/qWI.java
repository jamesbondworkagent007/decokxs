package o;

import androidx.camera.video.AudioStats;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.FavouriteDexCoin;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qWI {
    public static final qWC KWHzl(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        CoinQuote coinQuoteOLrzqt = C27619jyc.OLrzqt();
        return new qWC(coinQuoteOLrzqt.copy((67102719 & 1) != 0 ? coinQuoteOLrzqt.quoteCurrency : null, (67102719 & 2) != 0 ? coinQuoteOLrzqt.baseCurrency : null, (67102719 & 4) != 0 ? coinQuoteOLrzqt.price : null, (67102719 & 8) != 0 ? coinQuoteOLrzqt.changePercent : AudioStats.AUDIO_AMPLITUDE_NONE, (67102719 & 16) != 0 ? coinQuoteOLrzqt.changePercentDisplay : null, (67102719 & 32) != 0 ? coinQuoteOLrzqt.subPrice : null, (67102719 & 64) != 0 ? coinQuoteOLrzqt.showSubPrice : false, (67102719 & 128) != 0 ? coinQuoteOLrzqt.leverageRatio : null, (67102719 & 256) != 0 ? coinQuoteOLrzqt.turnover : null, (67102719 & 512) != 0 ? coinQuoteOLrzqt.voulum : null, (67102719 & 1024) != 0 ? coinQuoteOLrzqt.isWatch : false, (67102719 & 2048) != 0 ? coinQuoteOLrzqt.instType : bizInstrument.getInstType(), (67102719 & 4096) != 0 ? coinQuoteOLrzqt.instId : bizInstrument.getInstId(), (67102719 & 8192) != 0 ? coinQuoteOLrzqt.icon : null, (67102719 & 16384) != 0 ? coinQuoteOLrzqt.quoteCcyUSDPrice : null, (67102719 & 32768) != 0 ? coinQuoteOLrzqt.turnoverNumber : AudioStats.AUDIO_AMPLITUDE_NONE, (67102719 & 65536) != 0 ? coinQuoteOLrzqt.volumeNumber : AudioStats.AUDIO_AMPLITUDE_NONE, (67102719 & 131072) != 0 ? coinQuoteOLrzqt.priceNumber : AudioStats.AUDIO_AMPLITUDE_NONE, (67102719 & 262144) != 0 ? coinQuoteOLrzqt.alias : null, (524288 & 67102719) != 0 ? coinQuoteOLrzqt.countDownInfo : null, (67102719 & 1048576) != 0 ? coinQuoteOLrzqt.isPreMarket : false, (67102719 & 2097152) != 0 ? coinQuoteOLrzqt.isRebase : false, (67102719 & 4194304) != 0 ? coinQuoteOLrzqt.isHot : false, (67102719 & 8388608) != 0 ? coinQuoteOLrzqt.isNewLabel : false, (67102719 & 16777216) != 0 ? coinQuoteOLrzqt.displayId : null, (67102719 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? coinQuoteOLrzqt.displayQuoteSymbol : null), bizInstrument, null, null, null, bizInstrument.getInstId(), bizInstrument.getInstType(), null, null, false, false, 1792, null);
    }

    public static final qWG copydefault(@NotNull FavouriteDexCoin favouriteDexCoin) {
        Intrinsics.checkNotNullParameter(favouriteDexCoin, "");
        java.lang.String chainId = favouriteDexCoin.getChainId();
        java.lang.String tokenContractAddress = favouriteDexCoin.getTokenContractAddress();
        java.lang.String tokenSymbol = favouriteDexCoin.getTokenSymbol();
        java.lang.String tokenName = favouriteDexCoin.getTokenName();
        java.lang.String tokenLogo = favouriteDexCoin.getTokenLogo();
        BigDecimal bigDecimal = null;
        return new qWG(new qWK(new DexInstrument(chainId, (java.lang.String) null, favouriteDexCoin.getChainLogo(), tokenLogo, tokenName, tokenSymbol, tokenContractAddress, (java.lang.String) null, favouriteDexCoin.getVerified(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, 16002, (DefaultConstructorMarker) null), null, null, null, null, null, bigDecimal, false, null, false, null, null, null, null, 16320, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, bigDecimal, favouriteDexCoin.getTokenSymbol(), "CEDEFI", null, 2, 0 == true ? 1 : 0);
    }

    public static final InterfaceC41655qus copydefault(@NotNull MarketUserFavorite marketUserFavorite) {
        Intrinsics.checkNotNullParameter(marketUserFavorite, "");
        java.lang.String chainId = marketUserFavorite.getChainId();
        java.lang.String str = chainId == null ? "" : chainId;
        java.lang.String tokenContractAddress = marketUserFavorite.getTokenContractAddress();
        java.lang.String str2 = tokenContractAddress == null ? "" : tokenContractAddress;
        java.lang.String tokenSymbol = marketUserFavorite.getTokenSymbol();
        java.lang.String str3 = tokenSymbol == null ? "" : tokenSymbol;
        java.lang.String tokenName = marketUserFavorite.getTokenName();
        return new qWK(new DexInstrument(str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, tokenName == null ? "" : tokenName, str3, str2, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, 16270, (DefaultConstructorMarker) null), null, null, null, null, null, null, false, null, false, null, null, null, null, 16382, null);
    }

    public static final FavouriteDexCoin AEQbTJ(@NotNull DexInstrument dexInstrument) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        return new FavouriteDexCoin(dexInstrument.getChainLogoUrl(), dexInstrument.getChainId(), dexInstrument.getTokenContractAddress(), "", dexInstrument.getTokenSymbol(), dexInstrument.getTokenLogoUrl(), dexInstrument.getTokenName(), dexInstrument.getVerified(), (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, 1792, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ MarketUserFavorite toMarketUserFavorite$default(qWC qwc, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = C55686xod.KWHzl();
        }
        return KWHzl(qwc, str);
    }

    public static final MarketUserFavorite KWHzl(@NotNull qWC qwc, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(qwc, "");
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentCopydefault = qwc.copydefault();
        xUV xuv = xUV.EZpvd;
        java.lang.String strKWHzl = xuv.KWHzl(bizInstrumentCopydefault);
        java.lang.String strAhwBna = qwc.AhwBna();
        java.lang.String strCopydefault = xuv.copydefault(qwc.copydefault());
        java.lang.String str2 = strCopydefault == null ? "" : strCopydefault;
        java.lang.String strAEQbTJ = xuv.AEQbTJ(qwc.copydefault());
        if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
            strAEQbTJ = "0 ";
        }
        return new MarketUserFavorite(0L, strKWHzl, str, strAhwBna, str2, strAEQbTJ, "", "", null, null, 769, null);
    }

    public static /* synthetic */ MarketUserFavorite toMarketUserFavorite$default(qWG qwg, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = C55686xod.KWHzl();
        }
        return KWHzl(qwg, str);
    }

    public static final MarketUserFavorite KWHzl(@NotNull qWG qwg, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(qwg, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new MarketUserFavorite(0L, "", str, qwg.AhwBna(), "", "0", qwg.KWHzl().getChainId(), qwg.KWHzl().getTokenContractAddress(), qwg.KWHzl().getTokenSymbol(), qwg.KWHzl().getTokenName(), 1, null);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "DEX") ? "CEDEFI" : str;
    }
}
