package com.okinc.lib.internal.monitor.memory.leak;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.C38030pJq;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class LeakDetectorImpl$startProcessingCoroutines$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C38030pJq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeakDetectorImpl$startProcessingCoroutines$1(C38030pJq c38030pJq, Continuation<? super LeakDetectorImpl$startProcessingCoroutines$1> continuation) {
        super(2, continuation);
        this.this$0 = c38030pJq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LeakDetectorImpl$startProcessingCoroutines$1 leakDetectorImpl$startProcessingCoroutines$1 = new LeakDetectorImpl$startProcessingCoroutines$1(this.this$0, continuation);
        leakDetectorImpl$startProcessingCoroutines$1.L$0 = obj;
        return leakDetectorImpl$startProcessingCoroutines$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeakDetectorImpl$startProcessingCoroutines$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Exception e) {
                pUU.KWHzl("Monitor.Leak", "Leak | Stop or " + e.getMessage());
            }
        }
        while (CoroutineScopeKt.isActive(coroutineScope)) {
            this.this$0.gEmmrt();
            this.this$0.AYXKKw();
            long jCopydefault = this.this$0.AEQbTJ.copydefault();
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.delay(jCopydefault, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
