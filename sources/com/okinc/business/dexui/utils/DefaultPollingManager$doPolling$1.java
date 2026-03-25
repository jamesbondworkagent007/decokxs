package com.okinc.business.dexui.utils;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25391ivo;

/* JADX INFO: loaded from: classes6.dex */
public final class DefaultPollingManager$doPolling$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC25391ivo.StateListAnimator $task;
    final /* synthetic */ long $timeMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPollingManager$doPolling$1(InterfaceC25391ivo.StateListAnimator stateListAnimator, long j, Continuation<? super DefaultPollingManager$doPolling$1> continuation) {
        super(2, continuation);
        this.$task = stateListAnimator;
        this.$timeMillis = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultPollingManager$doPolling$1 defaultPollingManager$doPolling$1 = new DefaultPollingManager$doPolling$1(this.$task, this.$timeMillis, continuation);
        defaultPollingManager$doPolling$1.L$0 = obj;
        return defaultPollingManager$doPolling$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultPollingManager$doPolling$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004b -> B:11:0x002e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        long j;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            j = this.$timeMillis;
            this.L$0 = coroutineScope;
            this.label = 2;
            if (DelayKt.delay(j, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (!CoroutineScopeKt.isActive(coroutineScope)) {
            InterfaceC25391ivo.StateListAnimator stateListAnimator = this.$task;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (stateListAnimator.KWHzl(this) == objCopydefault) {
                return objCopydefault;
            }
            j = this.$timeMillis;
            this.L$0 = coroutineScope;
            this.label = 2;
            if (DelayKt.delay(j, this) == objCopydefault) {
            }
            if (!CoroutineScopeKt.isActive(coroutineScope)) {
                return Unit.INSTANCE;
            }
        }
    }
}
