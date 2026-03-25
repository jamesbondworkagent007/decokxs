package com.okinc.im.imui.group.joinreview.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C35781oDl;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinReviewViewModel$1$2$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super C35781oDl.TaskDescription>, Long, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ JoinReviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinReviewViewModel$1$2$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, JoinReviewViewModel joinReviewViewModel) {
        super(3, continuation);
        this.this$0 = joinReviewViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super C35781oDl.TaskDescription> flowCollector, Long l, Continuation<? super Unit> continuation) {
        JoinReviewViewModel$1$2$invokeSuspend$$inlined$flatMapLatest$1 joinReviewViewModel$1$2$invokeSuspend$$inlined$flatMapLatest$1 = new JoinReviewViewModel$1$2$invokeSuspend$$inlined$flatMapLatest$1(continuation, this.this$0);
        joinReviewViewModel$1$2$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector;
        joinReviewViewModel$1$2$invokeSuspend$$inlined$flatMapLatest$1.L$1 = l;
        return joinReviewViewModel$1$2$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            long jLongValue = ((Number) this.L$1).longValue();
            C44124sEe.imLogGroup$default("JoinReviewViewModel: Observing group approval updates for ID: " + jLongValue, null, 2, null);
            C35781oDl c35781oDl = this.this$0.gEmmrt;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = c35781oDl.OLrzqt(jLongValue, this);
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
        this.L$0 = null;
        this.label = 2;
        if (FlowKt.emitAll(flowCollector, (Flow) obj, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
