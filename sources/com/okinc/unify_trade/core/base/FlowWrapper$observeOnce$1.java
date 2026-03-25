package com.okinc.unify_trade.core.base;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56126xwt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes24.dex */
public final class FlowWrapper$observeOnce$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<T, Unit> $observer;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C56126xwt<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowWrapper$observeOnce$1(C56126xwt<T> c56126xwt, Function1<? super T, Unit> function1, Continuation<? super FlowWrapper$observeOnce$1> continuation) {
        super(2, continuation);
        this.this$0 = c56126xwt;
        this.$observer = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowWrapper$observeOnce$1 flowWrapper$observeOnce$1 = new FlowWrapper$observeOnce$1(this.this$0, this.$observer, continuation);
        flowWrapper$observeOnce$1.L$0 = obj;
        return flowWrapper$observeOnce$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlowWrapper$observeOnce$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Flow flowCopydefault = this.this$0.copydefault();
            final Function1<T, Unit> function1 = this.$observer;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.unify_trade.core.base.FlowWrapper$observeOnce$1.5
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    function1.invoke(t);
                    CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowCopydefault.collect(flowCollector, this) == objCopydefault) {
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
