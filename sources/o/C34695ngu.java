package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.dexkline.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.dexkline.market.features.chart.domain.ChartType;
import com.okinc.dexkline.trade.features.home.advanced.viewmodel.AdvancedKLineVM;
import com.okinc.dexkline.trade.features.home.advanced.viewmodel.AdvancedMainVM;
import com.okinc.dexkline.trade.features.home.ui.cefi.kline.AdvancedKLineFragment$initView$1;
import com.okinc.dexkline.trade.features.home.ui.cefi.kline.AdvancedKLineFragment$refreshChartType$1;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.dex.biz.OKTDexBaseTokenModel;
import com.okinc.unify_trade.dex.biz.OKTDexCacheConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC34688ngn;
import o.C32392mcI;
import o.C34698ngx;
import o.C35964oKf;
import o.C35966oKh;
import o.C36250oUv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ngu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34695ngu extends AbstractC34649ngA<oOV> implements InterfaceC32287mWk, C34698ngx.ActionBar {
    public final InterfaceC56387yDm AYXKKw;
    public ChartType AhwBna;
    public Observer<ParamBuilder> EZpvd;
    public boolean KWHzl;
    public C56132xwz djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.ngu$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChartType.values().length];
            try {
                iArr[ChartType.PRICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChartType.MARKET_CAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ oOV copydefault(C34695ngu c34695ngu) {
        return (oOV) c34695ngu.KWHzl();
    }

    public C34695ngu() {
        final Function0 function0 = new Function0() { // from class: o.ngq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34695ngu.AhwBna(this.copydefault);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.trade.features.home.ui.cefi.kline.AdvancedKLineFragment$special$$inlined$viewModels$default$1
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedMainVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.trade.features.home.ui.cefi.kline.AdvancedKLineFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.trade.features.home.ui.cefi.kline.AdvancedKLineFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.trade.features.home.ui.cefi.kline.AdvancedKLineFragment$special$$inlined$viewModels$default$4
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
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.dexkline.trade.features.home.ui.cefi.kline.AdvancedKLineFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.trade.features.home.ui.cefi.kline.AdvancedKLineFragment$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedKLineVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.trade.features.home.ui.cefi.kline.AdvancedKLineFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.trade.features.home.ui.cefi.kline.AdvancedKLineFragment$special$$inlined$viewModels$default$8
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.trade.features.home.ui.cefi.kline.AdvancedKLineFragment$special$$inlined$viewModels$default$9
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AhwBna = ChartType.PRICE;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ngs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34695ngu.OLrzqt();
            }
        });
        this.EZpvd = new Observer() { // from class: o.ngw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C34695ngu.EZpvd(this.KWHzl, (ParamBuilder) obj);
            }
        };
    }

    /* JADX INFO: renamed from: o.ngu$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ngu.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C34695ngu newInstance$default(Activity activity, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return activity.EZpvd(z);
        }

        public final C34695ngu EZpvd(boolean z) {
            C34695ngu c34695ngu = new C34695ngu();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("kline_is_hide_text", z);
            c34695ngu.setArguments(bundle);
            return c34695ngu;
        }
    }

    public static final ViewModelStoreOwner AhwBna(C34695ngu c34695ngu) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c34695ngu.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final AdvancedMainVM AYXKKw() {
        return (AdvancedMainVM) this.valueOf.getValue();
    }

    public final AdvancedKLineVM djBIcL() {
        return (AdvancedKLineVM) this.gEmmrt.getValue();
    }

    public final xHE AhwBna() {
        return (xHE) this.AYXKKw.getValue();
    }

    public static final xHE OLrzqt() {
        return new xHE(OKTDexCacheConfig.DefaultDexCacheConfig.KWHzl);
    }

    public static final void EZpvd(C34695ngu c34695ngu, ParamBuilder paramBuilder) {
        c34695ngu.valueOf();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.mUE
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public oOV AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        oOV oovAEQbTJ = oOV.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(oovAEQbTJ, "");
        return oovAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.mUE
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull oOV oov, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(oov, "");
        android.os.Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("kline_is_hide_text") : false;
        this.KWHzl = z;
        if (z) {
            AuCTel();
        }
        mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AdvancedKLineFragment$initView$1(this, oov, null), 3, null);
        oov.EZpvd.setChartSelectionListener(new StateListAnimator());
    }

    /* JADX INFO: renamed from: o.ngu$StateListAnimator */
    public static final class StateListAnimator implements C36250oUv.ActionBar {
        @Override // o.C36250oUv.ActionBar
        public void EZpvd(java.lang.String str) {
        }

        @Override // o.C36250oUv.ActionBar
        public void aI_() {
            C55489xks.startVibratorIfCan$default(0L, 1, null);
        }
    }

    public final void gEmmrt() {
        DexInstrument dexInstrumentAEQbTJ = AhwBna().AEQbTJ();
        if (dexInstrumentAEQbTJ != null) {
            mRG.OLrzqt(dexInstrumentAEQbTJ.getTokenContractAddress(), dexInstrumentAEQbTJ.getTokenSymbol(), dexInstrumentAEQbTJ.getChainId(), dexInstrumentAEQbTJ.getChainName(), this.AhwBna == ChartType.PRICE ? FirebaseAnalytics.Param.PRICE : "mcap");
        }
    }

    public final void OLrzqt(C34698ngx c34698ngx) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AdvancedKLineFragment$refreshChartType$1(this, c34698ngx, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.mUE, o.AbstractC32998moE
    public void onVisible() {
        C34698ngx c34698ngx;
        C34698ngx c34698ngx2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        fIwbmz();
        oOV oov = (oOV) KWHzl();
        if (oov == null || (c34698ngx = oov.KWHzl) == null) {
            return;
        }
        C36250oUv c36250oUvEZpvd = c34698ngx.EZpvd();
        if (c36250oUvEZpvd == null || (chartViewOutSideConfigAkhnZx = c36250oUvEZpvd.AkhnZx()) == null || chartViewOutSideConfigAkhnZx.getChartMode() != 2) {
            pGX pgxDjBIcL = c34698ngx.djBIcL();
            if (pgxDjBIcL != null) {
                pgxDjBIcL.setData();
            }
            oOV oov2 = (oOV) KWHzl();
            if (oov2 != null && (c34698ngx2 = oov2.KWHzl) != null) {
                OLrzqt(c34698ngx2);
            }
        }
        c34698ngx.AYXKKw();
    }

    @Override // o.mUE, o.AbstractC32998moE
    public void onInvisible() {
        djBIcL().valueOf();
    }

    public final void valueOf() {
        java.lang.String strIsNativeToken;
        java.lang.String strKWHzl = AhwBna().KWHzl();
        java.lang.String str = strKWHzl == null ? "" : strKWHzl;
        java.lang.String strEZpvd = AhwBna().EZpvd();
        java.lang.String str2 = strEZpvd == null ? "" : strEZpvd;
        OKTDexBaseTokenModel oKTDexBaseTokenModelOLrzqt = AhwBna().OLrzqt();
        if (oKTDexBaseTokenModelOLrzqt == null || (strIsNativeToken = oKTDexBaseTokenModelOLrzqt.isNativeToken()) == null) {
            strIsNativeToken = "0";
        }
        AYXKKw().KWHzl(new DexMultiTokenInfoBean((java.lang.String) null, str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, strIsNativeToken, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, -1091, 33554431, (DefaultConstructorMarker) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC32287mWk
    public void AEQbTJ(@NotNull ChartType chartType) {
        C34698ngx c34698ngx;
        Intrinsics.checkNotNullParameter(chartType, "");
        if (chartType == this.AhwBna) {
            return;
        }
        djBIcL().copydefault(chartType);
        fIwbmz();
        this.AhwBna = chartType;
        oOV oov = (oOV) KWHzl();
        if (oov == null || (c34698ngx = oov.KWHzl) == null) {
            return;
        }
        android.widget.TextView textViewAEQbTJ = c34698ngx.AEQbTJ();
        if (textViewAEQbTJ != null) {
            textViewAEQbTJ.setText(OLrzqt(chartType));
        }
        c34698ngx.copydefault(c34698ngx.EZpvd());
        c34698ngx.KWHzl(chartType);
    }

    @Override // o.C34698ngx.ActionBar
    public void KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        djBIcL().copydefault(str, str2);
    }

    @Override // o.C34698ngx.ActionBar
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        djBIcL().KWHzl(str);
    }

    @Override // o.C34698ngx.ActionBar
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        djBIcL().KWHzl(str, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.mUE, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C34698ngx c34698ngx;
        C56111xwe<ParamBuilder> c56111xweValues;
        C56132xwz c56132xwz = this.djBIcL;
        if (c56132xwz != null && (c56111xweValues = c56132xwz.values()) != null) {
            c56111xweValues.removeObserver(this.EZpvd);
        }
        djBIcL().valueOf();
        oOV oov = (oOV) KWHzl();
        if (oov != null && (c34698ngx = oov.KWHzl) != null) {
            c34698ngx.setCallback$OKKLine_kline_impl(null);
            C36250oUv c36250oUvEZpvd = c34698ngx.EZpvd();
            if (c36250oUvEZpvd != null) {
                c36250oUvEZpvd.RcXXUw();
                c36250oUvEZpvd.copydefault();
                c36250oUvEZpvd.OLrzqt();
                c36250oUvEZpvd.setActionListener(null);
                c36250oUvEZpvd.setLoadHistoryKlineListener(null);
                c36250oUvEZpvd.setChartSelectionListener(null);
                ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUvEZpvd.AkhnZx();
                if (chartViewOutSideConfigAkhnZx != null) {
                    chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(false);
                }
            }
        }
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: o.ngu$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super Unit> continuation) {
            C34695ngu.this.djBIcL().OLrzqt(dexMultiTokenInfoBean);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ejfBZ() {
        C56126xwt<Unit> c56126xwtFJNWhG;
        C56111xwe<ParamBuilder> c56111xweValues;
        mUN.collectOnViewLifecycle$default(this, AYXKKw().EZpvd(), null, new Application(), 2, null);
        mUN.collectOnViewLifecycle$default(this, djBIcL().AYXKKw(), null, new ActionBar(), 2, null);
        mUN.collectOnViewLifecycle$default(this, djBIcL().EZpvd(), null, new Dialog(), 2, null);
        mUN.collectOnViewLifecycle$default(this, djBIcL().copydefault(), null, new Fragment(), 2, null);
        mUN.collectOnViewLifecycle$default(this, djBIcL().OLrzqt(), null, new PendingIntent(), 2, null);
        C56132xwz c56132xwz = this.djBIcL;
        if (c56132xwz != null && (c56111xweValues = c56132xwz.values()) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            c56111xweValues.observe(viewLifecycleOwner, this.EZpvd);
        }
        C56132xwz c56132xwz2 = this.djBIcL;
        if (c56132xwz2 == null || (c56126xwtFJNWhG = c56132xwz2.fJNWhG()) == null) {
            return;
        }
        c56126xwtFJNWhG.AEQbTJ(this, new Function1() { // from class: o.ngt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34695ngu.AEQbTJ(this.copydefault, (Unit) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.ngu$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC34688ngn abstractC34688ngn, Continuation<? super Unit> continuation) {
            oOV oovCopydefault = C34695ngu.copydefault(C34695ngu.this);
            if (oovCopydefault != null) {
                C34695ngu.this.copydefault(oovCopydefault, abstractC34688ngn);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.ngu$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<HistoryOrderData> list, Continuation<? super Unit> continuation) {
            C34698ngx c34698ngx;
            oOV oovCopydefault = C34695ngu.copydefault(C34695ngu.this);
            if (oovCopydefault != null && (c34698ngx = oovCopydefault.KWHzl) != null) {
                c34698ngx.OLrzqt(list, true);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.ngu$Fragment */
    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.HashMap<java.lang.String, HistoryOrderData> map, Continuation<? super Unit> continuation) {
            C36250oUv c36250oUv;
            java.lang.String strGEmmrt;
            oOV oovCopydefault;
            C34698ngx c34698ngx;
            oOV oovCopydefault2 = C34695ngu.copydefault(C34695ngu.this);
            if (oovCopydefault2 != null && (c36250oUv = oovCopydefault2.EZpvd) != null && (strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(c36250oUv.getFieldNames()))) != null) {
                C34695ngu c34695ngu = C34695ngu.this;
                if ((!map.isEmpty()) && map.containsKey(strGEmmrt) && (oovCopydefault = C34695ngu.copydefault(c34695ngu)) != null && (c34698ngx = oovCopydefault.KWHzl) != null) {
                    HistoryOrderData historyOrderData = map.get(strGEmmrt);
                    Intrinsics.copydefault(historyOrderData);
                    c34698ngx.OLrzqt(C56402yEa.EZpvd(historyOrderData), false);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.ngu$PendingIntent */
    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<? extends oUO> list, Continuation<? super Unit> continuation) {
            C34698ngx c34698ngx;
            C34698ngx c34698ngx2;
            oOV oovCopydefault = C34695ngu.copydefault(C34695ngu.this);
            if (oovCopydefault != null && (c34698ngx2 = oovCopydefault.KWHzl) != null) {
                c34698ngx2.OLrzqt(list);
            }
            oOV oovCopydefault2 = C34695ngu.copydefault(C34695ngu.this);
            if (oovCopydefault2 != null && (c34698ngx = oovCopydefault2.KWHzl) != null) {
                c34698ngx.OLrzqt(C34695ngu.this.djBIcL().EZpvd().getValue(), false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit AEQbTJ(C34695ngu c34695ngu, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        c34695ngu.valueOf();
        return Unit.INSTANCE;
    }

    public final void copydefault(oOV oov, AbstractC34688ngn abstractC34688ngn) {
        copydefault(abstractC34688ngn instanceof AbstractC34688ngn.TaskDescription);
        EZpvd(oov, abstractC34688ngn);
        if (abstractC34688ngn instanceof AbstractC34688ngn.Application) {
            AbstractC34688ngn.Application application = (AbstractC34688ngn.Application) abstractC34688ngn;
            oov.KWHzl.setTokenData(djBIcL().KWHzl().getValue(), application.KWHzl());
            C34679nge c34679ngeKWHzl = application.KWHzl();
            if (c34679ngeKWHzl != null && !c34679ngeKWHzl.KWHzl()) {
                AEQbTJ(ChartType.PRICE);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (abstractC34688ngn instanceof AbstractC34688ngn.Activity) {
            AbstractC34688ngn.Activity activity = (AbstractC34688ngn.Activity) abstractC34688ngn;
            oov.KWHzl.KWHzl(activity.AEQbTJ(), activity.copydefault());
        } else if (abstractC34688ngn instanceof AbstractC34688ngn.StateListAnimator) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public final void EZpvd(final oOV oov, AbstractC34688ngn abstractC34688ngn) {
        C55173xeu c55173xeu = oov.AEQbTJ;
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        boolean z = abstractC34688ngn instanceof AbstractC34688ngn.StateListAnimator;
        c55173xeu.setVisibility(z ? 0 : 8);
        android.widget.FrameLayout frameLayout = oov.djBIcL;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(z ? 0 : 8);
        if (z) {
            C55173xeu c55173xeu2 = oov.AEQbTJ;
            AbstractC34688ngn.StateListAnimator stateListAnimator = (AbstractC34688ngn.StateListAnimator) abstractC34688ngn;
            java.lang.String string = stateListAnimator.AEQbTJ() ? getString(C32392mcI.Dialog.hlkKmr) : getString(C35966oKh.TaskDescription.djBIcL);
            Intrinsics.copydefault((java.lang.Object) string);
            c55173xeu2.setSubTitle((java.lang.CharSequence) string);
            c55173xeu2.setEmptyTypeImage(stateListAnimator.AEQbTJ() ? 6 : 8);
            if (!stateListAnimator.AEQbTJ()) {
                java.lang.String string2 = getString(C35964oKf.Fragment.AwvSrB);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                str = string2;
            }
            c55173xeu2.setRetry(str);
            c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.ngr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C34695ngu.copydefault(oov, view);
                }
            });
        }
    }

    public static final void copydefault(oOV oov, android.view.View view) {
        oov.KWHzl.AYXKKw();
    }

    public final java.lang.String OLrzqt(ChartType chartType) {
        int i;
        int i2 = TaskDescription.KWHzl[chartType.ordinal()];
        if (i2 == 1) {
            i = C35964oKf.Fragment.DMb;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C35964oKf.Fragment.zpGcln;
        }
        java.lang.String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final void copydefault(boolean z) {
        if (z) {
            fARcdN();
        } else {
            DbNXlk();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fARcdN() {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        ConstraintLayout constraintLayout;
        oOV oov = (oOV) KWHzl();
        if (oov != null && (constraintLayout = oov.OLrzqt) != null) {
            constraintLayout.setVisibility(0);
        }
        oOV oov2 = (oOV) KWHzl();
        if (oov2 != null && (lottieAnimationView2 = oov2.copydefault) != null) {
            lottieAnimationView2.setAnimation(AkhnZx());
        }
        oOV oov3 = (oOV) KWHzl();
        if (oov3 == null || (lottieAnimationView = oov3.copydefault) == null) {
            return;
        }
        lottieAnimationView.playAnimation();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DbNXlk() {
        ConstraintLayout constraintLayout;
        LottieAnimationView lottieAnimationView;
        ConstraintLayout constraintLayout2;
        oOV oov = (oOV) KWHzl();
        if (oov == null || (constraintLayout = oov.OLrzqt) == null || constraintLayout.getVisibility() != 0) {
            return;
        }
        oOV oov2 = (oOV) KWHzl();
        if (oov2 != null && (constraintLayout2 = oov2.OLrzqt) != null) {
            constraintLayout2.setVisibility(8);
        }
        oOV oov3 = (oOV) KWHzl();
        if (oov3 == null || (lottieAnimationView = oov3.copydefault) == null) {
            return;
        }
        lottieAnimationView.cancelAnimation();
    }

    private final java.lang.String AkhnZx() {
        return C33492mxV.OLrzqt() ? "kline_trade_header_dark.lottie" : "kline_trade_header_light.lottie";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fIwbmz() {
        C34698ngx c34698ngx;
        C36250oUv c36250oUvEZpvd;
        com.okinc.kline.library.data.DataSource dataSource;
        oOV oov = (oOV) KWHzl();
        if (oov != null && (c34698ngx = oov.KWHzl) != null && (c36250oUvEZpvd = c34698ngx.EZpvd()) != null) {
            java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ = c36250oUvEZpvd.ejfBZ();
            if (mapEjfBZ != null && (dataSource = mapEjfBZ.get(c36250oUvEZpvd.fIwbmz())) != null) {
                dataSource.KWHzl();
            }
            c36250oUvEZpvd.RcXXUw();
            c36250oUvEZpvd.copydefault();
        }
        C36246oUr.copydefault().valueOf();
        C36246oUr.copydefault().AubY(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AuCTel() {
        C34698ngx c34698ngx;
        oOV oov = (oOV) KWHzl();
        if (oov == null || (c34698ngx = oov.KWHzl) == null) {
            return;
        }
        android.widget.TextView textViewGEmmrt = c34698ngx.gEmmrt();
        if (textViewGEmmrt != null) {
            textViewGEmmrt.setVisibility(8);
        }
        android.widget.ImageView imageViewKWHzl = c34698ngx.KWHzl();
        if (imageViewKWHzl != null) {
            imageViewKWHzl.setRotation(180.0f);
        }
    }
}
