package o;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.db.bean.DrawingDataEntity;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.DrawLineBean;
import com.okinc.kline.data.DrawingDataBean;
import com.okinc.kline.data.DrawingLinesData;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.library.tradingview.TradingViewManager;
import com.okinc.kline.ui.MarketKlineLandScapeFragment$checkAuction$1$2$1$1$result$1$1;
import com.okinc.kline.ui.MarketKlineLandScapeFragment$checkPreQuote$1$2$1$1$result$1$1;
import com.okinc.kline.ui.MarketKlineLandScapeFragment$initLandView$10$1;
import com.okinc.kline.ui.MarketKlineLandScapeFragment$showSearchPopupWindow$1;
import com.okinc.kline.ui.view.model.IndicatorDataReq;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.okinc.kline.ui.viewmodel.KlineHeaderViewModel;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradelite.bean.TradeLoadingMode;
import com.okinc.unified.BusinessType;
import com.okinc.unified.shared.CeDeFiSharedViewModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CallAuctionInfoData;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.PreQuoteInfoData;
import com.okinc.unify_trade.biz.SystemTimeData;
import com.okinc.unify_trade.constants.MarketTypeEnum;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.C35964oKf;
import o.C36250oUv;
import o.C36327oXr;
import o.C38795pgF;
import o.C52761wXj;
import o.InterfaceC39563puh;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pgF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38795pgF extends AbstractC38564pbn {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gwTjWJ = 8;
    public static final java.lang.String hrNTAI = "isFromNormal";
    public android.widget.TextView DBxZfM;
    public AbstractC55757xpv DCUTEIdCUTEI;
    public android.widget.LinearLayout DCUTEIddSDPG;
    public android.widget.FrameLayout DGOPHZ;
    public android.widget.TextView DGOPHZDGOPHZ;
    public android.widget.TextView DGUQLI;
    public android.widget.TextView DGgnkA;
    public BizInstrument DLWbHP;
    public android.webkit.WebChromeClient DNMMPQ;
    public MarketTopInfo DWgRXt;
    public C39805pzK DaRZkR;
    public AbstractC55759xpx DcqEDu;
    public C39782pyo Dmq;
    public android.widget.TextView DsrFlB;
    public android.widget.RelativeLayout KDccX;
    public ConstraintLayout ODXsMY;
    public android.widget.ScrollView OFhtUX;
    public int OHqIaq;
    public android.widget.ImageView OJuSTm;
    public android.widget.TextView OTwTPd;
    public ViewOnClickListenerC39742pyA OxVOHk;
    public final InterfaceC56387yDm QCjLjM;
    public int QDqgQU;
    public android.widget.RelativeLayout QIZEnU;
    public boolean QSLkRj;
    public DrawerLayout QVsKAR;
    public int QXDzTk;
    public android.widget.TextView QwvEab;
    public final InterfaceC56387yDm RKcVTr;
    public C39837pzq RVsVBY;
    public android.widget.TextView RXzakW;
    public Group TarCU;
    public C38780pfr USBtdM;
    public android.view.View Ufzxmz;
    public android.view.View UhxbNG;
    public android.widget.LinearLayout UlJrfe;
    public C39835pzo UrRBLY;
    public android.widget.ImageView WS;
    public android.widget.ImageView aUsmxb;
    public ConstraintLayout call;
    public C38768pff dUDNAs;
    public android.widget.LinearLayout fERRXa;
    public android.widget.RelativeLayout fHqPtx;
    public android.widget.LinearLayout fdOvFl;
    public android.widget.TextView fjfviF;
    public android.widget.TextView hCLrkq;
    public android.widget.RelativeLayout heceqZ;
    public android.widget.TextView htlTjW;
    public android.widget.TextView igXuih;
    public ViewOnClickListenerC39746pyE ixgjPv;
    public android.widget.ImageView spnCvw;
    public java.lang.String run = "";
    public boolean zblBkD = true;

    /* JADX INFO: renamed from: o.pgF$BroadcastReceiver */
    public static final class BroadcastReceiver extends TypeToken<java.util.ArrayList<DrawingLinesData>> {
    }

    /* JADX INFO: renamed from: o.pgF$ComponentCallbacks */
    public static final /* synthetic */ class ComponentCallbacks implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.pgF$ComponentName */
    public static final class ComponentName extends TypeToken<java.util.ArrayList<DrawingLinesData>> {
    }

    @Override // o.oYA
    public boolean ODWQjV() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.iRxXKY;
    }

    /* JADX INFO: renamed from: o.pgF$ClipData */
    public static final class ClipData<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    /* JADX INFO: renamed from: o.pgF$Context */
    public static final class Context<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    /* JADX INFO: renamed from: o.pgF$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C38795pgF OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C38795pgF c38795pgF) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c38795pgF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (((android.widget.TextView) this.KWHzl).isSelected()) {
                    return;
                }
                this.OLrzqt.isConnected(true);
                this.OLrzqt.AYXKKw(true);
                C36250oUv c36250oUvQfsBiF = this.OLrzqt.QfsBiF();
                if (c36250oUvQfsBiF != null) {
                    oYA.changeTime$default(this.OLrzqt, c36250oUvQfsBiF, new TimeIntervalItem(-2, "index-candle1m", "candle1m", "mark-price-candle1m", "-2"), false, 4, null);
                }
                C32866mlf.onEvent$default("Chart_MarketCap_Chart_Click", (TrackChannel[]) null, PictureInPictureParams.copydefault, 1, (java.lang.Object) null);
            }
        }
    }

    public C38795pgF() {
        final Function0 function0 = null;
        this.RKcVTr = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CeDeFiSharedViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketKlineLandScapeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketKlineLandScapeFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketKlineLandScapeFragment$special$$inlined$activityViewModels$default$3
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
        this.QCjLjM = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(KlineHeaderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketKlineLandScapeFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketKlineLandScapeFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketKlineLandScapeFragment$special$$inlined$activityViewModels$default$6
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

    private final CeDeFiSharedViewModel WS() {
        return (CeDeFiSharedViewModel) this.RKcVTr.getValue();
    }

    public final KlineHeaderViewModel USBtdM() {
        return (KlineHeaderViewModel) this.QCjLjM.getValue();
    }

    /* JADX INFO: renamed from: o.pgF$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pgF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C38795pgF newInstance$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            boolean z4 = (i & 4) != 0 ? true : z;
            if ((i & 8) != 0) {
                z2 = false;
            }
            return actionBar.EZpvd(str, str2, z4, z2, (i & 16) != 0 ? true : z3);
        }

        public final C38795pgF EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C38795pgF c38795pgF = new C38795pgF();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(oLT.gEmmrt(), str);
            bundle.putString(oLT.valueOf(), str2);
            bundle.putBoolean(C38795pgF.hrNTAI, z);
            bundle.putBoolean("is_CR_Mode", z2);
            bundle.putBoolean(c38795pgF.wlaJM(), z3);
            c38795pgF.setArguments(bundle);
            return c38795pgF;
        }
    }

    @Override // o.oYA, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        pXB.registerTradeFragmentTrack$default(pXB.EZpvd, this, "MarketKlineLandScapeFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.oYA, o.AbstractC32998moE
    public void onVisible() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        super.onVisible();
        if (!pFS.KWHzl.KWHzl(getParentFragment()) || QKVWgx()) {
            C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
            EZpvd(C36312oXc.AEQbTJ(QfsBiF()));
            C36250oUv c36250oUvQfsBiF = QfsBiF();
            if (c36250oUvQfsBiF != null) {
                c36250oUvQfsBiF.setCurrentStateMachine(RcXXUw());
            }
        }
        C36250oUv c36250oUvQfsBiF2 = QfsBiF();
        if (c36250oUvQfsBiF2 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQfsBiF2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx2.setPortraitChart(false);
        }
        C36250oUv c36250oUvQfsBiF3 = QfsBiF();
        if (c36250oUvQfsBiF3 == null || (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF3.AkhnZx()) == null) {
            return;
        }
        chartViewOutSideConfigAkhnZx.setCanShowQuickOrder(false);
    }

    @Override // o.oYA, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd(drawLineData.EZpvd());
        fjfviF();
        DCUTEIdCUTEI();
    }

    @Override // o.oYA
    public void AxsJAYsNCnLh() {
        android.view.ViewTreeObserver viewTreeObserver;
        super.AxsJAYsNCnLh();
        C39835pzo c39835pzo = this.UrRBLY;
        if (c39835pzo == null || (viewTreeObserver = c39835pzo.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new PendingIntent());
    }

    /* JADX INFO: renamed from: o.pgF$PendingIntent */
    public static final class PendingIntent implements ViewTreeObserver.OnGlobalLayoutListener {
        public PendingIntent() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            TemplateSetting templateSettingWlaJM;
            java.util.ArrayList<java.lang.String> sideIndicatorNames;
            android.view.ViewTreeObserver viewTreeObserver;
            android.view.ViewTreeObserver viewTreeObserver2;
            if (C38795pgF.this.getContext() == null) {
                C39835pzo c39835pzo = C38795pgF.this.UrRBLY;
                if (c39835pzo == null || (viewTreeObserver2 = c39835pzo.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
                return;
            }
            C33566myq c33566myq = C33566myq.EZpvd;
            android.content.Context context = C38795pgF.this.getContext();
            Intrinsics.copydefault(context);
            int iOLrzqt = c33566myq.OLrzqt(context);
            android.content.Context context2 = C38795pgF.this.getContext();
            Intrinsics.copydefault(context2);
            int iEZpvd = c33566myq.EZpvd(context2);
            C39835pzo c39835pzo2 = C38795pgF.this.UrRBLY;
            java.lang.Integer numValueOf = c39835pzo2 != null ? java.lang.Integer.valueOf(c39835pzo2.getMeasuredHeight()) : null;
            C39835pzo c39835pzo3 = C38795pgF.this.UrRBLY;
            java.lang.Integer numValueOf2 = c39835pzo3 != null ? java.lang.Integer.valueOf(c39835pzo3.getMeasuredWidth()) : null;
            int size = 0;
            if (iOLrzqt > iEZpvd) {
                C38795pgF.this.QDqgQU = C33129mqd.AhwBna(java.lang.Double.valueOf(((double) iEZpvd) * 0.75d));
            } else {
                C38795pgF.this.QDqgQU = numValueOf != null ? numValueOf.intValue() : 0;
            }
            Objects.toString(numValueOf);
            Objects.toString(numValueOf2);
            C39835pzo c39835pzo4 = C38795pgF.this.UrRBLY;
            if (c39835pzo4 != null && (viewTreeObserver = c39835pzo4.getViewTreeObserver()) != null) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            C36250oUv c36250oUvQfsBiF = C38795pgF.this.QfsBiF();
            if (c36250oUvQfsBiF != null && (templateSettingWlaJM = c36250oUvQfsBiF.wlaJM()) != null && (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) != null) {
                size = sideIndicatorNames.size();
            }
            int iAKErDB = size > 1 ? C38795pgF.this.QDqgQU + (C36246oUr.copydefault().aKErDB() * (size - 1)) : C38795pgF.this.QDqgQU;
            C36250oUv c36250oUvQfsBiF2 = C38795pgF.this.QfsBiF();
            if (c36250oUvQfsBiF2 != null) {
                c36250oUvQfsBiF2.setMinimumHeight(iAKErDB);
            }
        }
    }

    @Override // o.oYA, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        this.zblBkD = arguments != null ? arguments.getBoolean(hrNTAI, true) : true;
        android.os.Bundle arguments2 = getArguments();
        gEmmrt(arguments2 != null && arguments2.getBoolean("is_CR_Mode", false));
        super.initView(view, bundle);
        this.igXuih = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.hwXsuq);
        this.fjfviF = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.UCQKYV);
        this.QwvEab = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.izFvvl);
        this.htlTjW = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.ilfrrN);
        this.QVsKAR = (DrawerLayout) view.findViewById(C35964oKf.StateListAnimator.DcMfJK);
        this.DaRZkR = (C39805pzK) view.findViewById(C35964oKf.StateListAnimator.validateSHA256);
        this.fERRXa = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.fJk);
        this.QIZEnU = (android.widget.RelativeLayout) view.findViewById(C35964oKf.StateListAnimator.UkvvWh);
        this.OFhtUX = (android.widget.ScrollView) view.findViewById(C35964oKf.StateListAnimator.hDKMBd);
        this.RVsVBY = (C39837pzq) view.findViewById(C35964oKf.StateListAnimator.sJqpAA);
        this.call = (ConstraintLayout) view.findViewById(C35964oKf.StateListAnimator.hrnhsO);
        this.WS = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.RcLksq);
        this.DBxZfM = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.QfgJNx);
        this.RXzakW = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.getString);
        this.OTwTPd = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.ahrCSq);
        this.DGgnkA = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.aSdHwS);
        this.hCLrkq = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.RAaltf);
        this.UlJrfe = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.HJWChPhFGucI);
        this.DGOPHZDGOPHZ = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.DvMhtu);
        this.DGUQLI = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.dPaqAf);
        this.KDccX = (android.widget.RelativeLayout) view.findViewById(C35964oKf.StateListAnimator.dXhJGx);
        this.spnCvw = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.registerKeyboardTarget);
        this.DsrFlB = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.RgaQzq);
        AEQbTJ((C39756pyO) view.findViewById(C35964oKf.StateListAnimator.addPreRequisiteCollector));
        this.fHqPtx = (android.widget.RelativeLayout) view.findViewById(C35964oKf.StateListAnimator.QTtQrx);
        this.heceqZ = (android.widget.RelativeLayout) view.findViewById(C35964oKf.StateListAnimator.fruYXx);
        this.ixgjPv = (ViewOnClickListenerC39746pyE) view.findViewById(C35964oKf.StateListAnimator.OtRJxF);
        this.DCUTEIddSDPG = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.SFHvfS);
        this.DGOPHZ = (android.widget.FrameLayout) view.findViewById(C35964oKf.StateListAnimator.QhsCdE);
        this.UhxbNG = view.findViewById(C35964oKf.StateListAnimator.onPrepare);
        this.Dmq = (C39782pyo) view.findViewById(C35964oKf.StateListAnimator.OeZisf);
        this.fdOvFl = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.dGrqPl);
        this.OJuSTm = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.RLmrWm);
        this.aUsmxb = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.sElUiK);
        this.ODXsMY = (ConstraintLayout) view.findViewById(C35964oKf.StateListAnimator.DGUQLIekVPG);
        this.UrRBLY = (C39835pzo) view.findViewById(C35964oKf.StateListAnimator.OhRmUC);
        this.OxVOHk = (ViewOnClickListenerC39742pyA) view.findViewById(C35964oKf.StateListAnimator.DTeKQX);
        this.TarCU = (Group) view.findViewById(C35964oKf.StateListAnimator.dump);
        if (QbewEr() != null) {
            QwvEab();
        }
        if (!OqFWZa()) {
            AYXKKw(new java.util.ArrayList());
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.QXDzTk = C55298xhM.copydefault(48.0f, contextRequireContext);
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        this.OHqIaq = C55298xhM.copydefault(10.0f, contextRequireContext2);
        android.widget.ImageView imageView = this.OJuSTm;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.phb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C38795pgF.values(this.KWHzl, view2);
                }
            });
        }
        android.widget.ImageView imageView2 = this.aUsmxb;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.phh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C38795pgF.AkhnZx(this.KWHzl, view2);
                }
            });
        }
        C39835pzo c39835pzo = this.UrRBLY;
        if (c39835pzo != null) {
            c39835pzo.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.pho
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(android.view.View view2, int i, int i2, int i3, int i4) {
                    C38795pgF.EZpvd(this.copydefault, view2, i, i2, i3, i4);
                }
            });
        }
        android.widget.TextView textViewDvKsVJ = dvKsVJ();
        if (textViewDvKsVJ != null) {
            textViewDvKsVJ.setOnClickListener(new VoiceInteractor(textViewDvKsVJ, 500L, this));
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("kline_drawing_data_upload");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.phl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38795pgF.AkhnZx(this.KWHzl, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.phn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38795pgF.AubY(function1, obj);
            }
        });
        C36250oUv c36250oUvQfsBiF = QfsBiF();
        if (c36250oUvQfsBiF != null) {
            c36250oUvQfsBiF.setDrawingFinishListener(new C36250oUv.TaskDescription() { // from class: o.phk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.TaskDescription
                public final void AEQbTJ() {
                    C38795pgF.hDKMBd(this.KWHzl);
                }
            });
            c36250oUvQfsBiF.setKlineEventClickListener(new C36250oUv.FragmentManager() { // from class: o.phq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.FragmentManager
                public final void onEventClick(oLS ols) {
                    C38795pgF.KWHzl(this.KWHzl, ols);
                }
            });
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("candleSelected");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ2, this);
        final Function1 function12 = new Function1() { // from class: o.php
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38795pgF.valueOf(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pht
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38795pgF.zsXlph(function12, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ3 = RxBus.AEQbTJ("candleUnSelected");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ3, "");
        AbstractC58185ywX abstractC58185ywXEZpvd3 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ3, this);
        final Function1 function13 = new Function1() { // from class: o.phr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38795pgF.AhwBna(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.phd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38795pgF.AuCTelauCTel(function13, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ4 = RxBus.AEQbTJ("NEW_COIN_ONLINE_STATUS_UPDATE");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ4, "");
        AbstractC58185ywX abstractC58185ywXEZpvd4 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ4, this);
        final Function1 function14 = new Function1() { // from class: o.phi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38795pgF.values(this.OLrzqt, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd4.AEQbTJ(new InterfaceC58227yxM() { // from class: o.phg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38795pgF.wlaJM(function14, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ5 = RxBus.AEQbTJ("NEW_CONTRACT_ONLINE_STATUS_UPDATE");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ5, "");
        AbstractC58185ywX abstractC58185ywXEZpvd5 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ5, this);
        final Function1 function15 = new Function1() { // from class: o.phf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38795pgF.fetchVPNInfo(this.EZpvd, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd5.AEQbTJ(new InterfaceC58227yxM() { // from class: o.phj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38795pgF.AuCTel(function15, obj);
            }
        });
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = this.OxVOHk;
        if (viewOnClickListenerC39742pyA != null) {
            viewOnClickListenerC39742pyA.setClickListener(new AssistContent());
        }
        run();
        fHqPtx();
    }

    public static final void values(C38795pgF c38795pgF, android.view.View view) {
        if (c38795pgF.finit() instanceof C36327oXr) {
            InterfaceC36254oUz interfaceC36254oUzFinit = c38795pgF.finit();
            Intrinsics.copydefault(interfaceC36254oUzFinit, "");
            ((C36327oXr) interfaceC36254oUzFinit).loadUrl("javascript:window.tvWidget.chart().executeActionById('insertIndicator')");
        }
    }

    public static final void AkhnZx(C38795pgF c38795pgF, android.view.View view) {
        if (c38795pgF.finit() instanceof C36327oXr) {
            InterfaceC36254oUz interfaceC36254oUzFinit = c38795pgF.finit();
            Intrinsics.copydefault(interfaceC36254oUzFinit, "");
            ((C36327oXr) interfaceC36254oUzFinit).loadUrl("javascript:window.tvWidget.chart().executeActionById('chartProperties')");
        }
    }

    public static final void EZpvd(C38795pgF c38795pgF, android.view.View view, int i, int i2, int i3, int i4) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF == null || (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF.AkhnZx()) == null) {
            return;
        }
        chartViewOutSideConfigAkhnZx.setLandscapeKLineScrollY(i2);
    }

    /* JADX INFO: renamed from: o.pgF$PictureInPictureParams */
    public static final class PictureInPictureParams implements Function1<EventParamsList, Unit> {
        public static final PictureInPictureParams copydefault = new PictureInPictureParams();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AkhnZx(C38795pgF c38795pgF, java.lang.String str) {
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayList;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
        if (drawLineItemIsConnected != null) {
            if (drawLineItemIsConnected.getIndexId().length() == 0) {
                drawLineItemIsConnected.setIndexId(C37897pEt.KWHzl.copydefault(java.lang.System.currentTimeMillis()));
            }
            if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
                C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
                if (c36250oUvQfsBiF == null || (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF.AkhnZx()) == null || (arrayList = chartViewOutSideConfigAkhnZx.getLinesList()) == null) {
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
                    c38795pgF.copydefault(arrayList2, true, true);
                } else {
                    oYA.uploadDrawingData$default(c38795pgF, yDY.copydefault(drawLineItemIsConnected), false, false, 6, null);
                }
            } else {
                c38795pgF.DGOPHZ();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void hDKMBd(C38795pgF c38795pgF) {
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE = c38795pgF.ixgjPv;
        if (viewOnClickListenerC39746pyE != null) {
            viewOnClickListenerC39746pyE.AEQbTJ();
        }
        c38795pgF.DcqEDu();
    }

    public static final void KWHzl(C38795pgF c38795pgF, oLS ols) {
        c38795pgF.djBIcL(ols.OLrzqt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(C38795pgF c38795pgF, java.lang.String str) {
        ConstraintLayout constraintLayout = c38795pgF.ODXsMY;
        if (constraintLayout != null) {
            constraintLayout.setClipChildren(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(C38795pgF c38795pgF, java.lang.String str) {
        java.util.HashMap<java.lang.String, oWN> mapZLjUOn;
        ConstraintLayout constraintLayout = c38795pgF.ODXsMY;
        if (constraintLayout != null) {
            constraintLayout.setClipChildren(true);
        }
        C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF != null && (mapZLjUOn = c36250oUvQfsBiF.zLjUOn()) != null) {
            C36250oUv c36250oUvQfsBiF2 = c38795pgF.QfsBiF();
            oWN own = mapZLjUOn.get(c36250oUvQfsBiF2 != null ? c36250oUvQfsBiF2.fIwbmz() : null);
            if (own != null) {
                own.AYXKKw();
            }
        }
        C36250oUv c36250oUvQfsBiF3 = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF3 != null) {
            c36250oUvQfsBiF3.copydefault();
        }
        C36250oUv c36250oUvQfsBiF4 = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF4 != null) {
            c36250oUvQfsBiF4.invalidate();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit values(C38795pgF c38795pgF, java.lang.String str) {
        c38795pgF.EZpvd(c38795pgF.fARcdN());
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fetchVPNInfo(C38795pgF c38795pgF, java.lang.String str) {
        c38795pgF.EZpvd(c38795pgF.fARcdN());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pgF$AssistContent */
    public static final class AssistContent implements InterfaceC35982oKx {
        public AssistContent() {
        }

        @Override // o.InterfaceC35982oKx
        public void copydefault() {
            DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
            if (drawLineItemIsConnected != null) {
                C38795pgF.saveCurrentDrawingKline$default(C38795pgF.this, drawLineItemIsConnected, false, 2, null);
            }
            C36250oUv c36250oUvQfsBiF = C38795pgF.this.QfsBiF();
            if (c36250oUvQfsBiF != null) {
                c36250oUvQfsBiF.invalidate();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void OLrzqt() {
            DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
            if (drawLineItemIsConnected != null) {
                C38795pgF.saveCurrentDrawingKline$default(C38795pgF.this, drawLineItemIsConnected, false, 2, null);
            }
            C36250oUv c36250oUvQfsBiF = C38795pgF.this.QfsBiF();
            if (c36250oUvQfsBiF != null) {
                c36250oUvQfsBiF.invalidate();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void AEQbTJ() {
            DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
            if (drawLineItemIsConnected != null) {
                C38795pgF.saveCurrentDrawingKline$default(C38795pgF.this, drawLineItemIsConnected, false, 2, null);
            }
            C36250oUv c36250oUvQfsBiF = C38795pgF.this.QfsBiF();
            if (c36250oUvQfsBiF != null) {
                c36250oUvQfsBiF.invalidate();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void EZpvd() {
            C38795pgF.this.DWgRXt();
        }

        @Override // o.InterfaceC35982oKx
        public void AYXKKw() {
            DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
            if (drawLineItemIsConnected != null) {
                C38795pgF c38795pgF = C38795pgF.this;
                if (drawLineItemIsConnected.getLocked()) {
                    drawLineItemIsConnected.setLineLocked(false);
                } else {
                    drawLineItemIsConnected.setLineLocked(true);
                }
                C38795pgF.saveCurrentDrawingKline$default(c38795pgF, drawLineItemIsConnected, false, 2, null);
            }
            InterfaceC39499ptW interfaceC39499ptWIsConnected = C38795pgF.this.isConnected();
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
                C38795pgF c38795pgF = C38795pgF.this;
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
                    c38795pgF.AEQbTJ(drawLineItemIsConnected, true);
                    drawLineData.EZpvd().remove(drawLineItemIsConnected);
                    drawLineData.EZpvd(drawLineData.EZpvd());
                } else {
                    drawLineData.EZpvd().remove(drawLineItemIsConnected);
                    drawLineData.EZpvd().add(drawLineItemIsConnected);
                    drawLineData.EZpvd(drawLineData.EZpvd());
                }
            }
            InterfaceC39499ptW interfaceC39499ptWIsConnected = C38795pgF.this.isConnected();
            if (interfaceC39499ptWIsConnected != null) {
                interfaceC39499ptWIsConnected.DbNXlk();
            }
        }
    }

    private final void fHqPtx() {
        QOLQEE().AhwBna().observe(getViewLifecycleOwner(), new ComponentCallbacks(new Function1() { // from class: o.phC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38795pgF.copydefault(this.copydefault, (Unit) obj);
            }
        }));
        QOLQEE().copydefault().observe(getViewLifecycleOwner(), new ComponentCallbacks(new Function1() { // from class: o.phB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38795pgF.AEQbTJ(this.AEQbTJ, (java.lang.Integer) obj);
            }
        }));
    }

    public static final Unit copydefault(C38795pgF c38795pgF, Unit unit) {
        C39816pzV c39816pzVRJOkX = c38795pgF.RJOkX();
        if (c39816pzVRJOkX != null) {
            c39816pzVRJOkX.setData();
        }
        c38795pgF.isConnected(false);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C38795pgF c38795pgF, java.lang.Integer num) {
        TemplateSetting templateSettingGiSNqX;
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        C36250oUv c36250oUvQfsBiF;
        if (C36246oUr.copydefault().zLjUOn().isCeFiMCapMode() && (templateSettingGiSNqX = c38795pgF.giSNqX()) != null && (sideIndicatorNames = templateSettingGiSNqX.getSideIndicatorNames()) != null && sideIndicatorNames.size() == 0 && (c36250oUvQfsBiF = c38795pgF.QfsBiF()) != null) {
            c36250oUvQfsBiF.setMinimumHeight(c38795pgF.QDqgQU);
        }
        return Unit.INSTANCE;
    }

    private final void djBIcL(java.util.List<? extends oLP> list) {
        C38767pfe c38767pfeOLrzqt = C38767pfe.Companion.OLrzqt();
        if (list == null) {
            list = new java.util.ArrayList<>();
        }
        c38767pfeOLrzqt.EZpvd(list);
        OLrzqt(c38767pfeOLrzqt);
        DrawerLayout drawerLayout = this.QVsKAR;
        if (drawerLayout != null) {
            drawerLayout.openDrawer(5);
        }
    }

    private final void run() {
        C37979pHu c37979pHu = C37979pHu.AEQbTJ;
        c37979pHu.OLrzqt().observe(this, new ComponentCallbacks(new Function1() { // from class: o.phu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38795pgF.gEmmrt(this.OLrzqt, (java.util.List) obj);
            }
        }));
        c37979pHu.AEQbTJ().observe(this, new ComponentCallbacks(new Function1() { // from class: o.phy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38795pgF.AYXKKw(this.copydefault, (java.util.List) obj);
            }
        }));
        c37979pHu.KWHzl().observe(this, new ComponentCallbacks(new Function1() { // from class: o.phx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38795pgF.djBIcL(this.copydefault, (java.util.List) obj);
            }
        }));
        c37979pHu.copydefault().observe(this, new ComponentCallbacks(new Function1() { // from class: o.phv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38795pgF.AhwBna(this.KWHzl, (java.util.List) obj);
            }
        }));
        c37979pHu.EZpvd().observe(this, new ComponentCallbacks(new Function1() { // from class: o.phA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38795pgF.isConnected(this.EZpvd, (java.util.List) obj);
            }
        }));
    }

    public static final Unit gEmmrt(C38795pgF c38795pgF, java.util.List list) {
        C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF != null) {
            c36250oUvQfsBiF.EZpvd(list, "OI");
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C38795pgF c38795pgF, java.util.List list) {
        C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF != null) {
            c36250oUvQfsBiF.EZpvd(list, "LSAcco");
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C38795pgF c38795pgF, java.util.List list) {
        C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF != null) {
            c36250oUvQfsBiF.EZpvd(list, "LSRatio");
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C38795pgF c38795pgF, java.util.List list) {
        C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF != null) {
            c36250oUvQfsBiF.EZpvd(list, "LSPos");
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(C38795pgF c38795pgF, java.util.List list) {
        C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF != null) {
            c36250oUvQfsBiF.EZpvd(list, "BSVol");
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void saveCurrentDrawingKline$default(C38795pgF c38795pgF, DrawLineData.DrawLineItem drawLineItem, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c38795pgF.AEQbTJ(drawLineItem, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(DrawLineData.DrawLineItem drawLineItem, boolean z) {
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
            oYA.uploadDrawingData$default(this, yDY.copydefault(drawLineItem), z, false, 4, null);
        } else {
            DGOPHZ();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [688=6] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void DGOPHZ() {
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
                final Function1 function1 = new Function1() { // from class: o.phE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C38795pgF.KWHzl(this.AEQbTJ, drawLineItemIsConnected, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super java.util.List<DrawingDataEntity>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.phL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C38795pgF.getNewProxyInstance(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.phK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C38795pgF.AhwBna((java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.phQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C38795pgF.uzCIH(function12, obj);
                    }
                });
            }
            drawLineData.AEQbTJ(new Function1() { // from class: o.pgC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38795pgF.OLrzqt(this.AEQbTJ, (java.util.ArrayList) obj);
                }
            });
        }
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C38795pgF c38795pgF, DrawLineData.DrawLineItem drawLineItem, java.util.List list) {
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            DrawingDataBean drawingDataBean = new DrawingDataBean(null, null, null, 7, null);
            drawingDataBean.setLines((java.util.ArrayList) new Gson().fromJson(((DrawingDataEntity) list.get(0)).getLines(), new ComponentName().getType()));
            java.util.ArrayList<DrawLineData.DrawLineItem> arrayListEZpvd = c38795pgF.EZpvd(C37897pEt.KWHzl.copydefault(drawingDataBean), drawLineItem.getIndexId());
            C37895pEr c37895pEr = C37895pEr.copydefault;
            java.lang.String strOcIXYQ = c38795pgF.OcIXYQ();
            if (strOcIXYQ == null) {
                strOcIXYQ = "";
            }
            c37895pEr.AEQbTJ(arrayListEZpvd, "0", strOcIXYQ, c38795pgF.fvQaOB(), c38795pgF.gasjUx());
        }
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final C38795pgF c38795pgF, java.util.ArrayList arrayList) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        java.util.ArrayList<DrawLineData.DrawLineItem> linesList;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        final Function1 function1 = new Function1() { // from class: o.pgE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C38795pgF.KWHzl((DrawLineData.DrawLineItem) obj));
            }
        };
        arrayList.removeIf(new java.util.function.Predicate() { // from class: o.pgB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return C38795pgF.iwGUEr(function1, obj);
            }
        });
        int size = arrayList.size();
        C37895pEr c37895pEr = C37895pEr.copydefault;
        int size2 = 0;
        if (size <= c37895pEr.EZpvd()) {
            C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
            if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF.AkhnZx()) != null && (linesList = chartViewOutSideConfigAkhnZx.getLinesList()) != null) {
                size2 = linesList.size();
            }
            if (size2 > c37895pEr.EZpvd()) {
                C31947mJv c31947mJv = new C31947mJv();
                java.lang.String strOcIXYQ = c38795pgF.OcIXYQ();
                AbstractC58260yxt<java.util.List<DrawingDataEntity>> abstractC58260yxtCopydefault = c31947mJv.copydefault(strOcIXYQ != null ? strOcIXYQ : "");
                if (abstractC58260yxtCopydefault != null) {
                    final Function1 function12 = new Function1() { // from class: o.pgM
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C38795pgF.AkhnZx(this.KWHzl, (java.util.List) obj);
                        }
                    };
                    InterfaceC58227yxM<? super java.util.List<DrawingDataEntity>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.phc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C38795pgF.getFieldNames(function12, obj);
                        }
                    };
                    final Function1 function13 = new Function1() { // from class: o.phm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C38795pgF.gEmmrt((java.lang.Throwable) obj);
                        }
                    };
                    abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.phw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C38795pgF.hDKMBd(function13, obj);
                        }
                    });
                }
            }
        } else {
            if (arrayList.size() > 1) {
                C56407yEf.copydefault(arrayList, new ClipData());
            }
            DrawLineData drawLineData = DrawLineData.copydefault;
            drawLineData.EZpvd().remove(CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList));
            drawLineData.EZpvd(drawLineData.EZpvd());
            arrayList.remove(0);
            C36250oUv c36250oUvQfsBiF2 = c38795pgF.QfsBiF();
            if (c36250oUvQfsBiF2 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQfsBiF2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setLinesList(arrayList);
            }
            C36250oUv c36250oUvQfsBiF3 = c38795pgF.QfsBiF();
            if (c36250oUvQfsBiF3 != null) {
                c36250oUvQfsBiF3.invalidate();
            }
        }
        return Unit.INSTANCE;
    }

    public static final boolean iwGUEr(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean KWHzl(DrawLineData.DrawLineItem drawLineItem) {
        Intrinsics.checkNotNullParameter(drawLineItem, "");
        return drawLineItem.isDelete();
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AkhnZx(final C38795pgF c38795pgF, java.util.List list) {
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            DrawingDataBean drawingDataBean = new DrawingDataBean(null, null, null, 7, null);
            drawingDataBean.setLines((java.util.ArrayList) new Gson().fromJson(((DrawingDataEntity) list.get(0)).getLines(), new BroadcastReceiver().getType()));
            final java.util.ArrayList<DrawLineData.DrawLineItem> arrayListCopydefault = C37897pEt.KWHzl.copydefault(drawingDataBean);
            if (arrayListCopydefault.size() > 1) {
                C56407yEf.copydefault(arrayListCopydefault, new Context());
            }
            DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayListCopydefault);
            drawLineItem.setDelete(true);
            DrawLineData drawLineData = DrawLineData.copydefault;
            drawLineData.EZpvd().add(drawLineItem);
            drawLineData.EZpvd(drawLineData.EZpvd());
            arrayListCopydefault.remove(0);
            C37895pEr c37895pEr = C37895pEr.copydefault;
            java.lang.String strOcIXYQ = c38795pgF.OcIXYQ();
            if (strOcIXYQ == null) {
                strOcIXYQ = "";
            }
            c37895pEr.AEQbTJ(arrayListCopydefault, "0", strOcIXYQ, c38795pgF.fvQaOB(), c38795pgF.gasjUx());
            drawLineData.AEQbTJ(new Function1() { // from class: o.pgI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38795pgF.copydefault(arrayListCopydefault, c38795pgF, (java.util.ArrayList) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.util.ArrayList arrayList, C38795pgF c38795pgF, java.util.ArrayList arrayList2) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Intrinsics.checkNotNullParameter(arrayList2, "");
        arrayList.addAll(arrayList2);
        C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setLinesList(arrayList);
        }
        C36250oUv c36250oUvQfsBiF2 = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF2 != null) {
            c36250oUvQfsBiF2.invalidate();
        }
        return Unit.INSTANCE;
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void valueOf(int i) {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = this.OxVOHk;
        if (viewOnClickListenerC39742pyA != null) {
            viewOnClickListenerC39742pyA.setImageBackground(i);
        }
    }

    public final void ixgjPv() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = this.OxVOHk;
        if (viewOnClickListenerC39742pyA != null) {
            viewOnClickListenerC39742pyA.gEmmrt();
        }
    }

    public final void QwvEab() {
        C39756pyO c39756pyOSSMYrx;
        C39756pyO c39756pyOSSMYrx2;
        C39756pyO c39756pyOSSMYrx3;
        android.widget.ImageView imageView;
        C36250oUv c36250oUvQfsBiF = QfsBiF();
        if (c36250oUvQfsBiF != null) {
            OLrzqt(c36250oUvQfsBiF);
            c36250oUvQfsBiF.setChartSelectionListener(new FragmentManager());
        }
        if (QKVWgx() && (imageView = this.WS) != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 1;
            imageView.setLayoutParams(layoutParams2);
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("kline_trade_point_click");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.pgJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38795pgF.gEmmrt(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pgG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38795pgF.fIwbmz(function1, obj);
            }
        });
        C39782pyo c39782pyo = this.Dmq;
        if (c39782pyo != null) {
            c39782pyo.setPanelClickListener(new Dialog());
        }
        android.widget.ImageView imageView2 = this.spnCvw;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.pgH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C38795pgF.AYXKKw(this.EZpvd, view);
                }
            });
        }
        C39816pzV c39816pzVRJOkX = RJOkX();
        if (c39816pzVRJOkX != null) {
            c39816pzVRJOkX.setOnItemSelectListener(new Function1() { // from class: o.pgN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38795pgF.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        android.widget.RelativeLayout relativeLayout = this.KDccX;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: o.pgO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C38795pgF.valueOf(this.EZpvd, view);
                }
            });
        }
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE = this.ixgjPv;
        if (viewOnClickListenerC39746pyE != null) {
            viewOnClickListenerC39746pyE.setOnItemClickListener(new Function1() { // from class: o.pgP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38795pgF.EZpvd(this.EZpvd, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE2 = this.ixgjPv;
        if (viewOnClickListenerC39746pyE2 != null) {
            viewOnClickListenerC39746pyE2.setOnLineHideListener(new Function1() { // from class: o.pgL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38795pgF.copydefault(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        android.widget.RelativeLayout relativeLayout2 = this.fHqPtx;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.pgS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C38795pgF.AhwBna(this.copydefault, view);
                }
            });
        }
        android.widget.ImageView imageView3 = this.WS;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: o.pgU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C38795pgF.isConnected(this.OLrzqt, view);
                }
            });
        }
        android.widget.TextView textView = this.DBxZfM;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.pgQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C38795pgF.DbNXlk(this.AEQbTJ, view);
                }
            });
        }
        C36250oUv c36250oUvQfsBiF2 = QfsBiF();
        TemplateSetting templateSettingWlaJM = c36250oUvQfsBiF2 != null ? c36250oUvQfsBiF2.wlaJM() : null;
        if (templateSettingWlaJM != null && templateSettingWlaJM.getMainIndicatorNames() != null && (c39756pyOSSMYrx3 = sSMYrx()) != null) {
            c39756pyOSSMYrx3.setMainIndicatorSelect();
        }
        if (templateSettingWlaJM != null && (c39756pyOSSMYrx2 = sSMYrx()) != null) {
            java.util.ArrayList<java.lang.String> sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames();
            Intrinsics.checkNotNullExpressionValue(sideIndicatorNames, "");
            c39756pyOSSMYrx2.setSideIndicators(sideIndicatorNames);
        }
        if (!QKVWgx() && pFP.OLrzqt.OLrzqt() && (c39756pyOSSMYrx = sSMYrx()) != null) {
            java.lang.String strORxRYg = ORxRYg();
            c39756pyOSSMYrx.AEQbTJ(strORxRYg != null ? strORxRYg : "");
        }
        C39756pyO c39756pyOSSMYrx4 = sSMYrx();
        if (c39756pyOSSMYrx4 != null) {
            c39756pyOSSMYrx4.setOnItemSelectListener(new Function1() { // from class: o.pgK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38795pgF.OLrzqt(this.copydefault, (MarketTypeSelect) obj);
                }
            });
        }
        DrawerLayout drawerLayout = this.QVsKAR;
        if (drawerLayout != null) {
            drawerLayout.setDrawerLockMode(1);
        }
        DrawerLayout drawerLayout2 = this.QVsKAR;
        if (drawerLayout2 != null) {
            drawerLayout2.addDrawerListener(new Fragment());
        }
    }

    /* JADX INFO: renamed from: o.pgF$FragmentManager */
    public static final class FragmentManager implements C36250oUv.ActionBar {
        @Override // o.C36250oUv.ActionBar
        public void EZpvd(java.lang.String str) {
        }

        @Override // o.C36250oUv.ActionBar
        public void aI_() {
            C55489xks.startVibratorIfCan$default(0L, 1, null);
        }
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(C38795pgF c38795pgF, java.lang.String str) {
        c38795pgF.EZpvd(1);
        C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF != null) {
            c36250oUvQfsBiF.copydefault();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pgF$Dialog */
    public static final class Dialog implements pAL {
        public Dialog() {
        }

        @Override // o.pAL
        public void AEQbTJ(int i) {
            if (i == 0) {
                oWO owo = C36312oXc.AEQbTJ(C38795pgF.this.QfsBiF()).AubY;
                Intrinsics.copydefault(owo, "");
                C36311oXb c36311oXb = (C36311oXb) owo;
                if (c36311oXb != null) {
                    c36311oXb.djBIcL();
                }
            } else if (i == 1) {
                C38795pgF.this.EZpvd(2);
            }
            C36250oUv c36250oUvQfsBiF = C38795pgF.this.QfsBiF();
            if (c36250oUvQfsBiF != null) {
                c36250oUvQfsBiF.copydefault();
            }
        }
    }

    public static final void AYXKKw(C38795pgF c38795pgF, android.view.View view) {
        InterfaceC39499ptW interfaceC39499ptWIsConnected;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMDrawLineEnable(false);
        }
        C36312oXc c36312oXcRcXXUw = c38795pgF.RcXXUw();
        if (c36312oXcRcXXUw != null) {
            c36312oXcRcXXUw.AEQbTJ(false);
        }
        if (c38795pgF.QKVWgx()) {
            if (c38795pgF.isConnected() == null || (interfaceC39499ptWIsConnected = c38795pgF.isConnected()) == null) {
                return;
            }
            interfaceC39499ptWIsConnected.AYXKKw();
            return;
        }
        if (c38795pgF.isConnected() != null) {
            if (c38795pgF.zblBkD) {
                InterfaceC39499ptW interfaceC39499ptWIsConnected2 = c38795pgF.isConnected();
                if (interfaceC39499ptWIsConnected2 != null) {
                    interfaceC39499ptWIsConnected2.isConnected();
                }
            } else {
                InterfaceC39499ptW interfaceC39499ptWIsConnected3 = c38795pgF.isConnected();
                if (interfaceC39499ptWIsConnected3 != null) {
                    interfaceC39499ptWIsConnected3.setPortraitFullScreen(null);
                }
            }
        }
        c38795pgF.fetchVPNInfo(true);
    }

    public static final Unit copydefault(C38795pgF c38795pgF, int i) {
        android.content.Context context = c38795pgF.getContext();
        if (context != null && C55296xhK.OLrzqt(context)) {
            c38795pgF.gEmmrt(i);
        } else {
            c38795pgF.AhwBna(i);
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(C38795pgF c38795pgF, android.view.View view) {
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE = c38795pgF.ixgjPv;
        if (viewOnClickListenerC39746pyE != null) {
            viewOnClickListenerC39746pyE.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout = c38795pgF.DCUTEIddSDPG;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        c38795pgF.OLrzqt(true);
        C39835pzo c39835pzo = c38795pgF.UrRBLY;
        if (c39835pzo != null) {
            c39835pzo.setScrollingEnabled(false);
        }
        c38795pgF.DCUTEIddSDPG();
    }

    public static final Unit EZpvd(C38795pgF c38795pgF, int i) {
        LinkedHashMap<java.lang.String, ChartArea> linkedHashMapValues;
        ChartArea chartArea;
        java.util.HashMap<java.lang.String, oWN> mapZLjUOn;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        java.util.ArrayList<DrawLineData.DrawLineItem> linesList;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx4;
        java.util.ArrayList<DrawLineData.DrawLineItem> linesList2;
        java.util.HashMap<java.lang.String, oWN> mapZLjUOn2;
        InterfaceC39499ptW interfaceC39499ptWIsConnected;
        if (i == C35964oKf.StateListAnimator.haRtnV) {
            c38795pgF.zblBkD();
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("KLine_DrawingToolSidebar_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pgY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38795pgF.fetchVPNInfo((EventParamsList) obj);
                }
            });
        } else if (i == C35964oKf.StateListAnimator.hCiIDQ) {
            ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE = c38795pgF.ixgjPv;
            if (viewOnClickListenerC39746pyE != null) {
                viewOnClickListenerC39746pyE.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout = c38795pgF.DCUTEIddSDPG;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            C36312oXc c36312oXcRcXXUw = c38795pgF.RcXXUw();
            if (c36312oXcRcXXUw != null) {
                c36312oXcRcXXUw.AEQbTJ(false);
            }
            c38795pgF.OLrzqt(false);
            c38795pgF.UlJrfe();
            C39835pzo c39835pzo = c38795pgF.UrRBLY;
            if (c39835pzo != null) {
                c39835pzo.setScrollingEnabled(true);
            }
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("KLine_DrawingToolSidebar_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pgV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38795pgF.AkhnZx((EventParamsList) obj);
                }
            });
        } else if (i == C35964oKf.StateListAnimator.RZOtbZ) {
            if (c38795pgF.isConnected() != null && (interfaceC39499ptWIsConnected = c38795pgF.isConnected()) != null) {
                interfaceC39499ptWIsConnected.OLrzqt(0);
            }
            TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("KLine_DrawingToolSidebar_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pgX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38795pgF.fARcdN((EventParamsList) obj);
                }
            });
        } else {
            oWN own = null;
            if (i == C35964oKf.StateListAnimator.SePrCP || i == C35964oKf.StateListAnimator.DtA || i == 0) {
                c38795pgF.OLrzqt(true);
                C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
                if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx4 = c36250oUvQfsBiF.AkhnZx()) != null && (linesList2 = chartViewOutSideConfigAkhnZx4.getLinesList()) != null) {
                    final Function1 function1 = new Function1() { // from class: o.pha
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(C38795pgF.AEQbTJ((DrawLineData.DrawLineItem) obj));
                        }
                    };
                    linesList2.removeIf(new java.util.function.Predicate() { // from class: o.phe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.util.function.Predicate
                        public final boolean test(java.lang.Object obj) {
                            return C38795pgF.fARcdN(function1, obj);
                        }
                    });
                }
                C36250oUv c36250oUvQfsBiF2 = c38795pgF.QfsBiF();
                if (((c36250oUvQfsBiF2 == null || (chartViewOutSideConfigAkhnZx3 = c36250oUvQfsBiF2.AkhnZx()) == null || (linesList = chartViewOutSideConfigAkhnZx3.getLinesList()) == null) ? 0 : linesList.size()) >= C37895pEr.copydefault.EZpvd() && !SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                    C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C35964oKf.Fragment.gCNefq), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                    c38795pgF.UlJrfe();
                    DrawLineData drawLineData = DrawLineData.copydefault;
                    drawLineData.EZpvd((DrawLineData.LineType) null);
                    drawLineData.KWHzl((DrawLineData.DrawLineItem) null);
                } else {
                    C36250oUv c36250oUvQfsBiF3 = c38795pgF.QfsBiF();
                    if (c36250oUvQfsBiF3 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF3.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.getMHideKlineDrawingData()) {
                        C36250oUv c36250oUvQfsBiF4 = c38795pgF.QfsBiF();
                        if (c36250oUvQfsBiF4 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQfsBiF4.AkhnZx()) != null) {
                            chartViewOutSideConfigAkhnZx2.setMHideKlineDrawingData(false);
                        }
                        SPUtils.put("hide_kline_drawing_data", java.lang.Boolean.FALSE);
                        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE2 = c38795pgF.ixgjPv;
                        if (viewOnClickListenerC39746pyE2 != null) {
                            viewOnClickListenerC39746pyE2.OLrzqt();
                        }
                    }
                    C36250oUv c36250oUvQfsBiF5 = c38795pgF.QfsBiF();
                    if (c36250oUvQfsBiF5 != null && (mapZLjUOn = c36250oUvQfsBiF5.zLjUOn()) != null) {
                        own = mapZLjUOn.get("ds0");
                    }
                    if (own != null) {
                        C36250oUv c36250oUvQfsBiF6 = c38795pgF.QfsBiF();
                        int iDjBIcL = 100;
                        int measuredWidth = (c36250oUvQfsBiF6 != null ? c36250oUvQfsBiF6.getMeasuredWidth() : 100) / 2;
                        C36250oUv c36250oUvQfsBiF7 = c38795pgF.QfsBiF();
                        if (c36250oUvQfsBiF7 != null && (linkedHashMapValues = c36250oUvQfsBiF7.values()) != null && (chartArea = linkedHashMapValues.get("ds0.m")) != null) {
                            iDjBIcL = chartArea.djBIcL();
                        }
                        own.KWHzl(measuredWidth, iDjBIcL / 2);
                        C36250oUv c36250oUvQfsBiF8 = c38795pgF.QfsBiF();
                        if (c36250oUvQfsBiF8 != null) {
                            c36250oUvQfsBiF8.invalidate();
                        }
                        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = c38795pgF.OxVOHk;
                        if (viewOnClickListenerC39742pyA != null) {
                            viewOnClickListenerC39742pyA.AYXKKw();
                        }
                    } else {
                        pUU.copydefault("ChartView", "timeline is null");
                    }
                }
            } else if (i == C35964oKf.StateListAnimator.hBORwR || i == C35964oKf.StateListAnimator.sQOHWT) {
                DrawLineData drawLineData2 = DrawLineData.copydefault;
                if (drawLineData2.valueOf() == DrawLineData.LineType.PRICE_LINE || drawLineData2.valueOf() == DrawLineData.LineType.FIBONACCI) {
                    C36250oUv c36250oUvQfsBiF9 = c38795pgF.QfsBiF();
                    oWN own2 = (c36250oUvQfsBiF9 == null || (mapZLjUOn2 = c36250oUvQfsBiF9.zLjUOn()) == null) ? null : mapZLjUOn2.get("ds0");
                    if (own2 != null) {
                        own2.AwvSrB();
                    }
                    drawLineData2.EZpvd((DrawLineData.LineType) null);
                    C36250oUv c36250oUvQfsBiF10 = c38795pgF.QfsBiF();
                    if (c36250oUvQfsBiF10 != null) {
                        c36250oUvQfsBiF10.invalidate();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("app_drawing_tool_type", RequestParameters.SUBRESOURCE_DELETE, true);
        eventParamsList.put("terminal", "app", true);
        eventParamsList.put("chart_type", "original", true);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("app_drawing_tool_type", "back", true);
        eventParamsList.put("terminal", "app", true);
        eventParamsList.put("chart_type", "original", true);
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("app_drawing_tool_type", "share", true);
        eventParamsList.put("terminal", "app", true);
        eventParamsList.put("chart_type", "original", true);
        return Unit.INSTANCE;
    }

    public static final boolean fARcdN(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean AEQbTJ(DrawLineData.DrawLineItem drawLineItem) {
        Intrinsics.checkNotNullParameter(drawLineItem, "");
        return drawLineItem.isDelete();
    }

    public static final Unit copydefault(C38795pgF c38795pgF, boolean z) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        if (z) {
            SPUtils.put("hide_kline_drawing_data", java.lang.Boolean.TRUE);
            C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
            if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQfsBiF.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMHideKlineDrawingData(true);
            }
            c38795pgF.UlJrfe();
            C36312oXc c36312oXcRcXXUw = c38795pgF.RcXXUw();
            if (c36312oXcRcXXUw != null) {
                c36312oXcRcXXUw.AEQbTJ(true);
            }
            C36250oUv c36250oUvQfsBiF2 = c38795pgF.QfsBiF();
            if (c36250oUvQfsBiF2 != null) {
                c36250oUvQfsBiF2.invalidate();
            }
        } else {
            SPUtils.put("hide_kline_drawing_data", java.lang.Boolean.FALSE);
            C36250oUv c36250oUvQfsBiF3 = c38795pgF.QfsBiF();
            if (c36250oUvQfsBiF3 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF3.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMHideKlineDrawingData(false);
            }
            C36250oUv c36250oUvQfsBiF4 = c38795pgF.QfsBiF();
            if (c36250oUvQfsBiF4 != null) {
                c36250oUvQfsBiF4.invalidate();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(C38795pgF c38795pgF, android.view.View view) {
        LifecycleOwnerKt.getLifecycleScope(c38795pgF).launchWhenResumed(new MarketKlineLandScapeFragment$initLandView$10$1(c38795pgF, null));
    }

    public static final void isConnected(C38795pgF c38795pgF, android.view.View view) {
        c38795pgF.fdOvFl();
    }

    public static final void DbNXlk(C38795pgF c38795pgF, android.view.View view) {
        c38795pgF.fdOvFl();
    }

    public static final Unit OLrzqt(C38795pgF c38795pgF, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        if (Intrinsics.EZpvd((java.lang.Object) marketTypeSelect.getSelectTypeName(), (java.lang.Object) "VOLUME")) {
            MarketCoinInfo marketCoinInfoQbewEr = c38795pgF.QbewEr();
            if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentType() : null), (java.lang.Object) "OPTION")) {
                return Unit.INSTANCE;
            }
        }
        C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF != null) {
            c38795pgF.KWHzl(c36250oUvQfsBiF, marketTypeSelect);
            C37908pFd.copydefault(marketTypeSelect.getSelectTypeName(), marketTypeSelect.isSelect(), marketTypeSelect.getGroup() == 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pgF$Fragment */
    public static final class Fragment implements DrawerLayout.DrawerListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(android.view.View view, float f) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerStateChanged(int i) {
        }

        public Fragment() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            DrawerLayout drawerLayout = C38795pgF.this.QVsKAR;
            if (drawerLayout != null) {
                drawerLayout.setDrawerLockMode(0);
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            DrawerLayout drawerLayout = C38795pgF.this.QVsKAR;
            if (drawerLayout != null) {
                drawerLayout.setDrawerLockMode(1);
            }
            if (C38795pgF.this.QSLkRj) {
                C38795pgF.this.QSLkRj = false;
                C39816pzV c39816pzVRJOkX = C38795pgF.this.RJOkX();
                if (c39816pzVRJOkX != null) {
                    c39816pzVRJOkX.setData();
                }
            }
            C36246oUr.copydefault().djBIcL();
            C36250oUv c36250oUvQfsBiF = C38795pgF.this.QfsBiF();
            if (c36250oUvQfsBiF != null) {
                c36250oUvQfsBiF.invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void spnCvw() {
        C36312oXc c36312oXcRcXXUw = RcXXUw();
        if (c36312oXcRcXXUw == null || !(c36312oXcRcXXUw.isConnected() instanceof C36315oXf)) {
            return;
        }
        c36312oXcRcXXUw.EZpvd(c36312oXcRcXXUw.zLjUOn);
    }

    public final void AEQbTJ(MarketCoinInfo marketCoinInfo) {
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        copydefault(marketCoinInfo);
        InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb = dNCPSb();
        if (stateListAnimatorDNCPSb != null) {
            stateListAnimatorDNCPSb.AEQbTJ(marketCoinInfo);
        }
        RlQdEF();
        DAIeex();
        if (pEI.EZpvd.AEQbTJ() && !QKVWgx()) {
            InterfaceC36254oUz interfaceC36254oUzFinit = finit();
            Intrinsics.copydefault(interfaceC36254oUzFinit, "");
            ((C36327oXr) interfaceC36254oUzFinit).reload();
        }
        C36250oUv c36250oUvQfsBiF = QfsBiF();
        if (c36250oUvQfsBiF != null && (mapEjfBZ = c36250oUvQfsBiF.ejfBZ()) != null) {
            C36250oUv c36250oUvQfsBiF2 = QfsBiF();
            com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get(c36250oUvQfsBiF2 != null ? c36250oUvQfsBiF2.fIwbmz() : null);
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        OLrzqt(marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType());
        WS().EZpvd(marketCoinInfo);
        WS().EZpvd(marketCoinInfo.getInstrumentId(), BusinessType.CeFi);
        USBtdM().AEQbTJ(marketCoinInfo);
    }

    public final void fdOvFl() {
        if (QKVWgx()) {
            return;
        }
        InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC43033rhe.class));
        if (interfaceC43033rhe != null) {
            interfaceC43033rhe.AEQbTJ(this, new MarketKlineLandScapeFragment$showSearchPopupWindow$1(this));
        }
        C37908pFd.AEQbTJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UrRBLY() {
        C36250oUv c36250oUvQfsBiF = QfsBiF();
        if (c36250oUvQfsBiF != null) {
            c36250oUvQfsBiF.QfsBiF();
        }
        C36250oUv c36250oUvQfsBiF2 = QfsBiF();
        if (c36250oUvQfsBiF2 != null) {
            c36250oUvQfsBiF2.invalidate();
        }
    }

    private final void DcqEDu() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = this.OxVOHk;
        if (viewOnClickListenerC39742pyA != null) {
            viewOnClickListenerC39742pyA.djBIcL();
        }
    }

    @Override // o.oYA, o.InterfaceC39502ptZ
    public void gEmmrt(java.lang.String str) {
        android.widget.TextView textView = this.DBxZfM;
        if (textView != null) {
            MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
            textView.setText(marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null);
        }
        QVsKAR();
    }

    @Override // o.oYA, o.InterfaceC39502ptZ
    public void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.DBxZfM;
        if (textView != null) {
            textView.setText(str);
        }
        QVsKAR();
        C36246oUr.copydefault().isConnected(str);
    }

    public final void QVsKAR() {
        BizInstrument bizInstrumentHDKMBd = hDKMBd();
        if (bizInstrumentHDKMBd != null && bizInstrumentHDKMBd.isPreMarketPair()) {
            BizInstrument bizInstrumentHDKMBd2 = hDKMBd();
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrumentHDKMBd2 != null ? bizInstrumentHDKMBd2.getInstType() : null), (java.lang.Object) "FUTURES")) {
                android.widget.TextView textView = this.RXzakW;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                android.widget.TextView textView2 = this.RXzakW;
                if (textView2 != null) {
                    textView2.setText(C35964oKf.Fragment.onStatusChanged);
                    return;
                }
                return;
            }
        }
        android.widget.TextView textView3 = this.RXzakW;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        android.widget.TextView textView4 = this.RXzakW;
        if (textView4 != null) {
            textView4.setText((java.lang.CharSequence) null);
        }
    }

    private final void AhwBna(int i) {
        InterfaceC39509ptg interfaceC39509ptgDjBIcL;
        java.util.ArrayList<TimeIntervalItem> arrayListAEQbTJ;
        TimeIntervalItem timeIntervalItem;
        TemplateSetting templateSettingGiSNqX;
        if (i == 10) {
            this.QSLkRj = true;
            if (RJOkX() != null && (templateSettingGiSNqX = giSNqX()) != null) {
                C38780pfr c38780pfrCopydefault = C38780pfr.Companion.copydefault(templateSettingGiSNqX.getSPTimeInterval());
                this.USBtdM = c38780pfrCopydefault;
                Intrinsics.copydefault(c38780pfrCopydefault);
                OLrzqt(c38780pfrCopydefault);
                DrawerLayout drawerLayout = this.QVsKAR;
                if (drawerLayout != null) {
                    drawerLayout.openDrawer(5);
                }
                C38780pfr c38780pfr = this.USBtdM;
                if (c38780pfr != null) {
                    c38780pfr.OLrzqt(new Activity());
                }
            }
            C37908pFd.EZpvd(false);
            return;
        }
        C36250oUv c36250oUvQfsBiF = QfsBiF();
        if (c36250oUvQfsBiF == null || (interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL()) == null || (arrayListAEQbTJ = interfaceC39509ptgDjBIcL.AEQbTJ()) == null || (timeIntervalItem = (TimeIntervalItem) CollectionsKt___CollectionsKt.AkhnZx(arrayListAEQbTJ, i)) == null) {
            return;
        }
        isConnected(false);
        AYXKKw(false);
        oYA.changeTime$default(this, c36250oUvQfsBiF, timeIntervalItem, false, 4, null);
        C37908pFd.changeTimeEvent$default(timeIntervalItem.getTradingType(), false, 2, null);
    }

    /* JADX INFO: renamed from: o.pgF$Activity */
    public static final class Activity implements oKC {
        public Activity() {
        }

        @Override // o.oKC
        public void copydefault(MarketTypeSelect marketTypeSelect) {
            Intrinsics.checkNotNullParameter(marketTypeSelect, "");
            C36250oUv c36250oUvQfsBiF = C38795pgF.this.QfsBiF();
            if (c36250oUvQfsBiF != null) {
                C38795pgF c38795pgF = C38795pgF.this;
                c38795pgF.isConnected(false);
                c38795pgF.AYXKKw(false);
                java.lang.Object data = marketTypeSelect.getData();
                Intrinsics.copydefault(data, "");
                oYA.changeTime$default(c38795pgF, c36250oUvQfsBiF, (TimeIntervalItem) data, false, 4, null);
            }
            DrawerLayout drawerLayout = C38795pgF.this.QVsKAR;
            if (drawerLayout != null) {
                drawerLayout.closeDrawer(5);
            }
        }
    }

    private final void gEmmrt(int i) {
        InterfaceC39509ptg interfaceC39509ptgDjBIcL;
        java.util.ArrayList<TimeIntervalItem> arrayListAEQbTJ;
        TimeIntervalItem timeIntervalItem;
        TemplateSetting templateSettingGiSNqX;
        if (i == 10) {
            this.QSLkRj = true;
            if (RJOkX() != null && (templateSettingGiSNqX = giSNqX()) != null) {
                C38780pfr c38780pfrCopydefault = C38780pfr.Companion.copydefault(templateSettingGiSNqX.getSPTimeInterval());
                this.USBtdM = c38780pfrCopydefault;
                Intrinsics.copydefault(c38780pfrCopydefault);
                AEQbTJ(c38780pfrCopydefault);
                DrawerLayout drawerLayout = this.QVsKAR;
                if (drawerLayout != null) {
                    drawerLayout.openDrawer(3);
                }
                C38780pfr c38780pfr = this.USBtdM;
                if (c38780pfr != null) {
                    c38780pfr.OLrzqt(new TaskDescription());
                }
            }
            C37908pFd.EZpvd(false);
            return;
        }
        C36250oUv c36250oUvQfsBiF = QfsBiF();
        if (c36250oUvQfsBiF == null || (interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL()) == null || (arrayListAEQbTJ = interfaceC39509ptgDjBIcL.AEQbTJ()) == null || (timeIntervalItem = (TimeIntervalItem) CollectionsKt___CollectionsKt.AkhnZx(arrayListAEQbTJ, i)) == null) {
            return;
        }
        isConnected(false);
        AYXKKw(false);
        oYA.changeTime$default(this, c36250oUvQfsBiF, timeIntervalItem, false, 4, null);
        C37908pFd.changeTimeEvent$default(timeIntervalItem.getTradingType(), false, 2, null);
    }

    /* JADX INFO: renamed from: o.pgF$TaskDescription */
    public static final class TaskDescription implements oKC {
        public TaskDescription() {
        }

        @Override // o.oKC
        public void copydefault(MarketTypeSelect marketTypeSelect) {
            Intrinsics.checkNotNullParameter(marketTypeSelect, "");
            C36250oUv c36250oUvQfsBiF = C38795pgF.this.QfsBiF();
            if (c36250oUvQfsBiF != null) {
                C38795pgF c38795pgF = C38795pgF.this;
                c38795pgF.isConnected(false);
                c38795pgF.AYXKKw(false);
                java.lang.Object data = marketTypeSelect.getData();
                Intrinsics.copydefault(data, "");
                oYA.changeTime$default(c38795pgF, c36250oUvQfsBiF, (TimeIntervalItem) data, false, 4, null);
            }
            DrawerLayout drawerLayout = C38795pgF.this.QVsKAR;
            if (drawerLayout != null) {
                drawerLayout.closeDrawer(3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(androidx.fragment.app.Fragment fragment) {
        if (!isAdded() || isDetached() || isRemoving()) {
            return;
        }
        getChildFragmentManager().beginTransaction().replace(C35964oKf.StateListAnimator.RZNAhV, fragment).commitAllowingStateLoss();
    }

    private final void AEQbTJ(AbstractC32996moC abstractC32996moC) {
        if (!isAdded() || isDetached() || isRemoving()) {
            return;
        }
        getChildFragmentManager().beginTransaction().replace(C35964oKf.StateListAnimator.RTWSvT, abstractC32996moC).commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DWgRXt() {
        C38768pff c38768pffAEQbTJ = C38768pff.Companion.AEQbTJ();
        this.dUDNAs = c38768pffAEQbTJ;
        if (c38768pffAEQbTJ != null) {
            DrawerLayout drawerLayout = this.QVsKAR;
            if (drawerLayout != null) {
                drawerLayout.openDrawer(5);
            }
            OLrzqt(c38768pffAEQbTJ);
            c38768pffAEQbTJ.copydefault(new ContextWrapper());
        }
    }

    /* JADX INFO: renamed from: o.pgF$ContextWrapper */
    public static final class ContextWrapper implements InterfaceC35980oKv {
        public ContextWrapper() {
        }

        @Override // o.InterfaceC35980oKv
        public void AEQbTJ() {
            DrawerLayout drawerLayout = C38795pgF.this.QVsKAR;
            if (drawerLayout != null) {
                drawerLayout.closeDrawer(5);
            }
            C36250oUv c36250oUvQfsBiF = C38795pgF.this.QfsBiF();
            if (c36250oUvQfsBiF != null) {
                c36250oUvQfsBiF.invalidate();
            }
            DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
            if (drawLineItemIsConnected != null) {
                C38795pgF.saveCurrentDrawingKline$default(C38795pgF.this, drawLineItemIsConnected, false, 2, null);
            }
        }
    }

    @Override // o.oYA
    public void RlQdEF() {
        super.RlQdEF();
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE = this.ixgjPv;
        if (viewOnClickListenerC39746pyE == null || viewOnClickListenerC39746pyE.getVisibility() != 0) {
            return;
        }
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE2 = this.ixgjPv;
        if (viewOnClickListenerC39746pyE2 != null) {
            viewOnClickListenerC39746pyE2.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = this.DCUTEIddSDPG;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        OLrzqt(false);
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE3 = this.ixgjPv;
        if (viewOnClickListenerC39746pyE3 != null) {
            viewOnClickListenerC39746pyE3.AEQbTJ();
        }
        C39835pzo c39835pzo = this.UrRBLY;
        if (c39835pzo != null) {
            c39835pzo.setScrollingEnabled(true);
        }
    }

    @Override // o.oYA
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        java.lang.Integer numValueOf;
        C36250oUv c36250oUvQfsBiF;
        Intrinsics.checkNotNullParameter(str, "");
        TemplateSetting templateSettingGiSNqX = giSNqX();
        if (templateSettingGiSNqX != null) {
            java.util.ArrayList<IndicatorDataReq> arrayList = new java.util.ArrayList<>();
            if (z) {
                if (templateSettingGiSNqX.getSideIndicatorNames().size() >= 4) {
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
                C36250oUv c36250oUvQfsBiF2 = QfsBiF();
                if (c36250oUvQfsBiF2 != null) {
                    c36250oUvQfsBiF2.copydefault(str);
                }
                C39263pox c39263poxAxsJAY = AxsJAY();
                java.util.ArrayList<java.lang.String> sideIndicatorNames2 = templateSettingGiSNqX.getSideIndicatorNames();
                Intrinsics.checkNotNullExpressionValue(sideIndicatorNames2, "");
                c39263poxAxsJAY.OLrzqt(this, sideIndicatorNames2, OcIXYQ(), ORxRYg(), templateSettingGiSNqX.getSPTimeInterval());
                int size = templateSettingGiSNqX.getSideIndicatorNames().size();
                if (size > 1) {
                    if (size < 4) {
                        C36250oUv c36250oUvQfsBiF3 = QfsBiF();
                        if (c36250oUvQfsBiF3 != null) {
                            C36250oUv c36250oUvQfsBiF4 = QfsBiF();
                            numValueOf = c36250oUvQfsBiF4 != null ? java.lang.Integer.valueOf(c36250oUvQfsBiF4.getMinimumHeight() + C36246oUr.copydefault().aKErDB()) : null;
                            Intrinsics.copydefault(numValueOf);
                            c36250oUvQfsBiF3.setMinimumHeight(numValueOf.intValue());
                        }
                    } else if (size == 4 && (c36250oUvQfsBiF = QfsBiF()) != null) {
                        c36250oUvQfsBiF.setMinimumHeight(this.QDqgQU + (C36246oUr.copydefault().aKErDB() * 3));
                    }
                    call();
                } else {
                    C36250oUv c36250oUvQfsBiF5 = QfsBiF();
                    if (c36250oUvQfsBiF5 != null) {
                        c36250oUvQfsBiF5.setMinimumHeight(this.QDqgQU);
                    }
                }
            } else {
                templateSettingGiSNqX.removeSideIndicator(str);
                C36250oUv c36250oUvQfsBiF6 = QfsBiF();
                if (c36250oUvQfsBiF6 != null) {
                    c36250oUvQfsBiF6.gEmmrt(str);
                }
                C39263pox c39263poxAxsJAY2 = AxsJAY();
                java.util.ArrayList<java.lang.String> sideIndicatorNames3 = templateSettingGiSNqX.getSideIndicatorNames();
                Intrinsics.checkNotNullExpressionValue(sideIndicatorNames3, "");
                c39263poxAxsJAY2.OLrzqt(this, sideIndicatorNames3, OcIXYQ(), ORxRYg(), templateSettingGiSNqX.getSPTimeInterval());
                if (templateSettingGiSNqX.getSideIndicatorNames().size() > 1) {
                    C36250oUv c36250oUvQfsBiF7 = QfsBiF();
                    if (c36250oUvQfsBiF7 != null) {
                        C36250oUv c36250oUvQfsBiF8 = QfsBiF();
                        numValueOf = c36250oUvQfsBiF8 != null ? java.lang.Integer.valueOf(c36250oUvQfsBiF8.getMinimumHeight() - C36246oUr.copydefault().aKErDB()) : null;
                        Intrinsics.copydefault(numValueOf);
                        c36250oUvQfsBiF7.setMinimumHeight(numValueOf.intValue());
                    }
                    call();
                } else {
                    C36250oUv c36250oUvQfsBiF9 = QfsBiF();
                    if (c36250oUvQfsBiF9 != null) {
                        c36250oUvQfsBiF9.setMinimumHeight(this.QDqgQU);
                    }
                }
            }
            if (z) {
                IndicatorDataReq indicatorDataReqCopydefault2 = copydefault(str, z, false);
                if (indicatorDataReqCopydefault2 != null) {
                    arrayList.add(indicatorDataReqCopydefault2);
                }
                AhwBna(arrayList);
            }
        }
    }

    private final void call() {
        new android.os.Handler().post(new java.lang.Runnable() { // from class: o.phz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C38795pgF.getFieldNames(this.OLrzqt);
            }
        });
    }

    public static final void getFieldNames(C38795pgF c38795pgF) {
        C39835pzo c39835pzo = c38795pgF.UrRBLY;
        if (c39835pzo != null) {
            c39835pzo.fullScroll(130);
        }
    }

    private final void DCUTEIddSDPG() {
        new android.os.Handler().post(new java.lang.Runnable() { // from class: o.phJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C38795pgF.AubY(this.KWHzl);
            }
        });
    }

    public static final void AubY(C38795pgF c38795pgF) {
        C39835pzo c39835pzo = c38795pgF.UrRBLY;
        if (c39835pzo != null) {
            c39835pzo.fullScroll(33);
        }
    }

    @Override // o.oYA, o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        C36250oUv c36250oUvQfsBiF;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        super.onResume();
        InterfaceC39499ptW interfaceC39499ptWIsConnected = isConnected();
        if ((interfaceC39499ptWIsConnected != null && interfaceC39499ptWIsConnected.AhwBna()) || ((c36250oUvQfsBiF = QfsBiF()) != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.getMDrawLineEnable())) {
            InterfaceC39499ptW interfaceC39499ptWIsConnected2 = isConnected();
            if (interfaceC39499ptWIsConnected2 != null) {
                interfaceC39499ptWIsConnected2.OLrzqt(java.lang.Boolean.FALSE);
            }
            ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE = this.ixgjPv;
            if (viewOnClickListenerC39746pyE != null) {
                viewOnClickListenerC39746pyE.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout = this.DCUTEIddSDPG;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            igXuih();
            return;
        }
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE2 = this.ixgjPv;
        if (viewOnClickListenerC39746pyE2 == null || viewOnClickListenerC39746pyE2.getVisibility() != 0) {
            return;
        }
        igXuih();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    @Override // o.oYA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void DAIeex() {
        java.lang.String titleByIdAndType$default;
        android.widget.TextView textView;
        super.DAIeex();
        MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
        if (marketCoinInfoQbewEr != null) {
            BizInstrument bizInstrumentHDKMBd = hDKMBd();
            if (bizInstrumentHDKMBd == null || !bizInstrumentHDKMBd.isPreMarketPair()) {
                titleByIdAndType$default = C48914uef.getTitleByIdAndType$default(C48914uef.EZpvd, marketCoinInfoQbewEr.getInstrumentId(), marketCoinInfoQbewEr.getInstrumentType(), false, false, getContext(), false, false, 108, null);
                textView = this.DBxZfM;
                if (textView != null) {
                    textView.setText(titleByIdAndType$default);
                }
                C36246oUr.copydefault().isConnected(titleByIdAndType$default);
            } else {
                BizInstrument bizInstrumentHDKMBd2 = hDKMBd();
                if (Intrinsics.EZpvd((java.lang.Object) (bizInstrumentHDKMBd2 != null ? bizInstrumentHDKMBd2.getInstType() : null), (java.lang.Object) "FUTURES")) {
                    titleByIdAndType$default = C48914uef.getPremarketTitle$default(C48914uef.EZpvd, marketCoinInfoQbewEr.getInstrumentId(), false, 2, null);
                }
                textView = this.DBxZfM;
                if (textView != null) {
                }
                C36246oUr.copydefault().isConnected(titleByIdAndType$default);
            }
        }
        MarketCoinInfo marketCoinInfoQbewEr2 = QbewEr();
        if (Intrinsics.EZpvd((java.lang.Object) "OPTION", (java.lang.Object) (marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentType() : null))) {
            android.widget.TextView textView2 = this.DBxZfM;
            if (textView2 != null) {
                textView2.setMaxWidth((int) getResources().getDimension(C35964oKf.ActionBar.OLrzqt));
            }
            android.widget.TextView textView3 = this.DBxZfM;
            if (textView3 != null) {
                textView3.setMaxLines(2);
            }
            android.widget.TextView textView4 = this.DBxZfM;
            if (textView4 != null) {
                textView4.setTextSize(16.0f);
            }
        } else {
            android.widget.TextView textView5 = this.DBxZfM;
            if (textView5 != null) {
                textView5.setMaxWidth(Integer.MAX_VALUE);
            }
            android.widget.TextView textView6 = this.DBxZfM;
            if (textView6 != null) {
                textView6.setMaxLines(1);
            }
            android.widget.TextView textView7 = this.DBxZfM;
            if (textView7 != null) {
                textView7.setTextSize(18.0f);
            }
        }
        MarketCoinInfo marketCoinInfoQbewEr3 = QbewEr();
        if (marketCoinInfoQbewEr3 != null) {
            oUJ.KWHzl.OLrzqt(marketCoinInfoQbewEr3.getInstrumentId(), marketCoinInfoQbewEr3.getInstrumentType());
        }
        C36250oUv c36250oUvQfsBiF = QfsBiF();
        if (c36250oUvQfsBiF != null) {
            copydefault(c36250oUvQfsBiF);
        }
        InterfaceC39499ptW interfaceC39499ptWIsConnected = isConnected();
        if (interfaceC39499ptWIsConnected == null || !interfaceC39499ptWIsConnected.AhwBna()) {
            return;
        }
        InterfaceC39499ptW interfaceC39499ptWIsConnected2 = isConnected();
        if (interfaceC39499ptWIsConnected2 != null) {
            interfaceC39499ptWIsConnected2.OLrzqt(java.lang.Boolean.FALSE);
        }
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE = this.ixgjPv;
        if (viewOnClickListenerC39746pyE != null) {
            viewOnClickListenerC39746pyE.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout = this.DCUTEIddSDPG;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        OLrzqt(true);
    }

    @Override // o.oYA
    public void hUfVAv() {
        C36250oUv c36250oUvQfsBiF = QfsBiF();
        if (c36250oUvQfsBiF != null) {
            c36250oUvQfsBiF.QfsBiF();
        }
        C36250oUv c36250oUvQfsBiF2 = QfsBiF();
        if (c36250oUvQfsBiF2 != null) {
            c36250oUvQfsBiF2.invalidate();
        }
        C39816pzV c39816pzVRJOkX = RJOkX();
        if (c39816pzVRJOkX != null) {
            c39816pzVRJOkX.setData();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // o.oYA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept() {
        C36327oXr tradingView;
        InterfaceC36254oUz interfaceC36254oUzFinit;
        InterfaceC36254oUz interfaceC36254oUzFinit2;
        C39816pzV c39816pzVRJOkX;
        TradingViewManager.StateListAnimator stateListAnimator;
        android.widget.FrameLayout frameLayout = this.DGOPHZ;
        if (pEI.EZpvd.AEQbTJ() && !QKVWgx()) {
            this.DNMMPQ = new LoaderManager();
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout = this.fdOvFl;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            C36250oUv c36250oUvQfsBiF = QfsBiF();
            if (c36250oUvQfsBiF != null) {
                c36250oUvQfsBiF.setVisibility(8);
            }
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            try {
                stateListAnimator = TradingViewManager.Companion;
            } catch (java.lang.Exception e) {
                pUU.copydefault("MarketKlineLandScapeFragment", "Failed to create TradingView: " + e);
            }
            if (stateListAnimator.OLrzqt(contextRequireContext)) {
                TradingViewManager tradingViewManagerCopydefault = stateListAnimator.copydefault(contextRequireContext);
                android.webkit.WebChromeClient webChromeClient = this.DNMMPQ;
                Intrinsics.copydefault(webChromeClient);
                tradingView = tradingViewManagerCopydefault.getTradingView(webChromeClient);
                copydefault(tradingView);
                java.lang.String strAEQbTJ = C48872udq.AEQbTJ.AEQbTJ("file_market_tradingview_js");
                interfaceC36254oUzFinit = finit();
                if (interfaceC36254oUzFinit != null) {
                    interfaceC36254oUzFinit.setInitUrlListener(new TaskStackBuilder(strAEQbTJ));
                }
                interfaceC36254oUzFinit2 = finit();
                if (interfaceC36254oUzFinit2 != null) {
                    interfaceC36254oUzFinit2.AxsJAY();
                }
                c39816pzVRJOkX = RJOkX();
                if (c39816pzVRJOkX == null) {
                    c39816pzVRJOkX.setData();
                    return;
                }
                return;
            }
            pUU.copydefault("MarketKlineLandScapeFragment", "Cannot create TradingView in non-main process");
            tradingView = null;
            copydefault(tradingView);
            java.lang.String strAEQbTJ2 = C48872udq.AEQbTJ.AEQbTJ("file_market_tradingview_js");
            interfaceC36254oUzFinit = finit();
            if (interfaceC36254oUzFinit != null) {
            }
            interfaceC36254oUzFinit2 = finit();
            if (interfaceC36254oUzFinit2 != null) {
            }
            c39816pzVRJOkX = RJOkX();
            if (c39816pzVRJOkX == null) {
            }
        } else {
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout2 = this.fdOvFl;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            C36250oUv c36250oUvQfsBiF2 = QfsBiF();
            if (c36250oUvQfsBiF2 != null) {
                c36250oUvQfsBiF2.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: o.pgF$LoaderManager */
    public static final class LoaderManager extends android.webkit.WebChromeClient {
        public LoaderManager() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
            Intrinsics.checkNotNullParameter(consoleMessage, "");
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(android.webkit.WebView webView, int i) {
            if (i == 100) {
                pUU.KWHzl(C38795pgF.this.getTAG(), "initTradingView success, dismiss loading");
                C38795pgF.this.Dmq();
            }
            super.onProgressChanged(webView, i);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
            C38795pgF c38795pgF;
            InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb;
            TemplateSetting templateSettingWlaJM;
            TemplateSetting templateSettingWlaJM2;
            InterfaceC39499ptW interfaceC39499ptWIsConnected;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(jsPromptResult, "");
            java.lang.Object objFromJson = new Gson().fromJson(str2, (java.lang.Class<java.lang.Object>) JsonObject.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            JsonObject jsonObject = (JsonObject) objFromJson;
            int asInt = jsonObject.get("type").getAsInt();
            if (asInt == 0) {
                android.content.Context context = C38795pgF.this.getContext();
                if (context != null && (stateListAnimatorDNCPSb = (c38795pgF = C38795pgF.this).dNCPSb()) != null) {
                    C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
                    stateListAnimatorDNCPSb.EZpvd((c36250oUvQfsBiF == null || (templateSettingWlaJM = c36250oUvQfsBiF.wlaJM()) == null) ? 15 : templateSettingWlaJM.getSPTimeInterval(), context);
                }
            } else if (asInt == 1) {
                java.lang.String asString = jsonObject.get("path").getAsString();
                Intrinsics.checkNotNullExpressionValue(asString, "");
                JsonObject asJsonObject = jsonObject.get(MetricsSQLiteCacheKt.METRICS_PARAMS).getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                final C38795pgF c38795pgF2 = C38795pgF.this;
                JsonElement jsonElement = asJsonObject.get("firstDataRequest");
                if (jsonElement == null || jsonElement.getAsBoolean()) {
                    InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb2 = c38795pgF2.dNCPSb();
                    if (stateListAnimatorDNCPSb2 != null) {
                        stateListAnimatorDNCPSb2.copydefault(c38795pgF2, asString, asJsonObject, new Function2() { // from class: o.phP
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return C38795pgF.LoaderManager.AEQbTJ(c38795pgF2, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                            }
                        });
                    }
                } else {
                    C36250oUv c36250oUvQfsBiF2 = c38795pgF2.QfsBiF();
                    if (c36250oUvQfsBiF2 != null && (templateSettingWlaJM2 = c36250oUvQfsBiF2.wlaJM()) != null) {
                        int sPTimeInterval = templateSettingWlaJM2.getSPTimeInterval();
                        InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb3 = c38795pgF2.dNCPSb();
                        if (stateListAnimatorDNCPSb3 != null) {
                            stateListAnimatorDNCPSb3.copydefault((LifecycleOwner) c38795pgF2, pEF.OLrzqt.OLrzqt(sPTimeInterval), c38795pgF2.run, oLT.djBIcL(), true, new Function1() { // from class: o.phR
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C38795pgF.LoaderManager.AEQbTJ(c38795pgF2, (java.lang.String) obj);
                                }
                            });
                        }
                    }
                }
            } else if (asInt == 2) {
                if (C38795pgF.this.isConnected() != null && (interfaceC39499ptWIsConnected = C38795pgF.this.isConnected()) != null) {
                    interfaceC39499ptWIsConnected.isConnected();
                }
                C38795pgF.this.fetchVPNInfo(true);
                C38795pgF.this.DbNXlk(!r8.DXXBbs());
            }
            jsPromptResult.confirm();
            return true;
        }

        public static final Unit AEQbTJ(C38795pgF c38795pgF, boolean z, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            c38795pgF.run = str;
            if (z) {
                c38795pgF.Dmq();
            }
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(C38795pgF c38795pgF, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            c38795pgF.run = str;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.pgF$TaskStackBuilder */
    public static final class TaskStackBuilder implements C36327oXr.StateListAnimator {
        public final /* synthetic */ java.lang.String copydefault;

        public TaskStackBuilder(java.lang.String str) {
            this.copydefault = str;
        }

        @Override // o.C36327oXr.StateListAnimator
        public java.lang.String KWHzl() {
            return this.copydefault + "/OKTradingView/index.html";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    @Override // o.InterfaceC36340oYd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void KWHzl(java.lang.String str) {
        C36327oXr tradingView;
        TradingViewManager.StateListAnimator stateListAnimator;
        android.widget.FrameLayout frameLayout = this.DGOPHZ;
        if (frameLayout == null) {
            return;
        }
        android.content.Context context = getContext();
        if (context == null) {
            context = C32979mnm.EZpvd.OLrzqt();
        }
        try {
            stateListAnimator = TradingViewManager.Companion;
        } catch (java.lang.Exception e) {
            pUU.copydefault("MarketKlineLandScapeFragment", "Failed to create TradingView: " + e);
        }
        if (stateListAnimator.OLrzqt(context)) {
            TradingViewManager tradingViewManagerCopydefault = stateListAnimator.copydefault(context);
            android.webkit.WebChromeClient webChromeClient = this.DNMMPQ;
            Intrinsics.copydefault(webChromeClient);
            tradingView = tradingViewManagerCopydefault.getTradingView(webChromeClient);
            copydefault(tradingView);
            frameLayout.removeAllViews();
            if (finit() != null) {
                InterfaceC36254oUz interfaceC36254oUzFinit = finit();
                Intrinsics.copydefault(interfaceC36254oUzFinit, "");
                if (((C36327oXr) interfaceC36254oUzFinit).getParent() != null) {
                    InterfaceC36254oUz interfaceC36254oUzFinit2 = finit();
                    Intrinsics.copydefault(interfaceC36254oUzFinit2, "");
                    android.view.ViewParent parent = ((C36327oXr) interfaceC36254oUzFinit2).getParent();
                    Intrinsics.copydefault(parent, "");
                    ((android.view.ViewGroup) parent).removeView((C36327oXr) finit());
                }
            }
            if (finit() == null) {
                frameLayout.addView((C36327oXr) finit());
                return;
            } else {
                QCjLjM();
                return;
            }
        }
        pUU.copydefault("MarketKlineLandScapeFragment", "Cannot create TradingView in non-main process");
        tradingView = null;
        copydefault(tradingView);
        frameLayout.removeAllViews();
        if (finit() != null) {
        }
        if (finit() == null) {
        }
    }

    @Override // o.oYA
    public void values() {
        super.values();
        android.widget.FrameLayout frameLayout = this.DGOPHZ;
        if (frameLayout != null) {
            InterfaceC36254oUz interfaceC36254oUzFinit = finit();
            frameLayout.removeView(interfaceC36254oUzFinit != null ? interfaceC36254oUzFinit.zsXlph() : null);
        }
    }

    @Override // o.oYA
    public void getPostValueLengthLimit() {
        super.getPostValueLengthLimit();
        android.widget.FrameLayout frameLayout = this.DGOPHZ;
        if (frameLayout != null) {
            InterfaceC36254oUz interfaceC36254oUzFinit = finit();
            frameLayout.removeView(interfaceC36254oUzFinit != null ? interfaceC36254oUzFinit.zsXlph() : null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r2.countDownTimeExpire() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) (r0 != null ? r0.getBizPreQuoteStatus() : null), (java.lang.Object) "ACTIVE") != false) goto L37;
     */
    @Override // o.oYA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(AbstractC54531xLw abstractC54531xLw) {
        MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
        if (marketCoinInfoQbewEr != null) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
            BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfoQbewEr.getInstrumentType(), marketCoinInfoQbewEr.getInstrumentId(), null, null, 12, null) : null;
            this.DLWbHP = minSuggestedInstrument$default;
            if (minSuggestedInstrument$default != null) {
                if (minSuggestedInstrument$default != null) {
                    minSuggestedInstrument$default.getBizContinuousStatus();
                }
                if (minSuggestedInstrument$default.getCountDownInfo() != null) {
                    CountDownInfo countDownInfo = minSuggestedInstrument$default.getCountDownInfo();
                    Intrinsics.copydefault(countDownInfo);
                    if (Intrinsics.EZpvd((java.lang.Object) countDownInfo.getType(), (java.lang.Object) "0")) {
                        CountDownInfo countDownInfo2 = minSuggestedInstrument$default.getCountDownInfo();
                        Intrinsics.copydefault(countDownInfo2);
                    }
                    copydefault("0", minSuggestedInstrument$default.getCountDownInfo());
                    return;
                }
                java.util.List listGEmmrt = yDY.gEmmrt("SPOT", "SWAP");
                BizInstrument bizInstrument = this.DLWbHP;
                if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), bizInstrument != null ? bizInstrument.getInstType() : null)) {
                    BizInstrument bizInstrument2 = this.DLWbHP;
                    if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getBizContinuousStatus() : null), (java.lang.Object) "1")) {
                        BizInstrument bizInstrument3 = this.DLWbHP;
                    }
                    BizInstrument bizInstrument4 = this.DLWbHP;
                    isShowNewCoin$default(this, Intrinsics.EZpvd((java.lang.Object) (bizInstrument4 != null ? bizInstrument4.getBizContinuousStatus() : null), (java.lang.Object) "1") ? "1" : "3", null, 2, null);
                    return;
                }
                super.EZpvd(abstractC54531xLw);
                isShowNewCoin$default(this, "2", null, 2, null);
            }
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
        this.DWgRXt = marketTopInfo;
        android.widget.TextView textView = this.OTwTPd;
        if (textView != null) {
            textView.setText(marketTopInfo.getTPrice());
        }
        android.widget.TextView textView2 = this.DGgnkA;
        if (textView2 != null) {
            textView2.setText(marketTopInfo.getTIncrease());
        }
        android.widget.TextView textView3 = this.hCLrkq;
        if (textView3 != null) {
            textView3.setText("≈" + marketTopInfo.getTLocalPrice());
        }
        android.widget.TextView textView4 = this.DGUQLI;
        if (textView4 != null) {
            textView4.setText(marketTopInfo.getT24HighPrice());
        }
        android.widget.TextView textView5 = this.DsrFlB;
        if (textView5 != null) {
            textView5.setText(marketTopInfo.getT24LowPrice());
        }
        android.widget.TextView textView6 = this.igXuih;
        if (textView6 != null) {
            java.lang.String second = marketTopInfo.getT24Volume().getSecond();
            if (second == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) second)) {
                strAYXKKw2 = C33070mpX.AYXKKw(C35964oKf.Fragment.RlQdEF);
            } else {
                strAYXKKw2 = C33070mpX.AYXKKw(C35964oKf.Fragment.RlQdEF) + "(" + ((java.lang.Object) marketTopInfo.getT24Volume().getSecond()) + ")";
            }
            textView6.setText(strAYXKKw2);
        }
        android.widget.TextView textView7 = this.fjfviF;
        if (textView7 != null) {
            textView7.setText(marketTopInfo.getT24Volume().getFirst());
        }
        android.widget.TextView textView8 = this.QwvEab;
        if (textView8 != null) {
            java.lang.String second2 = marketTopInfo.getT24Turnover().getSecond();
            if (second2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) second2)) {
                strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.DXXBbs);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.DXXBbs) + "(" + ((java.lang.Object) marketTopInfo.getT24Turnover().getSecond()) + ")";
            }
            textView8.setText(strAYXKKw);
        }
        android.widget.TextView textView9 = this.htlTjW;
        if (textView9 != null) {
            textView9.setText(marketTopInfo.getT24Turnover().getFirst());
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) marketTopInfo.getTPriceNoTh()) && C33129mqd.valueOf(marketTopInfo.getTPriceNoTh(), 0)) {
            android.widget.TextView textView10 = this.OTwTPd;
            if (textView10 != null) {
                textView10.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
            }
            android.widget.TextView textView11 = this.DGgnkA;
            if (textView11 != null) {
                textView11.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
            }
        } else if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) marketTopInfo.getTIncrease(), (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
            android.content.Context contextEjfBZ = ejfBZ();
            if (contextEjfBZ != null) {
                int iAEQbTJ = C33508mxl.AEQbTJ(contextEjfBZ);
                android.widget.TextView textView12 = this.OTwTPd;
                if (textView12 != null) {
                    textView12.setTextColor(iAEQbTJ);
                }
            }
            android.content.Context contextEjfBZ2 = ejfBZ();
            if (contextEjfBZ2 != null) {
                int iAEQbTJ2 = C33508mxl.AEQbTJ(contextEjfBZ2);
                android.widget.TextView textView13 = this.DGgnkA;
                if (textView13 != null) {
                    textView13.setTextColor(iAEQbTJ2);
                }
            }
        } else {
            android.content.Context contextEjfBZ3 = ejfBZ();
            if (contextEjfBZ3 != null) {
                int iCopydefault = C33508mxl.copydefault(contextEjfBZ3);
                android.widget.TextView textView14 = this.OTwTPd;
                if (textView14 != null) {
                    textView14.setTextColor(iCopydefault);
                }
            }
            android.content.Context contextEjfBZ4 = ejfBZ();
            if (contextEjfBZ4 != null) {
                int iCopydefault2 = C33508mxl.copydefault(contextEjfBZ4);
                android.widget.TextView textView15 = this.DGgnkA;
                if (textView15 != null) {
                    textView15.setTextColor(iCopydefault2);
                }
            }
        }
        android.view.View view = this.UhxbNG;
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.pgZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C38795pgF.zsXlph(this.EZpvd);
                }
            });
        }
    }

    public static final void zsXlph(C38795pgF c38795pgF) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQfsBiF.AkhnZx()) != null) {
            android.view.View view = c38795pgF.UhxbNG;
            chartViewOutSideConfigAkhnZx2.setTopPanelHeight(view != null ? view.getTop() : 0);
        }
        C36250oUv c36250oUvQfsBiF2 = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF2 == null || (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF2.AkhnZx()) == null) {
            return;
        }
        int topPanelHeight = chartViewOutSideConfigAkhnZx.getTopPanelHeight();
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = c38795pgF.OxVOHk;
        if (viewOnClickListenerC39742pyA != null) {
            viewOnClickListenerC39742pyA.setDrawToolTopMargin(topPanelHeight);
        }
    }

    @Override // o.oYA, o.InterfaceC39563puh.Application
    public void gwTjWJ() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((ActivityC38834pgs) activity).OLrzqt();
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.oYA, o.InterfaceC39563puh.Application
    public void copydefault(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.copydefault(list);
        android.view.View view = this.UhxbNG;
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.phH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C38795pgF.zLjUOn(this.OLrzqt);
                }
            });
        }
    }

    public static final void zLjUOn(C38795pgF c38795pgF) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQfsBiF.AkhnZx()) != null) {
            android.view.View view = c38795pgF.UhxbNG;
            chartViewOutSideConfigAkhnZx2.setTopPanelHeight(view != null ? view.getTop() : 0);
        }
        C36250oUv c36250oUvQfsBiF2 = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF2 == null || (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF2.AkhnZx()) == null) {
            return;
        }
        int topPanelHeight = chartViewOutSideConfigAkhnZx.getTopPanelHeight();
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = c38795pgF.OxVOHk;
        if (viewOnClickListenerC39742pyA != null) {
            viewOnClickListenerC39742pyA.setDrawToolTopMargin(topPanelHeight);
        }
    }

    private final void zblBkD() {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        final ViewOnClickListenerC39407prj viewOnClickListenerC39407prj = new ViewOnClickListenerC39407prj(context);
        viewOnClickListenerC39407prj.AEQbTJ(getString(C35964oKf.Fragment.Ufzxmz));
        java.lang.String string = getString(C35964oKf.Fragment.igXuih);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC39407prj.OLrzqt(string, new View.OnClickListener() { // from class: o.pgW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C38795pgF.EZpvd(this.copydefault, viewOnClickListenerC39407prj, view);
            }
        });
        viewOnClickListenerC39407prj.AEQbTJ(2);
        java.lang.String string2 = getString(C35964oKf.Fragment.dYepVG);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC39407prj.copydefault(string2, null);
        viewOnClickListenerC39407prj.setCanceledOnTouchOutside(true);
        viewOnClickListenerC39407prj.show();
    }

    public static final void EZpvd(C38795pgF c38795pgF, ViewOnClickListenerC39407prj viewOnClickListenerC39407prj, android.view.View view) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        java.util.ArrayList<DrawLineData.DrawLineItem> linesList;
        java.lang.String coinId;
        java.lang.Integer type;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        java.util.ArrayList<DrawLineData.DrawLineItem> linesList2;
        java.util.HashMap<java.lang.String, oWN> mapZLjUOn;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        java.util.ArrayList<DrawLineData.DrawLineItem> linesList3;
        DrawLineData drawLineData = DrawLineData.copydefault;
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayListFetchVPNInfo = drawLineData.fetchVPNInfo();
        if (arrayListFetchVPNInfo.size() > C37895pEr.copydefault.EZpvd()) {
            drawLineData.EZpvd().removeAll(arrayListFetchVPNInfo);
        } else {
            if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
                C36250oUv c36250oUvQfsBiF = c38795pgF.QfsBiF();
                if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQfsBiF.AkhnZx()) != null && (linesList2 = chartViewOutSideConfigAkhnZx2.getLinesList()) != null) {
                    oYA.uploadDrawingData$default(c38795pgF, linesList2, true, false, 4, null);
                }
            } else {
                C36250oUv c36250oUvQfsBiF2 = c38795pgF.QfsBiF();
                if (c36250oUvQfsBiF2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF2.AkhnZx()) != null && (linesList = chartViewOutSideConfigAkhnZx.getLinesList()) != null) {
                    for (DrawLineData.DrawLineItem drawLineItem : linesList) {
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
                    DrawLineData drawLineData2 = DrawLineData.copydefault;
                    drawLineData2.EZpvd().removeAll(linesList);
                    drawLineData2.EZpvd().addAll(linesList);
                    drawLineData2.EZpvd(drawLineData2.EZpvd());
                }
            }
            java.lang.String strOcIXYQ = c38795pgF.OcIXYQ();
            c38795pgF.EZpvd(strOcIXYQ != null ? strOcIXYQ : "");
        }
        C36250oUv c36250oUvQfsBiF3 = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF3 != null && (chartViewOutSideConfigAkhnZx3 = c36250oUvQfsBiF3.AkhnZx()) != null && (linesList3 = chartViewOutSideConfigAkhnZx3.getLinesList()) != null) {
            linesList3.clear();
        }
        C36250oUv c36250oUvQfsBiF4 = c38795pgF.QfsBiF();
        if (c36250oUvQfsBiF4 != null) {
            c36250oUvQfsBiF4.invalidate();
        }
        c38795pgF.OLrzqt(true);
        viewOnClickListenerC39407prj.dismiss();
        C36250oUv c36250oUvQfsBiF5 = c38795pgF.QfsBiF();
        oWN own = (c36250oUvQfsBiF5 == null || (mapZLjUOn = c36250oUvQfsBiF5.zLjUOn()) == null) ? null : mapZLjUOn.get("ds0");
        if (own != null) {
            own.AwvSrB();
        }
        DrawLineData.copydefault.EZpvd((DrawLineData.LineType) null);
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE = c38795pgF.ixgjPv;
        if (viewOnClickListenerC39746pyE != null) {
            viewOnClickListenerC39746pyE.AEQbTJ();
        }
        c38795pgF.UlJrfe();
    }

    @Override // o.InterfaceC39563puh.Application
    public void AYXKKw(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AkhnZx();
        Dmq();
        C36250oUv c36250oUvQfsBiF = QfsBiF();
        if (c36250oUvQfsBiF != null) {
            c36250oUvQfsBiF.AEQbTJ(list);
        }
        C36250oUv c36250oUvQfsBiF2 = QfsBiF();
        if (c36250oUvQfsBiF2 != null) {
            c36250oUvQfsBiF2.setShowEmptyUi(false);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.InterfaceC39563puh.Application
    public void AhwBna(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C36250oUv c36250oUvQfsBiF = QfsBiF();
        if (c36250oUvQfsBiF != null) {
            c36250oUvQfsBiF.KWHzl(list);
        }
    }

    public final void UlJrfe() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = this.OxVOHk;
        if (viewOnClickListenerC39742pyA != null) {
            viewOnClickListenerC39742pyA.setVisibility(8);
        }
        DcqEDu();
    }

    public final void fERRXa() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = this.OxVOHk;
        if (viewOnClickListenerC39742pyA != null) {
            viewOnClickListenerC39742pyA.copydefault();
        }
    }

    public final void KWHzl(double d, double d2) {
        C39805pzK c39805pzK;
        C39805pzK c39805pzK2 = this.DaRZkR;
        if (c39805pzK2 != null) {
            c39805pzK2.setVisibility(0);
        }
        C36250oUv c36250oUvQfsBiF = QfsBiF();
        if (c36250oUvQfsBiF == null || (c39805pzK = this.DaRZkR) == null) {
            return;
        }
        c39805pzK.setBitmapAndPos(c36250oUvQfsBiF, d, d2);
    }

    public final void dUDNAs() {
        C39805pzK c39805pzK = this.DaRZkR;
        if (c39805pzK != null) {
            c39805pzK.setVisibility(8);
        }
    }

    public final void igXuih() {
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd((DrawLineData.LineType) null);
        drawLineData.KWHzl((DrawLineData.DrawLineItem) null);
        OLrzqt(true);
        UlJrfe();
        C39835pzo c39835pzo = this.UrRBLY;
        if (c39835pzo != null) {
            c39835pzo.setScrollingEnabled(false);
        }
    }

    public final void QCjLjM() {
        pUU.copydefault("MarketKlineLandScapeFragment", "Cannot add null TradingView to layout, finishing activity");
        FragmentActivity activity = getActivity();
        if (activity == null || !isAdded() || activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    public static /* synthetic */ void isShowNewCoin$default(C38795pgF c38795pgF, java.lang.String str, CountDownInfo countDownInfo, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            countDownInfo = null;
        }
        c38795pgF.copydefault(str, countDownInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(java.lang.String str, CountDownInfo countDownInfo) {
        java.lang.String safeString$default;
        java.lang.String tradeSymbol;
        java.lang.String displayQuoteSymbol;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xMW xmwKWHzl;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLEZpvd;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLDjBIcL;
        Group group;
        android.widget.RelativeLayout relativeLayout;
        C36250oUv c36250oUvQfsBiF;
        android.widget.ScrollView scrollView;
        android.widget.LinearLayout linearLayout;
        int iHashCode = str.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 49) {
                group = this.TarCU;
                if (group != null) {
                    group.setVisibility(8);
                }
                relativeLayout = this.QIZEnU;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
                c36250oUvQfsBiF = QfsBiF();
                if (c36250oUvQfsBiF != null) {
                    c36250oUvQfsBiF.setVisibility(8);
                }
                scrollView = this.OFhtUX;
                if (scrollView != null) {
                    scrollView.setVisibility(0);
                }
                linearLayout = this.fERRXa;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
                    OJuSTm();
                    return;
                } else {
                    QSLkRj();
                    return;
                }
            }
            group = this.TarCU;
            if (group != null) {
            }
            relativeLayout = this.QIZEnU;
            if (relativeLayout != null) {
            }
            c36250oUvQfsBiF = QfsBiF();
            if (c36250oUvQfsBiF != null) {
            }
            scrollView = this.OFhtUX;
            if (scrollView != null) {
            }
            linearLayout = this.fERRXa;
            if (linearLayout != null) {
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
            }
        } else if (str.equals("0")) {
            Group group2 = this.TarCU;
            if (group2 != null) {
                group2.setVisibility(CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends MarketTypeEnum>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt(MarketTypeEnum.CALL_AUCTION, MarketTypeEnum.PRE_QUOTE)), countDownInfo != null ? countDownInfo.getNextStage() : null) ^ true ? 0 : 8);
            }
            MarketTopInfo marketTopInfo = new MarketTopInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554431, null);
            this.DWgRXt = marketTopInfo;
            marketTopInfo.setTPriceNoTh("0");
            marketTopInfo.setTPrice(pDM.EZpvd(AudioStats.AUDIO_AMPLITUDE_NONE, 4));
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            java.lang.String str2 = "";
            if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl()) == null || (c54536xMLAYXKKw = xmwKWHzl.AYXKKw("0.0000")) == null || (c54536xMLEZpvd = c54536xMLAYXKKw.EZpvd("4")) == null || (c54536xMLAkhnZx = c54536xMLEZpvd.AkhnZx()) == null || (c54536xMLAEQbTJ = c54536xMLAkhnZx.AEQbTJ(true)) == null || (c54536xMLDjBIcL = c54536xMLAEQbTJ.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) {
                safeString$default = "";
            }
            marketTopInfo.setTLocalPrice(safeString$default);
            marketTopInfo.setTIncrease(pTB.formatPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE)), 0, null, 3, null));
            marketTopInfo.setT24HighPrice(marketTopInfo.getTPrice());
            marketTopInfo.setT24LowPrice(marketTopInfo.getTPrice());
            java.lang.String tPrice = marketTopInfo.getTPrice();
            BizInstrument bizInstrument = this.DLWbHP;
            if (bizInstrument == null || (tradeSymbol = bizInstrument.getTradeSymbol()) == null) {
                tradeSymbol = "";
            }
            marketTopInfo.setT24Volume(new kotlin.Pair<>(tPrice, tradeSymbol));
            java.lang.String tPrice2 = marketTopInfo.getTPrice();
            BizInstrument bizInstrument2 = this.DLWbHP;
            if (bizInstrument2 != null && (displayQuoteSymbol = bizInstrument2.getDisplayQuoteSymbol()) != null) {
                str2 = displayQuoteSymbol;
            }
            marketTopInfo.setT24Turnover(new kotlin.Pair<>(tPrice2, str2));
            AEQbTJ(marketTopInfo);
            android.widget.RelativeLayout relativeLayout2 = this.QIZEnU;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout2 = this.fERRXa;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            C36250oUv c36250oUvQfsBiF2 = QfsBiF();
            if (c36250oUvQfsBiF2 != null) {
                c36250oUvQfsBiF2.setVisibility(8);
            }
            android.widget.ScrollView scrollView2 = this.OFhtUX;
            if (scrollView2 != null) {
                scrollView2.setVisibility(8);
            }
            if (countDownInfo != null) {
                C39837pzq c39837pzq = this.RVsVBY;
                if (c39837pzq != null) {
                    c39837pzq.setImg(countDownInfo.getIcon());
                }
                C39837pzq c39837pzq2 = this.RVsVBY;
                if (c39837pzq2 != null) {
                    C48914uef c48914uef = C48914uef.EZpvd;
                    MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
                    java.lang.String instrumentId = marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null;
                    MarketCoinInfo marketCoinInfoQbewEr2 = QbewEr();
                    c39837pzq2.setTitle(C48914uef.getTitleByIdAndType$default(c48914uef, instrumentId, marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentType() : null, false, false, null, false, false, 124, null));
                }
                C39837pzq c39837pzq3 = this.RVsVBY;
                if (c39837pzq3 != null) {
                    c39837pzq3.setClickSkill(C33142mqq.EZpvd.OLrzqt() ? countDownInfo.getNoticeUrlCn() : countDownInfo.getNoticeUrlEn());
                }
                AEQbTJ(countDownInfo.getOnlineTime(), countDownInfo.getType());
                return;
            }
            return;
        }
        Group group3 = this.TarCU;
        if (group3 != null) {
            group3.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout3 = this.fERRXa;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        C36250oUv c36250oUvQfsBiF3 = QfsBiF();
        if (c36250oUvQfsBiF3 != null) {
            c36250oUvQfsBiF3.setVisibility(0);
        }
        C39837pzq c39837pzq4 = this.RVsVBY;
        if (c39837pzq4 != null) {
            c39837pzq4.OLrzqt();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OJuSTm() {
        android.view.View view;
        android.content.Context contextEjfBZ = ejfBZ();
        if (contextEjfBZ != null) {
            java.lang.Object objCopydefault = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).copydefault(contextEjfBZ, new Function0() { // from class: o.phs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C38795pgF.uzCIH(this.AEQbTJ);
                }
            });
            view = objCopydefault instanceof android.view.View ? (android.view.View) objCopydefault : null;
        }
        this.Ufzxmz = view;
        if (view != null) {
            android.widget.ScrollView scrollView = this.OFhtUX;
            if (scrollView != null) {
                scrollView.removeAllViews();
            }
            android.widget.ScrollView scrollView2 = this.OFhtUX;
            if (scrollView2 != null) {
                scrollView2.addView(view);
            }
        }
        OFhtUX();
    }

    public static final Unit uzCIH(C38795pgF c38795pgF) {
        c38795pgF.OFhtUX();
        return Unit.INSTANCE;
    }

    public final void OFhtUX() {
        java.lang.String strOcIXYQ = OcIXYQ();
        if (strOcIXYQ != null) {
            C33527myD.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getMarketCallAuctionDetails(strOcIXYQ), this), new Function1() { // from class: o.pgR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38795pgF.djBIcL((java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.pgT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38795pgF.EZpvd(this.copydefault, (ResponseData) obj);
                }
            }, 2, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.pgF$Application */
    public static final class Application implements InterfaceC55701xos<SystemTimeData> {
        public final /* synthetic */ CallAuctionInfoData AEQbTJ;
        public final /* synthetic */ C38795pgF KWHzl;

        public Application(CallAuctionInfoData callAuctionInfoData, C38795pgF c38795pgF) {
            this.AEQbTJ = callAuctionInfoData;
            this.KWHzl = c38795pgF;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, SystemTimeData systemTimeData, java.lang.Exception exc) throws java.lang.InterruptedException {
            java.lang.String strOLrzqt;
            java.lang.String tradeSymbol;
            CallAuctionInfoData callAuctionInfoData = this.AEQbTJ;
            C38795pgF c38795pgF = this.KWHzl;
            if (systemTimeData != null) {
                if (!Intrinsics.EZpvd((java.lang.Object) TradeLoadingMode.CALL_AUCTION, (java.lang.Object) callAuctionInfoData.getState()) || systemTimeData.getTs().compareTo(callAuctionInfoData.getAuctionEndTime()) >= 0) {
                    BuildersKt__BuildersKt.runBlocking$default(null, new MarketKlineLandScapeFragment$checkAuction$1$2$1$1$result$1$1(c38795pgF, null), 1, null);
                    return;
                }
                BizInstrument bizInstrument = c38795pgF.DLWbHP;
                if (bizInstrument == null || (tradeSymbol = bizInstrument.getTradeSymbol()) == null || (strOLrzqt = C55687xoe.AEQbTJ.OLrzqt(tradeSymbol)) == null) {
                    strOLrzqt = "";
                }
                java.lang.String str = strOLrzqt;
                C48914uef c48914uef = C48914uef.EZpvd;
                MarketCoinInfo marketCoinInfoQbewEr = c38795pgF.QbewEr();
                java.lang.String instrumentId = marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null;
                MarketCoinInfo marketCoinInfoQbewEr2 = c38795pgF.QbewEr();
                java.lang.String titleByIdAndType$default = C48914uef.getTitleByIdAndType$default(c48914uef, instrumentId, marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentType() : null, false, false, null, false, false, 124, null);
                KeyEvent.Callback callback = c38795pgF.Ufzxmz;
                InterfaceC49438uoZ interfaceC49438uoZ = callback instanceof InterfaceC49438uoZ ? (InterfaceC49438uoZ) callback : null;
                if (interfaceC49438uoZ != null) {
                    interfaceC49438uoZ.EZpvd(C33129mqd.valueOf(systemTimeData.getTs()), callAuctionInfoData, titleByIdAndType$default, str, "landScape");
                }
                c38795pgF.aUsmxb();
            }
        }
    }

    public static final Unit djBIcL(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        Objects.toString(th);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(AbstractC54531xLw abstractC54531xLw) {
        super.EZpvd(abstractC54531xLw);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void QSLkRj() {
        android.view.View view;
        android.content.Context contextEjfBZ = ejfBZ();
        if (contextEjfBZ != null) {
            java.lang.Object objEZpvd = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).EZpvd(contextEjfBZ, new Function0() { // from class: o.phF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C38795pgF.iwGUEr(this.EZpvd);
                }
            });
            view = objEZpvd instanceof android.view.View ? (android.view.View) objEZpvd : null;
        }
        this.Ufzxmz = view;
        if (view != null) {
            android.widget.ScrollView scrollView = this.OFhtUX;
            if (scrollView != null) {
                scrollView.removeAllViews();
            }
            android.widget.ScrollView scrollView2 = this.OFhtUX;
            if (scrollView2 != null) {
                scrollView2.addView(view);
            }
        }
        OxVOHk();
    }

    public static final Unit iwGUEr(C38795pgF c38795pgF) {
        c38795pgF.OxVOHk();
        return Unit.INSTANCE;
    }

    public final void OxVOHk() {
        java.lang.String strOcIXYQ = OcIXYQ();
        if (strOcIXYQ != null) {
            C33527myD.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getPreQuoteDetails(strOcIXYQ), this), new Function1() { // from class: o.phN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38795pgF.AYXKKw((java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.phM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38795pgF.KWHzl(this.copydefault, (ResponseData) obj);
                }
            }, 2, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.pgF$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC55701xos<SystemTimeData> {
        public final /* synthetic */ PreQuoteInfoData OLrzqt;
        public final /* synthetic */ C38795pgF copydefault;

        public StateListAnimator(PreQuoteInfoData preQuoteInfoData, C38795pgF c38795pgF) {
            this.OLrzqt = preQuoteInfoData;
            this.copydefault = c38795pgF;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, SystemTimeData systemTimeData, java.lang.Exception exc) throws java.lang.InterruptedException {
            java.lang.String strOLrzqt;
            java.lang.String tradeSymbol;
            PreQuoteInfoData preQuoteInfoData = this.OLrzqt;
            C38795pgF c38795pgF = this.copydefault;
            if (systemTimeData != null) {
                if (systemTimeData.getTs().compareTo(preQuoteInfoData.getPreQuoteEndTimestamp()) >= 0) {
                    BuildersKt__BuildersKt.runBlocking$default(null, new MarketKlineLandScapeFragment$checkPreQuote$1$2$1$1$result$1$1(c38795pgF, null), 1, null);
                    return;
                }
                BizInstrument bizInstrument = c38795pgF.DLWbHP;
                if (bizInstrument == null || (tradeSymbol = bizInstrument.getTradeSymbol()) == null || (strOLrzqt = C55687xoe.AEQbTJ.OLrzqt(tradeSymbol)) == null) {
                    strOLrzqt = "";
                }
                java.lang.String str = strOLrzqt;
                C48914uef c48914uef = C48914uef.EZpvd;
                MarketCoinInfo marketCoinInfoQbewEr = c38795pgF.QbewEr();
                java.lang.String instrumentId = marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null;
                MarketCoinInfo marketCoinInfoQbewEr2 = c38795pgF.QbewEr();
                java.lang.String titleByIdAndType$default = C48914uef.getTitleByIdAndType$default(c48914uef, instrumentId, marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentType() : null, false, false, null, false, false, 124, null);
                KeyEvent.Callback callback = c38795pgF.Ufzxmz;
                InterfaceC49437uoY interfaceC49437uoY = callback instanceof InterfaceC49437uoY ? (InterfaceC49437uoY) callback : null;
                if (interfaceC49437uoY != null) {
                    interfaceC49437uoY.AEQbTJ(C33129mqd.valueOf(systemTimeData.getTs()), preQuoteInfoData, titleByIdAndType$default, str, "landScape");
                }
                c38795pgF.htlTjW();
            }
        }
    }

    public static final Unit AYXKKw(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        Objects.toString(th);
        return Unit.INSTANCE;
    }

    public final void fjfviF() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC55757xpv abstractC55757xpv = this.DCUTEIdCUTEI;
        if (abstractC55757xpv == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(yDY.copydefault(abstractC55757xpv));
    }

    public final void aUsmxb() {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.String instId;
        fjfviF();
        pUU.KWHzl("AuctionPresenter", "订阅推送---call auction");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        java.lang.String str = "";
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
            java.lang.String strORxRYg = ORxRYg();
            BizInstrument minSuggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strORxRYg == null ? "" : strORxRYg, OcIXYQ(), null, null, 12, null);
            if (minSuggestedInstrument$default != null && (instId = minSuggestedInstrument$default.getInstId()) != null) {
                str = instId;
            }
        }
        this.DCUTEIdCUTEI = new SharedElementCallback(strGEmmrt, str);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            AbstractC55757xpv abstractC55757xpv = this.DCUTEIdCUTEI;
            Intrinsics.copydefault(abstractC55757xpv);
            interfaceC54581xNrOLrzqt2.copydefault(yDY.copydefault(abstractC55757xpv));
        }
    }

    /* JADX INFO: renamed from: o.pgF$SharedElementCallback */
    public static final class SharedElementCallback extends AbstractC55757xpv {
        public SharedElementCallback(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        public void EZpvd(CallAuctionInfoData callAuctionInfoData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(callAuctionInfoData, "");
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("AuctionPresenter", "CallAuctionBizInfoListener---" + callAuctionInfoData);
            KeyEvent.Callback callback = C38795pgF.this.Ufzxmz;
            InterfaceC49438uoZ interfaceC49438uoZ = callback instanceof InterfaceC49438uoZ ? (InterfaceC49438uoZ) callback : null;
            if (interfaceC49438uoZ != null) {
                interfaceC49438uoZ.copydefault(callAuctionInfoData, "landScape");
            }
        }
    }

    public final void DCUTEIdCUTEI() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC55759xpx abstractC55759xpx = this.DcqEDu;
        if (abstractC55759xpx == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(yDY.copydefault(abstractC55759xpx));
    }

    public final void htlTjW() {
        DCUTEIdCUTEI();
        pUU.KWHzl("PreQuotePresenter", "订阅推送---call auction");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.lang.String strOcIXYQ = OcIXYQ();
        if (strOcIXYQ == null) {
            strOcIXYQ = "";
        }
        ComponentCallbacks2 componentCallbacks2 = new ComponentCallbacks2(strGEmmrt, strOcIXYQ);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(yDY.copydefault(componentCallbacks2));
        }
        this.DcqEDu = componentCallbacks2;
    }

    /* JADX INFO: renamed from: o.pgF$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 extends AbstractC55759xpx {
        public ComponentCallbacks2(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(PreQuoteInfoData preQuoteInfoData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(preQuoteInfoData, "");
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("PreQuotePresenter", "PreQuoteBizInfoListener---" + preQuoteInfoData);
            KeyEvent.Callback callback = C38795pgF.this.Ufzxmz;
            InterfaceC49437uoY interfaceC49437uoY = callback instanceof InterfaceC49437uoY ? (InterfaceC49437uoY) callback : null;
            if (interfaceC49437uoY != null) {
                interfaceC49437uoY.KWHzl(preQuoteInfoData, "normal");
            }
        }
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        BizInstrument minSuggestedInstrument$default;
        CountDownInfo countDownInfo;
        java.lang.String strAYXKKw;
        long jValueOf = C33129mqd.valueOf(str) - java.lang.System.currentTimeMillis();
        if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "0")) {
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "1")) {
                C39837pzq c39837pzq = this.RVsVBY;
                if (c39837pzq != null) {
                    c39837pzq.EZpvd();
                }
                C39837pzq c39837pzq2 = this.RVsVBY;
                if (c39837pzq2 != null) {
                    c39837pzq2.setRemindText(1);
                    return;
                }
                return;
            }
            C39837pzq c39837pzq3 = this.RVsVBY;
            if (c39837pzq3 != null) {
                c39837pzq3.EZpvd();
            }
            C39837pzq c39837pzq4 = this.RVsVBY;
            if (c39837pzq4 != null) {
                c39837pzq4.setRemindText(2);
                return;
            }
            return;
        }
        if (jValueOf >= 0) {
            C39837pzq c39837pzq5 = this.RVsVBY;
            if (c39837pzq5 != null) {
                c39837pzq5.KWHzl();
            }
            C39837pzq c39837pzq6 = this.RVsVBY;
            if (c39837pzq6 != null) {
                c39837pzq6.KWHzl(jValueOf >= 0 ? jValueOf / ((long) 1000) : 0L, new Function0() { // from class: o.phD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C38795pgF.AuCTelauCTel(this.OLrzqt);
                    }
                });
            }
            InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
            java.lang.String str3 = "";
            if (interfaceC54581xNrCopydefault != null) {
                java.lang.String strORxRYg = ORxRYg();
                minSuggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, strORxRYg == null ? "" : strORxRYg, OcIXYQ(), null, null, 12, null);
            } else {
                minSuggestedInstrument$default = null;
            }
            C39837pzq c39837pzq7 = this.RVsVBY;
            if (c39837pzq7 != null) {
                if (minSuggestedInstrument$default != null && (countDownInfo = minSuggestedInstrument$default.getCountDownInfo()) != null && (strAYXKKw = C33070mpX.AYXKKw(C37938pGg.OLrzqt(countDownInfo))) != null) {
                    str3 = strAYXKKw;
                }
                c39837pzq7.setContent(str3);
                return;
            }
            return;
        }
        EZpvd(fARcdN());
    }

    public static final Unit AuCTelauCTel(final C38795pgF c38795pgF) {
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgTimer = AbstractC58247yxg.timer(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgTimer, "");
        AbstractC58247yxg abstractC58247yxgObserveOn = C58156yvv.copydefault(abstractC58247yxgTimer, c38795pgF).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.phI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38795pgF.EZpvd(this.EZpvd, (java.lang.Long) obj);
            }
        };
        abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.phG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38795pgF.zLjUOn(function1, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C38795pgF c38795pgF, java.lang.Long l) {
        BizInstrument minSuggestedInstrument$default;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            java.lang.String strORxRYg = c38795pgF.ORxRYg();
            if (strORxRYg == null) {
                strORxRYg = "";
            }
            minSuggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, strORxRYg, c38795pgF.OcIXYQ(), null, null, 12, null);
        } else {
            minSuggestedInstrument$default = null;
        }
        c38795pgF.DLWbHP = minSuggestedInstrument$default;
        if (minSuggestedInstrument$default != null) {
            if (minSuggestedInstrument$default.getCountDownInfo() != null) {
                CountDownInfo countDownInfo = minSuggestedInstrument$default.getCountDownInfo();
                Intrinsics.copydefault(countDownInfo);
                java.lang.String onlineTime = countDownInfo.getOnlineTime();
                CountDownInfo countDownInfo2 = minSuggestedInstrument$default.getCountDownInfo();
                Intrinsics.copydefault(countDownInfo2);
                c38795pgF.AEQbTJ(onlineTime, countDownInfo2.getType());
            } else {
                c38795pgF.EZpvd(c38795pgF.fARcdN());
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.oYA, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        super.onDestroyView();
        C36250oUv c36250oUvQfsBiF = QfsBiF();
        if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQfsBiF.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx2.setScreenType(1);
        }
        C36250oUv c36250oUvQfsBiF2 = QfsBiF();
        if (c36250oUvQfsBiF2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setLandscapeKLineScrollY(0);
        }
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd((DrawLineData.LineType) null);
        drawLineData.KWHzl((DrawLineData.DrawLineItem) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Dmq() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (QKVWgx()) {
                ((ActivityC39220poG) activity).gEmmrt();
            } else {
                ((ActivityC38834pgs) activity).OLrzqt();
            }
        }
    }

    private final java.util.ArrayList<DrawLineData.DrawLineItem> EZpvd(java.util.ArrayList<DrawLineData.DrawLineItem> arrayList, java.lang.String str) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected(boolean z) {
        android.widget.RelativeLayout relativeLayout = this.heceqZ;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ^ true ? 0 : 8);
        }
    }

    public static final Unit EZpvd(C38795pgF c38795pgF, ResponseData responseData) {
        CallAuctionInfoData callAuctionInfoData;
        C56130xwx c56130xwxAYXKKw;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && ((java.util.List) responseData.getData()) != null) {
            java.util.List list = (java.util.List) responseData.getData();
            if (list == null || (callAuctionInfoData = (CallAuctionInfoData) list.get(0)) == null) {
                callAuctionInfoData = new CallAuctionInfoData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 127, (DefaultConstructorMarker) null);
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (c56130xwxAYXKKw = interfaceC54581xNrOLrzqt.AYXKKw()) != null) {
                c56130xwxAYXKKw.EZpvd(new Application(callAuctionInfoData, c38795pgF));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C38795pgF c38795pgF, ResponseData responseData) {
        java.util.List list;
        C56130xwx c56130xwxAYXKKw;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && (list = (java.util.List) responseData.getData()) != null) {
            PreQuoteInfoData preQuoteInfoData = (PreQuoteInfoData) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
            if (preQuoteInfoData == null) {
                preQuoteInfoData = new PreQuoteInfoData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (DefaultConstructorMarker) null);
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (c56130xwxAYXKKw = interfaceC54581xNrOLrzqt.AYXKKw()) != null) {
                c56130xwxAYXKKw.EZpvd(new StateListAnimator(preQuoteInfoData, c38795pgF));
            }
        }
        return Unit.INSTANCE;
    }
}
