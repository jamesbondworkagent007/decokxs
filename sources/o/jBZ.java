package o;

import com.okinc.business.market.features.address_tracker_sa.domain.model.TopTradersItem;
import com.okinc.business.market.features.smart_money.ranking.domain.model.RankingWsExtraParams;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface jBZ {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TopTradersItem>, OKServerException>> continuation);

    void EZpvd();

    java.lang.Object KWHzl(@NotNull jBH jbh, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<jBB, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<jBC, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull RankingWsExtraParams rankingWsExtraParams, @NotNull Continuation<? super Flow<jBB>> continuation);
}
