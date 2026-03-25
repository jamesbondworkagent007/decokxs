package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.DexAssets;
import com.okinc.unify_trade.biz.subscribe.DexAssetsResponse;
import com.okinc.unify_trade.dex.assets.data.model.DexTokenPriceRequest;
import com.okinc.unify_trade.dex.assets.data.model.DexTokenPriceResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
public interface xHB {
    @POST("priapi/v5/dex/cefi/token-price")
    java.lang.Object AEQbTJ(@Body @NotNull DexTokenPriceRequest dexTokenPriceRequest, @NotNull Continuation<? super ResponseData<java.util.List<DexTokenPriceResponse>>> continuation);

    @GET("priapi/v5/dex/cefi/v2/dex-assets")
    java.lang.Object KWHzl(@Query("hideSmallBalance") java.lang.Integer num, @Query("pageNumber") java.lang.Integer num2, @Query("pageSize") java.lang.Integer num3, @Query("valuationUnit") java.lang.String str, @Header("x-cedefi-tag") @NotNull java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<DexAssetsResponse>>> continuation);

    @GET("priapi/v5/dex/cefi/v2/dex-asset")
    java.lang.Object copydefault(@NotNull @Query("chainIndex") java.lang.String str, @NotNull @Query("tokenAddress") java.lang.String str2, @Header("x-cedefi-tag") @NotNull java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<DexAssets>>> continuation);

    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object getDexAssets$default(xHB xhb, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDexAssets");
            }
            if ((i & 16) != 0) {
                str2 = C54487xKf.copydefault.OLrzqt();
            }
            return xhb.KWHzl(num, num2, num3, str, str2, continuation);
        }

        public static /* synthetic */ java.lang.Object getDexAsset$default(xHB xhb, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDexAsset");
            }
            if ((i & 4) != 0) {
                str3 = C54487xKf.copydefault.OLrzqt();
            }
            return xhb.copydefault(str, str2, str3, continuation);
        }
    }
}
