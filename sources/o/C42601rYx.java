package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryResponse;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryType;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationEntryPointEnum;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.UnViewedNotificationResp;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.ViewAllNotificationResp;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.data.remote.MessageManagementService;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.data.remote.model.EmptyResponse;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.model.NotificationReadAllRequest;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.model.NotificationViewAllRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rYx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C42601rYx {
    public final MessageManagementService KWHzl;

    @yCM
    public C42601rYx(@NotNull MessageManagementService messageManagementService) {
        Intrinsics.checkNotNullParameter(messageManagementService, "");
        this.KWHzl = messageManagementService;
    }

    public final java.lang.Object copydefault(java.lang.Integer num, java.lang.String str, NotificationCategoryType notificationCategoryType, java.lang.Long l, @NotNull Continuation<? super ResponseData<java.util.List<SystemNotification>>> continuation) {
        return this.KWHzl.getSystemNotificationList(num, str, notificationCategoryType, l, continuation);
    }

    public final java.lang.Object KWHzl(@NotNull NotificationEntryPointEnum notificationEntryPointEnum, @NotNull Continuation<? super ResponseData<NotificationCategoryResponse>> continuation) {
        return this.KWHzl.getSystemNotificationCategoryList(notificationEntryPointEnum, continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull C42595rYr c42595rYr, @NotNull Continuation<? super ResponseData<EmptyResponse>> continuation) {
        return this.KWHzl.updateSystemNotificationReadStatus(c42595rYr, continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull NotificationReadAllRequest notificationReadAllRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return this.KWHzl.updateAllSystemNotificationReadStatus(notificationReadAllRequest, continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull NotificationViewAllRequest notificationViewAllRequest, @NotNull Continuation<? super ResponseData<ViewAllNotificationResp>> continuation) {
        return this.KWHzl.markAllSystemNotificationViewed(notificationViewAllRequest, continuation);
    }

    public static /* synthetic */ java.lang.Object getUnviewedNotificationCount$default(C42601rYx c42601rYx, java.util.List list, NotificationCategoryType notificationCategoryType, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            notificationCategoryType = null;
        }
        return c42601rYx.copydefault(list, notificationCategoryType, continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, NotificationCategoryType notificationCategoryType, @NotNull Continuation<? super ResponseData<UnViewedNotificationResp>> continuation) {
        return this.KWHzl.getUnviewedNotificationCount(list, notificationCategoryType, continuation);
    }
}
