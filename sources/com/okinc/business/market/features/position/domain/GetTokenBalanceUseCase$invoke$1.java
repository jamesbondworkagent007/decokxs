package com.okinc.business.market.features.position.domain;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C29129knn;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class GetTokenBalanceUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C29129knn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenBalanceUseCase$invoke$1(C29129knn c29129knn, Continuation<? super GetTokenBalanceUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = c29129knn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objEZpvd = this.this$0.EZpvd(null, null, this);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Result.m7376boximpl(objEZpvd);
    }
}
