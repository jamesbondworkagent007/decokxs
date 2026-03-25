package com.okinc.okimcore.feature.share.repository.remote;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.remote.ShareContentRequest;
import com.okinc.okimcore.model.remote.ShareContentResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes10.dex */
public interface IMShareService {
    @POST("/priapi/v1/im/message/v1/share-to-im")
    Object shareContent(@Body @NotNull ShareContentRequest shareContentRequest, @Header("OK-VERIFY-TOKEN") @NotNull String str, @NotNull Continuation<? super ResponseData<ShareContentResponse>> continuation);
}
