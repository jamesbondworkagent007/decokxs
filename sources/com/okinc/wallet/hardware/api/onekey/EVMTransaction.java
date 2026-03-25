package com.okinc.wallet.hardware.api.onekey;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class EVMTransaction {
    private final List<EVMAccessList> accessList;
    private final int chainId;
    private final String data;
    private final String gasLimit;
    private final String gasPrice;
    private final String maxFeePerGas;
    private final String maxPriorityFeePerGas;
    private final String nonce;
    private final String to;
    private final Long txType;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(EVMAccessList$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMAccessList> getAccessList() {
        return this.accessList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
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
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.EVMTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EVMTransaction> serializer() {
            return EVMTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EVMTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, Long l, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (331 != (i & 331)) {
            PluginExceptionsKt.throwMissingFieldException(i, 331, EVMTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.to = str;
        this.value = str2;
        if ((i & 4) == 0) {
            this.gasPrice = null;
        } else {
            this.gasPrice = str3;
        }
        this.gasLimit = str4;
        if ((i & 16) == 0) {
            this.maxFeePerGas = null;
        } else {
            this.maxFeePerGas = str5;
        }
        if ((i & 32) == 0) {
            this.maxPriorityFeePerGas = null;
        } else {
            this.maxPriorityFeePerGas = str6;
        }
        this.nonce = str7;
        if ((i & 128) == 0) {
            this.data = null;
        } else {
            this.data = str8;
        }
        this.chainId = i2;
        if ((i & 512) == 0) {
            this.txType = null;
        } else {
            this.txType = l;
        }
        if ((i & 1024) == 0) {
            this.accessList = null;
        } else {
            this.accessList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(EVMTransaction eVMTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eVMTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, eVMTransaction.value);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || eVMTransaction.gasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, eVMTransaction.gasPrice);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, eVMTransaction.gasLimit);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || eVMTransaction.maxFeePerGas != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, eVMTransaction.maxFeePerGas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || eVMTransaction.maxPriorityFeePerGas != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, eVMTransaction.maxPriorityFeePerGas);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, eVMTransaction.nonce);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || eVMTransaction.data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, eVMTransaction.data);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 8, eVMTransaction.chainId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || eVMTransaction.txType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, eVMTransaction.txType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && eVMTransaction.accessList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], eVMTransaction.accessList);
    }

    public EVMTransaction(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, String str5, String str6, @NotNull String str7, String str8, int i, Long l, List<EVMAccessList> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.to = str;
        this.value = str2;
        this.gasPrice = str3;
        this.gasLimit = str4;
        this.maxFeePerGas = str5;
        this.maxPriorityFeePerGas = str6;
        this.nonce = str7;
        this.data = str8;
        this.chainId = i;
        this.txType = l;
        this.accessList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003e: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (r19v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (r22v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (r24v0 int)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0023: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r25v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r26v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Long, java.util.List<com.okinc.wallet.hardware.api.onekey.EVMAccessList>):void (m)] (LINE:25) call: com.okinc.wallet.hardware.api.onekey.EVMTransaction.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Long, java.util.List):void type: THIS */
    public /* synthetic */ EVMTransaction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Long l, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, str7, (i2 & 128) != 0 ? null : str8, i, (i2 & 512) != 0 ? null : l, (i2 & 1024) != 0 ? null : list);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (r21v0 int)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:38) call: com.okinc.wallet.hardware.api.onekey.EVMTransaction.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EVMTransaction(String str, String str2, String str3, String str4, String str5, String str6, int i, Long l, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i2 & 32) != 0 ? null : str6, i, (i2 & 128) != 0 ? null : l, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? null : str8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EVMTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, int i, Long l, String str7, String str8) {
        this(str, str2, str3, str4, str7, str8, str5, str6, i, l, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
    }
}
