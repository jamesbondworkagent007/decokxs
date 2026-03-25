package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.market.fragment.OptionChainFragment$changeErrorState$1$1;
import com.okinc.business.market.market.fragment.OptionChainFragment$handleTradeResult$1;
import com.okinc.business.market.market.fragment.OptionChainFragment$onVisible$1;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC49497upf;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kHp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27903kHp extends AbstractC32998moE {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public android.widget.FrameLayout AkhnZx;
    public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> AuCTel;
    public RecyclerView DbNXlk;
    public boolean KWHzl;
    public RecyclerView gEmmrt;
    public InterfaceC58217yxC isConnected;
    public android.widget.LinearLayout valueOf;
    public android.widget.LinearLayout values;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.kHB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C27903kHp.KWHzl();
        }
    });
    public java.lang.String AYXKKw = "";
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.kHy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C27903kHp.AhwBna();
        }
    });
    public final java.lang.Object AEQbTJ = new java.lang.Object();
    public final java.util.List<java.lang.Object> fetchVPNInfo = new java.util.ArrayList();
    public final android.os.Handler copydefault = new android.os.Handler(android.os.Looper.getMainLooper());
    public boolean AhwBna = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.iqMDAV;
    }

    public final C43316rmw valueOf() {
        return (C43316rmw) this.djBIcL.getValue();
    }

    public static final C43316rmw KWHzl() {
        return new C43316rmw();
    }

    private final C59534zip djBIcL() {
        return (C59534zip) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C59534zip AhwBna() {
        return new C59534zip();
    }

    /* JADX INFO: renamed from: o.kHp$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kHp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C27903kHp KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C27903kHp c27903kHp = new C27903kHp();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("Option Chain", str);
            c27903kHp.setArguments(bundle);
            return c27903kHp;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("OPTIONS_CHAIN");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.kHx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27903kHp.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.kHz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27903kHp.copydefault(function1, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("SIMPLE_MODE");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ2, this);
        final Function1 function12 = new Function1() { // from class: o.kHA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27903kHp.djBIcL(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.kHC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27903kHp.KWHzl(function12, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C27903kHp c27903kHp, java.lang.String str) {
        c27903kHp.AYXKKw = "Option Chain";
        c27903kHp.gEmmrt();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(C27903kHp c27903kHp, java.lang.String str) {
        c27903kHp.AYXKKw = "Simple mode";
        c27903kHp.gEmmrt();
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        java.util.List<java.lang.Object> list;
        if (Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) "Simple mode")) {
            android.widget.LinearLayout linearLayout = this.values;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout2 = this.valueOf;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } else {
            android.widget.LinearLayout linearLayout3 = this.values;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout4 = this.valueOf;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(0);
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (!C43453rpa.AEQbTJ.KWHzl(activity) && ((list = this.fetchVPNInfo) == null || list.isEmpty())) {
                android.widget.LinearLayout linearLayout5 = this.values;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
                android.widget.LinearLayout linearLayout6 = this.valueOf;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(8);
                }
                copydefault(true);
                return;
            }
            android.widget.FrameLayout frameLayout = this.AkhnZx;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            copydefault(false);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        RecyclerView recyclerView;
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("option_type", "")) != null) {
            str = string;
        }
        this.AYXKKw = str;
        this.gEmmrt = (RecyclerView) view.findViewById(qZH.StateListAnimator.ORmwhf);
        this.valueOf = (android.widget.LinearLayout) view.findViewById(qZH.StateListAnimator.RWIpjU);
        this.values = (android.widget.LinearLayout) view.findViewById(qZH.StateListAnimator.fGT);
        this.DbNXlk = (RecyclerView) view.findViewById(qZH.StateListAnimator.OHsvZP);
        this.AkhnZx = (android.widget.FrameLayout) view.findViewById(qZH.StateListAnimator.QVsKAR);
        android.content.Context context = getContext();
        if (context != null && (recyclerView = this.DbNXlk) != null) {
            recyclerView.setLayoutManager(C33047mpA.KWHzl(context));
        }
        android.content.Context context2 = getContext();
        if (context2 != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context2);
            RecyclerView recyclerView2 = this.gEmmrt;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(linearLayoutManager);
            }
        }
        valueOf().register(java.lang.String.class, new kFJ(null, 1, 0 == true ? 1 : 0));
        valueOf().register(kFO.class, new kFP());
        RecyclerView recyclerView3 = this.gEmmrt;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(valueOf());
        }
        if (getContext() != null) {
            djBIcL().register(kFR.class, new kFD(new Function1() { // from class: o.kHu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27903kHp.OLrzqt(this.OLrzqt, (java.lang.String) obj);
                }
            }));
            djBIcL().register(kFQ.class, new kFM(new Function0() { // from class: o.kHt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C27903kHp.OLrzqt();
                }
            }));
            RecyclerView recyclerView4 = this.DbNXlk;
            if (recyclerView4 != null) {
                recyclerView4.setAdapter(djBIcL());
            }
            AYXKKw();
        }
        gEmmrt();
    }

    public static final Unit OLrzqt(C27903kHp c27903kHp, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity activity = c27903kHp.getActivity();
        if (activity != null) {
            InterfaceC49497upf.ActionBar.openSimpleOptionPage$default((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI), activity, str, null, 4, null);
            RxBus.KWHzl("close_search");
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    private final void KWHzl(boolean z, InterfaceC54581xNr interfaceC54581xNr, java.lang.Exception exc) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new OptionChainFragment$handleTradeResult$1(z, interfaceC54581xNr, this, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.copydefault.removeCallbacksAndMessages(null);
    }

    private final void copydefault(boolean z) {
        android.widget.FrameLayout frameLayout = this.AkhnZx;
        if (frameLayout != null) {
            frameLayout.setVisibility(z ? 0 : 8);
        }
        if (z) {
            android.widget.FrameLayout frameLayout2 = this.AkhnZx;
            Intrinsics.copydefault(frameLayout2);
            java.lang.String string = getString(qZH.PendingIntent.DsL);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C6980aZc.AEQbTJ(this, frameLayout2, string, C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj), (16 & 8) != 0 ? null : getString(qZH.PendingIntent.fetchVPNInfo), (16 & 16) != 0 ? C52761wXj.TaskDescription.getSerial : 0, (16 & 32) != 0 ? null : new Function0() { // from class: o.kHw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C27903kHp.AYXKKw(this.OLrzqt);
                }
            });
            return;
        }
        android.widget.FrameLayout frameLayout3 = this.AkhnZx;
        Intrinsics.copydefault(frameLayout3);
        C6980aZc.OLrzqt(this, frameLayout3);
    }

    public static final Unit AYXKKw(C27903kHp c27903kHp) {
        C55700xor.marketEnsureOKTradeResume$default(C55629xnZ.EZpvd(c27903kHp), LifecycleOwnerKt.getLifecycleScope(c27903kHp), null, new OptionChainFragment$changeErrorState$1$1(c27903kHp), 2, null);
        c27903kHp.gEmmrt();
        android.widget.FrameLayout frameLayout = c27903kHp.AkhnZx;
        Intrinsics.copydefault(frameLayout);
        C6980aZc.OLrzqt(c27903kHp, frameLayout);
        c27903kHp.AhwBna = true;
        c27903kHp.EZpvd(true);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object EZpvd(C27903kHp c27903kHp, boolean z, InterfaceC54581xNr interfaceC54581xNr, java.lang.Exception exc, Continuation continuation) {
        c27903kHp.KWHzl(z, interfaceC54581xNr, exc);
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z) {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        if (!this.AhwBna || (view = getView()) == null || (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.QCjLjM)) == null) {
            return;
        }
        if (z) {
            pXA.KWHzl(viewGroup);
        } else {
            this.AhwBna = false;
            C57600ylV.AEQbTJ(viewGroup);
        }
    }

    public static final void valueOf(final C27903kHp c27903kHp) {
        c27903kHp.copydefault.post(new java.lang.Runnable() { // from class: o.kHE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C27903kHp.values(this.OLrzqt);
            }
        });
    }

    public static final void values(C27903kHp c27903kHp) {
        c27903kHp.releaseLoading();
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C33134mqi.AEQbTJ(th.getMessage());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        C55629xnZ.EZpvd(this).OLrzqt();
    }

    public static final /* synthetic */ java.lang.Object AEQbTJ(C27903kHp c27903kHp, boolean z, InterfaceC54581xNr interfaceC54581xNr, java.lang.Exception exc, Continuation continuation) {
        c27903kHp.KWHzl(z, interfaceC54581xNr, exc);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        if (this.KWHzl) {
            return;
        }
        C55700xor.marketEnsureOKTradeResume$default(C55629xnZ.EZpvd(this), LifecycleOwnerKt.getLifecycleScope(this), null, new OptionChainFragment$onVisible$1(this), 2, null);
    }

    public final void AYXKKw() {
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list = this.AuCTel;
        if (list != null) {
            final java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.String) ((kotlin.Pair) it.next()).getSecond());
            }
            InterfaceC58217yxC interfaceC58217yxC = this.isConnected;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            showLoading();
            AbstractC58185ywX abstractC58185ywXCopydefault = C58156yvv.EZpvd(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getIndexTickers("USD", null), this).copydefault(new InterfaceC58222yxH() { // from class: o.kHs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58222yxH
                public final void run() {
                    C27903kHp.valueOf(this.EZpvd);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
            this.isConnected = C33024moe.subscribeOnIO$default(abstractC58185ywXCopydefault, new Function1() { // from class: o.kHr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27903kHp.OLrzqt((java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.kHv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27903kHp.AEQbTJ(this.EZpvd, arrayList, (ResponseData) obj);
                }
            }, 2, (java.lang.Object) null);
        }
    }

    public static final Unit AEQbTJ(C27903kHp c27903kHp, java.util.List list, ResponseData responseData) {
        java.lang.String url;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            c27903kHp.copydefault(false);
            java.util.List list2 = (java.util.List) responseData.getData();
            if (list2 != null) {
                java.util.ArrayList<IndexTickersData> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list2) {
                    if (list.contains(((IndexTickersData) obj).getInstId())) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                for (IndexTickersData indexTickersData : arrayList) {
                    java.lang.String strCopydefault = C44585sZg.AEQbTJ(indexTickersData.getInstId()).copydefault();
                    java.util.Locale locale = java.util.Locale.getDefault();
                    java.lang.String str = "";
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String upperCase = strCopydefault.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                    TradeCoinInfo tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.AhwBna(upperCase) : null;
                    java.lang.String str2 = "$" + pTB.formatRoundToMax$default(pTB.OLrzqt((java.lang.Object) indexTickersData.getIdxPx()), 2, null, 2, null);
                    java.lang.String strCopydefault2 = C33069mpW.copydefault(c27903kHp, qZH.PendingIntent.DGUQLIDGUQLI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", upperCase)));
                    if (tradeCoinInfoAhwBna != null && (url = tradeCoinInfoAhwBna.getUrl()) != null) {
                        str = url;
                    }
                    arrayList2.add(new kFR(strCopydefault2, str, C33069mpW.copydefault(c27903kHp, qZH.PendingIntent.gGvvIC, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value1", upperCase), C56390yDp.OLrzqt("value2", str2))), indexTickersData.getInstId()));
                }
                FragmentActivity activity = c27903kHp.getActivity();
                if (activity != null) {
                    kHG.refreshDataOrEmpty$default(c27903kHp.djBIcL(), activity, arrayList2, C33070mpX.AYXKKw(qZH.PendingIntent.RdAHlO), 0.0f, 8, null);
                }
            }
        } else {
            FragmentActivity activity2 = c27903kHp.getActivity();
            if (activity2 != null) {
                kHG.refreshDataOrEmpty$default(c27903kHp.djBIcL(), activity2, new java.util.ArrayList(), C33070mpX.AYXKKw(qZH.PendingIntent.RdAHlO), 0.0f, 8, null);
            }
            C33134mqi.copydefault(qZH.PendingIntent.djSkpj);
            c27903kHp.copydefault(true);
        }
        return Unit.INSTANCE;
    }
}
