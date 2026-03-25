package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.gLQ;
import o.gWN;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyInfoViewModel$isSaAvailable$1 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StrategyInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyInfoViewModel$isSaAvailable$1(StrategyInfoViewModel strategyInfoViewModel, Continuation<? super StrategyInfoViewModel$isSaAvailable$1> continuation) {
        super(2, continuation);
        this.this$0 = strategyInfoViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StrategyInfoViewModel$isSaAvailable$1 strategyInfoViewModel$isSaAvailable$1 = new StrategyInfoViewModel$isSaAvailable$1(this.this$0, continuation);
        strategyInfoViewModel$isSaAvailable$1.L$0 = obj;
        return strategyInfoViewModel$isSaAvailable$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
        return ((StrategyInfoViewModel$isSaAvailable$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            gWN gwn = this.this$0.AEQbTJ;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = gWN.checkSAState$default(gwn, null, this, 1, null);
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
        gLQ glq = (gLQ) obj;
        if (!(glq instanceof gLQ.TaskDescription) && !(glq instanceof gLQ.Application) && !(glq instanceof gLQ.PendingIntent) && !(glq instanceof gLQ.StateListAnimator)) {
            z = false;
        }
        Boolean boolKWHzl = C56443yFo.KWHzl(z);
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(boolKWHzl, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
