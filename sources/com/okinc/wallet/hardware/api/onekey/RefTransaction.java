package com.okinc.wallet.hardware.api.onekey;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class RefTransaction {
    private final List<TxOutputBinType> bin_outputs;
    private final Long branch_id;
    private final Long expiry;
    private final String extra_data;
    private final String hash;
    private final List<PrevInput> inputs;
    private final long lock_time;
    private final List<TxOutputType> outputs;
    private final Boolean overwintered;
    private final Long timestamp;
    private final long version;
    private final Long version_group_id;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(PrevInput$$serializer.INSTANCE), new ArrayListSerializer(TxOutputBinType$$serializer.INSTANCE), new ArrayListSerializer(TxOutputType$$serializer.INSTANCE), null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxOutputBinType> getBin_outputs() {
        return this.bin_outputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getBranch_id() {
        return this.branch_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpiry() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtra_data() {
        return this.extra_data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHash() {
        return this.hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PrevInput> getInputs() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getLock_time() {
        return this.lock_time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxOutputType> getOutputs() {
        return this.outputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getOverwintered() {
        return this.overwintered;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getVersion_group_id() {
        return this.version_group_id;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.RefTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RefTransaction> serializer() {
            return RefTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RefTransaction(int i, String str, long j, List list, List list2, List list3, long j2, String str2, Long l, Boolean bool, Long l2, Long l3, Long l4, SerializationConstructorMarker serializationConstructorMarker) {
        if (47 != (i & 47)) {
            PluginExceptionsKt.throwMissingFieldException(i, 47, RefTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.hash = str;
        this.version = j;
        this.inputs = list;
        this.bin_outputs = list2;
        if ((i & 16) == 0) {
            this.outputs = null;
        } else {
            this.outputs = list3;
        }
        this.lock_time = j2;
        if ((i & 64) == 0) {
            this.extra_data = null;
        } else {
            this.extra_data = str2;
        }
        if ((i & 128) == 0) {
            this.expiry = null;
        } else {
            this.expiry = l;
        }
        if ((i & 256) == 0) {
            this.overwintered = null;
        } else {
            this.overwintered = bool;
        }
        if ((i & 512) == 0) {
            this.version_group_id = null;
        } else {
            this.version_group_id = l2;
        }
        if ((i & 1024) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = l3;
        }
        if ((i & 2048) == 0) {
            this.branch_id = null;
        } else {
            this.branch_id = l4;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(RefTransaction refTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, refTransaction.hash);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, refTransaction.version);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], refTransaction.inputs);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], refTransaction.bin_outputs);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || refTransaction.outputs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], refTransaction.outputs);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 5, refTransaction.lock_time);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || refTransaction.extra_data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, refTransaction.extra_data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || refTransaction.expiry != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, refTransaction.expiry);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || refTransaction.overwintered != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, refTransaction.overwintered);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || refTransaction.version_group_id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, refTransaction.version_group_id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || refTransaction.timestamp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.INSTANCE, refTransaction.timestamp);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && refTransaction.branch_id == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, LongSerializer.INSTANCE, refTransaction.branch_id);
    }

    public RefTransaction(@NotNull String str, long j, @NotNull List<PrevInput> list, @NotNull List<TxOutputBinType> list2, List<TxOutputType> list3, long j2, String str2, Long l, Boolean bool, Long l2, Long l3, Long l4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.hash = str;
        this.version = j;
        this.inputs = list;
        this.bin_outputs = list2;
        this.outputs = list3;
        this.lock_time = j2;
        this.extra_data = str2;
        this.expiry = l;
        this.overwintered = bool;
        this.version_group_id = l2;
        this.timestamp = l3;
        this.branch_id = l4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (r19v0 java.lang.String)
  (r20v0 long)
  (r22v0 java.util.List)
  (r23v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r24v0 java.util.List))
  (r25v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r28v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0023: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r30v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002b: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r31v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0034: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r32v0 java.lang.Long))
 A[MD:(java.lang.String, long, java.util.List<com.okinc.wallet.hardware.api.onekey.PrevInput>, java.util.List<com.okinc.wallet.hardware.api.onekey.TxOutputBinType>, java.util.List<com.okinc.wallet.hardware.api.onekey.TxOutputType>, long, java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.Long):void (m)] (LINE:377) call: com.okinc.wallet.hardware.api.onekey.RefTransaction.<init>(java.lang.String, long, java.util.List, java.util.List, java.util.List, long, java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.Long):void type: THIS */
    public /* synthetic */ RefTransaction(String str, long j, List list, List list2, List list3, long j2, String str2, Long l, Boolean bool, Long l2, Long l3, Long l4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, list, list2, (i & 16) != 0 ? null : list3, j2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : l2, (i & 1024) != 0 ? null : l3, (i & 2048) != 0 ? null : l4);
    }
}
