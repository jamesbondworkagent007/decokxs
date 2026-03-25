package com.okinc.business.dex.trade.order.domain.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dex.tee.domain.model.LimitSourceType;
import com.okinc.business.dex.tee.domain.model.Rules;
import com.okinc.business.dex.tee.domain.model.Rules$$serializer;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam$$serializer;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
import com.okinc.business.dexlogic.main.limmitorder.bean.ExecutionHistory;
import com.okinc.business.dexlogic.main.limmitorder.bean.ExecutionHistory$$serializer;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C23313hvq;
import o.C33129mqd;
import o.InterfaceC20067gZr;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class LimitOrderDetailBean implements InterfaceC20067gZr {
    private final String approveMethod;
    private final BoostInfo boostInfo;
    private final boolean canResume;
    private final String chainId;
    private final String chainLogoUrl;
    private final String chainName;
    private final String chainSymbol;
    private final String createTime;
    private final String exchangeDirection;
    private final List<ExecutionHistory> executionHistoryList;
    private final Integer executionHistoryShowMaxNum;
    private final String expireTime;
    private final TokenInfo fromToken;
    private final String network;
    private final LimitOrderDetailNetworkFeeInfo networkFeeInfo;
    private final String orderId;
    private final int orderType;
    private final LimitOrderDetailProviderInfo providerInfo;
    private final String routeSelection;
    private final ServiceFeeInfo serviceFeeInfo;
    private final String slippage;
    private final DexAutoSlippageInfoParam slippageInfo;
    private final int sourceType;
    private final String status;
    private final String strategyId;
    private final int strategyMode;
    private final int strategyType;
    private final LimitSurplus surplus;
    private final String swapDuration;
    private final TokenInfo toToken;
    private final Rules tpSlRule;
    private final LimitOrderDetailTransactionInfo transactionInfo;
    private final String transactionType;
    private final TriggerInfo triggerInfo;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(ExecutionHistory$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitOrderDetailBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (TokenInfo) null, (TokenInfo) null, (TriggerInfo) null, (String) null, (String) null, (DexAutoSlippageInfoParam) null, (LimitOrderDetailNetworkFeeInfo) null, (ServiceFeeInfo) null, (String) null, (String) null, (LimitOrderDetailProviderInfo) null, (LimitOrderDetailTransactionInfo) null, (List) null, (String) null, (String) null, (String) null, false, 0, (String) null, (String) null, (Rules) null, 0, (Integer) null, 0, (String) null, (BoostInfo) null, (LimitSurplus) null, -1, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component10() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TriggerInfo component11() {
        return this.triggerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam component14() {
        return this.slippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailNetworkFeeInfo component15() {
        return this.networkFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component16() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.routeSelection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.approveMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailProviderInfo component19() {
        return this.providerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailTransactionInfo component20() {
        return this.transactionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExecutionHistory> component21() {
        return this.executionHistoryList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.swapDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component25() {
        return this.canResume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component26() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rules component29() {
        return this.tpSlRule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component30() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component31() {
        return this.executionHistoryShowMaxNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component32() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoostInfo component34() {
        return this.boostInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitSurplus component35() {
        return this.surplus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component9() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, @NotNull TokenInfo tokenInfo, @NotNull TokenInfo tokenInfo2, @NotNull TriggerInfo triggerInfo, @NotNull String str8, @NotNull String str9, @NotNull DexAutoSlippageInfoParam dexAutoSlippageInfoParam, @NotNull LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo, @NotNull ServiceFeeInfo serviceFeeInfo, @NotNull String str10, @NotNull String str11, @NotNull LimitOrderDetailProviderInfo limitOrderDetailProviderInfo, @NotNull LimitOrderDetailTransactionInfo limitOrderDetailTransactionInfo, @NotNull List<ExecutionHistory> list, @NotNull String str12, @NotNull String str13, @NotNull String str14, boolean z, int i2, @NotNull String str15, @NotNull String str16, @NotNull Rules rules, int i3, Integer num, int i4, @NotNull String str17, BoostInfo boostInfo, LimitSurplus limitSurplus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(tokenInfo2, "");
        Intrinsics.checkNotNullParameter(triggerInfo, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(dexAutoSlippageInfoParam, "");
        Intrinsics.checkNotNullParameter(limitOrderDetailNetworkFeeInfo, "");
        Intrinsics.checkNotNullParameter(serviceFeeInfo, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(limitOrderDetailProviderInfo, "");
        Intrinsics.checkNotNullParameter(limitOrderDetailTransactionInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(rules, "");
        Intrinsics.checkNotNullParameter(str17, "");
        return new LimitOrderDetailBean(str, str2, str3, str4, str5, i, str6, str7, tokenInfo, tokenInfo2, triggerInfo, str8, str9, dexAutoSlippageInfoParam, limitOrderDetailNetworkFeeInfo, serviceFeeInfo, str10, str11, limitOrderDetailProviderInfo, limitOrderDetailTransactionInfo, list, str12, str13, str14, z, i2, str15, str16, rules, i3, num, i4, str17, boostInfo, limitSurplus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitOrderDetailBean)) {
            return false;
        }
        LimitOrderDetailBean limitOrderDetailBean = (LimitOrderDetailBean) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) limitOrderDetailBean.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) limitOrderDetailBean.chainName) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) limitOrderDetailBean.chainLogoUrl) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) limitOrderDetailBean.userWalletAddress) && Intrinsics.EZpvd((Object) this.status, (Object) limitOrderDetailBean.status) && this.orderType == limitOrderDetailBean.orderType && Intrinsics.EZpvd((Object) this.orderId, (Object) limitOrderDetailBean.orderId) && Intrinsics.EZpvd((Object) this.exchangeDirection, (Object) limitOrderDetailBean.exchangeDirection) && Intrinsics.EZpvd(this.fromToken, limitOrderDetailBean.fromToken) && Intrinsics.EZpvd(this.toToken, limitOrderDetailBean.toToken) && Intrinsics.EZpvd(this.triggerInfo, limitOrderDetailBean.triggerInfo) && Intrinsics.EZpvd((Object) this.createTime, (Object) limitOrderDetailBean.createTime) && Intrinsics.EZpvd((Object) this.expireTime, (Object) limitOrderDetailBean.expireTime) && Intrinsics.EZpvd(this.slippageInfo, limitOrderDetailBean.slippageInfo) && Intrinsics.EZpvd(this.networkFeeInfo, limitOrderDetailBean.networkFeeInfo) && Intrinsics.EZpvd(this.serviceFeeInfo, limitOrderDetailBean.serviceFeeInfo) && Intrinsics.EZpvd((Object) this.routeSelection, (Object) limitOrderDetailBean.routeSelection) && Intrinsics.EZpvd((Object) this.approveMethod, (Object) limitOrderDetailBean.approveMethod) && Intrinsics.EZpvd(this.providerInfo, limitOrderDetailBean.providerInfo) && Intrinsics.EZpvd(this.transactionInfo, limitOrderDetailBean.transactionInfo) && Intrinsics.EZpvd(this.executionHistoryList, limitOrderDetailBean.executionHistoryList) && Intrinsics.EZpvd((Object) this.swapDuration, (Object) limitOrderDetailBean.swapDuration) && Intrinsics.EZpvd((Object) this.chainSymbol, (Object) limitOrderDetailBean.chainSymbol) && Intrinsics.EZpvd((Object) this.transactionType, (Object) limitOrderDetailBean.transactionType) && this.canResume == limitOrderDetailBean.canResume && this.strategyType == limitOrderDetailBean.strategyType && Intrinsics.EZpvd((Object) this.slippage, (Object) limitOrderDetailBean.slippage) && Intrinsics.EZpvd((Object) this.network, (Object) limitOrderDetailBean.network) && Intrinsics.EZpvd(this.tpSlRule, limitOrderDetailBean.tpSlRule) && this.sourceType == limitOrderDetailBean.sourceType && Intrinsics.EZpvd(this.executionHistoryShowMaxNum, limitOrderDetailBean.executionHistoryShowMaxNum) && this.strategyMode == limitOrderDetailBean.strategyMode && Intrinsics.EZpvd((Object) this.strategyId, (Object) limitOrderDetailBean.strategyId) && Intrinsics.EZpvd(this.boostInfo, limitOrderDetailBean.boostInfo) && Intrinsics.EZpvd(this.surplus, limitOrderDetailBean.surplus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApproveMethod() {
        return this.approveMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoostInfo getBoostInfo() {
        return this.boostInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public boolean getCanResume() {
        return this.canResume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getChainLogo() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSymbol() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExchangeDirection() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExecutionHistory> getExecutionHistoryList() {
        return this.executionHistoryList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getExecutionHistoryShowMaxNum() {
        return this.executionHistoryShowMaxNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailNetworkFeeInfo getNetworkFeeInfo() {
        return this.networkFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailProviderInfo getProviderInfo() {
        return this.providerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouteSelection() {
        return this.routeSelection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFeeInfo() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam getSlippageInfo() {
        return this.slippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public int getStrategyMode() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitSurplus getSurplus() {
        return this.surplus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapDuration() {
        return this.swapDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rules getTpSlRule() {
        return this.tpSlRule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailTransactionInfo getTransactionInfo() {
        return this.transactionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionType() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TriggerInfo getTriggerInfo() {
        return this.triggerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.chainName.hashCode();
        int iHashCode3 = this.chainLogoUrl.hashCode();
        int iHashCode4 = this.userWalletAddress.hashCode();
        int iHashCode5 = this.status.hashCode();
        int iHashCode6 = Integer.hashCode(this.orderType);
        int iHashCode7 = this.orderId.hashCode();
        int iHashCode8 = this.exchangeDirection.hashCode();
        int iHashCode9 = this.fromToken.hashCode();
        int iHashCode10 = this.toToken.hashCode();
        int iHashCode11 = this.triggerInfo.hashCode();
        int iHashCode12 = this.createTime.hashCode();
        int iHashCode13 = this.expireTime.hashCode();
        int iHashCode14 = this.slippageInfo.hashCode();
        int iHashCode15 = this.networkFeeInfo.hashCode();
        int iHashCode16 = this.serviceFeeInfo.hashCode();
        int iHashCode17 = this.routeSelection.hashCode();
        int iHashCode18 = this.approveMethod.hashCode();
        int iHashCode19 = this.providerInfo.hashCode();
        int iHashCode20 = this.transactionInfo.hashCode();
        int iHashCode21 = this.executionHistoryList.hashCode();
        int iHashCode22 = this.swapDuration.hashCode();
        int iHashCode23 = this.chainSymbol.hashCode();
        int iHashCode24 = this.transactionType.hashCode();
        int iHashCode25 = Boolean.hashCode(this.canResume);
        int iHashCode26 = Integer.hashCode(this.strategyType);
        int iHashCode27 = this.slippage.hashCode();
        int iHashCode28 = this.network.hashCode();
        int iHashCode29 = this.tpSlRule.hashCode();
        int iHashCode30 = Integer.hashCode(this.sourceType);
        Integer num = this.executionHistoryShowMaxNum;
        int iHashCode31 = num == null ? 0 : num.hashCode();
        int iHashCode32 = Integer.hashCode(this.strategyMode);
        int iHashCode33 = this.strategyId.hashCode();
        BoostInfo boostInfo = this.boostInfo;
        int iHashCode34 = boostInfo == null ? 0 : boostInfo.hashCode();
        LimitSurplus limitSurplus = this.surplus;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + (limitSurplus != null ? limitSurplus.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitOrderDetailBean(chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogoUrl=" + this.chainLogoUrl + ", userWalletAddress=" + this.userWalletAddress + ", status=" + this.status + ", orderType=" + this.orderType + ", orderId=" + this.orderId + ", exchangeDirection=" + this.exchangeDirection + ", fromToken=" + this.fromToken + ", toToken=" + this.toToken + ", triggerInfo=" + this.triggerInfo + ", createTime=" + this.createTime + ", expireTime=" + this.expireTime + ", slippageInfo=" + this.slippageInfo + ", networkFeeInfo=" + this.networkFeeInfo + ", serviceFeeInfo=" + this.serviceFeeInfo + ", routeSelection=" + this.routeSelection + ", approveMethod=" + this.approveMethod + ", providerInfo=" + this.providerInfo + ", transactionInfo=" + this.transactionInfo + ", executionHistoryList=" + this.executionHistoryList + ", swapDuration=" + this.swapDuration + ", chainSymbol=" + this.chainSymbol + ", transactionType=" + this.transactionType + ", canResume=" + this.canResume + ", strategyType=" + this.strategyType + ", slippage=" + this.slippage + ", network=" + this.network + ", tpSlRule=" + this.tpSlRule + ", sourceType=" + this.sourceType + ", executionHistoryShowMaxNum=" + this.executionHistoryShowMaxNum + ", strategyMode=" + this.strategyMode + ", strategyId=" + this.strategyId + ", boostInfo=" + this.boostInfo + ", surplus=" + this.surplus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitOrderDetailBean> serializer() {
            return LimitOrderDetailBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitOrderDetailBean(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, String str6, String str7, TokenInfo tokenInfo, TokenInfo tokenInfo2, TriggerInfo triggerInfo, String str8, String str9, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo, ServiceFeeInfo serviceFeeInfo, String str10, String str11, LimitOrderDetailProviderInfo limitOrderDetailProviderInfo, LimitOrderDetailTransactionInfo limitOrderDetailTransactionInfo, List list, String str12, String str13, String str14, boolean z, int i4, String str15, String str16, Rules rules, int i5, Integer num, int i6, String str17, BoostInfo boostInfo, LimitSurplus limitSurplus, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        if ((i & 4) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str3;
        }
        if ((i & 8) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str4;
        }
        if ((i & 16) == 0) {
            this.status = "";
        } else {
            this.status = str5;
        }
        this.orderType = (i & 32) == 0 ? -1 : i3;
        if ((i & 64) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str6;
        }
        if ((i & 128) == 0) {
            this.exchangeDirection = "";
        } else {
            this.exchangeDirection = str7;
        }
        this.fromToken = (i & 256) == 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo;
        this.toToken = (i & 512) == 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo2;
        this.triggerInfo = (i & 1024) == 0 ? new TriggerInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : triggerInfo;
        if ((i & 2048) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str8;
        }
        if ((i & 4096) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str9;
        }
        this.slippageInfo = (i & 8192) == 0 ? new DexAutoSlippageInfoParam((String) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 16383, (DefaultConstructorMarker) null) : dexAutoSlippageInfoParam;
        this.networkFeeInfo = (i & 16384) == 0 ? new LimitOrderDetailNetworkFeeInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null) : limitOrderDetailNetworkFeeInfo;
        this.serviceFeeInfo = (32768 & i) == 0 ? new ServiceFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null) : serviceFeeInfo;
        if ((65536 & i) == 0) {
            this.routeSelection = "";
        } else {
            this.routeSelection = str10;
        }
        if ((131072 & i) == 0) {
            this.approveMethod = "";
        } else {
            this.approveMethod = str11;
        }
        this.providerInfo = (262144 & i) == 0 ? new LimitOrderDetailProviderInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null) : limitOrderDetailProviderInfo;
        this.transactionInfo = (524288 & i) == 0 ? new LimitOrderDetailTransactionInfo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : limitOrderDetailTransactionInfo;
        this.executionHistoryList = (1048576 & i) == 0 ? yDY.AhwBna() : list;
        if ((2097152 & i) == 0) {
            this.swapDuration = "";
        } else {
            this.swapDuration = str12;
        }
        if ((4194304 & i) == 0) {
            this.chainSymbol = "";
        } else {
            this.chainSymbol = str13;
        }
        if ((8388608 & i) == 0) {
            this.transactionType = "";
        } else {
            this.transactionType = str14;
        }
        if ((16777216 & i) == 0) {
            this.canResume = false;
        } else {
            this.canResume = z;
        }
        if ((33554432 & i) == 0) {
            this.strategyType = 0;
        } else {
            this.strategyType = i4;
        }
        if ((67108864 & i) == 0) {
            this.slippage = "";
        } else {
            this.slippage = str15;
        }
        if ((134217728 & i) == 0) {
            this.network = "";
        } else {
            this.network = str16;
        }
        this.tpSlRule = (268435456 & i) == 0 ? new Rules(0, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : rules;
        this.sourceType = (536870912 & i) == 0 ? LimitSourceType.SWAP.getValue() : i5;
        if ((1073741824 & i) == 0) {
            this.executionHistoryShowMaxNum = null;
        } else {
            this.executionHistoryShowMaxNum = num;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.strategyMode = 0;
        } else {
            this.strategyMode = i6;
        }
        if ((i2 & 1) == 0) {
            this.strategyId = "";
        } else {
            this.strategyId = str17;
        }
        if ((i2 & 2) == 0) {
            this.boostInfo = null;
        } else {
            this.boostInfo = boostInfo;
        }
        if ((i2 & 4) == 0) {
            this.surplus = null;
        } else {
            this.surplus = limitSurplus;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [172=12] */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitOrderDetailBean limitOrderDetailBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.getChainId(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, limitOrderDetailBean.getChainId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.getChainName(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, limitOrderDetailBean.getChainName());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, limitOrderDetailBean.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, limitOrderDetailBean.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, limitOrderDetailBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || limitOrderDetailBean.orderType != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, limitOrderDetailBean.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.getOrderId(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, limitOrderDetailBean.getOrderId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.exchangeDirection, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, limitOrderDetailBean.exchangeDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(limitOrderDetailBean.fromToken, new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, TokenInfo$$serializer.INSTANCE, limitOrderDetailBean.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(limitOrderDetailBean.toToken, new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, TokenInfo$$serializer.INSTANCE, limitOrderDetailBean.toToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(limitOrderDetailBean.triggerInfo, new TriggerInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, TriggerInfo$$serializer.INSTANCE, limitOrderDetailBean.triggerInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.getCreateTime(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, limitOrderDetailBean.getCreateTime());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, limitOrderDetailBean.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(limitOrderDetailBean.slippageInfo, new DexAutoSlippageInfoParam((String) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 16383, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, DexAutoSlippageInfoParam$$serializer.INSTANCE, limitOrderDetailBean.slippageInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(limitOrderDetailBean.networkFeeInfo, new LimitOrderDetailNetworkFeeInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, LimitOrderDetailNetworkFeeInfo$$serializer.INSTANCE, limitOrderDetailBean.networkFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(limitOrderDetailBean.serviceFeeInfo, new ServiceFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, ServiceFeeInfo$$serializer.INSTANCE, limitOrderDetailBean.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.routeSelection, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, limitOrderDetailBean.routeSelection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.approveMethod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, limitOrderDetailBean.approveMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(limitOrderDetailBean.providerInfo, new LimitOrderDetailProviderInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, LimitOrderDetailProviderInfo$$serializer.INSTANCE, limitOrderDetailBean.providerInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd(limitOrderDetailBean.transactionInfo, new LimitOrderDetailTransactionInfo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 19, LimitOrderDetailTransactionInfo$$serializer.INSTANCE, limitOrderDetailBean.transactionInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd(limitOrderDetailBean.executionHistoryList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 20, kSerializerArr[20], limitOrderDetailBean.executionHistoryList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.swapDuration, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, limitOrderDetailBean.swapDuration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.chainSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, limitOrderDetailBean.chainSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.transactionType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, limitOrderDetailBean.transactionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || limitOrderDetailBean.getCanResume()) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 24, limitOrderDetailBean.getCanResume());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || limitOrderDetailBean.strategyType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 25, limitOrderDetailBean.strategyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, limitOrderDetailBean.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, limitOrderDetailBean.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd(limitOrderDetailBean.tpSlRule, new Rules(0, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 28, Rules$$serializer.INSTANCE, limitOrderDetailBean.tpSlRule);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || limitOrderDetailBean.sourceType != LimitSourceType.SWAP.getValue()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 29, limitOrderDetailBean.sourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || limitOrderDetailBean.executionHistoryShowMaxNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, IntSerializer.INSTANCE, limitOrderDetailBean.executionHistoryShowMaxNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || limitOrderDetailBean.getStrategyMode() != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 31, limitOrderDetailBean.getStrategyMode());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) limitOrderDetailBean.strategyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, limitOrderDetailBean.strategyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || limitOrderDetailBean.boostInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, BoostInfo$$serializer.INSTANCE, limitOrderDetailBean.boostInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) && limitOrderDetailBean.surplus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, LimitSurplus$$serializer.INSTANCE, limitOrderDetailBean.surplus);
    }

    public LimitOrderDetailBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, @NotNull TokenInfo tokenInfo, @NotNull TokenInfo tokenInfo2, @NotNull TriggerInfo triggerInfo, @NotNull String str8, @NotNull String str9, @NotNull DexAutoSlippageInfoParam dexAutoSlippageInfoParam, @NotNull LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo, @NotNull ServiceFeeInfo serviceFeeInfo, @NotNull String str10, @NotNull String str11, @NotNull LimitOrderDetailProviderInfo limitOrderDetailProviderInfo, @NotNull LimitOrderDetailTransactionInfo limitOrderDetailTransactionInfo, @NotNull List<ExecutionHistory> list, @NotNull String str12, @NotNull String str13, @NotNull String str14, boolean z, int i2, @NotNull String str15, @NotNull String str16, @NotNull Rules rules, int i3, Integer num, int i4, @NotNull String str17, BoostInfo boostInfo, LimitSurplus limitSurplus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(tokenInfo2, "");
        Intrinsics.checkNotNullParameter(triggerInfo, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(dexAutoSlippageInfoParam, "");
        Intrinsics.checkNotNullParameter(limitOrderDetailNetworkFeeInfo, "");
        Intrinsics.checkNotNullParameter(serviceFeeInfo, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(limitOrderDetailProviderInfo, "");
        Intrinsics.checkNotNullParameter(limitOrderDetailTransactionInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(rules, "");
        Intrinsics.checkNotNullParameter(str17, "");
        this.chainId = str;
        this.chainName = str2;
        this.chainLogoUrl = str3;
        this.userWalletAddress = str4;
        this.status = str5;
        this.orderType = i;
        this.orderId = str6;
        this.exchangeDirection = str7;
        this.fromToken = tokenInfo;
        this.toToken = tokenInfo2;
        this.triggerInfo = triggerInfo;
        this.createTime = str8;
        this.expireTime = str9;
        this.slippageInfo = dexAutoSlippageInfoParam;
        this.networkFeeInfo = limitOrderDetailNetworkFeeInfo;
        this.serviceFeeInfo = serviceFeeInfo;
        this.routeSelection = str10;
        this.approveMethod = str11;
        this.providerInfo = limitOrderDetailProviderInfo;
        this.transactionInfo = limitOrderDetailTransactionInfo;
        this.executionHistoryList = list;
        this.swapDuration = str12;
        this.chainSymbol = str13;
        this.transactionType = str14;
        this.canResume = z;
        this.strategyType = i2;
        this.slippage = str15;
        this.network = str16;
        this.tpSlRule = rules;
        this.sourceType = i3;
        this.executionHistoryShowMaxNum = num;
        this.strategyMode = i4;
        this.strategyId = str17;
        this.boostInfo = boostInfo;
        this.surplus = limitSurplus;
    }

    public /* synthetic */ LimitOrderDetailBean(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, TokenInfo tokenInfo, TokenInfo tokenInfo2, TriggerInfo triggerInfo, String str8, String str9, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo, ServiceFeeInfo serviceFeeInfo, String str10, String str11, LimitOrderDetailProviderInfo limitOrderDetailProviderInfo, LimitOrderDetailTransactionInfo limitOrderDetailTransactionInfo, List list, String str12, String str13, String str14, boolean z, int i2, String str15, String str16, Rules rules, int i3, Integer num, int i4, String str17, BoostInfo boostInfo, LimitSurplus limitSurplus, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        String str18;
        LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo2;
        LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo3;
        ServiceFeeInfo serviceFeeInfo2;
        LimitOrderDetailProviderInfo limitOrderDetailProviderInfo2;
        String str19 = (i5 & 1) != 0 ? "" : str;
        String str20 = (i5 & 2) != 0 ? "" : str2;
        String str21 = (i5 & 4) != 0 ? "" : str3;
        String str22 = (i5 & 8) != 0 ? "" : str4;
        String str23 = (i5 & 16) != 0 ? "" : str5;
        int i7 = (i5 & 32) != 0 ? -1 : i;
        String str24 = (i5 & 64) != 0 ? "" : str6;
        String str25 = (i5 & 128) != 0 ? "" : str7;
        TokenInfo tokenInfo3 = (i5 & 256) != 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo;
        TokenInfo tokenInfo4 = (i5 & 512) != 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo2;
        TriggerInfo triggerInfo2 = (i5 & 1024) != 0 ? new TriggerInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : triggerInfo;
        String str26 = (i5 & 2048) != 0 ? "" : str8;
        String str27 = (i5 & 4096) != 0 ? "" : str9;
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam2 = (i5 & 8192) != 0 ? new DexAutoSlippageInfoParam((String) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 16383, (DefaultConstructorMarker) null) : dexAutoSlippageInfoParam;
        if ((i5 & 16384) != 0) {
            str18 = str27;
            limitOrderDetailNetworkFeeInfo2 = new LimitOrderDetailNetworkFeeInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            str18 = str27;
            limitOrderDetailNetworkFeeInfo2 = limitOrderDetailNetworkFeeInfo;
        }
        ServiceFeeInfo serviceFeeInfo3 = (32768 & i5) != 0 ? new ServiceFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null) : serviceFeeInfo;
        String str28 = (i5 & 65536) != 0 ? "" : str10;
        String str29 = (i5 & 131072) != 0 ? "" : str11;
        if ((i5 & 262144) != 0) {
            serviceFeeInfo2 = serviceFeeInfo3;
            limitOrderDetailNetworkFeeInfo3 = limitOrderDetailNetworkFeeInfo2;
            limitOrderDetailProviderInfo2 = new LimitOrderDetailProviderInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            limitOrderDetailNetworkFeeInfo3 = limitOrderDetailNetworkFeeInfo2;
            serviceFeeInfo2 = serviceFeeInfo3;
            limitOrderDetailProviderInfo2 = limitOrderDetailProviderInfo;
        }
        this(str19, str20, str21, str22, str23, i7, str24, str25, tokenInfo3, tokenInfo4, triggerInfo2, str26, str18, dexAutoSlippageInfoParam2, limitOrderDetailNetworkFeeInfo3, serviceFeeInfo2, str28, str29, limitOrderDetailProviderInfo2, (524288 & i5) != 0 ? new LimitOrderDetailTransactionInfo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : limitOrderDetailTransactionInfo, (i5 & 1048576) != 0 ? yDY.AhwBna() : list, (i5 & 2097152) != 0 ? "" : str12, (i5 & 4194304) != 0 ? "" : str13, (i5 & 8388608) != 0 ? "" : str14, (i5 & 16777216) != 0 ? false : z, (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? 0 : i2, (i5 & 67108864) != 0 ? "" : str15, (i5 & 134217728) != 0 ? "" : str16, (i5 & 268435456) != 0 ? new Rules(0, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : rules, (i5 & 536870912) != 0 ? LimitSourceType.SWAP.getValue() : i3, (i5 & 1073741824) != 0 ? null : num, (i5 & Integer.MIN_VALUE) == 0 ? i4 : 0, (i6 & 1) != 0 ? "" : str17, (i6 & 2) != 0 ? null : boostInfo, (i6 & 4) == 0 ? limitSurplus : null);
    }

    @Override // o.InterfaceC20067gZr
    public String getFromTokenSymbol() {
        return this.fromToken.getTokenSymbol();
    }

    @Override // o.InterfaceC20067gZr
    public String getFromTokenAmount() {
        String tokenAmount = this.fromToken.getTokenAmount();
        if (C23313hvq.copydefault(tokenAmount, -1)) {
            tokenAmount = null;
        }
        return tokenAmount == null ? "" : tokenAmount;
    }

    @Override // o.InterfaceC20067gZr
    public String getToTokenSymbol() {
        return this.toToken.getTokenSymbol();
    }

    @Override // o.InterfaceC20067gZr
    public String getToTokenAmount() {
        String tokenAmount = this.toToken.getTokenAmount();
        if (C23313hvq.copydefault(tokenAmount, -1)) {
            tokenAmount = null;
        }
        return tokenAmount == null ? "" : tokenAmount;
    }

    @Override // o.InterfaceC20067gZr
    public String getToTokenLogo() {
        return this.toToken.getTokenLogoUrl();
    }

    @Override // o.InterfaceC20067gZr
    public String getToTokenCurrencyAmount() {
        return this.toToken.getTokenUsd();
    }

    @Override // o.InterfaceC20067gZr
    public OrderSubStatus getOrderStatus() {
        return OrderSubStatus.Companion.KWHzl(C33129mqd.AhwBna(this.status));
    }

    @Override // o.InterfaceC20067gZr
    public OrderSide getOrderSide() {
        return OrderSide.Companion.KWHzl(this.exchangeDirection);
    }

    @Override // o.InterfaceC20067gZr
    public String getFromTokenAddress() {
        return this.fromToken.getTokenContractAddress();
    }

    @Override // o.InterfaceC20067gZr
    public String getToTokenAddress() {
        return this.toToken.getTokenContractAddress();
    }

    public boolean isFromNative() {
        return this.fromToken.isNativeToken() == 1;
    }

    public boolean isToNative() {
        return this.toToken.isNativeToken() == 1;
    }

    @Override // o.InterfaceC20067gZr
    public String getFromTokenLogo() {
        return this.fromToken.getTokenLogoUrl();
    }

    @Override // o.InterfaceC20067gZr
    public boolean getFromIsCurrency() {
        return this.fromToken.getTokenIsCurrency();
    }

    @Override // o.InterfaceC20067gZr
    public boolean getToIsCurrency() {
        return this.toToken.getTokenIsCurrency();
    }

    public final String getTriggerMarketCapacity() {
        return this.triggerInfo.getTriggerMarketCapacity();
    }

    public final String getTriggerPrice() {
        return this.triggerInfo.getTriggerPrice();
    }

    public final String getTriggerRate() {
        return this.triggerInfo.getTriggerRate();
    }

    public final String getTotalGasFee() {
        return this.networkFeeInfo.getNativeTokenCostAmt();
    }

    public final String getTotalGasFeeUsdValue() {
        return this.networkFeeInfo.getUsdValue();
    }

    public final String getProvider() {
        return this.providerInfo.getProvider();
    }

    public final String getTransactionPrice() {
        return this.transactionInfo.getTransactionPrice();
    }

    public final String getTransactionTime() {
        return this.transactionInfo.getTransactionTime();
    }

    public final String getLatestTransactionHash() {
        return this.transactionInfo.getTransactionHash();
    }

    public final String getExploreUrl() {
        return this.transactionInfo.getExploreUrl();
    }

    public final LimitSourceType getLimitSourceType() {
        LimitSourceType next;
        Iterator<LimitSourceType> it = LimitSourceType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getValue() == this.sourceType) {
                break;
            }
        }
        LimitSourceType limitSourceType = next;
        return limitSourceType == null ? LimitSourceType.SWAP : limitSourceType;
    }

    public final String getBoostVolume() {
        BoostInfo boostInfo = this.boostInfo;
        String boostVolume = boostInfo != null ? boostInfo.getBoostVolume() : null;
        return boostVolume == null ? "" : boostVolume;
    }

    public final String getBoostWeight() {
        Double weighted;
        BoostInfo boostInfo = this.boostInfo;
        String string = (boostInfo == null || (weighted = boostInfo.getWeighted()) == null) ? null : weighted.toString();
        return string == null ? "" : string;
    }
}
