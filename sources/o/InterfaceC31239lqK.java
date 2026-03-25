package o;

import com.okinc.business.web3pay.lib.features.coinprice.model.CoinPrice;
import com.okinc.business.web3pay.lib.features.coinprice.model.CoinPriceRequest;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.lqK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31239lqK {
    @POST("/priapi/v5/smart-account/asset/query-token-price")
    java.lang.Object EZpvd(@Body @NotNull CoinPriceRequest coinPriceRequest, @NotNull Continuation<? super ResponseData<CoinPrice>> continuation);
}
