package o;

import com.okinc.market.discover.features.markets.boost.data.po.CedefiBoostPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes9.dex */
public interface pZF {
    @GET("/priapi/v5/public/dex/boost/home/bannerList")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<java.util.List<CedefiBoostPo>>> continuation);
}
