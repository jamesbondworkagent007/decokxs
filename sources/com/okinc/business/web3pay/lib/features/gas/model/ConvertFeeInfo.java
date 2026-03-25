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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ConvertFeeInfo implements Parcelable {
    public static final int $stable = 0;
    private final Gas gas;
    private final TransactionFee transactionFee;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ConvertFeeInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ConvertFeeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertFeeInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConvertFeeInfo(Gas.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TransactionFee.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertFeeInfo[] newArray(int i) {
            return new ConvertFeeInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConvertFeeInfo copy$default(ConvertFeeInfo convertFeeInfo, Gas gas, TransactionFee transactionFee, int i, Object obj) {
        if ((i & 1) != 0) {
            gas = convertFeeInfo.gas;
        }
        if ((i & 2) != 0) {
            transactionFee = convertFeeInfo.transactionFee;
        }
        return convertFeeInfo.copy(gas, transactionFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Gas component1() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionFee component2() {
        return this.transactionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertFeeInfo copy(@NotNull Gas gas, TransactionFee transactionFee) {
        Intrinsics.checkNotNullParameter(gas, "");
        return new ConvertFeeInfo(gas, transactionFee);
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
        if (!(obj instanceof ConvertFeeInfo)) {
            return false;
        }
        ConvertFeeInfo convertFeeInfo = (ConvertFeeInfo) obj;
        return Intrinsics.EZpvd(this.gas, convertFeeInfo.gas) && Intrinsics.EZpvd(this.transactionFee, convertFeeInfo.transactionFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Gas getGas() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionFee getTransactionFee() {
        return this.transactionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gas.hashCode();
        TransactionFee transactionFee = this.transactionFee;
        return (iHashCode * 31) + (transactionFee == null ? 0 : transactionFee.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConvertFeeInfo(gas=" + this.gas + ", transactionFee=" + this.transactionFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.gas.writeToParcel(parcel, i);
        TransactionFee transactionFee = this.transactionFee;
        if (transactionFee == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transactionFee.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.gas.model.ConvertFeeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConvertFeeInfo> serializer() {
            return ConvertFeeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConvertFeeInfo(int i, Gas gas, TransactionFee transactionFee, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ConvertFeeInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.gas = gas;
        this.transactionFee = transactionFee;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(ConvertFeeInfo convertFeeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, ConvertFeeInfo$Gas$$serializer.INSTANCE, convertFeeInfo.gas);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ConvertFeeInfo$TransactionFee$$serializer.INSTANCE, convertFeeInfo.transactionFee);
    }

    public ConvertFeeInfo(@NotNull Gas gas, TransactionFee transactionFee) {
        Intrinsics.checkNotNullParameter(gas, "");
        this.gas = gas;
        this.transactionFee = transactionFee;
    }

    @Serializable
    public static final class Gas implements Parcelable {
        public static final int $stable = 0;
        private final String feeTokenAddress;
        private final String feeTokenBalance;
        private final String feeTokenCoinTypeNo;
        private final int feeTokenDecimal;
        private final String feeTokenSymbol;
        private final GasLimit gasLimit;
        private final GasPayType gasPayType;
        private final GasPrice gasPrice;
        private final String nativeTokenCoinTypeNo;
        private final int nativeTokenDecimal;
        private final boolean needToDeployContract;
        private final PaymasterNameType paymasterName;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Gas> CREATOR = new Creator();
        private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.lib.core.model.GasPayType", GasPayType.values()), null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.lib.core.model.PaymasterNameType", PaymasterNameType.values()), null, null, null, null};

        public static final class Creator implements Parcelable.Creator<Gas> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gas createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Gas(parcel.readInt() == 0 ? null : GasPayType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? PaymasterNameType.valueOf(parcel.readString()) : null, parcel.readInt() != 0, parcel.readString(), GasLimit.CREATOR.createFromParcel(parcel), GasPrice.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gas[] newArray(int i) {
                return new Gas[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GasPayType component1() {
            return this.gasPayType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.feeTokenBalance;
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
        public final PaymasterNameType component8() {
            return this.paymasterName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component9() {
            return this.needToDeployContract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Gas copy(GasPayType gasPayType, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, int i2, PaymasterNameType paymasterNameType, boolean z, @NotNull String str5, @NotNull GasLimit gasLimit, @NotNull GasPrice gasPrice) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(gasLimit, "");
            Intrinsics.checkNotNullParameter(gasPrice, "");
            return new Gas(gasPayType, str, str2, i, str3, str4, i2, paymasterNameType, z, str5, gasLimit, gasPrice);
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
            if (!(obj instanceof Gas)) {
                return false;
            }
            Gas gas = (Gas) obj;
            return this.gasPayType == gas.gasPayType && Intrinsics.EZpvd((Object) this.feeTokenAddress, (Object) gas.feeTokenAddress) && Intrinsics.EZpvd((Object) this.feeTokenSymbol, (Object) gas.feeTokenSymbol) && this.feeTokenDecimal == gas.feeTokenDecimal && Intrinsics.EZpvd((Object) this.feeTokenCoinTypeNo, (Object) gas.feeTokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.nativeTokenCoinTypeNo, (Object) gas.nativeTokenCoinTypeNo) && this.nativeTokenDecimal == gas.nativeTokenDecimal && this.paymasterName == gas.paymasterName && this.needToDeployContract == gas.needToDeployContract && Intrinsics.EZpvd((Object) this.feeTokenBalance, (Object) gas.feeTokenBalance) && Intrinsics.EZpvd(this.gasLimit, gas.gasLimit) && Intrinsics.EZpvd(this.gasPrice, gas.gasPrice);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFeeTokenAddress() {
            return this.feeTokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFeeTokenBalance() {
            return this.feeTokenBalance;
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
        public final GasPayType getGasPayType() {
            return this.gasPayType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GasPrice getGasPrice() {
            return this.gasPrice;
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
        public final boolean getNeedToDeployContract() {
            return this.needToDeployContract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PaymasterNameType getPaymasterName() {
            return this.paymasterName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            GasPayType gasPayType = this.gasPayType;
            int iHashCode = gasPayType == null ? 0 : gasPayType.hashCode();
            int iHashCode2 = this.feeTokenAddress.hashCode();
            int iHashCode3 = this.feeTokenSymbol.hashCode();
            int iHashCode4 = Integer.hashCode(this.feeTokenDecimal);
            int iHashCode5 = this.feeTokenCoinTypeNo.hashCode();
            int iHashCode6 = this.nativeTokenCoinTypeNo.hashCode();
            int iHashCode7 = Integer.hashCode(this.nativeTokenDecimal);
            PaymasterNameType paymasterNameType = this.paymasterName;
            return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (paymasterNameType != null ? paymasterNameType.hashCode() : 0)) * 31) + Boolean.hashCode(this.needToDeployContract)) * 31) + this.feeTokenBalance.hashCode()) * 31) + this.gasLimit.hashCode()) * 31) + this.gasPrice.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Gas(gasPayType=" + this.gasPayType + ", feeTokenAddress=" + this.feeTokenAddress + ", feeTokenSymbol=" + this.feeTokenSymbol + ", feeTokenDecimal=" + this.feeTokenDecimal + ", feeTokenCoinTypeNo=" + this.feeTokenCoinTypeNo + ", nativeTokenCoinTypeNo=" + this.nativeTokenCoinTypeNo + ", nativeTokenDecimal=" + this.nativeTokenDecimal + ", paymasterName=" + this.paymasterName + ", needToDeployContract=" + this.needToDeployContract + ", feeTokenBalance=" + this.feeTokenBalance + ", gasLimit=" + this.gasLimit + ", gasPrice=" + this.gasPrice + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            GasPayType gasPayType = this.gasPayType;
            if (gasPayType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(gasPayType.name());
            }
            parcel.writeString(this.feeTokenAddress);
            parcel.writeString(this.feeTokenSymbol);
            parcel.writeInt(this.feeTokenDecimal);
            parcel.writeString(this.feeTokenCoinTypeNo);
            parcel.writeString(this.nativeTokenCoinTypeNo);
            parcel.writeInt(this.nativeTokenDecimal);
            PaymasterNameType paymasterNameType = this.paymasterName;
            if (paymasterNameType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(paymasterNameType.name());
            }
            parcel.writeInt(this.needToDeployContract ? 1 : 0);
            parcel.writeString(this.feeTokenBalance);
            this.gasLimit.writeToParcel(parcel, i);
            this.gasPrice.writeToParcel(parcel, i);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.gas.model.ConvertFeeInfo.Gas.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Gas> serializer() {
                return ConvertFeeInfo$Gas$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Gas(int i, GasPayType gasPayType, String str, String str2, int i2, String str3, String str4, int i3, PaymasterNameType paymasterNameType, boolean z, String str5, GasLimit gasLimit, GasPrice gasPrice, SerializationConstructorMarker serializationConstructorMarker) {
            if (4095 != (i & 4095)) {
                PluginExceptionsKt.throwMissingFieldException(i, 4095, ConvertFeeInfo$Gas$$serializer.INSTANCE.getDescriptor());
            }
            this.gasPayType = gasPayType;
            this.feeTokenAddress = str;
            this.feeTokenSymbol = str2;
            this.feeTokenDecimal = i2;
            this.feeTokenCoinTypeNo = str3;
            this.nativeTokenCoinTypeNo = str4;
            this.nativeTokenDecimal = i3;
            this.paymasterName = paymasterNameType;
            this.needToDeployContract = z;
            this.feeTokenBalance = str5;
            this.gasLimit = gasLimit;
            this.gasPrice = gasPrice;
        }

        public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(Gas gas, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], gas.gasPayType);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, gas.feeTokenAddress);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, gas.feeTokenSymbol);
            compositeEncoder.encodeIntElement(serialDescriptor, 3, gas.feeTokenDecimal);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, gas.feeTokenCoinTypeNo);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, gas.nativeTokenCoinTypeNo);
            compositeEncoder.encodeIntElement(serialDescriptor, 6, gas.nativeTokenDecimal);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], gas.paymasterName);
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, gas.needToDeployContract);
            compositeEncoder.encodeStringElement(serialDescriptor, 9, gas.feeTokenBalance);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, GasLimit$$serializer.INSTANCE, gas.gasLimit);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, GasPrice$$serializer.INSTANCE, gas.gasPrice);
        }

        public Gas(GasPayType gasPayType, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, int i2, PaymasterNameType paymasterNameType, boolean z, @NotNull String str5, @NotNull GasLimit gasLimit, @NotNull GasPrice gasPrice) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(gasLimit, "");
            Intrinsics.checkNotNullParameter(gasPrice, "");
            this.gasPayType = gasPayType;
            this.feeTokenAddress = str;
            this.feeTokenSymbol = str2;
            this.feeTokenDecimal = i;
            this.feeTokenCoinTypeNo = str3;
            this.nativeTokenCoinTypeNo = str4;
            this.nativeTokenDecimal = i2;
            this.paymasterName = paymasterNameType;
            this.needToDeployContract = z;
            this.feeTokenBalance = str5;
            this.gasLimit = gasLimit;
            this.gasPrice = gasPrice;
        }
    }

    @Serializable
    public static final class TransactionFee implements Parcelable {
        public static final int $stable = 0;
        private final String feeTokenAmount;
        private final String feeTokenCoinTypeNo;
        private final int feeTokenDecimal;
        private final String feeTokenSymbol;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<TransactionFee> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<TransactionFee> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionFee createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TransactionFee(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionFee[] newArray(int i) {
                return new TransactionFee[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TransactionFee copy$default(TransactionFee transactionFee, String str, String str2, String str3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = transactionFee.feeTokenCoinTypeNo;
            }
            if ((i2 & 2) != 0) {
                str2 = transactionFee.feeTokenSymbol;
            }
            if ((i2 & 4) != 0) {
                str3 = transactionFee.feeTokenAmount;
            }
            if ((i2 & 8) != 0) {
                i = transactionFee.feeTokenDecimal;
            }
            return transactionFee.copy(str, str2, str3, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.feeTokenCoinTypeNo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.feeTokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.feeTokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component4() {
            return this.feeTokenDecimal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionFee copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new TransactionFee(str, str2, str3, i);
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
            if (!(obj instanceof TransactionFee)) {
                return false;
            }
            TransactionFee transactionFee = (TransactionFee) obj;
            return Intrinsics.EZpvd((Object) this.feeTokenCoinTypeNo, (Object) transactionFee.feeTokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.feeTokenSymbol, (Object) transactionFee.feeTokenSymbol) && Intrinsics.EZpvd((Object) this.feeTokenAmount, (Object) transactionFee.feeTokenAmount) && this.feeTokenDecimal == transactionFee.feeTokenDecimal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFeeTokenAmount() {
            return this.feeTokenAmount;
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
        public int hashCode() {
            return (((((this.feeTokenCoinTypeNo.hashCode() * 31) + this.feeTokenSymbol.hashCode()) * 31) + this.feeTokenAmount.hashCode()) * 31) + Integer.hashCode(this.feeTokenDecimal);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TransactionFee(feeTokenCoinTypeNo=" + this.feeTokenCoinTypeNo + ", feeTokenSymbol=" + this.feeTokenSymbol + ", feeTokenAmount=" + this.feeTokenAmount + ", feeTokenDecimal=" + this.feeTokenDecimal + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.feeTokenCoinTypeNo);
            parcel.writeString(this.feeTokenSymbol);
            parcel.writeString(this.feeTokenAmount);
            parcel.writeInt(this.feeTokenDecimal);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.gas.model.ConvertFeeInfo.TransactionFee.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TransactionFee> serializer() {
                return ConvertFeeInfo$TransactionFee$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ TransactionFee(int i, String str, String str2, String str3, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, ConvertFeeInfo$TransactionFee$$serializer.INSTANCE.getDescriptor());
            }
            this.feeTokenCoinTypeNo = str;
            this.feeTokenSymbol = str2;
            this.feeTokenAmount = str3;
            this.feeTokenDecimal = i2;
        }

        public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(TransactionFee transactionFee, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, transactionFee.feeTokenCoinTypeNo);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, transactionFee.feeTokenSymbol);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, transactionFee.feeTokenAmount);
            compositeEncoder.encodeIntElement(serialDescriptor, 3, transactionFee.feeTokenDecimal);
        }

        public TransactionFee(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.feeTokenCoinTypeNo = str;
            this.feeTokenSymbol = str2;
            this.feeTokenAmount = str3;
            this.feeTokenDecimal = i;
        }
    }
}
