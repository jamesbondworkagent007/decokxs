package o;

import com.okinc.business.dex.tee.domain.model.CreateOrderParams;
import com.okinc.business.dex.trade.common.boost.model.LimitOrderConfirmParam;
import com.okinc.business.dex.trade.common.boost.model.LimitOrderConfirmResponse;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeConfig;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.main.limmitorder.bean.BizMode;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitSuggestCoinBean;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.huH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC23225huH {
    public static final Application Companion = Application.EZpvd;

    @GET("/priapi/v1/dx/strategy/limitOrder/calOrder")
    AbstractC58185ywX<ResponseData<LimitCalResult>> AEQbTJ(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("fromTokenAddress") java.lang.String str2, @NotNull @Query("toTokenAddress") java.lang.String str3, @NotNull @Query("fromAmount") java.lang.String str4, @NotNull @Query("exchangeRate") java.lang.String str5, @NotNull @Query("toAmount") java.lang.String str6, @Query("triggerPrice") java.lang.String str7, @Query("currentPrice") java.lang.String str8, @NotNull @Query("slippage") java.lang.String str9);

    @GET("/priapi/v1/dx/strategy/limitOrder/recommend")
    AbstractC58185ywX<ResponseData<LimitSuggestCoinBean>> EZpvd(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("fromTokenAddress") java.lang.String str2, @Query("toTokenAddress") java.lang.String str3);

    @GET("/priapi/v1/dx/strategy/limitOrder/tokenPairRate")
    java.lang.Object KWHzl(@Query("chainId") long j, @NotNull @Query("fromTokenAddress") java.lang.String str, @NotNull @Query("toTokenAddress") java.lang.String str2, @Query("fromAmount") java.lang.String str3, @Query("userWalletAddress") java.lang.String str4, @Query("dexIds") java.lang.String str5, @Query("refCode") java.lang.String str6, @NotNull Continuation<? super ResponseData<LimitPairRateResponse>> continuation);

    @POST("/priapi/v1/dx/strategy/limitOrder/confirmOrder")
    java.lang.Object KWHzl(@Body @NotNull LimitOrderConfirmParam limitOrderConfirmParam, @NotNull Continuation<? super ResponseData<LimitOrderConfirmResponse>> continuation);

    @InterfaceC9841bdG
    @GET("/priapi/v1/dx/strategy/common/openOrderDetail")
    java.lang.Object KWHzl(@Query("accountId") java.lang.String str, @Query("strategyMode") java.lang.Integer num, @Query("orderType") int i, @NotNull @Query("orderId") java.lang.String str2, @NotNull Continuation<? super ResponseData<LimitOrderDetailBean>> continuation);

    @GET("/priapi/v1/dx/strategy/common/expireTimeConfig")
    AbstractC58185ywX<ResponseData<java.util.List<ExpireTimeConfig>>> KWHzl(@Query("bizMode") int i);

    @GET("/priapi/v1/dx/strategy/common/chain/list")
    java.lang.Object OLrzqt(@Query("bizMode") int i, @NotNull Continuation<? super ResponseData<java.util.List<DefiChainInfo>>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v1/dx/strategy/limitOrder/createOrder")
    java.lang.Object copydefault(@Body @NotNull CreateOrderParams createOrderParams, @NotNull Continuation<? super ResponseData<LimitOrderDetailBean>> continuation);

    /* JADX INFO: renamed from: o.huH$Application */
    public static final class Application {
        public static final /* synthetic */ Application EZpvd = new Application();

        private Application() {
        }

        public final InterfaceC23225huH copydefault(@NotNull C43280rmM c43280rmM) {
            Intrinsics.checkNotNullParameter(c43280rmM, "");
            return (InterfaceC23225huH) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC23225huH.class), c43280rmM);
        }
    }

    /* JADX INFO: renamed from: o.huH$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ java.lang.Object getLimitOrderDetail$default(InterfaceC23225huH interfaceC23225huH, java.lang.String str, java.lang.Integer num, int i, java.lang.String str2, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLimitOrderDetail");
            }
            if ((i2 & 2) != 0) {
                num = null;
            }
            return interfaceC23225huH.KWHzl(str, num, i, str2, continuation);
        }

        public static /* synthetic */ java.lang.Object getLimitChainList$default(InterfaceC23225huH interfaceC23225huH, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLimitChainList");
            }
            if ((i2 & 1) != 0) {
                i = BizMode.LIMIT_ORDER.getValue();
            }
            return interfaceC23225huH.OLrzqt(i, continuation);
        }

        public static /* synthetic */ java.lang.Object getLimitPairRate$default(InterfaceC23225huH interfaceC23225huH, long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC23225huH.KWHzl(j, str, str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? "" : str6, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLimitPairRate");
        }
    }
}
