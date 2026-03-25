package com.okinc.auth.impl.passkey.domain;

import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.PasskeyRegistrationFinishRequestBody;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33488mxR;
import o.C56391yDq;
import o.C56442yFn;
import o.C5913aFT;
import o.C6617aSi;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRegistrationUseCase$internalFinishRegistration$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ PublicKeyCredential $credential;
    final /* synthetic */ String $responseJson;
    final /* synthetic */ PasskeyScenario $scenario;
    int label;
    final /* synthetic */ C5913aFT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRegistrationUseCase$internalFinishRegistration$2(PublicKeyCredential publicKeyCredential, String str, PasskeyScenario passkeyScenario, C5913aFT c5913aFT, Continuation<? super PasskeyRegistrationUseCase$internalFinishRegistration$2> continuation) {
        super(2, continuation);
        this.$credential = publicKeyCredential;
        this.$responseJson = str;
        this.$scenario = passkeyScenario;
        this.this$0 = c5913aFT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRegistrationUseCase$internalFinishRegistration$2(this.$credential, this.$responseJson, this.$scenario, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((PasskeyRegistrationUseCase$internalFinishRegistration$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String strEZpvd;
        Object objFinishRegistration;
        Object objDexFinishRegistration;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PublicKeyCredential publicKeyCredential = this.$credential;
                String str = "";
                if (publicKeyCredential != null) {
                    AuthenticatorResponse response = publicKeyCredential.getResponse();
                    Intrinsics.copydefault(response, "");
                    AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) response;
                    String id = this.$credential.getId();
                    String str2 = id == null ? "" : id;
                    byte[] rawId = this.$credential.getRawId();
                    String strAEQbTJ = rawId != null ? C6617aSi.AEQbTJ(rawId) : null;
                    String string = PublicKeyCredentialType.PUBLIC_KEY.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    String authenticatorAttachment = this.$credential.getAuthenticatorAttachment();
                    String str3 = authenticatorAttachment == null ? "" : authenticatorAttachment;
                    byte[] clientDataJSON = authenticatorAttestationResponse.getClientDataJSON();
                    Intrinsics.checkNotNullExpressionValue(clientDataJSON, "");
                    String strAEQbTJ2 = C6617aSi.AEQbTJ(clientDataJSON);
                    byte[] attestationObject = authenticatorAttestationResponse.getAttestationObject();
                    Intrinsics.checkNotNullExpressionValue(attestationObject, "");
                    String strAEQbTJ3 = C6617aSi.AEQbTJ(attestationObject);
                    String[] transports = authenticatorAttestationResponse.getTransports();
                    Intrinsics.checkNotNullExpressionValue(transports, "");
                    ArrayList arrayList = new ArrayList(transports.length);
                    for (String str4 : transports) {
                        if (str4.equals("cable")) {
                            str4 = "hybrid";
                        }
                        arrayList.add(str4);
                    }
                    strEZpvd = C33488mxR.EZpvd(new RegistrationFinishBody(string, str2, strAEQbTJ, str3, new RegistrationFinishBody.ResponseData(strAEQbTJ2, strAEQbTJ3, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList)), new RegistrationFinishBody.ClientExtensionResultsData((RegistrationFinishBody.CredPropsData) null, 1, (DefaultConstructorMarker) null)));
                } else {
                    String str5 = this.$responseJson;
                    if (str5 != null) {
                        strEZpvd = C33488mxR.EZpvd(RegistrationFinishBody.Companion.copydefault(str5));
                    } else {
                        Result.Application application = Result.Companion;
                        return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception("invalid input"))));
                    }
                }
                String str6 = strEZpvd;
                PasskeyScenario passkeyScenario = this.$scenario;
                PasskeyScenario.CedefiWallet cedefiWallet = passkeyScenario instanceof PasskeyScenario.CedefiWallet ? (PasskeyScenario.CedefiWallet) passkeyScenario : null;
                if (cedefiWallet != null && cedefiWallet.OLrzqt()) {
                    str = "WALLET_RECOVERY";
                }
                PasskeyRegistrationFinishRequestBody passkeyRegistrationFinishRequestBody = new PasskeyRegistrationFinishRequestBody(false, (Integer) null, str6, str, 2, (DefaultConstructorMarker) null);
                PasskeyScenario passkeyScenario2 = this.$scenario;
                if (!(passkeyScenario2 instanceof PasskeyScenario.Asset) && !Intrinsics.EZpvd(passkeyScenario2, PasskeyScenario.Account.AEQbTJ)) {
                    if (passkeyScenario2 instanceof PasskeyScenario.CedefiWallet) {
                        PasskeyApiService passkeyApiService = this.this$0.OLrzqt;
                        this.label = 2;
                        objDexFinishRegistration = passkeyApiService.dexFinishRegistration(passkeyRegistrationFinishRequestBody, this);
                        if (objDexFinishRegistration == objCopydefault) {
                            return objCopydefault;
                        }
                        responseData = (ResponseData) objDexFinishRegistration;
                    } else {
                        if (!Intrinsics.EZpvd(passkeyScenario2, PasskeyScenario.Pay.EZpvd)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Result.Application application2 = Result.Companion;
                        return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception("impossible scenario"))));
                    }
                }
                PasskeyApiService passkeyApiService2 = this.this$0.OLrzqt;
                this.label = 1;
                objFinishRegistration = passkeyApiService2.finishRegistration(passkeyRegistrationFinishRequestBody, this);
                if (objFinishRegistration == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objFinishRegistration;
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                objFinishRegistration = obj;
                responseData = (ResponseData) objFinishRegistration;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objDexFinishRegistration = obj;
                responseData = (ResponseData) objDexFinishRegistration;
            }
            if (responseData.getCode() == 0) {
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(responseData.getData());
            } else {
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception("_invalid response")));
            }
        } catch (Exception e) {
            pUU.copydefault("PasskeyRegistrationUseCase", String.valueOf(e.getMessage()));
            Result.Application application5 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception(e)));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
