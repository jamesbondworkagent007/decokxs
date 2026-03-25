package com.okinc.find_ui.ranking.stock.viewmodel;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$2 extends SuspendLambda implements yHO<FlowCollector<? super Map<String, ? extends TickersData>>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$2(Continuation<? super MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$2> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Map<String, ? extends TickersData>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Map<String, TickersData>>) flowCollector, th, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Map<String, TickersData>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$2 marketHomeStockContainerViewModel$subscribeCupTickersWs$4$2 = new MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$2(continuation);
        marketHomeStockContainerViewModel$subscribeCupTickersWs$4$2.L$0 = th;
        return marketHomeStockContainerViewModel$subscribeCupTickersWs$4$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.AEQbTJ("MarketHomeStockContainerViewModel", "subscribeCupTickersWs flow error", (Throwable) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
