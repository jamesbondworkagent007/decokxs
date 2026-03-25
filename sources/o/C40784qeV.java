package o;

import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.discover.features.markets.sub.overview.data.datasource.IOverviewDataSource;
import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverOverallStatsPo;
import com.okinc.market.discover.features.markets.sub.overview.domain.GetMarketDiscoverOverallStatsUseCase$onExecute$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.model.MarketDiscoverOverallStatsVo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qeV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40784qeV extends AbstractC49400uno<Unit, MarketDiscoverOverallStatsVo> {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC46557tYt EZpvd;
    public final C34937nlq KWHzl;
    public final C40786qeX OLrzqt;
    public final C34941nlu copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((Unit) obj, (Continuation<? super MarketDiscoverOverallStatsVo>) continuation);
    }

    @yCM
    public C40784qeV(@NotNull InterfaceC46557tYt interfaceC46557tYt, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C34941nlu c34941nlu, @NotNull C34937nlq c34937nlq, @NotNull C40786qeX c40786qeX) {
        Intrinsics.checkNotNullParameter(interfaceC46557tYt, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c34941nlu, "");
        Intrinsics.checkNotNullParameter(c34937nlq, "");
        Intrinsics.checkNotNullParameter(c40786qeX, "");
        this.EZpvd = interfaceC46557tYt;
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = c34941nlu;
        this.KWHzl = c34937nlq;
        this.OLrzqt = c40786qeX;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super MarketDiscoverOverallStatsVo> continuation) throws java.lang.Throwable {
        GetMarketDiscoverOverallStatsUseCase$onExecute$1 getMarketDiscoverOverallStatsUseCase$onExecute$1;
        IOverviewDataSource.PayloadTimeZone payloadTimeZone;
        C40784qeV c40784qeV;
        java.lang.Object next;
        MarketDiscoverOverallStatsPo.DominanceCoinPo dominanceCoinPo;
        MarketDiscoverOverallStatsPo marketDiscoverOverallStatsPo;
        java.lang.Object objEZpvd;
        MarketDiscoverOverallStatsPo marketDiscoverOverallStatsPo2;
        C40784qeV c40784qeV2;
        java.lang.String str;
        if (continuation instanceof GetMarketDiscoverOverallStatsUseCase$onExecute$1) {
            getMarketDiscoverOverallStatsUseCase$onExecute$1 = (GetMarketDiscoverOverallStatsUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverOverallStatsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverOverallStatsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverOverallStatsUseCase$onExecute$1 = new GetMarketDiscoverOverallStatsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getMarketDiscoverOverallStatsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverOverallStatsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            int iEZpvd = this.EZpvd.EZpvd();
            if (iEZpvd == 0) {
                payloadTimeZone = IOverviewDataSource.PayloadTimeZone.HOUR_24;
            } else if (iEZpvd == 1) {
                payloadTimeZone = IOverviewDataSource.PayloadTimeZone.UTC_0;
            } else if (iEZpvd == 2) {
                payloadTimeZone = IOverviewDataSource.PayloadTimeZone.UTC_8;
            } else {
                payloadTimeZone = IOverviewDataSource.PayloadTimeZone.HOUR_24;
            }
            C40786qeX c40786qeX = this.OLrzqt;
            getMarketDiscoverOverallStatsUseCase$onExecute$1.L$0 = this;
            getMarketDiscoverOverallStatsUseCase$onExecute$1.label = 1;
            objAEQbTJ = c40786qeX.AEQbTJ(payloadTimeZone, getMarketDiscoverOverallStatsUseCase$onExecute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c40784qeV = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str2 = (java.lang.String) getMarketDiscoverOverallStatsUseCase$onExecute$1.L$3;
                    MarketDiscoverOverallStatsPo.DominanceCoinPo dominanceCoinPo2 = (MarketDiscoverOverallStatsPo.DominanceCoinPo) getMarketDiscoverOverallStatsUseCase$onExecute$1.L$2;
                    marketDiscoverOverallStatsPo2 = (MarketDiscoverOverallStatsPo) getMarketDiscoverOverallStatsUseCase$onExecute$1.L$1;
                    c40784qeV2 = (C40784qeV) getMarketDiscoverOverallStatsUseCase$onExecute$1.L$0;
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    dominanceCoinPo = dominanceCoinPo2;
                    str = str2;
                    java.lang.String str3 = (java.lang.String) objAEQbTJ;
                    C34937nlq c34937nlq = c40784qeV2.KWHzl;
                    java.lang.String capRatio = marketDiscoverOverallStatsPo2.getCapRatio();
                    DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
                    return new MarketDiscoverOverallStatsVo(str, (java.lang.String) c34937nlq.OLrzqt(C56390yDp.OLrzqt(capRatio, displaySign)), str3, (java.lang.String) c40784qeV2.KWHzl.OLrzqt(C56390yDp.OLrzqt(marketDiscoverOverallStatsPo2.getVolumeRatio(), displaySign)), dominanceCoinPo.getCoin(), (java.lang.String) c40784qeV2.KWHzl.OLrzqt(C56390yDp.OLrzqt(dominanceCoinPo.getRatio(), DisplaySign.AUTO)), dominanceCoinPo.getCoinIconUrl());
                }
                MarketDiscoverOverallStatsPo.DominanceCoinPo dominanceCoinPo3 = (MarketDiscoverOverallStatsPo.DominanceCoinPo) getMarketDiscoverOverallStatsUseCase$onExecute$1.L$2;
                marketDiscoverOverallStatsPo = (MarketDiscoverOverallStatsPo) getMarketDiscoverOverallStatsUseCase$onExecute$1.L$1;
                C40784qeV c40784qeV3 = (C40784qeV) getMarketDiscoverOverallStatsUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                dominanceCoinPo = dominanceCoinPo3;
                c40784qeV = c40784qeV3;
                java.lang.String str4 = (java.lang.String) objAEQbTJ;
                C34941nlu c34941nlu = c40784qeV.copydefault;
                java.lang.String volumeValue = marketDiscoverOverallStatsPo.getVolumeValue();
                getMarketDiscoverOverallStatsUseCase$onExecute$1.L$0 = c40784qeV;
                getMarketDiscoverOverallStatsUseCase$onExecute$1.L$1 = marketDiscoverOverallStatsPo;
                getMarketDiscoverOverallStatsUseCase$onExecute$1.L$2 = dominanceCoinPo;
                getMarketDiscoverOverallStatsUseCase$onExecute$1.L$3 = str4;
                getMarketDiscoverOverallStatsUseCase$onExecute$1.label = 3;
                objEZpvd = c34941nlu.EZpvd(volumeValue, getMarketDiscoverOverallStatsUseCase$onExecute$1);
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                marketDiscoverOverallStatsPo2 = marketDiscoverOverallStatsPo;
                objAEQbTJ = objEZpvd;
                c40784qeV2 = c40784qeV;
                str = str4;
                java.lang.String str32 = (java.lang.String) objAEQbTJ;
                C34937nlq c34937nlq2 = c40784qeV2.KWHzl;
                java.lang.String capRatio2 = marketDiscoverOverallStatsPo2.getCapRatio();
                DisplaySign displaySign2 = DisplaySign.EXCEPT_ZERO;
                return new MarketDiscoverOverallStatsVo(str, (java.lang.String) c34937nlq2.OLrzqt(C56390yDp.OLrzqt(capRatio2, displaySign2)), str32, (java.lang.String) c40784qeV2.KWHzl.OLrzqt(C56390yDp.OLrzqt(marketDiscoverOverallStatsPo2.getVolumeRatio(), displaySign2)), dominanceCoinPo.getCoin(), (java.lang.String) c40784qeV2.KWHzl.OLrzqt(C56390yDp.OLrzqt(dominanceCoinPo.getRatio(), DisplaySign.AUTO)), dominanceCoinPo.getCoinIconUrl());
            }
            c40784qeV = (C40784qeV) getMarketDiscoverOverallStatsUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        MarketDiscoverOverallStatsPo marketDiscoverOverallStatsPo3 = (MarketDiscoverOverallStatsPo) objAEQbTJ;
        if (marketDiscoverOverallStatsPo3 == null) {
            return MarketDiscoverOverallStatsVo.Companion.EZpvd();
        }
        java.util.Iterator<T> it = marketDiscoverOverallStatsPo3.getDominance().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((MarketDiscoverOverallStatsPo.DominanceCoinPo) next).getCoin(), (java.lang.Object) "BTC")) {
                break;
            }
        }
        dominanceCoinPo = (MarketDiscoverOverallStatsPo.DominanceCoinPo) next;
        if (dominanceCoinPo == null) {
            return MarketDiscoverOverallStatsVo.Companion.EZpvd();
        }
        C34941nlu c34941nlu2 = c40784qeV.copydefault;
        java.lang.String capValue = marketDiscoverOverallStatsPo3.getCapValue();
        getMarketDiscoverOverallStatsUseCase$onExecute$1.L$0 = c40784qeV;
        getMarketDiscoverOverallStatsUseCase$onExecute$1.L$1 = marketDiscoverOverallStatsPo3;
        getMarketDiscoverOverallStatsUseCase$onExecute$1.L$2 = dominanceCoinPo;
        getMarketDiscoverOverallStatsUseCase$onExecute$1.label = 2;
        java.lang.Object objEZpvd2 = c34941nlu2.EZpvd(capValue, getMarketDiscoverOverallStatsUseCase$onExecute$1);
        if (objEZpvd2 == objCopydefault) {
            return objCopydefault;
        }
        marketDiscoverOverallStatsPo = marketDiscoverOverallStatsPo3;
        objAEQbTJ = objEZpvd2;
        java.lang.String str42 = (java.lang.String) objAEQbTJ;
        C34941nlu c34941nlu3 = c40784qeV.copydefault;
        java.lang.String volumeValue2 = marketDiscoverOverallStatsPo.getVolumeValue();
        getMarketDiscoverOverallStatsUseCase$onExecute$1.L$0 = c40784qeV;
        getMarketDiscoverOverallStatsUseCase$onExecute$1.L$1 = marketDiscoverOverallStatsPo;
        getMarketDiscoverOverallStatsUseCase$onExecute$1.L$2 = dominanceCoinPo;
        getMarketDiscoverOverallStatsUseCase$onExecute$1.L$3 = str42;
        getMarketDiscoverOverallStatsUseCase$onExecute$1.label = 3;
        objEZpvd = c34941nlu3.EZpvd(volumeValue2, getMarketDiscoverOverallStatsUseCase$onExecute$1);
        if (objEZpvd != objCopydefault) {
        }
    }
}
