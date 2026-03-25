package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.features.chart.domain.ChartType;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedKLineVM;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMainVM;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC28224kTm;
import o.C23274hvD;
import o.C30681lfj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.leX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30616leX extends AbstractC30684lfm<C21662hHr> implements InterfaceC25990jNw, C30681lfj.Application {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public Function0<Unit> AEQbTJ;
    public Function1<? super java.lang.Boolean, Unit> EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public ChartType copydefault;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.leX$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

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
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21662hHr copydefault(C30616leX c30616leX) {
        return (C21662hHr) c30616leX.fARcdN();
    }

    public C30616leX() {
        final Function0 function0 = new Function0() { // from class: o.leW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30616leX.djBIcL(this.OLrzqt);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.cefi.kline.AdvancedChartViewFragment$special$$inlined$viewModels$default$1
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedMainVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.kline.AdvancedChartViewFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.kline.AdvancedChartViewFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.kline.AdvancedChartViewFragment$special$$inlined$viewModels$default$4
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.cefi.kline.AdvancedChartViewFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.cefi.kline.AdvancedChartViewFragment$special$$inlined$viewModels$default$6
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedKLineVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.kline.AdvancedChartViewFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.kline.AdvancedChartViewFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.kline.AdvancedChartViewFragment$special$$inlined$viewModels$default$9
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
        AdvancedLimitBy.Activity activity = AdvancedLimitBy.Companion;
        java.lang.Integer num = SPUtils.getInt("key_dex_advanced_limit_by", AdvancedLimitBy.Price.getValue(), "dex_trading_local_config");
        Intrinsics.checkNotNullExpressionValue(num, "");
        this.copydefault = activity.KWHzl(activity.OLrzqt(num.intValue()));
    }

    /* JADX INFO: renamed from: o.leX$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.leX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.leX$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C30616leX newInstance$default(StateListAnimator stateListAnimator, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            return stateListAnimator.KWHzl(function0);
        }

        public final C30616leX KWHzl(Function0<Unit> function0) {
            C30616leX c30616leX = new C30616leX();
            c30616leX.AEQbTJ = function0;
            return c30616leX;
        }
    }

    public static final ViewModelStoreOwner djBIcL(C30616leX c30616leX) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c30616leX.requireParentFragment().requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX DEBUG: Possible override for method o.lfm.AEQbTJ()V */
    public final AdvancedMainVM AEQbTJ() {
        return (AdvancedMainVM) this.OLrzqt.getValue();
    }

    public final AdvancedKLineVM EZpvd() {
        return (AdvancedKLineVM) this.valueOf.getValue();
    }

    public final void OLrzqt(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (isAdded()) {
            pUU.KWHzl(getTAG(), "setHideKLineCallback");
            this.AEQbTJ = function0;
        }
    }

    public final void copydefault(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (isAdded()) {
            pUU.KWHzl(getTAG(), "setHideKLineCallback");
            this.EZpvd = function1;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C21662hHr OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21662hHr c21662hHrCopydefault = C21662hHr.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21662hHrCopydefault, "");
        return c21662hHrCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    public void OLrzqt(@NotNull C21662hHr c21662hHr, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21662hHr, "");
        C30681lfj c30681lfj = c21662hHr.AEQbTJ;
        c30681lfj.setCallback$OKDex_dex_impl(this);
        android.widget.TextView textViewEZpvd = c30681lfj.EZpvd();
        if (textViewEZpvd != null) {
            textViewEZpvd.setText(copydefault(this.copydefault));
        }
        AEQbTJ().KWHzl(this.copydefault);
        android.widget.LinearLayout linearLayoutKWHzl = c30681lfj.KWHzl();
        if (linearLayoutKWHzl != null) {
            linearLayoutKWHzl.setOnClickListener(new TaskDescription(linearLayoutKWHzl, 1000L, this));
        }
        android.widget.LinearLayout linearLayoutDjBIcL = c30681lfj.djBIcL();
        if (linearLayoutDjBIcL != null) {
            linearLayoutDjBIcL.setOnClickListener(new Application(linearLayoutDjBIcL, 1000L, this));
        }
        valueOf();
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.lfa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C30616leX.AYXKKw(this.copydefault);
                }
            });
        }
    }

    public static final void AYXKKw(C30616leX c30616leX) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c30616leX, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC25990jNw
    public void OLrzqt(@NotNull ChartType chartType) {
        C30681lfj c30681lfj;
        Intrinsics.checkNotNullParameter(chartType, "");
        if (chartType == this.copydefault) {
            return;
        }
        AEQbTJ().KWHzl(chartType);
        EZpvd().KWHzl(chartType);
        gEmmrt();
        this.copydefault = chartType;
        C21662hHr c21662hHr = (C21662hHr) fARcdN();
        if (c21662hHr == null || (c30681lfj = c21662hHr.AEQbTJ) == null) {
            return;
        }
        android.widget.TextView textViewEZpvd = c30681lfj.EZpvd();
        if (textViewEZpvd != null) {
            textViewEZpvd.setText(copydefault(chartType));
        }
        c30681lfj.OLrzqt(chartType);
        c30681lfj.EZpvd(c30681lfj.AEQbTJ());
    }

    @Override // o.C30681lfj.Application
    public void AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().KWHzl(str, str2);
    }

    @Override // o.C30681lfj.Application
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().OLrzqt(str);
    }

    @Override // o.C30681lfj.Application
    public void OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().copydefault(str, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        C30681lfj c30681lfj;
        super.onStart();
        gEmmrt();
        C21662hHr c21662hHr = (C21662hHr) fARcdN();
        if (c21662hHr == null || (c30681lfj = c21662hHr.AEQbTJ) == null) {
            return;
        }
        c30681lfj.fetchVPNInfo();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        EZpvd().gEmmrt();
        super.onStop();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C30681lfj c30681lfj;
        EZpvd().gEmmrt();
        C21662hHr c21662hHr = (C21662hHr) fARcdN();
        if (c21662hHr != null && (c30681lfj = c21662hHr.AEQbTJ) != null) {
            c30681lfj.setCallback$OKDex_dex_impl(null);
            C36250oUv c36250oUvAEQbTJ = c30681lfj.AEQbTJ();
            if (c36250oUvAEQbTJ != null) {
                c36250oUvAEQbTJ.RcXXUw();
                c36250oUvAEQbTJ.copydefault();
                c36250oUvAEQbTJ.OLrzqt();
                c36250oUvAEQbTJ.setActionListener(null);
                c36250oUvAEQbTJ.setLoadHistoryKlineListener(null);
                c36250oUvAEQbTJ.setChartSelectionListener(null);
                ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUvAEQbTJ.AkhnZx();
                if (chartViewOutSideConfigAkhnZx != null) {
                    chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(false);
                }
            }
        }
        super.onDestroyView();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        C30681lfj c30681lfj;
        C36250oUv c36250oUvAEQbTJ;
        com.okinc.kline.library.data.DataSource dataSource;
        C21662hHr c21662hHr = (C21662hHr) fARcdN();
        if (c21662hHr != null && (c30681lfj = c21662hHr.AEQbTJ) != null && (c36250oUvAEQbTJ = c30681lfj.AEQbTJ()) != null) {
            java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ = c36250oUvAEQbTJ.ejfBZ();
            if (mapEjfBZ != null && (dataSource = mapEjfBZ.get(c36250oUvAEQbTJ.fIwbmz())) != null) {
                dataSource.KWHzl();
            }
            c36250oUvAEQbTJ.RcXXUw();
            c36250oUvAEQbTJ.copydefault();
        }
        C36246oUr.copydefault().valueOf();
        C36246oUr.copydefault().AubY(false);
    }

    /* JADX INFO: renamed from: o.leX$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super Unit> continuation) {
            C30616leX.this.EZpvd().EZpvd(dexMultiTokenInfoBean);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.leX$LoaderManager */
    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28200kSp c28200kSp, Continuation<? super Unit> continuation) {
            C30616leX.this.copydefault(c28200kSp);
            return Unit.INSTANCE;
        }
    }

    private final void valueOf() {
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().AEQbTJ(), null, new Activity(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().AhwBna(), null, new LoaderManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, EZpvd().EZpvd(), null, new Dialog(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, EZpvd().KWHzl(), null, new FragmentManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, EZpvd().OLrzqt(), null, new PendingIntent(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, EZpvd().copydefault(), null, new Fragment(), 2, null);
    }

    /* JADX INFO: renamed from: o.leX$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC28224kTm abstractC28224kTm, Continuation<? super Unit> continuation) {
            C21662hHr c21662hHrCopydefault = C30616leX.copydefault(C30616leX.this);
            if (c21662hHrCopydefault != null) {
                C30616leX.this.KWHzl(c21662hHrCopydefault, abstractC28224kTm);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.leX$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<HistoryOrderData> list, Continuation<? super Unit> continuation) {
            C30681lfj c30681lfj;
            C21662hHr c21662hHrCopydefault = C30616leX.copydefault(C30616leX.this);
            if (c21662hHrCopydefault != null && (c30681lfj = c21662hHrCopydefault.AEQbTJ) != null) {
                c30681lfj.OLrzqt(list, true);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.leX$PendingIntent */
    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.HashMap<java.lang.String, HistoryOrderData> map, Continuation<? super Unit> continuation) {
            C36250oUv c36250oUv;
            java.lang.String strGEmmrt;
            C21662hHr c21662hHrCopydefault;
            C30681lfj c30681lfj;
            C21662hHr c21662hHrCopydefault2 = C30616leX.copydefault(C30616leX.this);
            if (c21662hHrCopydefault2 != null && (c36250oUv = c21662hHrCopydefault2.KWHzl) != null && (strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(c36250oUv.getFieldNames()))) != null) {
                C30616leX c30616leX = C30616leX.this;
                if ((!map.isEmpty()) && map.containsKey(strGEmmrt) && (c21662hHrCopydefault = C30616leX.copydefault(c30616leX)) != null && (c30681lfj = c21662hHrCopydefault.AEQbTJ) != null) {
                    HistoryOrderData historyOrderData = map.get(strGEmmrt);
                    Intrinsics.copydefault(historyOrderData);
                    c30681lfj.OLrzqt(C56402yEa.EZpvd(historyOrderData), false);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.leX$Fragment */
    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<? extends oUO> list, Continuation<? super Unit> continuation) {
            C30681lfj c30681lfj;
            C30681lfj c30681lfj2;
            C21662hHr c21662hHrCopydefault = C30616leX.copydefault(C30616leX.this);
            if (c21662hHrCopydefault != null && (c30681lfj2 = c21662hHrCopydefault.AEQbTJ) != null) {
                c30681lfj2.OLrzqt(list);
            }
            C21662hHr c21662hHrCopydefault2 = C30616leX.copydefault(C30616leX.this);
            if (c21662hHrCopydefault2 != null && (c30681lfj = c21662hHrCopydefault2.AEQbTJ) != null) {
                c30681lfj.OLrzqt(C30616leX.this.EZpvd().KWHzl().getValue(), false);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.leX$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C30616leX KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C30616leX c30616leX) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c30616leX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0 function0 = this.KWHzl.AEQbTJ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.leX$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C30616leX copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C30616leX c30616leX) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c30616leX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C25984jNq c25984jNqCopydefault = C25984jNq.Companion.copydefault(this.copydefault.copydefault);
                androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c25984jNqCopydefault.show(childFragmentManager);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(C28200kSp c28200kSp) {
        C30681lfj c30681lfj;
        C30681lfj c30681lfj2;
        C21662hHr c21662hHr = (C21662hHr) fARcdN();
        if (c21662hHr == null || (c30681lfj2 = c21662hHr.AEQbTJ) == null || c30681lfj2.getVisibility() == 0) {
            DexMultiTokenInfoBean value = AEQbTJ().AEQbTJ().getValue();
            EZpvd().EZpvd(value);
            EZpvd().AEQbTJ(c28200kSp);
            C21662hHr c21662hHr2 = (C21662hHr) fARcdN();
            if (c21662hHr2 != null && (c30681lfj = c21662hHr2.AEQbTJ) != null) {
                c30681lfj.setTokenData(value, c28200kSp);
            }
            if (c28200kSp == null || c28200kSp.KWHzl()) {
                return;
            }
            OLrzqt(ChartType.PRICE);
        }
    }

    public final void KWHzl(C21662hHr c21662hHr, AbstractC28224kTm abstractC28224kTm) {
        Function1<? super java.lang.Boolean, Unit> function1 = this.EZpvd;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(abstractC28224kTm instanceof AbstractC28224kTm.Activity));
        }
        OLrzqt(c21662hHr, abstractC28224kTm);
        if (abstractC28224kTm instanceof AbstractC28224kTm.Application) {
            AbstractC28224kTm.Application application = (AbstractC28224kTm.Application) abstractC28224kTm;
            c21662hHr.AEQbTJ.copydefault(application.copydefault(), application.EZpvd());
        }
    }

    public final void OLrzqt(final C21662hHr c21662hHr, AbstractC28224kTm abstractC28224kTm) {
        C55173xeu c55173xeu = c21662hHr.OLrzqt;
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        boolean z = abstractC28224kTm instanceof AbstractC28224kTm.StateListAnimator;
        c55173xeu.setVisibility(z ? 0 : 8);
        if (z) {
            C55173xeu c55173xeu2 = c21662hHr.OLrzqt;
            AbstractC28224kTm.StateListAnimator stateListAnimator = (AbstractC28224kTm.StateListAnimator) abstractC28224kTm;
            java.lang.String string = stateListAnimator.KWHzl() ? getString(C23274hvD.Fragment.addOnConfigurationChangedListener) : getString(C23274hvD.Fragment.RbMRq);
            Intrinsics.copydefault((java.lang.Object) string);
            c55173xeu2.setSubTitle((java.lang.CharSequence) string);
            c55173xeu2.setEmptyTypeImage(stateListAnimator.KWHzl() ? 6 : 8);
            if (!stateListAnimator.KWHzl()) {
                java.lang.String string2 = getString(C23274hvD.Fragment.EZpvd);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                str = string2;
            }
            c55173xeu2.setRetry(str);
            c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.leZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30616leX.OLrzqt(c21662hHr, view);
                }
            });
        }
    }

    public static final void OLrzqt(C21662hHr c21662hHr, android.view.View view) {
        c21662hHr.AEQbTJ.fetchVPNInfo();
    }

    public final java.lang.String copydefault(ChartType chartType) {
        int i;
        int i2 = ActionBar.OLrzqt[chartType.ordinal()];
        if (i2 == 1) {
            i = C23274hvD.Fragment.build;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23274hvD.Fragment.getDescription;
        }
        java.lang.String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
