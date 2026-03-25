package o;

import com.okinc.market.quotation.data.model.stock.StockListPo;
import com.okinc.market.ranking.core.model.RankingTabsVo;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import com.okinc.market.ranking.core.model.po.SearchHotPo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_find.data.HotRankResponse;
import com.okinc.unify_find.data.MarketCapRank;
import com.okinc.unify_find.data.NewCoinGroupResponse;
import com.okinc.unify_find.data.TurnOverRank;
import com.okinc.unify_find.data.UpDownRank;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: o.qut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC41656qut {
    @GET("/priapi/v5/rubik/futures/up-down-rank")
    java.lang.Object AEQbTJ(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<java.util.Map<java.lang.String, java.util.List<FuturesRankItemPo>>>>> continuation);

    @GET("/priapi/v5/rubik/app/public/popular-searches")
    java.lang.Object AYXKKw(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<SearchHotPo>>> continuation);

    @GET("/priapi/v5/rubik/app/public/stock-rank")
    java.lang.Object AhwBna(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<StockListPo>>> continuation);

    @GET("/priapi/v5/rubik/app/public/hot-rank")
    java.lang.Object EZpvd(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<HotRankResponse>>> continuation);

    @GET("/priapi/v5/rubik/app/futures/ranking")
    java.lang.Object KWHzl(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<FuturesRankItemPo>>> continuation);

    @GET("/priapi/v5/rubik/app/public/new-coin-rank")
    java.lang.Object OLrzqt(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<NewCoinGroupResponse>>> continuation);

    @GET("/priapi/v5/rubik/app/public/market-cap-rank")
    java.lang.Object copydefault(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<MarketCapRank>>> continuation);

    @GET("/priapi/v5/rubik/app/public/all-rank-list")
    java.lang.Object djBIcL(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<RankingTabsVo>>> continuation);

    @GET("/priapi/v5/rubik/app/public/turn-over-rank")
    java.lang.Object gEmmrt(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<TurnOverRank>>> continuation);

    @GET("/priapi/v5/rubik/app/public/up-down-rank")
    java.lang.Object valueOf(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<java.util.Map<java.lang.String, java.util.List<UpDownRank>>>>> continuation);
}
