package com.okinc.okimcore.feature.user.repository.remote.inhouseim;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.remote.IMAuthRequest;
import com.okinc.okimcore.model.remote.IMAuthResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMAuthService {
    @POST("/priapi/v1/im/auth/v1/token/anonymous-token")
    Object getIMToken(@Body @NotNull IMAuthRequest iMAuthRequest, @NotNull Continuation<? super ResponseData<IMAuthResponse>> continuation);
}
