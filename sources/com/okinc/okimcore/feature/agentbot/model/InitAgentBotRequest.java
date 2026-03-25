package com.okinc.okimcore.feature.agentbot.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InitAgentBotRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String entryInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InitAgentBotRequest copy$default(InitAgentBotRequest initAgentBotRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initAgentBotRequest.entryInfo;
        }
        return initAgentBotRequest.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.entryInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InitAgentBotRequest copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InitAgentBotRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InitAgentBotRequest) && Intrinsics.EZpvd((Object) this.entryInfo, (Object) ((InitAgentBotRequest) obj).entryInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntryInfo() {
        return this.entryInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.entryInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InitAgentBotRequest(entryInfo=" + this.entryInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.feature.agentbot.model.InitAgentBotRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InitAgentBotRequest> serializer() {
            return InitAgentBotRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InitAgentBotRequest(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InitAgentBotRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.entryInfo = str;
    }

    public InitAgentBotRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.entryInfo = str;
    }
}
