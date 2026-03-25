package com.okinc.market.common;

import com.okinc.market.common.bean.FavoriteInfo;
import com.okinc.market.common.bean.FavoriteRecommendListData;
import com.okinc.market.common.bean.GetProductInfoRequest;
import com.okinc.market.watch.data.po.FavGroupItemPo;
import com.okinc.market.watch.data.po.FavGroupProductItemPo;
import com.okinc.market.watch.data.po.UserFavouriteGroupNameMapDTO;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.biz.CategoryRespData;
import com.okinc.unify_trade.biz.EmptyResp;
import com.okinc.unify_trade.biz.subscribe.SettingWatchList;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.AbstractC58185ywX;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
public interface MarketHttpApi {
    @GET("priapi/v5/market/all-cup-tickers")
    AbstractC58185ywX<ResponseData<List<TickersData>>> batchMarketAllCupTickers();

    @GET("priapi/v5/market/all-cup-tickers")
    Object batchMarketAllCupTickersCor(@NotNull Continuation<? super ResponseData<List<TickersData>>> continuation);

    @GET("priapi/v5/market/mult-cup-tickers")
    AbstractC58185ywX<ResponseData<List<TickersData>>> batchMarketCupTickers(@NotNull @Query("ccys") String str);

    @GET("priapi/v5/market/mult-cup-tickers")
    Object batchMarketCupTickersCor(@NotNull @Query("ccys") String str, @NotNull Continuation<? super ResponseData<List<TickersData>>> continuation);

    @GET("priapi/v5/market/mult-tickers")
    AbstractC58185ywX<ResponseData<List<TickersData>>> batchMarketTickers(@NotNull @Query("instIds") String str);

    @GET("priapi/v5/market/mult-tickers")
    Object batchMarketTickersCor(@NotNull @Query("instIds") String str, @NotNull Continuation<? super ResponseData<List<TickersData>>> continuation);

    @GET("/v2/asset/currency-classification")
    Object getCategoryList(@NotNull @Query("targetId") String str, @NotNull Continuation<? super ResponseData<List<CategoryRespData>>> continuation);

    @POST("priapi/v5/users/favorite/get-product-info")
    Object getFavoriteInfo(@Body @NotNull GetProductInfoRequest getProductInfoRequest, @NotNull Continuation<? super ResponseData<FavoriteInfo>> continuation);

    @GET("/priapi/v5/rubik/private/favorite/recommend")
    AbstractC58185ywX<ResponseData<List<FavoriteRecommendListData>>> getFavoriteRecommendList(@Query("num") String str);

    @GET("priapi/v5/users/favorite/get-product-info-grouped")
    Object getGroupFavProductInfo(@Query("includeType") int i, @Query("coinIds") String str, @Query("instIds") String str2, @Query("shouldRemoveMargin") boolean z, @NotNull Continuation<? super ResponseData<List<FavGroupProductItemPo>>> continuation);

    @GET("priapi/v5/users/favorite/all-grouped")
    Object getGroupWatchListFavorite(@Query("shouldRemoveMargin") boolean z, @NotNull Continuation<? super ResponseData<List<FavGroupItemPo>>> continuation);

    @GET("priapi/v5/rubik/public/main-coins")
    AbstractC58185ywX<ResponseData<List<IndexTickersData>>> getIndexTickersOld(@Query("type") String str, @Query("quoteCcy") String str2, @Query("instId") String str3, @Query("num") String str4, @Header("Cache-Strategy") @NotNull String str5, @Header("Cache-Expire") int i);

    @GET("/priapi/v5/market/mult-mp-tickers")
    Object getMarkPriceMultTicker(@NotNull @Query("instIds") String str, @NotNull Continuation<? super ResponseData<List<TickersData>>> continuation);

    @GET("priapi/v5/users/favorite/all")
    Object getWatchListFavorite(@Query("shouldRemoveMargin") boolean z, @NotNull Continuation<? super ResponseData<List<WatchListData>>> continuation);

    @POST("/priapi/v5/users/favorite/remove-from-group")
    Object removeFavoritesCryptosFromGroup(@Body @NotNull UserFavouriteGroupNameMapDTO userFavouriteGroupNameMapDTO, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("priapi/v5/users/favorite/setting-all")
    Object setAllFavorite(@Body @NotNull List<SettingWatchList> list, @NotNull Continuation<? super ResponseData<EmptyResp>> continuation);

    @POST("priapi/v5/users/favorite/rearrange-all-in-group")
    Object setGroupFavorite(@Body @NotNull UserFavouriteGroupNameMapDTO userFavouriteGroupNameMapDTO, @NotNull Continuation<? super ResponseData<EmptyResp>> continuation);

    @POST("priapi/v5/users/favorite/setting")
    Object setWatchListFavorite(@Body @NotNull SettingWatchList settingWatchList, @NotNull Continuation<? super ResponseData<EmptyResp>> continuation);

    public static final class ActionBar {
        public static /* synthetic */ AbstractC58185ywX getIndexTickersOld$default(MarketHttpApi marketHttpApi, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIndexTickersOld");
            }
            if ((i2 & 16) != 0) {
                str5 = "FIRST_CACHE";
            }
            String str6 = str5;
            if ((i2 & 32) != 0) {
                i = 5;
            }
            return marketHttpApi.getIndexTickersOld(str, str2, str3, str4, str6, i);
        }

        public static /* synthetic */ AbstractC58185ywX getFavoriteRecommendList$default(MarketHttpApi marketHttpApi, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFavoriteRecommendList");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return marketHttpApi.getFavoriteRecommendList(str);
        }

        public static /* synthetic */ Object getWatchListFavorite$default(MarketHttpApi marketHttpApi, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWatchListFavorite");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return marketHttpApi.getWatchListFavorite(z, continuation);
        }

        public static /* synthetic */ Object getGroupFavProductInfo$default(MarketHttpApi marketHttpApi, int i, String str, String str2, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return marketHttpApi.getGroupFavProductInfo((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGroupFavProductInfo");
        }

        public static /* synthetic */ Object getGroupWatchListFavorite$default(MarketHttpApi marketHttpApi, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGroupWatchListFavorite");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return marketHttpApi.getGroupWatchListFavorite(z, continuation);
        }
    }
}
