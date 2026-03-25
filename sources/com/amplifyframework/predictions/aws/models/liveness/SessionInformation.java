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
public final class SessionInformation {
    public static final Companion Companion = new Companion(null);
    private final ServerChallenge challenge;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SessionInformation copy$default(SessionInformation sessionInformation, ServerChallenge serverChallenge, int i, Object obj) {
        if ((i & 1) != 0) {
            serverChallenge = sessionInformation.challenge;
        }
        return sessionInformation.copy(serverChallenge);
    }

    @SerialName("Challenge")
    public static /* synthetic */ void getChallenge$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServerChallenge component1() {
        return this.challenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SessionInformation copy(@NotNull ServerChallenge serverChallenge) {
        Intrinsics.checkNotNullParameter(serverChallenge, "");
        return new SessionInformation(serverChallenge);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SessionInformation) && Intrinsics.EZpvd(this.challenge, ((SessionInformation) obj).challenge);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServerChallenge getChallenge() {
        return this.challenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.challenge.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SessionInformation(challenge=" + this.challenge + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.SessionInformation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SessionInformation> serializer() {
            return SessionInformation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SessionInformation(int i, @SerialName("Challenge") ServerChallenge serverChallenge, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SessionInformation$$serializer.INSTANCE.getDescriptor());
        }
        this.challenge = serverChallenge;
    }

    public SessionInformation(@NotNull ServerChallenge serverChallenge) {
        Intrinsics.checkNotNullParameter(serverChallenge, "");
        this.challenge = serverChallenge;
    }
}
