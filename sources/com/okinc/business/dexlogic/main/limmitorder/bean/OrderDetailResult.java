package com.okinc.business.dexlogic.main.limmitorder.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dex.tee.domain.model.LimitSourceType;
import com.okinc.business.dex.tee.domain.model.Rules;
import com.okinc.business.dex.tee.domain.model.Rules$$serializer;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailNetworkFeeInfo;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailNetworkFeeInfo$$serializer;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailProviderInfo;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailProviderInfo$$serializer;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailTransactionInfo;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailTransactionInfo$$serializer;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dex.trade.order.domain.model.TokenInfo;
import com.okinc.business.dex.trade.order.domain.model.TokenInfo$$serializer;
import com.okinc.business.dex.trade.order.domain.model.TriggerInfo;
import com.okinc.business.dex.trade.order.domain.model.TriggerInfo$$serializer;
import com.okinc.business.dexlogic.bean.DefiPlatformInfos;
import com.okinc.business.dexlogic.bean.DefiPlatformInfos$$serializer;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam$$serializer;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C22380heK;
import o.C23313hvq;
import o.C33129mqd;
import o.InterfaceC23194htd;
import o.InterfaceC9738bbJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class OrderDetailResult {
    private final String approveMethod;
    private final String bannerMessage;
    private final String boostVolume;
    private final String boostWeight;
    private final int canCancel;
    private final int canEdit;
    private final boolean canResume;
    private final String chainId;
    private final String chainLogoUrl;
    private final String chainName;
    private final String chainSymbol;
    private String createTime;
    private boolean dealWarnTag;
    private DefiPlatformInfos defiPlatformInfo;
    private final LimitMemeExchangeDirection exchangeDirection;
    private final List<ExecutionHistory> executionHistoryList;
    private final Integer executionHistoryShowMaxNum;
    private String expireTime;
    private String exploreUrl;
    private String failureReason;
    private final String feeToken;
    private FromChildOrderDetailVO fromChildOrderDetailVO;
    private final TokenInfo fromToken;
    private final String isDisplayServiceFee;
    private final Integer isShowExecutionHistoryMaxNum;
    private String latestTransactionHash;
    private final LimitMemeOrderStrategyType limitMemeOrderStrategyType;
    private final LimitOrderSourceType limitOrderSourceType;
    private final LimitSourceType limitSourceType;
    private final String network;
    private final LimitOrderDetailNetworkFeeInfo networkFeeInfo;
    private String orderId;
    private final int orderType;
    private final String preFailureReason;
    private String price;
    private final String priorityFee;
    private final LimitOrderDetailProviderInfo providerInfo;
    private final LimitMemeQuickRateType quickRateType;
    private String remainTime;
    private final String routeSelection;
    private final String serviceFee;
    private final ServiceFeeInfo serviceFeeInfo;
    private final String serviceFeeRate;
    private final String serviceFeeTokenSymbol;
    private final String serviceFeeUsd;
    private final String slippage;
    private final DexAutoSlippageInfoParam slippageInfo;
    private String status;
    private final String strategyId;
    private final int strategyMode;
    private String surplus;
    private String surplusUsdValue;
    private final String swapDuration;
    private String swapTradeType;
    private boolean timeoutToast;
    private final TokenInfo toToken;
    private String totalGasFee;
    private String totalGasFeeUsdValue;
    private final Rules tpSlRule;
    private final LimitOrderDetailTransactionInfo transactionInfo;
    private String transactionPrice;
    private String transactionTime;
    private final String transactionType;
    private final LimitMemeTriggerCondition triggerCondition;
    private final TriggerInfo triggerInfo;
    private final String triggerMarketCapacity;
    private final String triggerPrice;
    private String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LimitMemeExchangeDirection.Companion.serializer(), LimitMemeQuickRateType.Companion.serializer(), LimitOrderSourceType.Companion.serializer(), LimitMemeOrderStrategyType.Companion.serializer(), null, null, LimitMemeTriggerCondition.Companion.serializer(), null, null, null, null, null, new ArrayListSerializer(ExecutionHistory$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dex.tee.domain.model.LimitSourceType", LimitSourceType.values()), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderDetailResult() {
        this((String) null, (DefiPlatformInfos) null, (String) null, (String) null, (String) null, (FromChildOrderDetailVO) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, 0, 0, (String) null, (String) null, (String) null, (String) null, (LimitMemeExchangeDirection) null, (LimitMemeQuickRateType) null, (LimitOrderSourceType) null, (LimitMemeOrderStrategyType) null, (String) null, (String) null, (LimitMemeTriggerCondition) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, 0, (TokenInfo) null, (TokenInfo) null, (TriggerInfo) null, (DexAutoSlippageInfoParam) null, (LimitOrderDetailNetworkFeeInfo) null, (ServiceFeeInfo) null, (String) null, (String) null, (LimitOrderDetailProviderInfo) null, (LimitOrderDetailTransactionInfo) null, (String) null, (String) null, (String) null, false, (String) null, (Rules) null, (LimitSourceType) null, 0, (String) null, (String) null, (String) null, -1, -1, 15, (DefaultConstructorMarker) null);
    }

    @SerialName("bannerMessage")
    public static /* synthetic */ void getBannerMessage$annotations() {
    }

    @SerialName("canCancel")
    public static /* synthetic */ void getCanCancel$annotations() {
    }

    @SerialName("canEdit")
    public static /* synthetic */ void getCanEdit$annotations() {
    }

    @SerialName("exchangeDirection")
    public static /* synthetic */ void getExchangeDirection$annotations() {
    }

    @SerialName("executionHistoryList")
    public static /* synthetic */ void getExecutionHistoryList$annotations() {
    }

    @SerialName("executionHistoryShowMaxNum")
    public static /* synthetic */ void getExecutionHistoryShowMaxNum$annotations() {
    }

    @SerialName("feeToken")
    public static /* synthetic */ void getFeeToken$annotations() {
    }

    @SerialName("strategyType")
    public static /* synthetic */ void getLimitMemeOrderStrategyType$annotations() {
    }

    @SerialName("sourceType")
    public static /* synthetic */ void getLimitOrderSourceType$annotations() {
    }

    @SerialName("preFailureReason")
    public static /* synthetic */ void getPreFailureReason$annotations() {
    }

    @SerialName("priorityFee")
    public static /* synthetic */ void getPriorityFee$annotations() {
    }

    @SerialName("quickRateType")
    public static /* synthetic */ void getQuickRateType$annotations() {
    }

    @SerialName("serviceFee")
    public static /* synthetic */ void getServiceFee$annotations() {
    }

    @SerialName("serviceFeeRate")
    public static /* synthetic */ void getServiceFeeRate$annotations() {
    }

    @SerialName("serviceFeeTokenSymbol")
    public static /* synthetic */ void getServiceFeeTokenSymbol$annotations() {
    }

    @SerialName("serviceFeeUsd")
    public static /* synthetic */ void getServiceFeeUsd$annotations() {
    }

    @SerialName("slippage")
    public static /* synthetic */ void getSlippage$annotations() {
    }

    @SerialName("triggerCondition")
    public static /* synthetic */ void getTriggerCondition$annotations() {
    }

    @SerialName("triggerMarketCapacity")
    public static /* synthetic */ void getTriggerMarketCapacity$annotations() {
    }

    @SerialName("triggerPrice")
    public static /* synthetic */ void getTriggerPrice$annotations() {
    }

    @SerialName("isDisplayServiceFee")
    public static /* synthetic */ void isDisplayServiceFee$annotations() {
    }

    @SerialName("isShowExecutionHistoryMaxNum")
    public static /* synthetic */ void isShowExecutionHistoryMaxNum$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.surplus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.surplusUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.swapTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.totalGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.totalGasFeeUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.latestTransactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.transactionPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.transactionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiPlatformInfos component2() {
        return this.defiPlatformInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.dealWarnTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component21() {
        return this.timeoutToast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component22() {
        return this.canEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component23() {
        return this.canCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.feeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.preFailureReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitMemeExchangeDirection component28() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitMemeQuickRateType component29() {
        return this.quickRateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderSourceType component30() {
        return this.limitOrderSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitMemeOrderStrategyType component31() {
        return this.limitMemeOrderStrategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.triggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.triggerMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitMemeTriggerCondition component34() {
        return this.triggerCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.serviceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.serviceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.serviceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.serviceFeeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.isDisplayServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExecutionHistory> component40() {
        return this.executionHistoryList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component41() {
        return this.executionHistoryShowMaxNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component42() {
        return this.isShowExecutionHistoryMaxNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.bannerMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component47() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component48() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component49() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.failureReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TriggerInfo component50() {
        return this.triggerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam component51() {
        return this.slippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailNetworkFeeInfo component52() {
        return this.networkFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component53() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.routeSelection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.approveMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailProviderInfo component56() {
        return this.providerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailTransactionInfo component57() {
        return this.transactionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.swapDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FromChildOrderDetailVO component6() {
        return this.fromChildOrderDetailVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component61() {
        return this.canResume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rules component63() {
        return this.tpSlRule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitSourceType component64() {
        return this.limitSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component65() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.boostVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component68() {
        return this.boostWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.remainTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderDetailResult copy(@NotNull String str, DefiPlatformInfos defiPlatformInfos, @NotNull String str2, @NotNull String str3, @NotNull String str4, FromChildOrderDetailVO fromChildOrderDetailVO, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, boolean z, boolean z2, int i, int i2, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull LimitMemeExchangeDirection limitMemeExchangeDirection, @NotNull LimitMemeQuickRateType limitMemeQuickRateType, @NotNull LimitOrderSourceType limitOrderSourceType, @NotNull LimitMemeOrderStrategyType limitMemeOrderStrategyType, @NotNull String str22, @NotNull String str23, @NotNull LimitMemeTriggerCondition limitMemeTriggerCondition, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, List<ExecutionHistory> list, Integer num, Integer num2, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, int i3, @NotNull TokenInfo tokenInfo, @NotNull TokenInfo tokenInfo2, @NotNull TriggerInfo triggerInfo, @NotNull DexAutoSlippageInfoParam dexAutoSlippageInfoParam, @NotNull LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo, @NotNull ServiceFeeInfo serviceFeeInfo, @NotNull String str33, @NotNull String str34, @NotNull LimitOrderDetailProviderInfo limitOrderDetailProviderInfo, @NotNull LimitOrderDetailTransactionInfo limitOrderDetailTransactionInfo, @NotNull String str35, @NotNull String str36, @NotNull String str37, boolean z3, @NotNull String str38, @NotNull Rules rules, @NotNull LimitSourceType limitSourceType, int i4, @NotNull String str39, @NotNull String str40, @NotNull String str41) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(limitMemeExchangeDirection, "");
        Intrinsics.checkNotNullParameter(limitMemeQuickRateType, "");
        Intrinsics.checkNotNullParameter(limitOrderSourceType, "");
        Intrinsics.checkNotNullParameter(limitMemeOrderStrategyType, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(limitMemeTriggerCondition, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(tokenInfo2, "");
        Intrinsics.checkNotNullParameter(triggerInfo, "");
        Intrinsics.checkNotNullParameter(dexAutoSlippageInfoParam, "");
        Intrinsics.checkNotNullParameter(limitOrderDetailNetworkFeeInfo, "");
        Intrinsics.checkNotNullParameter(serviceFeeInfo, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(limitOrderDetailProviderInfo, "");
        Intrinsics.checkNotNullParameter(limitOrderDetailTransactionInfo, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(rules, "");
        Intrinsics.checkNotNullParameter(limitSourceType, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        return new OrderDetailResult(str, defiPlatformInfos, str2, str3, str4, fromChildOrderDetailVO, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, z, z2, i, i2, str18, str19, str20, str21, limitMemeExchangeDirection, limitMemeQuickRateType, limitOrderSourceType, limitMemeOrderStrategyType, str22, str23, limitMemeTriggerCondition, str24, str25, str26, str27, str28, list, num, num2, str29, str30, str31, str32, i3, tokenInfo, tokenInfo2, triggerInfo, dexAutoSlippageInfoParam, limitOrderDetailNetworkFeeInfo, serviceFeeInfo, str33, str34, limitOrderDetailProviderInfo, limitOrderDetailTransactionInfo, str35, str36, str37, z3, str38, rules, limitSourceType, i4, str39, str40, str41);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailResult)) {
            return false;
        }
        OrderDetailResult orderDetailResult = (OrderDetailResult) obj;
        return Intrinsics.EZpvd((Object) this.createTime, (Object) orderDetailResult.createTime) && Intrinsics.EZpvd(this.defiPlatformInfo, orderDetailResult.defiPlatformInfo) && Intrinsics.EZpvd((Object) this.expireTime, (Object) orderDetailResult.expireTime) && Intrinsics.EZpvd((Object) this.exploreUrl, (Object) orderDetailResult.exploreUrl) && Intrinsics.EZpvd((Object) this.failureReason, (Object) orderDetailResult.failureReason) && Intrinsics.EZpvd(this.fromChildOrderDetailVO, orderDetailResult.fromChildOrderDetailVO) && Intrinsics.EZpvd((Object) this.orderId, (Object) orderDetailResult.orderId) && Intrinsics.EZpvd((Object) this.price, (Object) orderDetailResult.price) && Intrinsics.EZpvd((Object) this.remainTime, (Object) orderDetailResult.remainTime) && Intrinsics.EZpvd((Object) this.status, (Object) orderDetailResult.status) && Intrinsics.EZpvd((Object) this.surplus, (Object) orderDetailResult.surplus) && Intrinsics.EZpvd((Object) this.surplusUsdValue, (Object) orderDetailResult.surplusUsdValue) && Intrinsics.EZpvd((Object) this.swapTradeType, (Object) orderDetailResult.swapTradeType) && Intrinsics.EZpvd((Object) this.totalGasFee, (Object) orderDetailResult.totalGasFee) && Intrinsics.EZpvd((Object) this.totalGasFeeUsdValue, (Object) orderDetailResult.totalGasFeeUsdValue) && Intrinsics.EZpvd((Object) this.latestTransactionHash, (Object) orderDetailResult.latestTransactionHash) && Intrinsics.EZpvd((Object) this.transactionPrice, (Object) orderDetailResult.transactionPrice) && Intrinsics.EZpvd((Object) this.transactionTime, (Object) orderDetailResult.transactionTime) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) orderDetailResult.userWalletAddress) && this.dealWarnTag == orderDetailResult.dealWarnTag && this.timeoutToast == orderDetailResult.timeoutToast && this.canEdit == orderDetailResult.canEdit && this.canCancel == orderDetailResult.canCancel && Intrinsics.EZpvd((Object) this.slippage, (Object) orderDetailResult.slippage) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) orderDetailResult.priorityFee) && Intrinsics.EZpvd((Object) this.feeToken, (Object) orderDetailResult.feeToken) && Intrinsics.EZpvd((Object) this.preFailureReason, (Object) orderDetailResult.preFailureReason) && this.exchangeDirection == orderDetailResult.exchangeDirection && this.quickRateType == orderDetailResult.quickRateType && this.limitOrderSourceType == orderDetailResult.limitOrderSourceType && this.limitMemeOrderStrategyType == orderDetailResult.limitMemeOrderStrategyType && Intrinsics.EZpvd((Object) this.triggerPrice, (Object) orderDetailResult.triggerPrice) && Intrinsics.EZpvd((Object) this.triggerMarketCapacity, (Object) orderDetailResult.triggerMarketCapacity) && this.triggerCondition == orderDetailResult.triggerCondition && Intrinsics.EZpvd((Object) this.serviceFeeUsd, (Object) orderDetailResult.serviceFeeUsd) && Intrinsics.EZpvd((Object) this.serviceFeeRate, (Object) orderDetailResult.serviceFeeRate) && Intrinsics.EZpvd((Object) this.serviceFee, (Object) orderDetailResult.serviceFee) && Intrinsics.EZpvd((Object) this.serviceFeeTokenSymbol, (Object) orderDetailResult.serviceFeeTokenSymbol) && Intrinsics.EZpvd((Object) this.isDisplayServiceFee, (Object) orderDetailResult.isDisplayServiceFee) && Intrinsics.EZpvd(this.executionHistoryList, orderDetailResult.executionHistoryList) && Intrinsics.EZpvd(this.executionHistoryShowMaxNum, orderDetailResult.executionHistoryShowMaxNum) && Intrinsics.EZpvd(this.isShowExecutionHistoryMaxNum, orderDetailResult.isShowExecutionHistoryMaxNum) && Intrinsics.EZpvd((Object) this.bannerMessage, (Object) orderDetailResult.bannerMessage) && Intrinsics.EZpvd((Object) this.chainId, (Object) orderDetailResult.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) orderDetailResult.chainName) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) orderDetailResult.chainLogoUrl) && this.orderType == orderDetailResult.orderType && Intrinsics.EZpvd(this.fromToken, orderDetailResult.fromToken) && Intrinsics.EZpvd(this.toToken, orderDetailResult.toToken) && Intrinsics.EZpvd(this.triggerInfo, orderDetailResult.triggerInfo) && Intrinsics.EZpvd(this.slippageInfo, orderDetailResult.slippageInfo) && Intrinsics.EZpvd(this.networkFeeInfo, orderDetailResult.networkFeeInfo) && Intrinsics.EZpvd(this.serviceFeeInfo, orderDetailResult.serviceFeeInfo) && Intrinsics.EZpvd((Object) this.routeSelection, (Object) orderDetailResult.routeSelection) && Intrinsics.EZpvd((Object) this.approveMethod, (Object) orderDetailResult.approveMethod) && Intrinsics.EZpvd(this.providerInfo, orderDetailResult.providerInfo) && Intrinsics.EZpvd(this.transactionInfo, orderDetailResult.transactionInfo) && Intrinsics.EZpvd((Object) this.swapDuration, (Object) orderDetailResult.swapDuration) && Intrinsics.EZpvd((Object) this.chainSymbol, (Object) orderDetailResult.chainSymbol) && Intrinsics.EZpvd((Object) this.transactionType, (Object) orderDetailResult.transactionType) && this.canResume == orderDetailResult.canResume && Intrinsics.EZpvd((Object) this.network, (Object) orderDetailResult.network) && Intrinsics.EZpvd(this.tpSlRule, orderDetailResult.tpSlRule) && this.limitSourceType == orderDetailResult.limitSourceType && this.strategyMode == orderDetailResult.strategyMode && Intrinsics.EZpvd((Object) this.strategyId, (Object) orderDetailResult.strategyId) && Intrinsics.EZpvd((Object) this.boostVolume, (Object) orderDetailResult.boostVolume) && Intrinsics.EZpvd((Object) this.boostWeight, (Object) orderDetailResult.boostWeight);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApproveMethod() {
        return this.approveMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBannerMessage() {
        return this.bannerMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoostVolume() {
        return this.boostVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoostWeight() {
        return this.boostWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCanCancel() {
        return this.canCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCanEdit() {
        return this.canEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanResume() {
        return this.canResume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSymbol() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDealWarnTag() {
        return this.dealWarnTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiPlatformInfos getDefiPlatformInfo() {
        return this.defiPlatformInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitMemeExchangeDirection getExchangeDirection() {
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
    public final String getExploreUrl() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailureReason() {
        return this.failureReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeToken() {
        return this.feeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FromChildOrderDetailVO getFromChildOrderDetailVO() {
        return this.fromChildOrderDetailVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLatestTransactionHash() {
        return this.latestTransactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitMemeOrderStrategyType getLimitMemeOrderStrategyType() {
        return this.limitMemeOrderStrategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderSourceType getLimitOrderSourceType() {
        return this.limitOrderSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitSourceType getLimitSourceType() {
        return this.limitSourceType;
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
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreFailureReason() {
        return this.preFailureReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailProviderInfo getProviderInfo() {
        return this.providerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitMemeQuickRateType getQuickRateType() {
        return this.quickRateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainTime() {
        return this.remainTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouteSelection() {
        return this.routeSelection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFee() {
        return this.serviceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFeeInfo() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeRate() {
        return this.serviceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeTokenSymbol() {
        return this.serviceFeeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeUsd() {
        return this.serviceFeeUsd;
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
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrategyMode() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurplus() {
        return this.surplus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurplusUsdValue() {
        return this.surplusUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapDuration() {
        return this.swapDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapTradeType() {
        return this.swapTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTimeoutToast() {
        return this.timeoutToast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalGasFee() {
        return this.totalGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalGasFeeUsdValue() {
        return this.totalGasFeeUsdValue;
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
    public final String getTransactionPrice() {
        return this.transactionPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionTime() {
        return this.transactionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionType() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitMemeTriggerCondition getTriggerCondition() {
        return this.triggerCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TriggerInfo getTriggerInfo() {
        return this.triggerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerMarketCapacity() {
        return this.triggerMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPrice() {
        return this.triggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.createTime.hashCode();
        DefiPlatformInfos defiPlatformInfos = this.defiPlatformInfo;
        int iHashCode2 = defiPlatformInfos == null ? 0 : defiPlatformInfos.hashCode();
        int iHashCode3 = this.expireTime.hashCode();
        int iHashCode4 = this.exploreUrl.hashCode();
        int iHashCode5 = this.failureReason.hashCode();
        FromChildOrderDetailVO fromChildOrderDetailVO = this.fromChildOrderDetailVO;
        int iHashCode6 = fromChildOrderDetailVO == null ? 0 : fromChildOrderDetailVO.hashCode();
        int iHashCode7 = this.orderId.hashCode();
        int iHashCode8 = this.price.hashCode();
        int iHashCode9 = this.remainTime.hashCode();
        int iHashCode10 = this.status.hashCode();
        int iHashCode11 = this.surplus.hashCode();
        int iHashCode12 = this.surplusUsdValue.hashCode();
        int iHashCode13 = this.swapTradeType.hashCode();
        int iHashCode14 = this.totalGasFee.hashCode();
        int iHashCode15 = this.totalGasFeeUsdValue.hashCode();
        int iHashCode16 = this.latestTransactionHash.hashCode();
        int iHashCode17 = this.transactionPrice.hashCode();
        int iHashCode18 = this.transactionTime.hashCode();
        int iHashCode19 = this.userWalletAddress.hashCode();
        int iHashCode20 = Boolean.hashCode(this.dealWarnTag);
        int iHashCode21 = Boolean.hashCode(this.timeoutToast);
        int iHashCode22 = Integer.hashCode(this.canEdit);
        int iHashCode23 = Integer.hashCode(this.canCancel);
        int iHashCode24 = this.slippage.hashCode();
        int iHashCode25 = this.priorityFee.hashCode();
        int iHashCode26 = this.feeToken.hashCode();
        int iHashCode27 = this.preFailureReason.hashCode();
        int iHashCode28 = this.exchangeDirection.hashCode();
        int iHashCode29 = this.quickRateType.hashCode();
        int iHashCode30 = this.limitOrderSourceType.hashCode();
        int iHashCode31 = this.limitMemeOrderStrategyType.hashCode();
        int iHashCode32 = this.triggerPrice.hashCode();
        int iHashCode33 = this.triggerMarketCapacity.hashCode();
        int iHashCode34 = this.triggerCondition.hashCode();
        int iHashCode35 = this.serviceFeeUsd.hashCode();
        int iHashCode36 = this.serviceFeeRate.hashCode();
        int iHashCode37 = this.serviceFee.hashCode();
        int iHashCode38 = this.serviceFeeTokenSymbol.hashCode();
        int iHashCode39 = this.isDisplayServiceFee.hashCode();
        List<ExecutionHistory> list = this.executionHistoryList;
        int iHashCode40 = list == null ? 0 : list.hashCode();
        Integer num = this.executionHistoryShowMaxNum;
        int iHashCode41 = num == null ? 0 : num.hashCode();
        Integer num2 = this.isShowExecutionHistoryMaxNum;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + (num2 == null ? 0 : num2.hashCode())) * 31) + this.bannerMessage.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.chainLogoUrl.hashCode()) * 31) + Integer.hashCode(this.orderType)) * 31) + this.fromToken.hashCode()) * 31) + this.toToken.hashCode()) * 31) + this.triggerInfo.hashCode()) * 31) + this.slippageInfo.hashCode()) * 31) + this.networkFeeInfo.hashCode()) * 31) + this.serviceFeeInfo.hashCode()) * 31) + this.routeSelection.hashCode()) * 31) + this.approveMethod.hashCode()) * 31) + this.providerInfo.hashCode()) * 31) + this.transactionInfo.hashCode()) * 31) + this.swapDuration.hashCode()) * 31) + this.chainSymbol.hashCode()) * 31) + this.transactionType.hashCode()) * 31) + Boolean.hashCode(this.canResume)) * 31) + this.network.hashCode()) * 31) + this.tpSlRule.hashCode()) * 31) + this.limitSourceType.hashCode()) * 31) + Integer.hashCode(this.strategyMode)) * 31) + this.strategyId.hashCode()) * 31) + this.boostVolume.hashCode()) * 31) + this.boostWeight.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isDisplayServiceFee() {
        return this.isDisplayServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isShowExecutionHistoryMaxNum() {
        return this.isShowExecutionHistoryMaxNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.createTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDealWarnTag(boolean z) {
        this.dealWarnTag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefiPlatformInfo(DefiPlatformInfos defiPlatformInfos) {
        this.defiPlatformInfo = defiPlatformInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpireTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expireTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExploreUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.exploreUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailureReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.failureReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromChildOrderDetailVO(FromChildOrderDetailVO fromChildOrderDetailVO) {
        this.fromChildOrderDetailVO = fromChildOrderDetailVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLatestTransactionHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.latestTransactionHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRemainTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.remainTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSurplus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.surplus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSurplusUsdValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.surplusUsdValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwapTradeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.swapTradeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeoutToast(boolean z) {
        this.timeoutToast = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalGasFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalGasFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalGasFeeUsdValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalGasFeeUsdValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransactionPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransactionTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserWalletAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderDetailResult(createTime=" + this.createTime + ", defiPlatformInfo=" + this.defiPlatformInfo + ", expireTime=" + this.expireTime + ", exploreUrl=" + this.exploreUrl + ", failureReason=" + this.failureReason + ", fromChildOrderDetailVO=" + this.fromChildOrderDetailVO + ", orderId=" + this.orderId + ", price=" + this.price + ", remainTime=" + this.remainTime + ", status=" + this.status + ", surplus=" + this.surplus + ", surplusUsdValue=" + this.surplusUsdValue + ", swapTradeType=" + this.swapTradeType + ", totalGasFee=" + this.totalGasFee + ", totalGasFeeUsdValue=" + this.totalGasFeeUsdValue + ", latestTransactionHash=" + this.latestTransactionHash + ", transactionPrice=" + this.transactionPrice + ", transactionTime=" + this.transactionTime + ", userWalletAddress=" + this.userWalletAddress + ", dealWarnTag=" + this.dealWarnTag + ", timeoutToast=" + this.timeoutToast + ", canEdit=" + this.canEdit + ", canCancel=" + this.canCancel + ", slippage=" + this.slippage + ", priorityFee=" + this.priorityFee + ", feeToken=" + this.feeToken + ", preFailureReason=" + this.preFailureReason + ", exchangeDirection=" + this.exchangeDirection + ", quickRateType=" + this.quickRateType + ", limitOrderSourceType=" + this.limitOrderSourceType + ", limitMemeOrderStrategyType=" + this.limitMemeOrderStrategyType + ", triggerPrice=" + this.triggerPrice + ", triggerMarketCapacity=" + this.triggerMarketCapacity + ", triggerCondition=" + this.triggerCondition + ", serviceFeeUsd=" + this.serviceFeeUsd + ", serviceFeeRate=" + this.serviceFeeRate + ", serviceFee=" + this.serviceFee + ", serviceFeeTokenSymbol=" + this.serviceFeeTokenSymbol + ", isDisplayServiceFee=" + this.isDisplayServiceFee + ", executionHistoryList=" + this.executionHistoryList + ", executionHistoryShowMaxNum=" + this.executionHistoryShowMaxNum + ", isShowExecutionHistoryMaxNum=" + this.isShowExecutionHistoryMaxNum + ", bannerMessage=" + this.bannerMessage + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogoUrl=" + this.chainLogoUrl + ", orderType=" + this.orderType + ", fromToken=" + this.fromToken + ", toToken=" + this.toToken + ", triggerInfo=" + this.triggerInfo + ", slippageInfo=" + this.slippageInfo + ", networkFeeInfo=" + this.networkFeeInfo + ", serviceFeeInfo=" + this.serviceFeeInfo + ", routeSelection=" + this.routeSelection + ", approveMethod=" + this.approveMethod + ", providerInfo=" + this.providerInfo + ", transactionInfo=" + this.transactionInfo + ", swapDuration=" + this.swapDuration + ", chainSymbol=" + this.chainSymbol + ", transactionType=" + this.transactionType + ", canResume=" + this.canResume + ", network=" + this.network + ", tpSlRule=" + this.tpSlRule + ", limitSourceType=" + this.limitSourceType + ", strategyMode=" + this.strategyMode + ", strategyId=" + this.strategyId + ", boostVolume=" + this.boostVolume + ", boostWeight=" + this.boostWeight + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderDetailResult> serializer() {
            return OrderDetailResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderDetailResult(int i, int i2, int i3, String str, DefiPlatformInfos defiPlatformInfos, String str2, String str3, String str4, FromChildOrderDetailVO fromChildOrderDetailVO, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z, boolean z2, int i4, int i5, String str18, String str19, String str20, String str21, LimitMemeExchangeDirection limitMemeExchangeDirection, LimitMemeQuickRateType limitMemeQuickRateType, LimitOrderSourceType limitOrderSourceType, LimitMemeOrderStrategyType limitMemeOrderStrategyType, String str22, String str23, LimitMemeTriggerCondition limitMemeTriggerCondition, String str24, String str25, String str26, String str27, String str28, List list, Integer num, Integer num2, String str29, String str30, String str31, String str32, int i6, TokenInfo tokenInfo, TokenInfo tokenInfo2, TriggerInfo triggerInfo, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo, ServiceFeeInfo serviceFeeInfo, String str33, String str34, LimitOrderDetailProviderInfo limitOrderDetailProviderInfo, LimitOrderDetailTransactionInfo limitOrderDetailTransactionInfo, String str35, String str36, String str37, boolean z3, String str38, Rules rules, LimitSourceType limitSourceType, int i7, String str39, String str40, String str41, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str;
        }
        if ((i & 2) == 0) {
            this.defiPlatformInfo = null;
        } else {
            this.defiPlatformInfo = defiPlatformInfos;
        }
        if ((i & 4) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str2;
        }
        if ((i & 8) == 0) {
            this.exploreUrl = "";
        } else {
            this.exploreUrl = str3;
        }
        if ((i & 16) == 0) {
            this.failureReason = "";
        } else {
            this.failureReason = str4;
        }
        if ((i & 32) == 0) {
            this.fromChildOrderDetailVO = null;
        } else {
            this.fromChildOrderDetailVO = fromChildOrderDetailVO;
        }
        if ((i & 64) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str5;
        }
        if ((i & 128) == 0) {
            this.price = "";
        } else {
            this.price = str6;
        }
        if ((i & 256) == 0) {
            this.remainTime = "";
        } else {
            this.remainTime = str7;
        }
        if ((i & 512) == 0) {
            this.status = "";
        } else {
            this.status = str8;
        }
        if ((i & 1024) == 0) {
            this.surplus = "";
        } else {
            this.surplus = str9;
        }
        if ((i & 2048) == 0) {
            this.surplusUsdValue = "";
        } else {
            this.surplusUsdValue = str10;
        }
        if ((i & 4096) == 0) {
            this.swapTradeType = "";
        } else {
            this.swapTradeType = str11;
        }
        if ((i & 8192) == 0) {
            this.totalGasFee = "";
        } else {
            this.totalGasFee = str12;
        }
        if ((i & 16384) == 0) {
            this.totalGasFeeUsdValue = "";
        } else {
            this.totalGasFeeUsdValue = str13;
        }
        if ((i & 32768) == 0) {
            this.latestTransactionHash = "";
        } else {
            this.latestTransactionHash = str14;
        }
        if ((i & 65536) == 0) {
            this.transactionPrice = "";
        } else {
            this.transactionPrice = str15;
        }
        if ((i & 131072) == 0) {
            this.transactionTime = "";
        } else {
            this.transactionTime = str16;
        }
        if ((i & 262144) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str17;
        }
        if ((524288 & i) == 0) {
            this.dealWarnTag = false;
        } else {
            this.dealWarnTag = z;
        }
        if ((1048576 & i) == 0) {
            this.timeoutToast = false;
        } else {
            this.timeoutToast = z2;
        }
        this.canEdit = (2097152 & i) == 0 ? LimitOrderEditStatus.NonEditable.getValue() : i4;
        this.canCancel = (4194304 & i) == 0 ? LimitOrderCancelStatus.NonCancellable.getValue() : i5;
        if ((8388608 & i) == 0) {
            this.slippage = "";
        } else {
            this.slippage = str18;
        }
        if ((16777216 & i) == 0) {
            this.priorityFee = "";
        } else {
            this.priorityFee = str19;
        }
        if ((33554432 & i) == 0) {
            this.feeToken = "";
        } else {
            this.feeToken = str20;
        }
        if ((67108864 & i) == 0) {
            this.preFailureReason = "";
        } else {
            this.preFailureReason = str21;
        }
        this.exchangeDirection = (134217728 & i) == 0 ? LimitMemeExchangeDirection.BUY : limitMemeExchangeDirection;
        this.quickRateType = (268435456 & i) == 0 ? LimitMemeQuickRateType.NORMAL : limitMemeQuickRateType;
        this.limitOrderSourceType = (536870912 & i) == 0 ? LimitOrderSourceType.ADVANCED_LIMIT_ORDER : limitOrderSourceType;
        this.limitMemeOrderStrategyType = (1073741824 & i) == 0 ? LimitMemeOrderStrategyType.BUY_DIP : limitMemeOrderStrategyType;
        if ((i & Integer.MIN_VALUE) == 0) {
            this.triggerPrice = "";
        } else {
            this.triggerPrice = str22;
        }
        if ((i2 & 1) == 0) {
            this.triggerMarketCapacity = "";
        } else {
            this.triggerMarketCapacity = str23;
        }
        this.triggerCondition = (i2 & 2) == 0 ? LimitMemeTriggerCondition.PRICE_CAPACITY : limitMemeTriggerCondition;
        if ((i2 & 4) == 0) {
            this.serviceFeeUsd = "";
        } else {
            this.serviceFeeUsd = str24;
        }
        if ((i2 & 8) == 0) {
            this.serviceFeeRate = "";
        } else {
            this.serviceFeeRate = str25;
        }
        if ((i2 & 16) == 0) {
            this.serviceFee = "";
        } else {
            this.serviceFee = str26;
        }
        if ((i2 & 32) == 0) {
            this.serviceFeeTokenSymbol = "";
        } else {
            this.serviceFeeTokenSymbol = str27;
        }
        if ((i2 & 64) == 0) {
            this.isDisplayServiceFee = "";
        } else {
            this.isDisplayServiceFee = str28;
        }
        if ((i2 & 128) == 0) {
            this.executionHistoryList = null;
        } else {
            this.executionHistoryList = list;
        }
        if ((i2 & 256) == 0) {
            this.executionHistoryShowMaxNum = null;
        } else {
            this.executionHistoryShowMaxNum = num;
        }
        if ((i2 & 512) == 0) {
            this.isShowExecutionHistoryMaxNum = null;
        } else {
            this.isShowExecutionHistoryMaxNum = num2;
        }
        if ((i2 & 1024) == 0) {
            this.bannerMessage = "";
        } else {
            this.bannerMessage = str29;
        }
        if ((i2 & 2048) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str30;
        }
        if ((i2 & 4096) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str31;
        }
        if ((i2 & 8192) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str32;
        }
        this.orderType = (i2 & 16384) == 0 ? -1 : i6;
        this.fromToken = (i2 & 32768) == 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo;
        this.toToken = (i2 & 65536) == 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo2;
        this.triggerInfo = (i2 & 131072) == 0 ? new TriggerInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : triggerInfo;
        this.slippageInfo = (i2 & 262144) == 0 ? new DexAutoSlippageInfoParam((String) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 16383, (DefaultConstructorMarker) null) : dexAutoSlippageInfoParam;
        this.networkFeeInfo = (524288 & i2) == 0 ? new LimitOrderDetailNetworkFeeInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null) : limitOrderDetailNetworkFeeInfo;
        this.serviceFeeInfo = (1048576 & i2) == 0 ? new ServiceFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null) : serviceFeeInfo;
        if ((2097152 & i2) == 0) {
            this.routeSelection = "";
        } else {
            this.routeSelection = str33;
        }
        if ((4194304 & i2) == 0) {
            this.approveMethod = "";
        } else {
            this.approveMethod = str34;
        }
        this.providerInfo = (8388608 & i2) == 0 ? new LimitOrderDetailProviderInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null) : limitOrderDetailProviderInfo;
        this.transactionInfo = (16777216 & i2) == 0 ? new LimitOrderDetailTransactionInfo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : limitOrderDetailTransactionInfo;
        if ((33554432 & i2) == 0) {
            this.swapDuration = "";
        } else {
            this.swapDuration = str35;
        }
        if ((67108864 & i2) == 0) {
            this.chainSymbol = "";
        } else {
            this.chainSymbol = str36;
        }
        if ((134217728 & i2) == 0) {
            this.transactionType = "";
        } else {
            this.transactionType = str37;
        }
        if ((268435456 & i2) == 0) {
            this.canResume = false;
        } else {
            this.canResume = z3;
        }
        if ((536870912 & i2) == 0) {
            this.network = "";
        } else {
            this.network = str38;
        }
        this.tpSlRule = (1073741824 & i2) == 0 ? new Rules(0, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : rules;
        this.limitSourceType = (Integer.MIN_VALUE & i2) == 0 ? LimitSourceType.SWAP : limitSourceType;
        if ((i3 & 1) == 0) {
            this.strategyMode = 0;
        } else {
            this.strategyMode = i7;
        }
        if ((i3 & 2) == 0) {
            this.strategyId = "";
        } else {
            this.strategyId = str39;
        }
        if ((i3 & 4) == 0) {
            this.boostVolume = "";
        } else {
            this.boostVolume = str40;
        }
        if ((i3 & 8) == 0) {
            this.boostWeight = "";
        } else {
            this.boostWeight = str41;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [215=18] */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(OrderDetailResult orderDetailResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) orderDetailResult.createTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, orderDetailResult.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || orderDetailResult.defiPlatformInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DefiPlatformInfos$$serializer.INSTANCE, orderDetailResult.defiPlatformInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) orderDetailResult.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, orderDetailResult.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) orderDetailResult.exploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, orderDetailResult.exploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) orderDetailResult.failureReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, orderDetailResult.failureReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || orderDetailResult.fromChildOrderDetailVO != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, FromChildOrderDetailVO$$serializer.INSTANCE, orderDetailResult.fromChildOrderDetailVO);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) orderDetailResult.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, orderDetailResult.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) orderDetailResult.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, orderDetailResult.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) orderDetailResult.remainTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, orderDetailResult.remainTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) orderDetailResult.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, orderDetailResult.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) orderDetailResult.surplus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, orderDetailResult.surplus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) orderDetailResult.surplusUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, orderDetailResult.surplusUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) orderDetailResult.swapTradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, orderDetailResult.swapTradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) orderDetailResult.totalGasFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, orderDetailResult.totalGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) orderDetailResult.totalGasFeeUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, orderDetailResult.totalGasFeeUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) orderDetailResult.latestTransactionHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, orderDetailResult.latestTransactionHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) orderDetailResult.transactionPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, orderDetailResult.transactionPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) orderDetailResult.transactionTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, orderDetailResult.transactionTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) orderDetailResult.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, orderDetailResult.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || orderDetailResult.dealWarnTag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 19, orderDetailResult.dealWarnTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || orderDetailResult.timeoutToast) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 20, orderDetailResult.timeoutToast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || orderDetailResult.canEdit != LimitOrderEditStatus.NonEditable.getValue()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 21, orderDetailResult.canEdit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || orderDetailResult.canCancel != LimitOrderCancelStatus.NonCancellable.getValue()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 22, orderDetailResult.canCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) orderDetailResult.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, orderDetailResult.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) orderDetailResult.priorityFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, orderDetailResult.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) orderDetailResult.feeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, orderDetailResult.feeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) orderDetailResult.preFailureReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, orderDetailResult.preFailureReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || orderDetailResult.exchangeDirection != LimitMemeExchangeDirection.BUY) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 27, kSerializerArr[27], orderDetailResult.exchangeDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || orderDetailResult.quickRateType != LimitMemeQuickRateType.NORMAL) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 28, kSerializerArr[28], orderDetailResult.quickRateType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || orderDetailResult.limitOrderSourceType != LimitOrderSourceType.ADVANCED_LIMIT_ORDER) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 29, kSerializerArr[29], orderDetailResult.limitOrderSourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || orderDetailResult.limitMemeOrderStrategyType != LimitMemeOrderStrategyType.BUY_DIP) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 30, kSerializerArr[30], orderDetailResult.limitMemeOrderStrategyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) orderDetailResult.triggerPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, orderDetailResult.triggerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) orderDetailResult.triggerMarketCapacity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, orderDetailResult.triggerMarketCapacity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || orderDetailResult.triggerCondition != LimitMemeTriggerCondition.PRICE_CAPACITY) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 33, kSerializerArr[33], orderDetailResult.triggerCondition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) orderDetailResult.serviceFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, orderDetailResult.serviceFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) orderDetailResult.serviceFeeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, orderDetailResult.serviceFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) orderDetailResult.serviceFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, orderDetailResult.serviceFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) orderDetailResult.serviceFeeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, orderDetailResult.serviceFeeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) orderDetailResult.isDisplayServiceFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, orderDetailResult.isDisplayServiceFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || orderDetailResult.executionHistoryList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, kSerializerArr[39], orderDetailResult.executionHistoryList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || orderDetailResult.executionHistoryShowMaxNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, IntSerializer.INSTANCE, orderDetailResult.executionHistoryShowMaxNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || orderDetailResult.isShowExecutionHistoryMaxNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, IntSerializer.INSTANCE, orderDetailResult.isShowExecutionHistoryMaxNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) orderDetailResult.bannerMessage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, orderDetailResult.bannerMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) orderDetailResult.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, orderDetailResult.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) orderDetailResult.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, orderDetailResult.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) orderDetailResult.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, orderDetailResult.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || orderDetailResult.orderType != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 46, orderDetailResult.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd(orderDetailResult.fromToken, new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 47, TokenInfo$$serializer.INSTANCE, orderDetailResult.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd(orderDetailResult.toToken, new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 48, TokenInfo$$serializer.INSTANCE, orderDetailResult.toToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd(orderDetailResult.triggerInfo, new TriggerInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 49, TriggerInfo$$serializer.INSTANCE, orderDetailResult.triggerInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd(orderDetailResult.slippageInfo, new DexAutoSlippageInfoParam((String) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 16383, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 50, DexAutoSlippageInfoParam$$serializer.INSTANCE, orderDetailResult.slippageInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd(orderDetailResult.networkFeeInfo, new LimitOrderDetailNetworkFeeInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 51, LimitOrderDetailNetworkFeeInfo$$serializer.INSTANCE, orderDetailResult.networkFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd(orderDetailResult.serviceFeeInfo, new ServiceFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 52, ServiceFeeInfo$$serializer.INSTANCE, orderDetailResult.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) orderDetailResult.routeSelection, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, orderDetailResult.routeSelection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) orderDetailResult.approveMethod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, orderDetailResult.approveMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd(orderDetailResult.providerInfo, new LimitOrderDetailProviderInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 55, LimitOrderDetailProviderInfo$$serializer.INSTANCE, orderDetailResult.providerInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd(orderDetailResult.transactionInfo, new LimitOrderDetailTransactionInfo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 56, LimitOrderDetailTransactionInfo$$serializer.INSTANCE, orderDetailResult.transactionInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) orderDetailResult.swapDuration, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, orderDetailResult.swapDuration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) orderDetailResult.chainSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, orderDetailResult.chainSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) orderDetailResult.transactionType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, orderDetailResult.transactionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || orderDetailResult.canResume) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 60, orderDetailResult.canResume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) orderDetailResult.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, orderDetailResult.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd(orderDetailResult.tpSlRule, new Rules(0, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 62, Rules$$serializer.INSTANCE, orderDetailResult.tpSlRule);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || orderDetailResult.limitSourceType != LimitSourceType.SWAP) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 63, kSerializerArr[63], orderDetailResult.limitSourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || orderDetailResult.strategyMode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 64, orderDetailResult.strategyMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || !Intrinsics.EZpvd((Object) orderDetailResult.strategyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 65, orderDetailResult.strategyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || !Intrinsics.EZpvd((Object) orderDetailResult.boostVolume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 66, orderDetailResult.boostVolume);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) && Intrinsics.EZpvd((Object) orderDetailResult.boostWeight, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 67, orderDetailResult.boostWeight);
    }

    public OrderDetailResult(@NotNull String str, DefiPlatformInfos defiPlatformInfos, @NotNull String str2, @NotNull String str3, @NotNull String str4, FromChildOrderDetailVO fromChildOrderDetailVO, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, boolean z, boolean z2, int i, int i2, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull LimitMemeExchangeDirection limitMemeExchangeDirection, @NotNull LimitMemeQuickRateType limitMemeQuickRateType, @NotNull LimitOrderSourceType limitOrderSourceType, @NotNull LimitMemeOrderStrategyType limitMemeOrderStrategyType, @NotNull String str22, @NotNull String str23, @NotNull LimitMemeTriggerCondition limitMemeTriggerCondition, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, List<ExecutionHistory> list, Integer num, Integer num2, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, int i3, @NotNull TokenInfo tokenInfo, @NotNull TokenInfo tokenInfo2, @NotNull TriggerInfo triggerInfo, @NotNull DexAutoSlippageInfoParam dexAutoSlippageInfoParam, @NotNull LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo, @NotNull ServiceFeeInfo serviceFeeInfo, @NotNull String str33, @NotNull String str34, @NotNull LimitOrderDetailProviderInfo limitOrderDetailProviderInfo, @NotNull LimitOrderDetailTransactionInfo limitOrderDetailTransactionInfo, @NotNull String str35, @NotNull String str36, @NotNull String str37, boolean z3, @NotNull String str38, @NotNull Rules rules, @NotNull LimitSourceType limitSourceType, int i4, @NotNull String str39, @NotNull String str40, @NotNull String str41) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(limitMemeExchangeDirection, "");
        Intrinsics.checkNotNullParameter(limitMemeQuickRateType, "");
        Intrinsics.checkNotNullParameter(limitOrderSourceType, "");
        Intrinsics.checkNotNullParameter(limitMemeOrderStrategyType, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(limitMemeTriggerCondition, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(tokenInfo2, "");
        Intrinsics.checkNotNullParameter(triggerInfo, "");
        Intrinsics.checkNotNullParameter(dexAutoSlippageInfoParam, "");
        Intrinsics.checkNotNullParameter(limitOrderDetailNetworkFeeInfo, "");
        Intrinsics.checkNotNullParameter(serviceFeeInfo, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(limitOrderDetailProviderInfo, "");
        Intrinsics.checkNotNullParameter(limitOrderDetailTransactionInfo, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(rules, "");
        Intrinsics.checkNotNullParameter(limitSourceType, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        this.createTime = str;
        this.defiPlatformInfo = defiPlatformInfos;
        this.expireTime = str2;
        this.exploreUrl = str3;
        this.failureReason = str4;
        this.fromChildOrderDetailVO = fromChildOrderDetailVO;
        this.orderId = str5;
        this.price = str6;
        this.remainTime = str7;
        this.status = str8;
        this.surplus = str9;
        this.surplusUsdValue = str10;
        this.swapTradeType = str11;
        this.totalGasFee = str12;
        this.totalGasFeeUsdValue = str13;
        this.latestTransactionHash = str14;
        this.transactionPrice = str15;
        this.transactionTime = str16;
        this.userWalletAddress = str17;
        this.dealWarnTag = z;
        this.timeoutToast = z2;
        this.canEdit = i;
        this.canCancel = i2;
        this.slippage = str18;
        this.priorityFee = str19;
        this.feeToken = str20;
        this.preFailureReason = str21;
        this.exchangeDirection = limitMemeExchangeDirection;
        this.quickRateType = limitMemeQuickRateType;
        this.limitOrderSourceType = limitOrderSourceType;
        this.limitMemeOrderStrategyType = limitMemeOrderStrategyType;
        this.triggerPrice = str22;
        this.triggerMarketCapacity = str23;
        this.triggerCondition = limitMemeTriggerCondition;
        this.serviceFeeUsd = str24;
        this.serviceFeeRate = str25;
        this.serviceFee = str26;
        this.serviceFeeTokenSymbol = str27;
        this.isDisplayServiceFee = str28;
        this.executionHistoryList = list;
        this.executionHistoryShowMaxNum = num;
        this.isShowExecutionHistoryMaxNum = num2;
        this.bannerMessage = str29;
        this.chainId = str30;
        this.chainName = str31;
        this.chainLogoUrl = str32;
        this.orderType = i3;
        this.fromToken = tokenInfo;
        this.toToken = tokenInfo2;
        this.triggerInfo = triggerInfo;
        this.slippageInfo = dexAutoSlippageInfoParam;
        this.networkFeeInfo = limitOrderDetailNetworkFeeInfo;
        this.serviceFeeInfo = serviceFeeInfo;
        this.routeSelection = str33;
        this.approveMethod = str34;
        this.providerInfo = limitOrderDetailProviderInfo;
        this.transactionInfo = limitOrderDetailTransactionInfo;
        this.swapDuration = str35;
        this.chainSymbol = str36;
        this.transactionType = str37;
        this.canResume = z3;
        this.network = str38;
        this.tpSlRule = rules;
        this.limitSourceType = limitSourceType;
        this.strategyMode = i4;
        this.strategyId = str39;
        this.boostVolume = str40;
        this.boostWeight = str41;
    }

    public /* synthetic */ OrderDetailResult(String str, DefiPlatformInfos defiPlatformInfos, String str2, String str3, String str4, FromChildOrderDetailVO fromChildOrderDetailVO, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z, boolean z2, int i, int i2, String str18, String str19, String str20, String str21, LimitMemeExchangeDirection limitMemeExchangeDirection, LimitMemeQuickRateType limitMemeQuickRateType, LimitOrderSourceType limitOrderSourceType, LimitMemeOrderStrategyType limitMemeOrderStrategyType, String str22, String str23, LimitMemeTriggerCondition limitMemeTriggerCondition, String str24, String str25, String str26, String str27, String str28, List list, Integer num, Integer num2, String str29, String str30, String str31, String str32, int i3, TokenInfo tokenInfo, TokenInfo tokenInfo2, TriggerInfo triggerInfo, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo, ServiceFeeInfo serviceFeeInfo, String str33, String str34, LimitOrderDetailProviderInfo limitOrderDetailProviderInfo, LimitOrderDetailTransactionInfo limitOrderDetailTransactionInfo, String str35, String str36, String str37, boolean z3, String str38, Rules rules, LimitSourceType limitSourceType, int i4, String str39, String str40, String str41, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        int i8;
        String str42;
        String str43;
        LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo2;
        LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo3;
        ServiceFeeInfo serviceFeeInfo2;
        String str44;
        LimitOrderDetailProviderInfo limitOrderDetailProviderInfo2;
        String str45 = (i5 & 1) != 0 ? "" : str;
        DefiPlatformInfos defiPlatformInfos2 = (i5 & 2) != 0 ? null : defiPlatformInfos;
        String str46 = (i5 & 4) != 0 ? "" : str2;
        String str47 = (i5 & 8) != 0 ? "" : str3;
        String str48 = (i5 & 16) != 0 ? "" : str4;
        FromChildOrderDetailVO fromChildOrderDetailVO2 = (i5 & 32) != 0 ? null : fromChildOrderDetailVO;
        String str49 = (i5 & 64) != 0 ? "" : str5;
        String str50 = (i5 & 128) != 0 ? "" : str6;
        String str51 = (i5 & 256) != 0 ? "" : str7;
        String str52 = (i5 & 512) != 0 ? "" : str8;
        String str53 = (i5 & 1024) != 0 ? "" : str9;
        String str54 = (i5 & 2048) != 0 ? "" : str10;
        String str55 = (i5 & 4096) != 0 ? "" : str11;
        String str56 = (i5 & 8192) != 0 ? "" : str12;
        String str57 = (i5 & 16384) != 0 ? "" : str13;
        String str58 = (i5 & 32768) != 0 ? "" : str14;
        String str59 = (i5 & 65536) != 0 ? "" : str15;
        String str60 = (i5 & 131072) != 0 ? "" : str16;
        String str61 = (i5 & 262144) != 0 ? "" : str17;
        boolean z4 = (i5 & 524288) != 0 ? false : z;
        boolean z5 = (i5 & 1048576) != 0 ? false : z2;
        int value = (i5 & 2097152) != 0 ? LimitOrderEditStatus.NonEditable.getValue() : i;
        int value2 = (i5 & 4194304) != 0 ? LimitOrderCancelStatus.NonCancellable.getValue() : i2;
        String str62 = (i5 & 8388608) != 0 ? "" : str18;
        String str63 = (i5 & 16777216) != 0 ? "" : str19;
        String str64 = (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str20;
        String str65 = (i5 & 67108864) != 0 ? "" : str21;
        LimitMemeExchangeDirection limitMemeExchangeDirection2 = (i5 & 134217728) != 0 ? LimitMemeExchangeDirection.BUY : limitMemeExchangeDirection;
        LimitMemeQuickRateType limitMemeQuickRateType2 = (i5 & 268435456) != 0 ? LimitMemeQuickRateType.NORMAL : limitMemeQuickRateType;
        LimitOrderSourceType limitOrderSourceType2 = (i5 & 536870912) != 0 ? LimitOrderSourceType.ADVANCED_LIMIT_ORDER : limitOrderSourceType;
        LimitMemeOrderStrategyType limitMemeOrderStrategyType2 = (i5 & 1073741824) != 0 ? LimitMemeOrderStrategyType.BUY_DIP : limitMemeOrderStrategyType;
        String str66 = (i5 & Integer.MIN_VALUE) != 0 ? "" : str22;
        String str67 = (i6 & 1) != 0 ? "" : str23;
        LimitMemeTriggerCondition limitMemeTriggerCondition2 = (i6 & 2) != 0 ? LimitMemeTriggerCondition.PRICE_CAPACITY : limitMemeTriggerCondition;
        String str68 = (i6 & 4) != 0 ? "" : str24;
        String str69 = (i6 & 8) != 0 ? "" : str25;
        String str70 = (i6 & 16) != 0 ? "" : str26;
        String str71 = (i6 & 32) != 0 ? "" : str27;
        String str72 = (i6 & 64) != 0 ? "" : str28;
        String str73 = str66;
        List list2 = (i6 & 128) != 0 ? null : list;
        Integer num3 = (i6 & 256) != 0 ? null : num;
        Integer num4 = (i6 & 512) != 0 ? null : num2;
        String str74 = (i6 & 1024) != 0 ? "" : str29;
        String str75 = (i6 & 2048) != 0 ? "" : str30;
        String str76 = (i6 & 4096) != 0 ? "" : str31;
        String str77 = (i6 & 8192) != 0 ? "" : str32;
        int i9 = (i6 & 16384) != 0 ? -1 : i3;
        TokenInfo tokenInfo3 = (i6 & 32768) != 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo;
        TokenInfo tokenInfo4 = (i6 & 65536) != 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo2;
        TriggerInfo triggerInfo2 = (i6 & 131072) != 0 ? new TriggerInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : triggerInfo;
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam2 = (i6 & 262144) != 0 ? new DexAutoSlippageInfoParam((String) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 16383, (DefaultConstructorMarker) null) : dexAutoSlippageInfoParam;
        if ((i6 & 524288) != 0) {
            i8 = i9;
            str42 = str57;
            str43 = str55;
            limitOrderDetailNetworkFeeInfo2 = new LimitOrderDetailNetworkFeeInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            i8 = i9;
            str42 = str57;
            str43 = str55;
            limitOrderDetailNetworkFeeInfo2 = limitOrderDetailNetworkFeeInfo;
        }
        ServiceFeeInfo serviceFeeInfo3 = (1048576 & i6) != 0 ? new ServiceFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null) : serviceFeeInfo;
        String str78 = (2097152 & i6) != 0 ? "" : str33;
        String str79 = (i6 & 4194304) != 0 ? "" : str34;
        if ((i6 & 8388608) != 0) {
            str44 = str78;
            serviceFeeInfo2 = serviceFeeInfo3;
            limitOrderDetailNetworkFeeInfo3 = limitOrderDetailNetworkFeeInfo2;
            limitOrderDetailProviderInfo2 = new LimitOrderDetailProviderInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            limitOrderDetailNetworkFeeInfo3 = limitOrderDetailNetworkFeeInfo2;
            serviceFeeInfo2 = serviceFeeInfo3;
            str44 = str78;
            limitOrderDetailProviderInfo2 = limitOrderDetailProviderInfo;
        }
        this(str45, defiPlatformInfos2, str46, str47, str48, fromChildOrderDetailVO2, str49, str50, str51, str52, str53, str54, str43, str56, str42, str58, str59, str60, str61, z4, z5, value, value2, str62, str63, str64, str65, limitMemeExchangeDirection2, limitMemeQuickRateType2, limitOrderSourceType2, limitMemeOrderStrategyType2, str73, str67, limitMemeTriggerCondition2, str68, str69, str70, str71, str72, list2, num3, num4, str74, str75, str76, str77, i8, tokenInfo3, tokenInfo4, triggerInfo2, dexAutoSlippageInfoParam2, limitOrderDetailNetworkFeeInfo3, serviceFeeInfo2, str44, str79, limitOrderDetailProviderInfo2, (16777216 & i6) != 0 ? new LimitOrderDetailTransactionInfo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : limitOrderDetailTransactionInfo, (33554432 & i6) != 0 ? "" : str35, (i6 & 67108864) != 0 ? "" : str36, (i6 & 134217728) != 0 ? "" : str37, (i6 & 268435456) != 0 ? false : z3, (i6 & 536870912) != 0 ? "" : str38, (i6 & 1073741824) != 0 ? new Rules(0, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : rules, (i6 & Integer.MIN_VALUE) != 0 ? LimitSourceType.SWAP : limitSourceType, (i7 & 1) == 0 ? i4 : 0, (i7 & 2) != 0 ? "" : str39, (i7 & 4) != 0 ? "" : str40, (i7 & 8) != 0 ? "" : str41);
    }

    public final boolean showExecutionHistoryMaxNum() {
        List<ExecutionHistory> list;
        return (this.executionHistoryShowMaxNum == null || (list = this.executionHistoryList) == null || list.size() < this.executionHistoryShowMaxNum.intValue()) ? false : true;
    }

    public final boolean isOutTime() {
        return Intrinsics.EZpvd((Object) this.status, (Object) String.valueOf(OrderSubStatus.Pending.getStatus())) && this.timeoutToast;
    }

    public final long getLeftTimeBy5Minute() {
        objSubCheckS$default = C23313hvq.OLrzqt(this.remainTime, 0) ? 300000L : C23313hvq.subCheckS$default(C23313hvq.addCheckS$default(C23313hvq.addCheckS$default(this.createTime, objSubCheckS$default, null, null, null, 14, null), this.remainTime, null, null, null, 14, null), Long.valueOf(System.currentTimeMillis()), null, null, null, 14, null);
        if (C23313hvq.valueOf(objSubCheckS$default, 0)) {
            return 0L;
        }
        return C33129mqd.valueOf(objSubCheckS$default);
    }

    public final boolean isOutOfTimeBy5Minute() {
        return C23313hvq.valueOf(Long.valueOf(getLeftTimeBy5Minute()), 0) && Intrinsics.EZpvd((Object) this.status, (Object) String.valueOf(OrderSubStatus.Pending.getStatus()));
    }

    public final boolean walletSupportTrade(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(str).fARcdN();
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = interfaceC23194htdFARcdN.AEQbTJ();
        FromChildOrderDetailVO fromChildOrderDetailVO = this.fromChildOrderDetailVO;
        String fromChainId = fromChildOrderDetailVO != null ? fromChildOrderDetailVO.getFromChainId() : null;
        if (fromChainId == null) {
            fromChainId = "";
        }
        FromChildOrderDetailVO fromChildOrderDetailVO2 = this.fromChildOrderDetailVO;
        String toChainId = fromChildOrderDetailVO2 != null ? fromChildOrderDetailVO2.getToChainId() : null;
        String str2 = toChainId != null ? toChainId : "";
        if (interfaceC9738bbJAEQbTJ != null) {
            return interfaceC23194htdFARcdN.OLrzqt(interfaceC9738bbJAEQbTJ, fromChainId, Intrinsics.EZpvd((Object) fromChainId, (Object) str2));
        }
        return false;
    }
}
