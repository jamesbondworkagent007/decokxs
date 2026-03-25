package o;

import com.okinc.business.web3pay.lib.core.model.PagingData;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.CardAuthOrderDetailApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.CardReferralRewardsOrderDetailApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.ConvertOrderDetailApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.OrderDetailApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PagingDataRequest;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PayOrderApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PendingClaimOrderResponse;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.RedPacketOrderDetailApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.TransactionOrderApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.TransactionOrderListRequest;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.lsw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31383lsw {
    @POST("/priapi/v5/smart-account/order/pay/list")
    java.lang.Object AEQbTJ(@Body @NotNull PagingDataRequest pagingDataRequest, @NotNull Continuation<? super ResponseData<PagingData<PayOrderApiModel>>> continuation);

    @POST("/priapi/v5/smart-account/v1/history/list")
    java.lang.Object AEQbTJ(@Body @NotNull TransactionOrderListRequest transactionOrderListRequest, @NotNull Continuation<? super ResponseData<PagingData<TransactionOrderApiModel>>> continuation);

    @GET("/priapi/v5/smart-account/order/get-claim-list")
    java.lang.Object EZpvd(@Query("limit") java.lang.Integer num, @Query("cursor") java.lang.String str, @NotNull Continuation<? super ResponseData<PendingClaimOrderResponse>> continuation);

    @GET("/priapi/v5/smart-account/v1/order-detail/order-type/14")
    java.lang.Object EZpvd(@NotNull @Query("orderId") java.lang.String str, @NotNull Continuation<? super ResponseData<RedPacketOrderDetailApiModel>> continuation);

    @GET("/priapi/v5/smart-account/v1/order-detail/order-type/{orderType}")
    java.lang.Object KWHzl(@retrofit2.http.Path("orderType") int i, @NotNull @Query("orderId") java.lang.String str, @NotNull Continuation<? super ResponseData<OrderDetailApiModel>> continuation);

    @GET("/priapi/v5/smart-account/v1/order-detail/order-type/20101")
    java.lang.Object KWHzl(@NotNull @Query("orderId") java.lang.String str, @NotNull Continuation<? super ResponseData<CardAuthOrderDetailApiModel>> continuation);

    @GET("/priapi/v5/smart-account/v1/order-detail/order-type/20137")
    java.lang.Object OLrzqt(@NotNull @Query("orderId") java.lang.String str, @NotNull Continuation<? super ResponseData<CardReferralRewardsOrderDetailApiModel>> continuation);

    @GET("/priapi/v5/smart-account/v1/order-detail/order-type/17")
    java.lang.Object copydefault(@NotNull @Query("orderId") java.lang.String str, @NotNull Continuation<? super ResponseData<ConvertOrderDetailApiModel>> continuation);
}
