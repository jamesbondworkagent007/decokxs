package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
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

/* JADX INFO: loaded from: classes6.dex */
public class iCU extends iCX {
    @Override // o.iCX
    public java.util.Set<DetailItemType> KWHzl(TransactionConfig transactionConfig) {
        return yEE.AhwBna(DetailItemType.DAILY_YIELD, DetailItemType.RECEIVE_TOKEN, DetailItemType.HEALTH_FACTOR, DetailItemType.PAY_WITH, DetailItemType.EXCHANGE_RATE, DetailItemType.TRANSACTION_PATH, DetailItemType.NETWORK_SLIPPAGE, DetailItemType.VALIDATOR);
    }

    public iXC AEQbTJ(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, iXB ixb) {
        java.util.List<InvestTokenWithAmount> listIwGUEr;
        InvestTipInfoVo investTipInfoVo;
        java.lang.String strEZpvd;
        InvestTokenWithAmount investTokenWithAmountOLrzqt;
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        if (ixb == null || (investTokenWithAmountOLrzqt = ixb.OLrzqt()) == null || (listIwGUEr = C56402yEa.EZpvd(investTokenWithAmountOLrzqt)) == null) {
            listIwGUEr = redeemInitialInfo.iwGUEr();
        }
        java.util.List<InvestTokenWithAmount> list = listIwGUEr;
        TransactionStage transactionStage = TransactionStage.INPUT;
        long jValues = redeemInitialInfo.values();
        int value = redeemInitialInfo.fetchVPNInfo().getValue();
        long jAEQbTJ = redeemInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        boolean z = ixb == null || ixb.gEmmrt();
        java.lang.String str = "0";
        iXA ixa = new iXA(null, false, null, redeemInitialInfo.isConnected(), redeemInitialInfo.fIwbmz(), redeemInitialInfo.iwGUEr(), null, 0, iCP.AEQbTJ(redeemInitialInfo.fIwbmz(), java.lang.Integer.valueOf(redeemInitialInfo.djBIcL())), redeemInitialInfo.ORxRYg(), false, redeemInitialInfo.getFieldNames().getAssetsTip(), (ixb == null || (strEZpvd = ixb.EZpvd()) == null) ? "0" : strEZpvd, C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd("0"), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null), EZpvd(redeemInitialInfo.getFieldNames(), (PromptInformation) null), z, redeemInitialInfo.valueOf(), false, false, false, 917701, null);
        InvestTokenWithAmount investTokenWithAmountFIwbmz = redeemInitialInfo.fIwbmz();
        java.lang.String strEZpvd2 = ixb != null ? ixb.EZpvd() : null;
        if (strEZpvd2 != null && strEZpvd2.length() != 0) {
            str = strEZpvd2;
        }
        C25481ixY c25481ixYCopydefault = copydefault(redeemInitialInfo, investTokenWithAmountFIwbmz, str);
        InterfaceC24178iXu.LoaderManager loaderManagerCopydefault = iCB.EZpvd.copydefault(redeemInitialInfo.fetchVPNInfo().getValue(), list, redeemInitialInfo.ORxRYg(), redeemInitialInfo.QKVWgx(), transactionConfig.EZpvd(), true);
        java.util.List listAhwBna = yDY.AhwBna();
        C24177iXt c24177iXtKWHzl = iCP.KWHzl();
        C25479ixW c25479ixWCopydefault = copydefault(redeemInitialInfo.getFieldNames(), (PromptInformation) null);
        if (c25479ixWCopydefault == null || (investTipInfoVo = c25479ixWCopydefault.AEQbTJ()) == null) {
            investTipInfoVo = new InvestTipInfoVo((InvestClickActionType) null, (InvestCustomRedirectData) null, (InvestHoverOnData) null, (InvestPopUpData) null, (InvestRedirectData) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Integer) null, 1023, (DefaultConstructorMarker) null);
        }
        return new iXC(false, false, null, jValues, value, jAEQbTJ, iAkhnZx, transactionStage, null, ixa, c25481ixYCopydefault, loaderManagerCopydefault, listAhwBna, c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : null, (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : false, (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : investTipInfoVo, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 0), null, null, null, false, null, null, null, null, null, 0, 16761094, null);
    }

    public iXC KWHzl(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull iXB ixb, @NotNull RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        InvestTipInfoVo investTipInfoVo;
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(ixb, "");
        Intrinsics.checkNotNullParameter(redeemDetailsAndGasFee, "");
        java.util.List<InvestTokenWithAmount> listAuCTel = redeemDetailsAndGasFee.AuCTel();
        InvestTokenWithAmount investTokenWithAmountFIwbmz = redeemInitialInfo.fIwbmz();
        TransactionStage transactionStageAhwBna = ixb.AhwBna();
        long jValues = redeemInitialInfo.values();
        int value = redeemInitialInfo.fetchVPNInfo().getValue();
        long jAEQbTJ = redeemInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        java.lang.String strIsConnected = redeemInitialInfo.isConnected();
        InvestTokenWithAmount investTokenWithAmountFIwbmz2 = redeemInitialInfo.fIwbmz();
        java.util.List<InvestTokenWithAmount> listAuCTel2 = redeemDetailsAndGasFee.AuCTel();
        boolean zORxRYg = redeemInitialInfo.ORxRYg();
        iXA ixa = new iXA(null, false, null, strIsConnected, investTokenWithAmountFIwbmz2, listAuCTel2, null, 0, iCP.AEQbTJ(investTokenWithAmountFIwbmz, java.lang.Integer.valueOf(redeemInitialInfo.djBIcL())), zORxRYg, false, redeemInitialInfo.getFieldNames().getAssetsTip(), ixb.EZpvd(), C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(redeemDetailsAndGasFee.gEmmrt()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null), EZpvd(redeemInitialInfo.getFieldNames(), redeemDetailsAndGasFee.values()), false, redeemInitialInfo.valueOf() || transactionConfig.fetchVPNInfo(), redeemInitialInfo.valueOf() ? false : transactionConfig.fetchVPNInfo(), false, false, 786629, null);
        InvestTokenWithAmount investTokenWithAmountFIwbmz3 = redeemInitialInfo.fIwbmz();
        java.lang.String strEZpvd = ixb.EZpvd();
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = "0";
        }
        C25481ixY c25481ixYCopydefault = copydefault(redeemInitialInfo, investTokenWithAmountFIwbmz3, strEZpvd);
        InterfaceC24178iXu.LoaderManager redeemReceiveTokenInfoItem$default = iCB.getRedeemReceiveTokenInfoItem$default(iCB.EZpvd, redeemInitialInfo.fetchVPNInfo().getValue(), listAuCTel, redeemInitialInfo.ORxRYg(), redeemInitialInfo.QKVWgx(), transactionConfig.EZpvd(), false, 32, null);
        java.util.List<InterfaceC24178iXu> listOLrzqt = OLrzqt(transactionConfig, redeemInitialInfo, ixb, redeemDetailsAndGasFee);
        C24177iXt c24177iXtKWHzl = iCP.KWHzl();
        boolean z = redeemDetailsAndGasFee.AubY() && C33129mqd.valueOf(ixb.EZpvd(), redeemInitialInfo.fIwbmz().getCoinAmount());
        C25479ixW c25479ixWCopydefault = copydefault(redeemInitialInfo.getFieldNames(), redeemDetailsAndGasFee.values());
        if (c25479ixWCopydefault == null || (investTipInfoVo = c25479ixWCopydefault.AEQbTJ()) == null) {
            investTipInfoVo = new InvestTipInfoVo((InvestClickActionType) null, (InvestCustomRedirectData) null, (InvestHoverOnData) null, (InvestPopUpData) null, (InvestRedirectData) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Integer) null, 1023, (DefaultConstructorMarker) null);
        }
        return new iXC(false, false, null, jValues, value, jAEQbTJ, iAkhnZx, transactionStageAhwBna, null, ixa, c25481ixYCopydefault, redeemReceiveTokenInfoItem$default, listOLrzqt, c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : null, (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : z, (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : investTipInfoVo, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 0), null, null, null, false, null, null, null, null, null, 0, 16761094, null);
    }
}
