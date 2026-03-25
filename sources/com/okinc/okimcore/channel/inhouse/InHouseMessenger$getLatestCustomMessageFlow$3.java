package com.okinc.okimcore.channel.inhouse;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseMessenger$getLatestCustomMessageFlow$3 extends SuspendLambda implements Function2<OKMessage, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseMessenger$getLatestCustomMessageFlow$3(Continuation<? super InHouseMessenger$getLatestCustomMessageFlow$3> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseMessenger$getLatestCustomMessageFlow$3 inHouseMessenger$getLatestCustomMessageFlow$3 = new InHouseMessenger$getLatestCustomMessageFlow$3(continuation);
        inHouseMessenger$getLatestCustomMessageFlow$3.L$0 = obj;
        return inHouseMessenger$getLatestCustomMessageFlow$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OKMessage oKMessage, Continuation<? super Unit> continuation) {
        return ((InHouseMessenger$getLatestCustomMessageFlow$3) create(oKMessage, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            OKMessage oKMessage = (OKMessage) this.L$0;
            pUU.KWHzl("InHouseMessenger", "getLatestCustomMessageFlow - emit: channelId:" + oKMessage.getTargetId() + ", seq: " + oKMessage.getSeq());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
