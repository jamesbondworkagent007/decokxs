package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.bean.RemainingRepaymentInfo;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iCY extends iCX {
    @Override // o.iCX
    public java.util.Set<DetailItemType> KWHzl(TransactionConfig transactionConfig) {
        return yEE.AhwBna(DetailItemType.REMAINING_REPAYMENT, DetailItemType.COLLATERAL_RATIO, DetailItemType.TRANSACTION_PATH, DetailItemType.NETWORK_SLIPPAGE);
    }

    public iXC EZpvd(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, iXB ixb) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        InvestTokenWithAmount investTokenWithAmountFIwbmz = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(redeemInitialInfo.iwGUEr());
        if (investTokenWithAmountFIwbmz == null) {
            investTokenWithAmountFIwbmz = redeemInitialInfo.fIwbmz();
        }
        InvestTokenWithAmount investTokenWithAmount = investTokenWithAmountFIwbmz;
        TransactionStage transactionStage = TransactionStage.INPUT;
        long jValues = redeemInitialInfo.values();
        int value = redeemInitialInfo.fetchVPNInfo().getValue();
        long jAEQbTJ = redeemInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        iXA ixa = new iXA(null, false, null, redeemInitialInfo.isConnected(), investTokenWithAmount, redeemInitialInfo.iwGUEr(), null, 0, iCP.AEQbTJ(investTokenWithAmount, java.lang.Integer.valueOf(redeemInitialInfo.djBIcL())), redeemInitialInfo.ORxRYg(), false, redeemInitialInfo.getFieldNames().getAssetsTip(), "0", C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd("0"), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null), EZpvd(redeemInitialInfo.getFieldNames(), (PromptInformation) null), true, redeemInitialInfo.valueOf(), false, false, false, 917701, null);
        InvestTokenWithAmount investTokenWithAmountFIwbmz2 = redeemInitialInfo.fIwbmz();
        java.lang.String strEZpvd = ixb != null ? ixb.EZpvd() : null;
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = "0";
        }
        return new iXC(false, false, null, jValues, value, jAEQbTJ, iAkhnZx, transactionStage, null, ixa, copydefault(redeemInitialInfo, investTokenWithAmountFIwbmz2, strEZpvd), AEQbTJ(redeemInitialInfo, transactionConfig, null, null), yDY.AhwBna(), iCP.KWHzl(), null, null, null, false, null, null, null, null, null, 0, 16761094, null);
    }

    public iXC KWHzl(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull iXB ixb, @NotNull RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(ixb, "");
        Intrinsics.checkNotNullParameter(redeemDetailsAndGasFee, "");
        InvestTokenWithAmount investTokenWithAmountDjBIcL = ixb.djBIcL();
        if (investTokenWithAmountDjBIcL == null) {
            investTokenWithAmountDjBIcL = redeemInitialInfo.fIwbmz();
        }
        InvestTokenWithAmount investTokenWithAmount = investTokenWithAmountDjBIcL;
        TransactionStage transactionStageAhwBna = ixb.AhwBna();
        long jValues = redeemInitialInfo.values();
        int value = redeemInitialInfo.fetchVPNInfo().getValue();
        long jAEQbTJ = redeemInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        iXA ixa = new iXA(null, false, null, redeemInitialInfo.isConnected(), investTokenWithAmount, redeemDetailsAndGasFee.AuCTel(), null, 0, iCP.AEQbTJ(investTokenWithAmount, java.lang.Integer.valueOf(redeemInitialInfo.djBIcL())), redeemInitialInfo.ORxRYg(), false, redeemInitialInfo.getFieldNames().getAssetsTip(), ixb.EZpvd(), C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(redeemDetailsAndGasFee.gEmmrt()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null), EZpvd(redeemInitialInfo.getFieldNames(), redeemDetailsAndGasFee.values()), false, redeemInitialInfo.valueOf(), false, false, false, 917701, null);
        InvestTokenWithAmount investTokenWithAmountFIwbmz = redeemInitialInfo.fIwbmz();
        java.lang.String strEZpvd = ixb.EZpvd();
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = "0";
        }
        C25481ixY c25481ixYCopydefault = copydefault(redeemInitialInfo, investTokenWithAmountFIwbmz, strEZpvd);
        InterfaceC24178iXu interfaceC24178iXuAEQbTJ = AEQbTJ(redeemInitialInfo, transactionConfig, ixb, redeemDetailsAndGasFee);
        java.util.List<InterfaceC24178iXu> listOLrzqt = OLrzqt(transactionConfig, redeemInitialInfo, ixb, redeemDetailsAndGasFee);
        C24177iXt c24177iXtKWHzl = iCP.KWHzl();
        return new iXC(false, false, null, jValues, value, jAEQbTJ, iAkhnZx, transactionStageAhwBna, null, ixa, c25481ixYCopydefault, interfaceC24178iXuAEQbTJ, listOLrzqt, c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : null, (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : redeemDetailsAndGasFee.AubY() && C33129mqd.valueOf(ixb.EZpvd(), redeemInitialInfo.fIwbmz().getCoinAmount()), (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : null, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 0), null, null, null, false, null, null, null, null, null, 0, 16761094, null);
    }

    public static /* synthetic */ void invokeGetInputInfo$default(iCY icy, InitialInfoModel.RedeemInitialInfo redeemInitialInfo, TransactionConfig transactionConfig, iXB ixb, RedeemDetailsAndGasFee redeemDetailsAndGasFee, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            redeemDetailsAndGasFee = null;
        }
        icy.copydefault(redeemInitialInfo, transactionConfig, ixb, redeemDetailsAndGasFee);
    }

    public final void copydefault(@NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull TransactionConfig transactionConfig, iXB ixb, RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        AEQbTJ(redeemInitialInfo, transactionConfig, ixb, redeemDetailsAndGasFee);
    }

    public static /* synthetic */ InterfaceC24178iXu getInputInfo$default(iCY icy, InitialInfoModel.RedeemInitialInfo redeemInitialInfo, TransactionConfig transactionConfig, iXB ixb, RedeemDetailsAndGasFee redeemDetailsAndGasFee, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            redeemDetailsAndGasFee = null;
        }
        return icy.AEQbTJ(redeemInitialInfo, transactionConfig, ixb, redeemDetailsAndGasFee);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final InterfaceC24178iXu AEQbTJ(InitialInfoModel.RedeemInitialInfo redeemInitialInfo, TransactionConfig transactionConfig, iXB ixb, RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        InvestTokenWithAmount investTokenWithAmountAubY;
        java.lang.String strEZpvd;
        RemainingRepaymentInfo remainingRepaymentInfoFIwbmz;
        RemainingRepaymentInfo remainingRepaymentInfoFIwbmz2;
        java.lang.Integer numFJNWhG = transactionConfig.fJNWhG();
        realRemainingRepayment = null;
        InvestTokenWithAmount realRemainingRepayment = null;
        if (numFJNWhG != null && numFJNWhG.intValue() == 1) {
            iCB icb = iCB.EZpvd;
            if (redeemDetailsAndGasFee == null || (remainingRepaymentInfoFIwbmz2 = redeemDetailsAndGasFee.fIwbmz()) == null || (investTokenWithAmountAubY = remainingRepaymentInfoFIwbmz2.getRemainingRepayment()) == null) {
                investTokenWithAmountAubY = redeemInitialInfo.AubY();
            }
            if (redeemDetailsAndGasFee != null && (remainingRepaymentInfoFIwbmz = redeemDetailsAndGasFee.fIwbmz()) != null) {
                realRemainingRepayment = remainingRepaymentInfoFIwbmz.getRealRemainingRepayment();
            }
            if (ixb == null || (strEZpvd = ixb.EZpvd()) == null) {
                strEZpvd = "0";
            }
            return icb.copydefault(investTokenWithAmountAubY, realRemainingRepayment, strEZpvd);
        }
        iCB icb2 = iCB.EZpvd;
        java.lang.Integer numFJNWhG2 = transactionConfig.fJNWhG();
        return icb2.KWHzl(numFJNWhG2 != null ? numFJNWhG2.intValue() : -1, redeemInitialInfo.gEmmrt(), redeemDetailsAndGasFee != null ? redeemDetailsAndGasFee.KWHzl() : null);
    }
}
