package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okmarket.ui.market.remind.data.model.TokenPriceResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.tev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC46851tev {
    @GET("/priapi/v1/dx/market/v2/trading/metrics")
    java.lang.Object KWHzl(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<TokenPriceResponse>> continuation);
}
