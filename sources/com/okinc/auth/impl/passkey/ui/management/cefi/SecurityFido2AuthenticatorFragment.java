package com.okinc.auth.impl.passkey.ui.management.cefi;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.auth.api.passkey.PasskeyManagementState;
import com.okinc.auth.api.passkey.PasskeyPromotionSource;
import com.okinc.auth.api.passkey.PasskeyRegisterConfig;
import com.okinc.auth.api.passkey.PasskeyRegisterScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyRegisterState;
import com.okinc.auth.api.passkey.PasskeyResetRemoveRequest;
import com.okinc.auth.api.passkey.PasskeyResetRemoveState;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.service.MfaServiceResult;
import com.okinc.auth.api.service.MfaState;
import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import com.okinc.auth.impl.passkey.ui.management.PasskeyDetailBottomSheet;
import com.okinc.auth.impl.passkey.ui.management.SecurityPasskeyManagementViewModel;
import com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorFragment;
import com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorViewModel;
import com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.uilab.reminder.OKReminder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC5669aAo;
import o.AbstractC6123aJR;
import o.ActivityC6153aJv;
import o.ActivityC6315aMy;
import o.ActivityC6427aPD;
import o.C32866mlf;
import o.C32868mlh;
import o.C32991mny;
import o.C33070mpX;
import o.C43251rlk;
import o.C52761wXj;
import o.C52794wYp;
import o.C55173xeu;
import o.C55239xgG;
import o.C55296xhK;
import o.C55298xhM;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56442yFn;
import o.C56524yIo;
import o.C57593ylO;
import o.C58893zTh;
import o.C6119aJN;
import o.C6403aOg;
import o.C8206ayP;
import o.InterfaceC47278tmy;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC8196ayF;
import o.InterfaceC8197ayG;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityFido2AuthenticatorFragment extends AbstractC6123aJR {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public String AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public ActivityResultLauncher<String> DbNXlk;
    public ActivityResultLauncher<Intent> djBIcL;
    public final InterfaceC56387yDm fJNWhG;
    public final int fetchVPNInfo;
    public AbstractC5669aAo gEmmrt;
    public ActivityResultLauncher<PasskeyResetRemoveRequest> isConnected;

    @yCM
    public C58893zTh passkeyTracker;

    @yCM
    public InterfaceC47278tmy userManager;
    public ActivityResultLauncher<Intent> values;

    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
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
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SecurityFido2AuthenticatorFragment() {
        this(0, 1, null);
    }

    public static final void AEQbTJ(ActivityResult activityResult) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public String getTAG() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.AxsJAYsNCnLh int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:67) call: com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorFragment.<init>(int):void type: THIS */
    public /* synthetic */ SecurityFido2AuthenticatorFragment(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.AxsJAYsNCnLh : i);
    }

    public SecurityFido2AuthenticatorFragment(int i) {
        this.fetchVPNInfo = i;
        this.AYXKKw = "SecurityFido2AuthenticatorFragment";
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorFragment$special$$inlined$viewModels$default$2
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SecurityFido2AuthenticatorViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorFragment$special$$inlined$viewModels$default$5
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SecurityPasskeyManagementViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorFragment$special$$inlined$activityViewModels$default$3
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
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.aKt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SecurityFido2AuthenticatorFragment.AYXKKw(this.copydefault);
            }
        });
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ SecurityFido2AuthenticatorFragment newInstance$default(StateListAnimator stateListAnimator, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return stateListAnimator.copydefault(z, z2);
        }

        public final SecurityFido2AuthenticatorFragment copydefault(boolean z, boolean z2) {
            SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment = new SecurityFido2AuthenticatorFragment(0, 1, null);
            securityFido2AuthenticatorFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_FINISH_AFTER_REGISTRATION", Boolean.valueOf(z)), C56390yDp.OLrzqt("KEY_AUTO_TRIGGER_REGISTRATION_WHEN_EMPTY", Boolean.valueOf(z2))));
            return securityFido2AuthenticatorFragment;
        }
    }

    public final SecurityFido2AuthenticatorViewModel valueOf() {
        return (SecurityFido2AuthenticatorViewModel) this.fJNWhG.getValue();
    }

    public final SecurityPasskeyManagementViewModel AhwBna() {
        return (SecurityPasskeyManagementViewModel) this.AkhnZx.getValue();
    }

    public final C58893zTh gEmmrt() {
        C58893zTh c58893zTh = this.passkeyTracker;
        if (c58893zTh != null) {
            return c58893zTh;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Possible override for method o.aJR.AEQbTJ()V */
    public final Boolean AEQbTJ() {
        return (Boolean) this.AhwBna.getValue();
    }

    public static final Boolean AYXKKw(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment) {
        Bundle arguments = securityFido2AuthenticatorFragment.getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean("KEY_FINISH_AFTER_REGISTRATION", false));
        }
        return null;
    }

    @Override // o.AbstractC6123aJR, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.DbNXlk = registerForActivityResult(InterfaceC8197ayG.Application.startMfaForResult$default((InterfaceC8197ayG) C43251rlk.copydefault(InterfaceC8197ayG.class), null, 1, null), new ActivityResultCallback() { // from class: o.aKx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                SecurityFido2AuthenticatorFragment.AEQbTJ(this.OLrzqt, (MfaServiceResult) obj);
            }
        });
        this.djBIcL = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aKz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                SecurityFido2AuthenticatorFragment.AEQbTJ((ActivityResult) obj);
            }
        });
        this.isConnected = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).KWHzl(context), new ActivityResultCallback() { // from class: o.aKy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                SecurityFido2AuthenticatorFragment.OLrzqt(this.AEQbTJ, (PasskeyResetRemoveState) obj);
            }
        });
        this.values = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aKw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                SecurityFido2AuthenticatorFragment.OLrzqt(this.KWHzl, (ActivityResult) obj);
            }
        });
    }

    public static final void AEQbTJ(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, MfaServiceResult mfaServiceResult) {
        MfaState mfaStateComponent1 = mfaServiceResult.component1();
        String strComponent2 = mfaServiceResult.component2();
        if (Intrinsics.EZpvd(mfaStateComponent1, MfaState.Success.AEQbTJ)) {
            securityFido2AuthenticatorFragment.valueOf().OLrzqt(strComponent2);
        } else {
            pUU.copydefault(C56524yIo.AEQbTJ(securityFido2AuthenticatorFragment.getClass()).valueOf(), "Failed to verify MFA module");
        }
    }

    public static final void OLrzqt(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, PasskeyResetRemoveState passkeyResetRemoveState) {
        pUU.EZpvd(securityFido2AuthenticatorFragment.getTAG(), "resetRemovePasskeyState: " + passkeyResetRemoveState);
    }

    public static final void OLrzqt(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, ActivityResult activityResult) {
        pUU.EZpvd(securityFido2AuthenticatorFragment.getTAG(), "routeHasReviewRequestPage:: " + activityResult);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        TextView textView;
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC5669aAo abstractC5669aAoCopydefault = AbstractC5669aAo.copydefault(view);
        this.gEmmrt = abstractC5669aAoCopydefault;
        if (abstractC5669aAoCopydefault != null) {
            C52794wYp c52794wYp = abstractC5669aAoCopydefault.copydefault;
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
            C52794wYp c52794wYp2 = abstractC5669aAoCopydefault.isConnected;
            c52794wYp2.setOnClickListener(new Dialog(c52794wYp2, 1000L, this));
            RecyclerView recyclerView = abstractC5669aAoCopydefault.KWHzl;
            recyclerView.setItemAnimator(null);
            recyclerView.addItemDecoration(new C57593ylO(C55298xhM.dp2px$default(16.0f, null, 1, null), false, false));
            recyclerView.setAdapter(new C6119aJN(new Function1() { // from class: o.aJU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SecurityFido2AuthenticatorFragment.KWHzl(this.copydefault, (AuthenticatorDisplayModel) obj);
                }
            }));
            OKReminder oKReminder = abstractC5669aAoCopydefault.DbNXlk;
            String string = getString(C8206ayP.Dialog.zuWLRA);
            Intrinsics.checkNotNullExpressionValue(string, "");
            oKReminder.setTitle(string);
            oKReminder.setMessage(getString(C8206ayP.Dialog.ffGIBT));
            oKReminder.setStyle(2);
            oKReminder.setCloseIconVisibility(false);
            OKReminder oKReminder2 = abstractC5669aAoCopydefault.EZpvd;
            String string2 = getString(C8206ayP.Dialog.OuxcSI);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            oKReminder2.setTitle(string2);
            oKReminder2.setMessage(getString(C8206ayP.Dialog.DCUTEI));
            oKReminder2.setStyle(2);
            oKReminder2.OLrzqt().setBackground(null);
            oKReminder2.OLrzqt().setImageResource(C52761wXj.TaskDescription.DGUQLI);
            oKReminder2.setOnClickListener(new Fragment(oKReminder2, 1000L, oKReminder2, this));
            final OKReminder oKReminder3 = abstractC5669aAoCopydefault.fetchVPNInfo;
            oKReminder3.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.QXDzTk));
            oKReminder3.setMessage(C33070mpX.AYXKKw(C8206ayP.Dialog.RVsVBY));
            oKReminder3.setStyle(0);
            oKReminder3.setCloseIconVisibility(false);
            oKReminder3.setPrimaryAction(C33070mpX.AYXKKw(C8206ayP.Dialog.RKcVTr), new Function0() { // from class: o.aKg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SecurityFido2AuthenticatorFragment.AEQbTJ(this.EZpvd, oKReminder3);
                }
            });
            C55239xgG c55239xgG = abstractC5669aAoCopydefault.djBIcL;
            c55239xgG.setOnClickListener(new PendingIntent(c55239xgG, 1000L, abstractC5669aAoCopydefault, this));
        }
        AbstractC5669aAo abstractC5669aAo = this.gEmmrt;
        if (abstractC5669aAo == null || (textView = abstractC5669aAo.gEmmrt) == null) {
            return;
        }
        textView.setText(KWHzl(getString(C8206ayP.Dialog.dvImUD) + " ", C52761wXj.TaskDescription.EZpvd));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(valueOf().ejfBZ(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new AnonymousClass2(null));
        valueOf().OLrzqt().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.aKe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.OLrzqt(this.KWHzl, (SecurityFido2AuthenticatorViewModel.StateListAnimator) obj);
            }
        }));
        valueOf().valueOf().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aKl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.AEQbTJ(this.KWHzl, (java.util.List) obj);
            }
        }));
        valueOf().DbNXlk().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aKh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.values(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        valueOf().fIwbmz().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aKk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.fetchVPNInfo(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        valueOf().AYXKKw().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aKj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.isConnected(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        valueOf().fetchVPNInfo().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aKi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.DbNXlk(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        valueOf().values().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aKo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.AkhnZx(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        valueOf().AkhnZx().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aKm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.fJNWhG(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        valueOf().iwGUEr().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aJT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.fIwbmz(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        valueOf().isConnected().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aJY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.KWHzl(this.EZpvd, (Unit) obj);
            }
        }));
        valueOf().AuCTel().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aJZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.gEmmrt(this.EZpvd, (Unit) obj);
            }
        }));
        SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModelValueOf = valueOf();
        securityFido2AuthenticatorViewModelValueOf.getFieldNames().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aJX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.ejfBZ(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        securityFido2AuthenticatorViewModelValueOf.uzCIH().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aKb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.AuCTel(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        securityFido2AuthenticatorViewModelValueOf.wlaJM().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aKa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.AYXKKw(this.copydefault, (Unit) obj);
            }
        }));
        securityFido2AuthenticatorViewModelValueOf.AhwBna().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aKd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.AhwBna(this.AEQbTJ, (Unit) obj);
            }
        }));
        AhwBna().OLrzqt().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aKf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.fARcdN(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        AYXKKw();
    }

    public static final Unit KWHzl(final SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, AuthenticatorDisplayModel authenticatorDisplayModel) {
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        PasskeyDetailBottomSheet passkeyDetailBottomSheetAEQbTJ = PasskeyDetailBottomSheet.Companion.AEQbTJ(authenticatorDisplayModel, securityFido2AuthenticatorFragment.valueOf().djBIcL(), new Function1() { // from class: o.aKn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.AYXKKw(this.EZpvd, (AuthenticatorDisplayModel) obj);
            }
        }, new Function1() { // from class: o.aKs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.djBIcL(this.OLrzqt, (AuthenticatorDisplayModel) obj);
            }
        }, new Function1() { // from class: o.aKr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorFragment.AhwBna(this.EZpvd, (AuthenticatorDisplayModel) obj);
            }
        });
        FragmentManager parentFragmentManager = securityFido2AuthenticatorFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        passkeyDetailBottomSheetAEQbTJ.show(parentFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, AuthenticatorDisplayModel authenticatorDisplayModel) {
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        securityFido2AuthenticatorFragment.valueOf().EZpvd(authenticatorDisplayModel);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, AuthenticatorDisplayModel authenticatorDisplayModel) {
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        securityFido2AuthenticatorFragment.valueOf().copydefault(authenticatorDisplayModel);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, AuthenticatorDisplayModel authenticatorDisplayModel) {
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        ActivityResultLauncher<PasskeyResetRemoveRequest> activityResultLauncher = securityFido2AuthenticatorFragment.isConnected;
        if (activityResultLauncher == null) {
            Intrinsics.gEmmrt("");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(new PasskeyResetRemoveRequest(new PasskeyResetRemoveType.Reset(authenticatorDisplayModel.AhwBna(), authenticatorDisplayModel.copydefault(), authenticatorDisplayModel.fetchVPNInfo()), false, null, false, false, 30, null));
        return Unit.INSTANCE;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ SecurityFido2AuthenticatorFragment KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = securityFido2AuthenticatorFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ActivityResultLauncher activityResultLauncher = this.KWHzl.isConnected;
                if (activityResultLauncher == null) {
                    Intrinsics.gEmmrt("");
                    activityResultLauncher = null;
                }
                activityResultLauncher.launch(new PasskeyResetRemoveRequest(PasskeyResetRemoveType.BatchRemove.AEQbTJ, false, null, false, false, 30, null));
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ SecurityFido2AuthenticatorFragment EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(View view, long j, SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = securityFido2AuthenticatorFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.valueOf().copydefault();
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ OKReminder AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ SecurityFido2AuthenticatorFragment OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j, OKReminder oKReminder, SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = oKReminder;
            this.OLrzqt = securityFido2AuthenticatorFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Intent intent = new Intent(this.AEQbTJ.getContext(), (Class<?>) ActivityC6427aPD.class);
                ActivityResultLauncher activityResultLauncher = this.OLrzqt.values;
                if (activityResultLauncher == null) {
                    Intrinsics.gEmmrt("");
                    activityResultLauncher = null;
                }
                activityResultLauncher.launch(intent);
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ AbstractC5669aAo EZpvd;
        public final /* synthetic */ SecurityFido2AuthenticatorFragment KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(View view, long j, AbstractC5669aAo abstractC5669aAo, SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = abstractC5669aAo;
            this.KWHzl = securityFido2AuthenticatorFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Triple triple;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.djBIcL.setChecked(!r7.isChecked());
                if (this.EZpvd.djBIcL.isChecked()) {
                    triple = new Triple(this.KWHzl.getString(C8206ayP.Dialog.UscePu), this.KWHzl.getString(C8206ayP.Dialog.aHXSQp), this.KWHzl.getString(C8206ayP.Dialog.dLBcXg));
                } else {
                    triple = new Triple(this.KWHzl.getString(C8206ayP.Dialog.fLIjIY), this.KWHzl.getString(C8206ayP.Dialog.aJFbMH), this.KWHzl.getString(C8206ayP.Dialog.apNbdB));
                }
                Object objComponent1 = triple.component1();
                Intrinsics.checkNotNullExpressionValue(objComponent1, "");
                String str = (String) objComponent1;
                Object objComponent2 = triple.component2();
                Intrinsics.checkNotNullExpressionValue(objComponent2, "");
                String str2 = (String) objComponent2;
                Object objComponent3 = triple.component3();
                Intrinsics.checkNotNullExpressionValue(objComponent3, "");
                String str3 = (String) objComponent3;
                Context context = this.KWHzl.getContext();
                if (context != null) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(str);
                    viewOnClickListenerC54939xaY.EZpvd(str2);
                    String string = this.KWHzl.getString(C8206ayP.Dialog.RAQtXZ);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) string, (View.OnClickListener) this.KWHzl.new ActionBar(str3, viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.OLrzqt(C8206ayP.Dialog.geLlBI, new Activity(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    public static final Unit AEQbTJ(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, OKReminder oKReminder) {
        securityFido2AuthenticatorFragment.gEmmrt().EZpvd();
        FragmentActivity activity = securityFido2AuthenticatorFragment.getActivity();
        if (activity != null) {
            PasskeySyncStepperActivity.Activity activity2 = PasskeySyncStepperActivity.Companion;
            Context context = oKReminder.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            activity.startActivity(activity2.AEQbTJ(context));
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ String EZpvd;
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = str;
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SecurityFido2AuthenticatorFragment.this.valueOf().copydefault(this.EZpvd);
            this.KWHzl.dismiss();
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.OLrzqt.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorFragment$initView$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = SecurityFido2AuthenticatorFragment.this.new AnonymousClass2(continuation);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (this.Z$0) {
                    SecurityFido2AuthenticatorFragment.this.showLoadingAtOnce();
                } else {
                    SecurityFido2AuthenticatorFragment.this.releaseLoading();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Unit OLrzqt(final SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, SecurityFido2AuthenticatorViewModel.StateListAnimator stateListAnimator) {
        ActivityResultRegistry activityResultRegistry;
        ActivityResultLauncher activityResultLauncherRegister;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        if (stateListAnimator instanceof SecurityFido2AuthenticatorViewModel.StateListAnimator.LoaderManager) {
            C55326xho.toast$default(((SecurityFido2AuthenticatorViewModel.StateListAnimator.LoaderManager) stateListAnimator).AEQbTJ(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        } else {
            ActivityResultLauncher activityResultLauncher = null;
            if (stateListAnimator instanceof SecurityFido2AuthenticatorViewModel.StateListAnimator.PendingIntent) {
                C55326xho.toastWithSuccessfulIcon$default(((SecurityFido2AuthenticatorViewModel.StateListAnimator.PendingIntent) stateListAnimator).EZpvd(), 0, 1, (Object) null);
            } else if (stateListAnimator instanceof SecurityFido2AuthenticatorViewModel.StateListAnimator.FragmentManager) {
                C55326xho.toastWithFailedIcon$default(((SecurityFido2AuthenticatorViewModel.StateListAnimator.FragmentManager) stateListAnimator).copydefault(), 0, 1, (Object) null);
            } else if (Intrinsics.EZpvd(stateListAnimator, SecurityFido2AuthenticatorViewModel.StateListAnimator.TaskDescription.copydefault)) {
                C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C8206ayP.Dialog.QVAiDq), 0, 1, (Object) null);
            } else if (Intrinsics.EZpvd(stateListAnimator, SecurityFido2AuthenticatorViewModel.StateListAnimator.Activity.EZpvd)) {
                Context context = securityFido2AuthenticatorFragment.getContext();
                if (context == null) {
                    return Unit.INSTANCE;
                }
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.iKEqwx));
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C8206ayP.Dialog.zzQwtT));
                viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C8206ayP.Dialog.hrjNmC), new View.OnClickListener() { // from class: o.aJS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        SecurityFido2AuthenticatorFragment.KWHzl(viewOnClickListenerC54939xaY, view);
                    }
                });
                viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.dzCpvv), new View.OnClickListener() { // from class: o.aKc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        SecurityFido2AuthenticatorFragment.EZpvd(this.copydefault, viewOnClickListenerC54939xaY, view);
                    }
                });
                viewOnClickListenerC54939xaY.setCancelable(false);
                viewOnClickListenerC54939xaY.show();
            } else if (stateListAnimator instanceof SecurityFido2AuthenticatorViewModel.StateListAnimator.C0239StateListAnimator) {
                AuthenticatorDisplayModel authenticatorDisplayModelCopydefault = ((SecurityFido2AuthenticatorViewModel.StateListAnimator.C0239StateListAnimator) stateListAnimator).copydefault();
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                C6403aOg.Companion.KWHzl(string, authenticatorDisplayModelCopydefault, false).show(securityFido2AuthenticatorFragment.getParentFragmentManager(), "");
                securityFido2AuthenticatorFragment.getParentFragmentManager().setFragmentResultListener(string, securityFido2AuthenticatorFragment.getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.aKq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.fragment.app.FragmentResultListener
                    public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                        SecurityFido2AuthenticatorFragment.copydefault(this.KWHzl, str, bundle);
                    }
                });
            } else if (stateListAnimator instanceof SecurityFido2AuthenticatorViewModel.StateListAnimator.Application) {
                FragmentActivity activity = securityFido2AuthenticatorFragment.getActivity();
                if (activity != null && (activityResultRegistry = activity.getActivityResultRegistry()) != null && (activityResultLauncherRegister = activityResultRegistry.register(SecurityFido2AuthenticatorFragment.class.getSimpleName(), InterfaceC8196ayF.Activity.registerPasskey$default((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class), new Function0() { // from class: o.aKv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return SecurityFido2AuthenticatorFragment.djBIcL(this.OLrzqt);
                    }
                }, null, 2, null), new ActivityResultCallback() { // from class: o.aKu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(java.lang.Object obj) {
                        SecurityFido2AuthenticatorFragment.AEQbTJ(this.AEQbTJ, (PasskeyRegisterState) obj);
                    }
                })) != null) {
                    activityResultLauncherRegister.launch(new PasskeyRegisterScenarioRequest(PasskeyScenario.Account.AEQbTJ, new PasskeyRegisterConfig(false, null, ((SecurityFido2AuthenticatorViewModel.StateListAnimator.Application) stateListAnimator).OLrzqt(), null, PasskeyPromotionSource.SECURITY_CENTER, false, true, 42, null)));
                }
            } else if (stateListAnimator instanceof SecurityFido2AuthenticatorViewModel.StateListAnimator.Fragment) {
                SecurityFido2AuthenticatorViewModel.StateListAnimator.Fragment fragment = (SecurityFido2AuthenticatorViewModel.StateListAnimator.Fragment) stateListAnimator;
                AuthenticatorDisplayModel authenticatorDisplayModelKWHzl = fragment.KWHzl();
                ActivityResultLauncher<PasskeyResetRemoveRequest> activityResultLauncher2 = securityFido2AuthenticatorFragment.isConnected;
                if (activityResultLauncher2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    activityResultLauncher = activityResultLauncher2;
                }
                activityResultLauncher.launch(new PasskeyResetRemoveRequest(new PasskeyResetRemoveType.Remove(authenticatorDisplayModelKWHzl.AhwBna(), authenticatorDisplayModelKWHzl.copydefault(), authenticatorDisplayModelKWHzl.fetchVPNInfo()), false, null, false, fragment.copydefault(), 14, null));
            } else {
                if (!(stateListAnimator instanceof SecurityFido2AuthenticatorViewModel.StateListAnimator.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActivityResultLauncher<String> activityResultLauncher3 = securityFido2AuthenticatorFragment.DbNXlk;
                if (activityResultLauncher3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    activityResultLauncher = activityResultLauncher3;
                }
                activityResultLauncher.launch(((SecurityFido2AuthenticatorViewModel.StateListAnimator.ActionBar) stateListAnimator).OLrzqt());
            }
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        if (securityFido2AuthenticatorFragment.isAdded()) {
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    public static final void copydefault(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        securityFido2AuthenticatorFragment.valueOf().zLjUOn();
    }

    public static final Unit djBIcL(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment) {
        Context context;
        try {
            context = securityFido2AuthenticatorFragment.getContext();
        } catch (Exception e) {
            pUU.copydefault("SecurityFido2AuthenticatorFragment", "alreadyExistedListener: " + e.getMessage());
            C55326xho.toast$default(C33070mpX.AYXKKw(C8206ayP.Dialog.dNCPSb), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
        if (context == null) {
            return Unit.INSTANCE;
        }
        ActivityResultLauncher<Intent> activityResultLauncher = securityFido2AuthenticatorFragment.djBIcL;
        if (activityResultLauncher == null) {
            pUU.copydefault("SecurityFido2AuthenticatorFragment", "alreadyExistedListener: alreadyExistedLauncher is not initialized");
        } else {
            if (activityResultLauncher == null) {
                Intrinsics.gEmmrt("");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(new Intent(context, (Class<?>) ActivityC6315aMy.class));
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, PasskeyRegisterState passkeyRegisterState) {
        if ((passkeyRegisterState instanceof PasskeyRegisterState.Success) && Intrinsics.EZpvd(securityFido2AuthenticatorFragment.AEQbTJ(), Boolean.TRUE)) {
            FragmentActivity activity = securityFido2AuthenticatorFragment.getActivity();
            ActivityC6153aJv activityC6153aJv = activity instanceof ActivityC6153aJv ? (ActivityC6153aJv) activity : null;
            if (activityC6153aJv != null) {
                activityC6153aJv.KWHzl(PasskeyManagementState.FinishRegistration.EZpvd);
            }
        }
    }

    public static final Unit AEQbTJ(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, List list) {
        RecyclerView recyclerView;
        AbstractC5669aAo abstractC5669aAo = securityFido2AuthenticatorFragment.gEmmrt;
        RecyclerView.Adapter adapter = (abstractC5669aAo == null || (recyclerView = abstractC5669aAo.KWHzl) == null) ? null : recyclerView.getAdapter();
        C6119aJN c6119aJN = adapter instanceof C6119aJN ? (C6119aJN) adapter : null;
        if (c6119aJN != null) {
            c6119aJN.submitList(list);
        }
        return Unit.INSTANCE;
    }

    public static final Unit values(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, Boolean bool) {
        AbstractC5669aAo abstractC5669aAo = securityFido2AuthenticatorFragment.gEmmrt;
        if (abstractC5669aAo != null) {
            abstractC5669aAo.AEQbTJ.setEmptyTypeImage(6);
            C55173xeu c55173xeu = abstractC5669aAo.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(bool.booleanValue() ? 0 : 8);
            RecyclerView recyclerView = abstractC5669aAo.KWHzl;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(bool.booleanValue() ^ true ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, Boolean bool) {
        AbstractC5669aAo abstractC5669aAo = securityFido2AuthenticatorFragment.gEmmrt;
        if (abstractC5669aAo != null) {
            C52794wYp c52794wYp = abstractC5669aAo.isConnected;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(bool.booleanValue() ? 0 : 8);
            if (bool.booleanValue()) {
                C55173xeu c55173xeu = abstractC5669aAo.AEQbTJ;
                String string = securityFido2AuthenticatorFragment.getString(C8206ayP.Dialog.hvKCwS);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55173xeu.setTitle(string);
                C55173xeu c55173xeu2 = abstractC5669aAo.AEQbTJ;
                String string2 = securityFido2AuthenticatorFragment.getString(C8206ayP.Dialog.sTzBva);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                c55173xeu2.setSubTitle((CharSequence) string2);
            } else {
                C55173xeu c55173xeu3 = abstractC5669aAo.AEQbTJ;
                String string3 = securityFido2AuthenticatorFragment.getString(C8206ayP.Dialog.hBpjJd);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                c55173xeu3.setTitle(string3);
                C55173xeu c55173xeu4 = abstractC5669aAo.AEQbTJ;
                String string4 = securityFido2AuthenticatorFragment.getString(C8206ayP.Dialog.dmfpNf);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                c55173xeu4.setSubTitle((CharSequence) string4);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, Boolean bool) {
        C52794wYp c52794wYp;
        AbstractC5669aAo abstractC5669aAo = securityFido2AuthenticatorFragment.gEmmrt;
        if (abstractC5669aAo != null && (c52794wYp = abstractC5669aAo.copydefault) != null) {
            c52794wYp.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        if (bool.booleanValue()) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("PasskeyNotSupport_Full_Page_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, Boolean bool) {
        AbstractC5669aAo abstractC5669aAo = securityFido2AuthenticatorFragment.gEmmrt;
        if (abstractC5669aAo != null) {
            OKReminder oKReminder = abstractC5669aAo.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(oKReminder, "");
            oKReminder.setVisibility(bool.booleanValue() ? 0 : 8);
            securityFido2AuthenticatorFragment.djBIcL();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, Boolean bool) {
        AbstractC5669aAo abstractC5669aAo = securityFido2AuthenticatorFragment.gEmmrt;
        if (abstractC5669aAo != null) {
            OKReminder oKReminder = abstractC5669aAo.EZpvd;
            Intrinsics.checkNotNullExpressionValue(oKReminder, "");
            if (oKReminder.getVisibility() == 0) {
                OKReminder oKReminder2 = abstractC5669aAo.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(oKReminder2, "");
                oKReminder2.setVisibility(8);
            } else {
                if (bool.booleanValue()) {
                    securityFido2AuthenticatorFragment.gEmmrt().AYXKKw();
                }
                OKReminder oKReminder3 = abstractC5669aAo.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(oKReminder3, "");
                oKReminder3.setVisibility(bool.booleanValue() ? 0 : 8);
            }
            securityFido2AuthenticatorFragment.djBIcL();
        }
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, Boolean bool) {
        AbstractC5669aAo abstractC5669aAo = securityFido2AuthenticatorFragment.gEmmrt;
        if (abstractC5669aAo != null) {
            OKReminder oKReminder = abstractC5669aAo.EZpvd;
            Intrinsics.checkNotNullExpressionValue(oKReminder, "");
            oKReminder.setVisibility(bool.booleanValue() ? 0 : 8);
            if (bool.booleanValue()) {
                OKReminder oKReminder2 = abstractC5669aAo.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(oKReminder2, "");
                oKReminder2.setVisibility(8);
                OKReminder oKReminder3 = abstractC5669aAo.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(oKReminder3, "");
                oKReminder3.setVisibility(8);
            }
            securityFido2AuthenticatorFragment.djBIcL();
        }
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, Boolean bool) {
        Collection collectionAhwBna;
        RecyclerView recyclerView;
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        AbstractC5669aAo abstractC5669aAo = securityFido2AuthenticatorFragment.gEmmrt;
        if (abstractC5669aAo != null && (c52794wYp2 = abstractC5669aAo.isConnected) != null) {
            c52794wYp2.setEnabled(bool.booleanValue());
        }
        AbstractC5669aAo abstractC5669aAo2 = securityFido2AuthenticatorFragment.gEmmrt;
        if (abstractC5669aAo2 != null && (c52794wYp = abstractC5669aAo2.copydefault) != null) {
            c52794wYp.setEnabled(bool.booleanValue());
        }
        AbstractC5669aAo abstractC5669aAo3 = securityFido2AuthenticatorFragment.gEmmrt;
        RecyclerView.Adapter adapter = (abstractC5669aAo3 == null || (recyclerView = abstractC5669aAo3.KWHzl) == null) ? null : recyclerView.getAdapter();
        C6119aJN c6119aJN = adapter instanceof C6119aJN ? (C6119aJN) adapter : null;
        List<AuthenticatorDisplayModel> value = securityFido2AuthenticatorFragment.valueOf().valueOf().getValue();
        if (value == null) {
            collectionAhwBna = yDY.AhwBna();
        } else {
            collectionAhwBna = new ArrayList(C56403yEb.AYXKKw(value, 10));
            for (AuthenticatorDisplayModel authenticatorDisplayModel : value) {
                Intrinsics.copydefault(bool);
                collectionAhwBna.add(authenticatorDisplayModel.copydefault((32255 & 1) != 0 ? authenticatorDisplayModel.valueOf : null, (32255 & 2) != 0 ? authenticatorDisplayModel.gEmmrt : null, (32255 & 4) != 0 ? authenticatorDisplayModel.isConnected : null, (32255 & 8) != 0 ? authenticatorDisplayModel.AkhnZx : null, (32255 & 16) != 0 ? authenticatorDisplayModel.AhwBna : false, (32255 & 32) != 0 ? authenticatorDisplayModel.AYXKKw : null, (32255 & 64) != 0 ? authenticatorDisplayModel.KWHzl : null, (32255 & 128) != 0 ? authenticatorDisplayModel.EZpvd : 0, (32255 & 256) != 0 ? authenticatorDisplayModel.AEQbTJ : null, (32255 & 512) != 0 ? authenticatorDisplayModel.djBIcL : bool.booleanValue(), (32255 & 1024) != 0 ? authenticatorDisplayModel.fARcdN : false, (32255 & 2048) != 0 ? authenticatorDisplayModel.fIwbmz : false, (32255 & 4096) != 0 ? authenticatorDisplayModel.fetchVPNInfo : false, (32255 & 8192) != 0 ? authenticatorDisplayModel.DbNXlk : false, (32255 & 16384) != 0 ? authenticatorDisplayModel.values : false));
            }
        }
        if (c6119aJN != null) {
            c6119aJN.submitList(collectionAhwBna);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, Unit unit) {
        Context context = securityFido2AuthenticatorFragment.getContext();
        if (context == null) {
            return Unit.INSTANCE;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(securityFido2AuthenticatorFragment.getString(C8206ayP.Dialog.cBPFI));
        viewOnClickListenerC54939xaY.EZpvd(securityFido2AuthenticatorFragment.getString(C8206ayP.Dialog.gtdfxv));
        String string = securityFido2AuthenticatorFragment.getString(C8206ayP.Dialog.frkDMe);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) string, new View.OnClickListener() { // from class: o.aJV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                SecurityFido2AuthenticatorFragment.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit gEmmrt(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, Unit unit) {
        Context context = securityFido2AuthenticatorFragment.getContext();
        if (context == null) {
            return Unit.INSTANCE;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(securityFido2AuthenticatorFragment.getString(C8206ayP.Dialog.DsrFlB));
        viewOnClickListenerC54939xaY.EZpvd(securityFido2AuthenticatorFragment.getString(C8206ayP.Dialog.DaRZkR));
        String string = securityFido2AuthenticatorFragment.getString(C8206ayP.Dialog.frkDMe);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) string, new View.OnClickListener() { // from class: o.aKp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                SecurityFido2AuthenticatorFragment.AYXKKw(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit ejfBZ(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, Boolean bool) {
        LinearLayout linearLayout;
        AbstractC5669aAo abstractC5669aAo = securityFido2AuthenticatorFragment.gEmmrt;
        if (abstractC5669aAo != null && (linearLayout = abstractC5669aAo.AhwBna) != null) {
            linearLayout.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, Boolean bool) {
        C55239xgG c55239xgG;
        AbstractC5669aAo abstractC5669aAo = securityFido2AuthenticatorFragment.gEmmrt;
        if (abstractC5669aAo != null && (c55239xgG = abstractC5669aAo.djBIcL) != null) {
            c55239xgG.setChecked(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, Unit unit) {
        AbstractC5669aAo abstractC5669aAo = securityFido2AuthenticatorFragment.gEmmrt;
        if (abstractC5669aAo != null) {
            abstractC5669aAo.djBIcL.setChecked(!r0.isChecked());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, Unit unit) {
        securityFido2AuthenticatorFragment.AhwBna().AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, Boolean bool) {
        Space space;
        Space space2;
        Space space3;
        AbstractC5669aAo abstractC5669aAo = securityFido2AuthenticatorFragment.gEmmrt;
        if (abstractC5669aAo != null && (space3 = abstractC5669aAo.AkhnZx) != null) {
            space3.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        AbstractC5669aAo abstractC5669aAo2 = securityFido2AuthenticatorFragment.gEmmrt;
        if (abstractC5669aAo2 != null && (space2 = abstractC5669aAo2.AYXKKw) != null) {
            space2.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        AbstractC5669aAo abstractC5669aAo3 = securityFido2AuthenticatorFragment.gEmmrt;
        if (abstractC5669aAo3 != null && (space = abstractC5669aAo3.OLrzqt) != null) {
            space.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    public final SpannableString KWHzl(String str, int i) {
        SpannableString spannableString = new SpannableString(str + " ");
        Context context = getContext();
        Drawable drawable = context != null ? ContextCompat.getDrawable(context, i) : null;
        if (getContext() != null && drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        Intrinsics.copydefault(drawable);
        spannableString.setSpan(new ImageSpan(drawable, 0), str.length(), str.length() + 1, 33);
        spannableString.setSpan(new TaskDescription(), str.length(), str.length() + 1, 33);
        return spannableString;
    }

    public static final class TaskDescription extends ClickableSpan {
        public TaskDescription() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Context context = SecurityFido2AuthenticatorFragment.this.getContext();
            if (context != null) {
                SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment = SecurityFido2AuthenticatorFragment.this;
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(securityFido2AuthenticatorFragment.getString(C8206ayP.Dialog.fXHmeK));
                viewOnClickListenerC54939xaY.EZpvd(securityFido2AuthenticatorFragment.getString(C8206ayP.Dialog.alsFma));
                String string = securityFido2AuthenticatorFragment.getString(C8206ayP.Dialog.RvdRAu);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) string, new View.OnClickListener() { // from class: o.aKA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        SecurityFido2AuthenticatorFragment.TaskDescription.EZpvd(viewOnClickListenerC54939xaY, view2);
                    }
                });
                viewOnClickListenerC54939xaY.show();
            }
        }

        public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    public final void AYXKKw() {
        getParentFragmentManager().setFragmentResultListener("REQUEST_RENAME_EXCHANGE", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.aJW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                SecurityFido2AuthenticatorFragment.OLrzqt(this.EZpvd, str, bundle);
            }
        });
    }

    public static final void OLrzqt(SecurityFido2AuthenticatorFragment securityFido2AuthenticatorFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        securityFido2AuthenticatorFragment.valueOf().zLjUOn();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void djBIcL() {
        int i;
        AbstractC5669aAo abstractC5669aAo = this.gEmmrt;
        if (abstractC5669aAo != null) {
            FrameLayout frameLayout = abstractC5669aAo.values;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            OKReminder oKReminder = abstractC5669aAo.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(oKReminder, "");
            if (oKReminder.getVisibility() == 0) {
                i = 0;
            } else {
                OKReminder oKReminder2 = abstractC5669aAo.EZpvd;
                Intrinsics.checkNotNullExpressionValue(oKReminder2, "");
                if (oKReminder2.getVisibility() != 0) {
                    OKReminder oKReminder3 = abstractC5669aAo.fetchVPNInfo;
                    Intrinsics.checkNotNullExpressionValue(oKReminder3, "");
                    if (oKReminder3.getVisibility() != 0) {
                        i = 8;
                    }
                }
            }
            frameLayout.setVisibility(i);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        valueOf().zLjUOn();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.gEmmrt = null;
    }
}
