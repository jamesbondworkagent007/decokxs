package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.invest_biz.data.bean.BoostParameters;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iCV extends iCM {
    public abstract java.util.Set<DetailItemType> KWHzl();

    public final java.util.List<InvestTokenWithAmount> copydefault(@NotNull final InitialInfoModel.InvestInitialInfo investInitialInfo, iXB ixb) {
        Intrinsics.checkNotNullParameter(investInitialInfo, "");
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(investInitialInfo.AYXKKw().size()), 1)) {
            return investInitialInfo.AYXKKw();
        }
        return C56402yEa.EZpvd(iCP.EZpvd(investInitialInfo.AYXKKw(), ixb != null ? ixb.djBIcL() : null, new Function0() { // from class: o.iCW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return iCV.EZpvd(investInitialInfo);
            }
        }));
    }

    public static final InvestTokenWithAmount EZpvd(InitialInfoModel.InvestInitialInfo investInitialInfo) {
        InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investInitialInfo.AYXKKw());
        return investTokenWithAmount == null ? new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount;
    }

    public final java.util.List<InterfaceC24178iXu> OLrzqt(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.InvestInitialInfo investInitialInfo, @NotNull iXB ixb, @NotNull InvestDetailsAndGasFee investDetailsAndGasFee) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(investInitialInfo, "");
        Intrinsics.checkNotNullParameter(ixb, "");
        Intrinsics.checkNotNullParameter(investDetailsAndGasFee, "");
        java.util.List<InterfaceC24178iXu> listOLrzqt = C56402yEa.OLrzqt();
        EZpvd(listOLrzqt, transactionConfig, investDetailsAndGasFee, investInitialInfo);
        AEQbTJ(listOLrzqt, investDetailsAndGasFee);
        copydefault(listOLrzqt, investDetailsAndGasFee, transactionConfig, investInitialInfo);
        EZpvd(listOLrzqt, investDetailsAndGasFee, investInitialInfo);
        valueOf(listOLrzqt, investDetailsAndGasFee);
        EZpvd(listOLrzqt, investDetailsAndGasFee);
        OLrzqt(listOLrzqt, investDetailsAndGasFee);
        OLrzqt(listOLrzqt, investDetailsAndGasFee, investInitialInfo);
        KWHzl(listOLrzqt, transactionConfig, investInitialInfo, ixb, investDetailsAndGasFee);
        OLrzqt(listOLrzqt, investInitialInfo, ixb, investDetailsAndGasFee);
        EZpvd(listOLrzqt, investInitialInfo);
        OLrzqt(listOLrzqt, ixb, investDetailsAndGasFee);
        KWHzl(listOLrzqt, investDetailsAndGasFee);
        AhwBna(listOLrzqt, investDetailsAndGasFee);
        gEmmrt(listOLrzqt, investDetailsAndGasFee);
        AEQbTJ(listOLrzqt, investInitialInfo, ixb);
        AYXKKw(listOLrzqt, investDetailsAndGasFee);
        copydefault(listOLrzqt, investDetailsAndGasFee);
        java.util.List listFARcdN = C56402yEa.fARcdN(listOLrzqt);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listFARcdN) {
            if (KWHzl().contains(((InterfaceC24178iXu) obj).EZpvd())) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.EZpvd(arrayList, new StateListAnimator());
    }

    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(CollectionsKt___CollectionsKt.gEmmrt(iCV.this.KWHzl(), ((InterfaceC24178iXu) t).EZpvd())), java.lang.Integer.valueOf(CollectionsKt___CollectionsKt.gEmmrt(iCV.this.KWHzl(), ((InterfaceC24178iXu) t2).EZpvd())));
        }
    }

    public static /* synthetic */ iXA getTokenAmountInput$default(iCV icv, InitialInfoModel.InvestInitialInfo investInitialInfo, java.util.List list, iXB ixb, InvestDetailsAndGasFee investDetailsAndGasFee, TransactionConfig transactionConfig, int i, java.lang.Object obj) {
        if (obj == null) {
            return icv.AEQbTJ(investInitialInfo, list, ixb, (i & 8) != 0 ? null : investDetailsAndGasFee, (i & 16) != 0 ? null : transactionConfig);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTokenAmountInput");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final iXA AEQbTJ(@NotNull InitialInfoModel.InvestInitialInfo investInitialInfo, @NotNull java.util.List<InvestTokenWithAmount> list, iXB ixb, InvestDetailsAndGasFee investDetailsAndGasFee, TransactionConfig transactionConfig) {
        int iCopydefault;
        InvestTokenWithAmount investTokenWithAmount;
        InvestTokenWithAmount investTokenWithAmount2;
        java.lang.String tokenAddress;
        C24179iXv c24179iXvOLrzqt;
        java.util.List<InvestTokenWithAmount> arrayList;
        java.lang.String strEZpvd;
        java.util.List<InvestTokenWithAmount> listValues;
        java.util.List<InvestTokenWithAmount> listValues2;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(investInitialInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = (investDetailsAndGasFee == null && ixb == null) || (ixb != null && ixb.gEmmrt());
        if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(list.size()), 1)) {
            iCopydefault = 0;
        } else if ((ixb != null ? ixb.djBIcL() : null) != null) {
            java.util.Iterator<T> it = list.iterator();
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
            iCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends java.lang.Object>) list, next);
            if (iCopydefault <= -1) {
            }
        }
        if (investDetailsAndGasFee == null || (listValues2 = investDetailsAndGasFee.values()) == null) {
            investTokenWithAmount = new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null);
        } else {
            investTokenWithAmount = listValues2.size() > 0 ? listValues2.get(0) : list.get(iCopydefault);
            if (investTokenWithAmount == null) {
            }
        }
        if (investDetailsAndGasFee == null || (listValues = investDetailsAndGasFee.values()) == null) {
            investTokenWithAmount2 = null;
        } else {
            investTokenWithAmount2 = 1 < listValues.size() ? listValues.get(1) : (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(list, 1);
        }
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        java.lang.String tokenAddress2 = investTokenWithAmount.getTokenAddress();
        java.lang.String strEjfBZ = investInitialInfo.ejfBZ();
        java.util.List<InvestTokenWithAmount> listAYXKKw = investInitialInfo.AYXKKw();
        pairArr[0] = C56390yDp.OLrzqt(tokenAddress2, super.OLrzqt(strEjfBZ, listAYXKKw.size() > 0 ? listAYXKKw.get(0) : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null), investTokenWithAmount));
        if (investTokenWithAmount2 == null || (tokenAddress = investTokenWithAmount2.getTokenAddress()) == null) {
            tokenAddress = (1 < list.size() ? list.get(1) : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null)).getTokenAddress();
        }
        if (investTokenWithAmount2 != null) {
            java.lang.String strEjfBZ2 = investInitialInfo.ejfBZ();
            java.util.List<InvestTokenWithAmount> listAYXKKw2 = investInitialInfo.AYXKKw();
            c24179iXvOLrzqt = super.OLrzqt(strEjfBZ2, 1 < listAYXKKw2.size() ? listAYXKKw2.get(1) : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null), investTokenWithAmount2);
        } else {
            c24179iXvOLrzqt = null;
        }
        pairArr[1] = C56390yDp.OLrzqt(tokenAddress, c24179iXvOLrzqt);
        java.util.HashMap mapAYXKKw = C56424yEw.AYXKKw(pairArr);
        java.lang.String strDbNXlk = investInitialInfo.DbNXlk();
        java.lang.String strEjfBZ3 = investInitialInfo.ejfBZ();
        InvestTokenWithAmount investTokenWithAmount3 = list.get(iCopydefault);
        if (investDetailsAndGasFee == null || (arrayList = investDetailsAndGasFee.values()) == null) {
            arrayList = new java.util.ArrayList<>(C56403yEb.AYXKKw(list, 10));
            for (InvestTokenWithAmount investTokenWithAmount4 : list) {
                arrayList.add(investTokenWithAmount4.copy((268435455 & 1) != 0 ? investTokenWithAmount4.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount4.coinAmount : "0", (268435455 & 4) != 0 ? investTokenWithAmount4.currencyAmount : "0", (268435455 & 8) != 0 ? investTokenWithAmount4.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount4.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount4.network : null, (268435455 & 64) != 0 ? investTokenWithAmount4.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount4.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount4.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount4.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount4.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount4.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount4.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount4.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount4.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount4.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount4.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount4.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount4.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount4.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount4.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount4.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount4.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount4.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount4.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount4.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount4.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount4.tokenPrice : null));
            }
        }
        return new iXA(strEjfBZ3, false, null, strDbNXlk, investTokenWithAmount3, arrayList, mapAYXKKw, 0, iCP.AEQbTJ(list.get(iCopydefault), java.lang.Integer.valueOf(investInitialInfo.djBIcL())), investInitialInfo.AwvSrB(), investInitialInfo.AuCTelauCTel(), null, (ixb == null || (strEZpvd = ixb.EZpvd()) == null) ? list.get(iCopydefault).getCoinAmount() : strEZpvd, C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(investDetailsAndGasFee == null ? "0" : investTokenWithAmount.getCurrencyAmount()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null), EZpvd(investInitialInfo.fJNWhG(), investDetailsAndGasFee != null ? investDetailsAndGasFee.fJNWhG() : null), z, transactionConfig != null && transactionConfig.fetchVPNInfo(), true, false, investDetailsAndGasFee != null ? investDetailsAndGasFee.zLjUOn() : true, 264196, null);
    }

    public C25481ixY KWHzl(@NotNull InitialInfoModel.InvestInitialInfo investInitialInfo, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(investInitialInfo, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String coinAmount = investTokenWithAmount.getCoinAmount();
        if (coinAmount == null || coinAmount.length() == 0) {
            coinAmount = "0";
        }
        return new C25481ixY(coinAmount, investTokenWithAmount.getTokenSymbol(), false, C33129mqd.gEmmrt(investTokenWithAmount.getCoinAmount(), str), false, investInitialInfo.AwvSrB(), investInitialInfo.AuCTelauCTel(), investTokenWithAmount.isBaseToken() && C33129mqd.gEmmrt(investTokenWithAmount.getCoinAmount(), investInitialInfo.ejfBZ()), null, 0, null, 1300, null);
    }

    public final boolean copydefault(java.util.List<InterfaceC24178iXu> list, InvestDetailsAndGasFee investDetailsAndGasFee, TransactionConfig transactionConfig, InitialInfoModel.InvestInitialInfo investInitialInfo) {
        iCB icb = iCB.EZpvd;
        java.lang.Integer numFJNWhG = transactionConfig.fJNWhG();
        return list.add(icb.KWHzl(numFJNWhG != null ? numFJNWhG.intValue() : -1, investInitialInfo.copydefault(), investDetailsAndGasFee.AEQbTJ()));
    }

    public final void EZpvd(java.util.List<InterfaceC24178iXu> list, InvestDetailsAndGasFee investDetailsAndGasFee, InitialInfoModel.InvestInitialInfo investInitialInfo) {
        java.util.List<java.lang.String> gainsTokenList;
        if (C33129mqd.KWHzl((java.util.Collection) investDetailsAndGasFee.djBIcL())) {
            iCB icb = iCB.EZpvd;
            int value = investInitialInfo.AhwBna().getValue();
            java.util.List<InvestTokenWithAmount> listDjBIcL = investDetailsAndGasFee.djBIcL();
            java.lang.String strUzCIH = investDetailsAndGasFee.uzCIH();
            if (strUzCIH == null) {
                strUzCIH = "";
            }
            java.lang.String str = strUzCIH;
            BoostParameters boostParametersEZpvd = investDetailsAndGasFee.EZpvd();
            list.add(icb.AEQbTJ((WalletImportError.ERROR_CODE_AA_EXIST & 1) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? "" : "", value, listDjBIcL, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? yDY.AhwBna() : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? "" : str, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? "" : (boostParametersEZpvd == null || (gainsTokenList = boostParametersEZpvd.getGainsTokenList()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(gainsTokenList)));
        }
    }

    public final void OLrzqt(java.util.List<InterfaceC24178iXu> list, InvestDetailsAndGasFee investDetailsAndGasFee) {
        InvestTokenWithAmount investTokenWithAmountFIwbmz;
        InvestTokenWithAmount investTokenWithAmountFIwbmz2 = investDetailsAndGasFee.fIwbmz();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) (investTokenWithAmountFIwbmz2 != null ? investTokenWithAmountFIwbmz2.getCoinAmount() : null)) || (investTokenWithAmountFIwbmz = investDetailsAndGasFee.fIwbmz()) == null) {
            return;
        }
        iCB icb = iCB.EZpvd;
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        java.lang.String coinAmount = investTokenWithAmountFIwbmz.getCoinAmount();
        if (coinAmount == null || coinAmount.length() == 0) {
            coinAmount = "0";
        }
        java.lang.String strLimitFmtNoZeroAndUpWithKMB$default = C27492jwH.limitFmtNoZeroAndUpWithKMB$default(c27492jwH, coinAmount, 6, 2, false, 8, null);
        java.lang.String tokenSymbol = investTokenWithAmountFIwbmz.getTokenSymbol();
        if (tokenSymbol.length() == 0) {
            tokenSymbol = "";
        }
        list.add(icb.OLrzqt(strLimitFmtNoZeroAndUpWithKMB$default + " " + ((java.lang.Object) tokenSymbol)));
    }

    public final void OLrzqt(java.util.List<InterfaceC24178iXu> list, InvestDetailsAndGasFee investDetailsAndGasFee, InitialInfoModel.InvestInitialInfo investInitialInfo) {
        java.lang.String tokenSymbol;
        java.lang.String tokenSymbol2;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) investDetailsAndGasFee.AYXKKw())) {
            iCB icb = iCB.EZpvd;
            java.lang.String strAYXKKw = investDetailsAndGasFee.AYXKKw();
            InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investInitialInfo.uzCIH());
            java.lang.String str = "";
            if (investTokenWithAmount == null || (tokenSymbol = investTokenWithAmount.getTokenSymbol()) == null) {
                tokenSymbol = "";
            }
            InvestTokenWithAmount investTokenWithAmountFARcdN = investInitialInfo.fARcdN();
            if (investTokenWithAmountFARcdN != null && (tokenSymbol2 = investTokenWithAmountFARcdN.getTokenSymbol()) != null) {
                str = tokenSymbol2;
            }
            list.add(icb.EZpvd(strAYXKKw, tokenSymbol, str));
        }
    }

    public final boolean KWHzl(java.util.List<InterfaceC24178iXu> list, TransactionConfig transactionConfig, InitialInfoModel.InvestInitialInfo investInitialInfo, iXB ixb, InvestDetailsAndGasFee investDetailsAndGasFee) {
        iCB icb = iCB.EZpvd;
        java.lang.String strFetchVPNInfo = investInitialInfo.fetchVPNInfo();
        java.lang.String strValues = investInitialInfo.values();
        int value = investInitialInfo.AhwBna().getValue();
        java.util.List<InvestTokenWithAmount> listValues = investDetailsAndGasFee.values();
        java.util.List<InvestTokenWithAmount> listHDKMBd = investDetailsAndGasFee.hDKMBd();
        java.util.List<InvestTokenWithAmount> listFARcdN = investDetailsAndGasFee.fARcdN();
        InvestTokenWithAmount investTokenWithAmountFIwbmz = investDetailsAndGasFee.fIwbmz();
        InvestTokenWithAmount investTokenWithAmountDjBIcL = ixb.djBIcL();
        return list.add(icb.EZpvd(transactionConfig, strFetchVPNInfo, strValues, value, listValues, listHDKMBd, listFARcdN, investTokenWithAmountFIwbmz, investTokenWithAmountDjBIcL == null ? new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmountDjBIcL, investDetailsAndGasFee.iwGUEr(), 1));
    }

    public final void OLrzqt(java.util.List<InterfaceC24178iXu> list, InitialInfoModel.InvestInitialInfo investInitialInfo, iXB ixb, InvestDetailsAndGasFee investDetailsAndGasFee) {
        java.lang.String strAEQbTJ = ixb.AEQbTJ();
        InvestSlippageConfig investSlippage = investDetailsAndGasFee.gEmmrt().getInvestSlippage();
        java.lang.String automaticValue = investSlippage != null ? investSlippage.getAutomaticValue() : null;
        if (automaticValue == null) {
            automaticValue = "";
        }
        if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
            strAEQbTJ = automaticValue;
        }
        list.add(iCB.EZpvd.EZpvd(investInitialInfo.isConnected(), investInitialInfo.AkhnZx(), C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ) ? pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) strAEQbTJ), null, C38307pTy.Companion.KWHzl(0, 2), null, java.lang.Double.valueOf(100.0d), null, 21, null) : "", C27505jwU.OLrzqt(investDetailsAndGasFee.gEmmrt()), (16 & 16) != 0 ? "" : null, false, (16 & 64) != 0 ? null : null));
    }

    public final void EZpvd(java.util.List<InterfaceC24178iXu> list, InitialInfoModel.InvestInitialInfo investInitialInfo) {
        if (investInitialInfo.AhwBna() == InvestType.Pos && C33129mqd.OLrzqt((java.lang.CharSequence) investInitialInfo.AubY())) {
            list.add(iCB.EZpvd.djBIcL(investInitialInfo.AubY()));
        }
    }

    public final void OLrzqt(java.util.List<InterfaceC24178iXu> list, iXB ixb, InvestDetailsAndGasFee investDetailsAndGasFee) {
        java.lang.String gasPrice;
        InvestNetworkFeeItem investNetworkFeeItemValueOf = ixb.valueOf();
        if (investNetworkFeeItemValueOf == null || (gasPrice = investNetworkFeeItemValueOf.getGasPrice()) == null) {
            gasPrice = investDetailsAndGasFee.gEmmrt().getAverageGear().getGasPrice();
        }
        list.add(iCB.EZpvd.AYXKKw(gasPrice + " " + investDetailsAndGasFee.gEmmrt().getNetworkFee().getGasPriceUnit()));
    }

    public final void KWHzl(java.util.List<InterfaceC24178iXu> list, InvestDetailsAndGasFee investDetailsAndGasFee) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) investDetailsAndGasFee.valueOf())) {
            list.add(iCB.EZpvd.copydefault(investDetailsAndGasFee.valueOf()));
        }
    }

    public final void AhwBna(java.util.List<InterfaceC24178iXu> list, InvestDetailsAndGasFee investDetailsAndGasFee) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) investDetailsAndGasFee.AkhnZx())) {
            list.add(iCB.EZpvd.AhwBna(investDetailsAndGasFee.AkhnZx()));
        }
    }

    public final void gEmmrt(java.util.List<InterfaceC24178iXu> list, InvestDetailsAndGasFee investDetailsAndGasFee) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) investDetailsAndGasFee.getNewProxyInstance().getNetworkFee())) {
            list.add(iCB.EZpvd.KWHzl(investDetailsAndGasFee.getNewProxyInstance()));
        }
    }

    public final void AYXKKw(java.util.List<InterfaceC24178iXu> list, InvestDetailsAndGasFee investDetailsAndGasFee) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) investDetailsAndGasFee.KWHzl())) {
            iCB icb = iCB.EZpvd;
            java.lang.String strKWHzl = investDetailsAndGasFee.KWHzl();
            if (strKWHzl == null || strKWHzl.length() == 0) {
                strKWHzl = "--";
            }
            list.add(icb.valueOf(strKWHzl));
        }
    }

    public final void copydefault(java.util.List<InterfaceC24178iXu> list, InvestDetailsAndGasFee investDetailsAndGasFee) {
        if (investDetailsAndGasFee.copydefault() != null) {
            iCB icb = iCB.EZpvd;
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            java.lang.String coinAmount = investDetailsAndGasFee.copydefault().getCoinAmount();
            if (coinAmount == null || coinAmount.length() == 0) {
                coinAmount = "0";
            }
            list.add(icb.KWHzl(C27492jwH.limitFmtNoZeroAndUpWithKMB$default(c27492jwH, coinAmount, 6, 2, false, 8, null) + " " + investDetailsAndGasFee.copydefault().getTokenSymbol()));
        }
    }

    public final void AEQbTJ(java.util.List<InterfaceC24178iXu> list, InvestDetailsAndGasFee investDetailsAndGasFee) {
        if (investDetailsAndGasFee.isConnected() != null) {
            iCB icb = iCB.EZpvd;
            java.lang.String oldHealthFactor = investDetailsAndGasFee.isConnected().getOldHealthFactor();
            java.lang.String str = "--";
            if (oldHealthFactor == null || oldHealthFactor.length() == 0) {
                oldHealthFactor = "--";
            }
            java.lang.String newHealthFactor = investDetailsAndGasFee.isConnected().getNewHealthFactor();
            if (newHealthFactor != null && newHealthFactor.length() != 0) {
                str = newHealthFactor;
            }
            list.add(icb.copydefault(oldHealthFactor, str, investDetailsAndGasFee.isConnected().getHealthLevel()));
        }
    }

    public final boolean EZpvd(java.util.List<InterfaceC24178iXu> list, TransactionConfig transactionConfig, InvestDetailsAndGasFee investDetailsAndGasFee, InitialInfoModel.InvestInitialInfo investInitialInfo) {
        iCB icb = iCB.EZpvd;
        int value = investInitialInfo.AhwBna().getValue();
        InvestTokenWithAmount investTokenWithAmountFIwbmz = investDetailsAndGasFee.fIwbmz();
        if (investTokenWithAmountFIwbmz == null) {
            investTokenWithAmountFIwbmz = investInitialInfo.fARcdN();
        }
        return list.add(iCB.getBorrowReceiveTokenInfoItem$default(icb, value, yDY.OLrzqt(investTokenWithAmountFIwbmz), false, false, 8, null));
    }

    public final void AEQbTJ(java.util.List<InterfaceC24178iXu> list, InitialInfoModel.InvestInitialInfo investInitialInfo, iXB ixb) {
        if (investInitialInfo.OLrzqt() == BTCMode.BABYLON) {
            iCB icb = iCB.EZpvd;
            InvestValidatorListItems investValidatorListItemsAYXKKw = ixb.AYXKKw();
            if (investValidatorListItemsAYXKKw == null) {
                investValidatorListItemsAYXKKw = investInitialInfo.getFieldNames();
            }
            java.lang.String validatorName = investValidatorListItemsAYXKKw != null ? investValidatorListItemsAYXKKw.getValidatorName() : null;
            if (validatorName == null) {
                validatorName = "";
            }
            list.add(icb.AEQbTJ(validatorName));
        }
    }

    public final void valueOf(java.util.List<InterfaceC24178iXu> list, InvestDetailsAndGasFee investDetailsAndGasFee) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) investDetailsAndGasFee.AhwBna())) {
            list.add(iCB.EZpvd.gEmmrt(investDetailsAndGasFee.AuCTel()));
        }
    }

    public final void EZpvd(java.util.List<InterfaceC24178iXu> list, InvestDetailsAndGasFee investDetailsAndGasFee) {
        java.util.List<InvestTipInfoVo> listDbNXlk = investDetailsAndGasFee.DbNXlk();
        if (listDbNXlk == null) {
            listDbNXlk = yDY.AhwBna();
        }
        java.util.Iterator<T> it = listDbNXlk.iterator();
        while (it.hasNext()) {
            list.add(iCB.EZpvd.AEQbTJ((InvestTipInfoVo) it.next()));
        }
    }
}
