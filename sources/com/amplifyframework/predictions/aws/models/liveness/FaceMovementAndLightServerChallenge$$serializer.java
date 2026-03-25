package com.amplifyframework.predictions.aws.models.liveness;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FaceMovementAndLightServerChallenge$$serializer implements GeneratedSerializer<FaceMovementAndLightServerChallenge> {
    public static final FaceMovementAndLightServerChallenge$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FaceMovementAndLightServerChallenge$$serializer faceMovementAndLightServerChallenge$$serializer = new FaceMovementAndLightServerChallenge$$serializer();
        INSTANCE = faceMovementAndLightServerChallenge$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplifyframework.predictions.aws.models.liveness.FaceMovementAndLightServerChallenge", faceMovementAndLightServerChallenge$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("OvalParameters", false);
        pluginGeneratedSerialDescriptor.addElement("LightChallengeType", false);
        pluginGeneratedSerialDescriptor.addElement("ChallengeConfig", false);
        pluginGeneratedSerialDescriptor.addElement("ColorSequences", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FaceMovementAndLightServerChallenge$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = FaceMovementAndLightServerChallenge.$childSerializers;
        return new KSerializer[]{OvalParameters$$serializer.INSTANCE, kSerializerArr[1], ChallengeConfig$$serializer.INSTANCE, kSerializerArr[3]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public FaceMovementAndLightServerChallenge deserialize(@NotNull Decoder decoder) {
        int i;
        ChallengeConfig challengeConfig;
        List list;
        LightChallengeType lightChallengeType;
        OvalParameters ovalParameters;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = FaceMovementAndLightServerChallenge.$childSerializers;
        ChallengeConfig challengeConfig2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            OvalParameters ovalParameters2 = (OvalParameters) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, OvalParameters$$serializer.INSTANCE, null);
            LightChallengeType lightChallengeType2 = (LightChallengeType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            ChallengeConfig challengeConfig3 = (ChallengeConfig) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, ChallengeConfig$$serializer.INSTANCE, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            ovalParameters = ovalParameters2;
            challengeConfig = challengeConfig3;
            lightChallengeType = lightChallengeType2;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            List list2 = null;
            LightChallengeType lightChallengeType3 = null;
            OvalParameters ovalParameters3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    ovalParameters3 = (OvalParameters) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, OvalParameters$$serializer.INSTANCE, ovalParameters3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    lightChallengeType3 = (LightChallengeType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], lightChallengeType3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    challengeConfig2 = (ChallengeConfig) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, ChallengeConfig$$serializer.INSTANCE, challengeConfig2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], list2);
                    i2 |= 8;
                }
            }
            i = i2;
            challengeConfig = challengeConfig2;
            list = list2;
            lightChallengeType = lightChallengeType3;
            ovalParameters = ovalParameters3;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new FaceMovementAndLightServerChallenge(i, ovalParameters, lightChallengeType, challengeConfig, list, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(faceMovementAndLightServerChallenge, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        FaceMovementAndLightServerChallenge.write$Self(faceMovementAndLightServerChallenge, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
