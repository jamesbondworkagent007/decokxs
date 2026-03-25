package o;

import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.huP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC23233huP {
    @GET("/priapi/v1/dx/trade/multi/tokens/allNetWork")
    java.lang.Object AEQbTJ(@Query("userUniqueId") java.lang.String str, @Query("walletId") java.lang.String str2, @Query("accountId") java.lang.String str3, @Query("userWalletAddress") java.lang.String str4, @Query("type") java.lang.Integer num, @Query("minAmountThreshold") java.lang.String str5, @NotNull Continuation<? super ResponseData<java.util.List<ChainTokensData>>> continuation);

    @GET("/priapi/v1/dx/trade/multi/tokens/collectionList")
    java.lang.Object EZpvd(@Query("chainId") java.lang.String str, @Query("userUniqueId") java.lang.String str2, @Query("walletId") java.lang.String str3, @Query("accountId") java.lang.String str4, @Query("groupId") java.lang.String str5, @Query("userWalletAddress") java.lang.String str6, @Query("type") java.lang.Integer num, @NotNull Continuation<? super ResponseData<java.util.List<ChainTokensData>>> continuation);

    @POST("/priapi/v1/dx/trade/multi/v2/tokenAdd")
    java.lang.Object KWHzl(@Body @NotNull DexMultiTokenDetailReq dexMultiTokenDetailReq, @NotNull Continuation<? super ResponseData<java.util.List<DexMultiTokenInfoBean>>> continuation);

    @GET("/priapi/v1/dx/trade/multi/tokens/all")
    java.lang.Object KWHzl(@Query("chainId") java.lang.String str, @Query("userUniqueId") java.lang.String str2, @Query("walletId") java.lang.String str3, @Query("accountId") java.lang.String str4, @Query("userWalletAddress") java.lang.String str5, @Query("type") java.lang.Integer num, @Query("minAmountThreshold") java.lang.String str6, @NotNull Continuation<? super ResponseData<java.util.List<ChainTokensData>>> continuation);

    @GET("/priapi/v1/dx/trade/multi/tokens/search")
    java.lang.Object KWHzl(@Query("inputContent") java.lang.String str, @Query("chainId") java.lang.String str2, @Query("userUniqueId") java.lang.String str3, @Query("walletId") java.lang.String str4, @Query("accountId") java.lang.String str5, @Query("userWalletAddress") java.lang.String str6, @Query("searchType") java.lang.Integer num, @Query("type") java.lang.Integer num2, @NotNull Continuation<? super ResponseData<java.util.List<ChainTokensData>>> continuation);

    @GET("/priapi/v1/dx/trade/bridge/collectionGroup/group/list")
    java.lang.Object KWHzl(@Query("accountId") java.lang.String str, @Query("walletAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<CommonGroupData>>> continuation);

    @GET("/priapi/v1/dx/trade/bridge/crossAbility/tokens/search")
    java.lang.Object OLrzqt(@Query("inputContent") java.lang.String str, @Query("fromChainId") java.lang.String str2, @Query("toChainId") java.lang.String str3, @Query("userUniqueId") java.lang.String str4, @Query("accountId") java.lang.String str5, @Query("fromTokenAddress") java.lang.String str6, @Query("selectChainType") java.lang.String str7, @Query("searchType") java.lang.String str8, @Query("userWalletAddress") java.lang.String str9, @Query("walletAddress") java.lang.String str10, @NotNull Continuation<? super ResponseData<java.util.List<ChainTokensData>>> continuation);

    @GET("/priapi/v1/dx/trade/bridge/crossAbility/allTokens")
    java.lang.Object OLrzqt(@Query("fromChainId") java.lang.String str, @Query("userUniqueId") java.lang.String str2, @Query("accountId") java.lang.String str3, @Query("userWalletAddress") java.lang.String str4, @Query("walletAddress") java.lang.String str5, @Query("selectChainType") java.lang.String str6, @Query("toChainId") java.lang.String str7, @Query("fromTokenAddress") java.lang.String str8, @Query("minAmountThreshold") java.lang.String str9, @NotNull Continuation<? super ResponseData<java.util.List<ChainTokensData>>> continuation);

    @GET("/priapi/v1/dx/trade/multi/single/chain/collectionGroups")
    java.lang.Object OLrzqt(@Query("accountId") java.lang.String str, @Query("walletAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<CommonGroupData>>> continuation);

    @GET("/priapi/v1/dx/trade/bridge/crossAbility/collectionTokens")
    java.lang.Object copydefault(@Query("userUniqueId") java.lang.String str, @Query("fromChainId") java.lang.String str2, @Query("toChainId") java.lang.String str3, @Query("accountId") java.lang.String str4, @Query("selectChainType") java.lang.String str5, @Query("fromTokenAddress") java.lang.String str6, @Query("userWalletAddress") java.lang.String str7, @Query("groupId") java.lang.String str8, @Query("walletAddress") java.lang.String str9, @NotNull Continuation<? super ResponseData<java.util.List<ChainTokensData>>> continuation);
}
