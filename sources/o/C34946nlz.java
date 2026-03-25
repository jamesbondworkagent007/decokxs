package o;

import com.okinc.find_ui.features.opportunity.overall.data.datasource.IMarketOverallDataSource;
import com.okinc.find_ui.features.opportunity.overall.data.model.MarketDataPo;
import com.okinc.find_ui.features.opportunity.overall.data.model.MarketOverallStatsPo;
import com.okinc.find_ui.features.opportunity.overall.domain.usecase.GetMarketOverallStatsUseCase$onExecute$1;
import com.okinc.find_ui.features.opportunity.overall.ui.model.MarketOverallStatsVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.data.po.TradingCalendarPo;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nlz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34946nlz extends AbstractC49400uno<Triple<? extends java.lang.String, ? extends java.lang.Integer, ? extends IMarketOverallDataSource.PayloadPeriod>, C34896nlB> {
    public final C34943nlw AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final C34945nly KWHzl;
    public final C34938nlr copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C34946nlz(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C34938nlr c34938nlr, @NotNull C34943nlw c34943nlw, @NotNull C34945nly c34945nly) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c34938nlr, "");
        Intrinsics.checkNotNullParameter(c34943nlw, "");
        Intrinsics.checkNotNullParameter(c34945nly, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = c34938nlr;
        this.AEQbTJ = c34943nlw;
        this.KWHzl = c34945nly;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Triple<java.lang.String, java.lang.Integer, ? extends IMarketOverallDataSource.PayloadPeriod> triple, @NotNull Continuation<? super C34896nlB> continuation) throws java.lang.Throwable {
        GetMarketOverallStatsUseCase$onExecute$1 getMarketOverallStatsUseCase$onExecute$1;
        C34946nlz c34946nlz;
        MarketDataPo marketDataPo;
        java.lang.Object objEZpvd;
        MarketOverallStatsVo marketOverallStatsVo;
        if (continuation instanceof GetMarketOverallStatsUseCase$onExecute$1) {
            getMarketOverallStatsUseCase$onExecute$1 = (GetMarketOverallStatsUseCase$onExecute$1) continuation;
            int i = getMarketOverallStatsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketOverallStatsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketOverallStatsUseCase$onExecute$1 = new GetMarketOverallStatsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd2 = getMarketOverallStatsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketOverallStatsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd2);
            java.lang.String strComponent1 = triple.component1();
            int iIntValue = triple.component2().intValue();
            IMarketOverallDataSource.PayloadPeriod payloadPeriodComponent3 = triple.component3();
            C34938nlr c34938nlr = this.copydefault;
            getMarketOverallStatsUseCase$onExecute$1.L$0 = this;
            getMarketOverallStatsUseCase$onExecute$1.label = 1;
            objEZpvd2 = c34938nlr.EZpvd(strComponent1, iIntValue, payloadPeriodComponent3, getMarketOverallStatsUseCase$onExecute$1);
            if (objEZpvd2 == objCopydefault) {
                return objCopydefault;
            }
            c34946nlz = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    marketOverallStatsVo = (MarketOverallStatsVo) getMarketOverallStatsUseCase$onExecute$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd2);
                    return new C34896nlB(marketOverallStatsVo, (java.util.List) objEZpvd2);
                }
                marketDataPo = (MarketDataPo) getMarketOverallStatsUseCase$onExecute$1.L$1;
                c34946nlz = (C34946nlz) getMarketOverallStatsUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd2);
                MarketOverallStatsVo marketOverallStatsVo2 = (MarketOverallStatsVo) objEZpvd2;
                C34945nly c34945nly = c34946nlz.KWHzl;
                java.util.List<TradingCalendarPo> calendarDataList = marketDataPo == null ? marketDataPo.getCalendarDataList() : null;
                getMarketOverallStatsUseCase$onExecute$1.L$0 = marketOverallStatsVo2;
                getMarketOverallStatsUseCase$onExecute$1.L$1 = null;
                getMarketOverallStatsUseCase$onExecute$1.label = 3;
                objEZpvd = c34945nly.EZpvd(calendarDataList, getMarketOverallStatsUseCase$onExecute$1);
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                objEZpvd2 = objEZpvd;
                marketOverallStatsVo = marketOverallStatsVo2;
                return new C34896nlB(marketOverallStatsVo, (java.util.List) objEZpvd2);
            }
            C34946nlz c34946nlz2 = (C34946nlz) getMarketOverallStatsUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd2);
            c34946nlz = c34946nlz2;
        }
        java.util.List list = (java.util.List) objEZpvd2;
        marketDataPo = list != null ? (MarketDataPo) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
        C34943nlw c34943nlw = c34946nlz.AEQbTJ;
        MarketOverallStatsPo marketStats = marketDataPo != null ? marketDataPo.getMarketStats() : null;
        getMarketOverallStatsUseCase$onExecute$1.L$0 = c34946nlz;
        getMarketOverallStatsUseCase$onExecute$1.L$1 = marketDataPo;
        getMarketOverallStatsUseCase$onExecute$1.label = 2;
        objEZpvd2 = c34943nlw.EZpvd(marketStats, getMarketOverallStatsUseCase$onExecute$1);
        if (objEZpvd2 == objCopydefault) {
            return objCopydefault;
        }
        MarketOverallStatsVo marketOverallStatsVo22 = (MarketOverallStatsVo) objEZpvd2;
        C34945nly c34945nly2 = c34946nlz.KWHzl;
        if (marketDataPo == null) {
        }
        getMarketOverallStatsUseCase$onExecute$1.L$0 = marketOverallStatsVo22;
        getMarketOverallStatsUseCase$onExecute$1.L$1 = null;
        getMarketOverallStatsUseCase$onExecute$1.label = 3;
        objEZpvd = c34945nly2.EZpvd(calendarDataList, getMarketOverallStatsUseCase$onExecute$1);
        if (objEZpvd != objCopydefault) {
        }
    }
}
