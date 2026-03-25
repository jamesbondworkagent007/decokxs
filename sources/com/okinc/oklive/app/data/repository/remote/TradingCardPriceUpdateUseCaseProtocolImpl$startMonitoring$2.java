package com.okinc.oklive.app.data.repository.remote;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sTI;
import o.sTV;

/* JADX INFO: loaded from: classes10.dex */
public final class TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$2 extends SuspendLambda implements Function2<sTV, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $instId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sTI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$2(String str, sTI sti, Continuation<? super TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$2> continuation) {
        super(2, continuation);
        this.$instId = str;
        this.this$0 = sti;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$2 tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$2 = new TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$2(this.$instId, this.this$0, continuation);
        tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$2.L$0 = obj;
        return tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(sTV stv, Continuation<? super Unit> continuation) {
        return ((TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$2) create(stv, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            sTV stv = (sTV) this.L$0;
            pUU.EZpvd("TradingCardPriceUpdate", "Ticker update for " + this.$instId + ": price=" + stv.AEQbTJ() + ", change24h=" + stv.KWHzl());
            this.this$0.EZpvd.setValue(stv);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
