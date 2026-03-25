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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class GetConvertGasResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String feeTokenAddress;
    private final String feeTokenBalance;
    private final String feeTokenCoinTypeNo;
    private final int feeTokenDecimal;
    private final String feeTokenSymbol;
    private final GasLimit gasLimit;
    private final int gasPayType;
    private final GasPrice gasPrice;
    private final String nativeTokenCoinTypeNo;
    private final int nativeTokenDecimal;
    private final int paymasterName;
    private final TransactionFee transactionFee;
    private final int transactionOperations;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
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
    public final TransactionFee component13() {
        return this.transactionFee;
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
        return this.paymasterName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.transactionOperations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetConvertGasResponse copy(int i, @NotNull String str, @NotNull String str2, int i2, @NotNull String str3, @NotNull String str4, int i3, int i4, int i5, @NotNull String str5, @NotNull GasLimit gasLimit, @NotNull GasPrice gasPrice, TransactionFee transactionFee) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(gasLimit, "");
        Intrinsics.checkNotNullParameter(gasPrice, "");
        return new GetConvertGasResponse(i, str, str2, i2, str3, str4, i3, i4, i5, str5, gasLimit, gasPrice, transactionFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetConvertGasResponse)) {
            return false;
        }
        GetConvertGasResponse getConvertGasResponse = (GetConvertGasResponse) obj;
        return this.gasPayType == getConvertGasResponse.gasPayType && Intrinsics.EZpvd((Object) this.feeTokenAddress, (Object) getConvertGasResponse.feeTokenAddress) && Intrinsics.EZpvd((Object) this.feeTokenSymbol, (Object) getConvertGasResponse.feeTokenSymbol) && this.feeTokenDecimal == getConvertGasResponse.feeTokenDecimal && Intrinsics.EZpvd((Object) this.feeTokenCoinTypeNo, (Object) getConvertGasResponse.feeTokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.nativeTokenCoinTypeNo, (Object) getConvertGasResponse.nativeTokenCoinTypeNo) && this.nativeTokenDecimal == getConvertGasResponse.nativeTokenDecimal && this.paymasterName == getConvertGasResponse.paymasterName && this.transactionOperations == getConvertGasResponse.transactionOperations && Intrinsics.EZpvd((Object) this.feeTokenBalance, (Object) getConvertGasResponse.feeTokenBalance) && Intrinsics.EZpvd(this.gasLimit, getConvertGasResponse.gasLimit) && Intrinsics.EZpvd(this.gasPrice, getConvertGasResponse.gasPrice) && Intrinsics.EZpvd(this.transactionFee, getConvertGasResponse.transactionFee);
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
    public final int getGasPayType() {
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
    public final int getPaymasterName() {
        return this.paymasterName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionFee getTransactionFee() {
        return this.transactionFee;
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
        int iHashCode8 = Integer.hashCode(this.paymasterName);
        int iHashCode9 = Integer.hashCode(this.transactionOperations);
        int iHashCode10 = this.feeTokenBalance.hashCode();
        int iHashCode11 = this.gasLimit.hashCode();
        int iHashCode12 = this.gasPrice.hashCode();
        TransactionFee transactionFee = this.transactionFee;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (transactionFee == null ? 0 : transactionFee.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetConvertGasResponse(gasPayType=" + this.gasPayType + ", feeTokenAddress=" + this.feeTokenAddress + ", feeTokenSymbol=" + this.feeTokenSymbol + ", feeTokenDecimal=" + this.feeTokenDecimal + ", feeTokenCoinTypeNo=" + this.feeTokenCoinTypeNo + ", nativeTokenCoinTypeNo=" + this.nativeTokenCoinTypeNo + ", nativeTokenDecimal=" + this.nativeTokenDecimal + ", paymasterName=" + this.paymasterName + ", transactionOperations=" + this.transactionOperations + ", feeTokenBalance=" + this.feeTokenBalance + ", gasLimit=" + this.gasLimit + ", gasPrice=" + this.gasPrice + ", transactionFee=" + this.transactionFee + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetConvertGasResponse> serializer() {
            return GetConvertGasResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetConvertGasResponse(int i, int i2, String str, String str2, int i3, String str3, String str4, int i4, int i5, int i6, String str5, GasLimit gasLimit, GasPrice gasPrice, TransactionFee transactionFee, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4095, GetConvertGasResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.gasPayType = i2;
        this.feeTokenAddress = str;
        this.feeTokenSymbol = str2;
        this.feeTokenDecimal = i3;
        this.feeTokenCoinTypeNo = str3;
        this.nativeTokenCoinTypeNo = str4;
        this.nativeTokenDecimal = i4;
        this.paymasterName = i5;
        this.transactionOperations = i6;
        this.feeTokenBalance = str5;
        this.gasLimit = gasLimit;
        this.gasPrice = gasPrice;
        this.transactionFee = (i & 4096) == 0 ? null : transactionFee;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(GetConvertGasResponse getConvertGasResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, getConvertGasResponse.gasPayType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, getConvertGasResponse.feeTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, getConvertGasResponse.feeTokenSymbol);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, getConvertGasResponse.feeTokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, getConvertGasResponse.feeTokenCoinTypeNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, getConvertGasResponse.nativeTokenCoinTypeNo);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, getConvertGasResponse.nativeTokenDecimal);
        compositeEncoder.encodeIntElement(serialDescriptor, 7, getConvertGasResponse.paymasterName);
        compositeEncoder.encodeIntElement(serialDescriptor, 8, getConvertGasResponse.transactionOperations);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, getConvertGasResponse.feeTokenBalance);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, GasLimit$$serializer.INSTANCE, getConvertGasResponse.gasLimit);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 11, GasPrice$$serializer.INSTANCE, getConvertGasResponse.gasPrice);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && getConvertGasResponse.transactionFee == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, GetConvertGasResponse$TransactionFee$$serializer.INSTANCE, getConvertGasResponse.transactionFee);
    }

    public GetConvertGasResponse(int i, @NotNull String str, @NotNull String str2, int i2, @NotNull String str3, @NotNull String str4, int i3, int i4, int i5, @NotNull String str5, @NotNull GasLimit gasLimit, @NotNull GasPrice gasPrice, TransactionFee transactionFee) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(gasLimit, "");
        Intrinsics.checkNotNullParameter(gasPrice, "");
        this.gasPayType = i;
        this.feeTokenAddress = str;
        this.feeTokenSymbol = str2;
        this.feeTokenDecimal = i2;
        this.feeTokenCoinTypeNo = str3;
        this.nativeTokenCoinTypeNo = str4;
        this.nativeTokenDecimal = i3;
        this.paymasterName = i4;
        this.transactionOperations = i5;
        this.feeTokenBalance = str5;
        this.gasLimit = gasLimit;
        this.gasPrice = gasPrice;
        this.transactionFee = transactionFee;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (r16v0 int)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 int)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 int)
  (r23v0 int)
  (r24v0 int)
  (r25v0 java.lang.String)
  (r26v0 com.okinc.business.web3pay.lib.core.model.GasLimit)
  (r27v0 com.okinc.business.web3pay.lib.core.model.GasPrice)
  (wrap:com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasResponse$TransactionFee:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasResponse$TransactionFee) : (r28v0 com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasResponse$TransactionFee))
 A[MD:(int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, int, int, java.lang.String, com.okinc.business.web3pay.lib.core.model.GasLimit, com.okinc.business.web3pay.lib.core.model.GasPrice, com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasResponse$TransactionFee):void (m)] (LINE:23) call: com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasResponse.<init>(int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, int, int, java.lang.String, com.okinc.business.web3pay.lib.core.model.GasLimit, com.okinc.business.web3pay.lib.core.model.GasPrice, com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasResponse$TransactionFee):void type: THIS */
    public /* synthetic */ GetConvertGasResponse(int i, String str, String str2, int i2, String str3, String str4, int i3, int i4, int i5, String str5, GasLimit gasLimit, GasPrice gasPrice, TransactionFee transactionFee, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, i2, str3, str4, i3, i4, i5, str5, gasLimit, gasPrice, (i6 & 4096) != 0 ? null : transactionFee);
    }

    @Serializable
    public static final class TransactionFee {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String feeTokenAmount;
        private final String feeTokenCoinTypeNo;
        private final int feeTokenDecimal;
        private final String feeTokenSymbol;

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

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasResponse.TransactionFee.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TransactionFee> serializer() {
                return GetConvertGasResponse$TransactionFee$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ TransactionFee(int i, String str, String str2, String str3, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, GetConvertGasResponse$TransactionFee$$serializer.INSTANCE.getDescriptor());
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
