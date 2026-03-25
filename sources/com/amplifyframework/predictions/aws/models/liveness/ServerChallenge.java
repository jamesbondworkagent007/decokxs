package com.amplifyframework.predictions.aws.models.liveness;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ServerChallenge {
    public static final Companion Companion = new Companion(null);
    private final FaceMovementAndLightServerChallenge faceMovementAndLightChallenge;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ServerChallenge copy$default(ServerChallenge serverChallenge, FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge, int i, Object obj) {
        if ((i & 1) != 0) {
            faceMovementAndLightServerChallenge = serverChallenge.faceMovementAndLightChallenge;
        }
        return serverChallenge.copy(faceMovementAndLightServerChallenge);
    }

    @SerialName("FaceMovementAndLightChallenge")
    public static /* synthetic */ void getFaceMovementAndLightChallenge$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceMovementAndLightServerChallenge component1() {
        return this.faceMovementAndLightChallenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServerChallenge copy(@NotNull FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge) {
        Intrinsics.checkNotNullParameter(faceMovementAndLightServerChallenge, "");
        return new ServerChallenge(faceMovementAndLightServerChallenge);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServerChallenge) && Intrinsics.EZpvd(this.faceMovementAndLightChallenge, ((ServerChallenge) obj).faceMovementAndLightChallenge);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceMovementAndLightServerChallenge getFaceMovementAndLightChallenge() {
        return this.faceMovementAndLightChallenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.faceMovementAndLightChallenge.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ServerChallenge(faceMovementAndLightChallenge=" + this.faceMovementAndLightChallenge + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.ServerChallenge.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ServerChallenge> serializer() {
            return ServerChallenge$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ServerChallenge(int i, @SerialName("FaceMovementAndLightChallenge") FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ServerChallenge$$serializer.INSTANCE.getDescriptor());
        }
        this.faceMovementAndLightChallenge = faceMovementAndLightServerChallenge;
    }

    public ServerChallenge(@NotNull FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge) {
        Intrinsics.checkNotNullParameter(faceMovementAndLightServerChallenge, "");
        this.faceMovementAndLightChallenge = faceMovementAndLightServerChallenge;
    }
}
