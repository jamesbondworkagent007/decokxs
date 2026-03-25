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
public final class TxOutputType {
    private final String address;
    private final List<Long> address_n;
    private final String amount;
    private final MultisigRedeemScriptType multisig;
    private final String op_return_data;
    private final String orig_hash;
    private final Long orig_index;
    private final Long payment_req_index;
    private final String script_type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(LongSerializer.INSTANCE), null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getAddress_n() {
        return this.address_n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultisigRedeemScriptType getMultisig() {
        return this.multisig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOp_return_data() {
        return this.op_return_data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrig_hash() {
        return this.orig_hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getOrig_index() {
        return this.orig_index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPayment_req_index() {
        return this.payment_req_index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScript_type() {
        return this.script_type;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.TxOutputType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TxOutputType> serializer() {
            return TxOutputType$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TxOutputType(int i, String str, List list, String str2, String str3, MultisigRedeemScriptType multisigRedeemScriptType, String str4, Long l, Long l2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (12 != (i & 12)) {
            PluginExceptionsKt.throwMissingFieldException(i, 12, TxOutputType$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.address = null;
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.address_n = null;
        } else {
            this.address_n = list;
        }
        this.script_type = str2;
        this.amount = str3;
        if ((i & 16) == 0) {
            this.multisig = null;
        } else {
            this.multisig = multisigRedeemScriptType;
        }
        if ((i & 32) == 0) {
            this.orig_hash = null;
        } else {
            this.orig_hash = str4;
        }
        if ((i & 64) == 0) {
            this.orig_index = null;
        } else {
            this.orig_index = l;
        }
        if ((i & 128) == 0) {
            this.payment_req_index = null;
        } else {
            this.payment_req_index = l2;
        }
        if ((i & 256) == 0) {
            this.op_return_data = null;
        } else {
            this.op_return_data = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(TxOutputType txOutputType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || txOutputType.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, txOutputType.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || txOutputType.address_n != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], txOutputType.address_n);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, txOutputType.script_type);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, txOutputType.amount);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || txOutputType.multisig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, MultisigRedeemScriptType$$serializer.INSTANCE, txOutputType.multisig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || txOutputType.orig_hash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, txOutputType.orig_hash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || txOutputType.orig_index != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, txOutputType.orig_index);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || txOutputType.payment_req_index != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, txOutputType.payment_req_index);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && txOutputType.op_return_data == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, txOutputType.op_return_data);
    }

    private TxOutputType(String str, List<Long> list, String str2, String str3, MultisigRedeemScriptType multisigRedeemScriptType, String str4, Long l, Long l2, String str5) {
        this.address = str;
        this.address_n = list;
        this.script_type = str2;
        this.amount = str3;
        this.multisig = multisigRedeemScriptType;
        this.orig_hash = str4;
        this.orig_index = l;
        this.payment_req_index = l2;
        this.op_return_data = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.util.List<java.lang.Long>:?: CAST (java.util.List<java.lang.Long>) (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List)))
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (wrap:com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType) : (r18v0 com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0021: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r20v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0029: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r21v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<java.lang.Long>, java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String):void (m)] (LINE:310) call: com.okinc.wallet.hardware.api.onekey.TxOutputType.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ TxOutputType(String str, List list, String str2, String str3, MultisigRedeemScriptType multisigRedeemScriptType, String str4, Long l, Long l2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (List<Long>) ((i & 2) != 0 ? null : list), str2, str3, (i & 16) != 0 ? null : multisigRedeemScriptType, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : l2, (i & 256) != 0 ? null : str5);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (wrap:com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType) : (r12v0 com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r14v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r15v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType, java.lang.String, java.lang.Long, java.lang.Long):void (m)] (LINE:321) call: com.okinc.wallet.hardware.api.onekey.TxOutputType.<init>(java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType, java.lang.String, java.lang.Long, java.lang.Long):void type: THIS */
    public /* synthetic */ TxOutputType(String str, String str2, MultisigRedeemScriptType multisigRedeemScriptType, String str3, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : multisigRedeemScriptType, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TxOutputType(@NotNull String str, @NotNull String str2, MultisigRedeemScriptType multisigRedeemScriptType, String str3, Long l, Long l2) {
        this(str, (List<Long>) null, "PAYTOADDRESS", str2, multisigRedeemScriptType, str3, l, l2, (String) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r11v0 java.util.List)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType) : (r14v0 com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r16v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r17v0 java.lang.Long))
 A[MD:(java.util.List<java.lang.Long>, java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType, java.lang.String, java.lang.Long, java.lang.Long):void (m)] (LINE:340) call: com.okinc.wallet.hardware.api.onekey.TxOutputType.<init>(java.util.List, java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType, java.lang.String, java.lang.Long, java.lang.Long):void type: THIS */
    public /* synthetic */ TxOutputType(List list, String str, String str2, MultisigRedeemScriptType multisigRedeemScriptType, String str3, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, (i & 8) != 0 ? null : multisigRedeemScriptType, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TxOutputType(@NotNull List<Long> list, @NotNull String str, @NotNull String str2, MultisigRedeemScriptType multisigRedeemScriptType, String str3, Long l, Long l2) {
        this((String) null, list, str, str2, multisigRedeemScriptType, str3, l, l2, (String) null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r4v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long):void (m)] (LINE:360) call: com.okinc.wallet.hardware.api.onekey.TxOutputType.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long):void type: THIS */
    public /* synthetic */ TxOutputType(String str, String str2, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TxOutputType(@NotNull String str, String str2, Long l, Long l2) {
        this((String) null, (List) null, "PAYTOOPRETURN", "0", (MultisigRedeemScriptType) null, str2, l, l2, str, 19, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
