package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui;

import com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod;
import com.okinc.business.market.features.analysis.spot.root.ui.viewmodel.SpotAnalysisViewModel;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel.SpotAnalysisCumulativePnlViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jLZ;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisCumulativePnlFragment$valuationPeriodChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnalysisOverviewPeriod $newValue;
    Object L$0;
    int label;
    final /* synthetic */ jLZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisCumulativePnlFragment$valuationPeriodChange$1(jLZ jlz, AnalysisOverviewPeriod analysisOverviewPeriod, Continuation<? super SpotAnalysisCumulativePnlFragment$valuationPeriodChange$1> continuation) {
        super(2, continuation);
        this.this$0 = jlz;
        this.$newValue = analysisOverviewPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisCumulativePnlFragment$valuationPeriodChange$1(this.this$0, this.$newValue, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisCumulativePnlFragment$valuationPeriodChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk = this.this$0.DbNXlk();
            AnalysisOverviewPeriod analysisOverviewPeriod = this.$newValue;
            this.label = 1;
            if (spotAnalysisCumulativePnlViewModelDbNXlk.KWHzl(analysisOverviewPeriod, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                spotAnalysisCumulativePnlViewModel = (SpotAnalysisCumulativePnlViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                SpotAnalysisCumulativePnlViewModel.requestCumulativePnlWithDebounce$default(spotAnalysisCumulativePnlViewModel, (String) obj, this.$newValue.getPayload(), 0L, 4, null);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk2 = this.this$0.DbNXlk();
        SpotAnalysisViewModel spotAnalysisViewModelValues = this.this$0.values();
        this.L$0 = spotAnalysisCumulativePnlViewModelDbNXlk2;
        this.label = 2;
        Object objAEQbTJ = spotAnalysisViewModelValues.AEQbTJ(this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        spotAnalysisCumulativePnlViewModel = spotAnalysisCumulativePnlViewModelDbNXlk2;
        obj = objAEQbTJ;
        SpotAnalysisCumulativePnlViewModel.requestCumulativePnlWithDebounce$default(spotAnalysisCumulativePnlViewModel, (String) obj, this.$newValue.getPayload(), 0L, 4, null);
        return Unit.INSTANCE;
    }
}
