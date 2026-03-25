package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse;
import com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.impl.passkey.ui.authenticate.scenario.PasskeyAuthenticateScenarioActivity$onCreate$1$1;
import com.okinc.auth.impl.passkey.ui.authenticate.scenario.PasskeyAuthenticateScenarioActivity$onCreate$10;
import com.okinc.auth.impl.passkey.ui.authenticate.scenario.PasskeyAuthenticateScenarioActivity$onCreate$11;
import com.okinc.auth.impl.passkey.ui.authenticate.scenario.PasskeyAuthenticateScenarioActivity$onCreate$3$1;
import com.okinc.auth.impl.passkey.ui.authenticate.scenario.PasskeyAuthenticateScenarioActivity$onCreate$7;
import com.okinc.auth.impl.passkey.ui.authenticate.scenario.PasskeyAuthenticateScenarioActivity$onCreate$8;
import com.okinc.auth.impl.passkey.ui.authenticate.scenario.PasskeyAuthenticateScenarioActivity$onCreate$9;
import com.okinc.auth.impl.passkey.ui.authenticate.scenario.PasskeyAuthenticateScenarioViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aHF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6005aHF extends AbstractActivityC6003aHD {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final ActivityResultLauncher<java.lang.String> AYXKKw;
    public java.lang.String AhwBna = "PasskeyAuthenticateScenarioActivity";
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.aHK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC6005aHF.copydefault(this.KWHzl);
        }
    });
    public final ActivityResultLauncher<PasskeyAuthenticateRequest> djBIcL;
    public final ActivityResultLauncher<android.app.PendingIntent> gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final ActivityResultLauncher<Unit> valueOf;

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

    public ActivityC6005aHF() {
        final Function0 function0 = null;
        this.isConnected = new ViewModelLazy(C56524yIo.AEQbTJ(PasskeyAuthenticateScenarioViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.authenticate.scenario.PasskeyAuthenticateScenarioActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.authenticate.scenario.PasskeyAuthenticateScenarioActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.authenticate.scenario.PasskeyAuthenticateScenarioActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.app.PendingIntent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).AEQbTJ(), new ActivityResultCallback() { // from class: o.aHJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6005aHF.KWHzl(this.AEQbTJ, (PasskeySdkResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.gEmmrt = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<java.lang.String> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).copydefault(), new ActivityResultCallback() { // from class: o.aHL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6005aHF.copydefault(this.EZpvd, (PasskeySdkResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.AYXKKw = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<PasskeyAuthenticateRequest> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).KWHzl(), new ActivityResultCallback() { // from class: o.aHI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6005aHF.copydefault(this.KWHzl, (PasskeyState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "");
        this.djBIcL = activityResultLauncherRegisterForActivityResult3;
        ActivityResultLauncher<Unit> activityResultLauncherRegisterForActivityResult4 = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).copydefault(true), new ActivityResultCallback() { // from class: o.aHH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6005aHF.EZpvd(this.OLrzqt, (PasskeyState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult4, "");
        this.valueOf = activityResultLauncherRegisterForActivityResult4;
    }

    /* JADX INFO: renamed from: o.aHF$Activity */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aHF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull PasskeyAuthenticateScenarioRequest passkeyAuthenticateScenarioRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyAuthenticateScenarioRequest, "");
            android.content.Intent intentPutExtra = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC6005aHF.class).putExtra("KEY_REQUEST", passkeyAuthenticateScenarioRequest);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    /* JADX DEBUG: Possible override for method o.aHD.KWHzl()V */
    public final PasskeyAuthenticateScenarioRequest KWHzl() {
        return (PasskeyAuthenticateScenarioRequest) this.AkhnZx.getValue();
    }

    public static final PasskeyAuthenticateScenarioRequest copydefault(ActivityC6005aHF activityC6005aHF) {
        android.os.Bundle extras = activityC6005aHF.getIntent().getExtras();
        if (extras != null) {
            return (PasskeyAuthenticateScenarioRequest) extras.getParcelable("KEY_REQUEST");
        }
        return null;
    }

    public final PasskeyAuthenticateScenarioViewModel djBIcL() {
        return (PasskeyAuthenticateScenarioViewModel) this.isConnected.getValue();
    }

    public static final void KWHzl(ActivityC6005aHF activityC6005aHF, PasskeySdkResult passkeySdkResult) {
        C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[FIDO2]", activityC6005aHF.getTAG() + " launcher: " + passkeySdkResult.EZpvd());
        PasskeyAuthenticateScenarioViewModel passkeyAuthenticateScenarioViewModelDjBIcL = activityC6005aHF.djBIcL();
        Intrinsics.copydefault(passkeySdkResult);
        passkeyAuthenticateScenarioViewModelDjBIcL.EZpvd(passkeySdkResult);
    }

    public static final void copydefault(ActivityC6005aHF activityC6005aHF, PasskeySdkResult passkeySdkResult) {
        C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[CREDENTIAL MANAGER]", activityC6005aHF.getTAG() + " launcher: " + passkeySdkResult.EZpvd());
        PasskeyAuthenticateScenarioViewModel passkeyAuthenticateScenarioViewModelDjBIcL = activityC6005aHF.djBIcL();
        Intrinsics.copydefault(passkeySdkResult);
        passkeyAuthenticateScenarioViewModelDjBIcL.EZpvd(passkeySdkResult);
    }

    public static final void copydefault(ActivityC6005aHF activityC6005aHF, PasskeyState passkeyState) {
        PasskeyAuthenticateState sdkError;
        C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[FIDO2]", activityC6005aHF.getTAG() + " Pay launcher: " + passkeyState.log());
        if (passkeyState instanceof PasskeyState.Success) {
            PasskeyState.Success success = (PasskeyState.Success) passkeyState;
            PasskeyAuthenticateResponse authenticatePasskeyData = success.getAuthenticatePasskeyData();
            PasskeyAuthenticateResponse authenticatePasskeyData2 = success.getAuthenticatePasskeyData();
            sdkError = new PasskeyAuthenticateState.Success(authenticatePasskeyData, authenticatePasskeyData2 != null ? authenticatePasskeyData2.getIsExternalPasskey() : false);
        } else if (passkeyState instanceof PasskeyState.Cancel) {
            sdkError = PasskeyAuthenticateState.Cancel.copydefault;
        } else if (passkeyState instanceof PasskeyState.OkxPaySdkError) {
            PasskeyState.OkxPaySdkError okxPaySdkError = (PasskeyState.OkxPaySdkError) passkeyState;
            sdkError = new PasskeyAuthenticateState.SdkError(okxPaySdkError.EZpvd(), okxPaySdkError.KWHzl());
        } else if (passkeyState instanceof PasskeyState.NoValidPasskey) {
            sdkError = PasskeyAuthenticateState.NoValidPasskey.OLrzqt;
        } else {
            sdkError = passkeyState instanceof PasskeyState.DeviceNotCompatible ? PasskeyAuthenticateState.DeviceNotCompatible.OLrzqt : PasskeyAuthenticateState.Failure.OLrzqt;
        }
        activityC6005aHF.OLrzqt(sdkError);
    }

    public static final void EZpvd(ActivityC6005aHF activityC6005aHF, PasskeyState passkeyState) {
        PasskeyAuthenticateState sdkError;
        C5922aFc.log$default(C5922aFc.KWHzl, "[AUTHENTICATE]", null, activityC6005aHF.getTAG() + " Cefi launcher: " + passkeyState.log(), 2, null);
        if (passkeyState instanceof PasskeyState.Success) {
            PasskeyState.Success success = (PasskeyState.Success) passkeyState;
            PasskeyAuthenticateResponse authenticatePasskeyData = success.getAuthenticatePasskeyData();
            PasskeyAuthenticateResponse authenticatePasskeyData2 = success.getAuthenticatePasskeyData();
            sdkError = new PasskeyAuthenticateState.Success(authenticatePasskeyData, authenticatePasskeyData2 != null ? authenticatePasskeyData2.getIsExternalPasskey() : false);
        } else if (passkeyState instanceof PasskeyState.Cancel) {
            sdkError = PasskeyAuthenticateState.Cancel.copydefault;
        } else if (passkeyState instanceof PasskeyState.OkxPaySdkError) {
            PasskeyState.OkxPaySdkError okxPaySdkError = (PasskeyState.OkxPaySdkError) passkeyState;
            sdkError = new PasskeyAuthenticateState.SdkError(okxPaySdkError.EZpvd(), okxPaySdkError.KWHzl());
        } else if (passkeyState instanceof PasskeyState.NoValidPasskey) {
            sdkError = PasskeyAuthenticateState.NoValidPasskey.OLrzqt;
        } else {
            sdkError = passkeyState instanceof PasskeyState.DeviceNotCompatible ? PasskeyAuthenticateState.DeviceNotCompatible.OLrzqt : PasskeyAuthenticateState.Failure.OLrzqt;
        }
        activityC6005aHF.OLrzqt(sdkError);
    }

    @Override // o.AbstractActivityC6003aHD, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8206ayP.Application.OLrzqt);
        overridePendingTransition(0, 0);
        if (bundle == null) {
            PasskeyAuthenticateScenarioRequest passkeyAuthenticateScenarioRequestKWHzl = KWHzl();
            if (passkeyAuthenticateScenarioRequestKWHzl == null) {
                OLrzqt(PasskeyAuthenticateState.Failure.OLrzqt);
                return;
            }
            PasskeyAuthenticateRequest request = passkeyAuthenticateScenarioRequestKWHzl.getRequest();
            boolean enableExternal = passkeyAuthenticateScenarioRequestKWHzl.getEnableExternal();
            C5922aFc c5922aFc = C5922aFc.KWHzl;
            C5922aFc.log$default(c5922aFc, "[AUTHENTICATE]", null, getTAG() + " authPasskeyRequest scenario: " + passkeyAuthenticateScenarioRequestKWHzl.getScenario(), 2, null);
            PasskeyScenario scenario = passkeyAuthenticateScenarioRequestKWHzl.getScenario();
            if (scenario instanceof PasskeyScenario.Asset) {
                C5922aFc.log$default(c5922aFc, "[AUTHENTICATE]", null, getTAG() + " asset launcher start", 2, null);
                this.valueOf.launch(Unit.INSTANCE);
            } else if (Intrinsics.EZpvd(scenario, PasskeyScenario.Account.AEQbTJ)) {
                if (request == null || BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PasskeyAuthenticateScenarioActivity$onCreate$1$1(passkeyAuthenticateScenarioRequestKWHzl, this, request, enableExternal, null), 3, null) == null) {
                    C5922aFc.log$default(c5922aFc, "[AUTHENTICATE]", null, getTAG() + " authPasskeyRequest: Account: null", 2, null);
                    this.valueOf.launch(Unit.INSTANCE);
                }
            } else if (scenario instanceof PasskeyScenario.CedefiWallet) {
                if (request == null || BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PasskeyAuthenticateScenarioActivity$onCreate$3$1(passkeyAuthenticateScenarioRequestKWHzl, this, request, enableExternal, null), 3, null) == null) {
                    C5922aFc.log$default(c5922aFc, "[AUTHENTICATE]", null, getTAG() + " authPasskeyRequest: CedefiWallet: null", 2, null);
                    OLrzqt(PasskeyAuthenticateState.Failure.OLrzqt);
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                if (!Intrinsics.EZpvd(scenario, PasskeyScenario.Pay.EZpvd)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (request != null) {
                    C5922aFc.log$default(c5922aFc, "[AUTHENTICATE]", null, getTAG() + " pay launcher start", 2, null);
                    this.djBIcL.launch(request);
                } else {
                    C5922aFc.log$default(c5922aFc, "[AUTHENTICATE]", null, getTAG() + " authPasskeyRequest: Pay: null", 2, null);
                    OLrzqt(PasskeyAuthenticateState.Failure.OLrzqt);
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
        C6690aUB.AEQbTJ(djBIcL().KWHzl(), this, new PasskeyAuthenticateScenarioActivity$onCreate$7(this, null));
        C6690aUB.AEQbTJ(djBIcL().copydefault(), this, new PasskeyAuthenticateScenarioActivity$onCreate$8(this, null));
        C6690aUB.AEQbTJ(djBIcL().AEQbTJ(), this, new PasskeyAuthenticateScenarioActivity$onCreate$9(this, null));
        C6690aUB.AEQbTJ(djBIcL().OLrzqt(), this, new PasskeyAuthenticateScenarioActivity$onCreate$10(this, null));
        C6690aUB.AEQbTJ(djBIcL().EZpvd(), this, new PasskeyAuthenticateScenarioActivity$onCreate$11(this, null));
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aHG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6005aHF.EZpvd(this.KWHzl, (OnBackPressedCallback) obj);
            }
        }, 2, null);
    }

    public static final Unit EZpvd(ActivityC6005aHF activityC6005aHF, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        activityC6005aHF.OLrzqt(PasskeyAuthenticateState.Cancel.copydefault);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull PasskeyAuthenticateState passkeyAuthenticateState) {
        Intrinsics.checkNotNullParameter(passkeyAuthenticateState, "");
        C5922aFc.log$default(C5922aFc.KWHzl, "[AUTHENTICATE]", null, getTAG() + " finish with: " + passkeyAuthenticateState, 2, null);
        setResult(-1, new android.content.Intent().putExtra("KEY_RESPONSE", passkeyAuthenticateState));
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // o.AbstractActivityC6003aHD, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6003aHD, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6003aHD, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6003aHD, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
