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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerChallenge$$serializer implements GeneratedSerializer<ServerChallenge> {
    public static final ServerChallenge$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ServerChallenge$$serializer serverChallenge$$serializer = new ServerChallenge$$serializer();
        INSTANCE = serverChallenge$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplifyframework.predictions.aws.models.liveness.ServerChallenge", serverChallenge$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("FaceMovementAndLightChallenge", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ServerChallenge$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{FaceMovementAndLightServerChallenge$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public ServerChallenge deserialize(@NotNull Decoder decoder) {
        FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        SerializationConstructorMarker serializationConstructorMarker = null;
        int i = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            faceMovementAndLightServerChallenge = (FaceMovementAndLightServerChallenge) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, FaceMovementAndLightServerChallenge$$serializer.INSTANCE, null);
        } else {
            faceMovementAndLightServerChallenge = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    faceMovementAndLightServerChallenge = (FaceMovementAndLightServerChallenge) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, FaceMovementAndLightServerChallenge$$serializer.INSTANCE, faceMovementAndLightServerChallenge);
                    i2 = 1;
                }
            }
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new ServerChallenge(i, faceMovementAndLightServerChallenge, serializationConstructorMarker);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull ServerChallenge serverChallenge) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(serverChallenge, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        compositeEncoderBeginStructure.encodeSerializableElement(descriptor2, 0, FaceMovementAndLightServerChallenge$$serializer.INSTANCE, serverChallenge.faceMovementAndLightChallenge);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
