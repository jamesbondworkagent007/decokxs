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
public final class TargetFace {
    public static final Companion Companion = new Companion(null);
    private final BoundingBox boundingBox;
    private final long faceDetectedInTargetPositionEndTimestamp;
    private final long faceDetectedInTargetPositionStartTimestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TargetFace copy$default(TargetFace targetFace, BoundingBox boundingBox, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            boundingBox = targetFace.boundingBox;
        }
        if ((i & 2) != 0) {
            j = targetFace.faceDetectedInTargetPositionStartTimestamp;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = targetFace.faceDetectedInTargetPositionEndTimestamp;
        }
        return targetFace.copy(boundingBox, j3, j2);
    }

    @SerialName("BoundingBox")
    public static /* synthetic */ void getBoundingBox$annotations() {
    }

    @SerialName("FaceDetectedInTargetPositionEndTimestamp")
    public static /* synthetic */ void getFaceDetectedInTargetPositionEndTimestamp$annotations() {
    }

    @SerialName("FaceDetectedInTargetPositionStartTimestamp")
    public static /* synthetic */ void getFaceDetectedInTargetPositionStartTimestamp$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoundingBox component1() {
        return this.boundingBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.faceDetectedInTargetPositionStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.faceDetectedInTargetPositionEndTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TargetFace copy(@NotNull BoundingBox boundingBox, long j, long j2) {
        Intrinsics.checkNotNullParameter(boundingBox, "");
        return new TargetFace(boundingBox, j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetFace)) {
            return false;
        }
        TargetFace targetFace = (TargetFace) obj;
        return Intrinsics.EZpvd(this.boundingBox, targetFace.boundingBox) && this.faceDetectedInTargetPositionStartTimestamp == targetFace.faceDetectedInTargetPositionStartTimestamp && this.faceDetectedInTargetPositionEndTimestamp == targetFace.faceDetectedInTargetPositionEndTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFaceDetectedInTargetPositionEndTimestamp() {
        return this.faceDetectedInTargetPositionEndTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFaceDetectedInTargetPositionStartTimestamp() {
        return this.faceDetectedInTargetPositionStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.boundingBox.hashCode() * 31) + Long.hashCode(this.faceDetectedInTargetPositionStartTimestamp)) * 31) + Long.hashCode(this.faceDetectedInTargetPositionEndTimestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TargetFace(boundingBox=" + this.boundingBox + ", faceDetectedInTargetPositionStartTimestamp=" + this.faceDetectedInTargetPositionStartTimestamp + ", faceDetectedInTargetPositionEndTimestamp=" + this.faceDetectedInTargetPositionEndTimestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.TargetFace.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TargetFace> serializer() {
            return TargetFace$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TargetFace(int i, @SerialName("BoundingBox") BoundingBox boundingBox, @SerialName("FaceDetectedInTargetPositionStartTimestamp") long j, @SerialName("FaceDetectedInTargetPositionEndTimestamp") long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TargetFace$$serializer.INSTANCE.getDescriptor());
        }
        this.boundingBox = boundingBox;
        this.faceDetectedInTargetPositionStartTimestamp = j;
        this.faceDetectedInTargetPositionEndTimestamp = j2;
    }

    public TargetFace(@NotNull BoundingBox boundingBox, long j, long j2) {
        Intrinsics.checkNotNullParameter(boundingBox, "");
        this.boundingBox = boundingBox;
        this.faceDetectedInTargetPositionStartTimestamp = j;
        this.faceDetectedInTargetPositionEndTimestamp = j2;
    }

    public static final /* synthetic */ void write$Self(TargetFace targetFace, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, BoundingBox$$serializer.INSTANCE, targetFace.boundingBox);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, targetFace.faceDetectedInTargetPositionStartTimestamp);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, targetFace.faceDetectedInTargetPositionEndTimestamp);
    }
}
