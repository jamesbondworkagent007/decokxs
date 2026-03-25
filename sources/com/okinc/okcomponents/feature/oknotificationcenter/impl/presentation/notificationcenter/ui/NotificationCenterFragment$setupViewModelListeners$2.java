package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui;

import androidx.core.view.KeyEventDispatcher;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C44656saz;
import o.C56391yDq;
import o.C56442yFn;
import o.rXS;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class NotificationCenterFragment$setupViewModelListeners$2 extends SuspendLambda implements yHO<CoroutineScope, Integer, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44656saz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCenterFragment$setupViewModelListeners$2(C44656saz c44656saz, Continuation<? super NotificationCenterFragment$setupViewModelListeners$2> continuation) {
        super(3, continuation);
        this.this$0 = c44656saz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, Integer num, Continuation<? super Unit> continuation) {
        NotificationCenterFragment$setupViewModelListeners$2 notificationCenterFragment$setupViewModelListeners$2 = new NotificationCenterFragment$setupViewModelListeners$2(this.this$0, continuation);
        notificationCenterFragment$setupViewModelListeners$2.L$0 = num;
        return notificationCenterFragment$setupViewModelListeners$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Integer num = (Integer) this.L$0;
            KeyEventDispatcher.Component componentRequireActivity = this.this$0.requireActivity();
            rXS rxs = componentRequireActivity instanceof rXS ? (rXS) componentRequireActivity : null;
            if (rxs != null) {
                rxs.copydefault(num != null ? num.intValue() : 0);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
