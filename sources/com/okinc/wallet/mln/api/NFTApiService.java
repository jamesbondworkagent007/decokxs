package com.okinc.wallet.mln.api;

import com.okinc.business.defi.share.bean.ShareLinkBean;
import com.okinc.business.defi.share.bean.ShareLinkReq;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.mln.api.NFTApiService;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC58185ywX;
import o.C13927dbn;
import o.C43393roT;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes12.dex */
public interface NFTApiService {
    public static final StateListAnimator Companion = StateListAnimator.copydefault;

    @POST("/priapi/v1/nft/inscription/rc20/submitPsbtTx")
    AbstractC58185ywX<ResponseData<ArcBuyBean>> arc20TxReqApi(@HeaderMap @NotNull Map<String, String> map, @Body @NotNull RequestBody requestBody, @Header("OK-VERIFY-TOKEN") @NotNull String str, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST("/priapi/v1/nft/btc/inscribe/tx/app")
    AbstractC58185ywX<ResponseData<Object>> btcSaveInscribeTxReqApi(@HeaderMap @NotNull Map<String, String> map, @Body @NotNull RequestBody requestBody, @Header("OK-VERIFY-TOKEN") @NotNull String str, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST("/priapi/v1/nft/batchSaveTx")
    AbstractC58185ywX<ResponseData<Object>> btcSaveTxReq(@HeaderMap @NotNull Map<String, String> map, @Body @NotNull RequestBody requestBody, @Header("OK-VERIFY-TOKEN") @NotNull String str, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST("/priapi/v1/nft/getShareLinkConfig")
    AbstractC58185ywX<ResponseData<ShareLinkBean>> getShareLinkConfig(@Body @NotNull ShareLinkReq shareLinkReq, @Header("OK-VERIFY-TOKEN") @NotNull String str, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST
    AbstractC58185ywX<JsonObject> postRequest(@Url @NotNull String str, @Body @NotNull JsonElement jsonElement, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST("/priapi/v1/nft/opListSubmit")
    AbstractC58185ywX<ResponseData<Object>> saveBatchTxReq(@HeaderMap @NotNull Map<String, String> map, @Body @NotNull RequestBody requestBody, @Header("OK-VERIFY-TOKEN") @NotNull String str, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST("/priapi/v1/nft/p2p/trading/saveTx")
    AbstractC58185ywX<ResponseData<Object>> saveP2PTxReq(@HeaderMap @NotNull Map<String, String> map, @Body @NotNull RequestBody requestBody, @Header("Encrypt-Strategy") @NotNull String str, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    @POST("/priapi/v1/nft/v2/saveTx")
    AbstractC58185ywX<ResponseData<Object>> saveTxReq(@HeaderMap @NotNull Map<String, String> map, @Body @NotNull RequestBody requestBody, @Header("Encrypt-Strategy") @NotNull String str, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy);

    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator copydefault = new StateListAnimator();
        public static final InterfaceC56387yDm<C13927dbn> AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.ycy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return NFTApiService.StateListAnimator.OLrzqt();
            }
        });

        private StateListAnimator() {
        }

        public static final C13927dbn OLrzqt() {
            return new C13927dbn();
        }

        public final C13927dbn EZpvd() {
            return AEQbTJ.getValue();
        }

        public final NFTApiService KWHzl() {
            return (NFTApiService) C43393roT.EZpvd(C56524yIo.AEQbTJ(NFTApiService.class), EZpvd());
        }
    }

    public static final class Application {
        public static /* synthetic */ AbstractC58185ywX saveTxReq$default(NFTApiService nFTApiService, Map map, RequestBody requestBody, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveTxReq");
            }
            if ((i & 4) != 0) {
                str = "TIME";
            }
            if ((i & 8) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return nFTApiService.saveTxReq(map, requestBody, str, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX saveP2PTxReq$default(NFTApiService nFTApiService, Map map, RequestBody requestBody, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveP2PTxReq");
            }
            if ((i & 4) != 0) {
                str = "TIME";
            }
            if ((i & 8) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return nFTApiService.saveP2PTxReq(map, requestBody, str, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX btcSaveTxReq$default(NFTApiService nFTApiService, Map map, RequestBody requestBody, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: btcSaveTxReq");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            if ((i & 8) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return nFTApiService.btcSaveTxReq(map, requestBody, str, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX btcSaveInscribeTxReqApi$default(NFTApiService nFTApiService, Map map, RequestBody requestBody, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: btcSaveInscribeTxReqApi");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            if ((i & 8) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return nFTApiService.btcSaveInscribeTxReqApi(map, requestBody, str, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX arc20TxReqApi$default(NFTApiService nFTApiService, Map map, RequestBody requestBody, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: arc20TxReqApi");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            if ((i & 8) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return nFTApiService.arc20TxReqApi(map, requestBody, str, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX saveBatchTxReq$default(NFTApiService nFTApiService, Map map, RequestBody requestBody, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveBatchTxReq");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            if ((i & 8) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return nFTApiService.saveBatchTxReq(map, requestBody, str, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX postRequest$default(NFTApiService nFTApiService, String str, JsonElement jsonElement, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postRequest");
            }
            if ((i & 4) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return nFTApiService.postRequest(str, jsonElement, subdomainStrategy);
        }

        public static /* synthetic */ AbstractC58185ywX getShareLinkConfig$default(NFTApiService nFTApiService, ShareLinkReq shareLinkReq, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getShareLinkConfig");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return nFTApiService.getShareLinkConfig(shareLinkReq, str, subdomainStrategy);
        }
    }
}
