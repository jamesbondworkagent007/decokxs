package com.okinc.auth.impl.mfa.domain;

import com.okinc.auth.api.service.MfaCheckResultRequest;
import com.okinc.auth.api.service.MfaCheckResultResponse;
import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5763aCc;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckMfaResultUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends MfaCheckResultResponse>>, Object> {
    final /* synthetic */ String $sessionId;
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ C5763aCc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckMfaResultUseCase$invoke$2(C5763aCc c5763aCc, String str, String str2, Continuation<? super CheckMfaResultUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5763aCc;
        this.$sessionId = str;
        this.$token = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckMfaResultUseCase$invoke$2(this.this$0, this.$sessionId, this.$token, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends MfaCheckResultResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<MfaCheckResultResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<MfaCheckResultResponse>> continuation) {
        return ((CheckMfaResultUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MfaApiService mfaApiService = this.this$0.EZpvd;
                MfaCheckResultRequest mfaCheckResultRequest = new MfaCheckResultRequest(this.$sessionId, this.$token);
                this.label = 1;
                obj = mfaApiService.KWHzl(mfaCheckResultRequest, this);
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
                objM7377constructorimpl = Result.m7377constructorimpl(responseData.getData());
            } else {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception(responseData.getMsg())));
            }
        } catch (Exception e) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
