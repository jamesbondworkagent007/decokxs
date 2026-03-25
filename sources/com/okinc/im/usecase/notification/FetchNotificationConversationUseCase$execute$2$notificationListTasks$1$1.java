package com.okinc.im.usecase.notification;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35831oFh;
import o.C56391yDq;
import o.C56442yFn;
import o.rXL;
import o.rXQ;

/* JADX INFO: loaded from: classes18.dex */
public final class FetchNotificationConversationUseCase$execute$2$notificationListTasks$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SystemNotification>>, Object> {
    final /* synthetic */ rXL $channel;
    int label;
    final /* synthetic */ C35831oFh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchNotificationConversationUseCase$execute$2$notificationListTasks$1$1(C35831oFh c35831oFh, rXL rxl, Continuation<? super FetchNotificationConversationUseCase$execute$2$notificationListTasks$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c35831oFh;
        this.$channel = rxl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FetchNotificationConversationUseCase$execute$2$notificationListTasks$1$1(this.this$0, this.$channel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SystemNotification>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<SystemNotification>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<SystemNotification>> continuation) {
        return ((FetchNotificationConversationUseCase$execute$2$notificationListTasks$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            rXQ rxq = this.this$0.KWHzl;
            String strAEQbTJ = this.$channel.AEQbTJ();
            this.label = 1;
            obj = rxq.AEQbTJ(strAEQbTJ, null, 1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
