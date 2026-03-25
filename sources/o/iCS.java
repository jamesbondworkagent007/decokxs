package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestHoverOnData;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.PointInfo;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class iCS extends iCV {
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iXC EZpvd(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.InvestInitialInfo investInitialInfo, iXB ixb) {
        int iCopydefault;
        InvestTipInfoVo investTipInfoVo;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(investInitialInfo, "");
        java.util.List<InvestTokenWithAmount> listCopydefault = copydefault(investInitialInfo, ixb);
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(listCopydefault.size()), 1)) {
            if ((ixb != null ? ixb.djBIcL() : null) != null) {
                java.util.Iterator<T> it = listCopydefault.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((InvestTokenWithAmount) next).getTokenAddress(), (java.lang.Object) ixb.djBIcL().getTokenAddress())) {
                        break;
                    }
                }
                iCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends java.lang.Object>) listCopydefault, next);
                if (iCopydefault < 0) {
                }
            }
        } else {
            iCopydefault = 0;
        }
        int i = iCopydefault;
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
        InvestTokenWithAmount investTokenWithAmount = listCopydefault.get(i);
        java.lang.String strEZpvd = ixb != null ? ixb.EZpvd() : null;
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = "0";
        }
        return new iXC(false, false, null, jGEmmrt, value, jAEQbTJ, iAkhnZx, transactionStage, null, tokenAmountInput$default, KWHzl(investInitialInfo, investTokenWithAmount, strEZpvd), iCB.EZpvd.AEQbTJ((WalletImportError.ERROR_CODE_AA_EXIST & 1) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? "" : null, investInitialInfo.AhwBna().getValue(), investInitialInfo.valueOf(), (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? yDY.AhwBna() : investInitialInfo.AuCTel(), (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? "" : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? "" : null), yDY.AhwBna(), c24177iXtCopydefault, investInitialInfo.AubY(), null, null, investInitialInfo.zuBGHE(), null, null, null, null, null, 0, 16613639, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iXC AEQbTJ(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.InvestInitialInfo investInitialInfo, @NotNull iXB ixb, @NotNull InvestDetailsAndGasFee investDetailsAndGasFee) {
        int i;
        InvestTipInfoVo investTipInfoVo;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(investInitialInfo, "");
        Intrinsics.checkNotNullParameter(ixb, "");
        Intrinsics.checkNotNullParameter(investDetailsAndGasFee, "");
        java.util.List<InvestTokenWithAmount> listCopydefault = copydefault(investInitialInfo, ixb);
        if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(listCopydefault.size()), 1) || ixb.djBIcL() == null) {
            i = 0;
        } else {
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((InvestTokenWithAmount) next).getTokenAddress(), (java.lang.Object) ixb.djBIcL().getTokenAddress())) {
                    break;
                }
            }
            int iCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends java.lang.Object>) listCopydefault, next);
            if (iCopydefault >= 0) {
                i = iCopydefault;
            }
        }
        TransactionStage transactionStageAhwBna = ixb.AhwBna();
        long jGEmmrt = investInitialInfo.gEmmrt();
        long jAEQbTJ = investInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        int value = investInitialInfo.AhwBna().getValue();
        iXA ixaAEQbTJ = AEQbTJ(investInitialInfo, listCopydefault, ixb, investDetailsAndGasFee, transactionConfig);
        InvestTokenWithAmount investTokenWithAmount = listCopydefault.get(i);
        java.lang.String strEZpvd = ixb.EZpvd();
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = "0";
        }
        C25481ixY c25481ixYKWHzl = KWHzl(investInitialInfo, investTokenWithAmount, strEZpvd);
        iCB icb = iCB.EZpvd;
        int value2 = investInitialInfo.AhwBna().getValue();
        java.util.List<InvestTokenWithAmount> listDjBIcL = investDetailsAndGasFee.djBIcL();
        if (listDjBIcL.isEmpty()) {
            listDjBIcL = investInitialInfo.valueOf();
        }
        java.util.List<InvestTokenWithAmount> list = listDjBIcL;
        java.util.List<PointInfo> listFetchVPNInfo = investDetailsAndGasFee.fetchVPNInfo();
        java.lang.String strUzCIH = investDetailsAndGasFee.uzCIH();
        InterfaceC24178iXu.StateListAnimator stateListAnimatorAEQbTJ = icb.AEQbTJ((WalletImportError.ERROR_CODE_AA_EXIST & 1) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? "" : null, value2, list, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? yDY.AhwBna() : listFetchVPNInfo, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? "" : strUzCIH == null ? "" : strUzCIH, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? "" : null);
        java.util.List<InterfaceC24178iXu> listOLrzqt = OLrzqt(transactionConfig, investInitialInfo, ixb, investDetailsAndGasFee);
        C24177iXt c24177iXtKWHzl = iCP.KWHzl();
        boolean z = investDetailsAndGasFee.zLjUOn() && C33129mqd.copydefault(listCopydefault.get(i).getCoinAmount(), ixb.EZpvd());
        C25479ixW c25479ixWCopydefault = copydefault(investInitialInfo.fJNWhG(), investDetailsAndGasFee.fJNWhG());
        if (c25479ixWCopydefault == null || (investTipInfoVo = c25479ixWCopydefault.AEQbTJ()) == null) {
            investTipInfoVo = new InvestTipInfoVo((InvestClickActionType) null, (InvestCustomRedirectData) null, (InvestHoverOnData) null, (InvestPopUpData) null, (InvestRedirectData) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Integer) null, 1023, (DefaultConstructorMarker) null);
        }
        return new iXC(false, false, null, jGEmmrt, value, jAEQbTJ, iAkhnZx, transactionStageAhwBna, null, ixaAEQbTJ, c25481ixYKWHzl, stateListAnimatorAEQbTJ, listOLrzqt, c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : null, (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : z, (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : investTipInfoVo, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 0), investInitialInfo.AubY(), null, null, investInitialInfo.zuBGHE(), null, null, null, null, null, 0, 16613639, null);
    }

    @Override // o.iCV
    public java.util.Set<DetailItemType> KWHzl() {
        return yEE.AhwBna(DetailItemType.DAILY_YIELD, DetailItemType.SUPPLY_COLLATERAL, DetailItemType.HEALTH_FACTOR, DetailItemType.SETTLEMENT, DetailItemType.EXT_INFO, DetailItemType.EST_POINTS_EARN, DetailItemType.FIXED_APY, DetailItemType.EST_RECEIVE, DetailItemType.MATURITY, DetailItemType.EXCHANGE_RATE, DetailItemType.TRANSACTION_PATH, DetailItemType.NETWORK_SLIPPAGE, DetailItemType.VALIDATOR, DetailItemType.TRANSACTION_LOSS);
    }
}
