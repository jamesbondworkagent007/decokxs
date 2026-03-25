package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.viewmodel.NotificationCenterViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C44656saz;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class NotificationCenterFragment$setupViewModelListeners$4 extends SuspendLambda implements yHO<CoroutineScope, NotificationCenterViewModel.TaskDescription, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44656saz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCenterFragment$setupViewModelListeners$4(C44656saz c44656saz, Continuation<? super NotificationCenterFragment$setupViewModelListeners$4> continuation) {
        super(3, continuation);
        this.this$0 = c44656saz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, NotificationCenterViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
        NotificationCenterFragment$setupViewModelListeners$4 notificationCenterFragment$setupViewModelListeners$4 = new NotificationCenterFragment$setupViewModelListeners$4(this.this$0, continuation);
        notificationCenterFragment$setupViewModelListeners$4.L$0 = taskDescription;
        return notificationCenterFragment$setupViewModelListeners$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd((NotificationCenterViewModel.TaskDescription) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
