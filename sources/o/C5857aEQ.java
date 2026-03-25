package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.impl.mfa.model.SwitchVerificationMethodRequest;
import com.okinc.auth.impl.mfa.ui.switchotp.SwitchOtpViewModel;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aEQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C5857aEQ extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public C8285azp OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.aEQ$AssistContent */
    public static final /* synthetic */ class AssistContent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(Function1 function1) {
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

    public C5857aEQ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.mfa.ui.switchotp.SwitchVerificationMethodBottomSheetDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.mfa.ui.switchotp.SwitchVerificationMethodBottomSheetDialog$special$$inlined$viewModels$default$2
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SwitchOtpViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.switchotp.SwitchVerificationMethodBottomSheetDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.switchotp.SwitchVerificationMethodBottomSheetDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.switchotp.SwitchVerificationMethodBottomSheetDialog$special$$inlined$viewModels$default$5
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
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.aEV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C5857aEQ.AEQbTJ(this.EZpvd);
            }
        });
    }

    /* JADX INFO: renamed from: o.aEQ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aEQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C5857aEQ copydefault(@NotNull SwitchVerificationMethodRequest switchVerificationMethodRequest) {
            Intrinsics.checkNotNullParameter(switchVerificationMethodRequest, "");
            C5857aEQ c5857aEQ = new C5857aEQ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("KEY_REQUEST", switchVerificationMethodRequest);
            c5857aEQ.setArguments(bundle);
            return c5857aEQ;
        }
    }

    public final SwitchOtpViewModel OLrzqt() {
        return (SwitchOtpViewModel) this.copydefault.getValue();
    }

    public final SwitchVerificationMethodRequest copydefault() {
        return (SwitchVerificationMethodRequest) this.AEQbTJ.getValue();
    }

    public static final SwitchVerificationMethodRequest AEQbTJ(C5857aEQ c5857aEQ) {
        android.os.Bundle arguments = c5857aEQ.getArguments();
        java.lang.Object obj = arguments != null ? arguments.get("KEY_REQUEST") : null;
        if (obj instanceof SwitchVerificationMethodRequest) {
            return (SwitchVerificationMethodRequest) obj;
        }
        return null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C8285azp c8285azpOLrzqt = C8285azp.OLrzqt(getLayoutInflater());
        this.OLrzqt = c8285azpOLrzqt;
        if (c8285azpOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c8285azpOLrzqt = null;
        }
        constraintLayout.addView(c8285azpOLrzqt.getRoot(), new ConstraintLayout.LayoutParams(-1, -2));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.Long lValueOf;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        SwitchVerificationMethodRequest switchVerificationMethodRequestCopydefault = copydefault();
        boolean zKWHzl = switchVerificationMethodRequestCopydefault != null ? switchVerificationMethodRequestCopydefault.KWHzl() : false;
        SwitchVerificationMethodRequest switchVerificationMethodRequestCopydefault2 = copydefault();
        boolean zOLrzqt = switchVerificationMethodRequestCopydefault2 != null ? switchVerificationMethodRequestCopydefault2.OLrzqt() : false;
        SwitchVerificationMethodRequest switchVerificationMethodRequestCopydefault3 = copydefault();
        boolean zAEQbTJ = switchVerificationMethodRequestCopydefault3 != null ? switchVerificationMethodRequestCopydefault3.AEQbTJ() : false;
        SwitchVerificationMethodRequest switchVerificationMethodRequestCopydefault4 = copydefault();
        boolean zDjBIcL = switchVerificationMethodRequestCopydefault4 != null ? switchVerificationMethodRequestCopydefault4.djBIcL() : false;
        SwitchVerificationMethodRequest switchVerificationMethodRequestCopydefault5 = copydefault();
        boolean zCopydefault = switchVerificationMethodRequestCopydefault5 != null ? switchVerificationMethodRequestCopydefault5.copydefault() : false;
        SwitchVerificationMethodRequest switchVerificationMethodRequestCopydefault6 = copydefault();
        boolean zGEmmrt = switchVerificationMethodRequestCopydefault6 != null ? switchVerificationMethodRequestCopydefault6.gEmmrt() : false;
        SwitchVerificationMethodRequest switchVerificationMethodRequestCopydefault7 = copydefault();
        boolean zAhwBna = switchVerificationMethodRequestCopydefault7 != null ? switchVerificationMethodRequestCopydefault7.AhwBna() : false;
        SwitchVerificationMethodRequest switchVerificationMethodRequestCopydefault8 = copydefault();
        boolean zEZpvd = switchVerificationMethodRequestCopydefault8 != null ? switchVerificationMethodRequestCopydefault8.EZpvd() : false;
        SwitchVerificationMethodRequest switchVerificationMethodRequestCopydefault9 = copydefault();
        boolean zAYXKKw = switchVerificationMethodRequestCopydefault9 != null ? switchVerificationMethodRequestCopydefault9.AYXKKw() : false;
        SwitchVerificationMethodRequest switchVerificationMethodRequestCopydefault10 = copydefault();
        if (switchVerificationMethodRequestCopydefault10 != null && (lValueOf = switchVerificationMethodRequestCopydefault10.valueOf()) != null) {
            lValueOf.longValue();
        }
        C8285azp c8285azp = this.OLrzqt;
        C8285azp c8285azp2 = null;
        if (c8285azp == null) {
            Intrinsics.gEmmrt("");
            c8285azp = null;
        }
        OKRegularCell oKRegularCell = c8285azp.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell, "");
        oKRegularCell.setVisibility(zDjBIcL ? 0 : 8);
        C8285azp c8285azp3 = this.OLrzqt;
        if (c8285azp3 == null) {
            Intrinsics.gEmmrt("");
            c8285azp3 = null;
        }
        OKRegularCell oKRegularCell2 = c8285azp3.isConnected;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell2, "");
        oKRegularCell2.setVisibility(zGEmmrt ? 0 : 8);
        C8285azp c8285azp4 = this.OLrzqt;
        if (c8285azp4 == null) {
            Intrinsics.gEmmrt("");
            c8285azp4 = null;
        }
        OKRegularCell oKRegularCell3 = c8285azp4.copydefault;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell3, "");
        oKRegularCell3.setVisibility(zCopydefault ? 0 : 8);
        C8285azp c8285azp5 = this.OLrzqt;
        if (c8285azp5 == null) {
            Intrinsics.gEmmrt("");
            c8285azp5 = null;
        }
        OKRegularCell oKRegularCell4 = c8285azp5.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell4, "");
        oKRegularCell4.setVisibility(zAEQbTJ ? 0 : 8);
        C8285azp c8285azp6 = this.OLrzqt;
        if (c8285azp6 == null) {
            Intrinsics.gEmmrt("");
            c8285azp6 = null;
        }
        OKRegularCell oKRegularCell5 = c8285azp6.EZpvd;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell5, "");
        oKRegularCell5.setVisibility(zKWHzl ? 0 : 8);
        C8285azp c8285azp7 = this.OLrzqt;
        if (c8285azp7 == null) {
            Intrinsics.gEmmrt("");
            c8285azp7 = null;
        }
        OKRegularCell oKRegularCell6 = c8285azp7.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell6, "");
        oKRegularCell6.setVisibility(zOLrzqt ? 0 : 8);
        C8285azp c8285azp8 = this.OLrzqt;
        if (c8285azp8 == null) {
            Intrinsics.gEmmrt("");
            c8285azp8 = null;
        }
        OKRegularCell oKRegularCell7 = c8285azp8.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell7, "");
        oKRegularCell7.setVisibility(zEZpvd ? 0 : 8);
        C8285azp c8285azp9 = this.OLrzqt;
        if (c8285azp9 == null) {
            Intrinsics.gEmmrt("");
            c8285azp9 = null;
        }
        android.view.View view2 = c8285azp9.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(((zAhwBna || zAYXKKw) && (zDjBIcL || zGEmmrt || zCopydefault || zAEQbTJ || zKWHzl || zOLrzqt || zEZpvd)) ? 0 : 8);
        C8285azp c8285azp10 = this.OLrzqt;
        if (c8285azp10 == null) {
            Intrinsics.gEmmrt("");
            c8285azp10 = null;
        }
        OKRegularCell oKRegularCell8 = c8285azp10.AhwBna;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell8, "");
        oKRegularCell8.setVisibility(zAhwBna ? 0 : 8);
        C8285azp c8285azp11 = this.OLrzqt;
        if (c8285azp11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c8285azp2 = c8285azp11;
        }
        OKRegularCell oKRegularCell9 = c8285azp2.valueOf;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell9, "");
        oKRegularCell9.setVisibility(zAYXKKw ? 0 : 8);
        KWHzl();
        AEQbTJ();
    }

    public final void AEQbTJ() {
        C8285azp c8285azp = this.OLrzqt;
        C8285azp c8285azp2 = null;
        if (c8285azp == null) {
            Intrinsics.gEmmrt("");
            c8285azp = null;
        }
        OKRegularCell oKRegularCell = c8285azp.gEmmrt;
        oKRegularCell.setOnClickListener(new Application(oKRegularCell, 1000L, this));
        C8285azp c8285azp3 = this.OLrzqt;
        if (c8285azp3 == null) {
            Intrinsics.gEmmrt("");
            c8285azp3 = null;
        }
        OKRegularCell oKRegularCell2 = c8285azp3.copydefault;
        oKRegularCell2.setOnClickListener(new Activity(oKRegularCell2, 1000L, this));
        C8285azp c8285azp4 = this.OLrzqt;
        if (c8285azp4 == null) {
            Intrinsics.gEmmrt("");
            c8285azp4 = null;
        }
        OKRegularCell oKRegularCell3 = c8285azp4.isConnected;
        oKRegularCell3.setOnClickListener(new ActionBar(oKRegularCell3, 1000L, this));
        C8285azp c8285azp5 = this.OLrzqt;
        if (c8285azp5 == null) {
            Intrinsics.gEmmrt("");
            c8285azp5 = null;
        }
        OKRegularCell oKRegularCell4 = c8285azp5.KWHzl;
        oKRegularCell4.setOnClickListener(new StateListAnimator(oKRegularCell4, 1000L, this));
        C8285azp c8285azp6 = this.OLrzqt;
        if (c8285azp6 == null) {
            Intrinsics.gEmmrt("");
            c8285azp6 = null;
        }
        OKRegularCell oKRegularCell5 = c8285azp6.EZpvd;
        oKRegularCell5.setOnClickListener(new FragmentManager(oKRegularCell5, 1000L, this));
        C8285azp c8285azp7 = this.OLrzqt;
        if (c8285azp7 == null) {
            Intrinsics.gEmmrt("");
            c8285azp7 = null;
        }
        OKRegularCell oKRegularCell6 = c8285azp7.AYXKKw;
        oKRegularCell6.setOnClickListener(new LoaderManager(oKRegularCell6, 1000L, this));
        C8285azp c8285azp8 = this.OLrzqt;
        if (c8285azp8 == null) {
            Intrinsics.gEmmrt("");
            c8285azp8 = null;
        }
        OKRegularCell oKRegularCell7 = c8285azp8.AEQbTJ;
        oKRegularCell7.setOnClickListener(new Dialog(oKRegularCell7, 1000L, this));
        C8285azp c8285azp9 = this.OLrzqt;
        if (c8285azp9 == null) {
            Intrinsics.gEmmrt("");
            c8285azp9 = null;
        }
        OKRegularCell oKRegularCell8 = c8285azp9.AhwBna;
        oKRegularCell8.setOnClickListener(new PendingIntent(oKRegularCell8, 1000L, this));
        C8285azp c8285azp10 = this.OLrzqt;
        if (c8285azp10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c8285azp2 = c8285azp10;
        }
        OKRegularCell oKRegularCell9 = c8285azp2.valueOf;
        oKRegularCell9.setOnClickListener(new Fragment(oKRegularCell9, 1000L, this));
    }

    /* JADX INFO: renamed from: o.aEQ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C5857aEQ AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C5857aEQ c5857aEQ) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c5857aEQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.getParentFragmentManager().setFragmentResult("REQUEST_SWITCH_VERIFICATION_METHOD", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_SWITCH_VERIFICATION_METHOD", "RESULT_VALUE_VOICE")));
                this.AEQbTJ.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEQ$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C5857aEQ AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C5857aEQ c5857aEQ) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c5857aEQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.getParentFragmentManager().setFragmentResult("REQUEST_SWITCH_VERIFICATION_METHOD", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_SWITCH_VERIFICATION_METHOD", "RESULT_VALUE_EMAIL")));
                this.AEQbTJ.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEQ$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C5857aEQ EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C5857aEQ c5857aEQ) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c5857aEQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.getParentFragmentManager().setFragmentResult("REQUEST_SWITCH_VERIFICATION_METHOD", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_SWITCH_VERIFICATION_METHOD", "RESULT_VALUE_SMS")));
                this.EZpvd.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEQ$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C5857aEQ KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C5857aEQ c5857aEQ) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c5857aEQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.getParentFragmentManager().setFragmentResult("REQUEST_SWITCH_VERIFICATION_METHOD", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_SWITCH_VERIFICATION_METHOD", "RESULT_VALUE_FACE_VERIFY")));
                this.KWHzl.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEQ$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ C5857aEQ EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C5857aEQ c5857aEQ) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c5857aEQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.getParentFragmentManager().setFragmentResult("REQUEST_SWITCH_VERIFICATION_METHOD", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_SWITCH_VERIFICATION_METHOD", "RESULT_VALUE_RESET_PASSKEY")));
                this.EZpvd.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEQ$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C5857aEQ EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C5857aEQ c5857aEQ) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c5857aEQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.getParentFragmentManager().setFragmentResult("REQUEST_SWITCH_VERIFICATION_METHOD", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_SWITCH_VERIFICATION_METHOD", "RESULT_VALUE_PASSKEY")));
                this.EZpvd.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEQ$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C5857aEQ KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C5857aEQ c5857aEQ) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c5857aEQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.getParentFragmentManager().setFragmentResult("REQUEST_SWITCH_VERIFICATION_METHOD", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_SWITCH_VERIFICATION_METHOD", "RESULT_VALUE_PASSWORD")));
                this.KWHzl.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEQ$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C5857aEQ EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C5857aEQ c5857aEQ) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c5857aEQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.getParentFragmentManager().setFragmentResult("REQUEST_SWITCH_VERIFICATION_METHOD", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_SWITCH_VERIFICATION_METHOD", "RESULT_VALUE_UNAVAILABLE")));
                this.EZpvd.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEQ$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C5857aEQ KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C5857aEQ c5857aEQ) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c5857aEQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.getParentFragmentManager().setFragmentResult("REQUEST_SWITCH_VERIFICATION_METHOD", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_SWITCH_VERIFICATION_METHOD", "RESULT_VALUE_GA")));
                this.KWHzl.dismiss();
            }
        }
    }

    public final void KWHzl() {
        final android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        OLrzqt().OLrzqt().observe(getViewLifecycleOwner(), new AssistContent(new Function1() { // from class: o.aER
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C5857aEQ.OLrzqt(this.OLrzqt, context, (java.lang.Long) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C5857aEQ c5857aEQ, android.content.Context context, java.lang.Long l) {
        C8285azp c8285azp = null;
        if (l.longValue() > 0) {
            C8285azp c8285azp2 = c5857aEQ.OLrzqt;
            if (c8285azp2 == null) {
                Intrinsics.gEmmrt("");
                c8285azp2 = null;
            }
            c8285azp2.gEmmrt.setEnabled(false);
            C8285azp c8285azp3 = c5857aEQ.OLrzqt;
            if (c8285azp3 == null) {
                Intrinsics.gEmmrt("");
                c8285azp3 = null;
            }
            c8285azp3.copydefault.setEnabled(false);
            C8285azp c8285azp4 = c5857aEQ.OLrzqt;
            if (c8285azp4 == null) {
                Intrinsics.gEmmrt("");
                c8285azp4 = null;
            }
            c8285azp4.isConnected.setEnabled(false);
            C8285azp c8285azp5 = c5857aEQ.OLrzqt;
            if (c8285azp5 == null) {
                Intrinsics.gEmmrt("");
                c8285azp5 = null;
            }
            c8285azp5.KWHzl.setEnabled(true);
            C8285azp c8285azp6 = c5857aEQ.OLrzqt;
            if (c8285azp6 == null) {
                Intrinsics.gEmmrt("");
                c8285azp6 = null;
            }
            c8285azp6.EZpvd.setEnabled(true);
            C8285azp c8285azp7 = c5857aEQ.OLrzqt;
            if (c8285azp7 == null) {
                Intrinsics.gEmmrt("");
                c8285azp7 = null;
            }
            c8285azp7.AYXKKw.setEnabled(true);
            C8285azp c8285azp8 = c5857aEQ.OLrzqt;
            if (c8285azp8 == null) {
                Intrinsics.gEmmrt("");
                c8285azp8 = null;
            }
            c8285azp8.AEQbTJ.setEnabled(true);
            android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
            Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "");
            C8285azp c8285azp9 = c5857aEQ.OLrzqt;
            if (c8285azp9 == null) {
                Intrinsics.gEmmrt("");
                c8285azp9 = null;
            }
            c8285azp9.gEmmrt.setIconTint(colorStateListValueOf);
            C8285azp c8285azp10 = c5857aEQ.OLrzqt;
            if (c8285azp10 == null) {
                Intrinsics.gEmmrt("");
                c8285azp10 = null;
            }
            c8285azp10.copydefault.setIconTint(colorStateListValueOf);
            C8285azp c8285azp11 = c5857aEQ.OLrzqt;
            if (c8285azp11 == null) {
                Intrinsics.gEmmrt("");
                c8285azp11 = null;
            }
            c8285azp11.isConnected.setIconTint(colorStateListValueOf);
            java.lang.String strKWHzl = C33069mpW.KWHzl(context, C8206ayP.Dialog.fvQaOB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("timer", C33129mqd.gEmmrt(l))));
            java.lang.String strKWHzl2 = C33069mpW.KWHzl(context, C8206ayP.Dialog.flVtFt, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("timer", C33129mqd.gEmmrt(l))));
            java.lang.String strKWHzl3 = C33069mpW.KWHzl(context, C8206ayP.Dialog.iRxXKY, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("timer", C33129mqd.gEmmrt(l))));
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.fZBcTu);
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C8206ayP.Dialog.gasjUx);
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C8206ayP.Dialog.gGvvIC);
            java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C8206ayP.Dialog.getLabel);
            C8285azp c8285azp12 = c5857aEQ.OLrzqt;
            if (c8285azp12 == null) {
                Intrinsics.gEmmrt("");
                c8285azp12 = null;
            }
            c8285azp12.gEmmrt.setTitle(strKWHzl);
            C8285azp c8285azp13 = c5857aEQ.OLrzqt;
            if (c8285azp13 == null) {
                Intrinsics.gEmmrt("");
                c8285azp13 = null;
            }
            c8285azp13.isConnected.setTitle(strKWHzl3);
            C8285azp c8285azp14 = c5857aEQ.OLrzqt;
            if (c8285azp14 == null) {
                Intrinsics.gEmmrt("");
                c8285azp14 = null;
            }
            c8285azp14.copydefault.setTitle(strKWHzl2);
            C8285azp c8285azp15 = c5857aEQ.OLrzqt;
            if (c8285azp15 == null) {
                Intrinsics.gEmmrt("");
                c8285azp15 = null;
            }
            c8285azp15.KWHzl.setTitle(strAYXKKw);
            C8285azp c8285azp16 = c5857aEQ.OLrzqt;
            if (c8285azp16 == null) {
                Intrinsics.gEmmrt("");
                c8285azp16 = null;
            }
            c8285azp16.EZpvd.setTitle(strAYXKKw2);
            C8285azp c8285azp17 = c5857aEQ.OLrzqt;
            if (c8285azp17 == null) {
                Intrinsics.gEmmrt("");
                c8285azp17 = null;
            }
            c8285azp17.AYXKKw.setTitle(strAYXKKw3);
            C8285azp c8285azp18 = c5857aEQ.OLrzqt;
            if (c8285azp18 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c8285azp = c8285azp18;
            }
            c8285azp.AEQbTJ.setTitle(strAYXKKw4);
        } else {
            C8285azp c8285azp19 = c5857aEQ.OLrzqt;
            if (c8285azp19 == null) {
                Intrinsics.gEmmrt("");
                c8285azp19 = null;
            }
            c8285azp19.gEmmrt.setEnabled(true);
            C8285azp c8285azp20 = c5857aEQ.OLrzqt;
            if (c8285azp20 == null) {
                Intrinsics.gEmmrt("");
                c8285azp20 = null;
            }
            c8285azp20.copydefault.setEnabled(true);
            C8285azp c8285azp21 = c5857aEQ.OLrzqt;
            if (c8285azp21 == null) {
                Intrinsics.gEmmrt("");
                c8285azp21 = null;
            }
            c8285azp21.isConnected.setEnabled(true);
            C8285azp c8285azp22 = c5857aEQ.OLrzqt;
            if (c8285azp22 == null) {
                Intrinsics.gEmmrt("");
                c8285azp22 = null;
            }
            c8285azp22.KWHzl.setEnabled(true);
            C8285azp c8285azp23 = c5857aEQ.OLrzqt;
            if (c8285azp23 == null) {
                Intrinsics.gEmmrt("");
                c8285azp23 = null;
            }
            c8285azp23.EZpvd.setEnabled(true);
            C8285azp c8285azp24 = c5857aEQ.OLrzqt;
            if (c8285azp24 == null) {
                Intrinsics.gEmmrt("");
                c8285azp24 = null;
            }
            c8285azp24.AYXKKw.setEnabled(true);
            C8285azp c8285azp25 = c5857aEQ.OLrzqt;
            if (c8285azp25 == null) {
                Intrinsics.gEmmrt("");
                c8285azp25 = null;
            }
            c8285azp25.AEQbTJ.setEnabled(true);
            android.content.res.ColorStateList colorStateListValueOf2 = android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            Intrinsics.checkNotNullExpressionValue(colorStateListValueOf2, "");
            C8285azp c8285azp26 = c5857aEQ.OLrzqt;
            if (c8285azp26 == null) {
                Intrinsics.gEmmrt("");
                c8285azp26 = null;
            }
            c8285azp26.gEmmrt.setIconTint(colorStateListValueOf2);
            C8285azp c8285azp27 = c5857aEQ.OLrzqt;
            if (c8285azp27 == null) {
                Intrinsics.gEmmrt("");
                c8285azp27 = null;
            }
            c8285azp27.copydefault.setIconTint(colorStateListValueOf2);
            C8285azp c8285azp28 = c5857aEQ.OLrzqt;
            if (c8285azp28 == null) {
                Intrinsics.gEmmrt("");
                c8285azp28 = null;
            }
            c8285azp28.isConnected.setIconTint(colorStateListValueOf2);
            C8285azp c8285azp29 = c5857aEQ.OLrzqt;
            if (c8285azp29 == null) {
                Intrinsics.gEmmrt("");
                c8285azp29 = null;
            }
            c8285azp29.KWHzl.setIconTint(colorStateListValueOf2);
            C8285azp c8285azp30 = c5857aEQ.OLrzqt;
            if (c8285azp30 == null) {
                Intrinsics.gEmmrt("");
                c8285azp30 = null;
            }
            c8285azp30.EZpvd.setIconTint(colorStateListValueOf2);
            C8285azp c8285azp31 = c5857aEQ.OLrzqt;
            if (c8285azp31 == null) {
                Intrinsics.gEmmrt("");
                c8285azp31 = null;
            }
            c8285azp31.AYXKKw.setIconTint(colorStateListValueOf2);
            C8285azp c8285azp32 = c5857aEQ.OLrzqt;
            if (c8285azp32 == null) {
                Intrinsics.gEmmrt("");
                c8285azp32 = null;
            }
            c8285azp32.AEQbTJ.setIconTint(colorStateListValueOf2);
            C8285azp c8285azp33 = c5857aEQ.OLrzqt;
            if (c8285azp33 == null) {
                Intrinsics.gEmmrt("");
                c8285azp33 = null;
            }
            c8285azp33.gEmmrt.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.giSNqX));
            C8285azp c8285azp34 = c5857aEQ.OLrzqt;
            if (c8285azp34 == null) {
                Intrinsics.gEmmrt("");
                c8285azp34 = null;
            }
            c8285azp34.isConnected.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.iZzfmt));
            C8285azp c8285azp35 = c5857aEQ.OLrzqt;
            if (c8285azp35 == null) {
                Intrinsics.gEmmrt("");
                c8285azp35 = null;
            }
            c8285azp35.copydefault.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.dxcTrN));
            C8285azp c8285azp36 = c5857aEQ.OLrzqt;
            if (c8285azp36 == null) {
                Intrinsics.gEmmrt("");
                c8285azp36 = null;
            }
            c8285azp36.KWHzl.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.fZBcTu));
            C8285azp c8285azp37 = c5857aEQ.OLrzqt;
            if (c8285azp37 == null) {
                Intrinsics.gEmmrt("");
                c8285azp37 = null;
            }
            c8285azp37.EZpvd.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.gasjUx));
            C8285azp c8285azp38 = c5857aEQ.OLrzqt;
            if (c8285azp38 == null) {
                Intrinsics.gEmmrt("");
                c8285azp38 = null;
            }
            c8285azp38.AYXKKw.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.gGvvIC));
            C8285azp c8285azp39 = c5857aEQ.OLrzqt;
            if (c8285azp39 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c8285azp = c8285azp39;
            }
            c8285azp.AEQbTJ.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.getLabel));
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        getParentFragmentManager().setFragmentResult("REQUEST_SWITCH_VERIFICATION_METHOD", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_SWITCH_VERIFICATION_METHOD", "RESULT_VALUE_CANCEL")));
    }
}
