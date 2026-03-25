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
public final class ServerSessionInformationEvent {
    public static final Companion Companion = new Companion(null);
    private final SessionInformation sessionInformation;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ServerSessionInformationEvent copy$default(ServerSessionInformationEvent serverSessionInformationEvent, SessionInformation sessionInformation, int i, Object obj) {
        if ((i & 1) != 0) {
            sessionInformation = serverSessionInformationEvent.sessionInformation;
        }
        return serverSessionInformationEvent.copy(sessionInformation);
    }

    @SerialName("SessionInformation")
    public static /* synthetic */ void getSessionInformation$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SessionInformation component1() {
        return this.sessionInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServerSessionInformationEvent copy(@NotNull SessionInformation sessionInformation) {
        Intrinsics.checkNotNullParameter(sessionInformation, "");
        return new ServerSessionInformationEvent(sessionInformation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServerSessionInformationEvent) && Intrinsics.EZpvd(this.sessionInformation, ((ServerSessionInformationEvent) obj).sessionInformation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SessionInformation getSessionInformation() {
        return this.sessionInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.sessionInformation.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ServerSessionInformationEvent(sessionInformation=" + this.sessionInformation + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.ServerSessionInformationEvent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ServerSessionInformationEvent> serializer() {
            return ServerSessionInformationEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ServerSessionInformationEvent(int i, @SerialName("SessionInformation") SessionInformation sessionInformation, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ServerSessionInformationEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionInformation = sessionInformation;
    }

    public ServerSessionInformationEvent(@NotNull SessionInformation sessionInformation) {
        Intrinsics.checkNotNullParameter(sessionInformation, "");
        this.sessionInformation = sessionInformation;
    }
}
