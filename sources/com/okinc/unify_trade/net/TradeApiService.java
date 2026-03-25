package com.okinc.unify_trade.net;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.TradeBehaviorBean;
import com.okinc.unify_trade.biz.AccountTradeConfig;
import com.okinc.unify_trade.biz.HiddenCurrencyBean;
import com.okinc.unify_trade.biz.InstConfigInfo;
import com.okinc.unify_trade.biz.InstTypeGroup;
import com.okinc.unify_trade.biz.SignalCloneAffiliationInfo;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
public interface TradeApiService {
    public static final TaskDescription Companion = TaskDescription.EZpvd;

    @GET("priapi/v5/public/inst-group")
    Object getInstTypeAndGroup(@NotNull Continuation<? super ResponseData<List<InstTypeGroup>>> continuation);

    @GET("/priapi/v5/account/inst-config-info")
    Object getMarginModeConfig(@NotNull Continuation<? super ResponseData<ArrayList<InstConfigInfo>>> continuation);

    @GET("priapi/v5/copytrade/sgl-clone/get-provider-info")
    Object getSignalCloneAffiliation(@NotNull Continuation<? super ResponseData<List<SignalCloneAffiliationInfo>>> continuation);

    @GET("priapi/v5/rubik/public/trade-behavior")
    Object getTradeBehavior(@NotNull Continuation<? super ResponseData<TradeBehaviorBean>> continuation);

    @GET("priapi/v5/public/coins")
    Object getTradeCoins(@NotNull Continuation<? super ResponseData<ArrayList<TradeCoinInfo>>> continuation);

    @GET("priapi/v5/account/config-trade-info")
    Object getTradeInfoAndConfig(@NotNull Continuation<? super ResponseData<ArrayList<AccountTradeConfig>>> continuation);

    @GET("/v2/asset/accounts/hidden-currency-with-search")
    Object loadHiddenCoinsList(@Query("checkBalance") boolean z, @NotNull Continuation<? super ResponseData<ArrayList<HiddenCurrencyBean>>> continuation);

    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }
}
