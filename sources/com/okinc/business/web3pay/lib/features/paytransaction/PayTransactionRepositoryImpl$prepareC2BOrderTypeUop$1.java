package com.okinc.business.web3pay.lib.features.paytransaction;

import com.okinc.business.web3pay.lib.features.uop.model.C2BUopRequest;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C31333lrz;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class PayTransactionRepositoryImpl$prepareC2BOrderTypeUop$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C31333lrz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayTransactionRepositoryImpl$prepareC2BOrderTypeUop$1(C31333lrz c31333lrz, Continuation<? super PayTransactionRepositoryImpl$prepareC2BOrderTypeUop$1> continuation) {
        super(continuation);
        this.this$0 = c31333lrz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objAEQbTJ = this.this$0.AEQbTJ((C2BUopRequest) null, this);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Result.m7376boximpl(objAEQbTJ);
    }
}
