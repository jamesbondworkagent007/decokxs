package com.reown.android.keyserver.data.service;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.reown.android.keyserver.model.KeyServerBody;
import com.reown.android.keyserver.model.KeyServerHttpResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
public interface KeyServerService {
    @Headers({"Content-Type: application/json"})
    @POST("identity")
    Object registerIdentity(@Body @NotNull KeyServerBody.RegisterIdentity registerIdentity, @NotNull Continuation<? super Response<KeyServerHttpResponse.RegisterIdentity>> continuation);

    @Headers({"Content-Type: application/json"})
    @POST("invite")
    Object registerInvite(@Body @NotNull KeyServerBody.RegisterInvite registerInvite, @NotNull Continuation<? super Response<KeyServerHttpResponse.RegisterInvite>> continuation);

    @GET("identity")
    Object resolveIdentity(@NotNull @Query("publicKey") String str, @NotNull Continuation<? super Response<KeyServerHttpResponse.ResolveIdentity>> continuation);

    @GET("invite")
    Object resolveInvite(@NotNull @Query(MTAnalysisConstants.Account.KEY_ACCOUNT) String str, @NotNull Continuation<? super Response<KeyServerHttpResponse.ResolveInvite>> continuation);

    @Headers({"Content-Type: application/json"})
    @HTTP(hasBody = true, method = "DELETE", path = "identity")
    Object unregisterIdentity(@Body @NotNull KeyServerBody.UnregisterIdentity unregisterIdentity, @NotNull Continuation<? super Response<KeyServerHttpResponse.UnregisterIdentity>> continuation);

    @DELETE("invite")
    @Headers({"Content-Type: application/json"})
    Object unregisterInvite(@Body @NotNull KeyServerBody.UnregisterInvite unregisterInvite, @NotNull Continuation<? super Response<KeyServerHttpResponse.UnregisterInvite>> continuation);
}
