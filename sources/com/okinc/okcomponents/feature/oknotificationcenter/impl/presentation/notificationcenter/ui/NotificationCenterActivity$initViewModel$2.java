package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCenterActivity$initViewModel$2 extends SuspendLambda implements yHO<CoroutineScope, String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationCenterActivity$initViewModel$2(Continuation<? super NotificationCenterActivity$initViewModel$2> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, String str, Continuation<? super Unit> continuation) {
        NotificationCenterActivity$initViewModel$2 notificationCenterActivity$initViewModel$2 = new NotificationCenterActivity$initViewModel$2(continuation);
        notificationCenterActivity$initViewModel$2.L$0 = str;
        return notificationCenterActivity$initViewModel$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            if (str != null && (!StringsKt__StringsKt.fARcdN((CharSequence) str))) {
                C55326xho.OLrzqt("[Debug] " + str);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
