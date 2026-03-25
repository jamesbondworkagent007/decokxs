package o;

import androidx.lifecycle.LiveData;
import com.okinc.unify_trade.biz.ArbInvestDetailsBean;
import com.okinc.unify_trade.biz.ArbInvestDetailsItems;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.CostVo;
import com.okinc.unify_trade.biz.Distribution;
import com.okinc.unify_trade.biz.EstimatedClosePnlVo;
import com.okinc.unify_trade.biz.EstimatedStakingVo;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import o.InterfaceC56005xue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xuc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56003xuc implements InterfaceC56005xue {
    public StrategyReqGroup OLrzqt;
    public java.lang.String copydefault = "";
    public java.lang.String AEQbTJ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(StrategyReqGroup strategyReqGroup) {
        this.OLrzqt = strategyReqGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
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
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object next3;
        java.lang.String lever;
        java.lang.String strAYXKKw;
        java.lang.String strKWHzl;
        PlaceOrderCondition openCondition;
        ArbInvestDetailsBean investDetails;
        java.lang.String strAYXKKw2;
        EstimatedStakingVo estimatedStaking;
        EstimatedStakingVo estimatedAutoStaking;
        StrategyConfigInfo config;
        StrategyConfigInfo config2;
        StrategyConfigInfo config3;
        StrategyConfigInfo config4;
        java.lang.String amt;
        java.lang.String amt2;
        ArbInvestDetailsBean investDetails2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        StrategyReqGroup strategyReqGroup = this.OLrzqt;
        TacticsInsideItemData tacticsInsideItemData = null;
        SmartArbitrageReq smartArbitrageReq = strategyReqGroup != null ? strategyReqGroup.getSmartArbitrageReq() : null;
        ArbInvestDetailsBean arbInvestDetailsBean = (smartArbitrageReq == null || (investDetails2 = smartArbitrageReq.getInvestDetails()) == null) ? new ArbInvestDetailsBean((java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ArbInvestDetailsBeanStakingType4UI) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ArbitrageTotalPnlInfo) null, false, (java.lang.String) null, (java.lang.String) null, (EstimatedStakingVo) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, 67108863, (DefaultConstructorMarker) null) : investDetails2;
        TacticsInsideItemData tacticsInsideItemData2 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ContextAwareKtwithContextAvailable2listener1), C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, this.copydefault, this.AEQbTJ, false, false, 12, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        TacticsInsideItemData tacticsInsideItemData3 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.clearAvailableContext), C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatConnectionCallbackConnectionCallbackApi21), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        java.util.Iterator<T> it = arbInvestDetailsBean.getArbItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ArbInvestDetailsItems arbInvestDetailsItems = (ArbInvestDetailsItems) next;
            if (Intrinsics.EZpvd((java.lang.Object) arbInvestDetailsItems.getInstType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) arbInvestDetailsItems.getInstType(), (java.lang.Object) "MARGIN")) {
                break;
            }
        }
        ArbInvestDetailsItems arbInvestDetailsItems2 = (ArbInvestDetailsItems) next;
        TacticsInsideItemData tacticsInsideItemData4 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onConnected), C56033xvF.fmtBotValueBySymbol$default(arbInvestDetailsBean.getUnit(), (arbInvestDetailsItems2 == null || (amt2 = arbInvestDetailsItems2.getAmt()) == null) ? "" : amt2, RoundingMode.UP, true, null, false, null, null, null, null, null, 2032, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        java.util.Iterator<T> it2 = arbInvestDetailsBean.getArbItems().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((ArbInvestDetailsItems) next2).getInstType(), (java.lang.Object) "SWAP")) {
                break;
            }
        }
        ArbInvestDetailsItems arbInvestDetailsItems3 = (ArbInvestDetailsItems) next2;
        TacticsInsideItemData tacticsInsideItemData5 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setCallbacksMessenger), C56033xvF.fmtBotValueBySymbol$default(arbInvestDetailsBean.getUnit(), (arbInvestDetailsItems3 == null || (amt = arbInvestDetailsItems3.getAmt()) == null) ? "" : amt, RoundingMode.UP, true, null, false, null, null, null, null, null, 2032, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        java.util.Iterator<T> it3 = arbInvestDetailsBean.getArbItems().iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((ArbInvestDetailsItems) next3).getInstType(), (java.lang.Object) "SWAP")) {
                break;
            }
        }
        ArbInvestDetailsItems arbInvestDetailsItems4 = (ArbInvestDetailsItems) next3;
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatConnectionCallback);
        if (arbInvestDetailsItems4 == null || (lever = arbInvestDetailsItems4.getLever()) == null) {
            lever = "";
        }
        boolean z = false;
        TacticsInsideItemData tacticsInsideItemData6 = new TacticsInsideItemData(strAYXKKw3, C56033xvF.getBotLever$default(lever, false, 2, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        if (C33129mqd.KWHzl((java.util.Collection) ((smartArbitrageReq == null || (config4 = smartArbitrageReq.getConfig()) == null) ? null : config4.getAutoStaking()))) {
            if (C33129mqd.KWHzl((java.util.Collection) ((smartArbitrageReq == null || (config3 = smartArbitrageReq.getConfig()) == null) ? null : config3.getAutoEarn()))) {
                z = true;
            }
        }
        boolean zKWHzl = C33129mqd.KWHzl((java.util.Collection) ((smartArbitrageReq == null || (config2 = smartArbitrageReq.getConfig()) == null) ? null : config2.getAutoEarn()));
        boolean zKWHzl2 = C33129mqd.KWHzl((java.util.Collection) ((smartArbitrageReq == null || (config = smartArbitrageReq.getConfig()) == null) ? null : config.getAutoStaking()));
        if (z) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.unsubscribe);
        } else if (zKWHzl2) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.sendCustomAction);
        } else if (zKWHzl) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.subscribe);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.subscribe);
        }
        java.lang.String str = strAYXKKw;
        java.lang.String smartArbiStakingApy = smartArbitrageReq != null ? smartArbitrageReq.getSmartArbiStakingApy() : null;
        java.lang.String formatedRatio$default = getFormatedRatio$default(this, smartArbiStakingApy == null ? "" : smartArbiStakingApy, null, false, 6, null);
        java.lang.String smartArbiStakingApy2 = smartArbitrageReq != null ? smartArbitrageReq.getSmartArbiStakingApy() : null;
        TacticsInsideItemData tacticsInsideItemData7 = new TacticsInsideItemData(str, formatedRatio$default, null, 0, 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) (smartArbiStakingApy2 != null ? smartArbiStakingApy2 : ""))), null, null, null, null, null, null, 130044, null);
        TacticsInsideItemData tacticsInsideItemDataAEQbTJ = (smartArbitrageReq == null || (estimatedAutoStaking = smartArbitrageReq.getEstimatedAutoStaking()) == null) ? null : AEQbTJ(estimatedAutoStaking.getStakingTotalBaseAmt(), estimatedAutoStaking.getBaseCcy());
        TacticsInsideItemData tacticsInsideItemDataAEQbTJ2 = (smartArbitrageReq == null || (estimatedStaking = smartArbitrageReq.getEstimatedStaking()) == null) ? null : AEQbTJ(estimatedStaking.getStakingTotalBaseAmt(), estimatedStaking.getStakeBaseCcy());
        if (smartArbitrageReq != null && (investDetails = smartArbitrageReq.getInvestDetails()) != null && investDetails.getAllowLeverPrincipal()) {
            java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.search);
            java.lang.Float leveragePrincipal = smartArbitrageReq.getLeveragePrincipal();
            if (leveragePrincipal == null || (strAYXKKw2 = C56033xvF.formatLeverPrincipal$default(java.lang.Float.valueOf(leveragePrincipal.floatValue()), null, 2, null)) == null) {
                strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKttrackPipAnimationHintView2);
            }
            tacticsInsideItemData = new TacticsInsideItemData(strAYXKKw4, strAYXKKw2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        }
        java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal);
        if (smartArbitrageReq == null || (openCondition = smartArbitrageReq.getOpenCondition()) == null || (strKWHzl = C56033xvF.KWHzl(arbInvestDetailsBean.getUnit(), openCondition)) == null) {
            strKWHzl = "--";
        }
        TacticsInsideItemData tacticsInsideItemData8 = new TacticsInsideItemData(strAYXKKw5, strKWHzl, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        arrayList.add(tacticsInsideItemData2);
        arrayList.add(tacticsInsideItemData3);
        arrayList.add(tacticsInsideItemData4);
        arrayList.add(tacticsInsideItemData5);
        arrayList.add(tacticsInsideItemData6);
        if (zKWHzl) {
            arrayList.add(tacticsInsideItemData7);
        }
        if (zKWHzl2) {
            if (tacticsInsideItemDataAEQbTJ != null) {
                arrayList.add(tacticsInsideItemDataAEQbTJ);
            }
            if (tacticsInsideItemDataAEQbTJ2 != null) {
                arrayList.add(tacticsInsideItemDataAEQbTJ2);
            }
        }
        if (tacticsInsideItemData != null) {
            arrayList.add(tacticsInsideItemData);
        }
        arrayList.add(tacticsInsideItemData8);
        return arrayList;
    }

    public static /* synthetic */ java.lang.String getFormatedRatio$default(C56003xuc c56003xuc, java.lang.String str, RoundingMode roundingMode, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.FLOOR;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return c56003xuc.OLrzqt(str, roundingMode, z);
    }

    public final java.lang.String OLrzqt(java.lang.String str, RoundingMode roundingMode, boolean z) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return "--";
        }
        if (z) {
            xMR xmr = xMR.copydefault;
            if (str == null) {
                str = "";
            }
            return xmr.copydefault(str, 2, 0, roundingMode);
        }
        xMR xmr2 = xMR.copydefault;
        if (str == null) {
            str = "";
        }
        return xmr2.EZpvd(str, 2, 0, roundingMode);
    }

    public final TacticsInsideItemData AEQbTJ(java.lang.String str, java.lang.String str2) {
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            return null;
        }
        return new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onConnectionFailed) + " " + str2, C56033xvF.copydefault(str, str2, (88 & 4) != 0 ? false : true, (88 & 8) != 0 ? null : null, (88 & 16) != 0 ? false : false, (88 & 32) == 0 ? false : false, (88 & 64) == 0 ? null : null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
    }

    public java.lang.String copydefault() {
        ArbInvestDetailsBean arbInvestDetailsBean;
        SmartArbitrageReq smartArbitrageReq;
        StrategyReqGroup strategyReqGroup = this.OLrzqt;
        if (strategyReqGroup == null || (smartArbitrageReq = strategyReqGroup.getSmartArbitrageReq()) == null || (arbInvestDetailsBean = smartArbitrageReq.getInvestDetails()) == null) {
            arbInvestDetailsBean = new ArbInvestDetailsBean((java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ArbInvestDetailsBeanStakingType4UI) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ArbitrageTotalPnlInfo) null, false, (java.lang.String) null, (java.lang.String) null, (EstimatedStakingVo) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, 67108863, (DefaultConstructorMarker) null);
        }
        return arbInvestDetailsBean.getUnit();
    }

    @Override // o.InterfaceC56005xue
    public java.lang.String EZpvd() {
        return copydefault();
    }

    @Override // o.InterfaceC56005xue
    public java.lang.String KWHzl() {
        ArbInvestDetailsBean arbInvestDetailsBean;
        SmartArbitrageReq smartArbitrageReq;
        StrategyReqGroup strategyReqGroup = this.OLrzqt;
        if (strategyReqGroup == null || (smartArbitrageReq = strategyReqGroup.getSmartArbitrageReq()) == null || (arbInvestDetailsBean = smartArbitrageReq.getInvestDetails()) == null) {
            arbInvestDetailsBean = new ArbInvestDetailsBean((java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ArbInvestDetailsBeanStakingType4UI) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ArbitrageTotalPnlInfo) null, false, (java.lang.String) null, (java.lang.String) null, (EstimatedStakingVo) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, 67108863, (DefaultConstructorMarker) null);
        }
        return C56033xvF.fmtBotValueBySymbol$default(arbInvestDetailsBean.getUnit(), arbInvestDetailsBean.getTotalAmt(), RoundingMode.UP, true, null, false, null, null, null, null, null, 2032, null);
    }
}
