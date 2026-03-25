package com.okinc.business.dex.trade.copytrading.strategyinfo.domain.usecase;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C20010gXo;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class GetCopyTradeOpenOrderUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C20010gXo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCopyTradeOpenOrderUseCase$invoke$1(C20010gXo c20010gXo, Continuation<? super GetCopyTradeOpenOrderUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = c20010gXo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objKWHzl = this.this$0.KWHzl(null, false, null, 0, this);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Result.m7376boximpl(objKWHzl);
    }
}
