package com.okinc.unify_trade.net;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotAssetsHistoryData;
import com.okinc.unify_trade.biz.CustomerSignalsData;
import com.okinc.unify_trade.biz.SpotDcaAdditionalFundParamRep;
import com.okinc.unify_trade.biz.SpotDcaAdditionalFundParamResp;
import com.okinc.unify_trade.biz.SpotDcaEditParamRep;
import com.okinc.unify_trade.biz.SpotGridEditParamRep;
import com.okinc.unify_trade.biz.StrategyUserSummaryData;
import com.okinc.unify_trade.biz.TrailingPxReq;
import com.okinc.unify_trade.biz.TrailingPxResp;
import java.util.List;
import kotlin.coroutines.Continuation;
import o.C43417ror;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
public interface BotApiService {
    public static final StateListAnimator Companion = StateListAnimator.OLrzqt;

    @GET("/priapi/v5/algo/marketplace/strategy-assets-history")
    Object getBotAssetsHistory(@NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str, @NotNull Continuation<? super ResponseData<List<BotAssetsHistoryData>>> continuation);

    @GET("/priapi/v5/algo/trade/marketplace/user-summary")
    Object getBotUserSummary(@NotNull @Query("ordType") String str, @NotNull Continuation<? super ResponseData<List<StrategyUserSummaryData>>> continuation);

    @GET("/priapi/v5/algo/marketplace/signal-customer/signals")
    Object getCustomerSignals(@NotNull @Query("page") String str, @NotNull @Query("pageSize") String str2, @Query("orderBy") String str3, @Query("orderDirection") String str4, @Query("type") String str5, @NotNull Continuation<? super ResponseData<List<CustomerSignalsData>>> continuation);

    @GET("/priapi/v5/algo/marketplace/strategy-assets-history")
    Object getSingleBotAssetsHistory(@NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str, @NotNull @Query("ordType") String str2, @NotNull Continuation<? super ResponseData<List<BotAssetsHistoryData>>> continuation);

    @POST("/priapi/v5/algo/grid/default-stop-trailing-price")
    Object getTrailingPx(@Body @NotNull TrailingPxReq trailingPxReq, @NotNull Continuation<? super ResponseData<List<TrailingPxResp>>> continuation);

    @POST("/priapi/v5/algo/spot-dca/additional-fund-for-edit")
    Object spotDcaAdditionalFundForEdit(@Body @NotNull SpotDcaAdditionalFundParamRep spotDcaAdditionalFundParamRep, @NotNull Continuation<? super ResponseData<List<SpotDcaAdditionalFundParamResp>>> continuation);

    @POST("/priapi/v5/algo/spot-dca/parameters-edits")
    Object spotDcaModifyParameters(@Body @NotNull SpotDcaEditParamRep spotDcaEditParamRep, @NotNull Continuation<? super ResponseData<List<SpotGridEditParamRep>>> continuation);

    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
        }

        public final BotApiService AEQbTJ() {
            return (BotApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BotApiService.class));
        }
    }
}
