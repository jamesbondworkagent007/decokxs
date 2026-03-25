package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.selectgroupvoicecallmember.MultiSelectGroupCallMemberListFragment$observeViewModel$6;
import com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel;
import com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.SelectGroupCallMemberActivityViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.C35399nuc;
import o.C37565owI;
import o.C37569owM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ovJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37513ovJ extends AbstractC37504ovA {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public C33904nKd AkhnZx;
    public final InterfaceC56387yDm fARcdN;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final Activity values;
    public final int isConnected = C35399nuc.Dialog.QSLkRj;
    public final C37763ozv valueOf = new C37763ozv(new C37564owH());
    public final C37763ozv DbNXlk = new C37763ozv(new C37560owD());

    /* JADX INFO: renamed from: o.ovJ$Application */
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
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.isConnected;
    }

    public C37513ovJ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.MultiSelectGroupCallMemberListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.MultiSelectGroupCallMemberListFragment$special$$inlined$viewModels$default$2
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
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MultiSelectGroupCallMemberViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.MultiSelectGroupCallMemberListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.MultiSelectGroupCallMemberListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.MultiSelectGroupCallMemberListFragment$special$$inlined$viewModels$default$5
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SelectGroupCallMemberActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.MultiSelectGroupCallMemberListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.MultiSelectGroupCallMemberListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.MultiSelectGroupCallMemberListFragment$special$$inlined$activityViewModels$default$3
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
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.ovK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37513ovJ.djBIcL(this.OLrzqt);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.ovM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37513ovJ.valueOf(this.copydefault);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ovL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C37513ovJ.AhwBna(this.EZpvd));
            }
        });
        this.values = new Activity();
    }

    public final MultiSelectGroupCallMemberViewModel AhwBna() {
        return (MultiSelectGroupCallMemberViewModel) this.fARcdN.getValue();
    }

    /* JADX DEBUG: Possible override for method o.ovA.OLrzqt()V */
    public final SelectGroupCallMemberActivityViewModel OLrzqt() {
        return (SelectGroupCallMemberActivityViewModel) this.AhwBna.getValue();
    }

    private final java.util.List<java.lang.String> djBIcL() {
        return (java.util.List) this.fetchVPNInfo.getValue();
    }

    public static final java.util.ArrayList djBIcL(C37513ovJ c37513ovJ) {
        java.util.ArrayList<java.lang.String> stringArrayList;
        android.os.Bundle arguments = c37513ovJ.getArguments();
        return (arguments == null || (stringArrayList = arguments.getStringArrayList("arg_selected_list")) == null) ? new java.util.ArrayList() : stringArrayList;
    }

    private final java.lang.String AYXKKw() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public static final java.lang.String valueOf(C37513ovJ c37513ovJ) {
        android.os.Bundle arguments = c37513ovJ.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_GROUP_ID");
        }
        return null;
    }

    private final boolean valueOf() {
        return ((java.lang.Boolean) this.AYXKKw.getValue()).booleanValue();
    }

    public static final boolean AhwBna(C37513ovJ c37513ovJ) {
        android.os.Bundle arguments = c37513ovJ.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("arg_is_search_mode", false);
        }
        return false;
    }

    /* JADX INFO: renamed from: o.ovJ$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ovJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C37513ovJ newInstance$default(StateListAnimator stateListAnimator, java.util.List list, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                bool = null;
            }
            return stateListAnimator.EZpvd(list, str, bool);
        }

        public final C37513ovJ EZpvd(@NotNull java.util.List<java.lang.String> list, java.lang.String str, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(list, "");
            C37513ovJ c37513ovJ = new C37513ovJ();
            c37513ovJ.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_selected_list", list), C56390yDp.OLrzqt("ARG_GROUP_ID", str), C56390yDp.OLrzqt("arg_is_search_mode", bool)));
            return c37513ovJ;
        }
    }

    private final void values() {
        C33904nKd c33904nKd;
        C55173xeu c55173xeu;
        if (valueOf() || (c33904nKd = this.AkhnZx) == null || (c55173xeu = c33904nKd.copydefault) == null) {
            return;
        }
        c55173xeu.AEQbTJ().setVisibility(8);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33904nKd c33904nKdKWHzl = C33904nKd.KWHzl(layoutInflater, viewGroup, false);
        this.AkhnZx = c33904nKdKWHzl;
        if (c33904nKdKWHzl != null) {
            return c33904nKdKWHzl.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AkhnZx();
        isConnected();
        values();
        gEmmrt();
        AhwBna().OLrzqt(valueOf());
        MultiSelectGroupCallMemberViewModel multiSelectGroupCallMemberViewModelAhwBna = AhwBna();
        java.lang.String strAYXKKw = AYXKKw();
        java.util.List<java.lang.String> listDjBIcL = djBIcL();
        java.util.List<java.lang.String> value = OLrzqt().AEQbTJ().getValue();
        if (value == null) {
            value = yDY.AhwBna();
        }
        multiSelectGroupCallMemberViewModelAhwBna.KWHzl(strAYXKKw, listDjBIcL, value);
        DbNXlk();
    }

    /* JADX INFO: renamed from: o.ovJ$ActionBar */
    public static final class ActionBar implements C37569owM.StateListAnimator {
        public ActionBar() {
        }

        @Override // o.C37569owM.StateListAnimator
        public void AEQbTJ(C34282nYe c34282nYe) {
            Intrinsics.checkNotNullParameter(c34282nYe, "");
            pUU.KWHzl("MultiSelectRelationFragment", "horizontal item click: " + c34282nYe.AhwBna());
            C37513ovJ.this.AhwBna().AEQbTJ(c34282nYe.AhwBna(), false);
        }
    }

    private final void AkhnZx() {
        RecyclerView recyclerView;
        C37763ozv c37763ozv = this.valueOf;
        C37569owM c37569owM = new C37569owM();
        c37569owM.KWHzl(new ActionBar());
        c37763ozv.EZpvd(c37569owM);
        C33904nKd c33904nKd = this.AkhnZx;
        if (c33904nKd == null || (recyclerView = c33904nKd.AEQbTJ) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        recyclerView.setAdapter(this.valueOf);
    }

    private final void fetchVPNInfo() {
        C33904nKd c33904nKd;
        RecyclerView recyclerView;
        RecyclerView.LayoutManager layoutManager;
        int itemCount = this.valueOf.getItemCount() - 1;
        pUU.EZpvd("MultiSelectRelationFragment", "scrollToBottom lastPosition=" + itemCount);
        if (itemCount == -1 || (c33904nKd = this.AkhnZx) == null || (recyclerView = c33904nKd.AEQbTJ) == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.scrollToPosition(itemCount);
    }

    private final void DbNXlk() {
        AhwBna().djBIcL().observe(this, new Application(new Function1() { // from class: o.ovS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37513ovJ.copydefault(this.copydefault, (java.util.List) obj);
            }
        }));
        AhwBna().KWHzl().observe(this, new Observer() { // from class: o.ovQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C37513ovJ.AEQbTJ(this.OLrzqt, (java.util.List) obj);
            }
        });
        AhwBna().AEQbTJ().observe(this, new Observer() { // from class: o.ovR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C37513ovJ.AEQbTJ(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        AhwBna().copydefault().observe(this, new C32991mny(new Function1() { // from class: o.ovT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37513ovJ.OLrzqt(this.EZpvd, (MultiSelectGroupCallMemberViewModel.TaskDescription) obj);
            }
        }));
        AhwBna().AYXKKw().observe(this, new Observer() { // from class: o.ovP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C37513ovJ.OLrzqt(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        StateFlow<java.util.Set<java.lang.String>> stateFlowEZpvd = AhwBna().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowEZpvd, viewLifecycleOwner, (Lifecycle.State) null, new MultiSelectGroupCallMemberListFragment$observeViewModel$6(this, null), 2, (java.lang.Object) null);
    }

    public static final Unit copydefault(final C37513ovJ c37513ovJ, java.util.List list) {
        C37763ozv c37763ozv = c37513ovJ.valueOf;
        Intrinsics.copydefault(list);
        c37763ozv.copydefault(list, new java.lang.Runnable() { // from class: o.ovN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37513ovJ.AYXKKw(this.KWHzl);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(C37513ovJ c37513ovJ) {
        MultiSelectGroupCallMemberViewModel.ActionBar actionBarOLrzqt = c37513ovJ.AhwBna().OLrzqt();
        pUU.KWHzl("MultiSelectRelationFragment", "postListUpdateHandling: " + actionBarOLrzqt);
        if (Intrinsics.EZpvd(actionBarOLrzqt, MultiSelectGroupCallMemberViewModel.ActionBar.Activity.OLrzqt)) {
            c37513ovJ.fetchVPNInfo();
        }
        c37513ovJ.AhwBna().valueOf();
    }

    public static final void AEQbTJ(C37513ovJ c37513ovJ, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C37763ozv.updateList$default(c37513ovJ.DbNXlk, list, null, 2, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c37513ovJ, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void AEQbTJ(C37513ovJ c37513ovJ, boolean z) {
        C55173xeu c55173xeu;
        C33904nKd c33904nKd = c37513ovJ.AkhnZx;
        if (c33904nKd != null && (c55173xeu = c33904nKd.copydefault) != null) {
            c55173xeu.setVisibility(z ? 0 : 8);
        }
        FragmentKt.setFragmentResult(c37513ovJ, "REQUEST_KEY_IS_DATA_LIST_EMPTY", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_IS_DATA_LIST_EMPTY", java.lang.Boolean.valueOf(z))));
    }

    public static final Unit OLrzqt(C37513ovJ c37513ovJ, MultiSelectGroupCallMemberViewModel.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        pUU.KWHzl("ChatActivity", "action event triggered: " + taskDescription);
        c37513ovJ.AEQbTJ(taskDescription);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C37513ovJ c37513ovJ, boolean z) {
        if (z) {
            c37513ovJ.showLoading();
        } else {
            c37513ovJ.releaseLoading();
        }
    }

    private final void isConnected() {
        C37763ozv c37763ozv = this.DbNXlk;
        C37565owI c37565owI = new C37565owI();
        c37565owI.OLrzqt(this.values);
        c37763ozv.EZpvd(c37565owI);
        C33904nKd c33904nKd = this.AkhnZx;
        if (c33904nKd != null) {
            RecyclerView recyclerView = c33904nKd.EZpvd;
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            recyclerView.setAdapter(this.DbNXlk);
            recyclerView.setItemAnimator(null);
        }
    }

    /* JADX INFO: renamed from: o.ovJ$Activity */
    public static final class Activity implements C37565owI.Application {
        public Activity() {
        }

        @Override // o.C37565owI.Application
        public void EZpvd(C34282nYe c34282nYe, boolean z) {
            Intrinsics.checkNotNullParameter(c34282nYe, "");
            pUU.KWHzl("MultiSelectRelationFragment", "Friend item clicked:" + c34282nYe.AhwBna());
            C37513ovJ.this.AhwBna().AEQbTJ(c34282nYe.AhwBna(), z);
        }
    }

    public final void AEQbTJ(MultiSelectGroupCallMemberViewModel.TaskDescription taskDescription) {
        if (taskDescription instanceof MultiSelectGroupCallMemberViewModel.TaskDescription.C0485TaskDescription) {
            C37314orW c37314orWKWHzl = C37314orW.Companion.KWHzl(((MultiSelectGroupCallMemberViewModel.TaskDescription.C0485TaskDescription) taskDescription).EZpvd());
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c37314orWKWHzl.show(childFragmentManager);
            return;
        }
        if (!(taskDescription instanceof MultiSelectGroupCallMemberViewModel.TaskDescription.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        C55326xho.toastWithFailedIcon$default(((MultiSelectGroupCallMemberViewModel.TaskDescription.StateListAnimator) taskDescription).AEQbTJ(), 0, 1, (java.lang.Object) null);
    }

    private final void gEmmrt() {
        getParentFragmentManager().setFragmentResultListener("REQUEST_KEY_SEARCH_KEYWORD_CHANGED", this, new FragmentResultListener() { // from class: o.ovH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C37513ovJ.KWHzl(this.OLrzqt, str, bundle);
            }
        });
        getParentFragmentManager().setFragmentResultListener("REQUEST_UPDATE_SELECTION", this, new FragmentResultListener() { // from class: o.ovO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C37513ovJ.OLrzqt(this.AEQbTJ, str, bundle);
            }
        });
    }

    public static final void KWHzl(C37513ovJ c37513ovJ, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c37513ovJ.AhwBna().copydefault(bundle.getString("RESULT_KEY_KEYWORD"));
    }

    public static final void OLrzqt(C37513ovJ c37513ovJ, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.util.List<java.lang.String> stringArrayList = bundle.getStringArrayList("ARG_SELECTED_LIST");
        if (stringArrayList == null) {
            stringArrayList = yDY.AhwBna();
        }
        c37513ovJ.AhwBna().AEQbTJ(stringArrayList);
    }
}
