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
import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameBottomFragment$onViewCreated$1;
import com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameBottomFragment$onViewCreated$2;
import com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameBottomFragment$onViewCreated$3;
import com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameViewModel;
import com.okinc.uilab.edit.OKEditText;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aOg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6403aOg extends AbstractC6402aOf {
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm DbNXlk;
    public final boolean djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AhwBna = 8;

    /* JADX INFO: renamed from: o.aOg$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.djBIcL;
    }

    public C6403aOg() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameBottomFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameBottomFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SecurityFido2RenameViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameBottomFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameBottomFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameBottomFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.aOm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6403aOg.gEmmrt(this.copydefault);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.aOk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6403aOg.AYXKKw(this.copydefault);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.aOn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C6403aOg.djBIcL(this.KWHzl));
            }
        });
        this.djBIcL = true;
    }

    /* JADX INFO: renamed from: o.aOg$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aOg.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C6403aOg newInstance$default(TaskDescription taskDescription, java.lang.String str, AuthenticatorDisplayModel authenticatorDisplayModel, boolean z, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return taskDescription.KWHzl(str, authenticatorDisplayModel, z);
        }

        public final C6403aOg KWHzl(@NotNull java.lang.String str, @NotNull AuthenticatorDisplayModel authenticatorDisplayModel, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
            C6403aOg c6403aOg = new C6403aOg();
            c6403aOg.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_REQUEST_ID", str), C56390yDp.OLrzqt("KEY_AUTHENTICATOR_MODEL", authenticatorDisplayModel), C56390yDp.OLrzqt("KEY_IS_OKX_PAY", java.lang.Boolean.valueOf(z))));
            return c6403aOg;
        }
    }

    public final SecurityFido2RenameViewModel gEmmrt() {
        return (SecurityFido2RenameViewModel) this.DbNXlk.getValue();
    }

    public final java.lang.String djBIcL() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String gEmmrt(C6403aOg c6403aOg) {
        android.os.Bundle arguments = c6403aOg.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("KEY_REQUEST_ID") : null;
        return string == null ? "" : string;
    }

    /* JADX DEBUG: Possible override for method o.aOf.OLrzqt()V */
    public final AuthenticatorDisplayModel OLrzqt() {
        return (AuthenticatorDisplayModel) this.gEmmrt.getValue();
    }

    public static final AuthenticatorDisplayModel AYXKKw(C6403aOg c6403aOg) {
        android.os.Bundle arguments = c6403aOg.getArguments();
        if (arguments != null) {
            return (AuthenticatorDisplayModel) arguments.getParcelable("KEY_AUTHENTICATOR_MODEL");
        }
        return null;
    }

    public final boolean AhwBna() {
        return ((java.lang.Boolean) this.valueOf.getValue()).booleanValue();
    }

    public static final boolean djBIcL(C6403aOg c6403aOg) {
        android.os.Bundle arguments = c6403aOg.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("KEY_IS_OKX_PAY");
        }
        return false;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setDividerVisibility(false);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        final C8253azJ c8253azJOLrzqt = C8253azJ.OLrzqt(getLayoutInflater(), constraintLayout, false);
        Intrinsics.checkNotNullExpressionValue(c8253azJOLrzqt, "");
        OKEditText oKEditText = c8253azJOLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        C33606mzd.AEQbTJ(oKEditText, new Function1() { // from class: o.aOj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6403aOg.KWHzl(this.copydefault, (java.lang.CharSequence) obj);
            }
        });
        OKEditText oKEditText2 = c8253azJOLrzqt.OLrzqt;
        AuthenticatorDisplayModel authenticatorDisplayModelOLrzqt = OLrzqt();
        java.lang.String strAhwBna = authenticatorDisplayModelOLrzqt != null ? authenticatorDisplayModelOLrzqt.AhwBna() : null;
        oKEditText2.setText(strAhwBna != null ? strAhwBna : "");
        gEmmrt().KWHzl().observe(this, new Application(new Function1() { // from class: o.aOl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6403aOg.KWHzl(c8253azJOLrzqt, (java.lang.String) obj);
            }
        }));
        c8253azJOLrzqt.OLrzqt.requestFocus();
        c8253azJOLrzqt.OLrzqt.postDelayed(new java.lang.Runnable() { // from class: o.aOs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C6403aOg.EZpvd(this.KWHzl, c8253azJOLrzqt);
            }
        }, 240L);
        constraintLayout.addView(c8253azJOLrzqt.getRoot());
    }

    public static final Unit KWHzl(C6403aOg c6403aOg, java.lang.CharSequence charSequence) {
        c6403aOg.gEmmrt().copydefault(java.lang.String.valueOf(charSequence));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C8253azJ c8253azJ, java.lang.String str) {
        android.widget.TextView textView = c8253azJ.KWHzl;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C6403aOg c6403aOg, C8253azJ c8253azJ) {
        C33570myu.AEQbTJ(c6403aOg.requireContext(), (android.widget.EditText) c8253azJ.OLrzqt);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull final wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C8206ayP.Dialog.gHZMYf));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setContentDescription("passkeyRenameConfirmButton");
        }
        gEmmrt().AEQbTJ().observe(this, new Application(new Function1() { // from class: o.aOi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6403aOg.OLrzqt(wyf, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit OLrzqt(wYF wyf, java.lang.Boolean bool) {
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE));
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C6690aUB.KWHzl(gEmmrt().copydefault(), this, new SecurityFido2RenameBottomFragment$onViewCreated$1(this, null));
        C6690aUB.KWHzl(gEmmrt().EZpvd(), this, new SecurityFido2RenameBottomFragment$onViewCreated$2(null));
        C6690aUB.KWHzl(gEmmrt().OLrzqt(), this, new SecurityFido2RenameBottomFragment$onViewCreated$3(this, null));
    }

    /* JADX INFO: renamed from: o.aOg$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C6403aOg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C6403aOg c6403aOg) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c6403aOg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.gEmmrt().OLrzqt(this.copydefault.AhwBna());
            }
        }
    }
}
