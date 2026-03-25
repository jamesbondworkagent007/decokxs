package com.okinc.kline.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C37883pEf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineConfigHandle$subscribeData$11 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
    /* synthetic */ float F$0;
    int label;
    final /* synthetic */ C37883pEf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineConfigHandle$subscribeData$11(C37883pEf c37883pEf, Continuation<? super KlineConfigHandle$subscribeData$11> continuation) {
        super(2, continuation);
        this.this$0 = c37883pEf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KlineConfigHandle$subscribeData$11 klineConfigHandle$subscribeData$11 = new KlineConfigHandle$subscribeData$11(this.this$0, continuation);
        klineConfigHandle$subscribeData$11.F$0 = ((Number) obj).floatValue();
        return klineConfigHandle$subscribeData$11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(float f, Continuation<? super Unit> continuation) {
        return ((KlineConfigHandle$subscribeData$11) create(Float.valueOf(f), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Float f, Continuation<? super Unit> continuation) {
        return invoke(f.floatValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt().AkhnZx().setKlineDefaultOffset(this.F$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
