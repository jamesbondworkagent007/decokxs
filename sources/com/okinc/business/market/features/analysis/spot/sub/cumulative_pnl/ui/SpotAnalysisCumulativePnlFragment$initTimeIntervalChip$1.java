package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui;

import com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.SpotAnalysisCumulativePnlFragment$initTimeIntervalChip$1;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel.SpotAnalysisCumulativePnlViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.market.widget.FlowedChipsView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25950jMj;
import o.C32866mlf;
import o.C40839qfX;
import o.C42793rdC;
import o.C56391yDq;
import o.C56442yFn;
import o.jLZ;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisCumulativePnlFragment$initTimeIntervalChip$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ jLZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisCumulativePnlFragment$initTimeIntervalChip$1(jLZ jlz, Continuation<? super SpotAnalysisCumulativePnlFragment$initTimeIntervalChip$1> continuation) {
        super(2, continuation);
        this.this$0 = jlz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisCumulativePnlFragment$initTimeIntervalChip$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisCumulativePnlFragment$initTimeIntervalChip$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0076 -> B:17:0x0079). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowedChipsView flowedChipsView;
        FlowedChipsView flowedChipsView2;
        C40839qfX c40839qfX;
        Object[] objArr;
        int length;
        int i;
        jLZ jlz;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C42793rdC c42793rdC = this.this$0.djBIcL;
            if (c42793rdC != null && (flowedChipsView = c42793rdC.gEmmrt) != null) {
                C40839qfX c40839qfX2 = new C40839qfX();
                Object[] array = AnalysisOverviewPeriod.getEntries().toArray(new AnalysisOverviewPeriod[0]);
                jLZ jlz2 = this.this$0;
                flowedChipsView2 = flowedChipsView;
                c40839qfX = c40839qfX2;
                objArr = array;
                length = array.length;
                i = 0;
                jlz = jlz2;
                if (i >= length) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        length = this.I$1;
        i = this.I$0;
        AnalysisOverviewPeriod analysisOverviewPeriod = (AnalysisOverviewPeriod) this.L$4;
        jlz = (jLZ) this.L$3;
        objArr = (Object[]) this.L$2;
        c40839qfX = (C40839qfX) this.L$1;
        flowedChipsView2 = (FlowedChipsView) this.L$0;
        C56391yDq.AEQbTJ(obj);
        if (((C25950jMj) obj).EZpvd() != analysisOverviewPeriod) {
            i++;
            if (i >= length) {
                analysisOverviewPeriod = (AnalysisOverviewPeriod) objArr[i];
                SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk = jlz.DbNXlk();
                this.L$0 = flowedChipsView2;
                this.L$1 = c40839qfX;
                this.L$2 = objArr;
                this.L$3 = jlz;
                this.L$4 = analysisOverviewPeriod;
                this.I$0 = i;
                this.I$1 = length;
                this.label = 1;
                obj = jlz.copydefault(spotAnalysisCumulativePnlViewModelDbNXlk, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                if (((C25950jMj) obj).EZpvd() != analysisOverviewPeriod) {
                }
            } else {
                i = -1;
            }
        }
        AnalysisOverviewPeriod[] analysisOverviewPeriodArr = (AnalysisOverviewPeriod[]) AnalysisOverviewPeriod.getEntries().toArray(new AnalysisOverviewPeriod[0]);
        final jLZ jlz3 = this.this$0;
        flowedChipsView2.setData(c40839qfX, analysisOverviewPeriodArr, i, new Function2() { // from class: o.jMd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return SpotAnalysisCumulativePnlFragment$initTimeIntervalChip$1.invokeSuspend$lambda$2(jlz3, ((java.lang.Integer) obj2).intValue(), (AnalysisOverviewPeriod) obj3);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(jLZ jlz, int i, final AnalysisOverviewPeriod analysisOverviewPeriod) {
        jlz.AEQbTJ(analysisOverviewPeriod);
        C32866mlf.onEvent$default("SpotAnalysis_TotalPnL_TimeSelector_Click", (TrackChannel[]) null, new Function1() { // from class: o.jMf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SpotAnalysisCumulativePnlFragment$initTimeIntervalChip$1.invokeSuspend$lambda$2$lambda$1(analysisOverviewPeriod, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(AnalysisOverviewPeriod analysisOverviewPeriod, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "time_range", analysisOverviewPeriod.getEventTrackingValue(), false, 4, null);
        return Unit.INSTANCE;
    }
}
