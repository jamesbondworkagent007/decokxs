package com.okinc.tradingbot.impl.botDetail.ui;

import com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C48194uIl;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class OverviewRingChartFragment$initView$1 extends SuspendLambda implements Function2<OverviewRingChartViewModel.TaskDescription, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C48194uIl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewRingChartFragment$initView$1(C48194uIl c48194uIl, Continuation<? super OverviewRingChartFragment$initView$1> continuation) {
        super(2, continuation);
        this.this$0 = c48194uIl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OverviewRingChartFragment$initView$1 overviewRingChartFragment$initView$1 = new OverviewRingChartFragment$initView$1(this.this$0, continuation);
        overviewRingChartFragment$initView$1.L$0 = obj;
        return overviewRingChartFragment$initView$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OverviewRingChartViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
        return ((OverviewRingChartFragment$initView$1) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd((OverviewRingChartViewModel.TaskDescription) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
