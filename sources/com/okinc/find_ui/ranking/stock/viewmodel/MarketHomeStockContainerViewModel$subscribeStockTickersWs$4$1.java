package com.okinc.find_ui.ranking.stock.viewmodel;

import com.okinc.market.quotation.data.model.stock.StockListPo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$1 extends SuspendLambda implements yHO<FlowCollector<? super StockListPo>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$1(Continuation<? super MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super StockListPo> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$1 marketHomeStockContainerViewModel$subscribeStockTickersWs$4$1 = new MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$1(continuation);
        marketHomeStockContainerViewModel$subscribeStockTickersWs$4$1.L$0 = th;
        return marketHomeStockContainerViewModel$subscribeStockTickersWs$4$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("MarketHomeStockContainerViewModel", "subscribeStockTickersWs completed", (Throwable) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
