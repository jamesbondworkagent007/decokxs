package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.assets.api.model.DepositEntryPoint;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.core.util.SPUtils;
import com.okinc.dexkline.dex.api.enums.KlineDexPageFromType;
import com.okinc.im.bean.SearchResultData;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.market.common.biz_spot.bean.DefiWebCoins;
import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import com.okinc.market.search.features.main.recommend.history.ui.viewmodel.SearchHistoryViewModel;
import com.okinc.market.search.features.main.result.ui.SubPage;
import com.okinc.market.search.features.main.root.data.po.P2pAndDeposit;
import com.okinc.market.search.features.main.root.data.po.P2pAndDepositHistory;
import com.okinc.market.search.features.main.root.data.po.SearchTrader;
import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.web.WebActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC43294rma;
import o.InterfaceC49497upf;
import o.InterfaceC8104awT;
import o.InterfaceC8224ayh;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qHc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40040qHc implements qHM {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public Function0<SearchHistoryViewModel> AEQbTJ;
    public android.content.Context EZpvd;
    public androidx.fragment.app.Fragment copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl() {
        this.copydefault = null;
        this.EZpvd = null;
        this.AEQbTJ = null;
    }

    /* JADX INFO: renamed from: o.qHc$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qHc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public void OLrzqt(@NotNull final androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.copydefault = fragment;
        this.EZpvd = fragment.getContext();
        this.AEQbTJ = new Function0() { // from class: o.qHm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40040qHc.EZpvd(fragment);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    @Override // o.qHM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull BizInstrument bizInstrument, int i, SubPage subPage, java.lang.String str, boolean z, boolean z2) {
        qHN qhnCopydefault;
        java.lang.String str2;
        oKA oka;
        FragmentActivity activity;
        android.content.Intent intent;
        java.lang.String stringExtra;
        Function0<SearchHistoryViewModel> function0;
        SearchHistoryViewModel searchHistoryViewModelInvoke;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchNavigator", "navigateInstrumentDetailPage [instrument: " + bizInstrument + ", position: " + i + ", subPageType: " + subPage + ", keyword: " + str + ", addToHistory: " + z + "]");
        if (z && (function0 = this.AEQbTJ) != null && (searchHistoryViewModelInvoke = function0.invoke()) != null) {
            searchHistoryViewModelInvoke.copydefault(bizInstrument);
        }
        MarketCoinInfo marketCoinInfo = new MarketCoinInfo(bizInstrument.getInstId(), bizInstrument.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
        android.content.Context context = this.EZpvd;
        if (context != null) {
            androidx.fragment.app.Fragment fragment = this.copydefault;
            if (fragment != null && (activity = fragment.getActivity()) != null && (intent = activity.getIntent()) != null && (stringExtra = intent.getStringExtra("from")) != null) {
                if (Intrinsics.EZpvd((java.lang.Object) stringExtra, (java.lang.Object) "home_page")) {
                    str2 = "Home_search";
                } else if (Intrinsics.EZpvd((java.lang.Object) stringExtra, (java.lang.Object) "find_page")) {
                    str2 = "Discover_search";
                }
                java.lang.String str3 = str2;
                oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                }
            } else {
                str2 = null;
                java.lang.String str32 = str2;
                oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, "page_search", null, null, null, str32, null, null, 1772, null);
                }
            }
        }
        androidx.fragment.app.Fragment fragment2 = this.copydefault;
        if (fragment2 == null || (qhnCopydefault = qHO.copydefault(fragment2)) == null) {
            return;
        }
        qhnCopydefault.KWHzl(bizInstrument, i, subPage, str, z2);
    }

    @Override // o.qHM
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchNavigator", "navigateTradeOptions [instFamily: " + str + "]");
        android.content.Context context = this.EZpvd;
        if (context != null) {
            InterfaceC49497upf.ActionBar.openAllOptionsWithInstFamily$default((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI), context, str, null, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:15:0x006b, B:17:0x0077, B:22:0x0083, B:26:0x008d, B:28:0x00ad, B:29:0x00b1), top: B:47:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    @Override // o.qHM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull Product product, int i) {
        qHN qhnCopydefault;
        java.lang.Object objM7377constructorimpl;
        java.util.List<java.lang.String> queryParameters;
        SearchHistoryViewModel searchHistoryViewModelInvoke;
        Intrinsics.checkNotNullParameter(product, "");
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchNavigator", "navigateEarnDetailPage [product: " + product + ", position: " + i + "]");
        Function0<SearchHistoryViewModel> function0 = this.AEQbTJ;
        if (function0 != null && (searchHistoryViewModelInvoke = function0.invoke()) != null) {
            searchHistoryViewModelInvoke.copydefault(product);
        }
        android.content.Context context = this.EZpvd;
        if (context != null) {
            if (!((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB().values()) {
                InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), context, null, 2, null);
                return;
            }
            java.lang.String subscriptionUrl = product.getSubscriptionUrl();
            if (subscriptionUrl != null) {
                try {
                    Result.Application application = Result.Companion;
                    queryParameters = android.net.Uri.parse(subscriptionUrl).getQueryParameters("pageurl");
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (queryParameters != null) {
                    if (!(!queryParameters.isEmpty())) {
                        queryParameters = null;
                    }
                    if (queryParameters == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(queryParameters)) == null) {
                    }
                    qIR qir = qIR.EZpvd;
                    android.net.Uri uri = android.net.Uri.parse(subscriptionUrl);
                    Intrinsics.checkNotNullExpressionValue(uri, "");
                    android.net.Uri uriAEQbTJ = qir.AEQbTJ(uri, "pageurl", str + "&from=trade&page=search");
                    objM7377constructorimpl = Result.m7377constructorimpl(uriAEQbTJ != null ? uriAEQbTJ.toString() : null);
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    }
                    java.lang.String str = (java.lang.String) objM7377constructorimpl;
                    InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, str != null ? subscriptionUrl : str, null, new Function1() { // from class: o.qHj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C40040qHc.djBIcL((AbstractC43238rlX) obj);
                        }
                    }, 4, null);
                } else {
                    java.lang.String str2 = "";
                    qIR qir2 = qIR.EZpvd;
                    android.net.Uri uri2 = android.net.Uri.parse(subscriptionUrl);
                    Intrinsics.checkNotNullExpressionValue(uri2, "");
                    android.net.Uri uriAEQbTJ2 = qir2.AEQbTJ(uri2, "pageurl", str2 + "&from=trade&page=search");
                    objM7377constructorimpl = Result.m7377constructorimpl(uriAEQbTJ2 != null ? uriAEQbTJ2.toString() : null);
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = subscriptionUrl;
                    }
                    java.lang.String str3 = (java.lang.String) objM7377constructorimpl;
                    InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, str3 != null ? subscriptionUrl : str3, null, new Function1() { // from class: o.qHj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C40040qHc.djBIcL((AbstractC43238rlX) obj);
                        }
                    }, 4, null);
                }
            }
        }
        androidx.fragment.app.Fragment fragment = this.copydefault;
        if (fragment == null || (qhnCopydefault = qHO.copydefault(fragment)) == null) {
            return;
        }
        qhnCopydefault.copydefault(product, i);
    }

    public static final Unit djBIcL(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault() {
        FragmentActivity activity;
        android.content.Intent intent;
        androidx.fragment.app.Fragment fragment = this.copydefault;
        java.lang.String stringExtra = (fragment == null || (activity = fragment.getActivity()) == null || (intent = activity.getIntent()) == null) ? null : intent.getStringExtra("from");
        if (stringExtra != null) {
            int iHashCode = stringExtra.hashCode();
            if (iHashCode != -272384484) {
                if (iHashCode != 429969749) {
                    if (iHashCode == 2118081007 && stringExtra.equals("home_page")) {
                        return "homepage_search";
                    }
                } else if (stringExtra.equals("find_page")) {
                    return "discover_search";
                }
            } else if (stringExtra.equals("marketplace_search")) {
                return "marketplace_search";
            }
        }
        return "";
    }

    @Override // o.qHM
    public void KWHzl(@NotNull TradingStrategy tradingStrategy, int i) {
        qHN qhnCopydefault;
        SearchHistoryViewModel searchHistoryViewModelInvoke;
        Intrinsics.checkNotNullParameter(tradingStrategy, "");
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchNavigator", "navigateBotDetailPage [strategy: " + tradingStrategy + ", position: " + i + "]");
        Function0<SearchHistoryViewModel> function0 = this.AEQbTJ;
        if (function0 != null && (searchHistoryViewModelInvoke = function0.invoke()) != null) {
            searchHistoryViewModelInvoke.copydefault(tradingStrategy);
        }
        android.content.Context context = this.EZpvd;
        if (context != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).AEQbTJ() + "?bizType=" + tradingStrategy.getBizType() + "&strategyType=" + tradingStrategy.getStrategyType() + "&instId=" + tradingStrategy.getInstName() + "&channel=" + copydefault(), null, new Function1() { // from class: o.qHa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40040qHc.gEmmrt((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
        androidx.fragment.app.Fragment fragment = this.copydefault;
        if (fragment == null || (qhnCopydefault = qHO.copydefault(fragment)) == null) {
            return;
        }
        qhnCopydefault.AEQbTJ(tradingStrategy, i);
    }

    public static final Unit gEmmrt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    @Override // o.qHM
    public void copydefault(@NotNull SearchTrader searchTrader, int i) {
        qHN qhnCopydefault;
        SearchHistoryViewModel searchHistoryViewModelInvoke;
        Intrinsics.checkNotNullParameter(searchTrader, "");
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchNavigator", "navigateTraderDetailPage [trader: " + searchTrader + ", position: " + i + "]");
        Function0<SearchHistoryViewModel> function0 = this.AEQbTJ;
        if (function0 != null && (searchHistoryViewModelInvoke = function0.invoke()) != null) {
            searchHistoryViewModelInvoke.copydefault(searchTrader);
        }
        InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class);
        android.content.Context context = this.EZpvd;
        if (context != null) {
            java.lang.String type = searchTrader.getType();
            if (type == null) {
                type = "";
            }
            java.lang.String strEZpvd = interfaceC49317umK.EZpvd(type);
            java.lang.String jumpParam = searchTrader.getJumpParam();
            interfaceC49317umK.copydefault(context, jumpParam != null ? jumpParam : "", copydefault(), strEZpvd);
        }
        androidx.fragment.app.Fragment fragment = this.copydefault;
        if (fragment == null || (qhnCopydefault = qHO.copydefault(fragment)) == null) {
            return;
        }
        qhnCopydefault.a_(searchTrader, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    @Override // o.qHM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(@NotNull final DefiWebCoins defiWebCoins, final int i) {
        final FragmentActivity activity;
        qHN qhnCopydefault;
        java.lang.String str;
        oKA oka;
        FragmentActivity activity2;
        android.content.Intent intent;
        java.lang.String stringExtra;
        SearchHistoryViewModel searchHistoryViewModelInvoke;
        Intrinsics.checkNotNullParameter(defiWebCoins, "");
        androidx.fragment.app.Fragment fragment = this.copydefault;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchNavigator", "navigateDefiWeb3DetailPage [webCoin: " + defiWebCoins + ", position: " + i + "]");
        Function0<SearchHistoryViewModel> function0 = this.AEQbTJ;
        if (function0 != null && (searchHistoryViewModelInvoke = function0.invoke()) != null) {
            searchHistoryViewModelInvoke.copydefault(defiWebCoins);
        }
        androidx.fragment.app.Fragment fragment2 = this.copydefault;
        if (fragment2 instanceof AbstractC32996moC) {
            Intrinsics.copydefault(fragment2, "");
            ((AbstractC32996moC) fragment2).showLoading();
        }
        if (Intrinsics.EZpvd(defiWebCoins.getCedefiSupport(), java.lang.Boolean.TRUE)) {
            androidx.fragment.app.Fragment fragment3 = this.copydefault;
            if (fragment3 != null && (activity2 = fragment3.getActivity()) != null && (intent = activity2.getIntent()) != null && (stringExtra = intent.getStringExtra("from")) != null) {
                if (Intrinsics.EZpvd((java.lang.Object) stringExtra, (java.lang.Object) "home_page")) {
                    str = "Home_search";
                } else if (Intrinsics.EZpvd((java.lang.Object) stringExtra, (java.lang.Object) "find_page")) {
                    str = "Discover_search";
                }
                java.lang.String str2 = str;
                oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                }
            } else {
                str = null;
                java.lang.String str22 = str;
                oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    java.lang.String value = KlineDexPageFromType.GLOBAL_SEARCH.getValue();
                    java.lang.String chainId = defiWebCoins.getChainId();
                    java.lang.String str3 = chainId == null ? "" : chainId;
                    java.lang.String tokenContractAddress = defiWebCoins.getTokenContractAddress();
                    java.lang.String str4 = tokenContractAddress == null ? "" : tokenContractAddress;
                    java.lang.String chainName = defiWebCoins.getChainName();
                    java.lang.String str5 = chainName == null ? "" : chainName;
                    java.lang.String tokenSymbol = defiWebCoins.getTokenSymbol();
                    java.lang.String str6 = tokenSymbol == null ? "" : tokenSymbol;
                    java.lang.String chainLogo = defiWebCoins.getChainLogo();
                    java.lang.String str7 = chainLogo == null ? "" : chainLogo;
                    java.lang.String tokenLogo = defiWebCoins.getTokenLogo();
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, activity, null, null, null, value, null, null, null, str22, new C35968oKj(str3, str4, str5, str6, str7, tokenLogo == null ? "" : tokenLogo, ""), null, 1262, null);
                }
            }
        } else {
            AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(((gKO) C43251rlk.copydefault(gKO.class)).aO_(), activity);
            final Function1 function1 = new Function1() { // from class: o.qHg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40040qHc.AEQbTJ(this.EZpvd, activity, defiWebCoins, i, (java.lang.Boolean) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.qHf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C40040qHc.KWHzl(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.qHd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40040qHc.OLrzqt((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.qHh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C40040qHc.EZpvd(function12, obj);
                }
            });
        }
        androidx.fragment.app.Fragment fragment4 = this.copydefault;
        if (fragment4 == null || (qhnCopydefault = qHO.copydefault(fragment4)) == null) {
            return;
        }
        qhnCopydefault.a_(defiWebCoins, i);
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(final C40040qHc c40040qHc, final FragmentActivity fragmentActivity, final DefiWebCoins defiWebCoins, int i, java.lang.Boolean bool) {
        FragmentActivity activity;
        if (bool.booleanValue()) {
            boolean zEZpvd = ((InterfaceC49494upc) C43251rlk.copydefault(InterfaceC49494upc.class)).EZpvd();
            if (c40040qHc.EZpvd() || zEZpvd) {
                androidx.fragment.app.Fragment fragment = c40040qHc.copydefault;
                if (fragment != null && (activity = fragment.getActivity()) != null) {
                    C40069qIe.KWHzl.EZpvd(activity, java.lang.Integer.valueOf(i), new Function0() { // from class: o.qHb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C40040qHc.OLrzqt(this.AEQbTJ, fragmentActivity, defiWebCoins);
                        }
                    }, null);
                }
            } else {
                c40040qHc.OLrzqt(fragmentActivity, defiWebCoins);
            }
        } else {
            java.lang.String chainId = defiWebCoins.getChainId();
            java.lang.String str = chainId == null ? "" : chainId;
            java.lang.String tokenContractAddress = defiWebCoins.getTokenContractAddress();
            java.lang.String str2 = tokenContractAddress == null ? "" : tokenContractAddress;
            java.lang.String tokenLogo = defiWebCoins.getTokenLogo();
            if (tokenLogo == null) {
                tokenLogo = "";
            }
            java.lang.String chainLogo = defiWebCoins.getChainLogo();
            java.lang.String str3 = chainLogo == null ? "" : chainLogo;
            java.lang.String tokenSymbol = defiWebCoins.getTokenSymbol();
            java.lang.String str4 = tokenSymbol == null ? "" : tokenSymbol;
            java.lang.String tokenName = defiWebCoins.getTokenName();
            TokenBase tokenBase = new TokenBase(str, str2, tokenLogo, str3, null, str4, tokenName == null ? "" : tokenName, 0, 0, 0, 0, null, "cefi_trade", null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -4208, null);
            gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
            C40069qIe c40069qIe = C40069qIe.KWHzl;
            gko.KWHzl(c40069qIe.AEQbTJ(java.lang.Integer.valueOf(i)), c40069qIe.AEQbTJ());
            ((gKO) C43251rlk.copydefault(gKO.class)).AEQbTJ(fragmentActivity, tokenBase);
        }
        androidx.fragment.app.Fragment fragment2 = c40040qHc.copydefault;
        if (fragment2 instanceof AbstractC32996moC) {
            Intrinsics.copydefault(fragment2, "");
            ((AbstractC32996moC) fragment2).dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C40040qHc c40040qHc, FragmentActivity fragmentActivity, DefiWebCoins defiWebCoins) {
        c40040qHc.OLrzqt(fragmentActivity, defiWebCoins);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchNavigator", "navigateDefiWeb3DetailPage error", th);
        return Unit.INSTANCE;
    }

    @Override // o.qHM
    public void OLrzqt(@NotNull P2pAndDeposit p2pAndDeposit, int i) {
        FragmentActivity activity;
        qHN qhnCopydefault;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        TradeCoinInfo tradeCoinInfoAhwBna;
        SearchHistoryViewModel searchHistoryViewModelInvoke;
        Intrinsics.checkNotNullParameter(p2pAndDeposit, "");
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchNavigator", "navigateDeposit [deposit: " + p2pAndDeposit + ", position: " + i + "]");
        androidx.fragment.app.Fragment fragment = this.copydefault;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        java.lang.String id = null;
        if (!((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB().values()) {
            InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), activity, null, 2, null);
            return;
        }
        Function0<SearchHistoryViewModel> function0 = this.AEQbTJ;
        if (function0 != null && (searchHistoryViewModelInvoke = function0.invoke()) != null) {
            searchHistoryViewModelInvoke.copydefault(new P2pAndDepositHistory(p2pAndDeposit, C40036qGz.OLrzqt(p2pAndDeposit, false), false));
        }
        java.lang.String ccy = p2pAndDeposit.getCcy();
        if (ccy != null && (interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt()) != null && (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(ccy)) != null) {
            id = tradeCoinInfoAhwBna.getId();
        }
        InterfaceC8224ayh.TaskDescription.goToDeposit$default((InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class), activity, new DepositEntryPoint.SpecificCryptoPage(id != null ? C33129mqd.AhwBna(id) : 1), null, null, null, null, 60, null);
        androidx.fragment.app.Fragment fragment2 = this.copydefault;
        if (fragment2 == null || (qhnCopydefault = qHO.copydefault(fragment2)) == null) {
            return;
        }
        qhnCopydefault.KWHzl(p2pAndDeposit, false);
    }

    @Override // o.qHM
    public void AEQbTJ(@NotNull P2pAndDeposit p2pAndDeposit, int i) {
        FragmentActivity activity;
        java.lang.String str;
        qHN qhnCopydefault;
        SearchHistoryViewModel searchHistoryViewModelInvoke;
        Intrinsics.checkNotNullParameter(p2pAndDeposit, "");
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchNavigator", "navigateBuy [buy: " + p2pAndDeposit + ", position: " + i + "]");
        androidx.fragment.app.Fragment fragment = this.copydefault;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        Function0<SearchHistoryViewModel> function0 = this.AEQbTJ;
        if (function0 != null && (searchHistoryViewModelInvoke = function0.invoke()) != null) {
            searchHistoryViewModelInvoke.copydefault(new P2pAndDepositHistory(p2pAndDeposit, C40036qGz.OLrzqt(p2pAndDeposit, true), true));
        }
        if (Intrinsics.EZpvd((java.lang.Object) p2pAndDeposit.getSupportP2P(), (java.lang.Object) "express")) {
            str = "okx://exchange/p2p/express?type=buy&crypto=" + p2pAndDeposit.getCcy();
        } else if (Intrinsics.EZpvd((java.lang.Object) p2pAndDeposit.getSupportP2P(), (java.lang.Object) "markets")) {
            str = "okx://exchange/p2p/trading?type=buy&crypto=" + p2pAndDeposit.getCcy();
        } else {
            str = "okx://exchange/p2p/express?type=buy&crypto=" + p2pAndDeposit.getCcy();
        }
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, str, null, new Function1() { // from class: o.qHe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40040qHc.AYXKKw((AbstractC43238rlX) obj);
            }
        }, 4, null);
        androidx.fragment.app.Fragment fragment2 = this.copydefault;
        if (fragment2 == null || (qhnCopydefault = qHO.copydefault(fragment2)) == null) {
            return;
        }
        qhnCopydefault.KWHzl(p2pAndDeposit, true);
    }

    public static final Unit AYXKKw(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    @Override // o.qHM
    public void AEQbTJ(@NotNull C39992qFi c39992qFi, int i) {
        qHN qhnCopydefault;
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(c39992qFi, "");
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchNavigator", "navigateCampaignDetailPage [campaign: " + c39992qFi + ", position: " + i + "]");
        java.lang.String link = c39992qFi.copydefault().getLink();
        if (link != null) {
            androidx.fragment.app.Fragment fragment = this.copydefault;
            if (fragment == null || (activity = fragment.getActivity()) == null) {
                return;
            } else {
                copydefault(activity, link);
            }
        }
        androidx.fragment.app.Fragment fragment2 = this.copydefault;
        if (fragment2 == null || (qhnCopydefault = qHO.copydefault(fragment2)) == null) {
            return;
        }
        qhnCopydefault.AkhnZx();
    }

    @Override // o.qHM
    public void EZpvd(@NotNull C39993qFj c39993qFj, int i) {
        qHN qhnCopydefault;
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(c39993qFj, "");
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchNavigator", "navigateAnnouncementDetailPage [announcement: " + c39993qFj + ", position: " + i + "]");
        java.lang.String link = c39993qFj.AEQbTJ().getLink();
        if (link != null) {
            androidx.fragment.app.Fragment fragment = this.copydefault;
            if (fragment == null || (activity = fragment.getActivity()) == null) {
                return;
            } else {
                copydefault(activity, link);
            }
        }
        androidx.fragment.app.Fragment fragment2 = this.copydefault;
        if (fragment2 == null || (qhnCopydefault = qHO.copydefault(fragment2)) == null) {
            return;
        }
        qhnCopydefault.values();
    }

    public final void copydefault(android.app.Activity activity, java.lang.String str) {
        java.lang.String scheme;
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
        if (string.length() > 0) {
            try {
                scheme = new java.net.URI(string).getScheme();
            } catch (java.lang.Exception e) {
                C40375qTn.AEQbTJ.copydefault("DefaultMainSearchNavigator", "linkJump error", e);
            }
            if (scheme == null) {
                scheme = "";
            }
            if (C59449zhJ.gEmmrt(scheme, "https", true) || C59449zhJ.gEmmrt(scheme, "http", true)) {
                AEQbTJ(activity, string);
            } else {
                InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, string, null, new Function1() { // from class: o.qGY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C40040qHc.AEQbTJ((AbstractC43238rlX) obj);
                    }
                }, 4, null);
            }
        }
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(android.app.Activity activity, java.lang.String str) {
        try {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("title", "")), null, 4, null);
        } catch (java.lang.Exception e) {
            C40375qTn.AEQbTJ.copydefault("DefaultMainSearchNavigator", "openSystemBrowser error", e);
        }
    }

    public final boolean EZpvd() {
        return SPUtils.getBoolean("show_disclaimer_dialog", true);
    }

    public final void OLrzqt(FragmentActivity fragmentActivity, DefiWebCoins defiWebCoins) {
        gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
        java.lang.String chainId = defiWebCoins.getChainId();
        java.lang.String str = chainId == null ? "" : chainId;
        java.lang.String tokenContractAddress = defiWebCoins.getTokenContractAddress();
        java.lang.String str2 = tokenContractAddress == null ? "" : tokenContractAddress;
        java.lang.String tokenLogo = defiWebCoins.getTokenLogo();
        java.lang.String str3 = tokenLogo == null ? "" : tokenLogo;
        java.lang.String chainLogo = defiWebCoins.getChainLogo();
        java.lang.String str4 = chainLogo == null ? "" : chainLogo;
        java.lang.String tokenSymbol = defiWebCoins.getTokenSymbol();
        java.lang.String str5 = tokenSymbol == null ? "" : tokenSymbol;
        java.lang.String tokenName = defiWebCoins.getTokenName();
        gko.EZpvd(fragmentActivity, new TokenBase(str, str2, str3, str4, null, str5, tokenName == null ? "" : tokenName, 0, 0, 0, 0, null, "cefi_trade", null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -4208, null));
    }

    @Override // o.qHM
    public void AEQbTJ(@NotNull C39991qFh c39991qFh, int i) {
        qHN qhnCopydefault;
        Intrinsics.checkNotNullParameter(c39991qFh, "");
        InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43248rlh.KWHzl.OLrzqt(InterfaceC43033rhe.class);
        if (interfaceC43033rhe != null) {
            android.content.Context context = this.EZpvd;
            if (context == null) {
                return;
            } else {
                interfaceC43033rhe.OLrzqt(context, c39991qFh.KWHzl(), "search", null);
            }
        }
        androidx.fragment.app.Fragment fragment = this.copydefault;
        if (fragment == null || (qhnCopydefault = qHO.copydefault(fragment)) == null) {
            return;
        }
        qhnCopydefault.EZpvd(c39991qFh, i);
    }

    @Override // o.qHM
    public void EZpvd(@NotNull C39997qFn c39997qFn, int i) {
        qHN qhnCopydefault;
        Intrinsics.checkNotNullParameter(c39997qFn, "");
        C40375qTn.AEQbTJ.copydefault("DefaultMainSearchNavigator", "navigateContentKolProfilePage [vo: " + c39997qFn + ", position: " + i + "]");
        tWL twl = (tWL) C43248rlh.KWHzl.OLrzqt(tWL.class);
        if (twl != null) {
            android.content.Context context = this.EZpvd;
            if (context == null) {
                return;
            } else {
                twl.KWHzl(context, "", c39997qFn.AEQbTJ(), "", "search", "");
            }
        }
        androidx.fragment.app.Fragment fragment = this.copydefault;
        if (fragment == null || (qhnCopydefault = qHO.copydefault(fragment)) == null) {
            return;
        }
        qhnCopydefault.KWHzl(c39997qFn, i);
    }

    @Override // o.qHM
    public void copydefault(@NotNull C40004qFu c40004qFu, int i, java.lang.String str) {
        FragmentActivity activity;
        qHN qhnCopydefault;
        android.content.Intent intentKWHzl;
        qHN qhnCopydefault2;
        android.content.Intent intentAEQbTJ;
        Intrinsics.checkNotNullParameter(c40004qFu, "");
        androidx.fragment.app.Fragment fragment = this.copydefault;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            C40375qTn.e$default(C40375qTn.AEQbTJ, "DefaultMainSearchNavigator", "Host activity is null, cannot navigate to IM chat detail page.", null, 4, null);
            return;
        }
        if (str == null) {
            C40375qTn.e$default(C40375qTn.AEQbTJ, "DefaultMainSearchNavigator", "Keyword is null, cannot navigate to IM chat detail page.", null, 4, null);
            return;
        }
        C40375qTn c40375qTn = C40375qTn.AEQbTJ;
        c40375qTn.copydefault("DefaultMainSearchNavigator", "navigateIMChatDetailPage [vo: " + c40004qFu + ", position: " + i + ", keyword: " + str + "]");
        SearchResultData searchResultDataOLrzqt = c40004qFu.OLrzqt();
        if (searchResultDataOLrzqt instanceof SearchResultData.ChatAndContact) {
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC35180nqU.class));
            if (interfaceC35180nqU != null && (intentAEQbTJ = interfaceC35180nqU.AEQbTJ(activity, (SearchResultData.ChatAndContact) c40004qFu.OLrzqt(), str)) != null) {
                activity.startActivity(intentAEQbTJ);
            }
            androidx.fragment.app.Fragment fragment2 = this.copydefault;
            if (fragment2 == null || (qhnCopydefault2 = qHO.copydefault(fragment2)) == null) {
                return;
            }
            qhnCopydefault2.KWHzl(c40004qFu, i);
            return;
        }
        if (searchResultDataOLrzqt instanceof SearchResultData.Message) {
            InterfaceC35180nqU interfaceC35180nqU2 = (InterfaceC35180nqU) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC35180nqU.class));
            if (interfaceC35180nqU2 != null && (intentKWHzl = interfaceC35180nqU2.KWHzl(activity, (SearchResultData.Message) c40004qFu.OLrzqt(), str)) != null) {
                activity.startActivity(intentKWHzl);
            }
            androidx.fragment.app.Fragment fragment3 = this.copydefault;
            if (fragment3 == null || (qhnCopydefault = qHO.copydefault(fragment3)) == null) {
                return;
            }
            qhnCopydefault.KWHzl(c40004qFu, i);
            return;
        }
        C40375qTn.e$default(c40375qTn, "DefaultMainSearchNavigator", "Unsupported SearchResultData type: " + c40004qFu.OLrzqt().getClass().getName(), null, 4, null);
    }

    public static final SearchHistoryViewModel EZpvd(final androidx.fragment.app.Fragment fragment) {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.search.features.main.root.ui.DefaultMainSearchNavigator$attachNavContext$lambda$0$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.main.root.ui.DefaultMainSearchNavigator$attachNavContext$lambda$0$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        return (SearchHistoryViewModel) FragmentViewModelLazyKt.createViewModelLazy(fragment, C56524yIo.AEQbTJ(SearchHistoryViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.main.root.ui.DefaultMainSearchNavigator$attachNavContext$lambda$0$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.main.root.ui.DefaultMainSearchNavigator$attachNavContext$lambda$0$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.main.root.ui.DefaultMainSearchNavigator$attachNavContext$lambda$0$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }).getValue();
    }
}
