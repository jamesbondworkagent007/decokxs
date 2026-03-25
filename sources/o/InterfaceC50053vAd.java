package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.order.strategy.api.dto.grid.StopBotPreComputeDto;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.vAd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC50053vAd {
    @GET("/priapi/v5/algo/grid/precompute-stop")
    java.lang.Object EZpvd(@NotNull @Query("algoId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<StopBotPreComputeDto>>> continuation);
}
