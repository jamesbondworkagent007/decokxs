package o;

import com.okinc.market.search.features.main.entry.data.po.SearchRecommendPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
public interface qBQ {
    @GET("/priapi/v5/rubik/search/recommend")
    java.lang.Object OLrzqt(@Query("size") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<SearchRecommendPo>>> continuation);
}
