package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.DrawingDataBean;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineQuickOrderPriceBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.OkxTradePositionBean;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.ui.cr.StandardChartViewFragment$onVisible$3;
import com.okinc.kline.ui.cr.StandardChartViewFragment$showKlineEventDialog$1;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.rxutils.RxBus;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35964oKf;
import o.C36250oUv;
import o.InterfaceC35981oKw;
import o.InterfaceC39274ppH;
import o.InterfaceC39563puh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.poS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C39232poS extends AbstractC39217poD implements InterfaceC39563puh.Application, oKE {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int valueOf = 8;
    public AbstractC54531xLw AYXKKw;
    public InterfaceC58217yxC AhwBna;
    public C39295ppc AkhnZx;
    public Function1<? super TradeAllOrderApi, Unit> AuCTelauCTel;
    public Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> AubY;
    public Function0<Unit> AxsJAY;
    public boolean DbNXlk;
    public final ActivityResultLauncher<android.content.Intent> OcIXYQ;
    public boolean QKVWgx;
    public C35969oKk djBIcL;
    public Function1<? super java.lang.Boolean, Unit> ejfBZ;
    public java.lang.String fIwbmz;
    public java.lang.String fJNWhG;
    public Function0<Unit> fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public java.lang.String gHZMYf;
    public java.lang.String getFieldNames;
    public C37771pAb hDKMBd;
    public BizInstrument isConnected;
    public MarketCoinInfo iwGUEr;
    public InterfaceC39563puh.StateListAnimator sSMYrx;
    public C39285ppS uzCIH;
    public boolean values;
    public MarketCoinInfo wlaJM;
    public Function2<? super java.lang.String, ? super TradeAllOrderApi, Unit> zLjUOn;
    public Function1<? super java.lang.String, Unit> zsXlph;
    public final InterfaceC56387yDm zuBGHE;
    public java.lang.String AuCTel = "sp_timeinterval_okx_pro";
    public java.lang.String getNewProxyInstance = "pro_mode";
    public java.lang.String fARcdN = "cefi";
    public java.util.List<? extends TradeAllOrderApi> AwvSrB = new java.util.ArrayList();
    public C37928pFx DTwDnp = new C37928pFx();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.poD.AEQbTJ()V */
    @Override // o.oKE
    public boolean AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void EZpvd(@NotNull java.util.ArrayList<Triple<AbstractC36262oVg, java.lang.Boolean, KlineIndicatorBean>> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull java.util.ArrayList<OkxTradePositionBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(boolean z, boolean z2, boolean z3, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.InterfaceC39563puh.Application
    public void ODXsMY() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull DrawingDataBean drawingDataBean) {
        Intrinsics.checkNotNullParameter(drawingDataBean, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull java.util.ArrayList<PriceWarningItemBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull java.util.List<? extends TradeAllOrderApi> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (this.QKVWgx) {
            return;
        }
        this.AwvSrB = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void gEmmrt(@NotNull java.util.List<? extends TradePositionManager.PositionItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.cBPFI;
    }

    @Override // o.InterfaceC39563puh.Application
    public void gwTjWJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull KlineSpotAverageBean klineSpotAverageBean) {
        InterfaceC39563puh.Application.C0921Application.EZpvd(this, klineSpotAverageBean);
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<? extends oLY> list) {
        InterfaceC39563puh.Application.C0921Application.EZpvd(this, str, list);
    }

    @Override // o.InterfaceC39563puh.Application
    public void copydefault(@NotNull java.util.ArrayList<MarketCoinInfo> arrayList) {
        InterfaceC39563puh.Application.C0921Application.EZpvd((InterfaceC39563puh.Application) this, arrayList);
    }

    @Override // o.InterfaceC39563puh.Application
    public void valueOf() {
        InterfaceC39563puh.Application.C0921Application.EZpvd(this);
    }

    @Override // o.InterfaceC39563puh.Application
    public void valueOf(@NotNull java.util.List<? extends oLY> list) {
        InterfaceC39563puh.Application.C0921Application.EZpvd(this, list);
    }

    public C39232poS() {
        final Function0 function0 = null;
        this.zuBGHE = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37854pDd.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.cr.StandardChartViewFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.cr.StandardChartViewFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.cr.StandardChartViewFragment$special$$inlined$activityViewModels$default$3
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pGZ.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.cr.StandardChartViewFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.cr.StandardChartViewFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.cr.StandardChartViewFragment$special$$inlined$activityViewModels$default$6
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.poW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C39232poS.OLrzqt(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.OcIXYQ = activityResultLauncherRegisterForActivityResult;
    }

    private final C37854pDd AYXKKw() {
        return (C37854pDd) this.zuBGHE.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pGZ djBIcL() {
        return (pGZ) this.gEmmrt.getValue();
    }

    public static final void OLrzqt(C39232poS c39232poS, ActivityResult activityResult) {
        android.content.Intent data;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null) {
            return;
        }
        java.lang.String stringExtra = data.getStringExtra(FirebaseAnalytics.Param.PRICE);
        android.os.Parcelable parcelableExtra = data.getParcelableExtra("orderBean");
        TradeOrderData tradeOrderData = parcelableExtra instanceof TradeOrderData ? (TradeOrderData) parcelableExtra : null;
        if (tradeOrderData == null) {
            if (stringExtra != null) {
                c39232poS.gHZMYf = stringExtra;
                Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2 = c39232poS.AubY;
                if (function2 != null) {
                    function2.invoke(java.lang.Boolean.valueOf(c39232poS.DTwDnp.OLrzqt(stringExtra)), stringExtra);
                    return;
                }
                return;
            }
            pUU.copydefault(c39232poS.getTAG(), "Quick order price is null");
            return;
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            Function1<? super TradeAllOrderApi, Unit> function1 = c39232poS.AuCTelauCTel;
            if (function1 != null) {
                function1.invoke(tradeOrderData);
                return;
            }
            return;
        }
        Function2<? super java.lang.String, ? super TradeAllOrderApi, Unit> function22 = c39232poS.zLjUOn;
        if (function22 != null) {
            if (stringExtra == null) {
                stringExtra = "";
            }
            function22.invoke(stringExtra, tradeOrderData);
        }
    }

    /* JADX INFO: renamed from: o.poS$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.poS.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C39232poS copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, Function0<Unit> function0, Function1<? super java.lang.Boolean, Unit> function1, Function0<Unit> function02, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2, Function1<? super java.lang.String, Unit> function12, Function2<? super java.lang.String, ? super TradeAllOrderApi, Unit> function22, Function1<? super TradeAllOrderApi, Unit> function13, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            C39232poS c39232poS = new C39232poS();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(oLT.gEmmrt(), str);
            bundle.putString(oLT.valueOf(), str2);
            bundle.putString("kline_chart_tag", str3);
            bundle.putString("kline_chart_mode", str4);
            bundle.putString("kline_chart_from_type", str5);
            bundle.putBoolean("Kline_isSupportDragOrder", z);
            c39232poS.setArguments(bundle);
            c39232poS.AxsJAY = function0;
            c39232poS.ejfBZ = function1;
            c39232poS.fetchVPNInfo = function02;
            c39232poS.AubY = function2;
            c39232poS.zsXlph = function12;
            c39232poS.zLjUOn = function22;
            c39232poS.AuCTelauCTel = function13;
            return c39232poS;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C39295ppc c39295ppc = new C39295ppc();
        this.AkhnZx = c39295ppc;
        c39295ppc.copydefault(this);
        if (C36246oUr.copydefault().DNMMPQ()) {
            AhwBna();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        if (isAdded()) {
            android.os.Bundle arguments = getArguments();
            C39295ppc c39295ppc = null;
            this.fJNWhG = arguments != null ? arguments.getString(oLT.gEmmrt()) : null;
            android.os.Bundle arguments2 = getArguments();
            this.getFieldNames = arguments2 != null ? arguments2.getString(oLT.valueOf()) : null;
            android.os.Bundle arguments3 = getArguments();
            this.AuCTel = arguments3 != null ? arguments3.getString("kline_chart_tag") : null;
            android.os.Bundle arguments4 = getArguments();
            this.getNewProxyInstance = arguments4 != null ? arguments4.getString("kline_chart_mode") : null;
            android.os.Bundle arguments5 = getArguments();
            this.fARcdN = arguments5 != null ? arguments5.getString("kline_chart_from_type") : null;
            android.os.Bundle arguments6 = getArguments();
            this.DbNXlk = arguments6 != null && arguments6.getBoolean("Kline_isSupportDragOrder", false);
            java.lang.String str = this.fJNWhG;
            if (str != null && this.getFieldNames != null) {
                Intrinsics.copydefault((java.lang.Object) str);
                java.lang.String str2 = this.getFieldNames;
                Intrinsics.copydefault((java.lang.Object) str2);
                this.iwGUEr = new MarketCoinInfo(str, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
            }
            this.sSMYrx = new C39562pug(this, this.iwGUEr, false, false, 12, null);
            this.hDKMBd = (C37771pAb) view.findViewById(C35964oKf.StateListAnimator.svUkWZ);
            pFN pfn = pFN.OLrzqt;
            C39561puf c39561puf = C39561puf.AEQbTJ;
            java.lang.String strOLrzqt = c39561puf.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
            pfn.EZpvd(strOLrzqt, c39561puf);
            c39561puf.valueOf();
            java.lang.String str3 = this.fJNWhG;
            java.lang.String str4 = str3 == null ? "" : str3;
            java.lang.String str5 = this.getFieldNames;
            java.lang.String str6 = str5 == null ? "" : str5;
            java.lang.String str7 = this.AuCTel;
            if (str7 == null) {
                str7 = "sp_timeinterval_okx_pro";
            }
            java.lang.String str8 = str7;
            java.lang.String str9 = this.getNewProxyInstance;
            java.lang.String str10 = str9 == null ? "pro_mode" : str9;
            java.lang.String str11 = this.fARcdN;
            if (str11 == null) {
                str11 = "cefi";
            }
            C35969oKk c35969oKk = new C35969oKk(str4, str6, 0, str11, 0, false, false, false, false, false, false, false, false, false, 0, true, false, false, true, true, null, 0, null, SPUtils.getBoolean("chart_countdown", true), null, null, false, str8, str10, 0, 0, true, Intrinsics.EZpvd((java.lang.Object) this.getNewProxyInstance, (java.lang.Object) "lite_mode") || Intrinsics.EZpvd((java.lang.Object) this.getNewProxyInstance, (java.lang.Object) "pro_mode"), this.DbNXlk, 1735622644, 0, null);
            this.djBIcL = c35969oKk;
            C37771pAb c37771pAb = this.hDKMBd;
            if (c37771pAb != null) {
                c37771pAb.EZpvd(this, c35969oKk);
            }
            C37771pAb c37771pAb2 = this.hDKMBd;
            if (c37771pAb2 != null) {
                c37771pAb2.setMultiChartViewClickListener(new Application());
            }
            C37771pAb c37771pAb3 = this.hDKMBd;
            android.view.View viewDjBIcL = c37771pAb3 != null ? c37771pAb3.djBIcL() : null;
            C36250oUv c36250oUv = viewDjBIcL instanceof C36250oUv ? (C36250oUv) viewDjBIcL : null;
            if (c36250oUv != null) {
                C39295ppc c39295ppc2 = this.AkhnZx;
                if (c39295ppc2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c39295ppc = c39295ppc2;
                }
                c39295ppc.copydefault(c36250oUv);
                c36250oUv.setKlineEventClickListener(new C36250oUv.FragmentManager() { // from class: o.poP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.C36250oUv.FragmentManager
                    public final void onEventClick(oLS ols) {
                        C39232poS.OLrzqt(this.copydefault, ols);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: o.poS$Application */
    public static final class Application implements InterfaceC35981oKw {
        @Override // o.InterfaceC35981oKw
        public void EZpvd() {
        }

        @Override // o.InterfaceC35981oKw
        public void djBIcL() {
        }

        public Application() {
        }

        @Override // o.InterfaceC35981oKw
        public void copydefault(boolean z) {
            InterfaceC35981oKw.ActionBar.AEQbTJ(this, z);
        }

        @Override // o.InterfaceC35981oKw
        public void AEQbTJ() {
            Function0 function0 = C39232poS.this.AxsJAY;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // o.InterfaceC35981oKw
        public void KWHzl(boolean z) {
            Function1 function1 = C39232poS.this.ejfBZ;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.valueOf(z));
            }
        }

        @Override // o.InterfaceC35981oKw
        public void AEQbTJ(int i) {
            C37771pAb c37771pAb = C39232poS.this.hDKMBd;
            if (c37771pAb != null) {
                c37771pAb.AuCTelauCTel();
            }
            InterfaceC39563puh.StateListAnimator stateListAnimator = C39232poS.this.sSMYrx;
            if (stateListAnimator != null) {
                InterfaceC39563puh.StateListAnimator.TaskDescription.loadKline$default(stateListAnimator, C39232poS.this, i, false, false, null, 24, null);
            }
        }

        @Override // o.InterfaceC35981oKw
        public void copydefault() {
            C39232poS.this.EZpvd(false, true);
        }

        @Override // o.InterfaceC35981oKw
        public void OLrzqt() {
            C39232poS.gotoKlineFullAndLandscapeActivity$default(C39232poS.this, false, false, 2, null);
        }

        @Override // o.InterfaceC35981oKw
        public void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC39563puh.StateListAnimator stateListAnimator = C39232poS.this.sSMYrx;
            if (stateListAnimator != null) {
                C39232poS c39232poS = C39232poS.this;
                pEF pef = pEF.OLrzqt;
                C37771pAb c37771pAb = c39232poS.hDKMBd;
                InterfaceC39563puh.StateListAnimator.TaskDescription.getHistoryMarketCandles$default(stateListAnimator, c39232poS, pef.OLrzqt(c37771pAb != null ? c37771pAb.copydefault() : 60), str, oLT.djBIcL(), false, null, 48, null);
            }
        }

        @Override // o.InterfaceC35981oKw
        public void EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C39232poS.this.OLrzqt(str);
            Function2 function2 = C39232poS.this.AubY;
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.valueOf(C39232poS.this.DTwDnp.OLrzqt(str)), str);
            }
        }

        @Override // o.InterfaceC35981oKw
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            Function1 function1 = C39232poS.this.zsXlph;
            if (function1 != null) {
                function1.invoke(str);
            }
        }

        @Override // o.InterfaceC35981oKw
        public void copydefault(java.lang.String str, int i) {
            Function2 function2;
            Intrinsics.checkNotNullParameter(str, "");
            C39232poS.this.QKVWgx = false;
            C39232poS.this.copydefault(i);
            TradeAllOrderApi tradeAllOrderApi = (TradeAllOrderApi) CollectionsKt___CollectionsKt.AkhnZx(C39232poS.this.AwvSrB, i);
            if (tradeAllOrderApi == null || (function2 = C39232poS.this.zLjUOn) == null) {
                return;
            }
            function2.invoke(str, tradeAllOrderApi);
        }

        @Override // o.InterfaceC35981oKw
        public void KWHzl() {
            C39232poS.this.QKVWgx = true;
        }

        @Override // o.InterfaceC35981oKw
        public void KWHzl(int i) {
            Function1 function1;
            TradeAllOrderApi tradeAllOrderApi = (TradeAllOrderApi) CollectionsKt___CollectionsKt.AkhnZx(C39232poS.this.AwvSrB, i);
            if (tradeAllOrderApi == null || (function1 = C39232poS.this.AuCTelauCTel) == null) {
                return;
            }
            function1.invoke(tradeAllOrderApi);
        }
    }

    public static final void OLrzqt(C39232poS c39232poS, oLS ols) {
        c39232poS.AEQbTJ(ols.OLrzqt());
    }

    private final void AEQbTJ(java.util.List<? extends oLP> list) {
        if (isAdded()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StandardChartViewFragment$showKlineEventDialog$1(list, this, null), 3, null);
        }
    }

    public static /* synthetic */ void gotoKlineFullAndLandscapeActivity$default(C39232poS c39232poS, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        c39232poS.EZpvd(z, z2);
    }

    public final void EZpvd(boolean z, boolean z2) {
        FragmentActivity activity;
        MarketCoinInfo marketCoinInfo = this.iwGUEr;
        if (marketCoinInfo == null || (activity = getActivity()) == null) {
            return;
        }
        Function0<Unit> function0 = this.fetchVPNInfo;
        if (function0 != null) {
            function0.invoke();
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC39220poG.class);
        intent.putExtra("market_detail_info", marketCoinInfo);
        intent.putExtra("kline_is_full_screen", z);
        intent.putExtra("openDrawLine", z2);
        this.OcIXYQ.launch(intent);
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.AhwBna = null;
        fetchVPNInfo();
        if (Intrinsics.EZpvd(AYXKKw().KWHzl().getValue(), java.lang.Boolean.FALSE)) {
            C39285ppS c39285ppS = this.uzCIH;
            if (c39285ppS != null) {
                c39285ppS.dismiss();
            }
            this.uzCIH = null;
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("kline_portrait_full_screen", "kline_portrait_full_screen_double_click");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXAEQbTJ, this, Lifecycle.Event.ON_STOP);
        final Function1 function1 = new Function1() { // from class: o.poX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39232poS.AEQbTJ(this.EZpvd, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.poY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C39232poS.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.poV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39232poS.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        this.AhwBna = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.poU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C39232poS.copydefault(function12, obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StandardChartViewFragment$onVisible$3(this, null), 3, null);
        if (Intrinsics.EZpvd(AYXKKw().KWHzl().getValue(), java.lang.Boolean.FALSE)) {
            C37771pAb c37771pAb = this.hDKMBd;
            if (c37771pAb != null) {
                C35969oKk c35969oKk = this.djBIcL;
                if (c35969oKk == null) {
                    Intrinsics.gEmmrt("");
                    c35969oKk = null;
                }
                c37771pAb.EZpvd(this, c35969oKk);
            }
            java.lang.String str = this.gHZMYf;
            if (str != null) {
                OLrzqt(str);
                this.gHZMYf = null;
            }
        }
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C39232poS c39232poS, java.lang.String str) {
        gotoKlineFullAndLandscapeActivity$default(c39232poS, true, false, 2, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C39232poS c39232poS, java.lang.Throwable th) {
        pUU.AEQbTJ(c39232poS.getTAG(), "portrait full screen bus error", th);
        return Unit.INSTANCE;
    }

    private final void fetchVPNInfo() {
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.sSMYrx;
        if (stateListAnimator != null) {
            stateListAnimator.gEmmrt();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.okinc.kline.library.data.DataSource dataSource;
        super.onDestroy();
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.sSMYrx;
        if (stateListAnimator != null) {
            stateListAnimator.copydefault();
        }
        this.sSMYrx = null;
        C37771pAb c37771pAb = this.hDKMBd;
        android.view.View viewDjBIcL = c37771pAb != null ? c37771pAb.djBIcL() : null;
        C36250oUv c36250oUv = viewDjBIcL instanceof C36250oUv ? (C36250oUv) viewDjBIcL : null;
        if (c36250oUv == null || (dataSource = c36250oUv.ejfBZ().get(c36250oUv.fIwbmz())) == null) {
            return;
        }
        dataSource.KWHzl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(AbstractC54531xLw abstractC54531xLw) {
        C37771pAb c37771pAb;
        InterfaceC39563puh.StateListAnimator stateListAnimator;
        C37771pAb c37771pAb2;
        java.lang.String instFamily;
        java.lang.String tradeSymbol;
        MarketCoinInfo marketCoinInfo = this.iwGUEr;
        if (marketCoinInfo != null) {
            if (abstractC54531xLw != null) {
                java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
                Intrinsics.copydefault((java.lang.Object) instrumentId);
                BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
                this.isConnected = bizInstrumentValueOf;
                if (bizInstrumentValueOf != null && (instFamily = bizInstrumentValueOf.getInstFamily()) != null) {
                    this.fIwbmz = instFamily;
                    C35969oKk c35969oKk = this.djBIcL;
                    java.lang.String str = "";
                    if (c35969oKk == null) {
                        Intrinsics.gEmmrt("");
                        c35969oKk = null;
                    }
                    c35969oKk.AEQbTJ(C33129mqd.AhwBna(abstractC54531xLw.fIwbmz(instFamily)));
                    C37771pAb c37771pAb3 = this.hDKMBd;
                    if (c37771pAb3 != null) {
                        C35969oKk c35969oKk2 = this.djBIcL;
                        if (c35969oKk2 == null) {
                            Intrinsics.gEmmrt("");
                            c35969oKk2 = null;
                        }
                        c37771pAb3.setPriceFractionDigits(c35969oKk2.AEQbTJ());
                    }
                    C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
                    BizInstrument bizInstrument = this.isConnected;
                    if (bizInstrument != null && (tradeSymbol = bizInstrument.getTradeSymbol()) != null) {
                        str = tradeSymbol;
                    }
                    c36246oUrCopydefault.uzCIH(str);
                }
            }
            if (gEmmrt() && (c37771pAb2 = this.hDKMBd) != null) {
                c37771pAb2.AuCTelauCTel();
            }
            InterfaceC39563puh.StateListAnimator stateListAnimator2 = this.sSMYrx;
            if (stateListAnimator2 != null) {
                stateListAnimator2.AEQbTJ(abstractC54531xLw);
            }
            InterfaceC39563puh.StateListAnimator stateListAnimator3 = this.sSMYrx;
            if (stateListAnimator3 != null) {
                MarketCoinInfo marketCoinInfo2 = this.iwGUEr;
                Intrinsics.copydefault(marketCoinInfo2);
                stateListAnimator3.AEQbTJ(marketCoinInfo2);
            }
            MarketCoinInfo marketCoinInfo3 = this.iwGUEr;
            Intrinsics.copydefault(marketCoinInfo3);
            if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo3.getInstrumentType(), (java.lang.Object) "OPTION")) {
                InterfaceC39563puh.StateListAnimator stateListAnimator4 = this.sSMYrx;
                if (stateListAnimator4 != null) {
                    stateListAnimator4.KWHzl("TYPE_MARK_PRICE_KLINE");
                }
            } else {
                InterfaceC39563puh.StateListAnimator stateListAnimator5 = this.sSMYrx;
                if (stateListAnimator5 != null) {
                    stateListAnimator5.KWHzl("TYPE_KLINE");
                }
            }
            if (Intrinsics.EZpvd(AYXKKw().KWHzl().getValue(), java.lang.Boolean.FALSE)) {
                C37771pAb c37771pAb4 = this.hDKMBd;
                android.view.View viewDjBIcL = c37771pAb4 != null ? c37771pAb4.djBIcL() : null;
                C36250oUv c36250oUv = viewDjBIcL instanceof C36250oUv ? (C36250oUv) viewDjBIcL : null;
                if (c36250oUv != null) {
                    c36250oUv.AYXKKw();
                }
            }
            C37771pAb c37771pAb5 = this.hDKMBd;
            if (c37771pAb5 != null) {
                if (c37771pAb5.copydefault() == -2) {
                    c37771pAb5.EZpvd(true);
                } else {
                    c37771pAb5.AEQbTJ(false);
                    c37771pAb5.OLrzqt(false);
                    c37771pAb5.hDKMBd();
                }
            }
            InterfaceC39563puh.StateListAnimator stateListAnimator6 = this.sSMYrx;
            if (stateListAnimator6 != null) {
                C37771pAb c37771pAb6 = this.hDKMBd;
                int iCopydefault = c37771pAb6 != null ? c37771pAb6.copydefault() : 60;
                C37771pAb c37771pAb7 = this.hDKMBd;
                InterfaceC39563puh.StateListAnimator.TaskDescription.loadKline$default(stateListAnimator6, this, iCopydefault, !(c37771pAb7 != null && c37771pAb7.copydefault() == -2), false, new Function1() { // from class: o.poT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39232poS.AEQbTJ(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
                    }
                }, 8, null);
            }
            if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && ((c37771pAb = this.hDKMBd) == null || c37771pAb.copydefault() != -2)) {
                MarketCoinInfo marketCoinInfo4 = this.iwGUEr;
                if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo4 != null ? marketCoinInfo4.getInstrumentType() : null), (java.lang.Object) oLT.DbNXlk()) && (stateListAnimator = this.sSMYrx) != null) {
                    InterfaceC39563puh.StateListAnimator.TaskDescription.loadOpenOrder$default(stateListAnimator, this, false, 2, null);
                }
                C37771pAb c37771pAb8 = this.hDKMBd;
                if (c37771pAb8 != null) {
                    c37771pAb8.AYXKKw();
                }
            }
            this.wlaJM = this.iwGUEr;
        }
    }

    public static final Unit AEQbTJ(C39232poS c39232poS, boolean z) {
        C37771pAb c37771pAb;
        if (z && ((c37771pAb = c39232poS.hDKMBd) == null || c37771pAb.copydefault() != -2)) {
            C37771pAb c37771pAb2 = c39232poS.hDKMBd;
            android.view.View viewDjBIcL = c37771pAb2 != null ? c37771pAb2.djBIcL() : null;
            C36250oUv c36250oUv = viewDjBIcL instanceof C36250oUv ? (C36250oUv) viewDjBIcL : null;
            if (c36250oUv != null) {
                C39295ppc c39295ppc = c39232poS.AkhnZx;
                if (c39295ppc == null) {
                    Intrinsics.gEmmrt("");
                    c39295ppc = null;
                }
                java.lang.String str = c39232poS.fJNWhG;
                InterfaceC39274ppH.ActionBar.getDrawingData$default(c39295ppc, c36250oUv, str == null ? "" : str, c39232poS, false, 8, null);
            }
        }
        return Unit.INSTANCE;
    }

    private final boolean gEmmrt() {
        return !Intrinsics.EZpvd(this.iwGUEr, this.wlaJM);
    }

    @Override // o.InterfaceC39563puh.Application
    public void AhwBna(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C37771pAb c37771pAb = this.hDKMBd;
        android.view.View viewDjBIcL = c37771pAb != null ? c37771pAb.djBIcL() : null;
        C36250oUv c36250oUv = viewDjBIcL instanceof C36250oUv ? (C36250oUv) viewDjBIcL : null;
        if (c36250oUv != null) {
            c36250oUv.KWHzl(list);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x00df */
    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.okinc.kline.data.KlineOpenOrderBean] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.Unit] */
    @Override // o.InterfaceC39563puh.Application
    public void EZpvd(@NotNull java.util.List<KlineOpenOrderBean> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        if (this.QKVWgx) {
            return;
        }
        C37771pAb c37771pAb = this.hDKMBd;
        android.view.View viewDjBIcL = c37771pAb != null ? c37771pAb.djBIcL() : null;
        C36250oUv c36250oUv = viewDjBIcL instanceof C36250oUv ? (C36250oUv) viewDjBIcL : null;
        if (c36250oUv != null) {
            if (list.isEmpty()) {
                c36250oUv.setOpenOrderDataList(list);
            } else {
                java.util.List<KlineOpenOrderBean> listHDKMBd = c36250oUv.hDKMBd();
                if (listHDKMBd != null && listHDKMBd.isEmpty()) {
                    c36250oUv.setOpenOrderDataList(list);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ?? r4 = (KlineOpenOrderBean) it.next();
                        java.util.List<KlineOpenOrderBean> listHDKMBd2 = c36250oUv.hDKMBd();
                        if (listHDKMBd2 != null) {
                            java.util.Iterator it2 = listHDKMBd2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                KlineOpenOrderBean klineOpenOrderBean = (KlineOpenOrderBean) next;
                                if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdId(), (java.lang.Object) r4.getOrdId()) && Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) r4.getOrdType()) && Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getAmount(), (java.lang.Object) r4.getAmount()) && Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getPrice(), (java.lang.Object) r4.getPrice())) {
                                    break;
                                }
                            }
                            KlineOpenOrderBean klineOpenOrderBean2 = (KlineOpenOrderBean) next;
                            if (klineOpenOrderBean2 != null) {
                                r4.setLongClick(klineOpenOrderBean2.getLongClick());
                                r4.setSelected(klineOpenOrderBean2.getSelected());
                                r4.setShowSolid(klineOpenOrderBean2.getShowSolid());
                                r4.setLineColor(klineOpenOrderBean2.getLineColor());
                                r4.setCostPrice(klineOpenOrderBean2.getCostPrice());
                                r4.setCostLiq(klineOpenOrderBean2.getCostLiq());
                                r4.setCostBE(klineOpenOrderBean2.getCostBE());
                                r4 = Unit.INSTANCE;
                            }
                        }
                        arrayList.add(r4);
                    }
                    c36250oUv.setOpenOrderDataList(list);
                }
            }
            c36250oUv.invalidate();
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull java.util.ArrayList<HistoryOrderData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C37771pAb c37771pAb = this.hDKMBd;
        android.view.View viewDjBIcL = c37771pAb != null ? c37771pAb.djBIcL() : null;
        C36250oUv c36250oUv = viewDjBIcL instanceof C36250oUv ? (C36250oUv) viewDjBIcL : null;
        if (c36250oUv != null) {
            c36250oUv.copydefault(arrayList);
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void copydefault(@NotNull java.util.List<? extends oLY> list) {
        C37771pAb c37771pAb;
        C37771pAb c37771pAb2;
        Intrinsics.checkNotNullParameter(list, "");
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && (c37771pAb2 = this.hDKMBd) != null) {
            int iCopydefault = c37771pAb2.copydefault();
            InterfaceC39563puh.StateListAnimator stateListAnimator = this.sSMYrx;
            if (stateListAnimator != null) {
                pEF pef = pEF.OLrzqt;
                stateListAnimator.KWHzl(this, pef.copydefault(iCopydefault), pef.KWHzl(), C33129mqd.gEmmrt(java.lang.Long.valueOf(((oLY) CollectionsKt___CollectionsKt.AubY(list)).EZpvd)), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
            }
        }
        if (!(!list.isEmpty()) || (c37771pAb = this.hDKMBd) == null) {
            return;
        }
        c37771pAb.OLrzqt(C33129mqd.gEmmrt(java.lang.Long.valueOf(((oLY) CollectionsKt___CollectionsKt.AubY(list)).EZpvd)));
    }

    @Override // o.InterfaceC39563puh.Application
    public void RKDWNf() {
        C37771pAb c37771pAb = this.hDKMBd;
        if (c37771pAb != null) {
            c37771pAb.zsXlph();
        }
    }

    private final void AhwBna() {
        djBIcL().EZpvd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(java.lang.String str) {
        C37771pAb c37771pAb = this.hDKMBd;
        android.view.View viewDjBIcL = c37771pAb != null ? c37771pAb.djBIcL() : null;
        C36250oUv c36250oUv = viewDjBIcL instanceof C36250oUv ? (C36250oUv) viewDjBIcL : null;
        if (c36250oUv != null) {
            c36250oUv.setQuickOrderPrice(new KlineQuickOrderPriceBean(str, null, 2, null));
            c36250oUv.invalidate();
        }
    }

    public final void copydefault(int i) {
        this.DTwDnp.copydefault();
        this.DTwDnp.KWHzl(i);
        this.DTwDnp.copydefault(i);
    }

    @Override // o.InterfaceC39563puh.Application
    public void AYXKKw(@NotNull java.util.List<? extends oLY> list) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            oLY oly = (oLY) it.next();
            arrayList.add(new C35965oKg(oly.getNewProxyInstance, oly.uzCIH, oly.EZpvd, oly.valueOf, oly.copydefault, oly.OLrzqt, oly.KWHzl, oly.djBIcL, oly.AhwBna, oly.gEmmrt, oly.getFieldNames));
            it = it;
            str = str;
        }
        java.lang.String str2 = str;
        C37771pAb c37771pAb = this.hDKMBd;
        if (c37771pAb != null) {
            c37771pAb.AEQbTJ(arrayList);
        }
        C37771pAb c37771pAb2 = this.hDKMBd;
        android.view.View viewDjBIcL = c37771pAb2 != null ? c37771pAb2.djBIcL() : null;
        Intrinsics.copydefault(viewDjBIcL, str2);
        ((C36250oUv) viewDjBIcL).setShowEmptyUi(false);
        C37771pAb c37771pAb3 = this.hDKMBd;
        if (c37771pAb3 != null) {
            c37771pAb3.gEmmrt();
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
