package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.data.po.MarketDiscoverOverviewTrendingCategoriesDetailPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.qjb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC41055qjb {
    @GET("/priapi/v5/rubik/discover2/categories-detail")
    java.lang.Object AEQbTJ(@NotNull @Query("categoryId") java.lang.String str, @NotNull Continuation<? super ResponseData<MarketDiscoverOverviewTrendingCategoriesDetailPo>> continuation);
}
