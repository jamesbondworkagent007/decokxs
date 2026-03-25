package com.reown.android.push.network;

import com.reown.android.internal.common.di.CoreNetworkModuleKt;
import com.reown.android.push.network.model.PushBody;
import com.reown.android.push.network.model.PushResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
public interface PushService {
    @POST("{projectId}/clients")
    Object register(@Path("projectId") @NotNull String str, @NotNull @Query("auth") String str2, @Body @NotNull PushBody pushBody, @NotNull Continuation<? super Response<PushResponse>> continuation);

    @DELETE("{projectId}/clients/{clientId}")
    Object unregister(@Path("projectId") @NotNull String str, @Path(CoreNetworkModuleKt.KEY_CLIENT_ID) @NotNull String str2, @NotNull Continuation<? super Response<PushResponse>> continuation);
}
