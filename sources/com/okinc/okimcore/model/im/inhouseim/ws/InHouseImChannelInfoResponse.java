package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseImChannelInfoResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String channelId;
    public final String seq;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseImChannelInfoResponse copy$default(InHouseImChannelInfoResponse inHouseImChannelInfoResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inHouseImChannelInfoResponse.channelId;
        }
        if ((i & 2) != 0) {
            str2 = inHouseImChannelInfoResponse.seq;
        }
        return inHouseImChannelInfoResponse.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseImChannelInfoResponse EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InHouseImChannelInfoResponse(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseImChannelInfoResponse)) {
            return false;
        }
        InHouseImChannelInfoResponse inHouseImChannelInfoResponse = (InHouseImChannelInfoResponse) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) inHouseImChannelInfoResponse.channelId) && Intrinsics.EZpvd((Object) this.seq, (Object) inHouseImChannelInfoResponse.seq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.channelId.hashCode() * 31) + this.seq.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseImChannelInfoResponse(channelId=" + this.channelId + ", seq=" + this.seq + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.InHouseImChannelInfoResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseImChannelInfoResponse> serializer() {
            return InHouseImChannelInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseImChannelInfoResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, InHouseImChannelInfoResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        this.seq = str2;
    }

    public static final /* synthetic */ void AEQbTJ(InHouseImChannelInfoResponse inHouseImChannelInfoResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseImChannelInfoResponse.channelId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, inHouseImChannelInfoResponse.seq);
    }

    public InHouseImChannelInfoResponse(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.channelId = str;
        this.seq = str2;
    }
}
