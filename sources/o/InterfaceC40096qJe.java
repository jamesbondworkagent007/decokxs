package o;

import com.okinc.market.search.features.navigation.category.data.NavCategoryChoosePo;
import com.okinc.network.okg.response.ResponseData;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.qJe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40096qJe {
    @GET("/priapi/v5/rubik/search/result-plate")
    java.lang.Object KWHzl(@NotNull @Query(JwtUtilsKt.DID_METHOD_KEY) java.lang.String str, @NotNull Continuation<? super ResponseData<NavCategoryChoosePo>> continuation);
}
