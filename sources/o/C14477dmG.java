package o;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dmG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14477dmG extends androidx.fragment.app.Fragment {
    public Function0<Unit> AEQbTJ;
    public Function0<Unit> KWHzl;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.dmO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C14477dmG.copydefault();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.KWHzl = function0;
        this.AEQbTJ = function02;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            AEQbTJ();
            return;
        }
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            C14482dmL.KWHzl();
            BiometricPrompt.Builder builderCU_ = C14481dmK.cU_(context.getApplicationContext());
            builderCU_.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onMenuKeyEvent));
            builderCU_.setDescription(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getThemedContext));
            builderCU_.setAllowedAuthenticators(32768);
            android.hardware.biometrics.BiometricPrompt biometricPromptBuild = builderCU_.build();
            Intrinsics.checkNotNullExpressionValue(biometricPromptBuild, "");
            biometricPromptBuild.authenticate(OLrzqt(), ContextCompat.getMainExecutor(context), C14483dmM.cS_(new TaskDescription(new WeakReference(this))));
            return;
        }
        java.lang.Object systemService = context.getSystemService("keyguard");
        Intrinsics.copydefault(systemService, "");
        android.content.Intent intentCreateConfirmDeviceCredentialIntent = ((android.app.KeyguardManager) systemService).createConfirmDeviceCredentialIntent(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onMenuKeyEvent), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getThemedContext));
        if (intentCreateConfirmDeviceCredentialIntent == null) {
            AhwBna();
            Function0<Unit> function0 = this.AEQbTJ;
            if (function0 == null) {
                Intrinsics.gEmmrt("");
                function0 = null;
            }
            function0.invoke();
            AEQbTJ();
            return;
        }
        registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.dmN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C14477dmG.KWHzl(this.OLrzqt, (ActivityResult) obj);
            }
        }).launch(intentCreateConfirmDeviceCredentialIntent);
    }

    public static final void KWHzl(C14477dmG c14477dmG, ActivityResult activityResult) {
        Function0<Unit> function0 = null;
        if (activityResult.getResultCode() == -1) {
            Function0<Unit> function02 = c14477dmG.KWHzl;
            if (function02 == null) {
                Intrinsics.gEmmrt("");
            } else {
                function0 = function02;
            }
            function0.invoke();
        } else {
            Function0<Unit> function03 = c14477dmG.AEQbTJ;
            if (function03 == null) {
                Intrinsics.gEmmrt("");
            } else {
                function0 = function03;
            }
            function0.invoke();
        }
        c14477dmG.AEQbTJ();
    }

    public final void AhwBna() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.invalidateOptionsMenu));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.areNotificationsEnabled));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.isShowing), new View.OnClickListener() { // from class: o.dmR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C14477dmG.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AEQbTJ() {
        if (isAdded()) {
            getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
    }

    public final android.os.CancellationSignal OLrzqt() {
        return (android.os.CancellationSignal) this.copydefault.getValue();
    }

    public static final android.os.CancellationSignal copydefault() {
        return new android.os.CancellationSignal();
    }

    public final void KWHzl() {
        OLrzqt().cancel();
        Function0<Unit> function0 = this.KWHzl;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        function0.invoke();
        AEQbTJ();
    }

    public final void OLrzqt(int i) {
        if (i == 14) {
            AhwBna();
        }
        OLrzqt().cancel();
        Function0<Unit> function0 = this.AEQbTJ;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        function0.invoke();
        AEQbTJ();
    }

    /* JADX INFO: renamed from: o.dmG$TaskDescription */
    public static final class TaskDescription extends BiometricPrompt$AuthenticationCallback {
        public final WeakReference<C14477dmG> OLrzqt;

        public TaskDescription(@NotNull WeakReference<C14477dmG> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "");
            this.OLrzqt = weakReference;
        }

        public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
            super.onAuthenticationSucceeded(authenticationResult);
            C14477dmG c14477dmG = this.OLrzqt.get();
            if (c14477dmG == null) {
                return;
            }
            c14477dmG.KWHzl();
        }

        public void onAuthenticationError(int i, java.lang.CharSequence charSequence) {
            super.onAuthenticationError(i, charSequence);
            C14477dmG c14477dmG = this.OLrzqt.get();
            if (c14477dmG == null) {
                return;
            }
            c14477dmG.OLrzqt(i);
        }
    }
}
