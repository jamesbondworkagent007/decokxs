package com.okinc.tradingbot.impl.order.strategy.contractdca.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.bot.config.ContractDcaStopConditionType;
import com.okinc.unify_trade.bot.config.ContractDcaStopLossType;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.config.DcaLeadShareMode;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C54149wys;
import o.C55688xof;
import o.C55887xsS;
import o.xKK;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ContractDcaMakeOrderConfirmPresenter extends AbsPresenter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDcaMakeOrderConfirmPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Object> KWHzl(DcaOrderReq dcaOrderReq, DcaTriggerParam dcaTriggerParam) {
        String instType;
        String instId;
        String maxSafetyOrds;
        String investmentAmt;
        String str;
        String str2;
        String slPct;
        String volMult;
        String pxStepsMult;
        AutoVipProfitInfo vipProfit;
        AutoVipProfitInfo vipProfit2;
        String strAYXKKw;
        String profitSharingRatio;
        String tpPct;
        String pxSteps;
        if (dcaOrderReq == null || (instType = dcaOrderReq.getInstType()) == null) {
            instType = "";
        }
        if (dcaOrderReq == null || (instId = dcaOrderReq.getInstId()) == null) {
            instId = "";
        }
        C55887xsS c55887xsS = new C55887xsS(instType, instId);
        ArrayList arrayList = new ArrayList();
        String str3 = Intrinsics.EZpvd((Object) (dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null), (Object) ContractDcaTriggerType.RSI.getMode()) ? "under_line" : "";
        arrayList.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat1), 0.0f, 4.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
        if (C33129mqd.AhwBna(dcaOrderReq != null ? dcaOrderReq.getMaxSafetyOrds() : null, 0)) {
            arrayList.add(new TacticsInsideItemData(Intrinsics.EZpvd((Object) (dcaOrderReq != null ? dcaOrderReq.getDirection() : null), (Object) "long") ? C33070mpX.AYXKKw(C55688xof.Application.gqOnQv) : C33070mpX.AYXKKw(C55688xof.Application.hfdhUn), xMR.formatPercent$default(xMR.copydefault, (dcaOrderReq == null || (pxSteps = dcaOrderReq.getPxSteps()) == null) ? "" : pxSteps, 0, null, 6, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.zDGrpR);
        xMR xmr = xMR.copydefault;
        arrayList.add(new TacticsInsideItemData(strAYXKKw2, xMR.formatPercent$default(xmr, (dcaOrderReq == null || (tpPct = dcaOrderReq.getTpPct()) == null) ? "" : tpPct, 0, null, 6, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.OijiEz);
        if (dcaOrderReq == null || (maxSafetyOrds = dcaOrderReq.getMaxSafetyOrds()) == null) {
            maxSafetyOrds = "";
        }
        arrayList.add(new TacticsInsideItemData(strAYXKKw3, xmr.copydefault(maxSafetyOrds), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.DsL);
        if (dcaOrderReq == null || (investmentAmt = dcaOrderReq.getInvestmentAmt()) == null) {
            investmentAmt = "";
        }
        arrayList.add(new TacticsInsideItemData(strAYXKKw4, xmr.copydefault(investmentAmt) + " " + c55887xsS.DbNXlk(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (C33129mqd.OLrzqt((CharSequence) (dcaOrderReq != null ? dcaOrderReq.getProfitSharingRatio() : null))) {
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda2), xMR.formatPercent$default(xmr, (dcaOrderReq == null || (profitSharingRatio = dcaOrderReq.getProfitSharingRatio()) == null) ? "" : profitSharingRatio, 0, null, 4, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        if (C33129mqd.OLrzqt((CharSequence) (dcaOrderReq != null ? dcaOrderReq.getTrackingMode() : null))) {
            String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.jh);
            DcaLeadShareMode dcaLeadShareModeOLrzqt = DcaLeadShareMode.Companion.OLrzqt(dcaOrderReq != null ? dcaOrderReq.getTrackingMode() : null);
            arrayList.add(new TacticsInsideItemData(strAYXKKw5, (dcaLeadShareModeOLrzqt == null || (strAYXKKw = C33070mpX.AYXKKw(dcaLeadShareModeOLrzqt.getShowMode())) == null) ? "" : strAYXKKw, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        if (C33129mqd.KWHzl((Collection) ((dcaOrderReq == null || (vipProfit2 = dcaOrderReq.getVipProfit()) == null) ? null : vipProfit2.getAutoEarn()))) {
            C54149wys.AEQbTJ.AEQbTJ(arrayList, dcaOrderReq != null ? dcaOrderReq.getVipProfit() : null);
        } else {
            if (C33129mqd.KWHzl((Collection) ((dcaOrderReq == null || (vipProfit = dcaOrderReq.getVipProfit()) == null) ? null : vipProfit.getAutoStake()))) {
            }
        }
        arrayList.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat3), 12.0f, 4.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), ContractDcaTriggerType.Companion.EZpvd(dcaOrderReq != null ? dcaOrderReq.getTriggerParams() : null, c55887xsS.fetchVPNInfo()), null, 0, 0, 0, 0, 0, str3, null, null, null, null, null, null, null, null, 130812, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setShuffleModeEnabledRemoved), ContractDcaStopConditionType.Companion.copydefault(dcaOrderReq != null ? dcaOrderReq.getTriggerParams() : null, c55887xsS.fetchVPNInfo()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (C33129mqd.AhwBna(dcaOrderReq != null ? dcaOrderReq.getMaxSafetyOrds() : null, 0)) {
            if (C33129mqd.AhwBna(dcaOrderReq != null ? dcaOrderReq.getMaxSafetyOrds() : null, 1)) {
                String strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.hdpuIA);
                if (dcaOrderReq == null || (volMult = dcaOrderReq.getVolMult()) == null) {
                    volMult = "";
                }
                arrayList.add(new TacticsInsideItemData(strAYXKKw6, xMR.formatDownToFixed$default(xmr, volMult, 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                String strAYXKKw7 = C33070mpX.AYXKKw(C55688xof.Application.dPkBzA);
                if (dcaOrderReq == null || (pxStepsMult = dcaOrderReq.getPxStepsMult()) == null) {
                    pxStepsMult = "";
                }
                str = null;
                arrayList.add(new TacticsInsideItemData(strAYXKKw7, xMR.formatDownToFixed$default(xmr, pxStepsMult, 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
        } else {
            str = null;
        }
        String strAYXKKw8 = C33070mpX.AYXKKw(C55688xof.Application.zEHIKV);
        if (C33129mqd.OLrzqt((CharSequence) (dcaOrderReq != null ? dcaOrderReq.getSlPct() : str))) {
            String strAEQbTJ = ContractDcaStopLossType.Companion.AEQbTJ(dcaOrderReq != null ? dcaOrderReq.getSlMode() : str);
            str2 = strAEQbTJ + xMR.formatPercent$default(xmr, (dcaOrderReq == null || (slPct = dcaOrderReq.getSlPct()) == null) ? "" : slPct, 0, null, 6, null);
        } else {
            str2 = "--";
        }
        arrayList.add(new TacticsInsideItemData(strAYXKKw8, str2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
