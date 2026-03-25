package com.okinc.auth.impl.passkey.domain;

import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5896aFC;
import o.C6617aSi;

/* JADX INFO: loaded from: classes3.dex */
public final class OkxPayPasskeyRegistrationFinishUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ PublicKeyCredential $credential;
    int label;
    final /* synthetic */ C5896aFC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkxPayPasskeyRegistrationFinishUseCase$invoke$2(PublicKeyCredential publicKeyCredential, C5896aFC c5896aFC, Continuation<? super OkxPayPasskeyRegistrationFinishUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$credential = publicKeyCredential;
        this.this$0 = c5896aFC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkxPayPasskeyRegistrationFinishUseCase$invoke$2(this.$credential, this.this$0, continuation);
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
        return ((OkxPayPasskeyRegistrationFinishUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                AuthenticatorResponse response = this.$credential.getResponse();
                Intrinsics.copydefault(response, "");
                AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) response;
                String id = this.$credential.getId();
                String str = id == null ? "" : id;
                byte[] rawId = this.$credential.getRawId();
                String strAEQbTJ = rawId != null ? C6617aSi.AEQbTJ(rawId) : null;
                String string = PublicKeyCredentialType.PUBLIC_KEY.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                String authenticatorAttachment = this.$credential.getAuthenticatorAttachment();
                String str2 = authenticatorAttachment == null ? "" : authenticatorAttachment;
                byte[] clientDataJSON = authenticatorAttestationResponse.getClientDataJSON();
                Intrinsics.checkNotNullExpressionValue(clientDataJSON, "");
                String strAEQbTJ2 = C6617aSi.AEQbTJ(clientDataJSON);
                byte[] attestationObject = authenticatorAttestationResponse.getAttestationObject();
                Intrinsics.checkNotNullExpressionValue(attestationObject, "");
                String strAEQbTJ3 = C6617aSi.AEQbTJ(attestationObject);
                String[] transports = authenticatorAttestationResponse.getTransports();
                Intrinsics.checkNotNullExpressionValue(transports, "");
                ArrayList arrayList = new ArrayList(transports.length);
                for (String str3 : transports) {
                    if (str3.equals("cable")) {
                        str3 = "hybrid";
                    }
                    arrayList.add(str3);
                }
                RegistrationFinishBody registrationFinishBody = new RegistrationFinishBody(string, str, strAEQbTJ, str2, new RegistrationFinishBody.ResponseData(strAEQbTJ2, strAEQbTJ3, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList)), new RegistrationFinishBody.ClientExtensionResultsData((RegistrationFinishBody.CredPropsData) null, 1, (DefaultConstructorMarker) null));
                PasskeyApiService passkeyApiService = this.this$0.AEQbTJ;
                this.label = 1;
                obj = passkeyApiService.validateOkxPayRegistration(registrationFinishBody, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            Result.Application application = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(((ResponseData) obj).getData()));
        } catch (Exception e) {
            e.getMessage();
            Result.Application application2 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e)));
        }
    }
}
