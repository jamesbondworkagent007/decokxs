package o;

import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.dexkline.dexlogic.main.market.detail.TrackingAddressViewModel;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoParams;
import com.okinc.dexkline.market.features.coindetail.ui.label.LabelFilter;
import com.okinc.dexkline.market.features.filter.ChartDetailSubTabName;
import com.okinc.dexkline.market.features.filter.SharedFilterViewModel;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.history.ui.HistoryChangeViewModel;
import com.okinc.dexkline.market.features.history.ui.models.HistoryChangeFragmentParams;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C35964oKf;
import o.InterfaceC34593ney;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mZz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32383mZz extends AbstractC32379mZv<oNF> {
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public boolean djBIcL;
    public C34364nag gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final ActionBar valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.mZz$PendingIntent */
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
    @Override // o.mRH, o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.DGgnkA;
    }

    public C32383mZz() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryChangeFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryChangeFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HistoryChangeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryChangeFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryChangeFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryChangeFragment$special$$inlined$viewModels$default$5
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackingAddressViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$3
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryChangeFragment$special$$inlined$activityViewModels$default$6
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
        this.valueOf = new ActionBar();
    }

    public final HistoryChangeFragmentParams AYXKKw() {
        HistoryChangeFragmentParams historyChangeFragmentParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (historyChangeFragmentParams = (HistoryChangeFragmentParams) BundleCompat.getParcelable(arguments, "key.history_change_params", HistoryChangeFragmentParams.class)) == null) ? new HistoryChangeFragmentParams(null, null, null, null, null, null, 63, null) : historyChangeFragmentParams;
    }

    public final HistoryChangeViewModel gEmmrt() {
        return (HistoryChangeViewModel) this.DbNXlk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingAddressViewModel djBIcL() {
        return (TrackingAddressViewModel) this.AkhnZx.getValue();
    }

    private final SharedFilterViewModel valueOf() {
        return (SharedFilterViewModel) this.isConnected.getValue();
    }

    /* JADX INFO: renamed from: o.mZz$ActionBar */
    public static final class ActionBar implements mWN {
        public ActionBar() {
        }

        @Override // o.mWN
        public boolean AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C32383mZz.this.djBIcL().KWHzl(str);
        }

        @Override // o.mWN
        public java.lang.String EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C32383mZz.this.djBIcL().AEQbTJ(str);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.mRH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public oNF KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        oNF onfEZpvd = oNF.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(onfEZpvd, "");
        return onfEZpvd;
    }

    /* JADX INFO: renamed from: o.mZz$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C34374naq c34374naq, Continuation<? super Unit> continuation) {
            C32383mZz.this.KWHzl(c34374naq);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.mRH
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull oNF onf, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(onf, "");
        mUN.collectOnViewLifecycle$default(this, gEmmrt().values(), null, new TaskDescription(), 2, null);
        mUN.collectOnViewLifecycle$default(this, gEmmrt().AEQbTJ(), null, new Application(), 2, null);
        mUN.collectOnViewLifecycle$default(this, gEmmrt().AuCTel(), null, new StateListAnimator(), 2, null);
        gEmmrt().AhwBna().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.mZC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32383mZz.EZpvd(this.EZpvd, (mWC) obj);
            }
        }));
        djBIcL().AEQbTJ().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.mZB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32383mZz.copydefault(this.KWHzl, (java.lang.Long) obj);
            }
        }));
        gEmmrt().fetchVPNInfo();
        gEmmrt().DbNXlk().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.mZG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32383mZz.KWHzl(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        gEmmrt().copydefault().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.mZH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32383mZz.copydefault(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        DbNXlk();
    }

    /* JADX INFO: renamed from: o.mZz$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<C34371nan> list, Continuation<? super Unit> continuation) {
            C32383mZz.this.AEQbTJ(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.mZz$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<C34371nan> list, Continuation<? super Unit> continuation) {
            C32383mZz.this.copydefault(list);
            return Unit.INSTANCE;
        }
    }

    public static final Unit EZpvd(C32383mZz c32383mZz, mWC mwc) {
        C34364nag c34364nag = c32383mZz.gEmmrt;
        if (c34364nag != null) {
            Intrinsics.copydefault(mwc);
            c34364nag.KWHzl(mwc);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C32383mZz c32383mZz, java.lang.Long l) {
        if (c32383mZz.gEmmrt().values().getValue().OLrzqt()) {
            return Unit.INSTANCE;
        }
        if (l != null) {
            l.longValue();
            C34364nag c34364nag = c32383mZz.gEmmrt;
            if (c34364nag != null) {
                c34364nag.copydefault();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C32383mZz c32383mZz, java.lang.Boolean bool) {
        C34364nag c34364nag = c32383mZz.gEmmrt;
        if (c34364nag != null) {
            Intrinsics.copydefault(bool);
            c34364nag.EZpvd(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C32383mZz c32383mZz, java.lang.Boolean bool) {
        C34364nag c34364nag = c32383mZz.gEmmrt;
        if (c34364nag != null) {
            Intrinsics.copydefault(bool);
            c34364nag.AEQbTJ(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DbNXlk() {
        RecyclerView recyclerView;
        mZQ mzqCopydefault = mZQ.Companion.copydefault(AYXKKw());
        java.lang.Boolean value = gEmmrt().copydefault().getValue();
        boolean zBooleanValue = value != null ? value.booleanValue() : false;
        java.lang.Boolean value2 = gEmmrt().DbNXlk().getValue();
        boolean zBooleanValue2 = value2 != null ? value2.booleanValue() : false;
        Function1 function1 = new Function1() { // from class: o.mZK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32383mZz.AEQbTJ((java.lang.String) obj);
            }
        };
        ActionBar actionBar = this.valueOf;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        this.gEmmrt = new C34364nag(zBooleanValue, zBooleanValue2, function1, actionBar, childFragmentManager, mzqCopydefault, "tag.history_header_fragment", new Function1() { // from class: o.mZD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32383mZz.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
            }
        });
        oNF onf = (oNF) KWHzl();
        if (onf == null || (recyclerView = onf.EZpvd) == null) {
            return;
        }
        recyclerView.setAdapter(this.gEmmrt);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        recyclerView.addOnScrollListener(new Fragment());
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C32383mZz c32383mZz, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        mTY.Companion.EZpvd(new HolderInfoParams(c32383mZz.AYXKKw().copydefault(), "DEXMarket_Token_Holders_AddressLabel_View", list)).show(c32383mZz.getChildFragmentManager(), C56524yIo.AEQbTJ(mTY.class).valueOf());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.mZz$Fragment */
    public static final class Fragment extends RecyclerView.OnScrollListener {
        public Fragment() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            java.util.List<C34371nan> listAYXKKw;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            boolean z = true;
            C32383mZz.this.djBIcL = true;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            C34364nag c34364nag = C32383mZz.this.gEmmrt;
            int size = (c34364nag == null || (listAYXKKw = c34364nag.AYXKKw()) == null) ? 0 : listAYXKKw.size();
            if (!C32383mZz.this.gEmmrt().values().getValue().OLrzqt() && !C32383mZz.this.gEmmrt().values().getValue().AhwBna()) {
                z = false;
            }
            if (!C32383mZz.this.gEmmrt().values().getValue().EZpvd() || z || size <= 0 || size > iFindLastVisibleItemPosition + 4) {
                return;
            }
            C32383mZz.this.isConnected();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C32383mZz.this.djBIcL = false;
            } else if (i == 1 || i == 2) {
                C32383mZz.this.djBIcL = true;
            }
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (gEmmrt().values().getValue().copydefault()) {
            gEmmrt().OLrzqt("");
        } else {
            HistoryChangeViewModel.subscribeWs$default(gEmmrt(), null, 1, null);
        }
        gEmmrt().KWHzl();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        gEmmrt().ejfBZ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        gEmmrt().ejfBZ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        C34371nan c34371nan;
        java.lang.String strAEQbTJ;
        java.util.List<C34371nan> value = gEmmrt().AEQbTJ().getValue();
        if (value == null || (c34371nan = (C34371nan) CollectionsKt___CollectionsKt.wlaJM(value)) == null || (strAEQbTJ = c34371nan.AEQbTJ()) == null) {
            return;
        }
        C34364nag c34364nag = this.gEmmrt;
        java.util.List<C34371nan> listAYXKKw = c34364nag != null ? c34364nag.AYXKKw() : null;
        if (listAYXKKw != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
            java.util.Iterator<T> it = listAYXKKw.iterator();
            while (it.hasNext()) {
                arrayList2.add(new InterfaceC34593ney.Application((C34371nan) it.next()));
            }
            arrayList.addAll(arrayList2);
            arrayList.add(InterfaceC34593ney.TaskDescription.EZpvd);
            C34364nag c34364nag2 = this.gEmmrt;
            if (c34364nag2 != null) {
                c34364nag2.submitList(arrayList);
            }
        }
        gEmmrt().OLrzqt(strAEQbTJ);
    }

    private final void fetchVPNInfo() {
        C34364nag c34364nag = this.gEmmrt;
        java.util.ArrayList arrayList = null;
        java.lang.Iterable currentList = c34364nag != null ? c34364nag.getCurrentList() : null;
        C34364nag c34364nag2 = this.gEmmrt;
        if (c34364nag2 != null) {
            if (currentList != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : currentList) {
                    if (!(((InterfaceC34593ney) obj) instanceof InterfaceC34593ney.TaskDescription)) {
                        arrayList.add(obj);
                    }
                }
            }
            c34364nag2.submitList(arrayList);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(boolean z, boolean z2) {
        C55173xeu c55173xeu;
        oNF onf = (oNF) KWHzl();
        if (onf == null || (c55173xeu = onf.OLrzqt) == null) {
            return;
        }
        c55173xeu.setVisibility(z ? 0 : 8);
        if (z) {
            if (z2) {
                c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C35964oKf.Fragment.DPhTBN));
                c55173xeu.setRetry(C33070mpX.AYXKKw(C35964oKf.Fragment.frkDMe));
                c55173xeu.setEmptyTypeImage(6);
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.mZF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C32383mZz.EZpvd(this.AEQbTJ, view);
                    }
                });
                return;
            }
            c55173xeu.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.dpErvT));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C35964oKf.Fragment.DaTmkG));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C35964oKf.Fragment.AwvSrB));
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.mZI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C32383mZz.OLrzqt(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void EZpvd(C32383mZz c32383mZz, android.view.View view) {
        HistoryChangeViewModel.updateFilter$default(c32383mZz.gEmmrt(), null, null, new TokenFilter(null, null, null, null, null, false, false, null, false, false, null, null, null, null, 16383, null), 3, null);
    }

    public static final void OLrzqt(C32383mZz c32383mZz, android.view.View view) {
        c32383mZz.gEmmrt().OLrzqt("");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(C34374naq c34374naq) {
        oNF onf = (oNF) KWHzl();
        if (onf != null) {
            C55113xdn c55113xdn = onf.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            int i = 8;
            c55113xdn.setVisibility(c34374naq.OLrzqt() ? 0 : 8);
            RecyclerView recyclerView = onf.EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            if (!c34374naq.OLrzqt() && c34374naq.KWHzl() == null) {
                i = 0;
            }
            recyclerView.setVisibility(i);
            copydefault(c34374naq.KWHzl() != null, false);
            if (c34374naq.AEQbTJ()) {
                fetchVPNInfo();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(java.util.List<C34371nan> list) {
        C34364nag c34364nag;
        if (list != null) {
            copydefault(list.isEmpty(), true);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            mWC mwcAYXKKw = gEmmrt().AYXKKw();
            if (mwcAYXKKw != null && (c34364nag = this.gEmmrt) != null) {
                c34364nag.KWHzl(mwcAYXKKw);
            }
            TokenFilter tokenFilterGEmmrt = gEmmrt().gEmmrt();
            boolean zEZpvd = Intrinsics.EZpvd(tokenFilterGEmmrt.AEQbTJ((15359 & 1) != 0 ? tokenFilterGEmmrt.copydefault : null, (15359 & 2) != 0 ? tokenFilterGEmmrt.isConnected : null, (15359 & 4) != 0 ? tokenFilterGEmmrt.DbNXlk : gEmmrt().EZpvd().isConnected(), (15359 & 8) != 0 ? tokenFilterGEmmrt.AhwBna : null, (15359 & 16) != 0 ? tokenFilterGEmmrt.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilterGEmmrt.valueOf : false, (15359 & 64) != 0 ? tokenFilterGEmmrt.djBIcL : false, (15359 & 128) != 0 ? tokenFilterGEmmrt.EZpvd : null, (15359 & 256) != 0 ? tokenFilterGEmmrt.AYXKKw : false, (15359 & 512) != 0 ? tokenFilterGEmmrt.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilterGEmmrt.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilterGEmmrt.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilterGEmmrt.KWHzl : null, (15359 & 8192) != 0 ? tokenFilterGEmmrt.AkhnZx : null), gEmmrt().EZpvd());
            C34364nag c34364nag2 = this.gEmmrt;
            if (c34364nag2 != null) {
                c34364nag2.copydefault(!zEZpvd, new Function0() { // from class: o.mZE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C32383mZz.gEmmrt(this.EZpvd);
                    }
                });
            }
            C34364nag c34364nag3 = this.gEmmrt;
            if (c34364nag3 != null) {
                AbstractC34586neq.updateList$default(c34364nag3, list, false, new Function0() { // from class: o.mZJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C32383mZz.AhwBna(this.AEQbTJ);
                    }
                }, 2, null);
            }
        }
    }

    public static final Unit gEmmrt(C32383mZz c32383mZz) {
        HistoryChangeViewModel.updateFilter$default(c32383mZz.gEmmrt(), null, LabelFilter.ALL, c32383mZz.gEmmrt().gEmmrt(), 1, null);
        c32383mZz.valueOf().EZpvd(ChartDetailSubTabName.HISTORY_CHANGE);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C32383mZz c32383mZz) {
        c32383mZz.djBIcL = false;
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(java.util.List<C34371nan> list) {
        java.util.List<C34371nan> listAhwBna;
        RecyclerView recyclerView;
        if (list.isEmpty() || this.djBIcL) {
            return;
        }
        oNF onf = (oNF) KWHzl();
        RecyclerView.LayoutManager layoutManager = (onf == null || (recyclerView = onf.EZpvd) == null) ? null : recyclerView.getLayoutManager();
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        C34364nag c34364nag = this.gEmmrt;
        if (c34364nag == null || (listAhwBna = c34364nag.AYXKKw()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list, (java.lang.Iterable) listAhwBna);
        C34364nag c34364nag2 = this.gEmmrt;
        if (c34364nag2 != null) {
            AbstractC34586neq.updateList$default(c34364nag2, listDjBIcL, false, new Function0() { // from class: o.mZA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C32383mZz.EZpvd(linearLayoutManager, this);
                }
            }, 2, null);
        }
        HistoryChangeViewModel historyChangeViewModelGEmmrt = gEmmrt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C34371nan) it.next()).AEQbTJ());
        }
        historyChangeViewModelGEmmrt.AEQbTJ(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(LinearLayoutManager linearLayoutManager, C32383mZz c32383mZz) {
        oNF onf;
        RecyclerView recyclerView;
        if ((linearLayoutManager == null || linearLayoutManager.findFirstVisibleItemPosition() == 0) && (onf = (oNF) c32383mZz.KWHzl()) != null && (recyclerView = onf.EZpvd) != null) {
            recyclerView.scrollToPosition(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.mZz$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mZz.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C32383mZz KWHzl(@NotNull HistoryChangeFragmentParams historyChangeFragmentParams) {
            Intrinsics.checkNotNullParameter(historyChangeFragmentParams, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.history_change_params", historyChangeFragmentParams);
            C32383mZz c32383mZz = new C32383mZz();
            c32383mZz.setArguments(bundle);
            return c32383mZz;
        }
    }
}
