package com.okinc.wallet.core.sign.evm;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AAGenerateSignatureHash {
    private String callData;
    private String callGasLimit;
    private String entryPoint;
    private String initCode;
    private String maxFeePerGas;
    private String maxPriorityFeePerGas;
    private String nonce;
    private String paymasterAndData;
    private String preVerificationGas;
    private String sender;
    private int sigTime;
    private int sigType;
    private String verificationGasLimit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallData() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallGasLimit() {
        return this.callGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitCode() {
        return this.initCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxFeePerGas() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPriorityFeePerGas() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterAndData() {
        return this.paymasterAndData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreVerificationGas() {
        return this.preVerificationGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSender() {
        return this.sender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSigTime() {
        return this.sigTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSigType() {
        return this.sigType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVerificationGasLimit() {
        return this.verificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallData(String str) {
        this.callData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallGasLimit(String str) {
        this.callGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEntryPoint(String str) {
        this.entryPoint = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitCode(String str) {
        this.initCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxFeePerGas(String str) {
        this.maxFeePerGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPriorityFeePerGas(String str) {
        this.maxPriorityFeePerGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(String str) {
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterAndData(String str) {
        this.paymasterAndData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreVerificationGas(String str) {
        this.preVerificationGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSender(String str) {
        this.sender = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSigTime(int i) {
        this.sigTime = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSigType(int i) {
        this.sigType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVerificationGasLimit(String str) {
        this.verificationGasLimit = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.evm.AAGenerateSignatureHash.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAGenerateSignatureHash> serializer() {
            return AAGenerateSignatureHash$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAGenerateSignatureHash(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (8191 != (i & 8191)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8191, AAGenerateSignatureHash$$serializer.INSTANCE.getDescriptor());
        }
        this.sender = str;
        this.nonce = str2;
        this.initCode = str3;
        this.callData = str4;
        this.callGasLimit = str5;
        this.verificationGasLimit = str6;
        this.preVerificationGas = str7;
        this.maxFeePerGas = str8;
        this.maxPriorityFeePerGas = str9;
        this.paymasterAndData = str10;
        this.entryPoint = str11;
        this.sigTime = i2;
        this.sigType = i3;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(AAGenerateSignatureHash aAGenerateSignatureHash, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, aAGenerateSignatureHash.sender);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, aAGenerateSignatureHash.nonce);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, aAGenerateSignatureHash.initCode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, aAGenerateSignatureHash.callData);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, aAGenerateSignatureHash.callGasLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, aAGenerateSignatureHash.verificationGasLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, aAGenerateSignatureHash.preVerificationGas);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, aAGenerateSignatureHash.maxFeePerGas);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, aAGenerateSignatureHash.maxPriorityFeePerGas);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, aAGenerateSignatureHash.paymasterAndData);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, aAGenerateSignatureHash.entryPoint);
        compositeEncoder.encodeIntElement(serialDescriptor, 11, aAGenerateSignatureHash.sigTime);
        compositeEncoder.encodeIntElement(serialDescriptor, 12, aAGenerateSignatureHash.sigType);
    }

    public AAGenerateSignatureHash(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2) {
        this.sender = str;
        this.nonce = str2;
        this.initCode = str3;
        this.callData = str4;
        this.callGasLimit = str5;
        this.verificationGasLimit = str6;
        this.preVerificationGas = str7;
        this.maxFeePerGas = str8;
        this.maxPriorityFeePerGas = str9;
        this.paymasterAndData = str10;
        this.entryPoint = str11;
        this.sigTime = i;
        this.sigType = i2;
    }
}
