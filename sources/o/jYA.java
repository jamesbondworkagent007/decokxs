package o;

import com.okinc.business.data.model.market.HolderDetailResponseData;
import com.okinc.business.data.model.market.TokenHolderResponseData;
import com.okinc.business.dexlogic.bean.TradingHistoryStatisticsResult;
import com.okinc.business.market.features.history.domain.model.StatisticsExtraParams;
import com.okinc.business.market.features.holders.domain.model.HistoryStatistics;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface jYA {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<TradingHistoryStatisticsResult, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull C26289jYy c26289jYy, @NotNull Continuation<? super AbstractC43419rot<TokenHolderResponseData, OKServerException>> continuation);

    void EZpvd();

    java.lang.Object OLrzqt(@NotNull StatisticsExtraParams statisticsExtraParams, @NotNull Continuation<? super Flow<HistoryStatistics>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<HolderDetailResponseData>> continuation);
}
