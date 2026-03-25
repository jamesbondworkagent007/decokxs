package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasLimit$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasPrice$$serializer;
import com.okinc.business.web3pay.lib.core.model.OrderType;
import com.okinc.business.web3pay.lib.core.model.PaymasterNameType;
import com.okinc.business.web3pay.lib.core.model.ProjectId;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OnChainTransferParams {
    public static final int $stable = 0;
    private final String chainIndex;
    private final String feeTokenAddress;
    private final String feeTokenCoinTypeNo;
    private final GasLimit gasLimit;
    private final GasPrice gasPrice;
    private final String masterCurrencyId;
    private final OrderType orderType;
    private final PaymasterNameType paymasterNameType;
    private final ProjectId projectId;
    private final String to;
    private final String tokenAddress;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final String travelRuleId;
    private final String usdAmount;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.lib.core.model.ProjectId", ProjectId.values()), null, null, null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.lib.core.model.OrderType", OrderType.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.lib.core.model.PaymasterNameType", PaymasterNameType.values()), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.feeTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderType component11() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymasterNameType component12() {
        return this.paymasterNameType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasLimit component13() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPrice component14() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProjectId component2() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.feeTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnChainTransferParams copy(@NotNull String str, @NotNull ProjectId projectId, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, String str7, @NotNull String str8, @NotNull String str9, @NotNull OrderType orderType, PaymasterNameType paymasterNameType, @NotNull GasLimit gasLimit, @NotNull GasPrice gasPrice, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(projectId, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(orderType, "");
        Intrinsics.checkNotNullParameter(gasLimit, "");
        Intrinsics.checkNotNullParameter(gasPrice, "");
        return new OnChainTransferParams(str, projectId, str2, str3, str4, str5, str6, str7, str8, str9, orderType, paymasterNameType, gasLimit, gasPrice, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnChainTransferParams)) {
            return false;
        }
        OnChainTransferParams onChainTransferParams = (OnChainTransferParams) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) onChainTransferParams.chainIndex) && this.projectId == onChainTransferParams.projectId && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) onChainTransferParams.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) onChainTransferParams.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) onChainTransferParams.usdAmount) && Intrinsics.EZpvd((Object) this.to, (Object) onChainTransferParams.to) && Intrinsics.EZpvd((Object) this.feeTokenAddress, (Object) onChainTransferParams.feeTokenAddress) && Intrinsics.EZpvd((Object) this.masterCurrencyId, (Object) onChainTransferParams.masterCurrencyId) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) onChainTransferParams.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.feeTokenCoinTypeNo, (Object) onChainTransferParams.feeTokenCoinTypeNo) && this.orderType == onChainTransferParams.orderType && this.paymasterNameType == onChainTransferParams.paymasterNameType && Intrinsics.EZpvd(this.gasLimit, onChainTransferParams.gasLimit) && Intrinsics.EZpvd(this.gasPrice, onChainTransferParams.gasPrice) && Intrinsics.EZpvd((Object) this.travelRuleId, (Object) onChainTransferParams.travelRuleId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenAddress() {
        return this.feeTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenCoinTypeNo() {
        return this.feeTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasLimit getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPrice getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterCurrencyId() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderType getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymasterNameType getPaymasterNameType() {
        return this.paymasterNameType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProjectId getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTravelRuleId() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = this.projectId.hashCode();
        int iHashCode3 = this.tokenAddress.hashCode();
        int iHashCode4 = this.tokenAmount.hashCode();
        int iHashCode5 = this.usdAmount.hashCode();
        String str = this.to;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = this.feeTokenAddress.hashCode();
        String str2 = this.masterCurrencyId;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        int iHashCode9 = this.tokenCoinTypeNo.hashCode();
        int iHashCode10 = this.feeTokenCoinTypeNo.hashCode();
        int iHashCode11 = this.orderType.hashCode();
        PaymasterNameType paymasterNameType = this.paymasterNameType;
        int iHashCode12 = paymasterNameType == null ? 0 : paymasterNameType.hashCode();
        int iHashCode13 = this.gasLimit.hashCode();
        int iHashCode14 = this.gasPrice.hashCode();
        String str3 = this.travelRuleId;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str3 == null ? 0 : str3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnChainTransferParams(chainIndex=" + this.chainIndex + ", projectId=" + this.projectId + ", tokenAddress=" + this.tokenAddress + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", to=" + this.to + ", feeTokenAddress=" + this.feeTokenAddress + ", masterCurrencyId=" + this.masterCurrencyId + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", feeTokenCoinTypeNo=" + this.feeTokenCoinTypeNo + ", orderType=" + this.orderType + ", paymasterNameType=" + this.paymasterNameType + ", gasLimit=" + this.gasLimit + ", gasPrice=" + this.gasPrice + ", travelRuleId=" + this.travelRuleId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.OnChainTransferParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnChainTransferParams> serializer() {
            return OnChainTransferParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnChainTransferParams(int i, String str, ProjectId projectId, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, OrderType orderType, PaymasterNameType paymasterNameType, GasLimit gasLimit, GasPrice gasPrice, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (16381 != (i & 16381)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16381, OnChainTransferParams$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.projectId = (i & 2) == 0 ? ProjectId.NATIVE_PAY : projectId;
        this.tokenAddress = str2;
        this.tokenAmount = str3;
        this.usdAmount = str4;
        this.to = str5;
        this.feeTokenAddress = str6;
        this.masterCurrencyId = str7;
        this.tokenCoinTypeNo = str8;
        this.feeTokenCoinTypeNo = str9;
        this.orderType = orderType;
        this.paymasterNameType = paymasterNameType;
        this.gasLimit = gasLimit;
        this.gasPrice = gasPrice;
        this.travelRuleId = (i & 16384) == 0 ? null : str10;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(OnChainTransferParams onChainTransferParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, onChainTransferParams.chainIndex);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || onChainTransferParams.projectId != ProjectId.NATIVE_PAY) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], onChainTransferParams.projectId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, onChainTransferParams.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, onChainTransferParams.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, onChainTransferParams.usdAmount);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, onChainTransferParams.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, onChainTransferParams.feeTokenAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, onChainTransferParams.masterCurrencyId);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, onChainTransferParams.tokenCoinTypeNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, onChainTransferParams.feeTokenCoinTypeNo);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], onChainTransferParams.orderType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], onChainTransferParams.paymasterNameType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 12, GasLimit$$serializer.INSTANCE, onChainTransferParams.gasLimit);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 13, GasPrice$$serializer.INSTANCE, onChainTransferParams.gasPrice);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && onChainTransferParams.travelRuleId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, onChainTransferParams.travelRuleId);
    }

    public OnChainTransferParams(@NotNull String str, @NotNull ProjectId projectId, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, String str7, @NotNull String str8, @NotNull String str9, @NotNull OrderType orderType, PaymasterNameType paymasterNameType, @NotNull GasLimit gasLimit, @NotNull GasPrice gasPrice, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(projectId, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(orderType, "");
        Intrinsics.checkNotNullParameter(gasLimit, "");
        Intrinsics.checkNotNullParameter(gasPrice, "");
        this.chainIndex = str;
        this.projectId = projectId;
        this.tokenAddress = str2;
        this.tokenAmount = str3;
        this.usdAmount = str4;
        this.to = str5;
        this.feeTokenAddress = str6;
        this.masterCurrencyId = str7;
        this.tokenCoinTypeNo = str8;
        this.feeTokenCoinTypeNo = str9;
        this.orderType = orderType;
        this.paymasterNameType = paymasterNameType;
        this.gasLimit = gasLimit;
        this.gasPrice = gasPrice;
        this.travelRuleId = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r19v0 java.lang.String)
  (wrap:com.okinc.business.web3pay.lib.core.model.ProjectId:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:15) com.okinc.business.web3pay.lib.core.model.ProjectId.NATIVE_PAY com.okinc.business.web3pay.lib.core.model.ProjectId) : (r20v0 com.okinc.business.web3pay.lib.core.model.ProjectId))
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 com.okinc.business.web3pay.lib.core.model.OrderType)
  (r30v0 com.okinc.business.web3pay.lib.core.model.PaymasterNameType)
  (r31v0 com.okinc.business.web3pay.lib.core.model.GasLimit)
  (r32v0 com.okinc.business.web3pay.lib.core.model.GasPrice)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.web3pay.lib.core.model.ProjectId, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.core.model.OrderType, com.okinc.business.web3pay.lib.core.model.PaymasterNameType, com.okinc.business.web3pay.lib.core.model.GasLimit, com.okinc.business.web3pay.lib.core.model.GasPrice, java.lang.String):void (m)] (LINE:13) call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.OnChainTransferParams.<init>(java.lang.String, com.okinc.business.web3pay.lib.core.model.ProjectId, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.core.model.OrderType, com.okinc.business.web3pay.lib.core.model.PaymasterNameType, com.okinc.business.web3pay.lib.core.model.GasLimit, com.okinc.business.web3pay.lib.core.model.GasPrice, java.lang.String):void type: THIS */
    public /* synthetic */ OnChainTransferParams(String str, ProjectId projectId, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, OrderType orderType, PaymasterNameType paymasterNameType, GasLimit gasLimit, GasPrice gasPrice, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? ProjectId.NATIVE_PAY : projectId, str2, str3, str4, str5, str6, str7, str8, str9, orderType, paymasterNameType, gasLimit, gasPrice, (i & 16384) != 0 ? null : str10);
    }
}
