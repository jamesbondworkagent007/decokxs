package o;

import com.google.gson.JsonObject;
import kotlinx.serialization.json.JsonElement;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/* JADX INFO: renamed from: o.ajk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC7434ajk {
    @GET
    AbstractC58185ywX<JsonObject> KWHzl(@Url @NotNull java.lang.String str, @Header("Cache-Strategy") @NotNull java.lang.String str2, @Header("Cache-Expire") int i, @Header("Cache-Token-Valid") int i2, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Header("na-req-tag") @NotNull java.lang.String str3, @HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map2);

    @POST
    AbstractC58185ywX<JsonObject> KWHzl(@Url @NotNull java.lang.String str, @Header("Cache-Strategy") @NotNull java.lang.String str2, @Header("Cache-Expire") int i, @Header("Cache-Token-Valid") int i2, @Body @NotNull JsonElement jsonElement, @Header("na-req-tag") @NotNull java.lang.String str3, @Header("Encrypt-Strategy") @NotNull java.lang.String str4, @HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map);

    @POST
    @Multipart
    AbstractC58185ywX<JsonObject> OLrzqt(@Url @NotNull java.lang.String str, @NotNull @Part java.util.List<MultipartBody.Part> list, @Header("ReadTimeout") int i, @Header("WriteTimeout") int i2, @Header("na-req-tag") @NotNull java.lang.String str2, @HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map);

    /* JADX INFO: renamed from: o.ajk$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ AbstractC58185ywX mlnUploadFile$default(InterfaceC7434ajk interfaceC7434ajk, java.lang.String str, java.util.List list, int i, int i2, java.lang.String str2, java.util.Map map, int i3, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC7434ajk.OLrzqt(str, list, (i3 & 4) != 0 ? 200 : i, (i3 & 8) != 0 ? 200 : i2, str2, map);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mlnUploadFile");
        }
    }
}
