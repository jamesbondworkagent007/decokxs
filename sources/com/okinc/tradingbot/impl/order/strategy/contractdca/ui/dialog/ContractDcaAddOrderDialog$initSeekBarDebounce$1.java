package com.okinc.tradingbot.impl.order.strategy.contractdca.ui.dialog;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C47988uAv;
import o.C56391yDq;
import o.C56442yFn;
import o.vCQ;

/* JADX INFO: loaded from: classes11.dex */
public final class ContractDcaAddOrderDialog$initSeekBarDebounce$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ vCQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDcaAddOrderDialog$initSeekBarDebounce$1(vCQ vcq, Continuation<? super ContractDcaAddOrderDialog$initSeekBarDebounce$1> continuation) {
        super(2, continuation);
        this.this$0 = vcq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContractDcaAddOrderDialog$initSeekBarDebounce$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContractDcaAddOrderDialog$initSeekBarDebounce$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowDebounce = FlowKt.debounce(this.this$0.AEQbTJ, 50L);
            final vCQ vcq = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.dialog.ContractDcaAddOrderDialog$initSeekBarDebounce$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return KWHzl(((Number) obj2).floatValue(), continuation);
                }

                public final Object KWHzl(float f, Continuation<? super Unit> continuation) {
                    C47988uAv.setInputContent$default(vCQ.OLrzqt(vcq).AEQbTJ, vcq.OLrzqt().AEQbTJ(f), false, false, 6, null);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowDebounce.collect(flowCollector, this) == objCopydefault) {
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
