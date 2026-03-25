package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryType;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.domain.notificationcenter.FetchNotificationListUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rYU {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final C42601rYx KWHzl;

    @yCM
    public rYU(@NotNull C42601rYx c42601rYx) {
        Intrinsics.checkNotNullParameter(c42601rYx, "");
        this.KWHzl = c42601rYx;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rYU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, java.lang.Long l, java.lang.Integer num, @NotNull Continuation<? super java.util.List<SystemNotification>> continuation) throws java.lang.Throwable {
        FetchNotificationListUseCase$execute$1 fetchNotificationListUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof FetchNotificationListUseCase$execute$1) {
            fetchNotificationListUseCase$execute$1 = (FetchNotificationListUseCase$execute$1) continuation;
            int i = fetchNotificationListUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchNotificationListUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchNotificationListUseCase$execute$1 = new FetchNotificationListUseCase$execute$1(this, continuation);
            }
        }
        FetchNotificationListUseCase$execute$1 fetchNotificationListUseCase$execute$12 = fetchNotificationListUseCase$execute$1;
        java.lang.Object objCopydefault = fetchNotificationListUseCase$execute$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = fetchNotificationListUseCase$execute$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                pUU.KWHzl("FetchNotificationConversationUseCase", "Notification Center Api execute...");
                C42601rYx c42601rYx = this.KWHzl;
                NotificationCategoryType notificationCategoryType = NotificationCategoryType.New;
                fetchNotificationListUseCase$execute$12.L$0 = str;
                fetchNotificationListUseCase$execute$12.label = 1;
                objCopydefault = c42601rYx.copydefault(num, str, notificationCategoryType, l, fetchNotificationListUseCase$execute$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) fetchNotificationListUseCase$execute$12.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            responseData = (ResponseData) objCopydefault;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0) {
            stateListAnimator = new AbstractC43419rot.StateListAnimator(responseData.getData());
            if (stateListAnimator instanceof AbstractC43419rot.ActionBar) {
                java.util.List list = (java.util.List) stateListAnimator.AEQbTJ();
                return list == null ? yDY.AhwBna() : list;
            }
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl();
            pUU.copydefault("FetchNotificationConversationUseCase", "fetchNotificationList failed: " + str + " => " + oKServerException);
            throw oKServerException;
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        if (stateListAnimator instanceof AbstractC43419rot.ActionBar) {
        }
    }
}
