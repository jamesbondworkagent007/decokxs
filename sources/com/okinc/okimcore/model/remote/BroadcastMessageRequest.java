package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData$$serializer;
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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class BroadcastMessageRequest {
    private final long broadcastChannelId;
    private final WSSendMessageDetailData message;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BroadcastMessageRequest copy$default(BroadcastMessageRequest broadcastMessageRequest, long j, WSSendMessageDetailData wSSendMessageDetailData, int i, Object obj) {
        if ((i & 1) != 0) {
            j = broadcastMessageRequest.broadcastChannelId;
        }
        if ((i & 2) != 0) {
            wSSendMessageDetailData = broadcastMessageRequest.message;
        }
        return broadcastMessageRequest.copy(j, wSSendMessageDetailData);
    }

    @SerialName("broadcastChannelId")
    public static /* synthetic */ void getBroadcastChannelId$annotations() {
    }

    @SerialName("message")
    public static /* synthetic */ void getMessage$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.broadcastChannelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendMessageDetailData component2() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BroadcastMessageRequest copy(long j, @NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        return new BroadcastMessageRequest(j, wSSendMessageDetailData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BroadcastMessageRequest)) {
            return false;
        }
        BroadcastMessageRequest broadcastMessageRequest = (BroadcastMessageRequest) obj;
        return this.broadcastChannelId == broadcastMessageRequest.broadcastChannelId && Intrinsics.EZpvd(this.message, broadcastMessageRequest.message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBroadcastChannelId() {
        return this.broadcastChannelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendMessageDetailData getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.broadcastChannelId) * 31) + this.message.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BroadcastMessageRequest(broadcastChannelId=" + this.broadcastChannelId + ", message=" + this.message + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.BroadcastMessageRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BroadcastMessageRequest> serializer() {
            return BroadcastMessageRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BroadcastMessageRequest(int i, long j, WSSendMessageDetailData wSSendMessageDetailData, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, BroadcastMessageRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.broadcastChannelId = j;
        this.message = wSSendMessageDetailData;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(BroadcastMessageRequest broadcastMessageRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, broadcastMessageRequest.broadcastChannelId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, WSSendMessageDetailData$$serializer.INSTANCE, broadcastMessageRequest.message);
    }

    public BroadcastMessageRequest(long j, @NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        this.broadcastChannelId = j;
        this.message = wSSendMessageDetailData;
    }
}
