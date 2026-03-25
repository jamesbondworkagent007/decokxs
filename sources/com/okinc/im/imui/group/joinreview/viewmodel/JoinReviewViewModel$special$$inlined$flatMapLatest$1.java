package com.okinc.im.imui.group.joinreview.viewmodel;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinReviewViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super GroupInfo>, Long, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ JoinReviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinReviewViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, JoinReviewViewModel joinReviewViewModel) {
        super(3, continuation);
        this.this$0 = joinReviewViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super GroupInfo> flowCollector, Long l, Continuation<? super Unit> continuation) {
        JoinReviewViewModel$special$$inlined$flatMapLatest$1 joinReviewViewModel$special$$inlined$flatMapLatest$1 = new JoinReviewViewModel$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        joinReviewViewModel$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        joinReviewViewModel$special$$inlined$flatMapLatest$1.L$1 = l;
        return joinReviewViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            long jLongValue = ((Number) this.L$1).longValue();
            C44124sEe.imLogGroup$default("JoinReviewViewModel: Observing group info for ID: " + jLongValue, null, 2, null);
            Flow<GroupInfo> flowAEQbTJ = this.this$0.valueOf.AEQbTJ(String.valueOf(jLongValue));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowAEQbTJ, this) == objCopydefault) {
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
