package com.okinc.lib.internal.monitor.thread;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC38042pKb;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class ThreadMonitorImpl$checkThreadCount$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC38042pKb.StateListAnimator $callback;
    final /* synthetic */ int $count;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadMonitorImpl$checkThreadCount$1$1$1(InterfaceC38042pKb.StateListAnimator stateListAnimator, int i, Continuation<? super ThreadMonitorImpl$checkThreadCount$1$1$1> continuation) {
        super(2, continuation);
        this.$callback = stateListAnimator;
        this.$count = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ThreadMonitorImpl$checkThreadCount$1$1$1(this.$callback, this.$count, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ThreadMonitorImpl$checkThreadCount$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                this.$callback.AEQbTJ(this.$count);
            } catch (Throwable th) {
                pUU.AEQbTJ("Monitor.Thread", "Error in report callback", th);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
