package com.okinc.okex.lite.onboarding.net;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.lite.onboarding.api.UserModeSwitchConfig;
import com.okinc.okex.lite.onboarding.bean.TradingModeRecommendationBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.swT;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes24.dex */
public interface OnBoardingNetworkService {
    public static final Activity Companion = Activity.OLrzqt;

    @GET("/v3/users/mobile/local-config/settings")
    Object getModeSwitchConfig(@NotNull Continuation<? super ResponseData<UserModeSwitchConfig>> continuation);

    @GET("/v3/users/mobile/lite/trading-mode")
    Object getTradingModeRecommendation(@NotNull Continuation<? super ResponseData<TradingModeRecommendationBean>> continuation);

    @POST("/v3/users/mobile/local-config/modify-setting")
    Object setModeSwitchConfig(@Body @NotNull swT swt, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/v3/users/mobile/lite/trading-mode")
    Object setUserTradingModePref(@Body @NotNull TradingModeRecommendationBean tradingModeRecommendationBean, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    public static final class Activity {
        public static final /* synthetic */ Activity OLrzqt = new Activity();

        private Activity() {
        }
    }
}
