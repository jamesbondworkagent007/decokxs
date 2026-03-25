package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.LinearLayoutCompat;
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
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoParams;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.business.market.features.filter.SharedFilterViewModel;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.filter.ui.CommonTrackData;
import com.okinc.business.market.features.filter.ui.FilterAction;
import com.okinc.business.market.features.filter.ui.FilterBottomSheetParams;
import com.okinc.business.market.features.filter.ui.FilterSheetTrackParams;
import com.okinc.business.market.features.history.ui.HistoryChangeViewModel;
import com.okinc.business.market.features.history.ui.HistoryHeaderFragment$updateFilterIcon$1;
import com.okinc.business.market.features.history.ui.HistoryHeaderFragment$updateFilterTags$1$1;
import com.okinc.business.market.features.history.ui.models.HistoryChangeFragmentParams;
import com.okinc.business.market.features.overview.ui.OverviewViewModel;
import com.okinc.business.market.features.tag.ui.TagViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C32113mPz;
import o.C52761wXj;
import o.C57406yhn;
import o.jUM;
import o.jUZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jXH extends AbstractC26256jXs implements jUZ {
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public C21469hAn valueOf;

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TxType.values().length];
            try {
                iArr[TxType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TxType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    @Override // o.jUZ
    public void AEQbTJ(@NotNull FilterAction filterAction, @NotNull TokenFilter tokenFilter) {
        jUZ.TaskDescription.AEQbTJ(this, filterAction, tokenFilter);
    }

    public jXH() {
        final Function0 function0 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$3
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$6
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$9
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TagViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$12
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
        final Function0 function02 = new Function0() { // from class: o.jXI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jXH.AhwBna(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HistoryChangeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$viewModels$default$3
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.history.ui.HistoryHeaderFragment$special$$inlined$viewModels$default$4
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HistoryChangeFragmentParams AhwBna() {
        HistoryChangeFragmentParams historyChangeFragmentParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (historyChangeFragmentParams = (HistoryChangeFragmentParams) BundleCompat.getParcelable(arguments, "key.history_change_params", HistoryChangeFragmentParams.class)) == null) ? new HistoryChangeFragmentParams(null, null, null, null, null, null, null, 127, null) : historyChangeFragmentParams;
    }

    public final C21469hAn djBIcL() {
        C21469hAn c21469hAn = this.valueOf;
        Intrinsics.copydefault(c21469hAn);
        return c21469hAn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedFilterViewModel isConnected() {
        return (SharedFilterViewModel) this.gEmmrt.getValue();
    }

    private final MarketCoinDetailViewModel AYXKKw() {
        return (MarketCoinDetailViewModel) this.AYXKKw.getValue();
    }

    private final OverviewViewModel gEmmrt() {
        return (OverviewViewModel) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TagViewModel values() {
        return (TagViewModel) this.DbNXlk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HistoryChangeViewModel fetchVPNInfo() {
        return (HistoryChangeViewModel) this.fetchVPNInfo.getValue();
    }

    public static final ViewModelStoreOwner AhwBna(jXH jxh) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = jxh.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.valueOf = C21469hAn.EZpvd(layoutInflater, viewGroup, false);
        LinearLayoutCompat root = djBIcL().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        DbNXlk();
        AkhnZx();
        view.post(new java.lang.Runnable() { // from class: o.jXK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                jXH.AYXKKw(this.copydefault);
            }
        });
    }

    public static final void AYXKKw(jXH jxh) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jxh, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (fetchVPNInfo().AkhnZx().isEmpty()) {
            fetchVPNInfo().fIwbmz();
        }
    }

    private final void DbNXlk() {
        final C21469hAn c21469hAnDjBIcL = djBIcL();
        C55052xcf c55052xcf = c21469hAnDjBIcL.AEQbTJ;
        java.lang.String string = getString(C23274hvD.Fragment.r8lambdahrfbBpVkizzQbtGmrw6DTx0hH1A);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55052xcf.setTitle(string);
        C55052xcf c55052xcf2 = c21469hAnDjBIcL.KWHzl;
        java.lang.String string2 = getString(C23274hvD.Fragment.createFullyDrawnExecutor);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55052xcf2.setTitle(string2);
        valueOf();
        c21469hAnDjBIcL.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.jXL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jXH.copydefault(this.EZpvd, view);
            }
        });
        C55258xgZ c55258xgZ = c21469hAnDjBIcL.djBIcL;
        c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, this));
        c21469hAnDjBIcL.AYXKKw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.jXO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                jXH.copydefault(this.copydefault, c21469hAnDjBIcL, compoundButton, z);
            }
        });
        C25352ivB.setOnDoubleCheckClickListener$default(c21469hAnDjBIcL.OLrzqt, 0L, new Function1() { // from class: o.jXN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jXH.gEmmrt(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final void copydefault(jXH jxh, android.view.View view) {
        jxh.fetchVPNInfo().AEQbTJ(!(jxh.fetchVPNInfo().values().getValue() != null ? r1.booleanValue() : false));
    }

    public static final void copydefault(jXH jxh, C21469hAn c21469hAn, android.widget.CompoundButton compoundButton, boolean z) {
        if (z) {
            java.lang.String strCopydefault = jxh.AhwBna().copydefault();
            SwitchCompat switchCompat = c21469hAn.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(switchCompat, "");
            C28068kNs.AEQbTJ(switchCompat, strCopydefault);
        } else {
            c21469hAn.AYXKKw.setThumbDrawable(C33070mpX.KWHzl(C57406yhn.Activity.DTwDnp));
        }
        jxh.fetchVPNInfo().OLrzqt(z);
        trackPageClick$default(jxh, TokenDetailButtonName.SUBTABS_CURRENCY_MODE, null, java.lang.Boolean.valueOf(z), 2, null);
    }

    public static final Unit gEmmrt(jXH jxh, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        jxh.fJNWhG();
        return Unit.INSTANCE;
    }

    private final void AkhnZx() {
        fetchVPNInfo().values().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.jXP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jXH.EZpvd(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        fetchVPNInfo().OLrzqt().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.jXQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jXH.copydefault(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        fetchVPNInfo().KWHzl().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.jXG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jXH.OLrzqt(this.copydefault, (TokenFilter) obj);
            }
        }));
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().AhwBna(), null, new Application(), 2, null);
    }

    public static final Unit EZpvd(jXH jxh, java.lang.Boolean bool) {
        Intrinsics.copydefault(bool);
        jxh.AEQbTJ(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(jXH jxh, java.lang.Boolean bool) {
        jxh.djBIcL().AYXKKw.setChecked(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(jXH jxh, TokenFilter tokenFilter) {
        Intrinsics.copydefault(tokenFilter);
        jxh.AEQbTJ(tokenFilter);
        return Unit.INSTANCE;
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<C26211jWa> list, Continuation<? super Unit> continuation) {
            jXH.this.EZpvd(list);
            return Unit.INSTANCE;
        }
    }

    public final void EZpvd(final java.util.List<C26211jWa> list) {
        C55052xcf c55052xcf = djBIcL().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55052xcf, "");
        c55052xcf.setVisibility(list.size() > 1 ? 0 : 8);
        if (list.isEmpty()) {
            return;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(djBIcL().AEQbTJ, 0L, new Function1() { // from class: o.jXJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jXH.KWHzl(this.OLrzqt, list, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(jXH jxh, java.util.List list, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (!jxh.isAdded() || jxh.getChildFragmentManager().isStateSaved()) {
            return Unit.INSTANCE;
        }
        view.setSelected(true);
        LifecycleOwner viewLifecycleOwner = jxh.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new HistoryHeaderFragment$updateFilterTags$1$1(list, jxh, view, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ jXH copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, jXH jxh) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = jxh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                jXH.trackPageClick$default(this.copydefault, TokenDetailButtonName.SUBTABS_ADDRESS_EXPLANATION, ChartDetailFragment.Companion.SubChartTabType.HISTORY, null, 4, null);
                C21951hSj.Companion.EZpvd(new HolderInfoParams(this.copydefault.AhwBna().djBIcL(), "DEXMarket_Token_History_AddressLabel_View", null, 4, null)).show(this.copydefault.getChildFragmentManager(), C56524yIo.AEQbTJ(C21951hSj.class).valueOf());
            }
        }
    }

    private final void AEQbTJ(boolean z) {
        android.widget.ImageView imageView = djBIcL().copydefault;
        imageView.setImageResource(z ? C32113mPz.TaskDescription.EZpvd : C52761wXj.TaskDescription.UhxbNG);
        imageView.setColorFilter(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
    }

    public final void valueOf() {
        C25352ivB.setOnDoubleCheckClickListener$default(djBIcL().KWHzl, 0L, new Function1() { // from class: o.jXF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jXH.EZpvd(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(final jXH jxh, final android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (!jxh.isAdded() || jxh.getChildFragmentManager().isStateSaved()) {
            return Unit.INSTANCE;
        }
        view.setSelected(true);
        C26272jYh.Companion.EZpvd(TxType.Companion.OLrzqt(jxh.fetchVPNInfo().DbNXlk().getValue()), jxh.AhwBna().djBIcL(), new Function1() { // from class: o.jXM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jXH.OLrzqt(view, jxh, (TxType) obj);
            }
        }).show(jxh.getChildFragmentManager(), C56524yIo.AEQbTJ(C26272jYh.class).valueOf());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.view.View view, jXH jxh, TxType txType) {
        view.setSelected(false);
        if (txType != null) {
            HistoryChangeViewModel.updateFilter$default(jxh.fetchVPNInfo(), txType, null, null, 6, null);
            jxh.EZpvd(txType);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(TxType txType) {
        java.lang.String string;
        C55052xcf c55052xcf = djBIcL().KWHzl;
        int i = StateListAnimator.AEQbTJ[txType.ordinal()];
        if (i == 1) {
            string = getString(C23274hvD.Fragment.ComponentActivityExternalSyntheticLambda3);
        } else if (i == 2) {
            string = getString(C23274hvD.Fragment.ComponentActivity21);
        } else {
            string = getString(C23274hvD.Fragment.createFullyDrawnExecutor);
        }
        Intrinsics.copydefault((java.lang.Object) string);
        c55052xcf.setTitle(string);
    }

    private final void fJNWhG() {
        if (isAdded() && !getChildFragmentManager().isStateSaved() && getChildFragmentManager().findFragmentByTag("tag.FilterBottomSheet") == null) {
            jUM.StateListAnimator stateListAnimator = jUM.Companion;
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.lambdanew2);
            java.util.List<PriceRangeFilter> listAkhnZx = fetchVPNInfo().AkhnZx();
            TokenFilter tokenFilterGEmmrt = fetchVPNInfo().gEmmrt();
            TokenFilter tokenFilterEZpvd = fetchVPNInfo().EZpvd();
            stateListAnimator.KWHzl(new FilterBottomSheetParams(strAYXKKw, null, listAkhnZx, null, tokenFilterGEmmrt, tokenFilterEZpvd.OLrzqt((6143 & 1) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (6143 & 4) != 0 ? tokenFilterEZpvd.AkhnZx : "", (6143 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (6143 & 16) != 0 ? tokenFilterEZpvd.KWHzl : null, (6143 & 32) != 0 ? tokenFilterEZpvd.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterEZpvd.valueOf : false, (6143 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (6143 & 256) != 0 ? tokenFilterEZpvd.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterEZpvd.copydefault : null, (6143 & 2048) != 0 ? tokenFilterEZpvd.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null), AhwBna().djBIcL(), AhwBna().KWHzl(), new FilterSheetTrackParams("DEXMarket_Token_HistoryFilter_Custom_Click", new CommonTrackData("DEXMarket_Token_History_Filter_View", "token_symbol", AhwBna().djBIcL())), null, null, null, null, false, false, false, true, 65034, null)).show(getChildFragmentManager(), "tag.FilterBottomSheet");
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jXH.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final jXH OLrzqt(@NotNull HistoryChangeFragmentParams historyChangeFragmentParams) {
            Intrinsics.checkNotNullParameter(historyChangeFragmentParams, "");
            jXH jxh = new jXH();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.history_change_params", historyChangeFragmentParams);
            jxh.setArguments(bundle);
            return jxh;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C21469hAn c21469hAn = this.valueOf;
        if (c21469hAn != null) {
            c21469hAn.gEmmrt.setOnClickListener(null);
            c21469hAn.djBIcL.setOnClickListener(null);
            c21469hAn.AYXKKw.setOnCheckedChangeListener(null);
            c21469hAn.OLrzqt.setOnClickListener(null);
            c21469hAn.AEQbTJ.setOnClickListener(null);
            c21469hAn.KWHzl.setOnClickListener(null);
        }
        OLrzqt();
        super.onDestroyView();
        this.valueOf = null;
    }

    public final void OLrzqt() {
        if (getChildFragmentManager().isStateSaved() || getChildFragmentManager().isDestroyed()) {
            return;
        }
        java.util.Iterator it = yDY.gEmmrt(C56524yIo.AEQbTJ(C21951hSj.class).valueOf(), "DexSelectionBottomSheet", C56524yIo.AEQbTJ(C26272jYh.class).valueOf(), "tag.FilterBottomSheet").iterator();
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

    @Override // o.jUZ
    public void KWHzl(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        HistoryChangeViewModel.updateFilter$default(fetchVPNInfo(), null, null, tokenFilter, 3, null);
    }

    private final void AEQbTJ(TokenFilter tokenFilter) {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HistoryHeaderFragment$updateFilterIcon$1(tokenFilter, this, null), 3, null);
    }

    public static /* synthetic */ void trackPageClick$default(jXH jxh, TokenDetailButtonName tokenDetailButtonName, ChartDetailFragment.Companion.SubChartTabType subChartTabType, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            subChartTabType = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        jxh.AEQbTJ(tokenDetailButtonName, subChartTabType, bool);
    }

    private final void AEQbTJ(TokenDetailButtonName tokenDetailButtonName, ChartDetailFragment.Companion.SubChartTabType subChartTabType, java.lang.Boolean bool) {
        java.lang.String strOLrzqt = AhwBna().OLrzqt();
        java.lang.String strKWHzl = AhwBna().KWHzl();
        java.lang.String strEZpvd = AhwBna().EZpvd();
        C21847hOn.trackDexMarketTokenPageClick$default(AhwBna().AEQbTJ(), AhwBna().djBIcL(), strEZpvd, strKWHzl, CoinDetailTabType.CHART, strOLrzqt, null, null, ChartDetailFragment.Companion.SubChartTabType.HISTORY, null, null, null, null, null, null, tokenDetailButtonName, null, AYXKKw().getNewProxyInstance(), TokenDetailClickLayer.COMPONENTS, bool, subChartTabType, gEmmrt().djBIcL(), 97984, null);
    }
}
