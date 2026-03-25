package o;

import com.okinc.business.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingTokenData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29249kqA {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<? extends java.util.List<TrendingTokenData>>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Flow<? extends java.util.List<TrendingTokenData>>> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<CandlesticksBean>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TrendingTokenData>, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43419rot<TrendingConfigData, OKServerException>> continuation);
}
