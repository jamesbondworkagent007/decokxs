package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestHoverOnData;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
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
public final class iCN extends iCV {
    public iXC OLrzqt(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.InvestInitialInfo investInitialInfo, iXB ixb) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(investInitialInfo, "");
        java.util.List<InvestTokenWithAmount> listCopydefault = copydefault(investInitialInfo, ixb);
        TransactionStage transactionStage = TransactionStage.INPUT;
        long jGEmmrt = investInitialInfo.gEmmrt();
        int value = investInitialInfo.AhwBna().getValue();
        long jAEQbTJ = investInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        C24177iXt c24177iXtKWHzl = iCP.KWHzl();
        iXA tokenAmountInput$default = iCV.getTokenAmountInput$default(this, investInitialInfo, listCopydefault, ixb, null, null, 16, null);
        InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investInitialInfo.AYXKKw());
        if (investTokenWithAmount == null) {
            investTokenWithAmount = new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null);
        }
        java.lang.String strEZpvd = ixb != null ? ixb.EZpvd() : null;
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = "0";
        }
        return new iXC(false, false, null, jGEmmrt, value, jAEQbTJ, iAkhnZx, transactionStage, null, tokenAmountInput$default, KWHzl(investInitialInfo, investTokenWithAmount, strEZpvd), null, yDY.AhwBna(), c24177iXtKWHzl, null, investInitialInfo.zLjUOn(), investInitialInfo.getFieldNames(), false, null, null, null, null, null, 0, 16662791, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.iCV.getTokenAmountInput$default(o.iCV, com.okinc.business.invest_biz.data.models.InitialInfoModel$InvestInitialInfo, java.util.List, o.iXB, com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee, com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig, int, java.lang.Object):o.iXA */
    public iXC EZpvd(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.InvestInitialInfo investInitialInfo, @NotNull iXB ixb, @NotNull InvestDetailsAndGasFee investDetailsAndGasFee) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(investInitialInfo, "");
        Intrinsics.checkNotNullParameter(ixb, "");
        Intrinsics.checkNotNullParameter(investDetailsAndGasFee, "");
        InvestTokenWithAmount investTokenWithAmountKWHzl = iCP.KWHzl(investDetailsAndGasFee.values(), ixb.djBIcL());
        java.util.List<InvestTokenWithAmount> listCopydefault = copydefault(investInitialInfo, ixb);
        TransactionStage transactionStageAhwBna = ixb.AhwBna();
        long jGEmmrt = investInitialInfo.gEmmrt();
        long jAEQbTJ = investInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        int value = investInitialInfo.AhwBna().getValue();
        iXA tokenAmountInput$default = iCV.getTokenAmountInput$default(this, investInitialInfo, listCopydefault, ixb, investDetailsAndGasFee, null, 16, null);
        boolean z = false;
        InvestTokenWithAmount investTokenWithAmount = listCopydefault.get(0);
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
        InterfaceC24178iXu.StateListAnimator stateListAnimatorAEQbTJ = icb.AEQbTJ((WalletImportError.ERROR_CODE_AA_EXIST & 1) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? "" : null, value2, listDjBIcL, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? yDY.AhwBna() : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? "" : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? "" : null);
        java.util.List<InterfaceC24178iXu> listOLrzqt = OLrzqt(transactionConfig, investInitialInfo, ixb, investDetailsAndGasFee);
        C24177iXt c24177iXtKWHzl = iCP.KWHzl();
        if (investDetailsAndGasFee.zLjUOn() && C33129mqd.AEQbTJ(listCopydefault.get(0).getCoinAmount(), investTokenWithAmountKWHzl.getCoinAmount())) {
            z = true;
        }
        boolean z2 = z;
        InvestTipInfoVo investmentInfoTip = investInitialInfo.fJNWhG().getInvestmentInfoTip();
        if (investmentInfoTip == null) {
            investmentInfoTip = new InvestTipInfoVo((InvestClickActionType) null, (InvestCustomRedirectData) null, (InvestHoverOnData) null, (InvestPopUpData) null, (InvestRedirectData) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Integer) null, 1023, (DefaultConstructorMarker) null);
        }
        C24177iXt c24177iXtCopydefault = c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : null, (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : z2, (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : investmentInfoTip, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 2, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 0);
        java.lang.String strAubY = investInitialInfo.AubY();
        java.util.List<InvestValidatorListItems> listZLjUOn = investInitialInfo.zLjUOn();
        InvestValidatorListItems investValidatorListItemsAYXKKw = ixb.AYXKKw();
        if (investValidatorListItemsAYXKKw == null) {
            investValidatorListItemsAYXKKw = investInitialInfo.getFieldNames();
        }
        return new iXC(false, false, null, jGEmmrt, value, jAEQbTJ, iAkhnZx, transactionStageAhwBna, null, tokenAmountInput$default, c25481ixYKWHzl, stateListAnimatorAEQbTJ, listOLrzqt, c24177iXtCopydefault, strAubY, listZLjUOn, investValidatorListItemsAYXKKw, investInitialInfo.zuBGHE(), null, null, null, null, null, 0, 16515335, null);
    }

    @Override // o.iCV
    public java.util.Set<DetailItemType> KWHzl() {
        return yEE.AhwBna(DetailItemType.TRANSACTION_PATH, DetailItemType.NETWORK_SLIPPAGE, DetailItemType.NETWORK_FEE, DetailItemType.FINALITY_PROVIDER);
    }
}
