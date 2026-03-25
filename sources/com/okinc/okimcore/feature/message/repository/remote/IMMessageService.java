package com.okinc.okimcore.feature.message.repository.remote;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.remote.MessageReadInfo;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
public interface IMMessageService {
    @GET("/priapi/v1/im/message/v1/read-count")
    Object getReadCount(@Query(RemoteMessageConst.Notification.CHANNEL_ID) long j, @Query("seq") long j2, @NotNull Continuation<? super ResponseData<MessageReadInfo>> continuation);
}
