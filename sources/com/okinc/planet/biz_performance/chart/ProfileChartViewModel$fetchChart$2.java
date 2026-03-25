package com.okinc.planet.biz_performance.chart;

import com.okinc.planet.biz_performance.data.ProfileChartTypeDto;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC46197tLk;
import o.C56391yDq;
import o.C56442yFn;
import o.tBA;
import o.tBH;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfileChartViewModel$fetchChart$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProfileChartTypeDto $chartType;
    final /* synthetic */ Integer $days;
    final /* synthetic */ boolean $preview;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ tBA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileChartViewModel$fetchChart$2(tBA tba, ProfileChartTypeDto profileChartTypeDto, Integer num, boolean z, Continuation<? super ProfileChartViewModel$fetchChart$2> continuation) {
        super(2, continuation);
        this.this$0 = tba;
        this.$chartType = profileChartTypeDto;
        this.$days = num;
        this.$preview = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileChartViewModel$fetchChart$2(this.this$0, this.$chartType, this.$days, this.$preview, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfileChartViewModel$fetchChart$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        AbstractC46197tLk.TaskDescription taskDescription;
        MutableStateFlow mutableStateFlow;
        AbstractC46197tLk.TaskDescription taskDescription2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow2 = this.this$0.EZpvd;
            do {
                value = mutableStateFlow2.getValue();
                taskDescription = AbstractC46197tLk.Companion;
            } while (!mutableStateFlow2.compareAndSet(value, AbstractC46197tLk.TaskDescription.loading$default(taskDescription, false, ((AbstractC46197tLk) value).copydefault(), 1, null)));
            mutableStateFlow = this.this$0.EZpvd;
            tBH tbh = this.this$0.AYXKKw;
            String strKWHzl = this.this$0.KWHzl();
            if (strKWHzl == null) {
                return Unit.INSTANCE;
            }
            tBH.StateListAnimator stateListAnimator = new tBH.StateListAnimator(this.$chartType, this.$days, strKWHzl, this.$preview, null);
            this.L$0 = mutableStateFlow;
            this.L$1 = taskDescription;
            this.label = 1;
            obj = tbh.KWHzl(stateListAnimator, (Continuation) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            taskDescription2 = taskDescription;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription2 = (AbstractC46197tLk.TaskDescription) this.L$1;
            mutableStateFlow = (MutableStateFlow) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        mutableStateFlow.setValue(taskDescription2.KWHzl(obj));
        return Unit.INSTANCE;
    }
}
