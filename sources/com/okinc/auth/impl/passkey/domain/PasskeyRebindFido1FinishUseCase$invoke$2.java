package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.PasskeyRebindFinishRequestBody;
import com.okinc.auth.impl.passkey.model.PasskeyRebindFinishResponse;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5909aFP;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRebindFido1FinishUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends PasskeyRebindFinishResponse>>, Object> {
    final /* synthetic */ RegistrationFinishBody $body;
    final /* synthetic */ int $inHouseVersion;
    final /* synthetic */ String $workflowToken;
    int label;
    final /* synthetic */ C5909aFP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindFido1FinishUseCase$invoke$2(int i, String str, RegistrationFinishBody registrationFinishBody, C5909aFP c5909aFP, Continuation<? super PasskeyRebindFido1FinishUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$inHouseVersion = i;
        this.$workflowToken = str;
        this.$body = registrationFinishBody;
        this.this$0 = c5909aFP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRebindFido1FinishUseCase$invoke$2(this.$inHouseVersion, this.$workflowToken, this.$body, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends PasskeyRebindFinishResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<PasskeyRebindFinishResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<PasskeyRebindFinishResponse>> continuation) {
        return ((PasskeyRebindFido1FinishUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PasskeyRebindFinishRequestBody passkeyRebindFinishRequestBody = new PasskeyRebindFinishRequestBody(true, C56443yFo.AEQbTJ(this.$inHouseVersion), this.$workflowToken, this.$body, (String) null, 16, (DefaultConstructorMarker) null);
                PasskeyApiService passkeyApiService = this.this$0.EZpvd;
                this.label = 1;
                obj = passkeyApiService.finishRebind(passkeyRebindFinishRequestBody, this);
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
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                objM7377constructorimpl = Result.m7377constructorimpl(data);
            } else {
                pUU.copydefault("PasskeyRebindFido1Finis", "rebind validate error: " + responseData.getMsg());
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception(responseData.getMsg())));
            }
        } catch (Exception e) {
            pUU.copydefault("PasskeyRebindFido1Finis", "rebind validate  error: " + e.getMessage());
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
