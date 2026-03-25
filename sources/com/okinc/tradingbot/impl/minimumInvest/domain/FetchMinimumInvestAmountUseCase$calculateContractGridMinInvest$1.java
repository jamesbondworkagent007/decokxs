package com.okinc.tradingbot.impl.minimumInvest.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C52020vxx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class FetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C52020vxx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1(C52020vxx c52020vxx, Continuation<? super FetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1> continuation) {
        super(continuation);
        this.this$0 = c52020vxx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((C52020vxx.Activity.Application) null, (Continuation<? super C52020vxx.ActionBar>) this);
    }
}
