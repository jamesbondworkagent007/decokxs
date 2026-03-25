package com.amplifyframework.predictions.aws.models.liveness;

import com.google.common.net.HttpHeaders;
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
public final class BoundingBox$$serializer implements GeneratedSerializer<BoundingBox> {
    public static final BoundingBox$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BoundingBox$$serializer boundingBox$$serializer = new BoundingBox$$serializer();
        INSTANCE = boundingBox$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplifyframework.predictions.aws.models.liveness.BoundingBox", boundingBox$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement(HttpHeaders.WIDTH, false);
        pluginGeneratedSerialDescriptor.addElement("Height", false);
        pluginGeneratedSerialDescriptor.addElement("Left", false);
        pluginGeneratedSerialDescriptor.addElement("Top", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BoundingBox$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{floatSerializer, floatSerializer, floatSerializer, floatSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public BoundingBox deserialize(@NotNull Decoder decoder) {
        float f;
        float fDecodeFloatElement;
        float f2;
        float f3;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            float fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 0);
            float fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 1);
            float fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 2);
            f = fDecodeFloatElement2;
            fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
            f2 = fDecodeFloatElement4;
            f3 = fDecodeFloatElement3;
            i = 15;
        } else {
            float fDecodeFloatElement5 = 0.0f;
            float fDecodeFloatElement6 = 0.0f;
            float fDecodeFloatElement7 = 0.0f;
            float fDecodeFloatElement8 = 0.0f;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    fDecodeFloatElement5 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    fDecodeFloatElement8 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    fDecodeFloatElement7 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    fDecodeFloatElement6 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
                    i2 |= 8;
                }
            }
            f = fDecodeFloatElement5;
            fDecodeFloatElement = fDecodeFloatElement6;
            f2 = fDecodeFloatElement7;
            f3 = fDecodeFloatElement8;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new BoundingBox(i, f, f3, f2, fDecodeFloatElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull BoundingBox boundingBox) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(boundingBox, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        BoundingBox.write$Self(boundingBox, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
