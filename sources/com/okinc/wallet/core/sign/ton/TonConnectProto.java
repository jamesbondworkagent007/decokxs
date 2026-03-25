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
public final class TonConnectProto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String message;
    private final String prvKey;
    private final String pubKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TonConnectProto copy$default(TonConnectProto tonConnectProto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tonConnectProto.message;
        }
        if ((i & 2) != 0) {
            str2 = tonConnectProto.pubKey;
        }
        if ((i & 4) != 0) {
            str3 = tonConnectProto.prvKey;
        }
        return tonConnectProto.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.prvKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonConnectProto copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TonConnectProto(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonConnectProto)) {
            return false;
        }
        TonConnectProto tonConnectProto = (TonConnectProto) obj;
        return Intrinsics.EZpvd((Object) this.message, (Object) tonConnectProto.message) && Intrinsics.EZpvd((Object) this.pubKey, (Object) tonConnectProto.pubKey) && Intrinsics.EZpvd((Object) this.prvKey, (Object) tonConnectProto.prvKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
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
        return (((this.message.hashCode() * 31) + this.pubKey.hashCode()) * 31) + this.prvKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonConnectProto(message=" + this.message + ", pubKey=" + this.pubKey + ", prvKey=" + this.prvKey + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.ton.TonConnectProto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonConnectProto> serializer() {
            return TonConnectProto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TonConnectProto(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TonConnectProto$$serializer.INSTANCE.getDescriptor());
        }
        this.message = str;
        this.pubKey = str2;
        this.prvKey = str3;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(TonConnectProto tonConnectProto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tonConnectProto.message);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tonConnectProto.pubKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tonConnectProto.prvKey);
    }

    public TonConnectProto(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.message = str;
        this.pubKey = str2;
        this.prvKey = str3;
    }
}
