package com.okinc.okmarket.data;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketDataApiImpl$httpThenSubscribeTickerData$2 extends SuspendLambda implements Function2<Flow<? extends List<? extends Pair<? extends String, ? extends TickersData>>>, Continuation<? super Flow<? extends List<? extends Pair<? extends String, ? extends TickersData>>>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketDataApiImpl$httpThenSubscribeTickerData$2(Continuation<? super MarketDataApiImpl$httpThenSubscribeTickerData$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketDataApiImpl$httpThenSubscribeTickerData$2 marketDataApiImpl$httpThenSubscribeTickerData$2 = new MarketDataApiImpl$httpThenSubscribeTickerData$2(continuation);
        marketDataApiImpl$httpThenSubscribeTickerData$2.L$0 = obj;
        return marketDataApiImpl$httpThenSubscribeTickerData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Flow<? extends List<? extends Pair<? extends String, ? extends TickersData>>> flow, Continuation<? super Flow<? extends List<? extends Pair<? extends String, ? extends TickersData>>>> continuation) {
        return invoke2((Flow<? extends List<Pair<String, TickersData>>>) flow, (Continuation<? super Flow<? extends List<Pair<String, TickersData>>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Flow<? extends List<Pair<String, TickersData>>> flow, Continuation<? super Flow<? extends List<Pair<String, TickersData>>>> continuation) {
        return ((MarketDataApiImpl$httpThenSubscribeTickerData$2) create(flow, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return (Flow) this.L$0;
    }
}
