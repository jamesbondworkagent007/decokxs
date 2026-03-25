package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.kTB;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedQuotePollingDelegate$startLimitQuote$1$execute$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ kTB.Activity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedQuotePollingDelegate$startLimitQuote$1$execute$1(kTB.Activity activity, Continuation<? super AdvancedQuotePollingDelegate$startLimitQuote$1$execute$1> continuation) {
        super(continuation);
        this.this$0 = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl(this);
    }
}
