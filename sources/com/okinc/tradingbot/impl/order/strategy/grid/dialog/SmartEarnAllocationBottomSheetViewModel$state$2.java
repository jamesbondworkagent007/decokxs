package com.okinc.tradingbot.impl.order.strategy.grid.dialog;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C50503vQv;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartEarnAllocationBottomSheetViewModel$state$2 extends SuspendLambda implements yHO<FlowCollector<? super C50503vQv.FragmentManager>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartEarnAllocationBottomSheetViewModel$state$2(Continuation<? super SmartEarnAllocationBottomSheetViewModel$state$2> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super C50503vQv.FragmentManager> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        SmartEarnAllocationBottomSheetViewModel$state$2 smartEarnAllocationBottomSheetViewModel$state$2 = new SmartEarnAllocationBottomSheetViewModel$state$2(continuation);
        smartEarnAllocationBottomSheetViewModel$state$2.L$0 = th;
        return smartEarnAllocationBottomSheetViewModel$state$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.AEQbTJ("SmartEarnAllocationBottomSheetViewModel", (Throwable) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
