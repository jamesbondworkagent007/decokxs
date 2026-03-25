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
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoParams;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.business.market.features.filter.ChartDetailSubTabName;
import com.okinc.business.market.features.filter.SharedFilterViewModel;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.history.ui.HistoryChangeViewModel;
import com.okinc.business.market.features.history.ui.models.HistoryChangeFragmentParams;
import com.okinc.business.market.features.overview.ui.OverviewViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.kLL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jXr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26255jXr extends AbstractC26251jXn<C23501hzS> {
    public boolean AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final Activity djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm isConnected;
    public jXR valueOf;
    public final InterfaceC56387yDm values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;

    /* JADX INFO: renamed from: o.jXr$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
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
    @Override // o.AbstractC21846hOm, o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.DGUQLI;
    }

    public C26255jXr() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$viewModels$default$2
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HistoryChangeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$viewModels$default$5
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackingAddressViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$3
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$6
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$9
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$12
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
        this.djBIcL = new Activity();
    }

    public final HistoryChangeFragmentParams djBIcL() {
        HistoryChangeFragmentParams historyChangeFragmentParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (historyChangeFragmentParams = (HistoryChangeFragmentParams) BundleCompat.getParcelable(arguments, "key.history_change_params", HistoryChangeFragmentParams.class)) == null) ? new HistoryChangeFragmentParams(null, null, null, null, null, null, null, 127, null) : historyChangeFragmentParams;
    }

    public final HistoryChangeViewModel AYXKKw() {
        return (HistoryChangeViewModel) this.values.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingAddressViewModel values() {
        return (TrackingAddressViewModel) this.DbNXlk.getValue();
    }

    private final OverviewViewModel AhwBna() {
        return (OverviewViewModel) this.isConnected.getValue();
    }

    private final SharedFilterViewModel AkhnZx() {
        return (SharedFilterViewModel) this.AkhnZx.getValue();
    }

    private final MarketCoinDetailViewModel fetchVPNInfo() {
        return (MarketCoinDetailViewModel) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: renamed from: o.jXr$Activity */
    public static final class Activity implements InterfaceC26009jOo {
        public Activity() {
        }

        @Override // o.InterfaceC26009jOo
        public boolean EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C26255jXr.this.values().KWHzl(str);
        }

        @Override // o.InterfaceC26009jOo
        public java.lang.String OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C26255jXr.this.values().AEQbTJ(str);
        }

        @Override // o.InterfaceC26009jOo
        public java.lang.String AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C26255jXr.this.values().OLrzqt(str);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C23501hzS KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C23501hzS c23501hzSKWHzl = C23501hzS.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23501hzSKWHzl, "");
        return c23501hzSKWHzl;
    }

    /* JADX INFO: renamed from: o.jXr$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C26274jYj c26274jYj, Continuation<? super Unit> continuation) {
            C26255jXr.this.OLrzqt(c26274jYj);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23501hzS c23501hzS, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c23501hzS, "");
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().fetchVPNInfo(), null, new ActionBar(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().copydefault(), null, new TaskDescription(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().AuCTel(), null, new Application(), 2, null);
        values().OLrzqt().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.jXt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26255jXr.KWHzl(this.OLrzqt, (java.lang.Long) obj);
            }
        }));
        AYXKKw().isConnected();
        AYXKKw().values().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.jXq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26255jXr.EZpvd(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        AYXKKw().OLrzqt().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.jXu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26255jXr.AEQbTJ(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        DbNXlk();
        AYXKKw().KWHzl(djBIcL().EZpvd(), djBIcL().AEQbTJ());
    }

    /* JADX INFO: renamed from: o.jXr$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<C26277jYm> list, Continuation<? super Unit> continuation) {
            C26255jXr.this.OLrzqt(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jXr$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<C26277jYm> list, Continuation<? super Unit> continuation) {
            C26255jXr.this.copydefault(list);
            return Unit.INSTANCE;
        }
    }

    public static final Unit KWHzl(C26255jXr c26255jXr, java.lang.Long l) {
        if (c26255jXr.AYXKKw().fetchVPNInfo().getValue().OLrzqt()) {
            return Unit.INSTANCE;
        }
        if (l != null) {
            l.longValue();
            jXR jxr = c26255jXr.valueOf;
            if (jxr != null) {
                jxr.valueOf();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C26255jXr c26255jXr, java.lang.Boolean bool) {
        jXR jxr = c26255jXr.valueOf;
        if (jxr != null) {
            Intrinsics.copydefault(bool);
            jxr.OLrzqt(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C26255jXr c26255jXr, java.lang.Boolean bool) {
        jXR jxr = c26255jXr.valueOf;
        if (jxr != null) {
            Intrinsics.copydefault(bool);
            jxr.EZpvd(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DbNXlk() {
        RecyclerView recyclerView;
        jXH jxhOLrzqt = jXH.Companion.OLrzqt(djBIcL());
        java.lang.Boolean value = AYXKKw().OLrzqt().getValue();
        boolean zBooleanValue = value != null ? value.booleanValue() : false;
        java.lang.Boolean value2 = AYXKKw().values().getValue();
        boolean zBooleanValue2 = value2 != null ? value2.booleanValue() : false;
        Function1 function1 = new Function1() { // from class: o.jXw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26255jXr.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        };
        Activity activity = this.djBIcL;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        this.valueOf = new jXR(zBooleanValue, zBooleanValue2, function1, activity, childFragmentManager, jxhOLrzqt, "tag.history_header_fragment", new Function1() { // from class: o.jXx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26255jXr.copydefault(this.EZpvd, (java.util.List) obj);
            }
        });
        C23501hzS c23501hzS = (C23501hzS) aX_();
        if (c23501hzS == null || (recyclerView = c23501hzS.KWHzl) == null) {
            return;
        }
        recyclerView.setAdapter(this.valueOf);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        recyclerView.addOnScrollListener(new LoaderManager());
    }

    public static final Unit OLrzqt(C26255jXr c26255jXr, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c26255jXr.OLrzqt(str, c26255jXr.djBIcL().EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C26255jXr c26255jXr, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C21951hSj.Companion.EZpvd(new HolderInfoParams(c26255jXr.djBIcL().djBIcL(), "DEXMarket_Token_Holders_AddressLabel_View", list)).show(c26255jXr.getChildFragmentManager(), C56524yIo.AEQbTJ(C21951hSj.class).valueOf());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.jXr$LoaderManager */
    public static final class LoaderManager extends RecyclerView.OnScrollListener {
        public LoaderManager() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            java.util.List<C26277jYm> listDjBIcL;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            jXR jxr = C26255jXr.this.valueOf;
            int size = (jxr == null || (listDjBIcL = jxr.djBIcL()) == null) ? 0 : listDjBIcL.size();
            boolean z = C26255jXr.this.AYXKKw().fetchVPNInfo().getValue().OLrzqt() || C26255jXr.this.AYXKKw().fetchVPNInfo().getValue().AYXKKw();
            if (!C26255jXr.this.AYXKKw().fetchVPNInfo().getValue().copydefault() || z || size <= 0 || size > iFindLastVisibleItemPosition + 4) {
                return;
            }
            C26255jXr.this.isConnected();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C26255jXr.this.AYXKKw = false;
            } else if (i == 1 || i == 2) {
                C26255jXr.this.AYXKKw = true;
            }
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.AYXKKw = false;
        if (AYXKKw().fetchVPNInfo().getValue().AEQbTJ()) {
            AYXKKw().AEQbTJ("");
            AYXKKw().KWHzl(djBIcL().EZpvd(), djBIcL().AEQbTJ());
        } else {
            HistoryChangeViewModel.subscribeWs$default(AYXKKw(), null, 1, null);
        }
        AYXKKw().AEQbTJ();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AYXKKw().ejfBZ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AYXKKw().ejfBZ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        C26277jYm c26277jYm;
        java.lang.String strAEQbTJ;
        java.util.List<C26277jYm> value = AYXKKw().copydefault().getValue();
        if (value == null || (c26277jYm = (C26277jYm) CollectionsKt___CollectionsKt.wlaJM(value)) == null || (strAEQbTJ = c26277jYm.AEQbTJ()) == null) {
            return;
        }
        jXR jxr = this.valueOf;
        java.util.List<C26277jYm> listDjBIcL = jxr != null ? jxr.djBIcL() : null;
        if (listDjBIcL != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
            java.util.Iterator<T> it = listDjBIcL.iterator();
            while (it.hasNext()) {
                arrayList2.add(new kLL.Activity((C26277jYm) it.next()));
            }
            arrayList.addAll(arrayList2);
            arrayList.add(kLL.FragmentManager.EZpvd);
            jXR jxr2 = this.valueOf;
            if (jxr2 != null) {
                jxr2.submitList(arrayList);
            }
        }
        AYXKKw().AEQbTJ(strAEQbTJ);
    }

    public final void gEmmrt() {
        jXR jxr = this.valueOf;
        java.util.ArrayList arrayList = null;
        java.lang.Iterable currentList = jxr != null ? jxr.getCurrentList() : null;
        jXR jxr2 = this.valueOf;
        if (jxr2 != null) {
            if (currentList != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : currentList) {
                    if (!(((kLL) obj) instanceof kLL.FragmentManager)) {
                        arrayList.add(obj);
                    }
                }
            }
            jxr2.submitList(arrayList);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z, boolean z2) {
        C55173xeu c55173xeu;
        C23501hzS c23501hzS = (C23501hzS) aX_();
        if (c23501hzS == null || (c55173xeu = c23501hzS.OLrzqt) == null) {
            return;
        }
        c55173xeu.setVisibility(z ? 0 : 8);
        if (z) {
            if (z2) {
                c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.fmdvVn));
                c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.scanPackages));
                c55173xeu.setEmptyTypeImage(6);
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jXy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C26255jXr.copydefault(this.copydefault, view);
                    }
                });
                return;
            }
            c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jXz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C26255jXr.KWHzl(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final void copydefault(C26255jXr c26255jXr, android.view.View view) {
        HistoryChangeViewModel.updateFilter$default(c26255jXr.AYXKKw(), null, null, new TokenFilter(null, null, null, null, null, false, false, null, false, false, null, null, null, 8191, null), 3, null);
    }

    public static final void KWHzl(C26255jXr c26255jXr, android.view.View view) {
        c26255jXr.AYXKKw().AEQbTJ("");
        c26255jXr.AYXKKw().KWHzl(c26255jXr.djBIcL().EZpvd(), c26255jXr.djBIcL().AEQbTJ());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(C26274jYj c26274jYj) {
        C23501hzS c23501hzS = (C23501hzS) aX_();
        if (c23501hzS != null) {
            C55113xdn c55113xdn = c23501hzS.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            int i = 8;
            c55113xdn.setVisibility(c26274jYj.OLrzqt() ? 0 : 8);
            RecyclerView recyclerView = c23501hzS.KWHzl;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            if (!c26274jYj.OLrzqt() && c26274jYj.EZpvd() == null) {
                i = 0;
            }
            recyclerView.setVisibility(i);
            EZpvd(c26274jYj.EZpvd() != null, false);
            if (c26274jYj.KWHzl()) {
                gEmmrt();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(java.util.List<C26277jYm> list) {
        jXR jxr;
        if (list != null) {
            EZpvd(list.isEmpty(), true);
            jNY jnyAYXKKw = AYXKKw().AYXKKw();
            if (jnyAYXKKw != null && (jxr = this.valueOf) != null) {
                jxr.KWHzl(jnyAYXKKw);
            }
            TokenFilter tokenFilterGEmmrt = AYXKKw().gEmmrt();
            boolean zEZpvd = Intrinsics.EZpvd(tokenFilterGEmmrt.OLrzqt((6143 & 1) != 0 ? tokenFilterGEmmrt.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterGEmmrt.isConnected : null, (6143 & 4) != 0 ? tokenFilterGEmmrt.AkhnZx : AYXKKw().EZpvd().DbNXlk(), (6143 & 8) != 0 ? tokenFilterGEmmrt.AhwBna : null, (6143 & 16) != 0 ? tokenFilterGEmmrt.KWHzl : null, (6143 & 32) != 0 ? tokenFilterGEmmrt.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterGEmmrt.valueOf : false, (6143 & 128) != 0 ? tokenFilterGEmmrt.EZpvd : null, (6143 & 256) != 0 ? tokenFilterGEmmrt.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterGEmmrt.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterGEmmrt.copydefault : null, (6143 & 2048) != 0 ? tokenFilterGEmmrt.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterGEmmrt.fetchVPNInfo : null), AYXKKw().EZpvd());
            jXR jxr2 = this.valueOf;
            if (jxr2 != null) {
                jxr2.AEQbTJ(!zEZpvd, new Function0() { // from class: o.jXB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C26255jXr.AhwBna(this.AEQbTJ);
                    }
                });
            }
            this.AYXKKw = false;
            jXR jxr3 = this.valueOf;
            if (jxr3 != null) {
                kLH.updateList$default(jxr3, list, false, new Function0() { // from class: o.jXD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C26255jXr.djBIcL(this.KWHzl);
                    }
                }, 2, null);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public static final Unit AhwBna(C26255jXr c26255jXr) {
        HistoryChangeViewModel.updateFilter$default(c26255jXr.AYXKKw(), null, new C26211jWa(0, null, null, 7, null), c26255jXr.AYXKKw().gEmmrt(), 1, null);
        c26255jXr.AkhnZx().AEQbTJ(ChartDetailSubTabName.HISTORY_CHANGE);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C26255jXr c26255jXr) {
        c26255jXr.AYXKKw = false;
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(java.util.List<C26277jYm> list) {
        java.util.List<C26277jYm> listAhwBna;
        RecyclerView recyclerView;
        if (list.isEmpty() || this.AYXKKw) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (OLrzqt((C26277jYm) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            HistoryChangeViewModel historyChangeViewModelAYXKKw = AYXKKw();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C26277jYm) it.next()).AEQbTJ());
            }
            historyChangeViewModelAYXKKw.AEQbTJ(arrayList2);
            return;
        }
        C23501hzS c23501hzS = (C23501hzS) aX_();
        RecyclerView.LayoutManager layoutManager = (c23501hzS == null || (recyclerView = c23501hzS.KWHzl) == null) ? null : recyclerView.getLayoutManager();
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        jXR jxr = this.valueOf;
        if (jxr == null || (listAhwBna = jxr.djBIcL()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList, (java.lang.Iterable) listAhwBna);
        jXR jxr2 = this.valueOf;
        if (jxr2 != null) {
            kLH.updateList$default(jxr2, listDjBIcL, false, new Function0() { // from class: o.jXv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C26255jXr.copydefault(linearLayoutManager, this);
                }
            }, 2, null);
        }
        HistoryChangeViewModel historyChangeViewModelAYXKKw2 = AYXKKw();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C26277jYm) it2.next()).AEQbTJ());
        }
        historyChangeViewModelAYXKKw2.AEQbTJ(arrayList3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(LinearLayoutManager linearLayoutManager, C26255jXr c26255jXr) {
        C23501hzS c23501hzS;
        RecyclerView recyclerView;
        if ((linearLayoutManager == null || linearLayoutManager.findFirstVisibleItemPosition() == 0) && (c23501hzS = (C23501hzS) c26255jXr.aX_()) != null && (recyclerView = c23501hzS.KWHzl) != null) {
            recyclerView.scrollToPosition(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r3 <= r7) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OLrzqt(C26277jYm c26277jYm) {
        TokenFilter tokenFilterEZpvd = AYXKKw().EZpvd();
        if (tokenFilterEZpvd.gEmmrt() && tokenFilterEZpvd.valueOf().OLrzqt().length() > 0) {
            java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(c26277jYm.gEmmrt());
            if (fieldNames != null) {
                long jLongValue = fieldNames.longValue();
                java.lang.Long fieldNames2 = StringsKt__StringNumberConversionsKt.getFieldNames(tokenFilterEZpvd.valueOf().OLrzqt());
                long jLongValue2 = fieldNames2 != null ? fieldNames2.longValue() : 0L;
                java.lang.Long fieldNames3 = StringsKt__StringNumberConversionsKt.getFieldNames(tokenFilterEZpvd.valueOf().EZpvd());
                long jLongValue3 = fieldNames3 != null ? fieldNames3.longValue() : Long.MAX_VALUE;
                if (jLongValue >= jLongValue2) {
                }
            }
            return false;
        }
        if (tokenFilterEZpvd.DbNXlk().length() > 0) {
            java.lang.String strIsConnected = c26277jYm.isConnected();
            TxType txType = TxType.BUY;
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) txType.getValue());
            java.lang.String strDbNXlk = tokenFilterEZpvd.DbNXlk();
            if (Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) txType.getValue())) {
                if (!zEZpvd) {
                    return false;
                }
            } else if (Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) TxType.SELL.getValue()) && zEZpvd) {
                return false;
            }
        }
        if (!tokenFilterEZpvd.OLrzqt().isEmpty()) {
            java.lang.String lowerCase = c26277jYm.AYXKKw().toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.util.List<java.lang.String> listOLrzqt = tokenFilterEZpvd.OLrzqt();
            if (!(listOLrzqt instanceof java.util.Collection) || !listOLrzqt.isEmpty()) {
                java.util.Iterator<T> it = listOLrzqt.iterator();
                while (it.hasNext()) {
                    java.lang.String lowerCase2 = ((java.lang.String) it.next()).toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) lowerCase2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: o.jXr$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jXr.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C26255jXr AEQbTJ(@NotNull HistoryChangeFragmentParams historyChangeFragmentParams) {
            Intrinsics.checkNotNullParameter(historyChangeFragmentParams, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.history_change_params", historyChangeFragmentParams);
            C26255jXr c26255jXr = new C26255jXr();
            c26255jXr.setArguments(bundle);
            return c26255jXr;
        }
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        FragmentActivity activity = getActivity();
        C25352ivB.EZpvd(activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null, str, str2);
        java.lang.String strOLrzqt = djBIcL().OLrzqt();
        java.lang.String strKWHzl = djBIcL().KWHzl();
        java.lang.String strEZpvd = djBIcL().EZpvd();
        C21847hOn.trackDexMarketTokenPageClick$default(djBIcL().AEQbTJ(), djBIcL().djBIcL(), strEZpvd, strKWHzl, CoinDetailTabType.CHART, strOLrzqt, null, null, ChartDetailFragment.Companion.SubChartTabType.HISTORY, null, null, null, null, null, null, TokenDetailButtonName.ACTIVITIES_DETAIL, null, fetchVPNInfo().getNewProxyInstance(), TokenDetailClickLayer.COMPONENTS, null, null, AhwBna().djBIcL(), 1670848, null);
    }
}
