package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.RegistrationInitiateResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5898aFE;

/* JADX INFO: loaded from: classes3.dex */
public final class OkxPayPasskeyRegistrationInitiateUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C5898aFE.Application>, Object> {
    int label;
    final /* synthetic */ C5898aFE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkxPayPasskeyRegistrationInitiateUseCase$invoke$2(C5898aFE c5898aFE, Continuation<? super OkxPayPasskeyRegistrationInitiateUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5898aFE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkxPayPasskeyRegistrationInitiateUseCase$invoke$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C5898aFE.Application> continuation) {
        return ((OkxPayPasskeyRegistrationInitiateUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PasskeyApiService passkeyApiService = this.this$0.EZpvd;
                this.label = 1;
                obj = passkeyApiService.initiateOkxPayRegistration(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                RegistrationInitiateResponse registrationInitiateResponse = (RegistrationInitiateResponse) responseData.getData();
                String nextStep = registrationInitiateResponse != null ? registrationInitiateResponse.getNextStep() : null;
                return Intrinsics.EZpvd((Object) nextStep, (Object) "BIND_PASSKEY") ? C5898aFE.Application.StateListAnimator.OLrzqt : Intrinsics.EZpvd((Object) nextStep, (Object) "GET_UNLOCK_TOKEN") ? C5898aFE.Application.C0817Application.EZpvd : new C5898aFE.Application.TaskDescription(new Exception(responseData.getMsg()));
            }
            return new C5898aFE.Application.TaskDescription(new Exception(responseData.getMsg()));
        } catch (Exception e) {
            e.getMessage();
            return new C5898aFE.Application.TaskDescription(e);
        }
    }
}
