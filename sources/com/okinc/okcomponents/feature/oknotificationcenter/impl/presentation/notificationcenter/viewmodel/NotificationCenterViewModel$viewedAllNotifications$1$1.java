package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C42607rZc;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCenterViewModel$viewedAllNotifications$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $category;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationCenterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCenterViewModel$viewedAllNotifications$1$1(NotificationCenterViewModel notificationCenterViewModel, String str, Continuation<? super NotificationCenterViewModel$viewedAllNotifications$1$1> continuation) {
        super(2, continuation);
        this.this$0 = notificationCenterViewModel;
        this.$category = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationCenterViewModel$viewedAllNotifications$1$1 notificationCenterViewModel$viewedAllNotifications$1$1 = new NotificationCenterViewModel$viewedAllNotifications$1$1(this.this$0, this.$category, continuation);
        notificationCenterViewModel$viewedAllNotifications$1$1.L$0 = obj;
        return notificationCenterViewModel$viewedAllNotifications$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationCenterViewModel$viewedAllNotifications$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                NotificationCenterViewModel notificationCenterViewModel = this.this$0;
                String str = this.$category;
                Result.Application application = Result.Companion;
                C42607rZc c42607rZc = notificationCenterViewModel.fIwbmz;
                this.label = 1;
                obj = C42607rZc.execute$default(c42607rZc, str, false, this, 2, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) obj).booleanValue()));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        NotificationCenterViewModel notificationCenterViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            ((Boolean) objM7377constructorimpl).booleanValue();
            notificationCenterViewModel2.valueOf.setValue(C56443yFo.AEQbTJ(0));
        }
        NotificationCenterViewModel notificationCenterViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("NotificationCenterViewModel", "markAllSystemNotificationViewed error: " + thM7380exceptionOrNullimpl.getMessage());
            notificationCenterViewModel3.OLrzqt.setValue(thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }
}
