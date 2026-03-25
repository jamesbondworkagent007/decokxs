package com.okinc.business.defi.biz.net.bean;

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
public final class HandshakeResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String mpcId;
    private final boolean pass;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HandshakeResponse copy$default(HandshakeResponse handshakeResponse, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = handshakeResponse.mpcId;
        }
        if ((i & 2) != 0) {
            z = handshakeResponse.pass;
        }
        return handshakeResponse.copy(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.pass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HandshakeResponse copy(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new HandshakeResponse(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HandshakeResponse)) {
            return false;
        }
        HandshakeResponse handshakeResponse = (HandshakeResponse) obj;
        return Intrinsics.EZpvd((Object) this.mpcId, (Object) handshakeResponse.mpcId) && this.pass == handshakeResponse.pass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPass() {
        return this.pass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.mpcId.hashCode() * 31) + Boolean.hashCode(this.pass);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HandshakeResponse(mpcId=" + this.mpcId + ", pass=" + this.pass + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.HandshakeResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HandshakeResponse> serializer() {
            return HandshakeResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HandshakeResponse(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, HandshakeResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.mpcId = str;
        this.pass = z;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(HandshakeResponse handshakeResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, handshakeResponse.mpcId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, handshakeResponse.pass);
    }

    public HandshakeResponse(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mpcId = str;
        this.pass = z;
    }
}
