package o;

import com.okinc.business.web3pay.lib.features.asset.model.AggregatedAsset;
import com.okinc.business.web3pay.lib.features.asset.model.AggregatedAssetRequest;
import com.okinc.business.web3pay.lib.features.asset.model.AssetAll;
import com.okinc.business.web3pay.lib.features.asset.model.OffshoreAssets;
import com.okinc.business.web3pay.lib.features.asset.model.PayAsset;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.lqH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31236lqH {
    @GET("/priapi/v5/smart-account/asset/offshore/balance/list")
    java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<OffshoreAssets>> continuation);

    @GET("/priapi/v5/smart-account/asset/list")
    java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<AssetAll>> continuation);

    @GET("/priapi/v5/smart-account/asset/block-chain-type/balance")
    java.lang.Object OLrzqt(@Query("chainType") int i, @NotNull Continuation<? super ResponseData<AssetAll>> continuation);

    @POST("/priapi/v5/smart-account/asset/list/group")
    java.lang.Object copydefault(@Body @NotNull AggregatedAssetRequest aggregatedAssetRequest, @NotNull Continuation<? super ResponseData<AggregatedAsset>> continuation);

    @GET("/priapi/v5/smart-account/asset/pay/balance")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<PayAsset>> continuation);
}
