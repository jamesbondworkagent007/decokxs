package com.okinc.wallet.core.decode;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
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
public final class PsbtDecodeOutputItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final long amount;
    private final long vOut;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PsbtDecodeOutputItem copy$default(PsbtDecodeOutputItem psbtDecodeOutputItem, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = psbtDecodeOutputItem.amount;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = psbtDecodeOutputItem.vOut;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = psbtDecodeOutputItem.address;
        }
        return psbtDecodeOutputItem.copy(j3, j4, str);
    }

    @SerialName(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)
    public static /* synthetic */ void getAddress$annotations() {
    }

    @SerialName(OtcExtraKeys.AMOUNT)
    public static /* synthetic */ void getAmount$annotations() {
    }

    @SerialName("vOut")
    public static /* synthetic */ void getVOut$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.vOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PsbtDecodeOutputItem copy(long j, long j2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PsbtDecodeOutputItem(j, j2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PsbtDecodeOutputItem)) {
            return false;
        }
        PsbtDecodeOutputItem psbtDecodeOutputItem = (PsbtDecodeOutputItem) obj;
        return this.amount == psbtDecodeOutputItem.amount && this.vOut == psbtDecodeOutputItem.vOut && Intrinsics.EZpvd((Object) this.address, (Object) psbtDecodeOutputItem.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getVOut() {
        return this.vOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.amount) * 31) + Long.hashCode(this.vOut)) * 31) + this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PsbtDecodeOutputItem(amount=" + this.amount + ", vOut=" + this.vOut + ", address=" + this.address + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.decode.PsbtDecodeOutputItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PsbtDecodeOutputItem> serializer() {
            return PsbtDecodeOutputItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PsbtDecodeOutputItem(int i, long j, long j2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PsbtDecodeOutputItem$$serializer.INSTANCE.getDescriptor());
        }
        this.amount = j;
        this.vOut = j2;
        this.address = str;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(PsbtDecodeOutputItem psbtDecodeOutputItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, psbtDecodeOutputItem.amount);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, psbtDecodeOutputItem.vOut);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, psbtDecodeOutputItem.address);
    }

    public PsbtDecodeOutputItem(long j, long j2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = j;
        this.vOut = j2;
        this.address = str;
    }
}
