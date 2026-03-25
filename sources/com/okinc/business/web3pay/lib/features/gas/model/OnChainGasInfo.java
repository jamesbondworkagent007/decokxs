package com.okinc.business.web3pay.lib.features.gas.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasLimit$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasPayType;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasPrice$$serializer;
import com.okinc.business.web3pay.lib.core.model.PaymasterNameType;
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
public final class OnChainGasInfo implements Parcelable {
    public static final int $stable = 0;
    private final String feeCoinTypeNo;
    private final String feeTokenAddress;
    private final int feeTokenDecimal;
    private final String feeTokenSymbol;
    private final GasLimit gasLimit;
    private final GasPayType gasPayType;
    private final GasPrice gasPrice;
    private final String minDeposit;
    private final String nativeTokenCoinTypeNo;
    private final int nativeTokenDecimal;
    private final boolean needAdditionalGas;
    private final boolean needToDeployContract;
    private final PaymasterNameType paymasterNameType;
    private final boolean shouldShowReminder;
    private final int transactionOperations;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OnChainGasInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.lib.core.model.GasPayType", GasPayType.values()), null, null, null, null, null, null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.lib.core.model.PaymasterNameType", PaymasterNameType.values()), null, null};

    public static final class Creator implements Parcelable.Creator<OnChainGasInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnChainGasInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OnChainGasInfo(GasPayType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymasterNameType.valueOf(parcel.readString()), GasLimit.CREATOR.createFromParcel(parcel), GasPrice.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnChainGasInfo[] newArray(int i) {
            return new OnChainGasInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPayType component1() {
        return this.gasPayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.shouldShowReminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.needToDeployContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.needAdditionalGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymasterNameType component13() {
        return this.paymasterNameType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasLimit component14() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPrice component15() {
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
        return this.feeCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.minDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.nativeTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.nativeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.transactionOperations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnChainGasInfo copy(@NotNull GasPayType gasPayType, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, String str4, @NotNull String str5, int i2, int i3, boolean z, boolean z2, boolean z3, PaymasterNameType paymasterNameType, @NotNull GasLimit gasLimit, @NotNull GasPrice gasPrice) {
        Intrinsics.checkNotNullParameter(gasPayType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(gasLimit, "");
        Intrinsics.checkNotNullParameter(gasPrice, "");
        return new OnChainGasInfo(gasPayType, str, str2, i, str3, str4, str5, i2, i3, z, z2, z3, paymasterNameType, gasLimit, gasPrice);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnChainGasInfo)) {
            return false;
        }
        OnChainGasInfo onChainGasInfo = (OnChainGasInfo) obj;
        return this.gasPayType == onChainGasInfo.gasPayType && Intrinsics.EZpvd((Object) this.feeTokenAddress, (Object) onChainGasInfo.feeTokenAddress) && Intrinsics.EZpvd((Object) this.feeTokenSymbol, (Object) onChainGasInfo.feeTokenSymbol) && this.feeTokenDecimal == onChainGasInfo.feeTokenDecimal && Intrinsics.EZpvd((Object) this.feeCoinTypeNo, (Object) onChainGasInfo.feeCoinTypeNo) && Intrinsics.EZpvd((Object) this.minDeposit, (Object) onChainGasInfo.minDeposit) && Intrinsics.EZpvd((Object) this.nativeTokenCoinTypeNo, (Object) onChainGasInfo.nativeTokenCoinTypeNo) && this.nativeTokenDecimal == onChainGasInfo.nativeTokenDecimal && this.transactionOperations == onChainGasInfo.transactionOperations && this.shouldShowReminder == onChainGasInfo.shouldShowReminder && this.needToDeployContract == onChainGasInfo.needToDeployContract && this.needAdditionalGas == onChainGasInfo.needAdditionalGas && this.paymasterNameType == onChainGasInfo.paymasterNameType && Intrinsics.EZpvd(this.gasLimit, onChainGasInfo.gasLimit) && Intrinsics.EZpvd(this.gasPrice, onChainGasInfo.gasPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeCoinTypeNo() {
        return this.feeCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenAddress() {
        return this.feeTokenAddress;
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
    public final GasPayType getGasPayType() {
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
    public final boolean getNeedAdditionalGas() {
        return this.needAdditionalGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedToDeployContract() {
        return this.needToDeployContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymasterNameType getPaymasterNameType() {
        return this.paymasterNameType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShouldShowReminder() {
        return this.shouldShowReminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTransactionOperations() {
        return this.transactionOperations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gasPayType.hashCode();
        int iHashCode2 = this.feeTokenAddress.hashCode();
        int iHashCode3 = this.feeTokenSymbol.hashCode();
        int iHashCode4 = Integer.hashCode(this.feeTokenDecimal);
        int iHashCode5 = this.feeCoinTypeNo.hashCode();
        String str = this.minDeposit;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = this.nativeTokenCoinTypeNo.hashCode();
        int iHashCode8 = Integer.hashCode(this.nativeTokenDecimal);
        int iHashCode9 = Integer.hashCode(this.transactionOperations);
        int iHashCode10 = Boolean.hashCode(this.shouldShowReminder);
        int iHashCode11 = Boolean.hashCode(this.needToDeployContract);
        int iHashCode12 = Boolean.hashCode(this.needAdditionalGas);
        PaymasterNameType paymasterNameType = this.paymasterNameType;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (paymasterNameType != null ? paymasterNameType.hashCode() : 0)) * 31) + this.gasLimit.hashCode()) * 31) + this.gasPrice.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnChainGasInfo(gasPayType=" + this.gasPayType + ", feeTokenAddress=" + this.feeTokenAddress + ", feeTokenSymbol=" + this.feeTokenSymbol + ", feeTokenDecimal=" + this.feeTokenDecimal + ", feeCoinTypeNo=" + this.feeCoinTypeNo + ", minDeposit=" + this.minDeposit + ", nativeTokenCoinTypeNo=" + this.nativeTokenCoinTypeNo + ", nativeTokenDecimal=" + this.nativeTokenDecimal + ", transactionOperations=" + this.transactionOperations + ", shouldShowReminder=" + this.shouldShowReminder + ", needToDeployContract=" + this.needToDeployContract + ", needAdditionalGas=" + this.needAdditionalGas + ", paymasterNameType=" + this.paymasterNameType + ", gasLimit=" + this.gasLimit + ", gasPrice=" + this.gasPrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.gasPayType.name());
        parcel.writeString(this.feeTokenAddress);
        parcel.writeString(this.feeTokenSymbol);
        parcel.writeInt(this.feeTokenDecimal);
        parcel.writeString(this.feeCoinTypeNo);
        parcel.writeString(this.minDeposit);
        parcel.writeString(this.nativeTokenCoinTypeNo);
        parcel.writeInt(this.nativeTokenDecimal);
        parcel.writeInt(this.transactionOperations);
        parcel.writeInt(this.shouldShowReminder ? 1 : 0);
        parcel.writeInt(this.needToDeployContract ? 1 : 0);
        parcel.writeInt(this.needAdditionalGas ? 1 : 0);
        PaymasterNameType paymasterNameType = this.paymasterNameType;
        if (paymasterNameType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(paymasterNameType.name());
        }
        this.gasLimit.writeToParcel(parcel, i);
        this.gasPrice.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.gas.model.OnChainGasInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnChainGasInfo> serializer() {
            return OnChainGasInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnChainGasInfo(int i, GasPayType gasPayType, String str, String str2, int i2, String str3, String str4, String str5, int i3, int i4, boolean z, boolean z2, boolean z3, PaymasterNameType paymasterNameType, GasLimit gasLimit, GasPrice gasPrice, SerializationConstructorMarker serializationConstructorMarker) {
        if (32735 != (i & 32735)) {
            PluginExceptionsKt.throwMissingFieldException(i, 32735, OnChainGasInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.gasPayType = gasPayType;
        this.feeTokenAddress = str;
        this.feeTokenSymbol = str2;
        this.feeTokenDecimal = i2;
        this.feeCoinTypeNo = str3;
        this.minDeposit = (i & 32) == 0 ? null : str4;
        this.nativeTokenCoinTypeNo = str5;
        this.nativeTokenDecimal = i3;
        this.transactionOperations = i4;
        this.shouldShowReminder = z;
        this.needToDeployContract = z2;
        this.needAdditionalGas = z3;
        this.paymasterNameType = paymasterNameType;
        this.gasLimit = gasLimit;
        this.gasPrice = gasPrice;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(OnChainGasInfo onChainGasInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], onChainGasInfo.gasPayType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, onChainGasInfo.feeTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, onChainGasInfo.feeTokenSymbol);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, onChainGasInfo.feeTokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, onChainGasInfo.feeCoinTypeNo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || onChainGasInfo.minDeposit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, onChainGasInfo.minDeposit);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, onChainGasInfo.nativeTokenCoinTypeNo);
        compositeEncoder.encodeIntElement(serialDescriptor, 7, onChainGasInfo.nativeTokenDecimal);
        compositeEncoder.encodeIntElement(serialDescriptor, 8, onChainGasInfo.transactionOperations);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 9, onChainGasInfo.shouldShowReminder);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 10, onChainGasInfo.needToDeployContract);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 11, onChainGasInfo.needAdditionalGas);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], onChainGasInfo.paymasterNameType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 13, GasLimit$$serializer.INSTANCE, onChainGasInfo.gasLimit);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 14, GasPrice$$serializer.INSTANCE, onChainGasInfo.gasPrice);
    }

    public OnChainGasInfo(@NotNull GasPayType gasPayType, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, String str4, @NotNull String str5, int i2, int i3, boolean z, boolean z2, boolean z3, PaymasterNameType paymasterNameType, @NotNull GasLimit gasLimit, @NotNull GasPrice gasPrice) {
        Intrinsics.checkNotNullParameter(gasPayType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(gasLimit, "");
        Intrinsics.checkNotNullParameter(gasPrice, "");
        this.gasPayType = gasPayType;
        this.feeTokenAddress = str;
        this.feeTokenSymbol = str2;
        this.feeTokenDecimal = i;
        this.feeCoinTypeNo = str3;
        this.minDeposit = str4;
        this.nativeTokenCoinTypeNo = str5;
        this.nativeTokenDecimal = i2;
        this.transactionOperations = i3;
        this.shouldShowReminder = z;
        this.needToDeployContract = z2;
        this.needAdditionalGas = z3;
        this.paymasterNameType = paymasterNameType;
        this.gasLimit = gasLimit;
        this.gasPrice = gasPrice;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (r18v0 com.okinc.business.web3pay.lib.core.model.GasPayType)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 int)
  (r22v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (r24v0 java.lang.String)
  (r25v0 int)
  (r26v0 int)
  (r27v0 boolean)
  (r28v0 boolean)
  (r29v0 boolean)
  (r30v0 com.okinc.business.web3pay.lib.core.model.PaymasterNameType)
  (r31v0 com.okinc.business.web3pay.lib.core.model.GasLimit)
  (r32v0 com.okinc.business.web3pay.lib.core.model.GasPrice)
 A[MD:(com.okinc.business.web3pay.lib.core.model.GasPayType, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean, com.okinc.business.web3pay.lib.core.model.PaymasterNameType, com.okinc.business.web3pay.lib.core.model.GasLimit, com.okinc.business.web3pay.lib.core.model.GasPrice):void (m)] (LINE:20) call: com.okinc.business.web3pay.lib.features.gas.model.OnChainGasInfo.<init>(com.okinc.business.web3pay.lib.core.model.GasPayType, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean, com.okinc.business.web3pay.lib.core.model.PaymasterNameType, com.okinc.business.web3pay.lib.core.model.GasLimit, com.okinc.business.web3pay.lib.core.model.GasPrice):void type: THIS */
    public /* synthetic */ OnChainGasInfo(GasPayType gasPayType, String str, String str2, int i, String str3, String str4, String str5, int i2, int i3, boolean z, boolean z2, boolean z3, PaymasterNameType paymasterNameType, GasLimit gasLimit, GasPrice gasPrice, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(gasPayType, str, str2, i, str3, (i4 & 32) != 0 ? null : str4, str5, i2, i3, z, z2, z3, paymasterNameType, gasLimit, gasPrice);
    }
}
