package o;

import com.okinc.business.invest_biz.data.bean.BorrowedInfo;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.CollateralRatioInfo;
import com.okinc.business.invest_biz.data.bean.ExpectTokenInfo;
import com.okinc.business.invest_biz.data.bean.HeathFactorInfo;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.bean.PointInfo;
import com.okinc.business.invest_biz.data.bean.PointsInfo;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.bean.RemainingRepaymentInfo;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestType;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iCI {
    public static final InvestType KWHzl(int i) {
        InvestType next;
        java.util.Iterator<InvestType> it = InvestType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getValue() == i) {
                break;
            }
        }
        InvestType investType = next;
        return investType == null ? InvestType.Save : investType;
    }

    public static final TransactionMethod copydefault(java.lang.Integer num) {
        return (num != null && num.intValue() == 1) ? TransactionMethod.SINGLE : (num != null && num.intValue() == 2) ? TransactionMethod.MULTI : (num != null && num.intValue() == 3) ? TransactionMethod.BOTH : TransactionMethod.UNKNOWN;
    }

    public static final InitialInfoModel.InvestInitialInfo KWHzl(@NotNull InvestSubscriptionInfo investSubscriptionInfo) {
        java.util.List<PointInfo> listAhwBna;
        Intrinsics.checkNotNullParameter(investSubscriptionInfo, "");
        long chainId = investSubscriptionInfo.getChainId();
        InvestType investType = investSubscriptionInfo.getInvestType();
        long investmentId = investSubscriptionInfo.getInvestmentId();
        java.lang.String investmentName = investSubscriptionInfo.getInvestmentName();
        java.lang.Long analysisPlatformId = investSubscriptionInfo.getAnalysisPlatformId();
        long jLongValue = analysisPlatformId != null ? analysisPlatformId.longValue() : 0L;
        boolean zIsSupportSwap = investSubscriptionInfo.isSupportSwap();
        java.lang.String network = investSubscriptionInfo.getNetwork();
        java.lang.String networkLogo = investSubscriptionInfo.getNetworkLogo();
        java.lang.String platformLogo = investSubscriptionInfo.getPlatformLogo();
        java.lang.String platformName = investSubscriptionInfo.getPlatformName();
        java.util.List<InvestTokenWithAmount> gainsTokenList = investSubscriptionInfo.getGainsTokenList();
        java.util.List<InvestTokenWithAmount> investWithTokenList = investSubscriptionInfo.getInvestWithTokenList();
        InvestTokenWithAmount receiveTokenInfo = investSubscriptionInfo.getReceiveTokenInfo();
        java.lang.String reserveFee = investSubscriptionInfo.getReserveFee();
        long sourceInvestmentId = investSubscriptionInfo.getSourceInvestmentId();
        java.util.List<InvestTokenWithAmount> swapToTokenList = investSubscriptionInfo.getSwapToTokenList();
        TransactionMethod transactionMethodValueOf = TransactionMethod.valueOf(C33129mqd.gEmmrt(investSubscriptionInfo.getSubscriptionMethod()));
        boolean zIsLp = investSubscriptionInfo.isLp();
        java.lang.String lockRedeemTip = investSubscriptionInfo.getLockRedeemTip();
        PromptInformation promptInformation = investSubscriptionInfo.getPromptInformation();
        PromptInformation promptInformation2 = promptInformation == null ? new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null) : promptInformation;
        java.lang.Integer inputPrecision = investSubscriptionInfo.getInputPrecision();
        int iIntValue = inputPrecision != null ? inputPrecision.intValue() : -1;
        boolean zIsSingleValidator = investSubscriptionInfo.isSingleValidator();
        java.lang.String validatorName = investSubscriptionInfo.getValidatorName();
        java.lang.Integer mode = investSubscriptionInfo.getMode();
        int iIntValue2 = mode != null ? mode.intValue() : -1;
        CollateralRatioInfo collateralRatioInfo = investSubscriptionInfo.getCollateralRatioInfo();
        CollateralRatioInfo collateralRatioInfo2 = collateralRatioInfo == null ? new CollateralRatioInfo((java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null) : collateralRatioInfo;
        BTCMode btcMode = investSubscriptionInfo.getBtcMode();
        PointsInfo pointsInfo = investSubscriptionInfo.getPointsInfo();
        if (pointsInfo == null || (listAhwBna = pointsInfo.copydefault()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        return new InitialInfoModel.InvestInitialInfo(chainId, investType, investmentId, investmentName, jLongValue, zIsSupportSwap, network, networkLogo, platformLogo, platformName, investSubscriptionInfo.getRateDesc(), gainsTokenList, investWithTokenList, receiveTokenInfo, reserveFee, sourceInvestmentId, swapToTokenList, transactionMethodValueOf, zIsLp, lockRedeemTip, promptInformation2, iIntValue, zIsSingleValidator, validatorName, iIntValue2, collateralRatioInfo2, btcMode, (java.util.List) null, (InvestValidatorListItems) null, listAhwBna, investSubscriptionInfo.getTvl(), 402653184, (DefaultConstructorMarker) null);
    }

    public static final InitialInfoModel.RedeemInitialInfo OLrzqt(@NotNull InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo) {
        Intrinsics.checkNotNullParameter(investUniv3RedeemInitialInfo, "");
        java.lang.Long analysisPlatformId = investUniv3RedeemInitialInfo.getAnalysisPlatformId();
        long jLongValue = analysisPlatformId != null ? analysisPlatformId.longValue() : 0L;
        long chainId = investUniv3RedeemInitialInfo.getChainId();
        java.lang.String feeRate = investUniv3RedeemInitialInfo.getFeeRate();
        InvestType investTypeKWHzl = KWHzl(investUniv3RedeemInitialInfo.getInvestType());
        long investmentId = investUniv3RedeemInitialInfo.getInvestmentId();
        java.lang.String investmentName = investUniv3RedeemInitialInfo.getInvestmentName();
        boolean zIsSupportSwap = investUniv3RedeemInitialInfo.isSupportSwap();
        java.lang.String lowerPrice = investUniv3RedeemInitialInfo.getLowerPrice();
        InvestTokenWithAmount lpTokenInfo = investUniv3RedeemInitialInfo.getLpTokenInfo();
        if (lpTokenInfo == null) {
            lpTokenInfo = new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null);
        }
        InvestTokenWithAmount investTokenWithAmount = lpTokenInfo;
        java.lang.String network = investUniv3RedeemInitialInfo.getNetwork();
        java.lang.String networkLogo = investUniv3RedeemInitialInfo.getNetworkLogo();
        java.lang.String platformLogo = investUniv3RedeemInitialInfo.getPlatformLogo();
        java.lang.String platformName = investUniv3RedeemInitialInfo.getPlatformName();
        java.lang.String positionStatus = investUniv3RedeemInitialInfo.getPositionStatus();
        PromptInformation promptInformation = investUniv3RedeemInitialInfo.getPromptInformation();
        if (promptInformation == null) {
            promptInformation = new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null);
        }
        return new InitialInfoModel.RedeemInitialInfo(chainId, investTypeKWHzl, investmentId, investmentName, zIsSupportSwap, (InvestTokenWithAmount) null, network, networkLogo, platformLogo, platformName, (java.util.List) investUniv3RedeemInitialInfo.getReceiveTokenList(), copydefault(investUniv3RedeemInitialInfo.getRedeemMethod()), (java.util.List) investUniv3RedeemInitialInfo.getUnderlyingTokenList(), investTokenWithAmount, jLongValue, false, (java.lang.String) null, promptInformation, 0, false, (java.lang.String) null, (java.util.List) null, 0, false, (InvestTokenWithAmount) null, (CollateralRatioInfo) null, (java.lang.Integer) null, (BTCMode) null, (BorrowedInfo) null, (java.lang.String) null, (java.lang.String) null, feeRate, lowerPrice, positionStatus, investUniv3RedeemInitialInfo.getUpperPrice(), investUniv3RedeemInitialInfo.getSupportZap(), investUniv3RedeemInitialInfo.getRefreshTime(), investUniv3RedeemInitialInfo.getTokenId(), 2147319840, 0, (DefaultConstructorMarker) null);
    }

    public static final InitialInfoModel.RedeemInitialInfo KWHzl(@NotNull InvestRedeemInitialInfo investRedeemInitialInfo) {
        Intrinsics.checkNotNullParameter(investRedeemInitialInfo, "");
        long chainId = investRedeemInitialInfo.getChainId();
        InvestType investType = investRedeemInitialInfo.getInvestType();
        long investmentId = investRedeemInitialInfo.getInvestmentId();
        java.lang.String investmentName = investRedeemInitialInfo.getInvestmentName();
        boolean zIsSupportSwap = investRedeemInitialInfo.isSupportSwap();
        InvestTokenWithAmount mySupply = investRedeemInitialInfo.getMySupply();
        java.lang.String network = investRedeemInitialInfo.getNetwork();
        java.lang.String networkLogo = investRedeemInitialInfo.getNetworkLogo();
        java.lang.String platformName = investRedeemInitialInfo.getPlatformName();
        java.lang.String platformLogo = investRedeemInitialInfo.getPlatformLogo();
        java.util.List<InvestTokenWithAmount> receiveTokenList = investRedeemInitialInfo.getReceiveTokenList();
        TransactionMethod transactionMethodValueOf = TransactionMethod.valueOf(C33129mqd.gEmmrt(investRedeemInitialInfo.getRedeemMethod()));
        java.util.List<InvestTokenWithAmount> underlyingTokenList = investRedeemInitialInfo.getUnderlyingTokenList();
        InvestTokenWithAmount lpTokenInfo = investRedeemInitialInfo.getLpTokenInfo();
        InvestTokenWithAmount investTokenWithAmount = lpTokenInfo == null ? new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null) : lpTokenInfo;
        java.lang.Long analysisPlatformId = investRedeemInitialInfo.getAnalysisPlatformId();
        long jLongValue = analysisPlatformId != null ? analysisPlatformId.longValue() : 0L;
        boolean zIsSupportLock = investRedeemInitialInfo.isSupportLock();
        java.lang.String lockRedeemTip = investRedeemInitialInfo.getLockRedeemTip();
        PromptInformation promptInformation = investRedeemInitialInfo.getPromptInformation();
        PromptInformation promptInformation2 = promptInformation == null ? new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null) : promptInformation;
        java.lang.Integer inputPrecision = investRedeemInitialInfo.getInputPrecision();
        int iIntValue = inputPrecision != null ? inputPrecision.intValue() : 0;
        boolean zIsSingleValidator = investRedeemInitialInfo.isSingleValidator();
        java.lang.String validatorName = investRedeemInitialInfo.getValidatorName();
        java.util.List<InvestOrder> investOrderList = investRedeemInitialInfo.getInvestOrderList();
        java.lang.Integer mode = investRedeemInitialInfo.getMode();
        int iIntValue2 = mode != null ? mode.intValue() : -1;
        java.lang.Boolean disableInput = investRedeemInitialInfo.getDisableInput();
        boolean zBooleanValue = disableInput != null ? disableInput.booleanValue() : false;
        InvestTokenWithAmount remainingRepayment = investRedeemInitialInfo.getRemainingRepayment();
        InvestTokenWithAmount investTokenWithAmount2 = remainingRepayment == null ? new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null) : remainingRepayment;
        CollateralRatioInfo collateralRatioInfo = investRedeemInitialInfo.getCollateralRatioInfo();
        return new InitialInfoModel.RedeemInitialInfo(chainId, investType, investmentId, investmentName, zIsSupportSwap, mySupply, network, networkLogo, platformLogo, platformName, (java.util.List) receiveTokenList, transactionMethodValueOf, (java.util.List) underlyingTokenList, investTokenWithAmount, jLongValue, zIsSupportLock, lockRedeemTip, promptInformation2, iIntValue, zIsSingleValidator, validatorName, (java.util.List) investOrderList, iIntValue2, zBooleanValue, investTokenWithAmount2, collateralRatioInfo == null ? new CollateralRatioInfo((java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null) : collateralRatioInfo, investRedeemInitialInfo.getEstUnbondTime(), investRedeemInitialInfo.getBtcMode(), investRedeemInitialInfo.getBorrowed(), investRedeemInitialInfo.getReserveFee(), investRedeemInitialInfo.getTvl(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, Integer.MIN_VALUE, 63, (DefaultConstructorMarker) null);
    }

    public static final InvestDetailsAndGasFee AEQbTJ(@NotNull InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo, @NotNull InvestGasPriceConfig investGasPriceConfig) {
        java.util.List<PointInfo> listAhwBna;
        Intrinsics.checkNotNullParameter(investSubscriptionReceiveInfo, "");
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        InvestGasPriceConfig investGasPriceConfigCopy$default = InvestGasPriceConfig.copy$default(investGasPriceConfig, null, null, investSubscriptionReceiveInfo.getEstimateGasFee(), null, 11, null);
        java.util.List<InvestTokenWithAmount> investWithTokenList = investSubscriptionReceiveInfo.getInvestWithTokenList();
        java.util.List<InvestTokenWithAmount> gainsTokenList = investSubscriptionReceiveInfo.getGainsTokenList();
        InvestTokenWithAmount receiveTokenInfo = investSubscriptionReceiveInfo.getReceiveTokenInfo();
        java.util.List<InvestTokenWithAmount> swapToTokenList = investSubscriptionReceiveInfo.getSwapToTokenList();
        java.lang.String valueDeviationPercentage = investSubscriptionReceiveInfo.getValueDeviationPercentage();
        java.lang.String estimateGasFee = investSubscriptionReceiveInfo.getEstimateGasFee();
        java.util.List<ExpectTokenInfo> tokenInfoList = investSubscriptionReceiveInfo.getTokenInfoList();
        java.util.List<InvestTokenWithAmount> safeMoonTokenList = investSubscriptionReceiveInfo.getSafeMoonTokenList();
        java.lang.String exchangeRate = investSubscriptionReceiveInfo.getExchangeRate();
        PromptInformation promptInformation = investSubscriptionReceiveInfo.getPromptInformation();
        PromptInformation promptInformation2 = promptInformation == null ? new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null) : promptInformation;
        InvestTransactionLossInfo transactionLossInfo = investSubscriptionReceiveInfo.getTransactionLossInfo();
        if (transactionLossInfo == null) {
            transactionLossInfo = new InvestTransactionLossInfo((java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        InvestTransactionLossInfo investTransactionLossInfo = transactionLossInfo;
        java.lang.String fixedApy = investSubscriptionReceiveInfo.getFixedApy();
        java.lang.String maturityTime = investSubscriptionReceiveInfo.getMaturityTime();
        CollateralRatioInfo collateralRatioInfo = investSubscriptionReceiveInfo.getCollateralRatioInfo();
        if (collateralRatioInfo == null) {
            collateralRatioInfo = new CollateralRatioInfo((java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        CollateralRatioInfo collateralRatioInfo2 = collateralRatioInfo;
        java.util.List<TransactionStep> transactionStepList = investSubscriptionReceiveInfo.getTransactionStepList();
        if (transactionStepList == null) {
            transactionStepList = yDY.AhwBna();
        }
        java.util.List<TransactionStep> list = transactionStepList;
        boolean zIsAllowSubscribe = investSubscriptionReceiveInfo.isAllowSubscribe();
        PointsInfo pointsInfo = investSubscriptionReceiveInfo.getPointsInfo();
        if (pointsInfo == null || (listAhwBna = pointsInfo.copydefault()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        return new InvestDetailsAndGasFee(investGasPriceConfigCopy$default, investWithTokenList, gainsTokenList, investSubscriptionReceiveInfo.getTotalGainsCurrencyAmount(), receiveTokenInfo, swapToTokenList, valueDeviationPercentage, estimateGasFee, tokenInfoList, safeMoonTokenList, exchangeRate, promptInformation2, investTransactionLossInfo, fixedApy, maturityTime, collateralRatioInfo2, list, zIsAllowSubscribe, C33129mqd.gEmmrt(investSubscriptionReceiveInfo.getDeadline()), C33129mqd.gEmmrt(investSubscriptionReceiveInfo.getSettlementTime()), investSubscriptionReceiveInfo.getProductExtInfoList(), investSubscriptionReceiveInfo.getSubscribeCallDataExtInfo(), listAhwBna, investSubscriptionReceiveInfo.getCollateral(), investSubscriptionReceiveInfo.getHealthFactorInfo(), investSubscriptionReceiveInfo.getBorrowFee(), investSubscriptionReceiveInfo.getBoostParameters());
    }

    public static final RedeemDetailsAndGasFee copydefault(@NotNull InvestRedeemReceiveInfo investRedeemReceiveInfo, @NotNull InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(investRedeemReceiveInfo, "");
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        InvestGasPriceConfig investGasPriceConfigCopy$default = InvestGasPriceConfig.copy$default(investGasPriceConfig, null, null, investRedeemReceiveInfo.getEstimateGasFee(), null, 11, null);
        java.util.List<InvestTokenWithApprove> approveStatusList = investRedeemReceiveInfo.getApproveStatusList();
        java.lang.String inputCurrencyAmount = investRedeemReceiveInfo.getInputCurrencyAmount();
        java.util.List<InvestTokenWithAmount> receiveTokenList = investRedeemReceiveInfo.getReceiveTokenList();
        java.util.List<InvestTokenWithAmount> swapFromTokenList = investRedeemReceiveInfo.getSwapFromTokenList();
        InvestTokenWithAmount mySupply = investRedeemReceiveInfo.getMySupply();
        java.lang.String valueDeviationPercentage = investRedeemReceiveInfo.getValueDeviationPercentage();
        java.lang.String estimateGasFee = investRedeemReceiveInfo.getEstimateGasFee();
        java.util.List<ExpectTokenInfo> tokenInfoList = investRedeemReceiveInfo.getTokenInfoList();
        boolean zIsAllowRedeem = investRedeemReceiveInfo.isAllowRedeem();
        java.lang.String exchangeRate = investRedeemReceiveInfo.getExchangeRate();
        java.util.List<InvestTokenWithAmount> safeMoonTokenList = investRedeemReceiveInfo.getSafeMoonTokenList();
        PromptInformation promptInformation = investRedeemReceiveInfo.getPromptInformation();
        PromptInformation promptInformation2 = promptInformation == null ? new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null) : promptInformation;
        InvestTokenWithAmount payWithToken = investRedeemReceiveInfo.getPayWithToken();
        InvestTokenWithAmount investTokenWithAmount = payWithToken == null ? new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null) : payWithToken;
        RemainingRepaymentInfo remainingRepaymentInfo = investRedeemReceiveInfo.getRemainingRepaymentInfo();
        if (remainingRepaymentInfo == null) {
            remainingRepaymentInfo = new RemainingRepaymentInfo((InvestTokenWithAmount) null, (InvestTokenWithAmount) null, 3, (DefaultConstructorMarker) null);
        }
        RemainingRepaymentInfo remainingRepaymentInfo2 = remainingRepaymentInfo;
        CollateralRatioInfo collateralRatioInfo = investRedeemReceiveInfo.getCollateralRatioInfo();
        if (collateralRatioInfo == null) {
            collateralRatioInfo = new CollateralRatioInfo((java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        return new RedeemDetailsAndGasFee(investGasPriceConfigCopy$default, approveStatusList, inputCurrencyAmount, receiveTokenList, swapFromTokenList, mySupply, valueDeviationPercentage, estimateGasFee, tokenInfoList, zIsAllowRedeem, exchangeRate, safeMoonTokenList, promptInformation2, investTokenWithAmount, remainingRepaymentInfo2, collateralRatioInfo, investRedeemReceiveInfo.getTransactionStepList(), investRedeemReceiveInfo.getCollateral(), investRedeemReceiveInfo.getHealthFactorInfo(), investRedeemReceiveInfo.getBorrowed(), (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (InvestTransactionLossInfo) null, (java.lang.Boolean) null, -1048576, 7, (DefaultConstructorMarker) null);
    }

    public static final RedeemDetailsAndGasFee copydefault(@NotNull InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo, @NotNull InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(investUniv3RedeemReceiveInfo, "");
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        InvestGasPriceConfig investGasPriceConfigCopy$default = InvestGasPriceConfig.copy$default(investGasPriceConfig, null, null, investUniv3RedeemReceiveInfo.getEstimateGasFee(), null, 11, null);
        java.util.List<InvestTokenWithApprove> approveStatusList = investUniv3RedeemReceiveInfo.getApproveStatusList();
        java.util.List<InvestTokenWithAmount> receiveTokenList = investUniv3RedeemReceiveInfo.getReceiveTokenList();
        java.util.List<InvestTokenWithAmount> swapFromTokenList = investUniv3RedeemReceiveInfo.getSwapFromTokenList();
        java.lang.String valueDeviationPercentage = investUniv3RedeemReceiveInfo.getValueDeviationPercentage();
        java.lang.String estimateGasFee = investUniv3RedeemReceiveInfo.getEstimateGasFee();
        java.util.List<ExpectTokenInfo> tokenInfoList = investUniv3RedeemReceiveInfo.getTokenInfoList();
        boolean zIsAllowRedeem = investUniv3RedeemReceiveInfo.isAllowRedeem();
        java.util.List<InvestTokenWithAmount> safeMoonTokenList = investUniv3RedeemReceiveInfo.getSafeMoonTokenList();
        PromptInformation promptInformation = investUniv3RedeemReceiveInfo.getPromptInformation();
        PromptInformation promptInformation2 = promptInformation == null ? new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null) : promptInformation;
        java.util.List<TransactionStep> transactionStepList = investUniv3RedeemReceiveInfo.getTransactionStepList();
        java.lang.String swapSlippage = investUniv3RedeemReceiveInfo.getSwapSlippage();
        InvestTransactionLossInfo transactionLossInfo = investUniv3RedeemReceiveInfo.getTransactionLossInfo();
        return new RedeemDetailsAndGasFee(investGasPriceConfigCopy$default, approveStatusList, (java.lang.String) null, receiveTokenList, swapFromTokenList, (InvestTokenWithAmount) null, valueDeviationPercentage, estimateGasFee, tokenInfoList, zIsAllowRedeem, (java.lang.String) null, safeMoonTokenList, promptInformation2, (InvestTokenWithAmount) null, (RemainingRepaymentInfo) null, (CollateralRatioInfo) null, transactionStepList, (java.lang.String) null, (HeathFactorInfo) null, (BorrowedInfo) null, investUniv3RedeemReceiveInfo.getCurrentPrice(), investUniv3RedeemReceiveInfo.getAssetsList(), (java.util.List) null, investUniv3RedeemReceiveInfo.getFeeEarning(), (java.lang.String) null, (java.lang.Boolean) null, investUniv3RedeemReceiveInfo.getLiquidity(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, swapSlippage, transactionLossInfo, java.lang.Boolean.valueOf(investUniv3RedeemReceiveInfo.getOpenMev()), -78715868, 0, (DefaultConstructorMarker) null);
    }
}
