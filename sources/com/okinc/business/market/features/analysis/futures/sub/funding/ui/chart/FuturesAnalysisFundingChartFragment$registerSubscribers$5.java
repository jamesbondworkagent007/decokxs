package com.okinc.business.market.features.analysis.futures.sub.funding.ui.chart;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.jJX;
import o.jLI;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisFundingChartFragment$registerSubscribers$5 extends SuspendLambda implements Function2<jLI, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jJX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisFundingChartFragment$registerSubscribers$5(jJX jjx, Continuation<? super FuturesAnalysisFundingChartFragment$registerSubscribers$5> continuation) {
        super(2, continuation);
        this.this$0 = jjx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAnalysisFundingChartFragment$registerSubscribers$5 futuresAnalysisFundingChartFragment$registerSubscribers$5 = new FuturesAnalysisFundingChartFragment$registerSubscribers$5(this.this$0, continuation);
        futuresAnalysisFundingChartFragment$registerSubscribers$5.L$0 = obj;
        return futuresAnalysisFundingChartFragment$registerSubscribers$5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jLI jli, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisFundingChartFragment$registerSubscribers$5) create(jli, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String strKWHzl = ((jLI) this.L$0).KWHzl();
            if (strKWHzl != null && strKWHzl.length() > 0) {
                this.this$0.valueOf().AEQbTJ(strKWHzl);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
