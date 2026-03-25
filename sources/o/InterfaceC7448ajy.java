package o;

import com.google.gson.JsonElement;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/* JADX INFO: renamed from: o.ajy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC7448ajy {
    @POST
    AbstractC58185ywX<JsonElement> EZpvd(@Url @NotNull java.lang.String str, @Body @NotNull java.util.Map<java.lang.String, java.lang.String> map, @HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map2);

    @GET
    AbstractC58185ywX<JsonElement> copydefault(@Url @NotNull java.lang.String str, @QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map2);
}
