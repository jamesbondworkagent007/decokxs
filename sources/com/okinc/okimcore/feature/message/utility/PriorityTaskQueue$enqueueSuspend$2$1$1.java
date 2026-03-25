package com.okinc.okimcore.feature.message.utility;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.sMQ;
import o.sMV;

/* JADX INFO: loaded from: classes10.dex */
public final class PriorityTaskQueue$enqueueSuspend$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ sMQ $prioritizedTask;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ sMV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriorityTaskQueue$enqueueSuspend$2$1$1(sMV smv, sMQ smq, Continuation<? super PriorityTaskQueue$enqueueSuspend$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = smv;
        this.$prioritizedTask = smq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PriorityTaskQueue$enqueueSuspend$2$1$1 priorityTaskQueue$enqueueSuspend$2$1$1 = new PriorityTaskQueue$enqueueSuspend$2$1$1(this.this$0, this.$prioritizedTask, continuation);
        priorityTaskQueue$enqueueSuspend$2$1$1.L$0 = obj;
        return priorityTaskQueue$enqueueSuspend$2$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriorityTaskQueue$enqueueSuspend$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutex;
        sMV smv;
        sMQ smq;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Mutex mutex2 = this.this$0.KWHzl;
            sMV smv2 = this.this$0;
            sMQ smq2 = this.$prioritizedTask;
            this.L$0 = coroutineScope;
            this.L$1 = mutex2;
            this.L$2 = smv2;
            this.L$3 = smq2;
            this.label = 1;
            if (mutex2.lock(null, this) == objCopydefault) {
                return objCopydefault;
            }
            mutex = mutex2;
            smv = smv2;
            smq = smq2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            smq = (sMQ) this.L$3;
            smv = (sMV) this.L$2;
            mutex = (Mutex) this.L$1;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            smv.OLrzqt().offer(smq);
            try {
                Result.Application application = Result.Companion;
                Result.m7377constructorimpl(C56443yFo.KWHzl(smv.copydefault().complete(Unit.INSTANCE)));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
