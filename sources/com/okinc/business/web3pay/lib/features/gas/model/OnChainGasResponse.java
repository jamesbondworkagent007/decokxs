package com.okinc.business.web3pay.lib.features.gas.model;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasLimit$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasPrice$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OnChainGasResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String feeTokenAddress;
    private final String feeTokenCoinTypeNo;
    private final int feeTokenDecimal;
    private final String feeTokenSymbol;
    private final GasLimit gasLimit;
    private final int gasPayType;
    private final GasPrice gasPrice;
    private final String minDeposit;
    private final String nativeTokenCoinTypeNo;
    private final int nativeTokenDecimal;
    private final int paymasterName;
    private final int transactionOperations;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.gasPayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.minDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasLimit component11() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPrice component12() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feeTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.feeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.feeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.feeTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nativeTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.nativeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.transactionOperations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.paymasterName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnChainGasResponse copy(int i, @NotNull String str, @NotNull String str2, int i2, @NotNull String str3, @NotNull String str4, int i3, int i4, int i5, String str5, @NotNull GasLimit gasLimit, @NotNull GasPrice gasPrice) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(gasLimit, "");
        Intrinsics.checkNotNullParameter(gasPrice, "");
        return new OnChainGasResponse(i, str, str2, i2, str3, str4, i3, i4, i5, str5, gasLimit, gasPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnChainGasResponse)) {
            return false;
        }
        OnChainGasResponse onChainGasResponse = (OnChainGasResponse) obj;
        return this.gasPayType == onChainGasResponse.gasPayType && Intrinsics.EZpvd((Object) this.feeTokenAddress, (Object) onChainGasResponse.feeTokenAddress) && Intrinsics.EZpvd((Object) this.feeTokenSymbol, (Object) onChainGasResponse.feeTokenSymbol) && this.feeTokenDecimal == onChainGasResponse.feeTokenDecimal && Intrinsics.EZpvd((Object) this.feeTokenCoinTypeNo, (Object) onChainGasResponse.feeTokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.nativeTokenCoinTypeNo, (Object) onChainGasResponse.nativeTokenCoinTypeNo) && this.nativeTokenDecimal == onChainGasResponse.nativeTokenDecimal && this.transactionOperations == onChainGasResponse.transactionOperations && this.paymasterName == onChainGasResponse.paymasterName && Intrinsics.EZpvd((Object) this.minDeposit, (Object) onChainGasResponse.minDeposit) && Intrinsics.EZpvd(this.gasLimit, onChainGasResponse.gasLimit) && Intrinsics.EZpvd(this.gasPrice, onChainGasResponse.gasPrice);
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
    public final int getFeeTokenDecimal() {
        return this.feeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenSymbol() {
        return this.feeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasLimit getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGasPayType() {
        return this.gasPayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPrice getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinDeposit() {
        return this.minDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenCoinTypeNo() {
        return this.nativeTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNativeTokenDecimal() {
        return this.nativeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPaymasterName() {
        return this.paymasterName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTransactionOperations() {
        return this.transactionOperations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.gasPayType);
        int iHashCode2 = this.feeTokenAddress.hashCode();
        int iHashCode3 = this.feeTokenSymbol.hashCode();
        int iHashCode4 = Integer.hashCode(this.feeTokenDecimal);
        int iHashCode5 = this.feeTokenCoinTypeNo.hashCode();
        int iHashCode6 = this.nativeTokenCoinTypeNo.hashCode();
        int iHashCode7 = Integer.hashCode(this.nativeTokenDecimal);
        int iHashCode8 = Integer.hashCode(this.transactionOperations);
        int iHashCode9 = Integer.hashCode(this.paymasterName);
        String str = this.minDeposit;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.gasLimit.hashCode()) * 31) + this.gasPrice.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnChainGasResponse(gasPayType=" + this.gasPayType + ", feeTokenAddress=" + this.feeTokenAddress + ", feeTokenSymbol=" + this.feeTokenSymbol + ", feeTokenDecimal=" + this.feeTokenDecimal + ", feeTokenCoinTypeNo=" + this.feeTokenCoinTypeNo + ", nativeTokenCoinTypeNo=" + this.nativeTokenCoinTypeNo + ", nativeTokenDecimal=" + this.nativeTokenDecimal + ", transactionOperations=" + this.transactionOperations + ", paymasterName=" + this.paymasterName + ", minDeposit=" + this.minDeposit + ", gasLimit=" + this.gasLimit + ", gasPrice=" + this.gasPrice + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.gas.model.OnChainGasResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnChainGasResponse> serializer() {
            return OnChainGasResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnChainGasResponse(int i, int i2, String str, String str2, int i3, String str3, String str4, int i4, int i5, int i6, String str5, GasLimit gasLimit, GasPrice gasPrice, SerializationConstructorMarker serializationConstructorMarker) {
        if (3583 != (i & 3583)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3583, OnChainGasResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.gasPayType = i2;
        this.feeTokenAddress = str;
        this.feeTokenSymbol = str2;
        this.feeTokenDecimal = i3;
        this.feeTokenCoinTypeNo = str3;
        this.nativeTokenCoinTypeNo = str4;
        this.nativeTokenDecimal = i4;
        this.transactionOperations = i5;
        this.paymasterName = i6;
        if ((i & 512) == 0) {
            this.minDeposit = null;
        } else {
            this.minDeposit = str5;
        }
        this.gasLimit = gasLimit;
        this.gasPrice = gasPrice;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(OnChainGasResponse onChainGasResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, onChainGasResponse.gasPayType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, onChainGasResponse.feeTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, onChainGasResponse.feeTokenSymbol);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, onChainGasResponse.feeTokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, onChainGasResponse.feeTokenCoinTypeNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, onChainGasResponse.nativeTokenCoinTypeNo);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, onChainGasResponse.nativeTokenDecimal);
        compositeEncoder.encodeIntElement(serialDescriptor, 7, onChainGasResponse.transactionOperations);
        compositeEncoder.encodeIntElement(serialDescriptor, 8, onChainGasResponse.paymasterName);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || onChainGasResponse.minDeposit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, onChainGasResponse.minDeposit);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, GasLimit$$serializer.INSTANCE, onChainGasResponse.gasLimit);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 11, GasPrice$$serializer.INSTANCE, onChainGasResponse.gasPrice);
    }

    public OnChainGasResponse(int i, @NotNull String str, @NotNull String str2, int i2, @NotNull String str3, @NotNull String str4, int i3, int i4, int i5, String str5, @NotNull GasLimit gasLimit, @NotNull GasPrice gasPrice) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(gasLimit, "");
        Intrinsics.checkNotNullParameter(gasPrice, "");
        this.gasPayType = i;
        this.feeTokenAddress = str;
        this.feeTokenSymbol = str2;
        this.feeTokenDecimal = i2;
        this.feeTokenCoinTypeNo = str3;
        this.nativeTokenCoinTypeNo = str4;
        this.nativeTokenDecimal = i3;
        this.transactionOperations = i4;
        this.paymasterName = i5;
        this.minDeposit = str5;
        this.gasLimit = gasLimit;
        this.gasPrice = gasPrice;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (r15v0 int)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 int)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 int)
  (r22v0 int)
  (r23v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (r25v0 com.okinc.business.web3pay.lib.core.model.GasLimit)
  (r26v0 com.okinc.business.web3pay.lib.core.model.GasPrice)
 A[MD:(int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, int, int, java.lang.String, com.okinc.business.web3pay.lib.core.model.GasLimit, com.okinc.business.web3pay.lib.core.model.GasPrice):void (m)] (LINE:14) call: com.okinc.business.web3pay.lib.features.gas.model.OnChainGasResponse.<init>(int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, int, int, java.lang.String, com.okinc.business.web3pay.lib.core.model.GasLimit, com.okinc.business.web3pay.lib.core.model.GasPrice):void type: THIS */
    public /* synthetic */ OnChainGasResponse(int i, String str, String str2, int i2, String str3, String str4, int i3, int i4, int i5, String str5, GasLimit gasLimit, GasPrice gasPrice, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, i2, str3, str4, i3, i4, i5, (i6 & 512) != 0 ? null : str5, gasLimit, gasPrice);
    }
}
