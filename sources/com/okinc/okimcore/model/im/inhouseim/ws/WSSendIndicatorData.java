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
public final class WSSendIndicatorData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long channelId;
    public final WSSendIndicatorMessage message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSSendIndicatorData copy$default(WSSendIndicatorData wSSendIndicatorData, long j, WSSendIndicatorMessage wSSendIndicatorMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            j = wSSendIndicatorData.channelId;
        }
        if ((i & 2) != 0) {
            wSSendIndicatorMessage = wSSendIndicatorData.message;
        }
        return wSSendIndicatorData.OLrzqt(j, wSSendIndicatorMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendIndicatorData OLrzqt(long j, @NotNull WSSendIndicatorMessage wSSendIndicatorMessage) {
        Intrinsics.checkNotNullParameter(wSSendIndicatorMessage, "");
        return new WSSendIndicatorData(j, wSSendIndicatorMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSSendIndicatorData)) {
            return false;
        }
        WSSendIndicatorData wSSendIndicatorData = (WSSendIndicatorData) obj;
        return this.channelId == wSSendIndicatorData.channelId && Intrinsics.EZpvd(this.message, wSSendIndicatorData.message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.channelId) * 31) + this.message.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSSendIndicatorData(channelId=" + this.channelId + ", message=" + this.message + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSSendIndicatorData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSSendIndicatorData> serializer() {
            return WSSendIndicatorData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSSendIndicatorData(int i, long j, WSSendIndicatorMessage wSSendIndicatorMessage, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, WSSendIndicatorData$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = j;
        this.message = wSSendIndicatorMessage;
    }

    public static final /* synthetic */ void copydefault(WSSendIndicatorData wSSendIndicatorData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, wSSendIndicatorData.channelId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, WSSendIndicatorMessage$$serializer.INSTANCE, wSSendIndicatorData.message);
    }

    public WSSendIndicatorData(long j, @NotNull WSSendIndicatorMessage wSSendIndicatorMessage) {
        Intrinsics.checkNotNullParameter(wSSendIndicatorMessage, "");
        this.channelId = j;
        this.message = wSSendIndicatorMessage;
    }
}
