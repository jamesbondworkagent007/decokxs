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
public final class ClientChallenge {
    public static final Companion Companion = new Companion(null);
    private final FaceMovementAndLightClientChallenge faceMovementAndLightChallenge;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ClientChallenge copy$default(ClientChallenge clientChallenge, FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge, int i, Object obj) {
        if ((i & 1) != 0) {
            faceMovementAndLightClientChallenge = clientChallenge.faceMovementAndLightChallenge;
        }
        return clientChallenge.copy(faceMovementAndLightClientChallenge);
    }

    @SerialName("FaceMovementAndLightChallenge")
    public static /* synthetic */ void getFaceMovementAndLightChallenge$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceMovementAndLightClientChallenge component1() {
        return this.faceMovementAndLightChallenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClientChallenge copy(@NotNull FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge) {
        Intrinsics.checkNotNullParameter(faceMovementAndLightClientChallenge, "");
        return new ClientChallenge(faceMovementAndLightClientChallenge);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientChallenge) && Intrinsics.EZpvd(this.faceMovementAndLightChallenge, ((ClientChallenge) obj).faceMovementAndLightChallenge);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceMovementAndLightClientChallenge getFaceMovementAndLightChallenge() {
        return this.faceMovementAndLightChallenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.faceMovementAndLightChallenge.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ClientChallenge(faceMovementAndLightChallenge=" + this.faceMovementAndLightChallenge + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.ClientChallenge.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientChallenge> serializer() {
            return ClientChallenge$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ClientChallenge(int i, @SerialName("FaceMovementAndLightChallenge") FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ClientChallenge$$serializer.INSTANCE.getDescriptor());
        }
        this.faceMovementAndLightChallenge = faceMovementAndLightClientChallenge;
    }

    public ClientChallenge(@NotNull FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge) {
        Intrinsics.checkNotNullParameter(faceMovementAndLightClientChallenge, "");
        this.faceMovementAndLightChallenge = faceMovementAndLightClientChallenge;
    }
}
