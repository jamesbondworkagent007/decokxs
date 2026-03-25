package o;

import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.DexPairInfo;
import com.okinc.business.dex.trade.core.domain.model.DexRouter;
import com.okinc.business.dex.trade.core.domain.model.FeeInfo;
import com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo;
import com.okinc.business.dex.trade.core.domain.model.PriorityFee;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteInfo;
import com.okinc.business.dexlogic.bean.DexRouterList;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.OfflineQuote;
import com.okinc.business.dexlogic.bean.Permit2Data;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.SubRouter;
import com.okinc.business.dexlogic.bean.TraceData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gYM {
    public static V6QuoteResponseData OLrzqt;
    public static final gYM EZpvd = new gYM();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6QuoteResponseData EZpvd() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(V6QuoteResponseData v6QuoteResponseData) {
        OLrzqt = v6QuoteResponseData;
    }

    private gYM() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final QuotePriceRes AEQbTJ(V6QuoteResponseData v6QuoteResponseData) {
        DefiPlatformInfo defiPlatformInfo;
        AutoSlippageInfo autoSlippageInfo;
        java.lang.Object next;
        OLrzqt = v6QuoteResponseData;
        if (v6QuoteResponseData == null) {
            return new QuotePriceRes((java.util.List) null, (java.util.List) null, (java.lang.String) null, (CommonDexInfo) null, false, false, false, (java.lang.String) null, (TraceData) null, (SwapPriorityFeeInfo) null, (java.lang.String) null, (java.lang.String) null, 4095, (DefaultConstructorMarker) null);
        }
        java.util.List<DeFiPlatformForSwap> listEZpvd = EZpvd(v6QuoteResponseData.getDefiPlatformInfoList());
        CommonDexInfo commonDexInfoCopydefault = copydefault(v6QuoteResponseData);
        java.util.List<DefiPlatformInfo> defiPlatformInfoList = v6QuoteResponseData.getDefiPlatformInfoList();
        if (defiPlatformInfoList != null) {
            java.util.Iterator<T> it = defiPlatformInfoList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DefiPlatformInfo) next).getDefiPlatformId(), (java.lang.Object) v6QuoteResponseData.getSelectedDeFiPlatformId())) {
                    break;
                }
            }
            defiPlatformInfo = (DefiPlatformInfo) next;
            if (defiPlatformInfo == null) {
                java.util.List<DefiPlatformInfo> defiPlatformInfoList2 = v6QuoteResponseData.getDefiPlatformInfoList();
                defiPlatformInfo = defiPlatformInfoList2 != null ? (DefiPlatformInfo) CollectionsKt___CollectionsKt.firstOrNull(defiPlatformInfoList2) : null;
            }
        }
        QuotePriceRes quotePriceRes = new QuotePriceRes((java.util.List) listEZpvd, (java.util.List) null, "0", commonDexInfoCopydefault, true, false, false, (java.lang.String) null, new TraceData(defiPlatformInfo != null ? defiPlatformInfo.getQuoteId() : null, null, (defiPlatformInfo == null || (autoSlippageInfo = defiPlatformInfo.getAutoSlippageInfo()) == null) ? null : autoSlippageInfo.getReferenceSlippage()), AEQbTJ(v6QuoteResponseData.getNetworkFeeInfo()), (java.lang.String) null, (java.lang.String) null, 3298, (DefaultConstructorMarker) null);
        java.lang.String selectedDeFiPlatformId = v6QuoteResponseData.getSelectedDeFiPlatformId();
        if (selectedDeFiPlatformId == null) {
            selectedDeFiPlatformId = "";
        }
        quotePriceRes.setLocalSelectedDeFiPlatformId(selectedDeFiPlatformId);
        return quotePriceRes;
    }

    public final CommonDexInfo copydefault(V6QuoteResponseData v6QuoteResponseData) {
        DexMultiTokenInfoBean fromToken;
        DexMultiTokenInfoBean fromToken2;
        com.okinc.business.dex.trade.core.domain.model.CommonDexInfo commonDexInfo = v6QuoteResponseData.getCommonDexInfo();
        java.util.List<DefiPlatformInfo> defiPlatformInfoList = v6QuoteResponseData.getDefiPlatformInfoList();
        DefiPlatformInfo defiPlatformInfo = defiPlatformInfoList != null ? (DefiPlatformInfo) CollectionsKt___CollectionsKt.firstOrNull(defiPlatformInfoList) : null;
        java.lang.String estimateReserveGasTokenFee = commonDexInfo != null ? commonDexInfo.getEstimateReserveGasTokenFee() : null;
        java.lang.String str = estimateReserveGasTokenFee == null ? "" : estimateReserveGasTokenFee;
        int iIsHoneypot = 0;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf((commonDexInfo == null || (fromToken2 = commonDexInfo.getFromToken()) == null) ? 0 : fromToken2.isSafeMoonToken()));
        if (commonDexInfo != null && (fromToken = commonDexInfo.getFromToken()) != null) {
            iIsHoneypot = fromToken.isHoneypot();
        }
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(java.lang.Integer.valueOf(iIsHoneypot));
        java.lang.String code = commonDexInfo != null ? commonDexInfo.getCode() : null;
        java.lang.String str2 = code == null ? "" : code;
        java.lang.String errorMsg = commonDexInfo != null ? commonDexInfo.getErrorMsg() : null;
        java.lang.String str3 = errorMsg == null ? "" : errorMsg;
        java.lang.String fromPriceFluctuation = commonDexInfo != null ? commonDexInfo.getFromPriceFluctuation() : null;
        java.lang.String str4 = fromPriceFluctuation == null ? "" : fromPriceFluctuation;
        java.lang.String toPriceFluctuation = commonDexInfo != null ? commonDexInfo.getToPriceFluctuation() : null;
        java.lang.String str5 = toPriceFluctuation == null ? "" : toPriceFluctuation;
        java.lang.String priceFluctuationThreshold = commonDexInfo != null ? commonDexInfo.getPriceFluctuationThreshold() : null;
        java.lang.String str6 = priceFluctuationThreshold == null ? "" : priceFluctuationThreshold;
        java.lang.String priceFluctuationMonitorTime = commonDexInfo != null ? commonDexInfo.getPriceFluctuationMonitorTime() : null;
        java.lang.String str7 = priceFluctuationMonitorTime == null ? "" : priceFluctuationMonitorTime;
        java.lang.String strIsSpecialSafeMoonToken = commonDexInfo != null ? commonDexInfo.isSpecialSafeMoonToken() : null;
        java.lang.String str8 = strIsSpecialSafeMoonToken == null ? "" : strIsSpecialSafeMoonToken;
        com.okinc.business.dex.trade.core.domain.model.CommonDexInfo commonDexInfo2 = v6QuoteResponseData.getCommonDexInfo();
        DexMultiTokenInfoBean fromToken3 = commonDexInfo2 != null ? commonDexInfo2.getFromToken() : null;
        com.okinc.business.dex.trade.core.domain.model.CommonDexInfo commonDexInfo3 = v6QuoteResponseData.getCommonDexInfo();
        DexMultiTokenInfoBean toToken = commonDexInfo3 != null ? commonDexInfo3.getToToken() : null;
        java.lang.String fromTokenValue = commonDexInfo != null ? commonDexInfo.getFromTokenValue() : null;
        java.lang.String str9 = fromTokenValue == null ? "" : fromTokenValue;
        java.lang.String fromTokenAmount = commonDexInfo != null ? commonDexInfo.getFromTokenAmount() : null;
        java.lang.String str10 = fromTokenAmount == null ? "" : fromTokenAmount;
        java.lang.String rateFluctuationThreshold = commonDexInfo != null ? commonDexInfo.getRateFluctuationThreshold() : null;
        java.lang.String str11 = rateFluctuationThreshold == null ? "" : rateFluctuationThreshold;
        java.lang.String rateFluctuation = commonDexInfo != null ? commonDexInfo.getRateFluctuation() : null;
        java.lang.String str12 = rateFluctuation == null ? "" : rateFluctuation;
        java.lang.String slippageFluctuationHold = commonDexInfo != null ? commonDexInfo.getSlippageFluctuationHold() : null;
        java.lang.String str13 = slippageFluctuationHold == null ? "" : slippageFluctuationHold;
        java.lang.String needApprove = defiPlatformInfo != null ? defiPlatformInfo.getNeedApprove() : null;
        java.lang.String str14 = needApprove == null ? "" : needApprove;
        java.lang.String strIsEnableMev = defiPlatformInfo != null ? defiPlatformInfo.isEnableMev() : null;
        java.lang.String str15 = strIsEnableMev == null ? "" : strIsEnableMev;
        java.lang.String nativeTokenUnitPriceUsd = commonDexInfo != null ? commonDexInfo.getNativeTokenUnitPriceUsd() : null;
        java.lang.String str16 = nativeTokenUnitPriceUsd == null ? "" : nativeTokenUnitPriceUsd;
        java.lang.String teeSignMarketRelTs = commonDexInfo != null ? commonDexInfo.getTeeSignMarketRelTs() : null;
        java.lang.String str17 = teeSignMarketRelTs == null ? "" : teeSignMarketRelTs;
        java.lang.String teeSignTpslRelTs = commonDexInfo != null ? commonDexInfo.getTeeSignTpslRelTs() : null;
        java.lang.String str18 = teeSignTpslRelTs == null ? "" : teeSignTpslRelTs;
        java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(defiPlatformInfo != null ? defiPlatformInfo.getMevUnstableShowLevel() : null);
        java.lang.String remainingQuota = commonDexInfo != null ? commonDexInfo.getRemainingQuota() : null;
        return new CommonDexInfo("", "", "", "", str, strGEmmrt, (java.lang.String) null, strGEmmrt2, "", str2, "", str3, str4, str5, str6, str7, str8, fromToken3, toToken, (com.okinc.business.dexlogic.bean.DefiPlatformInfo) null, str9, str10, "", str11, str12, str13, "", str15, str14, "", "", str16, str17, str18, strGEmmrt3, remainingQuota == null ? "" : remainingQuota, 64, 0, (DefaultConstructorMarker) null);
    }

    public final java.util.List<DeFiPlatformForSwap> EZpvd(java.util.List<DefiPlatformInfo> list) {
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam;
        Permit2Data permit2Data;
        ServiceFeeInfo serviceFeeInfo;
        if (list == null || list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (DefiPlatformInfo defiPlatformInfo : list) {
            java.lang.String defiPlatformId = defiPlatformInfo.getDefiPlatformId();
            java.lang.String str = defiPlatformId == null ? "" : defiPlatformId;
            java.lang.String name = defiPlatformInfo.getName();
            java.lang.String str2 = name == null ? "" : name;
            java.lang.String logo = defiPlatformInfo.getLogo();
            java.lang.String str3 = logo == null ? "" : logo;
            java.lang.String reducePercent = defiPlatformInfo.getReducePercent();
            java.lang.String str4 = reducePercent == null ? "" : reducePercent;
            java.lang.String warnPercent = defiPlatformInfo.getWarnPercent();
            java.lang.String str5 = warnPercent == null ? "" : warnPercent;
            java.lang.String minimumReceived = defiPlatformInfo.getMinimumReceived();
            java.lang.String str6 = minimumReceived == null ? "" : minimumReceived;
            java.lang.Integer offlineType = defiPlatformInfo.getOfflineType();
            int iIntValue = offlineType != null ? offlineType.intValue() : 0;
            AutoSlippageInfo autoSlippageInfo = defiPlatformInfo.getAutoSlippageInfo();
            if (autoSlippageInfo != null) {
                java.lang.String autoSlippage = autoSlippageInfo.getAutoSlippage();
                java.lang.String str7 = autoSlippage == null ? "" : autoSlippage;
                java.lang.String autoFromSlippage = autoSlippageInfo.getAutoFromSlippage();
                java.lang.String str8 = autoFromSlippage == null ? "" : autoFromSlippage;
                java.util.List<java.lang.String> shortcutFixSlippage = autoSlippageInfo.getShortcutFixSlippage();
                java.lang.Boolean supportMaxSlippage = autoSlippageInfo.getSupportMaxSlippage();
                boolean zBooleanValue = supportMaxSlippage != null ? supportMaxSlippage.booleanValue() : false;
                java.lang.String dynamicSlippageRangeMin = autoSlippageInfo.getDynamicSlippageRangeMin();
                java.lang.String str9 = dynamicSlippageRangeMin == null ? "" : dynamicSlippageRangeMin;
                java.lang.String dynamicSlippageRangeMax = autoSlippageInfo.getDynamicSlippageRangeMax();
                java.lang.String str10 = dynamicSlippageRangeMax == null ? "" : dynamicSlippageRangeMax;
                java.lang.String recommendSlippageRangeMin = autoSlippageInfo.getRecommendSlippageRangeMin();
                java.lang.String str11 = recommendSlippageRangeMin == null ? "" : recommendSlippageRangeMin;
                java.lang.String recommendSlippageRangeMax = autoSlippageInfo.getRecommendSlippageRangeMax();
                java.lang.String str12 = recommendSlippageRangeMax == null ? "" : recommendSlippageRangeMax;
                java.lang.String referenceSlippage = autoSlippageInfo.getReferenceSlippage();
                java.lang.String str13 = referenceSlippage == null ? "" : referenceSlippage;
                java.lang.String limitOrderDynamicSpecialSlippage = autoSlippageInfo.getLimitOrderDynamicSpecialSlippage();
                dexAutoSlippageInfoParam = new DexAutoSlippageInfoParam(str7, str8, (java.lang.String) null, (java.lang.String) null, shortcutFixSlippage, zBooleanValue, str9, str10, str11, str12, str13, limitOrderDynamicSpecialSlippage == null ? "" : limitOrderDynamicSpecialSlippage, 0, "", 12, (DefaultConstructorMarker) null);
            } else {
                dexAutoSlippageInfoParam = null;
            }
            OfflineQuote calldata = defiPlatformInfo.getCalldata();
            OfflineQuote offlineQuote = calldata != null ? new OfflineQuote(C33129mqd.valueOf(java.lang.Long.valueOf(calldata.getDeadline())), calldata.getQuote(), calldata.getUnsignedTx()) : null;
            com.okinc.business.dex.trade.core.domain.model.Permit2Data permit2Data2 = defiPlatformInfo.getPermit2Data();
            if (permit2Data2 != null) {
                java.lang.String unsignedTx = permit2Data2.getUnsignedTx();
                if (unsignedTx == null) {
                    unsignedTx = "";
                }
                permit2Data = new Permit2Data(unsignedTx);
            } else {
                permit2Data = null;
            }
            java.lang.String receiveAmount = defiPlatformInfo.getReceiveAmount();
            java.lang.String str14 = receiveAmount == null ? "" : receiveAmount;
            java.lang.String toTokenValue = defiPlatformInfo.getToTokenValue();
            java.lang.String str15 = toTokenValue == null ? "" : toTokenValue;
            java.util.List<DexRouterList> listCopydefault = EZpvd.copydefault(defiPlatformInfo.getDexRouterList(), defiPlatformInfo.getRouter());
            java.lang.String quoteNetWorkFeeOfMoney = defiPlatformInfo.getQuoteNetWorkFeeOfMoney();
            java.lang.String str16 = quoteNetWorkFeeOfMoney == null ? "" : quoteNetWorkFeeOfMoney;
            java.lang.String estimateGasFee = defiPlatformInfo.getEstimateGasFee();
            java.lang.String str17 = estimateGasFee == null ? "" : estimateGasFee;
            com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo serviceFeeInfo2 = defiPlatformInfo.getServiceFeeInfo();
            if (serviceFeeInfo2 != null) {
                java.lang.String serviceFeeUsd = serviceFeeInfo2.getServiceFeeUsd();
                java.lang.String str18 = serviceFeeUsd == null ? "" : serviceFeeUsd;
                java.lang.String originalServiceFeeRate = serviceFeeInfo2.getOriginalServiceFeeRate();
                java.lang.String str19 = originalServiceFeeRate == null ? "" : originalServiceFeeRate;
                java.lang.String discountedServiceFeeRate = serviceFeeInfo2.getDiscountedServiceFeeRate();
                java.lang.String str20 = discountedServiceFeeRate == null ? "" : discountedServiceFeeRate;
                java.lang.String discountedServiceFeeRate2 = serviceFeeInfo2.getDiscountedServiceFeeRate();
                java.lang.String str21 = discountedServiceFeeRate2 == null ? "" : discountedServiceFeeRate2;
                java.lang.String strIsChargeVersion = serviceFeeInfo2.isChargeVersion();
                java.lang.String str22 = strIsChargeVersion == null ? "" : strIsChargeVersion;
                java.lang.String strIsDisplayServiceFee = serviceFeeInfo2.isDisplayServiceFee();
                java.lang.String str23 = strIsDisplayServiceFee == null ? "" : strIsDisplayServiceFee;
                java.lang.String feeTokenAddress = serviceFeeInfo2.getFeeTokenAddress();
                java.lang.String str24 = feeTokenAddress == null ? "" : feeTokenAddress;
                java.lang.String faqUrl = serviceFeeInfo2.getFaqUrl();
                java.lang.String str25 = faqUrl == null ? "" : faqUrl;
                java.lang.String refCode = serviceFeeInfo2.getRefCode();
                java.lang.String str26 = refCode == null ? "" : refCode;
                java.lang.String referralCommissionRate = serviceFeeInfo2.getReferralCommissionRate();
                java.lang.String str27 = referralCommissionRate == null ? "" : referralCommissionRate;
                java.lang.String referralCommissionAddress = serviceFeeInfo2.getReferralCommissionAddress();
                serviceFeeInfo = new ServiceFeeInfo(str18, str19, str20, str21, "", str22, str23, str24, "", str25, str26, str27, referralCommissionAddress == null ? "" : referralCommissionAddress, false, "", "", "");
            } else {
                serviceFeeInfo = null;
            }
            java.lang.String quoteData = defiPlatformInfo.getQuoteData();
            arrayList.add(new DeFiPlatformForSwap(str, str2, str3, str14, (java.lang.String) null, str4, str5, str6, java.lang.Integer.valueOf(iIntValue), (java.lang.Integer) null, (java.lang.String) null, str15, listCopydefault, (java.lang.String) null, str16, str17, offlineQuote, dexAutoSlippageInfoParam, permit2Data, serviceFeeInfo, quoteData == null ? "" : quoteData, (java.lang.Integer) null, defiPlatformInfo.getQuoteId(), (java.lang.String) null, defiPlatformInfo.getShowValueDiffWarn(), defiPlatformInfo.getDiffValue(), defiPlatformInfo.getDiffPercent(), defiPlatformInfo.getQuoteDiffValThreshold(), defiPlatformInfo.getQuoteDiffPercentThreshold(), defiPlatformInfo.getNetworkFeeOfNativeToken(), defiPlatformInfo.getNeedApprove(), defiPlatformInfo.isEnableMev(), (java.lang.String) null, defiPlatformInfo.isHasSaving(), defiPlatformInfo.getSavingAmount(), defiPlatformInfo.getSavingValueUSD(), 10495504, 1, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    public final java.util.List<DexRouterList> copydefault(java.util.List<DexRouter> list, java.lang.String str) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (DexRouter dexRouter : list) {
            DexPairInfo dexPairInfo = dexRouter.getDexPairInfo();
            java.lang.String dexName = dexPairInfo != null ? dexPairInfo.getDexName() : null;
            java.lang.String str2 = dexName == null ? "" : dexName;
            java.lang.String okLinkUrl = dexPairInfo != null ? dexPairInfo.getOkLinkUrl() : null;
            java.lang.String str3 = okLinkUrl == null ? "" : okLinkUrl;
            java.lang.String poolAddress = dexPairInfo != null ? dexPairInfo.getPoolAddress() : null;
            java.lang.String str4 = poolAddress == null ? "" : poolAddress;
            java.lang.String percent = dexPairInfo != null ? dexPairInfo.getPercent() : null;
            java.lang.String str5 = percent == null ? "" : percent;
            java.lang.String fromIndex = dexRouter.getFromIndex();
            java.lang.String str6 = fromIndex == null ? "" : fromIndex;
            java.lang.String toIndex = dexRouter.getToIndex();
            java.lang.String str7 = toIndex == null ? "" : toIndex;
            java.lang.String dexName2 = dexPairInfo != null ? dexPairInfo.getDexName() : null;
            SubRouter subRouter = new SubRouter(yDY.copydefault(new DexQuoteInfo("", str2, "", "", str3, str4, str5, "", "", str6, str7, "", "", null, dexName2 == null ? "" : dexName2)), dexRouter.getFromToken(), dexRouter.getToToken());
            java.lang.String percent2 = dexRouter.getPercent();
            arrayList.add(new DexRouterList(percent2 == null ? "" : percent2, str == null ? "" : str, yDY.copydefault(subRouter), false, 0));
        }
        return arrayList;
    }

    public final SwapPriorityFeeInfo AEQbTJ(NetworkFeeInfo networkFeeInfo) {
        java.util.ArrayList arrayList;
        NonMevPriorityFeeInfo nonMevPriorityFeeInfo = null;
        if (networkFeeInfo == null) {
            return null;
        }
        java.util.List<PriorityFee> mev = networkFeeInfo.getMev();
        if (mev != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(mev, 10));
            for (PriorityFee priorityFee : mev) {
                FeeInfo base = priorityFee.getBase();
                java.lang.String fee = base != null ? base.getFee() : null;
                java.lang.String str = fee == null ? "" : fee;
                FeeInfo base2 = priorityFee.getBase();
                java.lang.String feeUsd = base2 != null ? base2.getFeeUsd() : null;
                java.lang.String str2 = feeUsd == null ? "" : feeUsd;
                FeeInfo fastPriority = priorityFee.getFastPriority();
                java.lang.String fee2 = fastPriority != null ? fastPriority.getFee() : null;
                java.lang.String str3 = fee2 == null ? "" : fee2;
                FeeInfo fastPriority2 = priorityFee.getFastPriority();
                java.lang.String feeUsd2 = fastPriority2 != null ? fastPriority2.getFeeUsd() : null;
                java.lang.String str4 = feeUsd2 == null ? "" : feeUsd2;
                FeeInfo marketPriority = priorityFee.getMarketPriority();
                java.lang.String fee3 = marketPriority != null ? marketPriority.getFee() : null;
                java.lang.String str5 = fee3 == null ? "" : fee3;
                FeeInfo marketPriority2 = priorityFee.getMarketPriority();
                java.lang.String feeUsd3 = marketPriority2 != null ? marketPriority2.getFeeUsd() : null;
                java.lang.String str6 = feeUsd3 == null ? "" : feeUsd3;
                FeeInfo turboPriority = priorityFee.getTurboPriority();
                java.lang.String fee4 = turboPriority != null ? turboPriority.getFee() : null;
                java.lang.String str7 = fee4 == null ? "" : fee4;
                FeeInfo turboPriority2 = priorityFee.getTurboPriority();
                java.lang.String feeUsd4 = turboPriority2 != null ? turboPriority2.getFeeUsd() : null;
                java.lang.String str8 = feeUsd4 == null ? "" : feeUsd4;
                FeeInfo fastPriority3 = priorityFee.getFastPriority();
                java.lang.String feeUsd5 = fastPriority3 != null ? fastPriority3.getFeeUsd() : null;
                java.lang.String str9 = feeUsd5 == null ? "" : feeUsd5;
                FeeInfo fastPriority4 = priorityFee.getFastPriority();
                java.lang.String fee5 = fastPriority4 != null ? fastPriority4.getFee() : null;
                java.lang.String str10 = fee5 == null ? "" : fee5;
                FeeInfo marketPriority3 = priorityFee.getMarketPriority();
                java.lang.String feeUsd6 = marketPriority3 != null ? marketPriority3.getFeeUsd() : null;
                java.lang.String str11 = feeUsd6 == null ? "" : feeUsd6;
                FeeInfo marketPriority4 = priorityFee.getMarketPriority();
                java.lang.String fee6 = marketPriority4 != null ? marketPriority4.getFee() : null;
                java.lang.String str12 = fee6 == null ? "" : fee6;
                FeeInfo turboPriority3 = priorityFee.getTurboPriority();
                java.lang.String feeUsd7 = turboPriority3 != null ? turboPriority3.getFeeUsd() : null;
                java.lang.String str13 = feeUsd7 == null ? "" : feeUsd7;
                FeeInfo turboPriority4 = priorityFee.getTurboPriority();
                java.lang.String fee7 = turboPriority4 != null ? turboPriority4.getFee() : null;
                java.lang.String str14 = fee7 == null ? "" : fee7;
                FeeInfo marketPriority5 = priorityFee.getMarketPriority();
                java.lang.String fee8 = marketPriority5 != null ? marketPriority5.getFee() : null;
                java.lang.String str15 = fee8 == null ? "" : fee8;
                FeeInfo fastPriority5 = priorityFee.getFastPriority();
                java.lang.String fee9 = fastPriority5 != null ? fastPriority5.getFee() : null;
                java.lang.String str16 = fee9 == null ? "" : fee9;
                FeeInfo turboPriority5 = priorityFee.getTurboPriority();
                java.lang.String fee10 = turboPriority5 != null ? turboPriority5.getFee() : null;
                java.lang.String str17 = fee10 == null ? "" : fee10;
                FeeInfo base3 = priorityFee.getBase();
                java.lang.String fee11 = base3 != null ? base3.getFee() : null;
                java.lang.String str18 = fee11 == null ? "" : fee11;
                java.lang.Boolean boolIsDefault = priorityFee.isDefault();
                boolean zBooleanValue = boolIsDefault != null ? boolIsDefault.booleanValue() : false;
                java.lang.String name = priorityFee.getName();
                arrayList.add(new MevInfoBean(str, str2, str3, str4, str9, str10, zBooleanValue, str5, str6, str11, str12, name == null ? "" : name, str7, str8, str13, str14, str15, str16, str17, str18));
            }
        } else {
            arrayList = null;
        }
        PriorityFee normal = networkFeeInfo.getNormal();
        if (normal != null) {
            FeeInfo base4 = normal.getBase();
            java.lang.String fee12 = base4 != null ? base4.getFee() : null;
            java.lang.String str19 = fee12 == null ? "" : fee12;
            FeeInfo base5 = normal.getBase();
            java.lang.String feeUsd8 = base5 != null ? base5.getFeeUsd() : null;
            java.lang.String str20 = feeUsd8 == null ? "" : feeUsd8;
            FeeInfo fastPriority6 = normal.getFastPriority();
            java.lang.String fee13 = fastPriority6 != null ? fastPriority6.getFee() : null;
            java.lang.String str21 = fee13 == null ? "" : fee13;
            FeeInfo fastPriority7 = normal.getFastPriority();
            java.lang.String feeUsd9 = fastPriority7 != null ? fastPriority7.getFeeUsd() : null;
            java.lang.String str22 = feeUsd9 == null ? "" : feeUsd9;
            FeeInfo marketPriority6 = normal.getMarketPriority();
            java.lang.String fee14 = marketPriority6 != null ? marketPriority6.getFee() : null;
            java.lang.String str23 = fee14 == null ? "" : fee14;
            FeeInfo marketPriority7 = normal.getMarketPriority();
            java.lang.String feeUsd10 = marketPriority7 != null ? marketPriority7.getFeeUsd() : null;
            java.lang.String str24 = feeUsd10 == null ? "" : feeUsd10;
            FeeInfo turboPriority6 = normal.getTurboPriority();
            java.lang.String fee15 = turboPriority6 != null ? turboPriority6.getFee() : null;
            java.lang.String str25 = fee15 == null ? "" : fee15;
            FeeInfo turboPriority7 = normal.getTurboPriority();
            java.lang.String feeUsd11 = turboPriority7 != null ? turboPriority7.getFeeUsd() : null;
            java.lang.String str26 = feeUsd11 == null ? "" : feeUsd11;
            FeeInfo fastPriority8 = normal.getFastPriority();
            java.lang.String feeUsd12 = fastPriority8 != null ? fastPriority8.getFeeUsd() : null;
            java.lang.String str27 = feeUsd12 == null ? "" : feeUsd12;
            FeeInfo fastPriority9 = normal.getFastPriority();
            java.lang.String fee16 = fastPriority9 != null ? fastPriority9.getFee() : null;
            java.lang.String str28 = fee16 == null ? "" : fee16;
            FeeInfo marketPriority8 = normal.getMarketPriority();
            java.lang.String feeUsd13 = marketPriority8 != null ? marketPriority8.getFeeUsd() : null;
            java.lang.String str29 = feeUsd13 == null ? "" : feeUsd13;
            FeeInfo marketPriority9 = normal.getMarketPriority();
            java.lang.String fee17 = marketPriority9 != null ? marketPriority9.getFee() : null;
            java.lang.String str30 = fee17 == null ? "" : fee17;
            FeeInfo turboPriority8 = normal.getTurboPriority();
            java.lang.String feeUsd14 = turboPriority8 != null ? turboPriority8.getFeeUsd() : null;
            java.lang.String str31 = feeUsd14 == null ? "" : feeUsd14;
            FeeInfo turboPriority9 = normal.getTurboPriority();
            java.lang.String fee18 = turboPriority9 != null ? turboPriority9.getFee() : null;
            java.lang.String str32 = fee18 == null ? "" : fee18;
            FeeInfo marketPriority10 = normal.getMarketPriority();
            java.lang.String fee19 = marketPriority10 != null ? marketPriority10.getFee() : null;
            java.lang.String str33 = fee19 == null ? "" : fee19;
            FeeInfo fastPriority10 = normal.getFastPriority();
            java.lang.String fee20 = fastPriority10 != null ? fastPriority10.getFee() : null;
            java.lang.String str34 = fee20 == null ? "" : fee20;
            FeeInfo turboPriority10 = normal.getTurboPriority();
            java.lang.String fee21 = turboPriority10 != null ? turboPriority10.getFee() : null;
            java.lang.String str35 = fee21 == null ? "" : fee21;
            FeeInfo base6 = normal.getBase();
            java.lang.String fee22 = base6 != null ? base6.getFee() : null;
            nonMevPriorityFeeInfo = new NonMevPriorityFeeInfo(str19, str20, str21, str22, str27, str28, str23, str24, str29, str30, str25, str26, str31, str32, str33, str34, str35, fee22 == null ? "" : fee22);
        }
        java.lang.String min = networkFeeInfo.getMin();
        if (min == null) {
            min = "";
        }
        java.lang.String max = networkFeeInfo.getMax();
        return new SwapPriorityFeeInfo(arrayList, nonMevPriorityFeeInfo, min, max != null ? max : "");
    }
}
