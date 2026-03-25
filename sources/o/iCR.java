package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iCR extends iCV {
    @Override // o.iCV
    public java.util.Set<DetailItemType> KWHzl() {
        return yEE.AhwBna(DetailItemType.DAILY_YIELD, DetailItemType.EXCHANGE_RATE, DetailItemType.TRANSACTION_PATH, DetailItemType.NETWORK_SLIPPAGE, DetailItemType.NETWORK_FEE);
    }

    public iXC copydefault(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.InvestInitialInfo investInitialInfo, iXB ixb) {
        InvestTokenWithAmount investTokenWithAmount;
        java.lang.Object next;
        InvestTokenWithAmount investTokenWithAmountDjBIcL;
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(investInitialInfo, "");
        TransactionStage transactionStage = TransactionStage.INPUT;
        long jGEmmrt = investInitialInfo.gEmmrt();
        int value = investInitialInfo.AhwBna().getValue();
        long jAEQbTJ = investInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        if ((ixb == null || (investTokenWithAmount = ixb.djBIcL()) == null) && (investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investInitialInfo.AYXKKw())) == null) {
            investTokenWithAmount = new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null);
        }
        InvestTokenWithAmount investTokenWithAmount2 = investTokenWithAmount;
        java.util.List<InvestTokenWithAmount> listAYXKKw = investInitialInfo.AYXKKw();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
        for (InvestTokenWithAmount investTokenWithAmount3 : listAYXKKw) {
            arrayList.add(investTokenWithAmount3.copy((268435455 & 1) != 0 ? investTokenWithAmount3.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount3.coinAmount : "0", (268435455 & 4) != 0 ? investTokenWithAmount3.currencyAmount : "0", (268435455 & 8) != 0 ? investTokenWithAmount3.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount3.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount3.network : null, (268435455 & 64) != 0 ? investTokenWithAmount3.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount3.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount3.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount3.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount3.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount3.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount3.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount3.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount3.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount3.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount3.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount3.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount3.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount3.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount3.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount3.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount3.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount3.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount3.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount3.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount3.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount3.tokenPrice : null));
        }
        iXA ixaAEQbTJ = AEQbTJ(true, investInitialInfo, investTokenWithAmount2, (java.util.List<InvestTokenWithAmount>) arrayList, (PromptInformation) null);
        java.util.Iterator<T> it = investInitialInfo.AYXKKw().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((InvestTokenWithAmount) next).getTokenAddress(), (java.lang.Object) ((ixb == null || (investTokenWithAmountDjBIcL = ixb.djBIcL()) == null) ? null : investTokenWithAmountDjBIcL.getTokenAddress()))) {
                break;
            }
        }
        InvestTokenWithAmount investTokenWithAmount4 = (InvestTokenWithAmount) next;
        if (investTokenWithAmount4 == null) {
            investTokenWithAmount4 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AuCTelauCTel(investInitialInfo.AYXKKw());
        }
        java.lang.String strEZpvd = ixb != null ? ixb.EZpvd() : null;
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = "0";
        }
        return new iXC(false, false, null, jGEmmrt, value, jAEQbTJ, iAkhnZx, transactionStage, null, ixaAEQbTJ, KWHzl(investInitialInfo, investTokenWithAmount4, strEZpvd), iCB.EZpvd.AEQbTJ((WalletImportError.ERROR_CODE_AA_EXIST & 1) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? "" : "", investInitialInfo.AhwBna().getValue(), investInitialInfo.valueOf(), (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? yDY.AhwBna() : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? "" : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? "" : null), yDY.AhwBna(), iCP.KWHzl(), null, null, null, false, null, null, null, null, null, 0, 16761094, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.iCB.getDailyYieldItem$default(o.iCB, boolean, java.lang.String, int, java.util.List, java.util.List, java.lang.String, java.lang.String, int, java.lang.Object):o.iXu$StateListAnimator */
    public iXC EZpvd(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.InvestInitialInfo investInitialInfo, @NotNull iXB ixb, @NotNull InvestDetailsAndGasFee investDetailsAndGasFee) {
        java.util.List<InvestTokenWithAmount> listValueOf;
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(investInitialInfo, "");
        Intrinsics.checkNotNullParameter(ixb, "");
        Intrinsics.checkNotNullParameter(investDetailsAndGasFee, "");
        InvestTokenWithAmount investTokenWithAmountKWHzl = iCP.KWHzl(investDetailsAndGasFee.values(), ixb.djBIcL());
        InvestTokenWithAmount investTokenWithAmountKWHzl2 = iCP.KWHzl(investInitialInfo.AYXKKw(), ixb.djBIcL());
        InvestTokenWithAmount investTokenWithAmountDjBIcL = ixb.djBIcL();
        if (investTokenWithAmountDjBIcL == null || (listValueOf = C56402yEa.EZpvd(investTokenWithAmountDjBIcL)) == null) {
            listValueOf = investInitialInfo.valueOf();
        }
        java.util.List<InvestTokenWithAmount> list = listValueOf;
        TransactionStage transactionStageAhwBna = ixb.AhwBna();
        long jGEmmrt = investInitialInfo.gEmmrt();
        int value = investInitialInfo.AhwBna().getValue();
        long jAEQbTJ = investInitialInfo.AEQbTJ();
        int iAkhnZx = transactionConfig.AkhnZx();
        iXA ixaAEQbTJ = AEQbTJ(false, investInitialInfo, investTokenWithAmountKWHzl, investDetailsAndGasFee.values(), investDetailsAndGasFee.fJNWhG());
        java.lang.String strEZpvd = ixb.EZpvd();
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = "0";
        }
        C25481ixY c25481ixYKWHzl = KWHzl(investInitialInfo, investTokenWithAmountKWHzl2, strEZpvd);
        iCB icb = iCB.EZpvd;
        int value2 = investInitialInfo.AhwBna().getValue();
        java.util.List<InvestTokenWithAmount> listDjBIcL = investDetailsAndGasFee.djBIcL();
        InterfaceC24178iXu.StateListAnimator stateListAnimatorAEQbTJ = icb.AEQbTJ((WalletImportError.ERROR_CODE_AA_EXIST & 1) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? "" : "", value2, listDjBIcL.isEmpty() ? list : listDjBIcL, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? yDY.AhwBna() : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? "" : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? "" : null);
        C24177iXt c24177iXtKWHzl = iCP.KWHzl();
        return new iXC(false, false, null, jGEmmrt, value, jAEQbTJ, iAkhnZx, transactionStageAhwBna, null, ixaAEQbTJ, c25481ixYKWHzl, stateListAnimatorAEQbTJ, OLrzqt(transactionConfig, investInitialInfo, ixb, investDetailsAndGasFee), c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : null, (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : investDetailsAndGasFee.zLjUOn() && C33129mqd.AEQbTJ(investTokenWithAmountKWHzl2.getCoinAmount(), investTokenWithAmountKWHzl.getCoinAmount()), (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : null, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 0), null, null, null, false, null, null, null, null, null, 0, 16761094, null);
    }

    public static /* synthetic */ void invokeGetTokenAmountInputUiModel$default(iCR icr, boolean z, InitialInfoModel.InvestInitialInfo investInitialInfo, InvestTokenWithAmount investTokenWithAmount, java.util.List list, PromptInformation promptInformation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            promptInformation = null;
        }
        icr.copydefault(z2, investInitialInfo, investTokenWithAmount, list, promptInformation);
    }

    public final void copydefault(boolean z, @NotNull InitialInfoModel.InvestInitialInfo investInitialInfo, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull java.util.List<InvestTokenWithAmount> list, PromptInformation promptInformation) {
        Intrinsics.checkNotNullParameter(investInitialInfo, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(list, "");
        AEQbTJ(z, investInitialInfo, investTokenWithAmount, list, promptInformation);
    }

    public static /* synthetic */ iXA getTokenAmountInputUiModel$default(iCR icr, boolean z, InitialInfoModel.InvestInitialInfo investInitialInfo, InvestTokenWithAmount investTokenWithAmount, java.util.List list, PromptInformation promptInformation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            promptInformation = null;
        }
        return icr.AEQbTJ(z2, investInitialInfo, investTokenWithAmount, (java.util.List<InvestTokenWithAmount>) list, promptInformation);
    }

    public final iXA AEQbTJ(boolean z, InitialInfoModel.InvestInitialInfo investInitialInfo, InvestTokenWithAmount investTokenWithAmount, java.util.List<InvestTokenWithAmount> list, PromptInformation promptInformation) {
        InvestTokenWithAmount investTokenWithAmountKWHzl = iCP.KWHzl(list, investTokenWithAmount);
        InvestTokenWithAmount investTokenWithAmount2 = list.size() > 0 ? list.get(0) : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null);
        InvestTokenWithAmount investTokenWithAmount3 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(list, 1);
        kotlin.Pair[] pairArr = new kotlin.Pair[1];
        C24179iXv c24179iXvOLrzqt = null;
        pairArr[0] = C56390yDp.OLrzqt(investTokenWithAmount2.getTokenAddress(), z ? null : super.OLrzqt(investInitialInfo.ejfBZ(), investInitialInfo.AYXKKw().get(0), investTokenWithAmount2));
        java.util.HashMap mapAYXKKw = C56424yEw.AYXKKw(pairArr);
        if (investTokenWithAmount3 != null) {
            java.lang.String tokenAddress = investTokenWithAmount3.getTokenAddress();
            if (!z) {
                java.lang.String strEjfBZ = investInitialInfo.ejfBZ();
                InvestTokenWithAmount investTokenWithAmount4 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(investInitialInfo.AYXKKw(), 1);
                if (investTokenWithAmount4 == null) {
                    investTokenWithAmount4 = investTokenWithAmount;
                }
                c24179iXvOLrzqt = super.OLrzqt(strEjfBZ, investTokenWithAmount4, investTokenWithAmount3);
            }
            mapAYXKKw.put(tokenAddress, c24179iXvOLrzqt);
        }
        int iIndexOf = list.indexOf(iCP.KWHzl(list, investTokenWithAmount));
        java.lang.String strDbNXlk = investInitialInfo.DbNXlk();
        return new iXA(investInitialInfo.ejfBZ(), false, null, strDbNXlk, list.get(iIndexOf), list, mapAYXKKw, iIndexOf, iCP.AEQbTJ(investTokenWithAmountKWHzl, java.lang.Integer.valueOf(investInitialInfo.djBIcL())), investInitialInfo.AwvSrB(), investInitialInfo.AuCTelauCTel(), null, investTokenWithAmount.getCoinAmount(), C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(list.isEmpty() ? "0" : investTokenWithAmount.getCurrencyAmount()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null), super.EZpvd(investInitialInfo.fJNWhG(), promptInformation), z, false, false, false, false, 985092, null);
    }
}
