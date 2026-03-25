package o;

import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestType;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iCX extends iCM {
    public abstract java.util.Set<DetailItemType> KWHzl(TransactionConfig transactionConfig);

    public static /* synthetic */ java.util.Set getRequiredDetailsItem$default(iCX icx, TransactionConfig transactionConfig, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequiredDetailsItem");
        }
        if ((i & 1) != 0) {
            transactionConfig = null;
        }
        return icx.KWHzl(transactionConfig);
    }

    public java.util.List<InterfaceC24178iXu> OLrzqt(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull iXB ixb, @NotNull RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(ixb, "");
        Intrinsics.checkNotNullParameter(redeemDetailsAndGasFee, "");
        java.util.List<InterfaceC24178iXu> listOLrzqt = C56402yEa.OLrzqt();
        KWHzl(listOLrzqt, redeemDetailsAndGasFee);
        OLrzqt(listOLrzqt, redeemDetailsAndGasFee);
        OLrzqt(listOLrzqt, transactionConfig, redeemInitialInfo, redeemDetailsAndGasFee);
        KWHzl(listOLrzqt, redeemDetailsAndGasFee, ixb);
        KWHzl(listOLrzqt, transactionConfig, redeemDetailsAndGasFee, redeemInitialInfo);
        copydefault(listOLrzqt, redeemDetailsAndGasFee);
        copydefault(listOLrzqt, redeemDetailsAndGasFee, redeemInitialInfo);
        KWHzl(listOLrzqt, transactionConfig, redeemInitialInfo, ixb, redeemDetailsAndGasFee);
        OLrzqt(listOLrzqt, transactionConfig, redeemInitialInfo, ixb, redeemDetailsAndGasFee);
        copydefault(listOLrzqt, redeemDetailsAndGasFee, ixb);
        KWHzl(listOLrzqt, redeemInitialInfo);
        copydefault(listOLrzqt, redeemInitialInfo);
        java.util.List listFARcdN = C56402yEa.fARcdN(listOLrzqt);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listFARcdN) {
            if (KWHzl(transactionConfig).contains(((InterfaceC24178iXu) obj).EZpvd())) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.EZpvd(arrayList, new Activity(transactionConfig));
    }

    public C25481ixY copydefault(@NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String coinAmount = investTokenWithAmount.getCoinAmount();
        if (coinAmount == null || coinAmount.length() == 0) {
            coinAmount = "0";
        }
        return new C25481ixY(coinAmount, investTokenWithAmount.getTokenSymbol(), false, C33129mqd.gEmmrt(investTokenWithAmount.getCoinAmount(), str), false, redeemInitialInfo.ORxRYg(), false, false, redeemInitialInfo.getFieldNames().getAssetsTip(), 0, null, 1044, null);
    }

    public static final class Activity<T> implements java.util.Comparator {
        public final /* synthetic */ TransactionConfig copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(TransactionConfig transactionConfig) {
            this.copydefault = transactionConfig;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(CollectionsKt___CollectionsKt.gEmmrt(iCX.this.KWHzl(this.copydefault), ((InterfaceC24178iXu) t).EZpvd())), java.lang.Integer.valueOf(CollectionsKt___CollectionsKt.gEmmrt(iCX.this.KWHzl(this.copydefault), ((InterfaceC24178iXu) t2).EZpvd())));
        }
    }

    public final boolean OLrzqt(java.util.List<InterfaceC24178iXu> list, TransactionConfig transactionConfig, InitialInfoModel.RedeemInitialInfo redeemInitialInfo, RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        iCB icb = iCB.EZpvd;
        java.lang.Integer numFJNWhG = transactionConfig.fJNWhG();
        return list.add(icb.KWHzl(numFJNWhG != null ? numFJNWhG.intValue() : -1, redeemInitialInfo.gEmmrt(), redeemDetailsAndGasFee.KWHzl()));
    }

    public final void OLrzqt(java.util.List<InterfaceC24178iXu> list, RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        if (redeemDetailsAndGasFee.djBIcL() != null) {
            iCB icb = iCB.EZpvd;
            java.lang.String oldHealthFactor = redeemDetailsAndGasFee.djBIcL().getOldHealthFactor();
            java.lang.String str = "--";
            if (oldHealthFactor == null || oldHealthFactor.length() == 0) {
                oldHealthFactor = "--";
            }
            java.lang.String newHealthFactor = redeemDetailsAndGasFee.djBIcL().getNewHealthFactor();
            if (newHealthFactor != null && newHealthFactor.length() != 0) {
                str = newHealthFactor;
            }
            list.add(icb.copydefault(oldHealthFactor, str, redeemDetailsAndGasFee.djBIcL().getHealthLevel()));
        }
    }

    public final void KWHzl(java.util.List<InterfaceC24178iXu> list, RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        list.add(iCB.EZpvd.EZpvd(redeemDetailsAndGasFee.copydefault()));
    }

    public final boolean KWHzl(java.util.List<InterfaceC24178iXu> list, RedeemDetailsAndGasFee redeemDetailsAndGasFee, iXB ixb) {
        return list.add(iCB.EZpvd.copydefault(redeemDetailsAndGasFee.fIwbmz().getRemainingRepayment(), redeemDetailsAndGasFee.fIwbmz().getRealRemainingRepayment(), ixb.EZpvd()));
    }

    public final boolean KWHzl(java.util.List<InterfaceC24178iXu> list, TransactionConfig transactionConfig, RedeemDetailsAndGasFee redeemDetailsAndGasFee, InitialInfoModel.RedeemInitialInfo redeemInitialInfo) {
        return list.add(iCB.getRedeemReceiveTokenInfoItem$default(iCB.EZpvd, redeemInitialInfo.fetchVPNInfo().getValue(), redeemDetailsAndGasFee.AuCTel(), redeemInitialInfo.ORxRYg(), redeemInitialInfo.QKVWgx(), transactionConfig.EZpvd(), false, 32, null));
    }

    public final void copydefault(java.util.List<InterfaceC24178iXu> list, RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) redeemDetailsAndGasFee.isConnected().getCoinAmount())) {
            iCB icb = iCB.EZpvd;
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            java.lang.String coinAmount = redeemDetailsAndGasFee.isConnected().getCoinAmount();
            if (coinAmount == null || coinAmount.length() == 0) {
                coinAmount = "0.0";
            }
            list.add(icb.OLrzqt(C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH, coinAmount, 6, 2, false, false, 24, null) + " " + redeemDetailsAndGasFee.isConnected().getTokenSymbol(), redeemDetailsAndGasFee.values().getPayWithTokenTip()));
        }
    }

    public final void copydefault(java.util.List<InterfaceC24178iXu> list, RedeemDetailsAndGasFee redeemDetailsAndGasFee, InitialInfoModel.RedeemInitialInfo redeemInitialInfo) {
        java.lang.String tokenSymbol;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) redeemDetailsAndGasFee.AhwBna())) {
            iCB icb = iCB.EZpvd;
            java.lang.String strAhwBna = redeemDetailsAndGasFee.AhwBna();
            java.lang.String tokenSymbol2 = redeemInitialInfo.AkhnZx().getTokenSymbol();
            InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(redeemInitialInfo.AuCTelauCTel());
            if (investTokenWithAmount == null || (tokenSymbol = investTokenWithAmount.getTokenSymbol()) == null) {
                tokenSymbol = "";
            }
            list.add(icb.EZpvd(strAhwBna, tokenSymbol2, tokenSymbol));
        }
    }

    public final void KWHzl(java.util.List<InterfaceC24178iXu> list, TransactionConfig transactionConfig, InitialInfoModel.RedeemInitialInfo redeemInitialInfo, iXB ixb, RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        InvestOrder investOrderAhwBna;
        if (transactionConfig.getNewProxyInstance() && (investOrderAhwBna = transactionConfig.AhwBna()) != null && Intrinsics.EZpvd(investOrderAhwBna.getRedeemNeedUnbond(), java.lang.Boolean.TRUE)) {
            return;
        }
        iCB icb = iCB.EZpvd;
        java.lang.String strEjfBZ = redeemInitialInfo.ejfBZ();
        java.lang.String strAuCTel = redeemInitialInfo.AuCTel();
        int value = redeemInitialInfo.fetchVPNInfo().getValue();
        java.util.List<InvestTokenWithAmount> listAuCTel = redeemDetailsAndGasFee.AuCTel();
        java.util.List<InvestTokenWithAmount> listEjfBZ = redeemDetailsAndGasFee.ejfBZ();
        java.util.List<InvestTokenWithAmount> listFJNWhG = redeemDetailsAndGasFee.fJNWhG();
        InvestTokenWithAmount investTokenWithAmountOLrzqt = ixb.OLrzqt();
        if (investTokenWithAmountOLrzqt == null) {
            investTokenWithAmountOLrzqt = redeemInitialInfo.fIwbmz();
        }
        InvestTokenWithAmount investTokenWithAmount = investTokenWithAmountOLrzqt;
        InvestTokenWithAmount investTokenWithAmountOLrzqt2 = ixb.OLrzqt();
        list.add(icb.EZpvd(transactionConfig, strEjfBZ, strAuCTel, value, listAuCTel, listEjfBZ, listFJNWhG, investTokenWithAmount, (investTokenWithAmountOLrzqt2 == null && (investTokenWithAmountOLrzqt2 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(redeemDetailsAndGasFee.AuCTel())) == null) ? new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmountOLrzqt2, redeemDetailsAndGasFee.getFieldNames(), 2));
    }

    public final void OLrzqt(java.util.List<InterfaceC24178iXu> list, TransactionConfig transactionConfig, InitialInfoModel.RedeemInitialInfo redeemInitialInfo, iXB ixb, RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        java.lang.String strOLrzqt;
        java.lang.String ratePercent$default = "";
        if (C33129mqd.KWHzl((java.util.Collection) redeemDetailsAndGasFee.fJNWhG()) && ixb.AEQbTJ().length() == 0) {
            java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(redeemDetailsAndGasFee.fJNWhG(), C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu), null, null, 0, null, new Function1() { // from class: o.iCZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return iCX.copydefault((InvestTokenWithAmount) obj);
                }
            }, 30, null);
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.RLmrWm);
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = C56390yDp.OLrzqt("tokenSymbol", strJoinToString$default);
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            InvestSlippageConfig investSlippage = redeemDetailsAndGasFee.valueOf().getInvestSlippage();
            java.lang.String automaticValue = investSlippage != null ? investSlippage.getAutomaticValue() : null;
            if (automaticValue == null) {
                automaticValue = "";
            }
            pairArr[1] = C56390yDp.OLrzqt("slippageTolerance", c27492jwH.gEmmrt(automaticValue));
            strOLrzqt = C33069mpW.OLrzqt(strAYXKKw, C56424yEw.gEmmrt(pairArr));
        } else {
            strOLrzqt = "";
        }
        java.lang.String strAEQbTJ = ixb.AEQbTJ();
        InvestSlippageConfig investSlippage2 = redeemDetailsAndGasFee.valueOf().getInvestSlippage();
        java.lang.String automaticValue2 = investSlippage2 != null ? investSlippage2.getAutomaticValue() : null;
        if (automaticValue2 == null) {
            automaticValue2 = "";
        }
        if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
            strAEQbTJ = automaticValue2;
        }
        iCB icb = iCB.EZpvd;
        java.lang.String strFARcdN = redeemInitialInfo.fARcdN();
        java.lang.String strFJNWhG = redeemInitialInfo.fJNWhG();
        if (!transactionConfig.getNewProxyInstance() && C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ)) {
            ratePercent$default = C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, strAEQbTJ, false, 2, null);
        }
        list.add(icb.EZpvd(strFARcdN, strFJNWhG, ratePercent$default, C27505jwU.OLrzqt(redeemDetailsAndGasFee.valueOf()), strOLrzqt, false, null));
    }

    public static final java.lang.CharSequence copydefault(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getTokenSymbol();
    }

    public final void copydefault(java.util.List<InterfaceC24178iXu> list, RedeemDetailsAndGasFee redeemDetailsAndGasFee, iXB ixb) {
        java.lang.String gasPrice;
        InvestNetworkFeeItem investNetworkFeeItemValueOf = ixb.valueOf();
        if (investNetworkFeeItemValueOf == null || (gasPrice = investNetworkFeeItemValueOf.getGasPrice()) == null) {
            gasPrice = redeemDetailsAndGasFee.valueOf().getAverageGear().getGasPrice();
        }
        java.lang.String gasPriceUnit = redeemDetailsAndGasFee.valueOf().getNetworkFee().getGasPriceUnit();
        list.add(iCB.EZpvd.AYXKKw(gasPrice + " " + gasPriceUnit));
    }

    public final void KWHzl(java.util.List<InterfaceC24178iXu> list, InitialInfoModel.RedeemInitialInfo redeemInitialInfo) {
        if (redeemInitialInfo.fetchVPNInfo() == InvestType.Pos && C33129mqd.OLrzqt((java.lang.CharSequence) redeemInitialInfo.gHZMYf())) {
            list.add(iCB.EZpvd.djBIcL(redeemInitialInfo.gHZMYf()));
        }
    }

    public final boolean copydefault(java.util.List<InterfaceC24178iXu> list, InitialInfoModel.RedeemInitialInfo redeemInitialInfo) {
        iCB icb = iCB.EZpvd;
        int i = C25493ixk.Application.AEQbTJ;
        java.lang.Integer numAYXKKw = redeemInitialInfo.AYXKKw();
        return list.add(icb.EZpvd(C59449zhJ.replace$default(C33070mpX.EZpvd(i, numAYXKKw != null ? numAYXKKw.intValue() : 0), "{num}", java.lang.String.valueOf(redeemInitialInfo.AYXKKw()), false, 4, (java.lang.Object) null)));
    }
}
