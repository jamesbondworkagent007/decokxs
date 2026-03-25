package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.github.mikephil.charting.jobs.MoveViewJob;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.invest_api.bean.EarnRecommendApyBean;
import com.okinc.business.market.data.constant.LiquidityChangeType;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$showFilter$1;
import com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$updateFilterIcon$1;
import com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityViewModel;
import com.okinc.business.market.features.coindetail_liquidity.ui.models.LiquidityFragmentParams;
import com.okinc.business.market.features.data.domain.type.DataTabType;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.filter.ui.FilterAction;
import com.okinc.business.market.features.filter.ui.TypeOptionParams;
import com.okinc.business.market.features.overview.ui.OverviewViewModel;
import com.okinc.business.market.features.token_detail.RealtimeDataViewModel;
import com.okinc.business.market.features.token_detail.TokenDetail;
import com.okinc.uilab.view.OKSortTextView;
import java.math.RoundingMode;
import java.util.NoSuchElementException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.jPR;
import o.jUZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jQd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26052jQd extends jPW<hDN> implements jUZ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.jQd$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ hDN KWHzl(C26052jQd c26052jQd) {
        return (hDN) c26052jQd.aX_();
    }

    @Override // o.jUZ
    public void AEQbTJ(@NotNull FilterAction filterAction, @NotNull TokenFilter tokenFilter) {
        jUZ.TaskDescription.AEQbTJ(this, filterAction, tokenFilter);
    }

    public C26052jQd() {
        final Function0 function0 = new Function0() { // from class: o.jQj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26052jQd.AhwBna(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$special$$inlined$viewModels$default$1
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(LiquidityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$special$$inlined$viewModels$default$4
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$special$$inlined$activityViewModels$default$3
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$special$$inlined$activityViewModels$default$6
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RealtimeDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityHeaderFragment$special$$inlined$activityViewModels$default$9
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

    public final LiquidityViewModel gEmmrt() {
        return (LiquidityViewModel) this.AhwBna.getValue();
    }

    public static final ViewModelStoreOwner AhwBna(C26052jQd c26052jQd) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c26052jQd.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OverviewViewModel DbNXlk() {
        return (OverviewViewModel) this.valueOf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketCoinDetailViewModel isConnected() {
        return (MarketCoinDetailViewModel) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RealtimeDataViewModel AkhnZx() {
        return (RealtimeDataViewModel) this.values.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LiquidityFragmentParams fetchVPNInfo() {
        LiquidityFragmentParams liquidityFragmentParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (liquidityFragmentParams = (LiquidityFragmentParams) BundleCompat.getParcelable(arguments, "key.liquidity_change_params", LiquidityFragmentParams.class)) == null) ? new LiquidityFragmentParams(null, null, null, null, null, 31, null) : liquidityFragmentParams;
    }

    /* JADX INFO: renamed from: o.jQd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jQd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C26052jQd KWHzl(@NotNull LiquidityFragmentParams liquidityFragmentParams) {
            Intrinsics.checkNotNullParameter(liquidityFragmentParams, "");
            C26052jQd c26052jQd = new C26052jQd();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.liquidity_change_params", liquidityFragmentParams);
            c26052jQd.setArguments(bundle);
            return c26052jQd;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public hDN KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hDN hdnKWHzl = hDN.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hdnKWHzl, "");
        return hdnKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hDN hdn, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(hdn, "");
        djBIcL();
        valueOf();
        C25390ivn.collectOnViewLifecycle$default(this, DbNXlk().EZpvd(), null, new Application(), 2, null);
        gEmmrt().copydefault().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.jQf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26052jQd.KWHzl(this.KWHzl, (TokenFilter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o.jQd$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<EarnRecommendApyBean> list, Continuation<? super Unit> continuation) {
            LatestMarketInfoBean second;
            C26052jQd c26052jQd = C26052jQd.this;
            java.util.List<EarnRecommendApyBean> value = c26052jQd.DbNXlk().EZpvd().getValue();
            kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value2 = C26052jQd.this.isConnected().valueOf().getValue();
            c26052jQd.EZpvd(value, (value2 == null || (second = value2.getSecond()) == null) ? null : second.getLiquidity());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C26052jQd.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
    }

    public static final Unit KWHzl(C26052jQd c26052jQd, TokenFilter tokenFilter) {
        Intrinsics.copydefault(tokenFilter);
        c26052jQd.AEQbTJ(tokenFilter);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.util.List<EarnRecommendApyBean> list, java.lang.String str) {
        hDN hdn;
        java.lang.String scientificCurrency$default;
        if (list == null || (hdn = (hDN) aX_()) == null) {
            return;
        }
        LinearLayoutCompat linearLayoutCompat = hdn.isConnected;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(str != null && list.isEmpty() ? 0 : 8);
        ConstraintLayout constraintLayout = hdn.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(C33129mqd.KWHzl((java.util.Collection) list) ? 0 : 8);
        if (!list.isEmpty()) {
            hdn.ejfBZ.setText(list.get(0).KWHzl());
        }
        if (str == null || (scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null)) == null) {
            scientificCurrency$default = "--";
        }
        hdn.AuCTel.setText(scientificCurrency$default);
        hdn.fJNWhG.setText(scientificCurrency$default);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        LatestMarketInfoBean second;
        hDN hdn = (hDN) aX_();
        if (hdn != null) {
            LinearLayoutCompat linearLayoutCompat = hdn.isConnected;
            linearLayoutCompat.setOnClickListener(new ActionBar(linearLayoutCompat, 1000L, this));
            ConstraintLayout constraintLayout = hdn.AEQbTJ;
            constraintLayout.setOnClickListener(new FragmentManager(constraintLayout, 1000L, this));
            ConstraintLayout constraintLayout2 = hdn.copydefault;
            constraintLayout2.setOnClickListener(new LoaderManager(constraintLayout2, 1000L, this));
            java.util.List<EarnRecommendApyBean> value = DbNXlk().EZpvd().getValue();
            kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value2 = isConnected().valueOf().getValue();
            EZpvd(value, (value2 == null || (second = value2.getSecond()) == null) ? null : second.getLiquidity());
        }
        C25390ivn.collectOnViewLifecycle$default(this, AkhnZx().EZpvd(), null, new TaskDescription(), 2, null);
    }

    /* JADX INFO: renamed from: o.jQd$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(TokenDetail tokenDetail, Continuation<? super Unit> continuation) {
            if (C26052jQd.KWHzl(C26052jQd.this) != null) {
                C26052jQd c26052jQd = C26052jQd.this;
                c26052jQd.EZpvd(c26052jQd.DbNXlk().EZpvd().getValue(), c26052jQd.AkhnZx().EZpvd().getValue().AhwBna());
            }
            return Unit.INSTANCE;
        }
    }

    public final void AhwBna() {
        AEQbTJ(TokenDetailButtonName.LIQUIDITY_TOTAL);
        OLrzqt(CoinDetailTabType.DATA.ordinal(), DataTabType.LIQUIDITY_INFO.ordinal());
    }

    public final void OLrzqt(int i, int i2) {
        isConnected().KWHzl(new C22622hio(i, i2));
    }

    /* JADX INFO: renamed from: o.jQd$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C26052jQd AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C26052jQd c26052jQd) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c26052jQd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.AhwBna();
            }
        }
    }

    /* JADX INFO: renamed from: o.jQd$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C26052jQd OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C26052jQd c26052jQd) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c26052jQd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.values();
                LiquidityFragmentParams liquidityFragmentParamsFetchVPNInfo = this.OLrzqt.fetchVPNInfo();
                C21847hOn.AEQbTJ(liquidityFragmentParamsFetchVPNInfo.copydefault(), this.OLrzqt.fetchVPNInfo().OLrzqt(), liquidityFragmentParamsFetchVPNInfo.KWHzl(), this.OLrzqt.fetchVPNInfo().EZpvd(), "custom_filter");
            }
        }
    }

    /* JADX INFO: renamed from: o.jQd$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ TypeOptionParams OLrzqt;
        public final /* synthetic */ C26052jQd copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C26052jQd c26052jQd, TypeOptionParams typeOptionParams) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c26052jQd;
            this.OLrzqt = typeOptionParams;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.EZpvd(this.OLrzqt);
                for (LiquidityChangeType liquidityChangeType : LiquidityChangeType.getEntries()) {
                    if (Intrinsics.EZpvd((java.lang.Object) liquidityChangeType.getValue(), (java.lang.Object) this.OLrzqt.copydefault())) {
                        this.copydefault.AEQbTJ(TokenDetailButtonName.Companion.OLrzqt(liquidityChangeType));
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
    }

    /* JADX INFO: renamed from: o.jQd$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C26052jQd EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C26052jQd c26052jQd) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c26052jQd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.AhwBna();
            }
        }
    }

    /* JADX INFO: renamed from: o.jQd$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C26052jQd copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C26052jQd c26052jQd) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c26052jQd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (Intrinsics.EZpvd(this.copydefault.isConnected().fIwbmz().getValue(), java.lang.Boolean.TRUE)) {
                    this.copydefault.AEQbTJ(TokenDetailButtonName.LIQUIDITY_DEFI);
                    this.copydefault.OLrzqt(CoinDetailTabType.EARN.ordinal(), 0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jQd$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ C26052jQd AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ hDN OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, hDN hdn, C26052jQd c26052jQd) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = hdn;
            this.AEQbTJ = c26052jQd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                OKSortTextView.SortType sortTypeAEQbTJ = this.OLrzqt.AhwBna.AEQbTJ();
                OKSortTextView.SortType sortType = OKSortTextView.SortType.DOWN;
                if (sortTypeAEQbTJ == sortType) {
                    sortType = OKSortTextView.SortType.UP;
                }
                OKSortTextView.setSortType$default(this.OLrzqt.AhwBna, sortType, false, 2, null);
                LiquidityFragmentParams liquidityFragmentParamsFetchVPNInfo = this.AEQbTJ.fetchVPNInfo();
                C21847hOn.AEQbTJ(liquidityFragmentParamsFetchVPNInfo.copydefault(), this.AEQbTJ.fetchVPNInfo().OLrzqt(), liquidityFragmentParamsFetchVPNInfo.KWHzl(), this.AEQbTJ.fetchVPNInfo().EZpvd(), CrashHianalyticsData.TIME);
            }
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AEQbTJ(gEmmrt().KWHzl());
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MoveViewJob.getInstance(null, 0.0f, 0.0f, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        android.widget.LinearLayout linearLayout;
        hDN hdn = (hDN) aX_();
        if (hdn != null && (linearLayout = hdn.AkhnZx) != null) {
            linearLayout.removeAllViews();
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("tag.FilterBottomSheet");
        if (fragmentFindFragmentByTag != null && fragmentFindFragmentByTag.isAdded() && !getChildFragmentManager().isStateSaved()) {
            try {
                getChildFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
            } catch (java.lang.Exception unused) {
            }
        }
        super.onDestroyView();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        InterfaceC56445yFq<LiquidityChangeType> entries = LiquidityChangeType.getEntries();
        java.util.ArrayList<TypeOptionParams> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(entries, 10));
        for (LiquidityChangeType liquidityChangeType : entries) {
            java.lang.String value = liquidityChangeType.getValue();
            jPR.TaskDescription taskDescription = jPR.Companion;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            arrayList.add(new TypeOptionParams(value, taskDescription.copydefault(contextRequireContext, liquidityChangeType)));
        }
        hDN hdn = (hDN) aX_();
        if (hdn != null) {
            hdn.AkhnZx.invalidate();
            for (TypeOptionParams typeOptionParams : arrayList) {
                android.content.Context context = hdn.AkhnZx.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C54989xbV c54989xbV = new C54989xbV(context, null, 0, 6, null);
                c54989xbV.setStyle(2);
                c54989xbV.setOKDSSize(-20);
                c54989xbV.setSelected(Intrinsics.EZpvd((java.lang.Object) typeOptionParams.copydefault(), (java.lang.Object) gEmmrt().KWHzl().DbNXlk()));
                c54989xbV.EZpvd().setText(typeOptionParams.OLrzqt());
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                layoutParams.setMarginEnd(C55298xhM.dp2px$default(8.0f, null, 1, null));
                c54989xbV.setLayoutParams(layoutParams);
                c54989xbV.setOnClickListener(new Fragment(c54989xbV, 1000L, this, typeOptionParams));
                hdn.AkhnZx.addView(c54989xbV);
            }
        }
        hDN hdn2 = (hDN) aX_();
        if (hdn2 != null) {
            hdn2.valueOf.setDefaultIndicator(null);
            OKSortTextView oKSortTextView = hdn2.valueOf;
            OKSortTextView.SortType sortType = OKSortTextView.SortType.NONE;
            OKSortTextView.setSortType$default(oKSortTextView, sortType, false, 2, null);
            hdn2.djBIcL.setDefaultIndicator(null);
            OKSortTextView.setSortType$default(hdn2.djBIcL, sortType, false, 2, null);
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.setContentView);
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.startIntentSenderForResult);
            hdn2.AhwBna.setText(strAYXKKw + " | " + strAYXKKw2);
            OKSortTextView oKSortTextView2 = hdn2.AhwBna;
            oKSortTextView2.setOnClickListener(new PendingIntent(oKSortTextView2, 1000L, hdn2, this));
            hdn2.AhwBna.setOnSortTypeChangeListener(new Function2() { // from class: o.jQh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C26052jQd.KWHzl(this.OLrzqt, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
                }
            });
            wYC wyc = hdn2.EZpvd;
            wyc.setOnClickListener(new Dialog(wyc, 1000L, this));
        }
    }

    public static final Unit KWHzl(C26052jQd c26052jQd, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        c26052jQd.gEmmrt().copydefault(sortType == OKSortTextView.SortType.DOWN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void values() {
        if (getChildFragmentManager().findFragmentByTag("tag.FilterBottomSheet") != null) {
            return;
        }
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LiquidityHeaderFragment$showFilter$1(this, null), 3, null);
    }

    @Override // o.jUZ
    public void KWHzl(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        AEQbTJ(tokenFilter);
        gEmmrt().AEQbTJ(null, tokenFilter);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(TypeOptionParams typeOptionParams) {
        gEmmrt().AEQbTJ(typeOptionParams.copydefault(), null);
        hDN hdn = (hDN) aX_();
        if (hdn != null) {
            android.widget.LinearLayout linearLayout = hdn.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            for (android.view.View view : ViewGroupKt.getChildren(linearLayout)) {
                if (view instanceof C54989xbV) {
                    C54989xbV c54989xbV = (C54989xbV) view;
                    c54989xbV.setSelected(Intrinsics.EZpvd((java.lang.Object) c54989xbV.EZpvd().getText(), (java.lang.Object) typeOptionParams.OLrzqt()));
                }
            }
        }
    }

    public final void AEQbTJ(TokenFilter tokenFilter) {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LiquidityHeaderFragment$updateFilterIcon$1(tokenFilter, this, null), 3, null);
    }

    public final void AEQbTJ(TokenDetailButtonName tokenDetailButtonName) {
        java.lang.String strAEQbTJ = fetchVPNInfo().AEQbTJ();
        java.lang.String strEZpvd = fetchVPNInfo().EZpvd();
        java.lang.String strKWHzl = fetchVPNInfo().KWHzl();
        C21847hOn.trackDexMarketTokenPageClick$default(fetchVPNInfo().copydefault(), fetchVPNInfo().OLrzqt(), strKWHzl, strEZpvd, CoinDetailTabType.CHART, strAEQbTJ, null, null, ChartDetailFragment.Companion.SubChartTabType.LIQUIDITY, null, null, null, null, null, null, tokenDetailButtonName, null, isConnected().getNewProxyInstance(), TokenDetailClickLayer.COMPONENTS, null, null, DbNXlk().djBIcL(), 1670848, null);
    }
}
