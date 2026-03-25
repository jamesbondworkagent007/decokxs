package com.okinc.okcomponents.feature.oknotificationcenter.impl.data.remote;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryResponse;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryType;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationEntryPointEnum;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.UnViewedNotificationResp;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.ViewAllNotificationResp;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.data.remote.model.EmptyResponse;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.model.NotificationReadAllRequest;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.model.NotificationViewAllRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.C42595rYr;
import o.C43417ror;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
public interface MessageManagementService {
    public static final Activity Companion = Activity.KWHzl;

    @GET("/priapi/v4/notify/mc/conversations/category/list")
    Object getSystemNotificationCategoryList(@NotNull @Query("entryPoint") NotificationEntryPointEnum notificationEntryPointEnum, @NotNull Continuation<? super ResponseData<NotificationCategoryResponse>> continuation);

    @GET("/priapi/v4/notify/mc/conversations/list")
    Object getSystemNotificationList(@Query("limit") Integer num, @Query("category") String str, @Query("categoryType") NotificationCategoryType notificationCategoryType, @Query("maxPushTimestamp") Long l, @NotNull Continuation<? super ResponseData<List<SystemNotification>>> continuation);

    @GET("/priapi/v4/notify/mc/conversations/unviewed")
    Object getUnviewedNotificationCount(@NotNull @Query("categories") List<String> list, @Query("categoryType") NotificationCategoryType notificationCategoryType, @NotNull Continuation<? super ResponseData<UnViewedNotificationResp>> continuation);

    @POST("/priapi/v4/notify/mc/view-all")
    Object markAllSystemNotificationViewed(@Body @NotNull NotificationViewAllRequest notificationViewAllRequest, @NotNull Continuation<? super ResponseData<ViewAllNotificationResp>> continuation);

    @POST("/priapi/v4/notify/mc/read-all")
    Object updateAllSystemNotificationReadStatus(@Body @NotNull NotificationReadAllRequest notificationReadAllRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v4/notify/mc/read")
    Object updateSystemNotificationReadStatus(@Body @NotNull C42595rYr c42595rYr, @NotNull Continuation<? super ResponseData<EmptyResponse>> continuation);

    public static final class Activity {
        public static final /* synthetic */ Activity KWHzl = new Activity();

        private Activity() {
        }

        public final MessageManagementService KWHzl() {
            return (MessageManagementService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(MessageManagementService.class));
        }
    }
}
