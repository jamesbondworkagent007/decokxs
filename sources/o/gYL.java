package o;

import com.okinc.business.dex.tee.domain.model.SignAndBroadcastParams;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes;
import com.okinc.business.dex.trade.core.domain.model.V6BatchBroadcastRequest;
import com.okinc.business.dex.trade.core.domain.model.V6BatchBroadcastResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastRequest;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dex.trade.core.domain.model.limit.PairRateParams;
import com.okinc.business.dex.trade.core.domain.model.limit.V2TokenPairRateResponseData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes5.dex */
public interface gYL {
    @POST("/priapi/v6/dx/trade/multi/calldata")
    java.lang.Object AEQbTJ(@Body @NotNull V6CalldataRequest v6CalldataRequest, @NotNull Continuation<? super ResponseData<V6CalldataResponseData>> continuation);

    @POST("/priapi/v6/dx/trade/multi/quote")
    java.lang.Object EZpvd(@Body @NotNull V6QuoteRequest v6QuoteRequest, @NotNull Continuation<? super ResponseData<V6QuoteResponseData>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v6/dx/trade/multi/batchBroadcast")
    java.lang.Object OLrzqt(@Body @NotNull V6BatchBroadcastRequest v6BatchBroadcastRequest, @NotNull Continuation<? super ResponseData<V6BatchBroadcastResponseData>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v6/dx/trade/multi/broadcast")
    java.lang.Object OLrzqt(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body @NotNull V6BroadcastRequest v6BroadcastRequest, @NotNull Continuation<? super ResponseData<V6BroadcastResponseData>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v6/dx/trade/multi/signAndBroadcast")
    java.lang.Object copydefault(@Body @NotNull SignAndBroadcastParams signAndBroadcastParams, @NotNull Continuation<? super ResponseData<SignAndBroadcastRes>> continuation);

    @POST("/priapi/v1/dx/strategy/limitOrder/tokenPairRateV2")
    java.lang.Object copydefault(@Body @NotNull PairRateParams pairRateParams, @NotNull Continuation<? super ResponseData<V2TokenPairRateResponseData>> continuation);

    @POST("/priapi/v6/dx/trade/multi/marketQuoteAndCalldata")
    java.lang.Object copydefault(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body @NotNull V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest, @NotNull Continuation<? super ResponseData<V6QuoteAndCalldataResponseData>> continuation);
}
