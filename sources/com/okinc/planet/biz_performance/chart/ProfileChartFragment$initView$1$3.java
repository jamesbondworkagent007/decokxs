package com.okinc.planet.biz_performance.chart;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33070mpX;
import o.C46277tOj;
import o.C56391yDq;
import o.C56442yFn;
import o.tBK;

/* JADX INFO: loaded from: classes16.dex */
public final class ProfileChartFragment$initView$1$3 extends SuspendLambda implements Function2<tBK.Activity, Continuation<? super Unit>, Object> {
    final /* synthetic */ C46277tOj $this_requireBinding;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileChartFragment$initView$1$3(C46277tOj c46277tOj, Continuation<? super ProfileChartFragment$initView$1$3> continuation) {
        super(2, continuation);
        this.$this_requireBinding = c46277tOj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfileChartFragment$initView$1$3 profileChartFragment$initView$1$3 = new ProfileChartFragment$initView$1$3(this.$this_requireBinding, continuation);
        profileChartFragment$initView$1$3.L$0 = obj;
        return profileChartFragment$initView$1$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tBK.Activity activity, Continuation<? super Unit> continuation) {
        return ((ProfileChartFragment$initView$1$3) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            tBK.Activity activity = (tBK.Activity) this.L$0;
            this.$this_requireBinding.copydefault.setText(C33070mpX.AYXKKw(activity.EZpvd().OLrzqt()));
            this.$this_requireBinding.OLrzqt.setText(activity.EZpvd().AEQbTJ());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
