package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.relationlist.model.GroupType;
import com.okinc.im.imui.relationlist.model.SelectionActionType;
import com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationActivityViewModel;
import com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC37351osG;
import o.C35399nuc;
import o.C37290oqz;
import o.C37391osu;
import o.nQO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.otk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37434otk extends AbstractC37388osr {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public final int AYXKKw = C35399nuc.Dialog.WS;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final ActivityResultLauncher<android.content.Intent> djBIcL;
    public nKG fetchVPNInfo;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.otk$ActionBar */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    public C37434otk() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SelectRelationFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SelectRelationFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SelectRelationViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SelectRelationFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SelectRelationFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SelectRelationFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SelectRelationActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SelectRelationFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SelectRelationFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SelectRelationFragment$special$$inlined$activityViewModels$default$3
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
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.otm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37434otk.DbNXlk(this.EZpvd);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.oto
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37434otk.djBIcL(this.AEQbTJ);
            }
        });
        this.djBIcL = C37290oqz.copydefault.KWHzl(this, new TaskDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectRelationViewModel AhwBna() {
        return (SelectRelationViewModel) this.isConnected.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectRelationActivityViewModel AEQbTJ() {
        return (SelectRelationActivityViewModel) this.valueOf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectionActionType djBIcL() {
        return (SelectionActionType) this.AkhnZx.getValue();
    }

    public static final SelectionActionType DbNXlk(C37434otk c37434otk) {
        android.os.Bundle arguments = c37434otk.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("ARG_SELECT_ACTION_TYPE") : null;
        SelectionActionType selectionActionType = serializable instanceof SelectionActionType ? (SelectionActionType) serializable : null;
        return selectionActionType == null ? SelectionActionType.UNKNOWN : selectionActionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AYXKKw() {
        return (java.lang.String) this.AhwBna.getValue();
    }

    public static final java.lang.String djBIcL(C37434otk c37434otk) {
        android.os.Bundle arguments = c37434otk.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_GROUP_ID");
        }
        return null;
    }

    /* JADX INFO: renamed from: o.otk$TaskDescription */
    public static final class TaskDescription implements C37290oqz.StateListAnimator {
        public TaskDescription() {
        }

        @Override // o.C37290oqz.StateListAnimator
        public void EZpvd(ActivityResult activityResult) {
            java.util.ArrayList<java.lang.String> arrayList;
            Intrinsics.checkNotNullParameter(activityResult, "");
            if (activityResult.getResultCode() == -1) {
                android.content.Intent data = activityResult.getData();
                if (data == null || (arrayList = data.getStringArrayListExtra("RESULT_KEY_LIST")) == null) {
                    arrayList = new java.util.ArrayList<>();
                }
                C37434otk.this.getChildFragmentManager().setFragmentResult("REQUEST_UPDATE_SELECTION", BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_SELECTED_LIST", arrayList), C56390yDp.OLrzqt("ARG_GROUP_ID", C37434otk.this.AYXKKw())));
            }
        }
    }

    /* JADX INFO: renamed from: o.otk$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.otk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C37434otk OLrzqt(@NotNull SelectionActionType selectionActionType, java.lang.String str, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(selectionActionType, "");
            C37434otk c37434otk = new C37434otk();
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_SELECT_ACTION_TYPE", selectionActionType), C56390yDp.OLrzqt("ARG_GROUP_ID", str));
            if (bool != null) {
                bundleBundleOf.putBoolean("KEY_ADD_NON_PAYING_MEMBER", bool.booleanValue());
            }
            c37434otk.setArguments(bundleBundleOf);
            return c37434otk;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nKG nkgEZpvd = nKG.EZpvd(layoutInflater, viewGroup, false);
        this.fetchVPNInfo = nkgEZpvd;
        if (nkgEZpvd != null) {
            return nkgEZpvd.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AhwBna().KWHzl(djBIcL(), AYXKKw());
        valueOf();
        values();
        DbNXlk();
        fetchVPNInfo();
        gEmmrt();
        view.post(new java.lang.Runnable() { // from class: o.otq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37434otk.AYXKKw(this.copydefault);
            }
        });
    }

    public static final void AYXKKw(C37434otk c37434otk) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c37434otk, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void values() {
        C55230xfy c55230xfy;
        nKG nkg = this.fetchVPNInfo;
        if (nkg == null || (c55230xfy = nkg.KWHzl) == null) {
            return;
        }
        c55230xfy.setOnClickListener(new Fragment(c55230xfy, 1000L, this, c55230xfy));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.osu.Activity.newInstance$default(o.osu$Activity, java.util.List, java.lang.String, com.okinc.im.imui.relationlist.model.SelectionActionType, java.lang.Boolean, int, java.lang.Object):o.osu */
    private final void DbNXlk() {
        getChildFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.gkZNMa, C37391osu.Activity.newInstance$default(C37391osu.Companion, new java.util.ArrayList(), AYXKKw(), djBIcL(), null, 8, null)).commitAllowingStateLoss();
    }

    private final void fetchVPNInfo() {
        nKG nkg = this.fetchVPNInfo;
        if (nkg != null) {
            C52794wYp c52794wYp = nkg.copydefault;
            android.content.Context context = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int i = C35399nuc.LoaderManager.HJWChPdIKEqB;
            java.util.List<java.lang.String> value = AhwBna().djBIcL().getValue();
            c52794wYp.setText(C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(value != null ? value.size() : 0)))));
            c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
            C52794wYp c52794wYp2 = nkg.EZpvd;
            Intrinsics.copydefault(c52794wYp2);
            c52794wYp2.setVisibility(AhwBna().AYXKKw() == SelectionActionType.ADD_MEMBER_TO_GROUP ? 8 : 0);
            c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, this));
        }
    }

    private final void AEQbTJ(int i) {
        nKG nkg = this.fetchVPNInfo;
        if (nkg != null) {
            C52794wYp c52794wYp = nkg.copydefault;
            android.content.Context context = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52794wYp.setText(C33069mpW.KWHzl(context, C35399nuc.LoaderManager.HJWChPdIKEqB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i)))));
        }
    }

    /* JADX INFO: renamed from: o.otk$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C37434otk EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C37434otk c37434otk) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c37434otk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.AhwBna().AhwBna();
            }
        }
    }

    /* JADX INFO: renamed from: o.otk$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ C55230xfy AEQbTJ;
        public final /* synthetic */ C37434otk KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C37434otk c37434otk, C55230xfy c55230xfy) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c37434otk;
            this.AEQbTJ = c55230xfy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ActivityC37351osG.Application application = ActivityC37351osG.Companion;
                android.content.Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                java.util.List<java.lang.String> value = this.KWHzl.AhwBna().djBIcL().getValue();
                if (value == null) {
                    value = yDY.AhwBna();
                }
                SelectionActionType selectionActionTypeDjBIcL = this.KWHzl.djBIcL();
                java.util.List<java.lang.String> value2 = this.KWHzl.AEQbTJ().OLrzqt().getValue();
                if (value2 == null) {
                    value2 = yDY.AhwBna();
                }
                android.content.Intent intentAEQbTJ = application.AEQbTJ(contextRequireContext, value, value2, selectionActionTypeDjBIcL, this.KWHzl.AYXKKw(), this.KWHzl.AhwBna().EZpvd());
                ActivityOptionsCompat activityOptionsCompatMakeSceneTransitionAnimation = ActivityOptionsCompat.makeSceneTransitionAnimation(this.KWHzl.requireActivity(), this.AEQbTJ, "shared_element_name");
                Intrinsics.checkNotNullExpressionValue(activityOptionsCompatMakeSceneTransitionAnimation, "");
                this.KWHzl.djBIcL.launch(intentAEQbTJ, activityOptionsCompatMakeSceneTransitionAnimation);
            }
        }
    }

    /* JADX INFO: renamed from: o.otk$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C37434otk OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C37434otk c37434otk) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c37434otk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                pUU.KWHzl("SelectRelationFragment", "Next button clicked");
                this.OLrzqt.AhwBna().valueOf();
            }
        }
    }

    private final void valueOf() {
        AhwBna().gEmmrt().observe(this, new ActionBar(new Function1() { // from class: o.ots
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37434otk.EZpvd(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        AhwBna().isConnected().observe(this, new ActionBar(new Function1() { // from class: o.oty
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37434otk.OLrzqt(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        AhwBna().KWHzl().observe(this, new C32991mny(new Function1() { // from class: o.otu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37434otk.EZpvd(this.EZpvd, (SelectRelationViewModel.Application) obj);
            }
        }));
        AhwBna().OLrzqt().observe(this, new ActionBar(new Function1() { // from class: o.otw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37434otk.AYXKKw(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit EZpvd(C37434otk c37434otk, java.lang.Boolean bool) {
        C52794wYp c52794wYp;
        nKG nkg = c37434otk.fetchVPNInfo;
        if (nkg != null && (c52794wYp = nkg.copydefault) != null) {
            c52794wYp.setEnabled(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C37434otk c37434otk, java.lang.Boolean bool) {
        C52794wYp c52794wYp;
        C55230xfy c55230xfy;
        C52794wYp c52794wYp2;
        C55230xfy c55230xfy2;
        pUU.KWHzl("SelectRelationFragment", "isDataListEmpty:" + bool);
        if (bool.booleanValue()) {
            nKG nkg = c37434otk.fetchVPNInfo;
            if (nkg != null && (c55230xfy2 = nkg.KWHzl) != null) {
                c55230xfy2.setVisibility(8);
            }
            nKG nkg2 = c37434otk.fetchVPNInfo;
            if (nkg2 != null && (c52794wYp2 = nkg2.copydefault) != null) {
                c52794wYp2.setVisibility(8);
            }
        } else {
            nKG nkg3 = c37434otk.fetchVPNInfo;
            if (nkg3 != null && (c55230xfy = nkg3.KWHzl) != null) {
                c55230xfy.setVisibility(0);
            }
            nKG nkg4 = c37434otk.fetchVPNInfo;
            if (nkg4 != null && (c52794wYp = nkg4.copydefault) != null) {
                c52794wYp.setVisibility(0);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(final C37434otk c37434otk, SelectRelationViewModel.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (application instanceof SelectRelationViewModel.Application.StateListAnimator) {
            SelectRelationViewModel.Application.StateListAnimator stateListAnimator = (SelectRelationViewModel.Application.StateListAnimator) application;
            nQO.ActionBar actionBar = new nQO.ActionBar(stateListAnimator.AEQbTJ(), stateListAnimator.EZpvd() ? GroupType.PREMIUM : GroupType.STANDARD, null, null, null, 28, null);
            ActivityResultLauncher<android.content.Intent> activityResultLauncher = c37434otk.djBIcL;
            nQO.StateListAnimator stateListAnimator2 = nQO.Companion;
            android.content.Context contextRequireContext = c37434otk.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            activityResultLauncher.launch(stateListAnimator2.AEQbTJ(contextRequireContext, actionBar));
            Unit unit = Unit.INSTANCE;
        } else if (application instanceof SelectRelationViewModel.Application.C0477Application) {
            final java.lang.String strAYXKKw = c37434otk.AYXKKw();
            if (strAYXKKw != null) {
                nWM nwm = nWM.EZpvd;
                FragmentActivity fragmentActivityRequireActivity = c37434otk.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                if (nwm.copydefault(fragmentActivityRequireActivity, ((SelectRelationViewModel.Application.C0477Application) application).AEQbTJ(), strAYXKKw, new Function0() { // from class: o.otr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C37434otk.OLrzqt(this.AEQbTJ, strAYXKKw);
                    }
                }) == null) {
                    pUU.KWHzl(c37434otk.getTAG(), "group id is null");
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        } else if (application instanceof SelectRelationViewModel.Application.TaskDescription) {
            C33764nEz c33764nEz = C33764nEz.OLrzqt;
            android.content.Context contextRequireContext2 = c37434otk.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            C33764nEz.startIMChat$default(c33764nEz, contextRequireContext2, ((SelectRelationViewModel.Application.TaskDescription) application).OLrzqt(), null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_CURVE_FIT, null);
            C37290oqz c37290oqz = C37290oqz.copydefault;
            FragmentActivity fragmentActivityRequireActivity2 = c37434otk.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            c37290oqz.AEQbTJ(fragmentActivityRequireActivity2);
            Unit unit3 = Unit.INSTANCE;
        } else {
            if (!(application instanceof SelectRelationViewModel.Application.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            C55326xho.toastWithFailedIcon$default(((SelectRelationViewModel.Application.Activity) application).OLrzqt(), 0, 1, (java.lang.Object) null);
            Unit unit4 = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C37434otk c37434otk, java.lang.String str) {
        c37434otk.EZpvd(str);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C37434otk c37434otk, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c37434otk.showLoading();
        } else {
            c37434otk.releaseLoading();
        }
        return Unit.INSTANCE;
    }

    private final void EZpvd(java.lang.String str) {
        C33764nEz c33764nEz = C33764nEz.OLrzqt;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C33764nEz.startIMChat$default(c33764nEz, contextRequireContext, str, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_CURVE_FIT, null);
    }

    private final void gEmmrt() {
        getChildFragmentManager().setFragmentResultListener("REQUEST_KEY_SELECTION_LIST_CHANGED", this, new FragmentResultListener() { // from class: o.otp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C37434otk.AEQbTJ(this.AEQbTJ, str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("REQUEST_KEY_IS_DATA_LIST_EMPTY", this, new FragmentResultListener() { // from class: o.ott
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C37434otk.copydefault(this.AEQbTJ, str, bundle);
            }
        });
    }

    public static final void AEQbTJ(C37434otk c37434otk, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.util.List<java.lang.String> stringArrayList = bundle.getStringArrayList("RESULT_KEY_LIST");
        if (stringArrayList == null) {
            stringArrayList = yDY.AhwBna();
        }
        c37434otk.AhwBna().OLrzqt(stringArrayList);
        c37434otk.AEQbTJ(stringArrayList.size());
        FragmentKt.setFragmentResult(c37434otk, "REQUEST_KEY_SELECTION_LIST_CHANGED", bundle);
    }

    public static final void copydefault(C37434otk c37434otk, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c37434otk.AhwBna().EZpvd(bundle.getBoolean("RESULT_IS_DATA_LIST_EMPTY"));
    }
}
