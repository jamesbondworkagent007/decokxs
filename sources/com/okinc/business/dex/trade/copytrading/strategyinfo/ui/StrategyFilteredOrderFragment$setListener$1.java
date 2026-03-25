package com.okinc.business.dex.trade.copytrading.strategyinfo.ui;

import androidx.fragment.app.Fragment;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC20068gZs;
import o.gXT;
import o.rVN;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyFilteredOrderFragment$setListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ gXT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyFilteredOrderFragment$setListener$1(gXT gxt, Continuation<? super StrategyFilteredOrderFragment$setListener$1> continuation) {
        super(2, continuation);
        this.this$0 = gxt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyFilteredOrderFragment$setListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StrategyFilteredOrderFragment$setListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC20068gZs> stateFlowEZpvd = this.this$0.valueOf().EZpvd();
            final gXT gxt = this.this$0;
            FlowCollector<? super InterfaceC20068gZs> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyFilteredOrderFragment$setListener$1.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(InterfaceC20068gZs interfaceC20068gZs, Continuation<? super Unit> continuation) {
                    gxt.EZpvd(interfaceC20068gZs);
                    if ((interfaceC20068gZs instanceof InterfaceC20068gZs.StateListAnimator) || (interfaceC20068gZs instanceof InterfaceC20068gZs.ActionBar)) {
                        rVN.reportFullyDrawn$default((Fragment) gxt, true, (String) null, 2, (Object) null);
                    } else if (interfaceC20068gZs instanceof InterfaceC20068gZs.Application) {
                        rVN.reportFullyDrawn$default((Fragment) gxt, false, (String) null, 2, (Object) null);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
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
