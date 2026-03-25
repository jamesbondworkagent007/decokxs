package o;

import androidx.activity.result.contract.ActivityResultContract;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.okinc.auth.api.passkey.InitiateMfaSessionResponse;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyCanLinkExistingToCedefiWalletState;
import com.okinc.auth.api.passkey.PasskeyFido1State;
import com.okinc.auth.api.passkey.PasskeyLinkScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyLinkState;
import com.okinc.auth.api.passkey.PasskeyManagementRequest;
import com.okinc.auth.api.passkey.PasskeyManagementState;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.api.passkey.PasskeyPromotionSource;
import com.okinc.auth.api.passkey.PasskeyRebindRequest;
import com.okinc.auth.api.passkey.PasskeyRebindState;
import com.okinc.auth.api.passkey.PasskeyRecoverState;
import com.okinc.auth.api.passkey.PasskeyRegisterScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyRegisterState;
import com.okinc.auth.api.passkey.PasskeyResetRemoveRequest;
import com.okinc.auth.api.passkey.PasskeyResetRemoveState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.api.passkey.PasskeyVersionState;
import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
import com.okinc.auth.impl.passkey.service.AuthPasskeyServiceImpl$checkPasskeyCompatible$2;
import com.okinc.auth.impl.passkey.service.AuthPasskeyServiceImpl$checkPasskeyCompatibleForPasskeyVersionState$2;
import com.okinc.auth.impl.passkey.service.AuthPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1;
import com.okinc.auth.impl.passkey.service.AuthPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1;
import com.okinc.auth.impl.passkey.service.AuthPasskeyServiceImpl$hasOkxPayPasskey$1;
import com.okinc.auth.impl.passkey.service.AuthPasskeyServiceImpl$isFido1CompatibleOnly$1;
import com.okinc.auth.impl.passkey.service.AuthPasskeyServiceImpl$isPasskeyRegisterSupported$1;
import com.okinc.auth.impl.passkey.service.AuthPasskeyServiceImpl$startPasskeyMfaInit$1;
import com.okinc.auth.impl.passkey.ui.authenticate.noui.PasskeyAuthenticateWithoutUiServiceActivity;
import com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyCrossDeviceMasterActivity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@yCR
public final class C5958aGL extends AbstractC43215rlA implements InterfaceC8196ayF {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final C5900aFG AEQbTJ;
    public final C5937aFr AYXKKw;
    public final C5939aFt AhwBna;
    public final C5982aGj AkhnZx;
    public final C5903aFJ EZpvd;
    public final C5904aFK KWHzl;
    public final C5941aFv OLrzqt;
    public final C5908aFO djBIcL;
    public final C5899aFF fetchVPNInfo;
    public final C5897aFD gEmmrt;
    public final C5905aFL isConnected;
    public final C5938aFs valueOf;
    public final CoroutineDispatcher values;

