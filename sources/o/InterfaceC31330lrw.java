package o;

import com.okinc.business.web3pay.lib.features.paytransaction.model.CancelClaimRequest;
import com.okinc.business.web3pay.lib.features.paytransaction.model.CancelClaimResponse;
import com.okinc.business.web3pay.lib.features.paytransaction.model.PurchaseOrderDetailResponse;
import com.okinc.business.web3pay.lib.features.paytransaction.model.PurchaseOrderQrCodeRequest;
import com.okinc.business.web3pay.lib.features.paytransaction.model.QueryC2BExchangeRateParams;
import com.okinc.business.web3pay.lib.features.paytransaction.model.QueryC2BExchangeRateResponse;
import com.okinc.business.web3pay.lib.features.paytransaction.model.QueryFxByExternalApiParams;
import com.okinc.business.web3pay.lib.features.paytransaction.model.QueryFxByExternalApiResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.lrw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31330lrw {
    @POST("priapi/v5/smart-account/v1/c2b/create/byExternalApi")
    java.lang.Object AEQbTJ(@Body @NotNull PurchaseOrderQrCodeRequest purchaseOrderQrCodeRequest, @NotNull Continuation<? super ResponseData<PurchaseOrderDetailResponse>> continuation);

    @POST("priapi/v5/smart-account/v1/c2b/query/decodeQrcode")
    java.lang.Object EZpvd(@Body @NotNull PurchaseOrderQrCodeRequest purchaseOrderQrCodeRequest, @NotNull Continuation<? super ResponseData<PurchaseOrderDetailResponse>> continuation);

    @POST("priapi/v5/smart-account/v1/c2b/pay/queryExchangeRate/byExternalApi")
    java.lang.Object EZpvd(@Body @NotNull QueryFxByExternalApiParams queryFxByExternalApiParams, @NotNull Continuation<? super ResponseData<QueryFxByExternalApiResponse>> continuation);

    @POST("priapi/v5/smart-account/v1/c2b/create/byExternalQrCode")
    java.lang.Object OLrzqt(@Body @NotNull PurchaseOrderQrCodeRequest purchaseOrderQrCodeRequest, @NotNull Continuation<? super ResponseData<PurchaseOrderDetailResponse>> continuation);

    @POST("priapi/v5/smart-account/v1/c2b/pay/queryExchangeRate")
    java.lang.Object OLrzqt(@Body @NotNull QueryC2BExchangeRateParams queryC2BExchangeRateParams, @NotNull Continuation<? super ResponseData<QueryC2BExchangeRateResponse>> continuation);

    @POST("priapi/v5/smart-account/transfer/claim-cancel")
    java.lang.Object copydefault(@Body @NotNull CancelClaimRequest cancelClaimRequest, @NotNull Continuation<? super ResponseData<CancelClaimResponse>> continuation);
}
