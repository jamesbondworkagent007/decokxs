package com.okinc.wallet.core.decode;

import com.okinc.p2p.api.OtcExtraKeys;
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
public final class PsbtDecodeInputItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long amount;
    private final String txId;
    private final long vOut;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PsbtDecodeInputItem copy$default(PsbtDecodeInputItem psbtDecodeInputItem, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = psbtDecodeInputItem.txId;
        }
        if ((i & 2) != 0) {
            j = psbtDecodeInputItem.amount;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = psbtDecodeInputItem.vOut;
        }
        return psbtDecodeInputItem.copy(str, j3, j2);
    }

    @SerialName(OtcExtraKeys.AMOUNT)
    public static /* synthetic */ void getAmount$annotations() {
    }

    @SerialName("txId")
    public static /* synthetic */ void getTxId$annotations() {
    }

    @SerialName("vOut")
    public static /* synthetic */ void getVOut$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.vOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PsbtDecodeInputItem copy(@NotNull String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PsbtDecodeInputItem(str, j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PsbtDecodeInputItem)) {
            return false;
        }
        PsbtDecodeInputItem psbtDecodeInputItem = (PsbtDecodeInputItem) obj;
        return Intrinsics.EZpvd((Object) this.txId, (Object) psbtDecodeInputItem.txId) && this.amount == psbtDecodeInputItem.amount && this.vOut == psbtDecodeInputItem.vOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getVOut() {
        return this.vOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.txId.hashCode() * 31) + Long.hashCode(this.amount)) * 31) + Long.hashCode(this.vOut);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PsbtDecodeInputItem(txId=" + this.txId + ", amount=" + this.amount + ", vOut=" + this.vOut + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.decode.PsbtDecodeInputItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PsbtDecodeInputItem> serializer() {
            return PsbtDecodeInputItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PsbtDecodeInputItem(int i, String str, long j, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PsbtDecodeInputItem$$serializer.INSTANCE.getDescriptor());
        }
        this.txId = str;
        this.amount = j;
        this.vOut = j2;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(PsbtDecodeInputItem psbtDecodeInputItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, psbtDecodeInputItem.txId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, psbtDecodeInputItem.amount);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, psbtDecodeInputItem.vOut);
    }

    public PsbtDecodeInputItem(@NotNull String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txId = str;
        this.amount = j;
        this.vOut = j2;
    }
}
