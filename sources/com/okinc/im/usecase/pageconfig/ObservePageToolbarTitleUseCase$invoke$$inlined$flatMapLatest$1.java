package com.okinc.im.usecase.pageconfig;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservePageToolbarTitleUseCase$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super String>, String, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $defaultTitleFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservePageToolbarTitleUseCase$invoke$$inlined$flatMapLatest$1(Continuation continuation, Flow flow) {
        super(3, continuation);
        this.$defaultTitleFlow$inlined = flow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super String> flowCollector, String str, Continuation<? super Unit> continuation) {
        ObservePageToolbarTitleUseCase$invoke$$inlined$flatMapLatest$1 observePageToolbarTitleUseCase$invoke$$inlined$flatMapLatest$1 = new ObservePageToolbarTitleUseCase$invoke$$inlined$flatMapLatest$1(continuation, this.$defaultTitleFlow$inlined);
        observePageToolbarTitleUseCase$invoke$$inlined$flatMapLatest$1.L$0 = flowCollector;
        observePageToolbarTitleUseCase$invoke$$inlined$flatMapLatest$1.L$1 = str;
        return observePageToolbarTitleUseCase$invoke$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            String str = (String) this.L$1;
            Flow flowFlowOf = str != null ? FlowKt.flowOf(str) : this.$defaultTitleFlow$inlined;
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == objCopydefault) {
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
