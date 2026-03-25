package o;

import com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasRequest;
import com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasResponse;
import com.okinc.business.web3pay.lib.features.gas.model.GetUpdateAccountGasRequest;
import com.okinc.business.web3pay.lib.features.gas.model.OnChainGasRequest;
import com.okinc.business.web3pay.lib.features.gas.model.OnChainGasResponse;
import com.okinc.business.web3pay.lib.features.gas.model.UpdateAccountGasInfoApiModel;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.lrn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31321lrn {
    @POST("/priapi/v5/smart-account/v1/get-uop-gas/order-type/3")
    java.lang.Object AEQbTJ(@Body @NotNull OnChainGasRequest onChainGasRequest, @NotNull Continuation<? super ResponseData<OnChainGasResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/get-uop-gas/order-type/2")
    java.lang.Object EZpvd(@Body @NotNull OnChainGasRequest onChainGasRequest, @NotNull Continuation<? super ResponseData<OnChainGasResponse>> continuation);

    @POST("/priapi/v5/smart-account/v1/get-uop-gas/order-type/13")
    java.lang.Object OLrzqt(@Body @NotNull GetUpdateAccountGasRequest getUpdateAccountGasRequest, @NotNull Continuation<? super ResponseData<UpdateAccountGasInfoApiModel>> continuation);

    @POST("/priapi/v5/smart-account/v1/get-uop-gas/order-type/17")
    java.lang.Object copydefault(@Body @NotNull GetConvertGasRequest getConvertGasRequest, @NotNull Continuation<? super ResponseData<GetConvertGasResponse>> continuation);
}
