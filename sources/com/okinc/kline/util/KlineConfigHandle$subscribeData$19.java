package com.okinc.kline.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C37883pEf;
import o.C56391yDq;
import o.C56442yFn;
import o.oUL;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineConfigHandle$subscribeData$19 extends SuspendLambda implements Function2<oUL, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C37883pEf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineConfigHandle$subscribeData$19(C37883pEf c37883pEf, Continuation<? super KlineConfigHandle$subscribeData$19> continuation) {
        super(2, continuation);
        this.this$0 = c37883pEf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KlineConfigHandle$subscribeData$19 klineConfigHandle$subscribeData$19 = new KlineConfigHandle$subscribeData$19(this.this$0, continuation);
        klineConfigHandle$subscribeData$19.L$0 = obj;
        return klineConfigHandle$subscribeData$19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(oUL oul, Continuation<? super Unit> continuation) {
        return ((KlineConfigHandle$subscribeData$19) create(oul, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            oUL oul = (oUL) this.L$0;
            this.this$0.OLrzqt().AkhnZx().setSupportQuickOrder(oul.OLrzqt());
            this.this$0.OLrzqt().AkhnZx().setShowPriceChange(oul.copydefault());
            this.this$0.OLrzqt().AkhnZx().setShotLifeCycleCountDown(oul.AEQbTJ());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
