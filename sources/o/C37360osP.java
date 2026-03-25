package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.relationlist.model.SelectionActionType;
import com.okinc.im.imui.relationlist.ui.selectionrelation.SearchAndSelectRelationFragment$special$$inlined$viewModels$default$4;
import com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationActivityViewModel;
import com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationViewModel;
import com.okinc.uilab.edit.OKEditText;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C37290oqz;
import o.nQO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.osP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37360osP extends AbstractC37386osp {
    public C33922nKv isConnected;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AhwBna = 8;
    public final int djBIcL = C35399nuc.Dialog.zblBkD;
    public boolean gEmmrt = true;
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.osQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37360osP.gEmmrt(this.copydefault);
        }
    });
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.osT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37360osP.AhwBna(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.osS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37360osP.valueOf(this.KWHzl);
        }
    });
    public final ActivityResultLauncher<android.content.Intent> AkhnZx = C37290oqz.registerForImNewChatActivityResult$default(C37290oqz.copydefault, this, (C37290oqz.StateListAnimator) null, 1, (java.lang.Object) null);

    /* JADX INFO: renamed from: o.osP$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    public C37360osP() {
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SelectRelationActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SearchAndSelectRelationFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SearchAndSelectRelationFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SearchAndSelectRelationFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SearchAndSelectRelationFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SearchAndSelectRelationFragment$special$$inlined$viewModels$default$2
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SelectRelationViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SearchAndSelectRelationFragment$special$$inlined$viewModels$default$3
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
        }, new SearchAndSelectRelationFragment$special$$inlined$viewModels$default$4(null, interfaceC56387yDmEZpvd), new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SearchAndSelectRelationFragment$special$$inlined$viewModels$default$5
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

    private final java.util.List<java.lang.String> valueOf() {
        return (java.util.List) this.DbNXlk.getValue();
    }

    public static final java.util.List gEmmrt(C37360osP c37360osP) {
        java.util.ArrayList<java.lang.String> stringArrayList;
        android.os.Bundle arguments = c37360osP.getArguments();
        return (arguments == null || (stringArrayList = arguments.getStringArrayList("ARG_SELECTED_LIST")) == null) ? yDY.AhwBna() : stringArrayList;
    }

    private final SelectionActionType values() {
        return (SelectionActionType) this.fetchVPNInfo.getValue();
    }

    public static final SelectionActionType AhwBna(C37360osP c37360osP) {
        android.os.Bundle arguments = c37360osP.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("ARG_SELECT_ACTION_TYPE") : null;
        SelectionActionType selectionActionType = serializable instanceof SelectionActionType ? (SelectionActionType) serializable : null;
        return selectionActionType == null ? SelectionActionType.UNKNOWN : selectionActionType;
    }

    private final java.lang.String AhwBna() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String valueOf(C37360osP c37360osP) {
        android.os.Bundle arguments = c37360osP.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_GROUP_ID");
        }
        return null;
    }

    /* JADX INFO: renamed from: o.osP$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.osP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C37360osP copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull SelectionActionType selectionActionType, java.lang.String str, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(selectionActionType, "");
            C37360osP c37360osP = new C37360osP();
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_SELECTED_LIST", list), C56390yDp.OLrzqt("ARG_SELECT_ACTION_TYPE", selectionActionType), C56390yDp.OLrzqt("ARG_GROUP_ID", str));
            if (bool != null) {
                bundleBundleOf.putBoolean("KEY_ADD_NON_PAYING_MEMBER", bool.booleanValue());
            }
            c37360osP.setArguments(bundleBundleOf);
            return c37360osP;
        }
    }

    /* JADX INFO: renamed from: o.osP$TaskDescription */
    public static final class TaskDescription implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C37360osP.this.getChildFragmentManager().setFragmentResult("REQUEST_KEY_SEARCH_KEYWORD_CHANGED", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_KEY_KEYWORD", java.lang.String.valueOf(editable))));
        }
    }

    public final SelectRelationViewModel AYXKKw() {
        return (SelectRelationViewModel) this.values.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33922nKv c33922nKvOLrzqt = C33922nKv.OLrzqt(layoutInflater, viewGroup, false);
        this.isConnected = c33922nKvOLrzqt;
        if (c33922nKvOLrzqt != null) {
            return c33922nKvOLrzqt.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AYXKKw().KWHzl(values(), AhwBna());
        AkhnZx();
        DbNXlk();
        djBIcL();
        gEmmrt();
        isConnected();
        OLrzqt();
        view.post(new java.lang.Runnable() { // from class: o.osU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37360osP.djBIcL(this.OLrzqt);
            }
        });
    }

    public static final void djBIcL(C37360osP c37360osP) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c37360osP, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void djBIcL() {
        getChildFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.hNurIN, C37391osu.Companion.EZpvd(valueOf(), AhwBna(), values(), java.lang.Boolean.TRUE)).commitAllowingStateLoss();
    }

    public final void OLrzqt() {
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new Activity(this.gEmmrt));
    }

    /* JADX INFO: renamed from: o.osP$Activity */
    public static final class Activity extends OnBackPressedCallback {
        public Activity(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            java.util.List<java.lang.String> value = C37360osP.this.AYXKKw().djBIcL().getValue();
            if (value == null) {
                value = yDY.AhwBna();
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putStringArrayListExtra("RESULT_KEY_LIST", new java.util.ArrayList<>(value));
            C37360osP.this.requireActivity().setResult(-1, intent);
            remove();
            C37360osP.this.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        }
    }

    private final void DbNXlk() {
        C55230xfy c55230xfy;
        C33922nKv c33922nKv = this.isConnected;
        if (c33922nKv == null || (c55230xfy = c33922nKv.KWHzl) == null) {
            return;
        }
        c55230xfy.copydefault().setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.AubY));
        c55230xfy.setCancelCallback(new Function0() { // from class: o.otb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37360osP.AkhnZx(this.KWHzl);
            }
        });
        c55230xfy.KWHzl().requestFocus();
        c55230xfy.KWHzl().addTextChangedListener(new TaskDescription());
    }

    public static final Unit AkhnZx(C37360osP c37360osP) {
        c37360osP.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        C33922nKv c33922nKv = this.isConnected;
        if (c33922nKv != null) {
            C52794wYp c52794wYp = c33922nKv.EZpvd;
            android.content.Context context = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int i = C35399nuc.LoaderManager.HJWChPdIKEqB;
            java.util.List<java.lang.String> value = AYXKKw().djBIcL().getValue();
            c52794wYp.setText(C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(value != null ? value.size() : 0)))));
            c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.osP$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C37360osP OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C37360osP c37360osP) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c37360osP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.AYXKKw().AhwBna();
            }
        }
    }

    /* JADX INFO: renamed from: o.osP$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C37360osP OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C37360osP c37360osP) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c37360osP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                pUU.KWHzl("SearchAndSelectRelationFragment", "Next button clicked");
                this.OLrzqt.AYXKKw().valueOf();
            }
        }
    }

    public final void copydefault(int i) {
        C33922nKv c33922nKv = this.isConnected;
        if (c33922nKv != null) {
            C52794wYp c52794wYp = c33922nKv.EZpvd;
            android.content.Context context = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52794wYp.setText(C33069mpW.KWHzl(context, C35399nuc.LoaderManager.HJWChPdIKEqB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i)))));
            C52794wYp c52794wYp2 = c33922nKv.valueOf;
            Intrinsics.copydefault(c52794wYp2);
            c52794wYp2.setVisibility(AYXKKw().AYXKKw() != SelectionActionType.ADD_MEMBER_TO_GROUP ? 0 : 8);
            c52794wYp2.setOnClickListener(new Fragment(c52794wYp2, 1000L, this));
        }
    }

    private final void AkhnZx() {
        AYXKKw().gEmmrt().observe(this, new Application(new Function1() { // from class: o.osX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37360osP.EZpvd(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        AYXKKw().KWHzl().observe(this, new C32991mny(new Function1() { // from class: o.osW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37360osP.KWHzl(this.AEQbTJ, (SelectRelationViewModel.Application) obj);
            }
        }));
        AYXKKw().OLrzqt().observe(this, new Application(new Function1() { // from class: o.osV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37360osP.KWHzl(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        AYXKKw().AEQbTJ().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.osZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37360osP.copydefault(this.OLrzqt, (Unit) obj);
            }
        }));
    }

    public static final Unit EZpvd(C37360osP c37360osP, java.lang.Boolean bool) {
        C52794wYp c52794wYp;
        pUU.KWHzl("SearchAndSelectRelationFragment", "isEnabled:" + bool);
        C33922nKv c33922nKv = c37360osP.isConnected;
        if (c33922nKv != null && (c52794wYp = c33922nKv.EZpvd) != null) {
            c52794wYp.setEnabled(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(final C37360osP c37360osP, SelectRelationViewModel.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (application instanceof SelectRelationViewModel.Application.StateListAnimator) {
            nQO.ActionBar actionBar = new nQO.ActionBar(((SelectRelationViewModel.Application.StateListAnimator) application).AEQbTJ(), null, null, null, null, 30, null);
            ActivityResultLauncher<android.content.Intent> activityResultLauncher = c37360osP.AkhnZx;
            nQO.StateListAnimator stateListAnimator = nQO.Companion;
            android.content.Context contextRequireContext = c37360osP.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            activityResultLauncher.launch(stateListAnimator.AEQbTJ(contextRequireContext, actionBar));
        } else if (application instanceof SelectRelationViewModel.Application.C0477Application) {
            final java.lang.String strAhwBna = c37360osP.AhwBna();
            if (strAhwBna != null) {
                nWM nwm = nWM.EZpvd;
                FragmentActivity fragmentActivityRequireActivity = c37360osP.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                nwm.copydefault(fragmentActivityRequireActivity, ((SelectRelationViewModel.Application.C0477Application) application).AEQbTJ(), strAhwBna, new Function0() { // from class: o.osY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C37360osP.AEQbTJ(this.EZpvd, strAhwBna);
                    }
                });
            }
        } else if (application instanceof SelectRelationViewModel.Application.TaskDescription) {
            C33764nEz c33764nEz = C33764nEz.OLrzqt;
            android.content.Context contextRequireContext2 = c37360osP.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            C33764nEz.startIMChat$default(c33764nEz, contextRequireContext2, ((SelectRelationViewModel.Application.TaskDescription) application).OLrzqt(), null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_CURVE_FIT, null);
            C37290oqz c37290oqz = C37290oqz.copydefault;
            FragmentActivity fragmentActivityRequireActivity2 = c37360osP.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            c37290oqz.AEQbTJ(fragmentActivityRequireActivity2);
        } else {
            if (!(application instanceof SelectRelationViewModel.Application.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            C55326xho.toastWithFailedIcon$default(((SelectRelationViewModel.Application.Activity) application).OLrzqt(), 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C37360osP c37360osP, java.lang.String str) {
        c37360osP.EZpvd(str);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C37360osP c37360osP, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c37360osP.showLoading();
        } else {
            c37360osP.releaseLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C37360osP c37360osP, Unit unit) {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        C33922nKv c33922nKv = c37360osP.isConnected;
        if (c33922nKv != null && (c55230xfy = c33922nKv.KWHzl) != null && (oKEditTextKWHzl = c55230xfy.KWHzl()) != null) {
            oKEditTextKWHzl.setText("");
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str) {
        C33764nEz c33764nEz = C33764nEz.OLrzqt;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C33764nEz.startIMChat$default(c33764nEz, contextRequireContext, str, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_CURVE_FIT, null);
    }

    private final void isConnected() {
        getChildFragmentManager().setFragmentResultListener("REQUEST_KEY_SELECTION_LIST_CHANGED", this, new FragmentResultListener() { // from class: o.osR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C37360osP.KWHzl(this.AEQbTJ, str, bundle);
            }
        });
    }

    public static final void KWHzl(C37360osP c37360osP, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.util.List<java.lang.String> stringArrayList = bundle.getStringArrayList("RESULT_KEY_LIST");
        if (stringArrayList == null) {
            stringArrayList = yDY.AhwBna();
        }
        c37360osP.AYXKKw().OLrzqt(stringArrayList);
        c37360osP.copydefault(stringArrayList.size());
    }
}
