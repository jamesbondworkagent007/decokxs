package com.okinc.im.imui.messageV2.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super Boolean>, Boolean, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$flatMapLatest$1(Continuation continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Boolean bool, Continuation<? super Unit> continuation) {
        ChatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$flatMapLatest$1 chatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$flatMapLatest$1 = new ChatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$flatMapLatest$1(continuation);
        chatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$flatMapLatest$1.L$0 = flowCollector;
        chatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$flatMapLatest$1.L$1 = bool;
        return chatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Flow flowOnStart;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            if (((Boolean) this.L$1).booleanValue()) {
                flowOnStart = FlowKt.flowOf(C56443yFo.KWHzl(false));
            } else {
                flowOnStart = FlowKt.onStart(FlowKt.flowOf(C56443yFo.KWHzl(true)), new ChatActivityViewModel$buildWebSocketConnectionStatusFlow$3$1(null));
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowOnStart, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
