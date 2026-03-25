package o;

import com.okinc.business.web3pay.lib.features.uop.model.C2BUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateCancelTransferResponse;
import com.okinc.business.web3pay.lib.features.uop.model.CreateCancelTransferUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateCardAuthUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateCardAuthUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.CreateClaimRedPacketRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateClaimUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateClaimUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.CreateConvertUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateConvertUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.CreateOnChainTransferUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateOnChainTransferUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.CreatePayTransferUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreatePayTransferUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.CreateSaUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.CreateSendRedPacketRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateUpdateAccountUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateUpdateAccountUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.OrderUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.OrderUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.SendUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.SendUopResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.lsM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31347lsM {
    @POST("/priapi/v5/smart-account/v1/create-uop/order-type/8")
    java.lang.Object EZpvd(@Body @NotNull CreateCancelTransferUopRequest createCancelTransferUopRequest, @NotNull Continuation<? super ResponseData<CreateCancelTransferResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/create-uop/order-type/20101")
    java.lang.Object EZpvd(@Body @NotNull CreateCardAuthUopRequest createCardAuthUopRequest, @NotNull Continuation<? super ResponseData<CreateCardAuthUopResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/create-uop/order-type/15")
    java.lang.Object EZpvd(@Body @NotNull CreateClaimRedPacketRequest createClaimRedPacketRequest, @NotNull Continuation<? super ResponseData<CreateSaUopResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/create-uop/order-type/6")
    java.lang.Object EZpvd(@Body @NotNull CreateClaimUopRequest createClaimUopRequest, @NotNull Continuation<? super ResponseData<CreateClaimUopResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/create-uop/order-type/60000")
    java.lang.Object KWHzl(@Body @NotNull C2BUopRequest c2BUopRequest, @NotNull Continuation<? super ResponseData<OrderUopResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/create-uop/order-type/17")
    java.lang.Object KWHzl(@Body @NotNull CreateConvertUopRequest createConvertUopRequest, @NotNull Continuation<? super ResponseData<CreateConvertUopResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/create-uop/order-type/2")
    java.lang.Object KWHzl(@Body @NotNull CreateOnChainTransferUopRequest createOnChainTransferUopRequest, @NotNull Continuation<? super ResponseData<CreateOnChainTransferUopResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/create-uop/order-type/60000")
    java.lang.Object KWHzl(@Body @NotNull OrderUopRequest orderUopRequest, @NotNull Continuation<? super ResponseData<OrderUopResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/send-uop/order-type/20101")
    java.lang.Object KWHzl(@Body @NotNull SendUopRequest sendUopRequest, @NotNull Continuation<? super ResponseData<SendUopResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/send-uop/order-type/{orderType}")
    java.lang.Object OLrzqt(@retrofit2.http.Path("orderType") int i, @Body @NotNull SendUopRequest sendUopRequest, @Header("sessionIdFor2FA") java.lang.String str, @NotNull Continuation<? super ResponseData<SendUopResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/create-uop/order-type/3")
    java.lang.Object OLrzqt(@Body @NotNull CreateOnChainTransferUopRequest createOnChainTransferUopRequest, @NotNull Continuation<? super ResponseData<CreateOnChainTransferUopResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/create-uop/order-type/14")
    java.lang.Object OLrzqt(@Body @NotNull CreateSendRedPacketRequest createSendRedPacketRequest, @NotNull Continuation<? super ResponseData<CreateSaUopResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/create-uop/order-type/5")
    java.lang.Object copydefault(@Body @NotNull CreatePayTransferUopRequest createPayTransferUopRequest, @NotNull Continuation<? super ResponseData<CreatePayTransferUopResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/create-uop/order-type/13")
    java.lang.Object copydefault(@Body @NotNull CreateUpdateAccountUopRequest createUpdateAccountUopRequest, @NotNull Continuation<? super ResponseData<CreateUpdateAccountUopResponse>> continuation);
}
