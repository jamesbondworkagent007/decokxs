package com.okinc.auth.impl.mfa.model;

import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class MfaRetrieveFacialRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MfaRetrieveFacialRequest copy$default(MfaRetrieveFacialRequest mfaRetrieveFacialRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mfaRetrieveFacialRequest.sessionId;
        }
        return mfaRetrieveFacialRequest.copy(str);
    }

    @SerialName(OtcExtraKeys.SESSIONID)
    public static /* synthetic */ void getSessionId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MfaRetrieveFacialRequest copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MfaRetrieveFacialRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MfaRetrieveFacialRequest) && Intrinsics.EZpvd((Object) this.sessionId, (Object) ((MfaRetrieveFacialRequest) obj).sessionId);
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
        return "MfaRetrieveFacialRequest(sessionId=" + this.sessionId + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.MfaRetrieveFacialRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MfaRetrieveFacialRequest> serializer() {
            return MfaRetrieveFacialRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MfaRetrieveFacialRequest(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, MfaRetrieveFacialRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
    }

    public MfaRetrieveFacialRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sessionId = str;
    }
}
