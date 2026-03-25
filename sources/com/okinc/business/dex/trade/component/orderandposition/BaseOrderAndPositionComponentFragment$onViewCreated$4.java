package com.okinc.business.dex.trade.component.orderandposition;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.gPW;

/* JADX INFO: loaded from: classes5.dex */
public final class BaseOrderAndPositionComponentFragment$onViewCreated$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ gPW<VB> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOrderAndPositionComponentFragment$onViewCreated$4(gPW<VB> gpw, Continuation<? super BaseOrderAndPositionComponentFragment$onViewCreated$4> continuation) {
        super(2, continuation);
        this.this$0 = gpw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseOrderAndPositionComponentFragment$onViewCreated$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseOrderAndPositionComponentFragment$onViewCreated$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<Unit> sharedFlowAYXKKw = this.this$0.AEQbTJ().AYXKKw();
            final gPW<VB> gpw = this.this$0;
            FlowCollector<? super Unit> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.component.orderandposition.BaseOrderAndPositionComponentFragment$onViewCreated$4.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                    gpw.AhwBna();
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlowAYXKKw.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
