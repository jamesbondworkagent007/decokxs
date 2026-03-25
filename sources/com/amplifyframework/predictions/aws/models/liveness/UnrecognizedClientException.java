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
public final class UnrecognizedClientException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UnrecognizedClientException copy$default(UnrecognizedClientException unrecognizedClientException, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unrecognizedClientException.message;
        }
        return unrecognizedClientException.copy(str);
    }

    @SerialName("Message")
    public static /* synthetic */ void getMessage$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnrecognizedClientException copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UnrecognizedClientException(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnrecognizedClientException) && Intrinsics.EZpvd((Object) this.message, (Object) ((UnrecognizedClientException) obj).message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.message.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String toString() {
        return "UnrecognizedClientException(message=" + this.message + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.UnrecognizedClientException.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UnrecognizedClientException> serializer() {
            return UnrecognizedClientException$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnrecognizedClientException(int i, @SerialName("Message") String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, UnrecognizedClientException$$serializer.INSTANCE.getDescriptor());
        }
        this.message = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnrecognizedClientException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }
}
