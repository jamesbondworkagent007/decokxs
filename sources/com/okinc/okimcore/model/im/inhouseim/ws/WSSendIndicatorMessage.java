package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WSSendIndicatorMessage {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final int contentType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSSendIndicatorMessage copy$default(WSSendIndicatorMessage wSSendIndicatorMessage, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wSSendIndicatorMessage.contentType;
        }
        return wSSendIndicatorMessage.OLrzqt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendIndicatorMessage OLrzqt(int i) {
        return new WSSendIndicatorMessage(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSSendIndicatorMessage) && this.contentType == ((WSSendIndicatorMessage) obj).contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.contentType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSSendIndicatorMessage(contentType=" + this.contentType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSSendIndicatorMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSSendIndicatorMessage> serializer() {
            return WSSendIndicatorMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSSendIndicatorMessage(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WSSendIndicatorMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.contentType = i2;
    }

    public WSSendIndicatorMessage(int i) {
        this.contentType = i;
    }
}
