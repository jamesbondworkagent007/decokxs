package com.amplifyframework.predictions.aws.models.liveness;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class FaceMovementAndLightServerChallenge {
    private final ChallengeConfig challengeConfig;
    private final List<ColorSequence> colorSequences;
    private final LightChallengeType lightChallengeType;
    private final OvalParameters ovalParameters;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, EnumsKt.createSimpleEnumSerializer("com.amplifyframework.predictions.aws.models.liveness.LightChallengeType", LightChallengeType.values()), null, new ArrayListSerializer(ColorSequence$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.predictions.aws.models.liveness.FaceMovementAndLightServerChallenge */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceMovementAndLightServerChallenge copy$default(FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge, OvalParameters ovalParameters, LightChallengeType lightChallengeType, ChallengeConfig challengeConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            ovalParameters = faceMovementAndLightServerChallenge.ovalParameters;
        }
        if ((i & 2) != 0) {
            lightChallengeType = faceMovementAndLightServerChallenge.lightChallengeType;
        }
        if ((i & 4) != 0) {
            challengeConfig = faceMovementAndLightServerChallenge.challengeConfig;
        }
        if ((i & 8) != 0) {
            list = faceMovementAndLightServerChallenge.colorSequences;
        }
        return faceMovementAndLightServerChallenge.copy(ovalParameters, lightChallengeType, challengeConfig, list);
    }

    @SerialName("ChallengeConfig")
    public static /* synthetic */ void getChallengeConfig$annotations() {
    }

    @SerialName("ColorSequences")
    public static /* synthetic */ void getColorSequences$annotations() {
    }

    @SerialName("LightChallengeType")
    public static /* synthetic */ void getLightChallengeType$annotations() {
    }

    @SerialName("OvalParameters")
    public static /* synthetic */ void getOvalParameters$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OvalParameters component1() {
        return this.ovalParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LightChallengeType component2() {
        return this.lightChallengeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChallengeConfig component3() {
        return this.challengeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ColorSequence> component4() {
        return this.colorSequences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceMovementAndLightServerChallenge copy(@NotNull OvalParameters ovalParameters, @NotNull LightChallengeType lightChallengeType, @NotNull ChallengeConfig challengeConfig, @NotNull List<ColorSequence> list) {
        Intrinsics.checkNotNullParameter(ovalParameters, "");
        Intrinsics.checkNotNullParameter(lightChallengeType, "");
        Intrinsics.checkNotNullParameter(challengeConfig, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new FaceMovementAndLightServerChallenge(ovalParameters, lightChallengeType, challengeConfig, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceMovementAndLightServerChallenge)) {
            return false;
        }
        FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge = (FaceMovementAndLightServerChallenge) obj;
        return Intrinsics.EZpvd(this.ovalParameters, faceMovementAndLightServerChallenge.ovalParameters) && this.lightChallengeType == faceMovementAndLightServerChallenge.lightChallengeType && Intrinsics.EZpvd(this.challengeConfig, faceMovementAndLightServerChallenge.challengeConfig) && Intrinsics.EZpvd(this.colorSequences, faceMovementAndLightServerChallenge.colorSequences);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChallengeConfig getChallengeConfig() {
        return this.challengeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ColorSequence> getColorSequences() {
        return this.colorSequences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LightChallengeType getLightChallengeType() {
        return this.lightChallengeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OvalParameters getOvalParameters() {
        return this.ovalParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.ovalParameters.hashCode() * 31) + this.lightChallengeType.hashCode()) * 31) + this.challengeConfig.hashCode()) * 31) + this.colorSequences.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FaceMovementAndLightServerChallenge(ovalParameters=" + this.ovalParameters + ", lightChallengeType=" + this.lightChallengeType + ", challengeConfig=" + this.challengeConfig + ", colorSequences=" + this.colorSequences + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.FaceMovementAndLightServerChallenge.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FaceMovementAndLightServerChallenge> serializer() {
            return FaceMovementAndLightServerChallenge$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FaceMovementAndLightServerChallenge(int i, @SerialName("OvalParameters") OvalParameters ovalParameters, @SerialName("LightChallengeType") LightChallengeType lightChallengeType, @SerialName("ChallengeConfig") ChallengeConfig challengeConfig, @SerialName("ColorSequences") List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, FaceMovementAndLightServerChallenge$$serializer.INSTANCE.getDescriptor());
        }
        this.ovalParameters = ovalParameters;
        this.lightChallengeType = lightChallengeType;
        this.challengeConfig = challengeConfig;
        this.colorSequences = list;
    }

    public FaceMovementAndLightServerChallenge(@NotNull OvalParameters ovalParameters, @NotNull LightChallengeType lightChallengeType, @NotNull ChallengeConfig challengeConfig, @NotNull List<ColorSequence> list) {
        Intrinsics.checkNotNullParameter(ovalParameters, "");
        Intrinsics.checkNotNullParameter(lightChallengeType, "");
        Intrinsics.checkNotNullParameter(challengeConfig, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.ovalParameters = ovalParameters;
        this.lightChallengeType = lightChallengeType;
        this.challengeConfig = challengeConfig;
        this.colorSequences = list;
    }

    public static final /* synthetic */ void write$Self(FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, OvalParameters$$serializer.INSTANCE, faceMovementAndLightServerChallenge.ovalParameters);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], faceMovementAndLightServerChallenge.lightChallengeType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, ChallengeConfig$$serializer.INSTANCE, faceMovementAndLightServerChallenge.challengeConfig);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], faceMovementAndLightServerChallenge.colorSequences);
    }
}
