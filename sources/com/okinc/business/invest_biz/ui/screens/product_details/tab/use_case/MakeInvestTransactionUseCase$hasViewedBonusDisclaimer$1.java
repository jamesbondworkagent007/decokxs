package com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C26549jeS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MakeInvestTransactionUseCase$hasViewedBonusDisclaimer$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C26549jeS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakeInvestTransactionUseCase$hasViewedBonusDisclaimer$1(C26549jeS c26549jeS, Continuation<? super MakeInvestTransactionUseCase$hasViewedBonusDisclaimer$1> continuation) {
        super(continuation);
        this.this$0 = c26549jeS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(this);
    }
}
