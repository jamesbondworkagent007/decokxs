package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.data.po.TradingCalendarPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.qgP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40884qgP {
    @GET("/priapi/v5/rubik/discover2/trading-calendar")
    java.lang.Object KWHzl(@NotNull @Query("type") java.lang.String str, @NotNull @Query("size") java.lang.String str2, @NotNull @Query("startTime") java.lang.String str3, @NotNull @Query("endTime") java.lang.String str4, @NotNull Continuation<? super ResponseData<java.util.List<TradingCalendarPo>>> continuation);
}
