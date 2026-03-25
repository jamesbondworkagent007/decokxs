package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.data.po.TrendingCategoriesPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.qjg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC41060qjg {
    @GET("/priapi/v5/rubik/discover2/categories-summary")
    java.lang.Object EZpvd(@Query("size") java.lang.Integer num, @Query("zone") java.lang.String str, @Query("summaryType") java.lang.String str2, @Query("type") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<TrendingCategoriesPo>>> continuation);
}
