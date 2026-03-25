package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestHoverOnData;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23620iDc extends iCX {
    public final InterfaceC23916iOb copydefault;

    @yCM
    public C23620iDc(@NotNull InterfaceC23916iOb interfaceC23916iOb) {
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        this.copydefault = interfaceC23916iOb;
    }

    @Override // o.iCX
    public java.util.Set<DetailItemType> KWHzl(TransactionConfig transactionConfig) {
        return yEE.AhwBna(DetailItemType.V3_PRICE_RANGE, DetailItemType.V3_UNCLAIM_FEE, DetailItemType.V3_SWAP_SLIPPAGE, DetailItemType.V3_CURRENT_PRICE, DetailItemType.TRANSACTION_PATH, DetailItemType.NETWORK_SLIPPAGE, DetailItemType.TRANSACTION_LOSS);
    }

    public iXC EZpvd(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, iXB ixb) {
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
        iXA ixa = new iXA(null, false, null, redeemInitialInfo.isConnected(), redeemInitialInfo.fIwbmz(), redeemInitialInfo.iwGUEr(), null, 0, iCP.AEQbTJ(redeemInitialInfo.fIwbmz(), java.lang.Integer.valueOf(redeemInitialInfo.djBIcL())), redeemInitialInfo.ORxRYg(), false, redeemInitialInfo.getFieldNames().getAssetsTip(), (ixb == null || (strEZpvd = ixb.EZpvd()) == null) ? "0" : strEZpvd, C27492jwH.OLrzqt.OLrzqt("0"), EZpvd(redeemInitialInfo.getFieldNames(), (PromptInformation) null), z, redeemInitialInfo.valueOf(), false, false, false, 917701, null);
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

    public iXC EZpvd(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull iXB ixb, @NotNull RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(ixb, "");
        Intrinsics.checkNotNullParameter(redeemDetailsAndGasFee, "");
        return EZpvd(transactionConfig, redeemInitialInfo, ixb, redeemDetailsAndGasFee, null);
    }

    public final iXC EZpvd(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull iXB ixb, @NotNull RedeemDetailsAndGasFee redeemDetailsAndGasFee, InterfaceC24178iXu.SharedElementCallback sharedElementCallback) {
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
        java.lang.String strIsConnected = redeemInitialInfo.isConnected();
        InvestTokenWithAmount investTokenWithAmountFIwbmz2 = redeemInitialInfo.fIwbmz();
        java.util.List<InvestTokenWithAmount> listAuCTel = redeemDetailsAndGasFee.AuCTel();
        boolean zORxRYg = redeemInitialInfo.ORxRYg();
        iXA ixa = new iXA(null, false, null, strIsConnected, investTokenWithAmountFIwbmz2, listAuCTel, null, 0, iCP.AEQbTJ(investTokenWithAmountFIwbmz, java.lang.Integer.valueOf(redeemInitialInfo.djBIcL())), zORxRYg, false, redeemInitialInfo.getFieldNames().getAssetsTip(), ixb.EZpvd(), C27492jwH.OLrzqt.OLrzqt(redeemDetailsAndGasFee.gEmmrt()), EZpvd(redeemInitialInfo.getFieldNames(), redeemDetailsAndGasFee.values()), false, redeemInitialInfo.valueOf() || transactionConfig.fetchVPNInfo(), redeemInitialInfo.valueOf() ? false : transactionConfig.fetchVPNInfo(), false, false, 786629, null);
        InvestTokenWithAmount investTokenWithAmountFIwbmz3 = redeemInitialInfo.fIwbmz();
        java.lang.String strEZpvd = ixb.EZpvd();
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = "0";
        }
        C25481ixY c25481ixYCopydefault = copydefault(redeemInitialInfo, investTokenWithAmountFIwbmz3, strEZpvd);
        InterfaceC24178iXu.LoaderManager redeemReceiveTokenInfoItem$default = iCB.getRedeemReceiveTokenInfoItem$default(iCB.EZpvd, redeemInitialInfo.fetchVPNInfo().getValue(), redeemDetailsAndGasFee.AuCTel(), redeemInitialInfo.ORxRYg(), redeemInitialInfo.QKVWgx(), transactionConfig.EZpvd(), false, 32, null);
        java.util.List<InterfaceC24178iXu> listKWHzl = KWHzl(transactionConfig, redeemInitialInfo, ixb, redeemDetailsAndGasFee, sharedElementCallback);
        C24177iXt c24177iXtKWHzl = iCP.KWHzl();
        boolean zAubY = redeemDetailsAndGasFee.AubY();
        C25479ixW c25479ixWCopydefault = copydefault(redeemInitialInfo.getFieldNames(), redeemDetailsAndGasFee.values());
        if (c25479ixWCopydefault == null || (investTipInfoVo = c25479ixWCopydefault.AEQbTJ()) == null) {
            investTipInfoVo = new InvestTipInfoVo((InvestClickActionType) null, (InvestCustomRedirectData) null, (InvestHoverOnData) null, (InvestPopUpData) null, (InvestRedirectData) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Integer) null, 1023, (DefaultConstructorMarker) null);
        }
        return new iXC(false, false, null, jValues, value, jAEQbTJ, iAkhnZx, transactionStageAhwBna, null, ixa, c25481ixYCopydefault, redeemReceiveTokenInfoItem$default, listKWHzl, c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : null, (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : zAubY, (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : investTipInfoVo, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 0), null, null, null, false, null, null, null, null, null, 0, 16761094, null);
    }

    @Override // o.iCX
    public java.util.List<InterfaceC24178iXu> OLrzqt(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull iXB ixb, @NotNull RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(ixb, "");
        Intrinsics.checkNotNullParameter(redeemDetailsAndGasFee, "");
        java.util.List<InterfaceC24178iXu> listOLrzqt = super.OLrzqt(transactionConfig, redeemInitialInfo, ixb, redeemDetailsAndGasFee);
        java.util.List<InterfaceC24178iXu> listOLrzqt2 = C56402yEa.OLrzqt();
        EZpvd(listOLrzqt2, redeemInitialInfo);
        KWHzl(listOLrzqt2, redeemDetailsAndGasFee, (InterfaceC24178iXu.SharedElementCallback) null);
        AEQbTJ(listOLrzqt2, redeemDetailsAndGasFee);
        copydefault(listOLrzqt2, redeemInitialInfo, redeemDetailsAndGasFee);
        listOLrzqt2.addAll(listOLrzqt);
        EZpvd(listOLrzqt2, redeemDetailsAndGasFee);
        return C56402yEa.fARcdN(listOLrzqt2);
    }

    public final java.util.List<InterfaceC24178iXu> KWHzl(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull iXB ixb, @NotNull RedeemDetailsAndGasFee redeemDetailsAndGasFee, InterfaceC24178iXu.SharedElementCallback sharedElementCallback) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(ixb, "");
        Intrinsics.checkNotNullParameter(redeemDetailsAndGasFee, "");
        java.util.List<InterfaceC24178iXu> listOLrzqt = super.OLrzqt(transactionConfig, redeemInitialInfo, ixb, redeemDetailsAndGasFee);
        java.util.List<InterfaceC24178iXu> listOLrzqt2 = C56402yEa.OLrzqt();
        EZpvd(listOLrzqt2, redeemInitialInfo);
        KWHzl(listOLrzqt2, redeemDetailsAndGasFee, sharedElementCallback);
        AEQbTJ(listOLrzqt2, redeemDetailsAndGasFee);
        copydefault(listOLrzqt2, redeemInitialInfo, redeemDetailsAndGasFee);
        listOLrzqt2.addAll(listOLrzqt);
        EZpvd(listOLrzqt2, redeemDetailsAndGasFee);
        return C56402yEa.fARcdN(listOLrzqt2);
    }

    public final void EZpvd(java.util.List<InterfaceC24178iXu> list, RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        InvestTransactionLossInfo investTransactionLossInfoIwGUEr = redeemDetailsAndGasFee.iwGUEr();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (investTransactionLossInfoIwGUEr != null ? investTransactionLossInfoIwGUEr.getNetworkFee() : null))) {
            iCB icb = iCB.EZpvd;
            InvestTransactionLossInfo investTransactionLossInfoIwGUEr2 = redeemDetailsAndGasFee.iwGUEr();
            Intrinsics.copydefault(investTransactionLossInfoIwGUEr2);
            list.add(icb.KWHzl(investTransactionLossInfoIwGUEr2));
        }
    }

    public final void EZpvd(java.util.List<InterfaceC24178iXu> list, InitialInfoModel.RedeemInitialInfo redeemInitialInfo) {
        list.add(iCB.EZpvd.EZpvd(redeemInitialInfo));
    }

    public final void AEQbTJ(java.util.List<InterfaceC24178iXu> list, RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        if (!redeemDetailsAndGasFee.fARcdN().isEmpty()) {
            java.util.List<InvestTokenWithAmount> listFARcdN = redeemDetailsAndGasFee.fARcdN();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFARcdN, 10));
            for (InvestTokenWithAmount investTokenWithAmount : listFARcdN) {
                arrayList.add(investTokenWithAmount.copy((268435455 & 1) != 0 ? investTokenWithAmount.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount.coinAmount : C23626iDi.EZpvd(investTokenWithAmount, this.copydefault), (268435455 & 4) != 0 ? investTokenWithAmount.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount.network : null, (268435455 & 64) != 0 ? investTokenWithAmount.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount.tokenPrice : null));
            }
            list.add(new InterfaceC24178iXu.ComponentCallbacks2(arrayList, redeemDetailsAndGasFee.values().getPendingFeeTip(), null, 4, null));
        }
    }

    public final void copydefault(java.util.List<InterfaceC24178iXu> list, InitialInfoModel.RedeemInitialInfo redeemInitialInfo, RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        list.add(iCB.EZpvd.copydefault(redeemInitialInfo, redeemDetailsAndGasFee));
    }

    public final void KWHzl(java.util.List<InterfaceC24178iXu> list, RedeemDetailsAndGasFee redeemDetailsAndGasFee, InterfaceC24178iXu.SharedElementCallback sharedElementCallback) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) redeemDetailsAndGasFee.uzCIH())) {
            InterfaceC24178iXu.SharedElementCallback sharedElementCallbackKWHzl = iCB.EZpvd.KWHzl(redeemDetailsAndGasFee);
            if (sharedElementCallback != null && (sharedElementCallback.AhwBna() || sharedElementCallback.gEmmrt())) {
                java.lang.String strUzCIH = redeemDetailsAndGasFee.uzCIH();
                if (strUzCIH == null) {
                    strUzCIH = "";
                }
                sharedElementCallbackKWHzl = sharedElementCallbackKWHzl.KWHzl((256 & 1) != 0 ? sharedElementCallbackKWHzl.AhwBna : strUzCIH, (256 & 2) != 0 ? sharedElementCallbackKWHzl.djBIcL : sharedElementCallback.valueOf(), (256 & 4) != 0 ? sharedElementCallbackKWHzl.AYXKKw : sharedElementCallback.KWHzl(), (256 & 8) != 0 ? sharedElementCallbackKWHzl.EZpvd : sharedElementCallback.copydefault(), (256 & 16) != 0 ? sharedElementCallbackKWHzl.OLrzqt : sharedElementCallback.OLrzqt(), (256 & 32) != 0 ? sharedElementCallbackKWHzl.KWHzl : sharedElementCallback.AhwBna(), (256 & 64) != 0 ? sharedElementCallbackKWHzl.copydefault : sharedElementCallback.gEmmrt(), (256 & 128) != 0 ? sharedElementCallbackKWHzl.gEmmrt : sharedElementCallbackKWHzl.djBIcL(), (256 & 256) != 0 ? sharedElementCallbackKWHzl.AEQbTJ : null);
            }
            list.add(sharedElementCallbackKWHzl);
        }
    }
}
