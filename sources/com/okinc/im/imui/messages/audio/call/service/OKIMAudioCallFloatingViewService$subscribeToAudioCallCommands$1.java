package com.okinc.im.imui.messages.audio.call.service;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC37160oob;
import o.C56391yDq;
import o.C56442yFn;
import o.ServiceC37177oos;

/* JADX INFO: loaded from: classes18.dex */
public final class OKIMAudioCallFloatingViewService$subscribeToAudioCallCommands$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ServiceC37177oos this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMAudioCallFloatingViewService$subscribeToAudioCallCommands$1(ServiceC37177oos serviceC37177oos, Continuation<? super OKIMAudioCallFloatingViewService$subscribeToAudioCallCommands$1> continuation) {
        super(2, continuation);
        this.this$0 = serviceC37177oos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKIMAudioCallFloatingViewService$subscribeToAudioCallCommands$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMAudioCallFloatingViewService$subscribeToAudioCallCommands$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<AbstractC37160oob> sharedFlowAEQbTJ = this.this$0.DbNXlk().AEQbTJ();
            final ServiceC37177oos serviceC37177oos = this.this$0;
            FlowCollector<? super AbstractC37160oob> flowCollector = new FlowCollector() { // from class: com.okinc.im.imui.messages.audio.call.service.OKIMAudioCallFloatingViewService$subscribeToAudioCallCommands$1.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(AbstractC37160oob abstractC37160oob, Continuation<? super Unit> continuation) {
                    serviceC37177oos.AEQbTJ(abstractC37160oob);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
