package o;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.data.model.PnlDetailPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.jMp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25956jMp {
    @GET("/priapi/v5/journal/spot/pnl-detail")
    java.lang.Object KWHzl(@Query("type") java.lang.Integer num, @Query("valuationUnit") java.lang.String str, @Query("costPriceType") java.lang.String str2, @Query("hideLowValueCcy") java.lang.Boolean bool, @Query("sort") java.lang.Integer num2, @Query("uid") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<PnlDetailPo>>> continuation);
}
