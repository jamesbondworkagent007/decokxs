package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.LottieAnimationView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.IBotOrdersDataBean;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.DrawingDataBean;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.LineDataBean;
import com.okinc.kline.data.LineFibDataBean;
import com.okinc.kline.data.OkxTradePositionBean;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.bot.KlineBotViewModel;
import com.okinc.kline.ui.trade.TradeHeaderKlineFragment$setBotOrdersData$1;
import com.okinc.kline.ui.trade.TradeHeaderKlineFragment$startRefresh$1;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Objects;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.DebugKt;
import o.C35964oKf;
import o.C36250oUv;
import o.C39339pqT;
import o.InterfaceC35972oKn;
import o.InterfaceC39274ppH;
import o.InterfaceC39563puh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pwq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39678pwq extends AbstractC32998moE implements InterfaceC35972oKn, InterfaceC39563puh.Application {
    public boolean AkhnZx;
    public android.widget.LinearLayout AuCTel;
    public InterfaceC39563puh.StateListAnimator AuCTelauCTel;
    public C39816pzV AubY;
    public C36312oXc AwvSrB;
    public C39295ppc DbNXlk;
    public AbstractC54531xLw OLrzqt;
    public TemplateSetting ORxRYg;
    public C56132xwz QKVWgx;
    public android.widget.HorizontalScrollView QOLQEE;
    public android.widget.TextView RJOkX;
    public ChartViewOutSideConfig copydefault;
    public boolean djBIcL;
    public BizInstrument ejfBZ;
    public BizInstrument fARcdN;
    public android.widget.LinearLayout fJNWhG;
    public android.widget.ImageView fetchVPNInfo;
    public boolean gEmmrt;
    public ConstraintLayout gHZMYf;
    public java.lang.String getFieldNames;
    public final InterfaceC56387yDm getNewProxyInstance;
    public C36250oUv hDKMBd;
    public C37963pHe isConnected;
    public java.lang.String iwGUEr;
    public C55173xeu sSMYrx;
    public java.lang.String uzCIH;
    public android.widget.ImageView values;
    public boolean wlaJM;
    public MarketCoinInfo zsXlph;
    public LottieAnimationView zuBGHE;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final int EZpvd = 2;
    public boolean valueOf = true;
    public java.util.ArrayList<DrawLineData.DrawLineItem> AhwBna = new java.util.ArrayList<>();
    public java.util.ArrayList<LineDataBean> DTwDnp = new java.util.ArrayList<>();
    public java.util.ArrayList<LineFibDataBean> OcIXYQ = new java.util.ArrayList<>();
    public boolean AYXKKw = true;
    public final java.lang.String KWHzl = "chart_axis";
    public final InterfaceC56387yDm AxsJAY = C56392yDr.copydefault(new Function0() { // from class: o.pwE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39678pwq.AEQbTJ();
        }
    });
    public final InterfaceC56387yDm QUSxYX = C56392yDr.copydefault(new Function0() { // from class: o.pwF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39678pwq.copydefault();
        }
    });
    public Observer<ParamBuilder> fIwbmz = new Observer() { // from class: o.pwD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            C39678pwq.AEQbTJ(this.copydefault, (ParamBuilder) obj);
        }
    };
    public java.lang.String zLjUOn = "TYPE_MARK_PRICE_KLINE";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull java.util.ArrayList<HistoryOrderData> arrayList) {
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
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull C56132xwz c56132xwz) {
        Intrinsics.checkNotNullParameter(c56132xwz, "");
        this.QKVWgx = c56132xwz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void copydefault(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void gEmmrt(@NotNull java.util.List<? extends TradePositionManager.PositionItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.DAIeex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    public C39678pwq() {
        final Function0 function0 = null;
        this.getNewProxyInstance = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(KlineBotViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.trade.TradeHeaderKlineFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.trade.TradeHeaderKlineFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.trade.TradeHeaderKlineFragment$special$$inlined$activityViewModels$default$3
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

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<? extends oLY> list) {
        InterfaceC39563puh.Application.C0921Application.EZpvd(this, str, list);
    }

    @Override // o.InterfaceC35972oKn
    public void OLrzqt() {
        InterfaceC35972oKn.TaskDescription.EZpvd(this);
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

    public final C56132xwz AYXKKw() {
        C56132xwz c56132xwz = this.QKVWgx;
        if (c56132xwz != null) {
            return c56132xwz;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KlineBotViewModel fJNWhG() {
        return (KlineBotViewModel) this.getNewProxyInstance.getValue();
    }

    private final xLY ejfBZ() {
        return (xLY) this.AxsJAY.getValue();
    }

    public static final xLY AEQbTJ() {
        return new xLY(BizInfoConfig.DefaultBizConfig.copydefault);
    }

    public static final oRS copydefault() {
        return new oRS();
    }

    private final oRS fARcdN() {
        return (oRS) this.QUSxYX.getValue();
    }

    public static final void AEQbTJ(C39678pwq c39678pwq, ParamBuilder paramBuilder) {
        BizInstrument bizInstrumentEZpvd = c39678pwq.ejfBZ;
        if (bizInstrumentEZpvd == null) {
            bizInstrumentEZpvd = c39678pwq.ejfBZ().EZpvd();
        }
        java.lang.String instId = bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getInstId() : null;
        BizInstrument bizInstrument = c39678pwq.fARcdN;
        if (Intrinsics.EZpvd((java.lang.Object) instId, (java.lang.Object) (bizInstrument != null ? bizInstrument.getInstId() : null))) {
            java.lang.String instType = bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getInstType() : null;
            BizInstrument bizInstrument2 = c39678pwq.fARcdN;
            if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null))) {
                return;
            }
        }
        android.view.View view = c39678pwq.getView();
        if (view != null) {
            startLoadData$default(c39678pwq, view, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: o.pwq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pwq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C39678pwq newInstance$default(Application application, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return application.AEQbTJ(z, z2);
        }

        public final C39678pwq AEQbTJ(boolean z, boolean z2) {
            C39678pwq c39678pwq = new C39678pwq();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("kline_is_hide_text", z);
            bundle.putBoolean("kline_is_show_hide_feature", z2);
            c39678pwq.setArguments(bundle);
            return c39678pwq;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C39295ppc c39295ppc = new C39295ppc();
        this.DbNXlk = c39295ppc;
        c39295ppc.copydefault(this);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C56132xwz c56132xwz;
        C37963pHe c37963pHe;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        InterfaceC54577xNn interfaceC54577xNn;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        Intrinsics.checkNotNullParameter(view, "");
        if (isAdded()) {
            android.os.Bundle arguments = getArguments();
            this.gEmmrt = arguments != null ? arguments.getBoolean("kline_is_hide_text") : false;
            android.os.Bundle arguments2 = getArguments();
            this.valueOf = arguments2 != null ? arguments2.getBoolean("kline_is_show_hide_feature") : false;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                ViewModelProvider.Factory defaultViewModelProviderFactory = requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                c56132xwz = (C56132xwz) new ViewModelProvider(activity, defaultViewModelProviderFactory).get(C56132xwz.class);
            } else {
                c56132xwz = null;
            }
            Intrinsics.copydefault(c56132xwz);
            OLrzqt(c56132xwz);
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
                c37963pHe = (C37963pHe) new ViewModelProvider(activity2, defaultViewModelProviderFactory2).get(C37963pHe.class);
            } else {
                c37963pHe = null;
            }
            this.isConnected = c37963pHe;
            oWN.KWHzl(C57676yms.AEQbTJ(getContext()));
            this.AuCTel = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.dYepVG);
            this.sSMYrx = (C55173xeu) view.findViewById(C35964oKf.StateListAnimator.sWlOSi);
            this.gHZMYf = (ConstraintLayout) view.findViewById(C35964oKf.StateListAnimator.cancel);
            this.zuBGHE = (LottieAnimationView) view.findViewById(C35964oKf.StateListAnimator.DcMfJKDSqxTE);
            this.hDKMBd = (C36250oUv) view.findViewById(C35964oKf.StateListAnimator.RsCxkX);
            this.RJOkX = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.newHeartRating);
            this.values = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.Dfm);
            this.fJNWhG = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.gwwzsY);
            this.QOLQEE = (android.widget.HorizontalScrollView) view.findViewById(C35964oKf.StateListAnimator.getActiveNotifications);
            this.AubY = (C39816pzV) view.findViewById(C35964oKf.StateListAnimator.SFHvfSaKzXkR);
            this.fetchVPNInfo = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.resume);
            C39816pzV c39816pzV = this.AubY;
            if (c39816pzV != null) {
                c39816pzV.AEQbTJ();
                Unit unit = Unit.INSTANCE;
            }
            pEX pex = pEX.OLrzqt;
            this.copydefault = new ChartViewOutSideConfig(false, false, false, false, false, false, false, null, null, null, pex.OLrzqt(), pex.AEQbTJ(), false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -3073, -1, -1, Integer.MAX_VALUE, null);
            C36250oUv c36250oUv = this.hDKMBd;
            if (c36250oUv != null) {
                C39295ppc c39295ppc = this.DbNXlk;
                if (c39295ppc == null) {
                    Intrinsics.gEmmrt("");
                    c39295ppc = null;
                }
                c39295ppc.copydefault(c36250oUv);
                Unit unit2 = Unit.INSTANCE;
            }
            ChartViewOutSideConfig chartViewOutSideConfig = this.copydefault;
            if (chartViewOutSideConfig == null) {
                Intrinsics.gEmmrt("");
                chartViewOutSideConfig = null;
            }
            pFP pfp = pFP.OLrzqt;
            chartViewOutSideConfig.setSimulateLine(pFP.isUserInDemoTrading$default(pfp, null, 1, null));
            ChartViewOutSideConfig chartViewOutSideConfig2 = this.copydefault;
            if (chartViewOutSideConfig2 == null) {
                Intrinsics.gEmmrt("");
                chartViewOutSideConfig2 = null;
            }
            chartViewOutSideConfig2.setUtc8(pfp.AEQbTJ());
            ChartViewOutSideConfig chartViewOutSideConfig3 = this.copydefault;
            if (chartViewOutSideConfig3 == null) {
                Intrinsics.gEmmrt("");
                chartViewOutSideConfig3 = null;
            }
            chartViewOutSideConfig3.setChartTag("sp_timeinterval_okx_pro");
            ChartViewOutSideConfig chartViewOutSideConfig4 = this.copydefault;
            if (chartViewOutSideConfig4 == null) {
                Intrinsics.gEmmrt("");
                chartViewOutSideConfig4 = null;
            }
            chartViewOutSideConfig4.setMode("pro_mode");
            ChartViewOutSideConfig chartViewOutSideConfig5 = this.copydefault;
            if (chartViewOutSideConfig5 == null) {
                Intrinsics.gEmmrt("");
                chartViewOutSideConfig5 = null;
            }
            chartViewOutSideConfig5.setChartMode(this.EZpvd);
            pFN pfn = pFN.OLrzqt;
            C37830pCg c37830pCg = C37830pCg.EZpvd;
            java.lang.String strCopydefault = c37830pCg.copydefault();
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
            pfn.EZpvd(strCopydefault, c37830pCg);
            c37830pCg.valueOf();
            C36250oUv c36250oUv2 = this.hDKMBd;
            if (c36250oUv2 != null) {
                ChartViewOutSideConfig chartViewOutSideConfig6 = this.copydefault;
                if (chartViewOutSideConfig6 == null) {
                    Intrinsics.gEmmrt("");
                    chartViewOutSideConfig6 = null;
                }
                c36250oUv2.OLrzqt(chartViewOutSideConfig6);
                Unit unit3 = Unit.INSTANCE;
            }
            C36250oUv c36250oUv3 = this.hDKMBd;
            if (c36250oUv3 != null && (mapEjfBZ = c36250oUv3.ejfBZ()) != null) {
                C36250oUv c36250oUv4 = this.hDKMBd;
                com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get(c36250oUv4 != null ? c36250oUv4.fIwbmz() : null);
                if (dataSource != null) {
                    dataSource.KWHzl();
                    Unit unit4 = Unit.INSTANCE;
                }
            }
            C56111xwe<ParamBuilder> c56111xweValues = AYXKKw().values();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            c56111xweValues.observe(viewLifecycleOwner, this.fIwbmz);
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn.EZpvd()) {
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.AEQbTJ("app_demo_trading_chart_view", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pwJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39678pwq.AEQbTJ(this.copydefault, (EventParamsList) obj);
                    }
                });
            }
            java.lang.Integer num = SPUtils.getInt("chart_coordinate_model", 0);
            if (num != null && num.intValue() == 0) {
                C36250oUv c36250oUv5 = this.hDKMBd;
                if (c36250oUv5 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv5.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx2.setMOrdinateType(0);
                    Unit unit5 = Unit.INSTANCE;
                }
            } else {
                C36250oUv c36250oUv6 = this.hDKMBd;
                if (c36250oUv6 != null && (chartViewOutSideConfigAkhnZx = c36250oUv6.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx.setMOrdinateType(1);
                    Unit unit6 = Unit.INSTANCE;
                }
            }
            android.widget.HorizontalScrollView horizontalScrollView = this.QOLQEE;
            if (horizontalScrollView != null) {
                horizontalScrollView.post(new java.lang.Runnable() { // from class: o.pwN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C39678pwq.AYXKKw(this.KWHzl);
                    }
                });
            }
            C39816pzV c39816pzV2 = this.AubY;
            if (c39816pzV2 != null) {
                c39816pzV2.setOnItemSelectListener(new Function1() { // from class: o.pwo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39678pwq.copydefault(this.KWHzl, ((java.lang.Integer) obj).intValue());
                    }
                });
                Unit unit7 = Unit.INSTANCE;
            }
            C55173xeu c55173xeu = this.sSMYrx;
            if (c55173xeu != null) {
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.pwr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C39678pwq.copydefault(this.EZpvd, view2);
                    }
                });
                Unit unit8 = Unit.INSTANCE;
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xOD.class, new java.lang.String[0]);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
            final Function1 function1 = new Function1() { // from class: o.pwt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39678pwq.AEQbTJ(this.KWHzl, (xOD) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pwv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C39678pwq.OLrzqt(function1, obj);
                }
            });
            AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("hide_drawing_line");
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
            final Function1 function12 = new Function1() { // from class: o.pwu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39678pwq.OLrzqt((java.lang.String) obj);
                }
            };
            abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pws
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C39678pwq.EZpvd(function12, obj);
                }
            });
            AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("up_down_time_changed");
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
            AbstractC58185ywX abstractC58185ywXEZpvd3 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ2, this);
            final Function1 function13 = new Function1() { // from class: o.pwx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39678pwq.OLrzqt(this.copydefault, (java.lang.String) obj);
                }
            };
            abstractC58185ywXEZpvd3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pwy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C39678pwq.gEmmrt(function13, obj);
                }
            });
            C56126xwt<Unit> c56126xwtFJNWhG = AYXKKw().fJNWhG();
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            c56126xwtFJNWhG.AEQbTJ(viewLifecycleOwner2, new Function1() { // from class: o.pwK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39678pwq.EZpvd(this.KWHzl, (Unit) obj);
                }
            });
            InterfaceC49504upm interfaceC49504upm = (InterfaceC49504upm) C43251rlk.OLrzqt(InterfaceC49504upm.class);
            if (interfaceC49504upm != null && interfaceC49504upm.KWHzl()) {
                TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                C32866mlf.AEQbTJ("PlaceOrder_Top_HalfKLine_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pwH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39678pwq.KWHzl((EventParamsList) obj);
                    }
                });
            } else {
                TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
                C32866mlf.AEQbTJ("PlaceOrder_Top_HalfKLine_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pwG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39678pwq.gEmmrt((EventParamsList) obj);
                    }
                });
            }
            C36250oUv c36250oUv7 = this.hDKMBd;
            if (c36250oUv7 != null) {
                c36250oUv7.setChartSelectionListener(new ActionBar());
                Unit unit9 = Unit.INSTANCE;
            }
            C36250oUv c36250oUv8 = this.hDKMBd;
            if (c36250oUv8 != null) {
                c36250oUv8.setLoadHistoryKlineListener(new C36250oUv.PendingIntent() { // from class: o.pwM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.C36250oUv.PendingIntent
                    public final void AEQbTJ() {
                        C39678pwq.AhwBna(this.EZpvd);
                    }
                });
                Unit unit10 = Unit.INSTANCE;
            }
        }
    }

    public static final Unit AEQbTJ(C39678pwq c39678pwq, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", c39678pwq.fIwbmz(), false);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(C39678pwq c39678pwq) {
        if (c39678pwq.gEmmrt()) {
            android.widget.ImageView imageView = c39678pwq.fetchVPNInfo;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        android.widget.ImageView imageView2 = c39678pwq.fetchVPNInfo;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    public static final Unit copydefault(C39678pwq c39678pwq, int i) {
        c39678pwq.EZpvd(i);
        return Unit.INSTANCE;
    }

    public static final void copydefault(C39678pwq c39678pwq, android.view.View view) {
        if (c39678pwq.zsXlph != null) {
            android.widget.LinearLayout linearLayout = c39678pwq.AuCTel;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            c39678pwq.iwGUEr();
            c39678pwq.onVisible();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C39678pwq c39678pwq, xOD xod) {
        if (!xod.EZpvd()) {
            c39678pwq.uzCIH();
            RxBus.AEQbTJ(new C49418uoF(""));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.String str) {
        C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C35964oKf.Fragment.RSmiaq), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C39678pwq c39678pwq, java.lang.String str) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv = c39678pwq.hDKMBd;
        if (c36250oUv != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setUtc8(pFP.OLrzqt.AEQbTJ());
        }
        ChartViewOutSideConfig chartViewOutSideConfig = c39678pwq.copydefault;
        if (chartViewOutSideConfig == null) {
            Intrinsics.gEmmrt("");
            chartViewOutSideConfig = null;
        }
        chartViewOutSideConfig.setUtc8(pFP.OLrzqt.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C39678pwq c39678pwq, Unit unit) {
        TemplateSetting templateSettingWlaJM;
        android.widget.LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(unit, "");
        C36250oUv c36250oUv = c39678pwq.hDKMBd;
        if (c36250oUv != null && (templateSettingWlaJM = c36250oUv.wlaJM()) != null) {
            c39678pwq.getFieldNames();
            C36250oUv c36250oUv2 = c39678pwq.hDKMBd;
            if (c36250oUv2 != null) {
                MarketCoinInfo marketCoinInfo = c39678pwq.zsXlph;
                java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
                MarketCoinInfo marketCoinInfo2 = c39678pwq.zsXlph;
                java.lang.String instrumentType = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null;
                c36250oUv2.setCurrentDataSource(instrumentId + instrumentType + JwtUtilsKt.JWT_DELIMITER + templateSettingWlaJM.getSPTimeInterval());
            }
            c39678pwq.iwGUEr();
            android.widget.LinearLayout linearLayout2 = c39678pwq.AuCTel;
            if (linearLayout2 != null && linearLayout2.getVisibility() == 0 && (linearLayout = c39678pwq.AuCTel) != null) {
                linearLayout.setVisibility(8);
            }
            InterfaceC39563puh.StateListAnimator stateListAnimator = c39678pwq.AuCTelauCTel;
            if (stateListAnimator != null) {
                InterfaceC39563puh.StateListAnimator.TaskDescription.loadKline$default(stateListAnimator, c39678pwq, templateSettingWlaJM.getSPTimeInterval(), true, false, null, 24, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("display_status", DebugKt.DEBUG_PROPERTY_VALUE_ON, true);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("display_status", DebugKt.DEBUG_PROPERTY_VALUE_OFF, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pwq$ActionBar */
    public static final class ActionBar implements C36250oUv.ActionBar {
        public ActionBar() {
        }

        @Override // o.C36250oUv.ActionBar
        public void EZpvd(java.lang.String str) {
            C37963pHe c37963pHe;
            if (str == null || (c37963pHe = C39678pwq.this.isConnected) == null) {
                return;
            }
            c37963pHe.KWHzl(str);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.xks.startVibratorIfCan$default(long, int, java.lang.Object):void */
        @Override // o.C36250oUv.ActionBar
        public void aI_() {
            C55489xks.startVibratorIfCan$default(0L, 1, null);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.puh.StateListAnimator.TaskDescription.getHistoryMarketCandles$default(o.puh$StateListAnimator, androidx.lifecycle.LifecycleOwner, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public static final void AhwBna(C39678pwq c39678pwq) {
        C36250oUv c36250oUv = c39678pwq.hDKMBd;
        TemplateSetting templateSettingWlaJM = c36250oUv != null ? c36250oUv.wlaJM() : null;
        c39678pwq.ORxRYg = templateSettingWlaJM;
        if (templateSettingWlaJM != null) {
            int sPTimeInterval = templateSettingWlaJM.getSPTimeInterval();
            C36250oUv c36250oUv2 = c39678pwq.hDKMBd;
            C33129mqd.gEmmrt(c36250oUv2 != null ? java.lang.Long.valueOf(c36250oUv2.fARcdN()) : null);
            InterfaceC39563puh.StateListAnimator stateListAnimator = c39678pwq.AuCTelauCTel;
            if (stateListAnimator != null) {
                java.lang.String strOLrzqt = pEF.OLrzqt.OLrzqt(sPTimeInterval);
                C36250oUv c36250oUv3 = c39678pwq.hDKMBd;
                InterfaceC39563puh.StateListAnimator.TaskDescription.getHistoryMarketCandles$default(stateListAnimator, c39678pwq, strOLrzqt, C33129mqd.gEmmrt(c36250oUv3 != null ? java.lang.Long.valueOf(c36250oUv3.fARcdN()) : null), oLT.djBIcL(), false, null, 48, null);
            }
        }
    }

    private final void EZpvd(final int i) {
        final TimeIntervalItem timeIntervalItem;
        if (i == 4) {
            hDKMBd();
            C37908pFd.EZpvd(false);
            return;
        }
        C36250oUv c36250oUv = this.hDKMBd;
        if (c36250oUv == null || (timeIntervalItem = (TimeIntervalItem) CollectionsKt___CollectionsKt.AkhnZx(C37830pCg.EZpvd.KWHzl(), i)) == null) {
            return;
        }
        KWHzl(c36250oUv, timeIntervalItem);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pwn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39678pwq.OLrzqt(timeIntervalItem, i, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(TimeIntervalItem timeIntervalItem, int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("timeframe_type", Intrinsics.EZpvd((java.lang.Object) timeIntervalItem.getTradingType(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) ? "line" : C37830pCg.EZpvd.AEQbTJ().get(i).getTradingType(), true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pqT.TaskDescription.newInstance$default(o.pqT$TaskDescription, boolean, boolean, int, java.lang.Object):o.pqT */
    private final void hDKMBd() {
        C39339pqT c39339pqTNewInstance$default = C39339pqT.TaskDescription.newInstance$default(C39339pqT.Companion, false, false, 3, null);
        c39339pqTNewInstance$default.OLrzqt(new Function1() { // from class: o.pwz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39678pwq.KWHzl(this.KWHzl, (MarketTypeSelect) obj);
            }
        });
        c39339pqTNewInstance$default.show(getChildFragmentManager(), C39678pwq.class.getSimpleName());
        c39339pqTNewInstance$default.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.pwA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C39678pwq.KWHzl(this.AEQbTJ, dialogInterface);
            }
        });
    }

    public static final Unit KWHzl(C39678pwq c39678pwq, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        C36250oUv c36250oUv = c39678pwq.hDKMBd;
        if (c36250oUv != null) {
            java.lang.Object data = marketTypeSelect.getData();
            Intrinsics.copydefault(data, "");
            c39678pwq.KWHzl(c36250oUv, (TimeIntervalItem) data);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C39678pwq c39678pwq, android.content.DialogInterface dialogInterface) {
        C39816pzV c39816pzV = c39678pwq.AubY;
        if (c39816pzV != null) {
            c39816pzV.setData();
        }
    }

    public static /* synthetic */ void startLoadData$default(C39678pwq c39678pwq, android.view.View view, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        c39678pwq.copydefault(view, bool);
    }

    public final void copydefault(android.view.View view, java.lang.Boolean bool) {
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        BizInstrument bizInstrumentEZpvd = ejfBZ().EZpvd();
        this.getFieldNames = bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getInstId() : null;
        this.uzCIH = bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getInstType() : null;
        this.fARcdN = bizInstrumentEZpvd;
        C36250oUv c36250oUv = this.hDKMBd;
        if (c36250oUv != null && (mapEjfBZ = c36250oUv.ejfBZ()) != null) {
            C36250oUv c36250oUv2 = this.hDKMBd;
            com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get(c36250oUv2 != null ? c36250oUv2.fIwbmz() : null);
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        uzCIH();
        OLrzqt(view);
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            iwGUEr();
        }
        zLjUOn();
    }

    public final void OLrzqt(android.view.View view) {
        java.lang.String str = this.getFieldNames;
        if (str != null && this.uzCIH != null) {
            Intrinsics.copydefault((java.lang.Object) str);
            java.lang.String str2 = this.uzCIH;
            Intrinsics.copydefault((java.lang.Object) str2);
            this.zsXlph = new MarketCoinInfo(str, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
        }
        if (this.AuCTelauCTel == null) {
            this.AuCTelauCTel = new C39562pug(this, this.zsXlph, false, false, 12, null);
        }
        if (this.zsXlph != null) {
            KWHzl(view);
        }
        C39816pzV c39816pzV = this.AubY;
        if (c39816pzV != null) {
            c39816pzV.setData();
        }
    }

    private final void DbNXlk() {
        if (this.wlaJM) {
            return;
        }
        C36246oUr.copydefault().AubY(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.String fIwbmz() {
        MarketCoinInfo marketCoinInfo = this.zsXlph;
        java.lang.String instrumentType = marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null;
        if (instrumentType != null) {
            switch (instrumentType.hashCode()) {
                case -2027980370:
                    if (instrumentType.equals("MARGIN")) {
                        return "bb";
                    }
                    break;
                case -1956807563:
                    if (instrumentType.equals("OPTION")) {
                        return "options";
                    }
                    break;
                case 2552066:
                    if (!instrumentType.equals("SPOT")) {
                    }
                    break;
                case 2558355:
                    if (instrumentType.equals("SWAP")) {
                        return "swap";
                    }
                    break;
                case 214415088:
                    if (instrumentType.equals("FUTURES")) {
                        return "futures";
                    }
                    break;
            }
        }
        return "";
    }

    public final void KWHzl(android.view.View view) {
        AuCTel();
        android.widget.LinearLayout linearLayout = this.fJNWhG;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.pww
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C39678pwq.KWHzl(this.EZpvd, view2);
                }
            });
        }
    }

    public static final void KWHzl(C39678pwq c39678pwq, android.view.View view) {
        c39678pwq.uzCIH();
        RxBus.AEQbTJ(new C49418uoF(""));
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("PlaceOrder_Top_HalfKLine_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pwB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39678pwq.OLrzqt((EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("click_type", "timeframe_off", true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AuCTel() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        java.util.HashMap<java.lang.String, oWN> mapZLjUOn;
        oWN own;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        java.util.HashMap<java.lang.String, java.lang.Integer> chartStyles;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx4;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx5;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx6;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx7;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx8;
        boolean z;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx9;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx10;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx11;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx12;
        this.AwvSrB = C36312oXc.AEQbTJ((C36250oUv) null);
        C36250oUv c36250oUv = this.hDKMBd;
        if (c36250oUv != null && (chartViewOutSideConfigAkhnZx12 = c36250oUv.AkhnZx()) != null) {
            android.content.Context context = getContext();
            java.lang.Integer numValueOf = context != null ? java.lang.Integer.valueOf(C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null)) : null;
            Intrinsics.copydefault(numValueOf);
            chartViewOutSideConfigAkhnZx12.setMPositiveColor(numValueOf.intValue());
        }
        C36250oUv c36250oUv2 = this.hDKMBd;
        if (c36250oUv2 != null && (chartViewOutSideConfigAkhnZx11 = c36250oUv2.AkhnZx()) != null) {
            android.content.Context context2 = getContext();
            java.lang.Integer numValueOf2 = context2 != null ? java.lang.Integer.valueOf(C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context2, 0.0f, 2, null)) : null;
            Intrinsics.copydefault(numValueOf2);
            chartViewOutSideConfigAkhnZx11.setMNegativeColor(numValueOf2.intValue());
        }
        C36250oUv c36250oUv3 = this.hDKMBd;
        if (c36250oUv3 != null && (chartViewOutSideConfigAkhnZx10 = c36250oUv3.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx10.setMChartOffsetInit(false);
        }
        C36250oUv c36250oUv4 = this.hDKMBd;
        if (c36250oUv4 != null && (chartViewOutSideConfigAkhnZx9 = c36250oUv4.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx9.initKlineOffset(0.0f);
        }
        C36250oUv c36250oUv5 = this.hDKMBd;
        if (c36250oUv5 != null) {
            MarketCoinInfo marketCoinInfo = this.zsXlph;
            if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (java.lang.Object) "FUTURES")) {
                z = true;
                c36250oUv5.setFutures(z);
            } else {
                MarketCoinInfo marketCoinInfo2 = this.zsXlph;
                if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null), (java.lang.Object) "SWAP")) {
                    MarketCoinInfo marketCoinInfo3 = this.zsXlph;
                    if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentType() : null), (java.lang.Object) "OPTION")) {
                        z = false;
                    }
                    c36250oUv5.setFutures(z);
                }
            }
        }
        C36250oUv c36250oUv6 = this.hDKMBd;
        TemplateSetting templateSettingWlaJM = c36250oUv6 != null ? c36250oUv6.wlaJM() : null;
        Intrinsics.copydefault(templateSettingWlaJM);
        this.ORxRYg = templateSettingWlaJM;
        C36250oUv c36250oUv7 = this.hDKMBd;
        if (c36250oUv7 != null) {
            MarketCoinInfo marketCoinInfo4 = this.zsXlph;
            java.lang.String instrumentId = marketCoinInfo4 != null ? marketCoinInfo4.getInstrumentId() : null;
            MarketCoinInfo marketCoinInfo5 = this.zsXlph;
            java.lang.String instrumentType = marketCoinInfo5 != null ? marketCoinInfo5.getInstrumentType() : null;
            TemplateSetting templateSetting = this.ORxRYg;
            c36250oUv7.setCurrentDataSource(instrumentId + instrumentType + JwtUtilsKt.JWT_DELIMITER + (templateSetting != null ? java.lang.Integer.valueOf(templateSetting.getSPTimeInterval()) : null));
        }
        java.lang.Integer num = SPUtils.getInt("chart_coordinate_model", 0);
        if (num != null && num.intValue() == 0) {
            C36250oUv c36250oUv8 = this.hDKMBd;
            if (c36250oUv8 != null && (chartViewOutSideConfigAkhnZx8 = c36250oUv8.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx8.setMOrdinateType(0);
            }
        } else {
            C36250oUv c36250oUv9 = this.hDKMBd;
            if (c36250oUv9 != null && (chartViewOutSideConfigAkhnZx = c36250oUv9.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMOrdinateType(1);
            }
        }
        C36250oUv c36250oUv10 = this.hDKMBd;
        if (c36250oUv10 != null && (chartViewOutSideConfigAkhnZx7 = c36250oUv10.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx7.setMShowAxis(SPUtils.getBoolean(this.KWHzl, true));
        }
        C36250oUv c36250oUv11 = this.hDKMBd;
        if (c36250oUv11 != null && (chartViewOutSideConfigAkhnZx6 = c36250oUv11.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx6.setMCandlestickType(SPUtils.getInt("chart_model", 0).intValue());
        }
        C36250oUv c36250oUv12 = this.hDKMBd;
        if (c36250oUv12 != null && (chartViewOutSideConfigAkhnZx5 = c36250oUv12.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx5.setMChartPosition(SPUtils.getInt("chart_position", 1).intValue());
        }
        C36250oUv c36250oUv13 = this.hDKMBd;
        if (c36250oUv13 != null) {
            c36250oUv13.setDrawUpdateListener(new C36250oUv.Application() { // from class: o.pwm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.Application
                public final void copydefault(AbstractC36302oWt abstractC36302oWt) {
                    C39678pwq.KWHzl(this.KWHzl, abstractC36302oWt);
                }
            });
        }
        C36250oUv c36250oUv14 = this.hDKMBd;
        if (c36250oUv14 != null && (chartViewOutSideConfigAkhnZx4 = c36250oUv14.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx4.setMKlineAbstractType(1);
        }
        C36250oUv c36250oUv15 = this.hDKMBd;
        if (c36250oUv15 != null && (chartViewOutSideConfigAkhnZx3 = c36250oUv15.AkhnZx()) != null && (chartStyles = chartViewOutSideConfigAkhnZx3.getChartStyles()) != null) {
            chartStyles.clear();
        }
        TemplateSetting templateSetting2 = this.ORxRYg;
        if (templateSetting2 != null) {
            if (templateSetting2.getSPTimeInterval() < 0) {
                C36250oUv c36250oUv16 = this.hDKMBd;
                if (c36250oUv16 != null) {
                    c36250oUv16.setChartStyle(1);
                    return;
                }
                return;
            }
            int timelineScale = templateSetting2.getTimelineScale();
            int i = oWN.AEQbTJ;
            if (timelineScale >= i) {
                C36250oUv c36250oUv17 = this.hDKMBd;
                if (c36250oUv17 != null) {
                    c36250oUv17.setChartStyle(0);
                    return;
                }
                return;
            }
            C36250oUv c36250oUv18 = this.hDKMBd;
            if (c36250oUv18 == null || (chartViewOutSideConfigAkhnZx2 = c36250oUv18.AkhnZx()) == null || !chartViewOutSideConfigAkhnZx2.isColumnChart()) {
                C36250oUv c36250oUv19 = this.hDKMBd;
                if (c36250oUv19 != null) {
                    c36250oUv19.setChartStyle(2);
                    return;
                }
                return;
            }
            C36250oUv c36250oUv20 = this.hDKMBd;
            if (c36250oUv20 != null && (mapZLjUOn = c36250oUv20.zLjUOn()) != null && (own = mapZLjUOn.get("ds0")) != null) {
                own.OLrzqt(i);
            }
            C36250oUv c36250oUv21 = this.hDKMBd;
            if (c36250oUv21 != null) {
                c36250oUv21.setChartStyle(0);
            }
        }
    }

    public static final void KWHzl(C39678pwq c39678pwq, AbstractC36302oWt abstractC36302oWt) {
        java.lang.Object objM7377constructorimpl;
        if (abstractC36302oWt instanceof C36295oWm) {
            C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
            java.util.ArrayList<java.lang.String> mainIndicatorNames = c36246oUrCopydefault.KWHzl("ds0").getMainIndicatorNames();
            if (mainIndicatorNames == null || !mainIndicatorNames.contains("SR")) {
                return;
            }
            try {
                Result.Application application = Result.Companion;
                oRS orsFARcdN = c39678pwq.fARcdN();
                Unit unit = Unit.INSTANCE;
                c36246oUrCopydefault.AEQbTJ((oLZ) orsFARcdN.EZpvd(unit));
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault(c39678pwq.getTAG(), "calculateSupportResistanceLine fail cause by: " + thM7380exceptionOrNullimpl);
            }
            Result.m7376boximpl(objM7377constructorimpl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void values() {
        int iAhwBna;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        TradeCoinInfo tradeCoinInfoAhwBna;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        xOW newProxyInstance;
        ValuationCurrencyData valuationCurrencyDataAEQbTJ;
        MarketCoinInfo marketCoinInfo = this.zsXlph;
        if (!Intrinsics.EZpvd((java.lang.Object) "INDEX", (java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null))) {
            AbstractC54531xLw abstractC54531xLw = this.OLrzqt;
            if (abstractC54531xLw != null) {
                MarketCoinInfo marketCoinInfo2 = this.zsXlph;
                instrumentId = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null;
                Intrinsics.copydefault((java.lang.Object) instrumentId);
                BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
                if (bizInstrumentValueOf != null) {
                    java.lang.String instFamily = bizInstrumentValueOf.getInstFamily();
                    C36250oUv c36250oUv = this.hDKMBd;
                    if (c36250oUv != null) {
                        c36250oUv.setPriceFractionDigits(C33129mqd.AhwBna(abstractC54531xLw.fIwbmz(instFamily)));
                    }
                    C36250oUv c36250oUv2 = this.hDKMBd;
                    if (c36250oUv2 != null) {
                        c36250oUv2.setCoinVol(C33129mqd.AhwBna(abstractC54531xLw.gEmmrt(bizInstrumentValueOf)));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        MarketCoinInfo marketCoinInfo3 = this.zsXlph;
        java.lang.String strAEQbTJ = TaskDescription.AEQbTJ(marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentId() : null).AEQbTJ();
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strAEQbTJ.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        int iHashCode = upperCase.hashCode();
        if (iHashCode != 66097) {
            if (iHashCode != 84326) {
                if (iHashCode == 2614190 && upperCase.equals("USDT")) {
                    InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                    if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(upperCase)) != null) {
                        instrumentId = tradeCoinInfoAhwBna.getSizeDig();
                    }
                    iAhwBna = C33129mqd.AhwBna(instrumentId);
                }
            } else if (upperCase.equals("USD")) {
                InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                if (interfaceC49425uoM2 != null && (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) != null && (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null && (valuationCurrencyDataAEQbTJ = newProxyInstance.AEQbTJ("USD")) != null) {
                    instrumentId = valuationCurrencyDataAEQbTJ.getPrecision();
                }
                iAhwBna = C33129mqd.AhwBna(instrumentId);
            }
            iAhwBna = 2;
        } else if (!upperCase.equals("BTC")) {
            iAhwBna = 2;
        }
        C36250oUv c36250oUv3 = this.hDKMBd;
        if (c36250oUv3 != null) {
            c36250oUv3.setPriceFractionDigits(iAhwBna);
        }
    }

    private final void KWHzl(C36250oUv c36250oUv, TimeIntervalItem timeIntervalItem) {
        android.widget.LinearLayout linearLayout;
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        this.ORxRYg = templateSettingWlaJM;
        if (templateSettingWlaJM == null || templateSettingWlaJM.getSPTimeInterval() == timeIntervalItem.timeInterval) {
            return;
        }
        c36250oUv.RcXXUw();
        getFieldNames();
        TemplateSetting templateSetting = this.ORxRYg;
        if (templateSetting != null) {
            templateSetting.putTimeInterval(timeIntervalItem.timeInterval);
        }
        MarketCoinInfo marketCoinInfo = this.zsXlph;
        java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
        MarketCoinInfo marketCoinInfo2 = this.zsXlph;
        java.lang.String instrumentType = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null;
        c36250oUv.setCurrentDataSource(instrumentId + instrumentType + JwtUtilsKt.JWT_DELIMITER + templateSettingWlaJM.getSPTimeInterval());
        if (templateSettingWlaJM.getSPTimeInterval() < 0) {
            c36250oUv.setChartStyle(1);
        } else if (templateSettingWlaJM.getTimelineScale() < oWN.AEQbTJ) {
            c36250oUv.setChartStyle(2);
        } else {
            c36250oUv.setChartStyle(0);
        }
        C36250oUv c36250oUv2 = this.hDKMBd;
        if (c36250oUv2 != null) {
            c36250oUv2.sSMYrx();
        }
        iwGUEr();
        android.widget.LinearLayout linearLayout2 = this.AuCTel;
        if (linearLayout2 != null && linearLayout2.getVisibility() == 0 && (linearLayout = this.AuCTel) != null) {
            linearLayout.setVisibility(8);
        }
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.AuCTelauCTel;
        if (stateListAnimator != null) {
            InterfaceC39563puh.StateListAnimator.TaskDescription.loadKline$default(stateListAnimator, this, templateSettingWlaJM.getSPTimeInterval(), true, false, null, 24, null);
        }
    }

    private final void getFieldNames() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx4;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx5;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx6;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx7;
        C36250oUv c36250oUv = this.hDKMBd;
        if (c36250oUv != null && (chartViewOutSideConfigAkhnZx7 = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx7.setCurrentMode("NORMAL");
        }
        C36250oUv c36250oUv2 = this.hDKMBd;
        if (c36250oUv2 != null && (chartViewOutSideConfigAkhnZx6 = c36250oUv2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx6.setAutoYScaleClick(false);
        }
        C36250oUv c36250oUv3 = this.hDKMBd;
        if (c36250oUv3 != null && (mapEjfBZ = c36250oUv3.ejfBZ()) != null) {
            C36250oUv c36250oUv4 = this.hDKMBd;
            com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get(c36250oUv4 != null ? c36250oUv4.fIwbmz() : null);
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        C36250oUv c36250oUv5 = this.hDKMBd;
        if (c36250oUv5 != null && (chartViewOutSideConfigAkhnZx5 = c36250oUv5.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx5.setMChartOffsetInit(false);
        }
        C36250oUv c36250oUv6 = this.hDKMBd;
        if (c36250oUv6 != null) {
            c36250oUv6.QfsBiF();
        }
        C36312oXc c36312oXc = this.AwvSrB;
        if (c36312oXc != null) {
            if ((c36312oXc != null ? c36312oXc.zLjUOn : null) != null && c36312oXc != null) {
                c36312oXc.EZpvd(c36312oXc != null ? c36312oXc.zLjUOn : null);
            }
        }
        C36250oUv c36250oUv7 = this.hDKMBd;
        float mKlineInitOffset = 0.0f;
        if (c36250oUv7 != null && (chartViewOutSideConfigAkhnZx3 = c36250oUv7.AkhnZx()) != null) {
            C36250oUv c36250oUv8 = this.hDKMBd;
            chartViewOutSideConfigAkhnZx3.setMKlineCurrentOffset((c36250oUv8 == null || (chartViewOutSideConfigAkhnZx4 = c36250oUv8.AkhnZx()) == null) ? 0.0f : chartViewOutSideConfigAkhnZx4.getMKlineInitOffset());
        }
        C36250oUv c36250oUv9 = this.hDKMBd;
        if (c36250oUv9 == null || (chartViewOutSideConfigAkhnZx = c36250oUv9.AkhnZx()) == null) {
            return;
        }
        C36250oUv c36250oUv10 = this.hDKMBd;
        if (c36250oUv10 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv10.AkhnZx()) != null) {
            mKlineInitOffset = chartViewOutSideConfigAkhnZx2.getMKlineInitOffset();
        }
        chartViewOutSideConfigAkhnZx.setMKlineLastOffset(mKlineInitOffset);
    }

    @Override // o.InterfaceC39563puh.Application
    public void gwTjWJ() {
        android.widget.LinearLayout linearLayout = this.AuCTel;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        AkhnZx();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.InterfaceC39563puh.Application
    public void RKDWNf() {
        C36250oUv c36250oUv = this.hDKMBd;
        if (c36250oUv != null) {
            c36250oUv.setShowEmptyUi(true);
        }
    }

    public static /* synthetic */ void uploadDrawingData$default(C39678pwq c39678pwq, java.util.ArrayList arrayList, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c39678pwq.EZpvd((java.util.ArrayList<DrawLineData.DrawLineItem>) arrayList, z, z2);
    }

    private final void EZpvd(java.util.ArrayList<DrawLineData.DrawLineItem> arrayList, boolean z, boolean z2) {
        java.lang.String json;
        InterfaceC39563puh.StateListAnimator stateListAnimator;
        java.lang.String indexId;
        JsonObject jsonObject = new JsonObject();
        java.util.Iterator<T> it = arrayList.iterator();
        int i = 0;
        while (true) {
            json = "";
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) next;
            LineDataBean lineDataBean = new LineDataBean(null, null, null, null, 0, null, null, 0, null, FrameMetricsAggregator.EVERY_DURATION, null);
            LineFibDataBean lineFibDataBean = new LineFibDataBean(null, null, null, null, 0, null, null, 0, null, FrameMetricsAggregator.EVERY_DURATION, null);
            if (drawLineItem.getIndexId().length() == 0) {
                indexId = C37897pEt.KWHzl.copydefault(java.lang.System.currentTimeMillis() + ((long) i));
            } else {
                indexId = drawLineItem.getIndexId();
            }
            getTAG();
            Objects.toString(indexId);
            if (!z && !drawLineItem.isDelete()) {
                if (drawLineItem.getLineType() == DrawLineData.LineType.FIBONACCI) {
                    lineFibDataBean.setId(indexId);
                    C37895pEr c37895pEr = C37895pEr.copydefault;
                    lineFibDataBean.setType(c37895pEr.OLrzqt(drawLineItem.getLineType()));
                    java.lang.String str = this.getFieldNames;
                    lineFibDataBean.setState(c37895pEr.KWHzl(drawLineItem, str != null ? str : "", true));
                    lineFibDataBean.setPoints(c37895pEr.OLrzqt(drawLineItem));
                    c37895pEr.EZpvd(lineFibDataBean, drawLineItem);
                    json = new Gson().toJson(lineFibDataBean);
                    if (C33129mqd.KWHzl((java.util.Collection) this.AhwBna)) {
                        this.OcIXYQ.add(lineFibDataBean);
                    }
                } else {
                    lineDataBean.setId(indexId);
                    C37895pEr c37895pEr2 = C37895pEr.copydefault;
                    lineDataBean.setType(c37895pEr2.OLrzqt(drawLineItem.getLineType()));
                    java.lang.String str2 = this.getFieldNames;
                    lineDataBean.setState(c37895pEr2.EZpvd(drawLineItem, str2 != null ? str2 : "", true));
                    lineDataBean.setPoints(c37895pEr2.OLrzqt(drawLineItem));
                    json = new Gson().toJson(lineDataBean);
                    if (C33129mqd.KWHzl((java.util.Collection) this.AhwBna)) {
                        this.DTwDnp.add(lineDataBean);
                    }
                }
            }
            jsonObject.addProperty(indexId, json);
            i++;
        }
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true) && (stateListAnimator = this.AuCTelauCTel) != null) {
            java.lang.String str3 = this.getFieldNames;
            stateListAnimator.AEQbTJ(this, str3 == null ? "" : str3, jsonObject, z, z2);
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull java.util.ArrayList<OkxTradePositionBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        MarketCoinInfo marketCoinInfo = this.zsXlph;
        if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (java.lang.Object) "SPOT")) {
            return;
        }
        C36250oUv c36250oUv = this.hDKMBd;
        if (c36250oUv != null) {
            c36250oUv.setTradePositionDataList(arrayList);
        }
        C36250oUv c36250oUv2 = this.hDKMBd;
        if (c36250oUv2 != null) {
            c36250oUv2.invalidate();
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull KlineSpotAverageBean klineSpotAverageBean) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
        C36250oUv c36250oUv = this.hDKMBd;
        if (c36250oUv == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null) {
            return;
        }
        chartViewOutSideConfigAkhnZx.setKlineSpotAverageBean(klineSpotAverageBean);
    }

    @Override // o.InterfaceC39563puh.Application
    public void EZpvd(@NotNull java.util.List<KlineOpenOrderBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C36250oUv c36250oUv = this.hDKMBd;
        if (c36250oUv != null) {
            c36250oUv.setOpenOrderDataList(list);
        }
        C36250oUv c36250oUv2 = this.hDKMBd;
        if (c36250oUv2 != null) {
            c36250oUv2.invalidate();
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void AYXKKw(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (isResumed()) {
            AkhnZx();
            C36250oUv c36250oUv = this.hDKMBd;
            if (c36250oUv != null) {
                c36250oUv.AEQbTJ(list);
            }
            C36250oUv c36250oUv2 = this.hDKMBd;
            if (c36250oUv2 != null) {
                c36250oUv2.setShowEmptyUi(false);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        uzCIH();
    }

    @Override // o.InterfaceC39563puh.Application
    public void AhwBna(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C36250oUv c36250oUv = this.hDKMBd;
        if (c36250oUv != null) {
            c36250oUv.KWHzl(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        MarketCoinInfo marketCoinInfo;
        java.lang.String instrumentId;
        BizInstrument bizInstrumentValueOf;
        AbstractC54531xLw abstractC54531xLw = this.OLrzqt;
        if (abstractC54531xLw != null && (marketCoinInfo = this.zsXlph) != null && (instrumentId = marketCoinInfo.getInstrumentId()) != null && (bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId)) != null) {
            this.iwGUEr = bizInstrumentValueOf.getInstFamily();
            C36246oUr.copydefault(pDX.KWHzl());
            C36246oUr.copydefault().AkhnZx(C33129mqd.gEmmrt(bizInstrumentValueOf.getTradeSymbol()));
            C36246oUr.copydefault().getFieldNames(C33129mqd.gEmmrt(bizInstrumentValueOf.getQuoteSymbol()));
        }
        KWHzl(this.OLrzqt);
    }

    private final void KWHzl(AbstractC54531xLw abstractC54531xLw) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        KlineSpotAverageBean klineSpotAverageBean;
        InterfaceC39563puh.StateListAnimator stateListAnimator;
        android.widget.LinearLayout linearLayout;
        if (this.zsXlph != null) {
            values();
            C36250oUv c36250oUv = this.hDKMBd;
            TemplateSetting templateSettingWlaJM = c36250oUv != null ? c36250oUv.wlaJM() : null;
            Intrinsics.copydefault(templateSettingWlaJM);
            this.ORxRYg = templateSettingWlaJM;
            getNewProxyInstance();
            InterfaceC39563puh.StateListAnimator stateListAnimator2 = this.AuCTelauCTel;
            if (stateListAnimator2 != null) {
                stateListAnimator2.AEQbTJ(abstractC54531xLw);
            }
            InterfaceC39563puh.StateListAnimator stateListAnimator3 = this.AuCTelauCTel;
            if (stateListAnimator3 != null) {
                MarketCoinInfo marketCoinInfo = this.zsXlph;
                Intrinsics.copydefault(marketCoinInfo);
                stateListAnimator3.AEQbTJ(marketCoinInfo);
            }
            MarketCoinInfo marketCoinInfo2 = this.zsXlph;
            Intrinsics.copydefault(marketCoinInfo2);
            if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo2.getInstrumentType(), (java.lang.Object) "OPTION")) {
                InterfaceC39563puh.StateListAnimator stateListAnimator4 = this.AuCTelauCTel;
                if (stateListAnimator4 != null) {
                    stateListAnimator4.KWHzl("TYPE_MARK_PRICE_KLINE");
                }
            } else {
                InterfaceC39563puh.StateListAnimator stateListAnimator5 = this.AuCTelauCTel;
                if (stateListAnimator5 != null) {
                    stateListAnimator5.KWHzl("TYPE_KLINE");
                }
            }
            C36250oUv c36250oUv2 = this.hDKMBd;
            if (c36250oUv2 != null) {
                c36250oUv2.gHZMYf();
            }
            C36250oUv c36250oUv3 = this.hDKMBd;
            if (c36250oUv3 != null) {
                c36250oUv3.sSMYrx();
            }
            C36246oUr.copydefault().KWHzl();
            C36246oUr.copydefault().gEmmrt();
            android.widget.LinearLayout linearLayout2 = this.AuCTel;
            if (linearLayout2 != null && linearLayout2.getVisibility() == 0 && (linearLayout = this.AuCTel) != null) {
                linearLayout.setVisibility(8);
            }
            TemplateSetting templateSetting = this.ORxRYg;
            if (templateSetting != null && (stateListAnimator = this.AuCTelauCTel) != null) {
                InterfaceC39563puh.StateListAnimator.TaskDescription.loadKline$default(stateListAnimator, this, templateSetting.getSPTimeInterval(), true, false, new C39638pwC(this), 8, null);
            }
            if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null)) {
                MarketCoinInfo marketCoinInfo3 = this.zsXlph;
                if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentType() : null), (java.lang.Object) oLT.DbNXlk())) {
                    InterfaceC39563puh.StateListAnimator stateListAnimator6 = this.AuCTelauCTel;
                    if (stateListAnimator6 != null) {
                        stateListAnimator6.copydefault(this, false);
                    }
                    InterfaceC39563puh.StateListAnimator stateListAnimator7 = this.AuCTelauCTel;
                    if (stateListAnimator7 != null) {
                        stateListAnimator7.OLrzqt(this, false);
                    }
                }
                if (Intrinsics.EZpvd((java.lang.Object) this.uzCIH, (java.lang.Object) oLT.fetchVPNInfo()) && C36246oUr.copydefault().DBxZfM()) {
                    java.lang.String str = this.getFieldNames;
                    if (str != null) {
                        int iAEQbTJ = C37925pFu.KWHzl.AEQbTJ(this.uzCIH, this.iwGUEr);
                        InterfaceC39563puh.StateListAnimator stateListAnimator8 = this.AuCTelauCTel;
                        if (stateListAnimator8 != null) {
                            java.lang.String str2 = this.uzCIH;
                            Intrinsics.copydefault((java.lang.Object) str2);
                            stateListAnimator8.EZpvd((LifecycleOwner) this, str2, str, iAEQbTJ, false);
                        }
                    }
                } else {
                    C36250oUv c36250oUv4 = this.hDKMBd;
                    if (c36250oUv4 != null && (chartViewOutSideConfigAkhnZx = c36250oUv4.AkhnZx()) != null && (klineSpotAverageBean = chartViewOutSideConfigAkhnZx.getKlineSpotAverageBean()) != null) {
                        klineSpotAverageBean.setShowSpotAverageLine(false);
                    }
                }
                java.lang.String string = SPUtils.getString("kline_indicator_version", "0");
                InterfaceC39563puh.StateListAnimator stateListAnimator9 = this.AuCTelauCTel;
                if (stateListAnimator9 != null) {
                    Intrinsics.copydefault((java.lang.Object) string);
                    stateListAnimator9.copydefault(this, "ALL", string);
                }
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ppH.ActionBar.getDrawingData$default(o.ppH, o.oUv, java.lang.String, androidx.lifecycle.LifecycleOwner, boolean, int, java.lang.Object):void */
    public static final Unit AEQbTJ(C39678pwq c39678pwq, boolean z) {
        C36250oUv c36250oUv;
        if (z && (c36250oUv = c39678pwq.hDKMBd) != null) {
            C39295ppc c39295ppc = c39678pwq.DbNXlk;
            if (c39295ppc == null) {
                Intrinsics.gEmmrt("");
                c39295ppc = null;
            }
            C39295ppc c39295ppc2 = c39295ppc;
            MarketCoinInfo marketCoinInfo = c39678pwq.zsXlph;
            Intrinsics.copydefault(marketCoinInfo);
            InterfaceC39274ppH.ActionBar.getDrawingData$default(c39295ppc2, c36250oUv, marketCoinInfo.getInstrumentId(), c39678pwq, false, 8, null);
        }
        return Unit.INSTANCE;
    }

    private final void getNewProxyInstance() {
        MarketCoinInfo marketCoinInfo = this.zsXlph;
        if (marketCoinInfo != null) {
            oUJ.KWHzl.OLrzqt(marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType());
        }
    }

    private final void zLjUOn() {
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.AuCTelauCTel;
        if (stateListAnimator != null) {
            stateListAnimator.AYXKKw();
        }
        this.AwvSrB = C36312oXc.AEQbTJ((C36250oUv) null);
        MarketCoinInfo marketCoinInfo = this.zsXlph;
        if (marketCoinInfo != null) {
            if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (java.lang.Object) "INDEX")) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TradeHeaderKlineFragment$startRefresh$1(this, null), 3, null);
            } else {
                KWHzl((AbstractC54531xLw) null);
            }
            getFieldNames();
            fetchVPNInfo();
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("app_kline_page_view", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pwI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39678pwq.copydefault(this.AEQbTJ, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(C39678pwq c39678pwq, EventParamsList eventParamsList) {
        java.lang.String instrumentType;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        MarketCoinInfo marketCoinInfo = c39678pwq.zsXlph;
        if (marketCoinInfo == null || (instrumentType = marketCoinInfo.getInstrumentType()) == null) {
            instrumentType = "-";
        }
        eventParamsList.put("biztype", instrumentType, true);
        return Unit.INSTANCE;
    }

    private final void EZpvd(boolean z) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv = this.hDKMBd;
        if (c36250oUv != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setHideTradeDrawingLine(z);
        }
        C36250oUv c36250oUv2 = this.hDKMBd;
        if (c36250oUv2 != null) {
            c36250oUv2.invalidate();
        }
    }

    public final void fetchVPNInfo() {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2 = this.hDKMBd;
        if (c36250oUv2 != null) {
            c36250oUv2.gHZMYf();
        }
        C36250oUv c36250oUv3 = this.hDKMBd;
        if (c36250oUv3 != null) {
            c36250oUv3.sSMYrx();
        }
        int iEZpvd = C33492mxV.EZpvd();
        AppCompatDelegate.setDefaultNightMode(iEZpvd);
        if (iEZpvd != -1) {
            if (iEZpvd == 1) {
                C36250oUv c36250oUv4 = this.hDKMBd;
                if (c36250oUv4 != null) {
                    c36250oUv4.djBIcL("light");
                }
            } else if (iEZpvd == 2 && (c36250oUv = this.hDKMBd) != null) {
                c36250oUv.djBIcL("dark");
            }
        } else if (C33492mxV.OLrzqt()) {
            C36250oUv c36250oUv5 = this.hDKMBd;
            if (c36250oUv5 != null) {
                c36250oUv5.djBIcL("dark");
            }
        } else {
            C36250oUv c36250oUv6 = this.hDKMBd;
            if (c36250oUv6 != null) {
                c36250oUv6.djBIcL("light");
            }
        }
        EZpvd(false);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx4;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx5;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx6;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx7;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx8;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx9;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx10;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx11;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx12;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx13;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx14;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx15;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx16;
        TemplateSetting templateSettingWlaJM;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx17;
        TemplateSetting templateSettingWlaJM2;
        C36250oUv c36250oUv = this.hDKMBd;
        if (c36250oUv != null && (templateSettingWlaJM = c36250oUv.wlaJM()) != null && templateSettingWlaJM.getSPTimeInterval() == -2) {
            C36250oUv c36250oUv2 = this.hDKMBd;
            if (c36250oUv2 != null && (templateSettingWlaJM2 = c36250oUv2.wlaJM()) != null) {
                templateSettingWlaJM2.putTimeInterval(1440);
            }
            C36250oUv c36250oUv3 = this.hDKMBd;
            if (c36250oUv3 != null && (chartViewOutSideConfigAkhnZx17 = c36250oUv3.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx17.setCeFiMCapMode(false);
            }
            C36250oUv c36250oUv4 = this.hDKMBd;
            if (c36250oUv4 != null) {
                c36250oUv4.setChartStyle(0);
            }
        }
        C36250oUv c36250oUv5 = this.hDKMBd;
        if (!Intrinsics.EZpvd((java.lang.Object) ((c36250oUv5 == null || (chartViewOutSideConfigAkhnZx16 = c36250oUv5.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx16.getChartTag()), (java.lang.Object) "sp_timeinterval_okx_pro")) {
            pFS pfs = pFS.KWHzl;
            MarketCoinInfo marketCoinInfo = this.zsXlph;
            java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
            MarketCoinInfo marketCoinInfo2 = this.zsXlph;
            java.lang.String instrumentType = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null;
            TemplateSetting templateSetting = this.ORxRYg;
            pfs.KWHzl("ds0", instrumentId + instrumentType + JwtUtilsKt.JWT_DELIMITER + (templateSetting != null ? java.lang.Integer.valueOf(templateSetting.getSPTimeInterval()) : null));
            pFN pfn = pFN.OLrzqt;
            C37830pCg c37830pCg = C37830pCg.EZpvd;
            java.lang.String strCopydefault = c37830pCg.copydefault();
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
            pfn.EZpvd(strCopydefault, c37830pCg);
        }
        C36250oUv c36250oUv6 = this.hDKMBd;
        if (c36250oUv6 == null || (chartViewOutSideConfigAkhnZx15 = c36250oUv6.AkhnZx()) == null || chartViewOutSideConfigAkhnZx15.getChartMode() != this.EZpvd) {
            ChartViewOutSideConfig chartViewOutSideConfig = this.copydefault;
            if (chartViewOutSideConfig == null) {
                Intrinsics.gEmmrt("");
                chartViewOutSideConfig = null;
            }
            chartViewOutSideConfig.getTemplateSettings().clear();
            C36250oUv c36250oUv7 = this.hDKMBd;
            if (c36250oUv7 != null) {
                ChartViewOutSideConfig chartViewOutSideConfig2 = this.copydefault;
                if (chartViewOutSideConfig2 == null) {
                    Intrinsics.gEmmrt("");
                    chartViewOutSideConfig2 = null;
                }
                c36250oUv7.OLrzqt(chartViewOutSideConfig2);
            }
        }
        C36250oUv c36250oUv8 = this.hDKMBd;
        if (c36250oUv8 != null) {
            c36250oUv8.setChartHistoryOrder(false);
        }
        this.AkhnZx = true;
        android.os.Bundle arguments = getArguments();
        this.djBIcL = arguments != null ? arguments.getBoolean("isHideIndex") : false;
        C36250oUv c36250oUv9 = this.hDKMBd;
        if (c36250oUv9 != null && (chartViewOutSideConfigAkhnZx14 = c36250oUv9.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx14.setHideMainIndex(this.djBIcL);
        }
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        C36312oXc c36312oXcAEQbTJ = C36312oXc.AEQbTJ(this.hDKMBd);
        this.AwvSrB = c36312oXcAEQbTJ;
        C36250oUv c36250oUv10 = this.hDKMBd;
        if (c36250oUv10 != null) {
            c36250oUv10.setCurrentStateMachine(c36312oXcAEQbTJ);
        }
        android.view.View view = getView();
        if (view != null) {
            startLoadData$default(this, view, null, 2, null);
        }
        C36250oUv c36250oUv11 = this.hDKMBd;
        if (c36250oUv11 != null && (chartViewOutSideConfigAkhnZx13 = c36250oUv11.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx13.setPortraitChart(true);
        }
        C36250oUv c36250oUv12 = this.hDKMBd;
        if (c36250oUv12 != null && (chartViewOutSideConfigAkhnZx12 = c36250oUv12.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx12.setOrderSupportClick(false);
        }
        C36250oUv c36250oUv13 = this.hDKMBd;
        if (c36250oUv13 != null && (chartViewOutSideConfigAkhnZx11 = c36250oUv13.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx11.setSpotCostSupportClick(false);
        }
        C36250oUv c36250oUv14 = this.hDKMBd;
        if (c36250oUv14 != null && (chartViewOutSideConfigAkhnZx10 = c36250oUv14.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx10.setScreen(false);
        }
        C36250oUv c36250oUv15 = this.hDKMBd;
        if (c36250oUv15 != null && (chartViewOutSideConfigAkhnZx9 = c36250oUv15.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx9.setChartYAxisNum(5);
        }
        C36250oUv c36250oUv16 = this.hDKMBd;
        if (c36250oUv16 != null && (chartViewOutSideConfigAkhnZx8 = c36250oUv16.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx8.setMHideKlineDrawingData(SPUtils.getBoolean("hide_kline_drawing_data", false));
        }
        C36250oUv c36250oUv17 = this.hDKMBd;
        if (c36250oUv17 != null && (chartViewOutSideConfigAkhnZx7 = c36250oUv17.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx7.setMShowCurrentOrder(C36236oUh.EZpvd.uzCIH());
        }
        C36250oUv c36250oUv18 = this.hDKMBd;
        if (c36250oUv18 != null && (chartViewOutSideConfigAkhnZx6 = c36250oUv18.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx6.setMChartHistoryOrder(C36236oUh.EZpvd.wlaJM());
        }
        C36250oUv c36250oUv19 = this.hDKMBd;
        if (c36250oUv19 != null && (chartViewOutSideConfigAkhnZx5 = c36250oUv19.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx5.setMShowCostLine(C36236oUh.EZpvd.ejfBZ());
        }
        C36250oUv c36250oUv20 = this.hDKMBd;
        if (c36250oUv20 != null && (chartViewOutSideConfigAkhnZx4 = c36250oUv20.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx4.setShowBe(C36236oUh.EZpvd.fIwbmz());
        }
        C36250oUv c36250oUv21 = this.hDKMBd;
        if (c36250oUv21 != null && (chartViewOutSideConfigAkhnZx3 = c36250oUv21.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx3.setShowLiq(C36236oUh.EZpvd.AubY());
        }
        C36250oUv c36250oUv22 = this.hDKMBd;
        if (c36250oUv22 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv22.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx2.setShowSpotAveragePrice(C36236oUh.EZpvd.fARcdN());
        }
        C36250oUv c36250oUv23 = this.hDKMBd;
        if (c36250oUv23 == null || (chartViewOutSideConfigAkhnZx = c36250oUv23.AkhnZx()) == null) {
            return;
        }
        chartViewOutSideConfigAkhnZx.setMShowCountdown(C36236oUh.EZpvd.getNewProxyInstance());
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        java.util.HashMap<java.lang.String, oWK> mapAuCTelauCTel;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        this.AkhnZx = false;
        uzCIH();
        C36250oUv c36250oUv = this.hDKMBd;
        if (c36250oUv != null && (mapEjfBZ = c36250oUv.ejfBZ()) != null) {
            C36250oUv c36250oUv2 = this.hDKMBd;
            com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get(c36250oUv2 != null ? c36250oUv2.fIwbmz() : null);
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        C36246oUr.copydefault().gEmmrt();
        C36250oUv c36250oUv3 = this.hDKMBd;
        if (c36250oUv3 != null && (mapAuCTelauCTel = c36250oUv3.AuCTelauCTel()) != null) {
            C36250oUv c36250oUv4 = this.hDKMBd;
            mapAuCTelauCTel.remove(c36250oUv4 != null ? c36250oUv4.fIwbmz() : null);
        }
        C36250oUv c36250oUv5 = this.hDKMBd;
        if (c36250oUv5 != null) {
            c36250oUv5.QUSxYX();
        }
        C36250oUv c36250oUv6 = this.hDKMBd;
        if (c36250oUv6 != null) {
            c36250oUv6.OLrzqt();
        }
        C36250oUv c36250oUv7 = this.hDKMBd;
        if (c36250oUv7 != null) {
            c36250oUv7.QOLQEE();
        }
    }

    private final void uzCIH() {
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.AuCTelauCTel;
        if (stateListAnimator != null) {
            stateListAnimator.gEmmrt();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        super.onDestroyView();
        AYXKKw().values().removeObserver(this.fIwbmz);
        AkhnZx();
        SubHelper.AEQbTJ(this);
        DbNXlk();
        C36250oUv c36250oUv = this.hDKMBd;
        if (c36250oUv != null) {
            c36250oUv.RcXXUw();
        }
        C36246oUr.copydefault().OLrzqt();
        C36250oUv c36250oUv2 = this.hDKMBd;
        if (c36250oUv2 != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(false);
        }
        C36250oUv c36250oUv3 = this.hDKMBd;
        if (c36250oUv3 != null) {
            c36250oUv3.setChartSelectionListener(null);
        }
        C36250oUv c36250oUv4 = this.hDKMBd;
        if (c36250oUv4 != null) {
            c36250oUv4.setLoadHistoryKlineListener(null);
        }
        C36250oUv c36250oUv5 = this.hDKMBd;
        if (c36250oUv5 != null) {
            c36250oUv5.setDrawUpdateListener(null);
        }
        android.widget.LinearLayout linearLayout = this.fJNWhG;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(null);
        }
        this.AwvSrB = null;
        this.AuCTel = null;
        this.sSMYrx = null;
        this.gHZMYf = null;
        this.zuBGHE = null;
        this.hDKMBd = null;
        this.RJOkX = null;
        this.values = null;
        this.fJNWhG = null;
        this.QOLQEE = null;
        this.AubY = null;
        this.fetchVPNInfo = null;
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.AuCTelauCTel;
        if (stateListAnimator != null) {
            stateListAnimator.copydefault();
        }
        this.AuCTelauCTel = null;
    }

    private final void iwGUEr() {
        ConstraintLayout constraintLayout = this.gHZMYf;
        if (constraintLayout != null) {
            constraintLayout.setEnabled(true);
        }
        ConstraintLayout constraintLayout2 = this.gHZMYf;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView = this.zuBGHE;
        if (lottieAnimationView != null) {
            lottieAnimationView.setAnimation(AhwBna());
        }
        LottieAnimationView lottieAnimationView2 = this.zuBGHE;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.playAnimation();
        }
    }

    public final java.lang.String AhwBna() {
        return C33492mxV.OLrzqt() ? "kline_trade_header_dark.lottie" : "kline_trade_header_light.lottie";
    }

    public final boolean gEmmrt() {
        android.widget.HorizontalScrollView horizontalScrollView = this.QOLQEE;
        if (horizontalScrollView == null) {
            return false;
        }
        android.view.View childAt = horizontalScrollView.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "");
        if (childAt != null) {
            return horizontalScrollView.getWidth() < childAt.getMeasuredWidth();
        }
        return false;
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        android.widget.LinearLayout linearLayout;
        super.onResume();
        if (this.gEmmrt) {
            djBIcL();
            C36250oUv c36250oUv = this.hDKMBd;
            if (c36250oUv != null) {
                c36250oUv.setIsShowTimelineAreaGrid(false);
            }
        } else {
            C36250oUv c36250oUv2 = this.hDKMBd;
            if (c36250oUv2 != null) {
                c36250oUv2.setIsShowTimelineAreaGrid(true);
            }
        }
        if (this.valueOf || (linearLayout = this.fJNWhG) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final void djBIcL() {
        android.widget.TextView textView = this.RJOkX;
        if (textView != null) {
            textView.setVisibility(4);
        }
        android.widget.ImageView imageView = this.values;
        if (imageView != null) {
            imageView.setRotation(180.0f);
        }
    }

    @Override // o.InterfaceC35972oKn
    public void EZpvd(@NotNull IBotOrdersDataBean iBotOrdersDataBean) {
        Intrinsics.checkNotNullParameter(iBotOrdersDataBean, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TradeHeaderKlineFragment$setBotOrdersData$1(this, iBotOrdersDataBean, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    @Override // o.InterfaceC39563puh.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(@NotNull java.util.ArrayList<Triple<AbstractC36262oVg, java.lang.Boolean, KlineIndicatorBean>> arrayList) {
        C36250oUv c36250oUv;
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            Triple triple = (Triple) it.next();
            AbstractC36262oVg first = (AbstractC36262oVg) triple.getFirst();
            KlineIndicatorBean klineIndicatorBean = (KlineIndicatorBean) triple.getThird();
            if (((java.lang.Boolean) triple.getSecond()).booleanValue()) {
                C36250oUv c36250oUv2 = this.hDKMBd;
                if (c36250oUv2 != null) {
                    c36250oUv2.AEQbTJ(first);
                }
                pEV pev = pEV.OLrzqt;
                java.lang.String strEjfBZ = ((AbstractC36262oVg) triple.getFirst()).ejfBZ();
                Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
                pev.OLrzqt(strEjfBZ, Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getShow(), (java.lang.Object) "0"));
                if (!Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getKeyName(), (java.lang.Object) "VOLUME")) {
                    if (Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getKeyName(), (java.lang.Object) ("VOLUME" + C37957pGz.copydefault.OLrzqt()))) {
                        AbstractC36262oVg first2 = new pGP().AEQbTJ(klineIndicatorBean).getFirst();
                        C36250oUv c36250oUv3 = this.hDKMBd;
                        if (c36250oUv3 != null) {
                            c36250oUv3.copydefault(first2);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getShow(), (java.lang.Object) "1") && (c36250oUv = this.hDKMBd) != null) {
                            c36250oUv.dNCPSb();
                        }
                    }
                    C36250oUv c36250oUv4 = this.hDKMBd;
                    if (c36250oUv4 != null) {
                        c36250oUv4.sSMYrx();
                    }
                }
            } else {
                if (Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getKeyName(), (java.lang.Object) "VOLUME")) {
                    first = new pGP().AEQbTJ(klineIndicatorBean).getFirst();
                }
                pEV pev2 = pEV.OLrzqt;
                java.lang.String strEjfBZ2 = first.ejfBZ();
                Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
                pev2.KWHzl(strEjfBZ2, Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getShow(), (java.lang.Object) "0"));
            }
        }
    }

    private final void AkhnZx() {
        ConstraintLayout constraintLayout = this.gHZMYf;
        if (constraintLayout == null || constraintLayout.getVisibility() != 0) {
            return;
        }
        ConstraintLayout constraintLayout2 = this.gHZMYf;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView = this.zuBGHE;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
    }
}
