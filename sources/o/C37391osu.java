package o;

import android.view.View;
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
import com.okinc.im.imui.relationlist.model.SelectionActionType;
import com.okinc.im.imui.relationlist.ui.selectionrelation.MultiSelectRelationListFragment$observeViewModel$6;
import com.okinc.im.imui.relationlist.viewmodel.selectrelation.MultiSelectRelationViewModel;
import com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationActivityViewModel;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.C35399nuc;
import o.C37250oqL;
import o.C37256oqR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.osu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37391osu extends AbstractC37383osm {
    public final InterfaceC56387yDm AhwBna;
    public C33906nKf AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm fJNWhG;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public final ActionBar values;
    public static final Activity Companion = new Activity(null);
    public static final int AYXKKw = 8;
    public final int fetchVPNInfo = C35399nuc.Dialog.OJuSTm;
    public final C37763ozv djBIcL = new C37763ozv(new C37285oqu());
    public final C37763ozv AkhnZx = new C37763ozv(new C37283oqs());

    /* JADX INFO: renamed from: o.osu$Application */
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
        return this.fetchVPNInfo;
    }

    public C37391osu() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.MultiSelectRelationListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.MultiSelectRelationListFragment$special$$inlined$viewModels$default$2
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MultiSelectRelationViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.MultiSelectRelationListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.MultiSelectRelationListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.MultiSelectRelationListFragment$special$$inlined$viewModels$default$5
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SelectRelationActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.MultiSelectRelationListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.MultiSelectRelationListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.MultiSelectRelationListFragment$special$$inlined$activityViewModels$default$3
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
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.osE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37391osu.gEmmrt(this.EZpvd);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.osB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37391osu.djBIcL(this.EZpvd);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.osA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C37391osu.AhwBna(this.copydefault));
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.osx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37391osu.isConnected(this.KWHzl);
            }
        });
        this.values = new ActionBar();
    }

    public final MultiSelectRelationViewModel AhwBna() {
        return (MultiSelectRelationViewModel) this.fJNWhG.getValue();
    }

    /* JADX DEBUG: Possible override for method o.osm.EZpvd()V */
    public final SelectRelationActivityViewModel EZpvd() {
        return (SelectRelationActivityViewModel) this.AhwBna.getValue();
    }

    public final java.util.List<java.lang.String> valueOf() {
        return (java.util.List) this.isConnected.getValue();
    }

    public static final java.util.ArrayList gEmmrt(C37391osu c37391osu) {
        java.util.ArrayList<java.lang.String> stringArrayList;
        android.os.Bundle arguments = c37391osu.getArguments();
        return (arguments == null || (stringArrayList = arguments.getStringArrayList("arg_selected_list")) == null) ? new java.util.ArrayList() : stringArrayList;
    }

    private final java.lang.String fetchVPNInfo() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public static final java.lang.String djBIcL(C37391osu c37391osu) {
        android.os.Bundle arguments = c37391osu.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_GROUP_ID");
        }
        return null;
    }

    private final boolean isConnected() {
        return ((java.lang.Boolean) this.valueOf.getValue()).booleanValue();
    }

    public static final boolean AhwBna(C37391osu c37391osu) {
        android.os.Bundle arguments = c37391osu.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("arg_is_search_mode", false);
        }
        return false;
    }

    private final SelectionActionType AkhnZx() {
        return (SelectionActionType) this.DbNXlk.getValue();
    }

    public static final SelectionActionType isConnected(C37391osu c37391osu) {
        android.os.Bundle arguments = c37391osu.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("arg_selection_action_type") : null;
        SelectionActionType selectionActionType = serializable instanceof SelectionActionType ? (SelectionActionType) serializable : null;
        return selectionActionType == null ? SelectionActionType.UNKNOWN : selectionActionType;
    }

    /* JADX INFO: renamed from: o.osu$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.osu.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C37391osu newInstance$default(Activity activity, java.util.List list, java.lang.String str, SelectionActionType selectionActionType, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                bool = null;
            }
            return activity.EZpvd(list, str, selectionActionType, bool);
        }

        public final C37391osu EZpvd(@NotNull java.util.List<java.lang.String> list, java.lang.String str, @NotNull SelectionActionType selectionActionType, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(selectionActionType, "");
            C37391osu c37391osu = new C37391osu();
            c37391osu.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_selected_list", list), C56390yDp.OLrzqt("ARG_GROUP_ID", str), C56390yDp.OLrzqt("arg_selection_action_type", selectionActionType), C56390yDp.OLrzqt("arg_is_search_mode", bool)));
            return c37391osu;
        }
    }

    public final void djBIcL() {
        C33906nKf c33906nKf;
        C55173xeu c55173xeu;
        if (isConnected() || (c33906nKf = this.AuCTel) == null || (c55173xeu = c33906nKf.OLrzqt) == null) {
            return;
        }
        java.lang.String string = getString(C35399nuc.LoaderManager.DcMfJKOmnske);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = getString(C35399nuc.LoaderManager.cancel);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setSubTitle((java.lang.CharSequence) string2);
        java.lang.String string3 = getString(C35399nuc.LoaderManager.DUUtXg);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c55173xeu.setRetry(string3);
        C52794wYp c52794wYpAEQbTJ = c55173xeu.AEQbTJ();
        c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, this));
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33906nKf c33906nKfAEQbTJ = C33906nKf.AEQbTJ(layoutInflater, viewGroup, false);
        this.AuCTel = c33906nKfAEQbTJ;
        if (c33906nKfAEQbTJ != null) {
            return c33906nKfAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AYXKKw();
        ejfBZ();
        djBIcL();
        DbNXlk();
        AhwBna().EZpvd(isConnected());
        AhwBna().AEQbTJ(EZpvd());
        AhwBna().EZpvd(fetchVPNInfo(), valueOf(), AkhnZx());
        values();
    }

    /* JADX INFO: renamed from: o.osu$StateListAnimator */
    public static final class StateListAnimator implements C37256oqR.Application {
        public StateListAnimator() {
        }

        @Override // o.C37256oqR.Application
        public void KWHzl(RelationInfo relationInfo) {
            Intrinsics.checkNotNullParameter(relationInfo, "");
            pUU.KWHzl("MultiSelectRelationFragment", "horizontal item click: " + relationInfo.getContactsId());
            C37391osu.this.AhwBna().copydefault(relationInfo.getContactsId(), false);
        }
    }

    public final void AYXKKw() {
        RecyclerView recyclerView;
        C37763ozv c37763ozv = this.djBIcL;
        C37256oqR c37256oqR = new C37256oqR();
        c37256oqR.EZpvd(new StateListAnimator());
        c37763ozv.EZpvd(c37256oqR);
        C33906nKf c33906nKf = this.AuCTel;
        if (c33906nKf == null || (recyclerView = c33906nKf.KWHzl) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        recyclerView.setAdapter(this.djBIcL);
    }

    public final void gEmmrt() {
        C33906nKf c33906nKf;
        RecyclerView recyclerView;
        RecyclerView.LayoutManager layoutManager;
        int itemCount = this.djBIcL.getItemCount() - 1;
        pUU.EZpvd("MultiSelectRelationFragment", "scrollToBottom lastPosition=" + itemCount);
        if (itemCount == -1 || (c33906nKf = this.AuCTel) == null || (recyclerView = c33906nKf.KWHzl) == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.scrollToPosition(itemCount);
    }

    private final void values() {
        AhwBna().djBIcL().observe(this, new Application(new Function1() { // from class: o.oss
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37391osu.OLrzqt(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        AhwBna().copydefault().observe(this, new Observer() { // from class: o.osz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C37391osu.AEQbTJ(this.EZpvd, (java.util.List) obj);
            }
        });
        AhwBna().OLrzqt().observe(this, new Observer() { // from class: o.osy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C37391osu.EZpvd(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        AhwBna().AEQbTJ().observe(this, new C32991mny(new Function1() { // from class: o.osw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37391osu.EZpvd(this.OLrzqt, (MultiSelectRelationViewModel.StateListAnimator) obj);
            }
        }));
        AhwBna().gEmmrt().observe(this, new Observer() { // from class: o.osD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C37391osu.AEQbTJ(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        StateFlow<java.util.Set<java.lang.String>> stateFlowEZpvd = AhwBna().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowEZpvd, viewLifecycleOwner, (Lifecycle.State) null, new MultiSelectRelationListFragment$observeViewModel$6(this, null), 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(final C37391osu c37391osu, java.util.List list) {
        C37763ozv c37763ozv = c37391osu.djBIcL;
        Intrinsics.copydefault(list);
        c37763ozv.copydefault(list, new java.lang.Runnable() { // from class: o.osv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37391osu.valueOf(this.copydefault);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void valueOf(C37391osu c37391osu) {
        MultiSelectRelationViewModel.Activity activityKWHzl = c37391osu.AhwBna().KWHzl();
        pUU.KWHzl("MultiSelectRelationFragment", "postListUpdateHandling: " + activityKWHzl);
        if (Intrinsics.EZpvd(activityKWHzl, MultiSelectRelationViewModel.Activity.StateListAnimator.copydefault)) {
            c37391osu.gEmmrt();
        }
        c37391osu.AhwBna().AYXKKw();
    }

    public static final void AEQbTJ(C37391osu c37391osu, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C37763ozv.updateList$default(c37391osu.AkhnZx, list, null, 2, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c37391osu, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.osu$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C37391osu KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C37391osu c37391osu) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c37391osu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.AhwBna().OLrzqt(null, null);
            }
        }
    }

    public static final void EZpvd(C37391osu c37391osu, boolean z) {
        C55173xeu c55173xeu;
        C33906nKf c33906nKf = c37391osu.AuCTel;
        if (c33906nKf != null && (c55173xeu = c33906nKf.OLrzqt) != null) {
            c55173xeu.setVisibility(z ? 0 : 8);
        }
        FragmentKt.setFragmentResult(c37391osu, "REQUEST_KEY_IS_DATA_LIST_EMPTY", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_IS_DATA_LIST_EMPTY", java.lang.Boolean.valueOf(z))));
    }

    public static final Unit EZpvd(C37391osu c37391osu, MultiSelectRelationViewModel.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        pUU.KWHzl("ChatActivity", "action event triggered: " + stateListAnimator);
        c37391osu.EZpvd(stateListAnimator);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C37391osu c37391osu, boolean z) {
        if (z) {
            c37391osu.showLoading();
        } else {
            c37391osu.releaseLoading();
        }
    }

    private final void ejfBZ() {
        C37763ozv c37763ozv = this.AkhnZx;
        C37250oqL c37250oqL = new C37250oqL();
        c37250oqL.KWHzl(this.values);
        c37763ozv.EZpvd(c37250oqL);
        C33906nKf c33906nKf = this.AuCTel;
        if (c33906nKf != null) {
            RecyclerView recyclerView = c33906nKf.EZpvd;
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            recyclerView.setAdapter(this.AkhnZx);
            recyclerView.setItemAnimator(null);
        }
    }

    /* JADX INFO: renamed from: o.osu$ActionBar */
    public static final class ActionBar implements C37250oqL.Application {
        public ActionBar() {
        }

        @Override // o.C37250oqL.Application
        public void AEQbTJ(RelationInfo relationInfo, boolean z) {
            Intrinsics.checkNotNullParameter(relationInfo, "");
            pUU.KWHzl("MultiSelectRelationFragment", "Friend item clicked:" + relationInfo.getContactsId());
            C37391osu.this.AhwBna().copydefault(relationInfo.getContactsId(), z);
        }
    }

    public final void EZpvd(MultiSelectRelationViewModel.StateListAnimator stateListAnimator) {
        if (stateListAnimator instanceof MultiSelectRelationViewModel.StateListAnimator.Activity) {
            C37314orW c37314orWKWHzl = C37314orW.Companion.KWHzl(((MultiSelectRelationViewModel.StateListAnimator.Activity) stateListAnimator).KWHzl());
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c37314orWKWHzl.show(childFragmentManager);
            return;
        }
        if (!(stateListAnimator instanceof MultiSelectRelationViewModel.StateListAnimator.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        C55326xho.toastWithFailedIcon$default(((MultiSelectRelationViewModel.StateListAnimator.Application) stateListAnimator).AEQbTJ(), 0, 1, (java.lang.Object) null);
    }

    private final void DbNXlk() {
        getParentFragmentManager().setFragmentResultListener("REQUEST_KEY_SEARCH_KEYWORD_CHANGED", this, new FragmentResultListener() { // from class: o.osC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C37391osu.KWHzl(this.copydefault, str, bundle);
            }
        });
        getParentFragmentManager().setFragmentResultListener("REQUEST_UPDATE_SELECTION", this, new FragmentResultListener() { // from class: o.osF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C37391osu.copydefault(this.EZpvd, str, bundle);
            }
        });
    }

    public static final void KWHzl(C37391osu c37391osu, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c37391osu.AhwBna().OLrzqt(bundle.getString("RESULT_KEY_KEYWORD"));
    }

    public static final void copydefault(C37391osu c37391osu, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.util.List<java.lang.String> stringArrayList = bundle.getStringArrayList("ARG_SELECTED_LIST");
        if (stringArrayList == null) {
            stringArrayList = yDY.AhwBna();
        }
        c37391osu.AhwBna().OLrzqt(stringArrayList);
    }
}
