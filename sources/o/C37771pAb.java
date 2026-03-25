package o;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.EntryType;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.DrawLineBean;
import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.features.kline.indicator.viewmodel.KlineIndicatorViewModel;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.component.business.klinequote.viemodel.KlineQuoteViewModel;
import com.okinc.kline.ui.view.MultiChartView$getKlineEvent$1;
import com.okinc.kline.ui.view.MyLifecycleEventObserver;
import com.okinc.kline.ui.view.model.IndicatorBean;
import com.okinc.kline.ui.view.model.IndicatorDataReq;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.okinc.rxutils.RxBus;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.C35964oKf;
import o.C36250oUv;
import o.C39339pqT;
import o.C39358pqm;
import o.C52761wXj;
import o.InterfaceC39563puh;
import o.oKD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pAb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37771pAb extends ConstraintLayout implements InterfaceC35977oKs, InterfaceC39508ptf, InterfaceC39500ptX, pAM {
    public ViewOnClickListenerC39742pyA AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public android.widget.ImageView AkhnZx;
    public C38780pfr AuCTel;
    public C39756pyO AuCTelauCTel;
    public C36250oUv AubY;
    public C36250oUv AwvSrB;
    public boolean AxsJAY;
    public java.lang.String DTwDnp;
    public boolean DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public InterfaceC58217yxC KWHzl;
    public InterfaceC35981oKw OLrzqt;
    public android.widget.RelativeLayout ORxRYg;
    public int OcIXYQ;
    public java.lang.String QKVWgx;
    public C39835pzo QOLQEE;
    public C55113xdn QUSxYX;
    public C36312oXc QVAiDq;
    public android.widget.RelativeLayout QbewEr;
    public int QfsBiF;
    public C39805pzK RJOkX;
    public ChartViewOutSideConfig RcXXUw;
    public MyLifecycleEventObserver UeEOUB;
    public android.widget.TextView aKErDB;
    public boolean copydefault;
    public InterfaceC39560pue dNCPSb;
    public boolean djBIcL;
    public android.widget.LinearLayout djSkpj;
    public boolean dvKsVJ;
    public int dxcTrN;
    public C38768pff ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public CoroutineScope fFgQHt;
    public final InterfaceC56387yDm fIwbmz;
    public DrawerLayout fJNWhG;
    public C39816pzV fZBcTu;
    public android.widget.ImageView fetchVPNInfo;
    public TemplateSetting finit;
    public pAR flVtFt;
    public boolean gEmmrt;
    public android.widget.LinearLayout gHZMYf;
    public ConstraintLayout getFieldNames;
    public ViewOnClickListenerC39746pyE getNewProxyInstance;
    public C39816pzV giSNqX;
    public C39756pyO hDKMBd;
    public boolean isConnected;
    public android.widget.LinearLayout iwGUEr;
    public MarketCoinInfo sSMYrx;
    public C36250oUv uzCIH;
    public boolean valueOf;
    public AppCompatImageView values;
    public android.widget.ImageView wlaJM;
    public boolean zLjUOn;
    public boolean zsXlph;
    public LifecycleOwner zuBGHE;

    /* JADX INFO: renamed from: o.pAb$PictureInPictureParams */
    public static final /* synthetic */ class PictureInPictureParams implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37771pAb(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37771pAb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LifecycleOwner AhwBna() {
        return this.zuBGHE;
    }

    @Override // o.InterfaceC35977oKs
    public android.view.View KWHzl() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.view.View djBIcL() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39508ptf
    public void setClickLockListener(InterfaceC39560pue interfaceC39560pue) {
        this.dNCPSb = interfaceC39560pue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMLifeCycle(LifecycleOwner lifecycleOwner) {
        this.zuBGHE = lifecycleOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35977oKs
    public void setMultiChartViewClickListener(@NotNull InterfaceC35981oKw interfaceC35981oKw) {
        Intrinsics.checkNotNullParameter(interfaceC35981oKw, "");
        this.OLrzqt = interfaceC35981oKw;
    }

    /* JADX INFO: renamed from: o.pAb$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C37771pAb KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C37771pAb c37771pAb) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c37771pAb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (((android.widget.TextView) this.EZpvd).isSelected()) {
                    return;
                }
                this.KWHzl.EZpvd(true);
                C36250oUv c36250oUv = this.KWHzl.uzCIH;
                if (c36250oUv != null) {
                    this.KWHzl.OLrzqt(c36250oUv, new TimeIntervalItem(-2, "index-candle1m", "candle1m", "mark-price-candle1m", "-2"));
                }
                C32866mlf.onEvent$default("Chart_MarketCap_Chart_Click", (TrackChannel[]) null, Dialog.KWHzl, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:181) call: o.pAb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C37771pAb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37771pAb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.QKVWgx = "";
        this.DTwDnp = "TYPE_KLINE";
        this.sSMYrx = new MarketCoinInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        this.dvKsVJ = true;
        this.djBIcL = true;
        this.UeEOUB = new MyLifecycleEventObserver(this);
        this.fFgQHt = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.pAG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37771pAb.AubY(this.AEQbTJ);
            }
        });
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.pAD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37771pAb.zsXlph(this.OLrzqt);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.pAH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37771pAb.hDKMBd(this.OLrzqt);
            }
        });
        try {
            AppCompatActivity appCompatActivityAxsJAY = AxsJAY();
            if (appCompatActivityAxsJAY != null) {
                OLrzqt(appCompatActivityAxsJAY);
                Unit unit = Unit.INSTANCE;
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("MultiChartView", "crash msg = " + e.getLocalizedMessage());
            Unit unit2 = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC56387yDm<KlineQuoteViewModel> DTwDnp() {
        return (InterfaceC56387yDm) this.fIwbmz.getValue();
    }

    public static final InterfaceC56387yDm AubY(C37771pAb c37771pAb) {
        final androidx.fragment.app.Fragment fragmentFindFragment = ViewKt.findFragment(c37771pAb);
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.ui.view.MultiChartView$klineQuoteViewModel_delegate$lambda$0$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragmentFindFragment;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.view.MultiChartView$klineQuoteViewModel_delegate$lambda$0$$inlined$viewModels$default$2
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
        return FragmentViewModelLazyKt.createViewModelLazy(fragmentFindFragment, C56524yIo.AEQbTJ(KlineQuoteViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.view.MultiChartView$klineQuoteViewModel_delegate$lambda$0$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.view.MultiChartView$klineQuoteViewModel_delegate$lambda$0$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.view.MultiChartView$klineQuoteViewModel_delegate$lambda$0$$inlined$viewModels$default$5
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
                    defaultViewModelProviderFactory = fragmentFindFragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final InterfaceC56387yDm<KlineIndicatorViewModel> QOLQEE() {
        return (InterfaceC56387yDm) this.fARcdN.getValue();
    }

    public static final InterfaceC56387yDm zsXlph(C37771pAb c37771pAb) {
        final androidx.fragment.app.Fragment fragmentFindFragment = ViewKt.findFragment(c37771pAb);
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.ui.view.MultiChartView$klineIndicatorViewModel_delegate$lambda$1$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragmentFindFragment;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.view.MultiChartView$klineIndicatorViewModel_delegate$lambda$1$$inlined$viewModels$default$2
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
        return FragmentViewModelLazyKt.createViewModelLazy(fragmentFindFragment, C56524yIo.AEQbTJ(KlineIndicatorViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.view.MultiChartView$klineIndicatorViewModel_delegate$lambda$1$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.view.MultiChartView$klineIndicatorViewModel_delegate$lambda$1$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.view.MultiChartView$klineIndicatorViewModel_delegate$lambda$1$$inlined$viewModels$default$5
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
                    defaultViewModelProviderFactory = fragmentFindFragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final AppCompatActivity AxsJAY() {
        return (AppCompatActivity) this.EZpvd.getValue();
    }

    public static final AppCompatActivity hDKMBd(C37771pAb c37771pAb) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            android.app.Activity activityKWHzl = C35334ntP.KWHzl(c37771pAb);
            objM7377constructorimpl = Result.m7377constructorimpl(activityKWHzl instanceof AppCompatActivity ? (AppCompatActivity) activityKWHzl : null);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (AppCompatActivity) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final void OLrzqt(android.content.Context context) {
        android.view.View.inflate(context, C35964oKf.Application.invokespecialaGOrKO, this);
        this.djSkpj = (android.widget.LinearLayout) findViewById(C35964oKf.StateListAnimator.fVBECu);
        this.fJNWhG = (DrawerLayout) findViewById(C35964oKf.StateListAnimator.ONJgbh);
        this.QOLQEE = (C39835pzo) findViewById(C35964oKf.StateListAnimator.OhRmUC);
        this.giSNqX = (C39816pzV) findViewById(C35964oKf.StateListAnimator.MediaBrowserCompatItemCallback);
        this.fZBcTu = (C39816pzV) findViewById(C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImpl);
        this.aKErDB = (android.widget.TextView) findViewById(C35964oKf.StateListAnimator.zeUJxr);
        this.AwvSrB = (C36250oUv) findViewById(C35964oKf.StateListAnimator.RsCxkX);
        this.AubY = (C36250oUv) findViewById(C35964oKf.StateListAnimator.sFt);
        this.hDKMBd = (C39756pyO) findViewById(C35964oKf.StateListAnimator.zAGdSp);
        this.AuCTelauCTel = (C39756pyO) findViewById(C35964oKf.StateListAnimator.addPreRequisiteCollector);
        this.fetchVPNInfo = (android.widget.ImageView) findViewById(C35964oKf.StateListAnimator.pause);
        this.values = (AppCompatImageView) findViewById(C35964oKf.StateListAnimator.readTypedObject);
        this.QUSxYX = (C55113xdn) findViewById(C35964oKf.StateListAnimator.DcMfJKDSqxTE);
        this.ORxRYg = (android.widget.RelativeLayout) findViewById(C35964oKf.StateListAnimator.QTtQrx);
        this.getFieldNames = (ConstraintLayout) findViewById(C35964oKf.StateListAnimator.gCNefq);
        this.QbewEr = (android.widget.RelativeLayout) findViewById(C35964oKf.StateListAnimator.dXhJGx);
        this.getNewProxyInstance = (ViewOnClickListenerC39746pyE) findViewById(C35964oKf.StateListAnimator.OtRJxF);
        this.gHZMYf = (android.widget.LinearLayout) findViewById(C35964oKf.StateListAnimator.SFHvfS);
        this.wlaJM = (android.widget.ImageView) findViewById(C35964oKf.StateListAnimator.registerKeyboardTarget);
        this.AEQbTJ = (ViewOnClickListenerC39742pyA) findViewById(C35964oKf.StateListAnimator.DTeKQX);
        this.RJOkX = (C39805pzK) findViewById(C35964oKf.StateListAnimator.validateSHA256);
        this.iwGUEr = (android.widget.LinearLayout) findViewById(C35964oKf.StateListAnimator.uLLnq);
        this.AkhnZx = (android.widget.ImageView) findViewById(C35964oKf.StateListAnimator.gdLjtZ);
    }

    public final void copydefault(LifecycleOwner lifecycleOwner) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(this).getChildFragmentManager());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = null;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        androidx.fragment.app.FragmentManager fragmentManager = (androidx.fragment.app.FragmentManager) objM7377constructorimpl;
        if (fragmentManager == null) {
            AppCompatActivity appCompatActivityAxsJAY = AxsJAY();
            if (appCompatActivityAxsJAY != null) {
                supportFragmentManager = appCompatActivityAxsJAY.getSupportFragmentManager();
            }
        } else {
            supportFragmentManager = fragmentManager;
        }
        if (supportFragmentManager != null) {
            supportFragmentManager.setFragmentResultListener("re_open_eco_calendar", lifecycleOwner, new FragmentResultListener() { // from class: o.pAz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    C37771pAb.AEQbTJ(this.OLrzqt, str, bundle);
                }
            });
        }
    }

    public static final void AEQbTJ(C37771pAb c37771pAb, java.lang.String str, android.os.Bundle bundle) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (C36236oUh.EZpvd.hDKMBd()) {
            C36250oUv c36250oUv = c37771pAb.uzCIH;
            c37771pAb.OLrzqt(C33129mqd.gEmmrt(c36250oUv != null ? java.lang.Long.valueOf(c36250oUv.getFieldNames()) : null));
        }
        C36250oUv c36250oUv2 = c37771pAb.uzCIH;
        if (c36250oUv2 != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
        }
        c37771pAb.sSMYrx();
    }

    public final void values() {
        android.widget.ImageView imageView = this.fetchVPNInfo;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final void isConnected() {
        TemplateSetting templateSettingWlaJM;
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        C36250oUv c36250oUv = this.AwvSrB;
        this.OcIXYQ = C36246oUr.copydefault().RlQdEF() + (C36246oUr.copydefault().accept() * ((c36250oUv == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null || (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) == null) ? 0 : sideIndicatorNames.size()));
        OLrzqt((int) (this.OcIXYQ * ((((SPUtils.getInt("chart_height", 25).intValue() - 50) * 1.0f) / 200.0f) + 1.0f)));
    }

    /* JADX INFO: renamed from: o.pAb$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public StateListAnimator() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            TemplateSetting templateSettingWlaJM;
            java.util.ArrayList<java.lang.String> sideIndicatorNames;
            android.view.ViewTreeObserver viewTreeObserver;
            android.view.ViewTreeObserver viewTreeObserver2;
            if (C37771pAb.this.getContext() == null) {
                C39835pzo c39835pzo = C37771pAb.this.QOLQEE;
                if (c39835pzo == null || (viewTreeObserver2 = c39835pzo.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
                return;
            }
            C33566myq c33566myq = C33566myq.EZpvd;
            android.content.Context context = C37771pAb.this.getContext();
            Intrinsics.copydefault(context);
            int iOLrzqt = c33566myq.OLrzqt(context);
            android.content.Context context2 = C37771pAb.this.getContext();
            Intrinsics.copydefault(context2);
            int iEZpvd = c33566myq.EZpvd(context2);
            C39835pzo c39835pzo2 = C37771pAb.this.QOLQEE;
            java.lang.Integer numValueOf = c39835pzo2 != null ? java.lang.Integer.valueOf(c39835pzo2.getMeasuredHeight()) : null;
            C39835pzo c39835pzo3 = C37771pAb.this.QOLQEE;
            if (c39835pzo3 != null) {
                c39835pzo3.getMeasuredWidth();
            }
            int size = 0;
            if (iOLrzqt > iEZpvd) {
                C37771pAb.this.QfsBiF = C33129mqd.AhwBna(java.lang.Double.valueOf(((double) iEZpvd) * 0.75d));
            } else {
                C37771pAb.this.QfsBiF = numValueOf != null ? numValueOf.intValue() : 0;
            }
            C39835pzo c39835pzo4 = C37771pAb.this.QOLQEE;
            if (c39835pzo4 != null && (viewTreeObserver = c39835pzo4.getViewTreeObserver()) != null) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            C36250oUv c36250oUv = C37771pAb.this.uzCIH;
            if (c36250oUv != null && (templateSettingWlaJM = c36250oUv.wlaJM()) != null && (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) != null) {
                size = sideIndicatorNames.size();
            }
            int iAKErDB = size > 1 ? C37771pAb.this.QfsBiF + (C36246oUr.copydefault().aKErDB() * (size - 1)) : C37771pAb.this.QfsBiF;
            C36250oUv c36250oUv2 = C37771pAb.this.AubY;
            if (c36250oUv2 != null) {
                c36250oUv2.setMinimumHeight(iAKErDB);
            }
        }
    }

    public final void fIwbmz() {
        android.view.ViewTreeObserver viewTreeObserver;
        C39835pzo c39835pzo = this.QOLQEE;
        if (c39835pzo == null || (viewTreeObserver = c39835pzo.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new StateListAnimator());
    }

    private final void OcIXYQ() {
        final C36250oUv c36250oUv = this.uzCIH;
        if (c36250oUv != null) {
            c36250oUv.setLoadHistoryKlineListener(new C36250oUv.PendingIntent() { // from class: o.pAk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.PendingIntent
                public final void AEQbTJ() {
                    C37771pAb.KWHzl(this.AEQbTJ, c36250oUv);
                }
            });
            c36250oUv.setDrawUpdateListener(new C36250oUv.Application() { // from class: o.pAr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.Application
                public final void copydefault(AbstractC36302oWt abstractC36302oWt) {
                    C37771pAb.EZpvd(c36250oUv, this, abstractC36302oWt);
                }
            });
            c36250oUv.setChartSelectionListener(new LoaderManager());
            c36250oUv.setKlineQuickOrderListener(new FragmentManager());
            c36250oUv.setKlineTradeDragListener(new PendingIntent());
        }
        C39816pzV c39816pzV = this.giSNqX;
        if (c39816pzV != null) {
            c39816pzV.setOnItemSelectListener(new Function1() { // from class: o.pAo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37771pAb.AYXKKw(this.OLrzqt, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        C39816pzV c39816pzV2 = this.fZBcTu;
        if (c39816pzV2 != null) {
            c39816pzV2.setOnItemSelectListener(new Function1() { // from class: o.pAv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37771pAb.gEmmrt(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        C39756pyO c39756pyO = this.hDKMBd;
        if (c39756pyO != null) {
            c39756pyO.setOnItemSelectListener(new Function1() { // from class: o.pAu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37771pAb.OLrzqt(this.EZpvd, (MarketTypeSelect) obj);
                }
            });
        }
        C39756pyO c39756pyO2 = this.AuCTelauCTel;
        if (c39756pyO2 != null) {
            c39756pyO2.setOnItemSelectListener(new Function1() { // from class: o.pAw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37771pAb.AhwBna(this.AEQbTJ, (MarketTypeSelect) obj);
                }
            });
        }
        android.widget.ImageView imageView = this.fetchVPNInfo;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.pAt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C37771pAb.djBIcL(this.KWHzl, view);
                }
            });
        }
        android.widget.ImageView imageView2 = this.AkhnZx;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.pAx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C37771pAb.AYXKKw(this.EZpvd, view);
                }
            });
        }
        android.widget.RelativeLayout relativeLayout = this.ORxRYg;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: o.pAA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C37771pAb.valueOf(this.AEQbTJ, view);
                }
            });
        }
        android.widget.ImageView imageView3 = this.wlaJM;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: o.pAB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C37771pAb.gEmmrt(this.EZpvd, view);
                }
            });
        }
        android.widget.RelativeLayout relativeLayout2 = this.QbewEr;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.pAm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C37771pAb.AhwBna(this.EZpvd, view);
                }
            });
        }
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE = this.getNewProxyInstance;
        if (viewOnClickListenerC39746pyE != null) {
            viewOnClickListenerC39746pyE.setOnItemClickListener(new Function1() { // from class: o.pAj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37771pAb.AhwBna(this.EZpvd, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE2 = this.getNewProxyInstance;
        if (viewOnClickListenerC39746pyE2 != null) {
            viewOnClickListenerC39746pyE2.setOnLineHideListener(new Function1() { // from class: o.pAp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37771pAb.copydefault(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        C36250oUv c36250oUv2 = this.AubY;
        if (c36250oUv2 != null) {
            c36250oUv2.setDrawingFinishListener(new C36250oUv.TaskDescription() { // from class: o.pAs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.TaskDescription
                public final void AEQbTJ() {
                    C37771pAb.zLjUOn(this.EZpvd);
                }
            });
        }
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = this.AEQbTJ;
        if (viewOnClickListenerC39742pyA != null) {
            viewOnClickListenerC39742pyA.setClickListener(new Fragment());
        }
        android.widget.TextView textView = this.aKErDB;
        if (textView != null) {
            textView.setOnClickListener(new TaskDescription(textView, 500L, this));
        }
    }

    public static final void KWHzl(C37771pAb c37771pAb, C36250oUv c36250oUv) {
        TemplateSetting templateSetting;
        InterfaceC39563puh.StateListAnimator stateListAnimatorDjBIcL;
        if (c37771pAb.AxsJAY) {
            LifecycleOwner lifecycleOwner = c37771pAb.zuBGHE;
            if (lifecycleOwner == null || (templateSetting = c37771pAb.finit) == null) {
                return;
            }
            int sPTimeInterval = templateSetting.getSPTimeInterval();
            pAR par = c37771pAb.flVtFt;
            if (par == null || (stateListAnimatorDjBIcL = par.djBIcL()) == null) {
                return;
            }
            InterfaceC39563puh.StateListAnimator.TaskDescription.getHistoryMarketCandles$default(stateListAnimatorDjBIcL, lifecycleOwner, pEF.OLrzqt.OLrzqt(sPTimeInterval), C33129mqd.gEmmrt(java.lang.Long.valueOf(c36250oUv.fARcdN())), oLT.djBIcL(), false, null, 48, null);
            return;
        }
        InterfaceC35981oKw interfaceC35981oKw = c37771pAb.OLrzqt;
        if (interfaceC35981oKw != null) {
            interfaceC35981oKw.OLrzqt(C33129mqd.gEmmrt(java.lang.Long.valueOf(c36250oUv.fARcdN())));
        }
    }

    public static final void EZpvd(C36250oUv c36250oUv, C37771pAb c37771pAb, AbstractC36302oWt abstractC36302oWt) {
        if (abstractC36302oWt instanceof C36291oWi) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx();
            if (chartViewOutSideConfigAkhnZx != null) {
                c37771pAb.DTwDnp().getValue().OLrzqt(chartViewOutSideConfigAkhnZx.getKlineEventList());
                return;
            }
            return;
        }
        if (abstractC36302oWt instanceof C36295oWm) {
            c37771pAb.QOLQEE().getValue().KWHzl();
        }
    }

    /* JADX INFO: renamed from: o.pAb$LoaderManager */
    public static final class LoaderManager implements C36250oUv.ActionBar {
        public LoaderManager() {
        }

        @Override // o.C36250oUv.ActionBar
        public void EZpvd(java.lang.String str) {
            if (str != null) {
                C37771pAb.this.QKVWgx = str;
            }
        }

        @Override // o.C36250oUv.ActionBar
        public void aI_() {
            C55489xks.startVibratorIfCan$default(0L, 1, null);
        }
    }

    /* JADX INFO: renamed from: o.pAb$FragmentManager */
    public static final class FragmentManager implements C36250oUv.Dialog {
        @Override // o.C36250oUv.Dialog
        public void AEQbTJ() {
        }

        public FragmentManager() {
        }

        @Override // o.C36250oUv.Dialog
        public void EZpvd() {
            InterfaceC35981oKw interfaceC35981oKw = C37771pAb.this.OLrzqt;
            if (interfaceC35981oKw != null) {
                interfaceC35981oKw.EZpvd(C37771pAb.this.QKVWgx);
            }
        }

        @Override // o.C36250oUv.Dialog
        public void EZpvd(java.lang.String str) {
            InterfaceC35981oKw interfaceC35981oKw = C37771pAb.this.OLrzqt;
            if (interfaceC35981oKw != null) {
                if (str == null) {
                    str = "";
                }
                interfaceC35981oKw.AEQbTJ(str);
            }
        }
    }

    /* JADX INFO: renamed from: o.pAb$PendingIntent */
    public static final class PendingIntent implements InterfaceC36253oUy {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36253oUy
        public void AEQbTJ(KlineOpenOrderBean klineOpenOrderBean, java.lang.String str, boolean z, boolean z2, int i) {
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            Intrinsics.checkNotNullParameter(str, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36253oUy
        public void AEQbTJ(KlineSpotAverageBean klineSpotAverageBean, KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36253oUy
        public void AEQbTJ(InterfaceC39510pth interfaceC39510pth) {
            Intrinsics.checkNotNullParameter(interfaceC39510pth, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36253oUy
        public void AhwBna(KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36253oUy
        public void EZpvd(KlineSpotAverageBean klineSpotAverageBean, KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36253oUy
        public void EZpvd(InterfaceC39510pth interfaceC39510pth) {
            Intrinsics.checkNotNullParameter(interfaceC39510pth, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36253oUy
        public void KWHzl(KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36253oUy
        public void OLrzqt(KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36253oUy
        public void copydefault(KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36253oUy
        public void copydefault(KlineSpotAverageBean klineSpotAverageBean) {
            Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
        }

        public PendingIntent() {
        }

        @Override // o.InterfaceC36253oUy
        public void EZpvd(KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            InterfaceC35981oKw interfaceC35981oKw = C37771pAb.this.OLrzqt;
            if (interfaceC35981oKw != null) {
                interfaceC35981oKw.copydefault(klineOpenOrderBean.getPrice(), klineOpenOrderBean.getOriginPos());
            }
        }

        @Override // o.InterfaceC36253oUy
        public void AEQbTJ(KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            InterfaceC35981oKw interfaceC35981oKw = C37771pAb.this.OLrzqt;
            if (interfaceC35981oKw != null) {
                interfaceC35981oKw.KWHzl(klineOpenOrderBean.getOriginPos());
            }
        }

        @Override // o.InterfaceC36253oUy
        public void AEQbTJ() {
            InterfaceC35981oKw interfaceC35981oKw = C37771pAb.this.OLrzqt;
            if (interfaceC35981oKw != null) {
                interfaceC35981oKw.KWHzl();
            }
        }
    }

    public static final Unit AYXKKw(C37771pAb c37771pAb, int i) {
        c37771pAb.copydefault(i);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C37771pAb c37771pAb, int i) {
        c37771pAb.KWHzl(i);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C37771pAb c37771pAb, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        if (Intrinsics.EZpvd((java.lang.Object) marketTypeSelect.getSelectTypeName(), (java.lang.Object) "VOLUME") && !Intrinsics.EZpvd((java.lang.Object) c37771pAb.DTwDnp, (java.lang.Object) "TYPE_KLINE")) {
            return Unit.INSTANCE;
        }
        C36250oUv c36250oUv = c37771pAb.uzCIH;
        if (c36250oUv != null) {
            c37771pAb.OLrzqt(c36250oUv, marketTypeSelect);
            C37908pFd.copydefault(marketTypeSelect.getSelectTypeName(), marketTypeSelect.isSelect(), marketTypeSelect.getGroup() == 0);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C37771pAb c37771pAb, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        if (Intrinsics.EZpvd((java.lang.Object) marketTypeSelect.getSelectTypeName(), (java.lang.Object) "VOLUME")) {
            MarketCoinInfo marketCoinInfo = c37771pAb.sSMYrx;
            if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (java.lang.Object) "OPTION")) {
                return Unit.INSTANCE;
            }
        }
        C36250oUv c36250oUv = c37771pAb.AubY;
        if (c36250oUv != null) {
            c37771pAb.copydefault(c36250oUv, marketTypeSelect);
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(C37771pAb c37771pAb, android.view.View view) {
        c37771pAb.KWHzl(false);
        InterfaceC35981oKw interfaceC35981oKw = c37771pAb.OLrzqt;
        if (interfaceC35981oKw != null) {
            interfaceC35981oKw.AEQbTJ();
        }
        C37908pFd.EZpvd();
    }

    public static final void AYXKKw(C37771pAb c37771pAb, android.view.View view) {
        c37771pAb.RJOkX();
        C37908pFd.KWHzl();
    }

    public static final void valueOf(C37771pAb c37771pAb, android.view.View view) {
        c37771pAb.KWHzl(true);
    }

    public static final void gEmmrt(C37771pAb c37771pAb, android.view.View view) {
        c37771pAb.djBIcL = false;
        InterfaceC35981oKw interfaceC35981oKw = c37771pAb.OLrzqt;
        if (interfaceC35981oKw != null) {
            interfaceC35981oKw.EZpvd();
        }
        C36246oUr.copydefault().valueOf(false);
        C36312oXc c36312oXc = c37771pAb.QVAiDq;
        if (c36312oXc != null) {
            c36312oXc.AEQbTJ(false);
        }
    }

    public static final void AhwBna(C37771pAb c37771pAb, android.view.View view) {
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE = c37771pAb.getNewProxyInstance;
        if (viewOnClickListenerC39746pyE != null) {
            viewOnClickListenerC39746pyE.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout = c37771pAb.gHZMYf;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        c37771pAb.AYXKKw(true);
        C39835pzo c39835pzo = c37771pAb.QOLQEE;
        if (c39835pzo != null) {
            c39835pzo.setScrollingEnabled(false);
        }
        c37771pAb.zLjUOn();
    }

    public static final Unit AhwBna(C37771pAb c37771pAb, int i) {
        if (i == C35964oKf.StateListAnimator.haRtnV) {
            c37771pAb.gHZMYf();
        } else if (i == C35964oKf.StateListAnimator.hCiIDQ) {
            ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE = c37771pAb.getNewProxyInstance;
            if (viewOnClickListenerC39746pyE != null) {
                viewOnClickListenerC39746pyE.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout = c37771pAb.gHZMYf;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            C36312oXc c36312oXc = c37771pAb.QVAiDq;
            if (c36312oXc != null) {
                c36312oXc.AEQbTJ(false);
            }
            c37771pAb.valueOf();
            C39835pzo c39835pzo = c37771pAb.QOLQEE;
            if (c39835pzo != null) {
                c39835pzo.setScrollingEnabled(true);
            }
        } else if (i == C35964oKf.StateListAnimator.RZOtbZ) {
            InterfaceC35981oKw interfaceC35981oKw = c37771pAb.OLrzqt;
            if (interfaceC35981oKw != null) {
                interfaceC35981oKw.djBIcL();
            }
        } else if (i == C35964oKf.StateListAnimator.SePrCP || i == C35964oKf.StateListAnimator.DtA || i == 0) {
            c37771pAb.AYXKKw(true);
            if (C36246oUr.copydefault().QwvEab()) {
                C36246oUr.copydefault().AkhnZx(false);
                SPUtils.put("hide_kline_drawing_data", java.lang.Boolean.FALSE);
                ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE2 = c37771pAb.getNewProxyInstance;
                if (viewOnClickListenerC39746pyE2 != null) {
                    viewOnClickListenerC39746pyE2.OLrzqt();
                }
            }
            oWN own = C36246oUr.copydefault().DCJXGO().get("ds0");
            if (own != null) {
                C36250oUv c36250oUv = c37771pAb.AubY;
                int measuredWidth = (c36250oUv != null ? c36250oUv.getMeasuredWidth() : 100) / 2;
                ChartArea chartArea = C36246oUr.copydefault().values().get("ds0.m");
                own.KWHzl(measuredWidth, (chartArea != null ? chartArea.djBIcL() : 100) / 2);
                C36250oUv c36250oUv2 = c37771pAb.AubY;
                if (c36250oUv2 != null) {
                    c36250oUv2.invalidate();
                }
                ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = c37771pAb.AEQbTJ;
                if (viewOnClickListenerC39742pyA != null) {
                    viewOnClickListenerC39742pyA.AYXKKw();
                }
            }
        } else if (i == C35964oKf.StateListAnimator.hBORwR || i == C35964oKf.StateListAnimator.sQOHWT) {
            DrawLineData drawLineData = DrawLineData.copydefault;
            if (drawLineData.valueOf() == DrawLineData.LineType.PRICE_LINE || drawLineData.valueOf() == DrawLineData.LineType.FIBONACCI) {
                oWN own2 = C36246oUr.copydefault().DCJXGO().get("ds0");
                Intrinsics.copydefault(own2);
                own2.AwvSrB();
                drawLineData.EZpvd((DrawLineData.LineType) null);
                C36250oUv c36250oUv3 = c37771pAb.AubY;
                if (c36250oUv3 != null) {
                    c36250oUv3.invalidate();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C37771pAb c37771pAb, boolean z) {
        if (z) {
            SPUtils.put("hide_kline_drawing_data", java.lang.Boolean.TRUE);
            C36246oUr.copydefault().AkhnZx(true);
            c37771pAb.valueOf();
            C36312oXc c36312oXc = c37771pAb.QVAiDq;
            if (c36312oXc != null) {
                c36312oXc.AEQbTJ(true);
            }
            C36250oUv c36250oUv = c37771pAb.AubY;
            if (c36250oUv != null) {
                c36250oUv.invalidate();
            }
        } else {
            SPUtils.put("hide_kline_drawing_data", java.lang.Boolean.FALSE);
            C36246oUr.copydefault().AkhnZx(false);
            C36250oUv c36250oUv2 = c37771pAb.AubY;
            if (c36250oUv2 != null) {
                c36250oUv2.invalidate();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(C37771pAb c37771pAb) {
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE = c37771pAb.getNewProxyInstance;
        if (viewOnClickListenerC39746pyE != null) {
            viewOnClickListenerC39746pyE.AEQbTJ();
        }
        c37771pAb.QKVWgx();
    }

    /* JADX INFO: renamed from: o.pAb$Fragment */
    public static final class Fragment implements InterfaceC35982oKx {
        public Fragment() {
        }

        @Override // o.InterfaceC35982oKx
        public void copydefault() {
            C36250oUv c36250oUv = C37771pAb.this.AubY;
            if (c36250oUv != null) {
                c36250oUv.invalidate();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void OLrzqt() {
            C36250oUv c36250oUv = C37771pAb.this.AubY;
            if (c36250oUv != null) {
                c36250oUv.invalidate();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void AEQbTJ() {
            C36250oUv c36250oUv = C37771pAb.this.AubY;
            if (c36250oUv != null) {
                c36250oUv.invalidate();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void EZpvd() {
            C37771pAb.this.ORxRYg();
        }

        @Override // o.InterfaceC35982oKx
        public void AYXKKw() {
            DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
            if (drawLineItemIsConnected != null) {
                if (drawLineItemIsConnected.getLocked()) {
                    drawLineItemIsConnected.setLineLocked(false);
                } else {
                    drawLineItemIsConnected.setLineLocked(true);
                }
            }
            InterfaceC39560pue interfaceC39560pue = C37771pAb.this.dNCPSb;
            if (interfaceC39560pue != null) {
                interfaceC39560pue.KWHzl();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void KWHzl() {
            java.lang.String coinId;
            java.lang.Integer type;
            DrawLineData drawLineData = DrawLineData.copydefault;
            DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
            if (drawLineItemIsConnected != null) {
                drawLineItemIsConnected.setDelete(true);
                oUJ ouj = oUJ.KWHzl;
                DrawLineBean drawLineBeanAEQbTJ = ouj.AEQbTJ();
                if (drawLineBeanAEQbTJ == null || (coinId = drawLineBeanAEQbTJ.getCoinId()) == null) {
                    coinId = "";
                }
                drawLineItemIsConnected.setContract(coinId);
                DrawLineBean drawLineBeanAEQbTJ2 = ouj.AEQbTJ();
                drawLineItemIsConnected.setKlineType((drawLineBeanAEQbTJ2 == null || (type = drawLineBeanAEQbTJ2.getType()) == null) ? 0 : type.intValue());
                drawLineData.EZpvd().remove(drawLineItemIsConnected);
                drawLineData.EZpvd(drawLineData.EZpvd());
            }
            InterfaceC39560pue interfaceC39560pue = C37771pAb.this.dNCPSb;
            if (interfaceC39560pue != null) {
                interfaceC39560pue.OLrzqt();
            }
        }
    }

    /* JADX INFO: renamed from: o.pAb$Dialog */
    public static final class Dialog implements Function1<EventParamsList, Unit> {
        public static final Dialog KWHzl = new Dialog();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }
    }

    public final void EZpvd(boolean z) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        if (z) {
            C36250oUv c36250oUv = this.uzCIH;
            if (c36250oUv != null) {
                c36250oUv.gHZMYf();
            }
            C36250oUv c36250oUv2 = this.uzCIH;
            if (c36250oUv2 != null) {
                c36250oUv2.sSMYrx();
            }
            C36250oUv c36250oUv3 = this.uzCIH;
            if (c36250oUv3 != null && (chartViewOutSideConfigAkhnZx = c36250oUv3.AkhnZx()) != null) {
                this.RcXXUw = ChartViewOutSideConfig.copy$default(chartViewOutSideConfigAkhnZx, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, Integer.MAX_VALUE, null);
                chartViewOutSideConfigAkhnZx.setMShowCostLine(false);
                chartViewOutSideConfigAkhnZx.setShowSpotAveragePrice(false);
                chartViewOutSideConfigAkhnZx.setMShowCountdown(false);
                chartViewOutSideConfigAkhnZx.setMChartHistoryOrder(false);
                chartViewOutSideConfigAkhnZx.setMShowCurrentOrder(false);
                chartViewOutSideConfigAkhnZx.setMShowOpenOrderExtendedLine(false);
                chartViewOutSideConfigAkhnZx.setMShowPriceWarning(false);
                chartViewOutSideConfigAkhnZx.setMOrdinateType(0);
                chartViewOutSideConfigAkhnZx.setMKlineAbstractType(1);
                chartViewOutSideConfigAkhnZx.setCeFiMCapMode(true);
            }
        } else {
            ChartViewOutSideConfig chartViewOutSideConfig = this.RcXXUw;
            if (chartViewOutSideConfig != null) {
                chartViewOutSideConfig.setCeFiMCapMode(false);
                C36246oUr.copydefault().copydefault(chartViewOutSideConfig);
            }
            C36250oUv c36250oUv4 = this.uzCIH;
            if (c36250oUv4 != null) {
                c36250oUv4.QOLQEE();
            }
        }
        OLrzqt(z);
        AEQbTJ(z);
        sSMYrx();
    }

    public final void OLrzqt(boolean z) {
        final android.widget.TextView textView = this.aKErDB;
        if (textView != null) {
            final int i = z ? C35964oKf.Dialog.KWHzl : C35964oKf.Dialog.EZpvd;
            java.lang.String string = textView.getText().toString();
            textView.setText(C33061mpO.setupSpanStyles$default(string, new java.lang.String[]{string}, 0, null, false, new Function1() { // from class: o.pAF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37771pAb.EZpvd(textView, i, (java.util.List) obj);
                }
            }, 14, null));
            textView.setSelected(z);
        }
    }

    public static final Unit EZpvd(android.widget.TextView textView, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(textView.getContext(), i));
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(boolean z) {
        int iCopydefault;
        android.widget.ImageView imageView = this.AkhnZx;
        if (imageView != null) {
            imageView.setEnabled(!z);
        }
        AppCompatImageView appCompatImageView = this.values;
        if (appCompatImageView != null) {
            appCompatImageView.setAlpha(z ? 0.5f : 1.0f);
        }
        android.widget.ImageView imageView2 = this.fetchVPNInfo;
        if (imageView2 != null) {
            imageView2.setEnabled(!z);
        }
        if (z) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(iCopydefault);
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "");
        android.widget.ImageView imageView3 = this.AkhnZx;
        if (imageView3 != null) {
            imageView3.setImageTintList(colorStateListValueOf);
        }
        android.widget.ImageView imageView4 = this.fetchVPNInfo;
        if (imageView4 != null) {
            imageView4.setImageTintList(colorStateListValueOf);
        }
        C39816pzV c39816pzV = this.giSNqX;
        if (c39816pzV != null) {
            c39816pzV.OLrzqt(z);
        }
        C39816pzV c39816pzV2 = this.fZBcTu;
        if (c39816pzV2 != null) {
            c39816pzV2.OLrzqt(z);
        }
        C39756pyO c39756pyO = this.hDKMBd;
        if (c39756pyO != null) {
            c39756pyO.setVisibility(z ^ true ? 0 : 8);
        }
        C39756pyO c39756pyO2 = this.AuCTelauCTel;
        if (c39756pyO2 != null) {
            c39756pyO2.setVisibility(z ^ true ? 0 : 8);
        }
    }

    public final void hDKMBd() {
        C39816pzV c39816pzV = this.giSNqX;
        if (c39816pzV != null) {
            c39816pzV.setData();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v27, types: [androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    @Override // o.InterfaceC35977oKs
    public void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull C35969oKk c35969oKk) {
        InterfaceC39563puh.StateListAnimator stateListAnimatorDjBIcL;
        ?? AxsJAY;
        KlineQuoteViewModel klineQuoteViewModelCopydefault;
        MutableLiveData<java.util.List<oLY>> mutableLiveDataZuBGHE;
        KlineQuoteViewModel klineQuoteViewModelCopydefault2;
        MutableLiveData<java.util.List<oLY>> mutableLiveDataOcIXYQ;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(c35969oKk, "");
        try {
            this.sSMYrx.setInstrumentId(c35969oKk.gEmmrt());
            this.sSMYrx.setInstrumentType(c35969oKk.AYXKKw());
            this.AxsJAY = c35969oKk.AkhnZx();
            this.zLjUOn = c35969oKk.gHZMYf();
            this.zsXlph = c35969oKk.AwvSrB();
            this.zuBGHE = lifecycleOwner;
            this.dxcTrN = c35969oKk.fetchVPNInfo();
            this.DbNXlk = c35969oKk.zLjUOn();
            this.isConnected = c35969oKk.AuCTelauCTel();
            this.gEmmrt = c35969oKk.uzCIH();
            this.valueOf = c35969oKk.hDKMBd();
            this.dvKsVJ = c35969oKk.fIwbmz();
            this.copydefault = c35969oKk.getFieldNames();
            this.AYXKKw = Intrinsics.EZpvd((java.lang.Object) c35969oKk.EZpvd(), (java.lang.Object) "sp_timeinterval_okx_pro");
            if (c35969oKk.fARcdN()) {
                values();
            }
            if (Intrinsics.EZpvd((java.lang.Object) c35969oKk.EZpvd(), (java.lang.Object) "sp_timeinterval_okx_lite")) {
                ActivityResultCaller activityResultCallerFindFragment = ViewKt.findFragment(this);
                oKE oke = activityResultCallerFindFragment instanceof oKE ? (oKE) activityResultCallerFindFragment : null;
                if (oke == null || !oke.AEQbTJ()) {
                    android.widget.LinearLayout linearLayout = this.iwGUEr;
                    if (linearLayout != null) {
                        linearLayout.setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0);
                    }
                } else {
                    android.widget.LinearLayout linearLayout2 = this.iwGUEr;
                    if (linearLayout2 != null) {
                        linearLayout2.setPadding(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), 0);
                    }
                }
            }
            EZpvd(this.sSMYrx, c35969oKk);
            KWHzl(this.dxcTrN, java.lang.Boolean.valueOf(c35969oKk.ejfBZ()));
            copydefault(c35969oKk.copydefault());
            this.flVtFt = new pAR(this);
            LifecycleOwner lifecycleOwner2 = this.zuBGHE;
            if (lifecycleOwner2 != null) {
                java.lang.String strGEmmrt = c35969oKk.gEmmrt();
                pAR par = this.flVtFt;
                if (par != null) {
                    par.KWHzl(lifecycleOwner2, strGEmmrt, c35969oKk.AYXKKw());
                }
                if (c35969oKk.AYXKKw() != null && this.AxsJAY) {
                    if (getContext() instanceof androidx.fragment.app.Fragment) {
                        java.lang.Object context = getContext();
                        Intrinsics.copydefault(context, "");
                        AxsJAY = (androidx.fragment.app.Fragment) context;
                    } else if (getContext() instanceof AppCompatActivity) {
                        android.content.Context context2 = getContext();
                        Intrinsics.copydefault(context2, "");
                        AxsJAY = (AppCompatActivity) context2;
                    } else if (getContext() instanceof ComponentActivity) {
                        android.content.Context context3 = getContext();
                        Intrinsics.copydefault(context3, "");
                        AxsJAY = (ComponentActivity) context3;
                    } else {
                        AxsJAY = AxsJAY();
                    }
                    if (AxsJAY != 0) {
                        pAR par2 = this.flVtFt;
                        if (par2 != null) {
                            par2.OLrzqt((KlineQuoteViewModel) new ViewModelProvider(AxsJAY).get(KlineQuoteViewModel.class));
                        }
                        pAR par3 = this.flVtFt;
                        if (par3 != null) {
                            par3.copydefault(lifecycleOwner2);
                        }
                        fARcdN();
                        pAR par4 = this.flVtFt;
                        if (par4 != null && (klineQuoteViewModelCopydefault2 = par4.copydefault()) != null && (mutableLiveDataOcIXYQ = klineQuoteViewModelCopydefault2.OcIXYQ()) != null) {
                            mutableLiveDataOcIXYQ.observe(AxsJAY, new PictureInPictureParams(new Function1() { // from class: o.pAa
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C37771pAb.EZpvd(this.AEQbTJ, (java.util.List) obj);
                                }
                            }));
                        }
                        pAR par5 = this.flVtFt;
                        if (par5 != null && (klineQuoteViewModelCopydefault = par5.copydefault()) != null && (mutableLiveDataZuBGHE = klineQuoteViewModelCopydefault.zuBGHE()) != null) {
                            mutableLiveDataZuBGHE.observe(AxsJAY, new PictureInPictureParams(new Function1() { // from class: o.pAi
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C37771pAb.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
                                }
                            }));
                        }
                    }
                }
                if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && this.zLjUOn) {
                    java.lang.String string = SPUtils.getString("kline_indicator_version", "0");
                    pAR par6 = this.flVtFt;
                    if (par6 != null && (stateListAnimatorDjBIcL = par6.djBIcL()) != null) {
                        Intrinsics.copydefault((java.lang.Object) string);
                        stateListAnimatorDjBIcL.copydefault(lifecycleOwner2, "ALL", string);
                    }
                }
                InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("kline_full_screen");
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
                AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, lifecycleOwner2);
                final Function1 function1 = new Function1() { // from class: o.pAq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C37771pAb.EZpvd(this.copydefault, (java.lang.String) obj);
                    }
                };
                this.KWHzl = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pAC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C37771pAb.KWHzl(function1, obj);
                    }
                });
                lifecycleOwner2.getLifecycle().addObserver(this.UeEOUB);
            }
            copydefault(lifecycleOwner);
            OcIXYQ();
        } catch (java.lang.Exception e) {
            pUU.copydefault("MultiChartView", "initMultiChartView crash msg = " + e.getLocalizedMessage());
        }
    }

    public static final Unit EZpvd(C37771pAb c37771pAb, java.util.List list) {
        c37771pAb.gEmmrt();
        C36250oUv c36250oUv = c37771pAb.uzCIH;
        if (c36250oUv != null) {
            c36250oUv.AEQbTJ((java.util.List<? extends oUO>) list);
        }
        C36250oUv c36250oUv2 = c37771pAb.uzCIH;
        if (c36250oUv2 != null) {
            c36250oUv2.setShowEmptyUi(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C37771pAb c37771pAb, java.util.List list) {
        C36250oUv c36250oUv = c37771pAb.uzCIH;
        if (c36250oUv != null) {
            c36250oUv.KWHzl((java.util.List<? extends oUO>) list);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C37771pAb c37771pAb, java.lang.String str) {
        c37771pAb.djBIcL = false;
        InterfaceC35981oKw interfaceC35981oKw = c37771pAb.OLrzqt;
        if (interfaceC35981oKw != null) {
            interfaceC35981oKw.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        KlineSpotAverageBean klineSpotAverageBean;
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        pAR par = this.flVtFt;
        if (Intrinsics.EZpvd((java.lang.Object) (par != null ? par.KWHzl() : null), (java.lang.Object) oLT.fetchVPNInfo()) && (c36250oUv = this.uzCIH) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv.AkhnZx()) != null && chartViewOutSideConfigAkhnZx2.isShowSpotAveragePrice() && this.zsXlph) {
            AwvSrB();
            return;
        }
        C36250oUv c36250oUv2 = this.uzCIH;
        if (c36250oUv2 == null || (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) == null || (klineSpotAverageBean = chartViewOutSideConfigAkhnZx.getKlineSpotAverageBean()) == null) {
            return;
        }
        klineSpotAverageBean.setShowSpotAverageLine(false);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Intrinsics.checkNotNullParameter(str, "");
        if (C36246oUr.copydefault().DcqEDu() || C36246oUr.copydefault().DNMMPQ()) {
            C36250oUv c36250oUv = this.uzCIH;
            java.util.ArrayList<KLineEventBean> klineEventList = (c36250oUv == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx.getKlineEventList();
            if (klineEventList == null || klineEventList.isEmpty()) {
                BuildersKt__Builders_commonKt.launch$default(this.fFgQHt, null, null, new MultiChartView$getKlineEvent$1(this, str, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AwvSrB() {
        java.lang.String strAEQbTJ;
        java.lang.Integer numValueOf;
        InterfaceC39563puh.StateListAnimator stateListAnimatorDjBIcL;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        pAR par = this.flVtFt;
        if (par == null || (strAEQbTJ = par.AEQbTJ()) == null) {
            return;
        }
        C37925pFu c37925pFu = C37925pFu.KWHzl;
        pAR par2 = this.flVtFt;
        java.lang.String strKWHzl = par2 != null ? par2.KWHzl() : null;
        pAR par3 = this.flVtFt;
        int iAEQbTJ = c37925pFu.AEQbTJ(strKWHzl, par3 != null ? par3.OLrzqt() : null);
        LifecycleOwner lifecycleOwner = this.zuBGHE;
        if (lifecycleOwner != null) {
            pAR par4 = this.flVtFt;
            if ((par4 != null ? par4.OLrzqt() : null) != null) {
                numValueOf = java.lang.Integer.valueOf(iAEQbTJ);
            } else {
                C36250oUv c36250oUv = this.uzCIH;
                if (c36250oUv == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null) {
                    numValueOf = null;
                } else {
                    iAEQbTJ = chartViewOutSideConfigAkhnZx.getMPriceFractionDigits();
                    numValueOf = java.lang.Integer.valueOf(iAEQbTJ);
                }
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                pAR par5 = this.flVtFt;
                if (par5 == null || (stateListAnimatorDjBIcL = par5.djBIcL()) == null) {
                    return;
                }
                pAR par6 = this.flVtFt;
                java.lang.String strKWHzl2 = par6 != null ? par6.KWHzl() : null;
                Intrinsics.copydefault((java.lang.Object) strKWHzl2);
                InterfaceC39563puh.StateListAnimator.TaskDescription.loadCumulativeCost$default(stateListAnimatorDjBIcL, lifecycleOwner, strKWHzl2, strAEQbTJ, iIntValue, false, 16, null);
            }
        }
    }

    public final void EZpvd(MarketCoinInfo marketCoinInfo, C35969oKk c35969oKk) {
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        ChartViewOutSideConfig chartViewOutSideConfig = new ChartViewOutSideConfig(false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, Integer.MAX_VALUE, null);
        chartViewOutSideConfig.setMPriceFractionDigits(c35969oKk.AEQbTJ());
        chartViewOutSideConfig.setChartFromType(c35969oKk.AhwBna());
        chartViewOutSideConfig.setScreen(c35969oKk.iwGUEr());
        chartViewOutSideConfig.setMMaxEfficientDigits(c35969oKk.djBIcL());
        chartViewOutSideConfig.setAmountDisplaySymbol(c35969oKk.KWHzl());
        chartViewOutSideConfig.setTurnoverDisplaySymbol(c35969oKk.fJNWhG());
        chartViewOutSideConfig.setCurrentMode("NORMAL");
        chartViewOutSideConfig.setAutoYScaleClick(false);
        chartViewOutSideConfig.setHideTradeDrawingLine(false);
        chartViewOutSideConfig.setChartTag(c35969oKk.EZpvd());
        chartViewOutSideConfig.setEconomicDefaultStatus(C36236oUh.EZpvd.iwGUEr());
        chartViewOutSideConfig.setUtc8(pFP.OLrzqt.AEQbTJ());
        chartViewOutSideConfig.setMode(c35969oKk.valueOf());
        chartViewOutSideConfig.setPortraitChart(c35969oKk.fetchVPNInfo() == 0);
        chartViewOutSideConfig.setOrderSupportClick(c35969oKk.getNewProxyInstance());
        chartViewOutSideConfig.setSupportDragOrder(c35969oKk.wlaJM());
        chartViewOutSideConfig.setShowCountdown(c35969oKk.zsXlph());
        if (c35969oKk.DbNXlk() == 0) {
            android.content.Context context = getContext();
            java.lang.Integer numValueOf = context != null ? java.lang.Integer.valueOf(C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null)) : null;
            Intrinsics.copydefault(numValueOf);
            chartViewOutSideConfig.setMPositiveColor(numValueOf.intValue());
        } else {
            chartViewOutSideConfig.setMPositiveColor(c35969oKk.DbNXlk());
        }
        if (c35969oKk.isConnected() == 0) {
            android.content.Context context2 = getContext();
            java.lang.Integer numValueOf2 = context2 != null ? java.lang.Integer.valueOf(C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context2, 0.0f, 2, null)) : null;
            Intrinsics.copydefault(numValueOf2);
            chartViewOutSideConfig.setMNegativeColor(numValueOf2.intValue());
        } else {
            chartViewOutSideConfig.setMNegativeColor(c35969oKk.isConnected());
        }
        this.uzCIH = c35969oKk.fetchVPNInfo() == 0 ? this.AwvSrB : this.AubY;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapSSMYrx = C36246oUr.copydefault().sSMYrx();
        C36250oUv c36250oUv = this.uzCIH;
        com.okinc.kline.library.data.DataSource dataSource = mapSSMYrx.get(c36250oUv != null ? c36250oUv.fIwbmz() : null);
        if (dataSource != null) {
            dataSource.KWHzl();
        }
        C36250oUv c36250oUv2 = this.uzCIH;
        if (c36250oUv2 != null) {
            c36250oUv2.OLrzqt(chartViewOutSideConfig);
        }
        if (c35969oKk.fetchVPNInfo() == 0) {
            C36250oUv c36250oUv3 = this.uzCIH;
            this.finit = c36250oUv3 != null ? c36250oUv3.KWHzl(c35969oKk.values()) : null;
            isConnected();
        } else {
            C36250oUv c36250oUv4 = this.uzCIH;
            this.finit = c36250oUv4 != null ? c36250oUv4.KWHzl(c35969oKk.values()) : null;
            fIwbmz();
            fJNWhG();
            pFN.OLrzqt.EZpvd(new WeakReference<>(this));
        }
        C36250oUv c36250oUv5 = this.uzCIH;
        if (c36250oUv5 != null) {
            c36250oUv5.setIsSupportDoubleClick(c35969oKk.AubY());
        }
        C36250oUv c36250oUv6 = this.uzCIH;
        if (c36250oUv6 != null) {
            c36250oUv6.QOLQEE();
        }
        oUJ.KWHzl.OLrzqt(c35969oKk.gEmmrt(), c35969oKk.AYXKKw());
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        C36312oXc c36312oXcAEQbTJ = C36312oXc.AEQbTJ(this.uzCIH);
        this.QVAiDq = c36312oXcAEQbTJ;
        C36250oUv c36250oUv7 = this.uzCIH;
        if (c36250oUv7 != null) {
            c36250oUv7.setCurrentStateMachine(c36312oXcAEQbTJ);
        }
        C36312oXc c36312oXc = this.QVAiDq;
        if (c36312oXc != null) {
            if ((c36312oXc != null ? c36312oXc.zLjUOn : null) != null && c36312oXc != null) {
                c36312oXc.EZpvd(c36312oXc != null ? c36312oXc.zLjUOn : null);
            }
        }
        C36250oUv c36250oUv8 = this.uzCIH;
        if (c36250oUv8 != null) {
            c36250oUv8.setActionListener(this);
        }
        TemplateSetting templateSetting = this.finit;
        if (templateSetting != null && templateSetting.getMainIndicatorNames() != null) {
            if (this.dxcTrN == 0) {
                C39756pyO c39756pyO = this.hDKMBd;
                if (c39756pyO != null) {
                    c39756pyO.gEmmrt();
                }
                C39756pyO c39756pyO2 = this.hDKMBd;
                if (c39756pyO2 != null) {
                    c39756pyO2.setMainIndicatorSelect();
                }
            } else {
                C39756pyO c39756pyO3 = this.AuCTelauCTel;
                if (c39756pyO3 != null) {
                    c39756pyO3.gEmmrt();
                }
                C39756pyO c39756pyO4 = this.AuCTelauCTel;
                if (c39756pyO4 != null) {
                    c39756pyO4.setMainIndicatorSelect();
                }
            }
        }
        TemplateSetting templateSetting2 = this.finit;
        if (templateSetting2 != null && (sideIndicatorNames = templateSetting2.getSideIndicatorNames()) != null) {
            if (this.dxcTrN == 0) {
                C39756pyO c39756pyO5 = this.hDKMBd;
                if (c39756pyO5 != null) {
                    c39756pyO5.setSideIndicators(sideIndicatorNames);
                }
            } else {
                C39756pyO c39756pyO6 = this.AuCTelauCTel;
                if (c39756pyO6 != null) {
                    c39756pyO6.setSideIndicators(sideIndicatorNames);
                }
            }
        }
        oWN.KWHzl(C57676yms.AEQbTJ(getContext()));
        DrawLineData.copydefault.OLrzqt(new Function1() { // from class: o.pAf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37771pAb.EZpvd((java.util.ArrayList) obj);
            }
        });
        KWHzl(marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType(), c35969oKk.AuCTel(), c35969oKk.AEQbTJ(), c35969oKk.djBIcL(), c35969oKk.OLrzqt(), c35969oKk.KWHzl());
    }

    public static final Unit EZpvd(java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.AEQbTJ((java.util.ArrayList<DrawLineData.DrawLineItem>) arrayList);
        java.util.Iterator<DrawLineData.DrawLineItem> it = drawLineData.EZpvd().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            DrawLineData.DrawLineItem next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            next.setSelected(-1);
        }
        return Unit.INSTANCE;
    }

    public void AEQbTJ(boolean z, @NotNull java.lang.String str) {
        TemplateSetting templateSetting;
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        TemplateSetting templateSetting2;
        java.util.ArrayList<java.lang.String> sideIndicatorNames2;
        java.util.ArrayList<java.lang.String> sideIndicatorNames3;
        Intrinsics.checkNotNullParameter(str, "");
        if (z && ((templateSetting2 = this.finit) == null || (sideIndicatorNames3 = templateSetting2.getSideIndicatorNames()) == null || !sideIndicatorNames3.contains(str))) {
            TemplateSetting templateSetting3 = this.finit;
            int size = (templateSetting3 == null || (sideIndicatorNames2 = templateSetting3.getSideIndicatorNames()) == null) ? 0 : sideIndicatorNames2.size();
            TemplateSetting templateSetting4 = this.finit;
            if (templateSetting4 != null) {
                templateSetting4.addSideIndicator(str);
            }
            C36250oUv c36250oUv = this.uzCIH;
            if (c36250oUv != null) {
                c36250oUv.copydefault(str);
            }
            if (size < 4) {
                copydefault(z);
                return;
            }
            return;
        }
        if (z || (templateSetting = this.finit) == null || (sideIndicatorNames = templateSetting.getSideIndicatorNames()) == null || !sideIndicatorNames.contains(str)) {
            return;
        }
        TemplateSetting templateSetting5 = this.finit;
        if (templateSetting5 != null) {
            templateSetting5.removeSideIndicator(str);
        }
        C36250oUv c36250oUv2 = this.uzCIH;
        if (c36250oUv2 != null) {
            c36250oUv2.gEmmrt(str);
        }
        copydefault(z);
    }

    public final void setTimeSelectBackground(@androidx.annotation.ColorInt int i) {
        C39816pzV c39816pzV = this.giSNqX;
        if (c39816pzV != null) {
            c39816pzV.setTimeSelectBackground(i);
        }
        C39816pzV c39816pzV2 = this.fZBcTu;
        if (c39816pzV2 != null) {
            c39816pzV2.setTimeSelectBackground(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ORxRYg() {
        C38768pff c38768pffAEQbTJ = C38768pff.Companion.AEQbTJ();
        this.ejfBZ = c38768pffAEQbTJ;
        if (c38768pffAEQbTJ != null) {
            DrawerLayout drawerLayout = this.fJNWhG;
            if (drawerLayout != null) {
                drawerLayout.openDrawer(5);
            }
            KWHzl((androidx.fragment.app.Fragment) c38768pffAEQbTJ);
            c38768pffAEQbTJ.copydefault(new TaskStackBuilder());
        }
    }

    /* JADX INFO: renamed from: o.pAb$TaskStackBuilder */
    public static final class TaskStackBuilder implements InterfaceC35980oKv {
        public TaskStackBuilder() {
        }

        @Override // o.InterfaceC35980oKv
        public void AEQbTJ() {
            DrawerLayout drawerLayout = C37771pAb.this.fJNWhG;
            if (drawerLayout != null) {
                drawerLayout.closeDrawer(5);
            }
            C36250oUv c36250oUv = C37771pAb.this.AubY;
            if (c36250oUv != null) {
                c36250oUv.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: o.pAb$Application */
    public static final class Application implements DrawerLayout.DrawerListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(android.view.View view, float f) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerStateChanged(int i) {
        }

        public Application() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            DrawerLayout drawerLayout = C37771pAb.this.fJNWhG;
            if (drawerLayout != null) {
                drawerLayout.setDrawerLockMode(0);
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            DrawerLayout drawerLayout = C37771pAb.this.fJNWhG;
            if (drawerLayout != null) {
                drawerLayout.setDrawerLockMode(1);
            }
            if (C37771pAb.this.AhwBna) {
                C37771pAb.this.AhwBna = false;
                C39816pzV c39816pzV = C37771pAb.this.fZBcTu;
                if (c39816pzV != null) {
                    c39816pzV.setData();
                }
            }
        }
    }

    public final void fJNWhG() {
        DrawerLayout drawerLayout = this.fJNWhG;
        if (drawerLayout != null) {
            drawerLayout.setDrawerLockMode(1);
        }
        DrawerLayout drawerLayout2 = this.fJNWhG;
        if (drawerLayout2 != null) {
            drawerLayout2.addDrawerListener(new Application());
        }
    }

    public static /* synthetic */ void initTimeSelectView$default(C37771pAb c37771pAb, int i, java.lang.Boolean bool, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        c37771pAb.KWHzl(i, bool);
    }

    public final void KWHzl(int i, java.lang.Boolean bool) {
        TemplateSetting templateSettingWlaJM;
        boolean z = false;
        if (i == 0) {
            android.widget.LinearLayout linearLayout = this.djSkpj;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            DrawerLayout drawerLayout = this.fJNWhG;
            if (drawerLayout != null) {
                drawerLayout.setVisibility(8);
            }
            if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
                C39816pzV c39816pzV = this.giSNqX;
                if (c39816pzV != null) {
                    c39816pzV.AEQbTJ();
                }
                C39756pyO c39756pyO = this.hDKMBd;
                if (c39756pyO != null) {
                    c39756pyO.setVisibility(8);
                }
                android.widget.ImageView imageView = this.AkhnZx;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            C39816pzV c39816pzV2 = this.giSNqX;
            if (c39816pzV2 != null) {
                c39816pzV2.setData();
            }
        } else {
            DrawerLayout drawerLayout2 = this.fJNWhG;
            if (drawerLayout2 != null) {
                drawerLayout2.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout2 = this.djSkpj;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            C39816pzV c39816pzV3 = this.fZBcTu;
            if (c39816pzV3 != null) {
                c39816pzV3.setData();
            }
        }
        C36250oUv c36250oUv = this.uzCIH;
        if (c36250oUv != null && (templateSettingWlaJM = c36250oUv.wlaJM()) != null && templateSettingWlaJM.getSPTimeInterval() == -2) {
            z = true;
        }
        OLrzqt(z);
    }

    private final void copydefault(int i) {
        TimeIntervalItem timeIntervalItem;
        if (i == 4) {
            QbewEr();
            C37908pFd.EZpvd(false);
            return;
        }
        if (i == 5) {
            RJOkX();
            C37908pFd.KWHzl();
            return;
        }
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL();
        if (interfaceC39509ptgDjBIcL == null || (timeIntervalItem = (TimeIntervalItem) CollectionsKt___CollectionsKt.AkhnZx(interfaceC39509ptgDjBIcL.KWHzl(), i)) == null) {
            return;
        }
        EZpvd(false);
        C36250oUv c36250oUv = this.AwvSrB;
        if (c36250oUv != null) {
            OLrzqt(c36250oUv, timeIntervalItem);
        }
    }

    public final void KWHzl(int i) {
        android.content.Context context = getContext();
        if (context != null && C55296xhK.OLrzqt(context)) {
            EZpvd(i);
        } else {
            AEQbTJ(i);
        }
    }

    public final void EZpvd(int i) {
        InterfaceC39509ptg interfaceC39509ptgDjBIcL;
        TimeIntervalItem timeIntervalItem;
        TemplateSetting templateSetting;
        if (i != 10) {
            C36250oUv c36250oUv = this.AubY;
            if (c36250oUv == null || (interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL()) == null || (timeIntervalItem = (TimeIntervalItem) CollectionsKt___CollectionsKt.AkhnZx(interfaceC39509ptgDjBIcL.AEQbTJ(), i)) == null) {
                return;
            }
            EZpvd(false);
            OLrzqt(c36250oUv, timeIntervalItem);
            return;
        }
        this.AhwBna = true;
        if (this.fZBcTu != null && (templateSetting = this.finit) != null) {
            C38780pfr c38780pfrCopydefault = C38780pfr.Companion.copydefault(templateSetting.getSPTimeInterval());
            this.AuCTel = c38780pfrCopydefault;
            Intrinsics.copydefault(c38780pfrCopydefault);
            KWHzl((AbstractC32996moC) c38780pfrCopydefault);
            DrawerLayout drawerLayout = this.fJNWhG;
            if (drawerLayout != null) {
                drawerLayout.openDrawer(3);
            }
            C38780pfr c38780pfr = this.AuCTel;
            if (c38780pfr != null) {
                c38780pfr.OLrzqt(new ActionBar());
            }
        }
        C37908pFd.EZpvd(false);
    }

    /* JADX INFO: renamed from: o.pAb$ActionBar */
    public static final class ActionBar implements oKC {
        public ActionBar() {
        }

        @Override // o.oKC
        public void copydefault(MarketTypeSelect marketTypeSelect) {
            Intrinsics.checkNotNullParameter(marketTypeSelect, "");
            C36250oUv c36250oUv = C37771pAb.this.AubY;
            if (c36250oUv != null) {
                C37771pAb c37771pAb = C37771pAb.this;
                c37771pAb.EZpvd(false);
                java.lang.Object data = marketTypeSelect.getData();
                Intrinsics.copydefault(data, "");
                c37771pAb.OLrzqt(c36250oUv, (TimeIntervalItem) data);
            }
            DrawerLayout drawerLayout = C37771pAb.this.fJNWhG;
            if (drawerLayout != null) {
                drawerLayout.closeDrawer(3);
            }
        }
    }

    public final void AEQbTJ(int i) {
        InterfaceC39509ptg interfaceC39509ptgDjBIcL;
        TimeIntervalItem timeIntervalItem;
        TemplateSetting templateSetting;
        if (i != 10) {
            C36250oUv c36250oUv = this.AubY;
            if (c36250oUv == null || (interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL()) == null || (timeIntervalItem = (TimeIntervalItem) CollectionsKt___CollectionsKt.AkhnZx(interfaceC39509ptgDjBIcL.AEQbTJ(), i)) == null) {
                return;
            }
            EZpvd(false);
            OLrzqt(c36250oUv, timeIntervalItem);
            return;
        }
        this.AhwBna = true;
        if (this.fZBcTu != null && (templateSetting = this.finit) != null) {
            C38780pfr c38780pfrCopydefault = C38780pfr.Companion.copydefault(templateSetting.getSPTimeInterval());
            this.AuCTel = c38780pfrCopydefault;
            Intrinsics.copydefault(c38780pfrCopydefault);
            KWHzl((androidx.fragment.app.Fragment) c38780pfrCopydefault);
            DrawerLayout drawerLayout = this.fJNWhG;
            if (drawerLayout != null) {
                drawerLayout.openDrawer(5);
            }
            C38780pfr c38780pfr = this.AuCTel;
            if (c38780pfr != null) {
                c38780pfr.OLrzqt(new Activity());
            }
        }
        C37908pFd.EZpvd(false);
    }

    /* JADX INFO: renamed from: o.pAb$Activity */
    public static final class Activity implements oKC {
        public Activity() {
        }

        @Override // o.oKC
        public void copydefault(MarketTypeSelect marketTypeSelect) {
            Intrinsics.checkNotNullParameter(marketTypeSelect, "");
            C36250oUv c36250oUv = C37771pAb.this.AubY;
            if (c36250oUv != null) {
                C37771pAb c37771pAb = C37771pAb.this;
                c37771pAb.EZpvd(false);
                java.lang.Object data = marketTypeSelect.getData();
                Intrinsics.copydefault(data, "");
                c37771pAb.OLrzqt(c36250oUv, (TimeIntervalItem) data);
            }
            DrawerLayout drawerLayout = C37771pAb.this.fJNWhG;
            if (drawerLayout != null) {
                drawerLayout.closeDrawer(5);
            }
        }
    }

    public final void KWHzl(AbstractC32996moC abstractC32996moC) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction;
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace;
        AppCompatActivity appCompatActivityAxsJAY = AxsJAY();
        if (appCompatActivityAxsJAY == null || (supportFragmentManager = appCompatActivityAxsJAY.getSupportFragmentManager()) == null || (fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction()) == null || (fragmentTransactionReplace = fragmentTransactionBeginTransaction.replace(C35964oKf.StateListAnimator.RTWSvT, abstractC32996moC)) == null) {
            return;
        }
        fragmentTransactionReplace.commit();
    }

    public final void KWHzl(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction;
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace;
        AppCompatActivity appCompatActivityAxsJAY = AxsJAY();
        if (appCompatActivityAxsJAY == null || (supportFragmentManager = appCompatActivityAxsJAY.getSupportFragmentManager()) == null || (fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction()) == null || (fragmentTransactionReplace = fragmentTransactionBeginTransaction.replace(C35964oKf.StateListAnimator.RZNAhV, fragment)) == null) {
            return;
        }
        fragmentTransactionReplace.commit();
    }

    private final void QbewEr() {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        C39339pqT c39339pqTNewInstance$default = C39339pqT.TaskDescription.newInstance$default(C39339pqT.Companion, false, false, 3, null);
        c39339pqTNewInstance$default.OLrzqt(new Function1() { // from class: o.pAE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37771pAb.djBIcL(this.copydefault, (MarketTypeSelect) obj);
            }
        });
        AppCompatActivity appCompatActivityAxsJAY = AxsJAY();
        if (appCompatActivityAxsJAY == null || (supportFragmentManager = appCompatActivityAxsJAY.getSupportFragmentManager()) == null) {
            return;
        }
        java.lang.String simpleName = C37771pAb.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        c39339pqTNewInstance$default.EZpvd(supportFragmentManager, simpleName);
        c39339pqTNewInstance$default.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.pAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C37771pAb.copydefault(this.AEQbTJ, dialogInterface);
            }
        });
    }

    public static final Unit djBIcL(C37771pAb c37771pAb, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        C36250oUv c36250oUv = c37771pAb.AwvSrB;
        if (c36250oUv != null) {
            c37771pAb.EZpvd(false);
            java.lang.Object data = marketTypeSelect.getData();
            Intrinsics.copydefault(data, "");
            c37771pAb.OLrzqt(c36250oUv, (TimeIntervalItem) data);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(C37771pAb c37771pAb, android.content.DialogInterface dialogInterface) {
        C39816pzV c39816pzV = c37771pAb.giSNqX;
        if (c39816pzV != null) {
            c39816pzV.setData();
        }
    }

    private final void RJOkX() {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        TemplateSetting templateSetting = this.finit;
        if (templateSetting == null || templateSetting.getSideIndicatorNames() == null) {
            return;
        }
        C39358pqm c39358pqmNewInstance$default = C39358pqm.TaskDescription.newInstance$default(C39358pqm.Companion, C55608xnE.OLrzqt(), null, 2, null);
        c39358pqmNewInstance$default.AEQbTJ(new Function1() { // from class: o.pAg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37771pAb.gEmmrt(this.EZpvd, (MarketTypeSelect) obj);
            }
        });
        c39358pqmNewInstance$default.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.pAn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C37771pAb.EZpvd(this.OLrzqt, dialogInterface);
            }
        });
        AppCompatActivity appCompatActivityAxsJAY = AxsJAY();
        if (appCompatActivityAxsJAY == null || (supportFragmentManager = appCompatActivityAxsJAY.getSupportFragmentManager()) == null) {
            return;
        }
        java.lang.String simpleName = C37771pAb.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        c39358pqmNewInstance$default.EZpvd(supportFragmentManager, simpleName);
    }

    public static final Unit gEmmrt(C37771pAb c37771pAb, MarketTypeSelect marketTypeSelect) {
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        C39756pyO c39756pyO;
        C39756pyO c39756pyO2;
        C39756pyO c39756pyO3;
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        if (Intrinsics.EZpvd((java.lang.Object) marketTypeSelect.getSelectTypeName(), (java.lang.Object) "VOLUME") && !Intrinsics.EZpvd((java.lang.Object) c37771pAb.DTwDnp, (java.lang.Object) "TYPE_KLINE")) {
            if (marketTypeSelect.getGroup() == 0 && (c39756pyO3 = c37771pAb.hDKMBd) != null) {
                c39756pyO3.setMainIndicatorSelect();
            }
            return Unit.INSTANCE;
        }
        C36250oUv c36250oUv = c37771pAb.AwvSrB;
        if (c36250oUv != null) {
            c37771pAb.OLrzqt(c36250oUv, marketTypeSelect);
        }
        if (marketTypeSelect.getGroup() == 0) {
            TemplateSetting templateSetting = c37771pAb.finit;
            if (templateSetting != null && templateSetting.getMainIndicatorNames() != null && (c39756pyO2 = c37771pAb.hDKMBd) != null) {
                c39756pyO2.setMainIndicatorSelect();
            }
        } else {
            TemplateSetting templateSetting2 = c37771pAb.finit;
            if (templateSetting2 != null && (sideIndicatorNames = templateSetting2.getSideIndicatorNames()) != null && (c39756pyO = c37771pAb.hDKMBd) != null) {
                c39756pyO.setSideIndicators(sideIndicatorNames);
            }
        }
        C37908pFd.indicatorSelectFragmentEvent$default(marketTypeSelect.getSelectTypeName(), marketTypeSelect.isSelect(), marketTypeSelect.getGroup() == 0, false, null, 24, null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C37771pAb c37771pAb, android.content.DialogInterface dialogInterface) {
        C39816pzV c39816pzV = c37771pAb.giSNqX;
        if (c39816pzV != null) {
            c39816pzV.setData();
        }
    }

    /* JADX INFO: renamed from: o.pAb$VoiceInteractor */
    public static final class VoiceInteractor implements oKD {
        @Override // o.oKD
        public void KWHzl() {
        }

        public VoiceInteractor() {
        }

        @Override // o.oKD
        public void KWHzl(long j) {
            oKD.TaskDescription.OLrzqt(this, j);
        }

        @Override // o.oKD
        public void copydefault() {
            InterfaceC35981oKw interfaceC35981oKw = C37771pAb.this.OLrzqt;
            if (interfaceC35981oKw != null) {
                interfaceC35981oKw.copydefault();
            }
        }

        @Override // o.oKD
        public void AYXKKw(boolean z) {
            C36246oUr.copydefault().zLjUOn(z);
            C37771pAb.this.sSMYrx();
        }

        @Override // o.oKD
        public void OLrzqt(boolean z) {
            C36250oUv c36250oUv;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            SPUtils.put("chart_countdown", java.lang.Boolean.valueOf(z));
            C36250oUv c36250oUv2 = C37771pAb.this.uzCIH;
            if (c36250oUv2 != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setShowCountdown(z);
            }
            C37771pAb.this.sSMYrx();
            if (!z || (c36250oUv = C37771pAb.this.AwvSrB) == null) {
                return;
            }
            c36250oUv.QKVWgx();
        }

        @Override // o.oKD
        public void AhwBna(boolean z) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            SPUtils.put("chart_price_warning", java.lang.Boolean.valueOf(z));
            C36250oUv c36250oUv = C37771pAb.this.uzCIH;
            if (c36250oUv != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMShowPriceWarning(z);
            }
            C37771pAb.this.sSMYrx();
            if (z) {
                return;
            }
            C37771pAb.this.zuBGHE();
        }

        @Override // o.oKD
        public void djBIcL(boolean z) {
            SPUtils.put("chart_history_order", java.lang.Boolean.valueOf(z));
            C36246oUr.copydefault().getFieldNames(z);
            C36246oUr.copydefault().AhwBna(false);
            C37771pAb.this.sSMYrx();
        }

        @Override // o.oKD
        public void copydefault(boolean z) {
            SPUtils.put("chart_current_order", java.lang.Boolean.valueOf(z));
            C36246oUr.copydefault().hDKMBd(z);
            C36246oUr.copydefault().AhwBna(false);
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.OLrzqt();
            C37771pAb.this.sSMYrx();
        }

        @Override // o.oKD
        public void KWHzl(boolean z) {
            SPUtils.put("chart_cost_line", java.lang.Boolean.valueOf(z));
            C36246oUr.copydefault().ejfBZ(z);
            C36246oUr.copydefault().AhwBna(false);
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.OLrzqt();
            C37771pAb.this.sSMYrx();
        }

        @Override // o.oKD
        public void EZpvd(boolean z) {
            SPUtils.put("cost_be", java.lang.Boolean.valueOf(z));
            C36246oUr.copydefault().AuCTel(z);
            C36246oUr.copydefault().AhwBna(false);
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.OLrzqt();
            c37932pGa.KWHzl();
            C37771pAb.this.sSMYrx();
        }

        @Override // o.oKD
        public void AEQbTJ(boolean z) {
            SPUtils.put("cost_liq", java.lang.Boolean.valueOf(z));
            C36246oUr.copydefault().fJNWhG(z);
            C36246oUr.copydefault().AhwBna(false);
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.OLrzqt();
            c37932pGa.KWHzl();
            c37932pGa.AEQbTJ();
            C37771pAb.this.sSMYrx();
        }

        @Override // o.oKD
        public void gEmmrt(boolean z) {
            SPUtils.put("chart_spot_average", java.lang.Boolean.valueOf(z));
            C36246oUr.copydefault().iwGUEr(z);
            if (z && C37771pAb.this.zsXlph) {
                C37771pAb.this.AwvSrB();
            }
        }

        @Override // o.oKD
        public void EZpvd(float f) {
            C37771pAb.this.OLrzqt((int) (r0.OcIXYQ * (f + 1.0f)));
        }

        @Override // o.oKD
        public void OLrzqt() {
            InterfaceC35981oKw interfaceC35981oKw = C37771pAb.this.OLrzqt;
            if (interfaceC35981oKw != null) {
                interfaceC35981oKw.KWHzl(true);
            }
        }

        @Override // o.oKD
        public void EZpvd() {
            InterfaceC35981oKw interfaceC35981oKw = C37771pAb.this.OLrzqt;
            if (interfaceC35981oKw != null) {
                interfaceC35981oKw.KWHzl(false);
            }
        }

        @Override // o.oKD
        public void valueOf(boolean z) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            if (z) {
                C37771pAb c37771pAb = C37771pAb.this;
                C36250oUv c36250oUv = c37771pAb.uzCIH;
                c37771pAb.OLrzqt(C33129mqd.gEmmrt(c36250oUv != null ? java.lang.Long.valueOf(c36250oUv.getFieldNames()) : null));
            }
            C36250oUv c36250oUv2 = C37771pAb.this.uzCIH;
            if (c36250oUv2 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMChartOffsetInit(false);
            }
            C36250oUv c36250oUv3 = C37771pAb.this.uzCIH;
            if (c36250oUv3 != null && (chartViewOutSideConfigAkhnZx = c36250oUv3.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setEconomicDefaultStatus(C36236oUh.EZpvd.iwGUEr());
            }
            C37771pAb.this.sSMYrx();
        }
    }

    public final void KWHzl(boolean z) {
        java.lang.Object objM7377constructorimpl;
        VoiceInteractor voiceInteractor = new VoiceInteractor();
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(this).getChildFragmentManager());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        androidx.fragment.app.FragmentManager fragmentManager = (androidx.fragment.app.FragmentManager) objM7377constructorimpl;
        if (fragmentManager == null) {
            AppCompatActivity appCompatActivityAxsJAY = AxsJAY();
            androidx.fragment.app.FragmentManager supportFragmentManager = appCompatActivityAxsJAY != null ? appCompatActivityAxsJAY.getSupportFragmentManager() : null;
            if (supportFragmentManager == null) {
                return;
            } else {
                fragmentManager = supportFragmentManager;
            }
        }
        C36204oTc.Companion.OLrzqt(new SettingEntryPoint(EntryType.LITE_PORTRAIT, this.sSMYrx.getInstrumentId(), this.sSMYrx.getInstrumentType(), null, false, false, false, false, false, false, false, false, false, false, false, 32760, null), fragmentManager).OLrzqt(voiceInteractor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zuBGHE() {
        C36312oXc c36312oXc = this.QVAiDq;
        if (c36312oXc == null || !(c36312oXc.isConnected() instanceof C36315oXf)) {
            return;
        }
        c36312oXc.EZpvd(c36312oXc.zLjUOn);
    }

    public final void OLrzqt(C36250oUv c36250oUv, TimeIntervalItem timeIntervalItem) {
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
        int sPTimeInterval = templateSettingWlaJM.getSPTimeInterval();
        int i = timeIntervalItem.timeInterval;
        if (sPTimeInterval == i) {
            return;
        }
        templateSettingWlaJM.putTimeInterval(i);
        c36250oUv.RcXXUw();
        iwGUEr();
        c36250oUv.setCurrentDataSource(this.sSMYrx.getInstrumentId() + this.sSMYrx.getInstrumentType() + JwtUtilsKt.JWT_DELIMITER + templateSettingWlaJM.getSPTimeInterval());
        if (templateSettingWlaJM.getSPTimeInterval() < 0) {
            c36250oUv.setChartStyle(1);
        } else if (templateSettingWlaJM.getTimelineScale() < oWN.AEQbTJ) {
            c36250oUv.setChartStyle(2);
        } else {
            c36250oUv.setChartStyle(0);
        }
        com.okinc.kline.library.data.DataSource dataSource = C36246oUr.copydefault().sSMYrx().get(c36250oUv.fIwbmz());
        if (dataSource != null) {
            dataSource.KWHzl();
        }
        C36246oUr.copydefault().isConnected(false);
        C36246oUr.copydefault().KWHzl();
        InterfaceC35981oKw interfaceC35981oKw = this.OLrzqt;
        if (interfaceC35981oKw != null) {
            interfaceC35981oKw.AEQbTJ(timeIntervalItem.timeInterval);
        }
        if (this.AxsJAY) {
            fARcdN();
        }
        if (!this.dvKsVJ) {
            DbNXlk();
        }
        C37908pFd.changeTimeEvent$default(timeIntervalItem.getTradingType(), false, 2, null);
    }

    public final void iwGUEr() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        C36250oUv c36250oUv = this.AwvSrB;
        if (c36250oUv != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx2.setCurrentMode("NORMAL");
        }
        C36250oUv c36250oUv2 = this.AwvSrB;
        if (c36250oUv2 == null || (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) == null) {
            return;
        }
        chartViewOutSideConfigAkhnZx.setAutoYScaleClick(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(int i) {
        C36250oUv c36250oUv = this.uzCIH;
        ViewGroup.LayoutParams layoutParams = c36250oUv != null ? c36250oUv.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = i;
        }
        C36250oUv c36250oUv2 = this.uzCIH;
        if (c36250oUv2 != null) {
            c36250oUv2.setLayoutParams(layoutParams);
        }
    }

    private final void OLrzqt(C36250oUv c36250oUv, MarketTypeSelect marketTypeSelect) {
        if (!marketTypeSelect.isSelect() && this.zLjUOn) {
            AEQbTJ(marketTypeSelect.getSelectTypeName(), false, marketTypeSelect.getGroup() == 0);
        }
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
        if (marketTypeSelect.getGroup() == 0) {
            setMainIndicator(c36250oUv, marketTypeSelect, templateSettingWlaJM);
            if (marketTypeSelect.isSelect() && this.zLjUOn) {
                AEQbTJ(marketTypeSelect.getSelectTypeName(), true, marketTypeSelect.getGroup() == 0);
                return;
            }
            return;
        }
        java.util.ArrayList<IndicatorDataReq> arrayList = new java.util.ArrayList<>();
        if (marketTypeSelect.isSelect()) {
            int size = templateSettingWlaJM.getSideIndicatorNames().size();
            if (size >= 4 && this.zLjUOn) {
                java.util.ArrayList<java.lang.String> sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames();
                Intrinsics.checkNotNullExpressionValue(sideIndicatorNames, "");
                java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(sideIndicatorNames);
                IndicatorDataReq indicatorDataReqEZpvd = EZpvd(str != null ? str : "", false, false);
                if (indicatorDataReqEZpvd != null) {
                    arrayList.add(indicatorDataReqEZpvd);
                }
            }
            templateSettingWlaJM.addSideIndicator(marketTypeSelect.getSelectTypeName());
            c36250oUv.copydefault(marketTypeSelect.getSelectTypeName());
            if (size < 4 && this.dxcTrN == 0) {
                this.OcIXYQ += C36246oUr.copydefault().accept();
                OLrzqt(c36250oUv.getHeight() + C36246oUr.copydefault().accept());
            }
        } else {
            templateSettingWlaJM.removeSideIndicator(marketTypeSelect.getSelectTypeName());
            c36250oUv.gEmmrt(marketTypeSelect.getSelectTypeName());
            if (this.dxcTrN == 0) {
                this.OcIXYQ -= C36246oUr.copydefault().accept();
                OLrzqt(c36250oUv.getHeight() - C36246oUr.copydefault().accept());
            }
        }
        if (marketTypeSelect.isSelect() && this.zLjUOn) {
            IndicatorDataReq indicatorDataReqEZpvd2 = EZpvd(marketTypeSelect.getSelectTypeName(), true, false);
            if (indicatorDataReqEZpvd2 != null) {
                arrayList.add(indicatorDataReqEZpvd2);
            }
            OLrzqt(arrayList);
        }
    }

    public final void OLrzqt(@NotNull java.util.ArrayList<IndicatorDataReq> arrayList) {
        LifecycleOwner lifecycleOwner;
        pAR par;
        InterfaceC39563puh.StateListAnimator stateListAnimatorDjBIcL;
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (!pFP.isLogin$default(pFP.OLrzqt, null, 1, null) || !(!arrayList.isEmpty()) || (lifecycleOwner = this.zuBGHE) == null || (par = this.flVtFt) == null || (stateListAnimatorDjBIcL = par.djBIcL()) == null) {
            return;
        }
        stateListAnimatorDjBIcL.EZpvd(lifecycleOwner, arrayList);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2) {
        IndicatorDataReq indicatorDataReqEZpvd;
        pAR par;
        InterfaceC39563puh.StateListAnimator stateListAnimatorDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        LifecycleOwner lifecycleOwner = this.zuBGHE;
        if (lifecycleOwner == null || !pFP.isLogin$default(pFP.OLrzqt, null, 1, null) || (indicatorDataReqEZpvd = EZpvd(str, z, z2)) == null || (par = this.flVtFt) == null || (stateListAnimatorDjBIcL = par.djBIcL()) == null) {
            return;
        }
        stateListAnimatorDjBIcL.KWHzl(lifecycleOwner, indicatorDataReqEZpvd);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IndicatorDataReq EZpvd(@NotNull java.lang.String str, boolean z, boolean z2) {
        java.lang.String str2;
        AbstractC36262oVg abstractC36262oVgAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            switch (str.hashCode()) {
                case -2040464843:
                    str2 = !str.equals("LSAcco") ? str : "ELITE_LSR";
                    break;
                case 2044557:
                    str2 = !str.equals("BOLL") ? str : "BB";
                    break;
                case 63511234:
                    str2 = !str.equals("BSVol") ? str : "TAKER_BS";
                    break;
                case 72740685:
                    str2 = !str.equals("LSPos") ? str : "ELITE_OI_LSR";
                    break;
                case 1185755844:
                    str2 = !str.equals("LSRatio") ? str : "LSR";
                    break;
                case 1768025685:
                    str2 = !str.equals("StochRSI") ? str : "STOCH_RSI";
                    break;
                default:
                    str2 = str;
                    break;
            }
            IndicatorBean indicatorBean = new IndicatorBean(str, z2, null, java.lang.Boolean.valueOf(z));
            C37957pGz c37957pGz = C37957pGz.copydefault;
            InterfaceC37953pGv interfaceC37953pGvOLrzqt = c37957pGz.OLrzqt(str2);
            if (z2) {
                C36250oUv c36250oUv = this.uzCIH;
                abstractC36262oVgAEQbTJ = c36250oUv != null ? c36250oUv.OLrzqt("ds0", str) : null;
                if (abstractC36262oVgAEQbTJ != null) {
                    java.lang.String strOLrzqt = interfaceC37953pGvOLrzqt != null ? interfaceC37953pGvOLrzqt.OLrzqt(abstractC36262oVgAEQbTJ, indicatorBean, z) : null;
                    if (strOLrzqt != null) {
                        if (z2) {
                            str2 = ((java.lang.Object) str2) + c37957pGz.OLrzqt();
                        }
                        return new IndicatorDataReq(str2, strOLrzqt, z ? "0" : "1", null, 8, null);
                    }
                }
            } else {
                C36250oUv c36250oUv2 = this.uzCIH;
                if (c36250oUv2 != null) {
                    abstractC36262oVgAEQbTJ = c36250oUv2.AEQbTJ("ds0.indic" + str);
                }
                if (abstractC36262oVgAEQbTJ != null) {
                }
            }
        }
        return null;
    }

    public final void copydefault(C36250oUv c36250oUv, MarketTypeSelect marketTypeSelect) {
        java.lang.Integer numValueOf;
        C36250oUv c36250oUv2;
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
        if (marketTypeSelect.getGroup() == 0) {
            setMainIndicator(c36250oUv, marketTypeSelect, templateSettingWlaJM);
            return;
        }
        if (marketTypeSelect.isSelect()) {
            templateSettingWlaJM.addSideIndicator(marketTypeSelect.getSelectTypeName());
            c36250oUv.copydefault(marketTypeSelect.getSelectTypeName());
            int size = templateSettingWlaJM.getSideIndicatorNames().size();
            if (size <= 1) {
                C36250oUv c36250oUv3 = this.AubY;
                if (c36250oUv3 != null) {
                    c36250oUv3.setMinimumHeight(this.QfsBiF);
                    return;
                }
                return;
            }
            if (size < 4) {
                C36250oUv c36250oUv4 = this.AubY;
                if (c36250oUv4 != null) {
                    numValueOf = c36250oUv4 != null ? java.lang.Integer.valueOf(c36250oUv4.getMinimumHeight() + C36246oUr.copydefault().aKErDB()) : null;
                    Intrinsics.copydefault(numValueOf);
                    c36250oUv4.setMinimumHeight(numValueOf.intValue());
                }
            } else if (size == 4 && (c36250oUv2 = this.AubY) != null) {
                c36250oUv2.setMinimumHeight(this.QfsBiF + (C36246oUr.copydefault().aKErDB() * 3));
            }
            uzCIH();
            return;
        }
        templateSettingWlaJM.removeSideIndicator(marketTypeSelect.getSelectTypeName());
        c36250oUv.gEmmrt(marketTypeSelect.getSelectTypeName());
        if (templateSettingWlaJM.getSideIndicatorNames().size() <= 1) {
            C36250oUv c36250oUv5 = this.AubY;
            if (c36250oUv5 != null) {
                c36250oUv5.setMinimumHeight(this.QfsBiF);
                return;
            }
            return;
        }
        C36250oUv c36250oUv6 = this.AubY;
        if (c36250oUv6 != null) {
            numValueOf = c36250oUv6 != null ? java.lang.Integer.valueOf(c36250oUv6.getMinimumHeight() - C36246oUr.copydefault().aKErDB()) : null;
            Intrinsics.copydefault(numValueOf);
            c36250oUv6.setMinimumHeight(numValueOf.intValue());
        }
        uzCIH();
    }

    public final void setMainIndicator(C36250oUv c36250oUv, MarketTypeSelect marketTypeSelect, TemplateSetting templateSetting) {
        if (marketTypeSelect.isSelect()) {
            if (templateSetting.getSPTimeInterval() > -1) {
                c36250oUv.setMainIndicator(marketTypeSelect.getSelectTypeName());
            }
        } else if (templateSetting.getSPTimeInterval() > -1 && Intrinsics.EZpvd((java.lang.Object) marketTypeSelect.getSelectTypeName(), (java.lang.Object) "VOLUME")) {
            c36250oUv.dNCPSb();
        } else {
            c36250oUv.OLrzqt(marketTypeSelect.getSelectTypeName());
        }
    }

    public final void uzCIH() {
        new android.os.Handler().post(new java.lang.Runnable() { // from class: o.pAe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37771pAb.wlaJM(this.AEQbTJ);
            }
        });
    }

    public static final void wlaJM(C37771pAb c37771pAb) {
        C39835pzo c39835pzo = c37771pAb.QOLQEE;
        if (c39835pzo != null) {
            c39835pzo.fullScroll(130);
        }
    }

    private final void copydefault(C36250oUv c36250oUv) {
        TemplateSetting templateSetting = this.finit;
        if (templateSetting != null) {
            if (templateSetting.getSPTimeInterval() < 0) {
                c36250oUv.setChartStyle(1);
                return;
            }
            int timelineScale = templateSetting.getTimelineScale();
            int i = oWN.AEQbTJ;
            if (timelineScale < i) {
                if (C36246oUr.copydefault().RKcVTr()) {
                    oWN own = C36246oUr.copydefault().DCJXGO().get("ds0");
                    if (own != null) {
                        own.OLrzqt(i);
                    }
                    c36250oUv.setChartStyle(0);
                    return;
                }
                c36250oUv.setChartStyle(2);
                return;
            }
            c36250oUv.setChartStyle(0);
        }
    }

    public final void sSMYrx() {
        C36250oUv c36250oUv = this.uzCIH;
        if (c36250oUv != null) {
            c36250oUv.QfsBiF();
        }
        C36250oUv c36250oUv2 = this.uzCIH;
        if (c36250oUv2 != null) {
            c36250oUv2.invalidate();
        }
    }

    @Override // o.InterfaceC35977oKs
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, int i2, int i3, @NotNull java.lang.String str4) {
        C36250oUv c36250oUv;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.DTwDnp = str3;
        this.sSMYrx.setInstrumentId(str);
        this.sSMYrx.setInstrumentType(str2);
        C36250oUv c36250oUv2 = this.uzCIH;
        if (c36250oUv2 != null) {
            TemplateSetting templateSetting = this.finit;
            c36250oUv2.setCurrentDataSource(str + str2 + JwtUtilsKt.JWT_DELIMITER + (templateSetting != null ? java.lang.Integer.valueOf(templateSetting.getSPTimeInterval()) : null));
        }
        C36246oUr.copydefault().AkhnZx(str4);
        C36246oUr.copydefault().AYXKKw(i2);
        C36246oUr.copydefault().AhwBna(false);
        C36246oUr.copydefault().isConnected(false);
        C36250oUv c36250oUv3 = this.uzCIH;
        if (c36250oUv3 != null) {
            c36250oUv3.setPriceFractionDigits(i);
        }
        C36250oUv c36250oUv4 = this.uzCIH;
        if (c36250oUv4 != null) {
            c36250oUv4.setCoinVol(i3);
        }
        C36250oUv c36250oUv5 = this.uzCIH;
        if (c36250oUv5 != null) {
            c36250oUv5.setFutures(Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "OPTION"));
        }
        C36250oUv c36250oUv6 = this.uzCIH;
        if (c36250oUv6 != null) {
            c36250oUv6.setFuturesWithOutOption(Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP"));
        }
        java.lang.Integer num = SPUtils.getInt("chart_coordinate_model", 0);
        if (num != null && num.intValue() == 0) {
            C36246oUr.copydefault().gEmmrt(0);
        } else {
            C36246oUr.copydefault().gEmmrt(1);
        }
        C36246oUr.copydefault().KWHzl();
        C36246oUr.copydefault().gEmmrt();
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        TemplateSetting templateSetting2 = this.finit;
        c36246oUrCopydefault.AuCTelauCTel(templateSetting2 != null ? templateSetting2.hasVolumeIndicator() : false);
        C36246oUr.copydefault().djBIcL(1);
        C36246oUr.copydefault().fARcdN(SPUtils.getBoolean("chart_axis", true));
        C36246oUr.copydefault().copydefault(SPUtils.getInt("chart_model", 0).intValue());
        C36246oUr.copydefault().OLrzqt(SPUtils.getInt("chart_position", 1).intValue());
        if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "INDEX") && this.dvKsVJ) {
            if (C36246oUr.copydefault().DGgnkA()) {
                wlaJM();
            }
            AubY();
        } else {
            DbNXlk();
        }
        if (this.copydefault && (c36250oUv = this.uzCIH) != null) {
            c36250oUv.gHZMYf();
        }
        C36250oUv c36250oUv7 = this.uzCIH;
        if (c36250oUv7 != null) {
            copydefault(c36250oUv7);
        }
    }

    private final void copydefault(java.lang.String str) {
        if (str == null || str.length() == 0) {
            if (C33492mxV.OLrzqt()) {
                C36250oUv c36250oUv = this.uzCIH;
                if (c36250oUv != null) {
                    c36250oUv.djBIcL("dark");
                    return;
                }
                return;
            }
            C36250oUv c36250oUv2 = this.uzCIH;
            if (c36250oUv2 != null) {
                c36250oUv2.djBIcL("light");
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "kline_dark")) {
            C36250oUv c36250oUv3 = this.uzCIH;
            if (c36250oUv3 != null) {
                c36250oUv3.djBIcL("dark");
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "kline_white")) {
            C36250oUv c36250oUv4 = this.uzCIH;
            if (c36250oUv4 != null) {
                c36250oUv4.djBIcL("light");
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            C36250oUv c36250oUv5 = this.uzCIH;
            if (c36250oUv5 != null) {
                c36250oUv5.djBIcL("dark");
                return;
            }
            return;
        }
        C36250oUv c36250oUv6 = this.uzCIH;
        if (c36250oUv6 != null) {
            c36250oUv6.djBIcL("light");
        }
    }

    public final void wlaJM() {
        C36250oUv c36250oUv = this.uzCIH;
        if (c36250oUv != null) {
            c36250oUv.fZBcTu();
        }
    }

    public final void AubY() {
        C36250oUv c36250oUv = this.uzCIH;
        if (c36250oUv != null) {
            c36250oUv.aKErDB();
        }
    }

    public final void DbNXlk() {
        C36250oUv c36250oUv = this.uzCIH;
        if (c36250oUv != null) {
            c36250oUv.AwvSrB();
        }
        C36250oUv c36250oUv2 = this.uzCIH;
        if (c36250oUv2 != null) {
            c36250oUv2.sSMYrx();
        }
    }

    public final void fARcdN() {
        TemplateSetting templateSetting;
        InterfaceC39563puh.StateListAnimator stateListAnimatorDjBIcL;
        LifecycleOwner lifecycleOwner = this.zuBGHE;
        if (lifecycleOwner == null || (templateSetting = this.finit) == null) {
            return;
        }
        int sPTimeInterval = templateSetting.getSPTimeInterval();
        AuCTelauCTel();
        pAR par = this.flVtFt;
        if (par == null || (stateListAnimatorDjBIcL = par.djBIcL()) == null) {
            return;
        }
        InterfaceC39563puh.StateListAnimator.TaskDescription.loadKline$default(stateListAnimatorDjBIcL, lifecycleOwner, sPTimeInterval, false, false, null, 24, null);
    }

    public final void AuCTelauCTel() {
        C55113xdn c55113xdn = this.QUSxYX;
        if (c55113xdn != null) {
            c55113xdn.setVisibility(0);
        }
        C55113xdn c55113xdn2 = this.QUSxYX;
        if (c55113xdn2 != null) {
            c55113xdn2.setAnimation(C52761wXj.PendingIntent.isConnected);
        }
        C55113xdn c55113xdn3 = this.QUSxYX;
        if (c55113xdn3 != null) {
            c55113xdn3.KWHzl(0L);
        }
    }

    public final void gEmmrt() {
        C55113xdn c55113xdn = this.QUSxYX;
        if (c55113xdn != null) {
            c55113xdn.setVisibility(8);
        }
        C55113xdn c55113xdn2 = this.QUSxYX;
        if (c55113xdn2 != null) {
            c55113xdn2.copydefault();
        }
    }

    @Override // o.InterfaceC35977oKs
    public void setMarginTop(int i) {
        ConstraintLayout constraintLayout = this.getFieldNames;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i;
            constraintLayout.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // o.InterfaceC35977oKs
    public int copydefault() {
        TemplateSetting templateSetting = this.finit;
        if (templateSetting != null) {
            return templateSetting.getSPTimeInterval();
        }
        return 60;
    }

    @Override // o.InterfaceC35977oKs
    public void setPriceFractionDigits(int i) {
        C36250oUv c36250oUv = this.uzCIH;
        if (c36250oUv != null) {
            c36250oUv.setPriceFractionDigits(i);
        }
    }

    public void setMainIndicatorSelect() {
        C39756pyO c39756pyO = this.hDKMBd;
        if (c39756pyO != null) {
            c39756pyO.setMainIndicatorSelect();
        }
    }

    public void setSideIndicators() {
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        C39756pyO c39756pyO;
        TemplateSetting templateSetting = this.finit;
        if (templateSetting == null || (sideIndicatorNames = templateSetting.getSideIndicatorNames()) == null || (c39756pyO = this.hDKMBd) == null) {
            return;
        }
        c39756pyO.setSideIndicators(sideIndicatorNames);
    }

    public void copydefault(boolean z) {
        if (z) {
            this.OcIXYQ += C36246oUr.copydefault().accept();
            C36250oUv c36250oUv = this.AwvSrB;
            OLrzqt(c36250oUv != null ? C36246oUr.copydefault().accept() + c36250oUv.getHeight() : 0);
        } else {
            this.OcIXYQ -= C36246oUr.copydefault().accept();
            C36250oUv c36250oUv2 = this.AwvSrB;
            OLrzqt(c36250oUv2 != null ? c36250oUv2.getHeight() - C36246oUr.copydefault().accept() : 0);
        }
    }

    @Override // o.InterfaceC35977oKs
    public void AEQbTJ() {
        C36312oXc c36312oXc = this.QVAiDq;
        if (c36312oXc != null) {
            if ((c36312oXc != null ? c36312oXc.zLjUOn : null) != null) {
                if ((c36312oXc != null ? c36312oXc.zLjUOn : null) != null && c36312oXc != null) {
                    c36312oXc.EZpvd(c36312oXc != null ? c36312oXc.zLjUOn : null);
                }
            }
        }
        C36246oUr.copydefault().DbNXlk("NORMAL");
        C36246oUr.copydefault().EZpvd(false);
        C36246oUr.copydefault().AhwBna(false);
        if (this.AxsJAY) {
            fARcdN();
        }
    }

    public final void zsXlph() {
        C36250oUv c36250oUv = this.uzCIH;
        if (c36250oUv != null) {
            c36250oUv.setShowEmptyUi(true);
        }
        C36250oUv c36250oUv2 = this.uzCIH;
        if (c36250oUv2 != null) {
            c36250oUv2.gHZMYf();
        }
        C39756pyO c39756pyO = this.hDKMBd;
        if (c39756pyO != null) {
            c39756pyO.setVisibility(8);
        }
    }

    private final void QKVWgx() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = this.AEQbTJ;
        if (viewOnClickListenerC39742pyA != null) {
            viewOnClickListenerC39742pyA.djBIcL();
        }
    }

    private final void AYXKKw(boolean z) {
        C36246oUr.copydefault().valueOf(z);
        C36312oXc c36312oXc = this.QVAiDq;
        if (c36312oXc != null) {
            c36312oXc.AEQbTJ(z);
        }
    }

    public final void zLjUOn() {
        new android.os.Handler().post(new java.lang.Runnable() { // from class: o.pAl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37771pAb.AuCTelauCTel(this.AEQbTJ);
            }
        });
    }

    public static final void AuCTelauCTel(C37771pAb c37771pAb) {
        C39835pzo c39835pzo = c37771pAb.QOLQEE;
        if (c39835pzo != null) {
            c39835pzo.fullScroll(33);
        }
    }

    private final void gHZMYf() {
        if (getContext() == null) {
            return;
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35964oKf.Fragment.Ufzxmz));
        viewOnClickListenerC54939xaY.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.igXuih), new View.OnClickListener() { // from class: o.pAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C37771pAb.copydefault(this.EZpvd, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C35964oKf.Fragment.dYepVG), (View.OnClickListener) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(C37771pAb c37771pAb, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd().clear();
        drawLineData.EZpvd((java.util.List<DrawLineData.DrawLineItem>) null);
        C36250oUv c36250oUv = c37771pAb.AubY;
        if (c36250oUv != null) {
            c36250oUv.invalidate();
        }
        c37771pAb.AYXKKw(true);
        viewOnClickListenerC54939xaY.dismiss();
        oWN own = C36246oUr.copydefault().DCJXGO().get("ds0");
        Intrinsics.copydefault(own);
        own.AwvSrB();
        drawLineData.EZpvd((DrawLineData.LineType) null);
        ViewOnClickListenerC39746pyE viewOnClickListenerC39746pyE = c37771pAb.getNewProxyInstance;
        if (viewOnClickListenerC39746pyE != null) {
            viewOnClickListenerC39746pyE.AEQbTJ();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void setImageResource(int i) {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = this.AEQbTJ;
        if (viewOnClickListenerC39742pyA != null) {
            viewOnClickListenerC39742pyA.setImageBackground(i);
        }
    }

    @Override // o.InterfaceC39508ptf
    public void ejfBZ() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = this.AEQbTJ;
        if (viewOnClickListenerC39742pyA != null) {
            viewOnClickListenerC39742pyA.gEmmrt();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void AkhnZx() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = this.AEQbTJ;
        if (viewOnClickListenerC39742pyA != null) {
            viewOnClickListenerC39742pyA.copydefault();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void valueOf() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA = this.AEQbTJ;
        if (viewOnClickListenerC39742pyA != null) {
            viewOnClickListenerC39742pyA.setVisibility(8);
        }
        QKVWgx();
    }

    @Override // o.InterfaceC39508ptf
    public void KWHzl(double d, double d2) {
        C39805pzK c39805pzK;
        C39805pzK c39805pzK2 = this.RJOkX;
        if (c39805pzK2 != null) {
            c39805pzK2.setVisibility(0);
        }
        C36250oUv c36250oUv = this.AubY;
        if (c36250oUv == null || (c39805pzK = this.RJOkX) == null) {
            return;
        }
        c39805pzK.setBitmapAndPos(c36250oUv, d, d2);
    }

    @Override // o.InterfaceC39508ptf
    public void fetchVPNInfo() {
        C39805pzK c39805pzK = this.RJOkX;
        if (c39805pzK != null) {
            c39805pzK.setVisibility(8);
        }
    }

    @Override // o.InterfaceC39500ptX
    public void setViewPagerScroll(boolean z) {
        InterfaceC35981oKw interfaceC35981oKw = this.OLrzqt;
        if (interfaceC35981oKw != null) {
            interfaceC35981oKw.copydefault(z);
        }
    }

    @Override // o.pAM
    public void getNewProxyInstance() {
        android.widget.TextView textView = this.aKErDB;
        if (textView != null) {
            textView.setVisibility(pFS.KWHzl.AEQbTJ() ? 0 : 8);
        }
        if (this.AxsJAY) {
            fARcdN();
        }
    }

    @Override // o.pAM
    public void getFieldNames() {
        OLrzqt();
    }

    @Override // o.pAM
    public void AuCTel() {
        LifecycleOwner lifecycleOwner = this.zuBGHE;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this.UeEOUB);
        }
        EZpvd();
    }

    public final void OLrzqt() {
        C36250oUv c36250oUv = this.uzCIH;
        if (c36250oUv != null) {
            c36250oUv.QUSxYX();
        }
        C36250oUv c36250oUv2 = this.uzCIH;
        if (c36250oUv2 != null) {
            c36250oUv2.OLrzqt();
        }
    }

    public final void EZpvd() {
        InterfaceC39563puh.StateListAnimator stateListAnimatorDjBIcL;
        pAR par = this.flVtFt;
        if (par != null && (stateListAnimatorDjBIcL = par.djBIcL()) != null) {
            stateListAnimatorDjBIcL.copydefault();
        }
        C36246oUr.copydefault().OLrzqt();
        C36246oUr.copydefault().isConnected(false);
        C36250oUv c36250oUv = this.uzCIH;
        if (c36250oUv != null) {
            c36250oUv.RcXXUw();
        }
        CoroutineScopeKt.cancel$default(this.fFgQHt, null, 1, null);
        pFN.OLrzqt.OLrzqt();
    }

    public final void setTimeSelectMarginTop(int i) {
        android.widget.LinearLayout linearLayout = this.iwGUEr;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = i;
                linearLayout.setLayoutParams(layoutParams2);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    @Override // o.InterfaceC35977oKs
    public void AEQbTJ(@NotNull java.util.List<C35965oKg> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C35965oKg c35965oKg : list) {
            arrayList.add(new oLY(c35965oKg.copydefault(), c35965oKg.AYXKKw(), c35965oKg.OLrzqt(), c35965oKg.valueOf(), c35965oKg.AEQbTJ(), c35965oKg.EZpvd(), c35965oKg.KWHzl(), c35965oKg.AhwBna(), c35965oKg.values(), c35965oKg.gEmmrt(), c35965oKg.djBIcL()));
        }
        if (this.dxcTrN == 0) {
            C36250oUv c36250oUv = this.AwvSrB;
            if (c36250oUv != null) {
                c36250oUv.AEQbTJ(arrayList);
                return;
            }
            return;
        }
        C36250oUv c36250oUv2 = this.AubY;
        if (c36250oUv2 != null) {
            c36250oUv2.AEQbTJ(arrayList);
        }
    }

    @Override // o.InterfaceC35977oKs
    public void copydefault(@NotNull java.util.List<C35965oKg> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C35965oKg c35965oKg : list) {
            arrayList.add(new oLY(c35965oKg.copydefault(), c35965oKg.AYXKKw(), c35965oKg.OLrzqt(), c35965oKg.valueOf(), c35965oKg.AEQbTJ(), c35965oKg.EZpvd(), c35965oKg.KWHzl(), c35965oKg.AhwBna(), c35965oKg.values(), c35965oKg.gEmmrt(), c35965oKg.djBIcL()));
        }
        if (this.dxcTrN == 0) {
            C36250oUv c36250oUv = this.AwvSrB;
            if (c36250oUv != null) {
                c36250oUv.KWHzl(arrayList);
                return;
            }
            return;
        }
        C36250oUv c36250oUv2 = this.AubY;
        if (c36250oUv2 != null) {
            c36250oUv2.KWHzl(arrayList);
        }
    }
}
