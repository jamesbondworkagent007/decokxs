package com.okinc.business.trade.features.home.advanced.usecase;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import o.kRD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPricingTokensUseCase$getOrderTypes$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ kRD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPricingTokensUseCase$getOrderTypes$1(kRD krd, Continuation<? super AdvancedPricingTokensUseCase$getOrderTypes$1> continuation) {
        super(continuation);
        this.this$0 = krd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objOLrzqt = this.this$0.OLrzqt(false, this);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Result.m7376boximpl(objOLrzqt);
    }
}
