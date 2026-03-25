package o;

import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestHoverOnData;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iCT extends iCS {
    @Override // o.iCS
    public iXC EZpvd(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.InvestInitialInfo investInitialInfo, iXB ixb) {
        InvestTipInfoVo investTipInfoVo;
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(investInitialInfo, "");
        java.util.List<InvestTokenWithAmount> listCopydefault = copydefault(investInitialInfo, ixb);
        TransactionStage transactionStage = TransactionStage.INPUT;
        long jGEmmrt = investInitialInfo.gEmmrt();
        int value = investInitialInfo.AhwBna().getValue();
        long jAEQbTJ = investInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        C24177iXt c24177iXtKWHzl = iCP.KWHzl();
        C25479ixW c25479ixWCopydefault = copydefault(investInitialInfo.fJNWhG(), (PromptInformation) null);
        if (c25479ixWCopydefault == null || (investTipInfoVo = c25479ixWCopydefault.AEQbTJ()) == null) {
            investTipInfoVo = new InvestTipInfoVo((InvestClickActionType) null, (InvestCustomRedirectData) null, (InvestHoverOnData) null, (InvestPopUpData) null, (InvestRedirectData) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Integer) null, 1023, (DefaultConstructorMarker) null);
        }
        C24177iXt c24177iXtCopydefault = c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : null, (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : false, (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : investTipInfoVo, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 0);
        iXA tokenAmountInput$default = iCV.getTokenAmountInput$default(this, investInitialInfo, listCopydefault, ixb, null, null, 16, null);
        InvestTokenWithAmount investTokenWithAmount = listCopydefault.get(0);
        java.lang.String strEZpvd = ixb != null ? ixb.EZpvd() : null;
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = "0";
        }
        return new iXC(false, false, null, jGEmmrt, value, jAEQbTJ, iAkhnZx, transactionStage, null, tokenAmountInput$default, KWHzl(investInitialInfo, investTokenWithAmount, strEZpvd), iCB.EZpvd.EZpvd(investInitialInfo.AhwBna().getValue(), yDY.OLrzqt(investInitialInfo.fARcdN()), false, true), yDY.AhwBna(), c24177iXtCopydefault, investInitialInfo.AubY(), null, null, investInitialInfo.zuBGHE(), null, null, null, null, listCopydefault.get(0).getSafeMaxAmount(), 0, 12419335, null);
    }

    @Override // o.iCS
    public iXC AEQbTJ(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.InvestInitialInfo investInitialInfo, @NotNull iXB ixb, @NotNull InvestDetailsAndGasFee investDetailsAndGasFee) {
        InvestTipInfoVo investTipInfoVo;
        C24177iXt c24177iXtCopydefault;
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(investInitialInfo, "");
        Intrinsics.checkNotNullParameter(ixb, "");
        Intrinsics.checkNotNullParameter(investDetailsAndGasFee, "");
        java.util.List<InvestTokenWithAmount> listCopydefault = copydefault(investInitialInfo, ixb);
        java.lang.String coinAmount = listCopydefault.get(0).getCoinAmount();
        java.lang.String strEZpvd = ixb.EZpvd();
        java.lang.String str = "0";
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = "0";
        }
        boolean zGEmmrt = C33129mqd.gEmmrt(coinAmount, strEZpvd);
        TransactionStage transactionStageAhwBna = ixb.AhwBna();
        long jGEmmrt = investInitialInfo.gEmmrt();
        long jAEQbTJ = investInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        int value = investInitialInfo.AhwBna().getValue();
        iXA tokenAmountInput$default = iCV.getTokenAmountInput$default(this, investInitialInfo, listCopydefault, ixb, investDetailsAndGasFee, null, 16, null);
        InvestTokenWithAmount investTokenWithAmount = listCopydefault.get(0);
        java.lang.String strEZpvd2 = ixb.EZpvd();
        if (strEZpvd2 != null && strEZpvd2.length() != 0) {
            str = strEZpvd2;
        }
        C25481ixY c25481ixYKWHzl = KWHzl(investInitialInfo, investTokenWithAmount, str);
        iCB icb = iCB.EZpvd;
        int value2 = investInitialInfo.AhwBna().getValue();
        InvestTokenWithAmount investTokenWithAmountFIwbmz = investDetailsAndGasFee.fIwbmz();
        if (investTokenWithAmountFIwbmz == null) {
            investTokenWithAmountFIwbmz = investInitialInfo.fARcdN();
        }
        InterfaceC24178iXu.Activity borrowReceiveTokenInfoItem$default = iCB.getBorrowReceiveTokenInfoItem$default(icb, value2, yDY.OLrzqt(investTokenWithAmountFIwbmz), false, false, 8, null);
        java.util.List<InterfaceC24178iXu> listOLrzqt = OLrzqt(transactionConfig, investInitialInfo, ixb, investDetailsAndGasFee);
        if (zGEmmrt) {
            C24177iXt c24177iXtKWHzl = iCP.KWHzl();
            c24177iXtCopydefault = c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : DisplayText.Companion.fromStringResource$default(DisplayText.Companion, C25493ixk.FragmentManager.ODWQjV, null, 2, null), (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : true, (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : null, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 3);
        } else {
            C24177iXt c24177iXtKWHzl2 = iCP.KWHzl();
            boolean zZLjUOn = investDetailsAndGasFee.zLjUOn();
            C25479ixW c25479ixWCopydefault = copydefault(investInitialInfo.fJNWhG(), investDetailsAndGasFee.fJNWhG());
            if (c25479ixWCopydefault == null || (investTipInfoVo = c25479ixWCopydefault.AEQbTJ()) == null) {
                investTipInfoVo = new InvestTipInfoVo((InvestClickActionType) null, (InvestCustomRedirectData) null, (InvestHoverOnData) null, (InvestPopUpData) null, (InvestRedirectData) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Integer) null, 1023, (DefaultConstructorMarker) null);
            }
            c24177iXtCopydefault = c24177iXtKWHzl2.copydefault((247 & 1) != 0 ? c24177iXtKWHzl2.copydefault : null, (247 & 2) != 0 ? c24177iXtKWHzl2.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl2.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl2.OLrzqt : zZLjUOn, (247 & 16) != 0 ? c24177iXtKWHzl2.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl2.AEQbTJ : investTipInfoVo, (247 & 64) != 0 ? c24177iXtKWHzl2.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl2.KWHzl : 0);
        }
        return new iXC(false, false, null, jGEmmrt, value, jAEQbTJ, iAkhnZx, transactionStageAhwBna, null, tokenAmountInput$default, c25481ixYKWHzl, borrowReceiveTokenInfoItem$default, listOLrzqt, c24177iXtCopydefault, investInitialInfo.AubY(), null, null, investInitialInfo.zuBGHE(), null, null, null, null, listCopydefault.get(0).getSafeMaxAmount(), 0, 12419335, null);
    }

    @Override // o.iCS, o.iCV
    public java.util.Set<DetailItemType> KWHzl() {
        return yEE.AhwBna(DetailItemType.BORROW_RECEIVE_TOKEN, DetailItemType.DAILY_YIELD, DetailItemType.BORROW_FEE, DetailItemType.HEALTH_FACTOR, DetailItemType.SETTLEMENT, DetailItemType.EXT_INFO, DetailItemType.EST_POINTS_EARN, DetailItemType.FIXED_APY, DetailItemType.MATURITY, DetailItemType.EXCHANGE_RATE, DetailItemType.NETWORK_SLIPPAGE);
    }
}
