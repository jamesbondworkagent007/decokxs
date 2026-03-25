package com.okinc.wallet.core.sign.kaspa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class KaspaTxIn {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final String amount;
    private final int index;
    private final String txId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KaspaTxIn copy$default(KaspaTxIn kaspaTxIn, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = kaspaTxIn.txId;
        }
        if ((i2 & 2) != 0) {
            i = kaspaTxIn.index;
        }
        if ((i2 & 4) != 0) {
            str2 = kaspaTxIn.address;
        }
        if ((i2 & 8) != 0) {
            str3 = kaspaTxIn.amount;
        }
        return kaspaTxIn.copy(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KaspaTxIn copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new KaspaTxIn(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KaspaTxIn)) {
            return false;
        }
        KaspaTxIn kaspaTxIn = (KaspaTxIn) obj;
        return Intrinsics.EZpvd((Object) this.txId, (Object) kaspaTxIn.txId) && this.index == kaspaTxIn.index && Intrinsics.EZpvd((Object) this.address, (Object) kaspaTxIn.address) && Intrinsics.EZpvd((Object) this.amount, (Object) kaspaTxIn.amount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.txId.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.address.hashCode()) * 31) + this.amount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KaspaTxIn(txId=" + this.txId + ", index=" + this.index + ", address=" + this.address + ", amount=" + this.amount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.kaspa.KaspaTxIn.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KaspaTxIn> serializer() {
            return KaspaTxIn$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KaspaTxIn(int i, String str, int i2, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, KaspaTxIn$$serializer.INSTANCE.getDescriptor());
        }
        this.txId = str;
        this.index = i2;
        this.address = str2;
        this.amount = str3;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(KaspaTxIn kaspaTxIn, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, kaspaTxIn.txId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, kaspaTxIn.index);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, kaspaTxIn.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, kaspaTxIn.amount);
    }

    public KaspaTxIn(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.txId = str;
        this.index = i;
        this.address = str2;
        this.amount = str3;
    }
}
