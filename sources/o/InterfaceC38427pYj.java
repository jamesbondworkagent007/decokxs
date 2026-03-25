package o;

import com.okinc.market.discover.features.filter.data.model.FilterCoinPo;
import com.okinc.market.discover.features.filter.data.model.TokenGroupPo;
import com.okinc.market.discover.features.filter.data.model.UpdateCustomReq;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.pYj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC38427pYj {
    @POST("/priapi/v5/rubik/content/tokenFilter/updateCustom")
    java.lang.Object KWHzl(@Body @NotNull UpdateCustomReq updateCustomReq, @NotNull Continuation<? super ResponseData<java.util.List<Unit>>> continuation);

    @GET("/priapi/v5/rubik/public/content/tokenFilter/queryTokenGroupInfo")
    java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<TokenGroupPo>>> continuation);

    @GET("/priapi/v5/rubik/public/content/tokenFilter/getAll")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<java.util.List<FilterCoinPo>>> continuation);
}
