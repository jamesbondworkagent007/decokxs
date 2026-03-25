package com.okinc.business.market.features.analysis.futures.sub.ranking.ui;

import com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod;
import com.okinc.market.common.bean.PayloadPeriod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C25925jLl;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisRankingFragment$setListener$6 extends SuspendLambda implements Function2<PayloadPeriod, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C25925jLl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisRankingFragment$setListener$6(C25925jLl c25925jLl, Continuation<? super FuturesAnalysisRankingFragment$setListener$6> continuation) {
        super(2, continuation);
        this.this$0 = c25925jLl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAnalysisRankingFragment$setListener$6 futuresAnalysisRankingFragment$setListener$6 = new FuturesAnalysisRankingFragment$setListener$6(this.this$0, continuation);
        futuresAnalysisRankingFragment$setListener$6.L$0 = obj;
        return futuresAnalysisRankingFragment$setListener$6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PayloadPeriod payloadPeriod, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisRankingFragment$setListener$6) create(payloadPeriod, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PayloadPeriod payloadPeriod = (PayloadPeriod) this.L$0;
            if (payloadPeriod != null) {
                C25925jLl c25925jLl = this.this$0;
                PayloadPeriod payload = c25925jLl.AYXKKw().copydefault().getPayload();
                AnalysisOverviewPeriod analysisOverviewPeriodCopydefault = AnalysisOverviewPeriod.Companion.copydefault(payloadPeriod);
                if (analysisOverviewPeriodCopydefault != null && payload != analysisOverviewPeriodCopydefault.getPayload()) {
                    c25925jLl.KWHzl(analysisOverviewPeriodCopydefault.getPayload());
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
