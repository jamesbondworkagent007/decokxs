package com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C26548jeR;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MakeRedeemTransactionUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C26548jeR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakeRedeemTransactionUseCase$invoke$1(C26548jeR c26548jeR, Continuation<? super MakeRedeemTransactionUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = c26548jeR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objAYXKKw = this.this$0.AYXKKw(null, this);
        return objAYXKKw == C56442yFn.copydefault() ? objAYXKKw : Result.m7376boximpl(objAYXKKw);
    }
}
