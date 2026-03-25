package com.okinc.business.invest_biz.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C23946iPe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class InvestIndependentCheckFlowService$executeInvestFlowInternal$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C23946iPe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestIndependentCheckFlowService$executeInvestFlowInternal$1(C23946iPe c23946iPe, Continuation<? super InvestIndependentCheckFlowService$executeInvestFlowInternal$1> continuation) {
        super(continuation);
        this.this$0 = c23946iPe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(0L, null, false, false, this);
    }
}
