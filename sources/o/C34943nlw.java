package o;

import com.okinc.find_ui.features.opportunity.overall.data.model.MarketOverallStatsPo;
import com.okinc.find_ui.features.opportunity.overall.domain.usecase.FormatOverallStatsUseCase$onExecute$1;
import com.okinc.find_ui.features.opportunity.overall.ui.model.MarketOverallStatsVo;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.ext.CryptoCellTagColor;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nlw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34943nlw extends AbstractC49400uno<MarketOverallStatsPo, MarketOverallStatsVo> {
    public final C34937nlq AEQbTJ;
    public final InterfaceC54577xNn EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C34941nlu copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((MarketOverallStatsPo) obj, (Continuation<? super MarketOverallStatsVo>) continuation);
    }

    @yCM
    public C34943nlw(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull C34941nlu c34941nlu, @NotNull C34937nlq c34937nlq) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c34941nlu, "");
        Intrinsics.checkNotNullParameter(c34937nlq, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = interfaceC54577xNn;
        this.copydefault = c34941nlu;
        this.AEQbTJ = c34937nlq;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(MarketOverallStatsPo marketOverallStatsPo, @NotNull Continuation<? super MarketOverallStatsVo> continuation) throws java.lang.Throwable {
        FormatOverallStatsUseCase$onExecute$1 formatOverallStatsUseCase$onExecute$1;
        java.lang.Object next;
        MarketOverallStatsPo.DominanceCoinPo dominanceCoinPo;
        C34943nlw c34943nlw;
        java.lang.String str;
        MarketOverallStatsPo.DominanceCoinPo dominanceCoinPo2;
        C34943nlw c34943nlw2;
        MarketOverallStatsPo marketOverallStatsPo2;
        InterfaceC54577xNn interfaceC54577xNn;
        java.lang.String name;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        TradeCoinInfo tradeCoinInfoAhwBna;
        MarketOverallStatsPo marketOverallStatsPo3 = marketOverallStatsPo;
        if (continuation instanceof FormatOverallStatsUseCase$onExecute$1) {
            formatOverallStatsUseCase$onExecute$1 = (FormatOverallStatsUseCase$onExecute$1) continuation;
            int i = formatOverallStatsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                formatOverallStatsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                formatOverallStatsUseCase$onExecute$1 = new FormatOverallStatsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = formatOverallStatsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = formatOverallStatsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (marketOverallStatsPo3 == null) {
                return MarketOverallStatsVo.Companion.AEQbTJ();
            }
            java.util.Iterator<T> it = marketOverallStatsPo.getDominance().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((MarketOverallStatsPo.DominanceCoinPo) next).getCoin(), (java.lang.Object) "BTC")) {
                    break;
                }
            }
            dominanceCoinPo = (MarketOverallStatsPo.DominanceCoinPo) next;
            if (dominanceCoinPo == null) {
                return MarketOverallStatsVo.Companion.AEQbTJ();
            }
            C34941nlu c34941nlu = this.copydefault;
            java.lang.String capValue = marketOverallStatsPo.getCapValue();
            formatOverallStatsUseCase$onExecute$1.L$0 = this;
            formatOverallStatsUseCase$onExecute$1.L$1 = marketOverallStatsPo3;
            formatOverallStatsUseCase$onExecute$1.L$2 = dominanceCoinPo;
            formatOverallStatsUseCase$onExecute$1.label = 1;
            objEZpvd = c34941nlu.EZpvd(capValue, formatOverallStatsUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c34943nlw = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str2 = (java.lang.String) formatOverallStatsUseCase$onExecute$1.L$3;
                dominanceCoinPo2 = (MarketOverallStatsPo.DominanceCoinPo) formatOverallStatsUseCase$onExecute$1.L$2;
                marketOverallStatsPo2 = (MarketOverallStatsPo) formatOverallStatsUseCase$onExecute$1.L$1;
                c34943nlw2 = (C34943nlw) formatOverallStatsUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                str = str2;
                java.lang.String str3 = (java.lang.String) objEZpvd;
                C34937nlq c34937nlq = c34943nlw2.AEQbTJ;
                java.lang.String capRatio = marketOverallStatsPo2.getCapRatio();
                DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
                java.lang.String str4 = (java.lang.String) c34937nlq.OLrzqt(C56390yDp.OLrzqt(capRatio, displaySign));
                java.lang.String str5 = (java.lang.String) c34943nlw2.AEQbTJ.OLrzqt(C56390yDp.OLrzqt(marketOverallStatsPo2.getVolumeRatio(), displaySign));
                java.lang.String str6 = (java.lang.String) c34943nlw2.AEQbTJ.OLrzqt(C56390yDp.OLrzqt(dominanceCoinPo2.getRatio(), DisplaySign.AUTO));
                CryptoCellTagColor cryptoCellTagColorAEQbTJ = C34897nlC.AEQbTJ(marketOverallStatsPo2.getCapRatio());
                CryptoCellTagColor cryptoCellTagColorAEQbTJ2 = C34897nlC.AEQbTJ(marketOverallStatsPo2.getVolumeRatio());
                java.lang.String coin = dominanceCoinPo2.getCoin();
                java.lang.String coinIconUrl = dominanceCoinPo2.getCoinIconUrl();
                interfaceC54577xNn = c34943nlw2.EZpvd;
                if (interfaceC54577xNn != null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(dominanceCoinPo2.getCoin())) == null || (name = tradeCoinInfoAhwBna.getName()) == null) {
                    name = "";
                }
                return new MarketOverallStatsVo(str, str4, cryptoCellTagColorAEQbTJ, str3, str5, cryptoCellTagColorAEQbTJ2, coin, str6, coinIconUrl, name);
            }
            MarketOverallStatsPo.DominanceCoinPo dominanceCoinPo3 = (MarketOverallStatsPo.DominanceCoinPo) formatOverallStatsUseCase$onExecute$1.L$2;
            MarketOverallStatsPo marketOverallStatsPo4 = (MarketOverallStatsPo) formatOverallStatsUseCase$onExecute$1.L$1;
            c34943nlw = (C34943nlw) formatOverallStatsUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            dominanceCoinPo = dominanceCoinPo3;
            marketOverallStatsPo3 = marketOverallStatsPo4;
        }
        java.lang.String str7 = (java.lang.String) objEZpvd;
        C34941nlu c34941nlu2 = c34943nlw.copydefault;
        java.lang.String volumeValue = marketOverallStatsPo3.getVolumeValue();
        formatOverallStatsUseCase$onExecute$1.L$0 = c34943nlw;
        formatOverallStatsUseCase$onExecute$1.L$1 = marketOverallStatsPo3;
        formatOverallStatsUseCase$onExecute$1.L$2 = dominanceCoinPo;
        formatOverallStatsUseCase$onExecute$1.L$3 = str7;
        formatOverallStatsUseCase$onExecute$1.label = 2;
        java.lang.Object objEZpvd2 = c34941nlu2.EZpvd(volumeValue, formatOverallStatsUseCase$onExecute$1);
        if (objEZpvd2 == objCopydefault) {
            return objCopydefault;
        }
        str = str7;
        objEZpvd = objEZpvd2;
        dominanceCoinPo2 = dominanceCoinPo;
        c34943nlw2 = c34943nlw;
        marketOverallStatsPo2 = marketOverallStatsPo3;
        java.lang.String str32 = (java.lang.String) objEZpvd;
        C34937nlq c34937nlq2 = c34943nlw2.AEQbTJ;
        java.lang.String capRatio2 = marketOverallStatsPo2.getCapRatio();
        DisplaySign displaySign2 = DisplaySign.EXCEPT_ZERO;
        java.lang.String str42 = (java.lang.String) c34937nlq2.OLrzqt(C56390yDp.OLrzqt(capRatio2, displaySign2));
        java.lang.String str52 = (java.lang.String) c34943nlw2.AEQbTJ.OLrzqt(C56390yDp.OLrzqt(marketOverallStatsPo2.getVolumeRatio(), displaySign2));
        java.lang.String str62 = (java.lang.String) c34943nlw2.AEQbTJ.OLrzqt(C56390yDp.OLrzqt(dominanceCoinPo2.getRatio(), DisplaySign.AUTO));
        CryptoCellTagColor cryptoCellTagColorAEQbTJ3 = C34897nlC.AEQbTJ(marketOverallStatsPo2.getCapRatio());
        CryptoCellTagColor cryptoCellTagColorAEQbTJ22 = C34897nlC.AEQbTJ(marketOverallStatsPo2.getVolumeRatio());
        java.lang.String coin2 = dominanceCoinPo2.getCoin();
        java.lang.String coinIconUrl2 = dominanceCoinPo2.getCoinIconUrl();
        interfaceC54577xNn = c34943nlw2.EZpvd;
        if (interfaceC54577xNn != null) {
            name = "";
        }
        return new MarketOverallStatsVo(str, str42, cryptoCellTagColorAEQbTJ3, str32, str52, cryptoCellTagColorAEQbTJ22, coin2, str62, coinIconUrl2, name);
    }
}
