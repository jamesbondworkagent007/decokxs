package com.okinc.okimcore.feature.message.manager;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.sMR;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$syncConversations$1$memoryCollectorJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<sMR.Activity> $latestMemorySnapshot;
    final /* synthetic */ SharedFlow<sMR.Activity> $memoryFlow;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$syncConversations$1$memoryCollectorJob$1(SharedFlow<sMR.Activity> sharedFlow, Ref.ObjectRef<sMR.Activity> objectRef, Continuation<? super InHouseIMWebSocketSyncManagerImpl$syncConversations$1$memoryCollectorJob$1> continuation) {
        super(2, continuation);
        this.$memoryFlow = sharedFlow;
        this.$latestMemorySnapshot = objectRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$syncConversations$1$memoryCollectorJob$1(this.$memoryFlow, this.$latestMemorySnapshot, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$syncConversations$1$memoryCollectorJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<sMR.Activity> sharedFlow = this.$memoryFlow;
            final Ref.ObjectRef<sMR.Activity> objectRef = this.$latestMemorySnapshot;
            FlowCollector<? super sMR.Activity> flowCollector = new FlowCollector() { // from class: com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$syncConversations$1$memoryCollectorJob$1.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.sMR$Activity */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(sMR.Activity activity, Continuation<? super Unit> continuation) {
                    objectRef.element = activity;
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlow.collect(flowCollector, this) == objCopydefault) {
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
