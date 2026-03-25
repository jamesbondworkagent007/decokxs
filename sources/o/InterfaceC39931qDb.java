package o;

import com.okinc.market.search.features.main.recommend.hot.data.po.SearchHotPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: renamed from: o.qDb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC39931qDb {
    @GET("/priapi/v5/rubik/search/hot-rank")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<java.util.List<SearchHotPo>>> continuation);
}
