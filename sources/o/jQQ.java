package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.NonScrollableLinearLayoutManager;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.data.domain.type.DataTabType;
import com.okinc.business.market.features.data.ui.CoinDetailDataFragment$redirectTo$1$1;
import com.okinc.business.market.features.data.ui.CoinDetailDataViewModel;
import com.okinc.business.market.features.data.ui.holder.DataHolderViewModel;
import com.okinc.business.market.features.data.ui.holder.HolderTimeframe;
import com.okinc.business.market.features.data.ui.liquidity.DataLiquidityPoolViewModel;
import com.okinc.business.market.features.overview.ui.OverviewViewModel;
import com.okinc.business.market.features.token_detail.RealtimeDataViewModel;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C23274hvD;
import o.C52761wXj;
import o.jQQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class jQQ extends jQY implements InterfaceC26087jRl {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public C26077jRb AEQbTJ;
    public java.lang.Integer AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public C23505hzW EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HolderTimeframe.values().length];
            try {
                iArr[HolderTimeframe.DAILY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[HolderTimeframe.WEEKLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23505hzW AEQbTJ() {
        return this.EZpvd;
    }

    public jQQ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CoinDetailDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$7
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DataHolderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$10
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
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$11
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DataLiquidityPoolViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$13
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$14
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
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$15
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RealtimeDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$activityViewModels$default$5
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
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$activityViewModels$default$6
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$activityViewModels$default$8
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
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.data.ui.CoinDetailDataFragment$special$$inlined$activityViewModels$default$9
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

    public final CoinDetailDataViewModel AYXKKw() {
        return (CoinDetailDataViewModel) this.djBIcL.getValue();
    }

    private final MarketCoinDetailViewModel fIwbmz() {
        return (MarketCoinDetailViewModel) this.valueOf.getValue();
    }

    public final DataHolderViewModel EZpvd() {
        return (DataHolderViewModel) this.KWHzl.getValue();
    }

    /* JADX DEBUG: Possible override for method o.jQY.OLrzqt()V */
    public final DataLiquidityPoolViewModel OLrzqt() {
        return (DataLiquidityPoolViewModel) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RealtimeDataViewModel AuCTel() {
        return (RealtimeDataViewModel) this.gEmmrt.getValue();
    }

    private final OverviewViewModel fARcdN() {
        return (OverviewViewModel) this.AhwBna.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C23505hzW c23505hzWEZpvd = C23505hzW.EZpvd(getLayoutInflater(), viewGroup, false);
        this.EZpvd = c23505hzWEZpvd;
        if (c23505hzWEZpvd != null) {
            return c23505hzWEZpvd.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ejfBZ();
        AhwBna();
        DbNXlk();
        fJNWhG();
        djBIcL();
        gEmmrt();
        AkhnZx();
        CoinDetailDataViewModel.loadAllData$default(AYXKKw(), false, false, 3, null);
        KWHzl();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (OLrzqt().OLrzqt().getValue().EZpvd() != null) {
            AuCTel().AEQbTJ(AYXKKw().valueOf().getChainId(), AYXKKw().valueOf().getTokenContractAddress());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AuCTel().KWHzl();
    }

    private final void ejfBZ() {
        C23505hzW c23505hzW = this.EZpvd;
        if (c23505hzW != null) {
            c23505hzW.hDKMBd.AhwBna(false);
            c23505hzW.hDKMBd.OLrzqt(new InterfaceC57903yrG() { // from class: o.jQR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    jQQ.KWHzl(this.EZpvd, interfaceC57934yrl);
                }
            });
            OKAlertBanner oKAlertBanner = c23505hzW.copydefault;
            int i = C52761wXj.TaskDescription.GGlJim;
            android.content.Context context = oKAlertBanner.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            oKAlertBanner.setLeadingIcon(C33070mpX.EZpvd(i, context));
            Intrinsics.copydefault(oKAlertBanner);
            oKAlertBanner.setVisibility(8);
        }
    }

    public static final void KWHzl(jQQ jqq, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        CoinDetailDataViewModel.loadAllData$default(jqq.AYXKKw(), false, true, 1, null);
    }

    public final void AhwBna() {
        C23505hzW c23505hzW = this.EZpvd;
        if (c23505hzW != null) {
            wYC wyc = c23505hzW.fJNWhG;
            wyc.setOnClickListener(new LoaderManager(wyc, 1000L, this));
            wYC wyc2 = c23505hzW.AuCTel;
            wyc2.setOnClickListener(new TaskStackBuilder(wyc2, 1000L, this));
            wYC wyc3 = c23505hzW.ejfBZ;
            wyc3.setOnClickListener(new SharedElementCallback(wyc3, 1000L, this));
            wYC wyc4 = c23505hzW.AkhnZx;
            wyc4.setOnClickListener(new VoiceInteractor(wyc4, 1000L, this));
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ jQQ AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, jQQ jqq) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = jqq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.getContext();
                if (context != null) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.newSession));
                    viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.ArkbYM));
                    viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.buildRccMetadata, new PendingIntent(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ jQQ OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, jQQ jqq) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = jqq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.getContext();
                if (context != null) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.requestPostMessageChannel));
                    viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.receiveFile));
                    viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.buildRccMetadata, new Dialog(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ jQQ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, jQQ jqq) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = jqq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.getContext();
                if (context != null) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.validateRelationship));
                    viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.updateVisuals));
                    viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.buildRccMetadata, new FragmentManager(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ jQQ KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, jQQ jqq) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = jqq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.getContext();
                if (context != null) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.getSavedStateRegistry));
                    viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.warmup));
                    viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.buildRccMetadata, new Fragment(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(jQG jqg, Continuation<? super Unit> continuation) {
            C23505hzW c23505hzWAEQbTJ = jQQ.this.AEQbTJ();
            if (c23505hzWAEQbTJ != null) {
                jQQ jqq = jQQ.this;
                if (!jqg.copydefault().EZpvd()) {
                    C55113xdn c55113xdn = c23505hzWAEQbTJ.DbNXlk;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                    c55113xdn.setVisibility(jqg.copydefault().OLrzqt() ? 0 : 8);
                    java.lang.Object objKWHzl = jqg.KWHzl();
                    if (objKWHzl != null) {
                        Unit unit = null;
                        jQD jqd = objKWHzl instanceof jQD ? (jQD) objKWHzl : null;
                        if (jqd != null) {
                            jqq.AhwBna(jqd);
                            jqq.gEmmrt(jqd);
                            jqq.AYXKKw(jqd);
                            jqq.copydefault(jqd);
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            ConstraintLayout constraintLayout = c23505hzWAEQbTJ.KWHzl;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                            constraintLayout.setVisibility(8);
                            ConstraintLayout constraintLayout2 = c23505hzWAEQbTJ.djBIcL;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                            constraintLayout2.setVisibility(8);
                            ConstraintLayout constraintLayout3 = c23505hzWAEQbTJ.AYXKKw;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
                            constraintLayout3.setVisibility(8);
                            ConstraintLayout constraintLayout4 = c23505hzWAEQbTJ.EZpvd;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
                            constraintLayout4.setVisibility(8);
                        }
                        jqq.valueOf();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void djBIcL() {
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().KWHzl(), null, new TaskDescription(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, FlowKt.filterNotNull(AYXKKw().copydefault()), null, new StateListAnimator(), 2, null);
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(kotlin.Pair<java.lang.Boolean, java.lang.Boolean> pair, Continuation<? super Unit> continuation) {
            boolean zBooleanValue = pair.component1().booleanValue();
            boolean zBooleanValue2 = pair.component2().booleanValue();
            C23505hzW c23505hzWAEQbTJ = jQQ.this.AEQbTJ();
            if (c23505hzWAEQbTJ != null) {
                jQQ jqq = jQQ.this;
                java.lang.Object objKWHzl = jqq.AYXKKw().KWHzl().getValue().KWHzl();
                jQD jqd = objKWHzl instanceof jQD ? (jQD) objKWHzl : null;
                boolean z = zBooleanValue && zBooleanValue2;
                ConstraintLayout constraintLayout = c23505hzWAEQbTJ.KWHzl;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility((jqd == null || !jqq.OLrzqt(jqd)) ? 8 : 0);
                ConstraintLayout constraintLayout2 = c23505hzWAEQbTJ.djBIcL;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                constraintLayout2.setVisibility((zBooleanValue && jqd != null && jqq.EZpvd(jqd)) ? 0 : 8);
                ConstraintLayout constraintLayout3 = c23505hzWAEQbTJ.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
                constraintLayout3.setVisibility((z && jqd != null && jqq.AEQbTJ(jqd)) ? 0 : 8);
                ConstraintLayout constraintLayout4 = c23505hzWAEQbTJ.EZpvd;
                Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
                constraintLayout4.setVisibility((z && jqd != null && jqq.KWHzl(jqd)) ? 0 : 8);
                jqq.valueOf();
            }
            return Unit.INSTANCE;
        }
    }

    public final boolean OLrzqt(jQD jqd) {
        java.util.List<ChartDataUIItem> listOLrzqt;
        int i = Activity.OLrzqt[EZpvd().copydefault().ordinal()];
        if (i == 1) {
            listOLrzqt = jqd.OLrzqt();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listOLrzqt = jqd.AhwBna();
        }
        return (listOLrzqt.isEmpty() ^ true) || (jqd.copydefault().isEmpty() ^ true);
    }

    public final boolean EZpvd(jQD jqd) {
        return (jqd.AYXKKw().isEmpty() ^ true) || (jqd.valueOf().isEmpty() ^ true) || (jqd.gEmmrt().isEmpty() ^ true);
    }

    public final boolean AEQbTJ(jQD jqd) {
        return (jqd.AEQbTJ().isEmpty() ^ true) || (jqd.djBIcL().isEmpty() ^ true) || (jqd.KWHzl().isEmpty() ^ true);
    }

    public final boolean KWHzl(jQD jqd) {
        return !jqd.EZpvd().isEmpty();
    }

    public final void AhwBna(jQD jqd) {
        java.util.List<ChartDataUIItem> listOLrzqt;
        C23505hzW c23505hzW = this.EZpvd;
        if (c23505hzW != null) {
            ConstraintLayout constraintLayout = c23505hzW.KWHzl;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(OLrzqt(jqd) ? 0 : 8);
            C26092jRq c26092jRq = c23505hzW.AEQbTJ;
            int i = Activity.OLrzqt[EZpvd().copydefault().ordinal()];
            if (i == 1) {
                listOLrzqt = jqd.OLrzqt();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                listOLrzqt = jqd.AhwBna();
            }
            c26092jRq.OLrzqt(listOLrzqt, C31187lpL.OLrzqt(jqd.copydefault()));
        }
    }

    public final void gEmmrt(jQD jqd) {
        C23505hzW c23505hzW = this.EZpvd;
        if (c23505hzW != null) {
            ConstraintLayout constraintLayout = c23505hzW.djBIcL;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(EZpvd(jqd) ? 0 : 8);
            c23505hzW.valueOf.AEQbTJ(C31187lpL.OLrzqt(jqd.AYXKKw()), C31187lpL.OLrzqt(jqd.valueOf()), C31187lpL.OLrzqt(jqd.gEmmrt()));
        }
    }

    public final void AYXKKw(jQD jqd) {
        C23505hzW c23505hzW = this.EZpvd;
        if (c23505hzW != null) {
            ConstraintLayout constraintLayout = c23505hzW.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(AEQbTJ(jqd) ? 0 : 8);
            c23505hzW.gEmmrt.KWHzl(C31187lpL.OLrzqt(jqd.AEQbTJ()), C31187lpL.OLrzqt(jqd.djBIcL()), C31187lpL.OLrzqt(jqd.KWHzl()));
        }
    }

    public final void copydefault(jQD jqd) {
        C23505hzW c23505hzW = this.EZpvd;
        if (c23505hzW != null) {
            ConstraintLayout constraintLayout = c23505hzW.EZpvd;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(KWHzl(jqd) ? 0 : 8);
            c23505hzW.OLrzqt.copydefault(C31187lpL.OLrzqt(jqd.EZpvd()));
        }
    }

    public final void DbNXlk() {
        C23505hzW c23505hzW = this.EZpvd;
        if (c23505hzW != null) {
            c23505hzW.AhwBna.setContentDescription("web3_dex_market_data_liquidity_section");
            this.AEQbTJ = new C26077jRb(new Function1() { // from class: o.jQO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jQQ.copydefault(this.EZpvd, (LiquidityPoolPairUIItem) obj);
                }
            });
            c23505hzW.AuCTelauCTel.setLayoutManager(new NonScrollableLinearLayoutManager(getContext()));
            c23505hzW.AuCTelauCTel.setAdapter(this.AEQbTJ);
        }
    }

    public static final Unit copydefault(jQQ jqq, LiquidityPoolPairUIItem liquidityPoolPairUIItem) {
        Intrinsics.checkNotNullParameter(liquidityPoolPairUIItem, "");
        C26079jRd.Companion.EZpvd(liquidityPoolPairUIItem).show(jqq.getChildFragmentManager(), "liquidity_detail_bottomsheet");
        trackPageClick$default(jqq, TokenDetailButtonName.DATA_LIQUIDITY_POOL_LIST_ITEM, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final class PictureInPictureParams<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return AEQbTJ((jQG) obj, (Continuation<? super Unit>) continuation);
        }

        public final java.lang.Object AEQbTJ(jQG jqg, Continuation<? super Unit> continuation) {
            C23505hzW c23505hzWAEQbTJ = jQQ.this.AEQbTJ();
            if (c23505hzWAEQbTJ != null) {
                final jQQ jqq = jQQ.this;
                C55113xdn c55113xdn = c23505hzWAEQbTJ.getFieldNames;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(jqg.copydefault().OLrzqt() ? 0 : 8);
                ConstraintLayout constraintLayout = c23505hzWAEQbTJ.AhwBna;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility((jqg.copydefault().OLrzqt() || jqg.OLrzqt()) ? 8 : 0);
                java.lang.Object objKWHzl = jqg.KWHzl();
                if (objKWHzl != null) {
                    if ((objKWHzl instanceof jQC ? (jQC) objKWHzl : null) != null) {
                        c23505hzWAEQbTJ.fIwbmz.AEQbTJ((jQC) objKWHzl, new Function1() { // from class: o.jQT
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return jQQ.PictureInPictureParams.AEQbTJ(jqq, (java.lang.String) obj);
                            }
                        });
                    }
                }
                if (jqg.copydefault().EZpvd()) {
                    jqq.KWHzl();
                }
                jqq.valueOf();
            }
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(jQQ jqq, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            CoinDetailDataViewModel.getLiquidityData$default(jqq.AYXKKw(), false, false, str, 3, null);
            jqq.OLrzqt(TokenDetailButtonName.DATA_LIQUIDITY_TIME_CHANGE, str);
            return Unit.INSTANCE;
        }
    }

    public final void gEmmrt() {
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().EZpvd(), null, new PictureInPictureParams(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, OLrzqt().OLrzqt(), null, new AssistContent(), 2, null);
        C25390ivn.AEQbTJ(this, AuCTel().copydefault(), Lifecycle.State.RESUMED, new BroadcastReceiver());
    }

    public static final class AssistContent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(C26088jRm c26088jRm, Continuation<? super Unit> continuation) {
            boolean z;
            C23505hzW c23505hzWAEQbTJ = jQQ.this.AEQbTJ();
            if (c23505hzWAEQbTJ != null) {
                jQQ jqq = jQQ.this;
                java.util.List<LiquidityPoolPairUIItem> listEZpvd = c26088jRm.EZpvd();
                if (c26088jRm.OLrzqt() || c26088jRm.copydefault() || listEZpvd == null) {
                    z = false;
                    ConstraintLayout constraintLayout = c23505hzWAEQbTJ.isConnected;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                    constraintLayout.setVisibility(z ? 0 : 8);
                    if (z) {
                        C26077jRb c26077jRb = jqq.AEQbTJ;
                        if (c26077jRb != null) {
                            c26077jRb.submitList(listEZpvd);
                        }
                        jqq.AuCTel().AEQbTJ(jqq.AYXKKw().valueOf().getChainId(), jqq.AYXKKw().valueOf().getTokenContractAddress());
                    }
                    jqq.valueOf();
                } else {
                    z = true;
                    if (!(!listEZpvd.isEmpty())) {
                    }
                    ConstraintLayout constraintLayout2 = c23505hzWAEQbTJ.isConnected;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                    constraintLayout2.setVisibility(z ? 0 : 8);
                    if (z) {
                    }
                    jqq.valueOf();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class BroadcastReceiver<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<LiquidityPoolPairUIItem> list, Continuation<? super Unit> continuation) {
            jQQ.this.OLrzqt().EZpvd(list);
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl() {
        OLrzqt().copydefault(AYXKKw().valueOf().getChainId(), AYXKKw().valueOf().getTokenContractAddress());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf() {
        int iCopydefault;
        boolean z;
        C23505hzW c23505hzW = this.EZpvd;
        if (c23505hzW != null) {
            ViewGroup.LayoutParams layoutParams = c23505hzW.AhwBna.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            ConstraintLayout constraintLayout = c23505hzW.isConnected;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            if (constraintLayout.getVisibility() == 0) {
                android.content.Context context = c23505hzW.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iCopydefault = C55298xhM.copydefault(24.0f, context);
            } else {
                iCopydefault = 0;
            }
            layoutParams2.bottomMargin = iCopydefault;
            c23505hzW.AhwBna.setLayoutParams(layoutParams2);
            ConstraintLayout constraintLayout2 = c23505hzW.KWHzl;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            if (constraintLayout2.getVisibility() == 0) {
                z = false;
            } else {
                ConstraintLayout constraintLayout3 = c23505hzW.djBIcL;
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
                if (constraintLayout3.getVisibility() != 0) {
                    ConstraintLayout constraintLayout4 = c23505hzW.AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
                    if (constraintLayout4.getVisibility() != 0) {
                        ConstraintLayout constraintLayout5 = c23505hzW.EZpvd;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
                        if (constraintLayout5.getVisibility() != 0) {
                            ConstraintLayout constraintLayout6 = c23505hzW.AhwBna;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout6, "");
                            if (constraintLayout6.getVisibility() != 0) {
                                ConstraintLayout constraintLayout7 = c23505hzW.isConnected;
                                Intrinsics.checkNotNullExpressionValue(constraintLayout7, "");
                                if (constraintLayout7.getVisibility() != 0) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
            boolean zOLrzqt = AYXKKw().KWHzl().getValue().OLrzqt();
            boolean zOLrzqt2 = AYXKKw().EZpvd().getValue().OLrzqt();
            OKAlertBanner oKAlertBanner = c23505hzW.copydefault;
            Intrinsics.checkNotNullExpressionValue(oKAlertBanner, "");
            oKAlertBanner.setVisibility((zOLrzqt || zOLrzqt2) ? 0 : 8);
            C55173xeu c55173xeu = c23505hzW.fetchVPNInfo;
            if (zOLrzqt && zOLrzqt2) {
                java.lang.String string = c55173xeu.getContext().getString(C23274hvD.Fragment.RbMRq);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55173xeu.setTitle(string);
                c55173xeu.setEmptyTypeImage(8);
                java.lang.String string2 = c55173xeu.getContext().getString(C23274hvD.Fragment.iKEqwx);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                c55173xeu.setRetry(string2);
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jQS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        jQQ.copydefault(this.KWHzl, view);
                    }
                });
                Intrinsics.copydefault(c55173xeu);
                c55173xeu.setVisibility(0);
                NestedScrollView nestedScrollView = c23505hzW.values;
                Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
                nestedScrollView.setVisibility(8);
                return;
            }
            if (z) {
                OKAlertBanner oKAlertBanner2 = c23505hzW.copydefault;
                Intrinsics.checkNotNullExpressionValue(oKAlertBanner2, "");
                if (oKAlertBanner2.getVisibility() == 0) {
                    java.lang.String string3 = c55173xeu.getContext().getString(C23274hvD.Fragment.lambdanew0);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    c55173xeu.setTitle(string3);
                    c55173xeu.setEmptyTypeImage(6);
                    c55173xeu.setRetry("");
                    Intrinsics.copydefault(c55173xeu);
                    c55173xeu.setVisibility(0);
                    NestedScrollView nestedScrollView2 = c23505hzW.values;
                    Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "");
                    nestedScrollView2.setVisibility(8);
                    return;
                }
            }
            Intrinsics.copydefault(c55173xeu);
            c55173xeu.setVisibility(8);
            NestedScrollView nestedScrollView3 = c23505hzW.values;
            Intrinsics.checkNotNullExpressionValue(nestedScrollView3, "");
            if (nestedScrollView3.getVisibility() == 0) {
                return;
            }
            NestedScrollView nestedScrollView4 = c23505hzW.values;
            Intrinsics.checkNotNullExpressionValue(nestedScrollView4, "");
            nestedScrollView4.setVisibility(0);
        }
    }

    public static final void copydefault(jQQ jqq, android.view.View view) {
        CoinDetailDataViewModel.loadAllData$default(jqq.AYXKKw(), true, false, 2, null);
    }

    public static /* synthetic */ void trackPageClick$default(jQQ jqq, TokenDetailButtonName tokenDetailButtonName, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        jqq.OLrzqt(tokenDetailButtonName, str);
    }

    public final void OLrzqt(TokenDetailButtonName tokenDetailButtonName, java.lang.String str) {
        AYXKKw().EZpvd(tokenDetailButtonName, str, fARcdN().djBIcL());
    }

    @Override // o.InterfaceC26087jRl
    public void AEQbTJ(@NotNull TokenDetailButtonName tokenDetailButtonName) {
        Intrinsics.checkNotNullParameter(tokenDetailButtonName, "");
        trackPageClick$default(this, tokenDetailButtonName, null, 2, null);
    }

    public static final class ClipData<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ClipData() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(jQG jqg, Continuation<? super Unit> continuation) {
            C55113xdn c55113xdn;
            C23505hzW c23505hzWAEQbTJ = jQQ.this.AEQbTJ();
            if (c23505hzWAEQbTJ != null && (c55113xdn = c23505hzWAEQbTJ.iwGUEr) != null) {
                c55113xdn.setAnimation(jQQ.this.AYXKKw().OLrzqt(C33492mxV.OLrzqt()));
            }
            C23505hzW c23505hzWAEQbTJ2 = jQQ.this.AEQbTJ();
            if (c23505hzWAEQbTJ2 != null) {
                final jQQ jqq = jQQ.this;
                android.widget.ScrollView scrollView = c23505hzWAEQbTJ2.uzCIH;
                Intrinsics.checkNotNullExpressionValue(scrollView, "");
                scrollView.setVisibility(jqg.copydefault().copydefault() ? 0 : 8);
                C55113xdn c55113xdn2 = c23505hzWAEQbTJ2.iwGUEr;
                Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                c55113xdn2.setVisibility(jqg.copydefault().copydefault() ? 0 : 8);
                if (jqg.copydefault().copydefault()) {
                    C55173xeu c55173xeu = c23505hzWAEQbTJ2.fetchVPNInfo;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                    c55173xeu.setVisibility(8);
                    NestedScrollView nestedScrollView = c23505hzWAEQbTJ2.values;
                    Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
                    nestedScrollView.setVisibility(8);
                } else if (jqg.OLrzqt()) {
                    C55173xeu c55173xeu2 = c23505hzWAEQbTJ2.fetchVPNInfo;
                    java.lang.String string = c55173xeu2.getContext().getString(C23274hvD.Fragment.RbMRq);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    c55173xeu2.setTitle(string);
                    c55173xeu2.setEmptyTypeImage(8);
                    java.lang.String string2 = c55173xeu2.getContext().getString(C23274hvD.Fragment.iKEqwx);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    c55173xeu2.setRetry(string2);
                    c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.jQX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            jQQ.ClipData.KWHzl(jqq, view);
                        }
                    });
                    Intrinsics.copydefault(c55173xeu2);
                    c55173xeu2.setVisibility(0);
                    NestedScrollView nestedScrollView2 = c23505hzWAEQbTJ2.values;
                    Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "");
                    nestedScrollView2.setVisibility(8);
                } else {
                    C55173xeu c55173xeu3 = c23505hzWAEQbTJ2.fetchVPNInfo;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                    c55173xeu3.setVisibility(8);
                    NestedScrollView nestedScrollView3 = c23505hzWAEQbTJ2.values;
                    Intrinsics.checkNotNullExpressionValue(nestedScrollView3, "");
                    nestedScrollView3.setVisibility(0);
                    jqq.valueOf();
                }
                if (!jqg.copydefault().copydefault() && !jqg.OLrzqt()) {
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jqq, true, (java.lang.String) null, 2, (java.lang.Object) null);
                    java.lang.Integer num = jqq.AYXKKw;
                    if (num != null) {
                        jqq.AEQbTJ(DataTabType.getEntries().get(num.intValue()));
                    }
                }
                if (jqg.OLrzqt()) {
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jqq, false, (java.lang.String) null, 2, (java.lang.Object) null);
                }
                if (!jqg.copydefault().EZpvd()) {
                    C33546myW c33546myW = c23505hzWAEQbTJ2.hDKMBd;
                    Intrinsics.checkNotNullExpressionValue(c33546myW, "");
                    C57589ylK.KWHzl(c33546myW, true);
                }
            }
            return Unit.INSTANCE;
        }

        public static final void KWHzl(jQQ jqq, android.view.View view) {
            CoinDetailDataViewModel.loadAllData$default(jqq.AYXKKw(), true, false, 2, null);
        }
    }

    private final void fJNWhG() {
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().AEQbTJ(), null, new ClipData(), 2, null);
    }

    public final void AkhnZx() {
        fIwbmz().AkhnZx().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.jQP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jQQ.OLrzqt(this.EZpvd, (InterfaceC22618hik) obj);
            }
        }));
    }

    public static final Unit OLrzqt(jQQ jqq, InterfaceC22618hik interfaceC22618hik) {
        if (interfaceC22618hik != null && interfaceC22618hik.AEQbTJ() == CoinDetailTabType.DATA.ordinal() && interfaceC22618hik.KWHzl() < DataTabType.getEntries().size()) {
            jQG value = jqq.AYXKKw().AEQbTJ().getValue();
            if (!value.copydefault().copydefault() && !value.OLrzqt()) {
                jqq.AEQbTJ(DataTabType.getEntries().get(interfaceC22618hik.KWHzl()));
            } else {
                jqq.AYXKKw = java.lang.Integer.valueOf(interfaceC22618hik.KWHzl());
            }
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(DataTabType dataTabType) {
        C23505hzW c23505hzW = this.EZpvd;
        if (c23505hzW != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CoinDetailDataFragment$redirectTo$1$1(dataTabType, c23505hzW, this, null), 3, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.EZpvd = null;
        this.AEQbTJ = null;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jQQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final jQQ EZpvd(TokenBase tokenBase, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            jQQ jqq = new jQQ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", tokenBase);
            bundle.putString("key.page_from", str);
            jqq.setArguments(bundle);
            return jqq;
        }
    }
}
