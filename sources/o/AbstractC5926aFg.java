package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManager;
import androidx.credentials.CustomCredential;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.PasswordCredential;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.domerrors.DomError;
import androidx.credentials.exceptions.domerrors.InvalidStateError;
import androidx.credentials.exceptions.domerrors.NotAllowedError;
import androidx.credentials.exceptions.domerrors.SecurityError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.impl.passkey.PasskeyBaseFragment$fallbackToFido2IfPossible$1;
import com.okinc.auth.impl.passkey.PasskeyBaseFragment$starCredentialManagerRegister$1;
import com.okinc.auth.impl.passkey.PasskeyBaseFragment$starCredentialManagerRegister$response$1;
import com.okinc.auth.impl.passkey.PasskeyBaseFragment$startCredentialManagerAuthenticate$1;
import com.okinc.auth.impl.passkey.PasskeyBaseFragment$startCredentialManagerAuthenticate$response$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.TimeoutKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC5926aFg extends AbstractC32996moC {
    public static final Application Companion = new Application(null);
    public static final int fetchVPNInfo = 8;
    public final InterfaceC56387yDm AuCTel;
    public final ActivityResultLauncher<IntentSenderRequest> ejfBZ;
    public final ActivityResultLauncher<IntentSenderRequest> fJNWhG;
    public java.lang.String values = "PasskeyBaseFragment";
    public final int fIwbmz = C52761wXj.Fragment.OcIXYQ;

    /* JADX INFO: renamed from: o.aFg$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ErrorCode.values().length];
            try {
                iArr[ErrorCode.INVALID_STATE_ERR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorCode.NOT_ALLOWED_ERR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public abstract void OLrzqt(@NotNull PasskeySdkResult passkeySdkResult);

    public abstract void copydefault(@NotNull PasskeySdkResult passkeySdkResult);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public java.lang.String getTAG() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
    }

    public AbstractC5926aFg() {
        ActivityResultLauncher<IntentSenderRequest> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new Activity());
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.fJNWhG = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<IntentSenderRequest> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new StateListAnimator());
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.ejfBZ = activityResultLauncherRegisterForActivityResult2;
        this.AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.aFe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC5926aFg.OLrzqt(this.AEQbTJ);
            }
        });
    }

    public final void AEQbTJ(@NotNull android.app.PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "");
        try {
            C5922aFc.KWHzl.copydefault("[REGISTER]", "[FIDO2]", getTAG() + " start with pending intent");
            this.fJNWhG.launch(new IntentSenderRequest.Builder(pendingIntent).build());
        } catch (java.lang.Exception e) {
            C5922aFc.KWHzl.copydefault("[REGISTER]", "[FIDO2]", getTAG() + " exception: " + e.getMessage());
            OLrzqt(new PasskeySdkResult.Failure(null, e.getMessage(), false, 4, null));
        }
    }

    public final void EZpvd(@NotNull android.app.PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "");
        try {
            C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[FIDO2]", getTAG() + " start with pending intent");
            this.ejfBZ.launch(new IntentSenderRequest.Builder(pendingIntent).build());
        } catch (java.lang.Exception e) {
            C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[FIDO2]", getTAG() + " exception: " + e.getMessage());
            copydefault(new PasskeySdkResult.Failure(null, e.getMessage(), false, 4, null));
        }
    }

    /* JADX INFO: renamed from: o.aFg$Activity */
    public final /* synthetic */ class Activity implements ActivityResultCallback, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, AbstractC5926aFg.this, AbstractC5926aFg.class, "handleRegistrationResult", "handleRegistrationResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Method merged with bridge method: onActivityResult(Ljava/lang/Object;)V */
        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(ActivityResult activityResult) {
            Intrinsics.checkNotNullParameter(activityResult, "");
            AbstractC5926aFg.this.copydefault(activityResult);
        }
    }

    public final void copydefault(ActivityResult activityResult) {
        android.content.Intent data = activityResult.getData();
        byte[] byteArrayExtra = data != null ? data.getByteArrayExtra(Fido.FIDO2_KEY_CREDENTIAL_EXTRA) : null;
        if (activityResult.getResultCode() != -1) {
            C5922aFc.KWHzl.copydefault("[REGISTER]", "[FIDO2]", getTAG() + " cancelled");
            OLrzqt(new PasskeySdkResult.CancelledOrVerifiedFail("_cancelled"));
            return;
        }
        if (byteArrayExtra == null) {
            C5922aFc.KWHzl.copydefault("[REGISTER]", "[FIDO2]", getTAG() + " null data");
            OLrzqt(new PasskeySdkResult.Failure(null, "_null data", false, 4, null));
            return;
        }
        try {
            PublicKeyCredential publicKeyCredentialDeserializeFromBytes = PublicKeyCredential.deserializeFromBytes(byteArrayExtra);
            Intrinsics.checkNotNullExpressionValue(publicKeyCredentialDeserializeFromBytes, "");
            AuthenticatorResponse response = publicKeyCredentialDeserializeFromBytes.getResponse();
            Intrinsics.checkNotNullExpressionValue(response, "");
            if (response instanceof AuthenticatorErrorResponse) {
                C5922aFc.KWHzl.copydefault("[REGISTER]", "[FIDO2]", getTAG() + " error code: " + ((AuthenticatorErrorResponse) response).getErrorCode() + " message: " + ((AuthenticatorErrorResponse) response).getErrorMessage());
                int i = ActionBar.EZpvd[((AuthenticatorErrorResponse) response).getErrorCode().ordinal()];
                if (i == 1) {
                    OLrzqt(new PasskeySdkResult.AlreadyExisted(((AuthenticatorErrorResponse) response).getErrorMessage()));
                } else if (i == 2) {
                    java.lang.String errorMessage = ((AuthenticatorErrorResponse) response).getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = "";
                    }
                    if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) errorMessage, (java.lang.CharSequence) "User canceled the request", true) || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) errorMessage, (java.lang.CharSequence) "Cancelled by user", true)) {
                        OLrzqt(new PasskeySdkResult.CancelledOrVerifiedFail(""));
                    } else {
                        OLrzqt(new PasskeySdkResult.Failure(((AuthenticatorErrorResponse) response).getErrorCode(), ((AuthenticatorErrorResponse) response).getErrorMessage(), false, 4, null));
                    }
                } else {
                    C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "fido", "fido_register", C33129mqd.gEmmrt(java.lang.Integer.valueOf(((AuthenticatorErrorResponse) response).getErrorCode().getCode())), ((AuthenticatorErrorResponse) response).getErrorMessage(), null, 16, null);
                    OLrzqt(new PasskeySdkResult.Failure(((AuthenticatorErrorResponse) response).getErrorCode(), ((AuthenticatorErrorResponse) response).getErrorMessage(), false, 4, null));
                }
            } else {
                C5922aFc.KWHzl.copydefault("[REGISTER]", "[FIDO2]", getTAG() + " success");
                OLrzqt(new PasskeySdkResult.SuccessWithPublicKeyCredential(byteArrayExtra));
            }
        } catch (java.lang.Exception e) {
            C5922aFc.KWHzl.copydefault("[REGISTER]", "[FIDO2]", getTAG() + " exception: " + e.getMessage());
            C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "fido", "fido_register", null, C33129mqd.gEmmrt(e.getMessage()), null, 20, null);
            OLrzqt(new PasskeySdkResult.Failure(null, "_error", false, 4, null));
        }
    }

    /* JADX INFO: renamed from: o.aFg$StateListAnimator */
    public final /* synthetic */ class StateListAnimator implements ActivityResultCallback, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, AbstractC5926aFg.this, AbstractC5926aFg.class, "handleAuthenticationResult", "handleAuthenticationResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Method merged with bridge method: onActivityResult(Ljava/lang/Object;)V */
        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(ActivityResult activityResult) {
            Intrinsics.checkNotNullParameter(activityResult, "");
            AbstractC5926aFg.this.EZpvd(activityResult);
        }
    }

    public final void EZpvd(ActivityResult activityResult) {
        android.content.Intent data = activityResult.getData();
        byte[] byteArrayExtra = data != null ? data.getByteArrayExtra(Fido.FIDO2_KEY_CREDENTIAL_EXTRA) : null;
        if (activityResult.getResultCode() != -1) {
            C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[FIDO2]", getTAG() + " cancelled");
            copydefault(new PasskeySdkResult.CancelledOrVerifiedFail("_cancelled"));
            return;
        }
        if (byteArrayExtra == null) {
            C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[FIDO2]", getTAG() + " null data");
            copydefault(new PasskeySdkResult.Failure(null, "_null data", false, 4, null));
            return;
        }
        try {
            PublicKeyCredential publicKeyCredentialDeserializeFromBytes = PublicKeyCredential.deserializeFromBytes(byteArrayExtra);
            Intrinsics.checkNotNullExpressionValue(publicKeyCredentialDeserializeFromBytes, "");
            AuthenticatorResponse response = publicKeyCredentialDeserializeFromBytes.getResponse();
            Intrinsics.checkNotNullExpressionValue(response, "");
            if (response instanceof AuthenticatorErrorResponse) {
                C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[FIDO2]", getTAG() + " error code: " + ((AuthenticatorErrorResponse) response).getErrorCode() + " message: " + ((AuthenticatorErrorResponse) response).getErrorMessage());
                if (ActionBar.EZpvd[((AuthenticatorErrorResponse) response).getErrorCode().ordinal()] == 2) {
                    java.lang.String errorMessage = ((AuthenticatorErrorResponse) response).getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = "";
                    }
                    if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) errorMessage, (java.lang.CharSequence) "50156", false, 2, (java.lang.Object) null) || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) errorMessage, (java.lang.CharSequence) "Cannot find credential in local KeyStore or database", true)) {
                        copydefault(new PasskeySdkResult.NoValidPasskey(""));
                    } else if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) errorMessage, (java.lang.CharSequence) "User canceled the request", true) || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) errorMessage, (java.lang.CharSequence) "Cancelled by user", true) || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) errorMessage, (java.lang.CharSequence) "None of the allowed credentials can be authenticated", true)) {
                        copydefault(new PasskeySdkResult.CancelledOrVerifiedFail(""));
                    } else {
                        C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "fido", "fido_authenticate", C33129mqd.gEmmrt(java.lang.Integer.valueOf(((AuthenticatorErrorResponse) response).getErrorCode().getCode())), ((AuthenticatorErrorResponse) response).getErrorMessage(), null, 16, null);
                        copydefault(new PasskeySdkResult.Failure(((AuthenticatorErrorResponse) response).getErrorCode(), ((AuthenticatorErrorResponse) response).getErrorMessage(), false, 4, null));
                    }
                } else {
                    C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "fido", "fido_authenticate", C33129mqd.gEmmrt(java.lang.Integer.valueOf(((AuthenticatorErrorResponse) response).getErrorCode().getCode())), ((AuthenticatorErrorResponse) response).getErrorMessage(), null, 16, null);
                    copydefault(new PasskeySdkResult.Failure(((AuthenticatorErrorResponse) response).getErrorCode(), ((AuthenticatorErrorResponse) response).getErrorMessage(), false, 4, null));
                }
            } else {
                C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[FIDO2]", getTAG() + " success");
                copydefault(new PasskeySdkResult.SuccessWithPublicKeyCredential(byteArrayExtra));
            }
        } catch (java.lang.Exception e) {
            C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[FIDO2]", getTAG() + " exception: " + e.getMessage());
            C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "fido", "fido_authenticate", null, C33129mqd.gEmmrt(e.getMessage()), null, 20, null);
            copydefault(new PasskeySdkResult.Failure(null, "_error", false, 4, null));
        }
    }

    public final CredentialManager values() {
        return (CredentialManager) this.AuCTel.getValue();
    }

    public static final CredentialManager OLrzqt(AbstractC5926aFg abstractC5926aFg) {
        CredentialManager.Companion companion = CredentialManager.Companion;
        android.content.Context contextRequireContext = abstractC5926aFg.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return companion.create(contextRequireContext);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.aUA.addEventOfSdkError$default(o.aUA, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, java.lang.Object):void */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x007b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x007e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x0081 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: Exception -> 0x007b, CreatePublicKeyCredentialDomException -> 0x007e, CreateCredentialCancellationException -> 0x0081, TryCatch #3 {CreateCredentialCancellationException -> 0x0081, CreatePublicKeyCredentialDomException -> 0x007e, Exception -> 0x007b, blocks: (B:17:0x006e, B:38:0x00f6, B:20:0x0077, B:33:0x00b7, B:35:0x00bb, B:39:0x0103), top: B:88:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103 A[Catch: Exception -> 0x007b, CreatePublicKeyCredentialDomException -> 0x007e, CreateCredentialCancellationException -> 0x0081, TRY_LEAVE, TryCatch #3 {CreateCredentialCancellationException -> 0x0081, CreatePublicKeyCredentialDomException -> 0x007e, Exception -> 0x007b, blocks: (B:17:0x006e, B:38:0x00f6, B:20:0x0077, B:33:0x00b7, B:35:0x00bb, B:39:0x0103), top: B:88:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [o.aFg] */
    /* JADX WARN: Type inference failed for: r5v2, types: [o.aFg] */
    /* JADX WARN: Type inference failed for: r5v5, types: [o.aFg] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull CreateCredentialRequest createCredentialRequest, @NotNull Continuation<? super PasskeySdkResult> continuation) throws java.lang.Throwable {
        PasskeyBaseFragment$starCredentialManagerRegister$1 passkeyBaseFragment$starCredentialManagerRegister$1;
        java.lang.String message;
        java.lang.String message2;
        ErrorCode errorCode;
        java.lang.String message3;
        ErrorCode errorCode2;
        PasskeySdkResult.CancelledOrVerifiedFail cancelledOrVerifiedFail;
        java.lang.String message4;
        ErrorCode errorCode3;
        PasskeySdkResult.Failure failure;
        AbstractC5926aFg abstractC5926aFg;
        CreatePublicKeyCredentialResponse createPublicKeyCredentialResponse;
        java.lang.String str = "request timed out";
        if (continuation instanceof PasskeyBaseFragment$starCredentialManagerRegister$1) {
            passkeyBaseFragment$starCredentialManagerRegister$1 = (PasskeyBaseFragment$starCredentialManagerRegister$1) continuation;
            int i = passkeyBaseFragment$starCredentialManagerRegister$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyBaseFragment$starCredentialManagerRegister$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyBaseFragment$starCredentialManagerRegister$1 = new PasskeyBaseFragment$starCredentialManagerRegister$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = passkeyBaseFragment$starCredentialManagerRegister$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        ?? r5 = passkeyBaseFragment$starCredentialManagerRegister$1.label;
        try {
        } catch (CreateCredentialCancellationException e) {
            e = e;
        } catch (CreatePublicKeyCredentialDomException e2) {
            e = e2;
        } catch (java.lang.Exception e3) {
            e = e3;
        }
        switch (r5) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                try {
                    C5922aFc.KWHzl.copydefault("[REGISTER]", "[CREDENTIAL MANAGER]", getTAG() + " start with timeout: 60000");
                    PasskeyBaseFragment$starCredentialManagerRegister$response$1 passkeyBaseFragment$starCredentialManagerRegister$response$1 = new PasskeyBaseFragment$starCredentialManagerRegister$response$1(this, createCredentialRequest, null);
                    passkeyBaseFragment$starCredentialManagerRegister$1.L$0 = this;
                    passkeyBaseFragment$starCredentialManagerRegister$1.label = 1;
                    objCopydefault = TimeoutKt.withTimeoutOrNull(60000L, passkeyBaseFragment$starCredentialManagerRegister$response$1, passkeyBaseFragment$starCredentialManagerRegister$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    abstractC5926aFg = this;
                    createPublicKeyCredentialResponse = (CreatePublicKeyCredentialResponse) objCopydefault;
                    if (createPublicKeyCredentialResponse != null) {
                        C5922aFc.KWHzl.copydefault("[REGISTER]", "[CREDENTIAL MANAGER]", abstractC5926aFg.getTAG() + " timeout");
                        C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "credential_manager", "credential_manager_register", null, "request timed out: 60000 ms", null, 20, null);
                        passkeyBaseFragment$starCredentialManagerRegister$1.L$0 = abstractC5926aFg;
                        passkeyBaseFragment$starCredentialManagerRegister$1.L$1 = "request timed out";
                        passkeyBaseFragment$starCredentialManagerRegister$1.label = 2;
                        objCopydefault = abstractC5926aFg.copydefault(passkeyBaseFragment$starCredentialManagerRegister$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        return new PasskeySdkResult.Failure(null, str, ((java.lang.Boolean) objCopydefault).booleanValue());
                    }
                    C5922aFc.KWHzl.copydefault("[REGISTER]", "[CREDENTIAL MANAGER]", abstractC5926aFg.getTAG() + " success");
                    return new PasskeySdkResult.SuccessWithJson(createPublicKeyCredentialResponse.getRegistrationResponseJson());
                } catch (CreateCredentialCancellationException e4) {
                    e = e4;
                    r5 = this;
                    C5922aFc.KWHzl.copydefault("[REGISTER]", "[CREDENTIAL MANAGER]", r5.getTAG() + " exception: " + e.getMessage());
                    java.lang.String message5 = e.getMessage();
                    if (message5 == null) {
                        message5 = "";
                    }
                    if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) message5, (java.lang.CharSequence) OtpEventTracker.OTP_EVENT_VALUE_CANCEL, true)) {
                        cancelledOrVerifiedFail = new PasskeySdkResult.CancelledOrVerifiedFail("");
                        return cancelledOrVerifiedFail;
                    }
                    C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "credential_manager", "credential_manager_register", null, "[FALLBACK to FIDO2] CreateCredentialCancellationException type: " + e.getType() + " message: " + e.getMessage(), null, 20, null);
                    message4 = e.getMessage();
                    passkeyBaseFragment$starCredentialManagerRegister$1.L$0 = message4;
                    errorCode3 = null;
                    passkeyBaseFragment$starCredentialManagerRegister$1.L$1 = null;
                    passkeyBaseFragment$starCredentialManagerRegister$1.label = 3;
                    objCopydefault = r5.copydefault(passkeyBaseFragment$starCredentialManagerRegister$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    failure = new PasskeySdkResult.Failure(errorCode3, message4, ((java.lang.Boolean) objCopydefault).booleanValue());
                    return failure;
                } catch (CreatePublicKeyCredentialDomException e5) {
                    e = e5;
                    r5 = this;
                    C5922aFc.KWHzl.copydefault("[REGISTER]", "[CREDENTIAL MANAGER]", r5.getTAG() + " exception: " + e.getMessage());
                    DomError domError = e.getDomError();
                    if (domError instanceof InvalidStateError) {
                        return new PasskeySdkResult.AlreadyExisted(e.getMessage());
                    }
                    if (domError instanceof NotAllowedError) {
                        message3 = e.getMessage();
                        if (message3 == null) {
                            message3 = "";
                        }
                        if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) message3, (java.lang.CharSequence) OtpEventTracker.OTP_EVENT_VALUE_CANCEL, true)) {
                            cancelledOrVerifiedFail = new PasskeySdkResult.CancelledOrVerifiedFail("");
                            return cancelledOrVerifiedFail;
                        }
                        C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "credential_manager", "credential_manager_register", null, "[FALLBACK to FIDO2] CreatePublicKeyCredentialDomException NotAllowedError: type: " + e.getType() + " message: " + e.getMessage() + " dom: " + e.getDomError(), null, 20, null);
                        passkeyBaseFragment$starCredentialManagerRegister$1.L$0 = message3;
                        errorCode2 = null;
                        passkeyBaseFragment$starCredentialManagerRegister$1.L$1 = null;
                        passkeyBaseFragment$starCredentialManagerRegister$1.label = 4;
                        objCopydefault = r5.copydefault(passkeyBaseFragment$starCredentialManagerRegister$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        failure = new PasskeySdkResult.Failure(errorCode2, message3, ((java.lang.Boolean) objCopydefault).booleanValue());
                        return failure;
                    }
                    if (domError instanceof SecurityError) {
                        C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "credential_manager", "credential_manager_register", null, "[FALLBACK to FIDO2] CreatePublicKeyCredentialDomException NotAllowedError: type: " + e.getType() + " message: " + e.getMessage() + " dom: " + e.getDomError() + " ", null, 20, null);
                        return new PasskeySdkResult.Failure(null, e.getMessage(), false, 4, null);
                    }
                    C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "credential_manager", "credential_manager_register", null, "[FALLBACK to FIDO2] CreatePublicKeyCredentialDomException: type: " + e.getType() + " message: " + e.getMessage() + "  dom: " + e.getDomError() + ",", null, 20, null);
                    message2 = e.getMessage();
                    passkeyBaseFragment$starCredentialManagerRegister$1.L$0 = message2;
                    errorCode = null;
                    passkeyBaseFragment$starCredentialManagerRegister$1.L$1 = null;
                    passkeyBaseFragment$starCredentialManagerRegister$1.label = 5;
                    objCopydefault = r5.copydefault(passkeyBaseFragment$starCredentialManagerRegister$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    failure = new PasskeySdkResult.Failure(errorCode, message2, ((java.lang.Boolean) objCopydefault).booleanValue());
                    return failure;
                } catch (java.lang.Exception e6) {
                    e = e6;
                    r5 = this;
                    C5922aFc.KWHzl.copydefault("[REGISTER]", "[CREDENTIAL MANAGER]", r5.getTAG() + " exception: " + e.getMessage());
                    C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "credential_manager", "credential_manager_register", null, "[FALLBACK to FIDO2] Exception: message: " + e.getMessage(), null, 20, null);
                    message = e.getMessage();
                    passkeyBaseFragment$starCredentialManagerRegister$1.L$0 = message;
                    passkeyBaseFragment$starCredentialManagerRegister$1.L$1 = null;
                    passkeyBaseFragment$starCredentialManagerRegister$1.label = 6;
                    objCopydefault = r5.copydefault(passkeyBaseFragment$starCredentialManagerRegister$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return new PasskeySdkResult.Failure(null, message, ((java.lang.Boolean) objCopydefault).booleanValue());
                }
            case 1:
                abstractC5926aFg = (AbstractC5926aFg) passkeyBaseFragment$starCredentialManagerRegister$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                createPublicKeyCredentialResponse = (CreatePublicKeyCredentialResponse) objCopydefault;
                if (createPublicKeyCredentialResponse != null) {
                }
                break;
            case 2:
                str = (java.lang.String) passkeyBaseFragment$starCredentialManagerRegister$1.L$1;
                C56391yDq.AEQbTJ(objCopydefault);
                return new PasskeySdkResult.Failure(null, str, ((java.lang.Boolean) objCopydefault).booleanValue());
            case 3:
                message4 = (java.lang.String) passkeyBaseFragment$starCredentialManagerRegister$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                errorCode3 = null;
                failure = new PasskeySdkResult.Failure(errorCode3, message4, ((java.lang.Boolean) objCopydefault).booleanValue());
                return failure;
            case 4:
                message3 = (java.lang.String) passkeyBaseFragment$starCredentialManagerRegister$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                errorCode2 = null;
                failure = new PasskeySdkResult.Failure(errorCode2, message3, ((java.lang.Boolean) objCopydefault).booleanValue());
                return failure;
            case 5:
                message2 = (java.lang.String) passkeyBaseFragment$starCredentialManagerRegister$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                errorCode = null;
                failure = new PasskeySdkResult.Failure(errorCode, message2, ((java.lang.Boolean) objCopydefault).booleanValue());
                return failure;
            case 6:
                message = (java.lang.String) passkeyBaseFragment$starCredentialManagerRegister$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                return new PasskeySdkResult.Failure(null, message, ((java.lang.Boolean) objCopydefault).booleanValue());
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0097 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x009a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x009d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x00a0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da A[Catch: Exception -> 0x0097, NoCredentialException -> 0x009a, GetPublicKeyCredentialDomException -> 0x009d, GetCredentialCancellationException -> 0x00a0, TryCatch #3 {GetCredentialCancellationException -> 0x00a0, NoCredentialException -> 0x009a, GetPublicKeyCredentialDomException -> 0x009d, Exception -> 0x0097, blocks: (B:18:0x0070, B:61:0x01c8, B:21:0x007d, B:66:0x0222, B:24:0x008a, B:47:0x0115, B:27:0x0093, B:42:0x00d6, B:44:0x00da, B:48:0x0122, B:50:0x014b, B:51:0x0170, B:54:0x0176, B:57:0x017b, B:62:0x01d5), top: B:115:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122 A[Catch: Exception -> 0x0097, NoCredentialException -> 0x009a, GetPublicKeyCredentialDomException -> 0x009d, GetCredentialCancellationException -> 0x00a0, TryCatch #3 {GetCredentialCancellationException -> 0x00a0, NoCredentialException -> 0x009a, GetPublicKeyCredentialDomException -> 0x009d, Exception -> 0x0097, blocks: (B:18:0x0070, B:61:0x01c8, B:21:0x007d, B:66:0x0222, B:24:0x008a, B:47:0x0115, B:27:0x0093, B:42:0x00d6, B:44:0x00da, B:48:0x0122, B:50:0x014b, B:51:0x0170, B:54:0x0176, B:57:0x017b, B:62:0x01d5), top: B:115:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [o.aFg] */
    /* JADX WARN: Type inference failed for: r5v2, types: [o.aFg] */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.aFg] */
    /* JADX WARN: Type inference failed for: r5v4, types: [o.aFg] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull GetPublicKeyCredentialOption getPublicKeyCredentialOption, @NotNull Continuation<? super PasskeySdkResult> continuation) throws java.lang.Throwable {
        PasskeyBaseFragment$startCredentialManagerAuthenticate$1 passkeyBaseFragment$startCredentialManagerAuthenticate$1;
        java.lang.String strValueOf;
        java.lang.String message;
        java.lang.String message2;
        PasskeySdkResult.CancelledOrVerifiedFail cancelledOrVerifiedFail;
        java.lang.String strValueOf2;
        java.lang.String message3;
        PasskeySdkResult.Failure failure;
        AbstractC5926aFg abstractC5926aFg;
        GetCredentialResponse getCredentialResponse;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = "request timed out";
        if (continuation instanceof PasskeyBaseFragment$startCredentialManagerAuthenticate$1) {
            passkeyBaseFragment$startCredentialManagerAuthenticate$1 = (PasskeyBaseFragment$startCredentialManagerAuthenticate$1) continuation;
            int i = passkeyBaseFragment$startCredentialManagerAuthenticate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyBaseFragment$startCredentialManagerAuthenticate$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyBaseFragment$startCredentialManagerAuthenticate$1 = new PasskeyBaseFragment$startCredentialManagerAuthenticate$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = passkeyBaseFragment$startCredentialManagerAuthenticate$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        ?? r5 = passkeyBaseFragment$startCredentialManagerAuthenticate$1.label;
        try {
        } catch (GetCredentialCancellationException e) {
            e = e;
        } catch (NoCredentialException e2) {
            e = e2;
        } catch (GetPublicKeyCredentialDomException e3) {
            e = e3;
        } catch (java.lang.Exception e4) {
            e = e4;
        }
        switch (r5) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                try {
                    C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[CREDENTIAL MANAGER]", getTAG() + " start with timeout: 60000");
                    PasskeyBaseFragment$startCredentialManagerAuthenticate$response$1 passkeyBaseFragment$startCredentialManagerAuthenticate$response$1 = new PasskeyBaseFragment$startCredentialManagerAuthenticate$response$1(this, getPublicKeyCredentialOption, null);
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0 = this;
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.label = 1;
                    objCopydefault = TimeoutKt.withTimeoutOrNull(60000L, passkeyBaseFragment$startCredentialManagerAuthenticate$response$1, passkeyBaseFragment$startCredentialManagerAuthenticate$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    abstractC5926aFg = this;
                    getCredentialResponse = (GetCredentialResponse) objCopydefault;
                    if (getCredentialResponse != null) {
                        C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[CREDENTIAL MANAGER]", abstractC5926aFg.getTAG() + " Credential request timed out");
                        C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "credential_manager", "credential_manager_authenticate", null, "request timed out: 60000 ms", null, 20, null);
                        passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0 = abstractC5926aFg;
                        passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$1 = "request timed out";
                        passkeyBaseFragment$startCredentialManagerAuthenticate$1.label = 2;
                        objCopydefault = abstractC5926aFg.copydefault(passkeyBaseFragment$startCredentialManagerAuthenticate$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        return new PasskeySdkResult.Failure(null, str3, ((java.lang.Boolean) objCopydefault).booleanValue());
                    }
                    C5922aFc c5922aFc = C5922aFc.KWHzl;
                    c5922aFc.copydefault("[AUTHENTICATE]", "[CREDENTIAL MANAGER]", abstractC5926aFg.getTAG() + " " + getCredentialResponse.getCredential());
                    Credential credential = getCredentialResponse.getCredential();
                    if (credential instanceof androidx.credentials.PublicKeyCredential) {
                        c5922aFc.copydefault("[AUTHENTICATE]", "[CREDENTIAL MANAGER]", abstractC5926aFg.getTAG() + " success");
                        return new PasskeySdkResult.SuccessWithJson(((androidx.credentials.PublicKeyCredential) credential).getAuthenticationResponseJson());
                    }
                    if (!(credential instanceof PasswordCredential) && !(credential instanceof CustomCredential)) {
                        c5922aFc.copydefault("[AUTHENTICATE]", "[CREDENTIAL MANAGER]", abstractC5926aFg.getTAG() + " else cases");
                        C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "credential_manager", "credential_manager_authenticate", null, "[FALLBACK to FIDO2] CustomCredential: invalid credential type cred: " + C33129mqd.gEmmrt(credential), null, 20, null);
                        passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0 = abstractC5926aFg;
                        passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$1 = "invalid credential type";
                        passkeyBaseFragment$startCredentialManagerAuthenticate$1.label = 4;
                        objCopydefault = abstractC5926aFg.copydefault(passkeyBaseFragment$startCredentialManagerAuthenticate$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        str2 = "invalid credential type";
                        return new PasskeySdkResult.Failure(null, str2, ((java.lang.Boolean) objCopydefault).booleanValue());
                    }
                    c5922aFc.copydefault("[AUTHENTICATE]", "[CREDENTIAL MANAGER]", abstractC5926aFg.getTAG() + " invalid credential type");
                    C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "credential_manager", "credential_manager_authenticate", null, "[FALLBACK to FIDO2] CustomCredential: invalid credential type: " + credential.getData(), null, 20, null);
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0 = abstractC5926aFg;
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$1 = "invalid credential type";
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.label = 3;
                    objCopydefault = abstractC5926aFg.copydefault(passkeyBaseFragment$startCredentialManagerAuthenticate$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    str = "invalid credential type";
                    return new PasskeySdkResult.Failure(null, str, ((java.lang.Boolean) objCopydefault).booleanValue());
                } catch (GetCredentialCancellationException e5) {
                    e = e5;
                    r5 = this;
                    C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[CREDENTIAL MANAGER]", r5.getTAG() + " exception: " + e.getMessage());
                    java.lang.String message4 = e.getMessage();
                    if (message4 == null) {
                        message4 = "";
                    }
                    if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) message4, (java.lang.CharSequence) OtpEventTracker.OTP_EVENT_VALUE_CANCEL, true)) {
                        cancelledOrVerifiedFail = new PasskeySdkResult.CancelledOrVerifiedFail("");
                        return cancelledOrVerifiedFail;
                    }
                    C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "credential_manager", "credential_manager_authenticate", null, "[FALLBACK to FIDO2] GetCredentialCancellationException type:" + e.getType() + " exception: " + e.getMessage(), null, 20, null);
                    message3 = e.getMessage();
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0 = message3;
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$1 = null;
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.label = 5;
                    objCopydefault = r5.copydefault(passkeyBaseFragment$startCredentialManagerAuthenticate$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    failure = new PasskeySdkResult.Failure(null, message3, ((java.lang.Boolean) objCopydefault).booleanValue());
                    return failure;
                } catch (NoCredentialException e6) {
                    e = e6;
                    r5 = this;
                    C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[CREDENTIAL MANAGER]", r5.getTAG() + " no credential exception: " + e.getMessage());
                    C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "credential_manager", "credential_manager_authenticate", null, "[FALLBACK to FIDO2] NoCredentialException: type: " + e.getType() + " message: " + e.getMessage(), null, 20, null);
                    strValueOf2 = java.lang.String.valueOf(e.getMessage());
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0 = strValueOf2;
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$1 = null;
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.label = 8;
                    objCopydefault = r5.copydefault(passkeyBaseFragment$startCredentialManagerAuthenticate$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return new PasskeySdkResult.Failure(null, strValueOf2, ((java.lang.Boolean) objCopydefault).booleanValue());
                } catch (GetPublicKeyCredentialDomException e7) {
                    e = e7;
                    r5 = this;
                    C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[CREDENTIAL MANAGER]", r5.getTAG() + " type:" + e.getType() + " exception: " + e.getMessage());
                    if (e.getDomError() instanceof NotAllowedError) {
                        message2 = e.getMessage();
                        if (message2 == null) {
                            message2 = "";
                        }
                        if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) message2, (java.lang.CharSequence) "Cancelled by user", true)) {
                            cancelledOrVerifiedFail = new PasskeySdkResult.CancelledOrVerifiedFail("");
                            return cancelledOrVerifiedFail;
                        }
                        C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "credential_manager", "credential_manager_authenticate", null, "[FALLBACK to FIDO2] GetPublicKeyCredentialDomException type:" + e.getType() + " exception: " + e.getMessage(), null, 20, null);
                        passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0 = message2;
                        passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$1 = null;
                        passkeyBaseFragment$startCredentialManagerAuthenticate$1.label = 6;
                        objCopydefault = r5.copydefault(passkeyBaseFragment$startCredentialManagerAuthenticate$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        failure = new PasskeySdkResult.Failure(null, message2, ((java.lang.Boolean) objCopydefault).booleanValue());
                        return failure;
                    }
                    C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "credential_manager", "credential_manager_authenticate", null, "[FALLBACK to FIDO2] GetPublicKeyCredentialDomException type:" + e.getType() + " exception: " + e.getMessage(), null, 20, null);
                    message = e.getMessage();
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0 = message;
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$1 = null;
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.label = 7;
                    objCopydefault = r5.copydefault(passkeyBaseFragment$startCredentialManagerAuthenticate$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    failure = new PasskeySdkResult.Failure(null, message, ((java.lang.Boolean) objCopydefault).booleanValue());
                    return failure;
                } catch (java.lang.Exception e8) {
                    e = e8;
                    r5 = this;
                    C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[CREDENTIAL MANAGER]", r5.getTAG() + " exception: " + e.getMessage());
                    C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "credential_manager", "credential_manager_authenticate", null, "[FALLBACK to FIDO2] Exception: message: " + e.getMessage(), null, 20, null);
                    strValueOf = java.lang.String.valueOf(e.getMessage());
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0 = strValueOf;
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$1 = null;
                    passkeyBaseFragment$startCredentialManagerAuthenticate$1.label = 9;
                    objCopydefault = r5.copydefault(passkeyBaseFragment$startCredentialManagerAuthenticate$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return new PasskeySdkResult.Failure(null, strValueOf, ((java.lang.Boolean) objCopydefault).booleanValue());
                }
            case 1:
                abstractC5926aFg = (AbstractC5926aFg) passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                getCredentialResponse = (GetCredentialResponse) objCopydefault;
                if (getCredentialResponse != null) {
                }
                break;
            case 2:
                str3 = (java.lang.String) passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$1;
                C56391yDq.AEQbTJ(objCopydefault);
                return new PasskeySdkResult.Failure(null, str3, ((java.lang.Boolean) objCopydefault).booleanValue());
            case 3:
                str = (java.lang.String) passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$1;
                C56391yDq.AEQbTJ(objCopydefault);
                return new PasskeySdkResult.Failure(null, str, ((java.lang.Boolean) objCopydefault).booleanValue());
            case 4:
                str2 = (java.lang.String) passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$1;
                C56391yDq.AEQbTJ(objCopydefault);
                return new PasskeySdkResult.Failure(null, str2, ((java.lang.Boolean) objCopydefault).booleanValue());
            case 5:
                message3 = (java.lang.String) passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                failure = new PasskeySdkResult.Failure(null, message3, ((java.lang.Boolean) objCopydefault).booleanValue());
                return failure;
            case 6:
                message2 = (java.lang.String) passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                failure = new PasskeySdkResult.Failure(null, message2, ((java.lang.Boolean) objCopydefault).booleanValue());
                return failure;
            case 7:
                message = (java.lang.String) passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                failure = new PasskeySdkResult.Failure(null, message, ((java.lang.Boolean) objCopydefault).booleanValue());
                return failure;
            case 8:
                strValueOf2 = (java.lang.String) passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                return new PasskeySdkResult.Failure(null, strValueOf2, ((java.lang.Boolean) objCopydefault).booleanValue());
            case 9:
                strValueOf = (java.lang.String) passkeyBaseFragment$startCredentialManagerAuthenticate$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                return new PasskeySdkResult.Failure(null, strValueOf, ((java.lang.Boolean) objCopydefault).booleanValue());
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        PasskeyBaseFragment$fallbackToFido2IfPossible$1 passkeyBaseFragment$fallbackToFido2IfPossible$1;
        AbstractC5926aFg abstractC5926aFg;
        boolean zBooleanValue;
        if (continuation instanceof PasskeyBaseFragment$fallbackToFido2IfPossible$1) {
            passkeyBaseFragment$fallbackToFido2IfPossible$1 = (PasskeyBaseFragment$fallbackToFido2IfPossible$1) continuation;
            int i = passkeyBaseFragment$fallbackToFido2IfPossible$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyBaseFragment$fallbackToFido2IfPossible$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyBaseFragment$fallbackToFido2IfPossible$1 = new PasskeyBaseFragment$fallbackToFido2IfPossible$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = passkeyBaseFragment$fallbackToFido2IfPossible$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyBaseFragment$fallbackToFido2IfPossible$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            try {
                InterfaceC8196ayF interfaceC8196ayF = (InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class);
                passkeyBaseFragment$fallbackToFido2IfPossible$1.L$0 = this;
                passkeyBaseFragment$fallbackToFido2IfPossible$1.label = 1;
                objKWHzl = interfaceC8196ayF.KWHzl(passkeyBaseFragment$fallbackToFido2IfPossible$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                abstractC5926aFg = this;
            } catch (java.lang.Exception e) {
                e = e;
                abstractC5926aFg = this;
                C5922aFc.KWHzl.copydefault("[FALLBACK]", "[CREDENTIAL MANAGER]", abstractC5926aFg.getTAG() + " exception: " + e.getMessage());
                zBooleanValue = false;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC5926aFg = (AbstractC5926aFg) passkeyBaseFragment$fallbackToFido2IfPossible$1.L$0;
            try {
                C56391yDq.AEQbTJ(objKWHzl);
            } catch (java.lang.Exception e2) {
                e = e2;
                C5922aFc.KWHzl.copydefault("[FALLBACK]", "[CREDENTIAL MANAGER]", abstractC5926aFg.getTAG() + " exception: " + e.getMessage());
                zBooleanValue = false;
            }
        }
        zBooleanValue = ((java.lang.Boolean) objKWHzl).booleanValue();
        C5922aFc.KWHzl.copydefault("[FALLBACK]", "[CREDENTIAL MANAGER]", abstractC5926aFg.getTAG() + " can: " + zBooleanValue);
        return C56443yFo.KWHzl(zBooleanValue);
    }

    /* JADX INFO: renamed from: o.aFg$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
