package o;

import com.okinc.market.quotation.data.model.stock.StockListPo;
import com.okinc.market.ticker.repo.MarketRankTickersRepository$getWsMarketStockRankTickerFlow$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qVd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40419qVd {
    public final qUB EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C40419qVd(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull qUB qub) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        Intrinsics.checkNotNullParameter(qub, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = coroutineDispatcher2;
        this.EZpvd = qub;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super Flow<? extends java.util.List<StockListPo>>> continuation) throws java.lang.Throwable {
        MarketRankTickersRepository$getWsMarketStockRankTickerFlow$1 marketRankTickersRepository$getWsMarketStockRankTickerFlow$1;
        C40419qVd c40419qVd;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof MarketRankTickersRepository$getWsMarketStockRankTickerFlow$1) {
            marketRankTickersRepository$getWsMarketStockRankTickerFlow$1 = (MarketRankTickersRepository$getWsMarketStockRankTickerFlow$1) continuation;
            int i = marketRankTickersRepository$getWsMarketStockRankTickerFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketRankTickersRepository$getWsMarketStockRankTickerFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                marketRankTickersRepository$getWsMarketStockRankTickerFlow$1 = new MarketRankTickersRepository$getWsMarketStockRankTickerFlow$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = marketRankTickersRepository$getWsMarketStockRankTickerFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketRankTickersRepository$getWsMarketStockRankTickerFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                Result.Application application = Result.Companion;
                qUB qub = this.EZpvd;
                marketRankTickersRepository$getWsMarketStockRankTickerFlow$1.L$0 = this;
                marketRankTickersRepository$getWsMarketStockRankTickerFlow$1.label = 1;
                objEZpvd = qub.EZpvd(marketRankTickersRepository$getWsMarketStockRankTickerFlow$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c40419qVd = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c40419qVd = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c40419qVd = (C40419qVd) marketRankTickersRepository$getWsMarketStockRankTickerFlow$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((Flow) objEZpvd);
        Flow flowEmptyFlow = FlowKt.emptyFlow();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = flowEmptyFlow;
        }
        return FlowKt.flowOn((Flow) objM7377constructorimpl, c40419qVd.AEQbTJ());
    }
}
