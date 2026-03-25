package com.okinc.auth.impl.mfa.model;

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
public final class MfaCreateFacialResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String faceVerificationSessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MfaCreateFacialResponse copy$default(MfaCreateFacialResponse mfaCreateFacialResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mfaCreateFacialResponse.faceVerificationSessionId;
        }
        return mfaCreateFacialResponse.copy(str);
    }

    @SerialName("faceVerificationSessionId")
    public static /* synthetic */ void getFaceVerificationSessionId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.faceVerificationSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MfaCreateFacialResponse copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MfaCreateFacialResponse(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MfaCreateFacialResponse) && Intrinsics.EZpvd((Object) this.faceVerificationSessionId, (Object) ((MfaCreateFacialResponse) obj).faceVerificationSessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaceVerificationSessionId() {
        return this.faceVerificationSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.faceVerificationSessionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MfaCreateFacialResponse(faceVerificationSessionId=" + this.faceVerificationSessionId + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.MfaCreateFacialResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MfaCreateFacialResponse> serializer() {
            return MfaCreateFacialResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MfaCreateFacialResponse(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, MfaCreateFacialResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.faceVerificationSessionId = str;
    }

    public MfaCreateFacialResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.faceVerificationSessionId = str;
    }
}
