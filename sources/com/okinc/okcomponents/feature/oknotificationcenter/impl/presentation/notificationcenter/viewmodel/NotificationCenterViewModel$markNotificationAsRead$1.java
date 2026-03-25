package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C42595rYr;
import o.C42601rYx;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCenterViewModel$markNotificationAsRead$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SystemNotification $systemNotification;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationCenterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCenterViewModel$markNotificationAsRead$1(NotificationCenterViewModel notificationCenterViewModel, SystemNotification systemNotification, Continuation<? super NotificationCenterViewModel$markNotificationAsRead$1> continuation) {
        super(2, continuation);
        this.this$0 = notificationCenterViewModel;
        this.$systemNotification = systemNotification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationCenterViewModel$markNotificationAsRead$1 notificationCenterViewModel$markNotificationAsRead$1 = new NotificationCenterViewModel$markNotificationAsRead$1(this.this$0, this.$systemNotification, continuation);
        notificationCenterViewModel$markNotificationAsRead$1.L$0 = obj;
        return notificationCenterViewModel$markNotificationAsRead$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationCenterViewModel$markNotificationAsRead$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                NotificationCenterViewModel notificationCenterViewModel = this.this$0;
                SystemNotification systemNotification = this.$systemNotification;
                C42601rYx c42601rYx = notificationCenterViewModel.ejfBZ;
                String businessIdentity = systemNotification.getBusinessIdentity();
                if (businessIdentity == null) {
                    businessIdentity = "";
                }
                C42595rYr c42595rYr = new C42595rYr(businessIdentity, C33129mqd.gEmmrt(systemNotification.getType()));
                this.label = 1;
                obj = c42601rYx.OLrzqt(c42595rYr, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        NotificationCenterViewModel notificationCenterViewModel2 = this.this$0;
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl();
            pUU.copydefault("NotificationCenterViewModel", "updateSystemNotificationReadStatus error: " + oKServerException.getMessage());
            notificationCenterViewModel2.OLrzqt.setValue(oKServerException.getMessage());
        }
        return Unit.INSTANCE;
    }
}
