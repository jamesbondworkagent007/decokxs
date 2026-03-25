package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.gWN;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyBasicInfoViewModel$canEditStrategy$1 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StrategyBasicInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyBasicInfoViewModel$canEditStrategy$1(StrategyBasicInfoViewModel strategyBasicInfoViewModel, String str, Continuation<? super StrategyBasicInfoViewModel$canEditStrategy$1> continuation) {
        super(2, continuation);
        this.this$0 = strategyBasicInfoViewModel;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StrategyBasicInfoViewModel$canEditStrategy$1 strategyBasicInfoViewModel$canEditStrategy$1 = new StrategyBasicInfoViewModel$canEditStrategy$1(this.this$0, this.$chainId, continuation);
        strategyBasicInfoViewModel$canEditStrategy$1.L$0 = obj;
        return strategyBasicInfoViewModel$canEditStrategy$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
        return ((StrategyBasicInfoViewModel$canEditStrategy$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            gWN gwn = this.this$0.values;
            String str = this.$chainId;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = gwn.EZpvd(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(obj, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
