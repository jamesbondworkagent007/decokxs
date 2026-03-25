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
public final class TxInputType {
    public final List<Long> address_n;
    public final String amount;
    public final String commitment_data;
    public final Long decred_staking_spend;
    public final Long decred_tree;
    public final MultisigRedeemScriptType multisig;
    public final String orig_hash;
    public final Long orig_index;
    public final String ownership_proof;
    public final String prev_hash;
    public final long prev_index;
    public final String script_pubkey;
    public final String script_sig;
    public final String script_type;
    public final Long sequence;
    public final String witness;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(LongSerializer.INSTANCE), null};

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 long)
  (r4v0 java.lang.String)
  (r5v0 java.lang.Long)
  (r6v0 com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType)
  (r7v0 java.lang.Long)
  (r8v0 java.lang.String)
  (r9v0 java.lang.Long)
  (r10v0 java.lang.Long)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.util.List)
  (r17v0 java.lang.String)
 A[MD:(java.lang.String, long, java.lang.String, java.lang.Long, com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.Long>, java.lang.String):void (m)] call: com.okinc.wallet.hardware.api.onekey.TxInputType.<init>(java.lang.String, long, java.lang.String, java.lang.Long, com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TxInputType(String str, long j, String str2, Long l, MultisigRedeemScriptType multisigRedeemScriptType, Long l2, String str3, Long l3, Long l4, String str4, String str5, String str6, String str7, String str8, List list, String str9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, l, multisigRedeemScriptType, l2, str3, l3, l4, str4, str5, str6, str7, str8, list, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Long AYXKKw() {
        return this.orig_index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String AhwBna() {
        return this.ownership_proof;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String AkhnZx() {
        return this.script_pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long DbNXlk() {
        return this.prev_index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String EZpvd() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Long KWHzl() {
        return this.decred_staking_spend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Long OLrzqt() {
        return this.decred_tree;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String copydefault() {
        return this.commitment_data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String djBIcL() {
        return this.orig_hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String fJNWhG() {
        return this.witness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Long fetchVPNInfo() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String gEmmrt() {
        return this.prev_hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String isConnected() {
        return this.script_sig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MultisigRedeemScriptType valueOf() {
        return this.multisig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String values() {
        return this.script_type;
    }

    public /* synthetic */ TxInputType(int i, String str, long j, String str2, Long l, MultisigRedeemScriptType multisigRedeemScriptType, Long l2, String str3, Long l3, Long l4, String str4, String str5, String str6, String str7, String str8, List list, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TxInputType$$serializer.INSTANCE.getDescriptor());
        }
        this.prev_hash = str;
        this.prev_index = j;
        this.amount = str2;
        if ((i & 8) == 0) {
            this.sequence = null;
        } else {
            this.sequence = l;
        }
        if ((i & 16) == 0) {
            this.multisig = null;
        } else {
            this.multisig = multisigRedeemScriptType;
        }
        if ((i & 32) == 0) {
            this.decred_tree = null;
        } else {
            this.decred_tree = l2;
        }
        if ((i & 64) == 0) {
            this.orig_hash = null;
        } else {
            this.orig_hash = str3;
        }
        if ((i & 128) == 0) {
            this.orig_index = null;
        } else {
            this.orig_index = l3;
        }
        if ((i & 256) == 0) {
            this.decred_staking_spend = null;
        } else {
            this.decred_staking_spend = l4;
        }
        if ((i & 512) == 0) {
            this.script_pubkey = null;
        } else {
            this.script_pubkey = str4;
        }
        if ((i & 1024) == 0) {
            this.script_sig = null;
        } else {
            this.script_sig = str5;
        }
        if ((i & 2048) == 0) {
            this.witness = null;
        } else {
            this.witness = str6;
        }
        if ((i & 4096) == 0) {
            this.ownership_proof = null;
        } else {
            this.ownership_proof = str7;
        }
        if ((i & 8192) == 0) {
            this.commitment_data = null;
        } else {
            this.commitment_data = str8;
        }
        if ((i & 16384) == 0) {
            this.address_n = null;
        } else {
            this.address_n = list;
        }
        if ((i & 32768) == 0) {
            this.script_type = null;
        } else {
            this.script_type = str9;
        }
    }

    public static final /* synthetic */ void OLrzqt(TxInputType txInputType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, txInputType.gEmmrt());
        compositeEncoder.encodeLongElement(serialDescriptor, 1, txInputType.DbNXlk());
        compositeEncoder.encodeStringElement(serialDescriptor, 2, txInputType.EZpvd());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || txInputType.fetchVPNInfo() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, txInputType.fetchVPNInfo());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || txInputType.valueOf() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, MultisigRedeemScriptType$$serializer.INSTANCE, txInputType.valueOf());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || txInputType.OLrzqt() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, txInputType.OLrzqt());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || txInputType.djBIcL() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, txInputType.djBIcL());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || txInputType.AYXKKw() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, txInputType.AYXKKw());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || txInputType.KWHzl() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, txInputType.KWHzl());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || txInputType.AkhnZx() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, txInputType.AkhnZx());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || txInputType.isConnected() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, txInputType.isConnected());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || txInputType.fJNWhG() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, txInputType.fJNWhG());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || txInputType.AhwBna() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, txInputType.AhwBna());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || txInputType.copydefault() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, txInputType.copydefault());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || txInputType.address_n != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr[14], txInputType.address_n);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && txInputType.values() == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, txInputType.values());
    }

    public TxInputType(String str, long j, String str2, Long l, MultisigRedeemScriptType multisigRedeemScriptType, Long l2, String str3, Long l3, Long l4, String str4, String str5, String str6, String str7, String str8, List<Long> list, String str9) {
        this.prev_hash = str;
        this.prev_index = j;
        this.amount = str2;
        this.sequence = l;
        this.multisig = multisigRedeemScriptType;
        this.decred_tree = l2;
        this.orig_hash = str3;
        this.orig_index = l3;
        this.decred_staking_spend = l4;
        this.script_pubkey = str4;
        this.script_sig = str5;
        this.witness = str6;
        this.ownership_proof = str7;
        this.commitment_data = str8;
        this.address_n = list;
        this.script_type = str9;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.TxInputType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TxInputType> serializer() {
            return TxInputType$$serializer.INSTANCE;
        }

        public final TxInputType KWHzl(@NotNull String str, long j, @NotNull String str2, Long l, MultisigRedeemScriptType multisigRedeemScriptType, Long l2, String str3, Long l3, Long l4, String str4, String str5, String str6, String str7, String str8, @NotNull List<Long> list, String str9) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new TxInputType(str, j, str2, l, multisigRedeemScriptType, l2, str3, l3, l4, str4, str5, str6, str7, str8, list, str9, null);
        }

        public final TxInputType KWHzl(@NotNull String str, long j, @NotNull String str2, Long l, MultisigRedeemScriptType multisigRedeemScriptType, Long l2, String str3, Long l3, Long l4, @NotNull String str4, String str5, String str6, String str7, String str8) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new TxInputType(str, j, str2, l, multisigRedeemScriptType, l2, str3, l3, l4, str4, str5, str6, str7, str8, null, "EXTERNAL", null);
        }
    }
}
