package com.amplifyframework.predictions.aws.models.liveness;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ChallengeConfig$$serializer implements GeneratedSerializer<ChallengeConfig> {
    public static final ChallengeConfig$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ChallengeConfig$$serializer challengeConfig$$serializer = new ChallengeConfig$$serializer();
        INSTANCE = challengeConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplifyframework.predictions.aws.models.liveness.ChallengeConfig", challengeConfig$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("BlazeFaceDetectionThreshold", false);
        pluginGeneratedSerialDescriptor.addElement("FaceDistanceThresholdMin", false);
        pluginGeneratedSerialDescriptor.addElement("FaceDistanceThreshold", false);
        pluginGeneratedSerialDescriptor.addElement("FaceDistanceThresholdMax", false);
        pluginGeneratedSerialDescriptor.addElement("OvalIouThreshold", false);
        pluginGeneratedSerialDescriptor.addElement("OvalHeightWidthRatio", false);
        pluginGeneratedSerialDescriptor.addElement("OvalIouWidthThreshold", false);
        pluginGeneratedSerialDescriptor.addElement("OvalIouHeightThreshold", false);
        pluginGeneratedSerialDescriptor.addElement("FaceIouWidthThreshold", false);
        pluginGeneratedSerialDescriptor.addElement("FaceIouHeightThreshold", false);
        pluginGeneratedSerialDescriptor.addElement("OvalFitTimeout", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChallengeConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{floatSerializer, floatSerializer, floatSerializer, floatSerializer, floatSerializer, floatSerializer, floatSerializer, floatSerializer, floatSerializer, floatSerializer, IntSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public ChallengeConfig deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i2 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            float fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 0);
            float fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 1);
            float fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 2);
            float fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
            float fDecodeFloatElement5 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 4);
            float fDecodeFloatElement6 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 5);
            float fDecodeFloatElement7 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 6);
            float fDecodeFloatElement8 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 7);
            float fDecodeFloatElement9 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 8);
            float fDecodeFloatElement10 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 9);
            f2 = fDecodeFloatElement;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 10);
            f = fDecodeFloatElement10;
            f3 = fDecodeFloatElement8;
            f9 = fDecodeFloatElement7;
            f6 = fDecodeFloatElement6;
            f7 = fDecodeFloatElement4;
            f5 = fDecodeFloatElement9;
            f8 = fDecodeFloatElement5;
            f10 = fDecodeFloatElement3;
            f4 = fDecodeFloatElement2;
            i = 2047;
        } else {
            float fDecodeFloatElement11 = 0.0f;
            float fDecodeFloatElement12 = 0.0f;
            float fDecodeFloatElement13 = 0.0f;
            float fDecodeFloatElement14 = 0.0f;
            float fDecodeFloatElement15 = 0.0f;
            float fDecodeFloatElement16 = 0.0f;
            float fDecodeFloatElement17 = 0.0f;
            float fDecodeFloatElement18 = 0.0f;
            float fDecodeFloatElement19 = 0.0f;
            float fDecodeFloatElement20 = 0.0f;
            boolean z2 = true;
            int iDecodeIntElement2 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = z;
                        break;
                    case 0:
                        i2 |= 1;
                        fDecodeFloatElement11 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 0);
                        break;
                    case 1:
                        fDecodeFloatElement20 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        fDecodeFloatElement19 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 2);
                        i2 |= 4;
                        z = z2;
                        z2 = z;
                        break;
                    case 3:
                        fDecodeFloatElement16 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
                        i2 |= 8;
                        z = z2;
                        z2 = z;
                        break;
                    case 4:
                        fDecodeFloatElement18 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 4);
                        i2 |= 16;
                        z = z2;
                        z2 = z;
                        break;
                    case 5:
                        fDecodeFloatElement15 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 5);
                        i2 |= 32;
                        z = z2;
                        z2 = z;
                        break;
                    case 6:
                        fDecodeFloatElement14 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 6);
                        i2 |= 64;
                        z = z2;
                        z2 = z;
                        break;
                    case 7:
                        fDecodeFloatElement13 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 7);
                        i2 |= 128;
                        z = z2;
                        z2 = z;
                        break;
                    case 8:
                        fDecodeFloatElement17 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 8);
                        i2 |= 256;
                        z = z2;
                        z2 = z;
                        break;
                    case 9:
                        fDecodeFloatElement12 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 9);
                        i2 |= 512;
                        z = z2;
                        z2 = z;
                        break;
                    case 10:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 10);
                        i2 |= 1024;
                        z = z2;
                        z2 = z;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            f = fDecodeFloatElement12;
            f2 = fDecodeFloatElement11;
            i = i2;
            float f11 = fDecodeFloatElement19;
            f3 = fDecodeFloatElement13;
            f4 = fDecodeFloatElement20;
            f5 = fDecodeFloatElement17;
            f6 = fDecodeFloatElement15;
            f7 = fDecodeFloatElement16;
            f8 = fDecodeFloatElement18;
            f9 = fDecodeFloatElement14;
            f10 = f11;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new ChallengeConfig(i, f2, f4, f10, f7, f8, f6, f9, f3, f5, f, iDecodeIntElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull ChallengeConfig challengeConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(challengeConfig, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        ChallengeConfig.write$Self(challengeConfig, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
