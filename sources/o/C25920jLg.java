package o;

import com.okinc.business.market.features.analysis.futures.sub.ranking.data.datasource.IFuturesRankingDataSource;
import com.okinc.business.market.features.analysis.futures.sub.ranking.data.model.RankingItemPo;
import com.okinc.business.market.features.analysis.futures.sub.ranking.data.repo.RankingListRepository$getRankingListData$1;
import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jLg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25920jLg {
    public final CoroutineDispatcher AEQbTJ;
    public final C25923jLj KWHzl;

    @yCM
    public C25920jLg(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C25923jLj c25923jLj) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c25923jLj, "");
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = c25923jLj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull IFuturesRankingDataSource.PayloadPnlType payloadPnlType, @NotNull PayloadPeriod payloadPeriod, java.lang.String str, java.lang.String str2, @NotNull Continuation<? super java.util.List<RankingItemPo>> continuation) throws java.lang.Throwable {
        RankingListRepository$getRankingListData$1 rankingListRepository$getRankingListData$1;
        if (continuation instanceof RankingListRepository$getRankingListData$1) {
            rankingListRepository$getRankingListData$1 = (RankingListRepository$getRankingListData$1) continuation;
            int i = rankingListRepository$getRankingListData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rankingListRepository$getRankingListData$1.label = i - Integer.MIN_VALUE;
            } else {
                rankingListRepository$getRankingListData$1 = new RankingListRepository$getRankingListData$1(this, continuation);
            }
        }
        RankingListRepository$getRankingListData$1 rankingListRepository$getRankingListData$12 = rankingListRepository$getRankingListData$1;
        java.lang.Object objEZpvd = rankingListRepository$getRankingListData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rankingListRepository$getRankingListData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C25923jLj c25923jLj = this.KWHzl;
            rankingListRepository$getRankingListData$12.label = 1;
            objEZpvd = c25923jLj.EZpvd(payloadPnlType, payloadPeriod, str, str2, rankingListRepository$getRankingListData$12);
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
}
