package o;

import com.okinc.business.dex.tee.domain.model.LimitSourceType;
import com.okinc.business.dex.tee.domain.model.Rules;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailNetworkFeeInfo;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailProviderInfo;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailTransactionInfo;
import com.okinc.business.dex.trade.order.domain.model.LimitSurplus;
import com.okinc.business.dex.trade.order.domain.model.OrderSide;
import com.okinc.business.dex.trade.order.domain.model.TokenInfo;
import com.okinc.business.dex.trade.order.domain.model.TriggerInfo;
import com.okinc.business.dexlogic.bean.DefiPlatformInfos;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.main.limmitorder.bean.ExecutionHistory;
import com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeExchangeDirection;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeOrderStrategyType;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeQuickRateType;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeTriggerCondition;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderCancelStatus;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderSourceType;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19742gNq {

    /* JADX INFO: renamed from: o.gNq$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.Buy.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderSide.Sell.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    @yCM
    public C19742gNq() {
    }

    public final OrderDetailResult KWHzl(@NotNull LimitOrderDetailBean limitOrderDetailBean) {
        int value;
        Intrinsics.checkNotNullParameter(limitOrderDetailBean, "");
        java.lang.String createTime = limitOrderDetailBean.getCreateTime();
        java.lang.String expireTime = limitOrderDetailBean.getExpireTime();
        java.lang.String exploreUrl = limitOrderDetailBean.getExploreUrl();
        java.lang.String orderId = limitOrderDetailBean.getOrderId();
        java.lang.String strategyId = limitOrderDetailBean.getStrategyId();
        java.lang.String status = limitOrderDetailBean.getStatus();
        java.lang.String userWalletAddress = limitOrderDetailBean.getUserWalletAddress();
        java.lang.String totalGasFee = limitOrderDetailBean.getTotalGasFee();
        java.lang.String totalGasFeeUsdValue = limitOrderDetailBean.getTotalGasFeeUsdValue();
        java.lang.String transactionPrice = limitOrderDetailBean.getTransactionPrice();
        java.lang.String transactionTime = limitOrderDetailBean.getTransactionTime();
        java.lang.String latestTransactionHash = limitOrderDetailBean.getLatestTransactionHash();
        java.lang.String chainId = limitOrderDetailBean.getChainId();
        java.lang.String chainName = limitOrderDetailBean.getChainName();
        java.lang.String chainLogoUrl = limitOrderDetailBean.getChainLogoUrl();
        int orderType = limitOrderDetailBean.getOrderType();
        TokenInfo fromToken = limitOrderDetailBean.getFromToken();
        TokenInfo toToken = limitOrderDetailBean.getToToken();
        TriggerInfo triggerInfo = limitOrderDetailBean.getTriggerInfo();
        DexAutoSlippageInfoParam slippageInfo = limitOrderDetailBean.getSlippageInfo();
        LimitOrderDetailNetworkFeeInfo networkFeeInfo = limitOrderDetailBean.getNetworkFeeInfo();
        ServiceFeeInfo serviceFeeInfo = limitOrderDetailBean.getServiceFeeInfo();
        java.lang.String routeSelection = limitOrderDetailBean.getRouteSelection();
        java.lang.String approveMethod = limitOrderDetailBean.getApproveMethod();
        LimitOrderDetailProviderInfo providerInfo = limitOrderDetailBean.getProviderInfo();
        LimitOrderDetailTransactionInfo transactionInfo = limitOrderDetailBean.getTransactionInfo();
        java.util.List<ExecutionHistory> executionHistoryList = limitOrderDetailBean.getExecutionHistoryList();
        java.lang.String swapDuration = limitOrderDetailBean.getSwapDuration();
        java.lang.String chainSymbol = limitOrderDetailBean.getChainSymbol();
        java.lang.String transactionType = limitOrderDetailBean.getTransactionType();
        boolean canResume = limitOrderDetailBean.getCanResume();
        java.lang.String network = limitOrderDetailBean.getNetwork();
        java.lang.String triggerPrice = limitOrderDetailBean.getTriggerPrice();
        java.lang.String triggerMarketCapacity = limitOrderDetailBean.getTriggerMarketCapacity();
        java.lang.String referenceSlippage = limitOrderDetailBean.getSlippageInfo().getReferenceSlippage();
        if (referenceSlippage.length() == 0) {
            referenceSlippage = limitOrderDetailBean.getSlippage();
        }
        java.lang.String str = referenceSlippage;
        LimitMemeExchangeDirection limitMemeExchangeDirectionEZpvd = EZpvd(limitOrderDetailBean.getOrderSide());
        FromChildOrderDetailVO fromChildOrderDetailVOEZpvd = EZpvd(limitOrderDetailBean);
        java.lang.String transactionPrice2 = limitOrderDetailBean.getTransactionPrice();
        if (transactionPrice2.length() == 0) {
            transactionPrice2 = limitOrderDetailBean.getTriggerPrice();
        }
        java.lang.String str2 = transactionPrice2;
        java.lang.String serviceFeeUsd = limitOrderDetailBean.getServiceFeeInfo().getServiceFeeUsd();
        java.lang.String nativeTokenCostAmt = limitOrderDetailBean.getServiceFeeInfo().getNativeTokenCostAmt();
        java.lang.String serviceFeeTokenSymbol = limitOrderDetailBean.getServiceFeeInfo().getServiceFeeTokenSymbol();
        java.lang.String str3 = limitOrderDetailBean.getServiceFeeInfo().getServiceFeeUsd().length() > 0 ? "1" : "0";
        if (C20065gZp.AEQbTJ(limitOrderDetailBean.getOrderStatus())) {
            value = LimitOrderCancelStatus.Cancellable.getValue();
        } else {
            value = LimitOrderCancelStatus.NonCancellable.getValue();
        }
        int i = value;
        Rules tpSlRule = limitOrderDetailBean.getTpSlRule();
        LimitSourceType limitSourceType = limitOrderDetailBean.getLimitSourceType();
        int orderType2 = limitOrderDetailBean.getOrderType();
        java.lang.Integer executionHistoryShowMaxNum = limitOrderDetailBean.getExecutionHistoryShowMaxNum();
        int strategyMode = limitOrderDetailBean.getStrategyMode();
        LimitMemeOrderStrategyType limitMemeOrderStrategyTypeOLrzqt = LimitMemeOrderStrategyType.Companion.OLrzqt(limitOrderDetailBean.getStrategyType());
        java.lang.String boostVolume = limitOrderDetailBean.getBoostVolume();
        java.lang.String boostWeight = limitOrderDetailBean.getBoostWeight();
        LimitSurplus surplus = limitOrderDetailBean.getSurplus();
        java.lang.String surplusAmount = surplus != null ? surplus.getSurplusAmount() : null;
        java.lang.String str4 = surplusAmount == null ? "" : surplusAmount;
        LimitSurplus surplus2 = limitOrderDetailBean.getSurplus();
        java.lang.String surplusValueUsd = surplus2 != null ? surplus2.getSurplusValueUsd() : null;
        return new OrderDetailResult(createTime, (DefiPlatformInfos) null, expireTime, exploreUrl, (java.lang.String) null, fromChildOrderDetailVOEZpvd, orderId, str2, (java.lang.String) null, status, str4, surplusValueUsd != null ? surplusValueUsd : "", java.lang.String.valueOf(orderType2), totalGasFee, totalGasFeeUsdValue, latestTransactionHash, transactionPrice, transactionTime, userWalletAddress, false, false, 0, i, str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, limitMemeExchangeDirectionEZpvd, (LimitMemeQuickRateType) null, (LimitOrderSourceType) null, limitMemeOrderStrategyTypeOLrzqt, triggerPrice, triggerMarketCapacity, (LimitMemeTriggerCondition) null, serviceFeeUsd, (java.lang.String) null, nativeTokenCostAmt, serviceFeeTokenSymbol, str3, (java.util.List) executionHistoryList, executionHistoryShowMaxNum, (java.lang.Integer) null, (java.lang.String) null, chainId, chainName, chainLogoUrl, orderType, fromToken, toToken, triggerInfo, slippageInfo, networkFeeInfo, serviceFeeInfo, routeSelection, approveMethod, providerInfo, transactionInfo, swapDuration, chainSymbol, transactionType, canResume, network, tpSlRule, limitSourceType, strategyMode, strategyId, boostVolume, boostWeight, 926417170, 1546, 0, (DefaultConstructorMarker) null);
    }

    public final LimitMemeExchangeDirection EZpvd(OrderSide orderSide) {
        int i = ActionBar.OLrzqt[orderSide.ordinal()];
        if (i == 1) {
            return LimitMemeExchangeDirection.NONE;
        }
        if (i == 2) {
            return LimitMemeExchangeDirection.BUY;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return LimitMemeExchangeDirection.SELL;
    }

    public final FromChildOrderDetailVO EZpvd(LimitOrderDetailBean limitOrderDetailBean) {
        java.lang.String orderId = limitOrderDetailBean.getOrderId();
        java.lang.String exploreUrl = limitOrderDetailBean.getExploreUrl();
        java.lang.String tokenContractAddress = limitOrderDetailBean.getFromToken().getTokenContractAddress();
        java.lang.String tokenName = limitOrderDetailBean.getFromToken().getTokenName();
        java.lang.String tokenAmount = limitOrderDetailBean.getFromToken().getTokenAmount();
        java.lang.String chainId = limitOrderDetailBean.getChainId();
        java.lang.String chainLogoUrl = limitOrderDetailBean.getChainLogoUrl();
        java.lang.String chainName = limitOrderDetailBean.getChainName();
        java.lang.String tokenLogoUrl = limitOrderDetailBean.getFromToken().getTokenLogoUrl();
        java.lang.String tokenSymbol = limitOrderDetailBean.getFromToken().getTokenSymbol();
        java.lang.String tokenUsd = limitOrderDetailBean.getFromToken().getTokenUsd();
        java.lang.String status = limitOrderDetailBean.getStatus();
        java.lang.String tokenContractAddress2 = limitOrderDetailBean.getToToken().getTokenContractAddress();
        java.lang.String tokenName2 = limitOrderDetailBean.getToToken().getTokenName();
        java.lang.String tokenAmount2 = limitOrderDetailBean.getToToken().getTokenAmount();
        java.lang.String chainId2 = limitOrderDetailBean.getChainId();
        java.lang.String chainLogoUrl2 = limitOrderDetailBean.getChainLogoUrl();
        java.lang.String chainName2 = limitOrderDetailBean.getChainName();
        java.lang.String tokenLogoUrl2 = limitOrderDetailBean.getToToken().getTokenLogoUrl();
        java.lang.String tokenSymbol2 = limitOrderDetailBean.getToToken().getTokenSymbol();
        java.lang.String tokenUsd2 = limitOrderDetailBean.getToToken().getTokenUsd();
        java.lang.String latestTransactionHash = limitOrderDetailBean.getLatestTransactionHash();
        java.lang.String userWalletAddress = limitOrderDetailBean.getUserWalletAddress();
        int iAhwBna = C33129mqd.AhwBna(limitOrderDetailBean.getExchangeDirection());
        return new FromChildOrderDetailVO(orderId, exploreUrl, tokenContractAddress, tokenName, tokenAmount, chainId, chainLogoUrl, chainName, tokenLogoUrl, tokenSymbol, tokenUsd, false, (java.lang.String) null, status, tokenContractAddress2, tokenName2, tokenAmount2, chainId2, chainLogoUrl2, chainName2, tokenLogoUrl2, tokenSymbol2, tokenUsd2, false, latestTransactionHash, userWalletAddress, java.lang.Integer.valueOf(iAhwBna), limitOrderDetailBean.getTriggerPrice(), limitOrderDetailBean.getTriggerMarketCapacity(), java.lang.Integer.valueOf(limitOrderDetailBean.getStrategyType()), (java.lang.Integer) null, 1082136576, (DefaultConstructorMarker) null);
    }
}
