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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerSessionInformationEvent$$serializer implements GeneratedSerializer<ServerSessionInformationEvent> {
    public static final ServerSessionInformationEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ServerSessionInformationEvent$$serializer serverSessionInformationEvent$$serializer = new ServerSessionInformationEvent$$serializer();
        INSTANCE = serverSessionInformationEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplifyframework.predictions.aws.models.liveness.ServerSessionInformationEvent", serverSessionInformationEvent$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("SessionInformation", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ServerSessionInformationEvent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SessionInformation$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public ServerSessionInformationEvent deserialize(@NotNull Decoder decoder) {
        SessionInformation sessionInformation;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            sessionInformation = (SessionInformation) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, SessionInformation$$serializer.INSTANCE, null);
        } else {
            sessionInformation = null;
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
                    sessionInformation = (SessionInformation) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, SessionInformation$$serializer.INSTANCE, sessionInformation);
                    i2 = 1;
                }
            }
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new ServerSessionInformationEvent(i, sessionInformation, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull ServerSessionInformationEvent serverSessionInformationEvent) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(serverSessionInformationEvent, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        compositeEncoderBeginStructure.encodeSerializableElement(descriptor2, 0, SessionInformation$$serializer.INSTANCE, serverSessionInformationEvent.sessionInformation);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
