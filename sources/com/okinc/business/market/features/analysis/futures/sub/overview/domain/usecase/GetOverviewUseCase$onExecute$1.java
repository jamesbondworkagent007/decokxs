package com.okinc.business.market.features.analysis.futures.sub.overview.domain.usecase;

import com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C25915jLb;
import o.jKM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class GetOverviewUseCase$onExecute$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ jKM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOverviewUseCase$onExecute$1(jKM jkm, Continuation<? super GetOverviewUseCase$onExecute$1> continuation) {
        super(continuation);
        this.this$0 = jkm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((Pair<? extends AnalysisOverviewPeriod, String>) null, (Continuation<? super C25915jLb>) this);
    }
}
