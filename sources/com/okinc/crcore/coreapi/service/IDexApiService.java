package com.okinc.crcore.coreapi.service;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.crcore.coreapi.net.responsebean.dex.DappInsightsSummaryResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.dex.LatestInfoResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.dex.RiskCheckResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.dex.TokenOverviewResponseBean;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes23.dex */
public interface IDexApiService {
    public static final StateListAnimator Companion = StateListAnimator.KWHzl;

    @GET("/priapi/v1/dapp/insights/summary")
    Object getDappInsightsSummary(@Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy, @NotNull @Query("chainId") String str, @NotNull @Query("tokenAddress") String str2, @NotNull @Query("tokenTicker") String str3, @NotNull Continuation<? super ResponseData<DappInsightsSummaryResponseBean>> continuation);

    @GET("/priapi/v5/dex/token/market/dex-token-hlc-candles")
    Object getDexTokenHlcCandles(@Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy, @NotNull @Query("chainId") String str, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) String str2, @NotNull @Query("bar") String str3, @NotNull @Query("limit") String str4, @NotNull Continuation<? super ResponseData<List<List<String>>>> continuation);

    @GET("/priapi/v1/dx/market/v2/latest/info")
    Object getMarketInfo(@Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy, @NotNull @Query("chainId") String str, @NotNull @Query("tokenContractAddress") String str2, @NotNull Continuation<? super ResponseData<LatestInfoResponseBean>> continuation);

    @GET("/priapi/v1/dx/market/v2/risk/new/check")
    Object getRiskCheck(@Header("Subdomain-Strategy") @NotNull SubdomainStrategy.Global global, @NotNull @Query("chainId") String str, @NotNull @Query("tokenContractAddress") String str2, @NotNull Continuation<? super ResponseData<RiskCheckResponseBean>> continuation);

    @GET("/priapi/v1/dx/market/v2/token/overview")
    Object getTokenOverview(@Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy, @NotNull @Query("chainId") String str, @NotNull @Query("tokenContractAddress") String str2, @NotNull Continuation<? super ResponseData<TokenOverviewResponseBean>> continuation);

    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }
    }
}
