package com.okinc.auth.api.passkey;

import com.okinc.auth.api.passkey.TargetDeviceVerificationInfoEvent;
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

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class TargetDeviceVerificationInfoEvent$$serializer implements GeneratedSerializer<TargetDeviceVerificationInfoEvent> {
    public static final int $stable;
    public static final TargetDeviceVerificationInfoEvent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TargetDeviceVerificationInfoEvent$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TargetDeviceVerificationInfoEvent$$serializer targetDeviceVerificationInfoEvent$$serializer = new TargetDeviceVerificationInfoEvent$$serializer();
        INSTANCE = targetDeviceVerificationInfoEvent$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.auth.api.passkey.TargetDeviceVerificationInfoEvent", targetDeviceVerificationInfoEvent$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("data", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{TargetDeviceVerificationInfoEvent$Data$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TargetDeviceVerificationInfoEvent deserialize(@NotNull Decoder decoder) {
        TargetDeviceVerificationInfoEvent.Data data;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            data = (TargetDeviceVerificationInfoEvent.Data) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, TargetDeviceVerificationInfoEvent$Data$$serializer.INSTANCE, null);
        } else {
            data = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    data = (TargetDeviceVerificationInfoEvent.Data) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, TargetDeviceVerificationInfoEvent$Data$$serializer.INSTANCE, data);
                    i2 = 1;
                }
            }
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TargetDeviceVerificationInfoEvent(i, data, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TargetDeviceVerificationInfoEvent targetDeviceVerificationInfoEvent) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(targetDeviceVerificationInfoEvent, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, TargetDeviceVerificationInfoEvent$Data$$serializer.INSTANCE, targetDeviceVerificationInfoEvent.data);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
