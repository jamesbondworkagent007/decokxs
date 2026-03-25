package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.QuotePriceBean;
import com.okinc.kline.ui.CoinMoreTradeFragmentV2$onCreate$1;
import com.okinc.kline.ui.CoinMoreTradeFragmentV2$onCreate$2;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.BuySellInputPageParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.trade.source.search.OkBizSearchInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C35964oKf;
import o.InterfaceC37934pGc;
import o.InterfaceC43294rma;
import o.InterfaceC47251tmX;
import o.InterfaceC49497upf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pas, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C38516pas extends AbstractC38556pbf implements InterfaceC37934pGc {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public android.widget.TextView AYXKKw;
    public android.view.View AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public android.view.View EZpvd;
    public RecyclerView gEmmrt;
    public final java.lang.String copydefault = "2";
    public C59534zip KWHzl = new C59534zip();
    public final int AEQbTJ = C33070mpX.OLrzqt(C32113mPz.StateListAnimator.valueOf);
    public final android.os.Handler valueOf = new android.os.Handler(android.os.Looper.getMainLooper());
    public final Function0<Unit> djBIcL = new Function0() { // from class: o.paq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C38516pas.gEmmrt(this.copydefault);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.wlaJM;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.InterfaceC37934pGc
    public void KWHzl() {
        InterfaceC37934pGc.Activity.EZpvd(this);
    }

    public C38516pas() {
        final Function0 function0 = null;
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37858pDh.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.CoinMoreTradeFragmentV2$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.CoinMoreTradeFragmentV2$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.CoinMoreTradeFragmentV2$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: o.pas$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pas.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C38516pas AEQbTJ() {
            return new C38516pas();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C37858pDh gEmmrt() {
        return (C37858pDh) this.DbNXlk.getValue();
    }

    private final android.view.View djBIcL() {
        android.view.View view = getView();
        if (view != null) {
            return view.findViewById(C35964oKf.StateListAnimator.ICustomTabsService);
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AYXKKw = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.ddauOi);
        this.AhwBna = view.findViewById(C35964oKf.StateListAnimator.OBzZra);
        this.EZpvd = view.findViewById(C35964oKf.StateListAnimator.DGUQLIDGUQLI);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C35964oKf.StateListAnimator.zUtmHU);
        this.gEmmrt = recyclerView;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new StateListAnimator());
        }
        RecyclerView recyclerView2 = this.gEmmrt;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(view.getContext()));
        }
        RecyclerView recyclerView3 = this.gEmmrt;
        if (recyclerView3 != null) {
            C59534zip c59534zip = this.KWHzl;
            c59534zip.register(C39519ptq.class, new C39513ptk(new Function1() { // from class: o.pat
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38516pas.KWHzl(this.OLrzqt, (OkBizSearchInfo) obj);
                }
            }, new Function1() { // from class: o.pax
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38516pas.copydefault(this.AEQbTJ, (OkBizSearchInfo) obj);
                }
            }));
            c59534zip.register(C48916ueh.class, new C39528ptz(new Function1() { // from class: o.pau
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38516pas.EZpvd(this.OLrzqt, (java.lang.String) obj);
                }
            }));
            c59534zip.register(java.lang.String.class, new oZE(new Function0() { // from class: o.paz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C38516pas.AhwBna(this.KWHzl);
                }
            }));
            recyclerView3.setAdapter(c59534zip);
        }
    }

    /* JADX INFO: renamed from: o.pas$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ItemDecoration {
        public StateListAnimator() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            rect.set(0, C38516pas.this.EZpvd(), 0, C38516pas.this.EZpvd());
        }
    }

    public static final Unit KWHzl(final C38516pas c38516pas, final OkBizSearchInfo okBizSearchInfo) {
        Intrinsics.checkNotNullParameter(okBizSearchInfo, "");
        MarketCoinInfo marketCoinInfo = new MarketCoinInfo(okBizSearchInfo.getBizInfo().getInstId(), okBizSearchInfo.getBizInfo().getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
        C32866mlf.onEvent$default("Token_Trade_TokenList_Click", (TrackChannel[]) null, new Function1() { // from class: o.paD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38516pas.EZpvd(okBizSearchInfo, c38516pas, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        android.content.Intent intent = new android.content.Intent(c38516pas.requireActivity(), (java.lang.Class<?>) ActivityC38834pgs.class);
        intent.putExtra("from", "Token");
        intent.putExtra("from_scene", "Token_Info");
        intent.putExtra("market_detail_info", marketCoinInfo);
        c38516pas.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Unit EZpvd(OkBizSearchInfo okBizSearchInfo, C38516pas c38516pas, EventParamsList eventParamsList) {
        java.lang.String str;
        java.lang.String first;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String instType = okBizSearchInfo.getBizInfo().getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                str = !instType.equals("MARGIN") ? "" : "margin";
                break;
            case -1956807563:
                str = !instType.equals("OPTION") ? "" : "option";
                break;
            case 2552066:
                str = !instType.equals("SPOT") ? "" : "spot";
                break;
            case 2558355:
                str = !instType.equals("SWAP") ? "" : "perpetual";
                break;
            case 214415088:
                str = !instType.equals("FUTURES") ? "" : "futures";
                break;
            default:
                str = "";
                break;
        }
        eventParamsList.put("type", str, true);
        EventParamsList.put$default(eventParamsList, "click_item", okBizSearchInfo.getBizInfo().getInstId(), false, 4, null);
        kotlin.Pair<java.lang.String, java.lang.String> value = c38516pas.gEmmrt().ejfBZ().getValue();
        EventParamsList.put$default(eventParamsList, "token", (value == null || (first = value.getFirst()) == null) ? "" : first, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C38516pas c38516pas, OkBizSearchInfo okBizSearchInfo) {
        Intrinsics.checkNotNullParameter(okBizSearchInfo, "");
        if (okBizSearchInfo.isWatching()) {
            c38516pas.gEmmrt().OLrzqt(okBizSearchInfo.getBizInfo());
        } else {
            c38516pas.gEmmrt().copydefault(okBizSearchInfo.getBizInfo());
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final C38516pas c38516pas, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity activity = c38516pas.getActivity();
        if (activity != null) {
            C32866mlf.EZpvd("token_more_click", new EventParam("type", "8", true));
            C32866mlf.onEvent$default("Token_Trade_TokenList_Click", (TrackChannel[]) null, new Function1() { // from class: o.paE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38516pas.OLrzqt(this.EZpvd, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            InterfaceC49497upf.ActionBar.openSimpleOptionPage$default((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI), activity, str, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C38516pas c38516pas, EventParamsList eventParamsList) {
        java.lang.String first;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", "option", true);
        EventParamsList.put$default(eventParamsList, "click_item", "option", false, 4, null);
        kotlin.Pair<java.lang.String, java.lang.String> value = c38516pas.gEmmrt().ejfBZ().getValue();
        EventParamsList.put$default(eventParamsList, "token", (value == null || (first = value.getFirst()) == null) ? "" : first, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(final C38516pas c38516pas) {
        C32866mlf.onEvent$default("Token_Trade_TokenList_Click", (TrackChannel[]) null, new Function1() { // from class: o.paG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38516pas.KWHzl(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        java.lang.String strAEQbTJ = ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).AEQbTJ();
        FragmentActivity activity = c38516pas.getActivity();
        if (activity != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, strAEQbTJ, null, new Function1() { // from class: o.pav
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38516pas.KWHzl((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C38516pas c38516pas, EventParamsList eventParamsList) {
        java.lang.String first;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", "bot", true);
        kotlin.Pair<java.lang.String, java.lang.String> value = c38516pas.gEmmrt().ejfBZ().getValue();
        EventParamsList.put$default(eventParamsList, "token", (value == null || (first = value.getFirst()) == null) ? "" : first, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        C37858pDh c37858pDhGEmmrt = gEmmrt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c37858pDhGEmmrt.KWHzl(viewLifecycleOwner);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new CoinMoreTradeFragmentV2$onCreate$1(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new CoinMoreTradeFragmentV2$onCreate$2(this, null));
    }

    public final void KWHzl(final kotlin.Pair<java.lang.String, java.lang.String> pair, final kotlin.Pair<java.lang.String, QuotePriceBean> pair2) {
        java.lang.String localized$default;
        java.lang.String price;
        int i = C35964oKf.Fragment.OEgNct;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, pair.getFirst());
        QuotePriceBean second = pair2.getSecond();
        if (second == null || (price = second.getPrice()) == null || (localized$default = pTB.formatLocalized$default(price, null, 1, null)) == null) {
            localized$default = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("num", localized$default);
        pairArr[2] = C56390yDp.OLrzqt(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, pair2.getFirst());
        java.lang.String strCopydefault = C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr));
        android.view.View view = this.AhwBna;
        if (view != null) {
            view.setVisibility(0);
        }
        copydefault(this.AhwBna, C33070mpX.AYXKKw(C35964oKf.Fragment.UfveVb), strCopydefault, new Function0() { // from class: o.paF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38516pas.AEQbTJ(pair, pair2, this);
            }
        });
    }

    public static final Unit AEQbTJ(kotlin.Pair pair, kotlin.Pair pair2, final C38516pas c38516pas) {
        java.lang.String str = (java.lang.String) pair.getFirst();
        if (str != null) {
            BuySellInputPageParameters buySellInputPageParameters = new BuySellInputPageParameters(TradeType.BUY, null, (java.lang.String) pair2.getFirst(), null, str, null, OKPaymentSource.LITE_TOKEN_DETAILS, null, null, null, null, null, false, 8106, null);
            FragmentActivity activity = c38516pas.getActivity();
            if (activity != null) {
                InterfaceC47251tmX.StateListAnimator.goToBuySellInputPage$default((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class), activity, buySellInputPageParameters, null, 4, null);
            }
        }
        C32866mlf.onEvent$default("Token_Trade_TokenList_Click", (TrackChannel[]) null, new Function1() { // from class: o.paw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38516pas.djBIcL(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C38516pas c38516pas, EventParamsList eventParamsList) {
        java.lang.String first;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", "buycrypto", true);
        kotlin.Pair<java.lang.String, java.lang.String> value = c38516pas.gEmmrt().ejfBZ().getValue();
        EventParamsList.put$default(eventParamsList, "token", (value == null || (first = value.getFirst()) == null) ? "" : first, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C38516pas c38516pas) {
        c38516pas.KWHzl.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refresh$default(C38516pas c38516pas, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c38516pas.copydefault(z);
    }

    public final void copydefault(boolean z) {
        getTAG();
        android.os.Handler handler = this.valueOf;
        final Function0<Unit> function0 = this.djBIcL;
        handler.removeCallbacks(new java.lang.Runnable() { // from class: o.paB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C38516pas.EZpvd(function0);
            }
        });
        if (z) {
            android.os.Handler handler2 = this.valueOf;
            final Function0<Unit> function02 = this.djBIcL;
            handler2.postDelayed(new java.lang.Runnable() { // from class: o.pay
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C38516pas.OLrzqt(function02);
                }
            }, 400L);
        } else {
            android.os.Handler handler3 = this.valueOf;
            final Function0<Unit> function03 = this.djBIcL;
            handler3.post(new java.lang.Runnable() { // from class: o.paC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C38516pas.valueOf(function03);
                }
            });
        }
    }

    public static final void EZpvd(Function0 function0) {
        function0.invoke();
    }

    public static final void OLrzqt(Function0 function0) {
        function0.invoke();
    }

    public static final void valueOf(Function0 function0) {
        function0.invoke();
    }

    public final void AEQbTJ() {
        android.view.View view = this.AhwBna;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX DEBUG: Possible override for method o.pbf.OLrzqt()V */
    @Override // o.InterfaceC37934pGc
    public java.util.List<android.view.View> OLrzqt() {
        java.util.List<android.view.View> listEZpvd;
        android.view.View viewDjBIcL = djBIcL();
        return (viewDjBIcL == null || (listEZpvd = C56402yEa.EZpvd(viewDjBIcL)) == null) ? yDY.AhwBna() : listEZpvd;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    public final void copydefault(android.view.View view, java.lang.String str, java.lang.String str2, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (view == null) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewWithTag("title");
        if (textView != null) {
            textView.setText(str);
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewWithTag("subTitle");
        if (textView2 != null) {
            textView2.setText(str2);
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: o.paA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C38516pas.KWHzl(function0, view2);
            }
        });
    }

    public static final void KWHzl(Function0 function0, android.view.View view) {
        function0.invoke();
    }
}
