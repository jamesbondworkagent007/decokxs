package o;

import com.okinc.business.web3pay.lib.features.onchaintransaction.model.EnsAddressRequest;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.EnsAddressResponse;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.GetChainsActivationInfoResp;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.GetSupportNetworkResponse;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.PayToAddressBalanceResp;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.ResultForRiskData;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.TravelRuleRequest;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.TravelRuleResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.lrv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31329lrv {
    @POST("/priapi/v5/smart-account/travel-rule/check-and-create")
    java.lang.Object AEQbTJ(@Body @NotNull TravelRuleRequest travelRuleRequest, @NotNull Continuation<? super ResponseData<TravelRuleResponse>> continuation);

    @GET("priapi/v5/smart-account/asset/pay-to-address/list")
    java.lang.Object AEQbTJ(@NotNull @Query("chainIndex") java.lang.String str, @NotNull Continuation<? super ResponseData<PayToAddressBalanceResp>> continuation);

    @GET("priapi/v5/smart-account/v1/user/activation-info")
    java.lang.Object AEQbTJ(@NotNull @Query("chainIndexList") java.util.List<java.lang.String> list, @NotNull Continuation<? super ResponseData<GetChainsActivationInfoResp>> continuation);

    @GET("priapi/v5/smart-account/risk/check-to-address")
    java.lang.Object KWHzl(@NotNull @Query("chainIndex") java.lang.String str, @NotNull @Query("toAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<ResultForRiskData>> continuation);

    @POST("priapi/v5/smart-account/ens/domain-address")
    java.lang.Object copydefault(@Body @NotNull EnsAddressRequest ensAddressRequest, @NotNull Continuation<? super ResponseData<EnsAddressResponse>> continuation);

    @GET("priapi/v5/smart-account/support/network")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<java.util.List<GetSupportNetworkResponse>>> continuation);
}
