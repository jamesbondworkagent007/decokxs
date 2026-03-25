package com.okinc.oklive.app.data.repository.remote;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sTI;
import o.sTV;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$3 extends SuspendLambda implements yHO<FlowCollector<? super sTV>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $instId;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ sTI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$3(String str, sTI sti, Continuation<? super TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$3> continuation) {
        super(3, continuation);
        this.$instId = str;
        this.this$0 = sti;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super sTV> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$3 tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$3 = new TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$3(this.$instId, this.this$0, continuation);
        tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$3.L$0 = flowCollector;
        tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$3.L$1 = th;
        return tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Throwable th = (Throwable) this.L$1;
            pUU.AEQbTJ("TradingCardPriceUpdate", "Error in ticker subscription for " + this.$instId, th);
            sTV stv = (sTV) this.this$0.EZpvd.getValue();
            if (stv == null) {
                throw th;
            }
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(stv, this) == objCopydefault) {
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
