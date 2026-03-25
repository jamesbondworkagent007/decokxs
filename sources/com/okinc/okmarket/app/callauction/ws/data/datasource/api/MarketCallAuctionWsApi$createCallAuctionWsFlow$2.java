package com.okinc.okmarket.app.callauction.ws.data.datasource.api;

import com.okinc.core.livelistener.OKIncomingData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes16.dex */
public final class MarketCallAuctionWsApi$createCallAuctionWsFlow$2 extends SuspendLambda implements Function2<FlowCollector<? super OKIncomingData>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCallAuctionWsApi$createCallAuctionWsFlow$2(String str, Continuation<? super MarketCallAuctionWsApi$createCallAuctionWsFlow$2> continuation) {
        super(2, continuation);
        this.$channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketCallAuctionWsApi$createCallAuctionWsFlow$2(this.$channelId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super OKIncomingData> flowCollector, Continuation<? super Unit> continuation) {
        return ((MarketCallAuctionWsApi$createCallAuctionWsFlow$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("MarketCallAuctionWsApi", "WS start, [channelId: " + this.$channelId + "]");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
