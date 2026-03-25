package com.okinc.find_ui.widgetprovider;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC35107npA;
import o.C35128npV;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class CryptoWidgetConfigureActivity$observeP2PState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC35107npA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoWidgetConfigureActivity$observeP2PState$1(ActivityC35107npA activityC35107npA, Continuation<? super CryptoWidgetConfigureActivity$observeP2PState$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC35107npA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoWidgetConfigureActivity$observeP2PState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoWidgetConfigureActivity$observeP2PState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<C35128npV> stateFlowKWHzl = this.this$0.AEQbTJ().KWHzl();
            final ActivityC35107npA activityC35107npA = this.this$0;
            FlowCollector<? super C35128npV> flowCollector = new FlowCollector() { // from class: com.okinc.find_ui.widgetprovider.CryptoWidgetConfigureActivity$observeP2PState$1.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(C35128npV c35128npV, Continuation<? super Unit> continuation) {
                    if (c35128npV.EZpvd()) {
                        activityC35107npA.showLoading(0L);
                    } else {
                        activityC35107npA.dismissLoading();
                    }
                    String strOLrzqt = c35128npV.OLrzqt();
                    if (strOLrzqt != null) {
                        pUU.copydefault(activityC35107npA.getTAG(), "P2P Error: " + strOLrzqt);
                    }
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
