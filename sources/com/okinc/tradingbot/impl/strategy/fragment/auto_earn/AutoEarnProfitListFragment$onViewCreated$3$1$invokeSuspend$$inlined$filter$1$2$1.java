package com.okinc.tradingbot.impl.strategy.fragment.auto_earn;

import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnProfitListFragment$onViewCreated$3;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes11.dex */
public final class AutoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AutoEarnProfitListFragment$onViewCreated$3.AnonymousClass1.Activity.AnonymousClass4 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoEarnProfitListFragment$onViewCreated$3$1$invokeSuspend$$inlined$filter$1$2$1(AutoEarnProfitListFragment$onViewCreated$3.AnonymousClass1.Activity.AnonymousClass4 anonymousClass4, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
