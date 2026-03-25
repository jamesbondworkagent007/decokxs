package o;

import com.okinc.market.quotation.data.model.stock.StockListPo;
import com.okinc.market.ranking.core.engine.data.datasource.impl.RankingDataSourceImpl$getFuturesRanking$1;
import com.okinc.market.ranking.core.engine.data.datasource.impl.RankingDataSourceImpl$getHotRank$1;
import com.okinc.market.ranking.core.engine.data.datasource.impl.RankingDataSourceImpl$getMarketCapRank$1;
import com.okinc.market.ranking.core.engine.data.datasource.impl.RankingDataSourceImpl$getNewCoinRank$1;
import com.okinc.market.ranking.core.engine.data.datasource.impl.RankingDataSourceImpl$getPopularSearchesRank$1;
import com.okinc.market.ranking.core.engine.data.datasource.impl.RankingDataSourceImpl$getRankListConfig$1;
import com.okinc.market.ranking.core.engine.data.datasource.impl.RankingDataSourceImpl$getStockRank$1;
import com.okinc.market.ranking.core.engine.data.datasource.impl.RankingDataSourceImpl$getTurnOverRank$1;
import com.okinc.market.ranking.core.engine.data.datasource.impl.RankingDataSourceImpl$getUpDownRank$1;
import com.okinc.market.ranking.core.engine.data.datasource.impl.RankingDataSourceImpl$queryFuturesGainersRanking$1;
import com.okinc.market.ranking.core.model.RankingTabsVo;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import com.okinc.market.ranking.core.model.po.SearchHotPo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_find.data.HotRankResponse;
import com.okinc.unify_find.data.MarketCapRank;
import com.okinc.unify_find.data.NewCoinGroupResponse;
import com.okinc.unify_find.data.TurnOverRank;
import com.okinc.unify_find.data.UpDownRank;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41659quw {
    public final InterfaceC41656qut OLrzqt = (InterfaceC41656qut) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC41656qut.class));

    @yCM
    public C41659quw() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object valueOf(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super RankingTabsVo> continuation) throws java.lang.Throwable {
        RankingDataSourceImpl$getRankListConfig$1 rankingDataSourceImpl$getRankListConfig$1;
        if (continuation instanceof RankingDataSourceImpl$getRankListConfig$1) {
            rankingDataSourceImpl$getRankListConfig$1 = (RankingDataSourceImpl$getRankListConfig$1) continuation;
            int i = rankingDataSourceImpl$getRankListConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rankingDataSourceImpl$getRankListConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                rankingDataSourceImpl$getRankListConfig$1 = new RankingDataSourceImpl$getRankListConfig$1(this, continuation);
            }
        }
        java.lang.Object objDjBIcL = rankingDataSourceImpl$getRankListConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rankingDataSourceImpl$getRankListConfig$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objDjBIcL);
            InterfaceC41656qut interfaceC41656qut = this.OLrzqt;
            rankingDataSourceImpl$getRankListConfig$1.label = 1;
            objDjBIcL = interfaceC41656qut.djBIcL(map, rankingDataSourceImpl$getRankListConfig$1);
            if (objDjBIcL == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objDjBIcL);
        }
        java.util.List list = (java.util.List) ((ResponseData) objDjBIcL).getData();
        if (list != null) {
            return (RankingTabsVo) CollectionsKt___CollectionsKt.firstOrNull(list);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<HotRankResponse>> continuation) throws java.lang.Throwable {
        RankingDataSourceImpl$getHotRank$1 rankingDataSourceImpl$getHotRank$1;
        if (continuation instanceof RankingDataSourceImpl$getHotRank$1) {
            rankingDataSourceImpl$getHotRank$1 = (RankingDataSourceImpl$getHotRank$1) continuation;
            int i = rankingDataSourceImpl$getHotRank$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rankingDataSourceImpl$getHotRank$1.label = i - Integer.MIN_VALUE;
            } else {
                rankingDataSourceImpl$getHotRank$1 = new RankingDataSourceImpl$getHotRank$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = rankingDataSourceImpl$getHotRank$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rankingDataSourceImpl$getHotRank$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC41656qut interfaceC41656qut = this.OLrzqt;
            rankingDataSourceImpl$getHotRank$1.label = 1;
            objEZpvd = interfaceC41656qut.EZpvd(map, rankingDataSourceImpl$getHotRank$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return ((ResponseData) objEZpvd).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<NewCoinGroupResponse>> continuation) throws java.lang.Throwable {
        RankingDataSourceImpl$getNewCoinRank$1 rankingDataSourceImpl$getNewCoinRank$1;
        if (continuation instanceof RankingDataSourceImpl$getNewCoinRank$1) {
            rankingDataSourceImpl$getNewCoinRank$1 = (RankingDataSourceImpl$getNewCoinRank$1) continuation;
            int i = rankingDataSourceImpl$getNewCoinRank$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rankingDataSourceImpl$getNewCoinRank$1.label = i - Integer.MIN_VALUE;
            } else {
                rankingDataSourceImpl$getNewCoinRank$1 = new RankingDataSourceImpl$getNewCoinRank$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = rankingDataSourceImpl$getNewCoinRank$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rankingDataSourceImpl$getNewCoinRank$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            InterfaceC41656qut interfaceC41656qut = this.OLrzqt;
            rankingDataSourceImpl$getNewCoinRank$1.label = 1;
            objOLrzqt = interfaceC41656qut.OLrzqt(map, rankingDataSourceImpl$getNewCoinRank$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return ((ResponseData) objOLrzqt).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AhwBna(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<? extends java.util.Map<java.lang.String, ? extends java.util.List<UpDownRank>>>> continuation) throws java.lang.Throwable {
        RankingDataSourceImpl$getUpDownRank$1 rankingDataSourceImpl$getUpDownRank$1;
        if (continuation instanceof RankingDataSourceImpl$getUpDownRank$1) {
            rankingDataSourceImpl$getUpDownRank$1 = (RankingDataSourceImpl$getUpDownRank$1) continuation;
            int i = rankingDataSourceImpl$getUpDownRank$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rankingDataSourceImpl$getUpDownRank$1.label = i - Integer.MIN_VALUE;
            } else {
                rankingDataSourceImpl$getUpDownRank$1 = new RankingDataSourceImpl$getUpDownRank$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = rankingDataSourceImpl$getUpDownRank$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rankingDataSourceImpl$getUpDownRank$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objValueOf);
            InterfaceC41656qut interfaceC41656qut = this.OLrzqt;
            rankingDataSourceImpl$getUpDownRank$1.label = 1;
            objValueOf = interfaceC41656qut.valueOf(map, rankingDataSourceImpl$getUpDownRank$1);
            if (objValueOf == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objValueOf);
        }
        return ((ResponseData) objValueOf).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<MarketCapRank>> continuation) throws java.lang.Throwable {
        RankingDataSourceImpl$getMarketCapRank$1 rankingDataSourceImpl$getMarketCapRank$1;
        if (continuation instanceof RankingDataSourceImpl$getMarketCapRank$1) {
            rankingDataSourceImpl$getMarketCapRank$1 = (RankingDataSourceImpl$getMarketCapRank$1) continuation;
            int i = rankingDataSourceImpl$getMarketCapRank$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rankingDataSourceImpl$getMarketCapRank$1.label = i - Integer.MIN_VALUE;
            } else {
                rankingDataSourceImpl$getMarketCapRank$1 = new RankingDataSourceImpl$getMarketCapRank$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = rankingDataSourceImpl$getMarketCapRank$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = rankingDataSourceImpl$getMarketCapRank$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC41656qut interfaceC41656qut = this.OLrzqt;
            rankingDataSourceImpl$getMarketCapRank$1.label = 1;
            objCopydefault = interfaceC41656qut.copydefault(map, rankingDataSourceImpl$getMarketCapRank$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        return ((ResponseData) objCopydefault).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object gEmmrt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<StockListPo>> continuation) throws java.lang.Throwable {
        RankingDataSourceImpl$getStockRank$1 rankingDataSourceImpl$getStockRank$1;
        if (continuation instanceof RankingDataSourceImpl$getStockRank$1) {
            rankingDataSourceImpl$getStockRank$1 = (RankingDataSourceImpl$getStockRank$1) continuation;
            int i = rankingDataSourceImpl$getStockRank$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rankingDataSourceImpl$getStockRank$1.label = i - Integer.MIN_VALUE;
            } else {
                rankingDataSourceImpl$getStockRank$1 = new RankingDataSourceImpl$getStockRank$1(this, continuation);
            }
        }
        java.lang.Object objAhwBna = rankingDataSourceImpl$getStockRank$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rankingDataSourceImpl$getStockRank$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAhwBna);
            InterfaceC41656qut interfaceC41656qut = this.OLrzqt;
            rankingDataSourceImpl$getStockRank$1.label = 1;
            objAhwBna = interfaceC41656qut.AhwBna(map, rankingDataSourceImpl$getStockRank$1);
            if (objAhwBna == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAhwBna);
        }
        return ((ResponseData) objAhwBna).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AYXKKw(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<TurnOverRank>> continuation) throws java.lang.Throwable {
        RankingDataSourceImpl$getTurnOverRank$1 rankingDataSourceImpl$getTurnOverRank$1;
        if (continuation instanceof RankingDataSourceImpl$getTurnOverRank$1) {
            rankingDataSourceImpl$getTurnOverRank$1 = (RankingDataSourceImpl$getTurnOverRank$1) continuation;
            int i = rankingDataSourceImpl$getTurnOverRank$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rankingDataSourceImpl$getTurnOverRank$1.label = i - Integer.MIN_VALUE;
            } else {
                rankingDataSourceImpl$getTurnOverRank$1 = new RankingDataSourceImpl$getTurnOverRank$1(this, continuation);
            }
        }
        java.lang.Object objGEmmrt = rankingDataSourceImpl$getTurnOverRank$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rankingDataSourceImpl$getTurnOverRank$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objGEmmrt);
            InterfaceC41656qut interfaceC41656qut = this.OLrzqt;
            rankingDataSourceImpl$getTurnOverRank$1.label = 1;
            objGEmmrt = interfaceC41656qut.gEmmrt(map, rankingDataSourceImpl$getTurnOverRank$1);
            if (objGEmmrt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objGEmmrt);
        }
        return ((ResponseData) objGEmmrt).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<SearchHotPo>> continuation) throws java.lang.Throwable {
        RankingDataSourceImpl$getPopularSearchesRank$1 rankingDataSourceImpl$getPopularSearchesRank$1;
        if (continuation instanceof RankingDataSourceImpl$getPopularSearchesRank$1) {
            rankingDataSourceImpl$getPopularSearchesRank$1 = (RankingDataSourceImpl$getPopularSearchesRank$1) continuation;
            int i = rankingDataSourceImpl$getPopularSearchesRank$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rankingDataSourceImpl$getPopularSearchesRank$1.label = i - Integer.MIN_VALUE;
            } else {
                rankingDataSourceImpl$getPopularSearchesRank$1 = new RankingDataSourceImpl$getPopularSearchesRank$1(this, continuation);
            }
        }
        java.lang.Object objAYXKKw = rankingDataSourceImpl$getPopularSearchesRank$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rankingDataSourceImpl$getPopularSearchesRank$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAYXKKw);
            InterfaceC41656qut interfaceC41656qut = this.OLrzqt;
            rankingDataSourceImpl$getPopularSearchesRank$1.label = 1;
            objAYXKKw = interfaceC41656qut.AYXKKw(map, rankingDataSourceImpl$getPopularSearchesRank$1);
            if (objAYXKKw == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAYXKKw);
        }
        return ((ResponseData) objAYXKKw).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<FuturesRankItemPo>> continuation) throws java.lang.Throwable {
        RankingDataSourceImpl$getFuturesRanking$1 rankingDataSourceImpl$getFuturesRanking$1;
        if (continuation instanceof RankingDataSourceImpl$getFuturesRanking$1) {
            rankingDataSourceImpl$getFuturesRanking$1 = (RankingDataSourceImpl$getFuturesRanking$1) continuation;
            int i = rankingDataSourceImpl$getFuturesRanking$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rankingDataSourceImpl$getFuturesRanking$1.label = i - Integer.MIN_VALUE;
            } else {
                rankingDataSourceImpl$getFuturesRanking$1 = new RankingDataSourceImpl$getFuturesRanking$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = rankingDataSourceImpl$getFuturesRanking$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rankingDataSourceImpl$getFuturesRanking$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            InterfaceC41656qut interfaceC41656qut = this.OLrzqt;
            rankingDataSourceImpl$getFuturesRanking$1.label = 1;
            objKWHzl = interfaceC41656qut.KWHzl(map, rankingDataSourceImpl$getFuturesRanking$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return ((ResponseData) objKWHzl).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object djBIcL(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<? extends java.util.Map<java.lang.String, ? extends java.util.List<FuturesRankItemPo>>>> continuation) throws java.lang.Throwable {
        RankingDataSourceImpl$queryFuturesGainersRanking$1 rankingDataSourceImpl$queryFuturesGainersRanking$1;
        if (continuation instanceof RankingDataSourceImpl$queryFuturesGainersRanking$1) {
            rankingDataSourceImpl$queryFuturesGainersRanking$1 = (RankingDataSourceImpl$queryFuturesGainersRanking$1) continuation;
            int i = rankingDataSourceImpl$queryFuturesGainersRanking$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rankingDataSourceImpl$queryFuturesGainersRanking$1.label = i - Integer.MIN_VALUE;
            } else {
                rankingDataSourceImpl$queryFuturesGainersRanking$1 = new RankingDataSourceImpl$queryFuturesGainersRanking$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = rankingDataSourceImpl$queryFuturesGainersRanking$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rankingDataSourceImpl$queryFuturesGainersRanking$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            InterfaceC41656qut interfaceC41656qut = this.OLrzqt;
            rankingDataSourceImpl$queryFuturesGainersRanking$1.label = 1;
            objAEQbTJ = interfaceC41656qut.AEQbTJ(map, rankingDataSourceImpl$queryFuturesGainersRanking$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return ((ResponseData) objAEQbTJ).getData();
    }
}
