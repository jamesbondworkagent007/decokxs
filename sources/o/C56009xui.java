package o;

import androidx.lifecycle.LiveData;
import com.okinc.unify_trade.biz.CoinAssetParam;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.Distribution;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.bot.data.BotRemindData;
import com.okinc.unify_trade.bot.data.TacticsCoinsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideLineItemData;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC56005xue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56009xui implements InterfaceC56005xue {
    public StrategyReqGroup copydefault;
    public java.lang.String OLrzqt = "";
    public java.lang.String AEQbTJ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(StrategyReqGroup strategyReqGroup) {
        this.copydefault = strategyReqGroup;
    }

    @Override // o.InterfaceC56005xue
    public LiveData<java.util.List<Distribution>> OLrzqt() {
        return null;
    }

    @Override // o.InterfaceC56005xue
    public void EZpvd(@NotNull java.lang.Object obj) {
        InterfaceC56005xue.ActionBar.AEQbTJ(this, obj);
    }

    @Override // o.InterfaceC56005xue
    public java.util.List<java.lang.Object> AEQbTJ() {
        java.lang.String strAYXKKw;
        java.lang.Object localized$default;
        java.lang.String strEZpvd;
        java.lang.String interval;
        java.lang.String stgyName;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        StrategyReqGroup strategyReqGroup = this.copydefault;
        SmartPortfolioReq smartPortfolioReq = strategyReqGroup != null ? strategyReqGroup.getSmartPortfolioReq() : null;
        TacticsInsideItemData tacticsInsideItemData = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.seekTo), C33070mpX.AYXKKw(C55688xof.Application.FractionRes), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        if (Intrinsics.EZpvd((java.lang.Object) (smartPortfolioReq != null ? smartPortfolioReq.getBalType() : null), (java.lang.Object) "ratio")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ChecksSdkIntAtLeast);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.suggest);
        }
        TacticsInsideItemData tacticsInsideItemData2 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.codename), strAYXKKw, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        TacticsInsideItemData tacticsInsideItemData3 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.previous), (smartPortfolioReq == null || (stgyName = smartPortfolioReq.getStgyName()) == null) ? "" : stgyName, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        if (Intrinsics.EZpvd((java.lang.Object) (smartPortfolioReq != null ? smartPortfolioReq.getBalType() : null), (java.lang.Object) "ratio")) {
            xMR xmr = xMR.copydefault;
            java.lang.String deltaRatio = smartPortfolioReq.getDeltaRatio();
            strEZpvd = xMR.formatPercent$default(xmr, deltaRatio == null ? "" : deltaRatio, 0, 0, null, 10, null);
        } else {
            if (C33129mqd.OLrzqt((java.lang.Object) C33129mqd.remS$default(smartPortfolioReq != null ? smartPortfolioReq.getInterval() : null, 60, null, null, null, 14, null), (java.lang.Object) 0)) {
                java.lang.String strDivS$default = C33129mqd.divS$default(smartPortfolioReq != null ? smartPortfolioReq.getInterval() : null, 60, null, null, null, 14, null);
                strEZpvd = pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C55688xof.Activity.EZpvd, C33129mqd.AhwBna(strDivS$default), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(strDivS$default, null, 1, null))));
            } else {
                android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
                int i = C55688xof.Activity.AEQbTJ;
                int iAhwBna = C33129mqd.AhwBna(smartPortfolioReq != null ? smartPortfolioReq.getInterval() : null);
                if (smartPortfolioReq == null || (interval = smartPortfolioReq.getInterval()) == null || (localized$default = pTB.formatLocalized$default(interval, null, 1, null)) == null) {
                    localized$default = 0;
                }
                strEZpvd = pTD.EZpvd(applicationOLrzqt, i, iAhwBna, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", localized$default)));
            }
        }
        TacticsInsideItemData tacticsInsideItemData4 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.CheckResult), strEZpvd, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        TacticsCoinsInsideItemData tacticsCoinsInsideItemDataCopydefault = copydefault();
        TacticsInsideLineItemData tacticsInsideLineItemData = new TacticsInsideLineItemData(0, 0, 0, 4, null);
        BotRemindData botRemindData = new BotRemindData(C33070mpX.AYXKKw(C55688xof.Application.IdRes), 0, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), null, 10, null);
        arrayList.add(tacticsInsideItemData);
        arrayList.add(tacticsInsideItemData3);
        arrayList.add(tacticsInsideItemData2);
        arrayList.add(tacticsInsideItemData4);
        arrayList.add(tacticsCoinsInsideItemDataCopydefault);
        arrayList.add(tacticsInsideLineItemData);
        arrayList.add(botRemindData);
        return arrayList;
    }

    public final TacticsCoinsInsideItemData copydefault() {
        java.util.List<CoinRatioParam> listAhwBna;
        StrategyReqGroup strategyReqGroup = this.copydefault;
        SmartPortfolioReq smartPortfolioReq = strategyReqGroup != null ? strategyReqGroup.getSmartPortfolioReq() : null;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImplApi24);
        if (smartPortfolioReq == null || (listAhwBna = smartPortfolioReq.getPortfolioList()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        return new TacticsCoinsInsideItemData(strAYXKKw, listAhwBna, 0, 0, 12, null);
    }

    public java.lang.String AYXKKw() {
        SmartPortfolioReq smartPortfolioReq;
        java.util.List<CoinAssetParam> capitalList;
        CoinAssetParam coinAssetParam;
        StrategyReqGroup strategyReqGroup = this.copydefault;
        return (strategyReqGroup == null || (smartPortfolioReq = strategyReqGroup.getSmartPortfolioReq()) == null || (capitalList = smartPortfolioReq.getCapitalList()) == null || (coinAssetParam = (CoinAssetParam) CollectionsKt___CollectionsKt.firstOrNull(capitalList)) == null) ? "" : coinAssetParam.getCcy();
    }

    @Override // o.InterfaceC56005xue
    public java.lang.String EZpvd() {
        return AYXKKw();
    }

    @Override // o.InterfaceC56005xue
    public java.lang.String KWHzl() {
        SmartPortfolioReq smartPortfolioReq;
        java.util.List<CoinAssetParam> capitalList;
        CoinAssetParam coinAssetParam;
        StrategyReqGroup strategyReqGroup = this.copydefault;
        return (strategyReqGroup == null || (smartPortfolioReq = strategyReqGroup.getSmartPortfolioReq()) == null || (capitalList = smartPortfolioReq.getCapitalList()) == null || (coinAssetParam = (CoinAssetParam) CollectionsKt___CollectionsKt.firstOrNull(capitalList)) == null) ? "" : C56033xvF.fmtBotValueBySymbol$default(coinAssetParam.getCcy(), coinAssetParam.getSz(), RoundingMode.UP, true, null, false, null, null, null, null, null, 2032, null);
    }
}
