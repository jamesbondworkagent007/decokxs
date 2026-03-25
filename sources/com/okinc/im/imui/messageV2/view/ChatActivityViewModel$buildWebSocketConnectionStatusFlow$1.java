package com.okinc.im.imui.messageV2.view;

import com.okinc.okimcore.model.im.MessengerConnectionStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivityViewModel$buildWebSocketConnectionStatusFlow$1 extends SuspendLambda implements Function2<MessengerConnectionStatus, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChatActivityViewModel$buildWebSocketConnectionStatusFlow$1(Continuation<? super ChatActivityViewModel$buildWebSocketConnectionStatusFlow$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatActivityViewModel$buildWebSocketConnectionStatusFlow$1 chatActivityViewModel$buildWebSocketConnectionStatusFlow$1 = new ChatActivityViewModel$buildWebSocketConnectionStatusFlow$1(continuation);
        chatActivityViewModel$buildWebSocketConnectionStatusFlow$1.L$0 = obj;
        return chatActivityViewModel$buildWebSocketConnectionStatusFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MessengerConnectionStatus messengerConnectionStatus, Continuation<? super Unit> continuation) {
        return ((ChatActivityViewModel$buildWebSocketConnectionStatusFlow$1) create(messengerConnectionStatus, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("ChatActivityViewModel", "updateConnectionState - state changed: " + ((MessengerConnectionStatus) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
