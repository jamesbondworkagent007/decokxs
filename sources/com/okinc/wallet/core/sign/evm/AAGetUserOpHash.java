package com.okinc.wallet.core.sign.evm;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AAGetUserOpHash {
    private String callData;
    private String callGasLimit;
    private Long chainId;
    private String entryPoint;
    private String factory;
    private String factoryData;
    private String initCode;
    private String maxFeePerGas;
    private String maxPriorityFeePerGas;
    private String nonce;
    private String paymaster;
    private String paymasterAndData;
    private String paymasterData;
    private final String paymasterPostOpGasLimit;
    private final String paymasterVerificationGasLimit;
    private String preVerificationGas;
    private String sender;
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
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFactory() {
        return this.factory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFactoryData() {
        return this.factoryData;
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
    public final String getPaymaster() {
        return this.paymaster;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterAndData() {
        return this.paymasterAndData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterData() {
        return this.paymasterData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterPostOpGasLimit() {
        return this.paymasterPostOpGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterVerificationGasLimit() {
        return this.paymasterVerificationGasLimit;
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
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEntryPoint(String str) {
        this.entryPoint = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFactory(String str) {
        this.factory = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFactoryData(String str) {
        this.factoryData = str;
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
    public final void setPaymaster(String str) {
        this.paymaster = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterAndData(String str) {
        this.paymasterAndData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterData(String str) {
        this.paymasterData = str;
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
    public final void setVerificationGasLimit(String str) {
        this.verificationGasLimit = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.evm.AAGetUserOpHash.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAGetUserOpHash> serializer() {
            return AAGetUserOpHash$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAGetUserOpHash(int i, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker) {
        if (145863 != (i & 145863)) {
            PluginExceptionsKt.throwMissingFieldException(i, 145863, AAGetUserOpHash$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = l;
        this.sender = str;
        this.nonce = str2;
        if ((i & 8) == 0) {
            this.initCode = null;
        } else {
            this.initCode = str3;
        }
        if ((i & 16) == 0) {
            this.factory = null;
        } else {
            this.factory = str4;
        }
        if ((i & 32) == 0) {
            this.factoryData = null;
        } else {
            this.factoryData = str5;
        }
        this.callData = str6;
        this.callGasLimit = str7;
        this.verificationGasLimit = str8;
        if ((i & 512) == 0) {
            this.paymasterVerificationGasLimit = null;
        } else {
            this.paymasterVerificationGasLimit = str9;
        }
        if ((i & 1024) == 0) {
            this.paymasterPostOpGasLimit = null;
        } else {
            this.paymasterPostOpGasLimit = str10;
        }
        this.preVerificationGas = str11;
        this.maxFeePerGas = str12;
        this.maxPriorityFeePerGas = str13;
        if ((i & 16384) == 0) {
            this.paymasterAndData = null;
        } else {
            this.paymasterAndData = str14;
        }
        if ((32768 & i) == 0) {
            this.paymaster = null;
        } else {
            this.paymaster = str15;
        }
        if ((i & 65536) == 0) {
            this.paymasterData = null;
        } else {
            this.paymasterData = str16;
        }
        this.entryPoint = str17;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(AAGetUserOpHash aAGetUserOpHash, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, aAGetUserOpHash.chainId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, aAGetUserOpHash.sender);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, aAGetUserOpHash.nonce);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || aAGetUserOpHash.initCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, aAGetUserOpHash.initCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || aAGetUserOpHash.factory != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, aAGetUserOpHash.factory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || aAGetUserOpHash.factoryData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, aAGetUserOpHash.factoryData);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, aAGetUserOpHash.callData);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, aAGetUserOpHash.callGasLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, aAGetUserOpHash.verificationGasLimit);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || aAGetUserOpHash.paymasterVerificationGasLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, aAGetUserOpHash.paymasterVerificationGasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || aAGetUserOpHash.paymasterPostOpGasLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, aAGetUserOpHash.paymasterPostOpGasLimit);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, aAGetUserOpHash.preVerificationGas);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, aAGetUserOpHash.maxFeePerGas);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, aAGetUserOpHash.maxPriorityFeePerGas);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || aAGetUserOpHash.paymasterAndData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, aAGetUserOpHash.paymasterAndData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || aAGetUserOpHash.paymaster != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, aAGetUserOpHash.paymaster);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || aAGetUserOpHash.paymasterData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, aAGetUserOpHash.paymasterData);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, aAGetUserOpHash.entryPoint);
    }

    public AAGetUserOpHash(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.chainId = l;
        this.sender = str;
        this.nonce = str2;
        this.initCode = str3;
        this.factory = str4;
        this.factoryData = str5;
        this.callData = str6;
        this.callGasLimit = str7;
        this.verificationGasLimit = str8;
        this.paymasterVerificationGasLimit = str9;
        this.paymasterPostOpGasLimit = str10;
        this.preVerificationGas = str11;
        this.maxFeePerGas = str12;
        this.maxPriorityFeePerGas = str13;
        this.paymasterAndData = str14;
        this.paymaster = str15;
        this.paymasterData = str16;
        this.entryPoint = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005f: CONSTRUCTOR 
  (r23v0 java.lang.Long)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r41v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r41v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r41v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r41v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r41v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (r34v0 java.lang.String)
  (r35v0 java.lang.String)
  (r36v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r41v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (32768 int) & (r41v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r41v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (r40v0 java.lang.String)
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:180) call: com.okinc.wallet.core.sign.evm.AAGetUserOpHash.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AAGetUserOpHash(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, str6, str7, str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, str11, str12, str13, (i & 16384) != 0 ? null : str14, (32768 & i) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, str17);
    }
}
