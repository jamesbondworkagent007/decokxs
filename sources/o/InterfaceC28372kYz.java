package o;

import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.kYz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28372kYz {
    @GET("/priapi/v1/dx/strategy/common/currencyTokenList")
    java.lang.Object KWHzl(@Query("userUniqueId") java.lang.String str, @Query("accountId") java.lang.String str2, @Query("bizMode") java.lang.Integer num, @Query("chainId") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<MemeCurrencyBean>>> continuation);
}
