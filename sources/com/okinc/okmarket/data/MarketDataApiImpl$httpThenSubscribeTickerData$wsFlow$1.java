package com.okinc.okmarket.data;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketDataApiImpl$httpThenSubscribeTickerData$wsFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends Pair<? extends String, ? extends TickersData>>>, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketDataApiImpl$httpThenSubscribeTickerData$wsFlow$1(Continuation<? super MarketDataApiImpl$httpThenSubscribeTickerData$wsFlow$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDataApiImpl$httpThenSubscribeTickerData$wsFlow$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends Pair<? extends String, ? extends TickersData>>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<Pair<String, TickersData>>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<Pair<String, TickersData>>> flowCollector, Continuation<? super Unit> continuation) {
        return ((MarketDataApiImpl$httpThenSubscribeTickerData$wsFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        yDY.AhwBna();
        return Unit.INSTANCE;
    }
}
