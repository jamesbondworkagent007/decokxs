package com.okinc.market.common.service;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.find_ui.data.AssetDistributionData;
import com.okinc.find_ui.data.ContractLongShortRatioData;
import com.okinc.find_ui.data.InterestAndTradingUnionItem;
import com.okinc.find_ui.data.KlineBuySellData;
import com.okinc.find_ui.data.KlineCapitalFlowData;
import com.okinc.find_ui.data.KlineFundingRateData;
import com.okinc.find_ui.data.LongShortRatioData;
import com.okinc.market.common.bean.PreMarketLandingDetail;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.market.common.biz_spot.bean.DeleteRuleRep;
import com.okinc.market.common.biz_spot.bean.EditAlertReq;
import com.okinc.market.common.biz_spot.bean.InstrumentActiveInfo;
import com.okinc.market.common.biz_spot.bean.PriceRemindAddReq;
import com.okinc.market.common.biz_spot.bean.Rules;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.AbstractC58185ywX;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
public interface BizMarketService {
    @POST("/priapi/v5/rubik/alert-common/rule/add")
    AbstractC58185ywX<ResponseData<Unit>> addPriceRemind(@Body PriceRemindAddReq priceRemindAddReq);

    @POST("/priapi/v5/rubik/alert-common/rule/singleDelete")
    AbstractC58185ywX<ResponseData<Unit>> deletePriceRemind(@Body DeleteRuleRep deleteRuleRep);

    @POST("/priapi/v5/rubik/alert-common/rule/batchDelete")
    AbstractC58185ywX<ResponseData<Unit>> deletePriceReminds(@Body Rules rules);

    @POST("/priapi/v5/rubik/alert-common/rule/singleDelete")
    Object deletePriceRemindsByInstName(@Body @NotNull DeleteRuleRep deleteRuleRep, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v5/rubik/alert-common/rule/edit")
    Object editPriceReminds(@Body @NotNull EditAlertReq editAlertReq, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v5/rubik/alert-common/rule/active")
    Object editPriceRemindsActive(@Body @NotNull InstrumentActiveInfo instrumentActiveInfo, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @GET("/priapi/v5/rubik/stat/spot/{instName}/taker-distribution")
    AbstractC58185ywX<ResponseData<AssetDistributionData>> getAssetDistribution(@Path("instName") @NotNull String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str2);

    @GET("/priapi/v5/rubik/stat/contracts/{instName}/taker-volume")
    AbstractC58185ywX<ResponseData<KlineBuySellData>> getBuyAndSell(@Path("instName") @NotNull String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str2, @NotNull @Query("unit") String str3);

    @GET("/priapi/v5/rubik/stat/spot/{instName}/taker-trend")
    AbstractC58185ywX<ResponseData<ArrayList<KlineCapitalFlowData>>> getCapitalFlow(@Path("instName") @NotNull String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str2);

    @GET("priapi/v5/rubik/stat/contracts/{instName}/long-short-account-ratio")
    AbstractC58185ywX<ResponseData<ArrayList<ContractLongShortRatioData>>> getContractLongShortRatio(@Path("instName") @NotNull String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str2);

    @GET("/priapi/v5/rubik/stat/contracts/{instName}/funding-rate-history")
    AbstractC58185ywX<ResponseData<ArrayList<KlineFundingRateData>>> getFundingRate(@Path("instName") @NotNull String str);

    @GET("/priapi/v5/rubik/stat/contracts/{instName}/open-interest-volume-union")
    AbstractC58185ywX<ResponseData<ArrayList<InterestAndTradingUnionItem>>> getInterestAndTrading(@Path("instName") @NotNull String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str2);

    @GET("/priapi/v5/rubik/alert-common/rule/unified/list")
    AbstractC58185ywX<ResponseData<ArrayList<AlertRemindPo>>> getListByInstrument();

    @GET("/priapi/v5/rubik/stat/margin/{instName}/loan-ratio")
    AbstractC58185ywX<ResponseData<ArrayList<LongShortRatioData>>> getLongShortRatio(@Path("instName") @NotNull String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str2);

    @GET("/priapi/v5/rubik/premarket/tokenList")
    AbstractC58185ywX<ResponseData<PreMarketLandingDetail>> loadPreMarketLandingList();
}