    @yCM
    public C5958aGL(@NotNull C5908aFO c5908aFO, @NotNull C5903aFJ c5903aFJ, @NotNull C5904aFK c5904aFK, @NotNull C5900aFG c5900aFG, @NotNull C5941aFv c5941aFv, @NotNull C5938aFs c5938aFs, @NotNull C5937aFr c5937aFr, @NotNull C5939aFt c5939aFt, @NotNull C5899aFF c5899aFF, @NotNull C5982aGj c5982aGj, @NotNull C5905aFL c5905aFL, @NotNull C5897aFD c5897aFD, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c5908aFO, "");
        Intrinsics.checkNotNullParameter(c5903aFJ, "");
        Intrinsics.checkNotNullParameter(c5904aFK, "");
        Intrinsics.checkNotNullParameter(c5900aFG, "");
        Intrinsics.checkNotNullParameter(c5941aFv, "");
        Intrinsics.checkNotNullParameter(c5938aFs, "");
        Intrinsics.checkNotNullParameter(c5937aFr, "");
        Intrinsics.checkNotNullParameter(c5939aFt, "");
        Intrinsics.checkNotNullParameter(c5899aFF, "");
        Intrinsics.checkNotNullParameter(c5982aGj, "");
        Intrinsics.checkNotNullParameter(c5905aFL, "");
        Intrinsics.checkNotNullParameter(c5897aFD, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.djBIcL = c5908aFO;
        this.EZpvd = c5903aFJ;
        this.KWHzl = c5904aFK;
        this.AEQbTJ = c5900aFG;
        this.OLrzqt = c5941aFv;
        this.valueOf = c5938aFs;
        this.AYXKKw = c5937aFr;
        this.AhwBna = c5939aFt;
        this.fetchVPNInfo = c5899aFF;
        this.AkhnZx = c5982aGj;
        this.isConnected = c5905aFL;
        this.gEmmrt = c5897aFD;
        this.values = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.aGL$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aGL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC8196ayF
    public ActivityResultContract<PasskeyManagementRequest, PasskeyManagementState> valueOf() {
        return new VoiceInteractor();
    }

    /* JADX INFO: renamed from: o.aGL$VoiceInteractor */
    public static final class VoiceInteractor extends ActivityResultContract<PasskeyManagementRequest, PasskeyManagementState> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, PasskeyManagementRequest passkeyManagementRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyManagementRequest, "");
            return ActivityC6153aJv.Companion.OLrzqt(context, passkeyManagementRequest);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public PasskeyManagementState parseResult(int i, android.content.Intent intent) {
            java.lang.Object objM7377constructorimpl;
            try {
                Result.Application application = Result.Companion;
                PasskeyManagementState passkeyManagementState = intent != null ? (PasskeyManagementState) intent.getParcelableExtra("KEY_RESPONSE_STATE") : null;
                Intrinsics.copydefault(passkeyManagementState);
                objM7377constructorimpl = Result.m7377constructorimpl(passkeyManagementState);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                objM7377constructorimpl = PasskeyManagementState.Close.EZpvd;
            }
            return (PasskeyManagementState) objM7377constructorimpl;
        }
    }

    /* JADX INFO: renamed from: o.aGL$ActionBar */
    public static final class ActionBar extends ActivityResultContract<Unit, PasskeyState> {
        public final /* synthetic */ boolean OLrzqt;

        public ActionBar(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, Unit unit) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(unit, "");
            return ActivityC5964aGR.Companion.AEQbTJ(context, this.OLrzqt);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public PasskeyState parseResult(int i, android.content.Intent intent) {
            PasskeyState passkeyState = intent != null ? (PasskeyState) intent.getParcelableExtra("KEY_AUTHENTICATE_PASSKEY_RESPONSE") : null;
            PasskeyState passkeyState2 = passkeyState instanceof PasskeyState ? passkeyState : null;
            return passkeyState2 == null ? new PasskeyState.AuthenticateError("_null") : passkeyState2;
        }
    }

    @Override // o.InterfaceC8196ayF
    public ActivityResultContract<Unit, PasskeyState> copydefault(boolean z) {
        return new ActionBar(z);
    }

    /* JADX INFO: renamed from: o.aGL$Fragment */
    public static final class Fragment extends ActivityResultContract<Unit, PasskeyRegisterState> {
        public final /* synthetic */ Function0<Unit> AEQbTJ;
        public final /* synthetic */ PasskeyPromotionSource AYXKKw;
        public final /* synthetic */ Function1<android.app.Activity, Unit> AhwBna;
        public final /* synthetic */ PasskeyPromotionAuthenticator EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ boolean copydefault;
        public final /* synthetic */ java.lang.String djBIcL;
        public final /* synthetic */ PasskeyScenario gEmmrt;
        public final /* synthetic */ boolean valueOf;

        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Fragment(PasskeyScenario passkeyScenario, boolean z, java.lang.String str, java.lang.String str2, PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, PasskeyPromotionSource passkeyPromotionSource, Function0<Unit> function0, boolean z2, boolean z3, Function1<? super android.app.Activity, Unit> function1) {
            this.gEmmrt = passkeyScenario;
            this.valueOf = z;
            this.djBIcL = str;
            this.KWHzl = str2;
            this.EZpvd = passkeyPromotionAuthenticator;
            this.AYXKKw = passkeyPromotionSource;
            this.AEQbTJ = function0;
            this.copydefault = z2;
            this.OLrzqt = z3;
            this.AhwBna = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, Unit unit) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(unit, "");
            return ActivityC6299aMi.Companion.KWHzl(context, this.gEmmrt, this.valueOf, this.djBIcL, this.KWHzl, this.EZpvd, this.AYXKKw, this.AEQbTJ, this.copydefault, this.OLrzqt, this.AhwBna);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public PasskeyRegisterState parseResult(int i, android.content.Intent intent) {
            java.lang.Object objM7377constructorimpl;
            try {
                Result.Application application = Result.Companion;
                PasskeyRegisterState passkeyRegisterState = intent != null ? (PasskeyRegisterState) intent.getParcelableExtra("KEY_CONTRACT_RESPONSE") : null;
                if (!(passkeyRegisterState instanceof PasskeyRegisterState)) {
                    passkeyRegisterState = null;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(passkeyRegisterState);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            PasskeyRegisterState passkeyRegisterState2 = (PasskeyRegisterState) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            return passkeyRegisterState2 == null ? PasskeyRegisterState.Failure.KWHzl : passkeyRegisterState2;
        }
    }

    @Override // o.InterfaceC8196ayF
    public ActivityResultContract<Unit, PasskeyRegisterState> copydefault(@NotNull PasskeyScenario passkeyScenario, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, @NotNull PasskeyPromotionSource passkeyPromotionSource, Function0<Unit> function0, boolean z2, boolean z3, Function1<? super android.app.Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(passkeyPromotionAuthenticator, "");
        Intrinsics.checkNotNullParameter(passkeyPromotionSource, "");
        return new Fragment(passkeyScenario, z, str2, str, passkeyPromotionAuthenticator, passkeyPromotionSource, function0, z2, z3, function1);
    }

    @Override // o.InterfaceC8196ayF
    public ActivityResultContract<Unit, PasskeyAuthenticateState> djBIcL() {
        return new TaskStackBuilder();
    }

    /* JADX INFO: renamed from: o.aGL$TaskStackBuilder */
    public static final class TaskStackBuilder extends ActivityResultContract<Unit, PasskeyAuthenticateState> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, Unit unit) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(unit, "");
            return ActivityC6490aQN.Companion.OLrzqt(context);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public PasskeyAuthenticateState parseResult(int i, android.content.Intent intent) {
            PasskeyAuthenticateState passkeyAuthenticateState = intent != null ? (PasskeyAuthenticateState) intent.getParcelableExtra("KEY_START_PASSKEY_RESPONSE") : null;
            PasskeyAuthenticateState passkeyAuthenticateState2 = passkeyAuthenticateState instanceof PasskeyAuthenticateState ? passkeyAuthenticateState : null;
            return passkeyAuthenticateState2 == null ? PasskeyAuthenticateState.Failure.OLrzqt : passkeyAuthenticateState2;
        }
    }

    @Override // o.InterfaceC8196ayF
    public ActivityResultContract<Unit, PasskeyState> AhwBna() {
        return new PictureInPictureParams();
    }

    /* JADX INFO: renamed from: o.aGL$PictureInPictureParams */
    public static final class PictureInPictureParams extends ActivityResultContract<Unit, PasskeyState> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, Unit unit) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(unit, "");
            return ActivityC6354aNk.Companion.EZpvd(context);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public PasskeyState parseResult(int i, android.content.Intent intent) {
            PasskeyState passkeyState = intent != null ? (PasskeyState) intent.getParcelableExtra("KEY_REGISTER_PASSKEY_RESPONSE") : null;
            PasskeyState passkeyState2 = passkeyState instanceof PasskeyState ? passkeyState : null;
            return passkeyState2 == null ? new PasskeyState.RegisterError("_null") : passkeyState2;
        }
    }

    @Override // o.InterfaceC8196ayF
    public ActivityResultContract<PasskeyAuthenticateRequest, PasskeyState> KWHzl() {
        return new Dialog();
    }

    /* JADX INFO: renamed from: o.aGL$Dialog */
    public static final class Dialog extends ActivityResultContract<PasskeyAuthenticateRequest, PasskeyState> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, PasskeyAuthenticateRequest passkeyAuthenticateRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyAuthenticateRequest, "");
            return ActivityC6039aHn.Companion.OLrzqt(context, passkeyAuthenticateRequest);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public PasskeyState parseResult(int i, android.content.Intent intent) {
            PasskeyState passkeyState = intent != null ? (PasskeyState) intent.getParcelableExtra("KEY_AUTHENTICATE_RESPONSE") : null;
            PasskeyState passkeyState2 = passkeyState instanceof PasskeyState ? passkeyState : null;
            return passkeyState2 == null ? new PasskeyState.AuthenticateError("_null") : passkeyState2;
        }
    }

    @Override // o.InterfaceC8196ayF
    public ActivityResultContract<android.app.PendingIntent, PasskeySdkResult> AEQbTJ() {
        return new Activity();
    }

    /* JADX INFO: renamed from: o.aGL$Activity */
    public static final class Activity extends ActivityResultContract<android.app.PendingIntent, PasskeySdkResult> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, android.app.PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(pendingIntent, "");
            return PasskeyAuthenticateWithoutUiServiceActivity.Companion.EZpvd(context, new PasskeyAuthenticateWithoutUiServiceActivity.Request.FIDO2(pendingIntent));
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public PasskeySdkResult parseResult(int i, android.content.Intent intent) {
            byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_SUCCESS_WITH_BYTE_ARRAY") : null;
            PasskeySdkResult passkeySdkResult = intent != null ? (PasskeySdkResult) intent.getParcelableExtra("KEY_RESPONSE") : null;
            if (byteArrayExtra == null) {
                return passkeySdkResult != null ? passkeySdkResult : new PasskeySdkResult.Failure(ErrorCode.UNKNOWN_ERR, "null response", false);
            }
            try {
                Intrinsics.checkNotNullExpressionValue(PublicKeyCredential.deserializeFromBytes(byteArrayExtra), "");
                return new PasskeySdkResult.SuccessWithPublicKeyCredential(byteArrayExtra);
            } catch (java.lang.Exception e) {
                return new PasskeySdkResult.Failure(ErrorCode.UNKNOWN_ERR, "Failed to deserialize credential: " + e.getMessage(), false);
            }
        }
    }

    @Override // o.InterfaceC8196ayF
    public ActivityResultContract<java.lang.String, PasskeySdkResult> copydefault() {
        return new Application();
    }

    /* JADX INFO: renamed from: o.aGL$Application */
    public static final class Application extends ActivityResultContract<java.lang.String, PasskeySdkResult> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            return PasskeyAuthenticateWithoutUiServiceActivity.Companion.EZpvd(context, new PasskeyAuthenticateWithoutUiServiceActivity.Request.CredentialManager(str));
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public PasskeySdkResult parseResult(int i, android.content.Intent intent) {
            PasskeySdkResult passkeySdkResult = intent != null ? (PasskeySdkResult) intent.getParcelableExtra("KEY_RESPONSE") : null;
            PasskeySdkResult passkeySdkResult2 = passkeySdkResult instanceof PasskeySdkResult ? passkeySdkResult : null;
            return passkeySdkResult2 == null ? new PasskeySdkResult.Failure(ErrorCode.UNKNOWN_ERR, "null response", false) : passkeySdkResult2;
        }
    }

    @Override // o.InterfaceC8196ayF
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(false);
    }

    @Override // o.InterfaceC8196ayF
    public ActivityResultContract<PasskeyRebindRequest, PasskeyRebindState> AYXKKw() {
        return new FragmentManager();
    }

    /* JADX INFO: renamed from: o.aGL$FragmentManager */
    public static final class FragmentManager extends ActivityResultContract<PasskeyRebindRequest, PasskeyRebindState> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, PasskeyRebindRequest passkeyRebindRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyRebindRequest, "");
            return ActivityC6250aLm.Companion.OLrzqt(context, passkeyRebindRequest.EZpvd(), passkeyRebindRequest.copydefault(), passkeyRebindRequest.AEQbTJ());
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public PasskeyRebindState parseResult(int i, android.content.Intent intent) {
            PasskeyRebindState passkeyRebindState = intent != null ? (PasskeyRebindState) intent.getParcelableExtra("KEY_RESPONSE") : null;
            PasskeyRebindState passkeyRebindState2 = passkeyRebindState instanceof PasskeyRebindState ? passkeyRebindState : null;
            return passkeyRebindState2 == null ? PasskeyRebindState.Failure.copydefault : passkeyRebindState2;
        }
    }

    @Override // o.InterfaceC8196ayF
    public java.lang.Object copydefault(@NotNull PasskeyScenario passkeyScenario, boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.values, new AuthPasskeyServiceImpl$checkPasskeyCompatible$2(passkeyScenario, z, this, null), continuation);
    }

    @Override // o.InterfaceC8196ayF
    public java.lang.Object AEQbTJ(@NotNull PasskeyScenario passkeyScenario, boolean z, @NotNull Continuation<? super PasskeyVersionState> continuation) {
        return BuildersKt.withContext(this.values, new AuthPasskeyServiceImpl$checkPasskeyCompatibleForPasskeyVersionState$2(passkeyScenario, z, this, null), continuation);
    }

    /* JADX INFO: renamed from: o.aGL$AssistContent */
    public static final class AssistContent extends ActivityResultContract<PasskeyRegisterScenarioRequest, PasskeyRegisterState> {
        public final /* synthetic */ Function1<android.app.Activity, Unit> AEQbTJ;
        public final /* synthetic */ Function0<Unit> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public AssistContent(Function0<Unit> function0, Function1<? super android.app.Activity, Unit> function1) {
            this.OLrzqt = function0;
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, PasskeyRegisterScenarioRequest passkeyRegisterScenarioRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyRegisterScenarioRequest, "");
            return ActivityC6368aNy.Companion.copydefault(context, passkeyRegisterScenarioRequest, this.OLrzqt, this.AEQbTJ);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public PasskeyRegisterState parseResult(int i, android.content.Intent intent) {
            PasskeyRegisterState passkeyRegisterState = intent != null ? (PasskeyRegisterState) intent.getParcelableExtra("KEY_RESPONSE") : null;
            return passkeyRegisterState == null ? PasskeyRegisterState.Failure.KWHzl : passkeyRegisterState;
        }
    }

    @Override // o.InterfaceC8196ayF
    public ActivityResultContract<PasskeyRegisterScenarioRequest, PasskeyRegisterState> EZpvd(Function0<Unit> function0, Function1<? super android.app.Activity, Unit> function1) {
        return new AssistContent(function0, function1);
    }

    @Override // o.InterfaceC8196ayF
    public ActivityResultContract<PasskeyAuthenticateScenarioRequest, PasskeyAuthenticateState> OLrzqt() {
        return new StateListAnimator();
    }

    /* JADX INFO: renamed from: o.aGL$StateListAnimator */
    public static final class StateListAnimator extends ActivityResultContract<PasskeyAuthenticateScenarioRequest, PasskeyAuthenticateState> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, PasskeyAuthenticateScenarioRequest passkeyAuthenticateScenarioRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyAuthenticateScenarioRequest, "");
            return ActivityC6005aHF.Companion.KWHzl(context, passkeyAuthenticateScenarioRequest);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public PasskeyAuthenticateState parseResult(int i, android.content.Intent intent) {
            PasskeyAuthenticateState passkeyAuthenticateState = intent != null ? (PasskeyAuthenticateState) intent.getParcelableExtra("KEY_RESPONSE") : null;
            return passkeyAuthenticateState == null ? PasskeyAuthenticateState.Failure.OLrzqt : passkeyAuthenticateState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC8196ayF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super PasskeyState> continuation) throws java.lang.Throwable {
        AuthPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1 authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1;
        C5958aGL c5958aGL;
        if (continuation instanceof AuthPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1) {
            authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1 = (AuthPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1) continuation;
            int i = authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1.label = i - Integer.MIN_VALUE;
            } else {
                authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1 = new AuthPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C5908aFO c5908aFO = this.djBIcL;
            authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1.L$0 = this;
            authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1.label = 1;
            objKWHzl = c5908aFO.KWHzl(authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c5958aGL = this;
        } else if (i2 == 1) {
            c5958aGL = (C5958aGL) authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                return ((java.lang.Boolean) objKWHzl).booleanValue() ? PasskeyState.DeviceNotCompatible.INSTANCE : new PasskeyState.Success(null, 1, null);
            }
            c5958aGL = (C5958aGL) authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            if (!((java.lang.Boolean) objKWHzl).booleanValue()) {
                return PasskeyState.IsChinaIp.INSTANCE;
            }
            if (!c5958aGL.AEQbTJ.AEQbTJ()) {
                return PasskeyState.ScreenLockDisabled.INSTANCE;
            }
            C5903aFJ c5903aFJ = c5958aGL.EZpvd;
            authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1.L$0 = null;
            authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1.label = 3;
            objKWHzl = c5903aFJ.AEQbTJ(authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            if (((java.lang.Boolean) objKWHzl).booleanValue()) {
            }
        }
        if (!((java.lang.Boolean) objKWHzl).booleanValue()) {
            return PasskeyState.DeviceNotCompatible.INSTANCE;
        }
        C5904aFK c5904aFK = c5958aGL.KWHzl;
        authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1.L$0 = c5958aGL;
        authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1.label = 2;
        objKWHzl = c5904aFK.KWHzl(authPasskeyServiceImpl$checkPasskeyForOkxPayRegister$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        if (!((java.lang.Boolean) objKWHzl).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC8196ayF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super PasskeyState> continuation) throws java.lang.Throwable {
        AuthPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1 authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1;
        C5958aGL c5958aGL;
        if (continuation instanceof AuthPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1) {
            authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1 = (AuthPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1) continuation;
            int i = authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1.label = i - Integer.MIN_VALUE;
            } else {
                authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1 = new AuthPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C5908aFO c5908aFO = this.djBIcL;
            authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1.L$0 = this;
            authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1.label = 1;
            objKWHzl = c5908aFO.KWHzl(authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c5958aGL = this;
        } else if (i2 == 1) {
            c5958aGL = (C5958aGL) authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                return ((java.lang.Boolean) objKWHzl).booleanValue() ? PasskeyState.DeviceNotCompatible.INSTANCE : new PasskeyState.Success(null, 1, null);
            }
            c5958aGL = (C5958aGL) authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            if (!((java.lang.Boolean) objKWHzl).booleanValue()) {
                return PasskeyState.IsChinaIp.INSTANCE;
            }
            if (!c5958aGL.AEQbTJ.AEQbTJ()) {
                return PasskeyState.ScreenLockDisabled.INSTANCE;
            }
            C5903aFJ c5903aFJ = c5958aGL.EZpvd;
            authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1.L$0 = null;
            authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1.label = 3;
            objKWHzl = c5903aFJ.AEQbTJ(authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            if (((java.lang.Boolean) objKWHzl).booleanValue()) {
            }
        }
        if (!((java.lang.Boolean) objKWHzl).booleanValue()) {
            return PasskeyState.DeviceNotCompatible.INSTANCE;
        }
        C5904aFK c5904aFK = c5958aGL.KWHzl;
        authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1.L$0 = c5958aGL;
        authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1.label = 2;
        objKWHzl = c5904aFK.KWHzl(authPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        if (!((java.lang.Boolean) objKWHzl).booleanValue()) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [544=4] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC8196ayF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        AuthPasskeyServiceImpl$isFido1CompatibleOnly$1 authPasskeyServiceImpl$isFido1CompatibleOnly$1;
        C5958aGL c5958aGL;
        boolean z;
        C5958aGL c5958aGL2;
        java.lang.Object objEZpvd;
        PasskeyVersionState passkeyVersionState;
        java.lang.Object objCopydefault;
        boolean z2;
        PasskeyFido1State passkeyFido1State;
        PasskeyVersionState passkeyVersionState2;
        if (continuation instanceof AuthPasskeyServiceImpl$isFido1CompatibleOnly$1) {
            authPasskeyServiceImpl$isFido1CompatibleOnly$1 = (AuthPasskeyServiceImpl$isFido1CompatibleOnly$1) continuation;
            int i = authPasskeyServiceImpl$isFido1CompatibleOnly$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                authPasskeyServiceImpl$isFido1CompatibleOnly$1.label = i - Integer.MIN_VALUE;
            } else {
                authPasskeyServiceImpl$isFido1CompatibleOnly$1 = new AuthPasskeyServiceImpl$isFido1CompatibleOnly$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault2 = authPasskeyServiceImpl$isFido1CompatibleOnly$1.result;
        java.lang.Object objCopydefault3 = C56442yFn.copydefault();
        int i2 = authPasskeyServiceImpl$isFido1CompatibleOnly$1.label;
        boolean z3 = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault2);
            C5941aFv c5941aFv = this.OLrzqt;
            authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$0 = this;
            authPasskeyServiceImpl$isFido1CompatibleOnly$1.label = 1;
            objCopydefault2 = c5941aFv.copydefault(authPasskeyServiceImpl$isFido1CompatibleOnly$1);
            if (objCopydefault2 == objCopydefault3) {
                return objCopydefault3;
            }
            c5958aGL = this;
        } else if (i2 == 1) {
            c5958aGL = (C5958aGL) authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault2);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = authPasskeyServiceImpl$isFido1CompatibleOnly$1.Z$0;
                    passkeyFido1State = (PasskeyFido1State) authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$1;
                    passkeyVersionState2 = (PasskeyVersionState) authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault2);
                    PasskeyVersionState passkeyVersionState3 = (PasskeyVersionState) objCopydefault2;
                    if (!z2 || Intrinsics.EZpvd(passkeyVersionState2, PasskeyVersionState.Fido2Compatible.INSTANCE) || (!Intrinsics.EZpvd(passkeyFido1State, PasskeyFido1State.Compatible.INSTANCE) && !Intrinsics.EZpvd(passkeyVersionState3, PasskeyVersionState.Fido1v2Compatible.INSTANCE))) {
                        z3 = false;
                    }
                    return C56443yFo.KWHzl(z3);
                }
                z = authPasskeyServiceImpl$isFido1CompatibleOnly$1.Z$0;
                passkeyVersionState = (PasskeyVersionState) authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$1;
                c5958aGL2 = (C5958aGL) authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault2);
                PasskeyFido1State passkeyFido1State2 = (PasskeyFido1State) objCopydefault2;
                C5937aFr c5937aFr = c5958aGL2.AYXKKw;
                authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$0 = passkeyVersionState;
                authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$1 = passkeyFido1State2;
                authPasskeyServiceImpl$isFido1CompatibleOnly$1.Z$0 = z;
                authPasskeyServiceImpl$isFido1CompatibleOnly$1.label = 4;
                objCopydefault = c5937aFr.copydefault(authPasskeyServiceImpl$isFido1CompatibleOnly$1);
                if (objCopydefault != objCopydefault3) {
                    return objCopydefault3;
                }
                z2 = z;
                passkeyFido1State = passkeyFido1State2;
                objCopydefault2 = objCopydefault;
                passkeyVersionState2 = passkeyVersionState;
                PasskeyVersionState passkeyVersionState32 = (PasskeyVersionState) objCopydefault2;
                if (!z2) {
                    z3 = false;
                }
                return C56443yFo.KWHzl(z3);
            }
            z = authPasskeyServiceImpl$isFido1CompatibleOnly$1.Z$0;
            c5958aGL2 = (C5958aGL) authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault2);
            PasskeyVersionState passkeyVersionState4 = (PasskeyVersionState) objCopydefault2;
            C5939aFt c5939aFt = c5958aGL2.AhwBna;
            authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$0 = c5958aGL2;
            authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$1 = passkeyVersionState4;
            authPasskeyServiceImpl$isFido1CompatibleOnly$1.Z$0 = z;
            authPasskeyServiceImpl$isFido1CompatibleOnly$1.label = 3;
            objEZpvd = c5939aFt.EZpvd(authPasskeyServiceImpl$isFido1CompatibleOnly$1);
            if (objEZpvd != objCopydefault3) {
                return objCopydefault3;
            }
            passkeyVersionState = passkeyVersionState4;
            objCopydefault2 = objEZpvd;
            PasskeyFido1State passkeyFido1State22 = (PasskeyFido1State) objCopydefault2;
            C5937aFr c5937aFr2 = c5958aGL2.AYXKKw;
            authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$0 = passkeyVersionState;
            authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$1 = passkeyFido1State22;
            authPasskeyServiceImpl$isFido1CompatibleOnly$1.Z$0 = z;
            authPasskeyServiceImpl$isFido1CompatibleOnly$1.label = 4;
            objCopydefault = c5937aFr2.copydefault(authPasskeyServiceImpl$isFido1CompatibleOnly$1);
            if (objCopydefault != objCopydefault3) {
            }
        }
        boolean zBooleanValue = ((java.lang.Boolean) objCopydefault2).booleanValue();
        C5938aFs c5938aFs = c5958aGL.valueOf;
        authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$0 = c5958aGL;
        authPasskeyServiceImpl$isFido1CompatibleOnly$1.Z$0 = zBooleanValue;
        authPasskeyServiceImpl$isFido1CompatibleOnly$1.label = 2;
        java.lang.Object objKWHzl = c5938aFs.KWHzl(authPasskeyServiceImpl$isFido1CompatibleOnly$1);
        if (objKWHzl == objCopydefault3) {
            return objCopydefault3;
        }
        C5958aGL c5958aGL3 = c5958aGL;
        z = zBooleanValue;
        objCopydefault2 = objKWHzl;
        c5958aGL2 = c5958aGL3;
        PasskeyVersionState passkeyVersionState42 = (PasskeyVersionState) objCopydefault2;
        C5939aFt c5939aFt2 = c5958aGL2.AhwBna;
        authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$0 = c5958aGL2;
        authPasskeyServiceImpl$isFido1CompatibleOnly$1.L$1 = passkeyVersionState42;
        authPasskeyServiceImpl$isFido1CompatibleOnly$1.Z$0 = z;
        authPasskeyServiceImpl$isFido1CompatibleOnly$1.label = 3;
        objEZpvd = c5939aFt2.EZpvd(authPasskeyServiceImpl$isFido1CompatibleOnly$1);
        if (objEZpvd != objCopydefault3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC8196ayF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object valueOf(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        AuthPasskeyServiceImpl$isPasskeyRegisterSupported$1 authPasskeyServiceImpl$isPasskeyRegisterSupported$1;
        C5958aGL c5958aGL;
        boolean z;
        C5958aGL c5958aGL2;
        java.lang.Object objCopydefault;
        boolean z2;
        PasskeyVersionState passkeyVersionState;
        if (continuation instanceof AuthPasskeyServiceImpl$isPasskeyRegisterSupported$1) {
            authPasskeyServiceImpl$isPasskeyRegisterSupported$1 = (AuthPasskeyServiceImpl$isPasskeyRegisterSupported$1) continuation;
            int i = authPasskeyServiceImpl$isPasskeyRegisterSupported$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                authPasskeyServiceImpl$isPasskeyRegisterSupported$1.label = i - Integer.MIN_VALUE;
            } else {
                authPasskeyServiceImpl$isPasskeyRegisterSupported$1 = new AuthPasskeyServiceImpl$isPasskeyRegisterSupported$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault2 = authPasskeyServiceImpl$isPasskeyRegisterSupported$1.result;
        java.lang.Object objCopydefault3 = C56442yFn.copydefault();
        int i2 = authPasskeyServiceImpl$isPasskeyRegisterSupported$1.label;
        boolean z3 = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault2);
            C5941aFv c5941aFv = this.OLrzqt;
            authPasskeyServiceImpl$isPasskeyRegisterSupported$1.L$0 = this;
            authPasskeyServiceImpl$isPasskeyRegisterSupported$1.label = 1;
            objCopydefault2 = c5941aFv.copydefault(authPasskeyServiceImpl$isPasskeyRegisterSupported$1);
            if (objCopydefault2 == objCopydefault3) {
                return objCopydefault3;
            }
            c5958aGL = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = authPasskeyServiceImpl$isPasskeyRegisterSupported$1.Z$0;
                    passkeyVersionState = (PasskeyVersionState) authPasskeyServiceImpl$isPasskeyRegisterSupported$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault2);
                    PasskeyVersionState passkeyVersionState2 = (PasskeyVersionState) objCopydefault2;
                    if (!z2 && !Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido2Compatible.INSTANCE) && !Intrinsics.EZpvd(passkeyVersionState2, PasskeyVersionState.Fido1v2Compatible.INSTANCE)) {
                        z3 = false;
                    }
                    return C56443yFo.KWHzl(z3);
                }
                z = authPasskeyServiceImpl$isPasskeyRegisterSupported$1.Z$0;
                c5958aGL2 = (C5958aGL) authPasskeyServiceImpl$isPasskeyRegisterSupported$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault2);
                PasskeyVersionState passkeyVersionState3 = (PasskeyVersionState) objCopydefault2;
                C5937aFr c5937aFr = c5958aGL2.AYXKKw;
                authPasskeyServiceImpl$isPasskeyRegisterSupported$1.L$0 = passkeyVersionState3;
                authPasskeyServiceImpl$isPasskeyRegisterSupported$1.Z$0 = z;
                authPasskeyServiceImpl$isPasskeyRegisterSupported$1.label = 3;
                objCopydefault = c5937aFr.copydefault(authPasskeyServiceImpl$isPasskeyRegisterSupported$1);
                if (objCopydefault != objCopydefault3) {
                    return objCopydefault3;
                }
                z2 = z;
                passkeyVersionState = passkeyVersionState3;
                objCopydefault2 = objCopydefault;
                PasskeyVersionState passkeyVersionState22 = (PasskeyVersionState) objCopydefault2;
                if (!z2) {
                    z3 = false;
                }
                return C56443yFo.KWHzl(z3);
            }
            c5958aGL = (C5958aGL) authPasskeyServiceImpl$isPasskeyRegisterSupported$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault2);
        }
        boolean zBooleanValue = ((java.lang.Boolean) objCopydefault2).booleanValue();
        C5938aFs c5938aFs = c5958aGL.valueOf;
        authPasskeyServiceImpl$isPasskeyRegisterSupported$1.L$0 = c5958aGL;
        authPasskeyServiceImpl$isPasskeyRegisterSupported$1.Z$0 = zBooleanValue;
        authPasskeyServiceImpl$isPasskeyRegisterSupported$1.label = 2;
        java.lang.Object objKWHzl = c5938aFs.KWHzl(authPasskeyServiceImpl$isPasskeyRegisterSupported$1);
        if (objKWHzl == objCopydefault3) {
            return objCopydefault3;
        }
        C5958aGL c5958aGL3 = c5958aGL;
        z = zBooleanValue;
        objCopydefault2 = objKWHzl;
        c5958aGL2 = c5958aGL3;
        PasskeyVersionState passkeyVersionState32 = (PasskeyVersionState) objCopydefault2;
        C5937aFr c5937aFr2 = c5958aGL2.AYXKKw;
        authPasskeyServiceImpl$isPasskeyRegisterSupported$1.L$0 = passkeyVersionState32;
        authPasskeyServiceImpl$isPasskeyRegisterSupported$1.Z$0 = z;
        authPasskeyServiceImpl$isPasskeyRegisterSupported$1.label = 3;
        objCopydefault = c5937aFr2.copydefault(authPasskeyServiceImpl$isPasskeyRegisterSupported$1);
        if (objCopydefault != objCopydefault3) {
        }
    }

    @Override // o.InterfaceC8196ayF
    public java.lang.Object EZpvd(@NotNull Continuation<? super PasskeyCanLinkExistingToCedefiWalletState> continuation) {
        return this.fetchVPNInfo.KWHzl(continuation);
    }

    @Override // o.InterfaceC8196ayF
    public ActivityResultContract<PasskeyLinkScenarioRequest, PasskeyLinkState> EZpvd() {
        return new LoaderManager();
    }

    /* JADX INFO: renamed from: o.aGL$LoaderManager */
    public static final class LoaderManager extends ActivityResultContract<PasskeyLinkScenarioRequest, PasskeyLinkState> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, PasskeyLinkScenarioRequest passkeyLinkScenarioRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyLinkScenarioRequest, "");
            return ActivityC6144aJm.Companion.EZpvd(context, passkeyLinkScenarioRequest);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public PasskeyLinkState parseResult(int i, android.content.Intent intent) {
            PasskeyLinkState passkeyLinkState = intent != null ? (PasskeyLinkState) intent.getParcelableExtra("KEY_RESPONSE") : null;
            return passkeyLinkState == null ? PasskeyLinkState.Cancel.OLrzqt : passkeyLinkState;
        }
    }

    @Override // o.InterfaceC8196ayF
    public ActivityResultContract<PasskeyResetRemoveRequest, PasskeyResetRemoveState> KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new SharedElementCallback();
    }

    /* JADX INFO: renamed from: o.aGL$SharedElementCallback */
    public static final class SharedElementCallback extends ActivityResultContract<PasskeyResetRemoveRequest, PasskeyResetRemoveState> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, PasskeyResetRemoveRequest passkeyResetRemoveRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyResetRemoveRequest, "");
            return ActivityC6460aPk.Companion.copydefault(context, passkeyResetRemoveRequest);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public PasskeyResetRemoveState parseResult(int i, android.content.Intent intent) {
            PasskeyResetRemoveState passkeyResetRemoveState;
            return (intent == null || (passkeyResetRemoveState = (PasskeyResetRemoveState) intent.getParcelableExtra("KEY_RESET_REMOVE_RESPONSE")) == null) ? PasskeyResetRemoveState.Cancel.copydefault : passkeyResetRemoveState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object gEmmrt(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        AuthPasskeyServiceImpl$hasOkxPayPasskey$1 authPasskeyServiceImpl$hasOkxPayPasskey$1;
        java.lang.Object objAEQbTJ;
        java.util.List<GetAuthenticatorListResponse.TaskDescription> authenticators;
        if (continuation instanceof AuthPasskeyServiceImpl$hasOkxPayPasskey$1) {
            authPasskeyServiceImpl$hasOkxPayPasskey$1 = (AuthPasskeyServiceImpl$hasOkxPayPasskey$1) continuation;
            int i = authPasskeyServiceImpl$hasOkxPayPasskey$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                authPasskeyServiceImpl$hasOkxPayPasskey$1.label = i - Integer.MIN_VALUE;
            } else {
                authPasskeyServiceImpl$hasOkxPayPasskey$1 = new AuthPasskeyServiceImpl$hasOkxPayPasskey$1(this, continuation);
            }
        }
        java.lang.Object obj = authPasskeyServiceImpl$hasOkxPayPasskey$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = authPasskeyServiceImpl$hasOkxPayPasskey$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C5982aGj c5982aGj = this.AkhnZx;
            authPasskeyServiceImpl$hasOkxPayPasskey$1.label = 1;
            objAEQbTJ = c5982aGj.AEQbTJ(authPasskeyServiceImpl$hasOkxPayPasskey$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            if (Result.m7383isFailureimpl(objAEQbTJ)) {
                objAEQbTJ = null;
            }
            GetAuthenticatorListResponse getAuthenticatorListResponse = (GetAuthenticatorListResponse) objAEQbTJ;
            if (getAuthenticatorListResponse == null || (authenticators = getAuthenticatorListResponse.getAuthenticators()) == null || authenticators.size() <= 0) {
            }
            return C56443yFo.KWHzl(z);
        }
        pUU.copydefault("AuthPasskeyServiceImpl", "hasOkxPayPasskey: " + Result.m7380exceptionOrNullimpl(objAEQbTJ));
        z = false;
        return C56443yFo.KWHzl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Result<InitiateMfaSessionResponse>> continuation) throws java.lang.Throwable {
        AuthPasskeyServiceImpl$startPasskeyMfaInit$1 authPasskeyServiceImpl$startPasskeyMfaInit$1;
        if (continuation instanceof AuthPasskeyServiceImpl$startPasskeyMfaInit$1) {
            authPasskeyServiceImpl$startPasskeyMfaInit$1 = (AuthPasskeyServiceImpl$startPasskeyMfaInit$1) continuation;
            int i = authPasskeyServiceImpl$startPasskeyMfaInit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                authPasskeyServiceImpl$startPasskeyMfaInit$1.label = i - Integer.MIN_VALUE;
            } else {
                authPasskeyServiceImpl$startPasskeyMfaInit$1 = new AuthPasskeyServiceImpl$startPasskeyMfaInit$1(this, continuation);
            }
        }
        java.lang.Object obj = authPasskeyServiceImpl$startPasskeyMfaInit$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = authPasskeyServiceImpl$startPasskeyMfaInit$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C5905aFL c5905aFL = this.isConnected;
        authPasskeyServiceImpl$startPasskeyMfaInit$1.label = 1;
        java.lang.Object objKWHzl = c5905aFL.KWHzl(str, authPasskeyServiceImpl$startPasskeyMfaInit$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    @Override // o.InterfaceC8196ayF
    public ActivityResultContract<Unit, PasskeyRecoverState> gEmmrt() {
        return new PendingIntent();
    }

    /* JADX INFO: renamed from: o.aGL$PendingIntent */
    public static final class PendingIntent extends ActivityResultContract<Unit, PasskeyRecoverState> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, Unit unit) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(unit, "");
            return ActivityC6236aLY.Companion.OLrzqt(context);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public PasskeyRecoverState parseResult(int i, android.content.Intent intent) {
            PasskeyRecoverState passkeyRecoverState = intent != null ? (PasskeyRecoverState) intent.getParcelableExtra("KEY_RESPONSE") : null;
            return passkeyRecoverState == null ? PasskeyRecoverState.Close.OLrzqt : passkeyRecoverState;
        }
    }

    @Override // o.InterfaceC8196ayF
    public void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        context.startActivity(PasskeyCrossDeviceMasterActivity.Companion.OLrzqt(context, new PasskeyCrossDeviceMasterActivity.Input(str, str2, z)));
    }
}
