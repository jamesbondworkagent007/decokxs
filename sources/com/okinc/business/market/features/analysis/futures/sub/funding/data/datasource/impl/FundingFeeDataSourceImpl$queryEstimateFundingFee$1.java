package com.okinc.business.market.features.analysis.futures.sub.funding.data.datasource.impl;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C25877jJr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class FundingFeeDataSourceImpl$queryEstimateFundingFee$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C25877jJr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundingFeeDataSourceImpl$queryEstimateFundingFee$1(C25877jJr c25877jJr, Continuation<? super FundingFeeDataSourceImpl$queryEstimateFundingFee$1> continuation) {
        super(continuation);
        this.this$0 = c25877jJr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(null, null, this);
    }
}
