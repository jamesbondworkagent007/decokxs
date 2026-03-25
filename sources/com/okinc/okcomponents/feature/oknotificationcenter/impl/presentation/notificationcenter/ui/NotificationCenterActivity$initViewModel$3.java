package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.rZK;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCenterActivity$initViewModel$3 extends SuspendLambda implements yHO<CoroutineScope, NotificationSettingChannel, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationCenterActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCenterActivity$initViewModel$3(NotificationCenterActivity notificationCenterActivity, Continuation<? super NotificationCenterActivity$initViewModel$3> continuation) {
        super(3, continuation);
        this.this$0 = notificationCenterActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, NotificationSettingChannel notificationSettingChannel, Continuation<? super Unit> continuation) {
        NotificationCenterActivity$initViewModel$3 notificationCenterActivity$initViewModel$3 = new NotificationCenterActivity$initViewModel$3(this.this$0, continuation);
        notificationCenterActivity$initViewModel$3.L$0 = notificationSettingChannel;
        return notificationCenterActivity$initViewModel$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            rZK.Companion.KWHzl(this.this$0, (NotificationSettingChannel) this.L$0, AppNotificationBizType.CEFI.getType());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
