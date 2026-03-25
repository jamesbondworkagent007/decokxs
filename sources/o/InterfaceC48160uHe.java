package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.balance.dto.AccountBalance;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.uHe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC48160uHe {
    @GET("/priapi/v5/algo/public/user-available-balances")
    java.lang.Object KWHzl(@NotNull @Query("ordType") java.lang.String str, @NotNull @Query("currencyId") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<AccountBalance>>> continuation);
}
