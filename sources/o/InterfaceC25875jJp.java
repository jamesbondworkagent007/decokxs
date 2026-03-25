package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundindFeeRateInfoPo;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundingFeePo;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.SwapCoinPairPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.jJp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25875jJp {
    @GET("/priapi/v5/journal/estimated-funding-fee")
    java.lang.Object KWHzl(@NotNull @Query("sort") java.lang.String str, @Query("uid") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<FundindFeeRateInfoPo>>> continuation);

    @GET("/priapi/v5/journal/swaps")
    java.lang.Object KWHzl(@Query("uid") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<SwapCoinPairPo>>> continuation);

    @GET("/priapi/v5/journal/funding-fee")
    java.lang.Object OLrzqt(@NotNull @Query("valuationUnit") java.lang.String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) java.lang.String str2, @Query("instId") java.lang.String str3, @Query("uid") java.lang.String str4, @NotNull Continuation<? super ResponseData<java.util.List<FundingFeePo>>> continuation);
}
