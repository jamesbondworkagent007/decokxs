package o;

import com.okinc.business.dex.trade.core.domain.model.limit.LimitOrderInfoV2;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateOrderInfo;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateSource;
import com.okinc.business.dex.trade.core.domain.model.limit.V2TokenPairRateResponseData;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gYT {
    public static final TokenPairRateQuote EZpvd(@NotNull LimitPairRateResponse limitPairRateResponse) {
        Intrinsics.checkNotNullParameter(limitPairRateResponse, "");
        java.lang.String changeRate = limitPairRateResponse.getChangeRate();
        boolean enableJito = limitPairRateResponse.getEnableJito();
        java.lang.String estimateGasFee = limitPairRateResponse.getEstimateGasFee();
        java.lang.String expirationTime = limitPairRateResponse.getExpirationTime();
        LimitFeeData feeData = limitPairRateResponse.getFeeData();
        java.lang.String fromTokenPrice = limitPairRateResponse.getFromTokenPrice();
        java.lang.String toTokenPrice = limitPairRateResponse.getToTokenPrice();
        java.lang.String receiveAmount = limitPairRateResponse.getReceiveAmount();
        ServiceFeeInfo serviceFeeInfo = limitPairRateResponse.getServiceFeeInfo();
        DexAutoSlippageInfoParam slippageInfo = limitPairRateResponse.getSlippageInfo();
        java.lang.String nativeSymbol = limitPairRateResponse.getNativeSymbol();
        java.lang.Boolean valDiff = limitPairRateResponse.getValDiff();
        LimitOrderInfo limitOrderInfo = limitPairRateResponse.getLimitOrderInfo();
        return new TokenPairRateQuote(changeRate, enableJito, estimateGasFee, expirationTime, feeData, fromTokenPrice, toTokenPrice, receiveAmount, serviceFeeInfo, slippageInfo, nativeSymbol, valDiff, (java.lang.String) null, limitOrderInfo != null ? new TokenPairRateOrderInfo(limitOrderInfo.getEstReserveNativeAmt(), limitOrderInfo.getFromToken(), limitOrderInfo.getToToken(), limitOrderInfo.getFromTokenAmount(), limitOrderInfo.getToTokenAmount(), limitOrderInfo.isEnableMev(), limitOrderInfo.getMinimumReceived(), limitOrderInfo.getNativeTokenUnitPriceUsd(), limitOrderInfo.getMinSellAmount(), limitOrderInfo.getCode(), limitOrderInfo.isHoneypot(), limitOrderInfo.isSafeMoonToken(), (java.lang.String) null, 4096, (DefaultConstructorMarker) null) : null, TokenPairRateSource.V1, (java.lang.String) null, 32768, (DefaultConstructorMarker) null);
    }

    public static final TokenPairRateQuote copydefault(@NotNull V2TokenPairRateResponseData v2TokenPairRateResponseData) {
        Intrinsics.checkNotNullParameter(v2TokenPairRateResponseData, "");
        java.lang.String changeRate = v2TokenPairRateResponseData.getChangeRate();
        LimitOrderInfoV2 limitOrderInfoV2 = v2TokenPairRateResponseData.getLimitOrderInfoV2();
        boolean zIsEnableMev = limitOrderInfoV2 != null ? limitOrderInfoV2.isEnableMev() : false;
        java.lang.String estimateGasFee = v2TokenPairRateResponseData.getEstimateGasFee();
        java.lang.String expirationTime = v2TokenPairRateResponseData.getExpirationTime();
        LimitFeeData feeData = v2TokenPairRateResponseData.getFeeData();
        java.lang.String fromTokenPrice = v2TokenPairRateResponseData.getFromTokenPrice();
        java.lang.String toTokenPrice = v2TokenPairRateResponseData.getToTokenPrice();
        java.lang.String receiveAmount = v2TokenPairRateResponseData.getReceiveAmount();
        ServiceFeeInfo serviceFeeInfo = v2TokenPairRateResponseData.getServiceFeeInfo();
        DexAutoSlippageInfoParam slippageInfo = v2TokenPairRateResponseData.getSlippageInfo();
        java.lang.String nativeSymbol = v2TokenPairRateResponseData.getNativeSymbol();
        java.lang.Boolean valDiff = v2TokenPairRateResponseData.getValDiff();
        java.lang.String remainingQuota = v2TokenPairRateResponseData.getRemainingQuota();
        LimitOrderInfoV2 limitOrderInfoV22 = v2TokenPairRateResponseData.getLimitOrderInfoV2();
        return new TokenPairRateQuote(changeRate, zIsEnableMev, estimateGasFee, expirationTime, feeData, fromTokenPrice, toTokenPrice, receiveAmount, serviceFeeInfo, slippageInfo, nativeSymbol, valDiff, remainingQuota, limitOrderInfoV22 != null ? new TokenPairRateOrderInfo(limitOrderInfoV22.getEstReserveNativeAmt(), limitOrderInfoV22.getFromToken(), limitOrderInfoV22.getToToken(), limitOrderInfoV22.getFromTokenAmount(), null, limitOrderInfoV22.isEnableMev(), limitOrderInfoV22.getMinimumReceived(), limitOrderInfoV22.getNativeTokenUnitPriceUsd(), null, null, null, null, limitOrderInfoV22.getTradeTaxes()) : null, TokenPairRateSource.V2, (java.lang.String) null, 32768, (DefaultConstructorMarker) null);
    }
}
