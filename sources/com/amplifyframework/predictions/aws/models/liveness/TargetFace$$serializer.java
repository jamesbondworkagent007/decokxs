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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class TargetFace$$serializer implements GeneratedSerializer<TargetFace> {
    public static final TargetFace$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TargetFace$$serializer targetFace$$serializer = new TargetFace$$serializer();
        INSTANCE = targetFace$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplifyframework.predictions.aws.models.liveness.TargetFace", targetFace$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("BoundingBox", false);
        pluginGeneratedSerialDescriptor.addElement("FaceDetectedInTargetPositionStartTimestamp", false);
        pluginGeneratedSerialDescriptor.addElement("FaceDetectedInTargetPositionEndTimestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TargetFace$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{BoundingBox$$serializer.INSTANCE, longSerializer, longSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public TargetFace deserialize(@NotNull Decoder decoder) {
        int i;
        BoundingBox boundingBox;
        long jDecodeLongElement;
        long jDecodeLongElement2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        BoundingBox boundingBox2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boundingBox = (BoundingBox) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, BoundingBox$$serializer.INSTANCE, null);
            i = 7;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 1);
            jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 2);
        } else {
            long jDecodeLongElement3 = 0;
            int i2 = 0;
            boolean z = true;
            long jDecodeLongElement4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    boundingBox2 = (BoundingBox) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, BoundingBox$$serializer.INSTANCE, boundingBox2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            boundingBox = boundingBox2;
            jDecodeLongElement = jDecodeLongElement3;
            jDecodeLongElement2 = jDecodeLongElement4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new TargetFace(i, boundingBox, jDecodeLongElement, jDecodeLongElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull TargetFace targetFace) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(targetFace, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        TargetFace.write$Self(targetFace, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
