package com.amplifyframework.predictions.aws.models.liveness;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ChallengeConfig {
    public static final Companion Companion = new Companion(null);
    private final float blazeFaceDetectionThreshold;
    private final float faceDistanceThreshold;
    private final float faceDistanceThresholdMax;
    private final float faceDistanceThresholdMin;
    private final float faceIouHeightThreshold;
    private final float faceIouWidthThreshold;
    private final int ovalFitTimeout;
    private final float ovalHeightWidthRatio;
    private final float ovalIouHeightThreshold;
    private final float ovalIouThreshold;
    private final float ovalIouWidthThreshold;

    @SerialName("BlazeFaceDetectionThreshold")
    public static /* synthetic */ void getBlazeFaceDetectionThreshold$annotations() {
    }

    @SerialName("FaceDistanceThreshold")
    public static /* synthetic */ void getFaceDistanceThreshold$annotations() {
    }

    @SerialName("FaceDistanceThresholdMax")
    public static /* synthetic */ void getFaceDistanceThresholdMax$annotations() {
    }

    @SerialName("FaceDistanceThresholdMin")
    public static /* synthetic */ void getFaceDistanceThresholdMin$annotations() {
    }

    @SerialName("FaceIouHeightThreshold")
    public static /* synthetic */ void getFaceIouHeightThreshold$annotations() {
    }

    @SerialName("FaceIouWidthThreshold")
    public static /* synthetic */ void getFaceIouWidthThreshold$annotations() {
    }

    @SerialName("OvalFitTimeout")
    public static /* synthetic */ void getOvalFitTimeout$annotations() {
    }

    @SerialName("OvalHeightWidthRatio")
    public static /* synthetic */ void getOvalHeightWidthRatio$annotations() {
    }

    @SerialName("OvalIouHeightThreshold")
    public static /* synthetic */ void getOvalIouHeightThreshold$annotations() {
    }

    @SerialName("OvalIouThreshold")
    public static /* synthetic */ void getOvalIouThreshold$annotations() {
    }

    @SerialName("OvalIouWidthThreshold")
    public static /* synthetic */ void getOvalIouWidthThreshold$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component1() {
        return this.blazeFaceDetectionThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component10() {
        return this.faceIouHeightThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.ovalFitTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component2() {
        return this.faceDistanceThresholdMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component3() {
        return this.faceDistanceThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component4() {
        return this.faceDistanceThresholdMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component5() {
        return this.ovalIouThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component6() {
        return this.ovalHeightWidthRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component7() {
        return this.ovalIouWidthThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component8() {
        return this.ovalIouHeightThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component9() {
        return this.faceIouWidthThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChallengeConfig copy(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i) {
        return new ChallengeConfig(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeConfig)) {
            return false;
        }
        ChallengeConfig challengeConfig = (ChallengeConfig) obj;
        return Float.compare(this.blazeFaceDetectionThreshold, challengeConfig.blazeFaceDetectionThreshold) == 0 && Float.compare(this.faceDistanceThresholdMin, challengeConfig.faceDistanceThresholdMin) == 0 && Float.compare(this.faceDistanceThreshold, challengeConfig.faceDistanceThreshold) == 0 && Float.compare(this.faceDistanceThresholdMax, challengeConfig.faceDistanceThresholdMax) == 0 && Float.compare(this.ovalIouThreshold, challengeConfig.ovalIouThreshold) == 0 && Float.compare(this.ovalHeightWidthRatio, challengeConfig.ovalHeightWidthRatio) == 0 && Float.compare(this.ovalIouWidthThreshold, challengeConfig.ovalIouWidthThreshold) == 0 && Float.compare(this.ovalIouHeightThreshold, challengeConfig.ovalIouHeightThreshold) == 0 && Float.compare(this.faceIouWidthThreshold, challengeConfig.faceIouWidthThreshold) == 0 && Float.compare(this.faceIouHeightThreshold, challengeConfig.faceIouHeightThreshold) == 0 && this.ovalFitTimeout == challengeConfig.ovalFitTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getBlazeFaceDetectionThreshold() {
        return this.blazeFaceDetectionThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getFaceDistanceThreshold() {
        return this.faceDistanceThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getFaceDistanceThresholdMax() {
        return this.faceDistanceThresholdMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getFaceDistanceThresholdMin() {
        return this.faceDistanceThresholdMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getFaceIouHeightThreshold() {
        return this.faceIouHeightThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getFaceIouWidthThreshold() {
        return this.faceIouWidthThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOvalFitTimeout() {
        return this.ovalFitTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getOvalHeightWidthRatio() {
        return this.ovalHeightWidthRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getOvalIouHeightThreshold() {
        return this.ovalIouHeightThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getOvalIouThreshold() {
        return this.ovalIouThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getOvalIouWidthThreshold() {
        return this.ovalIouWidthThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((Float.hashCode(this.blazeFaceDetectionThreshold) * 31) + Float.hashCode(this.faceDistanceThresholdMin)) * 31) + Float.hashCode(this.faceDistanceThreshold)) * 31) + Float.hashCode(this.faceDistanceThresholdMax)) * 31) + Float.hashCode(this.ovalIouThreshold)) * 31) + Float.hashCode(this.ovalHeightWidthRatio)) * 31) + Float.hashCode(this.ovalIouWidthThreshold)) * 31) + Float.hashCode(this.ovalIouHeightThreshold)) * 31) + Float.hashCode(this.faceIouWidthThreshold)) * 31) + Float.hashCode(this.faceIouHeightThreshold)) * 31) + Integer.hashCode(this.ovalFitTimeout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChallengeConfig(blazeFaceDetectionThreshold=" + this.blazeFaceDetectionThreshold + ", faceDistanceThresholdMin=" + this.faceDistanceThresholdMin + ", faceDistanceThreshold=" + this.faceDistanceThreshold + ", faceDistanceThresholdMax=" + this.faceDistanceThresholdMax + ", ovalIouThreshold=" + this.ovalIouThreshold + ", ovalHeightWidthRatio=" + this.ovalHeightWidthRatio + ", ovalIouWidthThreshold=" + this.ovalIouWidthThreshold + ", ovalIouHeightThreshold=" + this.ovalIouHeightThreshold + ", faceIouWidthThreshold=" + this.faceIouWidthThreshold + ", faceIouHeightThreshold=" + this.faceIouHeightThreshold + ", ovalFitTimeout=" + this.ovalFitTimeout + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.ChallengeConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ChallengeConfig> serializer() {
            return ChallengeConfig$$serializer.INSTANCE;
        }
    }

    public ChallengeConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i) {
        this.blazeFaceDetectionThreshold = f;
        this.faceDistanceThresholdMin = f2;
        this.faceDistanceThreshold = f3;
        this.faceDistanceThresholdMax = f4;
        this.ovalIouThreshold = f5;
        this.ovalHeightWidthRatio = f6;
        this.ovalIouWidthThreshold = f7;
        this.ovalIouHeightThreshold = f8;
        this.faceIouWidthThreshold = f9;
        this.faceIouHeightThreshold = f10;
        this.ovalFitTimeout = i;
    }

    public /* synthetic */ ChallengeConfig(int i, @SerialName("BlazeFaceDetectionThreshold") float f, @SerialName("FaceDistanceThresholdMin") float f2, @SerialName("FaceDistanceThreshold") float f3, @SerialName("FaceDistanceThresholdMax") float f4, @SerialName("OvalIouThreshold") float f5, @SerialName("OvalHeightWidthRatio") float f6, @SerialName("OvalIouWidthThreshold") float f7, @SerialName("OvalIouHeightThreshold") float f8, @SerialName("FaceIouWidthThreshold") float f9, @SerialName("FaceIouHeightThreshold") float f10, @SerialName("OvalFitTimeout") int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2047, ChallengeConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.blazeFaceDetectionThreshold = f;
        this.faceDistanceThresholdMin = f2;
        this.faceDistanceThreshold = f3;
        this.faceDistanceThresholdMax = f4;
        this.ovalIouThreshold = f5;
        this.ovalHeightWidthRatio = f6;
        this.ovalIouWidthThreshold = f7;
        this.ovalIouHeightThreshold = f8;
        this.faceIouWidthThreshold = f9;
        this.faceIouHeightThreshold = f10;
        this.ovalFitTimeout = i2;
    }

    public static final /* synthetic */ void write$Self(ChallengeConfig challengeConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeFloatElement(serialDescriptor, 0, challengeConfig.blazeFaceDetectionThreshold);
        compositeEncoder.encodeFloatElement(serialDescriptor, 1, challengeConfig.faceDistanceThresholdMin);
        compositeEncoder.encodeFloatElement(serialDescriptor, 2, challengeConfig.faceDistanceThreshold);
        compositeEncoder.encodeFloatElement(serialDescriptor, 3, challengeConfig.faceDistanceThresholdMax);
        compositeEncoder.encodeFloatElement(serialDescriptor, 4, challengeConfig.ovalIouThreshold);
        compositeEncoder.encodeFloatElement(serialDescriptor, 5, challengeConfig.ovalHeightWidthRatio);
        compositeEncoder.encodeFloatElement(serialDescriptor, 6, challengeConfig.ovalIouWidthThreshold);
        compositeEncoder.encodeFloatElement(serialDescriptor, 7, challengeConfig.ovalIouHeightThreshold);
        compositeEncoder.encodeFloatElement(serialDescriptor, 8, challengeConfig.faceIouWidthThreshold);
        compositeEncoder.encodeFloatElement(serialDescriptor, 9, challengeConfig.faceIouHeightThreshold);
        compositeEncoder.encodeIntElement(serialDescriptor, 10, challengeConfig.ovalFitTimeout);
    }
}
