package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResultCallback;
import com.okinc.auth.api.passkey.PasskeyRegisterConfig;
import com.okinc.auth.api.passkey.PasskeyRegisterScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyRegisterState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeyState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C8206ayP;
import o.InterfaceC8196ayF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aNy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6368aNy extends AbstractActivityC6361aNr {
    public static Function1<? super android.app.Activity, Unit> AYXKKw;
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public static Function0<Unit> gEmmrt;
    public java.lang.String AhwBna = "PasskeyRegisterScenarioActivity";
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.aNx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC6368aNy.AEQbTJ(this.AEQbTJ);
        }
    });

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

    /* JADX INFO: renamed from: o.aNy$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aNy.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull PasskeyRegisterScenarioRequest passkeyRegisterScenarioRequest, Function0<Unit> function0, Function1<? super android.app.Activity, Unit> function1) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyRegisterScenarioRequest, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC6368aNy.class);
            intent.putExtra("KEY_REQUEST", passkeyRegisterScenarioRequest);
            Application application = ActivityC6368aNy.Companion;
            ActivityC6368aNy.gEmmrt = function0;
            ActivityC6368aNy.AYXKKw = function1;
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method o.aNr.EZpvd()V */
    public final PasskeyRegisterScenarioRequest EZpvd() {
        return (PasskeyRegisterScenarioRequest) this.djBIcL.getValue();
    }

    public static final PasskeyRegisterScenarioRequest AEQbTJ(ActivityC6368aNy activityC6368aNy) {
        android.os.Bundle extras = activityC6368aNy.getIntent().getExtras();
        if (extras != null) {
            return (PasskeyRegisterScenarioRequest) extras.getParcelable("KEY_REQUEST");
        }
        return null;
    }

    @Override // o.AbstractActivityC6361aNr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        PasskeyRegisterConfig config;
        super.onCreate(bundle);
        overridePendingTransition(C52761wXj.Application.AEQbTJ, C52761wXj.Application.fetchVPNInfo);
        setContentView(C8206ayP.Application.OLrzqt);
        if (bundle == null) {
            C5922aFc c5922aFc = C5922aFc.KWHzl;
            java.lang.String tag = getTAG();
            PasskeyRegisterScenarioRequest passkeyRegisterScenarioRequestEZpvd = EZpvd();
            C5922aFc.log$default(c5922aFc, "[REGISTER]", null, tag + " begin register scenario activity: " + (passkeyRegisterScenarioRequestEZpvd != null ? passkeyRegisterScenarioRequestEZpvd.getScenario() : null), 2, null);
            PasskeyRegisterScenarioRequest passkeyRegisterScenarioRequestEZpvd2 = EZpvd();
            PasskeyScenario scenario = passkeyRegisterScenarioRequestEZpvd2 != null ? passkeyRegisterScenarioRequestEZpvd2.getScenario() : null;
            if ((scenario instanceof PasskeyScenario.Asset) || Intrinsics.EZpvd(scenario, PasskeyScenario.Account.AEQbTJ)) {
                PasskeyRegisterScenarioRequest passkeyRegisterScenarioRequestEZpvd3 = EZpvd();
                if (passkeyRegisterScenarioRequestEZpvd3 != null && (config = passkeyRegisterScenarioRequestEZpvd3.getConfig()) != null) {
                    registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).copydefault(PasskeyScenario.Account.AEQbTJ, config.getSkipCheckPasskey(), config.getEasyRegToken(), config.getMfaSessionId(), config.getAuthenticator(), config.getPasskeyPromotionSource(), gEmmrt, config.getEnableExitBottomSheet(), config.getSupportFido1(), AYXKKw), new ActivityResultCallback() { // from class: o.aNv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // androidx.activity.result.ActivityResultCallback
                        public final void onActivityResult(java.lang.Object obj) {
                            ActivityC6368aNy.OLrzqt(this.AEQbTJ, (PasskeyRegisterState) obj);
                        }
                    }).launch(Unit.INSTANCE);
                } else {
                    C5922aFc.log$default(c5922aFc, "[REGISTER]", null, getTAG() + " no request config, fallback to default registration", 2, null);
                    registerForActivityResult(InterfaceC8196ayF.Activity.registerPasskey$default((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class), PasskeyScenario.Account.AEQbTJ, false, null, null, null, null, null, false, false, null, 766, null), new ActivityResultCallback() { // from class: o.aNw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // androidx.activity.result.ActivityResultCallback
                        public final void onActivityResult(java.lang.Object obj) {
                            ActivityC6368aNy.EZpvd(this.OLrzqt, (PasskeyRegisterState) obj);
                        }
                    }).launch(Unit.INSTANCE);
                }
            } else if (scenario instanceof PasskeyScenario.CedefiWallet) {
                registerForActivityResult(InterfaceC8196ayF.Activity.registerPasskey$default((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class), (PasskeyScenario.CedefiWallet) scenario, false, null, null, null, null, null, false, false, null, 766, null), new ActivityResultCallback() { // from class: o.aNz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(java.lang.Object obj) {
                        ActivityC6368aNy.AhwBna(this.AEQbTJ, (PasskeyRegisterState) obj);
                    }
                }).launch(Unit.INSTANCE);
            } else if (Intrinsics.EZpvd(scenario, PasskeyScenario.Pay.EZpvd)) {
                registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).AhwBna(), new ActivityResultCallback() { // from class: o.aNE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(java.lang.Object obj) {
                        ActivityC6368aNy.AEQbTJ(this.AEQbTJ, (PasskeyState) obj);
                    }
                }).launch(Unit.INSTANCE);
            } else {
                if (scenario != null) {
                    throw new NoWhenBranchMatchedException();
                }
                copydefault(PasskeyRegisterState.Failure.KWHzl);
            }
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aND
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6368aNy.KWHzl((OnBackPressedCallback) obj);
            }
        }, 2, null);
    }

    public static final void OLrzqt(ActivityC6368aNy activityC6368aNy, PasskeyRegisterState passkeyRegisterState) {
        C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, activityC6368aNy.getTAG() + " registerPasskey() callback: " + passkeyRegisterState, 2, null);
        Intrinsics.copydefault(passkeyRegisterState);
        activityC6368aNy.copydefault(passkeyRegisterState);
    }

    public static final void EZpvd(ActivityC6368aNy activityC6368aNy, PasskeyRegisterState passkeyRegisterState) {
        C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, activityC6368aNy.getTAG() + " registerPasskey() callback: " + passkeyRegisterState, 2, null);
        Intrinsics.copydefault(passkeyRegisterState);
        activityC6368aNy.copydefault(passkeyRegisterState);
    }

    public static final void AhwBna(ActivityC6368aNy activityC6368aNy, PasskeyRegisterState passkeyRegisterState) {
        C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, activityC6368aNy.getTAG() + " registerPasskey() callback: " + passkeyRegisterState, 2, null);
        Intrinsics.copydefault(passkeyRegisterState);
        activityC6368aNy.copydefault(passkeyRegisterState);
    }

    public static final void AEQbTJ(ActivityC6368aNy activityC6368aNy, PasskeyState passkeyState) {
        PasskeyRegisterState sdkError;
        C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, activityC6368aNy.getTAG() + " registerPasskey() callback: " + passkeyState, 2, null);
        if (passkeyState instanceof PasskeyState.Success) {
            sdkError = PasskeyRegisterState.Success.KWHzl;
        } else if (passkeyState instanceof PasskeyState.RegisteredAlready) {
            sdkError = PasskeyRegisterState.RegisteredAlready.KWHzl;
        } else if (passkeyState instanceof PasskeyState.Cancel) {
            sdkError = PasskeyRegisterState.Cancel.KWHzl;
        } else if (Intrinsics.EZpvd(passkeyState, PasskeyState.AccountFrozen.INSTANCE)) {
            sdkError = PasskeyRegisterState.AccountFrozen.AEQbTJ;
        } else if (passkeyState instanceof PasskeyState.OkxPaySdkError) {
            PasskeyState.OkxPaySdkError okxPaySdkError = (PasskeyState.OkxPaySdkError) passkeyState;
            sdkError = new PasskeyRegisterState.SdkError(okxPaySdkError.EZpvd(), okxPaySdkError.KWHzl());
        } else if (passkeyState instanceof PasskeyState.IsChinaIp) {
            sdkError = PasskeyRegisterState.IsChinaIp.AEQbTJ;
        } else if (passkeyState instanceof PasskeyState.MaximumReached) {
            sdkError = PasskeyRegisterState.ReachMaximum.copydefault;
        } else {
            sdkError = passkeyState instanceof PasskeyState.DeviceNotCompatible ? PasskeyRegisterState.DeviceNotCompatible.KWHzl : PasskeyRegisterState.Failure.KWHzl;
        }
        activityC6368aNy.copydefault(sdkError);
    }

    public static final Unit KWHzl(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull PasskeyRegisterState passkeyRegisterState) {
        Intrinsics.checkNotNullParameter(passkeyRegisterState, "");
        C5922aFc c5922aFc = C5922aFc.KWHzl;
        C5922aFc.log$default(c5922aFc, "[REGISTER]", null, getTAG() + " setStateAndFinish: " + passkeyRegisterState, 2, null);
        C5922aFc.log$default(c5922aFc, "[REGISTER]", null, getTAG() + " success: " + (passkeyRegisterState instanceof PasskeyRegisterState.Success), 2, null);
        setResult(-1, new android.content.Intent().putExtra("KEY_RESPONSE", passkeyRegisterState));
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(C52761wXj.Application.fetchVPNInfo, C52761wXj.Application.valueOf);
    }

    @Override // o.AbstractActivityC6361aNr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6361aNr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6361aNr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6361aNr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
