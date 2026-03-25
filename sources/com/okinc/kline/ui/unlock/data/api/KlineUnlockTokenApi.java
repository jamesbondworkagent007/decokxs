package com.okinc.kline.ui.unlock.data.api;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.kline.data.KlineCoinInfo;
import com.okinc.kline.ui.unlock.data.po.UnlockProgressInfoPo;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenAllocation;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenEvent;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenSchedule;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes8.dex */
public interface KlineUnlockTokenApi {
    @GET("/priapi/v5/rubik/public/coin-info")
    Object getCoinInvestment(@NotNull @Query("ccy") String str, @NotNull Continuation<? super ResponseData<KlineCoinInfo>> continuation);

    @GET("/priapi/v5/rubik/token-unlock/events")
    Object queryTokenEvent(@NotNull @Query("ccy") String str, @NotNull @Query("type") String str2, @Query("ts") Long l, @Query("pageSize") int i, @NotNull Continuation<? super ResponseData<List<UnlockTokenEvent>>> continuation);

    @GET("/priapi/v5/rubik/token-unlock/progress")
    Object queryTokenProgress(@NotNull @Query("ccy") String str, @NotNull Continuation<? super ResponseData<UnlockProgressInfoPo>> continuation);

    @GET("/priapi/v5/rubik/token-unlock/allocation")
    Object queryUnlockAllocation(@NotNull @Query("ccy") String str, @NotNull Continuation<? super ResponseData<UnlockTokenAllocation>> continuation);

    @GET("/priapi/v5/rubik/token-unlock/schedule")
    Object queryUnlockSchedule(@NotNull @Query("ccy") String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str2, @NotNull Continuation<? super ResponseData<List<UnlockTokenSchedule>>> continuation);

    public static final class TaskDescription {
        public static /* synthetic */ Object queryTokenEvent$default(KlineUnlockTokenApi klineUnlockTokenApi, String str, String str2, Long l, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryTokenEvent");
            }
            if ((i2 & 4) != 0) {
                l = null;
            }
            Long l2 = l;
            if ((i2 & 8) != 0) {
                i = 200;
            }
            return klineUnlockTokenApi.queryTokenEvent(str, str2, l2, i, continuation);
        }
    }
}
