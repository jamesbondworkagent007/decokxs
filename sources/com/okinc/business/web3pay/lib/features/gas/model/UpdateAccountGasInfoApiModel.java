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
public final class UpdateAccountGasInfoApiModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String feeTokenAddress;
    private final String feeTokenCoinTypeNo;
    private final int feeTokenDecimal;
    private final String feeTokenSymbol;
    private final GasLimit gasLimit;
    private final int gasPayType;
    private final GasPrice gasPrice;
    private final String nativeTokenCoinTypeNo;
    private final int nativeTokenDecimal;
    private final int paymasterName;
    private final int transactionOperations;

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

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.gas.model.UpdateAccountGasInfoApiModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UpdateAccountGasInfoApiModel> serializer() {
            return UpdateAccountGasInfoApiModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdateAccountGasInfoApiModel(int i, int i2, String str, String str2, int i3, int i4, String str3, String str4, int i5, GasLimit gasLimit, int i6, GasPrice gasPrice, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2047, UpdateAccountGasInfoApiModel$$serializer.INSTANCE.getDescriptor());
        }
        this.gasPayType = i2;
        this.feeTokenAddress = str;
        this.feeTokenSymbol = str2;
        this.feeTokenDecimal = i3;
        this.paymasterName = i4;
        this.feeTokenCoinTypeNo = str3;
        this.nativeTokenCoinTypeNo = str4;
        this.nativeTokenDecimal = i5;
        this.gasLimit = gasLimit;
        this.transactionOperations = i6;
        this.gasPrice = gasPrice;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(UpdateAccountGasInfoApiModel updateAccountGasInfoApiModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, updateAccountGasInfoApiModel.gasPayType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, updateAccountGasInfoApiModel.feeTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, updateAccountGasInfoApiModel.feeTokenSymbol);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, updateAccountGasInfoApiModel.feeTokenDecimal);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, updateAccountGasInfoApiModel.paymasterName);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, updateAccountGasInfoApiModel.feeTokenCoinTypeNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, updateAccountGasInfoApiModel.nativeTokenCoinTypeNo);
        compositeEncoder.encodeIntElement(serialDescriptor, 7, updateAccountGasInfoApiModel.nativeTokenDecimal);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, GasLimit$$serializer.INSTANCE, updateAccountGasInfoApiModel.gasLimit);
        compositeEncoder.encodeIntElement(serialDescriptor, 9, updateAccountGasInfoApiModel.transactionOperations);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, GasPrice$$serializer.INSTANCE, updateAccountGasInfoApiModel.gasPrice);
    }

    public UpdateAccountGasInfoApiModel(int i, @NotNull String str, @NotNull String str2, int i2, int i3, @NotNull String str3, @NotNull String str4, int i4, @NotNull GasLimit gasLimit, int i5, @NotNull GasPrice gasPrice) {
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
        this.paymasterName = i3;
        this.feeTokenCoinTypeNo = str3;
        this.nativeTokenCoinTypeNo = str4;
        this.nativeTokenDecimal = i4;
        this.gasLimit = gasLimit;
        this.transactionOperations = i5;
        this.gasPrice = gasPrice;
    }
}
