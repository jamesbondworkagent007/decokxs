package o;

import com.okinc.market.quotation.data.model.DexChainGroupV2Po;
import com.okinc.market.quotation.data.model.DexRiskPo;
import com.okinc.market.quotation.data.model.DexTokenListRequest;
import com.okinc.market.quotation.data.model.DexTokenPo;
import com.okinc.network.okg.response.ResponseData;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.qqp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC41440qqp {
    @GET("/priapi/v5/rubik/dex/rank")
    java.lang.Object KWHzl(@NotNull @Query("chainIds") java.lang.String str, @NotNull @Query("rankBy") java.lang.String str2, @NotNull @Query("periodType") java.lang.String str3, @Query("desc") boolean z, @NotNull Continuation<? super ResponseData<java.util.List<DexTokenPo>>> continuation);

    @GET("/priapi/v5/rubik/dex/rank")
    java.lang.Object OLrzqt(@NotNull @Query("chainIds") java.lang.String str, @NotNull @Query("rankBy") java.lang.String str2, @NotNull @Query("periodType") java.lang.String str3, @Query("pageSize") int i, @Query("desc") boolean z, @NotNull Continuation<? super ResponseData<java.util.List<DexTokenPo>>> continuation);

    @GET("/priapi/v5/rubik/search/cedefi")
    java.lang.Object OLrzqt(@NotNull @Query(JwtUtilsKt.DID_METHOD_KEY) java.lang.String str, @NotNull @Query("periodType") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<DexTokenPo>>> continuation);

    @GET("/priapi/v5/rubik/dex/boost/rank")
    java.lang.Object OLrzqt(@NotNull @Query("periodType") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<DexTokenPo>>> continuation);

    @GET("/priapi/v5/rubik/dex/rank/tab-list")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<java.util.List<DexChainGroupV2Po>>> continuation);

    @GET("/priapi/v5/rubik/cedefi/token-risk")
    java.lang.Object copydefault(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("contractAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<DexRiskPo>> continuation);

    @POST("/priapi/v5/rubik/dex/details")
    java.lang.Object copydefault(@Body @NotNull java.util.List<DexTokenListRequest> list, @NotNull Continuation<? super ResponseData<java.util.List<DexTokenPo>>> continuation);
}
