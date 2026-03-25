package com.okinc.business.market.features.holders.domain.usecase;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import o.jYE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class GetHistoryStatisticsUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ jYE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHistoryStatisticsUseCase$invoke$1(jYE jye, Continuation<? super GetHistoryStatisticsUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = jye;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objAEQbTJ = this.this$0.AEQbTJ(null, null, null, this);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Result.m7376boximpl(objAEQbTJ);
    }
}
