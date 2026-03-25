package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$special$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super DexMultiTokenInfoBean>, AdvancedTradeType, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$special$$inlined$flatMapLatest$1(Continuation continuation, AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        super(3, continuation);
        this.this$0 = advancedPlaceOrderVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super DexMultiTokenInfoBean> flowCollector, AdvancedTradeType advancedTradeType, Continuation<? super Unit> continuation) {
        AdvancedPlaceOrderVM$special$$inlined$flatMapLatest$1 advancedPlaceOrderVM$special$$inlined$flatMapLatest$1 = new AdvancedPlaceOrderVM$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        advancedPlaceOrderVM$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        advancedPlaceOrderVM$special$$inlined$flatMapLatest$1.L$1 = advancedTradeType;
        return advancedPlaceOrderVM$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        StateFlow<DexMultiTokenInfoBean> stateFlowAwvSrB;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            int i2 = AdvancedPlaceOrderVM.TaskDescription.EZpvd[((AdvancedTradeType) this.L$1).ordinal()];
            if (i2 == 1) {
                stateFlowAwvSrB = this.this$0.AwvSrB();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stateFlowAwvSrB = this.this$0.ejfBZ();
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, stateFlowAwvSrB, this) == objCopydefault) {
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
