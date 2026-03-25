package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.api.service.MfaServiceResult;
import com.okinc.auth.api.service.MfaState;
import com.okinc.auth.impl.passkey.model.UnlockTokenResponse;
import com.okinc.auth.impl.passkey.ui.register.okxpay.SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$1;
import com.okinc.auth.impl.passkey.ui.register.okxpay.SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$2;
import com.okinc.auth.impl.passkey.ui.register.okxpay.SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3;
import com.okinc.auth.impl.passkey.ui.register.okxpay.SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$4;
import com.okinc.auth.impl.passkey.ui.register.okxpay.SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$5;
import com.okinc.auth.impl.passkey.ui.register.okxpay.SecurityRegisterOkxPayPasskeyServiceViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C7343ahz;
import o.C8206ayP;
import o.InterfaceC8197ayG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aNk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6354aNk extends AbstractActivityC6350aNg {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final ActivityResultLauncher<android.content.Intent> AYXKKw;
    public java.lang.String AhwBna = "SecurityRegisterOkxPayPasskeyServiceActivity";
    public final InterfaceC56387yDm djBIcL;
    public final ActivityResultLauncher<java.lang.String> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    public ActivityC6354aNk() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(SecurityRegisterOkxPayPasskeyServiceViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.register.okxpay.SecurityRegisterOkxPayPasskeyServiceActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.register.okxpay.SecurityRegisterOkxPayPasskeyServiceActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.register.okxpay.SecurityRegisterOkxPayPasskeyServiceActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        ActivityResultLauncher<java.lang.String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(InterfaceC8197ayG.Application.startMfaForResult$default((InterfaceC8197ayG) C43251rlk.copydefault(InterfaceC8197ayG.class), null, 1, null), new ActivityResultCallback() { // from class: o.aNi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6354aNk.EZpvd(this.EZpvd, (MfaServiceResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.valueOf = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aNh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6354aNk.EZpvd(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.AYXKKw = activityResultLauncherRegisterForActivityResult2;
    }

    /* JADX INFO: renamed from: o.aNk$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aNk.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC6354aNk.class);
        }
    }

    /* JADX DEBUG: Possible override for method o.aNg.KWHzl()V */
    public final SecurityRegisterOkxPayPasskeyServiceViewModel KWHzl() {
        return (SecurityRegisterOkxPayPasskeyServiceViewModel) this.djBIcL.getValue();
    }

    public static final void EZpvd(ActivityC6354aNk activityC6354aNk, MfaServiceResult mfaServiceResult) {
        MfaState mfaStateComponent1 = mfaServiceResult.component1();
        java.lang.String strComponent2 = mfaServiceResult.component2();
        C5922aFc.KWHzl.copydefault("[REGISTER]", "[FIDO2]", activityC6354aNk.getTAG() + " mfa success: " + (mfaStateComponent1 instanceof MfaState.Success));
        if (Intrinsics.EZpvd(mfaStateComponent1, MfaState.Success.AEQbTJ)) {
            activityC6354aNk.KWHzl().OLrzqt(strComponent2);
        } else {
            activityC6354aNk.copydefault(PasskeyState.Cancel.INSTANCE);
        }
    }

    public static final void EZpvd(ActivityC6354aNk activityC6354aNk, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            UnlockTokenResponse unlockTokenResponse = data != null ? (UnlockTokenResponse) data.getParcelableExtra("KEY_UNLOCK_TOKEN_RESPONSE") : null;
            C5922aFc.KWHzl.copydefault("[REGISTER]", "[FIDO2]", activityC6354aNk.getTAG() + " 2fa success: " + (unlockTokenResponse != null));
            if (unlockTokenResponse != null) {
                activityC6354aNk.KWHzl().copydefault(unlockTokenResponse);
                return;
            } else {
                activityC6354aNk.copydefault(PasskeyState.Cancel.INSTANCE);
                return;
            }
        }
        activityC6354aNk.copydefault(PasskeyState.Cancel.INSTANCE);
    }

    @Override // o.AbstractActivityC6350aNg, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i = C52761wXj.Application.fetchVPNInfo;
        overridePendingTransition(i, i);
        setContentView(C8206ayP.Application.KWHzl);
        C6690aUB.AEQbTJ(KWHzl().KWHzl(), this, new SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$1(this, null));
        C6690aUB.AEQbTJ(KWHzl().copydefault(), this, new SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$2(this, null));
        C6690aUB.AEQbTJ(KWHzl().AEQbTJ(), this, new SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3(this, null));
        C6690aUB.AEQbTJ(KWHzl().OLrzqt(), this, new SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$4(this, null));
        C6690aUB.AEQbTJ(KWHzl().EZpvd(), this, new SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$5(this, null));
        KWHzl().AhwBna();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(PasskeyState passkeyState) {
        C5922aFc.KWHzl.copydefault("[REGISTER]", "[FIDO2]", getTAG() + " finish with: " + passkeyState.log());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_REGISTER_PASSKEY_RESPONSE", passkeyState);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
        overridePendingTransition(0, C7343ahz.ActionBar.valueOf);
    }

    @Override // o.AbstractActivityC6350aNg, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6350aNg, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6350aNg, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6350aNg, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
