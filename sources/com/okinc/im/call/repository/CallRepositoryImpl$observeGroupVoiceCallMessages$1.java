package com.okinc.im.call.repository;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C35235nrW;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class CallRepositoryImpl$observeGroupVoiceCallMessages$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35235nrW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRepositoryImpl$observeGroupVoiceCallMessages$1(C35235nrW c35235nrW, Continuation<? super CallRepositoryImpl$observeGroupVoiceCallMessages$1> continuation) {
        super(2, continuation);
        this.this$0 = c35235nrW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallRepositoryImpl$observeGroupVoiceCallMessages$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CallRepositoryImpl$observeGroupVoiceCallMessages$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl("observeGroupVoiceCallMessages: Starting group voice call message observation");
            SharedFlow<InHouseIMMessageEntity> sharedFlowValueOf = this.this$0.AYXKKw.valueOf();
            final C35235nrW c35235nrW = this.this$0;
            FlowCollector<? super InHouseIMMessageEntity> flowCollector = new FlowCollector() { // from class: com.okinc.im.call.repository.CallRepositoryImpl$observeGroupVoiceCallMessages$1.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(InHouseIMMessageEntity inHouseIMMessageEntity, Continuation<? super Unit> continuation) {
                    Object objKWHzl = c35235nrW.KWHzl(inHouseIMMessageEntity, (Continuation<? super Unit>) continuation);
                    return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlowValueOf.collect(flowCollector, this) == objCopydefault) {
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
