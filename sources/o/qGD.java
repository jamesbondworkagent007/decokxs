package o;

import com.okinc.market.search.features.main.root.data.po.SearchResultBotsTradersWeb3Po;
import com.okinc.market.search.features.main.root.data.po.SearchResultEarnProductPo;
import com.okinc.network.okg.response.ResponseData;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
public interface qGD {
    @GET("/priapi/v5/rubik/search/result")
    java.lang.Object OLrzqt(@NotNull @Query(JwtUtilsKt.DID_METHOD_KEY) java.lang.String str, @NotNull Continuation<? super ResponseData<SearchResultBotsTradersWeb3Po>> continuation);

    @GET("/v2/asset/earn/products")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<SearchResultEarnProductPo>> continuation);
}
