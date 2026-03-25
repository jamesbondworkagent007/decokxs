package com.okinc.business.defi.biz.net.api;

import com.okinc.business.defi.biz.net.api.DappApiService;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC58185ywX;
import o.C13927dbn;
import o.C43393roT;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes4.dex */
public interface DappApiService {
    public static final ActionBar Companion = ActionBar.KWHzl;

    @GET("/v1/deposit/app/txSupport/aptos/abi")
    Object getAptosAbi(@NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) String str, @NotNull @Query("chainIndex") String str2, @Header("OK-VERIFY-TOKEN") @NotNull String str3, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy, @NotNull Continuation<? super ResponseData<String>> continuation);

    @GET
    AbstractC58185ywX<JsonObject> getRequest(@Url @NotNull String str, @Header("OK-VERIFY-TOKEN") @NotNull String str2);

    @GET
    AbstractC58185ywX<JsonObject> getRequest(@Url @NotNull String str, @QueryMap @NotNull Map<String, ? extends Object> map, @Header("OK-VERIFY-TOKEN") @NotNull String str2);

    @POST
    AbstractC58185ywX<JsonObject> postRequest(@Url @NotNull String str, @Body @NotNull JsonElement jsonElement, @Header("OK-VERIFY-TOKEN") @NotNull String str2);

    public static final class ActionBar {
        public static final /* synthetic */ ActionBar KWHzl = new ActionBar();
        public static final InterfaceC56387yDm<C13927dbn> copydefault = C56392yDr.copydefault(new Function0() { // from class: o.daZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DappApiService.ActionBar.OLrzqt();
            }
        });

        private ActionBar() {
        }

        public static final C13927dbn OLrzqt() {
            return new C13927dbn();
        }

        public final C13927dbn KWHzl() {
            return copydefault.getValue();
        }

        public final DappApiService EZpvd() {
            return (DappApiService) C43393roT.EZpvd(C56524yIo.AEQbTJ(DappApiService.class), KWHzl());
        }
    }

    public static final class StateListAnimator {
        public static /* synthetic */ Object getAptosAbi$default(DappApiService dappApiService, String str, String str2, String str3, SubdomainStrategy subdomainStrategy, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAptosAbi");
            }
            if ((i & 4) != 0) {
                str3 = "";
            }
            String str4 = str3;
            if ((i & 8) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return dappApiService.getAptosAbi(str, str2, str4, subdomainStrategy, continuation);
        }

        public static /* synthetic */ AbstractC58185ywX getRequest$default(DappApiService dappApiService, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequest");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return dappApiService.getRequest(str, str2);
        }

        public static /* synthetic */ AbstractC58185ywX getRequest$default(DappApiService dappApiService, String str, Map map, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequest");
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            return dappApiService.getRequest(str, map, str2);
        }

        public static /* synthetic */ AbstractC58185ywX postRequest$default(DappApiService dappApiService, String str, JsonElement jsonElement, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postRequest");
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            return dappApiService.postRequest(str, jsonElement, str2);
        }
    }
}
