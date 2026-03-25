package com.okinc.wallet.core.sign.ton;

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
public final class X25519KeyPair {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String prvKey;
    private final String pubKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ X25519KeyPair copy$default(X25519KeyPair x25519KeyPair, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = x25519KeyPair.pubKey;
        }
        if ((i & 2) != 0) {
            str2 = x25519KeyPair.prvKey;
        }
        return x25519KeyPair.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.prvKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final X25519KeyPair copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new X25519KeyPair(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X25519KeyPair)) {
            return false;
        }
        X25519KeyPair x25519KeyPair = (X25519KeyPair) obj;
        return Intrinsics.EZpvd((Object) this.pubKey, (Object) x25519KeyPair.pubKey) && Intrinsics.EZpvd((Object) this.prvKey, (Object) x25519KeyPair.prvKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrvKey() {
        return this.prvKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubKey() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.pubKey.hashCode() * 31) + this.prvKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "X25519KeyPair(pubKey=" + this.pubKey + ", prvKey=" + this.prvKey + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.ton.X25519KeyPair.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<X25519KeyPair> serializer() {
            return X25519KeyPair$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ X25519KeyPair(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, X25519KeyPair$$serializer.INSTANCE.getDescriptor());
        }
        this.pubKey = str;
        this.prvKey = str2;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(X25519KeyPair x25519KeyPair, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, x25519KeyPair.pubKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, x25519KeyPair.prvKey);
    }

    public X25519KeyPair(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.pubKey = str;
        this.prvKey = str2;
    }
}
