package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.BorrowedInfo;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestHoverOnData;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23622iDe extends iCU {
    @Override // o.iCU, o.iCX
    public java.util.Set<DetailItemType> KWHzl(TransactionConfig transactionConfig) {
        return yEE.AhwBna(DetailItemType.REPAY_BORROWED, DetailItemType.HEALTH_FACTOR, DetailItemType.PAY_WITH, DetailItemType.EXCHANGE_RATE, DetailItemType.NETWORK_SLIPPAGE, DetailItemType.VALIDATOR);
    }

    @Override // o.iCU
    public iXC AEQbTJ(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, iXB ixb) {
        InvestTipInfoVo investTipInfoVo;
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        TransactionStage transactionStage = TransactionStage.INPUT;
        long jValues = redeemInitialInfo.values();
        int value = redeemInitialInfo.fetchVPNInfo().getValue();
        long jAEQbTJ = redeemInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        boolean z = ixb == null || ixb.gEmmrt();
        java.lang.String strIsConnected = redeemInitialInfo.isConnected();
        InvestTokenWithAmount investTokenWithAmountFIwbmz = redeemInitialInfo.fIwbmz();
        java.util.List<InvestTokenWithAmount> listIwGUEr = redeemInitialInfo.iwGUEr();
        boolean zORxRYg = redeemInitialInfo.ORxRYg();
        java.lang.String str = "0";
        iXA ixa = new iXA(redeemInitialInfo.wlaJM(), false, null, strIsConnected, investTokenWithAmountFIwbmz, listIwGUEr, null, 0, iCP.AEQbTJ(redeemInitialInfo.fIwbmz(), java.lang.Integer.valueOf(redeemInitialInfo.djBIcL())), zORxRYg, false, redeemInitialInfo.getFieldNames().getAssetsTip(), (ixb == null || (strEZpvd = ixb.EZpvd()) == null) ? "0" : strEZpvd, C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd("0"), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null), EZpvd(redeemInitialInfo.getFieldNames(), (PromptInformation) null), z, redeemInitialInfo.valueOf(), false, false, false, 917700, null);
        InvestTokenWithAmount investTokenWithAmountFIwbmz2 = redeemInitialInfo.fIwbmz();
        java.lang.String strEZpvd2 = ixb != null ? ixb.EZpvd() : null;
        if (strEZpvd2 != null && strEZpvd2.length() != 0) {
            str = strEZpvd2;
        }
        C25481ixY c25481ixYCopydefault = copydefault(redeemInitialInfo, investTokenWithAmountFIwbmz2, str);
        InterfaceC24178iXu.PictureInPictureParams pictureInPictureParamsEZpvd = iCB.EZpvd.EZpvd(redeemInitialInfo.EZpvd());
        java.util.List listAhwBna = yDY.AhwBna();
        C24177iXt c24177iXtKWHzl = iCP.KWHzl();
        C25479ixW c25479ixWCopydefault = copydefault(redeemInitialInfo.getFieldNames(), (PromptInformation) null);
        if (c25479ixWCopydefault == null || (investTipInfoVo = c25479ixWCopydefault.AEQbTJ()) == null) {
            investTipInfoVo = new InvestTipInfoVo((InvestClickActionType) null, (InvestCustomRedirectData) null, (InvestHoverOnData) null, (InvestPopUpData) null, (InvestRedirectData) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Integer) null, 1023, (DefaultConstructorMarker) null);
        }
        return new iXC(false, false, null, jValues, value, jAEQbTJ, iAkhnZx, transactionStage, null, ixa, c25481ixYCopydefault, pictureInPictureParamsEZpvd, listAhwBna, c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : null, (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : false, (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : investTipInfoVo, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 0), null, null, null, false, null, null, null, redeemInitialInfo.fIwbmz().getSafeMinAmount(), redeemInitialInfo.fIwbmz().getSafeMaxAmount(), 0, 10469638, null);
    }

    @Override // o.iCU
    public iXC KWHzl(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull iXB ixb, @NotNull RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        InvestTipInfoVo investTipInfoVo;
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(ixb, "");
        Intrinsics.checkNotNullParameter(redeemDetailsAndGasFee, "");
        InvestTokenWithAmount investTokenWithAmountFIwbmz = redeemInitialInfo.fIwbmz();
        TransactionStage transactionStageAhwBna = ixb.AhwBna();
        long jValues = redeemInitialInfo.values();
        int value = redeemInitialInfo.fetchVPNInfo().getValue();
        long jAEQbTJ = redeemInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        iXA ixa = new iXA(redeemInitialInfo.wlaJM(), false, null, redeemInitialInfo.isConnected(), redeemInitialInfo.fIwbmz(), redeemDetailsAndGasFee.AuCTel(), null, 0, iCP.AEQbTJ(investTokenWithAmountFIwbmz, java.lang.Integer.valueOf(redeemInitialInfo.djBIcL())), redeemInitialInfo.ORxRYg(), false, redeemInitialInfo.getFieldNames().getAssetsTip(), ixb.EZpvd(), C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(redeemDetailsAndGasFee.gEmmrt()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null), EZpvd(redeemInitialInfo.getFieldNames(), redeemDetailsAndGasFee.values()), false, redeemInitialInfo.valueOf(), false, false, false, 917700, null);
        InvestTokenWithAmount investTokenWithAmountFIwbmz2 = redeemInitialInfo.fIwbmz();
        java.lang.String strEZpvd = ixb.EZpvd();
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = "0";
        }
        C25481ixY c25481ixYCopydefault = copydefault(redeemInitialInfo, investTokenWithAmountFIwbmz2, strEZpvd);
        iCB icb = iCB.EZpvd;
        BorrowedInfo borrowedInfoCopydefault = redeemDetailsAndGasFee.copydefault();
        if (borrowedInfoCopydefault == null) {
            borrowedInfoCopydefault = redeemInitialInfo.EZpvd();
        }
        InterfaceC24178iXu.PictureInPictureParams pictureInPictureParamsEZpvd = icb.EZpvd(borrowedInfoCopydefault);
        java.util.List<InterfaceC24178iXu> listOLrzqt = OLrzqt(transactionConfig, redeemInitialInfo, ixb, redeemDetailsAndGasFee);
        C24177iXt c24177iXtKWHzl = iCP.KWHzl();
        boolean z = redeemDetailsAndGasFee.AubY() && C33129mqd.valueOf(ixb.EZpvd(), redeemInitialInfo.fIwbmz().getCoinAmount());
        C25479ixW c25479ixWCopydefault = copydefault(redeemInitialInfo.getFieldNames(), redeemDetailsAndGasFee.values());
        if (c25479ixWCopydefault == null || (investTipInfoVo = c25479ixWCopydefault.AEQbTJ()) == null) {
            investTipInfoVo = new InvestTipInfoVo((InvestClickActionType) null, (InvestCustomRedirectData) null, (InvestHoverOnData) null, (InvestPopUpData) null, (InvestRedirectData) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Integer) null, 1023, (DefaultConstructorMarker) null);
        }
        return new iXC(false, false, null, jValues, value, jAEQbTJ, iAkhnZx, transactionStageAhwBna, null, ixa, c25481ixYCopydefault, pictureInPictureParamsEZpvd, listOLrzqt, c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : null, (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : z, (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : investTipInfoVo, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 0), null, null, null, false, null, null, null, redeemInitialInfo.fIwbmz().getSafeMinAmount(), redeemDetailsAndGasFee.fetchVPNInfo().getSafeMaxAmount(), 0, 10469638, null);
    }
}
