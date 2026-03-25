package o;

import com.okinc.business.dexlogic.main.market.bean.LiquidityPairData;
import com.okinc.business.market.data.model.LiquidityChartData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface jQL {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<LiquidityChartData, OKServerException>> continuation);

    void AEQbTJ(@NotNull java.lang.String str);

    void EZpvd();

    java.lang.String KWHzl(java.lang.String str);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<LiquidityPairData, OKServerException>> continuation);
}
