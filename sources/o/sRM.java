package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.stickers.remote.model.RemoveStickerRequest;
import com.okinc.okimcore.stickers.remote.model.RemoveStickerResponse;
import com.okinc.okimcore.stickers.remote.model.SaveStickerRequest;
import com.okinc.okimcore.stickers.remote.model.SaveStickerResponse;
import com.okinc.okimcore.stickers.remote.model.StickerConfigResponse;
import com.okinc.okimcore.stickers.remote.model.StickerPacksResponse;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
public interface sRM {
    @POST("/priapi/v1/im/sticker/v1/upload")
    @Multipart
    java.lang.Object AEQbTJ(@NotNull @Part MultipartBody.Part part, @Query("stickerPackId") java.lang.String str, @NotNull Continuation<? super ResponseData<StickerPacksResponse.SavedSticker>> continuation);

    @POST("/priapi/v1/im/sticker/v1/unsave")
    java.lang.Object EZpvd(@Body @NotNull RemoveStickerRequest removeStickerRequest, @NotNull Continuation<? super ResponseData<RemoveStickerResponse>> continuation);

    @GET("/priapi/v1/im/sticker/v1/config")
    java.lang.Object EZpvd(@Header("Cache-Strategy") @NotNull java.lang.String str, @Header("Cache-Expire") long j, @NotNull Continuation<? super ResponseData<StickerConfigResponse>> continuation);

    @GET("/priapi/v1/im/sticker/v1/list")
    java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<StickerPacksResponse>> continuation);

    @POST("/priapi/v1/im/sticker/v1/save")
    java.lang.Object OLrzqt(@Body @NotNull SaveStickerRequest saveStickerRequest, @NotNull Continuation<? super ResponseData<SaveStickerResponse>> continuation);
}
