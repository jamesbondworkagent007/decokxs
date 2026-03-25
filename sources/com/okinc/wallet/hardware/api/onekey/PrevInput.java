package com.okinc.wallet.hardware.api.onekey;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class PrevInput {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Long decred_tree;
    private final String prev_hash;
    private final long prev_index;
    private final String script_sig;
    private final long sequence;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getDecred_tree() {
        return this.decred_tree;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrev_hash() {
        return this.prev_hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPrev_index() {
        return this.prev_index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScript_sig() {
        return this.script_sig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSequence() {
        return this.sequence;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.PrevInput.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PrevInput> serializer() {
            return PrevInput$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PrevInput(int i, String str, long j, String str2, long j2, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, PrevInput$$serializer.INSTANCE.getDescriptor());
        }
        this.prev_hash = str;
        this.prev_index = j;
        this.script_sig = str2;
        this.sequence = j2;
        if ((i & 16) == 0) {
            this.decred_tree = null;
        } else {
            this.decred_tree = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(PrevInput prevInput, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, prevInput.prev_hash);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, prevInput.prev_index);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, prevInput.script_sig);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, prevInput.sequence);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && prevInput.decred_tree == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, prevInput.decred_tree);
    }

    public PrevInput(@NotNull String str, long j, @NotNull String str2, long j2, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.prev_hash = str;
        this.prev_index = j;
        this.script_sig = str2;
        this.sequence = j2;
        this.decred_tree = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 long)
  (r13v0 java.lang.String)
  (r14v0 long)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r16v0 java.lang.Long))
 A[MD:(java.lang.String, long, java.lang.String, long, java.lang.Long):void (m)] (LINE:394) call: com.okinc.wallet.hardware.api.onekey.PrevInput.<init>(java.lang.String, long, java.lang.String, long, java.lang.Long):void type: THIS */
    public /* synthetic */ PrevInput(String str, long j, String str2, long j2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, j2, (i & 16) != 0 ? null : l);
    }
}
