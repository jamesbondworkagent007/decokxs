package com.okinc.business.defi.wallet.home.datasource;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C18039faq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class KLinePrefsDataSource$selectedChartTypeFlow$2 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C18039faq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLinePrefsDataSource$selectedChartTypeFlow$2(C18039faq c18039faq, Continuation<? super KLinePrefsDataSource$selectedChartTypeFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = c18039faq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KLinePrefsDataSource$selectedChartTypeFlow$2 kLinePrefsDataSource$selectedChartTypeFlow$2 = new KLinePrefsDataSource$selectedChartTypeFlow$2(this.this$0, continuation);
        kLinePrefsDataSource$selectedChartTypeFlow$2.L$0 = obj;
        return kLinePrefsDataSource$selectedChartTypeFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
        return ((KLinePrefsDataSource$selectedChartTypeFlow$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Integer numAEQbTJ = C56443yFo.AEQbTJ(this.this$0.OLrzqt());
            this.label = 1;
            if (flowCollector.emit(numAEQbTJ, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
