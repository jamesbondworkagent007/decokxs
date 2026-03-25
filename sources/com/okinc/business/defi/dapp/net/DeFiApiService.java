package com.okinc.business.defi.dapp.net;

import com.okinc.business.defi.dapp.net.search.DappDetailBean;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.dapp.bean.DappChains;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC58185ywX;
import o.C15056dxC;
import o.C43393roT;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes4.dex */
public interface DeFiApiService {
    public static final ActionBar Companion = ActionBar.AEQbTJ;

    @POST("/priapi/v1/dapp/checkSearchHistoryUrlIsBlack")
    AbstractC58185ywX<ResponseData<DappcheckSearchHistoryUrlIsBlackResult>> checkSearchHistoryUrlIsBlack(@Body @NotNull DappcheckSearchHistoryUrlIsBlack dappcheckSearchHistoryUrlIsBlack, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST("/priapi/v1/dapp/checkSearchHistoryUrlIsDapp")
    AbstractC58185ywX<ResponseData<Map<String, OKCheckLeveldappInfo>>> checkSearchHistoryUrlIsDapp(@Body @NotNull DappcheckSearchHistoryUrlIsBlack dappcheckSearchHistoryUrlIsBlack, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @GET("/priapi/v1/dapp/common/getTxStatus")
    AbstractC58185ywX<ResponseData<checkTxStatus>> checkTxStatus(@NotNull @Query("chain") String str, @NotNull @Query("txHash") String str2, @Query("uopHash") String str3, @Header("OK-VERIFY-TOKEN") @NotNull String str4, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @GET("/priapi/v1/wallet/dapp/check-site-security")
    AbstractC58185ywX<ResponseData<DappCheckUrlLevel>> checkUrlLevel(@NotNull @Query("domain") String str, @NotNull @Query("title") String str2, @NotNull @Query("refers") List<String> list, @NotNull @Query("lastUrl") String str3, @NotNull @Query("toUrl") String str4, @Header("OK-VERIFY-TOKEN") @NotNull String str5, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @GET("/priapi/v1/wallet/dapp/common/click-report")
    AbstractC58185ywX<ResponseData<Object>> clickReport(@Query("dappId") Long l, @NotNull @Query("category") String str, @Header("OK-VERIFY-TOKEN") @NotNull String str2, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST("/priapi/v1/wallet/dapp/collect")
    AbstractC58185ywX<ResponseData<Boolean>> dappLikeOrUnlike(@Body @NotNull DappCollectReq dappCollectReq, @Header("OK-VERIFY-TOKEN") @NotNull String str, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @GET("/priapi/v1/dapp/getAAWalletChainList")
    AbstractC58185ywX<ResponseData<OKAAWalletChainList>> getAAWalletChainList(@Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @GET("/v1/deposit/app/txSupport/aptos/abi")
    AbstractC58185ywX<ResponseData<String>> getAptosAbi(@NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) String str, @NotNull @Query("chainIndex") String str2, @Header("OK-VERIFY-TOKEN") @NotNull String str3, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @GET("/priapi/v1/wallet/dapp/category")
    AbstractC58185ywX<ResponseData<List<DappCategory>>> getCategory(@NotNull @Query("t") String str, @Header("OK-VERIFY-TOKEN") @NotNull String str2, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST("/priapi/v1/dapp/getDappChainsNew")
    AbstractC58185ywX<ResponseData<List<DappChains>>> getDappChainsNew(@Body @NotNull DappChainsReq dappChainsReq, @Header("OK-VERIFY-TOKEN") @NotNull String str, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST("/priapi/v1/wallet/dapp/detail")
    AbstractC58185ywX<ResponseData<DappDetailBean>> getDappDetail(@Body @NotNull DappDetailReq dappDetailReq, @Header("OK-VERIFY-TOKEN") @NotNull String str, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @GET("/priapi/v1/wallet/dapp/lookup")
    AbstractC58185ywX<ResponseData<DappInfoByUrl>> getDappInfoByUrl(@NotNull @Query("domain") String str, @Header("OK-VERIFY-TOKEN") @NotNull String str2, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST("/priapi/v1/wallet/dapp/is-collected")
    AbstractC58185ywX<ResponseData<Boolean>> getDappIsFavNew(@Body @NotNull DappIsFavoutitetReq dappIsFavoutitetReq, @Header("OK-VERIFY-TOKEN") @NotNull String str, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @GET("/priapi/v1/dapp/dappSecurityDetail")
    AbstractC58185ywX<ResponseData<JsonObject>> getDappSecurityDetail(@NotNull @Query("dappId") String str, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @GET
    Object getRequest(@Url @NotNull String str, @NotNull Continuation<? super JsonObject> continuation);

    @GET("/priapi/v1/wallet/dapp/metadata")
    AbstractC58185ywX<ResponseData<WhiteList>> getWhiteList(@NotNull @Query("t") String str, @Header("OK-VERIFY-TOKEN") @NotNull String str2, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST("/priapi/v1/wallet/dapp/support-chains")
    AbstractC58185ywX<ResponseData<List<DappChains>>> listDappChainsNew(@Body @NotNull DappFavouriteRecommendReq dappFavouriteRecommendReq, @Header("OK-VERIFY-TOKEN") @NotNull String str, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST
    AbstractC58185ywX<JsonObject> postRequest(@Url @NotNull String str, @Body @NotNull JsonElement jsonElement, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST("/priapi/v1/wallet/dapp/translate")
    AbstractC58185ywX<ResponseData<JsonObject>> translate(@Body @NotNull JsonElement jsonElement, @Header("OK-VERIFY-TOKEN") @NotNull String str, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    public static final class ActionBar {
        public static final /* synthetic */ ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
        }

        public final DeFiApiService copydefault() {
            return (DeFiApiService) C43393roT.EZpvd(C56524yIo.AEQbTJ(DeFiApiService.class), C15056dxC.EZpvd);
        }
    }

    public static final class Activity {
        public static /* synthetic */ AbstractC58185ywX listDappChainsNew$default(DeFiApiService deFiApiService, DappFavouriteRecommendReq dappFavouriteRecommendReq, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listDappChainsNew");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.listDappChainsNew(dappFavouriteRecommendReq, str, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX dappLikeOrUnlike$default(DeFiApiService deFiApiService, DappCollectReq dappCollectReq, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dappLikeOrUnlike");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.dappLikeOrUnlike(dappCollectReq, str, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX getDappChainsNew$default(DeFiApiService deFiApiService, DappChainsReq dappChainsReq, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDappChainsNew");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.getDappChainsNew(dappChainsReq, str, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX getDappIsFavNew$default(DeFiApiService deFiApiService, DappIsFavoutitetReq dappIsFavoutitetReq, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDappIsFavNew");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.getDappIsFavNew(dappIsFavoutitetReq, str, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX getCategory$default(DeFiApiService deFiApiService, String str, String str2, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCategory");
            }
            if ((i & 1) != 0) {
                str = "t";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.getCategory(str, str2, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX checkUrlLevel$default(DeFiApiService deFiApiService, String str, String str2, List list, String str3, String str4, String str5, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj == null) {
                return deFiApiService.checkUrlLevel(str, str2, list, str3, str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? SubdomainStrategy.Global.INSTANCE : subdomainStrategy);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkUrlLevel");
        }

        public static /* synthetic */ AbstractC58185ywX clickReport$default(DeFiApiService deFiApiService, Long l, String str, String str2, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clickReport");
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            if ((i & 8) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.clickReport(l, str, str2, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX getAptosAbi$default(DeFiApiService deFiApiService, String str, String str2, String str3, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAptosAbi");
            }
            if ((i & 4) != 0) {
                str3 = "";
            }
            if ((i & 8) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.getAptosAbi(str, str2, str3, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX checkTxStatus$default(DeFiApiService deFiApiService, String str, String str2, String str3, String str4, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkTxStatus");
            }
            if ((i & 8) != 0) {
                str4 = "";
            }
            String str5 = str4;
            if ((i & 16) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.checkTxStatus(str, str2, str3, str5, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX postRequest$default(DeFiApiService deFiApiService, String str, JsonElement jsonElement, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postRequest");
            }
            if ((i & 4) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.postRequest(str, jsonElement, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX translate$default(DeFiApiService deFiApiService, JsonElement jsonElement, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.translate(jsonElement, str, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX getAAWalletChainList$default(DeFiApiService deFiApiService, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAAWalletChainList");
            }
            if ((i & 1) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.getAAWalletChainList(subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX getDappDetail$default(DeFiApiService deFiApiService, DappDetailReq dappDetailReq, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDappDetail");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.getDappDetail(dappDetailReq, str, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX getWhiteList$default(DeFiApiService deFiApiService, String str, String str2, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWhiteList");
            }
            if ((i & 1) != 0) {
                str = "t";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.getWhiteList(str, str2, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX getDappInfoByUrl$default(DeFiApiService deFiApiService, String str, String str2, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDappInfoByUrl");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.getDappInfoByUrl(str, str2, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX getDappSecurityDetail$default(DeFiApiService deFiApiService, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDappSecurityDetail");
            }
            if ((i & 2) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.getDappSecurityDetail(str, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX checkSearchHistoryUrlIsBlack$default(DeFiApiService deFiApiService, DappcheckSearchHistoryUrlIsBlack dappcheckSearchHistoryUrlIsBlack, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkSearchHistoryUrlIsBlack");
            }
            if ((i & 2) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.checkSearchHistoryUrlIsBlack(dappcheckSearchHistoryUrlIsBlack, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX checkSearchHistoryUrlIsDapp$default(DeFiApiService deFiApiService, DappcheckSearchHistoryUrlIsBlack dappcheckSearchHistoryUrlIsBlack, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkSearchHistoryUrlIsDapp");
            }
            if ((i & 2) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return deFiApiService.checkSearchHistoryUrlIsDapp(dappcheckSearchHistoryUrlIsBlack, subdomainStrategy);
        }
    }
}
