package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.SelectGroupCallMemberViewModel;
import com.okinc.uilab.edit.OKEditText;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.owb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37584owb extends AbstractC37509ovF {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm fetchVPNInfo;
    public C33920nKt values;
    public final int AYXKKw = C35399nuc.Dialog.spnCvw;
    public boolean AhwBna = true;
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.owh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37584owb.valueOf(this.copydefault);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.owi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37584owb.gEmmrt(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.owk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37584owb.djBIcL(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.owb$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    public C37584owb() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SearchAndSelectGroupCallMemberFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SearchAndSelectGroupCallMemberFragment$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SelectGroupCallMemberViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SearchAndSelectGroupCallMemberFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SearchAndSelectGroupCallMemberFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SearchAndSelectGroupCallMemberFragment$special$$inlined$viewModels$default$5
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

    private final java.util.List<java.lang.String> djBIcL() {
        return (java.util.List) this.DbNXlk.getValue();
    }

    public static final java.util.List valueOf(C37584owb c37584owb) {
        java.util.ArrayList<java.lang.String> stringArrayList;
        android.os.Bundle arguments = c37584owb.getArguments();
        return (arguments == null || (stringArrayList = arguments.getStringArrayList("ARG_SELECTED_LIST")) == null) ? yDY.AhwBna() : stringArrayList;
    }

    private final java.lang.String AYXKKw() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String gEmmrt(C37584owb c37584owb) {
        android.os.Bundle arguments = c37584owb.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_GROUP_ID");
        }
        return null;
    }

    public final java.util.List<java.lang.String> AhwBna() {
        return (java.util.List) this.gEmmrt.getValue();
    }

    public static final java.util.List djBIcL(C37584owb c37584owb) {
        java.util.ArrayList<java.lang.String> stringArrayList;
        android.os.Bundle arguments = c37584owb.getArguments();
        return (arguments == null || (stringArrayList = arguments.getStringArrayList("ARG_COMPLETED_LIST")) == null) ? yDY.AhwBna() : stringArrayList;
    }

    /* JADX INFO: renamed from: o.owb$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.owb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C37584owb OLrzqt(@NotNull java.util.List<java.lang.String> list, java.lang.String str, java.util.List<java.lang.String> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            C37584owb c37584owb = new C37584owb();
            c37584owb.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_SELECTED_LIST", list), C56390yDp.OLrzqt("ARG_GROUP_ID", str), C56390yDp.OLrzqt("ARG_COMPLETED_LIST", list2)));
            return c37584owb;
        }
    }

    public final SelectGroupCallMemberViewModel valueOf() {
        return (SelectGroupCallMemberViewModel) this.fetchVPNInfo.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33920nKt c33920nKtAEQbTJ = C33920nKt.AEQbTJ(layoutInflater, viewGroup, false);
        this.values = c33920nKtAEQbTJ;
        if (c33920nKtAEQbTJ != null) {
            return c33920nKtAEQbTJ.getRoot();
        }
        return null;
    }

    /* JADX INFO: renamed from: o.owb$Activity */
    public static final class Activity implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C37584owb.this.getChildFragmentManager().setFragmentResult("REQUEST_KEY_SEARCH_KEYWORD_CHANGED", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_KEY_KEYWORD", java.lang.String.valueOf(editable))));
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        valueOf().KWHzl(AYXKKw());
        AkhnZx();
        fetchVPNInfo();
        DbNXlk();
        isConnected();
        values();
        gEmmrt();
        view.post(new java.lang.Runnable() { // from class: o.owa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37584owb.AhwBna(this.AEQbTJ);
            }
        });
    }

    public static final void AhwBna(C37584owb c37584owb) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c37584owb, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void DbNXlk() {
        getChildFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.hNurIN, C37513ovJ.Companion.EZpvd(djBIcL(), AYXKKw(), java.lang.Boolean.TRUE)).commitAllowingStateLoss();
    }

    private final void gEmmrt() {
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new Application(this.AhwBna));
    }

    /* JADX INFO: renamed from: o.owb$Application */
    public static final class Application extends OnBackPressedCallback {
        public Application(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            java.util.List<java.lang.String> value = C37584owb.this.valueOf().EZpvd().getValue();
            if (value == null) {
                value = yDY.AhwBna();
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("IS_FINAL_RESULT", false);
            intent.putStringArrayListExtra("RESULT_KEY_LIST", new java.util.ArrayList<>(value));
            C37584owb.this.requireActivity().setResult(-1, intent);
            remove();
            C37584owb.this.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        }
    }

    private final void fetchVPNInfo() {
        C55230xfy c55230xfy;
        C33920nKt c33920nKt = this.values;
        if (c33920nKt == null || (c55230xfy = c33920nKt.OLrzqt) == null) {
            return;
        }
        c55230xfy.copydefault().setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.AubY));
        c55230xfy.setCancelCallback(new Function0() { // from class: o.owl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37584owb.AkhnZx(this.EZpvd);
            }
        });
        c55230xfy.KWHzl().requestFocus();
        c55230xfy.KWHzl().addTextChangedListener(new Activity());
    }

    public static final Unit AkhnZx(C37584owb c37584owb) {
        c37584owb.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    private final void isConnected() {
        C33920nKt c33920nKt = this.values;
        if (c33920nKt != null) {
            C52794wYp c52794wYp = c33920nKt.copydefault;
            android.content.Context context = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iEZpvd = EZpvd();
            java.util.List<java.lang.String> value = valueOf().EZpvd().getValue();
            c52794wYp.setText(C33069mpW.KWHzl(context, iEZpvd, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(value != null ? value.size() : 0)))));
            c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        }
    }

    private final void KWHzl(int i) {
        C33920nKt c33920nKt = this.values;
        if (c33920nKt != null) {
            C52794wYp c52794wYp = c33920nKt.copydefault;
            android.content.Context context = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52794wYp.setText(C33069mpW.KWHzl(context, EZpvd(), (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i)))));
        }
    }

    /* JADX INFO: renamed from: o.owb$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C37584owb OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C37584owb c37584owb) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c37584owb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                java.util.List<java.lang.String> value = this.OLrzqt.valueOf().EZpvd().getValue();
                if (value == null) {
                    value = yDY.AhwBna();
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("IS_FINAL_RESULT", true);
                intent.putStringArrayListExtra("RESULT_FINAL_KEY_LIST", new java.util.ArrayList<>(value));
                this.OLrzqt.requireActivity().setResult(-1, intent);
                this.OLrzqt.requireActivity().finish();
            }
        }
    }

    private final void AkhnZx() {
        valueOf().KWHzl().observe(this, new TaskDescription(new Function1() { // from class: o.owf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37584owb.KWHzl(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        valueOf().copydefault().observe(this, new TaskDescription(new Function1() { // from class: o.owg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37584owb.AEQbTJ(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        valueOf().AEQbTJ().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.owe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37584owb.OLrzqt(this.KWHzl, (Unit) obj);
            }
        }));
    }

    public static final Unit KWHzl(C37584owb c37584owb, java.lang.Boolean bool) {
        C52794wYp c52794wYp;
        pUU.KWHzl("SearchAndSelectRelationFragment", "isEnabled:" + bool);
        C33920nKt c33920nKt = c37584owb.values;
        if (c33920nKt != null && (c52794wYp = c33920nKt.copydefault) != null) {
            c52794wYp.setEnabled(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C37584owb c37584owb, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c37584owb.showLoading();
        } else {
            c37584owb.releaseLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C37584owb c37584owb, Unit unit) {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        C33920nKt c33920nKt = c37584owb.values;
        if (c33920nKt != null && (c55230xfy = c33920nKt.OLrzqt) != null && (oKEditTextKWHzl = c55230xfy.KWHzl()) != null) {
            oKEditTextKWHzl.setText("");
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method o.ovF.EZpvd()V */
    public final int EZpvd() {
        return AhwBna().isEmpty() ? C35399nuc.LoaderManager.cBPFI : C35399nuc.LoaderManager.gwwfep;
    }

    private final void values() {
        getChildFragmentManager().setFragmentResultListener("REQUEST_KEY_SELECTION_LIST_CHANGED", this, new FragmentResultListener() { // from class: o.ovZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C37584owb.OLrzqt(this.AEQbTJ, str, bundle);
            }
        });
    }

    public static final void OLrzqt(C37584owb c37584owb, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.util.List<java.lang.String> stringArrayList = bundle.getStringArrayList("RESULT_KEY_LIST");
        if (stringArrayList == null) {
            stringArrayList = yDY.AhwBna();
        }
        c37584owb.valueOf().copydefault(stringArrayList);
        c37584owb.KWHzl(stringArrayList.size());
    }
}
