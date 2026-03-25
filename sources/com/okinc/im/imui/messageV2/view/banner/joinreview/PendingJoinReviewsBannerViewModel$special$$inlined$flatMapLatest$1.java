package com.okinc.im.imui.messageV2.view.banner.joinreview;

import com.okinc.im.imui.messageV2.view.banner.joinreview.PendingJoinReviewsBannerViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.oDI;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class PendingJoinReviewsBannerViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super Integer>, Long, Continuation<? super Unit>, Object> {
    final /* synthetic */ oDI $observeGroupInfoUseCase$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingJoinReviewsBannerViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, oDI odi) {
        super(3, continuation);
        this.$observeGroupInfoUseCase$inlined = odi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super Integer> flowCollector, Long l, Continuation<? super Unit> continuation) {
        PendingJoinReviewsBannerViewModel$special$$inlined$flatMapLatest$1 pendingJoinReviewsBannerViewModel$special$$inlined$flatMapLatest$1 = new PendingJoinReviewsBannerViewModel$special$$inlined$flatMapLatest$1(continuation, this.$observeGroupInfoUseCase$inlined);
        pendingJoinReviewsBannerViewModel$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        pendingJoinReviewsBannerViewModel$special$$inlined$flatMapLatest$1.L$1 = l;
        return pendingJoinReviewsBannerViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            PendingJoinReviewsBannerViewModel.TaskDescription taskDescription = new PendingJoinReviewsBannerViewModel.TaskDescription(FlowKt.filterNotNull(this.$observeGroupInfoUseCase$inlined.AEQbTJ(String.valueOf(((Number) this.L$1).longValue()))));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, taskDescription, this) == objCopydefault) {
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
