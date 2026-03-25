package com.okinc.find_ui.features.opportunity.overall.domain.usecase;

import com.okinc.find_ui.features.opportunity.overall.data.model.MarketOverallStatsPo;
import com.okinc.find_ui.features.opportunity.overall.ui.model.MarketOverallStatsVo;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C34943nlw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class FormatOverallStatsUseCase$onExecute$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C34943nlw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormatOverallStatsUseCase$onExecute$1(C34943nlw c34943nlw, Continuation<? super FormatOverallStatsUseCase$onExecute$1> continuation) {
        super(continuation);
        this.this$0 = c34943nlw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((MarketOverallStatsPo) null, (Continuation<? super MarketOverallStatsVo>) this);
    }
}
