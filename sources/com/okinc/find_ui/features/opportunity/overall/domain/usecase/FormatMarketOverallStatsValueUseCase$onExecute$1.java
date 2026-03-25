package com.okinc.find_ui.features.opportunity.overall.domain.usecase;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C34941nlu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class FormatMarketOverallStatsValueUseCase$onExecute$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C34941nlu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormatMarketOverallStatsValueUseCase$onExecute$1(C34941nlu c34941nlu, Continuation<? super FormatMarketOverallStatsValueUseCase$onExecute$1> continuation) {
        super(continuation);
        this.this$0 = c34941nlu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C34941nlu.copydefault(this.this$0, null, this);
    }
}
