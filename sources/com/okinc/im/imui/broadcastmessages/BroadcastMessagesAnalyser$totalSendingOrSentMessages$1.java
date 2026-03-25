package com.okinc.im.imui.broadcastmessages;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessagesAnalyser$totalSendingOrSentMessages$1 extends SuspendLambda implements yHO<Integer, Integer, Continuation<? super Integer>, Object> {
    /* synthetic */ int I$0;
    /* synthetic */ int I$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BroadcastMessagesAnalyser$totalSendingOrSentMessages$1(Continuation<? super BroadcastMessagesAnalyser$totalSendingOrSentMessages$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, int i2, Continuation<? super Integer> continuation) {
        BroadcastMessagesAnalyser$totalSendingOrSentMessages$1 broadcastMessagesAnalyser$totalSendingOrSentMessages$1 = new BroadcastMessagesAnalyser$totalSendingOrSentMessages$1(continuation);
        broadcastMessagesAnalyser$totalSendingOrSentMessages$1.I$0 = i;
        broadcastMessagesAnalyser$totalSendingOrSentMessages$1.I$1 = i2;
        return broadcastMessagesAnalyser$totalSendingOrSentMessages$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(Integer num, Integer num2, Continuation<? super Integer> continuation) {
        return invoke(num.intValue(), num2.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56443yFo.AEQbTJ(this.I$0 + this.I$1);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
