package com.amplifyframework.predictions.aws.models.liveness;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorDisplayed$$serializer implements GeneratedSerializer<ColorDisplayed> {
    public static final ColorDisplayed$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ColorDisplayed$$serializer colorDisplayed$$serializer = new ColorDisplayed$$serializer();
        INSTANCE = colorDisplayed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplifyframework.predictions.aws.models.liveness.ColorDisplayed", colorDisplayed$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("CurrentColor", false);
        pluginGeneratedSerialDescriptor.addElement("PreviousColor", false);
        pluginGeneratedSerialDescriptor.addElement("SequenceNumber", false);
        pluginGeneratedSerialDescriptor.addElement("CurrentColorStartTimestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ColorDisplayed$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        FreshnessColor$$serializer freshnessColor$$serializer = FreshnessColor$$serializer.INSTANCE;
        return new KSerializer[]{freshnessColor$$serializer, freshnessColor$$serializer, IntSerializer.INSTANCE, LongSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public ColorDisplayed deserialize(@NotNull Decoder decoder) {
        int i;
        int iDecodeIntElement;
        FreshnessColor freshnessColor;
        FreshnessColor freshnessColor2;
        long jDecodeLongElement;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            FreshnessColor$$serializer freshnessColor$$serializer = FreshnessColor$$serializer.INSTANCE;
            FreshnessColor freshnessColor3 = (FreshnessColor) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, freshnessColor$$serializer, null);
            freshnessColor = (FreshnessColor) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, freshnessColor$$serializer, null);
            i = 15;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 2);
            freshnessColor2 = freshnessColor3;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 3);
        } else {
            int i2 = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            FreshnessColor freshnessColor4 = null;
            FreshnessColor freshnessColor5 = null;
            int iDecodeIntElement2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    freshnessColor5 = (FreshnessColor) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, FreshnessColor$$serializer.INSTANCE, freshnessColor5);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    freshnessColor4 = (FreshnessColor) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, FreshnessColor$$serializer.INSTANCE, freshnessColor4);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            iDecodeIntElement = iDecodeIntElement2;
            freshnessColor = freshnessColor4;
            freshnessColor2 = freshnessColor5;
            jDecodeLongElement = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new ColorDisplayed(i, freshnessColor2, freshnessColor, iDecodeIntElement, jDecodeLongElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull ColorDisplayed colorDisplayed) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(colorDisplayed, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        ColorDisplayed.write$Self(colorDisplayed, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
