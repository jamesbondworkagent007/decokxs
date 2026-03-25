package o;

import com.okinc.market.quotation.data.model.stock.StockListPo;
import com.okinc.market.ranking.core.engine.data.repo.RankingRepo$queryFuturesGainersRanking$2;
import com.okinc.market.ranking.core.engine.data.repo.RankingRepo$queryFuturesRanking$2;
import com.okinc.market.ranking.core.engine.data.repo.RankingRepo$queryHotRank$2;
import com.okinc.market.ranking.core.engine.data.repo.RankingRepo$queryMarketCapRank$2;
import com.okinc.market.ranking.core.engine.data.repo.RankingRepo$queryNewCoinRank$2;
import com.okinc.market.ranking.core.engine.data.repo.RankingRepo$queryPopularSearchesRank$2;
import com.okinc.market.ranking.core.engine.data.repo.RankingRepo$queryRankListConfig$2;
import com.okinc.market.ranking.core.engine.data.repo.RankingRepo$queryStockRank$2;
import com.okinc.market.ranking.core.engine.data.repo.RankingRepo$queryTurnOverRank$2;
import com.okinc.market.ranking.core.engine.data.repo.RankingRepo$queryUpDownRank$2;
import com.okinc.market.ranking.core.model.RankingTabsVo;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import com.okinc.market.ranking.core.model.po.SearchHotPo;
import com.okinc.unify_find.data.HotRankResponse;
import com.okinc.unify_find.data.MarketCapRank;
import com.okinc.unify_find.data.NewCoinGroupResponse;
import com.okinc.unify_find.data.TurnOverRank;
import com.okinc.unify_find.data.UpDownRank;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41662quz {
    public final CoroutineDispatcher EZpvd;
    public final C41659quw OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher OLrzqt() {
        return this.EZpvd;
    }

    @yCM
    public C41662quz(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41659quw c41659quw) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41659quw, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = c41659quw;
    }

    public final java.lang.Object djBIcL(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super RankingTabsVo> continuation) {
        return BuildersKt.withContext(OLrzqt(), new RankingRepo$queryRankListConfig$2(this, map, null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<HotRankResponse>> continuation) {
        return BuildersKt.withContext(OLrzqt(), new RankingRepo$queryHotRank$2(this, map, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<NewCoinGroupResponse>> continuation) {
        return BuildersKt.withContext(OLrzqt(), new RankingRepo$queryNewCoinRank$2(this, map, null), continuation);
    }

    public final java.lang.Object AhwBna(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<StockListPo>> continuation) {
        return BuildersKt.withContext(OLrzqt(), new RankingRepo$queryStockRank$2(this, map, null), continuation);
    }

    public final java.lang.Object valueOf(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<? extends java.util.Map<java.lang.String, ? extends java.util.List<UpDownRank>>>> continuation) {
        return BuildersKt.withContext(OLrzqt(), new RankingRepo$queryUpDownRank$2(this, map, null), continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<MarketCapRank>> continuation) {
        return BuildersKt.withContext(OLrzqt(), new RankingRepo$queryMarketCapRank$2(this, map, null), continuation);
    }

    public final java.lang.Object gEmmrt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<TurnOverRank>> continuation) {
        return BuildersKt.withContext(OLrzqt(), new RankingRepo$queryTurnOverRank$2(this, map, null), continuation);
    }

    public final java.lang.Object AYXKKw(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<SearchHotPo>> continuation) {
        return BuildersKt.withContext(OLrzqt(), new RankingRepo$queryPopularSearchesRank$2(this, map, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<FuturesRankItemPo>> continuation) {
        return BuildersKt.withContext(OLrzqt(), new RankingRepo$queryFuturesRanking$2(this, map, null), continuation);
    }

    public final java.lang.Object KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<? extends java.util.Map<java.lang.String, ? extends java.util.List<FuturesRankItemPo>>>> continuation) {
        return BuildersKt.withContext(OLrzqt(), new RankingRepo$queryFuturesGainersRanking$2(this, map, null), continuation);
    }
}
