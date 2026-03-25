package o;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexui.main.market.detail.adapter.CoinDetailTabInfo;
import com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.dapp.bean.FeedsParamBean;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC25429iwZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hQx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21911hQx {
    public static final C21911hQx KWHzl = new C21911hQx();
    public static final java.util.Map<java.lang.String, CoinDetailTabType> EZpvd = C56424yEw.gEmmrt(C56390yDp.OLrzqt("charts", CoinDetailTabType.CHART), C56390yDp.OLrzqt("info", CoinDetailTabType.INFO), C56390yDp.OLrzqt("audit", CoinDetailTabType.ASSESSMENT), C56390yDp.OLrzqt("feeds", CoinDetailTabType.FEEDS), C56390yDp.OLrzqt("earn", CoinDetailTabType.EARN));
    public static final int OLrzqt = 8;

    private C21911hQx() {
    }

    public final int OLrzqt(TokenBase tokenBase, @NotNull java.util.List<CoinDetailTabInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) (tokenBase != null ? tokenBase.getMarketTabName() : null))) {
            return 0;
        }
        CoinDetailTabType coinDetailTabType = EZpvd.get(tokenBase != null ? tokenBase.getMarketTabName() : null);
        if (coinDetailTabType == null) {
            return 0;
        }
        for (CoinDetailTabInfo coinDetailTabInfo : list) {
            if (coinDetailTabInfo.getTabType() == coinDetailTabType) {
                return coinDetailTabInfo.getTabIndex();
            }
        }
        return 0;
    }

    public final CoinDetailTabInfo OLrzqt(@NotNull MarketDetailFragment marketDetailFragment, int i, final TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(marketDetailFragment, "");
        final InterfaceC25429iwZ interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class));
        if (interfaceC25429iwZ == null || tokenBase == null) {
            return null;
        }
        java.lang.String string = marketDetailFragment.getString(C23274hvD.Fragment.QbewEr);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return new CoinDetailTabInfo(string, i, CoinDetailTabType.EARN, new Function0() { // from class: o.hQF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21911hQx.OLrzqt(interfaceC25429iwZ, tokenBase);
            }
        });
    }

    public static final androidx.fragment.app.Fragment OLrzqt(InterfaceC25429iwZ interfaceC25429iwZ, TokenBase tokenBase) {
        return InterfaceC25429iwZ.TaskDescription.fetchProductListFragmentWithChainId$default(interfaceC25429iwZ, C33129mqd.valueOf(tokenBase.getChainId()), tokenBase.getTokenContractAddress(), false, 4, null);
    }

    public final java.util.List<CoinDetailTabInfo> KWHzl(@NotNull final MarketDetailFragment marketDetailFragment, @NotNull final java.lang.String str, final TokenBase tokenBase, @NotNull final LatestMarketInfoBean latestMarketInfoBean, @NotNull final MarketCoinDetailViewModel marketCoinDetailViewModel, @NotNull final java.lang.String str2) {
        final xWA xwa;
        LatestMarketInfoBean second;
        Intrinsics.checkNotNullParameter(marketDetailFragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(latestMarketInfoBean, "");
        Intrinsics.checkNotNullParameter(marketCoinDetailViewModel, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.lang.String string = marketDetailFragment.getString(C23274hvD.Fragment.removeOnMultiWindowModeChangedListener);
        Intrinsics.checkNotNullExpressionValue(string, "");
        listOLrzqt.add(new CoinDetailTabInfo(string, listOLrzqt.size(), CoinDetailTabType.CHART, new Function0() { // from class: o.hQE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21911hQx.EZpvd(tokenBase, latestMarketInfoBean, marketCoinDetailViewModel, str2, marketDetailFragment);
            }
        }));
        java.lang.String string2 = marketDetailFragment.getString(C23274hvD.Fragment.removeOnTrimMemoryListener);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        listOLrzqt.add(new CoinDetailTabInfo(string2, listOLrzqt.size(), CoinDetailTabType.INFO, new Function0() { // from class: o.hQC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21911hQx.EZpvd(tokenBase, latestMarketInfoBean, str, marketDetailFragment);
            }
        }));
        if (tokenBase == null || !tokenBase.isBtc()) {
            java.lang.String string3 = marketDetailFragment.getString(C23274hvD.Fragment.removeOnContextAvailableListener);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            listOLrzqt.add(new CoinDetailTabInfo(string3, listOLrzqt.size(), CoinDetailTabType.DATA, new Function0() { // from class: o.hQG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21911hQx.AEQbTJ(tokenBase, str2);
                }
            }));
        }
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value = marketCoinDetailViewModel.valueOf().getValue();
        if (value == null || (second = value.getSecond()) == null || !second.getNotSupportTxNativeToken()) {
            java.lang.String string4 = marketDetailFragment.getString(C23274hvD.Fragment.removeOnPictureInPictureModeChangedListener);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            listOLrzqt.add(new CoinDetailTabInfo(string4, listOLrzqt.size(), CoinDetailTabType.ASSESSMENT, new Function0() { // from class: o.hQD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21911hQx.KWHzl(tokenBase, str);
                }
            }));
        }
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(xWA.class));
        if (listKWHzl != null && (xwa = (xWA) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) != null && xwa.EZpvd()) {
            java.lang.String string5 = marketDetailFragment.getString(C23274hvD.Fragment.ContextAware);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            listOLrzqt.add(new CoinDetailTabInfo(string5, listOLrzqt.size(), CoinDetailTabType.FEEDS, new Function0() { // from class: o.hQI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21911hQx.copydefault(tokenBase, xwa);
                }
            }));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public static final androidx.fragment.app.Fragment EZpvd(TokenBase tokenBase, LatestMarketInfoBean latestMarketInfoBean, MarketCoinDetailViewModel marketCoinDetailViewModel, java.lang.String str, MarketDetailFragment marketDetailFragment) {
        ChartDetailFragment chartDetailFragmentEZpvd = ChartDetailFragment.Companion.EZpvd(tokenBase, latestMarketInfoBean, marketCoinDetailViewModel.fetchVPNInfo(), str);
        chartDetailFragmentEZpvd.copydefault(marketDetailFragment);
        return chartDetailFragmentEZpvd;
    }

    public static final androidx.fragment.app.Fragment EZpvd(TokenBase tokenBase, LatestMarketInfoBean latestMarketInfoBean, java.lang.String str, MarketDetailFragment marketDetailFragment) {
        C28988klE c28988klEAEQbTJ = C28988klE.Companion.AEQbTJ(tokenBase, latestMarketInfoBean, str);
        c28988klEAEQbTJ.AEQbTJ(marketDetailFragment);
        return c28988klEAEQbTJ;
    }

    public static final androidx.fragment.app.Fragment AEQbTJ(TokenBase tokenBase, java.lang.String str) {
        return jQQ.Companion.EZpvd(tokenBase, str);
    }

    public static final androidx.fragment.app.Fragment KWHzl(TokenBase tokenBase, java.lang.String str) {
        return jND.Companion.AEQbTJ(tokenBase, str);
    }

    public static final androidx.fragment.app.Fragment copydefault(TokenBase tokenBase, xWA xwa) {
        return xwa.copydefault(new FeedsParamBean(tokenBase != null ? tokenBase.getChainId() : null, tokenBase != null ? tokenBase.getTokenContractAddress() : null));
    }
}
