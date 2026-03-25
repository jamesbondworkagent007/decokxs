package com.okinc.business.dex.tee.quick.market.ui.viewmodel;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC30503lcQ;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class QuickMarketPlaceOrderViewModel$subscribeAutoSellVisibility$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ QuickMarketPlaceOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickMarketPlaceOrderViewModel$subscribeAutoSellVisibility$1(QuickMarketPlaceOrderViewModel quickMarketPlaceOrderViewModel, Continuation<? super QuickMarketPlaceOrderViewModel$subscribeAutoSellVisibility$1> continuation) {
        super(2, continuation);
        this.this$0 = quickMarketPlaceOrderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuickMarketPlaceOrderViewModel$subscribeAutoSellVisibility$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((QuickMarketPlaceOrderViewModel$subscribeAutoSellVisibility$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Boolean> stateFlowDjBIcL = this.this$0.djBIcL();
            final QuickMarketPlaceOrderViewModel quickMarketPlaceOrderViewModel = this.this$0;
            FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.tee.quick.market.ui.viewmodel.QuickMarketPlaceOrderViewModel$subscribeAutoSellVisibility$1.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return OLrzqt(((Boolean) obj2).booleanValue(), continuation);
                }

                public final Object OLrzqt(boolean z, Continuation<? super Unit> continuation) {
                    if (!z && !(quickMarketPlaceOrderViewModel.EZpvd.getValue() instanceof AbstractC30503lcQ.Activity)) {
                        pUU.KWHzl("QuickMarketPlaceOrderViewModel", "Auto-sell visibility changed to false, disabling auto-sell state");
                        quickMarketPlaceOrderViewModel.AEQbTJ(AbstractC30503lcQ.Activity.AEQbTJ, false);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowDjBIcL.collect(flowCollector, this) == objCopydefault) {
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
