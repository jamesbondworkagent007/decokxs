package com.okinc.auth.impl.mfa.domain;

import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.model.FinishAuthPasskeyRequest;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaResult;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5764aCd;
import o.C5774aCn;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class MfaFinishPasskeyAuthenticateUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MfaResult>, Object> {
    final /* synthetic */ MfaScenario $mfaScenario;
    final /* synthetic */ UnlockTokenWithFidoRequestBody $request;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    int label;
    final /* synthetic */ C5764aCd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaFinishPasskeyAuthenticateUseCase$invoke$2(MfaScenario mfaScenario, C5764aCd c5764aCd, SubdomainStrategy subdomainStrategy, String str, UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody, Continuation<? super MfaFinishPasskeyAuthenticateUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$mfaScenario = mfaScenario;
        this.this$0 = c5764aCd;
        this.$subdomainStrategy = subdomainStrategy;
        this.$sessionId = str;
        this.$request = unlockTokenWithFidoRequestBody;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MfaFinishPasskeyAuthenticateUseCase$invoke$2(this.$mfaScenario, this.this$0, this.$subdomainStrategy, this.$sessionId, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MfaResult> continuation) {
        return ((MfaFinishPasskeyAuthenticateUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (this.$mfaScenario == MfaScenario.IsPartialAuth) {
                    MfaApiService mfaApiService = this.this$0.AEQbTJ;
                    SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
                    FinishAuthPasskeyRequest finishAuthPasskeyRequest = new FinishAuthPasskeyRequest(this.$sessionId, this.$request);
                    this.label = 1;
                    obj = mfaApiService.OLrzqt(subdomainStrategy, finishAuthPasskeyRequest, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                } else {
                    MfaApiService mfaApiService2 = this.this$0.AEQbTJ;
                    SubdomainStrategy subdomainStrategy2 = this.$subdomainStrategy;
                    FinishAuthPasskeyRequest finishAuthPasskeyRequest2 = new FinishAuthPasskeyRequest(this.$sessionId, this.$request);
                    this.label = 2;
                    obj = mfaApiService2.EZpvd(subdomainStrategy2, finishAuthPasskeyRequest2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
            }
            return C5774aCn.EZpvd((ResponseData<MfaResponse>) responseData);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pUU.copydefault("VerifyOtpUseCase", message);
            return new MfaResult.Failure(C5774aCn.EZpvd(e));
        }
    }
}
