package o;

import com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsResp;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.oRy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC36172oRy {
    @GET("/priapi/v5/market/index-components")
    java.lang.Object AEQbTJ(@NotNull @Query("index") java.lang.String str, @NotNull Continuation<? super ResponseData<IndexComponentsResp>> continuation);
}
