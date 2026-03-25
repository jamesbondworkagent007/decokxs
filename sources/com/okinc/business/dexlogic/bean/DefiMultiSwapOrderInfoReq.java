package com.okinc.business.dexlogic.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig$$serializer;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC22421hez;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class DefiMultiSwapOrderInfoReq {
    private static final KSerializer<Object>[] $childSerializers;
    private final AccountInfo accountInfo;
    private final DexAutoSlippageInfoParam autoSlippageInfo;
    private final String bridgeId;
    private String bridgeReceiveAddress;
    private String chainId;
    private DexCrossChainRouterParam crossChainDexRouter;
    private final Boolean customPriorityFee;
    private final String customSlippage;
    private String deFiPlatformId;
    private ArrayList<DexRouterList> dexRouterList;
    private final Boolean enableJito;
    private String encryptReceiveAddress;
    private final String encryptSwftReceiveWalletAddress;
    private String estimateGasFee;
    private String fromAmount;
    private String fromTokenAddress;
    private String fromTokenDecimal;
    private final String gasPrice;
    private Integer gasRate;
    private String maxSlippage;
    private final MevConfig mevConfig;
    private String mevInfo;
    private String minimumReceived;
    private final String nativeTokenAmount;
    private boolean openMev;
    private String orderId;
    private final String orderSource;
    private final ArrayList<DexRouterList> originDexRouterList;
    private final String pmm;
    private final String priorityFee;
    private final String priorityFeeType;
    private String quoteData;
    private String quoteType;
    private String receiveWalletAddress;
    private final String referralCommissionJsVersion;
    private final PresetRouteType routerModeType;
    private final ServiceFeeInfo serviceFeeInfo;
    private final String signature;
    private String slippage;
    private final SlippageMode slippageMode;
    private String sourceExchangeType;
    private final String swftOrderId;
    private final String swftReceiveWalletAddress;
    private String toAmount;
    private String toChainId;
    private String toTokenAddress;
    private String toTokenDecimal;
    private final TraceData traceData;
    private final int tradeMode;
    private final String unsignedTx;
    private final String userUniqueId;
    private String userWalletAddress;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.gasRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.sourceExchangeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexRouterList> component12() {
        return this.dexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.quoteType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexRouterList> component17() {
        return this.originDexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexCrossChainRouterParam component18() {
        return this.crossChainDexRouter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.pmm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam component22() {
        return this.autoSlippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.customSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.swftOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.swftReceiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.encryptSwftReceiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.nativeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component32() {
        return this.openMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.bridgeReceiveAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.encryptReceiveAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.deFiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component38() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component39() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component42() {
        return this.customPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component43() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.orderSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraceData component45() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.quoteData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.referralCommissionJsVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo component50() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevConfig component51() {
        return this.mevConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PresetRouteType component52() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageMode component53() {
        return this.slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.fromTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiMultiSwapOrderInfoReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull String str9, Integer num, @NotNull String str10, ArrayList<DexRouterList> arrayList, String str11, String str12, @NotNull String str13, @NotNull String str14, ArrayList<DexRouterList> arrayList2, DexCrossChainRouterParam dexCrossChainRouterParam, @NotNull String str15, String str16, String str17, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str18, String str19, String str20, String str21, String str22, @NotNull String str23, @NotNull String str24, String str25, @NotNull String str26, boolean z, String str27, String str28, String str29, String str30, String str31, int i, Boolean bool, String str32, String str33, Boolean bool2, ServiceFeeInfo serviceFeeInfo, @NotNull String str34, TraceData traceData, String str35, String str36, String str37, String str38, AccountInfo accountInfo, MevConfig mevConfig, PresetRouteType presetRouteType, SlippageMode slippageMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str34, "");
        return new DefiMultiSwapOrderInfoReq(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, arrayList, str11, str12, str13, str14, arrayList2, dexCrossChainRouterParam, str15, str16, str17, dexAutoSlippageInfoParam, str18, str19, str20, str21, str22, str23, str24, str25, str26, z, str27, str28, str29, str30, str31, i, bool, str32, str33, bool2, serviceFeeInfo, str34, traceData, str35, str36, str37, str38, accountInfo, mevConfig, presetRouteType, slippageMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefiMultiSwapOrderInfoReq)) {
            return false;
        }
        DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq = (DefiMultiSwapOrderInfoReq) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) defiMultiSwapOrderInfoReq.chainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) defiMultiSwapOrderInfoReq.fromTokenAddress) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) defiMultiSwapOrderInfoReq.fromAmount) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) defiMultiSwapOrderInfoReq.toTokenAddress) && Intrinsics.EZpvd((Object) this.toAmount, (Object) defiMultiSwapOrderInfoReq.toAmount) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) defiMultiSwapOrderInfoReq.userWalletAddress) && Intrinsics.EZpvd((Object) this.slippage, (Object) defiMultiSwapOrderInfoReq.slippage) && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) defiMultiSwapOrderInfoReq.maxSlippage) && Intrinsics.EZpvd((Object) this.fromTokenDecimal, (Object) defiMultiSwapOrderInfoReq.fromTokenDecimal) && Intrinsics.EZpvd(this.gasRate, defiMultiSwapOrderInfoReq.gasRate) && Intrinsics.EZpvd((Object) this.sourceExchangeType, (Object) defiMultiSwapOrderInfoReq.sourceExchangeType) && Intrinsics.EZpvd(this.dexRouterList, defiMultiSwapOrderInfoReq.dexRouterList) && Intrinsics.EZpvd((Object) this.quoteType, (Object) defiMultiSwapOrderInfoReq.quoteType) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) defiMultiSwapOrderInfoReq.estimateGasFee) && Intrinsics.EZpvd((Object) this.toTokenDecimal, (Object) defiMultiSwapOrderInfoReq.toTokenDecimal) && Intrinsics.EZpvd((Object) this.toChainId, (Object) defiMultiSwapOrderInfoReq.toChainId) && Intrinsics.EZpvd(this.originDexRouterList, defiMultiSwapOrderInfoReq.originDexRouterList) && Intrinsics.EZpvd(this.crossChainDexRouter, defiMultiSwapOrderInfoReq.crossChainDexRouter) && Intrinsics.EZpvd((Object) this.pmm, (Object) defiMultiSwapOrderInfoReq.pmm) && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) defiMultiSwapOrderInfoReq.minimumReceived) && Intrinsics.EZpvd((Object) this.receiveWalletAddress, (Object) defiMultiSwapOrderInfoReq.receiveWalletAddress) && Intrinsics.EZpvd(this.autoSlippageInfo, defiMultiSwapOrderInfoReq.autoSlippageInfo) && Intrinsics.EZpvd((Object) this.customSlippage, (Object) defiMultiSwapOrderInfoReq.customSlippage) && Intrinsics.EZpvd((Object) this.swftOrderId, (Object) defiMultiSwapOrderInfoReq.swftOrderId) && Intrinsics.EZpvd((Object) this.swftReceiveWalletAddress, (Object) defiMultiSwapOrderInfoReq.swftReceiveWalletAddress) && Intrinsics.EZpvd((Object) this.encryptSwftReceiveWalletAddress, (Object) defiMultiSwapOrderInfoReq.encryptSwftReceiveWalletAddress) && Intrinsics.EZpvd((Object) this.nativeTokenAmount, (Object) defiMultiSwapOrderInfoReq.nativeTokenAmount) && Intrinsics.EZpvd((Object) this.walletId, (Object) defiMultiSwapOrderInfoReq.walletId) && Intrinsics.EZpvd((Object) this.userUniqueId, (Object) defiMultiSwapOrderInfoReq.userUniqueId) && Intrinsics.EZpvd((Object) this.orderId, (Object) defiMultiSwapOrderInfoReq.orderId) && Intrinsics.EZpvd((Object) this.mevInfo, (Object) defiMultiSwapOrderInfoReq.mevInfo) && this.openMev == defiMultiSwapOrderInfoReq.openMev && Intrinsics.EZpvd((Object) this.bridgeReceiveAddress, (Object) defiMultiSwapOrderInfoReq.bridgeReceiveAddress) && Intrinsics.EZpvd((Object) this.encryptReceiveAddress, (Object) defiMultiSwapOrderInfoReq.encryptReceiveAddress) && Intrinsics.EZpvd((Object) this.deFiPlatformId, (Object) defiMultiSwapOrderInfoReq.deFiPlatformId) && Intrinsics.EZpvd((Object) this.unsignedTx, (Object) defiMultiSwapOrderInfoReq.unsignedTx) && Intrinsics.EZpvd((Object) this.signature, (Object) defiMultiSwapOrderInfoReq.signature) && this.tradeMode == defiMultiSwapOrderInfoReq.tradeMode && Intrinsics.EZpvd(this.enableJito, defiMultiSwapOrderInfoReq.enableJito) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) defiMultiSwapOrderInfoReq.priorityFee) && Intrinsics.EZpvd((Object) this.bridgeId, (Object) defiMultiSwapOrderInfoReq.bridgeId) && Intrinsics.EZpvd(this.customPriorityFee, defiMultiSwapOrderInfoReq.customPriorityFee) && Intrinsics.EZpvd(this.serviceFeeInfo, defiMultiSwapOrderInfoReq.serviceFeeInfo) && Intrinsics.EZpvd((Object) this.orderSource, (Object) defiMultiSwapOrderInfoReq.orderSource) && Intrinsics.EZpvd(this.traceData, defiMultiSwapOrderInfoReq.traceData) && Intrinsics.EZpvd((Object) this.quoteData, (Object) defiMultiSwapOrderInfoReq.quoteData) && Intrinsics.EZpvd((Object) this.referralCommissionJsVersion, (Object) defiMultiSwapOrderInfoReq.referralCommissionJsVersion) && Intrinsics.EZpvd((Object) this.priorityFeeType, (Object) defiMultiSwapOrderInfoReq.priorityFeeType) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) defiMultiSwapOrderInfoReq.gasPrice) && Intrinsics.EZpvd(this.accountInfo, defiMultiSwapOrderInfoReq.accountInfo) && Intrinsics.EZpvd(this.mevConfig, defiMultiSwapOrderInfoReq.mevConfig) && this.routerModeType == defiMultiSwapOrderInfoReq.routerModeType && this.slippageMode == defiMultiSwapOrderInfoReq.slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam getAutoSlippageInfo() {
        return this.autoSlippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeId() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeReceiveAddress() {
        return this.bridgeReceiveAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexCrossChainRouterParam getCrossChainDexRouter() {
        return this.crossChainDexRouter;
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
    public final String getDeFiPlatformId() {
        return this.deFiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexRouterList> getDexRouterList() {
        return this.dexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnableJito() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncryptReceiveAddress() {
        return this.encryptReceiveAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncryptSwftReceiveWalletAddress() {
        return this.encryptSwftReceiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateGasFee() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenDecimal() {
        return this.fromTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGasRate() {
        return this.gasRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevConfig getMevConfig() {
        return this.mevConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevInfo() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumReceived() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenAmount() {
        return this.nativeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOpenMev() {
        return this.openMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderSource() {
        return this.orderSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexRouterList> getOriginDexRouterList() {
        return this.originDexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPmm() {
        return this.pmm;
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
    public final String getQuoteData() {
        return this.quoteData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteType() {
        return this.quoteType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveWalletAddress() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferralCommissionJsVersion() {
        return this.referralCommissionJsVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PresetRouteType getRouterModeType() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFeeInfo() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageMode getSlippageMode() {
        return this.slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceExchangeType() {
        return this.sourceExchangeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwftOrderId() {
        return this.swftOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwftReceiveWalletAddress() {
        return this.swftReceiveWalletAddress;
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
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenDecimal() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraceData getTraceData() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTradeMode() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUniqueId() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.fromTokenAddress.hashCode();
        int iHashCode3 = this.fromAmount.hashCode();
        int iHashCode4 = this.toTokenAddress.hashCode();
        int iHashCode5 = this.toAmount.hashCode();
        int iHashCode6 = this.userWalletAddress.hashCode();
        int iHashCode7 = this.slippage.hashCode();
        String str = this.maxSlippage;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        int iHashCode9 = this.fromTokenDecimal.hashCode();
        Integer num = this.gasRate;
        int iHashCode10 = num == null ? 0 : num.hashCode();
        int iHashCode11 = this.sourceExchangeType.hashCode();
        ArrayList<DexRouterList> arrayList = this.dexRouterList;
        int iHashCode12 = arrayList == null ? 0 : arrayList.hashCode();
        String str2 = this.quoteType;
        int iHashCode13 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.estimateGasFee;
        int iHashCode14 = str3 == null ? 0 : str3.hashCode();
        int iHashCode15 = this.toTokenDecimal.hashCode();
        int iHashCode16 = this.toChainId.hashCode();
        ArrayList<DexRouterList> arrayList2 = this.originDexRouterList;
        int iHashCode17 = arrayList2 == null ? 0 : arrayList2.hashCode();
        DexCrossChainRouterParam dexCrossChainRouterParam = this.crossChainDexRouter;
        int iHashCode18 = dexCrossChainRouterParam == null ? 0 : dexCrossChainRouterParam.hashCode();
        int iHashCode19 = this.pmm.hashCode();
        String str4 = this.minimumReceived;
        int iHashCode20 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.receiveWalletAddress;
        int iHashCode21 = str5 == null ? 0 : str5.hashCode();
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam = this.autoSlippageInfo;
        int iHashCode22 = dexAutoSlippageInfoParam == null ? 0 : dexAutoSlippageInfoParam.hashCode();
        String str6 = this.customSlippage;
        int iHashCode23 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.swftOrderId;
        int iHashCode24 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.swftReceiveWalletAddress;
        int iHashCode25 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.encryptSwftReceiveWalletAddress;
        int iHashCode26 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.nativeTokenAmount;
        int iHashCode27 = str10 == null ? 0 : str10.hashCode();
        int iHashCode28 = this.walletId.hashCode();
        int iHashCode29 = this.userUniqueId.hashCode();
        String str11 = this.orderId;
        int iHashCode30 = str11 == null ? 0 : str11.hashCode();
        int iHashCode31 = this.mevInfo.hashCode();
        int iHashCode32 = Boolean.hashCode(this.openMev);
        String str12 = this.bridgeReceiveAddress;
        int iHashCode33 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.encryptReceiveAddress;
        int iHashCode34 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.deFiPlatformId;
        int iHashCode35 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.unsignedTx;
        int iHashCode36 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.signature;
        int iHashCode37 = str16 == null ? 0 : str16.hashCode();
        int iHashCode38 = Integer.hashCode(this.tradeMode);
        Boolean bool = this.enableJito;
        int iHashCode39 = bool == null ? 0 : bool.hashCode();
        String str17 = this.priorityFee;
        int iHashCode40 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.bridgeId;
        int iHashCode41 = str18 == null ? 0 : str18.hashCode();
        Boolean bool2 = this.customPriorityFee;
        int iHashCode42 = bool2 == null ? 0 : bool2.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        int iHashCode43 = serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode();
        int iHashCode44 = this.orderSource.hashCode();
        TraceData traceData = this.traceData;
        int iHashCode45 = traceData == null ? 0 : traceData.hashCode();
        String str19 = this.quoteData;
        int iHashCode46 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.referralCommissionJsVersion;
        int iHashCode47 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.priorityFeeType;
        int iHashCode48 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.gasPrice;
        int iHashCode49 = str22 == null ? 0 : str22.hashCode();
        AccountInfo accountInfo = this.accountInfo;
        int iHashCode50 = accountInfo == null ? 0 : accountInfo.hashCode();
        MevConfig mevConfig = this.mevConfig;
        int iHashCode51 = mevConfig == null ? 0 : mevConfig.hashCode();
        PresetRouteType presetRouteType = this.routerModeType;
        int iHashCode52 = presetRouteType == null ? 0 : presetRouteType.hashCode();
        SlippageMode slippageMode = this.slippageMode;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + (slippageMode == null ? 0 : slippageMode.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBridgeReceiveAddress(String str) {
        this.bridgeReceiveAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCrossChainDexRouter(DexCrossChainRouterParam dexCrossChainRouterParam) {
        this.crossChainDexRouter = dexCrossChainRouterParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeFiPlatformId(String str) {
        this.deFiPlatformId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexRouterList(ArrayList<DexRouterList> arrayList) {
        this.dexRouterList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEncryptReceiveAddress(String str) {
        this.encryptReceiveAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimateGasFee(String str) {
        this.estimateGasFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromTokenAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromTokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromTokenDecimal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromTokenDecimal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasRate(Integer num) {
        this.gasRate = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSlippage(String str) {
        this.maxSlippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMevInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mevInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinimumReceived(String str) {
        this.minimumReceived = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenMev(boolean z) {
        this.openMev = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(String str) {
        this.orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteData(String str) {
        this.quoteData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteType(String str) {
        this.quoteType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceiveWalletAddress(String str) {
        this.receiveWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceExchangeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sourceExchangeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toChainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToTokenAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toTokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToTokenDecimal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toTokenDecimal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserWalletAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DefiMultiSwapOrderInfoReq(chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", fromAmount=" + this.fromAmount + ", toTokenAddress=" + this.toTokenAddress + ", toAmount=" + this.toAmount + ", userWalletAddress=" + this.userWalletAddress + ", slippage=" + this.slippage + ", maxSlippage=" + this.maxSlippage + ", fromTokenDecimal=" + this.fromTokenDecimal + ", gasRate=" + this.gasRate + ", sourceExchangeType=" + this.sourceExchangeType + ", dexRouterList=" + this.dexRouterList + ", quoteType=" + this.quoteType + ", estimateGasFee=" + this.estimateGasFee + ", toTokenDecimal=" + this.toTokenDecimal + ", toChainId=" + this.toChainId + ", originDexRouterList=" + this.originDexRouterList + ", crossChainDexRouter=" + this.crossChainDexRouter + ", pmm=" + this.pmm + ", minimumReceived=" + this.minimumReceived + ", receiveWalletAddress=" + this.receiveWalletAddress + ", autoSlippageInfo=" + this.autoSlippageInfo + ", customSlippage=" + this.customSlippage + ", swftOrderId=" + this.swftOrderId + ", swftReceiveWalletAddress=" + this.swftReceiveWalletAddress + ", encryptSwftReceiveWalletAddress=" + this.encryptSwftReceiveWalletAddress + ", nativeTokenAmount=" + this.nativeTokenAmount + ", walletId=" + this.walletId + ", userUniqueId=" + this.userUniqueId + ", orderId=" + this.orderId + ", mevInfo=" + this.mevInfo + ", openMev=" + this.openMev + ", bridgeReceiveAddress=" + this.bridgeReceiveAddress + ", encryptReceiveAddress=" + this.encryptReceiveAddress + ", deFiPlatformId=" + this.deFiPlatformId + ", unsignedTx=" + this.unsignedTx + ", signature=" + this.signature + ", tradeMode=" + this.tradeMode + ", enableJito=" + this.enableJito + ", priorityFee=" + this.priorityFee + ", bridgeId=" + this.bridgeId + ", customPriorityFee=" + this.customPriorityFee + ", serviceFeeInfo=" + this.serviceFeeInfo + ", orderSource=" + this.orderSource + ", traceData=" + this.traceData + ", quoteData=" + this.quoteData + ", referralCommissionJsVersion=" + this.referralCommissionJsVersion + ", priorityFeeType=" + this.priorityFeeType + ", gasPrice=" + this.gasPrice + ", accountInfo=" + this.accountInfo + ", mevConfig=" + this.mevConfig + ", routerModeType=" + this.routerModeType + ", slippageMode=" + this.slippageMode + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DefiMultiSwapOrderInfoReq> serializer() {
            return DefiMultiSwapOrderInfoReq$$serializer.INSTANCE;
        }
    }

    static {
        DexRouterList$$serializer dexRouterList$$serializer = DexRouterList$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(dexRouterList$$serializer), null, null, null, null, new ArrayListSerializer(dexRouterList$$serializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dexlogic.bean.PresetRouteType", PresetRouteType.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode", SlippageMode.values())};
    }

    public /* synthetic */ DefiMultiSwapOrderInfoReq(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, ArrayList arrayList, String str11, String str12, String str13, String str14, ArrayList arrayList2, DexCrossChainRouterParam dexCrossChainRouterParam, String str15, String str16, String str17, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, boolean z, String str27, String str28, String str29, String str30, String str31, int i3, Boolean bool, String str32, String str33, Boolean bool2, ServiceFeeInfo serviceFeeInfo, String str34, TraceData traceData, String str35, String str36, String str37, String str38, AccountInfo accountInfo, MevConfig mevConfig, PresetRouteType presetRouteType, SlippageMode slippageMode, SerializationConstructorMarker serializationConstructorMarker) {
        if (393248 != (i2 & 393248)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{0, 393248}, DefiMultiSwapOrderInfoReq$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.fromTokenAddress = "";
        } else {
            this.fromTokenAddress = str2;
        }
        if ((i & 4) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str3;
        }
        if ((i & 8) == 0) {
            this.toTokenAddress = "";
        } else {
            this.toTokenAddress = str4;
        }
        if ((i & 16) == 0) {
            this.toAmount = "";
        } else {
            this.toAmount = str5;
        }
        if ((i & 32) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str6;
        }
        if ((i & 64) == 0) {
            this.slippage = "";
        } else {
            this.slippage = str7;
        }
        if ((i & 128) == 0) {
            this.maxSlippage = null;
        } else {
            this.maxSlippage = str8;
        }
        if ((i & 256) == 0) {
            this.fromTokenDecimal = "";
        } else {
            this.fromTokenDecimal = str9;
        }
        if ((i & 512) == 0) {
            this.gasRate = null;
        } else {
            this.gasRate = num;
        }
        if ((i & 1024) == 0) {
            this.sourceExchangeType = "";
        } else {
            this.sourceExchangeType = str10;
        }
        if ((i & 2048) == 0) {
            this.dexRouterList = null;
        } else {
            this.dexRouterList = arrayList;
        }
        if ((i & 4096) == 0) {
            this.quoteType = "";
        } else {
            this.quoteType = str11;
        }
        if ((i & 8192) == 0) {
            this.estimateGasFee = "";
        } else {
            this.estimateGasFee = str12;
        }
        if ((i & 16384) == 0) {
            this.toTokenDecimal = "";
        } else {
            this.toTokenDecimal = str13;
        }
        if ((i & 32768) == 0) {
            this.toChainId = "";
        } else {
            this.toChainId = str14;
        }
        if ((i & 65536) == 0) {
            this.originDexRouterList = null;
        } else {
            this.originDexRouterList = arrayList2;
        }
        if ((131072 & i) == 0) {
            this.crossChainDexRouter = null;
        } else {
            this.crossChainDexRouter = dexCrossChainRouterParam;
        }
        if ((262144 & i) == 0) {
            this.pmm = "";
        } else {
            this.pmm = str15;
        }
        if ((i & 524288) == 0) {
            this.minimumReceived = null;
        } else {
            this.minimumReceived = str16;
        }
        if ((i & 1048576) == 0) {
            this.receiveWalletAddress = null;
        } else {
            this.receiveWalletAddress = str17;
        }
        if ((2097152 & i) == 0) {
            this.autoSlippageInfo = null;
        } else {
            this.autoSlippageInfo = dexAutoSlippageInfoParam;
        }
        if ((4194304 & i) == 0) {
            this.customSlippage = null;
        } else {
            this.customSlippage = str18;
        }
        if ((8388608 & i) == 0) {
            this.swftOrderId = null;
        } else {
            this.swftOrderId = str19;
        }
        if ((16777216 & i) == 0) {
            this.swftReceiveWalletAddress = null;
        } else {
            this.swftReceiveWalletAddress = str20;
        }
        if ((33554432 & i) == 0) {
            this.encryptSwftReceiveWalletAddress = null;
        } else {
            this.encryptSwftReceiveWalletAddress = str21;
        }
        if ((67108864 & i) == 0) {
            this.nativeTokenAmount = null;
        } else {
            this.nativeTokenAmount = str22;
        }
        if ((134217728 & i) == 0) {
            this.walletId = "";
        } else {
            this.walletId = str23;
        }
        if ((268435456 & i) == 0) {
            this.userUniqueId = "";
        } else {
            this.userUniqueId = str24;
        }
        if ((536870912 & i) == 0) {
            this.orderId = null;
        } else {
            this.orderId = str25;
        }
        if ((1073741824 & i) == 0) {
            this.mevInfo = "";
        } else {
            this.mevInfo = str26;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.openMev = false;
        } else {
            this.openMev = z;
        }
        if ((i2 & 1) == 0) {
            this.bridgeReceiveAddress = null;
        } else {
            this.bridgeReceiveAddress = str27;
        }
        if ((i2 & 2) == 0) {
            this.encryptReceiveAddress = null;
        } else {
            this.encryptReceiveAddress = str28;
        }
        if ((i2 & 4) == 0) {
            this.deFiPlatformId = null;
        } else {
            this.deFiPlatformId = str29;
        }
        if ((i2 & 8) == 0) {
            this.unsignedTx = null;
        } else {
            this.unsignedTx = str30;
        }
        if ((i2 & 16) == 0) {
            this.signature = null;
        } else {
            this.signature = str31;
        }
        this.tradeMode = i3;
        if ((i2 & 64) == 0) {
            this.enableJito = null;
        } else {
            this.enableJito = bool;
        }
        if ((i2 & 128) == 0) {
            this.priorityFee = null;
        } else {
            this.priorityFee = str32;
        }
        if ((i2 & 256) == 0) {
            this.bridgeId = null;
        } else {
            this.bridgeId = str33;
        }
        if ((i2 & 512) == 0) {
            this.customPriorityFee = null;
        } else {
            this.customPriorityFee = bool2;
        }
        if ((i2 & 1024) == 0) {
            this.serviceFeeInfo = null;
        } else {
            this.serviceFeeInfo = serviceFeeInfo;
        }
        this.orderSource = (i2 & 2048) == 0 ? AbstractC22421hez.Companion.KWHzl() : str34;
        if ((i2 & 4096) == 0) {
            this.traceData = null;
        } else {
            this.traceData = traceData;
        }
        if ((i2 & 8192) == 0) {
            this.quoteData = "";
        } else {
            this.quoteData = str35;
        }
        if ((i2 & 16384) == 0) {
            this.referralCommissionJsVersion = null;
        } else {
            this.referralCommissionJsVersion = str36;
        }
        if ((i2 & 32768) == 0) {
            this.priorityFeeType = null;
        } else {
            this.priorityFeeType = str37;
        }
        if ((i2 & 65536) == 0) {
            this.gasPrice = null;
        } else {
            this.gasPrice = str38;
        }
        this.accountInfo = accountInfo;
        this.mevConfig = mevConfig;
        if ((i2 & 524288) == 0) {
            this.routerModeType = null;
        } else {
            this.routerModeType = presetRouteType;
        }
        if ((i2 & 1048576) == 0) {
            this.slippageMode = null;
        } else {
            this.slippageMode = slippageMode;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, defiMultiSwapOrderInfoReq.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.fromTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, defiMultiSwapOrderInfoReq.fromTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, defiMultiSwapOrderInfoReq.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.toTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, defiMultiSwapOrderInfoReq.toTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.toAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, defiMultiSwapOrderInfoReq.toAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, defiMultiSwapOrderInfoReq.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, defiMultiSwapOrderInfoReq.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || defiMultiSwapOrderInfoReq.maxSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.maxSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.fromTokenDecimal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, defiMultiSwapOrderInfoReq.fromTokenDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || defiMultiSwapOrderInfoReq.gasRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, defiMultiSwapOrderInfoReq.gasRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.sourceExchangeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, defiMultiSwapOrderInfoReq.sourceExchangeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || defiMultiSwapOrderInfoReq.dexRouterList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], defiMultiSwapOrderInfoReq.dexRouterList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.quoteType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.quoteType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.estimateGasFee, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.toTokenDecimal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, defiMultiSwapOrderInfoReq.toTokenDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.toChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, defiMultiSwapOrderInfoReq.toChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || defiMultiSwapOrderInfoReq.originDexRouterList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], defiMultiSwapOrderInfoReq.originDexRouterList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || defiMultiSwapOrderInfoReq.crossChainDexRouter != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, DexCrossChainRouterParam$$serializer.INSTANCE, defiMultiSwapOrderInfoReq.crossChainDexRouter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.pmm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, defiMultiSwapOrderInfoReq.pmm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || defiMultiSwapOrderInfoReq.minimumReceived != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.minimumReceived);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || defiMultiSwapOrderInfoReq.receiveWalletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.receiveWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || defiMultiSwapOrderInfoReq.autoSlippageInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, DexAutoSlippageInfoParam$$serializer.INSTANCE, defiMultiSwapOrderInfoReq.autoSlippageInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || defiMultiSwapOrderInfoReq.customSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.customSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || defiMultiSwapOrderInfoReq.swftOrderId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.swftOrderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || defiMultiSwapOrderInfoReq.swftReceiveWalletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.swftReceiveWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || defiMultiSwapOrderInfoReq.encryptSwftReceiveWalletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.encryptSwftReceiveWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || defiMultiSwapOrderInfoReq.nativeTokenAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.nativeTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.walletId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, defiMultiSwapOrderInfoReq.walletId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.userUniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, defiMultiSwapOrderInfoReq.userUniqueId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || defiMultiSwapOrderInfoReq.orderId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.mevInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, defiMultiSwapOrderInfoReq.mevInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || defiMultiSwapOrderInfoReq.openMev) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 31, defiMultiSwapOrderInfoReq.openMev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || defiMultiSwapOrderInfoReq.bridgeReceiveAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.bridgeReceiveAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || defiMultiSwapOrderInfoReq.encryptReceiveAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.encryptReceiveAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || defiMultiSwapOrderInfoReq.deFiPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.deFiPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || defiMultiSwapOrderInfoReq.unsignedTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.unsignedTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || defiMultiSwapOrderInfoReq.signature != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.signature);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 37, defiMultiSwapOrderInfoReq.tradeMode);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || defiMultiSwapOrderInfoReq.enableJito != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, BooleanSerializer.INSTANCE, defiMultiSwapOrderInfoReq.enableJito);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || defiMultiSwapOrderInfoReq.priorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || defiMultiSwapOrderInfoReq.bridgeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.bridgeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || defiMultiSwapOrderInfoReq.customPriorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, BooleanSerializer.INSTANCE, defiMultiSwapOrderInfoReq.customPriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || defiMultiSwapOrderInfoReq.serviceFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, ServiceFeeInfo$$serializer.INSTANCE, defiMultiSwapOrderInfoReq.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.orderSource, (Object) AbstractC22421hez.Companion.KWHzl())) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, defiMultiSwapOrderInfoReq.orderSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || defiMultiSwapOrderInfoReq.traceData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, TraceData$$serializer.INSTANCE, defiMultiSwapOrderInfoReq.traceData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) defiMultiSwapOrderInfoReq.quoteData, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.quoteData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || defiMultiSwapOrderInfoReq.referralCommissionJsVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.referralCommissionJsVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || defiMultiSwapOrderInfoReq.priorityFeeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.priorityFeeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || defiMultiSwapOrderInfoReq.gasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, StringSerializer.INSTANCE, defiMultiSwapOrderInfoReq.gasPrice);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, AccountInfo$$serializer.INSTANCE, defiMultiSwapOrderInfoReq.accountInfo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, MevConfig$$serializer.INSTANCE, defiMultiSwapOrderInfoReq.mevConfig);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || defiMultiSwapOrderInfoReq.routerModeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, kSerializerArr[51], defiMultiSwapOrderInfoReq.routerModeType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) && defiMultiSwapOrderInfoReq.slippageMode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, kSerializerArr[52], defiMultiSwapOrderInfoReq.slippageMode);
    }

    public DefiMultiSwapOrderInfoReq(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull String str9, Integer num, @NotNull String str10, ArrayList<DexRouterList> arrayList, String str11, String str12, @NotNull String str13, @NotNull String str14, ArrayList<DexRouterList> arrayList2, DexCrossChainRouterParam dexCrossChainRouterParam, @NotNull String str15, String str16, String str17, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str18, String str19, String str20, String str21, String str22, @NotNull String str23, @NotNull String str24, String str25, @NotNull String str26, boolean z, String str27, String str28, String str29, String str30, String str31, int i, Boolean bool, String str32, String str33, Boolean bool2, ServiceFeeInfo serviceFeeInfo, @NotNull String str34, TraceData traceData, String str35, String str36, String str37, String str38, AccountInfo accountInfo, MevConfig mevConfig, PresetRouteType presetRouteType, SlippageMode slippageMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str34, "");
        this.chainId = str;
        this.fromTokenAddress = str2;
        this.fromAmount = str3;
        this.toTokenAddress = str4;
        this.toAmount = str5;
        this.userWalletAddress = str6;
        this.slippage = str7;
        this.maxSlippage = str8;
        this.fromTokenDecimal = str9;
        this.gasRate = num;
        this.sourceExchangeType = str10;
        this.dexRouterList = arrayList;
        this.quoteType = str11;
        this.estimateGasFee = str12;
        this.toTokenDecimal = str13;
        this.toChainId = str14;
        this.originDexRouterList = arrayList2;
        this.crossChainDexRouter = dexCrossChainRouterParam;
        this.pmm = str15;
        this.minimumReceived = str16;
        this.receiveWalletAddress = str17;
        this.autoSlippageInfo = dexAutoSlippageInfoParam;
        this.customSlippage = str18;
        this.swftOrderId = str19;
        this.swftReceiveWalletAddress = str20;
        this.encryptSwftReceiveWalletAddress = str21;
        this.nativeTokenAmount = str22;
        this.walletId = str23;
        this.userUniqueId = str24;
        this.orderId = str25;
        this.mevInfo = str26;
        this.openMev = z;
        this.bridgeReceiveAddress = str27;
        this.encryptReceiveAddress = str28;
        this.deFiPlatformId = str29;
        this.unsignedTx = str30;
        this.signature = str31;
        this.tradeMode = i;
        this.enableJito = bool;
        this.priorityFee = str32;
        this.bridgeId = str33;
        this.customPriorityFee = bool2;
        this.serviceFeeInfo = serviceFeeInfo;
        this.orderSource = str34;
        this.traceData = traceData;
        this.quoteData = str35;
        this.referralCommissionJsVersion = str36;
        this.priorityFeeType = str37;
        this.gasPrice = str38;
        this.accountInfo = accountInfo;
        this.mevConfig = mevConfig;
        this.routerModeType = presetRouteType;
        this.slippageMode = slippageMode;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0224: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r112v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r112v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r112v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r112v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r112v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r112v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r112v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r112v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r112v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004e: ARITH (r112v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r68v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r112v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x005e: ARITH (r112v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r70v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r112v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r112v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (r112v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (r112v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0090: ARITH (r112v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r75v0 java.util.ArrayList))
  (wrap:com.okinc.business.dexlogic.bean.DexCrossChainRouterParam:?: TERNARY null = ((wrap:int:0x009b: ARITH (r112v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexCrossChainRouterParam) : (r76v0 com.okinc.business.dexlogic.bean.DexCrossChainRouterParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r112v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b1: ARITH (r112v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r112v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r79v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r112v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam) : (r80v0 com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d2: ARITH (r112v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dd: ARITH (r112v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e8: ARITH (r112v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f3: ARITH (r112v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fe: ARITH (r112v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r85v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0109: ARITH (r112v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0114: ARITH (r112v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011f: ARITH (r112v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012a: ARITH (r112v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0135: ARITH (r112v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? false : (r90v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013d: ARITH (r113v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r91v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0146: ARITH (r113v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r92v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014f: ARITH (r113v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r93v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0158: ARITH (r113v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r94v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0161: ARITH (r113v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r95v0 java.lang.String))
  (r96v0 int)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x016a: ARITH (r113v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r97v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0173: ARITH (r113v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r98v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x017c: ARITH (r113v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r99v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0185: ARITH (r113v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r100v0 java.lang.Boolean))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x018e: ARITH (r113v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r101v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0197: ARITH (r113v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01a1: INVOKE (wrap:o.hez$Application:0x019b: SGET  A[WRAPPED] (LINE:1604) o.hez.Companion o.hez$Application) VIRTUAL call: o.hez.Application.KWHzl():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:1604)) : (r102v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.TraceData:?: TERNARY null = ((wrap:int:0x01a6: ARITH (r113v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.TraceData) : (r103v0 com.okinc.business.dexlogic.bean.TraceData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01af: ARITH (r113v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r104v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01b6: ARITH (r113v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r105v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01bf: ARITH (32768 int) & (r113v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r106v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01c7: ARITH (r113v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r107v0 java.lang.String))
  (r108v0 com.okinc.business.dex.trade.core.domain.model.common.AccountInfo)
  (r109v0 com.okinc.business.dex.trade.core.domain.model.common.MevConfig)
  (wrap:com.okinc.business.dexlogic.bean.PresetRouteType:?: TERNARY null = ((wrap:int:0x01d0: ARITH (r113v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.PresetRouteType) : (r110v0 com.okinc.business.dexlogic.bean.PresetRouteType))
  (wrap:com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode:?: TERNARY null = ((wrap:int:0x01d9: ARITH (r113v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode) : (r111v0 com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.util.ArrayList<com.okinc.business.dexlogic.bean.DexRouterList>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.business.dexlogic.bean.DexRouterList>, com.okinc.business.dexlogic.bean.DexCrossChainRouterParam, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.business.dexlogic.bean.ServiceFeeInfo, java.lang.String, com.okinc.business.dexlogic.bean.TraceData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo, com.okinc.business.dex.trade.core.domain.model.common.MevConfig, com.okinc.business.dexlogic.bean.PresetRouteType, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode):void (m)] (LINE:1559) call: com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, com.okinc.business.dexlogic.bean.DexCrossChainRouterParam, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.business.dexlogic.bean.ServiceFeeInfo, java.lang.String, com.okinc.business.dexlogic.bean.TraceData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo, com.okinc.business.dex.trade.core.domain.model.common.MevConfig, com.okinc.business.dexlogic.bean.PresetRouteType, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode):void type: THIS */
    public /* synthetic */ DefiMultiSwapOrderInfoReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, ArrayList arrayList, String str11, String str12, String str13, String str14, ArrayList arrayList2, DexCrossChainRouterParam dexCrossChainRouterParam, String str15, String str16, String str17, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, boolean z, String str27, String str28, String str29, String str30, String str31, int i, Boolean bool, String str32, String str33, Boolean bool2, ServiceFeeInfo serviceFeeInfo, String str34, TraceData traceData, String str35, String str36, String str37, String str38, AccountInfo accountInfo, MevConfig mevConfig, PresetRouteType presetRouteType, SlippageMode slippageMode, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? null : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? null : num, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? null : arrayList, (i2 & 4096) != 0 ? "" : str11, (i2 & 8192) != 0 ? "" : str12, (i2 & 16384) != 0 ? "" : str13, (i2 & 32768) != 0 ? "" : str14, (i2 & 65536) != 0 ? null : arrayList2, (i2 & 131072) != 0 ? null : dexCrossChainRouterParam, (i2 & 262144) != 0 ? "" : str15, (i2 & 524288) != 0 ? null : str16, (i2 & 1048576) != 0 ? null : str17, (i2 & 2097152) != 0 ? null : dexAutoSlippageInfoParam, (i2 & 4194304) != 0 ? null : str18, (i2 & 8388608) != 0 ? null : str19, (i2 & 16777216) != 0 ? null : str20, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str21, (i2 & 67108864) != 0 ? null : str22, (i2 & 134217728) != 0 ? "" : str23, (i2 & 268435456) != 0 ? "" : str24, (i2 & 536870912) != 0 ? null : str25, (i2 & 1073741824) != 0 ? "" : str26, (i2 & Integer.MIN_VALUE) != 0 ? false : z, (i3 & 1) != 0 ? null : str27, (i3 & 2) != 0 ? null : str28, (i3 & 4) != 0 ? null : str29, (i3 & 8) != 0 ? null : str30, (i3 & 16) != 0 ? null : str31, i, (i3 & 64) != 0 ? null : bool, (i3 & 128) != 0 ? null : str32, (i3 & 256) != 0 ? null : str33, (i3 & 512) != 0 ? null : bool2, (i3 & 1024) != 0 ? null : serviceFeeInfo, (i3 & 2048) != 0 ? AbstractC22421hez.Companion.KWHzl() : str34, (i3 & 4096) != 0 ? null : traceData, (i3 & 8192) == 0 ? str35 : "", (i3 & 16384) != 0 ? null : str36, (32768 & i3) != 0 ? null : str37, (i3 & 65536) != 0 ? null : str38, accountInfo, mevConfig, (i3 & 524288) != 0 ? null : presetRouteType, (i3 & 1048576) != 0 ? null : slippageMode);
    }
}
