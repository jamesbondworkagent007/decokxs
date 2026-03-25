package com.okinc.business.invest_biz.mln.vm;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiMiniDetailAssetViewModel$getSourceInvestmentId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeFiMiniDetailAssetViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiMiniDetailAssetViewModel$getSourceInvestmentId$1(DeFiMiniDetailAssetViewModel deFiMiniDetailAssetViewModel, Continuation<? super DeFiMiniDetailAssetViewModel$getSourceInvestmentId$1> continuation) {
        super(continuation);
        this.this$0 = deFiMiniDetailAssetViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(0L, null, this);
    }
}
