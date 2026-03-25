package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.PasskeyResetInitRequest;
import com.okinc.auth.impl.passkey.model.ResetMfaInitiateResponse;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5917aFX;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyResetInitUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ResetMfaInitiateResponse>>, Object> {
    final /* synthetic */ List<String> $credentialIdList;
    final /* synthetic */ String $mfaSessionId;
    int label;
    final /* synthetic */ C5917aFX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyResetInitUseCase$invoke$2(C5917aFX c5917aFX, String str, List<String> list, Continuation<? super PasskeyResetInitUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5917aFX;
        this.$mfaSessionId = str;
        this.$credentialIdList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyResetInitUseCase$invoke$2(this.this$0, this.$mfaSessionId, this.$credentialIdList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ResetMfaInitiateResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<ResetMfaInitiateResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<ResetMfaInitiateResponse>> continuation) {
        return ((PasskeyResetInitUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PasskeyApiService passkeyApiService = this.this$0.KWHzl;
                PasskeyResetInitRequest passkeyResetInitRequest = new PasskeyResetInitRequest(this.$mfaSessionId, this.$credentialIdList);
                this.label = 1;
                obj = passkeyApiService.resetInit(passkeyResetInitRequest, this);
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
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception(responseData.getMsg())));
            }
        } catch (Exception e) {
            pUU.copydefault("PasskeyResetInitUseCase: " + e + " " + e.getMessage());
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
