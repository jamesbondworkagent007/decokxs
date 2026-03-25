package com.okinc.wallet.core.sign.ark;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class ARKTransaction {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String fee;
    private final String nonce;
    private final String to;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ARKTransaction copy$default(ARKTransaction aRKTransaction, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aRKTransaction.to;
        }
        if ((i & 2) != 0) {
            str2 = aRKTransaction.nonce;
        }
        if ((i & 4) != 0) {
            str3 = aRKTransaction.fee;
        }
        if ((i & 8) != 0) {
            str4 = aRKTransaction.value;
        }
        return aRKTransaction.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ARKTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ARKTransaction(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ARKTransaction)) {
            return false;
        }
        ARKTransaction aRKTransaction = (ARKTransaction) obj;
        return Intrinsics.EZpvd((Object) this.to, (Object) aRKTransaction.to) && Intrinsics.EZpvd((Object) this.nonce, (Object) aRKTransaction.nonce) && Intrinsics.EZpvd((Object) this.fee, (Object) aRKTransaction.fee) && Intrinsics.EZpvd((Object) this.value, (Object) aRKTransaction.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.to.hashCode() * 31) + this.nonce.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.value.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ARKTransaction(to=" + this.to + ", nonce=" + this.nonce + ", fee=" + this.fee + ", value=" + this.value + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.ark.ARKTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ARKTransaction> serializer() {
            return ARKTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ARKTransaction(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ARKTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.to = str;
        this.nonce = str2;
        this.fee = str3;
        this.value = str4;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(ARKTransaction aRKTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aRKTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aRKTransaction.nonce);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, aRKTransaction.fee);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, aRKTransaction.value);
    }

    public ARKTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.to = str;
        this.nonce = str2;
        this.fee = str3;
        this.value = str4;
    }
}
