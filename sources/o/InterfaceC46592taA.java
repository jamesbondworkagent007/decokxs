package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okmarket.home.NewCoinInfo;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.taA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC46592taA {
    @GET("/priapi/v5/rubik/app/public/new/common-news")
    java.lang.Object KWHzl(@NotNull @Query("group") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.ArrayList<NewCoinInfo>>> continuation);
}
