package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class WSJoinLiveStreamData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String channelId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSJoinLiveStreamData copy$default(WSJoinLiveStreamData wSJoinLiveStreamData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wSJoinLiveStreamData.channelId;
        }
        return wSJoinLiveStreamData.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSJoinLiveStreamData EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WSJoinLiveStreamData(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSJoinLiveStreamData) && Intrinsics.EZpvd((Object) this.channelId, (Object) ((WSJoinLiveStreamData) obj).channelId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.channelId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSJoinLiveStreamData(channelId=" + this.channelId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSJoinLiveStreamData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSJoinLiveStreamData> serializer() {
            return WSJoinLiveStreamData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSJoinLiveStreamData(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WSJoinLiveStreamData$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
    }

    public WSJoinLiveStreamData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelId = str;
    }
}
