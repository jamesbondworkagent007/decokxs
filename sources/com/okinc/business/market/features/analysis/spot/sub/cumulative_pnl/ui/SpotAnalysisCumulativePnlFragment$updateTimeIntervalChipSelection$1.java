package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui;

import com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod;
import com.okinc.market.widget.FlowedChipsView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C42793rdC;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.jLZ;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisCumulativePnlFragment$updateTimeIntervalChipSelection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnalysisOverviewPeriod $newPeriod;
    int label;
    final /* synthetic */ jLZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisCumulativePnlFragment$updateTimeIntervalChipSelection$1(jLZ jlz, AnalysisOverviewPeriod analysisOverviewPeriod, Continuation<? super SpotAnalysisCumulativePnlFragment$updateTimeIntervalChipSelection$1> continuation) {
        super(2, continuation);
        this.this$0 = jlz;
        this.$newPeriod = analysisOverviewPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisCumulativePnlFragment$updateTimeIntervalChipSelection$1(this.this$0, this.$newPeriod, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisCumulativePnlFragment$updateTimeIntervalChipSelection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowedChipsView flowedChipsView;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            int i = 0;
            Object[] array = AnalysisOverviewPeriod.getEntries().toArray(new AnalysisOverviewPeriod[0]);
            AnalysisOverviewPeriod analysisOverviewPeriod = this.$newPeriod;
            int length = array.length;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (((AnalysisOverviewPeriod) array[i]) == analysisOverviewPeriod) {
                    break;
                }
                i++;
            }
            Integer numAEQbTJ = C56443yFo.AEQbTJ(i);
            if (numAEQbTJ.intValue() < 0) {
                numAEQbTJ = null;
            }
            if (numAEQbTJ != null) {
                int iIntValue = numAEQbTJ.intValue();
                C42793rdC c42793rdC = this.this$0.djBIcL;
                if (c42793rdC != null && (flowedChipsView = c42793rdC.gEmmrt) != null) {
                    flowedChipsView.setSelectedIndex(iIntValue);
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
