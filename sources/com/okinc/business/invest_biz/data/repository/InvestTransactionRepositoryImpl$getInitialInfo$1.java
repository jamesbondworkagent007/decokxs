package com.okinc.business.invest_biz.data.repository;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import o.iDD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestTransactionRepositoryImpl$getInitialInfo$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ iDD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestTransactionRepositoryImpl$getInitialInfo$1(iDD idd, Continuation<? super InvestTransactionRepositoryImpl$getInitialInfo$1> continuation) {
        super(continuation);
        this.this$0 = idd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objCopydefault = this.this$0.copydefault(null, this);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Result.m7376boximpl(objCopydefault);
    }
}
