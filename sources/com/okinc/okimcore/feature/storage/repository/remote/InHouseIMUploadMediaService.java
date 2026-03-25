package com.okinc.okimcore.feature.storage.repository.remote;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.remote.UploadImageBody;
import com.okinc.okimcore.model.remote.UploadImageResponse;
import com.okinc.okimcore.model.remote.UploadMediaResponse;
import kotlin.coroutines.Continuation;
import o.AbstractC58185ywX;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMUploadMediaService {
    @POST("v3/users/im/group/images")
    AbstractC58185ywX<ResponseData<UploadImageResponse>> updateGroupAvatar(@Body @NotNull UploadImageBody uploadImageBody);

    @POST("/priapi/v1/im/media/v1/upload")
    @Multipart
    Object uploadMediaForSocketMessage(@NotNull @Part MultipartBody.Part part, @Query(RemoteMessageConst.Notification.CHANNEL_ID) String str, @Query("isBulkMessage") boolean z, @NotNull Continuation<? super ResponseData<UploadMediaResponse>> continuation);

    @POST("/priapi/v1/im/media/v1/upload/without-channel")
    @Multipart
    Object uploadMediaWithoutChannel(@NotNull @Part MultipartBody.Part part, @Query("isBulkMessage") Boolean bool, @Header("OK-VERIFY-TOKEN") @NotNull String str, @NotNull Continuation<? super ResponseData<UploadMediaResponse>> continuation);

    public static final class Application {
        public static /* synthetic */ Object uploadMediaWithoutChannel$default(InHouseIMUploadMediaService inHouseIMUploadMediaService, MultipartBody.Part part, Boolean bool, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadMediaWithoutChannel");
            }
            if ((i & 2) != 0) {
                bool = null;
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return inHouseIMUploadMediaService.uploadMediaWithoutChannel(part, bool, str, continuation);
        }
    }
}
