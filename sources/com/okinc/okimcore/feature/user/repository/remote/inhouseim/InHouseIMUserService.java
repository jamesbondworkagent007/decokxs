package com.okinc.okimcore.feature.user.repository.remote.inhouseim;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.remote.InHouseUserInfo;
import com.okinc.okimcore.model.remote.ResultDataResponse;
import com.okinc.okimcore.model.remote.UpdateSecuritySettingRequest;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMUserService {
    @GET("/priapi/v1/im/user/info/v1/query")
    Object getCurrentUserInfo(@NotNull Continuation<? super ResponseData<InHouseUserInfo>> continuation);

    @POST("/priapi/v1/im/user/privacy/v1/update")
    Object setUserPrivacy(@Body @NotNull UpdateSecuritySettingRequest updateSecuritySettingRequest, @NotNull Continuation<? super ResponseData<ResultDataResponse>> continuation);
}
