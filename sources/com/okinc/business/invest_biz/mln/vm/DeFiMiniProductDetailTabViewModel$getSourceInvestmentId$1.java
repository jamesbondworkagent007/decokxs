package com.okinc.business.invest_biz.mln.vm;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiMiniProductDetailTabViewModel$getSourceInvestmentId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeFiMiniProductDetailTabViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiMiniProductDetailTabViewModel$getSourceInvestmentId$1(DeFiMiniProductDetailTabViewModel deFiMiniProductDetailTabViewModel, Continuation<? super DeFiMiniProductDetailTabViewModel$getSourceInvestmentId$1> continuation) {
        super(continuation);
        this.this$0 = deFiMiniProductDetailTabViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(0L, null, this);
    }
}
