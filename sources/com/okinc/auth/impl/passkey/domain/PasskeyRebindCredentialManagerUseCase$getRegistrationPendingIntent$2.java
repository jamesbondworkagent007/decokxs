package com.okinc.auth.impl.passkey.domain;

import androidx.credentials.CreatePublicKeyCredentialRequest;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.PasskeyRebindStartRequestBody;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC5991aGs;
import o.C33488mxR;
import o.C56391yDq;
import o.C56442yFn;
import o.C5906aFM;
import o.C6617aSi;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRebindCredentialManagerUseCase$getRegistrationPendingIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC5991aGs>, Object> {
    final /* synthetic */ PasskeyPromotionAuthenticator $authenticator;
    final /* synthetic */ String $workflowToken;
    int label;
    final /* synthetic */ C5906aFM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindCredentialManagerUseCase$getRegistrationPendingIntent$2(String str, C5906aFM c5906aFM, PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, Continuation<? super PasskeyRebindCredentialManagerUseCase$getRegistrationPendingIntent$2> continuation) {
        super(2, continuation);
        this.$workflowToken = str;
        this.this$0 = c5906aFM;
        this.$authenticator = passkeyPromotionAuthenticator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRebindCredentialManagerUseCase$getRegistrationPendingIntent$2(this.$workflowToken, this.this$0, this.$authenticator, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC5991aGs> continuation) {
        return ((PasskeyRebindCredentialManagerUseCase$getRegistrationPendingIntent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PasskeyRebindStartRequestBody passkeyRebindStartRequestBody = new PasskeyRebindStartRequestBody(this.$workflowToken);
                PasskeyApiService passkeyApiService = this.this$0.copydefault;
                this.label = 1;
                obj = passkeyApiService.startRebind(passkeyRebindStartRequestBody, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            PasskeyPromotionAuthenticator passkeyPromotionAuthenticator = this.$authenticator;
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0) {
                RegistrationStartResponse registrationStartResponse = (RegistrationStartResponse) responseData.getData();
                if (registrationStartResponse == null) {
                    return new AbstractC5991aGs.Application("_null data");
                }
                RegistrationStartResponse.PublicKey publicKey = registrationStartResponse.getPublicKey();
                String strEZpvd = publicKey != null ? C33488mxR.EZpvd(publicKey) : null;
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                return new AbstractC5991aGs.TaskDescription(new CreatePublicKeyCredentialRequest(C6617aSi.KWHzl(strEZpvd, passkeyPromotionAuthenticator), null, false, null, false, 30, null));
            }
            return new AbstractC5991aGs.Application(responseData.getMsg());
        } catch (Exception e) {
            pUU.copydefault("PasskeyRegistrationUseCase", String.valueOf(e.getMessage()));
            boolean z = e instanceof OKServerException;
            if (z && ((OKServerException) e).getCode() == 42007) {
                return AbstractC5991aGs.FragmentManager.EZpvd;
            }
            if (z && ((OKServerException) e).getCode() == 42009) {
                String message = e.getMessage();
                return new AbstractC5991aGs.ActionBar(message != null ? message : "");
            }
            return new AbstractC5991aGs.Application(e.getMessage());
        }
    }
}
