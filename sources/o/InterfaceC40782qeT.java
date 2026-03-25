package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo;
import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverOverallStatsPo;
import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverOverallTrendPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: o.qeT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40782qeT {
    @GET("/priapi/v5/rubik/public/overall-market-trend")
    java.lang.Object KWHzl(@NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) java.lang.String str, @Query("type") int i, @Query("coin") java.lang.String str2, @NotNull Continuation<? super ResponseData<MarketDiscoverOverallTrendPo>> continuation);

    @GET("/priapi/v5/rubik/discover2/market-flow")
    java.lang.Object KWHzl(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<MarketDiscoverFlowPo>> continuation);

    @GET("/priapi/v5/rubik/public/overall-market-stats")
    java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<MarketDiscoverOverallStatsPo>> continuation);
}
