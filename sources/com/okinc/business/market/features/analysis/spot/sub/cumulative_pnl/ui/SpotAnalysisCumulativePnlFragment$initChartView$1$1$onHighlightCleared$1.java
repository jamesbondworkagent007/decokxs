package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui;

import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.data.model.CumulativePnlPo;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel.SpotAnalysisCumulativePnlViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25950jMj;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.jLZ;

/* JADX INFO: loaded from: classes23.dex */
public final class SpotAnalysisCumulativePnlFragment$initChartView$1$1$onHighlightCleared$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ jLZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisCumulativePnlFragment$initChartView$1$1$onHighlightCleared$1(jLZ jlz, Continuation<? super SpotAnalysisCumulativePnlFragment$initChartView$1$1$onHighlightCleared$1> continuation) {
        super(2, continuation);
        this.this$0 = jlz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisCumulativePnlFragment$initChartView$1$1$onHighlightCleared$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisCumulativePnlFragment$initChartView$1$1$onHighlightCleared$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jLZ jlz = this.this$0;
            SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk = jlz.DbNXlk();
            this.label = 1;
            obj = jlz.copydefault(spotAnalysisCumulativePnlViewModelDbNXlk, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        jLZ jlz2 = this.this$0;
        C25950jMj c25950jMj = (C25950jMj) obj;
        if (c25950jMj.copydefault() instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL<CumulativePnlPo> interfaceC49371unLCopydefault = c25950jMj.copydefault();
            Intrinsics.copydefault(interfaceC49371unLCopydefault, "");
            jlz2.copydefault(((CumulativePnlPo) ((InterfaceC49371unL.Activity) interfaceC49371unLCopydefault).copydefault()).getPnl());
        }
        return Unit.INSTANCE;
    }
}
