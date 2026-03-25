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
public final class TxOutputBinType {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String amount;
    private final Long decred_script_version;
    private final String script_pubkey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getDecred_script_version() {
        return this.decred_script_version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScript_pubkey() {
        return this.script_pubkey;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.TxOutputBinType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TxOutputBinType> serializer() {
            return TxOutputBinType$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TxOutputBinType(int i, String str, String str2, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TxOutputBinType$$serializer.INSTANCE.getDescriptor());
        }
        this.amount = str;
        this.script_pubkey = str2;
        if ((i & 4) == 0) {
            this.decred_script_version = null;
        } else {
            this.decred_script_version = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(TxOutputBinType txOutputBinType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, txOutputBinType.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, txOutputBinType.script_pubkey);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && txOutputBinType.decred_script_version == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, txOutputBinType.decred_script_version);
    }

    public TxOutputBinType(@NotNull String str, @NotNull String str2, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.amount = str;
        this.script_pubkey = str2;
        this.decred_script_version = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long):void (m)] (LINE:404) call: com.okinc.wallet.hardware.api.onekey.TxOutputBinType.<init>(java.lang.String, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ TxOutputBinType(String str, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : l);
    }
}
