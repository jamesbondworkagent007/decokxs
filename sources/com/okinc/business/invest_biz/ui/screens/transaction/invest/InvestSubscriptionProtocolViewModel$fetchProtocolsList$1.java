package com.okinc.business.invest_biz.ui.screens.transaction.invest;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestSubscriptionProtocolViewModel$fetchProtocolsList$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InvestSubscriptionProtocolViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestSubscriptionProtocolViewModel$fetchProtocolsList$1(InvestSubscriptionProtocolViewModel investSubscriptionProtocolViewModel, Continuation<? super InvestSubscriptionProtocolViewModel$fetchProtocolsList$1> continuation) {
        super(continuation);
        this.this$0 = investSubscriptionProtocolViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ(0L, this);
    }
}
