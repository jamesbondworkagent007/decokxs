package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.collection.ArrayMapKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.db.bean.DrawingDataEntity;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.DrawLineBean;
import com.okinc.kline.data.DrawingDataBean;
import com.okinc.kline.data.DrawingLinesData;
import com.okinc.kline.data.KlineChangeScreenVo;
import com.okinc.kline.data.KlineTimeAnchorType;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.KLineQuotesFullScreenFragment$checkIsWatched$1;
import com.okinc.kline.ui.KLineQuotesFullScreenFragment$initView$1$1$1$1;
import com.okinc.kline.ui.KLineQuotesFullScreenFragment$showChartSetting$1;
import com.okinc.kline.ui.KLineQuotesFullScreenFragment$showKlineEventDialog$1;
import com.okinc.kline.ui.KLineQuotesFullScreenFragment$showQuartzCSATFragment$1;
import com.okinc.kline.ui.KLineQuotesFullScreenFragment$showTradeBottomSheet$1;
import com.okinc.kline.ui.view.model.IndicatorDataReq;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.okinc.kline.util.KlineQuickOrderBottomSheetBehavior;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradelite.bean.OrderBeanData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import com.okinc.widget.data.TradeMenuItemBean;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.LinkedHashMap;
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
import o.C39339pqT;
import o.C39358pqm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC39272ppF;
import o.InterfaceC39563puh;
import o.InterfaceC43294rma;
import o.InterfaceC8104awT;
import o.ViewOnClickListenerC38659pdc;
import o.ViewOnClickListenerC39282ppP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pdc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewOnClickListenerC38659pdc extends AbstractC38558pbh implements InterfaceC39502ptZ, View.OnClickListener {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int hBpjJd = 8;
    public final InterfaceC56387yDm DLWbHP;
    public boolean ODXsMY;
    public boolean OFhtUX;
    public java.lang.String OHqIaq;
    public boolean OJuSTm;
    public java.lang.String OxVOHk;
    public boolean QCjLjM;
    public boolean QSLkRj;
    public oMO QVsKAR;
    public int UlJrfe;
    public C39285ppS aUsmxb;
    public androidx.fragment.app.Fragment dUDNAs;
    public MarketTopInfo fERRXa;
    public java.lang.String QwvEab = "";
    public boolean hrNTAI = true;
    public java.util.List<WatchListData> USBtdM = yDY.AhwBna();

    /* JADX INFO: renamed from: o.pdc$Fragment */
    public static final class Fragment extends TypeToken<java.util.ArrayList<DrawingLinesData>> {
    }

    /* JADX INFO: renamed from: o.pdc$LoaderManager */
    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.pdc$PendingIntent */
    public static final class PendingIntent extends TypeToken<java.util.ArrayList<DrawingLinesData>> {
    }

    @Override // o.InterfaceC39502ptZ
    public void AkhnZx(boolean z) {
    }

    @Override // o.InterfaceC39556pua
    public void KWHzl(MarketArbCoinInfo marketArbCoinInfo) {
    }

    @Override // o.InterfaceC36340oYd
    public void KWHzl(java.lang.String str) {
    }

    @Override // o.oYA
    public boolean ODWQjV() {
        return true;
    }

    @Override // o.InterfaceC39502ptZ
    public void OFhtUX() {
    }

    @Override // o.InterfaceC39502ptZ
    public void QSLkRj() {
    }

    @Override // o.oYA
    public void accept() {
    }

    @Override // o.InterfaceC39502ptZ
    public void dUDNAs() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void ixgjPv() {
        this.ODXsMY = true;
    }

    @Override // o.InterfaceC39500ptX
    public void setViewPagerScroll(boolean z) {
    }

    /* JADX INFO: renamed from: o.pdc$FragmentManager */
    public static final class FragmentManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    /* JADX INFO: renamed from: o.pdc$VoiceInteractor */
    public static final class VoiceInteractor<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    /* JADX INFO: renamed from: o.pdc$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC38659pdc EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = viewOnClickListenerC38659pdc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C36250oUv c36250oUv;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (((AppCompatTextView) this.KWHzl).isSelected()) {
                    return;
                }
                this.EZpvd.AuCTel(true);
                this.EZpvd.AYXKKw(true);
                oMO omo = this.EZpvd.QVsKAR;
                if (omo != null && (c36250oUv = omo.ejfBZ) != null) {
                    oYA.changeTime$default(this.EZpvd, c36250oUv, new TimeIntervalItem(-2, "index-candle1m", "candle1m", "mark-price-candle1m", "-2"), false, 4, null);
                }
                C32866mlf.onEvent$default("Chart_MarketCap_Chart_Click", (TrackChannel[]) null, ActionBar.EZpvd, 1, (java.lang.Object) null);
            }
        }
    }

    public ViewOnClickListenerC38659pdc() {
        final Function0 function0 = null;
        this.DLWbHP = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pGZ.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.KLineQuotesFullScreenFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.KLineQuotesFullScreenFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.KLineQuotesFullScreenFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final pGZ DWgRXt() {
        return (pGZ) this.DLWbHP.getValue();
    }

    public final InterfaceC40387qTz USBtdM() {
        return ((qTB) C43251rlk.copydefault(qTB.class)).copydefault();
    }

    /* JADX INFO: renamed from: o.pdc$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pdc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final ViewOnClickListenerC38659pdc OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, boolean z2, java.lang.String str4, java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = new ViewOnClickListenerC38659pdc();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(oLT.gEmmrt(), str);
            bundle.putString(oLT.valueOf(), str2);
            bundle.putString("from", str3);
            bundle.putBoolean(viewOnClickListenerC38659pdc.wlaJM(), z);
            bundle.putBoolean("is_CR_Mode", z2);
            bundle.putString("from_scene", str4);
            bundle.putString("tag", str5);
            viewOnClickListenerC38659pdc.setArguments(bundle);
            return viewOnClickListenerC38659pdc;
        }
    }

    @Override // o.oYA, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setSharedElementEnterTransition(new C36358oYv());
        pXB.registerTradeFragmentTrack$default(pXB.EZpvd, this, "KLineQuotesFullScreenFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.oYA, o.AbstractC32998moE
    public void onVisible() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUvQVAiDq;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        super.onVisible();
        C36250oUv c36250oUvQVAiDq2 = QVAiDq();
        if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx3 = c36250oUvQVAiDq2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx3.setPortraitChart(true);
            chartViewOutSideConfigAkhnZx3.setFullScreenMode(true);
            chartViewOutSideConfigAkhnZx3.setScreen(true);
            chartViewOutSideConfigAkhnZx3.setCompareKLine(false);
            chartViewOutSideConfigAkhnZx3.setScreenType(1);
        }
        C36250oUv c36250oUvQVAiDq3 = QVAiDq();
        if (c36250oUvQVAiDq3 != null) {
            c36250oUvQVAiDq3.setIsSupportDoubleClick(true);
        }
        BizInstrument bizInstrumentHDKMBd = hDKMBd();
        if (bizInstrumentHDKMBd != null && (c36250oUvQVAiDq = QVAiDq()) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx2.setCanShowQuickOrder(pFP.OLrzqt.copydefault(bizInstrumentHDKMBd));
        }
        if (pFS.KWHzl.KWHzl(getParentFragment())) {
            return;
        }
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        EZpvd(C36312oXc.AEQbTJ(QVAiDq()));
        C36250oUv c36250oUvQVAiDq4 = QVAiDq();
        if (c36250oUvQVAiDq4 != null) {
            c36250oUvQVAiDq4.setCurrentStateMachine(RcXXUw());
        }
        C36312oXc c36312oXcRcXXUw = RcXXUw();
        if (c36312oXcRcXXUw != null) {
            c36312oXcRcXXUw.EZpvd(c36312oXcRcXXUw.wlaJM);
            C36250oUv c36250oUvQVAiDq5 = QVAiDq();
            if (c36250oUvQVAiDq5 == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq5.AkhnZx()) == null) {
                return;
            }
            chartViewOutSideConfigAkhnZx.setMDrawLineEnable(true);
        }
    }

    @Override // o.oYA, o.AbstractC32998moE
    public void onInvisible() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUvQVAiDq;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        C36250oUv c36250oUvQVAiDq2;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        if (!AwvSrB().getValue().copydefault() && (((!Intrinsics.EZpvd((java.lang.Object) aKErDB(), (java.lang.Object) "TYPE_KLINE") && !this.OJuSTm) || this.ODXsMY || ((c36250oUvQVAiDq = QVAiDq()) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq.AkhnZx()) != null && chartViewOutSideConfigAkhnZx2.isFastKLineMode())) && (c36250oUvQVAiDq2 = QVAiDq()) != null && (mapEjfBZ = c36250oUvQVAiDq2.ejfBZ()) != null)) {
            C36250oUv c36250oUvQVAiDq3 = QVAiDq();
            com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get(c36250oUvQVAiDq3 != null ? c36250oUvQVAiDq3.fIwbmz() : null);
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        C36250oUv c36250oUvQVAiDq4 = QVAiDq();
        if (c36250oUvQVAiDq4 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq4.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setFullScreenMode(false);
            C36250oUv c36250oUvQVAiDq5 = QVAiDq();
            if (c36250oUvQVAiDq5 != null) {
                c36250oUvQVAiDq5.EZpvd();
            }
            chartViewOutSideConfigAkhnZx.setCanShowQuickOrder(false);
        }
        if (Intrinsics.EZpvd(fZBcTu().KWHzl().getValue(), java.lang.Boolean.FALSE)) {
            C39285ppS c39285ppS = this.aUsmxb;
            if (c39285ppS != null) {
                c39285ppS.dismiss();
            }
            this.aUsmxb = null;
        }
        fERRXa();
    }

    @Override // o.oYA, androidx.fragment.app.Fragment
    public void onDestroyView() {
        InterfaceC39272ppF interfaceC39272ppF;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        super.onDestroyView();
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd((DrawLineData.LineType) null);
        drawLineData.KWHzl((DrawLineData.DrawLineItem) null);
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMDrawLineEnable(false);
        }
        WeakReference<InterfaceC39272ppF> weakReferenceAubY = AubY();
        if (weakReferenceAubY != null && (interfaceC39272ppF = weakReferenceAubY.get()) != null) {
            interfaceC39272ppF.EZpvd();
        }
        this.dUDNAs = null;
        InterfaceC49506upo interfaceC49506upoFFgQHt = fFgQHt();
        if (interfaceC49506upoFFgQHt != null) {
            interfaceC49506upoFFgQHt.AEQbTJ();
        }
        KWHzl((InterfaceC49506upo) null);
        this.QVsKAR = null;
    }

    @Override // o.oYA, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        FragmentActivity activity;
        android.view.Window window;
        android.view.View decorView;
        WeakReference<InterfaceC39272ppF> weakReferenceAubY;
        InterfaceC39272ppF interfaceC39272ppF;
        java.lang.String titleByIdAndType$default = "";
        Intrinsics.checkNotNullParameter(view, "");
        if (AwvSrB().getValue().copydefault()) {
            postponeEnterTransition();
        }
        android.os.Bundle arguments = getArguments();
        gEmmrt(arguments != null && arguments.getBoolean("is_CR_Mode", false));
        super.initView(view, bundle);
        this.QVsKAR = oMO.copydefault(view);
        android.os.Bundle arguments2 = getArguments();
        this.OxVOHk = arguments2 != null ? arguments2.getString("from") : null;
        android.os.Bundle arguments3 = getArguments();
        this.OHqIaq = arguments3 != null ? arguments3.getString("from_scene") : null;
        android.os.Bundle arguments4 = getArguments();
        copydefault(arguments4 != null ? arguments4.getString("tag") : null);
        EZpvd(new WeakReference<>(new C39268ppB()));
        hCLrkq();
        final android.content.Context context = getContext();
        if (context != null && (activity = getActivity()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (weakReferenceAubY = AubY()) != null && (interfaceC39272ppF = weakReferenceAubY.get()) != null) {
            oMO omo = this.QVsKAR;
            C36109oPp c36109oPp = omo != null ? omo.isConnected : null;
            Intrinsics.copydefault(c36109oPp);
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            interfaceC39272ppF.EZpvd(context, decorView, c36109oPp, childFragmentManager, null, new Function0() { // from class: o.pdz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ViewOnClickListenerC38659pdc.copydefault(this.OLrzqt, context);
                }
            });
        }
        final C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.setKlineQuickOrderListener(new Application());
            c36250oUvQVAiDq.setChartSelectionListener(new Dialog());
            c36250oUvQVAiDq.setKlineEventClickListener(new C36250oUv.FragmentManager() { // from class: o.pdy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.FragmentManager
                public final void onEventClick(oLS ols) {
                    ViewOnClickListenerC38659pdc.OLrzqt(this.EZpvd, ols);
                }
            });
            c36250oUvQVAiDq.setLoadRightHistoryKlineListener(new C36250oUv.LoaderManager() { // from class: o.pdB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.LoaderManager
                public final void AEQbTJ() {
                    ViewOnClickListenerC38659pdc.AEQbTJ(c36250oUvQVAiDq, this);
                }
            });
        }
        if (QOLQEE().AEQbTJ() <= 0) {
            UrRBLY();
        }
        oWN.KWHzl(C57676yms.AEQbTJ(ejfBZ()));
        fHqPtx();
        fJNWhG(SPUtils.getBoolean("trade_button_left", true));
        if (QbewEr() != null) {
            KDccX();
        }
        if (!Intrinsics.EZpvd((java.lang.Object) "kline_follow_app", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
                AkhnZx(true);
            } else {
                AkhnZx(false);
            }
        }
        if (!OqFWZa()) {
            AYXKKw(new java.util.ArrayList());
            BizInstrument bizInstrumentHDKMBd = hDKMBd();
            if (bizInstrumentHDKMBd != null && bizInstrumentHDKMBd.isPreMarketPair()) {
                C48914uef c48914uef = C48914uef.EZpvd;
                MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
                java.lang.String strEZpvd = c48914uef.EZpvd(marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null, false);
                if (strEZpvd != null) {
                    titleByIdAndType$default = strEZpvd;
                }
            } else {
                C48914uef c48914uef2 = C48914uef.EZpvd;
                MarketCoinInfo marketCoinInfoQbewEr2 = QbewEr();
                java.lang.String instrumentId = marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentId() : null;
                MarketCoinInfo marketCoinInfoQbewEr3 = QbewEr();
                titleByIdAndType$default = C48914uef.getTitleByIdAndType$default(c48914uef2, instrumentId, marketCoinInfoQbewEr3 != null ? marketCoinInfoQbewEr3.getInstrumentType() : null, false, false, getContext(), true, true, 12, null);
            }
            AYXKKw(titleByIdAndType$default);
            AEQbTJ(QOLQEE().AkhnZx());
        }
        DBxZfM();
        if (QKVWgx()) {
            OLrzqt();
        }
        AuCTel(C36246oUr.copydefault().zLjUOn().isCeFiMCapMode());
        DGOPHZDGOPHZ();
    }

    public static final Unit copydefault(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, android.content.Context context) {
        viewOnClickListenerC38659pdc.djBIcL("");
        if (viewOnClickListenerC38659pdc.isAdded()) {
            if (viewOnClickListenerC38659pdc.getParentFragmentManager().findFragmentById(C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1) == null && !viewOnClickListenerC38659pdc.OFhtUX) {
                LifecycleOwnerKt.getLifecycleScope(viewOnClickListenerC38659pdc).launchWhenResumed(new KLineQuotesFullScreenFragment$initView$1$1$1$1(context, viewOnClickListenerC38659pdc, null));
            }
            viewOnClickListenerC38659pdc.OFhtUX = false;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pdc$Application */
    public static final class Application implements C36250oUv.Dialog {
        public Application() {
        }

        @Override // o.C36250oUv.Dialog
        public void EZpvd() {
            final InterfaceC39272ppF interfaceC39272ppF;
            ActivityResultCaller activityResultCaller;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            java.lang.String strOcIXYQ;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            C36250oUv c36250oUvQVAiDq = ViewOnClickListenerC38659pdc.this.QVAiDq();
            if (Intrinsics.EZpvd((java.lang.Object) ((c36250oUvQVAiDq == null || (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx2.getMode()), (java.lang.Object) "lite_mode")) {
                ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = ViewOnClickListenerC38659pdc.this;
                viewOnClickListenerC38659pdc.djBIcL(viewOnClickListenerC38659pdc.QwvEab);
                ViewOnClickListenerC38659pdc.this.DbNXlk();
                BizInstrument bizInstrumentHDKMBd = ViewOnClickListenerC38659pdc.this.hDKMBd();
                if ((bizInstrumentHDKMBd == null || (strOcIXYQ = bizInstrumentHDKMBd.getInstId()) == null) && (strOcIXYQ = ViewOnClickListenerC38659pdc.this.OcIXYQ()) == null) {
                    return;
                }
                OrderBeanData orderBeanData = new OrderBeanData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, strOcIXYQ, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, "limit", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, pFS.KWHzl.KWHzl(ViewOnClickListenerC38659pdc.this.QwvEab) ? "buy" : "sell", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.Double.parseDouble(ViewOnClickListenerC38659pdc.this.QwvEab), (java.lang.String) null, -1, -4196355, 49151, (DefaultConstructorMarker) null);
                InterfaceC49506upo interfaceC49506upoFFgQHt = ViewOnClickListenerC38659pdc.this.fFgQHt();
                if (interfaceC49506upoFFgQHt != null) {
                    interfaceC49506upoFFgQHt.KWHzl(orderBeanData);
                    return;
                }
                return;
            }
            WeakReference<InterfaceC39272ppF> weakReferenceAubY = ViewOnClickListenerC38659pdc.this.AubY();
            if (weakReferenceAubY == null || (interfaceC39272ppF = weakReferenceAubY.get()) == null) {
                return;
            }
            final ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc2 = ViewOnClickListenerC38659pdc.this;
            if (interfaceC39272ppF.djBIcL() == KlineQuickOrderBottomSheetBehavior.States.STATE_COLLAPSED) {
                viewOnClickListenerC38659pdc2.fIwbmz(true);
                if (!pFP.isLogin$default(pFP.OLrzqt, null, 1, null)) {
                    InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
                    android.content.Context contextRequireContext = viewOnClickListenerC38659pdc2.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, contextRequireContext, null, 2, null);
                    return;
                }
                if (Intrinsics.EZpvd((java.lang.Object) viewOnClickListenerC38659pdc2.aKErDB(), (java.lang.Object) "TYPE_MARK_PRICE_KLINE") || Intrinsics.EZpvd((java.lang.Object) viewOnClickListenerC38659pdc2.aKErDB(), (java.lang.Object) "TYPE_INDEX_KLINE")) {
                    C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C35964oKf.Fragment.ardYFU), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                    return;
                }
                C36250oUv c36250oUvQVAiDq2 = viewOnClickListenerC38659pdc2.QVAiDq();
                if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq2.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.isOpenCoolTime() && (Intrinsics.EZpvd((java.lang.Object) "SWAP", (java.lang.Object) viewOnClickListenerC38659pdc2.ORxRYg()) || Intrinsics.EZpvd((java.lang.Object) "FUTURES", (java.lang.Object) viewOnClickListenerC38659pdc2.ORxRYg()))) {
                    C55328xhq.show$default(C55328xhq.OLrzqt, C33069mpW.copydefault(viewOnClickListenerC38659pdc2, C55688xof.Application.getThemeUpIndicator, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, pTA.format$default(new Date(viewOnClickListenerC38659pdc2.gHZMYf()), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null)))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                    return;
                }
                BizInstrument bizInstrumentHDKMBd2 = viewOnClickListenerC38659pdc2.hDKMBd();
                if (bizInstrumentHDKMBd2 != null) {
                    InterfaceC49493upb interfaceC49493upb = (InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class);
                    java.lang.String str = viewOnClickListenerC38659pdc2.QwvEab;
                    if (viewOnClickListenerC38659pdc2 instanceof C55427xjj) {
                        activityResultCaller = viewOnClickListenerC38659pdc2;
                    } else {
                        androidx.fragment.app.Fragment parentFragment = viewOnClickListenerC38659pdc2.getParentFragment();
                        while (parentFragment != null && !(parentFragment instanceof C55427xjj)) {
                            parentFragment = parentFragment.getParentFragment();
                        }
                        if (!(parentFragment instanceof C55427xjj)) {
                            parentFragment = null;
                        }
                        activityResultCaller = (C55427xjj) parentFragment;
                    }
                    C55427xjj c55427xjj = (C55427xjj) activityResultCaller;
                    androidx.fragment.app.Fragment fragmentCopydefault = interfaceC49493upb.copydefault(bizInstrumentHDKMBd2, str, new Function2() { // from class: o.pep
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return ViewOnClickListenerC38659pdc.Application.EZpvd(viewOnClickListenerC38659pdc2, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                        }
                    }, new Function1() { // from class: o.pen
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ViewOnClickListenerC38659pdc.Application.EZpvd(interfaceC39272ppF, ((java.lang.Boolean) obj).booleanValue());
                        }
                    }, new Function1() { // from class: o.pes
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ViewOnClickListenerC38659pdc.Application.AEQbTJ(interfaceC39272ppF, ((java.lang.Integer) obj).intValue());
                        }
                    }, new Function2() { // from class: o.per
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return ViewOnClickListenerC38659pdc.Application.AEQbTJ(viewOnClickListenerC38659pdc2, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    }, new Function1() { // from class: o.peq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ViewOnClickListenerC38659pdc.Application.AEQbTJ(viewOnClickListenerC38659pdc2, (C49423uoK) obj);
                        }
                    }, c55427xjj != null ? c55427xjj.gEmmrt() : null, "kline_page_quick", pFS.KWHzl.KWHzl(viewOnClickListenerC38659pdc2.QwvEab), pFN.OLrzqt.KWHzl(), viewOnClickListenerC38659pdc2.getFieldNames());
                    InterfaceC39272ppF.ActionBar.showFragment$default(interfaceC39272ppF, fragmentCopydefault, null, null, 6, null);
                    viewOnClickListenerC38659pdc2.djBIcL(viewOnClickListenerC38659pdc2.QwvEab);
                    viewOnClickListenerC38659pdc2.call();
                    C37908pFd.copydefault(true);
                    viewOnClickListenerC38659pdc2.dUDNAs = fragmentCopydefault;
                    return;
                }
                return;
            }
            viewOnClickListenerC38659pdc2.getTAG();
            java.lang.String unused = viewOnClickListenerC38659pdc2.QwvEab;
            viewOnClickListenerC38659pdc2.djBIcL(viewOnClickListenerC38659pdc2.QwvEab);
            viewOnClickListenerC38659pdc2.fIwbmz(false);
            androidx.fragment.app.Fragment fragment = viewOnClickListenerC38659pdc2.dUDNAs;
            if (fragment != null) {
                ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).KWHzl(fragment, viewOnClickListenerC38659pdc2.QwvEab);
            }
        }

        public static final Unit EZpvd(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, boolean z, java.lang.String str) {
            viewOnClickListenerC38659pdc.OFhtUX = z;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                if (!z) {
                    C55328xhq.show$default(C55328xhq.OLrzqt, str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                } else if (str != null) {
                    C55326xho.toastWithSuccessfulIcon$default(str, 0, 1, (java.lang.Object) null);
                }
            }
            if (z) {
                viewOnClickListenerC38659pdc.fERRXa();
            }
            viewOnClickListenerC38659pdc.ejfBZ(z);
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(InterfaceC39272ppF interfaceC39272ppF, boolean z) {
            InterfaceC39272ppF.ActionBar.setState$default(interfaceC39272ppF, z ? KlineQuickOrderBottomSheetBehavior.States.STATE_HALF_EXPANDED : KlineQuickOrderBottomSheetBehavior.States.STATE_EXPANDED, false, 2, null);
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(InterfaceC39272ppF interfaceC39272ppF, int i) {
            interfaceC39272ppF.EZpvd(i);
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.lang.String str, java.lang.String str2) {
            if (str != null && str2 != null) {
                viewOnClickListenerC38659pdc.AEQbTJ(str, str2, false);
            }
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, C49423uoK c49423uoK) {
            Intrinsics.checkNotNullParameter(c49423uoK, "");
            java.lang.String strOLrzqt = c49423uoK.OLrzqt();
            viewOnClickListenerC38659pdc.djBIcL(strOLrzqt != null ? strOLrzqt : "");
            return Unit.INSTANCE;
        }

        @Override // o.C36250oUv.Dialog
        public void EZpvd(java.lang.String str) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            Intrinsics.checkNotNullParameter(str, "");
            C36250oUv c36250oUvQVAiDq = ViewOnClickListenerC38659pdc.this.QVAiDq();
            if (!Intrinsics.EZpvd((java.lang.Object) ((c36250oUvQVAiDq == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx.getMode()), (java.lang.Object) "lite_mode")) {
                androidx.fragment.app.Fragment fragment = ViewOnClickListenerC38659pdc.this.dUDNAs;
                if (fragment != null) {
                    ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).KWHzl(fragment, str);
                    return;
                }
                return;
            }
            ViewOnClickListenerC38659pdc.this.DbNXlk();
            InterfaceC49506upo interfaceC49506upoFFgQHt = ViewOnClickListenerC38659pdc.this.fFgQHt();
            if (interfaceC49506upoFFgQHt != null) {
                interfaceC49506upoFFgQHt.AEQbTJ(C33129mqd.AEQbTJ(str));
            }
        }

        @Override // o.C36250oUv.Dialog
        public void AEQbTJ() {
            java.lang.String strORxRYg = ViewOnClickListenerC38659pdc.this.ORxRYg();
            if (strORxRYg == null) {
                strORxRYg = "";
            }
            C37908pFd.valueOf(strORxRYg);
        }
    }

    /* JADX INFO: renamed from: o.pdc$Dialog */
    public static final class Dialog implements C36250oUv.ActionBar {
        public Dialog() {
        }

        @Override // o.C36250oUv.ActionBar
        public void EZpvd(java.lang.String str) {
            if (str != null) {
                ViewOnClickListenerC38659pdc.this.QwvEab = str;
            }
        }

        @Override // o.C36250oUv.ActionBar
        public void aI_() {
            C55489xks.startVibratorIfCan$default(0L, 1, null);
        }
    }

    public static final void OLrzqt(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, oLS ols) {
        viewOnClickListenerC38659pdc.djBIcL(ols.OLrzqt());
    }

    public static final void AEQbTJ(C36250oUv c36250oUv, ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc) {
        if (c36250oUv.getFieldNames() > 0) {
            int iODWQjV = C36246oUr.copydefault().ODWQjV();
            InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb = viewOnClickListenerC38659pdc.dNCPSb();
            if (stateListAnimatorDNCPSb != null) {
                InterfaceC39563puh.StateListAnimator.TaskDescription.getRightHistoryMarketCandles$default(stateListAnimatorDNCPSb, viewOnClickListenerC38659pdc, pEF.OLrzqt.OLrzqt(iODWQjV), C33129mqd.gEmmrt(java.lang.Long.valueOf(c36250oUv.getFieldNames())), oLT.djBIcL(), null, 16, null);
            }
        }
    }

    private final void hCLrkq() {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C52794wYp c52794wYp3;
        C52794wYp c52794wYp4;
        C52794wYp c52794wYp5;
        C52794wYp c52794wYp6;
        C52794wYp c52794wYp7;
        C52794wYp c52794wYp8;
        pFP pfp = pFP.OLrzqt;
        java.lang.String strORxRYg = ORxRYg();
        if (strORxRYg == null) {
            strORxRYg = "";
        }
        if (!pfp.copydefault(strORxRYg)) {
            oMO omo = this.QVsKAR;
            if (omo != null && (c52794wYp4 = omo.KWHzl) != null) {
                c52794wYp4.setBackgroundTintList(null);
            }
            oMO omo2 = this.QVsKAR;
            if (omo2 != null && (c52794wYp3 = omo2.AEQbTJ) != null) {
                c52794wYp3.setBackgroundTintList(null);
            }
            oMO omo3 = this.QVsKAR;
            if (omo3 != null && (c52794wYp2 = omo3.KWHzl) != null) {
                c52794wYp2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
            }
            oMO omo4 = this.QVsKAR;
            if (omo4 == null || (c52794wYp = omo4.AEQbTJ) == null) {
                return;
            }
            c52794wYp.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
            return;
        }
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_dark") ? C52761wXj.Activity.zhUgOk : C52761wXj.Activity.sTzBva));
        Intrinsics.copydefault(colorStateListValueOf);
        oMO omo5 = this.QVsKAR;
        if (omo5 != null && (c52794wYp8 = omo5.KWHzl) != null) {
            c52794wYp8.setBackgroundTintList(colorStateListValueOf);
        }
        oMO omo6 = this.QVsKAR;
        if (omo6 != null && (c52794wYp7 = omo6.AEQbTJ) != null) {
            c52794wYp7.setBackgroundTintList(colorStateListValueOf);
        }
        oMO omo7 = this.QVsKAR;
        if (omo7 != null && (c52794wYp6 = omo7.KWHzl) != null) {
            c52794wYp6.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        }
        oMO omo8 = this.QVsKAR;
        if (omo8 == null || (c52794wYp5 = omo8.AEQbTJ) == null) {
            return;
        }
        c52794wYp5.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
    }

    private final void DGOPHZDGOPHZ() {
        QOLQEE().AhwBna().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.pdl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.EZpvd(this.OLrzqt, (Unit) obj);
            }
        }));
        QOLQEE().copydefault().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.pdA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.AEQbTJ(this.KWHzl, (java.lang.Integer) obj);
            }
        }));
    }

    public static final Unit EZpvd(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, Unit unit) {
        C39828pzh c39828pzh;
        viewOnClickListenerC38659pdc.AuCTel(false);
        oMO omo = viewOnClickListenerC38659pdc.QVsKAR;
        if (omo != null && (c39828pzh = omo.fIwbmz) != null) {
            c39828pzh.setData();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.lang.Integer num) {
        int iIntValue;
        if (C36246oUr.copydefault().zLjUOn().isCeFiMCapMode()) {
            int i = viewOnClickListenerC38659pdc.UlJrfe;
            Intrinsics.copydefault(num);
            iIntValue = i - num.intValue();
        } else {
            int i2 = viewOnClickListenerC38659pdc.UlJrfe;
            Intrinsics.copydefault(num);
            iIntValue = i2 + num.intValue();
        }
        viewOnClickListenerC38659pdc.UlJrfe = iIntValue;
        return Unit.INSTANCE;
    }

    public final void djBIcL(java.util.List<? extends oLP> list) {
        if (isAdded()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KLineQuotesFullScreenFragment$showKlineEventDialog$1(list, this, null), 3, null);
        }
    }

    public final void OLrzqt() {
        android.widget.LinearLayout linearLayout;
        android.content.Context context;
        oMO omo = this.QVsKAR;
        if (omo == null || (linearLayout = omo.AkhnZx) == null || (context = getContext()) == null) {
            return;
        }
        InterfaceC49505upn interfaceC49505upn = (InterfaceC49505upn) C43251rlk.copydefault(InterfaceC49505upn.class);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        linearLayout.addView(interfaceC49505upn.OLrzqt(context, this, childFragmentManager, new Function0() { // from class: o.pdS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ViewOnClickListenerC38659pdc.ejfBZ(this.KWHzl);
            }
        }, new Function0() { // from class: o.pdV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ViewOnClickListenerC38659pdc.uzCIH(this.EZpvd);
            }
        }, new Function0() { // from class: o.pdT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ViewOnClickListenerC38659pdc.hDKMBd(this.copydefault);
            }
        }));
    }

    public static final Unit ejfBZ(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc) {
        showTradeBottomSheet$default(viewOnClickListenerC38659pdc, "buy", null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc) {
        showTradeBottomSheet$default(viewOnClickListenerC38659pdc, "sell", null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc) {
        viewOnClickListenerC38659pdc.WS();
        viewOnClickListenerC38659pdc.UlJrfe();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showTradeBottomSheet$default(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "0.0";
        }
        viewOnClickListenerC38659pdc.AEQbTJ(str, str2);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        InterfaceC39499ptW interfaceC39499ptWIsConnected;
        java.lang.String strOcIXYQ;
        try {
            DbNXlk();
            strOcIXYQ = OcIXYQ();
            if (strOcIXYQ == null) {
                BizInstrument bizInstrumentHDKMBd = hDKMBd();
                strOcIXYQ = bizInstrumentHDKMBd != null ? bizInstrumentHDKMBd.getInstId() : null;
                if (strOcIXYQ == null) {
                    strOcIXYQ = "";
                }
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KLineQuotesFullScreenFragment$showTradeBottomSheet$1(this, new OrderBeanData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, strOcIXYQ, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, "limit", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.Double.parseDouble(str2), (java.lang.String) null, -1, -4196355, 49151, (DefaultConstructorMarker) null), null), 3, null);
        } catch (java.lang.Exception unused2) {
            if (isConnected() == null || (interfaceC39499ptWIsConnected = isConnected()) == null) {
                return;
            }
            interfaceC39499ptWIsConnected.AYXKKw();
        }
    }

    public final void UlJrfe() {
        EventParamsList eventParamsList = new EventParamsList();
        eventParamsList.put("button_type", "draw", true);
        eventParamsList.put("chart_layout", "fullscreen", true);
        Unit unit = Unit.INSTANCE;
        C32866mlf.onEvent$default("KLine_Btm_Button_Click", "Click", "Button", eventParamsList, null, null, 24, null);
        pXB.klineClickTrack$default(pXB.EZpvd, "Kline_Bottom_Full_Screen_Draw_Click", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ejfBZ(final boolean z) {
        C32866mlf.onEvent$default("PlaceOrder_Kline_TradeTools_View", (TrackChannel[]) null, new Function1() { // from class: o.pdL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.OLrzqt(z, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        pXB pxb = pXB.EZpvd;
        java.lang.String strOcIXYQ = OcIXYQ();
        if (strOcIXYQ == null) {
            strOcIXYQ = "";
        }
        java.lang.String strORxRYg = ORxRYg();
        pxb.AEQbTJ("Kline_Full_Screen_Quick_Order_Success_Click", C56423yEv.EZpvd(C56390yDp.OLrzqt(strOcIXYQ, strORxRYg != null ? strORxRYg : "")));
    }

    public static final Unit OLrzqt(boolean z, ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, EventParamsList eventParamsList) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "chart_trade_result_toast", true);
        eventParamsList.put("status", z ? "success" : "failure", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        java.lang.String strORxRYg = viewOnClickListenerC38659pdc.ORxRYg();
        if (strORxRYg != null) {
            java.lang.String lowerCase = strORxRYg.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                str = lowerCase;
            }
        }
        eventParamsList.put("biz_type", str, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void call() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PlaceOrder_Kline_TradeTools_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.peg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.KWHzl(this.KWHzl, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, EventParamsList eventParamsList) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "app_chart_trade", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        java.lang.String strORxRYg = viewOnClickListenerC38659pdc.ORxRYg();
        if (strORxRYg != null) {
            java.lang.String lowerCase = strORxRYg.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                str = lowerCase;
            }
        }
        eventParamsList.put("biz_type", str, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fIwbmz(final boolean z) {
        C32866mlf.onEvent$default("PlaceOrder_Kline_TradeTools_Click", (TrackChannel[]) null, new Function1() { // from class: o.pdY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.copydefault(z, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(boolean z, ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, EventParamsList eventParamsList) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "app_chart_trade", true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, z ? "plus_button" : "plus_button_price_input", true);
        java.lang.String strORxRYg = viewOnClickListenerC38659pdc.ORxRYg();
        if (strORxRYg != null) {
            java.lang.String lowerCase = strORxRYg.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                str = lowerCase;
            }
        }
        eventParamsList.put("biz_type", str, true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    private final void DBxZfM() {
        C37979pHu c37979pHu = C37979pHu.AEQbTJ;
        c37979pHu.OLrzqt().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.pea
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.valueOf(this.OLrzqt, (java.util.List) obj);
            }
        }));
        c37979pHu.AEQbTJ().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.pdW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.AhwBna(this.EZpvd, (java.util.List) obj);
            }
        }));
        c37979pHu.KWHzl().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.pdZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.gEmmrt(this.EZpvd, (java.util.List) obj);
            }
        }));
        c37979pHu.copydefault().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.pef
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.values(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        c37979pHu.EZpvd().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.pee
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.isConnected(this.AEQbTJ, (java.util.List) obj);
            }
        }));
    }

    public static final Unit valueOf(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "OI");
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "LSAcco");
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "LSRatio");
        }
        return Unit.INSTANCE;
    }

    public static final Unit values(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "LSPos");
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "BSVol");
        }
        return Unit.INSTANCE;
    }

    private final void UrRBLY() {
        TemplateSetting templateSettingWlaJM;
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        java.lang.Integer numValueOf = (c36250oUvQVAiDq == null || (templateSettingWlaJM = c36250oUvQVAiDq.wlaJM()) == null || (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) == null) ? null : java.lang.Integer.valueOf(sideIndicatorNames.size());
        int iRlQdEF = C36246oUr.copydefault().RlQdEF();
        int iAccept = C36246oUr.copydefault().accept();
        Intrinsics.copydefault(numValueOf);
        this.UlJrfe = iRlQdEF + (iAccept * numValueOf.intValue());
        QOLQEE().KWHzl((int) (this.UlJrfe * ((((SPUtils.getInt("chart_height", 25).intValue() - 50) * 1.0f) / 200.0f) + 1.0f)));
    }

    private final void fHqPtx() {
        AppCompatTextView appCompatTextView;
        C55173xeu c55173xeu;
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        C33624mzv c33624mzv;
        C33624mzv c33624mzv2;
        C33624mzv c33624mzv3;
        C33624mzv c33624mzv4;
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        oMO omo = this.QVsKAR;
        if (omo != null && (c52794wYp2 = omo.KWHzl) != null) {
            c52794wYp2.setOnClickListener(this);
        }
        oMO omo2 = this.QVsKAR;
        if (omo2 != null && (c52794wYp = omo2.AEQbTJ) != null) {
            c52794wYp.setOnClickListener(this);
        }
        oMO omo3 = this.QVsKAR;
        if (omo3 != null && (c33624mzv4 = omo3.zLjUOn) != null) {
            c33624mzv4.setOnClickListener(this);
        }
        oMO omo4 = this.QVsKAR;
        if (omo4 != null && (c33624mzv3 = omo4.AubY) != null) {
            c33624mzv3.setOnClickListener(this);
        }
        oMO omo5 = this.QVsKAR;
        if (omo5 != null && (c33624mzv2 = omo5.wlaJM) != null) {
            c33624mzv2.setOnClickListener(this);
        }
        oMO omo6 = this.QVsKAR;
        if (omo6 != null && (c33624mzv = omo6.gHZMYf) != null) {
            c33624mzv.setOnClickListener(this);
        }
        oMO omo7 = this.QVsKAR;
        if (omo7 != null && (constraintLayout2 = omo7.OLrzqt) != null) {
            constraintLayout2.setOnClickListener(this);
        }
        oMO omo8 = this.QVsKAR;
        if (omo8 != null && (constraintLayout = omo8.copydefault) != null) {
            constraintLayout.setOnClickListener(this);
        }
        oMO omo9 = this.QVsKAR;
        if (omo9 != null && (viewOnClickListenerC39742pyA = omo9.AhwBna) != null) {
            viewOnClickListenerC39742pyA.setClickListener(new TaskDescription());
        }
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.setDrawingFinishListener(new C36250oUv.TaskDescription() { // from class: o.pdb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.TaskDescription
                public final void AEQbTJ() {
                    ViewOnClickListenerC38659pdc.getNewProxyInstance(this.KWHzl);
                }
            });
        }
        android.widget.TextView textViewGkJEwt = gkJEwt();
        Intrinsics.copydefault(textViewGkJEwt);
        C8003auW.copydefault(textViewGkJEwt).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.pdp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38659pdc.EZpvd(this.OLrzqt, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("kline_full_screen");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.pdo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.values(this.KWHzl, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pdn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38659pdc.fJNWhG(function1, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("kline_portrait_normal");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ2, this);
        final Function1 function12 = new Function1() { // from class: o.pdu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.AkhnZx(this.copydefault, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pds
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38659pdc.iwGUEr(function12, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ3 = RxBus.AEQbTJ("kline_portrait_normal_double_click");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ3, "");
        AbstractC58185ywX abstractC58185ywXEZpvd3 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ3, this);
        final Function1 function13 = new Function1() { // from class: o.pdt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.isConnected(this.EZpvd, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pdw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38659pdc.hDKMBd(function13, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ4 = RxBus.AEQbTJ("kline_theme_type");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ4, "");
        AbstractC58185ywX abstractC58185ywXEZpvd4 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ4, this);
        final Function1 function14 = new Function1() { // from class: o.pdv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.fetchVPNInfo(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd4.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pdx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38659pdc.uzCIH(function14, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ5 = RxBus.AEQbTJ("trade_button_position");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ5, "");
        AbstractC58185ywX abstractC58185ywXEZpvd5 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ5, this);
        final Function1 function15 = new Function1() { // from class: o.pdd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.DbNXlk(this.OLrzqt, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd5.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pde
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38659pdc.getFieldNames(function15, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ6 = RxBus.AEQbTJ("up_down_time_changed");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ6, "");
        AbstractC58185ywX abstractC58185ywXEZpvd6 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ6, this);
        final Function1 function16 = new Function1() { // from class: o.pdg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.fARcdN(this.copydefault, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd6.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pdh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38659pdc.getNewProxyInstance(function16, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ7 = RxBus.AEQbTJ("hide_drawing_line");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ7, "");
        AbstractC58185ywX abstractC58185ywXEZpvd7 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ7, this);
        final Function1 function17 = new Function1() { // from class: o.pdf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.AkhnZx((java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd7.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pdj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38659pdc.zLjUOn(function17, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ8 = RxBus.AEQbTJ("kline_layout_style");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ8, "");
        AbstractC58185ywX abstractC58185ywXEZpvd8 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ8, this);
        final Function1 function18 = new Function1() { // from class: o.pdk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.AuCTel(this.copydefault, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd8.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pdi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38659pdc.AuCTelauCTel(function18, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ9 = RxBus.AEQbTJ("kline_drawing_data_upload");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ9, "");
        AbstractC58185ywX abstractC58185ywXEZpvd9 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ9, this);
        final Function1 function19 = new Function1() { // from class: o.pdm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.ejfBZ(this.copydefault, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd9.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pdq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38659pdc.AubY(function19, obj);
            }
        });
        oMO omo10 = this.QVsKAR;
        if (omo10 != null && (c55173xeu = omo10.getFieldNames) != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.pdr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ViewOnClickListenerC38659pdc.OLrzqt(this.copydefault, view);
                }
            });
        }
        oMO omo11 = this.QVsKAR;
        if (omo11 == null || (appCompatTextView = omo11.fJNWhG) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 500L, this));
    }

    /* JADX INFO: renamed from: o.pdc$TaskDescription */
    public static final class TaskDescription implements InterfaceC35982oKx {
        public TaskDescription() {
        }

        @Override // o.InterfaceC35982oKx
        public void copydefault() {
            DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
            if (drawLineItemIsConnected != null) {
                ViewOnClickListenerC38659pdc.saveCurrentDrawingKline$default(ViewOnClickListenerC38659pdc.this, drawLineItemIsConnected, false, 2, null);
            }
            C36250oUv c36250oUvQVAiDq = ViewOnClickListenerC38659pdc.this.QVAiDq();
            if (c36250oUvQVAiDq != null) {
                c36250oUvQVAiDq.invalidate();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void OLrzqt() {
            DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
            if (drawLineItemIsConnected != null) {
                ViewOnClickListenerC38659pdc.saveCurrentDrawingKline$default(ViewOnClickListenerC38659pdc.this, drawLineItemIsConnected, false, 2, null);
            }
            C36250oUv c36250oUvQVAiDq = ViewOnClickListenerC38659pdc.this.QVAiDq();
            if (c36250oUvQVAiDq != null) {
                c36250oUvQVAiDq.invalidate();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void AEQbTJ() {
            DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
            if (drawLineItemIsConnected != null) {
                ViewOnClickListenerC38659pdc.saveCurrentDrawingKline$default(ViewOnClickListenerC38659pdc.this, drawLineItemIsConnected, false, 2, null);
            }
            C36250oUv c36250oUvQVAiDq = ViewOnClickListenerC38659pdc.this.QVAiDq();
            if (c36250oUvQVAiDq != null) {
                c36250oUvQVAiDq.invalidate();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void EZpvd() {
            ViewOnClickListenerC38659pdc.this.run();
        }

        @Override // o.InterfaceC35982oKx
        public void AYXKKw() {
            DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
            if (drawLineItemIsConnected != null) {
                ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = ViewOnClickListenerC38659pdc.this;
                if (drawLineItemIsConnected.getLocked()) {
                    drawLineItemIsConnected.setLineLocked(false);
                } else {
                    drawLineItemIsConnected.setLineLocked(true);
                }
                ViewOnClickListenerC38659pdc.saveCurrentDrawingKline$default(viewOnClickListenerC38659pdc, drawLineItemIsConnected, false, 2, null);
            }
            InterfaceC39499ptW interfaceC39499ptWIsConnected = ViewOnClickListenerC38659pdc.this.isConnected();
            if (interfaceC39499ptWIsConnected != null) {
                interfaceC39499ptWIsConnected.fJNWhG();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void KWHzl() {
            java.lang.String coinId;
            java.lang.Integer type;
            DrawLineData drawLineData = DrawLineData.copydefault;
            DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
            if (drawLineItemIsConnected != null) {
                ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = ViewOnClickListenerC38659pdc.this;
                drawLineItemIsConnected.setDelete(true);
                oUJ ouj = oUJ.KWHzl;
                DrawLineBean drawLineBeanAEQbTJ = ouj.AEQbTJ();
                if (drawLineBeanAEQbTJ == null || (coinId = drawLineBeanAEQbTJ.getCoinId()) == null) {
                    coinId = "";
                }
                drawLineItemIsConnected.setContract(coinId);
                DrawLineBean drawLineBeanAEQbTJ2 = ouj.AEQbTJ();
                drawLineItemIsConnected.setKlineType((drawLineBeanAEQbTJ2 == null || (type = drawLineBeanAEQbTJ2.getType()) == null) ? 0 : type.intValue());
                if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
                    viewOnClickListenerC38659pdc.KWHzl(drawLineItemIsConnected, true);
                    drawLineData.EZpvd().remove(drawLineItemIsConnected);
                    drawLineData.EZpvd(drawLineData.EZpvd());
                } else {
                    drawLineData.EZpvd().remove(drawLineItemIsConnected);
                    drawLineData.EZpvd().add(drawLineItemIsConnected);
                    drawLineData.EZpvd(drawLineData.EZpvd());
                }
            }
            InterfaceC39499ptW interfaceC39499ptWIsConnected = ViewOnClickListenerC38659pdc.this.isConnected();
            if (interfaceC39499ptWIsConnected != null) {
                interfaceC39499ptWIsConnected.DbNXlk();
            }
        }
    }

    public static final void getNewProxyInstance(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        viewOnClickListenerC38659pdc.Dmq();
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) == null) {
            return;
        }
        chartViewOutSideConfigAkhnZx.setDrawing(false);
    }

    public static final void EZpvd(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.lang.Object obj) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        C39402pre c39402preQKudOq = viewOnClickListenerC38659pdc.QKudOq();
        FragmentActivity activity = viewOnClickListenerC38659pdc.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            c39402preQKudOq.show(supportFragmentManager, viewOnClickListenerC38659pdc.aUsmxb());
            viewOnClickListenerC38659pdc.copydefault(false);
        }
        C32866mlf.onEvent$default("KLine_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pdH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ViewOnClickListenerC38659pdc.fetchVPNInfo((EventParamsList) obj2);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit fetchVPNInfo(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("price_type_dropdown_entry", "price_type_dropdown_entry", true);
        eventParamsList.put("chart_layout", "fullscreen", true);
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit values(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.lang.String str) {
        if (viewOnClickListenerC38659pdc.isConnected() != null) {
            InterfaceC39499ptW interfaceC39499ptWIsConnected = viewOnClickListenerC38659pdc.isConnected();
            if (interfaceC39499ptWIsConnected != null) {
                interfaceC39499ptWIsConnected.OLrzqt(false);
            }
            viewOnClickListenerC38659pdc.fetchVPNInfo(true);
        }
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AkhnZx(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.lang.String str) {
        InterfaceC39499ptW interfaceC39499ptWIsConnected = viewOnClickListenerC38659pdc.isConnected();
        if (interfaceC39499ptWIsConnected != null) {
            interfaceC39499ptWIsConnected.setPortraitNormal(viewOnClickListenerC38659pdc.QVAiDq());
        }
        viewOnClickListenerC38659pdc.OJuSTm = true;
        return Unit.INSTANCE;
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit isConnected(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.lang.String str) {
        InterfaceC39499ptW interfaceC39499ptWIsConnected = viewOnClickListenerC38659pdc.isConnected();
        if (interfaceC39499ptWIsConnected != null) {
            interfaceC39499ptWIsConnected.setPortraitNormal(viewOnClickListenerC38659pdc.QVAiDq());
        }
        viewOnClickListenerC38659pdc.OJuSTm = true;
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fetchVPNInfo(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.lang.String str) {
        FragmentActivity activity = viewOnClickListenerC38659pdc.getActivity();
        if (activity != null) {
            activity.recreate();
        }
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit DbNXlk(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.lang.String str) {
        viewOnClickListenerC38659pdc.fJNWhG(SPUtils.getBoolean("trade_button_left", true));
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fARcdN(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.lang.String str) {
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setUtc8(pFP.OLrzqt.AEQbTJ());
        }
        C36250oUv c36250oUvQVAiDq2 = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq2 != null && (mapEjfBZ = c36250oUvQVAiDq2.ejfBZ()) != null) {
            C36250oUv c36250oUvQVAiDq3 = viewOnClickListenerC38659pdc.QVAiDq();
            com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get(c36250oUvQVAiDq3 != null ? c36250oUvQVAiDq3.fIwbmz() : null);
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        C36250oUv c36250oUvQVAiDq4 = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq4 != null) {
            c36250oUvQVAiDq4.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AkhnZx(java.lang.String str) {
        C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C35964oKf.Fragment.RSmiaq), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AuCTel(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.lang.String str) {
        FragmentActivity activity = viewOnClickListenerC38659pdc.getActivity();
        if (activity != null) {
            activity.recreate();
        }
        return Unit.INSTANCE;
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit ejfBZ(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.lang.String str) {
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayList;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
        if (drawLineItemIsConnected != null) {
            if (drawLineItemIsConnected.getIndexId().length() == 0) {
                drawLineItemIsConnected.setIndexId(C37897pEt.KWHzl.copydefault(java.lang.System.currentTimeMillis()));
            }
            if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
                C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
                if (c36250oUvQVAiDq == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) == null || (arrayList = chartViewOutSideConfigAkhnZx.getLinesList()) == null) {
                    arrayList = new java.util.ArrayList<>();
                }
                java.util.ArrayList<DrawLineData.DrawLineItem> arrayList2 = new java.util.ArrayList<>();
                int size = arrayList.size();
                C37895pEr c37895pEr = C37895pEr.copydefault;
                if (size > c37895pEr.EZpvd()) {
                    int size2 = arrayList.size();
                    int iEZpvd = c37895pEr.EZpvd();
                    for (int i = 0; i < size2 - iEZpvd; i++) {
                        DrawLineData.DrawLineItem drawLineItem = arrayList.get(0);
                        Intrinsics.checkNotNullExpressionValue(drawLineItem, "");
                        arrayList2.add(drawLineItem);
                        arrayList.remove(0);
                    }
                    viewOnClickListenerC38659pdc.copydefault(arrayList2, true, true);
                } else {
                    oYA.uploadDrawingData$default(viewOnClickListenerC38659pdc, yDY.copydefault(drawLineItemIsConnected), false, false, 6, null);
                }
            } else {
                viewOnClickListenerC38659pdc.zblBkD();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, android.view.View view) {
        android.widget.LinearLayout linearLayout;
        if (viewOnClickListenerC38659pdc.QbewEr() != null) {
            oMO omo = viewOnClickListenerC38659pdc.QVsKAR;
            if (omo != null && (linearLayout = omo.DbNXlk) != null) {
                linearLayout.setVisibility(8);
            }
            FragmentActivity activity = viewOnClickListenerC38659pdc.getActivity();
            if (activity != null) {
                if (viewOnClickListenerC38659pdc.QKVWgx()) {
                    ((ActivityC39220poG) activity).uzCIH();
                } else {
                    ((ActivityC38834pgs) activity).fetchVPNInfo();
                }
            }
            viewOnClickListenerC38659pdc.onResume();
            viewOnClickListenerC38659pdc.QSLkRj();
        }
    }

    /* JADX INFO: renamed from: o.pdc$ActionBar */
    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        public static final ActionBar EZpvd = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }
    }

    public final java.lang.String aUsmxb() {
        java.lang.String simpleName = C39014pkM.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        return simpleName;
    }

    /* JADX INFO: renamed from: o.pdc$PictureInPictureParams */
    public static final class PictureInPictureParams implements InterfaceC35980oKv {
        public PictureInPictureParams() {
        }

        @Override // o.InterfaceC35980oKv
        public void AEQbTJ() {
            C36250oUv c36250oUvQVAiDq = ViewOnClickListenerC38659pdc.this.QVAiDq();
            if (c36250oUvQVAiDq != null) {
                c36250oUvQVAiDq.invalidate();
            }
            DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
            if (drawLineItemIsConnected != null) {
                ViewOnClickListenerC38659pdc.saveCurrentDrawingKline$default(ViewOnClickListenerC38659pdc.this, drawLineItemIsConnected, false, 2, null);
            }
        }
    }

    public final void run() {
        C39353pqh c39353pqhOLrzqt = C39353pqh.Companion.OLrzqt();
        c39353pqhOLrzqt.EZpvd(new PictureInPictureParams());
        c39353pqhOLrzqt.show(getChildFragmentManager(), ViewOnClickListenerC38659pdc.class.getSimpleName());
    }

    public final void AuCTel(boolean z) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        C33624mzv c33624mzv;
        C33624mzv c33624mzv2;
        C33624mzv c33624mzv3;
        C33624mzv c33624mzv4;
        oMO omo = this.QVsKAR;
        if (omo != null && (c33624mzv4 = omo.zLjUOn) != null) {
            c33624mzv4.setVisibility(z ^ true ? 0 : 8);
        }
        oMO omo2 = this.QVsKAR;
        if (omo2 != null && (c33624mzv3 = omo2.AubY) != null) {
            c33624mzv3.setVisibility(z ^ true ? 0 : 8);
        }
        oMO omo3 = this.QVsKAR;
        if (omo3 != null && (c33624mzv2 = omo3.wlaJM) != null) {
            c33624mzv2.setVisibility(z ^ true ? 0 : 8);
        }
        oMO omo4 = this.QVsKAR;
        if (omo4 != null && (c33624mzv = omo4.gHZMYf) != null) {
            c33624mzv.setVisibility(z ^ true ? 0 : 8);
        }
        oMO omo5 = this.QVsKAR;
        if (omo5 != null && (constraintLayout2 = omo5.OLrzqt) != null) {
            constraintLayout2.setVisibility(z ^ true ? 0 : 8);
        }
        oMO omo6 = this.QVsKAR;
        if (omo6 == null || (constraintLayout = omo6.copydefault) == null) {
            return;
        }
        constraintLayout.setVisibility(z ^ true ? 0 : 8);
    }

    @Override // o.oYA
    public void OLrzqt(int i) {
        if (i == flVtFt()) {
            android.widget.TextView textViewGkJEwt = gkJEwt();
            if (textViewGkJEwt != null) {
                textViewGkJEwt.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.spnCvw));
                return;
            }
            return;
        }
        if (i == iZzfmt()) {
            android.widget.TextView textViewGkJEwt2 = gkJEwt();
            if (textViewGkJEwt2 != null) {
                textViewGkJEwt2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.Dmq));
                return;
            }
            return;
        }
        android.widget.TextView textViewGkJEwt3 = gkJEwt();
        if (textViewGkJEwt3 != null) {
            textViewGkJEwt3.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.ixgjPv));
        }
    }

    @Override // o.oYA
    public void OuxcSI() {
        int iIZzfmt;
        if (OqFWZa()) {
            MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
            if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentType() : null), (java.lang.Object) "OPTION")) {
                valueOf("TYPE_MARK_PRICE_KLINE");
                android.widget.TextView textViewGkJEwt = gkJEwt();
                if (textViewGkJEwt != null) {
                    textViewGkJEwt.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.Dmq));
                }
                int size = UeEOUB().size();
                int i = 0;
                while (i < size) {
                    UeEOUB().get(i).setSelect(i == 1);
                    i++;
                }
                QOLQEE().OLrzqt("TYPE_MARK_PRICE_KLINE");
                return;
            }
            valueOf("TYPE_KLINE");
            android.widget.TextView textViewGkJEwt2 = gkJEwt();
            if (textViewGkJEwt2 != null) {
                textViewGkJEwt2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.spnCvw));
            }
            int size2 = UeEOUB().size();
            int i2 = 0;
            while (i2 < size2) {
                UeEOUB().get(i2).setSelect(i2 == 0);
                i2++;
            }
            QOLQEE().OLrzqt("TYPE_KLINE");
            return;
        }
        valueOf(QOLQEE().gEmmrt());
        int size3 = UeEOUB().size();
        int i3 = 0;
        while (i3 < size3) {
            TradeMenuItemBean tradeMenuItemBean = UeEOUB().get(i3);
            java.lang.String strAKErDB = aKErDB();
            if (Intrinsics.EZpvd((java.lang.Object) strAKErDB, (java.lang.Object) "TYPE_KLINE")) {
                iIZzfmt = flVtFt();
            } else {
                iIZzfmt = Intrinsics.EZpvd((java.lang.Object) strAKErDB, (java.lang.Object) "TYPE_MARK_PRICE_KLINE") ? iZzfmt() : gGvvIC();
            }
            tradeMenuItemBean.setSelect(i3 == iIZzfmt);
            i3++;
        }
    }

    public static /* synthetic */ void coinInfoUpdated$default(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        viewOnClickListenerC38659pdc.AEQbTJ(str, str2, z);
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUvQVAiDq;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        java.lang.String titleByIdAndType$default = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
        if (marketCoinInfoQbewEr != null) {
            marketCoinInfoQbewEr.setInstrumentId(str);
        }
        MarketCoinInfo marketCoinInfoQbewEr2 = QbewEr();
        if (marketCoinInfoQbewEr2 != null) {
            marketCoinInfoQbewEr2.setInstrumentType(str2);
        }
        if (z) {
            fERRXa();
        }
        MarketCoinInfo marketCoinInfoQbewEr3 = QbewEr();
        if (marketCoinInfoQbewEr3 != null) {
            pFS pfs = pFS.KWHzl;
            if (pfs.AEQbTJ(marketCoinInfoQbewEr3) || pfs.KWHzl(marketCoinInfoQbewEr3) || pfs.OLrzqt(marketCoinInfoQbewEr3)) {
                InterfaceC39499ptW interfaceC39499ptWIsConnected = isConnected();
                if (interfaceC39499ptWIsConnected != null) {
                    interfaceC39499ptWIsConnected.EZpvd(marketCoinInfoQbewEr3);
                }
                InterfaceC39499ptW interfaceC39499ptWIsConnected2 = isConnected();
                if (interfaceC39499ptWIsConnected2 != null) {
                    interfaceC39499ptWIsConnected2.setPortraitNormal(null);
                }
                this.OJuSTm = true;
                C36250oUv c36250oUvQVAiDq2 = QVAiDq();
                if (c36250oUvQVAiDq2 == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq2.AkhnZx()) == null) {
                    return;
                }
                chartViewOutSideConfigAkhnZx.setCanShowQuickOrder(false);
                return;
            }
            OLrzqt(str, str2);
            BizInstrument bizInstrumentHDKMBd = hDKMBd();
            if (bizInstrumentHDKMBd != null && (c36250oUvQVAiDq = QVAiDq()) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setCanShowQuickOrder(pFP.OLrzqt.copydefault(bizInstrumentHDKMBd));
            }
            if (!z) {
                DGgnkA();
            }
            BizInstrument bizInstrumentHDKMBd2 = hDKMBd();
            if (bizInstrumentHDKMBd2 != null && bizInstrumentHDKMBd2.isPreMarketPair()) {
                C48914uef c48914uef = C48914uef.EZpvd;
                MarketCoinInfo marketCoinInfoQbewEr4 = QbewEr();
                java.lang.String strEZpvd = c48914uef.EZpvd(marketCoinInfoQbewEr4 != null ? marketCoinInfoQbewEr4.getInstrumentId() : null, false);
                if (strEZpvd != null) {
                    titleByIdAndType$default = strEZpvd;
                }
            } else {
                titleByIdAndType$default = C48914uef.getTitleByIdAndType$default(C48914uef.EZpvd, str, str2, false, false, getContext(), true, false, 76, null);
            }
            AYXKKw(titleByIdAndType$default);
            C38685peB c38685peBQwvEab = QwvEab();
            if (c38685peBQwvEab != null) {
                c38685peBQwvEab.AwvSrB();
            }
            OJuSTm();
            C32866mlf.onEvent$default("app_kline_page_view", (TrackChannel[]) null, new Function1() { // from class: o.pcY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38659pdc.KWHzl(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("biztype", str, true);
        return Unit.INSTANCE;
    }

    private final void DGgnkA() {
        BizInstrument bizInstrumentHDKMBd;
        androidx.fragment.app.Fragment fragment = this.dUDNAs;
        if (fragment == null || (bizInstrumentHDKMBd = hDKMBd()) == null) {
            return;
        }
        ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).EZpvd(fragment, bizInstrumentHDKMBd, this.QwvEab);
    }

    private final void KDccX() {
        C39828pzh c39828pzh;
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        ActivityResultCaller activityResultCaller;
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        InterfaceC54577xNn interfaceC54577xNn;
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA2;
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA3;
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA4;
        final C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            OLrzqt(c36250oUvQVAiDq);
            c36250oUvQVAiDq.AkhnZx().setMKlineAbstractType(1);
            c36250oUvQVAiDq.setIsSupportDoubleClick(true);
            c36250oUvQVAiDq.AkhnZx().setScreen(true);
            c36250oUvQVAiDq.AkhnZx().setChartMode(1);
            c36250oUvQVAiDq.post(new java.lang.Runnable() { // from class: o.pdO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC38659pdc.copydefault(this.EZpvd, c36250oUvQVAiDq);
                }
            });
        }
        C38685peB c38685peBQwvEab = QwvEab();
        if (c38685peBQwvEab != null) {
            c38685peBQwvEab.AwvSrB();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            oMO omo = this.QVsKAR;
            if (omo != null && (viewOnClickListenerC39742pyA4 = omo.AhwBna) != null) {
                viewOnClickListenerC39742pyA4.setRightToolMargin(0);
            }
            oMO omo2 = this.QVsKAR;
            if (omo2 != null && (viewOnClickListenerC39742pyA3 = omo2.AhwBna) != null) {
                viewOnClickListenerC39742pyA3.setDrawToolTopMargin(0);
            }
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || !interfaceC54577xNn.EZpvd()) {
                oMO omo3 = this.QVsKAR;
                if (omo3 != null && (viewOnClickListenerC39742pyA = omo3.AhwBna) != null) {
                    viewOnClickListenerC39742pyA.setDrawToolBottomMargin(C55298xhM.copydefault(154.0f, (android.content.Context) activity));
                }
            } else {
                oMO omo4 = this.QVsKAR;
                if (omo4 != null && (viewOnClickListenerC39742pyA2 = omo4.AhwBna) != null) {
                    viewOnClickListenerC39742pyA2.setDrawToolBottomMargin(C55298xhM.copydefault(198.0f, (android.content.Context) activity));
                }
            }
            C38685peB c38685peBQwvEab2 = QwvEab();
            if (c38685peBQwvEab2 != null) {
                c38685peBQwvEab2.iwGUEr();
            }
            if (!QKVWgx()) {
                if (this instanceof C55427xjj) {
                    activityResultCaller = this;
                } else {
                    androidx.fragment.app.Fragment parentFragment = getParentFragment();
                    while (parentFragment != null && !(parentFragment instanceof C55427xjj)) {
                        parentFragment = parentFragment.getParentFragment();
                    }
                    if (!(parentFragment instanceof C55427xjj)) {
                        parentFragment = null;
                    }
                    activityResultCaller = (C55427xjj) parentFragment;
                }
                C55427xjj c55427xjj = (C55427xjj) activityResultCaller;
                if (c55427xjj == null || !c55427xjj.gEmmrt) {
                    oMO omo5 = this.QVsKAR;
                    if (omo5 != null && (linearLayout2 = omo5.values) != null) {
                        linearLayout2.setVisibility(8);
                    }
                    oMO omo6 = this.QVsKAR;
                    if (omo6 != null && (linearLayout = omo6.fARcdN) != null) {
                        linearLayout.setVisibility(8);
                    }
                }
            }
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("kline_trade_point_click");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.pdM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.fJNWhG(this.KWHzl, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pdN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38659pdc.wlaJM(function1, obj);
            }
        });
        oMO omo7 = this.QVsKAR;
        if (omo7 != null && (c39828pzh = omo7.fIwbmz) != null) {
            c39828pzh.setOnItemSelectListener(new Function1() { // from class: o.pdP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38659pdc.EZpvd(this.EZpvd, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        C36250oUv c36250oUvQVAiDq2 = QVAiDq();
        TemplateSetting templateSettingWlaJM = c36250oUvQVAiDq2 != null ? c36250oUvQVAiDq2.wlaJM() : null;
        if (templateSettingWlaJM != null) {
            java.util.ArrayList<java.lang.String> mainIndicatorNames = templateSettingWlaJM.getMainIndicatorNames();
            Intrinsics.checkNotNullExpressionValue(mainIndicatorNames, "");
            java.util.ArrayList<java.lang.String> sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames();
            Intrinsics.checkNotNullExpressionValue(sideIndicatorNames, "");
            KWHzl(mainIndicatorNames, sideIndicatorNames);
        }
    }

    public static final void copydefault(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, C36250oUv c36250oUv) {
        viewOnClickListenerC38659pdc.QOLQEE().AEQbTJ(c36250oUv.getMeasuredHeight());
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fJNWhG(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.lang.String str) {
        viewOnClickListenerC38659pdc.EZpvd(1);
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, int i) {
        viewOnClickListenerC38659pdc.AYXKKw(i);
        return Unit.INSTANCE;
    }

    @Override // o.oYA, o.InterfaceC39502ptZ
    public void gEmmrt(java.lang.String str) {
        C38685peB c38685peBQwvEab = QwvEab();
        if (c38685peBQwvEab != null) {
            c38685peBQwvEab.copydefault(str);
        }
    }

    @Override // o.oYA, o.InterfaceC39502ptZ
    public void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C38685peB c38685peBQwvEab = QwvEab();
        if (c38685peBQwvEab != null) {
            c38685peBQwvEab.EZpvd(str);
        }
    }

    private final void AYXKKw(int i) {
        InterfaceC39509ptg interfaceC39509ptgDjBIcL;
        java.util.ArrayList<TimeIntervalItem> arrayListKWHzl;
        TimeIntervalItem timeIntervalItem;
        if (i == 4) {
            DGUQLI();
            C37908pFd.EZpvd(true);
            return;
        }
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq == null || (interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL()) == null || (arrayListKWHzl = interfaceC39509ptgDjBIcL.KWHzl()) == null || (timeIntervalItem = (TimeIntervalItem) CollectionsKt___CollectionsKt.AkhnZx(arrayListKWHzl, i)) == null) {
            return;
        }
        AuCTel(false);
        AYXKKw(false);
        oYA.changeTime$default(this, c36250oUvQVAiDq, timeIntervalItem, false, 4, null);
        C37908pFd.OLrzqt(timeIntervalItem.getTradingType(), true);
    }

    @Override // o.oYA
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        java.lang.Integer numValueOf;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        Intrinsics.checkNotNullParameter(str, "");
        TemplateSetting templateSettingGiSNqX = giSNqX();
        if (templateSettingGiSNqX != null) {
            C36250oUv c36250oUvQVAiDq = QVAiDq();
            if (Intrinsics.EZpvd((java.lang.Object) ((c36250oUvQVAiDq == null || (chartViewOutSideConfigAkhnZx3 = c36250oUvQVAiDq.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx3.getCurrentMode()), (java.lang.Object) "YScale")) {
                C36250oUv c36250oUvQVAiDq2 = QVAiDq();
                if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq2.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx2.setNeedUpdateInYScale(true);
                }
                C36250oUv c36250oUvQVAiDq3 = QVAiDq();
                if (c36250oUvQVAiDq3 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq3.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx.setMoveInterceptMode(" YUPDOWNMOVE");
                }
            }
            java.util.ArrayList<IndicatorDataReq> arrayList = new java.util.ArrayList<>();
            if (z) {
                int size = templateSettingGiSNqX.getSideIndicatorNames().size();
                if (size >= 4) {
                    java.util.ArrayList<java.lang.String> sideIndicatorNames = templateSettingGiSNqX.getSideIndicatorNames();
                    Intrinsics.checkNotNullExpressionValue(sideIndicatorNames, "");
                    java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(sideIndicatorNames);
                    if (str2 == null) {
                        str2 = "";
                    }
                    IndicatorDataReq indicatorDataReqCopydefault = copydefault(str2, false, false);
                    if (indicatorDataReqCopydefault != null) {
                        arrayList.add(indicatorDataReqCopydefault);
                    }
                }
                templateSettingGiSNqX.addSideIndicator(str);
                C36250oUv c36250oUvQVAiDq4 = QVAiDq();
                if (c36250oUvQVAiDq4 != null) {
                    c36250oUvQVAiDq4.copydefault(str);
                }
                C39263pox c39263poxAxsJAY = AxsJAY();
                java.util.ArrayList<java.lang.String> sideIndicatorNames2 = templateSettingGiSNqX.getSideIndicatorNames();
                Intrinsics.checkNotNullExpressionValue(sideIndicatorNames2, "");
                c39263poxAxsJAY.OLrzqt(this, sideIndicatorNames2, OcIXYQ(), ORxRYg(), templateSettingGiSNqX.getSPTimeInterval());
                if (size < 4 && DXXBbs()) {
                    this.UlJrfe += C36246oUr.copydefault().accept();
                    C36250oUv c36250oUvQVAiDq5 = QVAiDq();
                    if (c36250oUvQVAiDq5 != null) {
                        C36250oUv c36250oUvQVAiDq6 = QVAiDq();
                        numValueOf = c36250oUvQVAiDq6 != null ? java.lang.Integer.valueOf(c36250oUvQVAiDq6.getMinimumHeight() + C36246oUr.copydefault().accept()) : null;
                        Intrinsics.copydefault(numValueOf);
                        c36250oUvQVAiDq5.setMinimumHeight(numValueOf.intValue());
                    }
                }
            } else {
                templateSettingGiSNqX.removeSideIndicator(str);
                C36250oUv c36250oUvQVAiDq7 = QVAiDq();
                if (c36250oUvQVAiDq7 != null) {
                    c36250oUvQVAiDq7.gEmmrt(str);
                }
                C39263pox c39263poxAxsJAY2 = AxsJAY();
                java.util.ArrayList<java.lang.String> sideIndicatorNames3 = templateSettingGiSNqX.getSideIndicatorNames();
                Intrinsics.checkNotNullExpressionValue(sideIndicatorNames3, "");
                c39263poxAxsJAY2.OLrzqt(this, sideIndicatorNames3, OcIXYQ(), ORxRYg(), templateSettingGiSNqX.getSPTimeInterval());
                if (DXXBbs()) {
                    this.UlJrfe -= C36246oUr.copydefault().accept();
                    C36250oUv c36250oUvQVAiDq8 = QVAiDq();
                    if (c36250oUvQVAiDq8 != null) {
                        C36250oUv c36250oUvQVAiDq9 = QVAiDq();
                        numValueOf = c36250oUvQVAiDq9 != null ? java.lang.Integer.valueOf(c36250oUvQVAiDq9.getMinimumHeight() - C36246oUr.copydefault().accept()) : null;
                        Intrinsics.copydefault(numValueOf);
                        c36250oUvQVAiDq8.setMinimumHeight(numValueOf.intValue());
                    }
                }
            }
            UrRBLY();
            if (z) {
                IndicatorDataReq indicatorDataReqCopydefault2 = copydefault(str, z, false);
                if (indicatorDataReqCopydefault2 != null) {
                    arrayList.add(indicatorDataReqCopydefault2);
                }
                AhwBna(arrayList);
            }
        }
    }

    @Override // o.InterfaceC39502ptZ
    public void fERRXa() {
        InterfaceC39272ppF interfaceC39272ppF;
        WeakReference<InterfaceC39272ppF> weakReferenceAubY = AubY();
        if (weakReferenceAubY == null || (interfaceC39272ppF = weakReferenceAubY.get()) == null) {
            return;
        }
        InterfaceC39272ppF.ActionBar.setState$default(interfaceC39272ppF, KlineQuickOrderBottomSheetBehavior.States.STATE_COLLAPSED, false, 2, null);
    }

    @Override // o.oYA, o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd((DrawLineData.LineType) null);
        drawLineData.KWHzl((DrawLineData.DrawLineItem) null);
        fJNWhG(SPUtils.getBoolean("trade_button_left", true));
        htlTjW();
    }

    @Override // o.oYA
    public void hUfVAv() {
        C39828pzh c39828pzh;
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.QfsBiF();
        }
        oMO omo = this.QVsKAR;
        if (omo == null || (c39828pzh = omo.fIwbmz) == null) {
            return;
        }
        c39828pzh.setData();
    }

    @Override // o.oYA
    public void DarRvM() {
        super.DarRvM();
        OJuSTm();
        AEQbTJ(true);
        MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
        if (marketCoinInfoQbewEr != null) {
            oUJ.KWHzl.OLrzqt(marketCoinInfoQbewEr.getInstrumentId(), marketCoinInfoQbewEr.getInstrumentType());
        }
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            if (!C36246oUr.copydefault().zLjUOn().isScreenChange()) {
                copydefault(c36250oUvQVAiDq);
            }
            c36250oUvQVAiDq.AkhnZx().setMKlineAbstractType(1);
        }
    }

    public final void OJuSTm() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KLineQuotesFullScreenFragment$checkIsWatched$1(this, null), 3, null);
    }

    private final void fJNWhG(boolean z) {
        AppCompatImageView appCompatImageView;
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        AppCompatImageView appCompatImageView2;
        android.widget.LinearLayout linearLayout3;
        android.widget.LinearLayout linearLayout4;
        android.widget.LinearLayout linearLayout5;
        android.widget.LinearLayout linearLayout6;
        if (QKVWgx()) {
            oMO omo = this.QVsKAR;
            if (omo != null && (linearLayout6 = omo.values) != null) {
                linearLayout6.setVisibility(8);
            }
            oMO omo2 = this.QVsKAR;
            if (omo2 == null || (linearLayout5 = omo2.fARcdN) == null) {
                return;
            }
            linearLayout5.setVisibility(8);
            return;
        }
        if (z) {
            oMO omo3 = this.QVsKAR;
            if (omo3 != null && (linearLayout4 = omo3.values) != null) {
                linearLayout4.setVisibility(0);
            }
            oMO omo4 = this.QVsKAR;
            if (omo4 != null && (linearLayout3 = omo4.fARcdN) != null) {
                linearLayout3.setVisibility(8);
            }
            oMO omo5 = this.QVsKAR;
            if (omo5 == null || (appCompatImageView2 = omo5.iwGUEr) == null) {
                return;
            }
            appCompatImageView2.setVisibility(C36236oUh.EZpvd.isConnected() ? 0 : 8);
            return;
        }
        oMO omo6 = this.QVsKAR;
        if (omo6 != null && (linearLayout2 = omo6.values) != null) {
            linearLayout2.setVisibility(8);
        }
        oMO omo7 = this.QVsKAR;
        if (omo7 != null && (linearLayout = omo7.fARcdN) != null) {
            linearLayout.setVisibility(0);
        }
        oMO omo8 = this.QVsKAR;
        if (omo8 == null || (appCompatImageView = omo8.hDKMBd) == null) {
            return;
        }
        appCompatImageView.setVisibility(C36236oUh.EZpvd.isConnected() ? 0 : 8);
    }

    @Override // o.InterfaceC39502ptZ
    public void isConnected(boolean z) {
        if (isAdded()) {
            QOLQEE().AEQbTJ(z);
        }
    }

    @Override // o.InterfaceC39502ptZ
    public void KWHzl(int i, boolean z) {
        C38685peB c38685peBQwvEab = QwvEab();
        if (c38685peBQwvEab != null) {
            c38685peBQwvEab.EZpvd(z);
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
        this.fERRXa = marketTopInfo;
        C38685peB c38685peBQwvEab = QwvEab();
        if (c38685peBQwvEab != null) {
            c38685peBQwvEab.AEQbTJ(marketTopInfo);
        }
    }

    @Override // o.oYA, o.InterfaceC39563puh.Application
    public void gwTjWJ() {
        android.widget.LinearLayout linearLayout;
        oMO omo = this.QVsKAR;
        if (omo != null && (linearLayout = omo.DbNXlk) != null) {
            linearLayout.setVisibility(0);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (QKVWgx()) {
                ((ActivityC39220poG) activity).gEmmrt();
            } else {
                ((ActivityC38834pgs) activity).OLrzqt();
            }
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010a  */
    @Override // o.InterfaceC39563puh.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AYXKKw(@NotNull java.util.List<? extends oLY> list) {
        oLY oly;
        BizInstrument bizInstrumentValueOf;
        AbstractC54531xLw abstractC54531xLwFARcdN;
        Intrinsics.checkNotNullParameter(list, "");
        AkhnZx();
        if (!C55608xnE.OLrzqt() && this.hrNTAI && C33512mxp.AEQbTJ.AYXKKw() == 1) {
            DGOPHZ();
            this.hrNTAI = false;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (QKVWgx()) {
                ((ActivityC39220poG) activity).gEmmrt();
            } else {
                ((ActivityC38834pgs) activity).OLrzqt();
            }
        }
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.AEQbTJ(list);
        }
        C36250oUv c36250oUvQVAiDq2 = QVAiDq();
        if (c36250oUvQVAiDq2 != null) {
            c36250oUvQVAiDq2.setShowEmptyUi(false);
        }
        OxVOHk();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        if (C36246oUr.copydefault().zLjUOn().isCeFiMCapMode() || (oly = (oLY) CollectionsKt___CollectionsKt.wlaJM(list)) == null) {
            return;
        }
        AbstractC54531xLw abstractC54531xLwFARcdN2 = fARcdN();
        if (abstractC54531xLwFARcdN2 != null) {
            MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
            java.lang.String instrumentId = marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null;
            Intrinsics.copydefault((java.lang.Object) instrumentId);
            bizInstrumentValueOf = abstractC54531xLwFARcdN2.valueOf(instrumentId);
        } else {
            bizInstrumentValueOf = null;
        }
        java.lang.String instFamily = bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstFamily() : null;
        Intrinsics.copydefault((java.lang.Object) instFamily);
        MarketTopInfo marketTopInfo = this.fERRXa;
        if (marketTopInfo == null || (abstractC54531xLwFARcdN = fARcdN()) == null || !Intrinsics.EZpvd((java.lang.Object) aKErDB(), (java.lang.Object) "TYPE_KLINE")) {
            return;
        }
        MarketCoinInfo marketCoinInfoQbewEr2 = QbewEr();
        java.lang.String instrumentType = marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentType() : null;
        if (instrumentType != null) {
            switch (instrumentType.hashCode()) {
                case -2027980370:
                    if (instrumentType.equals("MARGIN")) {
                        marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLwFARcdN.gEmmrt(instFamily).AYXKKw(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AEQbTJ))).djBIcL().AEQbTJ(true), false, 1, null));
                    }
                    break;
                case 2552066:
                    if (instrumentType.equals("SPOT")) {
                    }
                    break;
                case 2558355:
                    if (instrumentType.equals("SWAP")) {
                        marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLwFARcdN.gEmmrt(instFamily).AYXKKw(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AEQbTJ))).AkhnZx().isConnected().AEQbTJ(true).djBIcL(), false, 1, null));
                    }
                    break;
                case 214415088:
                    if (instrumentType.equals("FUTURES")) {
                    }
                    break;
            }
        }
        AEQbTJ(marketTopInfo);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oYl.executeScreenChangeMove$default(o.oYl, o.oUv, long, com.okinc.kline.data.KlineTimeAnchorType, long, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public final void OxVOHk() {
        if (AwvSrB().getValue().copydefault()) {
            AwvSrB().getValue().KWHzl(false);
            KlineChangeScreenVo klineChangeScreenVoKWHzl = AwvSrB().getValue().KWHzl();
            if (klineChangeScreenVoKWHzl != null) {
                zLjUOn().AEQbTJ(QVAiDq(), klineChangeScreenVoKWHzl.getFirstCandleTime(), (8 & 4) != 0 ? KlineTimeAnchorType.AnchorLeft : KlineTimeAnchorType.AnchorLeft, (8 & 8) != 0 ? 0L : 0L, (Function0<Unit>) ((8 & 16) != 0 ? null : new Function0() { // from class: o.peh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ViewOnClickListenerC38659pdc.getFieldNames(this.OLrzqt);
                    }
                }), (Function0<Unit>) ((8 & 32) != 0 ? null : new Function0() { // from class: o.pei
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ViewOnClickListenerC38659pdc.iwGUEr(this.AEQbTJ);
                    }
                }));
            } else {
                startPostponedEnterTransition();
            }
        }
    }

    public static final Unit getFieldNames(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc) {
        if (!viewOnClickListenerC38659pdc.QSLkRj) {
            viewOnClickListenerC38659pdc.startPostponedEnterTransition();
            viewOnClickListenerC38659pdc.QSLkRj = true;
        }
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc) {
        viewOnClickListenerC38659pdc.startPostponedEnterTransition();
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39502ptZ
    public void DGOPHZ() {
        if (isResumed() && getParentFragmentManager().findFragmentById(C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1) == null) {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new KLineQuotesFullScreenFragment$showQuartzCSATFragment$1(this, null));
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void AhwBna(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.KWHzl(list);
        }
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && (!list.isEmpty())) {
            KWHzl(C56405yEd.hDKMBd(list));
        }
        fdOvFl();
    }

    @Override // o.oYA, o.InterfaceC39563puh.Application
    public void valueOf(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.OLrzqt(list);
        }
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && (!list.isEmpty())) {
            KWHzl(C56405yEd.hDKMBd(list));
        }
        fdOvFl();
    }

    public final void fdOvFl() {
        TemplateSetting templateSettingGiSNqX = giSNqX();
        if (templateSettingGiSNqX != null) {
            C39263pox c39263poxAxsJAY = AxsJAY();
            java.util.ArrayList<java.lang.String> sideIndicatorNames = templateSettingGiSNqX.getSideIndicatorNames();
            Intrinsics.checkNotNullExpressionValue(sideIndicatorNames, "");
            c39263poxAxsJAY.OLrzqt(this, sideIndicatorNames, OcIXYQ(), ORxRYg(), templateSettingGiSNqX.getSPTimeInterval());
        }
    }

    @Override // o.oYA
    public void EZpvd(@NotNull MarketCoinInfo marketCoinInfo) {
        Intrinsics.checkNotNullParameter(marketCoinInfo, "");
        copydefault(marketCoinInfo);
        MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
        AEQbTJ(marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null);
        MarketCoinInfo marketCoinInfoQbewEr2 = QbewEr();
        AhwBna(marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentType() : null);
        OJuSTm();
    }

    @Override // o.oYA
    public void OLrzqt(java.lang.String str, java.lang.String str2) {
        super.OLrzqt(str, str2);
        hCLrkq();
    }

    @Override // o.oYA, o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        super.onPause();
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) == null) {
            return;
        }
        chartViewOutSideConfigAkhnZx.setShowPriceType(false);
    }

    private final void DGUQLI() {
        C39339pqT c39339pqTNewInstance$default = C39339pqT.TaskDescription.newInstance$default(C39339pqT.Companion, true, false, 2, null);
        c39339pqTNewInstance$default.OLrzqt(new Function1() { // from class: o.pdD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.EZpvd(this.AEQbTJ, (MarketTypeSelect) obj);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.lang.String simpleName = ViewOnClickListenerC38659pdc.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        c39339pqTNewInstance$default.EZpvd(childFragmentManager, simpleName);
        c39339pqTNewInstance$default.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.pdC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                ViewOnClickListenerC38659pdc.OLrzqt(this.EZpvd, dialogInterface);
            }
        });
    }

    public static final Unit EZpvd(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            viewOnClickListenerC38659pdc.AuCTel(false);
            viewOnClickListenerC38659pdc.AYXKKw(false);
            java.lang.Object data = marketTypeSelect.getData();
            Intrinsics.copydefault(data, "");
            oYA.changeTime$default(viewOnClickListenerC38659pdc, c36250oUvQVAiDq, (TimeIntervalItem) data, false, 4, null);
            java.lang.Object data2 = marketTypeSelect.getData();
            Intrinsics.copydefault(data2, "");
            C37908pFd.OLrzqt(((TimeIntervalItem) data2).getTradingType(), true);
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, android.content.DialogInterface dialogInterface) {
        C39828pzh c39828pzh;
        oMO omo = viewOnClickListenerC38659pdc.QVsKAR;
        if (omo == null || (c39828pzh = omo.fIwbmz) == null) {
            return;
        }
        c39828pzh.setData();
    }

    private final void heceqZ() {
        TemplateSetting templateSettingGiSNqX = giSNqX();
        if (templateSettingGiSNqX == null || templateSettingGiSNqX.getSideIndicatorNames() == null) {
            return;
        }
        C39358pqm.TaskDescription taskDescription = C39358pqm.Companion;
        java.lang.String strORxRYg = ORxRYg();
        if (strORxRYg == null) {
            strORxRYg = "";
        }
        C39358pqm c39358pqmNewInstance$default = C39358pqm.TaskDescription.newInstance$default(taskDescription, false, strORxRYg, 1, null);
        c39358pqmNewInstance$default.AEQbTJ(new Function1() { // from class: o.pdQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.copydefault(this.copydefault, (MarketTypeSelect) obj);
            }
        });
        c39358pqmNewInstance$default.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.pdR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                ViewOnClickListenerC38659pdc.copydefault(this.EZpvd, dialogInterface);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.lang.String simpleName = ViewOnClickListenerC38659pdc.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        c39358pqmNewInstance$default.EZpvd(childFragmentManager, simpleName);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pFd.indicatorSelectFragmentEvent$default(java.lang.String, boolean, boolean, boolean, java.lang.Boolean, int, java.lang.Object):void */
    public static final Unit copydefault(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        if (Intrinsics.EZpvd((java.lang.Object) marketTypeSelect.getSelectTypeName(), (java.lang.Object) "VOLUME") && !Intrinsics.EZpvd((java.lang.Object) viewOnClickListenerC38659pdc.aKErDB(), (java.lang.Object) "TYPE_KLINE")) {
            return Unit.INSTANCE;
        }
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            viewOnClickListenerC38659pdc.KWHzl(c36250oUvQVAiDq, marketTypeSelect);
        }
        C37908pFd.indicatorSelectFragmentEvent$default(marketTypeSelect.getSelectTypeName(), marketTypeSelect.isSelect(), marketTypeSelect.getGroup() == 0, true, null, 16, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, android.content.DialogInterface dialogInterface) {
        C39828pzh c39828pzh;
        C36250oUv c36250oUvQVAiDq;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        C36250oUv c36250oUvQVAiDq2 = viewOnClickListenerC38659pdc.QVAiDq();
        if (Intrinsics.EZpvd((java.lang.Object) ((c36250oUvQVAiDq2 == null || (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq2.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx2.getCurrentMode()), (java.lang.Object) "YScale") && (c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq()) != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setNeedUpdateInYScale(false);
        }
        oMO omo = viewOnClickListenerC38659pdc.QVsKAR;
        if (omo == null || (c39828pzh = omo.fIwbmz) == null) {
            return;
        }
        c39828pzh.setData();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        InterfaceC39499ptW interfaceC39499ptWIsConnected;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54577xNn interfaceC54577xNn3;
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C35964oKf.StateListAnimator.keyboardTargetTextChanged;
        if (numValueOf != null && numValueOf.intValue() == i) {
            InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM2 != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn.EZpvd()) {
                C32866mlf.onEvent$default("app_demo_trading_chart_button_click", (TrackChannel[]) null, new Function1() { // from class: o.pek
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC38659pdc.AEQbTJ(this.copydefault, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            }
            if (isConnected() == null || (interfaceC39499ptWIsConnected = isConnected()) == null) {
                return;
            }
            interfaceC39499ptWIsConnected.AYXKKw();
            return;
        }
        int i2 = C35964oKf.StateListAnimator.QUSxYX;
        if (numValueOf == null || numValueOf.intValue() != i2) {
            int i3 = C35964oKf.StateListAnimator.aKErDB;
            if (numValueOf == null || numValueOf.intValue() != i3) {
                int i4 = C35964oKf.StateListAnimator.getFlags;
                if (numValueOf == null || numValueOf.intValue() != i4) {
                    int i5 = C35964oKf.StateListAnimator.toString;
                    if (numValueOf == null || numValueOf.intValue() != i5) {
                        int i6 = C35964oKf.StateListAnimator.newArray;
                        if (numValueOf == null || numValueOf.intValue() != i6) {
                            int i7 = C35964oKf.StateListAnimator.MediaBrowserCompatServiceBinderWrapper;
                            if (numValueOf == null || numValueOf.intValue() != i7) {
                                int i8 = C35964oKf.StateListAnimator.alsFma;
                                if (numValueOf == null || numValueOf.intValue() != i8) {
                                    int i9 = C35964oKf.StateListAnimator.akftKQ;
                                    if (numValueOf == null || numValueOf.intValue() != i9) {
                                        return;
                                    }
                                }
                                spnCvw();
                                EventParamsList eventParamsList = new EventParamsList();
                                eventParamsList.put("button_type", "setting", true);
                                eventParamsList.put("chart_layout", "fullscreen", true);
                                Unit unit = Unit.INSTANCE;
                                C32866mlf.onEvent$default("KLine_Btm_Button_Click", "Click", "Button", eventParamsList, null, null, 24, null);
                                return;
                            }
                        }
                        heceqZ();
                        EventParamsList eventParamsList2 = new EventParamsList();
                        eventParamsList2.put("button_type", "indicator", true);
                        eventParamsList2.put("chart_layout", "fullscreen", true);
                        Unit unit2 = Unit.INSTANCE;
                        C32866mlf.onEvent$default("KLine_Btm_Button_Click", "Click", "Button", eventParamsList2, null, null, 24, null);
                        pXB.klineClickTrack$default(pXB.EZpvd, "Kline_Bottom_Full_Screen_Indicate_Click", null, 2, null);
                        return;
                    }
                }
                WS();
                UlJrfe();
                return;
            }
        }
        pFP pfp = pFP.OLrzqt;
        java.lang.String strORxRYg = ORxRYg();
        if (strORxRYg == null) {
            strORxRYg = "";
        }
        if (pfp.copydefault(strORxRYg)) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C35964oKf.Fragment.gZKUVK), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        InterfaceC49425uoM interfaceC49425uoM3 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if ((interfaceC49425uoM3 != null && (interfaceC54577xNn3 = (InterfaceC54577xNn) interfaceC49425uoM3.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn3.KWHzl()) || ((interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) != null && (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn2.EZpvd())) {
            DcqEDu();
        } else {
            igXuih();
        }
        EventParamsList eventParamsList3 = new EventParamsList();
        eventParamsList3.put("button_type", ExtJson.BRC20TYPE_TRADE, true);
        eventParamsList3.put("chart_layout", "fullscreen", true);
        Unit unit3 = Unit.INSTANCE;
        C32866mlf.onEvent$default("KLine_Btm_Button_Click", "Click", "Button", eventParamsList3, null, null, 24, null);
        pXB.klineClickTrack$default(pXB.EZpvd, "Kline_Bottom_Full_Screen_Trade_Click", null, 2, null);
        C37908pFd.copydefault(false);
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, EventParamsList eventParamsList) {
        java.lang.String instrumentId;
        java.lang.String strDjBIcL;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(BotWebHook.KEY_ACTION, "back", false);
        InterfaceC39499ptW interfaceC39499ptWIsConnected = viewOnClickListenerC38659pdc.isConnected();
        if (interfaceC39499ptWIsConnected != null && (strDjBIcL = interfaceC39499ptWIsConnected.djBIcL()) != null) {
            eventParamsList.put("type", strDjBIcL, false);
        }
        MarketCoinInfo marketCoinInfoQbewEr = viewOnClickListenerC38659pdc.QbewEr();
        if (marketCoinInfoQbewEr != null && (instrumentId = marketCoinInfoQbewEr.getInstrumentId()) != null) {
            str = instrumentId;
        }
        eventParamsList.put("pair", str, false);
        return Unit.INSTANCE;
    }

    public final void spnCvw() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new KLineQuotesFullScreenFragment$showChartSetting$1(this, null));
    }

    public final void QVsKAR() {
        C36312oXc c36312oXcRcXXUw = RcXXUw();
        if (c36312oXcRcXXUw == null || !(c36312oXcRcXXUw.isConnected() instanceof C36315oXf)) {
            return;
        }
        c36312oXcRcXXUw.EZpvd(c36312oXcRcXXUw.wlaJM);
    }

    /* JADX INFO: renamed from: o.pdc$SharedElementCallback */
    public static final class SharedElementCallback implements InterfaceC35983oKy {
        public SharedElementCallback() {
        }

        @Override // o.InterfaceC35983oKy
        public void OLrzqt() {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            final boolean z = SPUtils.getBoolean("hide_kline_drawing_data", false);
            boolean z2 = !z;
            SPUtils.put("hide_kline_drawing_data", java.lang.Boolean.valueOf(z2));
            C36250oUv c36250oUvQVAiDq = ViewOnClickListenerC38659pdc.this.QVAiDq();
            if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMHideKlineDrawingData(z2);
            }
            C36250oUv c36250oUvQVAiDq2 = ViewOnClickListenerC38659pdc.this.QVAiDq();
            if (c36250oUvQVAiDq2 != null) {
                c36250oUvQVAiDq2.invalidate();
            }
            if (!z) {
                DrawLineData.copydefault.KWHzl((DrawLineData.DrawLineItem) null);
                C36312oXc c36312oXcRcXXUw = ViewOnClickListenerC38659pdc.this.RcXXUw();
                if (c36312oXcRcXXUw != null) {
                    c36312oXcRcXXUw.AEQbTJ(true);
                }
                ViewOnClickListenerC38659pdc.this.htlTjW();
                ViewOnClickListenerC38659pdc.this.QkdxfA();
                C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C35964oKf.Fragment.RSmiaq), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            }
            C32866mlf.onEvent$default("KLine_DrawingToolSidebar_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pet
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38659pdc.SharedElementCallback.EZpvd(z, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }

        public static final Unit EZpvd(boolean z, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("app_drawing_tool_type", !z ? "hide" : "show", true);
            eventParamsList.put("terminal", "app", true);
            eventParamsList.put("chart_type", "original", true);
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC35983oKy
        public void KWHzl() {
            ViewOnClickListenerC38659pdc.this.QCjLjM();
        }

        @Override // o.InterfaceC35983oKy
        public void copydefault() {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            java.util.ArrayList<DrawLineData.DrawLineItem> linesList;
            ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
            LinkedHashMap<java.lang.String, ChartArea> linkedHashMapValues;
            ChartArea chartArea;
            java.util.HashMap<java.lang.String, oWN> mapZLjUOn;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx4;
            java.util.ArrayList<DrawLineData.DrawLineItem> linesList2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx5;
            C36250oUv c36250oUvQVAiDq = ViewOnClickListenerC38659pdc.this.QVAiDq();
            if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx5 = c36250oUvQVAiDq.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx5.setDrawing(true);
            }
            C36312oXc c36312oXcRcXXUw = ViewOnClickListenerC38659pdc.this.RcXXUw();
            if (c36312oXcRcXXUw != null) {
                c36312oXcRcXXUw.AEQbTJ(true);
            }
            C36250oUv c36250oUvQVAiDq2 = ViewOnClickListenerC38659pdc.this.QVAiDq();
            if (c36250oUvQVAiDq2 == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq2.AkhnZx()) == null || (linesList = chartViewOutSideConfigAkhnZx.getLinesList()) == null) {
                return;
            }
            final Function1 function1 = new Function1() { // from class: o.peu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(ViewOnClickListenerC38659pdc.SharedElementCallback.OLrzqt((DrawLineData.DrawLineItem) obj));
                }
            };
            linesList.removeIf(new java.util.function.Predicate() { // from class: o.pev
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    return ViewOnClickListenerC38659pdc.SharedElementCallback.KWHzl(function1, obj);
                }
            });
            ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = ViewOnClickListenerC38659pdc.this;
            C36250oUv c36250oUvQVAiDq3 = viewOnClickListenerC38659pdc.QVAiDq();
            oWN own = null;
            if (((c36250oUvQVAiDq3 == null || (chartViewOutSideConfigAkhnZx4 = c36250oUvQVAiDq3.AkhnZx()) == null || (linesList2 = chartViewOutSideConfigAkhnZx4.getLinesList()) == null) ? 0 : linesList2.size()) >= C37895pEr.copydefault.EZpvd() && !SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C35964oKf.Fragment.gCNefq), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                DrawLineData drawLineData = DrawLineData.copydefault;
                drawLineData.EZpvd((DrawLineData.LineType) null);
                drawLineData.KWHzl((DrawLineData.DrawLineItem) null);
                return;
            }
            C36250oUv c36250oUvQVAiDq4 = viewOnClickListenerC38659pdc.QVAiDq();
            if (c36250oUvQVAiDq4 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq4.AkhnZx()) != null && chartViewOutSideConfigAkhnZx2.getMHideKlineDrawingData()) {
                C36250oUv c36250oUvQVAiDq5 = viewOnClickListenerC38659pdc.QVAiDq();
                if (c36250oUvQVAiDq5 != null && (chartViewOutSideConfigAkhnZx3 = c36250oUvQVAiDq5.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx3.setMHideKlineDrawingData(false);
                }
                SPUtils.put("hide_kline_drawing_data", java.lang.Boolean.FALSE);
            }
            C36250oUv c36250oUvQVAiDq6 = viewOnClickListenerC38659pdc.QVAiDq();
            if (c36250oUvQVAiDq6 != null && (mapZLjUOn = c36250oUvQVAiDq6.zLjUOn()) != null) {
                own = mapZLjUOn.get("ds0");
            }
            if (own != null) {
                C36250oUv c36250oUvQVAiDq7 = viewOnClickListenerC38659pdc.QVAiDq();
                int iDjBIcL = 100;
                int measuredWidth = (c36250oUvQVAiDq7 != null ? c36250oUvQVAiDq7.getMeasuredWidth() : 100) / 2;
                C36250oUv c36250oUvQVAiDq8 = viewOnClickListenerC38659pdc.QVAiDq();
                if (c36250oUvQVAiDq8 != null && (linkedHashMapValues = c36250oUvQVAiDq8.values()) != null && (chartArea = linkedHashMapValues.get("ds0.m")) != null) {
                    iDjBIcL = chartArea.djBIcL();
                }
                own.KWHzl(measuredWidth, iDjBIcL / 2);
                C36250oUv c36250oUvQVAiDq9 = viewOnClickListenerC38659pdc.QVAiDq();
                if (c36250oUvQVAiDq9 != null) {
                    c36250oUvQVAiDq9.invalidate();
                }
                oMO omo = viewOnClickListenerC38659pdc.QVsKAR;
                if (omo == null || (viewOnClickListenerC39742pyA = omo.AhwBna) == null) {
                    return;
                }
                viewOnClickListenerC39742pyA.AYXKKw();
                return;
            }
            pUU.copydefault("ChartView", "timeline is null");
        }

        public static final boolean KWHzl(Function1 function1, java.lang.Object obj) {
            return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
        }

        public static final boolean OLrzqt(DrawLineData.DrawLineItem drawLineItem) {
            Intrinsics.checkNotNullParameter(drawLineItem, "");
            return drawLineItem.isDelete();
        }
    }

    public final void WS() {
        java.lang.String instrumentId;
        java.lang.String instrumentType;
        ViewOnClickListenerC39282ppP.ActionBar actionBar = ViewOnClickListenerC39282ppP.Companion;
        MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
        java.lang.String str = "";
        if (marketCoinInfoQbewEr == null || (instrumentId = marketCoinInfoQbewEr.getInstrumentId()) == null) {
            instrumentId = "";
        }
        MarketCoinInfo marketCoinInfoQbewEr2 = QbewEr();
        if (marketCoinInfoQbewEr2 != null && (instrumentType = marketCoinInfoQbewEr2.getInstrumentType()) != null) {
            str = instrumentType;
        }
        ViewOnClickListenerC39282ppP viewOnClickListenerC39282ppPCopydefault = actionBar.copydefault(instrumentId, str);
        viewOnClickListenerC39282ppPCopydefault.AEQbTJ(new SharedElementCallback());
        try {
            if (!isAdded() || getChildFragmentManager().isStateSaved() || getChildFragmentManager().isDestroyed()) {
                return;
            }
            viewOnClickListenerC39282ppPCopydefault.show(getChildFragmentManager(), ViewOnClickListenerC38659pdc.class.getSimpleName());
        } catch (java.lang.Exception e) {
            pUU.copydefault("KLineQuotesFullScreenFragment", "Error showDrawingToolDialog: " + e.getMessage());
        }
    }

    private final void DcqEDu() {
        java.lang.String str;
        MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
        java.lang.String instrumentId = marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null;
        C48914uef c48914uef = C48914uef.EZpvd;
        MarketCoinInfo marketCoinInfoQbewEr2 = QbewEr();
        int iOLrzqt = c48914uef.OLrzqt(marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentType() : null);
        java.lang.String strUzCIH = QUSxYX().OLrzqt().uzCIH();
        QUSxYX().AEQbTJ(true);
        java.lang.String strOLrzqt = ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).OLrzqt();
        java.lang.String str2 = this.OHqIaq;
        if (str2 == null || str2.length() == 0) {
            str = this.OxVOHk;
        } else {
            str = this.OHqIaq + "&tag=" + getFieldNames();
        }
        java.lang.String str3 = strOLrzqt + "?bizType=" + iOLrzqt + "&instId=" + instrumentId + "&fromPageSession=" + strUzCIH + "&from=kline_page&fromPageSubSource=icon_trade&fromPageSource=" + str;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, str3, null, new Function1() { // from class: o.pdX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38659pdc.AEQbTJ((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final java.lang.String isConnected(java.lang.String str) {
        java.lang.String strReplace$default;
        if (str == null || (strReplace$default = C59449zhJ.replace$default(str, "-", "_", false, 4, (java.lang.Object) null)) == null) {
            return null;
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = strReplace$default.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public final void igXuih() {
        MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
        java.lang.String instrumentType = marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentType() : null;
        if (Intrinsics.EZpvd((java.lang.Object) instrumentType, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) instrumentType, (java.lang.Object) "MARGIN")) {
            MarketCoinInfo marketCoinInfoQbewEr2 = QbewEr();
            java.lang.String strIsConnected = isConnected(marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentId() : null);
            if (strIsConnected == null) {
                C55326xho.toast$default(getResources().getString(C35964oKf.Fragment.ORmwhf), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return;
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).KWHzl(activity, "main/spot/buy", C56423yEv.EZpvd(C56390yDp.OLrzqt("Constant.SYMBOL", strIsConnected)), new Function1() { // from class: o.pec
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC38659pdc.KWHzl((AbstractC43238rlX) obj);
                    }
                });
            }
        }
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DsrFlB() {
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.QfsBiF();
        }
        C36250oUv c36250oUvQVAiDq2 = QVAiDq();
        if (c36250oUvQVAiDq2 != null) {
            c36250oUvQVAiDq2.invalidate();
        }
    }

    public final void djBIcL(int i) {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oMO omo = this.QVsKAR;
        if (omo == null || (viewOnClickListenerC39742pyA = omo.AhwBna) == null) {
            return;
        }
        viewOnClickListenerC39742pyA.setImageBackground(i);
    }

    public final void EZpvd(double d, double d2) {
        oMO omo;
        C39805pzK c39805pzK;
        C39805pzK c39805pzK2;
        oMO omo2 = this.QVsKAR;
        if (omo2 != null && (c39805pzK2 = omo2.AuCTel) != null) {
            c39805pzK2.setVisibility(0);
        }
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq == null || (omo = this.QVsKAR) == null || (c39805pzK = omo.AuCTel) == null) {
            return;
        }
        c39805pzK.setBitmapAndPos(c36250oUvQVAiDq, d, d2);
    }

    public final void fjfviF() {
        C39805pzK c39805pzK;
        oMO omo = this.QVsKAR;
        if (omo == null || (c39805pzK = omo.AuCTel) == null) {
            return;
        }
        c39805pzK.setVisibility(8);
    }

    public final void DCUTEIddSDPG() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oMO omo = this.QVsKAR;
        if (omo == null || (viewOnClickListenerC39742pyA = omo.AhwBna) == null) {
            return;
        }
        viewOnClickListenerC39742pyA.gEmmrt();
    }

    public final void DCUTEIdCUTEI() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oMO omo = this.QVsKAR;
        if (omo == null || (viewOnClickListenerC39742pyA = omo.AhwBna) == null) {
            return;
        }
        viewOnClickListenerC39742pyA.copydefault();
    }

    public final void htlTjW() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oMO omo = this.QVsKAR;
        if (omo != null && (viewOnClickListenerC39742pyA = omo.AhwBna) != null) {
            viewOnClickListenerC39742pyA.setVisibility(8);
        }
        Dmq();
    }

    public final void Dmq() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oMO omo = this.QVsKAR;
        if (omo == null || (viewOnClickListenerC39742pyA = omo.AhwBna) == null) {
            return;
        }
        viewOnClickListenerC39742pyA.djBIcL();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2268=6] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void zblBkD() {
        DrawLineData drawLineData = DrawLineData.copydefault;
        final DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
        if (drawLineItemIsConnected != null) {
            java.lang.String strOcIXYQ = OcIXYQ();
            if (strOcIXYQ == null) {
                strOcIXYQ = "";
            }
            drawLineItemIsConnected.setContract(strOcIXYQ);
            java.lang.String strORxRYg = ORxRYg();
            if (strORxRYg != null) {
                switch (strORxRYg.hashCode()) {
                    case -2027980370:
                        if (strORxRYg.equals("MARGIN")) {
                            drawLineItemIsConnected.setKlineType(4);
                        }
                        break;
                    case -1956807563:
                        if (strORxRYg.equals("OPTION")) {
                            drawLineItemIsConnected.setKlineType(5);
                        }
                        break;
                    case 2552066:
                        if (strORxRYg.equals("SPOT")) {
                            drawLineItemIsConnected.setKlineType(3);
                        }
                        break;
                    case 2558355:
                        if (strORxRYg.equals("SWAP")) {
                            drawLineItemIsConnected.setKlineType(1);
                        }
                        break;
                    case 69808306:
                        if (strORxRYg.equals("INDEX")) {
                            drawLineItemIsConnected.setKlineType(0);
                        }
                        break;
                    case 214415088:
                        if (strORxRYg.equals("FUTURES")) {
                            drawLineItemIsConnected.setKlineType(2);
                        }
                        break;
                }
            }
            drawLineData.AEQbTJ(EZpvd(drawLineData.EZpvd(), drawLineItemIsConnected.getIndexId()));
            drawLineData.EZpvd().add(drawLineItemIsConnected);
            drawLineData.EZpvd(drawLineData.EZpvd());
            C31947mJv c31947mJv = new C31947mJv();
            java.lang.String strOcIXYQ2 = OcIXYQ();
            AbstractC58260yxt<java.util.List<DrawingDataEntity>> abstractC58260yxtCopydefault = c31947mJv.copydefault(strOcIXYQ2 != null ? strOcIXYQ2 : "");
            if (abstractC58260yxtCopydefault != null) {
                final Function1 function1 = new Function1() { // from class: o.pdU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC38659pdc.copydefault(this.copydefault, drawLineItemIsConnected, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super java.util.List<DrawingDataEntity>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.peb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ViewOnClickListenerC38659pdc.zsXlph(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.pej
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC38659pdc.EZpvd((java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.peo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ViewOnClickListenerC38659pdc.AxsJAY(function12, obj);
                    }
                });
            }
            drawLineData.AEQbTJ(new Function1() { // from class: o.pel
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38659pdc.AEQbTJ(this.EZpvd, (java.util.ArrayList) obj);
                }
            });
        }
    }

    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, DrawLineData.DrawLineItem drawLineItem, java.util.List list) {
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            DrawingDataBean drawingDataBean = new DrawingDataBean(null, null, null, 7, null);
            drawingDataBean.setLines((java.util.ArrayList) new Gson().fromJson(((DrawingDataEntity) list.get(0)).getLines(), new Fragment().getType()));
            java.util.ArrayList<DrawLineData.DrawLineItem> arrayListEZpvd = viewOnClickListenerC38659pdc.EZpvd(C37897pEt.KWHzl.copydefault(drawingDataBean), drawLineItem.getIndexId());
            C37895pEr c37895pEr = C37895pEr.copydefault;
            java.lang.String strOcIXYQ = viewOnClickListenerC38659pdc.OcIXYQ();
            if (strOcIXYQ == null) {
                strOcIXYQ = "";
            }
            c37895pEr.AEQbTJ(arrayListEZpvd, "0", strOcIXYQ, viewOnClickListenerC38659pdc.fvQaOB(), viewOnClickListenerC38659pdc.gasjUx());
        }
        return Unit.INSTANCE;
    }

    public static final void AxsJAY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.util.ArrayList arrayList) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        java.util.ArrayList<DrawLineData.DrawLineItem> linesList;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        final Function1 function1 = new Function1() { // from class: o.pdF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(ViewOnClickListenerC38659pdc.EZpvd((DrawLineData.DrawLineItem) obj));
            }
        };
        arrayList.removeIf(new java.util.function.Predicate() { // from class: o.pdG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return ViewOnClickListenerC38659pdc.AwvSrB(function1, obj);
            }
        });
        int size = arrayList.size();
        C37895pEr c37895pEr = C37895pEr.copydefault;
        int size2 = 0;
        if (size <= c37895pEr.EZpvd()) {
            C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
            if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null && (linesList = chartViewOutSideConfigAkhnZx.getLinesList()) != null) {
                size2 = linesList.size();
            }
            if (size2 > c37895pEr.EZpvd()) {
                C31947mJv c31947mJv = new C31947mJv();
                java.lang.String strOcIXYQ = viewOnClickListenerC38659pdc.OcIXYQ();
                AbstractC58260yxt<java.util.List<DrawingDataEntity>> abstractC58260yxtCopydefault = c31947mJv.copydefault(strOcIXYQ != null ? strOcIXYQ : "");
                if (abstractC58260yxtCopydefault != null) {
                    final Function1 function12 = new Function1() { // from class: o.pdE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ViewOnClickListenerC38659pdc.AkhnZx(this.KWHzl, (java.util.List) obj);
                        }
                    };
                    InterfaceC58227yxM<? super java.util.List<DrawingDataEntity>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.pdK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            ViewOnClickListenerC38659pdc.gHZMYf(function12, obj);
                        }
                    };
                    final Function1 function13 = new Function1() { // from class: o.pdJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ViewOnClickListenerC38659pdc.AhwBna((java.lang.Throwable) obj);
                        }
                    };
                    abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.pdI
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            ViewOnClickListenerC38659pdc.sSMYrx(function13, obj);
                        }
                    });
                }
            }
        } else {
            if (arrayList.size() > 1) {
                C56407yEf.copydefault(arrayList, new FragmentManager());
            }
            DrawLineData drawLineData = DrawLineData.copydefault;
            drawLineData.EZpvd().remove(CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList));
            drawLineData.EZpvd(drawLineData.EZpvd());
            arrayList.remove(0);
            C36250oUv c36250oUvQVAiDq2 = viewOnClickListenerC38659pdc.QVAiDq();
            if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setLinesList(arrayList);
            }
            C36250oUv c36250oUvQVAiDq3 = viewOnClickListenerC38659pdc.QVAiDq();
            if (c36250oUvQVAiDq3 != null) {
                c36250oUvQVAiDq3.invalidate();
            }
        }
        return Unit.INSTANCE;
    }

    public static final boolean AwvSrB(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean EZpvd(DrawLineData.DrawLineItem drawLineItem) {
        Intrinsics.checkNotNullParameter(drawLineItem, "");
        return drawLineItem.isDelete();
    }

    public static final void gHZMYf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AkhnZx(final ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.util.List list) {
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            DrawingDataBean drawingDataBean = new DrawingDataBean(null, null, null, 7, null);
            drawingDataBean.setLines((java.util.ArrayList) new Gson().fromJson(((DrawingDataEntity) list.get(0)).getLines(), new PendingIntent().getType()));
            final java.util.ArrayList<DrawLineData.DrawLineItem> arrayListCopydefault = C37897pEt.KWHzl.copydefault(drawingDataBean);
            if (arrayListCopydefault.size() > 1) {
                C56407yEf.copydefault(arrayListCopydefault, new VoiceInteractor());
            }
            DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayListCopydefault);
            drawLineItem.setDelete(true);
            DrawLineData drawLineData = DrawLineData.copydefault;
            drawLineData.EZpvd().add(drawLineItem);
            drawLineData.EZpvd(drawLineData.EZpvd());
            arrayListCopydefault.remove(0);
            C37895pEr c37895pEr = C37895pEr.copydefault;
            java.lang.String strOcIXYQ = viewOnClickListenerC38659pdc.OcIXYQ();
            if (strOcIXYQ == null) {
                strOcIXYQ = "";
            }
            c37895pEr.AEQbTJ(arrayListCopydefault, "0", strOcIXYQ, viewOnClickListenerC38659pdc.fvQaOB(), viewOnClickListenerC38659pdc.gasjUx());
            drawLineData.AEQbTJ(new Function1() { // from class: o.ped
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38659pdc.KWHzl(arrayListCopydefault, viewOnClickListenerC38659pdc, (java.util.ArrayList) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.util.ArrayList arrayList, ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, java.util.ArrayList arrayList2) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Intrinsics.checkNotNullParameter(arrayList2, "");
        arrayList.addAll(arrayList2);
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setLinesList(arrayList);
        }
        C36250oUv c36250oUvQVAiDq2 = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq2 != null) {
            c36250oUvQVAiDq2.invalidate();
        }
        return Unit.INSTANCE;
    }

    public static final void sSMYrx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void saveCurrentDrawingKline$default(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, DrawLineData.DrawLineItem drawLineItem, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        viewOnClickListenerC38659pdc.KWHzl(drawLineItem, z);
    }

    public final void KWHzl(DrawLineData.DrawLineItem drawLineItem, boolean z) {
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
            oYA.uploadDrawingData$default(this, yDY.copydefault(drawLineItem), z, false, 4, null);
        } else {
            zblBkD();
        }
    }

    public final void QCjLjM() {
        if (ejfBZ() == null) {
            return;
        }
        android.content.Context contextEjfBZ = ejfBZ();
        Intrinsics.copydefault(contextEjfBZ);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextEjfBZ);
        viewOnClickListenerC54939xaY.EZpvd(getString(C35964oKf.Fragment.Ufzxmz));
        java.lang.String string = getString(C35964oKf.Fragment.igXuih);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.pda
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ViewOnClickListenerC38659pdc.KWHzl(this.OLrzqt, viewOnClickListenerC54939xaY, view);
            }
        });
        java.lang.String string2 = getString(C35964oKf.Fragment.dYepVG);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY.AEQbTJ(string2, (View.OnClickListener) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        java.util.ArrayList<DrawLineData.DrawLineItem> linesList;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        java.util.ArrayList<DrawLineData.DrawLineItem> linesList2;
        java.lang.String coinId;
        java.lang.Integer type;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        java.util.ArrayList<DrawLineData.DrawLineItem> linesList3;
        java.util.HashMap<java.lang.String, oWN> mapZLjUOn;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx4;
        java.util.ArrayList<DrawLineData.DrawLineItem> linesList4;
        DrawLineData drawLineData = DrawLineData.copydefault;
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayListFetchVPNInfo = drawLineData.fetchVPNInfo();
        if (arrayListFetchVPNInfo.size() > C37895pEr.copydefault.EZpvd()) {
            drawLineData.EZpvd().removeAll(arrayListFetchVPNInfo);
        } else {
            if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
                C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
                if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx3 = c36250oUvQVAiDq.AkhnZx()) != null && (linesList3 = chartViewOutSideConfigAkhnZx3.getLinesList()) != null) {
                    oYA.uploadDrawingData$default(viewOnClickListenerC38659pdc, linesList3, true, false, 4, null);
                }
            } else {
                C36250oUv c36250oUvQVAiDq2 = viewOnClickListenerC38659pdc.QVAiDq();
                if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq2.AkhnZx()) != null && (linesList2 = chartViewOutSideConfigAkhnZx2.getLinesList()) != null) {
                    for (DrawLineData.DrawLineItem drawLineItem : linesList2) {
                        oUJ ouj = oUJ.KWHzl;
                        DrawLineBean drawLineBeanAEQbTJ = ouj.AEQbTJ();
                        if (drawLineBeanAEQbTJ == null || (coinId = drawLineBeanAEQbTJ.getCoinId()) == null) {
                            coinId = "";
                        }
                        drawLineItem.setContract(coinId);
                        DrawLineBean drawLineBeanAEQbTJ2 = ouj.AEQbTJ();
                        drawLineItem.setKlineType((drawLineBeanAEQbTJ2 == null || (type = drawLineBeanAEQbTJ2.getType()) == null) ? 0 : type.intValue());
                        drawLineItem.setDelete(true);
                    }
                }
                C36250oUv c36250oUvQVAiDq3 = viewOnClickListenerC38659pdc.QVAiDq();
                if (c36250oUvQVAiDq3 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq3.AkhnZx()) != null && (linesList = chartViewOutSideConfigAkhnZx.getLinesList()) != null) {
                    DrawLineData drawLineData2 = DrawLineData.copydefault;
                    drawLineData2.EZpvd().removeAll(linesList);
                    drawLineData2.EZpvd().addAll(linesList);
                }
                DrawLineData drawLineData3 = DrawLineData.copydefault;
                drawLineData3.EZpvd(drawLineData3.EZpvd());
            }
            java.lang.String strOcIXYQ = viewOnClickListenerC38659pdc.OcIXYQ();
            viewOnClickListenerC38659pdc.EZpvd(strOcIXYQ != null ? strOcIXYQ : "");
        }
        C36250oUv c36250oUvQVAiDq4 = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq4 != null && (chartViewOutSideConfigAkhnZx4 = c36250oUvQVAiDq4.AkhnZx()) != null && (linesList4 = chartViewOutSideConfigAkhnZx4.getLinesList()) != null) {
            linesList4.clear();
        }
        C36312oXc c36312oXcRcXXUw = viewOnClickListenerC38659pdc.RcXXUw();
        if (c36312oXcRcXXUw != null) {
            c36312oXcRcXXUw.AEQbTJ(true);
        }
        C36250oUv c36250oUvQVAiDq5 = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq5 != null) {
            c36250oUvQVAiDq5.invalidate();
        }
        viewOnClickListenerC54939xaY.dismiss();
        C36250oUv c36250oUvQVAiDq6 = viewOnClickListenerC38659pdc.QVAiDq();
        oWN own = (c36250oUvQVAiDq6 == null || (mapZLjUOn = c36250oUvQVAiDq6.zLjUOn()) == null) ? null : mapZLjUOn.get("ds0");
        if (own != null) {
            own.AwvSrB();
        }
        DrawLineData.copydefault.EZpvd((DrawLineData.LineType) null);
        viewOnClickListenerC38659pdc.htlTjW();
        viewOnClickListenerC38659pdc.QkdxfA();
    }

    @Override // o.oYA
    public void dHguZz() {
        super.dHguZz();
        C38685peB c38685peBQwvEab = QwvEab();
        if (c38685peBQwvEab != null) {
            c38685peBQwvEab.AwvSrB();
        }
    }

    public final C38685peB QwvEab() {
        if (getActivity() instanceof ActivityC38834pgs) {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            return ((ActivityC38834pgs) activity).valueOf();
        }
        FragmentActivity activity2 = getActivity();
        ActivityC39220poG activityC39220poG = activity2 instanceof ActivityC39220poG ? (ActivityC39220poG) activity2 : null;
        if (activityC39220poG != null) {
            return activityC39220poG.fIwbmz();
        }
        return null;
    }

    public final java.util.ArrayList<DrawLineData.DrawLineItem> EZpvd(java.util.ArrayList<DrawLineData.DrawLineItem> arrayList, java.lang.String str) {
        int i = 0;
        int i2 = -1;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (Intrinsics.EZpvd((java.lang.Object) ((DrawLineData.DrawLineItem) obj).getIndexId(), (java.lang.Object) str)) {
                i2 = i;
            }
            i++;
        }
        if (i2 > -1) {
            arrayList.remove(i2);
        }
        return arrayList;
    }
}
