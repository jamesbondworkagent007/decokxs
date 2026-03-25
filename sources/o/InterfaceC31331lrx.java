package o;

import com.okinc.business.web3pay.lib.features.order.model.PaymentPageRequest;
import com.okinc.business.web3pay.lib.features.paytransaction.model.PurchaseOrderDetailResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.lrx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31331lrx {
    @POST("/priapi/v5/smart-account/v1/c2b/pay/paymentPageRender")
    java.lang.Object AEQbTJ(@Body @NotNull PaymentPageRequest paymentPageRequest, @NotNull Continuation<? super ResponseData<PurchaseOrderDetailResponse>> continuation);
}
