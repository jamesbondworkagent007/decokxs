package o;

import android.os.Build;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import com.okinc.auth.impl.guard.utils.BiometricServiceImpl$authBiometric$2;
import java.security.InvalidKeyException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import o.C5698aBQ;
import o.C8206ayP;
import o.InterfaceC5693aBL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aBQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5698aBQ extends AbstractC43215rlA implements InterfaceC5697aBP {
    @yCM
    public C5698aBQ() {
    }

    @Override // o.InterfaceC5697aBP
    public ActivityResultContract<Unit, java.lang.Boolean> copydefault() {
        return new TaskDescription();
    }

    /* JADX INFO: renamed from: o.aBQ$TaskDescription */
    public static final class TaskDescription extends ActivityResultContract<Unit, java.lang.Boolean> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, Unit unit) {
            android.content.Intent intent;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(unit, "");
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    intent = new android.content.Intent("android.settings.BIOMETRIC_ENROLL").putExtra("android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED", 15);
                } else if (i >= 28) {
                    android.content.Intent intent2 = new android.content.Intent("android.settings.FINGERPRINT_ENROLL");
                    intent = intent2.resolveActivity(context.getPackageManager()) != null ? intent2 : new android.content.Intent("android.settings.SECURITY_SETTINGS");
                } else {
                    intent = new android.content.Intent("android.settings.SECURITY_SETTINGS");
                }
                Intrinsics.copydefault(intent);
                return intent;
            } catch (java.lang.Exception e) {
                pUU.copydefault("BiometricServiceImpl", "e: " + e.getMessage());
                return new android.content.Intent("android.settings.SECURITY_SETTINGS");
            }
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean parseResult(int i, android.content.Intent intent) {
            BiometricManager biometricManagerFrom = BiometricManager.from(C32979mnm.EZpvd.OLrzqt().getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(biometricManagerFrom, "");
            return java.lang.Boolean.valueOf(biometricManagerFrom.canAuthenticate(15) == 0);
        }
    }

    @Override // o.InterfaceC5697aBP
    public java.lang.Object OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, @NotNull C5700aBS c5700aBS, @NotNull Continuation<? super InterfaceC5693aBL> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new BiometricServiceImpl$authBiometric$2(this, fragment, c5700aBS, null), continuation);
    }

    /* JADX INFO: renamed from: o.aBQ$StateListAnimator */
    public static final class StateListAnimator extends BiometricPrompt.AuthenticationCallback {
        public final /* synthetic */ C5700aBS AEQbTJ;
        public final /* synthetic */ Continuation<InterfaceC5693aBL> KWHzl;
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;
        public final /* synthetic */ C5698aBQ copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super o.aBL> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Continuation<? super InterfaceC5693aBL> continuation, C5698aBQ c5698aBQ, androidx.fragment.app.Fragment fragment, C5700aBS c5700aBS) {
            this.KWHzl = continuation;
            this.copydefault = c5698aBQ;
            this.OLrzqt = fragment;
            this.AEQbTJ = c5700aBS;
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
            Intrinsics.checkNotNullParameter(authenticationResult, "");
            try {
                BiometricPrompt.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
                java.security.Signature signature = cryptoObject != null ? cryptoObject.getSignature() : null;
                Intrinsics.copydefault(signature);
                Continuation<InterfaceC5693aBL> continuation = this.KWHzl;
                Result.Application application = Result.Companion;
                continuation.resumeWith(Result.m7377constructorimpl(new InterfaceC5693aBL.TaskDescription(signature)));
            } catch (java.lang.Exception e) {
                Continuation<InterfaceC5693aBL> continuation2 = this.KWHzl;
                Result.Application application2 = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(new InterfaceC5693aBL.StateListAnimator.ActionBar(null, e.getMessage())));
            }
        }

        public static final Unit KWHzl(C5698aBQ c5698aBQ, Continuation continuation, androidx.fragment.app.Fragment fragment, C5700aBS c5700aBS) {
            c5698aBQ.EZpvd(continuation, fragment, c5700aBS);
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(Continuation continuation, int i) {
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(new InterfaceC5693aBL.StateListAnimator.ActionBar(java.lang.Integer.valueOf(i), null)));
            return Unit.INSTANCE;
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationError(int i, java.lang.CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            if (i != 5) {
                if (i != 7) {
                    if (i != 13) {
                        switch (i) {
                            case 9:
                                break;
                            case 10:
                                break;
                            case 11:
                                Continuation<InterfaceC5693aBL> continuation = this.KWHzl;
                                Result.Application application = Result.Companion;
                                continuation.resumeWith(Result.m7377constructorimpl(InterfaceC5693aBL.StateListAnimator.TaskDescription.EZpvd));
                                break;
                            default:
                                Continuation<InterfaceC5693aBL> continuation2 = this.KWHzl;
                                Result.Application application2 = Result.Companion;
                                continuation2.resumeWith(Result.m7377constructorimpl(new InterfaceC5693aBL.StateListAnimator.ActionBar(java.lang.Integer.valueOf(i), null)));
                                break;
                        }
                    }
                }
                final C5698aBQ c5698aBQ = this.copydefault;
                final androidx.fragment.app.Fragment fragment = this.OLrzqt;
                final C5700aBS c5700aBS = this.AEQbTJ;
                final Continuation<InterfaceC5693aBL> continuation3 = this.KWHzl;
                Function0 function0 = new Function0() { // from class: o.aBV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C5698aBQ.StateListAnimator.KWHzl(c5698aBQ, continuation3, fragment, c5700aBS);
                    }
                };
                final Continuation<InterfaceC5693aBL> continuation4 = this.KWHzl;
                c5698aBQ.AEQbTJ(fragment, c5700aBS, function0, new Function1() { // from class: o.aBT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C5698aBQ.StateListAnimator.copydefault(continuation4, ((java.lang.Integer) obj).intValue());
                    }
                });
                return;
            }
            Continuation<InterfaceC5693aBL> continuation5 = this.KWHzl;
            Result.Application application3 = Result.Companion;
            continuation5.resumeWith(Result.m7377constructorimpl(InterfaceC5693aBL.StateListAnimator.Activity.copydefault));
        }
    }

    public final void EZpvd(Continuation<? super InterfaceC5693aBL> continuation, androidx.fragment.app.Fragment fragment, C5700aBS c5700aBS) {
        StateListAnimator stateListAnimator = new StateListAnimator(continuation, this, fragment, c5700aBS);
        try {
            BiometricPrompt.PromptInfo.Builder builder = new BiometricPrompt.PromptInfo.Builder();
            C32979mnm c32979mnm = C32979mnm.EZpvd;
            BiometricPrompt.PromptInfo promptInfoBuild = builder.setTitle(c32979mnm.OLrzqt().getString(C8206ayP.Dialog.fGQ)).setConfirmationRequired(false).setNegativeButtonText(c32979mnm.OLrzqt().getString(C8206ayP.Dialog.geLlBI)).setAllowedAuthenticators(15).build();
            Intrinsics.checkNotNullExpressionValue(promptInfoBuild, "");
            new androidx.biometric.BiometricPrompt(fragment, stateListAnimator).authenticate(promptInfoBuild, new BiometricPrompt.CryptoObject(C5692aBK.KWHzl.OLrzqt(c5700aBS)));
        } catch (InvalidKeyException unused) {
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(InterfaceC5693aBL.StateListAnimator.Application.EZpvd));
        } catch (java.lang.Exception e) {
            Result.Application application2 = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(new InterfaceC5693aBL.StateListAnimator.ActionBar(null, e.getMessage())));
        }
    }

    /* JADX INFO: renamed from: o.aBQ$ActionBar */
    public static final class ActionBar extends BiometricPrompt.AuthenticationCallback {
        public final /* synthetic */ Function1<java.lang.Integer, Unit> EZpvd;
        public final /* synthetic */ Function0<Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Function0<Unit> function0, Function1<? super java.lang.Integer, Unit> function1) {
            this.KWHzl = function0;
            this.EZpvd = function1;
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
            Intrinsics.checkNotNullParameter(authenticationResult, "");
            this.KWHzl.invoke();
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationError(int i, java.lang.CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.EZpvd.invoke(java.lang.Integer.valueOf(i));
        }
    }

    public final void AEQbTJ(androidx.fragment.app.Fragment fragment, C5700aBS c5700aBS, Function0<Unit> function0, Function1<? super java.lang.Integer, Unit> function1) {
        ActionBar actionBar = new ActionBar(function0, function1);
        try {
            BiometricPrompt.PromptInfo promptInfoBuild = new BiometricPrompt.PromptInfo.Builder().setTitle(C32979mnm.EZpvd.OLrzqt().getString(C8206ayP.Dialog.fGQ)).setConfirmationRequired(false).setAllowedAuthenticators(32768).build();
            Intrinsics.checkNotNullExpressionValue(promptInfoBuild, "");
            new androidx.biometric.BiometricPrompt(fragment.requireActivity(), actionBar).authenticate(promptInfoBuild, new BiometricPrompt.CryptoObject(C5692aBK.KWHzl.OLrzqt(c5700aBS)));
        } catch (java.lang.Exception unused) {
            function1.invoke(-1);
        }
    }
}
