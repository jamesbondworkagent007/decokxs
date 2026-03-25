package com.okinc.business.dexlogic.main.limmitorder.bean;

import androidx.core.app.FrameMetricsAggregator;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dexlogic.bean.DefiPlatformInfos;
import com.okinc.business.dexlogic.bean.DefiPlatformInfos$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class LimitState {
    private final String bannerMessage;
    private final int canCancel;
    private final int canEdit;
    private final String createTime;
    private final boolean dealWarnTag;
    private DefiPlatformInfos defiPlatformInfo;
    private final List<ExecutionHistory> executionHistoryList;
    private final Integer executionHistoryShowMaxNum;
    private final String expireTime;
    private final String exploreUrl;
    private final String failureReason;
    private final String feeToken;
    private FromChildOrderDetailVO fromChildOrderDetailVO;
    private final String isDisplayServiceFee;
    private final Integer isShowExecutionHistoryMaxNum;
    private final String latestTransactionHash;
    private final String orderId;
    private final String preFailureReason;
    private final String price;
    private final String priorityFee;
    private final Integer quickRateType;
    private final String remainTime;
    private final String serviceFee;
    private final String serviceFeeRate;
    private final String serviceFeeTokenSymbol;
    private final String serviceFeeUsd;
    private final String slippage;
    private final String status;
    private final String submitToast;
    private final String surplus;
    private final String surplusUsdValue;
    private final String swapTradeType;
    private final boolean timeoutToast;
    private final String totalGasFee;
    private final String totalGasFeeUsdValue;
    private final String totalReceiveAmount;
    private final String transactionPrice;
    private final String transactionTime;
    private final Integer triggerCondition;
    private final String type;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(ExecutionHistory$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitState() {
        this((String) null, (String) null, (String) null, (String) null, (DefiPlatformInfos) null, (FromChildOrderDetailVO) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, 0, 0, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Integer) null, (Integer) null, (String) null, -1, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
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

    @SerialName("executionHistoryList")
    public static /* synthetic */ void getExecutionHistoryList$annotations() {
    }

    @SerialName("executionHistoryShowMaxNum")
    public static /* synthetic */ void getExecutionHistoryShowMaxNum$annotations() {
    }

    @SerialName("feeToken")
    public static /* synthetic */ void getFeeToken$annotations() {
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
        return this.submitToast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.surplus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.surplusUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.swapTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.totalGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.totalGasFeeUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.latestTransactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.transactionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.transactionPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.dealWarnTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.timeoutToast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component24() {
        return this.canEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component25() {
        return this.canCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.feeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.preFailureReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component30() {
        return this.quickRateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component31() {
        return this.triggerCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.totalReceiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.serviceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.serviceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.serviceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.serviceFeeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.isDisplayServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExecutionHistory> component38() {
        return this.executionHistoryList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component39() {
        return this.executionHistoryShowMaxNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.failureReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component40() {
        return this.isShowExecutionHistoryMaxNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.bannerMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiPlatformInfos component5() {
        return this.defiPlatformInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FromChildOrderDetailVO component6() {
        return this.fromChildOrderDetailVO;
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
    public final LimitState copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull DefiPlatformInfos defiPlatformInfos, FromChildOrderDetailVO fromChildOrderDetailVO, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, boolean z, boolean z2, int i, int i2, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, Integer num, Integer num2, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, List<ExecutionHistory> list, Integer num3, Integer num4, @NotNull String str30) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(defiPlatformInfos, "");
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
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        return new LimitState(str, str2, str3, str4, defiPlatformInfos, fromChildOrderDetailVO, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, z, z2, i, i2, str20, str21, str22, str23, num, num2, str24, str25, str26, str27, str28, str29, list, num3, num4, str30);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitState)) {
            return false;
        }
        LimitState limitState = (LimitState) obj;
        return Intrinsics.EZpvd((Object) this.createTime, (Object) limitState.createTime) && Intrinsics.EZpvd((Object) this.expireTime, (Object) limitState.expireTime) && Intrinsics.EZpvd((Object) this.exploreUrl, (Object) limitState.exploreUrl) && Intrinsics.EZpvd((Object) this.failureReason, (Object) limitState.failureReason) && Intrinsics.EZpvd(this.defiPlatformInfo, limitState.defiPlatformInfo) && Intrinsics.EZpvd(this.fromChildOrderDetailVO, limitState.fromChildOrderDetailVO) && Intrinsics.EZpvd((Object) this.orderId, (Object) limitState.orderId) && Intrinsics.EZpvd((Object) this.price, (Object) limitState.price) && Intrinsics.EZpvd((Object) this.remainTime, (Object) limitState.remainTime) && Intrinsics.EZpvd((Object) this.status, (Object) limitState.status) && Intrinsics.EZpvd((Object) this.submitToast, (Object) limitState.submitToast) && Intrinsics.EZpvd((Object) this.surplus, (Object) limitState.surplus) && Intrinsics.EZpvd((Object) this.surplusUsdValue, (Object) limitState.surplusUsdValue) && Intrinsics.EZpvd((Object) this.swapTradeType, (Object) limitState.swapTradeType) && Intrinsics.EZpvd((Object) this.totalGasFee, (Object) limitState.totalGasFee) && Intrinsics.EZpvd((Object) this.totalGasFeeUsdValue, (Object) limitState.totalGasFeeUsdValue) && Intrinsics.EZpvd((Object) this.latestTransactionHash, (Object) limitState.latestTransactionHash) && Intrinsics.EZpvd((Object) this.transactionTime, (Object) limitState.transactionTime) && Intrinsics.EZpvd((Object) this.transactionPrice, (Object) limitState.transactionPrice) && Intrinsics.EZpvd((Object) this.type, (Object) limitState.type) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) limitState.userWalletAddress) && this.dealWarnTag == limitState.dealWarnTag && this.timeoutToast == limitState.timeoutToast && this.canEdit == limitState.canEdit && this.canCancel == limitState.canCancel && Intrinsics.EZpvd((Object) this.slippage, (Object) limitState.slippage) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) limitState.priorityFee) && Intrinsics.EZpvd((Object) this.feeToken, (Object) limitState.feeToken) && Intrinsics.EZpvd((Object) this.preFailureReason, (Object) limitState.preFailureReason) && Intrinsics.EZpvd(this.quickRateType, limitState.quickRateType) && Intrinsics.EZpvd(this.triggerCondition, limitState.triggerCondition) && Intrinsics.EZpvd((Object) this.totalReceiveAmount, (Object) limitState.totalReceiveAmount) && Intrinsics.EZpvd((Object) this.serviceFeeUsd, (Object) limitState.serviceFeeUsd) && Intrinsics.EZpvd((Object) this.serviceFeeRate, (Object) limitState.serviceFeeRate) && Intrinsics.EZpvd((Object) this.serviceFee, (Object) limitState.serviceFee) && Intrinsics.EZpvd((Object) this.serviceFeeTokenSymbol, (Object) limitState.serviceFeeTokenSymbol) && Intrinsics.EZpvd((Object) this.isDisplayServiceFee, (Object) limitState.isDisplayServiceFee) && Intrinsics.EZpvd(this.executionHistoryList, limitState.executionHistoryList) && Intrinsics.EZpvd(this.executionHistoryShowMaxNum, limitState.executionHistoryShowMaxNum) && Intrinsics.EZpvd(this.isShowExecutionHistoryMaxNum, limitState.isShowExecutionHistoryMaxNum) && Intrinsics.EZpvd((Object) this.bannerMessage, (Object) limitState.bannerMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBannerMessage() {
        return this.bannerMessage;
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
    public final String getLatestTransactionHash() {
        return this.latestTransactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
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
    public final Integer getQuickRateType() {
        return this.quickRateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainTime() {
        return this.remainTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFee() {
        return this.serviceFee;
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
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubmitToast() {
        return this.submitToast;
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
    public final String getSwapTradeType() {
        return this.swapTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTimeoutToast() {
        return this.timeoutToast;
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
    public final String getTotalReceiveAmount() {
        return this.totalReceiveAmount;
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
    public final Integer getTriggerCondition() {
        return this.triggerCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.createTime.hashCode();
        int iHashCode2 = this.expireTime.hashCode();
        int iHashCode3 = this.exploreUrl.hashCode();
        int iHashCode4 = this.failureReason.hashCode();
        int iHashCode5 = this.defiPlatformInfo.hashCode();
        FromChildOrderDetailVO fromChildOrderDetailVO = this.fromChildOrderDetailVO;
        int iHashCode6 = fromChildOrderDetailVO == null ? 0 : fromChildOrderDetailVO.hashCode();
        int iHashCode7 = this.orderId.hashCode();
        int iHashCode8 = this.price.hashCode();
        int iHashCode9 = this.remainTime.hashCode();
        int iHashCode10 = this.status.hashCode();
        int iHashCode11 = this.submitToast.hashCode();
        int iHashCode12 = this.surplus.hashCode();
        int iHashCode13 = this.surplusUsdValue.hashCode();
        int iHashCode14 = this.swapTradeType.hashCode();
        int iHashCode15 = this.totalGasFee.hashCode();
        int iHashCode16 = this.totalGasFeeUsdValue.hashCode();
        int iHashCode17 = this.latestTransactionHash.hashCode();
        int iHashCode18 = this.transactionTime.hashCode();
        int iHashCode19 = this.transactionPrice.hashCode();
        int iHashCode20 = this.type.hashCode();
        int iHashCode21 = this.userWalletAddress.hashCode();
        int iHashCode22 = Boolean.hashCode(this.dealWarnTag);
        int iHashCode23 = Boolean.hashCode(this.timeoutToast);
        int iHashCode24 = Integer.hashCode(this.canEdit);
        int iHashCode25 = Integer.hashCode(this.canCancel);
        int iHashCode26 = this.slippage.hashCode();
        int iHashCode27 = this.priorityFee.hashCode();
        int iHashCode28 = this.feeToken.hashCode();
        int iHashCode29 = this.preFailureReason.hashCode();
        Integer num = this.quickRateType;
        int iHashCode30 = num == null ? 0 : num.hashCode();
        Integer num2 = this.triggerCondition;
        int iHashCode31 = num2 == null ? 0 : num2.hashCode();
        int iHashCode32 = this.totalReceiveAmount.hashCode();
        int iHashCode33 = this.serviceFeeUsd.hashCode();
        int iHashCode34 = this.serviceFeeRate.hashCode();
        int iHashCode35 = this.serviceFee.hashCode();
        int iHashCode36 = this.serviceFeeTokenSymbol.hashCode();
        int iHashCode37 = this.isDisplayServiceFee.hashCode();
        List<ExecutionHistory> list = this.executionHistoryList;
        int iHashCode38 = list == null ? 0 : list.hashCode();
        Integer num3 = this.executionHistoryShowMaxNum;
        int iHashCode39 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.isShowExecutionHistoryMaxNum;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + (num4 == null ? 0 : num4.hashCode())) * 31) + this.bannerMessage.hashCode();
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
    public final void setDefiPlatformInfo(@NotNull DefiPlatformInfos defiPlatformInfos) {
        Intrinsics.checkNotNullParameter(defiPlatformInfos, "");
        this.defiPlatformInfo = defiPlatformInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromChildOrderDetailVO(FromChildOrderDetailVO fromChildOrderDetailVO) {
        this.fromChildOrderDetailVO = fromChildOrderDetailVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitState(createTime=" + this.createTime + ", expireTime=" + this.expireTime + ", exploreUrl=" + this.exploreUrl + ", failureReason=" + this.failureReason + ", defiPlatformInfo=" + this.defiPlatformInfo + ", fromChildOrderDetailVO=" + this.fromChildOrderDetailVO + ", orderId=" + this.orderId + ", price=" + this.price + ", remainTime=" + this.remainTime + ", status=" + this.status + ", submitToast=" + this.submitToast + ", surplus=" + this.surplus + ", surplusUsdValue=" + this.surplusUsdValue + ", swapTradeType=" + this.swapTradeType + ", totalGasFee=" + this.totalGasFee + ", totalGasFeeUsdValue=" + this.totalGasFeeUsdValue + ", latestTransactionHash=" + this.latestTransactionHash + ", transactionTime=" + this.transactionTime + ", transactionPrice=" + this.transactionPrice + ", type=" + this.type + ", userWalletAddress=" + this.userWalletAddress + ", dealWarnTag=" + this.dealWarnTag + ", timeoutToast=" + this.timeoutToast + ", canEdit=" + this.canEdit + ", canCancel=" + this.canCancel + ", slippage=" + this.slippage + ", priorityFee=" + this.priorityFee + ", feeToken=" + this.feeToken + ", preFailureReason=" + this.preFailureReason + ", quickRateType=" + this.quickRateType + ", triggerCondition=" + this.triggerCondition + ", totalReceiveAmount=" + this.totalReceiveAmount + ", serviceFeeUsd=" + this.serviceFeeUsd + ", serviceFeeRate=" + this.serviceFeeRate + ", serviceFee=" + this.serviceFee + ", serviceFeeTokenSymbol=" + this.serviceFeeTokenSymbol + ", isDisplayServiceFee=" + this.isDisplayServiceFee + ", executionHistoryList=" + this.executionHistoryList + ", executionHistoryShowMaxNum=" + this.executionHistoryShowMaxNum + ", isShowExecutionHistoryMaxNum=" + this.isShowExecutionHistoryMaxNum + ", bannerMessage=" + this.bannerMessage + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitState> serializer() {
            return LimitState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitState(int i, int i2, String str, String str2, String str3, String str4, DefiPlatformInfos defiPlatformInfos, FromChildOrderDetailVO fromChildOrderDetailVO, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, boolean z, boolean z2, int i3, int i4, String str20, String str21, String str22, String str23, Integer num, Integer num2, String str24, String str25, String str26, String str27, String str28, String str29, List list, Integer num3, Integer num4, String str30, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str;
        }
        if ((i & 2) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str2;
        }
        if ((i & 4) == 0) {
            this.exploreUrl = "";
        } else {
            this.exploreUrl = str3;
        }
        if ((i & 8) == 0) {
            this.failureReason = "";
        } else {
            this.failureReason = str4;
        }
        this.defiPlatformInfo = (i & 16) == 0 ? new DefiPlatformInfos("", "") : defiPlatformInfos;
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
            this.submitToast = "";
        } else {
            this.submitToast = str9;
        }
        if ((i & 2048) == 0) {
            this.surplus = "";
        } else {
            this.surplus = str10;
        }
        if ((i & 4096) == 0) {
            this.surplusUsdValue = "";
        } else {
            this.surplusUsdValue = str11;
        }
        if ((i & 8192) == 0) {
            this.swapTradeType = "";
        } else {
            this.swapTradeType = str12;
        }
        if ((i & 16384) == 0) {
            this.totalGasFee = "";
        } else {
            this.totalGasFee = str13;
        }
        if ((32768 & i) == 0) {
            this.totalGasFeeUsdValue = "";
        } else {
            this.totalGasFeeUsdValue = str14;
        }
        if ((65536 & i) == 0) {
            this.latestTransactionHash = "";
        } else {
            this.latestTransactionHash = str15;
        }
        if ((131072 & i) == 0) {
            this.transactionTime = "";
        } else {
            this.transactionTime = str16;
        }
        if ((262144 & i) == 0) {
            this.transactionPrice = "";
        } else {
            this.transactionPrice = str17;
        }
        if ((524288 & i) == 0) {
            this.type = "";
        } else {
            this.type = str18;
        }
        if ((1048576 & i) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str19;
        }
        if ((2097152 & i) == 0) {
            this.dealWarnTag = false;
        } else {
            this.dealWarnTag = z;
        }
        this.timeoutToast = (4194304 & i) != 0 ? z2 : false;
        this.canEdit = (8388608 & i) == 0 ? LimitOrderEditStatus.NonEditable.getValue() : i3;
        this.canCancel = (16777216 & i) == 0 ? LimitOrderCancelStatus.NonCancellable.getValue() : i4;
        if ((33554432 & i) == 0) {
            this.slippage = "";
        } else {
            this.slippage = str20;
        }
        if ((67108864 & i) == 0) {
            this.priorityFee = "";
        } else {
            this.priorityFee = str21;
        }
        if ((134217728 & i) == 0) {
            this.feeToken = "";
        } else {
            this.feeToken = str22;
        }
        if ((268435456 & i) == 0) {
            this.preFailureReason = "";
        } else {
            this.preFailureReason = str23;
        }
        this.quickRateType = (536870912 & i) == 0 ? Integer.valueOf(LimitMemeQuickRateType.NORMAL.getValue()) : num;
        this.triggerCondition = (1073741824 & i) == 0 ? Integer.valueOf(LimitMemeTriggerCondition.PRICE_CAPACITY.getValue()) : num2;
        if ((i & Integer.MIN_VALUE) == 0) {
            this.totalReceiveAmount = "";
        } else {
            this.totalReceiveAmount = str24;
        }
        if ((i2 & 1) == 0) {
            this.serviceFeeUsd = "";
        } else {
            this.serviceFeeUsd = str25;
        }
        if ((i2 & 2) == 0) {
            this.serviceFeeRate = "";
        } else {
            this.serviceFeeRate = str26;
        }
        if ((i2 & 4) == 0) {
            this.serviceFee = "";
        } else {
            this.serviceFee = str27;
        }
        if ((i2 & 8) == 0) {
            this.serviceFeeTokenSymbol = "";
        } else {
            this.serviceFeeTokenSymbol = str28;
        }
        if ((i2 & 16) == 0) {
            this.isDisplayServiceFee = "";
        } else {
            this.isDisplayServiceFee = str29;
        }
        if ((i2 & 32) == 0) {
            this.executionHistoryList = null;
        } else {
            this.executionHistoryList = list;
        }
        if ((i2 & 64) == 0) {
            this.executionHistoryShowMaxNum = null;
        } else {
            this.executionHistoryShowMaxNum = num3;
        }
        if ((i2 & 128) == 0) {
            this.isShowExecutionHistoryMaxNum = null;
        } else {
            this.isShowExecutionHistoryMaxNum = num4;
        }
        if ((i2 & 256) == 0) {
            this.bannerMessage = "";
        } else {
            this.bannerMessage = str30;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [401=6] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitState limitState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) limitState.createTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, limitState.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) limitState.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, limitState.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) limitState.exploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, limitState.exploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) limitState.failureReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, limitState.failureReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(limitState.defiPlatformInfo, new DefiPlatformInfos("", ""))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, DefiPlatformInfos$$serializer.INSTANCE, limitState.defiPlatformInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || limitState.fromChildOrderDetailVO != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, FromChildOrderDetailVO$$serializer.INSTANCE, limitState.fromChildOrderDetailVO);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) limitState.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, limitState.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) limitState.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, limitState.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) limitState.remainTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, limitState.remainTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) limitState.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, limitState.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) limitState.submitToast, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, limitState.submitToast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) limitState.surplus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, limitState.surplus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) limitState.surplusUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, limitState.surplusUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) limitState.swapTradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, limitState.swapTradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) limitState.totalGasFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, limitState.totalGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) limitState.totalGasFeeUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, limitState.totalGasFeeUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) limitState.latestTransactionHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, limitState.latestTransactionHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) limitState.transactionTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, limitState.transactionTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) limitState.transactionPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, limitState.transactionPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) limitState.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, limitState.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) limitState.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, limitState.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || limitState.dealWarnTag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 21, limitState.dealWarnTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || limitState.timeoutToast) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 22, limitState.timeoutToast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || limitState.canEdit != LimitOrderEditStatus.NonEditable.getValue()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 23, limitState.canEdit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || limitState.canCancel != LimitOrderCancelStatus.NonCancellable.getValue()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 24, limitState.canCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) limitState.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, limitState.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) limitState.priorityFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, limitState.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) limitState.feeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, limitState.feeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) limitState.preFailureReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, limitState.preFailureReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, IntSerializer.INSTANCE, limitState.quickRateType);
        } else {
            Integer num = limitState.quickRateType;
            int value = LimitMemeQuickRateType.NORMAL.getValue();
            if (num == null || num.intValue() != value) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, IntSerializer.INSTANCE, limitState.triggerCondition);
        } else {
            Integer num2 = limitState.triggerCondition;
            int value2 = LimitMemeTriggerCondition.PRICE_CAPACITY.getValue();
            if (num2 == null || num2.intValue() != value2) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) limitState.totalReceiveAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, limitState.totalReceiveAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) limitState.serviceFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, limitState.serviceFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) limitState.serviceFeeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, limitState.serviceFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) limitState.serviceFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, limitState.serviceFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) limitState.serviceFeeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, limitState.serviceFeeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) limitState.isDisplayServiceFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, limitState.isDisplayServiceFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || limitState.executionHistoryList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, kSerializerArr[37], limitState.executionHistoryList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || limitState.executionHistoryShowMaxNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, IntSerializer.INSTANCE, limitState.executionHistoryShowMaxNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || limitState.isShowExecutionHistoryMaxNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, IntSerializer.INSTANCE, limitState.isShowExecutionHistoryMaxNum);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) && Intrinsics.EZpvd((Object) limitState.bannerMessage, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 40, limitState.bannerMessage);
    }

    public LimitState(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull DefiPlatformInfos defiPlatformInfos, FromChildOrderDetailVO fromChildOrderDetailVO, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, boolean z, boolean z2, int i, int i2, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, Integer num, Integer num2, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, List<ExecutionHistory> list, Integer num3, Integer num4, @NotNull String str30) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(defiPlatformInfos, "");
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
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        this.createTime = str;
        this.expireTime = str2;
        this.exploreUrl = str3;
        this.failureReason = str4;
        this.defiPlatformInfo = defiPlatformInfos;
        this.fromChildOrderDetailVO = fromChildOrderDetailVO;
        this.orderId = str5;
        this.price = str6;
        this.remainTime = str7;
        this.status = str8;
        this.submitToast = str9;
        this.surplus = str10;
        this.surplusUsdValue = str11;
        this.swapTradeType = str12;
        this.totalGasFee = str13;
        this.totalGasFeeUsdValue = str14;
        this.latestTransactionHash = str15;
        this.transactionTime = str16;
        this.transactionPrice = str17;
        this.type = str18;
        this.userWalletAddress = str19;
        this.dealWarnTag = z;
        this.timeoutToast = z2;
        this.canEdit = i;
        this.canCancel = i2;
        this.slippage = str20;
        this.priorityFee = str21;
        this.feeToken = str22;
        this.preFailureReason = str23;
        this.quickRateType = num;
        this.triggerCondition = num2;
        this.totalReceiveAmount = str24;
        this.serviceFeeUsd = str25;
        this.serviceFeeRate = str26;
        this.serviceFee = str27;
        this.serviceFeeTokenSymbol = str28;
        this.isDisplayServiceFee = str29;
        this.executionHistoryList = list;
        this.executionHistoryShowMaxNum = num3;
        this.isShowExecutionHistoryMaxNum = num4;
        this.bannerMessage = str30;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0202: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r82v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r82v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r82v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r82v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DefiPlatformInfos:?: TERNARY null = ((wrap:int:0x0026: ARITH (r82v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: CONSTRUCTOR (""), ("") A[MD:(java.lang.String, java.lang.String):void (m), WRAPPED] (LINE:408) call: com.okinc.business.dexlogic.bean.DefiPlatformInfos.<init>(java.lang.String, java.lang.String):void type: CONSTRUCTOR) : (r45v0 com.okinc.business.dexlogic.bean.DefiPlatformInfos))
  (wrap:com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO:?: TERNARY null = ((wrap:int:0x0032: ARITH (r82v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO) : (r46v0 com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r82v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r82v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r82v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r82v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r82v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r82v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r82v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:0x007d: TERNARY null = ((wrap:int:0x0074: ARITH (r82v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007f: ARITH (r82v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008b: ARITH (r82v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0096: ARITH (r82v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a1: ARITH (r82v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ac: ARITH (r82v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b7: ARITH (r82v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c2: ARITH (r82v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00cd: ARITH (r82v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? false : (r62v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00da: ARITH (r82v0 int) & (4194304 int) A[WRAPPED]) == (0 int)) ? (r63v0 boolean) : false)
  (wrap:int:?: TERNARY null = ((wrap:int:0x00e3: ARITH (r82v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00e9: INVOKE 
  (wrap:com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderEditStatus:0x00e7: SGET  A[WRAPPED] (LINE:428) com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderEditStatus.NonEditable com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderEditStatus)
 VIRTUAL call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderEditStatus.getValue():int A[MD:():int (m), WRAPPED] (LINE:428)) : (r64v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r82v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00f8: INVOKE 
  (wrap:com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderCancelStatus:0x00f6: SGET  A[WRAPPED] (LINE:430) com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderCancelStatus.NonCancellable com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderCancelStatus)
 VIRTUAL call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderCancelStatus.getValue():int A[MD:():int (m), WRAPPED] (LINE:430)) : (r65v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0101: ARITH (r82v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010c: ARITH (r82v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0117: ARITH (r82v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0122: ARITH (r82v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x012d: ARITH (r82v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0137: INVOKE 
  (wrap:int:0x0133: INVOKE 
  (wrap:com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeQuickRateType:0x0131: SGET  A[WRAPPED] (LINE:440) com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeQuickRateType.NORMAL com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeQuickRateType)
 VIRTUAL call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeQuickRateType.getValue():int A[MD:():int (m), WRAPPED] (LINE:440))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:440)) : (r70v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0140: ARITH (r82v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x014a: INVOKE 
  (wrap:int:0x0146: INVOKE 
  (wrap:com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeTriggerCondition:0x0144: SGET  A[WRAPPED] (LINE:442) com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeTriggerCondition.PRICE_CAPACITY com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeTriggerCondition)
 VIRTUAL call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeTriggerCondition.getValue():int A[MD:():int (m), WRAPPED] (LINE:442))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:442)) : (r71v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0153: ARITH (r82v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015c: ARITH (r83v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0165: ARITH (r83v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016e: ARITH (r83v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0177: ARITH (r83v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0180: ARITH (r83v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0189: ARITH (r83v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r78v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0192: ARITH (r83v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r79v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x019d: ARITH (r83v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r80v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01a5: ARITH (r83v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DefiPlatformInfos, com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.dexlogic.main.limmitorder.bean.ExecutionHistory>, java.lang.Integer, java.lang.Integer, java.lang.String):void (m)] (LINE:403) call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitState.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DefiPlatformInfos, com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ LimitState(String str, String str2, String str3, String str4, DefiPlatformInfos defiPlatformInfos, FromChildOrderDetailVO fromChildOrderDetailVO, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, boolean z, boolean z2, int i, int i2, String str20, String str21, String str22, String str23, Integer num, Integer num2, String str24, String str25, String str26, String str27, String str28, String str29, List list, Integer num3, Integer num4, String str30, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? new DefiPlatformInfos("", "") : defiPlatformInfos, (i3 & 32) != 0 ? null : fromChildOrderDetailVO, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6, (i3 & 256) != 0 ? "" : str7, (i3 & 512) != 0 ? "" : str8, (i3 & 1024) != 0 ? "" : str9, (i3 & 2048) != 0 ? "" : str10, (i3 & 4096) != 0 ? "" : str11, (i3 & 8192) != 0 ? "" : str12, (i3 & 16384) != 0 ? "" : str13, (i3 & 32768) != 0 ? "" : str14, (i3 & 65536) != 0 ? "" : str15, (i3 & 131072) != 0 ? "" : str16, (i3 & 262144) != 0 ? "" : str17, (i3 & 524288) != 0 ? "" : str18, (i3 & 1048576) != 0 ? "" : str19, (i3 & 2097152) != 0 ? false : z, (i3 & 4194304) == 0 ? z2 : false, (i3 & 8388608) != 0 ? LimitOrderEditStatus.NonEditable.getValue() : i, (i3 & 16777216) != 0 ? LimitOrderCancelStatus.NonCancellable.getValue() : i2, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str20, (i3 & 67108864) != 0 ? "" : str21, (i3 & 134217728) != 0 ? "" : str22, (i3 & 268435456) != 0 ? "" : str23, (i3 & 536870912) != 0 ? Integer.valueOf(LimitMemeQuickRateType.NORMAL.getValue()) : num, (i3 & 1073741824) != 0 ? Integer.valueOf(LimitMemeTriggerCondition.PRICE_CAPACITY.getValue()) : num2, (i3 & Integer.MIN_VALUE) != 0 ? "" : str24, (i4 & 1) != 0 ? "" : str25, (i4 & 2) != 0 ? "" : str26, (i4 & 4) != 0 ? "" : str27, (i4 & 8) != 0 ? "" : str28, (i4 & 16) != 0 ? "" : str29, (i4 & 32) != 0 ? null : list, (i4 & 64) != 0 ? null : num3, (i4 & 128) != 0 ? null : num4, (i4 & 256) != 0 ? "" : str30);
    }

    public final boolean isCheckSubmitToastState() {
        return Intrinsics.EZpvd((Object) this.submitToast, (Object) "1");
    }
}
