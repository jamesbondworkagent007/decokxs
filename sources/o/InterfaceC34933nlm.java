package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.find_ui.features.opportunity.overall.data.model.MarketDataPo;
import com.okinc.find_ui.features.opportunity.overall.data.model.MarketOverallStatsPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.nlm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC34933nlm {
    @GET("/priapi/v5/rubik/discover2/market-data")
    java.lang.Object OLrzqt(@NotNull @Query("type") java.lang.String str, @Query("size") int i, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<MarketDataPo>>> continuation);

    @GET("/priapi/v5/rubik/public/overall-market-stats")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<MarketOverallStatsPo>> continuation);
}
