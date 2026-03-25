package com.okinc.auth.impl.mfa.ui.passkey;

import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaResult;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5764aCd;
import o.C5790aDC;
import o.C5941aFv;
import o.C6617aSi;
import o.C8206ayP;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaPasskeyViewModel$postVerify$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C5790aDC $fragment;
    final /* synthetic */ MfaScenario $mfaScenario;
    final /* synthetic */ PasskeySdkResult $result;
    int label;
    final /* synthetic */ VerifyMfaPasskeyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaPasskeyViewModel$postVerify$1(PasskeySdkResult passkeySdkResult, VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel, MfaScenario mfaScenario, C5790aDC c5790aDC, Continuation<? super VerifyMfaPasskeyViewModel$postVerify$1> continuation) {
        super(2, continuation);
        this.$result = passkeySdkResult;
        this.this$0 = verifyMfaPasskeyViewModel;
        this.$mfaScenario = mfaScenario;
        this.$fragment = c5790aDC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaPasskeyViewModel$postVerify$1(this.$result, this.this$0, this.$mfaScenario, this.$fragment, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyViewModel$postVerify$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v81, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v93, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v98, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0205  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objAEQbTJ2;
        MfaResult mfaResult;
        MfaResult mfaResult2;
        Object objCopydefault;
        AuthenticationStartResponse authenticationStartResponse;
        MutableSharedFlow mutableSharedFlow;
        String strAYXKKw;
        AuthenticationStartResponse authenticationStartResponse2;
        AuthenticationStartResponse authenticationStartResponse3;
        Object objCopydefault2 = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                PasskeySdkResult passkeySdkResult = this.$result;
                if (passkeySdkResult instanceof PasskeySdkResult.SuccessWithJson) {
                    JSONObject jSONObject = new JSONObject(((PasskeySdkResult.SuccessWithJson) passkeySdkResult).copydefault());
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("response");
                    C5764aCd c5764aCd = this.this$0.zsXlph;
                    String str = (String) this.this$0.values.getValue();
                    if (str == null) {
                        str = "";
                    }
                    String strOptString = jSONObject.optString("id");
                    String str2 = strOptString == null ? "" : strOptString;
                    String strOptString2 = jSONObject.optString("rawId");
                    String str3 = strOptString2 == null ? "" : strOptString2;
                    String string = PublicKeyCredentialType.PUBLIC_KEY.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    String strOptString3 = jSONObject.optString("authenticatorAttachment");
                    String str4 = strOptString3 == null ? "" : strOptString3;
                    String strOptString4 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("clientDataJSON") : null;
                    if (strOptString4 == null) {
                        strOptString4 = "";
                    }
                    String strOptString5 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("authenticatorData") : null;
                    if (strOptString5 == null) {
                        strOptString5 = "";
                    }
                    String strOptString6 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("signature") : null;
                    if (strOptString6 == null) {
                        strOptString6 = "";
                    }
                    String strOptString7 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("userHandle") : null;
                    UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody = new UnlockTokenWithFidoRequestBody(string, str2, str3, str4, new UnlockTokenWithFidoRequestBody.ResponseData(strOptString4, strOptString5, strOptString6, strOptString7 != null ? strOptString7 : ""), new UnlockTokenWithFidoRequestBody.ClientExtensionResultsData((UnlockTokenWithFidoRequestBody.CredPropsData) null, 1, (DefaultConstructorMarker) null));
                    SubdomainStrategy value = this.this$0.iwGUEr().getValue();
                    MfaScenario mfaScenario = this.$mfaScenario;
                    this.label = 1;
                    objAEQbTJ2 = c5764aCd.AEQbTJ(str, unlockTokenWithFidoRequestBody, value, mfaScenario, this);
                    if (objAEQbTJ2 == objCopydefault2) {
                        return objCopydefault2;
                    }
                    mfaResult = (MfaResult) objAEQbTJ2;
                    if (!(mfaResult instanceof MfaResult.Success)) {
                        MutableSharedFlow mutableSharedFlow2 = this.this$0.valueOf;
                        MfaResponse mfaResponseKWHzl = ((MfaResult.Success) mfaResult).KWHzl();
                        this.label = 2;
                        if (mutableSharedFlow2.emit(mfaResponseKWHzl, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    } else if (mfaResult instanceof MfaResult.Failure) {
                        MutableSharedFlow mutableSharedFlow3 = this.this$0.djBIcL;
                        MfaFailure mfaFailureKWHzl = ((MfaResult.Failure) mfaResult).KWHzl();
                        this.label = 3;
                        if (mutableSharedFlow3.emit(mfaFailureKWHzl, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
                if (passkeySdkResult instanceof PasskeySdkResult.SuccessWithPublicKeyCredential) {
                    PublicKeyCredential publicKeyCredentialOLrzqt = ((PasskeySdkResult.SuccessWithPublicKeyCredential) passkeySdkResult).OLrzqt();
                    AuthenticatorResponse response = publicKeyCredentialOLrzqt.getResponse();
                    Intrinsics.copydefault(response, "");
                    AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) response;
                    C5764aCd c5764aCd2 = this.this$0.zsXlph;
                    String str5 = (String) this.this$0.values.getValue();
                    if (str5 == null) {
                        str5 = "";
                    }
                    String id = publicKeyCredentialOLrzqt.getId();
                    String str6 = id == null ? "" : id;
                    byte[] rawId = publicKeyCredentialOLrzqt.getRawId();
                    String strAEQbTJ = rawId != null ? C6617aSi.AEQbTJ(rawId) : null;
                    String string2 = PublicKeyCredentialType.PUBLIC_KEY.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    String authenticatorAttachment = publicKeyCredentialOLrzqt.getAuthenticatorAttachment();
                    String str7 = authenticatorAttachment == null ? "" : authenticatorAttachment;
                    byte[] clientDataJSON = authenticatorAssertionResponse.getClientDataJSON();
                    Intrinsics.checkNotNullExpressionValue(clientDataJSON, "");
                    String strAEQbTJ2 = C6617aSi.AEQbTJ(clientDataJSON);
                    byte[] authenticatorData = authenticatorAssertionResponse.getAuthenticatorData();
                    Intrinsics.checkNotNullExpressionValue(authenticatorData, "");
                    String strAEQbTJ3 = C6617aSi.AEQbTJ(authenticatorData);
                    byte[] signature = authenticatorAssertionResponse.getSignature();
                    Intrinsics.checkNotNullExpressionValue(signature, "");
                    String strAEQbTJ4 = C6617aSi.AEQbTJ(signature);
                    byte[] userHandle = authenticatorAssertionResponse.getUserHandle();
                    UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody2 = new UnlockTokenWithFidoRequestBody(string2, str6, strAEQbTJ, str7, new UnlockTokenWithFidoRequestBody.ResponseData(strAEQbTJ2, strAEQbTJ3, strAEQbTJ4, userHandle != null ? C6617aSi.AEQbTJ(userHandle) : null), new UnlockTokenWithFidoRequestBody.ClientExtensionResultsData((UnlockTokenWithFidoRequestBody.CredPropsData) null, 1, (DefaultConstructorMarker) null));
                    SubdomainStrategy value2 = this.this$0.iwGUEr().getValue();
                    MfaScenario mfaScenario2 = this.$mfaScenario;
                    this.label = 4;
                    objAEQbTJ = c5764aCd2.AEQbTJ(str5, unlockTokenWithFidoRequestBody2, value2, mfaScenario2, this);
                    if (objAEQbTJ == objCopydefault2) {
                        return objCopydefault2;
                    }
                    mfaResult2 = (MfaResult) objAEQbTJ;
                    if (!(mfaResult2 instanceof MfaResult.Success)) {
                        MutableSharedFlow mutableSharedFlow4 = this.this$0.valueOf;
                        MfaResponse mfaResponseKWHzl2 = ((MfaResult.Success) mfaResult2).KWHzl();
                        this.label = 5;
                        if (mutableSharedFlow4.emit(mfaResponseKWHzl2, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    } else if (mfaResult2 instanceof MfaResult.Failure) {
                        MutableSharedFlow mutableSharedFlow5 = this.this$0.djBIcL;
                        MfaFailure mfaFailureKWHzl2 = ((MfaResult.Failure) mfaResult2).KWHzl();
                        this.label = 6;
                        if (mutableSharedFlow5.emit(mfaFailureKWHzl2, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
                if (passkeySdkResult instanceof PasskeySdkResult.Failure) {
                    MutableSharedFlow mutableSharedFlow6 = this.this$0.gEmmrt;
                    Boolean boolKWHzl = C56443yFo.KWHzl(false);
                    this.label = 7;
                    if (mutableSharedFlow6.emit(boolKWHzl, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    if (!((PasskeySdkResult.Failure) this.$result).AhwBna()) {
                        MutableSharedFlow mutableSharedFlow7 = this.this$0.EZpvd;
                        Unit unit = Unit.INSTANCE;
                        this.label = 8;
                        if (mutableSharedFlow7.emit(unit, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    } else if (((PasskeySdkResult.Failure) this.$result).djBIcL()) {
                        MutableSharedFlow mutableSharedFlow8 = this.this$0.OLrzqt;
                        Unit unit2 = Unit.INSTANCE;
                        this.label = 9;
                        if (mutableSharedFlow8.emit(unit2, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    } else {
                        C5941aFv c5941aFv = this.this$0.iwGUEr;
                        this.label = 10;
                        objCopydefault = c5941aFv.copydefault(this);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        if (((Boolean) objCopydefault).booleanValue() || !((PasskeySdkResult.Failure) this.$result).OLrzqt()) {
                            authenticationStartResponse = (AuthenticationStartResponse) this.this$0.AEQbTJ.getValue();
                            if (authenticationStartResponse != null) {
                                this.this$0.copydefault(authenticationStartResponse, this.$fragment, ((PasskeySdkResult.Failure) this.$result).KWHzl(), this.$mfaScenario);
                            }
                        } else {
                            this.this$0.EZpvd(true, this.$mfaScenario);
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (passkeySdkResult instanceof PasskeySdkResult.AlreadyExisted) {
                    MutableSharedFlow mutableSharedFlow9 = this.this$0.gEmmrt;
                    Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
                    this.label = 11;
                    if (mutableSharedFlow9.emit(boolKWHzl2, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    mutableSharedFlow = this.this$0.copydefault;
                    strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.RcXXUw);
                    this.label = 12;
                    if (mutableSharedFlow.emit(strAYXKKw, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return Unit.INSTANCE;
                }
                if (passkeySdkResult instanceof PasskeySdkResult.CancelledOrVerifiedFail) {
                    MutableSharedFlow mutableSharedFlow10 = this.this$0.gEmmrt;
                    Boolean boolKWHzl3 = C56443yFo.KWHzl(false);
                    this.label = 13;
                    if (mutableSharedFlow10.emit(boolKWHzl3, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    authenticationStartResponse2 = (AuthenticationStartResponse) this.this$0.AEQbTJ.getValue();
                    if (authenticationStartResponse2 != null) {
                        this.this$0.copydefault(authenticationStartResponse2, this.$fragment, "", this.$mfaScenario);
                    }
                    return Unit.INSTANCE;
                }
                if (passkeySdkResult instanceof PasskeySdkResult.NoValidPasskey) {
                    MutableSharedFlow mutableSharedFlow11 = this.this$0.gEmmrt;
                    Boolean boolKWHzl4 = C56443yFo.KWHzl(false);
                    this.label = 14;
                    if (mutableSharedFlow11.emit(boolKWHzl4, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    authenticationStartResponse3 = (AuthenticationStartResponse) this.this$0.AEQbTJ.getValue();
                    if (authenticationStartResponse3 != null) {
                        this.this$0.copydefault(authenticationStartResponse3, this.$fragment, "", this.$mfaScenario);
                    }
                    return Unit.INSTANCE;
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ2 = obj;
                mfaResult = (MfaResult) objAEQbTJ2;
                if (!(mfaResult instanceof MfaResult.Success)) {
                }
                return Unit.INSTANCE;
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 12:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
                mfaResult2 = (MfaResult) objAEQbTJ;
                if (!(mfaResult2 instanceof MfaResult.Success)) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                if (!((PasskeySdkResult.Failure) this.$result).AhwBna()) {
                }
                return Unit.INSTANCE;
            case 10:
                C56391yDq.AEQbTJ(obj);
                objCopydefault = obj;
                if (((Boolean) objCopydefault).booleanValue()) {
                    authenticationStartResponse = (AuthenticationStartResponse) this.this$0.AEQbTJ.getValue();
                    if (authenticationStartResponse != null) {
                    }
                }
                return Unit.INSTANCE;
            case 11:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.copydefault;
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.RcXXUw);
                this.label = 12;
                if (mutableSharedFlow.emit(strAYXKKw, this) == objCopydefault2) {
                }
                return Unit.INSTANCE;
            case 13:
                C56391yDq.AEQbTJ(obj);
                authenticationStartResponse2 = (AuthenticationStartResponse) this.this$0.AEQbTJ.getValue();
                if (authenticationStartResponse2 != null) {
                }
                return Unit.INSTANCE;
            case 14:
                C56391yDq.AEQbTJ(obj);
                authenticationStartResponse3 = (AuthenticationStartResponse) this.this$0.AEQbTJ.getValue();
                if (authenticationStartResponse3 != null) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
