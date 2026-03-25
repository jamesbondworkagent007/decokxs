package com.okinc.okimcore.feature.message.utility;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sMR;

/* JADX INFO: loaded from: classes10.dex */
public final class MemoryTracker$startTrackingWithFlow$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableSharedFlow<sMR.Activity> $memoryFlow;
    final /* synthetic */ String $tag;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoryTracker$startTrackingWithFlow$job$1(String str, MutableSharedFlow<sMR.Activity> mutableSharedFlow, Continuation<? super MemoryTracker$startTrackingWithFlow$job$1> continuation) {
        super(2, continuation);
        this.$tag = str;
        this.$memoryFlow = mutableSharedFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MemoryTracker$startTrackingWithFlow$job$1 memoryTracker$startTrackingWithFlow$job$1 = new MemoryTracker$startTrackingWithFlow$job$1(this.$tag, this.$memoryFlow, continuation);
        memoryTracker$startTrackingWithFlow$job$1.L$0 = obj;
        return memoryTracker$startTrackingWithFlow$job$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemoryTracker$startTrackingWithFlow$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0077 -> B:13:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        sMR.Activity activityAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            activityAEQbTJ = null;
        } else if (i == 1) {
            activityAEQbTJ = (sMR.Activity) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Exception unused) {
                this.L$0 = coroutineScope;
                this.L$1 = activityAEQbTJ;
                this.label = 2;
                if (DelayKt.delay(1000L, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activityAEQbTJ = (sMR.Activity) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        while (CoroutineScopeKt.isActive(coroutineScope)) {
            activityAEQbTJ = sMR.EZpvd.AEQbTJ(activityAEQbTJ);
            pUU.KWHzl(this.$tag, "[IMMemory tracking] latest snapshot: " + activityAEQbTJ);
            this.$memoryFlow.tryEmit(activityAEQbTJ);
            this.L$0 = coroutineScope;
            this.L$1 = activityAEQbTJ;
            this.label = 1;
            if (DelayKt.delay(1000L, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
