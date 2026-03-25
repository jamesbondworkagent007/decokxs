package com.amplifyframework.predictions.aws.models.liveness;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FaceMovementAndLightClientChallenge$$serializer implements GeneratedSerializer<FaceMovementAndLightClientChallenge> {
    public static final FaceMovementAndLightClientChallenge$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FaceMovementAndLightClientChallenge$$serializer faceMovementAndLightClientChallenge$$serializer = new FaceMovementAndLightClientChallenge$$serializer();
        INSTANCE = faceMovementAndLightClientChallenge$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplifyframework.predictions.aws.models.liveness.FaceMovementAndLightClientChallenge", faceMovementAndLightClientChallenge$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("ChallengeId", false);
        pluginGeneratedSerialDescriptor.addElement("VideoStartTimestamp", true);
        pluginGeneratedSerialDescriptor.addElement("VideoEndTimestamp", true);
        pluginGeneratedSerialDescriptor.addElement("InitialFace", true);
        pluginGeneratedSerialDescriptor.addElement("TargetFace", true);
        pluginGeneratedSerialDescriptor.addElement("ColorDisplayed", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FaceMovementAndLightClientChallenge$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(InitialFace$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TargetFace$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ColorDisplayed$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public FaceMovementAndLightClientChallenge deserialize(@NotNull Decoder decoder) {
        ColorDisplayed colorDisplayed;
        InitialFace initialFace;
        int i;
        TargetFace targetFace;
        String str;
        Long l;
        Long l2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        InitialFace initialFace2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, longSerializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, longSerializer, null);
            InitialFace initialFace3 = (InitialFace) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, InitialFace$$serializer.INSTANCE, null);
            TargetFace targetFace2 = (TargetFace) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, TargetFace$$serializer.INSTANCE, null);
            str = strDecodeStringElement;
            colorDisplayed = (ColorDisplayed) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ColorDisplayed$$serializer.INSTANCE, null);
            initialFace = initialFace3;
            targetFace = targetFace2;
            l = l4;
            i = 63;
            l2 = l3;
        } else {
            int i2 = 0;
            boolean z = true;
            TargetFace targetFace3 = null;
            Long l5 = null;
            String strDecodeStringElement2 = null;
            ColorDisplayed colorDisplayed2 = null;
            Long l6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        i2 |= 2;
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, LongSerializer.INSTANCE, l6);
                        break;
                    case 2:
                        i2 |= 4;
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, LongSerializer.INSTANCE, l5);
                        break;
                    case 3:
                        i2 |= 8;
                        initialFace2 = (InitialFace) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, InitialFace$$serializer.INSTANCE, initialFace2);
                        break;
                    case 4:
                        i2 |= 16;
                        targetFace3 = (TargetFace) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, TargetFace$$serializer.INSTANCE, targetFace3);
                        break;
                    case 5:
                        i2 |= 32;
                        colorDisplayed2 = (ColorDisplayed) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ColorDisplayed$$serializer.INSTANCE, colorDisplayed2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            colorDisplayed = colorDisplayed2;
            initialFace = initialFace2;
            i = i2;
            Long l7 = l6;
            targetFace = targetFace3;
            str = strDecodeStringElement2;
            l = l5;
            l2 = l7;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new FaceMovementAndLightClientChallenge(i, str, l2, l, initialFace, targetFace, colorDisplayed, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(faceMovementAndLightClientChallenge, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        FaceMovementAndLightClientChallenge.write$Self(faceMovementAndLightClientChallenge, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
