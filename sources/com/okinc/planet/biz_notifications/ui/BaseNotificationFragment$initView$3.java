package com.okinc.planet.biz_notifications.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC47868tyI;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class BaseNotificationFragment$initView$3 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ AbstractC47868tyI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseNotificationFragment$initView$3(AbstractC47868tyI abstractC47868tyI, Continuation<? super BaseNotificationFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = abstractC47868tyI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseNotificationFragment$initView$3 baseNotificationFragment$initView$3 = new BaseNotificationFragment$initView$3(this.this$0, continuation);
        baseNotificationFragment$initView$3.J$0 = ((Number) obj).longValue();
        return baseNotificationFragment$initView$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(long j, Continuation<? super Unit> continuation) {
        return ((BaseNotificationFragment$initView$3) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Long l, Continuation<? super Unit> continuation) {
        return invoke(l.longValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            long j = this.J$0;
            pUU.KWHzl("PlanetNotification", this.this$0.AEQbTJ() + " received unreadSetChanged: msgId=" + j);
            this.this$0.copydefault(j);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
