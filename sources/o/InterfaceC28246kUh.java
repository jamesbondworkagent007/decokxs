package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.main.limmitorder.bean.BizMode;
import com.okinc.business.trade.features.home.domain.model.BridgeForceUpdateState;
import com.okinc.business.trade.features.home.domain.model.SingleForceUpdateState;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.kUh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28246kUh {
    @GET("/priapi/v1/dx/strategy/common/chain/list")
    java.lang.Object AEQbTJ(@Query("bizMode") int i, @NotNull Continuation<? super ResponseData<java.util.List<DefiChainInfo>>> continuation);

    @GET("/priapi/v1/dx/public/app/swap/chain/list")
    java.lang.Object AEQbTJ(@Query("supportMemeMode") java.lang.Boolean bool, @NotNull Continuation<? super ResponseData<java.util.List<DefiChainInfo>>> continuation);

    @GET("/priapi/v1/dx/strategy/common/chain/list")
    java.lang.Object AEQbTJ(@Query("accountId") java.lang.String str, @Query("bizMode") int i, @NotNull Continuation<? super ResponseData<java.util.List<DefiChainInfo>>> continuation);

    @GET("/priapi/v1/dx/trade/bridge/platform/check")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<BridgeForceUpdateState>> continuation);

    @GET("/priapi/v1/dx/trade/bridge/app/supportChain/list")
    java.lang.Object EZpvd(@NotNull @Query("businessLine") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<DefiChainInfo>>> continuation);

    @GET("/priapi/v1/dx/trade/bridge/chain/list")
    java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<java.util.List<DefiChainInfo>>> continuation);

    @GET("/priapi/v1/dx/trade/multi/checkAppForceUpdate")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<SingleForceUpdateState>> continuation);

    /* JADX INFO: renamed from: o.kUh$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ java.lang.Object getSingleChainList$default(InterfaceC28246kUh interfaceC28246kUh, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSingleChainList");
            }
            if ((i & 1) != 0) {
                bool = null;
            }
            return interfaceC28246kUh.AEQbTJ(bool, (Continuation<? super ResponseData<java.util.List<DefiChainInfo>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getLimitChainList$default(InterfaceC28246kUh interfaceC28246kUh, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLimitChainList");
            }
            if ((i2 & 1) != 0) {
                i = BizMode.LIMIT_ORDER.getValue();
            }
            return interfaceC28246kUh.AEQbTJ(i, (Continuation<? super ResponseData<java.util.List<DefiChainInfo>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getCopyTradingChainList$default(InterfaceC28246kUh interfaceC28246kUh, java.lang.String str, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCopyTradingChainList");
            }
            if ((i2 & 1) != 0) {
                str = null;
            }
            if ((i2 & 2) != 0) {
                i = BizMode.COPY_TRADE.getValue();
            }
            return interfaceC28246kUh.AEQbTJ(str, i, continuation);
        }
    }
}
