package com.okinc.okimcore.model.remote.groupvoicecall;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class JoinGroupVoiceCallRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String groupId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ JoinGroupVoiceCallRequest copy$default(JoinGroupVoiceCallRequest joinGroupVoiceCallRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = joinGroupVoiceCallRequest.groupId;
        }
        return joinGroupVoiceCallRequest.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JoinGroupVoiceCallRequest copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new JoinGroupVoiceCallRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JoinGroupVoiceCallRequest) && Intrinsics.EZpvd((Object) this.groupId, (Object) ((JoinGroupVoiceCallRequest) obj).groupId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.groupId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JoinGroupVoiceCallRequest(groupId=" + this.groupId + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.groupvoicecall.JoinGroupVoiceCallRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JoinGroupVoiceCallRequest> serializer() {
            return JoinGroupVoiceCallRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JoinGroupVoiceCallRequest(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, JoinGroupVoiceCallRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = str;
    }

    public JoinGroupVoiceCallRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupId = str;
    }
}
