package com.reown.sign.engine.use_case.calls;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SessionAuthenticateUseCase$publishSessionProposeDeferred$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SessionAuthenticateUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionAuthenticateUseCase$publishSessionProposeDeferred$1(SessionAuthenticateUseCase sessionAuthenticateUseCase, Continuation<? super SessionAuthenticateUseCase$publishSessionProposeDeferred$1> continuation) {
        super(continuation);
        this.this$0 = sessionAuthenticateUseCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7354publishSessionProposeDeferredBWLJW6A = this.this$0.m7354publishSessionProposeDeferredBWLJW6A(null, null, null, this);
        return objM7354publishSessionProposeDeferredBWLJW6A == C56442yFn.copydefault() ? objM7354publishSessionProposeDeferredBWLJW6A : Result.m7376boximpl(objM7354publishSessionProposeDeferredBWLJW6A);
    }
}
