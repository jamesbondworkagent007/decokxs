package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WSSendAck {
    public final WSSendMessageDetailData message;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSSendAck copy$default(WSSendAck wSSendAck, WSSendMessageDetailData wSSendMessageDetailData, int i, Object obj) {
        if ((i & 1) != 0) {
            wSSendMessageDetailData = wSSendAck.message;
        }
        return wSSendAck.EZpvd(wSSendMessageDetailData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendAck EZpvd(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        return new WSSendAck(wSSendMessageDetailData);
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
        return (obj instanceof WSSendAck) && Intrinsics.EZpvd(this.message, ((WSSendAck) obj).message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.message.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSSendAck(message=" + this.message + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSSendAck.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSSendAck> serializer() {
            return WSSendAck$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSSendAck(int i, WSSendMessageDetailData wSSendMessageDetailData, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WSSendAck$$serializer.INSTANCE.getDescriptor());
        }
        this.message = wSSendMessageDetailData;
    }

    public WSSendAck(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        this.message = wSSendMessageDetailData;
    }
}
