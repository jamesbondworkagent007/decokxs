package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.FundingRateArbResult;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.xou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC55703xou {
    @GET("/priapi/v5/algo/public/arbitrage/funding-rate-arbitrage")
    AbstractC58185ywX<ResponseData<java.util.List<FundingRateArbResult>>> copydefault(@NotNull @Query("type") java.lang.String str, @NotNull @Query("ccyType") java.lang.String str2);
}
