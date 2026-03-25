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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorSequence$$serializer implements GeneratedSerializer<ColorSequence> {
    public static final ColorSequence$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ColorSequence$$serializer colorSequence$$serializer = new ColorSequence$$serializer();
        INSTANCE = colorSequence$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplifyframework.predictions.aws.models.liveness.ColorSequence", colorSequence$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("FreshnessColor", false);
        pluginGeneratedSerialDescriptor.addElement("DownscrollDuration", false);
        pluginGeneratedSerialDescriptor.addElement("FlatDisplayDuration", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ColorSequence$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{FreshnessColor$$serializer.INSTANCE, floatSerializer, floatSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public ColorSequence deserialize(@NotNull Decoder decoder) {
        FreshnessColor freshnessColor;
        float fDecodeFloatElement;
        float fDecodeFloatElement2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            freshnessColor = (FreshnessColor) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, FreshnessColor$$serializer.INSTANCE, null);
            fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 1);
            fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 2);
            i = 7;
        } else {
            float fDecodeFloatElement3 = 0.0f;
            int i2 = 0;
            boolean z = true;
            FreshnessColor freshnessColor2 = null;
            float fDecodeFloatElement4 = 0.0f;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    freshnessColor2 = (FreshnessColor) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, FreshnessColor$$serializer.INSTANCE, freshnessColor2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 2);
                    i2 |= 4;
                }
            }
            freshnessColor = freshnessColor2;
            fDecodeFloatElement = fDecodeFloatElement4;
            fDecodeFloatElement2 = fDecodeFloatElement3;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new ColorSequence(i, freshnessColor, fDecodeFloatElement, fDecodeFloatElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull ColorSequence colorSequence) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(colorSequence, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        ColorSequence.write$Self(colorSequence, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
