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
public final class InHouseIMMessageRequest {
    public final String channelId;
    public final WSSendMessageDetailData message;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseIMMessageRequest copy$default(InHouseIMMessageRequest inHouseIMMessageRequest, String str, WSSendMessageDetailData wSSendMessageDetailData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inHouseIMMessageRequest.channelId;
        }
        if ((i & 2) != 0) {
            wSSendMessageDetailData = inHouseIMMessageRequest.message;
        }
        return inHouseIMMessageRequest.AEQbTJ(str, wSSendMessageDetailData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageRequest AEQbTJ(@NotNull String str, @NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        return new InHouseIMMessageRequest(str, wSSendMessageDetailData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendMessageDetailData EZpvd() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMMessageRequest)) {
            return false;
        }
        InHouseIMMessageRequest inHouseIMMessageRequest = (InHouseIMMessageRequest) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) inHouseIMMessageRequest.channelId) && Intrinsics.EZpvd(this.message, inHouseIMMessageRequest.message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.channelId.hashCode() * 31) + this.message.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMMessageRequest(channelId=" + this.channelId + ", message=" + this.message + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMMessageRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMMessageRequest> serializer() {
            return InHouseIMMessageRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMMessageRequest(int i, String str, WSSendMessageDetailData wSSendMessageDetailData, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, InHouseIMMessageRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        this.message = wSSendMessageDetailData;
    }

    public static final /* synthetic */ void EZpvd(InHouseIMMessageRequest inHouseIMMessageRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseIMMessageRequest.channelId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, WSSendMessageDetailData$$serializer.INSTANCE, inHouseIMMessageRequest.message);
    }

    public InHouseIMMessageRequest(@NotNull String str, @NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        this.channelId = str;
        this.message = wSSendMessageDetailData;
    }
}
