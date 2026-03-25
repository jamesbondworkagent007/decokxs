package com.okinc.business.web3pay.lib.features.account.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CreateSessionResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreateSessionResponse copy$default(CreateSessionResponse createSessionResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createSessionResponse.sessionId;
        }
        return createSessionResponse.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateSessionResponse copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CreateSessionResponse(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateSessionResponse) && Intrinsics.EZpvd((Object) this.sessionId, (Object) ((CreateSessionResponse) obj).sessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.sessionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateSessionResponse(sessionId=" + this.sessionId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.account.data.model.CreateSessionResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateSessionResponse> serializer() {
            return CreateSessionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateSessionResponse(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CreateSessionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
    }

    public CreateSessionResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sessionId = str;
    }
}
