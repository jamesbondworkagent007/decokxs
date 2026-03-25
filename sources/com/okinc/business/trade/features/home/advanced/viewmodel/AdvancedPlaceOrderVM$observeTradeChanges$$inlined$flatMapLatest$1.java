package com.okinc.business.trade.features.home.advanced.viewmodel;

import androidx.lifecycle.FlowLiveDataConversions;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C30626leh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30792lho;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$observeTradeChanges$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super C30626leh>, InterfaceC30792lho, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$observeTradeChanges$$inlined$flatMapLatest$1(Continuation continuation, AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        super(3, continuation);
        this.this$0 = advancedPlaceOrderVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super C30626leh> flowCollector, InterfaceC30792lho interfaceC30792lho, Continuation<? super Unit> continuation) {
        AdvancedPlaceOrderVM$observeTradeChanges$$inlined$flatMapLatest$1 advancedPlaceOrderVM$observeTradeChanges$$inlined$flatMapLatest$1 = new AdvancedPlaceOrderVM$observeTradeChanges$$inlined$flatMapLatest$1(continuation, this.this$0);
        advancedPlaceOrderVM$observeTradeChanges$$inlined$flatMapLatest$1.L$0 = flowCollector;
        advancedPlaceOrderVM$observeTradeChanges$$inlined$flatMapLatest$1.L$1 = interfaceC30792lho;
        return advancedPlaceOrderVM$observeTradeChanges$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flowFlowCombineTransform = FlowKt.flowCombineTransform(FlowKt.debounce(this.this$0.RlQdEF.AEQbTJ(this.this$0.DCJXGO.KWHzl(), this.this$0.DCJXGO.AEQbTJ(), this.this$0.ejfBZ, this.this$0.gEmmrt(), this.this$0.fJNWhG, FlowLiveDataConversions.asFlow(this.this$0.iwGUEr()), this.this$0.AhwBna, this.this$0.AYXKKw, this.this$0.KWHzl), 300L), this.this$0.dvKsVJ, new AdvancedPlaceOrderVM$observeTradeChanges$1$1(this.this$0, null));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowCombineTransform, this) == objCopydefault) {
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
