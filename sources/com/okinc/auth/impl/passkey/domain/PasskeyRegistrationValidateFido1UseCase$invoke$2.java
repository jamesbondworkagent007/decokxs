package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.PasskeyRegistrationFinishRequestBody;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C33488mxR;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5918aFY;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRegistrationValidateFido1UseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ RegistrationFinishBody $body;
    final /* synthetic */ int $inHouseVersion;
    int label;
    final /* synthetic */ C5918aFY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRegistrationValidateFido1UseCase$invoke$2(int i, RegistrationFinishBody registrationFinishBody, C5918aFY c5918aFY, Continuation<? super PasskeyRegistrationValidateFido1UseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$inHouseVersion = i;
        this.$body = registrationFinishBody;
        this.this$0 = c5918aFY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRegistrationValidateFido1UseCase$invoke$2(this.$inHouseVersion, this.$body, this.this$0, continuation);
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
        return ((PasskeyRegistrationValidateFido1UseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PasskeyRegistrationFinishRequestBody passkeyRegistrationFinishRequestBody = new PasskeyRegistrationFinishRequestBody(true, C56443yFo.AEQbTJ(this.$inHouseVersion), C33488mxR.EZpvd(this.$body), (String) null, 8, (DefaultConstructorMarker) null);
                PasskeyApiService passkeyApiService = this.this$0.EZpvd;
                this.label = 1;
                obj = passkeyApiService.finishRegistration(passkeyRegistrationFinishRequestBody, this);
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
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } else {
                pUU.copydefault("PasskeyRegistrationValidateFido1UseCase", "error: " + responseData.getMsg());
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception(responseData.getMsg())));
            }
        } catch (Exception e) {
            pUU.copydefault("PasskeyRegistrationValidateFido1UseCase", "error: " + e.getMessage());
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
