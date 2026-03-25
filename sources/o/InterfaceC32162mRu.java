package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.bean.SupportSwapData;
import com.okinc.dexkline.market.data.model.BannerConfigData;
import com.okinc.dexkline.market.data.model.CeDeFiCoinRiskData;
import com.okinc.dexkline.market.data.model.CoinRiskData;
import com.okinc.dexkline.market.data.model.LiquidityChartData;
import com.okinc.dexkline.market.data.model.MarketBuySellKLinePoint;
import com.okinc.dexkline.market.data.model.MarketConfigData;
import com.okinc.dexkline.market.data.model.holder.HolderChartData;
import com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyers;
import com.okinc.dexkline.market.features.filter_tag.data.model.FilterTagData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: o.mRu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC32162mRu {
    public static final ActionBar Companion = ActionBar.copydefault;

    @GET("/priapi/v1/dx/market/v2/latest/info")
    java.lang.Object AEQbTJ(@NotNull @Query("tokenContractAddress") java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @NotNull @Query("chainId") java.lang.String str3, @Query("walletAddress") java.lang.String str4, @NotNull Continuation<? super ResponseData<LatestMarketInfoBean>> continuation);

    @GET("/priapi/v1/dx/market/tag/holderTagFilter")
    java.lang.Object AEQbTJ(@NotNull @Query("tokenContractAddress") java.lang.String str, @NotNull @Query("currentUserWalletAddress") java.lang.String str2, @NotNull @Query("chainId") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<FilterTagData>>> continuation);

    @GET("/priapi/v1/dx/market/v2/risk/new/check")
    java.lang.Object AEQbTJ(@NotNull @Query("tokenContractAddress") java.lang.String str, @NotNull @Query("chainId") java.lang.String str2, @NotNull Continuation<? super ResponseData<CoinRiskData>> continuation);

    @GET("/priapi/v5/content/public/author/list")
    java.lang.Object AEQbTJ(@NotNull @Query("authorIdList") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<C32266mVq>>> continuation);

    @GET("/priapi/v1/dx/market/v2/pool-liquidity/tendency/chart")
    java.lang.Object AEQbTJ(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<LiquidityChartData>> continuation);

    @GET("/priapi/v1/dx/market/v2/query/banner")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<java.util.List<BannerConfigData>>> continuation);

    @GET("/priapi/v5/dex/token/market/dex-token-hlc-candles")
    AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> AEQbTJ(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str2, @Query(TtmlNode.RUBY_AFTER) java.lang.String str3, @Query(TtmlNode.RUBY_BEFORE) java.lang.String str4, @NotNull @Query("bar") java.lang.String str5, @NotNull @Query("limit") java.lang.String str6);

    @GET("/priapi/v1/dx/market/v2/holders/analysis-info")
    java.lang.Object EZpvd(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<HolderChartData>> continuation);

    @GET("/priapi/v1/dx/market/v2/config/info")
    java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<MarketConfigData>> continuation);

    @GET("/priapi/v1/dx/market/v2/trading/tag/kline-bs-point")
    AbstractC58185ywX<ResponseData<java.util.List<MarketBuySellKLinePoint>>> EZpvd(@NotNull @Query("bar") java.lang.String str, @Query("limit") int i, @NotNull @Query("chainId") java.lang.String str2, @NotNull @Query("tokenAddress") java.lang.String str3, @Query("fromAddressTag") java.lang.String str4);

    @GET("/priapi/v5/dex/token/market/history-dex-token-hlc-candles")
    AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> EZpvd(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str2, @Query(TtmlNode.RUBY_AFTER) java.lang.String str3, @Query(TtmlNode.RUBY_BEFORE) java.lang.String str4, @NotNull @Query("bar") java.lang.String str5, @NotNull @Query("limit") java.lang.String str6);

    @GET("/priapi/v1/dx/market/v2/trading/kline-bs-point")
    AbstractC58185ywX<ResponseData<java.util.List<MarketBuySellKLinePoint>>> KWHzl(@NotNull @Query("bar") java.lang.String str, @Query("limit") int i, @NotNull @Query("chainId") java.lang.String str2, @NotNull @Query("tokenAddress") java.lang.String str3, @Query("fromAddress") java.lang.String str4);

    @GET("/priapi/v1/dx/market/v2/pnl/top-trader/tag-list")
    java.lang.Object OLrzqt(@NotNull @Query("tokenContractAddress") java.lang.String str, @NotNull @Query("currentUserWalletAddress") java.lang.String str2, @NotNull @Query("chainId") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<FilterTagData>>> continuation);

    @GET("/priapi/v1/dx/market/v2/holders/early-buyer/list")
    java.lang.Object OLrzqt(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<EarlyBuyers>> continuation);

    @GET("/priapi/v1/dx/market/v2/latest/info")
    AbstractC58185ywX<ResponseData<LatestMarketInfoBean>> OLrzqt(@NotNull @Query("tokenContractAddress") java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @NotNull @Query("chainId") java.lang.String str3, @Query("walletAddress") java.lang.String str4);

    @GET("priapi/v5/rubik/cedefi/token-risk")
    java.lang.Object copydefault(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("contractAddress") java.lang.String str2, @NotNull @Query("token") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<CeDeFiCoinRiskData>>> continuation);

    @GET("/priapi/v1/dx/trade/multi/support/swap")
    AbstractC58185ywX<ResponseData<SupportSwapData>> copydefault(@NotNull @Query("tokenContractAddress") java.lang.String str, @NotNull @Query("chainId") java.lang.String str2);

    /* JADX INFO: renamed from: o.mRu$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }

        public final InterfaceC32162mRu EZpvd(@NotNull C43280rmM c43280rmM) {
            Intrinsics.checkNotNullParameter(c43280rmM, "");
            return (InterfaceC32162mRu) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC32162mRu.class), c43280rmM);
        }
    }
}
