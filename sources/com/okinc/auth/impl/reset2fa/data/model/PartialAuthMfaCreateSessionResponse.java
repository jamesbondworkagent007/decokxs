package com.okinc.auth.impl.reset2fa.data.model;

import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class PartialAuthMfaCreateSessionResponse implements java.io.Serializable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PartialAuthMfaCreateSessionResponse copy$default(PartialAuthMfaCreateSessionResponse partialAuthMfaCreateSessionResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partialAuthMfaCreateSessionResponse.sessionId;
        }
        return partialAuthMfaCreateSessionResponse.copy(str);
    }

    @SerialName(OtcExtraKeys.SESSIONID)
    public static /* synthetic */ void getSessionId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PartialAuthMfaCreateSessionResponse copy(String str) {
        return new PartialAuthMfaCreateSessionResponse(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PartialAuthMfaCreateSessionResponse) && Intrinsics.EZpvd((Object) this.sessionId, (Object) ((PartialAuthMfaCreateSessionResponse) obj).sessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.sessionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PartialAuthMfaCreateSessionResponse(sessionId=" + this.sessionId + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.reset2fa.data.model.PartialAuthMfaCreateSessionResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PartialAuthMfaCreateSessionResponse> serializer() {
            return PartialAuthMfaCreateSessionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PartialAuthMfaCreateSessionResponse(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PartialAuthMfaCreateSessionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
    }

    public PartialAuthMfaCreateSessionResponse(String str) {
        this.sessionId = str;
    }
}
