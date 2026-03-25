package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.traderadar.data.po.TradeRadarPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.qgf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40900qgf {
    @GET("/priapi/v5/rubik/discover2/trading-radar")
    java.lang.Object copydefault(@NotNull @Query("type") java.lang.String str, @Query("pageSize") int i, @Query("pageNum") int i2, @NotNull @Query("zone") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<TradeRadarPo>>> continuation);
}
