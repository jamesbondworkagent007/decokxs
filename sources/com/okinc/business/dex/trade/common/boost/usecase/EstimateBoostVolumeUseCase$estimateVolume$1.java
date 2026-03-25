package com.okinc.business.dex.trade.common.boost.usecase;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C19757gOe;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EstimateBoostVolumeUseCase$estimateVolume$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C19757gOe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EstimateBoostVolumeUseCase$estimateVolume$1(C19757gOe c19757gOe, Continuation<? super EstimateBoostVolumeUseCase$estimateVolume$1> continuation) {
        super(continuation);
        this.this$0 = c19757gOe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objAEQbTJ = this.this$0.AEQbTJ(0, null, null, null, null, null, null, null, this);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Result.m7376boximpl(objAEQbTJ);
    }
}
