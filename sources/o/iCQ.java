package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iCQ extends iCX {
    @Override // o.iCX
    public java.util.Set<DetailItemType> KWHzl(TransactionConfig transactionConfig) {
        return yEE.AhwBna(DetailItemType.DAILY_YIELD, DetailItemType.RECEIVE_TOKEN, DetailItemType.PAY_WITH, DetailItemType.EXCHANGE_RATE, DetailItemType.TRANSACTION_PATH, DetailItemType.NETWORK_SLIPPAGE, DetailItemType.NETWORK_FEE);
    }

    public iXC KWHzl(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, iXB ixb) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        TransactionStage transactionStage = TransactionStage.INPUT;
        long jValues = redeemInitialInfo.values();
        int value = redeemInitialInfo.fetchVPNInfo().getValue();
        long jAEQbTJ = redeemInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        java.lang.String str = "0";
        iXA ixa = new iXA(null, false, null, redeemInitialInfo.isConnected(), redeemInitialInfo.fIwbmz(), redeemInitialInfo.iwGUEr(), null, 0, iCP.AEQbTJ(redeemInitialInfo.fIwbmz(), java.lang.Integer.valueOf(redeemInitialInfo.djBIcL())), redeemInitialInfo.ORxRYg(), false, redeemInitialInfo.getFieldNames().getAssetsTip(), "0", C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd("0"), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null), super.EZpvd(redeemInitialInfo.getFieldNames(), (PromptInformation) null), true, false, false, true, false, 721093, null);
        InvestTokenWithAmount investTokenWithAmountFIwbmz = redeemInitialInfo.fIwbmz();
        java.lang.String strEZpvd = ixb != null ? ixb.EZpvd() : null;
        if (strEZpvd != null && strEZpvd.length() != 0) {
            str = strEZpvd;
        }
        return new iXC(false, false, null, jValues, value, jAEQbTJ, iAkhnZx, transactionStage, null, ixa, copydefault(redeemInitialInfo, investTokenWithAmountFIwbmz, str), null, yDY.AhwBna(), iCP.KWHzl(), null, null, null, false, null, null, null, null, null, 0, 16761095, null);
    }

    public iXC EZpvd(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull iXB ixb, @NotNull RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(ixb, "");
        Intrinsics.checkNotNullParameter(redeemDetailsAndGasFee, "");
        InvestTokenWithAmount investTokenWithAmountKWHzl = iCP.KWHzl(redeemDetailsAndGasFee.AuCTel(), ixb.djBIcL());
        TransactionStage transactionStageAhwBna = ixb.AhwBna();
        long jValues = redeemInitialInfo.values();
        int value = redeemInitialInfo.fetchVPNInfo().getValue();
        long jAEQbTJ = redeemInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        java.lang.String strIsConnected = redeemInitialInfo.isConnected();
        java.util.List<InvestTokenWithAmount> listAuCTel = redeemDetailsAndGasFee.AuCTel();
        boolean zORxRYg = redeemInitialInfo.ORxRYg();
        iXA ixa = new iXA(null, false, null, strIsConnected, investTokenWithAmountKWHzl, listAuCTel, null, 0, iCP.AEQbTJ(investTokenWithAmountKWHzl, java.lang.Integer.valueOf(redeemInitialInfo.djBIcL())), zORxRYg, false, redeemInitialInfo.getFieldNames().getAssetsTip(), ixb.EZpvd(), C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(redeemDetailsAndGasFee.gEmmrt()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null), super.EZpvd(redeemInitialInfo.getFieldNames(), redeemDetailsAndGasFee.values()), false, false, false, true, false, 721093, null);
        InvestTokenWithAmount investTokenWithAmountFIwbmz = redeemInitialInfo.fIwbmz();
        java.lang.String strEZpvd = ixb.EZpvd();
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = "0";
        }
        C25481ixY c25481ixYCopydefault = copydefault(redeemInitialInfo, investTokenWithAmountFIwbmz, strEZpvd);
        java.util.List<InterfaceC24178iXu> listOLrzqt = OLrzqt(transactionConfig, redeemInitialInfo, ixb, redeemDetailsAndGasFee);
        C24177iXt c24177iXtKWHzl = iCP.KWHzl();
        return new iXC(false, false, null, jValues, value, jAEQbTJ, iAkhnZx, transactionStageAhwBna, null, ixa, c25481ixYCopydefault, null, listOLrzqt, c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : null, (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : redeemDetailsAndGasFee.AubY(), (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : null, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 0), null, null, null, false, null, null, null, null, null, 0, 16761095, null);
    }
}
