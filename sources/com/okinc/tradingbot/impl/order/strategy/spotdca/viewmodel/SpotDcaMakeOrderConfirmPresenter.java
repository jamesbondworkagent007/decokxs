package com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C49511upt;
import o.C55688xof;
import o.C55887xsS;
import o.xKK;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SpotDcaMakeOrderConfirmPresenter extends AbsPresenter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDcaMakeOrderConfirmPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Object> AEQbTJ(DcaOrderReq dcaOrderReq) {
        String instType;
        String instId;
        String investmentAmt;
        String tradeQuoteCcy;
        String maxSafetyOrds;
        AutoVipProfitInfo vipProfit;
        AutoVipProfitInfo vipProfit2;
        AutoVipProfitInfo vipProfit3;
        xMR xmr;
        int i;
        xMR xmr2;
        String percent$default;
        String slPct;
        String volMult;
        String pxStepsMult;
        String tradeQuoteCcy2;
        AutoVipProfitInfo vipProfit4;
        AutoVipProfitInfo vipProfit5;
        String tpPct;
        String pxSteps;
        List<DcaTriggerParam> triggerParams;
        ArrayList arrayList = new ArrayList();
        DcaTriggerParam dcaTriggerParam = (dcaOrderReq == null || (triggerParams = dcaOrderReq.getTriggerParams()) == null) ? null : (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(triggerParams);
        String str = Intrinsics.EZpvd((Object) (dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null), (Object) GridStartTriggerType.RSI_14.getMode()) ? "under_line" : "";
        if (dcaOrderReq == null || (instType = dcaOrderReq.getInstType()) == null) {
            instType = "";
        }
        if (dcaOrderReq == null || (instId = dcaOrderReq.getInstId()) == null) {
            instId = "";
        }
        C55887xsS c55887xsS = new C55887xsS(instType, instId);
        String strAYXKKw = c55887xsS.AYXKKw();
        arrayList.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat1), 0.0f, 10.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
        String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.QDqgQU);
        xMR xmr3 = xMR.copydefault;
        if (dcaOrderReq == null || (investmentAmt = dcaOrderReq.getInvestmentAmt()) == null) {
            investmentAmt = "";
        }
        String strCopydefault = xmr3.copydefault(investmentAmt);
        if (dcaOrderReq == null || (tradeQuoteCcy = dcaOrderReq.getTradeQuoteCcy()) == null) {
            tradeQuoteCcy = strAYXKKw;
        }
        arrayList.add(new TacticsInsideItemData(strAYXKKw2, strCopydefault + " " + tradeQuoteCcy, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (C33129mqd.AhwBna(dcaOrderReq != null ? dcaOrderReq.getMaxSafetyOrds() : null, 0)) {
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.zblBkD), xMR.formatPercent$default(xmr3, (dcaOrderReq == null || (pxSteps = dcaOrderReq.getPxSteps()) == null) ? "" : pxSteps, 0, null, 6, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DGOPHZ), xMR.formatPercent$default(xmr3, (dcaOrderReq == null || (tpPct = dcaOrderReq.getTpPct()) == null) ? "" : tpPct, 0, null, 6, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.spnCvw);
        if (dcaOrderReq == null || (maxSafetyOrds = dcaOrderReq.getMaxSafetyOrds()) == null) {
            maxSafetyOrds = "";
        }
        arrayList.add(new TacticsInsideItemData(strAYXKKw3, xmr3.copydefault(maxSafetyOrds), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (C33129mqd.KWHzl((Collection) ((dcaOrderReq == null || (vipProfit5 = dcaOrderReq.getVipProfit()) == null) ? null : vipProfit5.getAutoEarn()))) {
            arrayList.add(new AutoVipProfitInfo((List) ((dcaOrderReq == null || (vipProfit3 = dcaOrderReq.getVipProfit()) == null) ? null : vipProfit3.getAutoEarn()), (List) ((dcaOrderReq == null || (vipProfit2 = dcaOrderReq.getVipProfit()) == null) ? null : vipProfit2.getAutoStake()), (dcaOrderReq == null || (vipProfit = dcaOrderReq.getVipProfit()) == null) ? null : vipProfit.getVipLevel(), false, false, 24, (DefaultConstructorMarker) null));
        } else {
            if (C33129mqd.KWHzl((Collection) ((dcaOrderReq == null || (vipProfit4 = dcaOrderReq.getVipProfit()) == null) ? null : vipProfit4.getAutoStake()))) {
            }
        }
        if (c55887xsS.AuCTel()) {
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C49511upt.Activity.dNCPSb), (dcaOrderReq == null || (tradeQuoteCcy2 = dcaOrderReq.getTradeQuoteCcy()) == null) ? strAYXKKw == null ? "" : strAYXKKw : tradeQuoteCcy2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        arrayList.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat3), 18.0f, 10.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
        String strCopydefault2 = GridStartTriggerType.Companion.copydefault(dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null);
        if (strCopydefault2.length() > 0) {
            xmr = xmr3;
            i = 0;
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), strCopydefault2, null, 0, 0, 0, 0, 0, str, null, null, null, null, null, null, null, null, 130812, null));
        } else {
            xmr = xmr3;
            i = 0;
        }
        if (C33129mqd.AhwBna(dcaOrderReq != null ? dcaOrderReq.getMaxSafetyOrds() : null, Integer.valueOf(i))) {
            if (C33129mqd.AhwBna(dcaOrderReq != null ? dcaOrderReq.getMaxSafetyOrds() : null, 1)) {
                String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.fdOvFl);
                if (dcaOrderReq == null || (volMult = dcaOrderReq.getVolMult()) == null) {
                    volMult = "";
                }
                xMR xmr4 = xmr;
                arrayList.add(new TacticsInsideItemData(strAYXKKw4, xMR.formatDownToFixed$default(xmr4, volMult, i, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.call);
                if (dcaOrderReq == null || (pxStepsMult = dcaOrderReq.getPxStepsMult()) == null) {
                    pxStepsMult = "";
                }
                xmr2 = xmr4;
                arrayList.add(new TacticsInsideItemData(strAYXKKw5, xMR.formatDownToFixed$default(xmr4, pxStepsMult, 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
        } else {
            xmr2 = xmr;
        }
        String strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.run);
        if (C33129mqd.OLrzqt((CharSequence) (dcaOrderReq != null ? dcaOrderReq.getSlPct() : null))) {
            percent$default = xMR.formatPercent$default(xmr2, (dcaOrderReq == null || (slPct = dcaOrderReq.getSlPct()) == null) ? "" : slPct, 0, null, 6, null);
        } else {
            percent$default = "--";
        }
        arrayList.add(new TacticsInsideItemData(strAYXKKw6, percent$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
