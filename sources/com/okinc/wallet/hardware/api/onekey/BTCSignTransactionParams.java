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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class BTCSignTransactionParams {
    private final Account account;
    private final Long branchId;
    private final String coin;
    private final Long expiry;
    private final List<TxInputType> inputs;
    private final Long locktime;
    private final List<TxOutputType> outputs;
    private final Boolean overwintered;
    private final List<RefTransaction> refTxs;
    private final Long timestamp;
    private final Long version;
    private final Long versionGroupId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(TxInputType$$serializer.INSTANCE), new ArrayListSerializer(TxOutputType$$serializer.INSTANCE), new ArrayListSerializer(RefTransaction$$serializer.INSTANCE), null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Account getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getBranchId() {
        return this.branchId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoin() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpiry() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxInputType> getInputs() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLocktime() {
        return this.locktime;
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
    public final List<RefTransaction> getRefTxs() {
        return this.refTxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getVersionGroupId() {
        return this.versionGroupId;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.BTCSignTransactionParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BTCSignTransactionParams> serializer() {
            return BTCSignTransactionParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BTCSignTransactionParams(int i, String str, List list, List list2, List list3, Account account, Long l, Long l2, Long l3, Boolean bool, Long l4, Long l5, Long l6, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, BTCSignTransactionParams$$serializer.INSTANCE.getDescriptor());
        }
        this.coin = str;
        this.inputs = list;
        this.outputs = list2;
        this.refTxs = list3;
        if ((i & 16) == 0) {
            this.account = null;
        } else {
            this.account = account;
        }
        if ((i & 32) == 0) {
            this.locktime = null;
        } else {
            this.locktime = l;
        }
        if ((i & 64) == 0) {
            this.version = null;
        } else {
            this.version = l2;
        }
        if ((i & 128) == 0) {
            this.expiry = null;
        } else {
            this.expiry = l3;
        }
        if ((i & 256) == 0) {
            this.overwintered = null;
        } else {
            this.overwintered = bool;
        }
        if ((i & 512) == 0) {
            this.versionGroupId = null;
        } else {
            this.versionGroupId = l4;
        }
        if ((i & 1024) == 0) {
            this.branchId = null;
        } else {
            this.branchId = l5;
        }
        if ((i & 2048) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = l6;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(BTCSignTransactionParams bTCSignTransactionParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bTCSignTransactionParams.coin);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], bTCSignTransactionParams.inputs);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], bTCSignTransactionParams.outputs);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], bTCSignTransactionParams.refTxs);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || bTCSignTransactionParams.account != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, Account$$serializer.INSTANCE, bTCSignTransactionParams.account);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || bTCSignTransactionParams.locktime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, bTCSignTransactionParams.locktime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || bTCSignTransactionParams.version != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, bTCSignTransactionParams.version);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || bTCSignTransactionParams.expiry != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, bTCSignTransactionParams.expiry);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || bTCSignTransactionParams.overwintered != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bTCSignTransactionParams.overwintered);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || bTCSignTransactionParams.versionGroupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, bTCSignTransactionParams.versionGroupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || bTCSignTransactionParams.branchId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.INSTANCE, bTCSignTransactionParams.branchId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && bTCSignTransactionParams.timestamp == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, LongSerializer.INSTANCE, bTCSignTransactionParams.timestamp);
    }

    public BTCSignTransactionParams(@NotNull String str, @NotNull List<TxInputType> list, @NotNull List<TxOutputType> list2, @NotNull List<RefTransaction> list3, Account account, Long l, Long l2, Long l3, Boolean bool, Long l4, Long l5, Long l6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.coin = str;
        this.inputs = list;
        this.outputs = list2;
        this.refTxs = list3;
        this.account = account;
        this.locktime = l;
        this.version = l2;
        this.expiry = l3;
        this.overwintered = bool;
        this.versionGroupId = l4;
        this.branchId = l5;
        this.timestamp = l6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004d: CONSTRUCTOR 
  (r17v0 java.lang.String)
  (r18v0 java.util.List)
  (r19v0 java.util.List)
  (r20v0 java.util.List)
  (wrap:com.okinc.wallet.hardware.api.onekey.Account:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.Account) : (r21v0 com.okinc.wallet.hardware.api.onekey.Account))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r23v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001b: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r24v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002b: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r26v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0033: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r27v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x003b: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r28v0 java.lang.Long))
 A[MD:(java.lang.String, java.util.List<com.okinc.wallet.hardware.api.onekey.TxInputType>, java.util.List<com.okinc.wallet.hardware.api.onekey.TxOutputType>, java.util.List<com.okinc.wallet.hardware.api.onekey.RefTransaction>, com.okinc.wallet.hardware.api.onekey.Account, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.Long):void (m)] (LINE:112) call: com.okinc.wallet.hardware.api.onekey.BTCSignTransactionParams.<init>(java.lang.String, java.util.List, java.util.List, java.util.List, com.okinc.wallet.hardware.api.onekey.Account, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.Long):void type: THIS */
    public /* synthetic */ BTCSignTransactionParams(String str, List list, List list2, List list3, Account account, Long l, Long l2, Long l3, Boolean bool, Long l4, Long l5, Long l6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, list2, list3, (i & 16) != 0 ? null : account, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : l3, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : l4, (i & 1024) != 0 ? null : l5, (i & 2048) != 0 ? null : l6);
    }
}
