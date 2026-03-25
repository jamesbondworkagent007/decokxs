package com.okinc.business.defi.biz.walletconnect;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WCSolanaSignMessage {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String message;
    private final String pubkey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WCSolanaSignMessage copy$default(WCSolanaSignMessage wCSolanaSignMessage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wCSolanaSignMessage.message;
        }
        if ((i & 2) != 0) {
            str2 = wCSolanaSignMessage.pubkey;
        }
        return wCSolanaSignMessage.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WCSolanaSignMessage copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WCSolanaSignMessage(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCSolanaSignMessage)) {
            return false;
        }
        WCSolanaSignMessage wCSolanaSignMessage = (WCSolanaSignMessage) obj;
        return Intrinsics.EZpvd((Object) this.message, (Object) wCSolanaSignMessage.message) && Intrinsics.EZpvd((Object) this.pubkey, (Object) wCSolanaSignMessage.pubkey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubkey() {
        return this.pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.message.hashCode() * 31) + this.pubkey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WCSolanaSignMessage(message=" + this.message + ", pubkey=" + this.pubkey + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.walletconnect.WCSolanaSignMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WCSolanaSignMessage> serializer() {
            return WCSolanaSignMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WCSolanaSignMessage(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, WCSolanaSignMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.message = str;
        this.pubkey = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WCSolanaSignMessage wCSolanaSignMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wCSolanaSignMessage.message);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, wCSolanaSignMessage.pubkey);
    }

    public WCSolanaSignMessage(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.message = str;
        this.pubkey = str2;
    }
}
