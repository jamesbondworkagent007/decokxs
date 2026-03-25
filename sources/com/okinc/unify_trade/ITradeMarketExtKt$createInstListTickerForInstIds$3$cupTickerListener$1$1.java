package com.okinc.unify_trade;

import com.okinc.core.livelistener.OKIncomingData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class ITradeMarketExtKt$createInstListTickerForInstIds$3$cupTickerListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProducerScope<OKIncomingData> $$this$callbackFlow;
    final /* synthetic */ OKIncomingData $incomingData;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super com.okinc.core.livelistener.OKIncomingData> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ITradeMarketExtKt$createInstListTickerForInstIds$3$cupTickerListener$1$1(ProducerScope<? super OKIncomingData> producerScope, OKIncomingData oKIncomingData, Continuation<? super ITradeMarketExtKt$createInstListTickerForInstIds$3$cupTickerListener$1$1> continuation) {
        super(2, continuation);
        this.$$this$callbackFlow = producerScope;
        this.$incomingData = oKIncomingData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ITradeMarketExtKt$createInstListTickerForInstIds$3$cupTickerListener$1$1(this.$$this$callbackFlow, this.$incomingData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ITradeMarketExtKt$createInstListTickerForInstIds$3$cupTickerListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$$this$callbackFlow.mo5769trySendJP2dKIU(this.$incomingData);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
