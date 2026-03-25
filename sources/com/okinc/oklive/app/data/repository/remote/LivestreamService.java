package com.okinc.oklive.app.data.repository.remote;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse;
import com.okinc.oklive.app.data.model.remote.LivestreamPreviewRequest;
import com.okinc.oklive.app.data.model.remote.LivestreamStatusResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
public interface LivestreamService {
    @GET("/priapi/v1/im/livestream/v1/query-invite")
    Object fetchModeratorInvitationStatus(@NotNull @Query("shareCode") String str, @NotNull Continuation<? super ResponseData<LiveStreamStatusModelResponse>> continuation);

    @GET("/priapi/v1/im/livestream/v1/info")
    Object getLivestreamInfo(@NotNull @Query(RemoteMessageConst.Notification.CHANNEL_ID) String str, @Query("ipRegion") String str2, @NotNull Continuation<? super ResponseData<LivestreamInfoResponse>> continuation);

    @POST("/priapi/v1/im/livestream/v1/preview")
    Object getLivestreamPreview(@Body @NotNull LivestreamPreviewRequest livestreamPreviewRequest, @NotNull Continuation<? super ResponseData<LivestreamInfoResponse>> continuation);

    @GET("/priapi/v1/im/livestream/stream/v1/status")
    Object getLivestreamStatus(@NotNull @Query("shareCode") String str, @NotNull Continuation<? super ResponseData<LivestreamStatusResponse>> continuation);

    @POST("/priapi/v1/im/livestream/management/v1/public")
    Object getRecordedStreams(@Body @NotNull RecordedStreamsRequest recordedStreamsRequest, @NotNull Continuation<? super ResponseData<RecordedStreamsResponse>> continuation);

    @GET("/priapi/v1/im/livestream/recording/v1/info")
    Object getRecordingInfo(@Query("shareCode") String str, @Query(RemoteMessageConst.Notification.CHANNEL_ID) String str2, @Query("ipRegion") String str3, @NotNull Continuation<? super ResponseData<RecordingInfoResponse>> continuation);
}
