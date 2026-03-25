package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoParams;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.business.market.features.filter.SharedFilterViewModel;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.filter.ui.FilterAction;
import com.okinc.business.market.features.overview.ui.OverviewViewModel;
import com.okinc.business.market.features.tag.ui.TagViewModel;
import com.okinc.business.market.features.trader.ui.TraderAction;
import com.okinc.business.market.features.trader.ui.TraderHeaderFragment$showTagFilterBottomSheet$1;
import com.okinc.business.market.features.trader.ui.TraderViewModel;
import com.okinc.business.market.features.trader.ui.model.TraderFragmentParams;
import com.okinc.business.market.features.trader.ui.model.TraderPnLFilter;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import o.InterfaceC27701kAd;
import o.jUZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kzO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29740kzO extends androidx.fragment.app.Fragment implements jUZ {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public hAX AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.kzO$Application */
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

    public C29740kzO() {
        final Function0 function0 = new Function0() { // from class: o.kAc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29740kzO.AYXKKw(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$viewModels$default$1
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TraderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$viewModels$default$4
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$activityViewModels$default$3
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TagViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$activityViewModels$default$6
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$activityViewModels$default$9
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.trader.ui.TraderHeaderFragment$special$$inlined$activityViewModels$default$12
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

    @Override // o.jUZ
    public void AEQbTJ(@NotNull FilterAction filterAction, @NotNull TokenFilter tokenFilter) {
        jUZ.TaskDescription.AEQbTJ(this, filterAction, tokenFilter);
    }

    @Override // o.jUZ
    public void KWHzl(@NotNull TokenFilter tokenFilter) {
        jUZ.TaskDescription.KWHzl(this, tokenFilter);
    }

    public final TraderViewModel copydefault() {
        return (TraderViewModel) this.valueOf.getValue();
    }

    public static final ViewModelStoreOwner AYXKKw(C29740kzO c29740kzO) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c29740kzO.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    private final SharedFilterViewModel AYXKKw() {
        return (SharedFilterViewModel) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TagViewModel djBIcL() {
        return (TagViewModel) this.AhwBna.getValue();
    }

    private final MarketCoinDetailViewModel AhwBna() {
        return (MarketCoinDetailViewModel) this.copydefault.getValue();
    }

    private final OverviewViewModel gEmmrt() {
        return (OverviewViewModel) this.KWHzl.getValue();
    }

    public final TraderFragmentParams KWHzl() {
        TraderFragmentParams traderFragmentParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (traderFragmentParams = (TraderFragmentParams) BundleCompat.getParcelable(arguments, "key.trader_params", TraderFragmentParams.class)) == null) ? new TraderFragmentParams(null, null, null, null, null, false, null, null, 255, null) : traderFragmentParams;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hAX haxKWHzl = hAX.KWHzl(layoutInflater, viewGroup, false);
        this.AEQbTJ = haxKWHzl;
        if (haxKWHzl != null) {
            return haxKWHzl.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        isConnected();
        DbNXlk();
        OLrzqt();
        copydefault().EZpvd();
        view.post(new java.lang.Runnable() { // from class: o.kzW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C29740kzO.AhwBna(this.EZpvd);
            }
        });
    }

    public static final void AhwBna(C29740kzO c29740kzO) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c29740kzO, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (copydefault().valueOf().getValue() instanceof InterfaceC27701kAd.Activity) {
            copydefault().EZpvd();
        }
        copydefault().AEQbTJ();
    }

    private final void isConnected() {
        EZpvd();
        AEQbTJ();
        hAX hax = this.AEQbTJ;
        if (hax != null) {
            C55052xcf c55052xcf = hax.AEQbTJ;
            java.lang.String strOLrzqt = copydefault().gEmmrt().getValue().KWHzl().OLrzqt();
            if (strOLrzqt.length() == 0) {
                strOLrzqt = getString(C23274hvD.Fragment.r8lambdahrfbBpVkizzQbtGmrw6DTx0hH1A);
                Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
            }
            c55052xcf.setTitle(strOLrzqt);
            C25352ivB.setOnDoubleCheckClickListener$default(hax.copydefault, 0L, new Function1() { // from class: o.kzP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C29740kzO.AEQbTJ(this.KWHzl, (android.view.View) obj);
                }
            }, 1, null);
            hax.OLrzqt.setText(C33070mpX.AYXKKw(copydefault().gEmmrt().getValue().AEQbTJ().getTitle()));
        }
    }

    public static final Unit AEQbTJ(C29740kzO c29740kzO, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c29740kzO.fetchVPNInfo();
        C27698kAa.trackTraderAction$default(null, TraderAction.FILTER, null, c29740kzO.copydefault().AYXKKw(), 5, null);
        return Unit.INSTANCE;
    }

    private final void DbNXlk() {
        copydefault().AhwBna().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.kzT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29740kzO.AEQbTJ(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        C25390ivn.collectOnViewLifecycle$default(this, copydefault().valueOf(), null, new ActionBar(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, copydefault().KWHzl(), null, new TaskDescription(), 2, null);
    }

    public static final Unit AEQbTJ(C29740kzO c29740kzO, java.lang.Boolean bool) {
        SwitchCompat switchCompat;
        hAX hax = c29740kzO.AEQbTJ;
        if (hax != null && (switchCompat = hax.AhwBna) != null) {
            switchCompat.setChecked(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kzO$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC27701kAd interfaceC27701kAd, Continuation<? super Unit> continuation) {
            hAX hax;
            if ((interfaceC27701kAd instanceof InterfaceC27701kAd.TaskDescription) && (hax = C29740kzO.this.AEQbTJ) != null) {
                C29740kzO c29740kzO = C29740kzO.this;
                C55052xcf c55052xcf = hax.AEQbTJ;
                java.lang.String strOLrzqt = c29740kzO.copydefault().gEmmrt().getValue().KWHzl().OLrzqt();
                if (strOLrzqt.length() == 0) {
                    strOLrzqt = c29740kzO.getString(C23274hvD.Fragment.r8lambdahrfbBpVkizzQbtGmrw6DTx0hH1A);
                    Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
                }
                c55052xcf.setTitle(strOLrzqt);
                hax.copydefault.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.dPnHjp));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kzO$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<C26211jWa> list, Continuation<? super Unit> continuation) {
            C55052xcf c55052xcf;
            if (list.isEmpty()) {
                hAX hax = C29740kzO.this.AEQbTJ;
                if (hax != null && (c55052xcf = hax.AEQbTJ) != null) {
                    c55052xcf.setVisibility(8);
                }
            } else {
                C29740kzO.this.KWHzl(list);
            }
            return Unit.INSTANCE;
        }
    }

    public final void EZpvd() {
        hAX hax = this.AEQbTJ;
        if (hax != null) {
            hax.djBIcL.setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.ComponentActivityExternalSyntheticLambda2));
            C55258xgZ c55258xgZ = hax.djBIcL;
            c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this));
        }
    }

    public final void KWHzl(final java.util.List<C26211jWa> list) {
        hAX hax = this.AEQbTJ;
        if (hax != null) {
            hax.AEQbTJ.setVisibility(0);
            C25352ivB.setOnDoubleCheckClickListener$default(hax.AEQbTJ, 0L, new Function1() { // from class: o.kzU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C29740kzO.EZpvd(this.OLrzqt, list, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit EZpvd(C29740kzO c29740kzO, java.util.List list, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (!c29740kzO.isAdded() || c29740kzO.getChildFragmentManager().isStateSaved()) {
            return Unit.INSTANCE;
        }
        view.setSelected(true);
        c29740kzO.KWHzl(list, c29740kzO.copydefault().gEmmrt().getValue().KWHzl());
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.util.List<C26211jWa> list, C26211jWa c26211jWa) {
        if (!isAdded() || getChildFragmentManager().isStateSaved()) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TraderHeaderFragment$showTagFilterBottomSheet$1(list, c26211jWa, this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.kzO$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ OKSortTextView AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C29740kzO OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, OKSortTextView oKSortTextView, C29740kzO c29740kzO) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = oKSortTextView;
            this.OLrzqt = c29740kzO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                OKSortTextView.SortType sortTypeAEQbTJ = this.AEQbTJ.AEQbTJ();
                OKSortTextView.SortType sortType = OKSortTextView.SortType.DOWN;
                OKSortTextView.SortType sortType2 = sortTypeAEQbTJ == sortType ? OKSortTextView.SortType.UP : sortType;
                OKSortTextView.setSortType$default(this.AEQbTJ, sortType2, false, 2, null);
                TraderViewModel.updateFilter$default(this.OLrzqt.copydefault(), null, null, null, sortType2 == sortType, 7, null);
                C27698kAa.trackTraderAction$default(null, TraderAction.SORT, null, this.OLrzqt.copydefault().AYXKKw(), 5, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.kzO$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C29740kzO OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C29740kzO c29740kzO) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c29740kzO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (!this.OLrzqt.isAdded() || this.OLrzqt.getChildFragmentManager().isStateSaved()) {
                    return;
                }
                C29740kzO.trackPageClick$default(this.OLrzqt, TokenDetailButtonName.SUBTABS_ADDRESS_EXPLANATION, ChartDetailFragment.Companion.SubChartTabType.TRADER, null, 4, null);
                C21951hSj.Companion.EZpvd(new HolderInfoParams(this.OLrzqt.KWHzl().gEmmrt(), "trader_address_click", null, 4, null)).show(this.OLrzqt.getChildFragmentManager(), C56524yIo.AEQbTJ(C21951hSj.class).valueOf());
            }
        }
    }

    public final void AEQbTJ() {
        final hAX hax = this.AEQbTJ;
        if (hax != null) {
            hax.AhwBna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.kzV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C29740kzO.AEQbTJ(this.EZpvd, hax, compoundButton, z);
                }
            });
        }
    }

    public static final void AEQbTJ(C29740kzO c29740kzO, hAX hax, android.widget.CompoundButton compoundButton, boolean z) {
        if (z) {
            java.lang.String strCopydefault = c29740kzO.KWHzl().copydefault();
            SwitchCompat switchCompat = hax.AhwBna;
            Intrinsics.checkNotNullExpressionValue(switchCompat, "");
            C28068kNs.AEQbTJ(switchCompat, strCopydefault);
        } else {
            hax.AhwBna.setThumbDrawable(C33070mpX.KWHzl(C57406yhn.Activity.DTwDnp));
        }
        c29740kzO.copydefault().KWHzl(z);
        trackPageClick$default(c29740kzO, TokenDetailButtonName.SUBTABS_CURRENCY_MODE, null, java.lang.Boolean.valueOf(z), 2, null);
    }

    public final void OLrzqt() {
        OKSortTextView oKSortTextView;
        hAX hax = this.AEQbTJ;
        if (hax == null || (oKSortTextView = hax.OLrzqt) == null) {
            return;
        }
        oKSortTextView.setOnClickListener(new Dialog(oKSortTextView, 1000L, oKSortTextView, this));
    }

    private final void fetchVPNInfo() {
        if (!isAdded() || getChildFragmentManager().isStateSaved()) {
            return;
        }
        C27715kAr c27715kArOLrzqt = C27715kAr.Companion.OLrzqt(copydefault().gEmmrt().getValue().AEQbTJ(), copydefault().gEmmrt().getValue().EZpvd(), new Function2() { // from class: o.kzX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C29740kzO.EZpvd(this.OLrzqt, (TraderPnLFilter) obj, (java.lang.String) obj2);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c27715kArOLrzqt.show(childFragmentManager);
    }

    public static final Unit EZpvd(C29740kzO c29740kzO, TraderPnLFilter traderPnLFilter, java.lang.String str) {
        android.graphics.drawable.Drawable drawableKWHzl;
        OKSortTextView oKSortTextView;
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(traderPnLFilter, "");
        Intrinsics.checkNotNullParameter(str, "");
        TraderViewModel.updateFilter$default(c29740kzO.copydefault(), null, traderPnLFilter, str, false, 9, null);
        if (c29740kzO.copydefault().gEmmrt().getValue().AEQbTJ() != TraderPnLFilter.TOTAL || (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c29740kzO.copydefault().gEmmrt().getValue().EZpvd()))) {
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.GVpNrs);
        } else {
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.dPnHjp);
        }
        hAX hax = c29740kzO.AEQbTJ;
        if (hax != null && (imageView = hax.copydefault) != null) {
            imageView.setImageDrawable(drawableKWHzl);
        }
        hAX hax2 = c29740kzO.AEQbTJ;
        if (hax2 != null && (oKSortTextView = hax2.OLrzqt) != null) {
            oKSortTextView.setText(C33070mpX.AYXKKw(traderPnLFilter.getTitle()));
        }
        setSharedFilter$default(c29740kzO, null, str.length() == 0 ? yDY.AhwBna() : C56402yEa.EZpvd(str), false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.kzO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSharedFilter$default(C29740kzO c29740kzO, C26211jWa c26211jWa, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c26211jWa = new C26211jWa(0, null, null, 7, null);
        }
        if ((i & 2) != 0) {
            list = yDY.AhwBna();
        }
        c29740kzO.copydefault(c26211jWa, list, z);
    }

    public final void copydefault(C26211jWa c26211jWa, java.util.List<java.lang.String> list, boolean z) {
        TokenFilter tokenFilterCopydefault = AYXKKw().copydefault();
        AYXKKw().KWHzl(tokenFilterCopydefault.OLrzqt((6143 & 1) != 0 ? tokenFilterCopydefault.AEQbTJ : KWHzl().OLrzqt(), (6143 & 2) != 0 ? tokenFilterCopydefault.isConnected : KWHzl().AYXKKw(), (6143 & 4) != 0 ? tokenFilterCopydefault.AkhnZx : null, (6143 & 8) != 0 ? tokenFilterCopydefault.AhwBna : null, (6143 & 16) != 0 ? tokenFilterCopydefault.KWHzl : list, (6143 & 32) != 0 ? tokenFilterCopydefault.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterCopydefault.valueOf : false, (6143 & 128) != 0 ? tokenFilterCopydefault.EZpvd : c26211jWa.copydefault(), (6143 & 256) != 0 ? tokenFilterCopydefault.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterCopydefault.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterCopydefault.copydefault : null, (6143 & 2048) != 0 ? tokenFilterCopydefault.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterCopydefault.fetchVPNInfo : null), z);
    }

    /* JADX INFO: renamed from: o.kzO$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kzO.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C29740kzO copydefault(@NotNull TraderFragmentParams traderFragmentParams) {
            Intrinsics.checkNotNullParameter(traderFragmentParams, "");
            C29740kzO c29740kzO = new C29740kzO();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.trader_params", traderFragmentParams);
            c29740kzO.setArguments(bundle);
            return c29740kzO;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        hAX hax = this.AEQbTJ;
        if (hax != null) {
            hax.copydefault.setOnClickListener(null);
            hax.djBIcL.setOnClickListener(null);
            hax.AEQbTJ.setOnClickListener(null);
            hax.AhwBna.setOnCheckedChangeListener(null);
            hax.OLrzqt.setOnClickListener(null);
        }
        valueOf();
        super.onDestroyView();
        this.AEQbTJ = null;
    }

    private final void valueOf() {
        if (getChildFragmentManager().isStateSaved() || getChildFragmentManager().isDestroyed()) {
            return;
        }
        java.util.Iterator it = yDY.gEmmrt(C56524yIo.AEQbTJ(C21951hSj.class).valueOf(), "DexSelectionBottomSheet", "TradersFilterBottomSheet").iterator();
        while (it.hasNext()) {
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag((java.lang.String) it.next());
            if (fragmentFindFragmentByTag != null && fragmentFindFragmentByTag.isAdded()) {
                try {
                    getChildFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    public static /* synthetic */ void trackPageClick$default(C29740kzO c29740kzO, TokenDetailButtonName tokenDetailButtonName, ChartDetailFragment.Companion.SubChartTabType subChartTabType, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            subChartTabType = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        c29740kzO.OLrzqt(tokenDetailButtonName, subChartTabType, bool);
    }

    private final void OLrzqt(TokenDetailButtonName tokenDetailButtonName, ChartDetailFragment.Companion.SubChartTabType subChartTabType, java.lang.Boolean bool) {
        java.lang.String strEZpvd = KWHzl().EZpvd();
        java.lang.String strKWHzl = KWHzl().KWHzl();
        java.lang.String strOLrzqt = KWHzl().OLrzqt();
        C21847hOn.trackDexMarketTokenPageClick$default(KWHzl().AYXKKw(), KWHzl().gEmmrt(), strOLrzqt, strKWHzl, CoinDetailTabType.CHART, strEZpvd, null, null, ChartDetailFragment.Companion.SubChartTabType.TRADER, null, null, null, null, null, null, tokenDetailButtonName, null, AhwBna().getNewProxyInstance(), TokenDetailClickLayer.COMPONENTS, bool, subChartTabType, gEmmrt().djBIcL(), 97984, null);
    }
}
