package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.market.features.analysis.futures.sub.ranking.data.model.RankingItemPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.jLh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25921jLh {
    @GET("/priapi/v5/journal/performance/app-ticker")
    java.lang.Object OLrzqt(@Query("posSide") int i, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) java.lang.String str, @Query("valuationUnit") java.lang.String str2, @Query("uid") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<RankingItemPo>>> continuation);
}
