package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.FromToken;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.ExpectTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.bean.response.TransactionStepTokenInfo;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iCG {
    public static final iCG copydefault = new iCG();

    private iCG() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9 A[LOOP:0: B:21:0x00f3->B:23:0x00f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InvestTxModel EZpvd(@NotNull TransactionStep transactionStep, InterfaceC9738bbJ interfaceC9738bbJ, @NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.InvestInitialInfo investInitialInfo, @NotNull InvestDetailsAndGasFee investDetailsAndGasFee, @NotNull InvestGasPriceConfig investGasPriceConfig, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        java.lang.String strDbNXlk;
        java.lang.String str7;
        java.util.List listAhwBna;
        InvestTradeManager investTradeManager;
        int i;
        java.lang.String str8;
        java.util.ArrayList arrayList;
        java.util.List listEZpvd;
        java.util.Iterator it;
        java.lang.Object next;
        java.lang.String str9;
        java.lang.String strOLrzqt;
        java.util.ArrayList arrayList2;
        BTCMode bTCMode;
        java.util.Iterator it2;
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(transactionStep, "");
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(investInitialInfo, "");
        Intrinsics.checkNotNullParameter(investDetailsAndGasFee, "");
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int iValueOf = transactionStep.valueOf();
        if (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        java.lang.String str10 = (interfaceC9738bbJ == null || (strEZpvd = interfaceC9738bbJ.EZpvd(transactionConfig.copydefault())) == null) ? "" : strEZpvd;
        java.util.List listEZpvd2 = C56402yEa.EZpvd(java.lang.Long.valueOf(transactionConfig.isConnected()));
        long jCopydefault = transactionConfig.copydefault();
        java.lang.String strAEQbTJ = C27491jwG.AEQbTJ(investDetailsAndGasFee.values(), new Function1() { // from class: o.iCJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iCG.KWHzl((InvestTokenWithAmount) obj);
            }
        });
        InvestTokenWithAmount investTokenWithAmountFIwbmz = investDetailsAndGasFee.fIwbmz();
        if (investTokenWithAmountFIwbmz != null) {
            InvestTokenWithAmount investTokenWithAmountCopy = investTokenWithAmountFIwbmz.copy((268435455 & 1) != 0 ? investTokenWithAmountFIwbmz.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmountFIwbmz.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmountFIwbmz.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmountFIwbmz.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmountFIwbmz.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmountFIwbmz.network : null, (268435455 & 64) != 0 ? investTokenWithAmountFIwbmz.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmountFIwbmz.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmountFIwbmz.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmountFIwbmz.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmountFIwbmz.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmountFIwbmz.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmountFIwbmz.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmountFIwbmz.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmountFIwbmz.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmountFIwbmz.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmountFIwbmz.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmountFIwbmz.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmountFIwbmz.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmountFIwbmz.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmountFIwbmz.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmountFIwbmz.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmountFIwbmz.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmountFIwbmz.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmountFIwbmz.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmountFIwbmz.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmountFIwbmz.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmountFIwbmz.tokenPrice : null);
            str7 = strAEQbTJ;
            investTokenWithAmountCopy.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy.getTokenPrecision()))), null, null, null, 14, null));
            listAhwBna = C56402yEa.EZpvd(investTokenWithAmountCopy);
            if (listAhwBna == null) {
            }
            java.util.List list = listAhwBna;
            java.util.List<InvestTokenWithAmount> listHDKMBd = investDetailsAndGasFee.hDKMBd();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listHDKMBd, 10));
            for (InvestTokenWithAmount investTokenWithAmount : listHDKMBd) {
                InvestTokenWithAmount investTokenWithAmountCopy2 = investTokenWithAmount.copy((268435455 & 1) != 0 ? investTokenWithAmount.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount.network : null, (268435455 & 64) != 0 ? investTokenWithAmount.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount.tokenPrice : null);
                investTokenWithAmountCopy2.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy2.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy2.getTokenPrecision()))), null, null, null, 14, null));
                arrayList3.add(investTokenWithAmountCopy2);
                str10 = str10;
                listEZpvd2 = listEZpvd2;
            }
            java.lang.String str11 = str10;
            java.util.List list2 = listEZpvd2;
            investTradeManager = InvestTradeManager.OLrzqt;
            if (!investTradeManager.AEQbTJ(transactionStep.valueOf())) {
                listEZpvd = C56402yEa.EZpvd(new InvestTokenWithAmount(transactionConfig.copydefault(), investTradeManager.KWHzl(transactionStep.AEQbTJ()) ? transactionStep.copydefault() : "", (java.lang.String) null, false, false, (java.lang.String) null, transactionStep.gEmmrt(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435388, (DefaultConstructorMarker) null));
                i = iValueOf;
                str8 = strDbNXlk;
                arrayList = arrayList3;
            } else {
                java.util.List<InvestTokenWithAmount> listValues = investDetailsAndGasFee.values();
                java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listValues, 10));
                java.util.Iterator it3 = listValues.iterator();
                while (it3.hasNext()) {
                    InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) it3.next();
                    InvestTokenWithAmount investTokenWithAmountCopy3 = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null);
                    java.util.ArrayList arrayList5 = arrayList3;
                    investTokenWithAmountCopy3.setChainId(transactionConfig.copydefault());
                    java.lang.String coinAmount = investTokenWithAmount2.getCoinAmount();
                    int i2 = iValueOf;
                    java.lang.String str12 = strDbNXlk;
                    investTokenWithAmountCopy3.setCoinAmount(C33129mqd.mulS$default(coinAmount, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy3.getTokenPrecision()))), null, null, null, 14, null));
                    java.util.Iterator<T> it4 = transactionStep.AkhnZx().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            it = it3;
                            next = null;
                            break;
                        }
                        next = it4.next();
                        it = it3;
                        if (C59449zhJ.gEmmrt(((TransactionStepTokenInfo) next).OLrzqt(), investTokenWithAmountCopy3.getTokenAddress(), true)) {
                            break;
                        }
                        it3 = it;
                    }
                    TransactionStepTokenInfo transactionStepTokenInfo = (TransactionStepTokenInfo) next;
                    investTokenWithAmountCopy3.setExpectTokenAddress(transactionStepTokenInfo != null ? transactionStepTokenInfo.EZpvd() : null);
                    arrayList4.add(investTokenWithAmountCopy3);
                    iValueOf = i2;
                    arrayList3 = arrayList5;
                    it3 = it;
                    strDbNXlk = str12;
                }
                i = iValueOf;
                str8 = strDbNXlk;
                arrayList = arrayList3;
                listEZpvd = arrayList4;
            }
            java.lang.String strOLrzqt2 = C27505jwU.OLrzqt(investGasPriceConfig, str2);
            java.lang.String estimateGasFee = investGasPriceConfig.getEstimateGasFee();
            if (transactionConfig.zLjUOn() && !transactionConfig.getNewProxyInstance()) {
                strOLrzqt = C27505jwU.KWHzl(investGasPriceConfig, str2);
            } else if (str6 != null) {
                strOLrzqt = C27505jwU.OLrzqt(investGasPriceConfig, str2);
            } else {
                str9 = str6;
                java.lang.String json = new Gson().toJson(EZpvd(transactionStep, investInitialInfo, investDetailsAndGasFee, transactionConfig));
                Intrinsics.checkNotNullExpressionValue(json, "");
                if (!InvestTradeManager.OLrzqt.AEQbTJ(transactionStep.valueOf()) || transactionConfig.getFieldNames()) {
                    arrayList2 = null;
                } else {
                    java.util.List<InvestTokenWithAmount> listValues2 = investDetailsAndGasFee.values();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(listValues2, 10));
                    it2 = listValues2.iterator();
                    while (it2.hasNext()) {
                        InvestTokenWithAmount investTokenWithAmount3 = (InvestTokenWithAmount) it2.next();
                        java.util.Iterator it5 = it2;
                        arrayList6.add(new FromToken(investTokenWithAmount3.isBaseToken(), investTokenWithAmount3.getTokenAddress(), C33129mqd.mulS$default(investTokenWithAmount3.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmount3.getTokenPrecision()))), null, null, null, 14, null), investTokenWithAmount3.getMinInvestAmount().length() == 0 ? "0" : C33129mqd.mulS$default(investTokenWithAmount3.getMinInvestAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmount3.getTokenPrecision()))), null, null, null, 14, null), investTokenWithAmount3.getTokenLogo(), C27492jwH.limitFmtNoZeroWithKMBMoreThanMillion$default(C27492jwH.OLrzqt, investTokenWithAmount3.getCoinAmount(), 6, 2, false, false, 24, null), investTokenWithAmount3.getTokenSymbol()));
                        it2 = it5;
                    }
                    arrayList2 = arrayList6;
                }
                java.lang.String strFetchVPNInfo = investInitialInfo.fetchVPNInfo();
                java.lang.String strValues = investInitialInfo.values();
                if (transactionConfig.zLjUOn()) {
                    bTCMode = BTCMode.DOT_SWAP;
                } else {
                    bTCMode = transactionConfig.getNewProxyInstance() ? BTCMode.BABYLON : BTCMode.DEFAULT;
                }
                BTCMode bTCMode2 = bTCMode;
                int iAEQbTJ = transactionStep.AEQbTJ();
                return new InvestTxModel(i, str8, str11, list2, (java.lang.Long) null, jCopydefault, str7, list, (java.util.List) arrayList, (java.util.List) null, listEZpvd, str2, strOLrzqt2, estimateGasFee, str9, str3, json, 0, false, (java.lang.Long) null, (java.lang.String) null, 0, (java.util.List) null, (java.lang.Integer) null, (java.util.List) null, (java.util.Map) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.List) arrayList2, java.lang.Integer.valueOf(iAEQbTJ), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str4, strFetchVPNInfo, strValues, bTCMode2, str5, investDetailsAndGasFee.ejfBZ(), false, false, (java.lang.String) null, (java.util.List) null, false, (java.lang.Long) null, 2147353104, 64526, (DefaultConstructorMarker) null);
            }
            str9 = strOLrzqt;
            java.lang.String json2 = new Gson().toJson(EZpvd(transactionStep, investInitialInfo, investDetailsAndGasFee, transactionConfig));
            Intrinsics.checkNotNullExpressionValue(json2, "");
            if (!InvestTradeManager.OLrzqt.AEQbTJ(transactionStep.valueOf())) {
                java.util.List<InvestTokenWithAmount> listValues22 = investDetailsAndGasFee.values();
                java.util.ArrayList arrayList62 = new java.util.ArrayList(C56403yEb.AYXKKw(listValues22, 10));
                it2 = listValues22.iterator();
                while (it2.hasNext()) {
                }
                arrayList2 = arrayList62;
            }
            java.lang.String strFetchVPNInfo2 = investInitialInfo.fetchVPNInfo();
            java.lang.String strValues2 = investInitialInfo.values();
            if (transactionConfig.zLjUOn()) {
            }
            BTCMode bTCMode22 = bTCMode;
            int iAEQbTJ2 = transactionStep.AEQbTJ();
            return new InvestTxModel(i, str8, str11, list2, (java.lang.Long) null, jCopydefault, str7, list, (java.util.List) arrayList, (java.util.List) null, listEZpvd, str2, strOLrzqt2, estimateGasFee, str9, str3, json2, 0, false, (java.lang.Long) null, (java.lang.String) null, 0, (java.util.List) null, (java.lang.Integer) null, (java.util.List) null, (java.util.Map) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.List) arrayList2, java.lang.Integer.valueOf(iAEQbTJ2), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str4, strFetchVPNInfo2, strValues2, bTCMode22, str5, investDetailsAndGasFee.ejfBZ(), false, false, (java.lang.String) null, (java.util.List) null, false, (java.lang.Long) null, 2147353104, 64526, (DefaultConstructorMarker) null);
        }
        str7 = strAEQbTJ;
        listAhwBna = yDY.AhwBna();
        java.util.List list3 = listAhwBna;
        java.util.List<InvestTokenWithAmount> listHDKMBd2 = investDetailsAndGasFee.hDKMBd();
        java.util.ArrayList arrayList32 = new java.util.ArrayList(C56403yEb.AYXKKw(listHDKMBd2, 10));
        while (r1.hasNext()) {
        }
        java.lang.String str112 = str10;
        java.util.List list22 = listEZpvd2;
        investTradeManager = InvestTradeManager.OLrzqt;
        if (!investTradeManager.AEQbTJ(transactionStep.valueOf())) {
        }
        java.lang.String strOLrzqt22 = C27505jwU.OLrzqt(investGasPriceConfig, str2);
        java.lang.String estimateGasFee2 = investGasPriceConfig.getEstimateGasFee();
        if (transactionConfig.zLjUOn()) {
            if (str6 != null) {
            }
        }
        java.lang.String json22 = new Gson().toJson(EZpvd(transactionStep, investInitialInfo, investDetailsAndGasFee, transactionConfig));
        Intrinsics.checkNotNullExpressionValue(json22, "");
        if (!InvestTradeManager.OLrzqt.AEQbTJ(transactionStep.valueOf())) {
        }
        java.lang.String strFetchVPNInfo22 = investInitialInfo.fetchVPNInfo();
        java.lang.String strValues22 = investInitialInfo.values();
        if (transactionConfig.zLjUOn()) {
        }
        BTCMode bTCMode222 = bTCMode;
        int iAEQbTJ22 = transactionStep.AEQbTJ();
        return new InvestTxModel(i, str8, str112, list22, (java.lang.Long) null, jCopydefault, str7, list3, (java.util.List) arrayList, (java.util.List) null, listEZpvd, str2, strOLrzqt22, estimateGasFee2, str9, str3, json22, 0, false, (java.lang.Long) null, (java.lang.String) null, 0, (java.util.List) null, (java.lang.Integer) null, (java.util.List) null, (java.util.Map) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.List) arrayList2, java.lang.Integer.valueOf(iAEQbTJ22), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str4, strFetchVPNInfo22, strValues22, bTCMode222, str5, investDetailsAndGasFee.ejfBZ(), false, false, (java.lang.String) null, (java.util.List) null, false, (java.lang.Long) null, 2147353104, 64526, (DefaultConstructorMarker) null);
    }

    public static final java.lang.String KWHzl(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getCurrencyAmount();
    }

    public final InvestTransactionParam EZpvd(TransactionStep transactionStep, InitialInfoModel.InvestInitialInfo investInitialInfo, InvestDetailsAndGasFee investDetailsAndGasFee, TransactionConfig transactionConfig) {
        java.util.ArrayList arrayList;
        java.util.List listEZpvd = C56402yEa.EZpvd(java.lang.Long.valueOf(transactionConfig.isConnected()));
        int size = investDetailsAndGasFee.values().size();
        if (size == 1) {
            java.util.List<InvestTokenWithAmount> listValues = investDetailsAndGasFee.values();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listValues, 10));
            for (InvestTokenWithAmount investTokenWithAmount : listValues) {
                java.lang.String coinAmount = investTokenWithAmount.getCoinAmount();
                java.lang.String tokenAddress = investTokenWithAmount.getTokenAddress();
                java.lang.String strGEmmrt = transactionStep.gEmmrt();
                arrayList2.add(new InvestInputData(coinAmount, tokenAddress, strGEmmrt.length() == 0 ? null : strGEmmrt, false, false, 24, (DefaultConstructorMarker) null));
            }
            arrayList = arrayList2;
        } else if (size != 2) {
            arrayList = null;
        } else {
            java.util.List<InvestTokenWithAmount> listValues2 = investDetailsAndGasFee.values();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listValues2, 10));
            for (InvestTokenWithAmount investTokenWithAmount2 : listValues2) {
                arrayList3.add(new InvestInputData(investTokenWithAmount2.getCoinAmount(), investTokenWithAmount2.getTokenAddress(), transactionStep.gEmmrt(), false, false, 24, (DefaultConstructorMarker) null));
            }
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList3) {
                java.lang.String tokenAddress2 = ((InvestInputData) obj).getTokenAddress();
                java.lang.String strGEmmrt2 = transactionStep.gEmmrt();
                if (strGEmmrt2.length() == 0) {
                    strGEmmrt2 = null;
                }
                if (C59449zhJ.gEmmrt(tokenAddress2, strGEmmrt2, true)) {
                    arrayList.add(obj);
                }
            }
        }
        long jAEQbTJ = investInitialInfo.AEQbTJ();
        int value = investInitialInfo.AhwBna().getValue();
        long jCopydefault = transactionConfig.copydefault();
        boolean zAwvSrB = transactionConfig.AwvSrB();
        java.util.List<TransactionStep> fieldNames = investDetailsAndGasFee.getFieldNames();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : fieldNames) {
            if (InvestTradeManager.OLrzqt.AEQbTJ(((TransactionStep) obj2).valueOf())) {
                arrayList4.add(obj2);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList4) {
            if (((TransactionStep) obj3).fetchVPNInfo()) {
                arrayList5.add(obj3);
            }
        }
        return new InvestTransactionParam(arrayList, zAwvSrB, C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList5.size()), 1), jCopydefault, java.lang.Integer.valueOf(value), java.lang.Long.valueOf(jAEQbTJ), (java.lang.String) null, listEZpvd, java.lang.Long.valueOf(transactionConfig.DbNXlk()), (java.lang.Integer) null, (java.lang.String) null, transactionConfig.zLjUOn() ? 1 : null, (java.lang.Integer) null, (InvestPoolV3) null, (java.lang.Integer) null, transactionConfig.hDKMBd(), 30272, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InvestTxModel copydefault(@NotNull TransactionStep transactionStep, InterfaceC9738bbJ interfaceC9738bbJ, @NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull RedeemDetailsAndGasFee redeemDetailsAndGasFee, @NotNull InvestGasPriceConfig investGasPriceConfig, iXB ixb, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.util.ArrayList arrayList;
        java.util.List listAhwBna;
        java.util.List listEZpvd;
        java.lang.String str6;
        java.lang.String strOLrzqt;
        java.lang.String strEZpvd;
        java.lang.String strDbNXlk;
        Intrinsics.checkNotNullParameter(transactionStep, "");
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(redeemDetailsAndGasFee, "");
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zAEQbTJ = InvestTradeManager.OLrzqt.AEQbTJ(transactionStep.valueOf());
        int iValueOf = transactionStep.valueOf();
        java.lang.String str7 = (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) ? "" : strDbNXlk;
        java.lang.String str8 = (interfaceC9738bbJ == null || (strEZpvd = interfaceC9738bbJ.EZpvd(transactionConfig.copydefault())) == null) ? "" : strEZpvd;
        java.util.List listEZpvd2 = C56402yEa.EZpvd(java.lang.Long.valueOf(transactionConfig.isConnected()));
        long jCopydefault = transactionConfig.copydefault();
        java.util.List<InvestTokenWithAmount> listAuCTel = redeemDetailsAndGasFee.AuCTel();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAuCTel, 10));
        for (InvestTokenWithAmount investTokenWithAmount : listAuCTel) {
            InvestTokenWithAmount investTokenWithAmountCopy = investTokenWithAmount.copy((268435455 & 1) != 0 ? investTokenWithAmount.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount.network : null, (268435455 & 64) != 0 ? investTokenWithAmount.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount.tokenPrice : null);
            investTokenWithAmountCopy.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy.getTokenPrecision()))), null, null, null, 14, null));
            arrayList2.add(investTokenWithAmountCopy);
        }
        java.util.List<InvestTokenWithAmount> listAuCTel2 = redeemDetailsAndGasFee.AuCTel();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listAuCTel2, 10));
        for (InvestTokenWithAmount investTokenWithAmount2 : listAuCTel2) {
            InvestTokenWithAmount investTokenWithAmountCopy2 = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null);
            investTokenWithAmountCopy2.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy2.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy2.getTokenPrecision()))), null, null, null, 14, null));
            arrayList3.add(investTokenWithAmountCopy2);
            listEZpvd2 = listEZpvd2;
        }
        java.util.List list = listEZpvd2;
        if (zAEQbTJ) {
            listAhwBna = yDY.AhwBna();
            arrayList = arrayList3;
        } else {
            java.util.List<InvestTokenWithAmount> listEZpvd3 = redeemDetailsAndGasFee.EZpvd();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd3, 10));
            for (InvestTokenWithAmount investTokenWithAmount3 : listEZpvd3) {
                InvestTokenWithAmount investTokenWithAmountCopy3 = investTokenWithAmount3.copy((268435455 & 1) != 0 ? investTokenWithAmount3.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount3.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount3.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount3.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount3.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount3.network : null, (268435455 & 64) != 0 ? investTokenWithAmount3.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount3.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount3.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount3.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount3.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount3.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount3.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount3.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount3.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount3.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount3.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount3.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount3.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount3.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount3.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount3.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount3.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount3.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount3.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount3.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount3.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount3.tokenPrice : null);
                investTokenWithAmountCopy3.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy3.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy3.getTokenPrecision()))), null, null, null, 14, null));
                arrayList4.add(investTokenWithAmountCopy3);
                arrayList3 = arrayList3;
            }
            arrayList = arrayList3;
            listAhwBna = arrayList4;
        }
        if (zAEQbTJ) {
            java.util.List<TransactionStep> newProxyInstance = redeemDetailsAndGasFee.getNewProxyInstance();
            java.util.ArrayList<TransactionStep> arrayList5 = new java.util.ArrayList();
            for (java.lang.Object obj : newProxyInstance) {
                if (InvestTradeManager.OLrzqt.AEQbTJ(((TransactionStep) obj).valueOf())) {
                    arrayList5.add(obj);
                }
            }
            listEZpvd = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList5, 10));
            for (TransactionStep transactionStep2 : arrayList5) {
                TransactionStepTokenInfo transactionStepTokenInfo = (TransactionStepTokenInfo) CollectionsKt___CollectionsKt.firstOrNull(transactionStep2.AkhnZx());
                listEZpvd.add(new InvestTokenWithAmount(transactionStepTokenInfo != null ? transactionStepTokenInfo.copydefault() : transactionConfig.copydefault(), (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, transactionStep2.gEmmrt(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435390, (DefaultConstructorMarker) null));
            }
        } else {
            long jCopydefault2 = transactionConfig.copydefault();
            java.lang.String strAkhnZx = redeemDetailsAndGasFee.AkhnZx();
            listEZpvd = C56402yEa.EZpvd(new InvestTokenWithAmount(jCopydefault2, strAkhnZx == null ? "" : strAkhnZx, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, "--", (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268402684, (DefaultConstructorMarker) null));
        }
        java.util.List list2 = listEZpvd;
        java.lang.String strOLrzqt2 = C27505jwU.OLrzqt(investGasPriceConfig, str);
        java.lang.String estimateGasFee = investGasPriceConfig.getEstimateGasFee();
        if (!transactionConfig.zLjUOn() && !transactionConfig.getNewProxyInstance()) {
            strOLrzqt = C27505jwU.KWHzl(investGasPriceConfig, str);
        } else if (str3 == null) {
            strOLrzqt = C27505jwU.OLrzqt(investGasPriceConfig, str);
        } else {
            str6 = str3;
            Gson gson = new Gson();
            InvestTransactionParam.Companion companion = InvestTransactionParam.Companion;
            InvestInputData[] investInputDataArr = new InvestInputData[1];
            investInputDataArr[0] = new InvestInputData(ixb == null ? ixb.EZpvd() : null, (java.lang.String) null, (java.lang.String) null, false, false, 30, (DefaultConstructorMarker) null);
            java.util.ArrayList arrayList6 = arrayList;
            java.lang.String json = gson.toJson(InvestTransactionParam.Companion.instanceForUniV3Redeem$default(companion, transactionConfig.AEQbTJ((33554427 & 1) != 0 ? transactionConfig.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfig.iwGUEr : 0, (33554427 & 4) != 0 ? transactionConfig.values : 0L, (33554427 & 8) != 0 ? transactionConfig.AkhnZx : false, (33554427 & 16) != 0 ? transactionConfig.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfig.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfig.AuCTel : null, (33554427 & 128) != 0 ? transactionConfig.fARcdN : null, (33554427 & 256) != 0 ? transactionConfig.valueOf : yDY.copydefault(investInputDataArr), (33554427 & 512) != 0 ? transactionConfig.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfig.hDKMBd : null, (33554427 & 2048) != 0 ? transactionConfig.OLrzqt : 0L, (33554427 & 4096) != 0 ? transactionConfig.AhwBna : 0, (33554427 & 8192) != 0 ? transactionConfig.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfig.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfig.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfig.copydefault : null, (33554427 & 131072) != 0 ? transactionConfig.isConnected : null, (33554427 & 262144) != 0 ? transactionConfig.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfig.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfig.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfig.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfig.fetchVPNInfo : false, (33554427 & 8388608) != 0 ? transactionConfig.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfig.ejfBZ : null), str4 != null ? "" : str4, 0, 4, null));
            Intrinsics.checkNotNullExpressionValue(json, "");
            boolean zValues = transactionConfig.values();
            boolean zAwvSrB = transactionConfig.AwvSrB();
            java.lang.String strOLrzqt3 = transactionStep.OLrzqt();
            java.lang.String str9 = strOLrzqt3.length() != 0 ? null : strOLrzqt3;
            java.util.List<InvestTokenWithAmount> listAYXKKw = redeemDetailsAndGasFee.AYXKKw();
            java.lang.Boolean boolDbNXlk = redeemDetailsAndGasFee.DbNXlk();
            return new InvestTxModel(iValueOf, str7, str8, list, (java.lang.Long) null, jCopydefault, "0", (java.util.List) arrayList2, (java.util.List) arrayList6, listAhwBna, list2, str, strOLrzqt2, estimateGasFee, str6, str2, json, 0, false, (java.lang.Long) null, (java.lang.String) null, 0, (java.util.List) null, (java.lang.Integer) null, (java.util.List) null, (java.util.Map) null, (java.lang.String) null, str4, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.String) null, str9, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BTCMode) null, (java.lang.String) null, (java.lang.String) null, zValues, zAwvSrB, str5, (java.util.List) listAYXKKw, boolDbNXlk == null ? boolDbNXlk.booleanValue() : false, (java.lang.Long) null, -134348784, 33787, (DefaultConstructorMarker) null);
        }
        str6 = strOLrzqt;
        Gson gson2 = new Gson();
        InvestTransactionParam.Companion companion2 = InvestTransactionParam.Companion;
        InvestInputData[] investInputDataArr2 = new InvestInputData[1];
        investInputDataArr2[0] = new InvestInputData(ixb == null ? ixb.EZpvd() : null, (java.lang.String) null, (java.lang.String) null, false, false, 30, (DefaultConstructorMarker) null);
        java.util.ArrayList arrayList62 = arrayList;
        java.lang.String json2 = gson2.toJson(InvestTransactionParam.Companion.instanceForUniV3Redeem$default(companion2, transactionConfig.AEQbTJ((33554427 & 1) != 0 ? transactionConfig.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfig.iwGUEr : 0, (33554427 & 4) != 0 ? transactionConfig.values : 0L, (33554427 & 8) != 0 ? transactionConfig.AkhnZx : false, (33554427 & 16) != 0 ? transactionConfig.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfig.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfig.AuCTel : null, (33554427 & 128) != 0 ? transactionConfig.fARcdN : null, (33554427 & 256) != 0 ? transactionConfig.valueOf : yDY.copydefault(investInputDataArr2), (33554427 & 512) != 0 ? transactionConfig.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfig.hDKMBd : null, (33554427 & 2048) != 0 ? transactionConfig.OLrzqt : 0L, (33554427 & 4096) != 0 ? transactionConfig.AhwBna : 0, (33554427 & 8192) != 0 ? transactionConfig.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfig.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfig.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfig.copydefault : null, (33554427 & 131072) != 0 ? transactionConfig.isConnected : null, (33554427 & 262144) != 0 ? transactionConfig.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfig.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfig.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfig.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfig.fetchVPNInfo : false, (33554427 & 8388608) != 0 ? transactionConfig.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfig.ejfBZ : null), str4 != null ? "" : str4, 0, 4, null));
        Intrinsics.checkNotNullExpressionValue(json2, "");
        boolean zValues2 = transactionConfig.values();
        boolean zAwvSrB2 = transactionConfig.AwvSrB();
        java.lang.String strOLrzqt32 = transactionStep.OLrzqt();
        if (strOLrzqt32.length() != 0) {
        }
        java.util.List<InvestTokenWithAmount> listAYXKKw2 = redeemDetailsAndGasFee.AYXKKw();
        java.lang.Boolean boolDbNXlk2 = redeemDetailsAndGasFee.DbNXlk();
        return new InvestTxModel(iValueOf, str7, str8, list, (java.lang.Long) null, jCopydefault, "0", (java.util.List) arrayList2, (java.util.List) arrayList62, listAhwBna, list2, str, strOLrzqt2, estimateGasFee, str6, str2, json2, 0, false, (java.lang.Long) null, (java.lang.String) null, 0, (java.util.List) null, (java.lang.Integer) null, (java.util.List) null, (java.util.Map) null, (java.lang.String) null, str4, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.String) null, str9, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BTCMode) null, (java.lang.String) null, (java.lang.String) null, zValues2, zAwvSrB2, str5, (java.util.List) listAYXKKw2, boolDbNXlk2 == null ? boolDbNXlk2.booleanValue() : false, (java.lang.Long) null, -134348784, 33787, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x044e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InvestTxModel KWHzl(@NotNull TransactionStep transactionStep, InterfaceC9738bbJ interfaceC9738bbJ, @NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull RedeemDetailsAndGasFee redeemDetailsAndGasFee, @NotNull InvestGasPriceConfig investGasPriceConfig, iXB ixb, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String strDbNXlk;
        java.lang.String str6;
        double d;
        java.util.ArrayList arrayList;
        java.util.List list;
        java.lang.Object next;
        java.lang.Object next2;
        java.util.List listEZpvd;
        java.lang.String str7;
        java.lang.String strOLrzqt;
        java.lang.String plainString;
        BTCMode bTCModeOLrzqt;
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(transactionStep, "");
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(redeemDetailsAndGasFee, "");
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iValueOf = transactionStep.valueOf();
        if (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        java.lang.String str8 = (interfaceC9738bbJ == null || (strEZpvd = interfaceC9738bbJ.EZpvd(transactionConfig.copydefault())) == null) ? "" : strEZpvd;
        java.util.List listEZpvd2 = C56402yEa.EZpvd(java.lang.Long.valueOf(transactionConfig.isConnected()));
        long jCopydefault = transactionConfig.copydefault();
        java.lang.String strGEmmrt = redeemDetailsAndGasFee.gEmmrt();
        java.util.List<InvestTokenWithAmount> listAuCTel = redeemDetailsAndGasFee.AuCTel();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAuCTel, 10));
        java.util.Iterator<T> it = listAuCTel.iterator();
        while (true) {
            str6 = strGEmmrt;
            d = 10.0d;
            if (!it.hasNext()) {
                break;
            }
            InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) it.next();
            InvestTokenWithAmount investTokenWithAmountCopy = investTokenWithAmount.copy((268435455 & 1) != 0 ? investTokenWithAmount.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount.network : null, (268435455 & 64) != 0 ? investTokenWithAmount.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount.tokenPrice : null);
            investTokenWithAmountCopy.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy.getTokenPrecision()))), null, null, null, 14, null));
            arrayList2.add(investTokenWithAmountCopy);
            strGEmmrt = str6;
        }
        java.util.List<InvestTokenWithAmount> listAuCTel2 = redeemDetailsAndGasFee.AuCTel();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listAuCTel2, 10));
        for (InvestTokenWithAmount investTokenWithAmount2 : listAuCTel2) {
            InvestTokenWithAmount investTokenWithAmountCopy2 = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null);
            investTokenWithAmountCopy2.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy2.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy2.getTokenPrecision()))), null, null, null, 14, null));
            arrayList3.add(investTokenWithAmountCopy2);
        }
        if (InvestTradeManager.OLrzqt.AEQbTJ(transactionStep.valueOf())) {
            listEZpvd = C56402yEa.EZpvd(new InvestTokenWithAmount(transactionConfig.copydefault(), (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, transactionStep.gEmmrt(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435390, (DefaultConstructorMarker) null));
        } else {
            if (transactionConfig.zLjUOn() || transactionConfig.getNewProxyInstance()) {
                java.util.List<InvestTokenWithAmount> listAuCTel3 = redeemDetailsAndGasFee.AuCTel();
                java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listAuCTel3, 10));
                for (InvestTokenWithAmount investTokenWithAmount3 : listAuCTel3) {
                    InvestTokenWithAmount investTokenWithAmountCopy3 = investTokenWithAmount3.copy((268435455 & 1) != 0 ? investTokenWithAmount3.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount3.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount3.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount3.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount3.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount3.network : null, (268435455 & 64) != 0 ? investTokenWithAmount3.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount3.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount3.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount3.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount3.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount3.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount3.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount3.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount3.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount3.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount3.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount3.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount3.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount3.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount3.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount3.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount3.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount3.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount3.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount3.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount3.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount3.tokenPrice : null);
                    java.util.ArrayList arrayList5 = arrayList2;
                    investTokenWithAmountCopy3.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy3.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(d, C33129mqd.AEQbTJ(investTokenWithAmountCopy3.getTokenPrecision()))), null, null, null, 14, null));
                    investTokenWithAmountCopy3.setCurrencyAmount(investTokenWithAmount3.getCurrencyAmount());
                    java.util.Iterator<T> it2 = redeemDetailsAndGasFee.hDKMBd().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (C59449zhJ.gEmmrt(((ExpectTokenInfo) next).getTokenAddress(), investTokenWithAmountCopy3.getTokenAddress(), true)) {
                            break;
                        }
                    }
                    ExpectTokenInfo expectTokenInfo = (ExpectTokenInfo) next;
                    investTokenWithAmountCopy3.setExpectTokenAddress(expectTokenInfo != null ? expectTokenInfo.getExpectTokenAddress() : null);
                    arrayList4.add(investTokenWithAmountCopy3);
                    arrayList2 = arrayList5;
                    d = 10.0d;
                }
                arrayList = arrayList2;
                list = arrayList4;
                java.lang.String strOLrzqt2 = C27505jwU.OLrzqt(investGasPriceConfig, str);
                java.lang.String estimateGasFee = investGasPriceConfig.getEstimateGasFee();
                if (transactionConfig.zLjUOn() && !transactionConfig.getNewProxyInstance()) {
                    strOLrzqt = C27505jwU.KWHzl(investGasPriceConfig, str);
                } else if (str4 != null) {
                    strOLrzqt = C27505jwU.OLrzqt(investGasPriceConfig, str);
                } else {
                    str7 = str4;
                    java.lang.String str9 = (transactionConfig.zLjUOn() || transactionConfig.getNewProxyInstance()) ? str3 : null;
                    Gson gson = new Gson();
                    java.util.List listEZpvd3 = C56402yEa.EZpvd(java.lang.Long.valueOf(transactionConfig.isConnected()));
                    java.lang.String strEZpvd2 = ixb != null ? ixb.EZpvd() : null;
                    InvestTokenWithAmount investTokenWithAmount4 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(redeemDetailsAndGasFee.AuCTel());
                    java.lang.String json = gson.toJson(new InvestTransactionParam(C56402yEa.EZpvd(new InvestInputData(strEZpvd2, investTokenWithAmount4 != null ? investTokenWithAmount4.getTokenAddress() : null, transactionStep.gEmmrt(), false, ixb != null ? ixb.KWHzl() : false, 8, (DefaultConstructorMarker) null)), transactionConfig.AwvSrB(), false, redeemInitialInfo.copydefault(), java.lang.Integer.valueOf(redeemInitialInfo.fetchVPNInfo().getValue()), java.lang.Long.valueOf(redeemInitialInfo.AEQbTJ()), (java.lang.String) null, listEZpvd3, (java.lang.Long) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (InvestPoolV3) null, (java.lang.Integer) null, (java.lang.Boolean) null, 65348, (DefaultConstructorMarker) null));
                    Intrinsics.checkNotNullExpressionValue(json, "");
                    java.lang.String strEjfBZ = redeemInitialInfo.ejfBZ();
                    java.lang.String strAuCTel = redeemInitialInfo.AuCTel();
                    if (transactionConfig.zLjUOn()) {
                        plainString = C33129mqd.EZpvd(ixb != null ? ixb.EZpvd() : null).toPlainString();
                    } else {
                        plainString = null;
                    }
                    int i = (ixb == null || !ixb.KWHzl()) ? 0 : 1;
                    InvestOrder investOrderAhwBna = transactionConfig.AhwBna();
                    java.util.Map<java.lang.String, java.lang.String> redeemExtra = investOrderAhwBna != null ? investOrderAhwBna.getRedeemExtra() : null;
                    bTCModeOLrzqt = redeemInitialInfo.OLrzqt();
                    if (bTCModeOLrzqt == null) {
                        bTCModeOLrzqt = BTCMode.DEFAULT;
                    }
                    return new InvestTxModel(iValueOf, strDbNXlk, str8, listEZpvd2, (java.lang.Long) null, jCopydefault, str6, (java.util.List) arrayList, (java.util.List) arrayList3, (java.util.List) null, list, str, strOLrzqt2, estimateGasFee, str7, str2, json, i, false, (java.lang.Long) null, (java.lang.String) null, 0, (java.util.List) null, (java.lang.Integer) null, (java.util.List) null, (java.util.Map) redeemExtra, (java.lang.String) null, str5, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, plainString, str9, strEjfBZ, strAuCTel, bTCModeOLrzqt, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.util.List) null, false, (java.lang.Long) null, -168033776, 65287, (DefaultConstructorMarker) null);
                }
                str7 = strOLrzqt;
                if (transactionConfig.zLjUOn()) {
                }
                Gson gson2 = new Gson();
                java.util.List listEZpvd32 = C56402yEa.EZpvd(java.lang.Long.valueOf(transactionConfig.isConnected()));
                if (ixb != null) {
                }
                InvestTokenWithAmount investTokenWithAmount42 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(redeemDetailsAndGasFee.AuCTel());
                java.lang.String json2 = gson2.toJson(new InvestTransactionParam(C56402yEa.EZpvd(new InvestInputData(strEZpvd2, investTokenWithAmount42 != null ? investTokenWithAmount42.getTokenAddress() : null, transactionStep.gEmmrt(), false, ixb != null ? ixb.KWHzl() : false, 8, (DefaultConstructorMarker) null)), transactionConfig.AwvSrB(), false, redeemInitialInfo.copydefault(), java.lang.Integer.valueOf(redeemInitialInfo.fetchVPNInfo().getValue()), java.lang.Long.valueOf(redeemInitialInfo.AEQbTJ()), (java.lang.String) null, listEZpvd32, (java.lang.Long) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (InvestPoolV3) null, (java.lang.Integer) null, (java.lang.Boolean) null, 65348, (DefaultConstructorMarker) null));
                Intrinsics.checkNotNullExpressionValue(json2, "");
                java.lang.String strEjfBZ2 = redeemInitialInfo.ejfBZ();
                java.lang.String strAuCTel2 = redeemInitialInfo.AuCTel();
                if (transactionConfig.zLjUOn()) {
                }
                if (ixb == null) {
                }
                InvestOrder investOrderAhwBna2 = transactionConfig.AhwBna();
                if (investOrderAhwBna2 != null) {
                }
                bTCModeOLrzqt = redeemInitialInfo.OLrzqt();
                if (bTCModeOLrzqt == null) {
                }
                return new InvestTxModel(iValueOf, strDbNXlk, str8, listEZpvd2, (java.lang.Long) null, jCopydefault, str6, (java.util.List) arrayList, (java.util.List) arrayList3, (java.util.List) null, list, str, strOLrzqt2, estimateGasFee, str7, str2, json2, i, false, (java.lang.Long) null, (java.lang.String) null, 0, (java.util.List) null, (java.lang.Integer) null, (java.util.List) null, (java.util.Map) redeemExtra, (java.lang.String) null, str5, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, plainString, str9, strEjfBZ2, strAuCTel2, bTCModeOLrzqt, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.util.List) null, false, (java.lang.Long) null, -168033776, 65287, (DefaultConstructorMarker) null);
            }
            InvestTokenWithAmount investTokenWithAmountFetchVPNInfo = redeemDetailsAndGasFee.fetchVPNInfo();
            InvestTokenWithAmount investTokenWithAmountCopy4 = investTokenWithAmountFetchVPNInfo.copy((268435455 & 1) != 0 ? investTokenWithAmountFetchVPNInfo.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmountFetchVPNInfo.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmountFetchVPNInfo.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmountFetchVPNInfo.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmountFetchVPNInfo.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmountFetchVPNInfo.network : null, (268435455 & 64) != 0 ? investTokenWithAmountFetchVPNInfo.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmountFetchVPNInfo.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmountFetchVPNInfo.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmountFetchVPNInfo.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmountFetchVPNInfo.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmountFetchVPNInfo.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmountFetchVPNInfo.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmountFetchVPNInfo.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmountFetchVPNInfo.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmountFetchVPNInfo.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmountFetchVPNInfo.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmountFetchVPNInfo.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmountFetchVPNInfo.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmountFetchVPNInfo.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmountFetchVPNInfo.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmountFetchVPNInfo.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmountFetchVPNInfo.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmountFetchVPNInfo.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmountFetchVPNInfo.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmountFetchVPNInfo.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmountFetchVPNInfo.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmountFetchVPNInfo.tokenPrice : null);
            investTokenWithAmountCopy4.setCoinAmount(C33129mqd.mulS$default(ixb != null ? ixb.EZpvd() : null, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy4.getTokenPrecision()))), null, null, null, 14, null));
            investTokenWithAmountCopy4.setCurrencyAmount(redeemDetailsAndGasFee.gEmmrt());
            java.util.Iterator<T> it3 = redeemDetailsAndGasFee.hDKMBd().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                if (C59449zhJ.gEmmrt(((ExpectTokenInfo) next2).getTokenAddress(), investTokenWithAmountCopy4.getTokenAddress(), true)) {
                    break;
                }
            }
            ExpectTokenInfo expectTokenInfo2 = (ExpectTokenInfo) next2;
            investTokenWithAmountCopy4.setExpectTokenAddress(expectTokenInfo2 != null ? expectTokenInfo2.getExpectTokenAddress() : null);
            listEZpvd = C56402yEa.EZpvd(investTokenWithAmountCopy4);
        }
        list = listEZpvd;
        arrayList = arrayList2;
        java.lang.String strOLrzqt22 = C27505jwU.OLrzqt(investGasPriceConfig, str);
        java.lang.String estimateGasFee2 = investGasPriceConfig.getEstimateGasFee();
        if (transactionConfig.zLjUOn()) {
            if (str4 != null) {
            }
        }
        if (transactionConfig.zLjUOn()) {
        }
        Gson gson22 = new Gson();
        java.util.List listEZpvd322 = C56402yEa.EZpvd(java.lang.Long.valueOf(transactionConfig.isConnected()));
        if (ixb != null) {
        }
        InvestTokenWithAmount investTokenWithAmount422 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(redeemDetailsAndGasFee.AuCTel());
        java.lang.String json22 = gson22.toJson(new InvestTransactionParam(C56402yEa.EZpvd(new InvestInputData(strEZpvd2, investTokenWithAmount422 != null ? investTokenWithAmount422.getTokenAddress() : null, transactionStep.gEmmrt(), false, ixb != null ? ixb.KWHzl() : false, 8, (DefaultConstructorMarker) null)), transactionConfig.AwvSrB(), false, redeemInitialInfo.copydefault(), java.lang.Integer.valueOf(redeemInitialInfo.fetchVPNInfo().getValue()), java.lang.Long.valueOf(redeemInitialInfo.AEQbTJ()), (java.lang.String) null, listEZpvd322, (java.lang.Long) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (InvestPoolV3) null, (java.lang.Integer) null, (java.lang.Boolean) null, 65348, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullExpressionValue(json22, "");
        java.lang.String strEjfBZ22 = redeemInitialInfo.ejfBZ();
        java.lang.String strAuCTel22 = redeemInitialInfo.AuCTel();
        if (transactionConfig.zLjUOn()) {
        }
        if (ixb == null) {
        }
        InvestOrder investOrderAhwBna22 = transactionConfig.AhwBna();
        if (investOrderAhwBna22 != null) {
        }
        bTCModeOLrzqt = redeemInitialInfo.OLrzqt();
        if (bTCModeOLrzqt == null) {
        }
        return new InvestTxModel(iValueOf, strDbNXlk, str8, listEZpvd2, (java.lang.Long) null, jCopydefault, str6, (java.util.List) arrayList, (java.util.List) arrayList3, (java.util.List) null, list, str, strOLrzqt22, estimateGasFee2, str7, str2, json22, i, false, (java.lang.Long) null, (java.lang.String) null, 0, (java.util.List) null, (java.lang.Integer) null, (java.util.List) null, (java.util.Map) redeemExtra, (java.lang.String) null, str5, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, plainString, str9, strEjfBZ22, strAuCTel22, bTCModeOLrzqt, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.util.List) null, false, (java.lang.Long) null, -168033776, 65287, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009b A[PHI: r14
  0x009b: PHI (r14v1 double) = (r14v0 double), (r14v10 double) binds: [B:10:0x0036, B:12:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InvestTxModel KWHzl(@NotNull InvestTxModel investTxModel, @NotNull InvestDetailsAndGasFee investDetailsAndGasFee, @NotNull TransactionConfig transactionConfig) {
        java.lang.Object next;
        java.util.List listAhwBna;
        java.util.List listEZpvd;
        java.lang.String strEZpvd;
        java.util.List<TransactionStepTokenInfo> listAkhnZx;
        java.lang.Object next2;
        java.util.ArrayList arrayList;
        java.lang.String tokenAddress;
        java.lang.String str;
        Intrinsics.checkNotNullParameter(investTxModel, "");
        Intrinsics.checkNotNullParameter(investDetailsAndGasFee, "");
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        java.util.Iterator<T> it = investDetailsAndGasFee.getFieldNames().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((TransactionStep) next).fetchVPNInfo()) {
                break;
            }
        }
        TransactionStep transactionStep = (TransactionStep) next;
        InvestTokenWithAmount investTokenWithAmountFIwbmz = investDetailsAndGasFee.fIwbmz();
        double d = 10.0d;
        if (investTokenWithAmountFIwbmz != null) {
            InvestTokenWithAmount investTokenWithAmountCopy = investTokenWithAmountFIwbmz.copy((268435455 & 1) != 0 ? investTokenWithAmountFIwbmz.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmountFIwbmz.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmountFIwbmz.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmountFIwbmz.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmountFIwbmz.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmountFIwbmz.network : null, (268435455 & 64) != 0 ? investTokenWithAmountFIwbmz.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmountFIwbmz.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmountFIwbmz.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmountFIwbmz.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmountFIwbmz.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmountFIwbmz.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmountFIwbmz.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmountFIwbmz.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmountFIwbmz.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmountFIwbmz.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmountFIwbmz.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmountFIwbmz.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmountFIwbmz.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmountFIwbmz.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmountFIwbmz.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmountFIwbmz.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmountFIwbmz.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmountFIwbmz.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmountFIwbmz.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmountFIwbmz.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmountFIwbmz.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmountFIwbmz.tokenPrice : null);
            d = 10.0d;
            investTokenWithAmountCopy.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy.getTokenPrecision()))), null, null, null, 14, null));
            listAhwBna = C56402yEa.EZpvd(investTokenWithAmountCopy);
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
        }
        java.util.List list = listAhwBna;
        java.util.List<InvestTokenWithAmount> listHDKMBd = investDetailsAndGasFee.hDKMBd();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listHDKMBd, 10));
        for (InvestTokenWithAmount investTokenWithAmount : listHDKMBd) {
            InvestTokenWithAmount investTokenWithAmountCopy2 = investTokenWithAmount.copy((268435455 & 1) != 0 ? investTokenWithAmount.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount.network : null, (268435455 & 64) != 0 ? investTokenWithAmount.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount.tokenPrice : null);
            investTokenWithAmountCopy2.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy2.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(d, C33129mqd.AEQbTJ(investTokenWithAmountCopy2.getTokenPrecision()))), null, null, null, 14, null));
            arrayList2.add(investTokenWithAmountCopy2);
        }
        InvestTradeManager investTradeManager = InvestTradeManager.OLrzqt;
        if (investTradeManager.AEQbTJ(transactionStep != null ? transactionStep.valueOf() : InvestAction.Subscription.getValue())) {
            if (transactionStep == null || (tokenAddress = transactionStep.gEmmrt()) == null) {
                tokenAddress = ((InvestTokenWithAmount) CollectionsKt___CollectionsKt.AuCTelauCTel(investDetailsAndGasFee.values())).getTokenAddress();
            }
            java.lang.String str2 = tokenAddress;
            if (!investTradeManager.KWHzl(transactionStep != null ? transactionStep.AEQbTJ() : 0)) {
                str = "";
                listEZpvd = C56402yEa.EZpvd(new InvestTokenWithAmount(0L, str, (java.lang.String) null, false, false, (java.lang.String) null, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435389, (DefaultConstructorMarker) null));
            } else {
                java.lang.String strCopydefault = transactionStep != null ? transactionStep.copydefault() : null;
                if (strCopydefault != null) {
                    str = strCopydefault;
                }
                listEZpvd = C56402yEa.EZpvd(new InvestTokenWithAmount(0L, str, (java.lang.String) null, false, false, (java.lang.String) null, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435389, (DefaultConstructorMarker) null));
            }
        } else {
            java.util.List<InvestTokenWithAmount> listValues = investDetailsAndGasFee.values();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listValues, 10));
            for (InvestTokenWithAmount investTokenWithAmount2 : listValues) {
                InvestTokenWithAmount investTokenWithAmountCopy3 = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null);
                investTokenWithAmountCopy3.setChainId(transactionConfig.copydefault());
                investTokenWithAmountCopy3.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmount2.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(d, C33129mqd.AEQbTJ(investTokenWithAmountCopy3.getTokenPrecision()))), null, null, null, 14, null));
                if (transactionStep == null || (listAkhnZx = transactionStep.AkhnZx()) == null) {
                    strEZpvd = null;
                } else {
                    java.util.Iterator<T> it2 = listAkhnZx.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (C59449zhJ.gEmmrt(((TransactionStepTokenInfo) next2).OLrzqt(), investTokenWithAmountCopy3.getTokenAddress(), true)) {
                            break;
                        }
                    }
                    TransactionStepTokenInfo transactionStepTokenInfo = (TransactionStepTokenInfo) next2;
                    if (transactionStepTokenInfo != null) {
                        strEZpvd = transactionStepTokenInfo.EZpvd();
                    }
                }
                investTokenWithAmountCopy3.setExpectTokenAddress(strEZpvd);
                arrayList3.add(investTokenWithAmountCopy3);
                d = 10.0d;
            }
            listEZpvd = arrayList3;
        }
        if (InvestTradeManager.OLrzqt.AEQbTJ(transactionStep != null ? transactionStep.valueOf() : InvestAction.Subscription.getValue())) {
            arrayList = null;
        } else {
            java.util.List<InvestTokenWithAmount> listValues2 = investDetailsAndGasFee.values();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listValues2, 10));
            for (InvestTokenWithAmount investTokenWithAmount3 : listValues2) {
                arrayList4.add(new FromToken(investTokenWithAmount3.isBaseToken(), investTokenWithAmount3.getTokenAddress(), C33129mqd.mulS$default(investTokenWithAmount3.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmount3.getTokenPrecision()))), null, null, null, 14, null), investTokenWithAmount3.getMinInvestAmount().length() == 0 ? "0" : C33129mqd.mulS$default(investTokenWithAmount3.getMinInvestAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmount3.getTokenPrecision()))), null, null, null, 14, null), investTokenWithAmount3.getTokenLogo(), C27492jwH.limitFmtNoZeroWithKMBMoreThanMillion$default(C27492jwH.OLrzqt, investTokenWithAmount3.getCoinAmount(), 6, 2, false, false, 24, null), investTokenWithAmount3.getTokenSymbol()));
            }
            arrayList = arrayList4;
        }
        return investTxModel.copy(((-1) & 1) != 0 ? investTxModel.orderType : 0, ((-1) & 2) != 0 ? investTxModel.walletId : null, ((-1) & 4) != 0 ? investTxModel.address : null, ((-1) & 8) != 0 ? investTxModel.investmentId : null, ((-1) & 16) != 0 ? investTxModel.coinId : null, ((-1) & 32) != 0 ? investTxModel.chainId : 0L, ((-1) & 64) != 0 ? investTxModel.totalValue : null, ((-1) & 128) != 0 ? investTxModel.expectOutputList : list, ((-1) & 256) != 0 ? investTxModel.expectTokenList : arrayList2, ((-1) & 512) != 0 ? investTxModel.assetsList : null, ((-1) & 1024) != 0 ? investTxModel.userInputList : listEZpvd, ((-1) & 2048) != 0 ? investTxModel.gasRate : null, ((-1) & 4096) != 0 ? investTxModel.gasPrice : null, ((-1) & 8192) != 0 ? investTxModel.gasLimit : null, ((-1) & 16384) != 0 ? investTxModel.priorityFee : null, ((-1) & 32768) != 0 ? investTxModel.slipPoint : null, ((-1) & 65536) != 0 ? investTxModel.contextJson : null, ((-1) & 131072) != 0 ? investTxModel.redeemAll : 0, ((-1) & 262144) != 0 ? investTxModel.isAvailableClaim : false, ((-1) & 524288) != 0 ? investTxModel.analysisPlatformId : null, ((-1) & 1048576) != 0 ? investTxModel.platform : null, ((-1) & 2097152) != 0 ? investTxModel.drawableRes : 0, ((-1) & 4194304) != 0 ? investTxModel.claimIndex : null, ((-1) & 8388608) != 0 ? investTxModel.claimOverdue : null, ((-1) & 16777216) != 0 ? investTxModel.callDataExtJsonList : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTxModel.redeemExtra : null, ((-1) & 67108864) != 0 ? investTxModel.rewardingAddress : null, ((-1) & 134217728) != 0 ? investTxModel.tokenId : null, ((-1) & 268435456) != 0 ? investTxModel.callDataExtJson : null, ((-1) & 536870912) != 0 ? investTxModel.tickLower : null, ((-1) & 1073741824) != 0 ? investTxModel.tickUpper : null, ((-1) & Integer.MIN_VALUE) != 0 ? investTxModel.fromToken : arrayList, (32767 & 1) != 0 ? investTxModel.approveType : null, (32767 & 2) != 0 ? investTxModel.needApproveAmount : null, (32767 & 4) != 0 ? investTxModel.callDataExtraFromBE : null, (32767 & 8) != 0 ? investTxModel.redeemPercent : null, (32767 & 16) != 0 ? investTxModel.pubkey : null, (32767 & 32) != 0 ? investTxModel.platformName : null, (32767 & 64) != 0 ? investTxModel.platformLogo : null, (32767 & 128) != 0 ? investTxModel.btcMode : null, (32767 & 256) != 0 ? investTxModel.providerPubkey : null, (32767 & 512) != 0 ? investTxModel.subscribeCallDataExtInfo : null, (32767 & 1024) != 0 ? investTxModel.openZap : false, (32767 & 2048) != 0 ? investTxModel.isSingle : false, (32767 & 4096) != 0 ? investTxModel.swapSlipPoint : null, (32767 & 8192) != 0 ? investTxModel.feeEarning : null, (32767 & 16384) != 0 ? investTxModel.isOpenMEV : false, (32767 & 32768) != 0 ? investTxModel.stakeId : null);
    }
}
