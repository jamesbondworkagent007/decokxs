package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.crcore.coreapi.enums.BalanceAccountType;
import com.okinc.crcore.coreapi.enums.TradeType;
import com.okinc.crcore.coreapi.net.requestbean.DeletePaymentMethodRequestBean;
import com.okinc.crcore.coreapi.net.requestbean.SubmitOrderForOtcAgentRequestBean;
import com.okinc.crcore.coreapi.net.requestbean.recurringbuy.RecurringBuyPlanUpdateRequestBean;
import com.okinc.crcore.coreapi.net.responsebean.DexQuoteResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.AvailableCurrencyBalanceResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.B2CQuotePriceResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.B2CQuoteResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.CampaignResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.ChannelResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.CryptoListModelResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.CurrencyTokenResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.DefaultCurrencyResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.DeletePaymentMethodResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.DexTradeStatusCheckResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.FiatCommonUiFlowResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.FiatOrderListResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.GetBannerResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.OrderDetailResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.SubmitOrderForOtcAgentResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.SupportCurrenciesResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.TradeSuggestionResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.UserInfoResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyFrequencyResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanDetailRootResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanListRootResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanOrderListRootResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanUpdateResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.dex.DexBaseTokenResponse;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.mDg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC31770mDg {
    public static final int CACHE_EXPIRE_5SEC = 5;
    public static final TaskDescription Companion = TaskDescription.AEQbTJ;

    @POST("/priapi/v3/b2c/fiat/channel/account/delete")
    java.lang.Object AEQbTJ(@Body @NotNull DeletePaymentMethodRequestBean deletePaymentMethodRequestBean, @NotNull Continuation<? super ResponseData<DeletePaymentMethodResponseBean>> continuation);

    @GET("/priapi/v3/b2c/fiat/trade-suggestion")
    java.lang.Object AEQbTJ(@Header("fund_flow_type") java.lang.String str, @Header("Cache-Strategy") java.lang.String str2, @Header("Cache-Expire") java.lang.Integer num, @NotNull @Query("tradeType") java.lang.String str3, @NotNull @Query("baseCurrency") java.lang.String str4, @NotNull @Query("quoteCurrency") java.lang.String str5, @Query("baseAmount") java.lang.String str6, @Query("quoteAmount") java.lang.String str7, @Query("standard") java.lang.Integer num2, @Query("multipleCurrency") boolean z, @Query("chainIndex") java.lang.String str8, @Query("tokenAddress") java.lang.String str9, @Query("includeFundingBalance") java.lang.Boolean bool, @NotNull Continuation<? super ResponseData<TradeSuggestionResponseBean>> continuation);

    @GET("/priapi/v3/b2c/fiat/currency/list")
    java.lang.Object AEQbTJ(@NotNull @Query("tradeType") java.lang.String str, @Header("Cache-Strategy") java.lang.String str2, @Header("Cache-Expire") java.lang.Integer num, @NotNull Continuation<? super ResponseData<SupportCurrenciesResponseBean>> continuation);

    @GET("/priapi/v3/b2c/dex/getQuote")
    java.lang.Object AEQbTJ(@NotNull @Query("platformCode") java.lang.String str, @NotNull @Query("tradeType") java.lang.String str2, @NotNull @Query("toCurrency") java.lang.String str3, @NotNull @Query("fromAmount") java.lang.String str4, @NotNull @Query("fromCurrency") java.lang.String str5, @NotNull @Query("tokenAddress") java.lang.String str6, @Query("tokenDecimal") java.lang.Integer num, @Query("chainIndex") int i, @Query("slippageTolerance") java.lang.String str7, @Query("isOrderConfirm") boolean z, @Query("referenceDexQuoteId") java.lang.String str8, @Query("subOrderId") java.lang.String str9, @NotNull Continuation<? super ResponseData<DexQuoteResponseBean>> continuation);

    @GET("priapi/v3/b2c/recurring/plan/frequency")
    java.lang.Object EZpvd(@Header("Cache-Strategy") java.lang.String str, @Header("Cache-Expire") java.lang.Integer num, @Query("planId") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.ArrayList<RecurringBuyFrequencyResponseBean>>> continuation);

    @GET("/priapi/v3/b2c/fiat/channel/payment_method/list")
    java.lang.Object EZpvd(@Header("fund_flow_type") java.lang.String str, @Header("Cache-Strategy") java.lang.String str2, @Header("Cache-Expire") java.lang.Integer num, @Query("baseAmount") java.lang.String str3, @Query("baseCurrency") java.lang.String str4, @Query("quoteAmount") java.lang.String str5, @Query("quoteCurrency") java.lang.String str6, @NotNull @Query("tradeType") java.lang.String str7, @Query("standard") java.lang.Integer num2, @Query("categoryCode") java.lang.Integer num3, @Query("requestCurrency") java.lang.String str8, @Query("multipleCurrency") java.lang.Boolean bool, @Query("chainIndex") java.lang.String str9, @Query("tokenAddress") java.lang.String str10, @Query("includeFundingBalance") java.lang.Boolean bool2, @NotNull Continuation<? super ResponseData<java.util.List<ChannelResponseBean>>> continuation);

    @GET("/priapi/v3/b2c/currency/list")
    java.lang.Object EZpvd(@Header("lite-app") @NotNull java.lang.String str, @Header("fund_flow_type") java.lang.String str2, @Header("Cache-Strategy") java.lang.String str3, @Header("Cache-Expire") java.lang.Integer num, @Header("Cache-Token-Valid") int i, @NotNull @Query("tradeType") java.lang.String str4, @NotNull @Query("type") java.lang.String str5, @NotNull Continuation<? super ResponseData<CryptoListModelResponseBean>> continuation);

    @GET("/priapi/v3/b2c/recurring/plan/list")
    java.lang.Object EZpvd(@Query("baseCurrency") java.lang.String str, @Query("quoteCurrency") java.lang.String str2, @Query("status") java.lang.String str3, @Query("pageNum") java.lang.Integer num, @Query("pageSize") java.lang.Integer num2, @NotNull Continuation<? super ResponseData<RecurringBuyPlanListRootResponseBean>> continuation);

    @GET("/priapi/v3/b2c/dex/trade/statusCheck")
    java.lang.Object EZpvd(@NotNull @Query("chainIndex") java.lang.String str, @NotNull @Query("tokenAddress") java.lang.String str2, @NotNull @Query("tradeType") java.lang.String str3, @NotNull Continuation<? super ResponseData<DexTradeStatusCheckResponseBean>> continuation);

    @GET("/priapi/v3/b2c/fiat/order/detail")
    java.lang.Object EZpvd(@NotNull @Query("orderNo") java.lang.String str, @NotNull @Query("tradeType") java.lang.String str2, @NotNull Continuation<? super ResponseData<OrderDetailResponseBean>> continuation);

    @GET("/priapi/v3/b2c/fiat/defaultCurrency")
    java.lang.Object KWHzl(@Query("tradeType") java.lang.String str, @Header("fund_flow_type") java.lang.String str2, @Header("Cache-Strategy") java.lang.String str3, @Header("Cache-Expire") java.lang.Integer num, @Header("Cache-Token-Valid") int i, @NotNull Continuation<? super ResponseData<DefaultCurrencyResponseBean>> continuation);

    @GET("/priapi/v3/b2c/deposit/quotedPrice")
    java.lang.Object KWHzl(@NotNull @Query("baseCurrency") java.lang.String str, @NotNull @Query("quoteCurrency") java.lang.String str2, @NotNull @Query(OtcExtraKeys.SIDE) java.lang.String str3, @Query(OtcExtraKeys.AMOUNT) java.lang.String str4, @Query("standard") int i, @Query("depositName") java.lang.String str5, @Query("paymentMethod") java.lang.String str6, @NotNull Continuation<? super ResponseData<java.util.ArrayList<B2CQuotePriceResponseBean>>> continuation);

    @GET("/priapi/v3/b2c/fiat/common/ui_flow")
    java.lang.Object KWHzl(@NotNull @Query("requestCurrency") java.lang.String str, @NotNull @Query("baseCurrency") java.lang.String str2, @NotNull @Query("tradeType") java.lang.String str3, @Header("Cache-Strategy") java.lang.String str4, @Header("Cache-Expire") java.lang.Integer num, @Header("Cache-Token-Valid") int i, @NotNull Continuation<? super ResponseData<FiatCommonUiFlowResponseBean>> continuation);

    @GET("/priapi/v3/b2c/fiat/currency/balance")
    java.lang.Object KWHzl(@Header("fund_flow_type") java.lang.String str, @Query("currency") java.lang.String str2, @NotNull Continuation<? super ResponseData<AvailableCurrencyBalanceResponseBean>> continuation);

    @POST("/priapi/v3/b2c/recurring/plan/update")
    java.lang.Object OLrzqt(@Body @NotNull RecurringBuyPlanUpdateRequestBean recurringBuyPlanUpdateRequestBean, @NotNull Continuation<? super ResponseData<RecurringBuyPlanUpdateResponseBean>> continuation);

    @GET("/priapi/v3/b2c/recurring/plan/order-list")
    java.lang.Object OLrzqt(@NotNull @Query("planId") java.lang.String str, @Query("pageSize") java.lang.Integer num, @Query("pageNum") java.lang.Integer num2, @Query("status") java.lang.Integer num3, @NotNull Continuation<? super ResponseData<RecurringBuyPlanOrderListRootResponseBean>> continuation);

    @GET("/priapi/v3/b2c/fiat/order/list")
    java.lang.Object OLrzqt(@Query("depositName") java.lang.String str, @Query("orderId") java.lang.String str2, @Query("pageIndex") int i, @Query("pageSize") int i2, @Query("tradeType") java.lang.String str3, @Query("orderStatus") java.lang.String str4, @Query("pastDays") java.lang.Integer num, @NotNull Continuation<? super ResponseData<FiatOrderListResponseBean>> continuation);

    @GET("/priapi/v3/b2c/campaign")
    java.lang.Object OLrzqt(@NotNull @Query("campaignCode") java.lang.String str, @Header("Cache-Strategy") java.lang.String str2, @Header("Cache-Expire") java.lang.Integer num, @NotNull Continuation<? super ResponseData<CampaignResponseBean>> continuation);

    @GET("/priapi/v3/b2c/deposit/getQuote")
    java.lang.Object OLrzqt(@Header("fund_flow_type") java.lang.String str, @NotNull @Query("baseCurrency") java.lang.String str2, @NotNull @Query("baseAmount") java.lang.String str3, @NotNull @Query("quoteCurrency") java.lang.String str4, @NotNull @Query("quoteAmount") java.lang.String str5, @NotNull @Query("tradeType") java.lang.String str6, @NotNull @Query("paymentMethod") java.lang.String str7, @Query("standard") int i, @Query("quoteSide") int i2, @NotNull @Query(OtcExtraKeys.AMOUNT) java.lang.String str8, @NotNull @Query("depositName") java.lang.String str9, @NotNull Continuation<? super ResponseData<B2CQuoteResponseBean>> continuation);

    @GET("/priapi/v5/public/dex/tokenBaseInfo")
    java.lang.Object OLrzqt(@NotNull @Query("chainIndex") java.lang.String str, @NotNull @Query("baseTokenAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<DexBaseTokenResponse>>> continuation);

    @GET("/priapi/v3/b2c/recurring/plan/detail")
    java.lang.Object OLrzqt(@NotNull @Query("planId") java.lang.String str, @NotNull Continuation<? super ResponseData<RecurringBuyPlanDetailRootResponseBean>> continuation);

    @POST("/priapi/v3/b2c/fiat/order/submit")
    java.lang.Object copydefault(@Header("fund_flow_type") java.lang.String str, @Body @NotNull SubmitOrderForOtcAgentRequestBean submitOrderForOtcAgentRequestBean, @NotNull Continuation<? super ResponseData<SubmitOrderForOtcAgentResponseBean>> continuation);

    @GET("/priapi/v3/b2c/fiat/common/getBanner")
    java.lang.Object copydefault(@Header("Cache-Strategy") java.lang.String str, @Header("Cache-Expire") java.lang.Integer num, @Query("flowTypes") java.util.List<java.lang.String> list, @NotNull Continuation<? super ResponseData<GetBannerResponseBean>> continuation);

    @GET("/priapi/v3/b2c/deposit/support-currency")
    java.lang.Object copydefault(@Header("fund_flow_type") java.lang.String str, @Header("Cache-Strategy") java.lang.String str2, @Header("Cache-Expire") java.lang.Integer num, @Header("Cache-Token-Valid") int i, @NotNull @Query("quoteCurrency") java.lang.String str3, @NotNull @Query("tradeType") java.lang.String str4, @NotNull @Query("type") java.lang.String str5, @Query("includeFundingBalance") java.lang.Boolean bool, @NotNull Continuation<? super ResponseData<java.util.List<CurrencyTokenResponseBean>>> continuation);

    @GET("/priapi/v3/b2c/deposit/user-info")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<UserInfoResponseBean>> continuation);

    /* JADX INFO: renamed from: o.mDg$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object getTradeSuggestion$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Integer num2, boolean z, java.lang.String str8, java.lang.String str9, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31770mDg.AEQbTJ((i & 1) != 0 ? BalanceAccountType.FUNDING.getValue() : str, (i & 2) != 0 ? "FIRST_CACHE" : str2, (i & 4) != 0 ? 0 : num, str3, str4, str5, str6, str7, num2, z, str8, str9, (i & 4096) != 0 ? null : bool, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeSuggestion");
        }

        public static /* synthetic */ java.lang.Object getQuotedPrice$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.String str5, java.lang.String str6, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31770mDg.KWHzl(str, str2, str3, str4, i, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getQuotedPrice");
        }

        public static /* synthetic */ java.lang.Object getB2cQuote$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, int i2, java.lang.String str8, java.lang.String str9, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31770mDg.OLrzqt((i3 & 1) != 0 ? BalanceAccountType.FUNDING.getValue() : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? TradeType.BUY.getType() : str6, (i3 & 64) != 0 ? "" : str7, (i3 & 128) != 0 ? 1 : i, (i3 & 256) != 0 ? 1 : i2, (i3 & 512) != 0 ? "" : str8, (i3 & 1024) != 0 ? "" : str9, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getB2cQuote");
        }

        public static /* synthetic */ java.lang.Object getRecurringFrequency$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.Integer num, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecurringFrequency");
            }
            if ((i & 1) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i & 2) != 0) {
                num = 0;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return interfaceC31770mDg.EZpvd(str, num, str2, (Continuation<? super ResponseData<java.util.ArrayList<RecurringBuyFrequencyResponseBean>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object recurringPlanList$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31770mDg.EZpvd((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recurringPlanList");
        }

        public static /* synthetic */ java.lang.Object recurringPlanOrderList$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31770mDg.OLrzqt(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recurringPlanOrderList");
        }

        public static /* synthetic */ java.lang.Object getFiatOrderList$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31770mDg.OLrzqt((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 10 : i2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : num, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFiatOrderList");
        }

        public static /* synthetic */ java.lang.Object getDefaultCurrency$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDefaultCurrency");
            }
            if ((i2 & 1) != 0) {
                str = null;
            }
            java.lang.String str4 = str;
            if ((i2 & 2) != 0) {
                str2 = BalanceAccountType.FUNDING.getValue();
            }
            java.lang.String str5 = str2;
            if ((i2 & 4) != 0) {
                str3 = "FIRST_CACHE";
            }
            java.lang.String str6 = str3;
            if ((i2 & 8) != 0) {
                num = java.lang.Integer.valueOf(RemoteMessageConst.DEFAULT_TTL);
            }
            java.lang.Integer num2 = num;
            if ((i2 & 16) != 0) {
                i = 1;
            }
            return interfaceC31770mDg.KWHzl(str4, str5, str6, num2, i, continuation);
        }

        public static /* synthetic */ java.lang.Object getSellCryptoList$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31770mDg.copydefault((i2 & 1) != 0 ? BalanceAccountType.FUNDING.getValue() : str, str2, num, (i2 & 8) != 0 ? 1 : i, str3, (i2 & 32) != 0 ? "sell" : str4, (i2 & 64) != 0 ? "cefi" : str5, (i2 & 128) != 0 ? null : bool, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSellCryptoList");
        }

        public static /* synthetic */ java.lang.Object getBuyCryptoList$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, int i, java.lang.String str4, java.lang.String str5, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31770mDg.EZpvd(str, (i2 & 2) != 0 ? BalanceAccountType.FUNDING.getValue() : str2, (i2 & 4) != 0 ? "FIRST_CACHE" : str3, (i2 & 8) != 0 ? java.lang.Integer.valueOf(RemoteMessageConst.DEFAULT_TTL) : num, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? "buy" : str4, (i2 & 64) != 0 ? "cefi" : str5, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBuyCryptoList");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mDg */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object getBanner$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.Integer num, java.util.List list, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBanner");
            }
            if ((i & 1) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i & 2) != 0) {
                num = 0;
            }
            if ((i & 4) != 0) {
                list = null;
            }
            return interfaceC31770mDg.copydefault(str, num, list, continuation);
        }

        public static /* synthetic */ java.lang.Object getFiatCommonUiFlow$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31770mDg.KWHzl(str, str2, str3, (i2 & 8) != 0 ? "FIRST_CACHE" : str4, (i2 & 16) != 0 ? java.lang.Integer.valueOf(RemoteMessageConst.DEFAULT_TTL) : num, (i2 & 32) != 0 ? 1 : i, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFiatCommonUiFlow");
        }

        public static /* synthetic */ java.lang.Object getChannelPaymentMethods$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str8, java.lang.Boolean bool, java.lang.String str9, java.lang.String str10, java.lang.Boolean bool2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31770mDg.EZpvd((i & 1) != 0 ? BalanceAccountType.FUNDING.getValue() : str, (i & 2) != 0 ? "FIRST_CACHE" : str2, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? TradeType.BUY.getType() : str7, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : bool2, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChannelPaymentMethods");
        }

        public static /* synthetic */ java.lang.Object getFiatList$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.String str2, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFiatList");
            }
            if ((i & 2) != 0) {
                str2 = "FIRST_CACHE";
            }
            if ((i & 4) != 0) {
                num = 900;
            }
            return interfaceC31770mDg.AEQbTJ(str, str2, num, continuation);
        }

        public static /* synthetic */ java.lang.Object getCurrencyBalance$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrencyBalance");
            }
            if ((i & 1) != 0) {
                str = BalanceAccountType.FUNDING.getValue();
            }
            return interfaceC31770mDg.KWHzl(str, str2, continuation);
        }

        public static /* synthetic */ java.lang.Object getDexQuote$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num, int i, java.lang.String str7, boolean z, java.lang.String str8, java.lang.String str9, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31770mDg.AEQbTJ(str, str2, str3, str4, str5, str6, (i2 & 64) != 0 ? null : num, i, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? null : str8, (i2 & 2048) != 0 ? null : str9, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDexQuote");
        }

        public static /* synthetic */ java.lang.Object submitBuySellOrderForOtcAgent$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, SubmitOrderForOtcAgentRequestBean submitOrderForOtcAgentRequestBean, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitBuySellOrderForOtcAgent");
            }
            if ((i & 1) != 0) {
                str = BalanceAccountType.FUNDING.getValue();
            }
            return interfaceC31770mDg.copydefault(str, submitOrderForOtcAgentRequestBean, continuation);
        }

        public static /* synthetic */ java.lang.Object getCampaign$default(InterfaceC31770mDg interfaceC31770mDg, java.lang.String str, java.lang.String str2, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCampaign");
            }
            if ((i & 2) != 0) {
                str2 = "FIRST_CACHE";
            }
            if ((i & 4) != 0) {
                num = 0;
            }
            return interfaceC31770mDg.OLrzqt(str, str2, num, continuation);
        }
    }

    /* JADX INFO: renamed from: o.mDg$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }

        public final InterfaceC31770mDg OLrzqt() {
            return (InterfaceC31770mDg) C31710mBa.KWHzl(C56524yIo.AEQbTJ(InterfaceC31770mDg.class), new mAV());
        }
    }
}
