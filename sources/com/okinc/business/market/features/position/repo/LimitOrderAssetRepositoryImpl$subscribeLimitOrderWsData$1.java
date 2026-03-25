package com.okinc.business.market.features.position.repo;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C9922bei;
import o.yDY;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class LimitOrderAssetRepositoryImpl$subscribeLimitOrderWsData$1 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends C9922bei>>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitOrderAssetRepositoryImpl$subscribeLimitOrderWsData$1(Continuation<? super LimitOrderAssetRepositoryImpl$subscribeLimitOrderWsData$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends C9922bei>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<C9922bei>>) flowCollector, th, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<C9922bei>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        LimitOrderAssetRepositoryImpl$subscribeLimitOrderWsData$1 limitOrderAssetRepositoryImpl$subscribeLimitOrderWsData$1 = new LimitOrderAssetRepositoryImpl$subscribeLimitOrderWsData$1(continuation);
        limitOrderAssetRepositoryImpl$subscribeLimitOrderWsData$1.L$0 = flowCollector;
        return limitOrderAssetRepositoryImpl$subscribeLimitOrderWsData$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            List listAhwBna = yDY.AhwBna();
            this.label = 1;
            if (flowCollector.emit(listAhwBna, this) == objCopydefault) {
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
