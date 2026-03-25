package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui;

import com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C42793rdC;
import o.C56391yDq;
import o.C56442yFn;
import o.jLZ;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisCumulativePnlFragment$viewModelCollect$6 extends SuspendLambda implements Function2<AnalysisOverviewPeriod, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jLZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisCumulativePnlFragment$viewModelCollect$6(jLZ jlz, Continuation<? super SpotAnalysisCumulativePnlFragment$viewModelCollect$6> continuation) {
        super(2, continuation);
        this.this$0 = jlz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotAnalysisCumulativePnlFragment$viewModelCollect$6 spotAnalysisCumulativePnlFragment$viewModelCollect$6 = new SpotAnalysisCumulativePnlFragment$viewModelCollect$6(this.this$0, continuation);
        spotAnalysisCumulativePnlFragment$viewModelCollect$6.L$0 = obj;
        return spotAnalysisCumulativePnlFragment$viewModelCollect$6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AnalysisOverviewPeriod analysisOverviewPeriod, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisCumulativePnlFragment$viewModelCollect$6) create(analysisOverviewPeriod, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AnalysisOverviewPeriod analysisOverviewPeriod = (AnalysisOverviewPeriod) this.L$0;
            C42793rdC c42793rdC = this.this$0.djBIcL;
            if (c42793rdC != null) {
                c42793rdC.AhwBna.setTextValue(analysisOverviewPeriod.getPnlTitle());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
