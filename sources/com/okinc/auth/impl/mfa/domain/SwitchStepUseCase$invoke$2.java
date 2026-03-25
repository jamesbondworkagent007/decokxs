package com.okinc.auth.impl.mfa.domain;

import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaResult;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.auth.impl.mfa.model.SwitchStepRequest;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5774aCn;
import o.C5776aCp;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class SwitchStepUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MfaResult>, Object> {
    final /* synthetic */ OTP $authType;
    final /* synthetic */ MfaScenario $mfaScenario;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    int label;
    final /* synthetic */ C5776aCp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchStepUseCase$invoke$2(MfaScenario mfaScenario, C5776aCp c5776aCp, SubdomainStrategy subdomainStrategy, String str, OTP otp, Continuation<? super SwitchStepUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$mfaScenario = mfaScenario;
        this.this$0 = c5776aCp;
        this.$subdomainStrategy = subdomainStrategy;
        this.$sessionId = str;
        this.$authType = otp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwitchStepUseCase$invoke$2(this.$mfaScenario, this.this$0, this.$subdomainStrategy, this.$sessionId, this.$authType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MfaResult> continuation) {
        return ((SwitchStepUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String key;
        String key2;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (this.$mfaScenario == MfaScenario.IsPartialAuth) {
                    MfaApiService mfaApiService = this.this$0.copydefault;
                    SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
                    String str = this.$sessionId;
                    if (yDY.gEmmrt(OTP.SMS, OTP.VOICE).contains(this.$authType)) {
                        key2 = OTP.PHONE.getKey();
                    } else {
                        key2 = this.$authType.getKey();
                    }
                    SwitchStepRequest switchStepRequest = new SwitchStepRequest(str, key2);
                    this.label = 1;
                    obj = mfaApiService.AEQbTJ(subdomainStrategy, switchStepRequest, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                } else {
                    MfaApiService mfaApiService2 = this.this$0.copydefault;
                    SubdomainStrategy subdomainStrategy2 = this.$subdomainStrategy;
                    String str2 = this.$sessionId;
                    if (yDY.gEmmrt(OTP.SMS, OTP.VOICE).contains(this.$authType)) {
                        key = OTP.PHONE.getKey();
                    } else {
                        key = this.$authType.getKey();
                    }
                    SwitchStepRequest switchStepRequest2 = new SwitchStepRequest(str2, key);
                    this.label = 2;
                    obj = mfaApiService2.KWHzl(subdomainStrategy2, switchStepRequest2, this);
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
            pUU.copydefault("SwitchStepUseCase", message);
            return new MfaResult.Failure(C5774aCn.EZpvd(e));
        }
    }
}
