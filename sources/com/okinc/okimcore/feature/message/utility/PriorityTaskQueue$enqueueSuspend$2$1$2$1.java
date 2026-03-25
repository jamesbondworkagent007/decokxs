package com.okinc.okimcore.feature.message.utility;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sMQ;
import o.sMV;

/* JADX INFO: loaded from: classes10.dex */
public final class PriorityTaskQueue$enqueueSuspend$2$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ sMQ $prioritizedTask;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ sMV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriorityTaskQueue$enqueueSuspend$2$1$2$1(sMV smv, sMQ smq, Continuation<? super PriorityTaskQueue$enqueueSuspend$2$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = smv;
        this.$prioritizedTask = smq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PriorityTaskQueue$enqueueSuspend$2$1$2$1(this.this$0, this.$prioritizedTask, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriorityTaskQueue$enqueueSuspend$2$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sMV smv;
        Mutex mutex;
        sMQ smq;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex2 = this.this$0.KWHzl;
            smv = this.this$0;
            sMQ smq2 = this.$prioritizedTask;
            this.L$0 = mutex2;
            this.L$1 = smv;
            this.L$2 = smq2;
            this.label = 1;
            if (mutex2.lock(null, this) == objCopydefault) {
                return objCopydefault;
            }
            mutex = mutex2;
            smq = smq2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            smq = (sMQ) this.L$2;
            smv = (sMV) this.L$1;
            mutex = (Mutex) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            smv.OLrzqt().remove(smq);
            mutex.unlock(null);
            pUU.EZpvd(this.this$0.gEmmrt, this.$prioritizedTask + " => task cancelled before execution");
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
