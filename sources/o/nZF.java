package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListFragment$setupObservers$1$1;
import com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListFragment$setupObservers$1$2;
import com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListFragment$setupObservers$1$3;
import com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListFragment$setupObservers$1$4;
import com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nZF extends nZB {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public AbstractC33913nKm gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35399nuc.Dialog.UlJrfe;
    }

    public nZF() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PaidGroupTransactionListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListFragment$special$$inlined$viewModels$default$5
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
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.nZE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nZF.AhwBna();
            }
        });
    }

    public final PaidGroupTransactionListViewModel AYXKKw() {
        return (PaidGroupTransactionListViewModel) this.djBIcL.getValue();
    }

    public final nZI gEmmrt() {
        return (nZI) this.AhwBna.getValue();
    }

    public static final nZI AhwBna() {
        return new nZI();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC33913nKm abstractC33913nKmKWHzl = AbstractC33913nKm.KWHzl(layoutInflater, viewGroup, false);
        this.gEmmrt = abstractC33913nKmKWHzl;
        if (abstractC33913nKmKWHzl == null) {
            Intrinsics.gEmmrt("");
            abstractC33913nKmKWHzl = null;
        }
        android.view.View root = abstractC33913nKmKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        djBIcL();
        AkhnZx();
        valueOf();
        AYXKKw().OLrzqt();
    }

    private final void AkhnZx() {
        AbstractC33913nKm abstractC33913nKm = this.gEmmrt;
        AbstractC33913nKm abstractC33913nKm2 = null;
        if (abstractC33913nKm == null) {
            Intrinsics.gEmmrt("");
            abstractC33913nKm = null;
        }
        RecyclerView recyclerView = abstractC33913nKm.OLrzqt;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.setAdapter(gEmmrt());
        recyclerView.setItemAnimator(null);
        AbstractC33913nKm abstractC33913nKm3 = this.gEmmrt;
        if (abstractC33913nKm3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC33913nKm2 = abstractC33913nKm3;
        }
        abstractC33913nKm2.KWHzl.djBIcL(false);
    }

    private final void valueOf() {
        AbstractC33913nKm abstractC33913nKm = this.gEmmrt;
        if (abstractC33913nKm == null) {
            Intrinsics.gEmmrt("");
            abstractC33913nKm = null;
        }
        C33546myW c33546myW = abstractC33913nKm.KWHzl;
        c33546myW.OLrzqt(200);
        c33546myW.OLrzqt((InterfaceC57901yrE) new nZC(AYXKKw()));
        c33546myW.OLrzqt(true);
    }

    public final void copydefault(boolean z) {
        AbstractC33913nKm abstractC33913nKm = this.gEmmrt;
        if (abstractC33913nKm == null) {
            Intrinsics.gEmmrt("");
            abstractC33913nKm = null;
        }
        C33546myW c33546myW = abstractC33913nKm.KWHzl;
        if (z) {
            c33546myW.gEmmrt();
        } else {
            c33546myW.valueOf();
        }
    }

    private final void djBIcL() {
        PaidGroupTransactionListViewModel paidGroupTransactionListViewModelAYXKKw = AYXKKw();
        SharedFlow<java.lang.Boolean> sharedFlowKWHzl = paidGroupTransactionListViewModelAYXKKw.KWHzl();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(sharedFlowKWHzl, viewLifecycleOwner, (Lifecycle.State) null, new PaidGroupTransactionListFragment$setupObservers$1$1(this, null), 2, (java.lang.Object) null);
        MutableStateFlow<java.lang.Boolean> mutableStateFlowCopydefault = paidGroupTransactionListViewModelAYXKKw.copydefault();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C37721ozF.collectOnLifecycle$default(mutableStateFlowCopydefault, viewLifecycleOwner2, (Lifecycle.State) null, new PaidGroupTransactionListFragment$setupObservers$1$2(this, null), 2, (java.lang.Object) null);
        StateFlow<PaidGroupTransactionListViewModel.Application> stateFlowAEQbTJ = paidGroupTransactionListViewModelAYXKKw.AEQbTJ();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C37721ozF.collectOnLifecycle$default(stateFlowAEQbTJ, viewLifecycleOwner3, (Lifecycle.State) null, new PaidGroupTransactionListFragment$setupObservers$1$3(this, null), 2, (java.lang.Object) null);
        SharedFlow<PaidGroupTransactionListViewModel.StateListAnimator> sharedFlowEZpvd = paidGroupTransactionListViewModelAYXKKw.EZpvd();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C37721ozF.collectOnLifecycle$default(sharedFlowEZpvd, viewLifecycleOwner4, (Lifecycle.State) null, new PaidGroupTransactionListFragment$setupObservers$1$4(this, null), 2, (java.lang.Object) null);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nZF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final nZF OLrzqt(long j) {
            nZF nzf = new nZF();
            nzf.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("GROUP_ID", java.lang.Long.valueOf(j))));
            return nzf;
        }
    }
}
