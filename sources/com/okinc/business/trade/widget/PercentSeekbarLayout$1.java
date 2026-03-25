package com.okinc.business.trade.widget;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C31225lpx;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes23.dex */
public final class PercentSeekbarLayout$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C31225lpx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PercentSeekbarLayout$1(C31225lpx c31225lpx, Continuation<? super PercentSeekbarLayout$1> continuation) {
        super(2, continuation);
        this.this$0 = c31225lpx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PercentSeekbarLayout$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PercentSeekbarLayout$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.drop(FlowKt.debounce(this.this$0.AhwBna, this.this$0.AEQbTJ), 1));
            final C31225lpx c31225lpx = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.trade.widget.PercentSeekbarLayout$1.3
                public final Object OLrzqt(float f, Continuation<? super Unit> continuation) {
                    Function1 function1 = c31225lpx.valueOf;
                    if (function1 != null) {
                        function1.invoke(C56443yFo.OLrzqt(f));
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return OLrzqt(((Number) obj2).floatValue(), continuation);
                }
            };
            this.label = 1;
            if (flowDistinctUntilChanged.collect(flowCollector, this) == objCopydefault) {
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
