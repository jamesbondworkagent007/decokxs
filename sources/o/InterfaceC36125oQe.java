package o;

import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.oQe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC36125oQe {
    @GET("/priapi/v5/rubik/anomaly/big-event")
    java.lang.Object copydefault(@NotNull @Query("instId") java.lang.String str, @Query("pageSize") java.lang.Integer num, @Query("cursor") java.lang.String str2, @Query("unit") java.lang.String str3, @Query("displayInstName") java.lang.String str4, @Query("useNewTemp") int i, @NotNull Continuation<? super ResponseData<java.util.List<MarketEventResp>>> continuation);

    /* JADX INFO: renamed from: o.oQe$Activity */
    public static final class Activity {
        public static /* synthetic */ java.lang.Object getMarketEvents$default(InterfaceC36125oQe interfaceC36125oQe, java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC36125oQe.copydefault(str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? 1 : i, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketEvents");
        }
    }
}
