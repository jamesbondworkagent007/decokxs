package o;

import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.dexkline.dexui.main.market.detail.adapter.CoinDetailTabInfo;
import com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment;
import com.okinc.dexkline.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.dexkline.market.features.risk_control.ui.RiskControlViewModel;
import com.okinc.planet_api.model.DefiFeedParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mSy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32193mSy {
    public static final C32193mSy AEQbTJ = new C32193mSy();
    public static final java.util.Map<java.lang.String, CoinDetailTabType> EZpvd = C56424yEw.gEmmrt(C56390yDp.OLrzqt("info", CoinDetailTabType.INFO), C56390yDp.OLrzqt("charts", CoinDetailTabType.CHART), C56390yDp.OLrzqt("audit", CoinDetailTabType.ASSESSMENT), C56390yDp.OLrzqt("feeds", CoinDetailTabType.FEEDS), C56390yDp.OLrzqt("earn", CoinDetailTabType.EARN));
    public static final int KWHzl = 8;

    private C32193mSy() {
    }

    public final int AEQbTJ(TokenBase tokenBase, @NotNull java.util.ArrayList<CoinDetailTabInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) (tokenBase != null ? tokenBase.getMarketTabName() : null))) {
            return 0;
        }
        CoinDetailTabType coinDetailTabType = EZpvd.get(tokenBase != null ? tokenBase.getMarketTabName() : null);
        if (coinDetailTabType == null) {
            return 0;
        }
        for (CoinDetailTabInfo coinDetailTabInfo : arrayList) {
            if (coinDetailTabInfo.getTabType() == coinDetailTabType) {
                return coinDetailTabInfo.getTabIndex();
            }
        }
        return 0;
    }

    public final java.util.ArrayList<CoinDetailTabInfo> copydefault(@NotNull final DexMarketDetailFragment dexMarketDetailFragment, @NotNull final java.lang.String str, final TokenBase tokenBase, @NotNull final LatestMarketInfoBean latestMarketInfoBean, @NotNull final MarketCoinDetailViewModel marketCoinDetailViewModel, @NotNull RiskControlViewModel riskControlViewModel, @NotNull final java.lang.String str2) {
        LatestMarketInfoBean second;
        Intrinsics.checkNotNullParameter(dexMarketDetailFragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(latestMarketInfoBean, "");
        Intrinsics.checkNotNullParameter(marketCoinDetailViewModel, "");
        Intrinsics.checkNotNullParameter(riskControlViewModel, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.ArrayList<CoinDetailTabInfo> arrayList = new java.util.ArrayList<>(5);
        java.lang.String string = dexMarketDetailFragment.getString(C35964oKf.Fragment.DlmWDR);
        Intrinsics.checkNotNullExpressionValue(string, "");
        arrayList.add(new CoinDetailTabInfo(string, 0, CoinDetailTabType.CHART, "cedefi_tab_charts", new Function0() { // from class: o.mSB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32193mSy.AEQbTJ(tokenBase, latestMarketInfoBean, marketCoinDetailViewModel, str2, dexMarketDetailFragment);
            }
        }));
        java.lang.String string2 = dexMarketDetailFragment.getString(C35964oKf.Fragment.iUnTnt);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        arrayList.add(new CoinDetailTabInfo(string2, 1, CoinDetailTabType.INFO, "cedefi_tab_info", new Function0() { // from class: o.mSA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32193mSy.KWHzl(tokenBase, latestMarketInfoBean, str);
            }
        }));
        if (((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).copydefault().AEQbTJ() && pDX.AEQbTJ.OLrzqt() && riskControlViewModel.KWHzl().getValue().booleanValue() && tokenBase != null) {
            java.lang.String string3 = dexMarketDetailFragment.getString(C35964oKf.Fragment.getLabel);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            arrayList.add(new CoinDetailTabInfo(string3, arrayList.size(), CoinDetailTabType.FEEDS, "cedefi_tab_feeds", new Function0() { // from class: o.mSH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C32193mSy.AEQbTJ(marketCoinDetailViewModel, tokenBase);
                }
            }));
        }
        java.lang.String string4 = dexMarketDetailFragment.getString(C35964oKf.Fragment.glVQsU);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        arrayList.add(new CoinDetailTabInfo(string4, 2, CoinDetailTabType.DATA, "cedefi_tab_data", new Function0() { // from class: o.mSF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32193mSy.EZpvd(tokenBase);
            }
        }));
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value = marketCoinDetailViewModel.AhwBna().getValue();
        if (value == null || (second = value.getSecond()) == null || !second.getNotSupportTxNativeToken()) {
            java.lang.String string5 = dexMarketDetailFragment.getString(C35964oKf.Fragment.DwQSDd);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            arrayList.add(new CoinDetailTabInfo(string5, 3, CoinDetailTabType.ASSESSMENT, "cedefi_tab_risk", new Function0() { // from class: o.mSE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C32193mSy.OLrzqt(tokenBase, str);
                }
            }));
        }
        return arrayList;
    }

    public static final androidx.fragment.app.Fragment AEQbTJ(TokenBase tokenBase, LatestMarketInfoBean latestMarketInfoBean, MarketCoinDetailViewModel marketCoinDetailViewModel, java.lang.String str, DexMarketDetailFragment dexMarketDetailFragment) {
        ChartDetailFragment chartDetailFragmentKWHzl = ChartDetailFragment.Companion.KWHzl(tokenBase, latestMarketInfoBean, marketCoinDetailViewModel.djBIcL(), str);
        chartDetailFragmentKWHzl.EZpvd(dexMarketDetailFragment);
        return chartDetailFragmentKWHzl;
    }

    public static final androidx.fragment.app.Fragment KWHzl(TokenBase tokenBase, LatestMarketInfoBean latestMarketInfoBean, java.lang.String str) {
        return C34338naG.Companion.copydefault(tokenBase, latestMarketInfoBean, str);
    }

    public static final androidx.fragment.app.Fragment AEQbTJ(MarketCoinDetailViewModel marketCoinDetailViewModel, TokenBase tokenBase) {
        DefiFeedParams defiFeedParams;
        if (marketCoinDetailViewModel.isConnected().getValue().booleanValue()) {
            defiFeedParams = new DefiFeedParams(tokenBase.getTokenSymbol(), tokenBase.getChainId(), tokenBase.getTokenContractAddress(), "news", true);
        } else {
            defiFeedParams = new DefiFeedParams(tokenBase.getTokenSymbol(), tokenBase.getChainId(), tokenBase.getTokenContractAddress(), (java.lang.String) null, false, 24, (DefaultConstructorMarker) null);
        }
        return ((tWL) C43251rlk.copydefault(tWL.class)).copydefault(defiFeedParams);
    }

    public static final androidx.fragment.app.Fragment EZpvd(TokenBase tokenBase) {
        return mXW.Companion.EZpvd(tokenBase);
    }

    public static final androidx.fragment.app.Fragment OLrzqt(TokenBase tokenBase, java.lang.String str) {
        return C32283mWg.Companion.OLrzqt(tokenBase, str);
    }
}
