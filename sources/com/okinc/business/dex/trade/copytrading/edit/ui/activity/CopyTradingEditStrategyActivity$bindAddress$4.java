package com.okinc.business.dex.trade.copytrading.edit.ui.activity;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C23428hxz;
import o.C56391yDq;
import o.C56442yFn;
import o.gTA;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingEditStrategyActivity$bindAddress$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C23428hxz $this_bindAddress;
    int label;
    final /* synthetic */ CopyTradingEditStrategyActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyActivity$bindAddress$4(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, C23428hxz c23428hxz, Continuation<? super CopyTradingEditStrategyActivity$bindAddress$4> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyActivity;
        this.$this_bindAddress = c23428hxz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyActivity$bindAddress$4(this.this$0, this.$this_bindAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyActivity$bindAddress$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<gTA> stateFlowKWHzl = this.this$0.gEmmrt().KWHzl();
            final C23428hxz c23428hxz = this.$this_bindAddress;
            final CopyTradingEditStrategyActivity copyTradingEditStrategyActivity = this.this$0;
            FlowCollector<? super gTA> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$bindAddress$4.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(gTA gta, Continuation<? super Unit> continuation) {
                    c23428hxz.OLrzqt.setAddressInputState(gta);
                    copyTradingEditStrategyActivity.ejfBZ();
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
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
