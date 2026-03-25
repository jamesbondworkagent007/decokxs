package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.MarketToolManager$changeWatchlistStatus$1$call$1;
import com.okinc.business.market.market.MarketToolManager$changeWatchlistStatus$1$call$2;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.market.common.biz_spot.bean.UnifiedPriceRemind;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.productmatrix.biz.bean.ProductMatrixRemoteConfig;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BizResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43033rhe;
import o.InterfaceC8104awT;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kFy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27858kFy {
    public static final C27858kFy EZpvd = new C27858kFy();

    private C27858kFy() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.kFy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void changeWatchlistStatus$default(C27858kFy c27858kFy, LifecycleOwner lifecycleOwner, CoinQuote coinQuote, AbstractC54646xQb abstractC54646xQb, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            function0 = null;
        }
        c27858kFy.OLrzqt(lifecycleOwner, coinQuote, abstractC54646xQb, str, function0);
    }

    public final void OLrzqt(@NotNull final LifecycleOwner lifecycleOwner, @NotNull final CoinQuote coinQuote, AbstractC54646xQb abstractC54646xQb, @NotNull final java.lang.String str, final Function0<Unit> function0) {
        final BizInstrument bizInstrumentAEQbTJ;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (abstractC54646xQb != null && (bizInstrumentAEQbTJ = abstractC54646xQb.AEQbTJ(coinQuote.getInstId(), coinQuote.getInstType(), abstractC54646xQb instanceof xTS)) != null) {
            Function2 marketToolManager$changeWatchlistStatus$1$call$1 = coinQuote.isWatch() ? new MarketToolManager$changeWatchlistStatus$1$call$1(abstractC54646xQb) : new MarketToolManager$changeWatchlistStatus$1$call$2(abstractC54646xQb);
            MutableLiveData mutableLiveData = new MutableLiveData();
            mutableLiveData.observe(lifecycleOwner, new Observer() { // from class: o.kFB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(java.lang.Object obj) {
                    C27858kFy.KWHzl(coinQuote, lifecycleOwner, bizInstrumentAEQbTJ, function0, (BizResp) obj);
                }
            });
            Unit unit = Unit.INSTANCE;
            marketToolManager$changeWatchlistStatus$1$call$1.invoke(bizInstrumentAEQbTJ, mutableLiveData);
        }
        C32866mlf.onEvent$default("TokenList_Longpress_Item_Click", (TrackChannel[]) null, new Function1() { // from class: o.kFG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27858kFy.AEQbTJ(str, coinQuote, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final void KWHzl(CoinQuote coinQuote, LifecycleOwner lifecycleOwner, BizInstrument bizInstrument, Function0 function0, BizResp bizResp) {
        if (bizResp.isSuccess()) {
            if (coinQuote.isWatch()) {
                C33070mpX.AYXKKw(qZH.PendingIntent.gHZMYf);
            } else {
                boolean z = lifecycleOwner instanceof androidx.fragment.app.Fragment;
                androidx.fragment.app.Fragment fragment = z ? (androidx.fragment.app.Fragment) lifecycleOwner : null;
                android.content.Context context = fragment != null ? fragment.getContext() : null;
                androidx.fragment.app.Fragment fragment2 = z ? (androidx.fragment.app.Fragment) lifecycleOwner : null;
                androidx.fragment.app.FragmentManager parentFragmentManager = fragment2 != null ? fragment2.getParentFragmentManager() : null;
                if (context != null && parentFragmentManager != null && C55608xnE.isLogin$default(null, 1, null) && !C55608xnE.OLrzqt()) {
                    jSE.showCryptoAddedTip$default(jSE.EZpvd, context, parentFragmentManager, bizInstrument, "market_list", 0, 16, null);
                } else {
                    C33134mqi.AEQbTJ(C33070mpX.AYXKKw(qZH.PendingIntent.DTwDnp));
                }
            }
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        C33134mqi.AEQbTJ(bizResp.getErrorMsg());
    }

    public static final Unit AEQbTJ(java.lang.String str, CoinQuote coinQuote, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "item_type", "star", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "biz_type", EZpvd.AEQbTJ(coinQuote.getInstType()), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kFy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTopToWatchlist$default(C27858kFy c27858kFy, LifecycleOwner lifecycleOwner, CoinQuote coinQuote, AbstractC54646xQb abstractC54646xQb, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        c27858kFy.EZpvd(lifecycleOwner, coinQuote, abstractC54646xQb, function0);
    }

    public final void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull CoinQuote coinQuote, AbstractC54646xQb abstractC54646xQb, final Function0<Unit> function0) {
        BizInstrument bizInstrumentAEQbTJ;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        if (abstractC54646xQb == null || (bizInstrumentAEQbTJ = abstractC54646xQb.AEQbTJ(coinQuote.getInstId(), coinQuote.getInstType(), abstractC54646xQb instanceof xTS)) == null) {
            return;
        }
        MutableLiveData<BizResp> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.observe(lifecycleOwner, new Observer() { // from class: o.kFF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C27858kFy.copydefault(function0, (BizResp) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        abstractC54646xQb.copydefault(bizInstrumentAEQbTJ, mutableLiveData);
    }

    public static final void copydefault(Function0 function0, BizResp bizResp) {
        if (!bizResp.isSuccess()) {
            C33134mqi.AEQbTJ(bizResp.getErrorMsg());
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull final CoinQuote coinQuote, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (C55608xnE.copydefault(context)) {
            AEQbTJ(coinQuote, context);
        } else {
            InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), context, null, 2, null);
        }
        C32866mlf.onEvent$default("TokenList_Longpress_Item_Click", (TrackChannel[]) null, new Function1() { // from class: o.kFC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27858kFy.OLrzqt(str, coinQuote, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, CoinQuote coinQuote, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "item_type", ProductMatrixRemoteConfig.ALERT, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "biz_type", EZpvd.AEQbTJ(coinQuote.getInstType()), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(CoinQuote coinQuote, android.content.Context context) {
        UnifiedPriceRemind unifiedPriceRemind;
        UnifiedPriceRemind unifiedPriceRemind2;
        UnifiedPriceRemind unifiedPriceRemind3;
        InterfaceC43033rhe interfaceC43033rhe;
        if (Intrinsics.EZpvd((java.lang.Object) coinQuote.getInstType(), (java.lang.Object) "COIN")) {
            java.lang.String str = coinQuote.getInstId() + "-USDT";
            unifiedPriceRemind = new UnifiedPriceRemind(C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, str, "SPOT", false, false, false, 28, null), "SPOT", str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1, 120, (DefaultConstructorMarker) null);
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) coinQuote.getInstType(), (java.lang.Object) "FUTURES") && coinQuote.isPreMarket()) {
                java.lang.String strCopydefault = C40381qTt.copydefault.copydefault(coinQuote.getInstId());
                if (strCopydefault == null) {
                    strCopydefault = coinQuote.getInstId();
                }
                if (strCopydefault == null) {
                    strCopydefault = "";
                }
                unifiedPriceRemind2 = new UnifiedPriceRemind(strCopydefault, coinQuote.getInstType(), coinQuote.getInstId(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1, 120, (DefaultConstructorMarker) null);
            } else if (Intrinsics.EZpvd((java.lang.Object) coinQuote.getInstType(), (java.lang.Object) "FUTURES") && !coinQuote.isPreMarket()) {
                unifiedPriceRemind2 = new UnifiedPriceRemind(C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, coinQuote.getInstId(), coinQuote.getInstType(), false, false, false, 28, null), coinQuote.getInstType(), coinQuote.getInstId(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1, 120, (DefaultConstructorMarker) null);
            } else {
                unifiedPriceRemind = new UnifiedPriceRemind(C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, coinQuote.getInstId(), coinQuote.getInstType(), false, false, false, 28, null), coinQuote.getInstType(), coinQuote.getInstId(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1, 120, (DefaultConstructorMarker) null);
            }
            unifiedPriceRemind3 = unifiedPriceRemind2;
            interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
            if (interfaceC43033rhe == null) {
                InterfaceC43033rhe.StateListAnimator.gotoAllPriceRemindActivity$default(interfaceC43033rhe, context, unifiedPriceRemind3, null, 4, null);
                return;
            }
            return;
        }
        unifiedPriceRemind3 = unifiedPriceRemind;
        interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
        if (interfaceC43033rhe == null) {
        }
    }

    public final void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ActivityC26135jTf.Companion.KWHzl(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1956807563:
                return !str.equals("OPTION") ? "all" : "option";
            case 2074257:
                if (str.equals("COIN")) {
                    return OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK;
                }
                break;
            case 2552066:
                if (str.equals("SPOT")) {
                    return "spot";
                }
                break;
            case 2558355:
                if (str.equals("SWAP")) {
                    return "futures";
                }
                break;
            case 214415088:
                if (!str.equals("FUTURES")) {
                }
                break;
            case 1131295064:
                if (str.equals("pre_market")) {
                    return "perpetual";
                }
                break;
        }
    }
}
