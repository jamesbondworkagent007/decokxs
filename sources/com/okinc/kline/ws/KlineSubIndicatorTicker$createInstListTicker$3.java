package com.okinc.kline.ws;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes9.dex */
public final class KlineSubIndicatorTicker$createInstListTicker$3<T> extends SuspendLambda implements yHO<FlowCollector<? super List<? extends T>>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KlineSubIndicatorTicker$createInstListTicker$3(Continuation<? super KlineSubIndicatorTicker$createInstListTicker$3> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super List<? extends T>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        KlineSubIndicatorTicker$createInstListTicker$3 klineSubIndicatorTicker$createInstListTicker$3 = new KlineSubIndicatorTicker$createInstListTicker$3(continuation);
        klineSubIndicatorTicker$createInstListTicker$3.L$0 = th;
        return klineSubIndicatorTicker$createInstListTicker$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.copydefault("KlineSubIndicatorTicker", "createInstListTicker error: " + ((Throwable) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
