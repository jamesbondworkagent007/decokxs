package com.okinc.auth.impl.reset2fa.domain.mfa;

import com.okinc.auth.impl.reset2fa.data.datasource.SecurityMfaRemoteDataSource;
import com.okinc.auth.impl.reset2fa.data.model.PartialAuthMfaCheckResultRequest;
import com.okinc.auth.impl.reset2fa.data.model.PartialAuthMfaCheckResultResponse;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C6620aSl;

/* JADX INFO: loaded from: classes3.dex */
public final class PartialAuthMfaCheckResultUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends PartialAuthMfaCheckResultResponse>>, Object> {
    final /* synthetic */ PartialAuthMfaCheckResultRequest $request;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    int label;
    final /* synthetic */ C6620aSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartialAuthMfaCheckResultUseCase$invoke$2(C6620aSl c6620aSl, SubdomainStrategy subdomainStrategy, PartialAuthMfaCheckResultRequest partialAuthMfaCheckResultRequest, Continuation<? super PartialAuthMfaCheckResultUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c6620aSl;
        this.$subdomainStrategy = subdomainStrategy;
        this.$request = partialAuthMfaCheckResultRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PartialAuthMfaCheckResultUseCase$invoke$2(this.this$0, this.$subdomainStrategy, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends PartialAuthMfaCheckResultResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<PartialAuthMfaCheckResultResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<PartialAuthMfaCheckResultResponse>> continuation) {
        return ((PartialAuthMfaCheckResultUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SecurityMfaRemoteDataSource securityMfaRemoteDataSource = this.this$0.EZpvd;
                SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
                PartialAuthMfaCheckResultRequest partialAuthMfaCheckResultRequest = this.$request;
                this.label = 1;
                obj = securityMfaRemoteDataSource.partialAuthCheckResult(subdomainStrategy, partialAuthMfaCheckResultRequest, this);
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
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
