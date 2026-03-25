package com.amplifyframework.predictions.aws.models.liveness;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class InitialFace {
    public static final Companion Companion = new Companion(null);
    private final BoundingBox boundingBox;
    private final long initialFaceDetectedTimestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InitialFace copy$default(InitialFace initialFace, BoundingBox boundingBox, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            boundingBox = initialFace.boundingBox;
        }
        if ((i & 2) != 0) {
            j = initialFace.initialFaceDetectedTimestamp;
        }
        return initialFace.copy(boundingBox, j);
    }

    @SerialName("BoundingBox")
    public static /* synthetic */ void getBoundingBox$annotations() {
    }

    @SerialName("InitialFaceDetectedTimestamp")
    public static /* synthetic */ void getInitialFaceDetectedTimestamp$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoundingBox component1() {
        return this.boundingBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.initialFaceDetectedTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InitialFace copy(@NotNull BoundingBox boundingBox, long j) {
        Intrinsics.checkNotNullParameter(boundingBox, "");
        return new InitialFace(boundingBox, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitialFace)) {
            return false;
        }
        InitialFace initialFace = (InitialFace) obj;
        return Intrinsics.EZpvd(this.boundingBox, initialFace.boundingBox) && this.initialFaceDetectedTimestamp == initialFace.initialFaceDetectedTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInitialFaceDetectedTimestamp() {
        return this.initialFaceDetectedTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.boundingBox.hashCode() * 31) + Long.hashCode(this.initialFaceDetectedTimestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InitialFace(boundingBox=" + this.boundingBox + ", initialFaceDetectedTimestamp=" + this.initialFaceDetectedTimestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.InitialFace.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InitialFace> serializer() {
            return InitialFace$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InitialFace(int i, @SerialName("BoundingBox") BoundingBox boundingBox, @SerialName("InitialFaceDetectedTimestamp") long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, InitialFace$$serializer.INSTANCE.getDescriptor());
        }
        this.boundingBox = boundingBox;
        this.initialFaceDetectedTimestamp = j;
    }

    public InitialFace(@NotNull BoundingBox boundingBox, long j) {
        Intrinsics.checkNotNullParameter(boundingBox, "");
        this.boundingBox = boundingBox;
        this.initialFaceDetectedTimestamp = j;
    }

    public static final /* synthetic */ void write$Self(InitialFace initialFace, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, BoundingBox$$serializer.INSTANCE, initialFace.boundingBox);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, initialFace.initialFaceDetectedTimestamp);
    }
}
