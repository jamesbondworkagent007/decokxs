package com.okinc.okimcore.feature.message.utility;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.sMQ;

/* JADX INFO: loaded from: classes10.dex */
public final class PriorityTaskQueue$init$1$1$1$job$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ sMQ $task;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriorityTaskQueue$init$1$1$1$job$1$1$1(sMQ smq, Continuation<? super PriorityTaskQueue$init$1$1$1$job$1$1$1> continuation) {
        super(2, continuation);
        this.$task = smq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PriorityTaskQueue$init$1$1$1$job$1$1$1 priorityTaskQueue$init$1$1$1$job$1$1$1 = new PriorityTaskQueue$init$1$1$1$job$1$1$1(this.$task, continuation);
        priorityTaskQueue$init$1$1$1$job$1$1$1.L$0 = obj;
        return priorityTaskQueue$init$1$1$1$job$1$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriorityTaskQueue$init$1$1$1$job$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Function2<CoroutineScope, Continuation<? super Unit>, Object> function2KWHzl = this.$task.KWHzl();
            this.label = 1;
            if (function2KWHzl.invoke(coroutineScope, this) == objCopydefault) {
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
