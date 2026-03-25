package com.okinc.wallet.core.decode;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class PsbtDecodeItemDetails {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String txnId;
    private final int vout;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PsbtDecodeItemDetails copy$default(PsbtDecodeItemDetails psbtDecodeItemDetails, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = psbtDecodeItemDetails.txnId;
        }
        if ((i2 & 2) != 0) {
            i = psbtDecodeItemDetails.vout;
        }
        return psbtDecodeItemDetails.copy(str, i);
    }

    @SerialName("txId")
    public static /* synthetic */ void getTxnId$annotations() {
    }

    @SerialName("vOut")
    public static /* synthetic */ void getVout$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txnId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.vout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PsbtDecodeItemDetails copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PsbtDecodeItemDetails(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PsbtDecodeItemDetails)) {
            return false;
        }
        PsbtDecodeItemDetails psbtDecodeItemDetails = (PsbtDecodeItemDetails) obj;
        return Intrinsics.EZpvd((Object) this.txnId, (Object) psbtDecodeItemDetails.txnId) && this.vout == psbtDecodeItemDetails.vout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxnId() {
        return this.txnId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVout() {
        return this.vout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.txnId.hashCode() * 31) + Integer.hashCode(this.vout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PsbtDecodeItemDetails(txnId=" + this.txnId + ", vout=" + this.vout + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.decode.PsbtDecodeItemDetails.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PsbtDecodeItemDetails> serializer() {
            return PsbtDecodeItemDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PsbtDecodeItemDetails(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PsbtDecodeItemDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.txnId = str;
        this.vout = i2;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(PsbtDecodeItemDetails psbtDecodeItemDetails, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, psbtDecodeItemDetails.txnId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, psbtDecodeItemDetails.vout);
    }

    public PsbtDecodeItemDetails(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txnId = str;
        this.vout = i;
    }
}
