package com.okinc.business.defi.wallet.common.tonconnect.network;

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
public final class SSEvent {
    public final String AEQbTJ;
    public final BridgeMessage EZpvd;
    public final String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SSEvent copy$default(SSEvent sSEvent, String str, String str2, BridgeMessage bridgeMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sSEvent.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = sSEvent.KWHzl;
        }
        if ((i & 4) != 0) {
            bridgeMessage = sSEvent.EZpvd;
        }
        return sSEvent.OLrzqt(str, str2, bridgeMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BridgeMessage EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SSEvent OLrzqt(String str, String str2, @NotNull BridgeMessage bridgeMessage) {
        Intrinsics.checkNotNullParameter(bridgeMessage, "");
        return new SSEvent(str, str2, bridgeMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SSEvent)) {
            return false;
        }
        SSEvent sSEvent = (SSEvent) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) sSEvent.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) sSEvent.KWHzl) && Intrinsics.EZpvd(this.EZpvd, sSEvent.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.KWHzl;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SSEvent(id=" + this.AEQbTJ + ", type=" + this.KWHzl + ", bridgeMessage=" + this.EZpvd + ")";
    }

    public SSEvent(String str, String str2, @NotNull BridgeMessage bridgeMessage) {
        Intrinsics.checkNotNullParameter(bridgeMessage, "");
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.EZpvd = bridgeMessage;
    }

    @Serializable
    public static final class BridgeMessage {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String from;
        private final String message;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ BridgeMessage copy$default(BridgeMessage bridgeMessage, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bridgeMessage.from;
            }
            if ((i & 2) != 0) {
                str2 = bridgeMessage.message;
            }
            return bridgeMessage.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.from;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BridgeMessage copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new BridgeMessage(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BridgeMessage)) {
                return false;
            }
            BridgeMessage bridgeMessage = (BridgeMessage) obj;
            return Intrinsics.EZpvd((Object) this.from, (Object) bridgeMessage.from) && Intrinsics.EZpvd((Object) this.message, (Object) bridgeMessage.message);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFrom() {
            return this.from;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.from.hashCode() * 31) + this.message.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BridgeMessage(from=" + this.from + ", message=" + this.message + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.network.SSEvent.BridgeMessage.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<BridgeMessage> serializer() {
                return SSEvent$BridgeMessage$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ BridgeMessage(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, SSEvent$BridgeMessage$$serializer.INSTANCE.getDescriptor());
            }
            this.from = str;
            this.message = str2;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(BridgeMessage bridgeMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, bridgeMessage.from);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, bridgeMessage.message);
        }

        public BridgeMessage(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.from = str;
            this.message = str2;
        }
    }
}
