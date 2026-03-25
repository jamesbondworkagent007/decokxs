package com.okinc.im.imui.messageV2.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivityViewModel$createChannelIdFlow$$inlined$flatMapLatest$1<T> extends SuspendLambda implements yHO<FlowCollector<? super T>, String, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1 $callee$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActivityViewModel$createChannelIdFlow$$inlined$flatMapLatest$1(Continuation continuation, Function1 function1) {
        super(3, continuation);
        this.$callee$inlined = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super T> flowCollector, String str, Continuation<? super Unit> continuation) {
        ChatActivityViewModel$createChannelIdFlow$$inlined$flatMapLatest$1 chatActivityViewModel$createChannelIdFlow$$inlined$flatMapLatest$1 = new ChatActivityViewModel$createChannelIdFlow$$inlined$flatMapLatest$1(continuation, this.$callee$inlined);
        chatActivityViewModel$createChannelIdFlow$$inlined$flatMapLatest$1.L$0 = flowCollector;
        chatActivityViewModel$createChannelIdFlow$$inlined$flatMapLatest$1.L$1 = str;
        return chatActivityViewModel$createChannelIdFlow$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = (Flow) this.$callee$inlined.invoke((String) this.L$1);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == objCopydefault) {
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
