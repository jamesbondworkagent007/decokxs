package com.okinc.business.market.features.smart_money.signal.domain;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C29507kuu;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class GetSignalOverviewKLineUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C29507kuu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalOverviewKLineUseCase$invoke$1(C29507kuu c29507kuu, Continuation<? super GetSignalOverviewKLineUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = c29507kuu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objAEQbTJ = this.this$0.AEQbTJ(null, null, null, 0L, this);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Result.m7376boximpl(objAEQbTJ);
    }
}
