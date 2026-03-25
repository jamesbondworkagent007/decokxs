package com.okinc.oklive.app.data.repository.remote;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.oklive.app.data.model.remote.LiveAuthRequest;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes10.dex */
public interface LiveAuthService {
    @POST("/priapi/v1/im/auth/v1/token/anonymous-token")
    Object getIMToken(@Body @NotNull LiveAuthRequest liveAuthRequest, @NotNull Continuation<? super ResponseData<LiveAuthResponse>> continuation);
}
