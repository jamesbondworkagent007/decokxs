package com.okinc.business.utils;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes7.dex */
public final class FlowUtilsKt$throttleFirst$1<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<T> $this_throttleFirst;
    final /* synthetic */ long $windowDuration;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.flow.Flow<? extends T> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowUtilsKt$throttleFirst$1(Flow<? extends T> flow, long j, Continuation<? super FlowUtilsKt$throttleFirst$1> continuation) {
        super(2, continuation);
        this.$this_throttleFirst = flow;
        this.$windowDuration = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowUtilsKt$throttleFirst$1 flowUtilsKt$throttleFirst$1 = new FlowUtilsKt$throttleFirst$1(this.$this_throttleFirst, this.$windowDuration, continuation);
        flowUtilsKt$throttleFirst$1.L$0 = obj;
        return flowUtilsKt$throttleFirst$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return ((FlowUtilsKt$throttleFirst$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final FlowCollector flowCollector = (FlowCollector) this.L$0;
            final AtomicLong atomicLong = new AtomicLong(0L);
            Flow<T> flow = this.$this_throttleFirst;
            final long j = this.$windowDuration;
            FlowCollector<? super T> flowCollector2 = new FlowCollector() { // from class: com.okinc.business.utils.FlowUtilsKt$throttleFirst$1.5
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - atomicLong.get() >= j) {
                        AtomicLong atomicLong2 = atomicLong;
                        if (atomicLong2.compareAndSet(atomicLong2.get(), jCurrentTimeMillis)) {
                            Object objEmit = flowCollector.emit(t, continuation);
                            return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector2, this) == objCopydefault) {
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
