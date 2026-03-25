package o;

import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexlogic.main.market.detail.TrackingAddressViewModel;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoParams;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.business.market.features.holders.ui.detail.HolderDetailsParams;
import com.okinc.business.market.features.holders.ui.detail.model.AccountDetail;
import com.okinc.business.market.features.overview.ui.OverviewViewModel;
import com.okinc.business.market.features.trader.domain.model.Traders;
import com.okinc.business.market.features.trader.ui.TraderViewModel;
import com.okinc.business.market.features.trader.ui.model.TraderFragmentParams;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.InterfaceC27701kAd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kzF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29731kzF extends AbstractC29734kzI {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public hBT AhwBna;
    public final InterfaceC26310jZs AkhnZx;
    public C22620him DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public C27705kAh fetchVPNInfo;
    public final InterfaceC56387yDm isConnected;
    public final StateListAnimator valueOf;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.kzF$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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

    public C29731kzF() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.trader.ui.TraderFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.trader.ui.TraderFragment$special$$inlined$viewModels$default$2
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TraderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.trader.ui.TraderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.trader.ui.TraderFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.trader.ui.TraderFragment$special$$inlined$viewModels$default$5
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackingAddressViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.trader.ui.TraderFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.trader.ui.TraderFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.trader.ui.TraderFragment$special$$inlined$activityViewModels$default$3
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.trader.ui.TraderFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.trader.ui.TraderFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.trader.ui.TraderFragment$special$$inlined$activityViewModels$default$6
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.trader.ui.TraderFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.trader.ui.TraderFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.trader.ui.TraderFragment$special$$inlined$activityViewModels$default$9
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
        this.valueOf = new StateListAnimator();
        this.AkhnZx = new PendingIntent();
    }

    private final TraderFragmentParams AYXKKw() {
        TraderFragmentParams traderFragmentParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (traderFragmentParams = (TraderFragmentParams) BundleCompat.getParcelable(arguments, "key.trader_params", TraderFragmentParams.class)) == null) ? new TraderFragmentParams(null, null, null, null, null, false, null, null, 255, null) : traderFragmentParams;
    }

    private final TraderViewModel djBIcL() {
        return (TraderViewModel) this.values.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingAddressViewModel valueOf() {
        return (TrackingAddressViewModel) this.isConnected.getValue();
    }

    private final MarketCoinDetailViewModel gEmmrt() {
        return (MarketCoinDetailViewModel) this.AYXKKw.getValue();
    }

    private final OverviewViewModel AhwBna() {
        return (OverviewViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: renamed from: o.kzF$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC26009jOo {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC26009jOo
        public boolean EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C29731kzF.this.valueOf().KWHzl(str);
        }

        @Override // o.InterfaceC26009jOo
        public java.lang.String OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C29731kzF.this.valueOf().AEQbTJ(str);
        }

        @Override // o.InterfaceC26009jOo
        public java.lang.String AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C29731kzF.this.valueOf().OLrzqt(str);
        }
    }

    /* JADX INFO: renamed from: o.kzF$PendingIntent */
    public static final class PendingIntent implements InterfaceC26310jZs {
        public PendingIntent() {
        }

        @Override // o.InterfaceC26310jZs
        public void OLrzqt(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            FragmentActivity activity = C29731kzF.this.getActivity();
            C25352ivB.EZpvd(activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null, str, str2);
        }

        @Override // o.InterfaceC26310jZs
        public void EZpvd() {
            C29731kzF.this.EZpvd();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBT hbtAEQbTJ = hBT.AEQbTJ(layoutInflater, viewGroup, false);
        this.AhwBna = hbtAEQbTJ;
        if (hbtAEQbTJ != null) {
            return hbtAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fetchVPNInfo();
        values();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (djBIcL().valueOf().getValue() instanceof InterfaceC27701kAd.Activity) {
            djBIcL().djBIcL();
        }
        djBIcL().DbNXlk();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        djBIcL().fetchVPNInfo();
    }

    private final void fetchVPNInfo() {
        RecyclerView recyclerView;
        C29740kzO c29740kzOCopydefault = C29740kzO.Companion.copydefault(AYXKKw());
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        StateListAnimator stateListAnimator = this.valueOf;
        java.lang.Boolean value = djBIcL().AhwBna().getValue();
        C27705kAh c27705kAh = new C27705kAh(childFragmentManager, c29740kzOCopydefault, "tag.trader_header_fragment", stateListAnimator, value != null ? value.booleanValue() : false, djBIcL().gEmmrt().getValue().AEQbTJ(), AYXKKw().AEQbTJ(), new Function1() { // from class: o.kzR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29731kzF.copydefault(this.copydefault, (Traders) obj);
            }
        }, new Function1() { // from class: o.kzQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29731kzF.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        }, djBIcL().AYXKKw());
        this.fetchVPNInfo = c27705kAh;
        hBT hbt = this.AhwBna;
        if (hbt == null || (recyclerView = hbt.copydefault) == null) {
            return;
        }
        recyclerView.setAdapter(c27705kAh);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    public static final Unit copydefault(C29731kzF c29731kzF, Traders traders) {
        Intrinsics.checkNotNullParameter(traders, "");
        c29731kzF.OLrzqt(traders);
        java.lang.String strEZpvd = c29731kzF.AYXKKw().EZpvd();
        java.lang.String strKWHzl = c29731kzF.AYXKKw().KWHzl();
        java.lang.String strOLrzqt = c29731kzF.AYXKKw().OLrzqt();
        java.lang.String strAYXKKw = c29731kzF.AYXKKw().AYXKKw();
        java.lang.String strGEmmrt = c29731kzF.AYXKKw().gEmmrt();
        java.lang.String newProxyInstance = c29731kzF.gEmmrt().getNewProxyInstance();
        TokenDetailClickLayer tokenDetailClickLayer = TokenDetailClickLayer.COMPONENTS;
        C21847hOn.trackDexMarketTokenPageClick$default(strAYXKKw, strGEmmrt, strOLrzqt, strKWHzl, CoinDetailTabType.CHART, strEZpvd, null, null, ChartDetailFragment.Companion.SubChartTabType.TRADER, null, null, null, null, null, null, TokenDetailButtonName.TRADER_ADDRESS_DETAIL, null, newProxyInstance, tokenDetailClickLayer, null, null, c29731kzF.AhwBna().djBIcL(), 1670848, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C29731kzF c29731kzF, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C21951hSj.Companion.EZpvd(new HolderInfoParams(c29731kzF.AYXKKw().gEmmrt(), "DEXMarket_Token_Holders_AddressLabel_View", list)).show(c29731kzF.getChildFragmentManager(), C56524yIo.AEQbTJ(C21951hSj.class).valueOf());
        return Unit.INSTANCE;
    }

    private final void values() {
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().valueOf(), null, new Application(), 2, null);
        djBIcL().AhwBna().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.kzE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29731kzF.copydefault(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().gEmmrt(), null, new TaskDescription(), 2, null);
        valueOf().OLrzqt().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.kzK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29731kzF.OLrzqt(this.KWHzl, (java.lang.Long) obj);
            }
        }));
        gEmmrt().AkhnZx().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.kzL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29731kzF.AEQbTJ(this.copydefault, (InterfaceC22618hik) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o.kzF$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC27701kAd interfaceC27701kAd, Continuation<? super Unit> continuation) {
            if (interfaceC27701kAd instanceof InterfaceC27701kAd.Application) {
                C29731kzF.this.copydefault(((InterfaceC27701kAd.Application) interfaceC27701kAd).KWHzl());
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C29731kzF.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            } else if (Intrinsics.EZpvd(interfaceC27701kAd, InterfaceC27701kAd.ActionBar.KWHzl)) {
                C29731kzF.this.DbNXlk();
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C29731kzF.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            } else if (Intrinsics.EZpvd(interfaceC27701kAd, InterfaceC27701kAd.StateListAnimator.OLrzqt) || Intrinsics.EZpvd(interfaceC27701kAd, InterfaceC27701kAd.Activity.OLrzqt)) {
                C29731kzF.this.isConnected();
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit copydefault(C29731kzF c29731kzF, java.lang.Boolean bool) {
        C27705kAh c27705kAh = c29731kzF.fetchVPNInfo;
        if (c27705kAh != null) {
            Intrinsics.copydefault(bool);
            c27705kAh.EZpvd(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kzF$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C27721kAx c27721kAx, Continuation<? super Unit> continuation) {
            C27705kAh c27705kAh = C29731kzF.this.fetchVPNInfo;
            if (c27705kAh != null) {
                c27705kAh.KWHzl(c27721kAx.AEQbTJ());
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit OLrzqt(C29731kzF c29731kzF, java.lang.Long l) {
        if (c29731kzF.djBIcL().valueOf().getValue() instanceof InterfaceC27701kAd.StateListAnimator) {
            return Unit.INSTANCE;
        }
        if (l != null) {
            l.longValue();
            c29731kzF.djBIcL().djBIcL();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C29731kzF c29731kzF, InterfaceC22618hik interfaceC22618hik) {
        if (interfaceC22618hik instanceof C22620him) {
            if (c29731kzF.djBIcL().valueOf().getValue() instanceof InterfaceC27701kAd.Application) {
                c29731kzF.OLrzqt(((C22620him) interfaceC22618hik).EZpvd());
            } else {
                c29731kzF.DbNXlk = (C22620him) interfaceC22618hik;
            }
            c29731kzF.gEmmrt().KWHzl((InterfaceC22618hik) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        hBT hbt = this.AhwBna;
        if (hbt != null) {
            hbt.copydefault.setVisibility(8);
            hbt.EZpvd.setVisibility(8);
            hbt.KWHzl.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        hBT hbt = this.AhwBna;
        if (hbt != null) {
            hbt.copydefault.setVisibility(8);
            hbt.KWHzl.setVisibility(8);
            C55173xeu c55173xeu = hbt.EZpvd;
            c55173xeu.setVisibility(0);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.kzM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29731kzF.copydefault(this.copydefault, view);
                }
            });
        }
    }

    public static final void copydefault(C29731kzF c29731kzF, android.view.View view) {
        c29731kzF.djBIcL().djBIcL();
    }

    public final void copydefault(java.util.List<Traders> list) {
        hBT hbt = this.AhwBna;
        if (hbt != null) {
            hbt.copydefault.setVisibility(0);
            hbt.KWHzl.setVisibility(8);
            hbt.EZpvd.setVisibility(8);
        }
        C27721kAx value = djBIcL().gEmmrt().getValue();
        boolean z = (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) value.EZpvd()) ^ true) || !Intrinsics.EZpvd((java.lang.Object) value.KWHzl().copydefault(), (java.lang.Object) "");
        C27705kAh c27705kAh = this.fetchVPNInfo;
        if (c27705kAh != null) {
            c27705kAh.copydefault(z, new Function0() { // from class: o.kzG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29731kzF.DbNXlk(this.AEQbTJ);
                }
            });
        }
        C27705kAh c27705kAh2 = this.fetchVPNInfo;
        if (c27705kAh2 != null) {
            kLH.updateList$default(c27705kAh2, list, false, new Function0() { // from class: o.kzH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29731kzF.fetchVPNInfo(this.AEQbTJ);
                }
            }, 2, null);
        }
    }

    public static final Unit DbNXlk(C29731kzF c29731kzF) {
        c29731kzF.djBIcL().AkhnZx();
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C29731kzF c29731kzF) {
        C22620him c22620him = c29731kzF.DbNXlk;
        if (c22620him != null) {
            c29731kzF.OLrzqt(c22620him.EZpvd());
            c29731kzF.DbNXlk = null;
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(Traders traders) {
        hBT hbt;
        if (AYXKKw().AhwBna() && (hbt = this.AhwBna) != null) {
            java.lang.String strIsConnected = traders.isConnected();
            java.lang.String strAhwBna = traders.AhwBna();
            java.lang.String strAEQbTJ = valueOf().AEQbTJ(traders.isConnected());
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            C26309jZr c26309jZrAEQbTJ = C26309jZr.Companion.AEQbTJ(new HolderDetailsParams(strIsConnected, strAhwBna, AYXKKw().AEQbTJ(), C31256lqb.KWHzl(traders.KWHzl(), (Function0<java.lang.String>) new Function0() { // from class: o.kzN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29731kzF.AYXKKw(this.AEQbTJ);
                }
            }), C31256lqb.KWHzl(AYXKKw().AEQbTJ(), (Function0<java.lang.String>) new Function0() { // from class: o.kzJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29731kzF.AkhnZx(this.OLrzqt);
                }
            }), null, traders.copydefault(), traders.EZpvd(), strAEQbTJ, false, null, traders.AEQbTJ(), false, AccountDetail.TRADER_DETAIL, 1568, null), this.AkhnZx);
            hbt.copydefault.setVisibility(8);
            hbt.AYXKKw.setVisibility(0);
            getChildFragmentManager().beginTransaction().replace(hbt.AYXKKw.getId(), c26309jZrAEQbTJ, "tag.trader_details_fragment").commitAllowingStateLoss();
        }
    }

    public static final java.lang.String AYXKKw(C29731kzF c29731kzF) {
        jNY jnyOLrzqt = c29731kzF.djBIcL().OLrzqt();
        return java.lang.String.valueOf(jnyOLrzqt != null ? java.lang.Float.valueOf(jnyOLrzqt.copydefault()) : null);
    }

    public static final java.lang.String AkhnZx(C29731kzF c29731kzF) {
        jNY jnyOLrzqt = c29731kzF.djBIcL().OLrzqt();
        java.lang.String strAEQbTJ = jnyOLrzqt != null ? jnyOLrzqt.AEQbTJ() : null;
        return strAEQbTJ == null ? "" : strAEQbTJ;
    }

    public final void EZpvd() {
        hBT hbt = this.AhwBna;
        if (hbt != null) {
            AkhnZx();
            hbt.copydefault.setVisibility(0);
            hbt.AYXKKw.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AkhnZx();
    }

    private final void AkhnZx() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag;
        if (this.AhwBna == null || (fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("tag.trader_details_fragment")) == null) {
            return;
        }
        getChildFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commit();
    }

    /* JADX INFO: renamed from: o.kzF$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kzF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C29731kzF KWHzl(@NotNull TraderFragmentParams traderFragmentParams) {
            Intrinsics.checkNotNullParameter(traderFragmentParams, "");
            C29731kzF c29731kzF = new C29731kzF();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.trader_params", traderFragmentParams);
            c29731kzF.setArguments(bundle);
            return c29731kzF;
        }
    }
}
