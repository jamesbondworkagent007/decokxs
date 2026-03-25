package com.okinc.unify_trade;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.yHT;

/* JADX INFO: loaded from: classes17.dex */
public final class TradeInitJob$marketEnsureOKTradeResume$1 extends SuspendLambda implements yHT<Boolean, InterfaceC54581xNr, Exception, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeInitJob$marketEnsureOKTradeResume$1(Continuation<? super TradeInitJob$marketEnsureOKTradeResume$1> continuation) {
        super(4, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(Boolean bool, InterfaceC54581xNr interfaceC54581xNr, Exception exc, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), interfaceC54581xNr, exc, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, InterfaceC54581xNr interfaceC54581xNr, Exception exc, Continuation<? super Unit> continuation) {
        return new TradeInitJob$marketEnsureOKTradeResume$1(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return Unit.INSTANCE;
    }
}
