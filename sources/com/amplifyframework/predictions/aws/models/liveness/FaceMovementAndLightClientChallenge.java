package com.amplifyframework.predictions.aws.models.liveness;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class FaceMovementAndLightClientChallenge {
    public static final Companion Companion = new Companion(null);
    private final String challengeId;
    private final ColorDisplayed colorDisplayed;
    private final InitialFace initialFace;
    private final TargetFace targetFace;
    private final Long videoEndTimestamp;
    private final Long videoStartTimestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FaceMovementAndLightClientChallenge copy$default(FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge, String str, Long l, Long l2, InitialFace initialFace, TargetFace targetFace, ColorDisplayed colorDisplayed, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceMovementAndLightClientChallenge.challengeId;
        }
        if ((i & 2) != 0) {
            l = faceMovementAndLightClientChallenge.videoStartTimestamp;
        }
        Long l3 = l;
        if ((i & 4) != 0) {
            l2 = faceMovementAndLightClientChallenge.videoEndTimestamp;
        }
        Long l4 = l2;
        if ((i & 8) != 0) {
            initialFace = faceMovementAndLightClientChallenge.initialFace;
        }
        InitialFace initialFace2 = initialFace;
        if ((i & 16) != 0) {
            targetFace = faceMovementAndLightClientChallenge.targetFace;
        }
        TargetFace targetFace2 = targetFace;
        if ((i & 32) != 0) {
            colorDisplayed = faceMovementAndLightClientChallenge.colorDisplayed;
        }
        return faceMovementAndLightClientChallenge.copy(str, l3, l4, initialFace2, targetFace2, colorDisplayed);
    }

    @SerialName("ChallengeId")
    public static /* synthetic */ void getChallengeId$annotations() {
    }

    @SerialName("ColorDisplayed")
    public static /* synthetic */ void getColorDisplayed$annotations() {
    }

    @SerialName("InitialFace")
    public static /* synthetic */ void getInitialFace$annotations() {
    }

    @SerialName("TargetFace")
    public static /* synthetic */ void getTargetFace$annotations() {
    }

    @SerialName("VideoEndTimestamp")
    public static /* synthetic */ void getVideoEndTimestamp$annotations() {
    }

    @SerialName("VideoStartTimestamp")
    public static /* synthetic */ void getVideoStartTimestamp$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.challengeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.videoStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.videoEndTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InitialFace component4() {
        return this.initialFace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TargetFace component5() {
        return this.targetFace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorDisplayed component6() {
        return this.colorDisplayed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceMovementAndLightClientChallenge copy(@NotNull String str, Long l, Long l2, InitialFace initialFace, TargetFace targetFace, ColorDisplayed colorDisplayed) {
        Intrinsics.checkNotNullParameter(str, "");
        return new FaceMovementAndLightClientChallenge(str, l, l2, initialFace, targetFace, colorDisplayed);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceMovementAndLightClientChallenge)) {
            return false;
        }
        FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge = (FaceMovementAndLightClientChallenge) obj;
        return Intrinsics.EZpvd((Object) this.challengeId, (Object) faceMovementAndLightClientChallenge.challengeId) && Intrinsics.EZpvd(this.videoStartTimestamp, faceMovementAndLightClientChallenge.videoStartTimestamp) && Intrinsics.EZpvd(this.videoEndTimestamp, faceMovementAndLightClientChallenge.videoEndTimestamp) && Intrinsics.EZpvd(this.initialFace, faceMovementAndLightClientChallenge.initialFace) && Intrinsics.EZpvd(this.targetFace, faceMovementAndLightClientChallenge.targetFace) && Intrinsics.EZpvd(this.colorDisplayed, faceMovementAndLightClientChallenge.colorDisplayed);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChallengeId() {
        return this.challengeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorDisplayed getColorDisplayed() {
        return this.colorDisplayed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InitialFace getInitialFace() {
        return this.initialFace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TargetFace getTargetFace() {
        return this.targetFace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getVideoEndTimestamp() {
        return this.videoEndTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getVideoStartTimestamp() {
        return this.videoStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.challengeId.hashCode();
        Long l = this.videoStartTimestamp;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.videoEndTimestamp;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        InitialFace initialFace = this.initialFace;
        int iHashCode4 = initialFace == null ? 0 : initialFace.hashCode();
        TargetFace targetFace = this.targetFace;
        int iHashCode5 = targetFace == null ? 0 : targetFace.hashCode();
        ColorDisplayed colorDisplayed = this.colorDisplayed;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (colorDisplayed != null ? colorDisplayed.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FaceMovementAndLightClientChallenge(challengeId=" + this.challengeId + ", videoStartTimestamp=" + this.videoStartTimestamp + ", videoEndTimestamp=" + this.videoEndTimestamp + ", initialFace=" + this.initialFace + ", targetFace=" + this.targetFace + ", colorDisplayed=" + this.colorDisplayed + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.FaceMovementAndLightClientChallenge.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FaceMovementAndLightClientChallenge> serializer() {
            return FaceMovementAndLightClientChallenge$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FaceMovementAndLightClientChallenge(int i, @SerialName("ChallengeId") String str, @SerialName("VideoStartTimestamp") Long l, @SerialName("VideoEndTimestamp") Long l2, @SerialName("InitialFace") InitialFace initialFace, @SerialName("TargetFace") TargetFace targetFace, @SerialName("ColorDisplayed") ColorDisplayed colorDisplayed, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, FaceMovementAndLightClientChallenge$$serializer.INSTANCE.getDescriptor());
        }
        this.challengeId = str;
        if ((i & 2) == 0) {
            this.videoStartTimestamp = null;
        } else {
            this.videoStartTimestamp = l;
        }
        if ((i & 4) == 0) {
            this.videoEndTimestamp = null;
        } else {
            this.videoEndTimestamp = l2;
        }
        if ((i & 8) == 0) {
            this.initialFace = null;
        } else {
            this.initialFace = initialFace;
        }
        if ((i & 16) == 0) {
            this.targetFace = null;
        } else {
            this.targetFace = targetFace;
        }
        if ((i & 32) == 0) {
            this.colorDisplayed = null;
        } else {
            this.colorDisplayed = colorDisplayed;
        }
    }

    public FaceMovementAndLightClientChallenge(@NotNull String str, Long l, Long l2, InitialFace initialFace, TargetFace targetFace, ColorDisplayed colorDisplayed) {
        Intrinsics.checkNotNullParameter(str, "");
        this.challengeId = str;
        this.videoStartTimestamp = l;
        this.videoEndTimestamp = l2;
        this.initialFace = initialFace;
        this.targetFace = targetFace;
        this.colorDisplayed = colorDisplayed;
    }

    public static final /* synthetic */ void write$Self(FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, faceMovementAndLightClientChallenge.challengeId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || faceMovementAndLightClientChallenge.videoStartTimestamp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, faceMovementAndLightClientChallenge.videoStartTimestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || faceMovementAndLightClientChallenge.videoEndTimestamp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, faceMovementAndLightClientChallenge.videoEndTimestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || faceMovementAndLightClientChallenge.initialFace != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, InitialFace$$serializer.INSTANCE, faceMovementAndLightClientChallenge.initialFace);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || faceMovementAndLightClientChallenge.targetFace != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, TargetFace$$serializer.INSTANCE, faceMovementAndLightClientChallenge.targetFace);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && faceMovementAndLightClientChallenge.colorDisplayed == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, ColorDisplayed$$serializer.INSTANCE, faceMovementAndLightClientChallenge.colorDisplayed);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r8v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r9v0 java.lang.Long))
  (wrap:com.amplifyframework.predictions.aws.models.liveness.InitialFace:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.predictions.aws.models.liveness.InitialFace) : (r10v0 com.amplifyframework.predictions.aws.models.liveness.InitialFace))
  (wrap:com.amplifyframework.predictions.aws.models.liveness.TargetFace:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.predictions.aws.models.liveness.TargetFace) : (r11v0 com.amplifyframework.predictions.aws.models.liveness.TargetFace))
  (wrap:com.amplifyframework.predictions.aws.models.liveness.ColorDisplayed:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 com.amplifyframework.predictions.aws.models.liveness.ColorDisplayed) : (null com.amplifyframework.predictions.aws.models.liveness.ColorDisplayed))
 A[MD:(java.lang.String, java.lang.Long, java.lang.Long, com.amplifyframework.predictions.aws.models.liveness.InitialFace, com.amplifyframework.predictions.aws.models.liveness.TargetFace, com.amplifyframework.predictions.aws.models.liveness.ColorDisplayed):void (m)] (LINE:21) call: com.amplifyframework.predictions.aws.models.liveness.FaceMovementAndLightClientChallenge.<init>(java.lang.String, java.lang.Long, java.lang.Long, com.amplifyframework.predictions.aws.models.liveness.InitialFace, com.amplifyframework.predictions.aws.models.liveness.TargetFace, com.amplifyframework.predictions.aws.models.liveness.ColorDisplayed):void type: THIS */
    public /* synthetic */ FaceMovementAndLightClientChallenge(String str, Long l, Long l2, InitialFace initialFace, TargetFace targetFace, ColorDisplayed colorDisplayed, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : initialFace, (i & 16) != 0 ? null : targetFace, (i & 32) == 0 ? colorDisplayed : null);
    }
}
