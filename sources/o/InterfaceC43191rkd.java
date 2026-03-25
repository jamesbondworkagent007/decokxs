package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.resource.request.MlnUpdateResp;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Url;

/* JADX INFO: renamed from: o.rkd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43191rkd {
    @GET
    AbstractC58185ywX<ResponseData<java.util.List<MlnUpdateResp>>> KWHzl(@Url @NotNull java.lang.String str);
}
