package com.okinc.business.dex.trade.component.orderandposition.position.viewmodel;

import com.okinc.business.dex.trade.component.orderandposition.position.viewmodel.PositionComponentVewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C28438kal;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class PositionComponentVewModel$visiblePriceMap$1$3 extends SuspendLambda implements yHO<FlowCollector<? super Map<C28438kal, ? extends PositionComponentVewModel.TaskDescription>>, Throwable, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PositionComponentVewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionComponentVewModel$visiblePriceMap$1$3(PositionComponentVewModel positionComponentVewModel, Continuation<? super PositionComponentVewModel$visiblePriceMap$1$3> continuation) {
        super(3, continuation);
        this.this$0 = positionComponentVewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Map<C28438kal, ? extends PositionComponentVewModel.TaskDescription>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Map<C28438kal, PositionComponentVewModel.TaskDescription>>) flowCollector, th, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Map<C28438kal, PositionComponentVewModel.TaskDescription>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new PositionComponentVewModel$visiblePriceMap$1$3(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        this.this$0.valueOf.OLrzqt();
        return Unit.INSTANCE;
    }
}
