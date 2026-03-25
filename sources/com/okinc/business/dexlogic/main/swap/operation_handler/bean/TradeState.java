package com.okinc.business.dexlogic.main.swap.operation_handler.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.dexlogic.bean.DexGasStationActivity;
import com.okinc.business.dexlogic.bean.DexGasStationActivity$$serializer;
import com.okinc.business.dexlogic.bean.DexGasStationFeeDetailVOX;
import com.okinc.business.dexlogic.bean.DexGasStationFeeDetailVOX$$serializer;
import com.okinc.business.dexlogic.bean.RelativeTransactionVO;
import com.okinc.business.dexlogic.bean.RelativeTransactionVO$$serializer;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.meme.data.MemeOrdersStrategyType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC22764hlX;
import o.C23313hvq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TradeState extends AbstractC22764hlX {
    private String abnormalStatus;
    private final String approveAmount;
    private boolean assetDelay;
    private String assetDelayTime;
    private ChildOrder bridgeChildOrder;
    private final String bridgeFee;
    private String bridgeFeeUsd;
    private final String chainId;
    private final String chainLogoUrl;
    private final String chainName;
    private final String createTime;
    private final String createdPrice;
    private final Boolean customPriorityFee;
    private final String customSlippage;
    private final String defiPlatformId;
    private final DexGasStationFeeDetailVOX dexGasStationFeeDetailVO;
    private final boolean enableJito;
    private String estimateBridgeFeeAmount;
    private String estimateBridgeFeeAmountUsd;
    private final String estimatedTime;
    private final int exchangeDirection;
    private final String exploreUrl;
    private final String extendStatus;
    private final String forRefuelFromAmount;
    private String freeGas;
    private final String fromAmount;
    private ChildOrder fromChildOrder;
    private final String fromGasTokenPriceUsd;
    private final String fromTokenAddress;
    private final String fromTokenIcon;
    private final Boolean fromTokenIsCurrency;
    private final String fromTokenIsNativeToken;
    private final String fromTokenSymbol;
    private final String gasPrice;
    private DexGasStationActivity gasStationActivityReward;
    private final int hideToast;
    private final int isHasSurplus;
    private boolean isMemeTimeOut;
    private final String maxSlippage;
    private final String memeTokenMarketCap;
    private final String mevInfo;
    private String nativeTokenSymbol;
    private final Boolean needCancelApproveToken;
    private final String networkFee;
    private final String orderCompletionTime;
    private final String orderId;
    private final String otherFees;
    private final String price;
    private final String priorityFee;
    private final String priorityFeeType;
    private final String receiveTokenAmount;
    private final String receiveTokenExploreUrl;
    private final String receiveTokenStatus;
    private final String receiveTokenSymbol;
    private final String receiveTokenTxHash;
    private RelativeTransactionVO relativeTransaction;
    private final String routerModeType;
    private final String serviceFee;
    private final String serviceFeeRate;
    private final String serviceFeeTokenSymbol;
    private final String serviceFeeUsd;
    private final String slippage;
    private final Integer slippageType;
    private final String solanaToast;
    private final String source;
    private final String specialOrderType;
    private final String speedUpChildOrderId;
    private final String speedUpTxHash;
    private final String status;
    private int strategyType;
    private final String surplusAmount;
    private final String surplusValueUSD;
    private final String swapTradeType;
    private final String timeoutTimestamp;
    private final String toAmount;
    private final String toChainId;
    private final String toChainLogoUrl;
    private final String toChainName;
    private ChildOrder toChildOrder;
    private final String toGasTokenPriceUsd;
    private final String toSwapFee;
    private final String toTokenAddress;
    private final String toTokenIcon;
    private final Boolean toTokenIsCurrency;
    private final String toTokenIsNativeToken;
    private final String toTokenSymbol;
    private final String toastType;
    private final Integer tradeMode;
    private final String transactionHash;
    private final String type;
    private final String userWalletAddress;
    private final String willNeedManualClaim;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeState() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ChildOrder) null, (ChildOrder) null, (ChildOrder) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexGasStationActivity) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (RelativeTransactionVO) null, false, false, (String) null, (DexGasStationFeeDetailVOX) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, false, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 0, 0, (String) null, (String) null, -1, -1, 268435455, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.fromTokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.toTokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChildOrder component22() {
        return this.fromChildOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChildOrder component23() {
        return this.bridgeChildOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChildOrder component24() {
        return this.toChildOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.toastType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.swapTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.toChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.toChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.willNeedManualClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.receiveTokenStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.receiveTokenTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.receiveTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.receiveTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.receiveTokenExploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.abnormalStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.estimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.bridgeFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.toSwapFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.otherFees;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.extendStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.solanaToast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.forRefuelFromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.speedUpChildOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexGasStationActivity component45() {
        return this.gasStationActivityReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.fromGasTokenPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.toGasTokenPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.timeoutTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.specialOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.freeGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.estimateBridgeFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.estimateBridgeFeeAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.bridgeFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.orderCompletionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelativeTransactionVO component57() {
        return this.relativeTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component58() {
        return this.isMemeTimeOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component59() {
        return this.assetDelay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.assetDelayTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexGasStationFeeDetailVOX component61() {
        return this.dexGasStationFeeDetailVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component67() {
        return this.customPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component68() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.createdPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.memeTokenMarketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component71() {
        return this.speedUpTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component72() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component73() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component74() {
        return this.fromTokenIsNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component75() {
        return this.toTokenIsNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component76() {
        return this.serviceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component77() {
        return this.serviceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component78() {
        return this.serviceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component79() {
        return this.serviceFeeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component80() {
        return this.customSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component81() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component82() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component83() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component84() {
        return this.defiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component85() {
        return this.approveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component86() {
        return this.needCancelApproveToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component87() {
        return this.fromTokenIsCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component88() {
        return this.toTokenIsCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component89() {
        return this.hideToast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component90() {
        return this.isHasSurplus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component91() {
        return this.surplusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component92() {
        return this.surplusValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeState copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, ChildOrder childOrder, ChildOrder childOrder2, ChildOrder childOrder3, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull DexGasStationActivity dexGasStationActivity, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52, RelativeTransactionVO relativeTransactionVO, boolean z, boolean z2, @NotNull String str53, DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX, String str54, String str55, String str56, @NotNull String str57, @NotNull String str58, Boolean bool, boolean z3, @NotNull String str59, @NotNull String str60, @NotNull String str61, int i, int i2, @NotNull String str62, @NotNull String str63, @NotNull String str64, @NotNull String str65, @NotNull String str66, @NotNull String str67, String str68, String str69, Integer num, Integer num2, String str70, String str71, Boolean bool2, Boolean bool3, Boolean bool4, int i3, int i4, @NotNull String str72, @NotNull String str73) {
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
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(dexGasStationActivity, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        Intrinsics.checkNotNullParameter(str63, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str72, "");
        Intrinsics.checkNotNullParameter(str73, "");
        return new TradeState(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, childOrder, childOrder2, childOrder3, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, dexGasStationActivity, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, relativeTransactionVO, z, z2, str53, dexGasStationFeeDetailVOX, str54, str55, str56, str57, str58, bool, z3, str59, str60, str61, i, i2, str62, str63, str64, str65, str66, str67, str68, str69, num, num2, str70, str71, bool2, bool3, bool4, i3, i4, str72, str73);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeState)) {
            return false;
        }
        TradeState tradeState = (TradeState) obj;
        return Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) tradeState.userWalletAddress) && Intrinsics.EZpvd((Object) this.transactionHash, (Object) tradeState.transactionHash) && Intrinsics.EZpvd((Object) this.willNeedManualClaim, (Object) tradeState.willNeedManualClaim) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) tradeState.fromTokenAddress) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) tradeState.fromAmount) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) tradeState.toTokenAddress) && Intrinsics.EZpvd((Object) this.toAmount, (Object) tradeState.toAmount) && Intrinsics.EZpvd((Object) this.status, (Object) tradeState.status) && Intrinsics.EZpvd((Object) this.type, (Object) tradeState.type) && Intrinsics.EZpvd((Object) this.fromTokenSymbol, (Object) tradeState.fromTokenSymbol) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) tradeState.toTokenSymbol) && Intrinsics.EZpvd((Object) this.price, (Object) tradeState.price) && Intrinsics.EZpvd((Object) this.chainId, (Object) tradeState.chainId) && Intrinsics.EZpvd((Object) this.orderId, (Object) tradeState.orderId) && Intrinsics.EZpvd((Object) this.createTime, (Object) tradeState.createTime) && Intrinsics.EZpvd((Object) this.source, (Object) tradeState.source) && Intrinsics.EZpvd((Object) this.fromTokenIcon, (Object) tradeState.fromTokenIcon) && Intrinsics.EZpvd((Object) this.toTokenIcon, (Object) tradeState.toTokenIcon) && Intrinsics.EZpvd((Object) this.chainName, (Object) tradeState.chainName) && Intrinsics.EZpvd((Object) this.exploreUrl, (Object) tradeState.exploreUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) tradeState.chainLogoUrl) && Intrinsics.EZpvd(this.fromChildOrder, tradeState.fromChildOrder) && Intrinsics.EZpvd(this.bridgeChildOrder, tradeState.bridgeChildOrder) && Intrinsics.EZpvd(this.toChildOrder, tradeState.toChildOrder) && Intrinsics.EZpvd((Object) this.toastType, (Object) tradeState.toastType) && Intrinsics.EZpvd((Object) this.swapTradeType, (Object) tradeState.swapTradeType) && Intrinsics.EZpvd((Object) this.toChainId, (Object) tradeState.toChainId) && Intrinsics.EZpvd((Object) this.toChainName, (Object) tradeState.toChainName) && Intrinsics.EZpvd((Object) this.toChainLogoUrl, (Object) tradeState.toChainLogoUrl) && Intrinsics.EZpvd((Object) this.networkFee, (Object) tradeState.networkFee) && Intrinsics.EZpvd((Object) this.receiveTokenStatus, (Object) tradeState.receiveTokenStatus) && Intrinsics.EZpvd((Object) this.receiveTokenTxHash, (Object) tradeState.receiveTokenTxHash) && Intrinsics.EZpvd((Object) this.receiveTokenAmount, (Object) tradeState.receiveTokenAmount) && Intrinsics.EZpvd((Object) this.receiveTokenSymbol, (Object) tradeState.receiveTokenSymbol) && Intrinsics.EZpvd((Object) this.receiveTokenExploreUrl, (Object) tradeState.receiveTokenExploreUrl) && Intrinsics.EZpvd((Object) this.abnormalStatus, (Object) tradeState.abnormalStatus) && Intrinsics.EZpvd((Object) this.estimatedTime, (Object) tradeState.estimatedTime) && Intrinsics.EZpvd((Object) this.bridgeFee, (Object) tradeState.bridgeFee) && Intrinsics.EZpvd((Object) this.toSwapFee, (Object) tradeState.toSwapFee) && Intrinsics.EZpvd((Object) this.otherFees, (Object) tradeState.otherFees) && Intrinsics.EZpvd((Object) this.extendStatus, (Object) tradeState.extendStatus) && Intrinsics.EZpvd((Object) this.solanaToast, (Object) tradeState.solanaToast) && Intrinsics.EZpvd((Object) this.forRefuelFromAmount, (Object) tradeState.forRefuelFromAmount) && Intrinsics.EZpvd((Object) this.speedUpChildOrderId, (Object) tradeState.speedUpChildOrderId) && Intrinsics.EZpvd(this.gasStationActivityReward, tradeState.gasStationActivityReward) && Intrinsics.EZpvd((Object) this.fromGasTokenPriceUsd, (Object) tradeState.fromGasTokenPriceUsd) && Intrinsics.EZpvd((Object) this.toGasTokenPriceUsd, (Object) tradeState.toGasTokenPriceUsd) && Intrinsics.EZpvd((Object) this.timeoutTimestamp, (Object) tradeState.timeoutTimestamp) && Intrinsics.EZpvd((Object) this.specialOrderType, (Object) tradeState.specialOrderType) && Intrinsics.EZpvd((Object) this.freeGas, (Object) tradeState.freeGas) && Intrinsics.EZpvd((Object) this.nativeTokenSymbol, (Object) tradeState.nativeTokenSymbol) && Intrinsics.EZpvd((Object) this.estimateBridgeFeeAmount, (Object) tradeState.estimateBridgeFeeAmount) && Intrinsics.EZpvd((Object) this.estimateBridgeFeeAmountUsd, (Object) tradeState.estimateBridgeFeeAmountUsd) && Intrinsics.EZpvd((Object) this.bridgeFeeUsd, (Object) tradeState.bridgeFeeUsd) && Intrinsics.EZpvd((Object) this.orderCompletionTime, (Object) tradeState.orderCompletionTime) && Intrinsics.EZpvd((Object) this.mevInfo, (Object) tradeState.mevInfo) && Intrinsics.EZpvd(this.relativeTransaction, tradeState.relativeTransaction) && this.isMemeTimeOut == tradeState.isMemeTimeOut && this.assetDelay == tradeState.assetDelay && Intrinsics.EZpvd((Object) this.assetDelayTime, (Object) tradeState.assetDelayTime) && Intrinsics.EZpvd(this.dexGasStationFeeDetailVO, tradeState.dexGasStationFeeDetailVO) && Intrinsics.EZpvd((Object) this.slippage, (Object) tradeState.slippage) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) tradeState.priorityFee) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) tradeState.gasPrice) && Intrinsics.EZpvd((Object) this.routerModeType, (Object) tradeState.routerModeType) && Intrinsics.EZpvd((Object) this.priorityFeeType, (Object) tradeState.priorityFeeType) && Intrinsics.EZpvd(this.customPriorityFee, tradeState.customPriorityFee) && this.enableJito == tradeState.enableJito && Intrinsics.EZpvd((Object) this.createdPrice, (Object) tradeState.createdPrice) && Intrinsics.EZpvd((Object) this.memeTokenMarketCap, (Object) tradeState.memeTokenMarketCap) && Intrinsics.EZpvd((Object) this.speedUpTxHash, (Object) tradeState.speedUpTxHash) && this.exchangeDirection == tradeState.exchangeDirection && this.strategyType == tradeState.strategyType && Intrinsics.EZpvd((Object) this.fromTokenIsNativeToken, (Object) tradeState.fromTokenIsNativeToken) && Intrinsics.EZpvd((Object) this.toTokenIsNativeToken, (Object) tradeState.toTokenIsNativeToken) && Intrinsics.EZpvd((Object) this.serviceFeeUsd, (Object) tradeState.serviceFeeUsd) && Intrinsics.EZpvd((Object) this.serviceFeeRate, (Object) tradeState.serviceFeeRate) && Intrinsics.EZpvd((Object) this.serviceFee, (Object) tradeState.serviceFee) && Intrinsics.EZpvd((Object) this.serviceFeeTokenSymbol, (Object) tradeState.serviceFeeTokenSymbol) && Intrinsics.EZpvd((Object) this.customSlippage, (Object) tradeState.customSlippage) && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) tradeState.maxSlippage) && Intrinsics.EZpvd(this.slippageType, tradeState.slippageType) && Intrinsics.EZpvd(this.tradeMode, tradeState.tradeMode) && Intrinsics.EZpvd((Object) this.defiPlatformId, (Object) tradeState.defiPlatformId) && Intrinsics.EZpvd((Object) this.approveAmount, (Object) tradeState.approveAmount) && Intrinsics.EZpvd(this.needCancelApproveToken, tradeState.needCancelApproveToken) && Intrinsics.EZpvd(this.fromTokenIsCurrency, tradeState.fromTokenIsCurrency) && Intrinsics.EZpvd(this.toTokenIsCurrency, tradeState.toTokenIsCurrency) && this.hideToast == tradeState.hideToast && this.isHasSurplus == tradeState.isHasSurplus && Intrinsics.EZpvd((Object) this.surplusAmount, (Object) tradeState.surplusAmount) && Intrinsics.EZpvd((Object) this.surplusValueUSD, (Object) tradeState.surplusValueUSD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAbnormalStatus() {
        return this.abnormalStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApproveAmount() {
        return this.approveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAssetDelay() {
        return this.assetDelay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetDelayTime() {
        return this.assetDelayTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChildOrder getBridgeChildOrder() {
        return this.bridgeChildOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeFee() {
        return this.bridgeFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeFeeUsd() {
        return this.bridgeFeeUsd;
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
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreatedPrice() {
        return this.createdPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCustomPriorityFee() {
        return this.customPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomSlippage() {
        return this.customSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefiPlatformId() {
        return this.defiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexGasStationFeeDetailVOX getDexGasStationFeeDetailVO() {
        return this.dexGasStationFeeDetailVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableJito() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateBridgeFeeAmount() {
        return this.estimateBridgeFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateBridgeFeeAmountUsd() {
        return this.estimateBridgeFeeAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedTime() {
        return this.estimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getExchangeDirection() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExploreUrl() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtendStatus() {
        return this.extendStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getForRefuelFromAmount() {
        return this.forRefuelFromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreeGas() {
        return this.freeGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChildOrder getFromChildOrder() {
        return this.fromChildOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromGasTokenPriceUsd() {
        return this.fromGasTokenPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenIcon() {
        return this.fromTokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getFromTokenIsCurrency() {
        return this.fromTokenIsCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenIsNativeToken() {
        return this.fromTokenIsNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenSymbol() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexGasStationActivity getGasStationActivityReward() {
        return this.gasStationActivityReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHideToast() {
        return this.hideToast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemeTokenMarketCap() {
        return this.memeTokenMarketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevInfo() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenSymbol() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedCancelApproveToken() {
        return this.needCancelApproveToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFee() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderCompletionTime() {
        return this.orderCompletionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOtherFees() {
        return this.otherFees;
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
    public final String getPriorityFeeType() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveTokenAmount() {
        return this.receiveTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveTokenExploreUrl() {
        return this.receiveTokenExploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveTokenStatus() {
        return this.receiveTokenStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveTokenSymbol() {
        return this.receiveTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveTokenTxHash() {
        return this.receiveTokenTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelativeTransactionVO getRelativeTransaction() {
        return this.relativeTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouterModeType() {
        return this.routerModeType;
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
    public final Integer getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSolanaToast() {
        return this.solanaToast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpecialOrderType() {
        return this.specialOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpeedUpChildOrderId() {
        return this.speedUpChildOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpeedUpTxHash() {
        return this.speedUpTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurplusAmount() {
        return this.surplusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurplusValueUSD() {
        return this.surplusValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapTradeType() {
        return this.swapTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeoutTimestamp() {
        return this.timeoutTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainLogoUrl() {
        return this.toChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainName() {
        return this.toChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChildOrder getToChildOrder() {
        return this.toChildOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToGasTokenPriceUsd() {
        return this.toGasTokenPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToSwapFee() {
        return this.toSwapFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenIcon() {
        return this.toTokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getToTokenIsCurrency() {
        return this.toTokenIsCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenIsNativeToken() {
        return this.toTokenIsNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenSymbol() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToastType() {
        return this.toastType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTradeMode() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionHash() {
        return this.transactionHash;
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
    public final String getWillNeedManualClaim() {
        return this.willNeedManualClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.userWalletAddress.hashCode();
        int iHashCode2 = this.transactionHash.hashCode();
        int iHashCode3 = this.willNeedManualClaim.hashCode();
        int iHashCode4 = this.fromTokenAddress.hashCode();
        int iHashCode5 = this.fromAmount.hashCode();
        int iHashCode6 = this.toTokenAddress.hashCode();
        int iHashCode7 = this.toAmount.hashCode();
        int iHashCode8 = this.status.hashCode();
        int iHashCode9 = this.type.hashCode();
        int iHashCode10 = this.fromTokenSymbol.hashCode();
        int iHashCode11 = this.toTokenSymbol.hashCode();
        int iHashCode12 = this.price.hashCode();
        int iHashCode13 = this.chainId.hashCode();
        int iHashCode14 = this.orderId.hashCode();
        int iHashCode15 = this.createTime.hashCode();
        int iHashCode16 = this.source.hashCode();
        int iHashCode17 = this.fromTokenIcon.hashCode();
        int iHashCode18 = this.toTokenIcon.hashCode();
        int iHashCode19 = this.chainName.hashCode();
        int iHashCode20 = this.exploreUrl.hashCode();
        int iHashCode21 = this.chainLogoUrl.hashCode();
        ChildOrder childOrder = this.fromChildOrder;
        int iHashCode22 = childOrder == null ? 0 : childOrder.hashCode();
        ChildOrder childOrder2 = this.bridgeChildOrder;
        int iHashCode23 = childOrder2 == null ? 0 : childOrder2.hashCode();
        ChildOrder childOrder3 = this.toChildOrder;
        int iHashCode24 = childOrder3 == null ? 0 : childOrder3.hashCode();
        int iHashCode25 = this.toastType.hashCode();
        int iHashCode26 = this.swapTradeType.hashCode();
        int iHashCode27 = this.toChainId.hashCode();
        int iHashCode28 = this.toChainName.hashCode();
        int iHashCode29 = this.toChainLogoUrl.hashCode();
        int iHashCode30 = this.networkFee.hashCode();
        int iHashCode31 = this.receiveTokenStatus.hashCode();
        int iHashCode32 = this.receiveTokenTxHash.hashCode();
        int iHashCode33 = this.receiveTokenAmount.hashCode();
        int iHashCode34 = this.receiveTokenSymbol.hashCode();
        int iHashCode35 = this.receiveTokenExploreUrl.hashCode();
        int iHashCode36 = this.abnormalStatus.hashCode();
        int iHashCode37 = this.estimatedTime.hashCode();
        int iHashCode38 = this.bridgeFee.hashCode();
        int iHashCode39 = this.toSwapFee.hashCode();
        int iHashCode40 = this.otherFees.hashCode();
        int iHashCode41 = this.extendStatus.hashCode();
        int iHashCode42 = this.solanaToast.hashCode();
        int iHashCode43 = this.forRefuelFromAmount.hashCode();
        int iHashCode44 = this.speedUpChildOrderId.hashCode();
        int iHashCode45 = this.gasStationActivityReward.hashCode();
        int iHashCode46 = this.fromGasTokenPriceUsd.hashCode();
        int iHashCode47 = this.toGasTokenPriceUsd.hashCode();
        int iHashCode48 = this.timeoutTimestamp.hashCode();
        int iHashCode49 = this.specialOrderType.hashCode();
        int iHashCode50 = this.freeGas.hashCode();
        int iHashCode51 = this.nativeTokenSymbol.hashCode();
        int iHashCode52 = this.estimateBridgeFeeAmount.hashCode();
        int iHashCode53 = this.estimateBridgeFeeAmountUsd.hashCode();
        int iHashCode54 = this.bridgeFeeUsd.hashCode();
        int iHashCode55 = this.orderCompletionTime.hashCode();
        int iHashCode56 = this.mevInfo.hashCode();
        RelativeTransactionVO relativeTransactionVO = this.relativeTransaction;
        int iHashCode57 = relativeTransactionVO == null ? 0 : relativeTransactionVO.hashCode();
        int iHashCode58 = Boolean.hashCode(this.isMemeTimeOut);
        int iHashCode59 = Boolean.hashCode(this.assetDelay);
        int iHashCode60 = this.assetDelayTime.hashCode();
        DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX = this.dexGasStationFeeDetailVO;
        int iHashCode61 = dexGasStationFeeDetailVOX == null ? 0 : dexGasStationFeeDetailVOX.hashCode();
        String str = this.slippage;
        int iHashCode62 = str == null ? 0 : str.hashCode();
        String str2 = this.priorityFee;
        int iHashCode63 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.gasPrice;
        int iHashCode64 = str3 == null ? 0 : str3.hashCode();
        int iHashCode65 = this.routerModeType.hashCode();
        int iHashCode66 = this.priorityFeeType.hashCode();
        Boolean bool = this.customPriorityFee;
        int iHashCode67 = bool == null ? 0 : bool.hashCode();
        int iHashCode68 = Boolean.hashCode(this.enableJito);
        int iHashCode69 = this.createdPrice.hashCode();
        int iHashCode70 = this.memeTokenMarketCap.hashCode();
        int iHashCode71 = this.speedUpTxHash.hashCode();
        int iHashCode72 = Integer.hashCode(this.exchangeDirection);
        int iHashCode73 = Integer.hashCode(this.strategyType);
        int iHashCode74 = this.fromTokenIsNativeToken.hashCode();
        int iHashCode75 = this.toTokenIsNativeToken.hashCode();
        int iHashCode76 = this.serviceFeeUsd.hashCode();
        int iHashCode77 = this.serviceFeeRate.hashCode();
        int iHashCode78 = this.serviceFee.hashCode();
        int iHashCode79 = this.serviceFeeTokenSymbol.hashCode();
        String str4 = this.customSlippage;
        int iHashCode80 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.maxSlippage;
        int iHashCode81 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.slippageType;
        int iHashCode82 = num == null ? 0 : num.hashCode();
        Integer num2 = this.tradeMode;
        int iHashCode83 = num2 == null ? 0 : num2.hashCode();
        String str6 = this.defiPlatformId;
        int iHashCode84 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.approveAmount;
        int iHashCode85 = str7 == null ? 0 : str7.hashCode();
        Boolean bool2 = this.needCancelApproveToken;
        int iHashCode86 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.fromTokenIsCurrency;
        int iHashCode87 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.toTokenIsCurrency;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + iHashCode77) * 31) + iHashCode78) * 31) + iHashCode79) * 31) + iHashCode80) * 31) + iHashCode81) * 31) + iHashCode82) * 31) + iHashCode83) * 31) + iHashCode84) * 31) + iHashCode85) * 31) + iHashCode86) * 31) + iHashCode87) * 31) + (bool4 != null ? bool4.hashCode() : 0)) * 31) + Integer.hashCode(this.hideToast)) * 31) + Integer.hashCode(this.isHasSurplus)) * 31) + this.surplusAmount.hashCode()) * 31) + this.surplusValueUSD.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isHasSurplus() {
        return this.isHasSurplus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHideToast() {
        return this.hideToast == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMemeTimeOut() {
        return this.isMemeTimeOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean orderHasSurplus() {
        return this.isHasSurplus == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAbnormalStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.abnormalStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetDelay(boolean z) {
        this.assetDelay = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetDelayTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.assetDelayTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBridgeChildOrder(ChildOrder childOrder) {
        this.bridgeChildOrder = childOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBridgeFeeUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bridgeFeeUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimateBridgeFeeAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimateBridgeFeeAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimateBridgeFeeAmountUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimateBridgeFeeAmountUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFreeGas(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.freeGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromChildOrder(ChildOrder childOrder) {
        this.fromChildOrder = childOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasStationActivityReward(@NotNull DexGasStationActivity dexGasStationActivity) {
        Intrinsics.checkNotNullParameter(dexGasStationActivity, "");
        this.gasStationActivityReward = dexGasStationActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemeTimeOut(boolean z) {
        this.isMemeTimeOut = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNativeTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nativeTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRelativeTransaction(RelativeTransactionVO relativeTransactionVO) {
        this.relativeTransaction = relativeTransactionVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrategyType(int i) {
        this.strategyType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToChildOrder(ChildOrder childOrder) {
        this.toChildOrder = childOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeState(userWalletAddress=" + this.userWalletAddress + ", transactionHash=" + this.transactionHash + ", willNeedManualClaim=" + this.willNeedManualClaim + ", fromTokenAddress=" + this.fromTokenAddress + ", fromAmount=" + this.fromAmount + ", toTokenAddress=" + this.toTokenAddress + ", toAmount=" + this.toAmount + ", status=" + this.status + ", type=" + this.type + ", fromTokenSymbol=" + this.fromTokenSymbol + ", toTokenSymbol=" + this.toTokenSymbol + ", price=" + this.price + ", chainId=" + this.chainId + ", orderId=" + this.orderId + ", createTime=" + this.createTime + ", source=" + this.source + ", fromTokenIcon=" + this.fromTokenIcon + ", toTokenIcon=" + this.toTokenIcon + ", chainName=" + this.chainName + ", exploreUrl=" + this.exploreUrl + ", chainLogoUrl=" + this.chainLogoUrl + ", fromChildOrder=" + this.fromChildOrder + ", bridgeChildOrder=" + this.bridgeChildOrder + ", toChildOrder=" + this.toChildOrder + ", toastType=" + this.toastType + ", swapTradeType=" + this.swapTradeType + ", toChainId=" + this.toChainId + ", toChainName=" + this.toChainName + ", toChainLogoUrl=" + this.toChainLogoUrl + ", networkFee=" + this.networkFee + ", receiveTokenStatus=" + this.receiveTokenStatus + ", receiveTokenTxHash=" + this.receiveTokenTxHash + ", receiveTokenAmount=" + this.receiveTokenAmount + ", receiveTokenSymbol=" + this.receiveTokenSymbol + ", receiveTokenExploreUrl=" + this.receiveTokenExploreUrl + ", abnormalStatus=" + this.abnormalStatus + ", estimatedTime=" + this.estimatedTime + ", bridgeFee=" + this.bridgeFee + ", toSwapFee=" + this.toSwapFee + ", otherFees=" + this.otherFees + ", extendStatus=" + this.extendStatus + ", solanaToast=" + this.solanaToast + ", forRefuelFromAmount=" + this.forRefuelFromAmount + ", speedUpChildOrderId=" + this.speedUpChildOrderId + ", gasStationActivityReward=" + this.gasStationActivityReward + ", fromGasTokenPriceUsd=" + this.fromGasTokenPriceUsd + ", toGasTokenPriceUsd=" + this.toGasTokenPriceUsd + ", timeoutTimestamp=" + this.timeoutTimestamp + ", specialOrderType=" + this.specialOrderType + ", freeGas=" + this.freeGas + ", nativeTokenSymbol=" + this.nativeTokenSymbol + ", estimateBridgeFeeAmount=" + this.estimateBridgeFeeAmount + ", estimateBridgeFeeAmountUsd=" + this.estimateBridgeFeeAmountUsd + ", bridgeFeeUsd=" + this.bridgeFeeUsd + ", orderCompletionTime=" + this.orderCompletionTime + ", mevInfo=" + this.mevInfo + ", relativeTransaction=" + this.relativeTransaction + ", isMemeTimeOut=" + this.isMemeTimeOut + ", assetDelay=" + this.assetDelay + ", assetDelayTime=" + this.assetDelayTime + ", dexGasStationFeeDetailVO=" + this.dexGasStationFeeDetailVO + ", slippage=" + this.slippage + ", priorityFee=" + this.priorityFee + ", gasPrice=" + this.gasPrice + ", routerModeType=" + this.routerModeType + ", priorityFeeType=" + this.priorityFeeType + ", customPriorityFee=" + this.customPriorityFee + ", enableJito=" + this.enableJito + ", createdPrice=" + this.createdPrice + ", memeTokenMarketCap=" + this.memeTokenMarketCap + ", speedUpTxHash=" + this.speedUpTxHash + ", exchangeDirection=" + this.exchangeDirection + ", strategyType=" + this.strategyType + ", fromTokenIsNativeToken=" + this.fromTokenIsNativeToken + ", toTokenIsNativeToken=" + this.toTokenIsNativeToken + ", serviceFeeUsd=" + this.serviceFeeUsd + ", serviceFeeRate=" + this.serviceFeeRate + ", serviceFee=" + this.serviceFee + ", serviceFeeTokenSymbol=" + this.serviceFeeTokenSymbol + ", customSlippage=" + this.customSlippage + ", maxSlippage=" + this.maxSlippage + ", slippageType=" + this.slippageType + ", tradeMode=" + this.tradeMode + ", defiPlatformId=" + this.defiPlatformId + ", approveAmount=" + this.approveAmount + ", needCancelApproveToken=" + this.needCancelApproveToken + ", fromTokenIsCurrency=" + this.fromTokenIsCurrency + ", toTokenIsCurrency=" + this.toTokenIsCurrency + ", hideToast=" + this.hideToast + ", isHasSurplus=" + this.isHasSurplus + ", surplusAmount=" + this.surplusAmount + ", surplusValueUSD=" + this.surplusValueUSD + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeState> serializer() {
            return TradeState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeState(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, ChildOrder childOrder, ChildOrder childOrder2, ChildOrder childOrder3, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, DexGasStationActivity dexGasStationActivity, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, RelativeTransactionVO relativeTransactionVO, boolean z, boolean z2, String str53, DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX, String str54, String str55, String str56, String str57, String str58, Boolean bool, boolean z3, String str59, String str60, String str61, int i4, int i5, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, Integer num, Integer num2, String str70, String str71, Boolean bool2, Boolean bool3, Boolean bool4, int i6, int i7, String str72, String str73, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str;
        }
        if ((i & 2) == 0) {
            this.transactionHash = "";
        } else {
            this.transactionHash = str2;
        }
        if ((i & 4) == 0) {
            this.willNeedManualClaim = "0";
        } else {
            this.willNeedManualClaim = str3;
        }
        if ((i & 8) == 0) {
            this.fromTokenAddress = "";
        } else {
            this.fromTokenAddress = str4;
        }
        if ((i & 16) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str5;
        }
        if ((i & 32) == 0) {
            this.toTokenAddress = "";
        } else {
            this.toTokenAddress = str6;
        }
        if ((i & 64) == 0) {
            this.toAmount = "";
        } else {
            this.toAmount = str7;
        }
        if ((i & 128) == 0) {
            this.status = "";
        } else {
            this.status = str8;
        }
        if ((i & 256) == 0) {
            this.type = "";
        } else {
            this.type = str9;
        }
        if ((i & 512) == 0) {
            this.fromTokenSymbol = "";
        } else {
            this.fromTokenSymbol = str10;
        }
        if ((i & 1024) == 0) {
            this.toTokenSymbol = "";
        } else {
            this.toTokenSymbol = str11;
        }
        if ((i & 2048) == 0) {
            this.price = "";
        } else {
            this.price = str12;
        }
        if ((i & 4096) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str13;
        }
        if ((i & 8192) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str14;
        }
        if ((i & 16384) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str15;
        }
        if ((i & 32768) == 0) {
            this.source = "";
        } else {
            this.source = str16;
        }
        if ((i & 65536) == 0) {
            this.fromTokenIcon = "";
        } else {
            this.fromTokenIcon = str17;
        }
        if ((i & 131072) == 0) {
            this.toTokenIcon = "";
        } else {
            this.toTokenIcon = str18;
        }
        if ((262144 & i) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str19;
        }
        if ((524288 & i) == 0) {
            this.exploreUrl = "";
        } else {
            this.exploreUrl = str20;
        }
        if ((1048576 & i) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str21;
        }
        if ((2097152 & i) == 0) {
            this.fromChildOrder = null;
        } else {
            this.fromChildOrder = childOrder;
        }
        if ((4194304 & i) == 0) {
            this.bridgeChildOrder = null;
        } else {
            this.bridgeChildOrder = childOrder2;
        }
        if ((8388608 & i) == 0) {
            this.toChildOrder = null;
        } else {
            this.toChildOrder = childOrder3;
        }
        if ((16777216 & i) == 0) {
            this.toastType = "";
        } else {
            this.toastType = str22;
        }
        if ((33554432 & i) == 0) {
            this.swapTradeType = "";
        } else {
            this.swapTradeType = str23;
        }
        if ((67108864 & i) == 0) {
            this.toChainId = "";
        } else {
            this.toChainId = str24;
        }
        if ((134217728 & i) == 0) {
            this.toChainName = "";
        } else {
            this.toChainName = str25;
        }
        if ((268435456 & i) == 0) {
            this.toChainLogoUrl = "";
        } else {
            this.toChainLogoUrl = str26;
        }
        if ((536870912 & i) == 0) {
            this.networkFee = "";
        } else {
            this.networkFee = str27;
        }
        if ((1073741824 & i) == 0) {
            this.receiveTokenStatus = "";
        } else {
            this.receiveTokenStatus = str28;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.receiveTokenTxHash = "";
        } else {
            this.receiveTokenTxHash = str29;
        }
        if ((i2 & 1) == 0) {
            this.receiveTokenAmount = "";
        } else {
            this.receiveTokenAmount = str30;
        }
        if ((i2 & 2) == 0) {
            this.receiveTokenSymbol = "";
        } else {
            this.receiveTokenSymbol = str31;
        }
        if ((i2 & 4) == 0) {
            this.receiveTokenExploreUrl = "";
        } else {
            this.receiveTokenExploreUrl = str32;
        }
        this.abnormalStatus = (i2 & 8) == 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str33;
        if ((i2 & 16) == 0) {
            this.estimatedTime = "";
        } else {
            this.estimatedTime = str34;
        }
        if ((i2 & 32) == 0) {
            this.bridgeFee = "";
        } else {
            this.bridgeFee = str35;
        }
        if ((i2 & 64) == 0) {
            this.toSwapFee = "";
        } else {
            this.toSwapFee = str36;
        }
        if ((i2 & 128) == 0) {
            this.otherFees = "";
        } else {
            this.otherFees = str37;
        }
        if ((i2 & 256) == 0) {
            this.extendStatus = "";
        } else {
            this.extendStatus = str38;
        }
        if ((i2 & 512) == 0) {
            this.solanaToast = "";
        } else {
            this.solanaToast = str39;
        }
        if ((i2 & 1024) == 0) {
            this.forRefuelFromAmount = "";
        } else {
            this.forRefuelFromAmount = str40;
        }
        if ((i2 & 2048) == 0) {
            this.speedUpChildOrderId = "";
        } else {
            this.speedUpChildOrderId = str41;
        }
        this.gasStationActivityReward = (i2 & 4096) == 0 ? new DexGasStationActivity(0, "") : dexGasStationActivity;
        if ((i2 & 8192) == 0) {
            this.fromGasTokenPriceUsd = "";
        } else {
            this.fromGasTokenPriceUsd = str42;
        }
        if ((i2 & 16384) == 0) {
            this.toGasTokenPriceUsd = "";
        } else {
            this.toGasTokenPriceUsd = str43;
        }
        if ((i2 & 32768) == 0) {
            this.timeoutTimestamp = "";
        } else {
            this.timeoutTimestamp = str44;
        }
        if ((i2 & 65536) == 0) {
            this.specialOrderType = "";
        } else {
            this.specialOrderType = str45;
        }
        if ((i2 & 131072) == 0) {
            this.freeGas = "0";
        } else {
            this.freeGas = str46;
        }
        if ((262144 & i2) == 0) {
            this.nativeTokenSymbol = "";
        } else {
            this.nativeTokenSymbol = str47;
        }
        if ((524288 & i2) == 0) {
            this.estimateBridgeFeeAmount = "";
        } else {
            this.estimateBridgeFeeAmount = str48;
        }
        if ((1048576 & i2) == 0) {
            this.estimateBridgeFeeAmountUsd = "";
        } else {
            this.estimateBridgeFeeAmountUsd = str49;
        }
        if ((2097152 & i2) == 0) {
            this.bridgeFeeUsd = "";
        } else {
            this.bridgeFeeUsd = str50;
        }
        if ((4194304 & i2) == 0) {
            this.orderCompletionTime = "";
        } else {
            this.orderCompletionTime = str51;
        }
        if ((8388608 & i2) == 0) {
            this.mevInfo = "";
        } else {
            this.mevInfo = str52;
        }
        if ((16777216 & i2) == 0) {
            this.relativeTransaction = null;
        } else {
            this.relativeTransaction = relativeTransactionVO;
        }
        if ((33554432 & i2) == 0) {
            this.isMemeTimeOut = false;
        } else {
            this.isMemeTimeOut = z;
        }
        if ((67108864 & i2) == 0) {
            this.assetDelay = false;
        } else {
            this.assetDelay = z2;
        }
        if ((134217728 & i2) == 0) {
            this.assetDelayTime = "";
        } else {
            this.assetDelayTime = str53;
        }
        if ((268435456 & i2) == 0) {
            this.dexGasStationFeeDetailVO = null;
        } else {
            this.dexGasStationFeeDetailVO = dexGasStationFeeDetailVOX;
        }
        if ((536870912 & i2) == 0) {
            this.slippage = null;
        } else {
            this.slippage = str54;
        }
        if ((1073741824 & i2) == 0) {
            this.priorityFee = null;
        } else {
            this.priorityFee = str55;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.gasPrice = null;
        } else {
            this.gasPrice = str56;
        }
        if ((i3 & 1) == 0) {
            this.routerModeType = "";
        } else {
            this.routerModeType = str57;
        }
        if ((i3 & 2) == 0) {
            this.priorityFeeType = "";
        } else {
            this.priorityFeeType = str58;
        }
        this.customPriorityFee = (i3 & 4) == 0 ? Boolean.FALSE : bool;
        this.enableJito = (i3 & 8) == 0 ? true : z3;
        if ((i3 & 16) == 0) {
            this.createdPrice = "";
        } else {
            this.createdPrice = str59;
        }
        if ((i3 & 32) == 0) {
            this.memeTokenMarketCap = "";
        } else {
            this.memeTokenMarketCap = str60;
        }
        if ((i3 & 64) == 0) {
            this.speedUpTxHash = "";
        } else {
            this.speedUpTxHash = str61;
        }
        if ((i3 & 128) == 0) {
            this.exchangeDirection = 0;
        } else {
            this.exchangeDirection = i4;
        }
        this.strategyType = (i3 & 256) == 0 ? MemeOrdersStrategyType.MARKET.getValue() : i5;
        if ((i3 & 512) == 0) {
            this.fromTokenIsNativeToken = "0";
        } else {
            this.fromTokenIsNativeToken = str62;
        }
        if ((i3 & 1024) == 0) {
            this.toTokenIsNativeToken = "0";
        } else {
            this.toTokenIsNativeToken = str63;
        }
        if ((i3 & 2048) == 0) {
            this.serviceFeeUsd = "";
        } else {
            this.serviceFeeUsd = str64;
        }
        if ((i3 & 4096) == 0) {
            this.serviceFeeRate = "";
        } else {
            this.serviceFeeRate = str65;
        }
        if ((i3 & 8192) == 0) {
            this.serviceFee = "";
        } else {
            this.serviceFee = str66;
        }
        if ((i3 & 16384) == 0) {
            this.serviceFeeTokenSymbol = "";
        } else {
            this.serviceFeeTokenSymbol = str67;
        }
        if ((i3 & 32768) == 0) {
            this.customSlippage = null;
        } else {
            this.customSlippage = str68;
        }
        if ((i3 & 65536) == 0) {
            this.maxSlippage = null;
        } else {
            this.maxSlippage = str69;
        }
        this.slippageType = (i3 & 131072) == 0 ? Integer.valueOf(SlippageMode.Dynamic.getType()) : num;
        if ((262144 & i3) == 0) {
            this.tradeMode = null;
        } else {
            this.tradeMode = num2;
        }
        if ((524288 & i3) == 0) {
            this.defiPlatformId = null;
        } else {
            this.defiPlatformId = str70;
        }
        if ((1048576 & i3) == 0) {
            this.approveAmount = null;
        } else {
            this.approveAmount = str71;
        }
        if ((2097152 & i3) == 0) {
            this.needCancelApproveToken = null;
        } else {
            this.needCancelApproveToken = bool2;
        }
        this.fromTokenIsCurrency = (4194304 & i3) == 0 ? Boolean.FALSE : bool3;
        this.toTokenIsCurrency = (8388608 & i3) == 0 ? Boolean.FALSE : bool4;
        if ((16777216 & i3) == 0) {
            this.hideToast = 0;
        } else {
            this.hideToast = i6;
        }
        if ((33554432 & i3) == 0) {
            this.isHasSurplus = 0;
        } else {
            this.isHasSurplus = i7;
        }
        if ((67108864 & i3) == 0) {
            this.surplusAmount = "";
        } else {
            this.surplusAmount = str72;
        }
        if ((134217728 & i3) == 0) {
            this.surplusValueUSD = "";
        } else {
            this.surplusValueUSD = str73;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [157=4] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0771  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TradeState tradeState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeState.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeState.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeState.transactionHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeState.transactionHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeState.willNeedManualClaim, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeState.willNeedManualClaim);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradeState.fromTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeState.fromTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradeState.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeState.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tradeState.toTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tradeState.toTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tradeState.toAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tradeState.toAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tradeState.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tradeState.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tradeState.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tradeState.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tradeState.fromTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tradeState.fromTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tradeState.toTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tradeState.toTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradeState.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradeState.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tradeState.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tradeState.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tradeState.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tradeState.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tradeState.createTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tradeState.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tradeState.source, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, tradeState.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) tradeState.fromTokenIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, tradeState.fromTokenIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) tradeState.toTokenIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, tradeState.toTokenIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) tradeState.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, tradeState.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) tradeState.exploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, tradeState.exploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) tradeState.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, tradeState.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || tradeState.fromChildOrder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, ChildOrder$$serializer.INSTANCE, tradeState.fromChildOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || tradeState.bridgeChildOrder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, ChildOrder$$serializer.INSTANCE, tradeState.bridgeChildOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || tradeState.toChildOrder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, ChildOrder$$serializer.INSTANCE, tradeState.toChildOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) tradeState.toastType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, tradeState.toastType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) tradeState.swapTradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, tradeState.swapTradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) tradeState.toChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, tradeState.toChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) tradeState.toChainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, tradeState.toChainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) tradeState.toChainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, tradeState.toChainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) tradeState.networkFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, tradeState.networkFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) tradeState.receiveTokenStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, tradeState.receiveTokenStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) tradeState.receiveTokenTxHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, tradeState.receiveTokenTxHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) tradeState.receiveTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, tradeState.receiveTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) tradeState.receiveTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, tradeState.receiveTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) tradeState.receiveTokenExploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, tradeState.receiveTokenExploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) tradeState.abnormalStatus, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, tradeState.abnormalStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) tradeState.estimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, tradeState.estimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) tradeState.bridgeFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, tradeState.bridgeFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) tradeState.toSwapFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, tradeState.toSwapFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) tradeState.otherFees, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, tradeState.otherFees);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) tradeState.extendStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, tradeState.extendStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) tradeState.solanaToast, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, tradeState.solanaToast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) tradeState.forRefuelFromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, tradeState.forRefuelFromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) tradeState.speedUpChildOrderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, tradeState.speedUpChildOrderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd(tradeState.gasStationActivityReward, new DexGasStationActivity(0, ""))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 44, DexGasStationActivity$$serializer.INSTANCE, tradeState.gasStationActivityReward);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) tradeState.fromGasTokenPriceUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, tradeState.fromGasTokenPriceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) tradeState.toGasTokenPriceUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, tradeState.toGasTokenPriceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) tradeState.timeoutTimestamp, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, tradeState.timeoutTimestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) tradeState.specialOrderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, tradeState.specialOrderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) tradeState.freeGas, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, tradeState.freeGas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) tradeState.nativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, tradeState.nativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) tradeState.estimateBridgeFeeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, tradeState.estimateBridgeFeeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) tradeState.estimateBridgeFeeAmountUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, tradeState.estimateBridgeFeeAmountUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) tradeState.bridgeFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, tradeState.bridgeFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) tradeState.orderCompletionTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, tradeState.orderCompletionTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) tradeState.mevInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 55, tradeState.mevInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || tradeState.relativeTransaction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, RelativeTransactionVO$$serializer.INSTANCE, tradeState.relativeTransaction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || tradeState.isMemeTimeOut) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 57, tradeState.isMemeTimeOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || tradeState.assetDelay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 58, tradeState.assetDelay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) tradeState.assetDelayTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, tradeState.assetDelayTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || tradeState.dexGasStationFeeDetailVO != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 60, DexGasStationFeeDetailVOX$$serializer.INSTANCE, tradeState.dexGasStationFeeDetailVO);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || tradeState.slippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 61, StringSerializer.INSTANCE, tradeState.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || tradeState.priorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 62, StringSerializer.INSTANCE, tradeState.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || tradeState.gasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 63, StringSerializer.INSTANCE, tradeState.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || !Intrinsics.EZpvd((Object) tradeState.routerModeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 64, tradeState.routerModeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || !Intrinsics.EZpvd((Object) tradeState.priorityFeeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 65, tradeState.priorityFeeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || !Intrinsics.EZpvd(tradeState.customPriorityFee, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 66, BooleanSerializer.INSTANCE, tradeState.customPriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || !tradeState.enableJito) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 67, tradeState.enableJito);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || !Intrinsics.EZpvd((Object) tradeState.createdPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 68, tradeState.createdPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || !Intrinsics.EZpvd((Object) tradeState.memeTokenMarketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 69, tradeState.memeTokenMarketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || !Intrinsics.EZpvd((Object) tradeState.speedUpTxHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 70, tradeState.speedUpTxHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || tradeState.exchangeDirection != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 71, tradeState.exchangeDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || tradeState.strategyType != MemeOrdersStrategyType.MARKET.getValue()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 72, tradeState.strategyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || !Intrinsics.EZpvd((Object) tradeState.fromTokenIsNativeToken, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 73, tradeState.fromTokenIsNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || !Intrinsics.EZpvd((Object) tradeState.toTokenIsNativeToken, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 74, tradeState.toTokenIsNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || !Intrinsics.EZpvd((Object) tradeState.serviceFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 75, tradeState.serviceFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || !Intrinsics.EZpvd((Object) tradeState.serviceFeeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 76, tradeState.serviceFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || !Intrinsics.EZpvd((Object) tradeState.serviceFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 77, tradeState.serviceFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 78) || !Intrinsics.EZpvd((Object) tradeState.serviceFeeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 78, tradeState.serviceFeeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 79) || tradeState.customSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 79, StringSerializer.INSTANCE, tradeState.customSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 80) || tradeState.maxSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 80, StringSerializer.INSTANCE, tradeState.maxSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 81)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 81, IntSerializer.INSTANCE, tradeState.slippageType);
        } else {
            Integer num = tradeState.slippageType;
            int type = SlippageMode.Dynamic.getType();
            if (num == null || num.intValue() != type) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 82) || tradeState.tradeMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 82, IntSerializer.INSTANCE, tradeState.tradeMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 83) || tradeState.defiPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 83, StringSerializer.INSTANCE, tradeState.defiPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 84) || tradeState.approveAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 84, StringSerializer.INSTANCE, tradeState.approveAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 85) || tradeState.needCancelApproveToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 85, BooleanSerializer.INSTANCE, tradeState.needCancelApproveToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 86) || !Intrinsics.EZpvd(tradeState.fromTokenIsCurrency, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 86, BooleanSerializer.INSTANCE, tradeState.fromTokenIsCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 87) || !Intrinsics.EZpvd(tradeState.toTokenIsCurrency, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 87, BooleanSerializer.INSTANCE, tradeState.toTokenIsCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 88) || tradeState.hideToast != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 88, tradeState.hideToast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 89) || tradeState.isHasSurplus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 89, tradeState.isHasSurplus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 90) || !Intrinsics.EZpvd((Object) tradeState.surplusAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 90, tradeState.surplusAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 91) && Intrinsics.EZpvd((Object) tradeState.surplusValueUSD, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 91, tradeState.surplusValueUSD);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TradeState(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, ChildOrder childOrder, ChildOrder childOrder2, ChildOrder childOrder3, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, DexGasStationActivity dexGasStationActivity, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, RelativeTransactionVO relativeTransactionVO, boolean z, boolean z2, String str53, DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX, String str54, String str55, String str56, String str57, String str58, Boolean bool, boolean z3, String str59, String str60, String str61, int i, int i2, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, Integer num, Integer num2, String str70, String str71, Boolean bool2, Boolean bool3, Boolean bool4, int i3, int i4, String str72, String str73, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        String str74;
        String str75 = (i5 & 1) != 0 ? "" : str;
        String str76 = (i5 & 2) != 0 ? "" : str2;
        String str77 = (i5 & 4) != 0 ? "0" : str3;
        String str78 = (i5 & 8) != 0 ? "" : str4;
        String str79 = (i5 & 16) != 0 ? "" : str5;
        String str80 = (i5 & 32) != 0 ? "" : str6;
        String str81 = (i5 & 64) != 0 ? "" : str7;
        String str82 = (i5 & 128) != 0 ? "" : str8;
        String str83 = (i5 & 256) != 0 ? "" : str9;
        String str84 = (i5 & 512) != 0 ? "" : str10;
        String str85 = (i5 & 1024) != 0 ? "" : str11;
        String str86 = (i5 & 2048) != 0 ? "" : str12;
        String str87 = (i5 & 4096) != 0 ? "" : str13;
        String str88 = (i5 & 8192) != 0 ? "" : str14;
        String str89 = (i5 & 16384) != 0 ? "" : str15;
        String str90 = (i5 & 32768) != 0 ? "" : str16;
        String str91 = (i5 & 65536) != 0 ? "" : str17;
        String str92 = (i5 & 131072) != 0 ? "" : str18;
        String str93 = (i5 & 262144) != 0 ? "" : str19;
        String str94 = (i5 & 524288) != 0 ? "" : str20;
        String str95 = (i5 & 1048576) != 0 ? "" : str21;
        ChildOrder childOrder4 = (i5 & 2097152) != 0 ? null : childOrder;
        ChildOrder childOrder5 = (i5 & 4194304) != 0 ? null : childOrder2;
        ChildOrder childOrder6 = (i5 & 8388608) != 0 ? null : childOrder3;
        String str96 = (i5 & 16777216) != 0 ? "" : str22;
        String str97 = (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str23;
        String str98 = (i5 & 67108864) != 0 ? "" : str24;
        String str99 = (i5 & 134217728) != 0 ? "" : str25;
        String str100 = (i5 & 268435456) != 0 ? "" : str26;
        String str101 = (i5 & 536870912) != 0 ? "" : str27;
        String str102 = (i5 & 1073741824) != 0 ? "" : str28;
        String str103 = (i5 & Integer.MIN_VALUE) != 0 ? "" : str29;
        str74 = "";
        this(str75, str76, str77, str78, str79, str80, str81, str82, str83, str84, str85, str86, str87, str88, str89, str90, str91, str92, str93, str94, str95, childOrder4, childOrder5, childOrder6, str96, str97, str98, str99, str100, str101, str102, str103, (i6 & 1) != 0 ? "" : str30, (i6 & 2) != 0 ? "" : str31, (i6 & 4) != 0 ? "" : str32, (i6 & 8) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str33, (i6 & 16) != 0 ? "" : str34, (i6 & 32) != 0 ? "" : str35, (i6 & 64) != 0 ? "" : str36, (i6 & 128) != 0 ? "" : str37, (i6 & 256) != 0 ? "" : str38, (i6 & 512) != 0 ? "" : str39, (i6 & 1024) != 0 ? "" : str40, (i6 & 2048) != 0 ? "" : str41, (i6 & 4096) != 0 ? new DexGasStationActivity(0, "") : dexGasStationActivity, (i6 & 8192) != 0 ? "" : str42, (i6 & 16384) != 0 ? str74 : str43, (i6 & 32768) != 0 ? str74 : str44, (i6 & 65536) != 0 ? str74 : str45, (i6 & 131072) != 0 ? "0" : str46, (i6 & 262144) != 0 ? str74 : str47, (i6 & 524288) != 0 ? str74 : str48, (i6 & 1048576) != 0 ? str74 : str49, (i6 & 2097152) != 0 ? str74 : str50, (i6 & 4194304) != 0 ? str74 : str51, (i6 & 8388608) != 0 ? str74 : str52, (i6 & 16777216) != 0 ? null : relativeTransactionVO, (i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? false : z, (i6 & 67108864) != 0 ? false : z2, (i6 & 134217728) != 0 ? str74 : str53, (i6 & 268435456) != 0 ? null : dexGasStationFeeDetailVOX, (i6 & 536870912) != 0 ? null : str54, (i6 & 1073741824) != 0 ? null : str55, (i6 & Integer.MIN_VALUE) != 0 ? null : str56, (i7 & 1) != 0 ? str74 : str57, (i7 & 2) != 0 ? str74 : str58, (i7 & 4) != 0 ? Boolean.FALSE : bool, (i7 & 8) != 0 ? true : z3, (i7 & 16) != 0 ? str74 : str59, (i7 & 32) != 0 ? str74 : str60, (i7 & 64) != 0 ? str74 : str61, (i7 & 128) != 0 ? 0 : i, (i7 & 256) != 0 ? MemeOrdersStrategyType.MARKET.getValue() : i2, (i7 & 512) != 0 ? "0" : str62, (i7 & 1024) != 0 ? "0" : str63, (i7 & 2048) != 0 ? str74 : str64, (i7 & 4096) != 0 ? str74 : str65, (i7 & 8192) != 0 ? str74 : str66, (i7 & 16384) != 0 ? str74 : str67, (i7 & 32768) != 0 ? null : str68, (i7 & 65536) != 0 ? null : str69, (i7 & 131072) != 0 ? Integer.valueOf(SlippageMode.Dynamic.getType()) : num, (i7 & 262144) != 0 ? null : num2, (i7 & 524288) != 0 ? null : str70, (i7 & 1048576) != 0 ? null : str71, (i7 & 2097152) == 0 ? bool2 : null, (i7 & 4194304) != 0 ? Boolean.FALSE : bool3, (i7 & 8388608) != 0 ? Boolean.FALSE : bool4, (i7 & 16777216) != 0 ? 0 : i3, (i7 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? 0 : i4, (i7 & 67108864) != 0 ? str74 : str72, (i7 & 134217728) == 0 ? str73 : "");
    }

    public TradeState(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, ChildOrder childOrder, ChildOrder childOrder2, ChildOrder childOrder3, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull DexGasStationActivity dexGasStationActivity, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52, RelativeTransactionVO relativeTransactionVO, boolean z, boolean z2, @NotNull String str53, DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX, String str54, String str55, String str56, @NotNull String str57, @NotNull String str58, Boolean bool, boolean z3, @NotNull String str59, @NotNull String str60, @NotNull String str61, int i, int i2, @NotNull String str62, @NotNull String str63, @NotNull String str64, @NotNull String str65, @NotNull String str66, @NotNull String str67, String str68, String str69, Integer num, Integer num2, String str70, String str71, Boolean bool2, Boolean bool3, Boolean bool4, int i3, int i4, @NotNull String str72, @NotNull String str73) {
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
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(dexGasStationActivity, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        Intrinsics.checkNotNullParameter(str63, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str72, "");
        Intrinsics.checkNotNullParameter(str73, "");
        this.userWalletAddress = str;
        this.transactionHash = str2;
        this.willNeedManualClaim = str3;
        this.fromTokenAddress = str4;
        this.fromAmount = str5;
        this.toTokenAddress = str6;
        this.toAmount = str7;
        this.status = str8;
        this.type = str9;
        this.fromTokenSymbol = str10;
        this.toTokenSymbol = str11;
        this.price = str12;
        this.chainId = str13;
        this.orderId = str14;
        this.createTime = str15;
        this.source = str16;
        this.fromTokenIcon = str17;
        this.toTokenIcon = str18;
        this.chainName = str19;
        this.exploreUrl = str20;
        this.chainLogoUrl = str21;
        this.fromChildOrder = childOrder;
        this.bridgeChildOrder = childOrder2;
        this.toChildOrder = childOrder3;
        this.toastType = str22;
        this.swapTradeType = str23;
        this.toChainId = str24;
        this.toChainName = str25;
        this.toChainLogoUrl = str26;
        this.networkFee = str27;
        this.receiveTokenStatus = str28;
        this.receiveTokenTxHash = str29;
        this.receiveTokenAmount = str30;
        this.receiveTokenSymbol = str31;
        this.receiveTokenExploreUrl = str32;
        this.abnormalStatus = str33;
        this.estimatedTime = str34;
        this.bridgeFee = str35;
        this.toSwapFee = str36;
        this.otherFees = str37;
        this.extendStatus = str38;
        this.solanaToast = str39;
        this.forRefuelFromAmount = str40;
        this.speedUpChildOrderId = str41;
        this.gasStationActivityReward = dexGasStationActivity;
        this.fromGasTokenPriceUsd = str42;
        this.toGasTokenPriceUsd = str43;
        this.timeoutTimestamp = str44;
        this.specialOrderType = str45;
        this.freeGas = str46;
        this.nativeTokenSymbol = str47;
        this.estimateBridgeFeeAmount = str48;
        this.estimateBridgeFeeAmountUsd = str49;
        this.bridgeFeeUsd = str50;
        this.orderCompletionTime = str51;
        this.mevInfo = str52;
        this.relativeTransaction = relativeTransactionVO;
        this.isMemeTimeOut = z;
        this.assetDelay = z2;
        this.assetDelayTime = str53;
        this.dexGasStationFeeDetailVO = dexGasStationFeeDetailVOX;
        this.slippage = str54;
        this.priorityFee = str55;
        this.gasPrice = str56;
        this.routerModeType = str57;
        this.priorityFeeType = str58;
        this.customPriorityFee = bool;
        this.enableJito = z3;
        this.createdPrice = str59;
        this.memeTokenMarketCap = str60;
        this.speedUpTxHash = str61;
        this.exchangeDirection = i;
        this.strategyType = i2;
        this.fromTokenIsNativeToken = str62;
        this.toTokenIsNativeToken = str63;
        this.serviceFeeUsd = str64;
        this.serviceFeeRate = str65;
        this.serviceFee = str66;
        this.serviceFeeTokenSymbol = str67;
        this.customSlippage = str68;
        this.maxSlippage = str69;
        this.slippageType = num;
        this.tradeMode = num2;
        this.defiPlatformId = str70;
        this.approveAmount = str71;
        this.needCancelApproveToken = bool2;
        this.fromTokenIsCurrency = bool3;
        this.toTokenIsCurrency = bool4;
        this.hideToast = i3;
        this.isHasSurplus = i4;
        this.surplusAmount = str72;
        this.surplusValueUSD = str73;
    }

    public final boolean isSubmittingToast() {
        return C23313hvq.copydefault(this.solanaToast, "1");
    }

    public final boolean isMemeModeTimeOutToast() {
        return Intrinsics.EZpvd((Object) this.type, (Object) ExtJson.BRC20TYPE_TRADE) && Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "7") && this.isMemeTimeOut;
    }

    public final boolean isTerminalButGasdropRecieve() {
        return isTerminalState() && C23313hvq.AhwBna(this.receiveTokenStatus, "3");
    }

    public final boolean needShowTerminalDialog() {
        return Intrinsics.EZpvd((Object) this.type, (Object) "approve") || Intrinsics.EZpvd((Object) this.type, (Object) ExtJson.BRC20TYPE_TRADE) || Intrinsics.EZpvd((Object) this.type, (Object) "Unwrap") || Intrinsics.EZpvd((Object) this.type, (Object) "gasStation");
    }

    public final boolean needRefreshApproveState() {
        return Intrinsics.EZpvd((Object) this.type, (Object) "approve") || Intrinsics.EZpvd((Object) this.type, (Object) ExtJson.BRC20TYPE_TRADE) || Intrinsics.EZpvd((Object) this.type, (Object) "Unwrap") || Intrinsics.EZpvd((Object) this.type, (Object) "gasStation") || isRegister();
    }

    public final boolean isApproveType() {
        return Intrinsics.EZpvd((Object) this.type, (Object) "approve");
    }

    private final boolean isRegister() {
        return Intrinsics.EZpvd((Object) this.type, (Object) "register");
    }

    public final boolean pendingTx() {
        return Intrinsics.EZpvd((Object) this.status, (Object) "0");
    }

    public final boolean successTx() {
        return Intrinsics.EZpvd((Object) this.status, (Object) "1");
    }

    public final boolean canceledTx() {
        return Intrinsics.EZpvd((Object) this.status, (Object) "-2");
    }

    public final boolean isBridgeClaimTx() {
        return yDY.gEmmrt("200", "202").contains(this.status) || (successTx() && Intrinsics.EZpvd((Object) this.willNeedManualClaim, (Object) "1"));
    }

    public final boolean cancelApproveSuccess() {
        return Intrinsics.EZpvd((Object) this.status, (Object) "5");
    }

    public final boolean isFail() {
        return Intrinsics.EZpvd((Object) this.status, (Object) MultiTransferSignData.DEFAULT_INTERVAL);
    }

    public final boolean cancelingApprove() {
        return Intrinsics.EZpvd((Object) this.status, (Object) "-6");
    }

    public final boolean cancelApproveFail() {
        return Intrinsics.EZpvd((Object) this.status, (Object) "-5");
    }

    public final boolean isDefaultSwapType() {
        return (Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "1") || Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "2") || Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "3") || Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "7")) ? false : true;
    }

    public final boolean isTerminalState() {
        return Intrinsics.EZpvd((Object) this.status, (Object) "1") || Intrinsics.EZpvd((Object) this.status, (Object) MultiTransferSignData.DEFAULT_INTERVAL) || Intrinsics.EZpvd((Object) this.status, (Object) "-2") || Intrinsics.EZpvd((Object) this.status, (Object) "5") || Intrinsics.EZpvd((Object) this.status, (Object) "-5");
    }

    public final boolean isFromBitCoinChain() {
        return Intrinsics.EZpvd((Object) this.specialOrderType, (Object) "1");
    }

    public final boolean isMemeOrderType() {
        return Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "7");
    }

    public final boolean isAdvancedOrderType() {
        if (Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "1")) {
            Integer num = this.tradeMode;
            int type = TradeMode.AdvancedMode.getType();
            if (num != null && num.intValue() == type) {
                return true;
            }
        }
        return false;
    }

    public final boolean isSolRedPoint() {
        return Intrinsics.EZpvd((Object) "Unwrap", (Object) this.type) || Intrinsics.EZpvd((Object) this.type, (Object) ExtJson.BRC20TYPE_TRADE);
    }

    public final boolean isShowCancel() {
        ChildOrder childOrder = this.fromChildOrder;
        if (childOrder != null) {
            return childOrder.isShowCancel();
        }
        return false;
    }

    public final boolean isShowSpeedUp() {
        ChildOrder childOrder = this.fromChildOrder;
        if (childOrder != null) {
            return childOrder.isShowSpeedUp();
        }
        return false;
    }

    public final boolean isShowSpeedUpCancel() {
        ChildOrder childOrder = this.fromChildOrder;
        if (childOrder != null) {
            return childOrder.isShowSpeedUpCancel();
        }
        return false;
    }

    public final boolean isUpdateOrderInfo() {
        return (Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "1") || Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "4") || Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "5")) ? false : true;
    }
}
