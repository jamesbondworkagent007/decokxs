package com.amplifyframework.predictions.aws.models.liveness;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class DisconnectionEvent {
    public static final Companion Companion = new Companion(null);
    private final long timestampMillis;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DisconnectionEvent copy$default(DisconnectionEvent disconnectionEvent, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = disconnectionEvent.timestampMillis;
        }
        return disconnectionEvent.copy(j);
    }

    @SerialName("TimestampMillis")
    public static /* synthetic */ void getTimestampMillis$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.timestampMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisconnectionEvent copy(long j) {
        return new DisconnectionEvent(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisconnectionEvent) && this.timestampMillis == ((DisconnectionEvent) obj).timestampMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Long.hashCode(this.timestampMillis);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DisconnectionEvent(timestampMillis=" + this.timestampMillis + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.DisconnectionEvent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DisconnectionEvent> serializer() {
            return DisconnectionEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DisconnectionEvent(int i, @SerialName("TimestampMillis") long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, DisconnectionEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.timestampMillis = j;
    }

    public DisconnectionEvent(long j) {
        this.timestampMillis = j;
    }
}
