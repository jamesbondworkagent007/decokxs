package com.okinc.find_ui.ranking.dex.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC41655qus;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeDexViewModel$subscribeData$2$3$3 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends InterfaceC41655qus>>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketHomeDexViewModel$subscribeData$2$3$3(Continuation<? super MarketHomeDexViewModel$subscribeData$2$3$3> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super List<? extends InterfaceC41655qus>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        MarketHomeDexViewModel$subscribeData$2$3$3 marketHomeDexViewModel$subscribeData$2$3$3 = new MarketHomeDexViewModel$subscribeData$2$3$3(continuation);
        marketHomeDexViewModel$subscribeData$2$3$3.L$0 = th;
        return marketHomeDexViewModel$subscribeData$2$3$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.AEQbTJ("MarketHomeDexViewModel", "subscribe dex vos error", (Throwable) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
