package com.okinc.business.dex.trade.component.orderandposition.position.viewmodel;

import com.okinc.business.dex.trade.component.orderandposition.position.viewmodel.PositionComponentVewModel;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C19852gRs;
import o.C22416heu;
import o.C28434kah;
import o.C28438kal;
import o.C56391yDq;
import o.C56403yEb;
import o.C56424yEw;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class PositionComponentVewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super Map<C28438kal, ? extends PositionComponentVewModel.TaskDescription>>, Set<? extends C28438kal>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PositionComponentVewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionComponentVewModel$special$$inlined$flatMapLatest$1(Continuation continuation, PositionComponentVewModel positionComponentVewModel) {
        super(3, continuation);
        this.this$0 = positionComponentVewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super Map<C28438kal, ? extends PositionComponentVewModel.TaskDescription>> flowCollector, Set<? extends C28438kal> set, Continuation<? super Unit> continuation) {
        PositionComponentVewModel$special$$inlined$flatMapLatest$1 positionComponentVewModel$special$$inlined$flatMapLatest$1 = new PositionComponentVewModel$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        positionComponentVewModel$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        positionComponentVewModel$special$$inlined$flatMapLatest$1.L$1 = set;
        return positionComponentVewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Flow flowFlowOf;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            Set set = (Set) this.L$1;
            if (set.isEmpty() || C22416heu.ejfBZ()) {
                this.this$0.valueOf.OLrzqt();
                flowFlowOf = FlowKt.flowOf(C56424yEw.KWHzl());
                this.L$0 = null;
                this.label = 2;
                if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            Set<C28438kal> set2 = set;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(set2, 10));
            for (C28438kal c28438kal : set2) {
                arrayList.add(new HoldingAsset(c28438kal.copydefault(), null, c28438kal.OLrzqt(), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, false, 2147483642, null));
            }
            C28434kah c28434kah = this.this$0.valueOf;
            c28434kah.OLrzqt();
            this.L$0 = flowCollector;
            this.label = 1;
            objKWHzl = c28434kah.KWHzl(arrayList, this);
            if (objKWHzl == objCopydefault) {
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
            objKWHzl = obj;
        }
        flowFlowOf = FlowKt.onCompletion(C19852gRs.EZpvd(new PositionComponentVewModel.ActionBar((Flow) objKWHzl, this.this$0), 500L), new PositionComponentVewModel$visiblePriceMap$1$3(this.this$0, null));
        this.L$0 = null;
        this.label = 2;
        if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
