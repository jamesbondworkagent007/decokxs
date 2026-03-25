package com.okinc.business.trade.features.home.ui.cefi.data;

import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam$$serializer;
import com.okinc.business.dexlogic.bean.DexRouterList;
import com.okinc.business.dexlogic.bean.DexRouterList$$serializer;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TraceData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AdvancedCallDataRequest {
    private final DexAutoSlippageInfoParam autoSlippageInfo;
    private final String chainId;
    private final boolean customPriorityFee;
    private final String customSlippage;
    private final String defiPlatformId;
    private final List<DexRouterList> dexRouterList;
    private final Integer direction;
    private final Boolean enableJito;
    private final String estimateGasFee;
    private final String fromAmount;
    private final String fromTokenAddress;
    private final String gasPrice;
    private final String maxSlippage;
    private String mevInfo;
    private final String orderId;
    private final String priorityFee;
    private final String priorityFeeType;
    private final String referralCommissionJsVersion;
    private final String routerModeType;
    private final ServiceFeeInfo serviceFeeInfo;
    private final String signature;
    private final String toAmount;
    private final String toTokenAddress;
    private TraceData traceData;
    private final Integer tradeMode;
    private final String unsignedTx;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(DexRouterList$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRouterList> component1() {
        return this.dexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.customPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraceData component15() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component17() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component18() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component19() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam component20() {
        return this.autoSlippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.customSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.defiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.referralCommissionJsVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedCallDataRequest copy(@NotNull List<DexRouterList> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, Boolean bool, @NotNull String str10, @NotNull String str11, boolean z, TraceData traceData, String str12, ServiceFeeInfo serviceFeeInfo, Integer num, Integer num2, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str13, String str14, String str15, @NotNull String str16, @NotNull String str17, String str18, String str19) {
        Intrinsics.checkNotNullParameter(list, "");
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
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        return new AdvancedCallDataRequest(list, str, str2, str3, str4, str5, str6, str7, str8, str9, bool, str10, str11, z, traceData, str12, serviceFeeInfo, num, num2, dexAutoSlippageInfoParam, str13, str14, str15, str16, str17, str18, str19);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvancedCallDataRequest)) {
            return false;
        }
        AdvancedCallDataRequest advancedCallDataRequest = (AdvancedCallDataRequest) obj;
        return Intrinsics.EZpvd(this.dexRouterList, advancedCallDataRequest.dexRouterList) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) advancedCallDataRequest.priorityFee) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) advancedCallDataRequest.gasPrice) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) advancedCallDataRequest.estimateGasFee) && Intrinsics.EZpvd((Object) this.chainId, (Object) advancedCallDataRequest.chainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) advancedCallDataRequest.fromTokenAddress) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) advancedCallDataRequest.fromAmount) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) advancedCallDataRequest.toTokenAddress) && Intrinsics.EZpvd((Object) this.toAmount, (Object) advancedCallDataRequest.toAmount) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) advancedCallDataRequest.userWalletAddress) && Intrinsics.EZpvd(this.enableJito, advancedCallDataRequest.enableJito) && Intrinsics.EZpvd((Object) this.routerModeType, (Object) advancedCallDataRequest.routerModeType) && Intrinsics.EZpvd((Object) this.priorityFeeType, (Object) advancedCallDataRequest.priorityFeeType) && this.customPriorityFee == advancedCallDataRequest.customPriorityFee && Intrinsics.EZpvd(this.traceData, advancedCallDataRequest.traceData) && Intrinsics.EZpvd((Object) this.mevInfo, (Object) advancedCallDataRequest.mevInfo) && Intrinsics.EZpvd(this.serviceFeeInfo, advancedCallDataRequest.serviceFeeInfo) && Intrinsics.EZpvd(this.direction, advancedCallDataRequest.direction) && Intrinsics.EZpvd(this.tradeMode, advancedCallDataRequest.tradeMode) && Intrinsics.EZpvd(this.autoSlippageInfo, advancedCallDataRequest.autoSlippageInfo) && Intrinsics.EZpvd((Object) this.customSlippage, (Object) advancedCallDataRequest.customSlippage) && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) advancedCallDataRequest.maxSlippage) && Intrinsics.EZpvd((Object) this.defiPlatformId, (Object) advancedCallDataRequest.defiPlatformId) && Intrinsics.EZpvd((Object) this.referralCommissionJsVersion, (Object) advancedCallDataRequest.referralCommissionJsVersion) && Intrinsics.EZpvd((Object) this.orderId, (Object) advancedCallDataRequest.orderId) && Intrinsics.EZpvd((Object) this.unsignedTx, (Object) advancedCallDataRequest.unsignedTx) && Intrinsics.EZpvd((Object) this.signature, (Object) advancedCallDataRequest.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam getAutoSlippageInfo() {
        return this.autoSlippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCustomPriorityFee() {
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
    public final List<DexRouterList> getDexRouterList() {
        return this.dexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnableJito() {
        return this.enableJito;
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
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevInfo() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
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
    public final String getReferralCommissionJsVersion() {
        return this.referralCommissionJsVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouterModeType() {
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
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraceData getTraceData() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTradeMode() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.dexRouterList.hashCode();
        int iHashCode2 = this.priorityFee.hashCode();
        int iHashCode3 = this.gasPrice.hashCode();
        int iHashCode4 = this.estimateGasFee.hashCode();
        int iHashCode5 = this.chainId.hashCode();
        int iHashCode6 = this.fromTokenAddress.hashCode();
        int iHashCode7 = this.fromAmount.hashCode();
        int iHashCode8 = this.toTokenAddress.hashCode();
        int iHashCode9 = this.toAmount.hashCode();
        int iHashCode10 = this.userWalletAddress.hashCode();
        Boolean bool = this.enableJito;
        int iHashCode11 = bool == null ? 0 : bool.hashCode();
        int iHashCode12 = this.routerModeType.hashCode();
        int iHashCode13 = this.priorityFeeType.hashCode();
        int iHashCode14 = Boolean.hashCode(this.customPriorityFee);
        TraceData traceData = this.traceData;
        int iHashCode15 = traceData == null ? 0 : traceData.hashCode();
        String str = this.mevInfo;
        int iHashCode16 = str == null ? 0 : str.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        int iHashCode17 = serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode();
        Integer num = this.direction;
        int iHashCode18 = num == null ? 0 : num.hashCode();
        Integer num2 = this.tradeMode;
        int iHashCode19 = num2 == null ? 0 : num2.hashCode();
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam = this.autoSlippageInfo;
        int iHashCode20 = dexAutoSlippageInfoParam == null ? 0 : dexAutoSlippageInfoParam.hashCode();
        String str2 = this.customSlippage;
        int iHashCode21 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxSlippage;
        int iHashCode22 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.defiPlatformId;
        int iHashCode23 = str4 == null ? 0 : str4.hashCode();
        int iHashCode24 = this.referralCommissionJsVersion.hashCode();
        int iHashCode25 = this.orderId.hashCode();
        String str5 = this.unsignedTx;
        int iHashCode26 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.signature;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + (str6 == null ? 0 : str6.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMevInfo(String str) {
        this.mevInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTraceData(TraceData traceData) {
        this.traceData = traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvancedCallDataRequest(dexRouterList=" + this.dexRouterList + ", priorityFee=" + this.priorityFee + ", gasPrice=" + this.gasPrice + ", estimateGasFee=" + this.estimateGasFee + ", chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", fromAmount=" + this.fromAmount + ", toTokenAddress=" + this.toTokenAddress + ", toAmount=" + this.toAmount + ", userWalletAddress=" + this.userWalletAddress + ", enableJito=" + this.enableJito + ", routerModeType=" + this.routerModeType + ", priorityFeeType=" + this.priorityFeeType + ", customPriorityFee=" + this.customPriorityFee + ", traceData=" + this.traceData + ", mevInfo=" + this.mevInfo + ", serviceFeeInfo=" + this.serviceFeeInfo + ", direction=" + this.direction + ", tradeMode=" + this.tradeMode + ", autoSlippageInfo=" + this.autoSlippageInfo + ", customSlippage=" + this.customSlippage + ", maxSlippage=" + this.maxSlippage + ", defiPlatformId=" + this.defiPlatformId + ", referralCommissionJsVersion=" + this.referralCommissionJsVersion + ", orderId=" + this.orderId + ", unsignedTx=" + this.unsignedTx + ", signature=" + this.signature + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCallDataRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdvancedCallDataRequest> serializer() {
            return AdvancedCallDataRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AdvancedCallDataRequest(int i, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, boolean z, TraceData traceData, String str12, ServiceFeeInfo serviceFeeInfo, Integer num, Integer num2, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str13, String str14, String str15, String str16, String str17, String str18, String str19, SerializationConstructorMarker serializationConstructorMarker) {
        if (15359 != (i & 15359)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15359, AdvancedCallDataRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.dexRouterList = list;
        this.priorityFee = str;
        this.gasPrice = str2;
        this.estimateGasFee = str3;
        this.chainId = str4;
        this.fromTokenAddress = str5;
        this.fromAmount = str6;
        this.toTokenAddress = str7;
        this.toAmount = str8;
        this.userWalletAddress = str9;
        if ((i & 1024) == 0) {
            this.enableJito = null;
        } else {
            this.enableJito = bool;
        }
        this.routerModeType = str10;
        this.priorityFeeType = str11;
        this.customPriorityFee = z;
        if ((i & 16384) == 0) {
            this.traceData = null;
        } else {
            this.traceData = traceData;
        }
        if ((32768 & i) == 0) {
            this.mevInfo = null;
        } else {
            this.mevInfo = str12;
        }
        if ((65536 & i) == 0) {
            this.serviceFeeInfo = null;
        } else {
            this.serviceFeeInfo = serviceFeeInfo;
        }
        if ((131072 & i) == 0) {
            this.direction = null;
        } else {
            this.direction = num;
        }
        if ((262144 & i) == 0) {
            this.tradeMode = null;
        } else {
            this.tradeMode = num2;
        }
        if ((524288 & i) == 0) {
            this.autoSlippageInfo = null;
        } else {
            this.autoSlippageInfo = dexAutoSlippageInfoParam;
        }
        if ((1048576 & i) == 0) {
            this.customSlippage = null;
        } else {
            this.customSlippage = str13;
        }
        if ((2097152 & i) == 0) {
            this.maxSlippage = null;
        } else {
            this.maxSlippage = str14;
        }
        if ((4194304 & i) == 0) {
            this.defiPlatformId = null;
        } else {
            this.defiPlatformId = str15;
        }
        if ((8388608 & i) == 0) {
            this.referralCommissionJsVersion = "";
        } else {
            this.referralCommissionJsVersion = str16;
        }
        if ((16777216 & i) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str17;
        }
        if ((33554432 & i) == 0) {
            this.unsignedTx = null;
        } else {
            this.unsignedTx = str18;
        }
        if ((i & 67108864) == 0) {
            this.signature = null;
        } else {
            this.signature = str19;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(AdvancedCallDataRequest advancedCallDataRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], advancedCallDataRequest.dexRouterList);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, advancedCallDataRequest.priorityFee);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, advancedCallDataRequest.gasPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, advancedCallDataRequest.estimateGasFee);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, advancedCallDataRequest.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, advancedCallDataRequest.fromTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, advancedCallDataRequest.fromAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, advancedCallDataRequest.toTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, advancedCallDataRequest.toAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, advancedCallDataRequest.userWalletAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || advancedCallDataRequest.enableJito != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, advancedCallDataRequest.enableJito);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, advancedCallDataRequest.routerModeType);
        compositeEncoder.encodeStringElement(serialDescriptor, 12, advancedCallDataRequest.priorityFeeType);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 13, advancedCallDataRequest.customPriorityFee);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || advancedCallDataRequest.traceData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, TraceData$$serializer.INSTANCE, advancedCallDataRequest.traceData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || advancedCallDataRequest.mevInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, advancedCallDataRequest.mevInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || advancedCallDataRequest.serviceFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, ServiceFeeInfo$$serializer.INSTANCE, advancedCallDataRequest.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || advancedCallDataRequest.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, advancedCallDataRequest.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || advancedCallDataRequest.tradeMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, advancedCallDataRequest.tradeMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || advancedCallDataRequest.autoSlippageInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, DexAutoSlippageInfoParam$$serializer.INSTANCE, advancedCallDataRequest.autoSlippageInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || advancedCallDataRequest.customSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, advancedCallDataRequest.customSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || advancedCallDataRequest.maxSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, advancedCallDataRequest.maxSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || advancedCallDataRequest.defiPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, advancedCallDataRequest.defiPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) advancedCallDataRequest.referralCommissionJsVersion, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, advancedCallDataRequest.referralCommissionJsVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) advancedCallDataRequest.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, advancedCallDataRequest.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || advancedCallDataRequest.unsignedTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, advancedCallDataRequest.unsignedTx);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) && advancedCallDataRequest.signature == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, advancedCallDataRequest.signature);
    }

    public AdvancedCallDataRequest(@NotNull List<DexRouterList> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, Boolean bool, @NotNull String str10, @NotNull String str11, boolean z, TraceData traceData, String str12, ServiceFeeInfo serviceFeeInfo, Integer num, Integer num2, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str13, String str14, String str15, @NotNull String str16, @NotNull String str17, String str18, String str19) {
        Intrinsics.checkNotNullParameter(list, "");
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
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        this.dexRouterList = list;
        this.priorityFee = str;
        this.gasPrice = str2;
        this.estimateGasFee = str3;
        this.chainId = str4;
        this.fromTokenAddress = str5;
        this.fromAmount = str6;
        this.toTokenAddress = str7;
        this.toAmount = str8;
        this.userWalletAddress = str9;
        this.enableJito = bool;
        this.routerModeType = str10;
        this.priorityFeeType = str11;
        this.customPriorityFee = z;
        this.traceData = traceData;
        this.mevInfo = str12;
        this.serviceFeeInfo = serviceFeeInfo;
        this.direction = num;
        this.tradeMode = num2;
        this.autoSlippageInfo = dexAutoSlippageInfoParam;
        this.customSlippage = str13;
        this.maxSlippage = str14;
        this.defiPlatformId = str15;
        this.referralCommissionJsVersion = str16;
        this.orderId = str17;
        this.unsignedTx = str18;
        this.signature = str19;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ab: CONSTRUCTOR 
  (r32v0 java.util.List)
  (r33v0 java.lang.String)
  (r34v0 java.lang.String)
  (r35v0 java.lang.String)
  (r36v0 java.lang.String)
  (r37v0 java.lang.String)
  (r38v0 java.lang.String)
  (r39v0 java.lang.String)
  (r40v0 java.lang.String)
  (r41v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r59v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r42v0 java.lang.Boolean))
  (r43v0 java.lang.String)
  (r44v0 java.lang.String)
  (r45v0 boolean)
  (wrap:com.okinc.business.dexlogic.bean.TraceData:?: TERNARY null = ((wrap:int:0x000b: ARITH (r59v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.TraceData) : (r46v0 com.okinc.business.dexlogic.bean.TraceData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (32768 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x0021: ARITH (65536 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r48v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002b: ARITH (131072 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r49v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0035: ARITH (262144 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r50v0 java.lang.Integer))
  (wrap:com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam:?: TERNARY null = ((wrap:int:0x003f: ARITH (524288 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam) : (r51v0 com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (1048576 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (2097152 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (4194304 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (8388608 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (16777216 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (33554432 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r59v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.dexlogic.bean.DexRouterList>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, boolean, com.okinc.business.dexlogic.bean.TraceData, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, java.lang.Integer, java.lang.Integer, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:69) call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCallDataRequest.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, boolean, com.okinc.business.dexlogic.bean.TraceData, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, java.lang.Integer, java.lang.Integer, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AdvancedCallDataRequest(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, boolean z, TraceData traceData, String str12, ServiceFeeInfo serviceFeeInfo, Integer num, Integer num2, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, str3, str4, str5, str6, str7, str8, str9, (i & 1024) != 0 ? null : bool, str10, str11, z, (i & 16384) != 0 ? null : traceData, (32768 & i) != 0 ? null : str12, (65536 & i) != 0 ? null : serviceFeeInfo, (131072 & i) != 0 ? null : num, (262144 & i) != 0 ? null : num2, (524288 & i) != 0 ? null : dexAutoSlippageInfoParam, (1048576 & i) != 0 ? null : str13, (2097152 & i) != 0 ? null : str14, (4194304 & i) != 0 ? null : str15, (8388608 & i) != 0 ? "" : str16, (16777216 & i) != 0 ? "" : str17, (33554432 & i) != 0 ? null : str18, (i & 67108864) != 0 ? null : str19);
    }
}
