package o;

import com.okinc.business.market.data.model.VibesChartData;
import com.okinc.business.market.features.vibes.domain.VibesKolData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: o.huN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC23231huN {
    @GET("/priapi/v1/dx/market/v2/token/vibe/top-kol")
    java.lang.Object OLrzqt(@NotNull @Query("chainIndex") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @Query("sortType") int i, @Query("kolTopType") int i2, @Query("timeRangeType") int i3, @NotNull Continuation<? super ResponseData<java.util.List<VibesKolData>>> continuation);

    @GET("/priapi/v1/dx/market/v2/token/vibe/info")
    java.lang.Object copydefault(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<VibesChartData>> continuation);
}
