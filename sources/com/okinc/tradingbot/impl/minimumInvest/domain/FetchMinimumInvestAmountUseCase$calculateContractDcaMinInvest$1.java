package com.okinc.tradingbot.impl.minimumInvest.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C52020vxx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class FetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C52020vxx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1(C52020vxx c52020vxx, Continuation<? super FetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1> continuation) {
        super(continuation);
        this.this$0 = c52020vxx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((C52020vxx.Activity.ActionBar) null, (Continuation<? super C52020vxx.ActionBar>) this);
    }
}
