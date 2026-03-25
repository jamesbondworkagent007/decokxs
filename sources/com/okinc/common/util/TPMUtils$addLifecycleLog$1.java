package com.okinc.common.util;

import com.okinc.okapm.common.Lifecycle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pJI;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class TPMUtils$addLifecycleLog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TPMUtils$addLifecycleLog$1(Lifecycle lifecycle, Continuation<? super TPMUtils$addLifecycleLog$1> continuation) {
        super(2, continuation);
        this.$lifecycle = lifecycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TPMUtils$addLifecycleLog$1(this.$lifecycle, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TPMUtils$addLifecycleLog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$lifecycle == Lifecycle.Background) {
                pUU.KWHzl("Monitor.Lifecycle", "Entered background, " + pJI.Companion.EZpvd());
            } else {
                pUU.KWHzl("Monitor.Lifecycle", "Entered foreground, " + pJI.Companion.EZpvd());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
