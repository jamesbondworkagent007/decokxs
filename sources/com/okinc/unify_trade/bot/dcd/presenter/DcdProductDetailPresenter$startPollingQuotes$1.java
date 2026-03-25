package com.okinc.unify_trade.bot.dcd.presenter;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes19.dex */
public final class DcdProductDetailPresenter$startPollingQuotes$1 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcdProductDetailPresenter$startPollingQuotes$1(Continuation<? super DcdProductDetailPresenter$startPollingQuotes$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DcdProductDetailPresenter$startPollingQuotes$1 dcdProductDetailPresenter$startPollingQuotes$1 = new DcdProductDetailPresenter$startPollingQuotes$1(continuation);
        dcdProductDetailPresenter$startPollingQuotes$1.L$0 = obj;
        return dcdProductDetailPresenter$startPollingQuotes$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
        return ((DcdProductDetailPresenter$startPollingQuotes$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:7:0x0017). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        int i;
        FlowCollector flowCollector2;
        Integer numAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            i = 0;
            if (i >= 5) {
            }
        } else if (i2 == 1) {
            i = this.I$0;
            flowCollector2 = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            numAEQbTJ = C56443yFo.AEQbTJ(i);
            this.L$0 = flowCollector2;
            this.I$0 = i;
            this.label = 2;
            if (flowCollector2.emit(numAEQbTJ, this) == objCopydefault) {
            }
            flowCollector = flowCollector2;
            i++;
            if (i >= 5) {
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            flowCollector2 = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            flowCollector = flowCollector2;
            i++;
            if (i >= 5) {
                this.L$0 = flowCollector;
                this.I$0 = i;
                this.label = 1;
                if (DelayKt.delay(15000L, this) == objCopydefault) {
                    return objCopydefault;
                }
                flowCollector2 = flowCollector;
                numAEQbTJ = C56443yFo.AEQbTJ(i);
                this.L$0 = flowCollector2;
                this.I$0 = i;
                this.label = 2;
                if (flowCollector2.emit(numAEQbTJ, this) == objCopydefault) {
                    return objCopydefault;
                }
                flowCollector = flowCollector2;
                i++;
                if (i >= 5) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
