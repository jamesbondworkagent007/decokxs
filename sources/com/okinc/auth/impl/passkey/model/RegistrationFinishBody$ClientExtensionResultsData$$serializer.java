package com.okinc.auth.impl.passkey.model;

import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class RegistrationFinishBody$ClientExtensionResultsData$$serializer implements GeneratedSerializer<RegistrationFinishBody.ClientExtensionResultsData> {
    public static final int $stable;
    public static final RegistrationFinishBody$ClientExtensionResultsData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RegistrationFinishBody$ClientExtensionResultsData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RegistrationFinishBody$ClientExtensionResultsData$$serializer registrationFinishBody$ClientExtensionResultsData$$serializer = new RegistrationFinishBody$ClientExtensionResultsData$$serializer();
        INSTANCE = registrationFinishBody$ClientExtensionResultsData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.auth.impl.passkey.model.RegistrationFinishBody.ClientExtensionResultsData", registrationFinishBody$ClientExtensionResultsData$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("credProps", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(RegistrationFinishBody$CredPropsData$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RegistrationFinishBody.ClientExtensionResultsData deserialize(@NotNull Decoder decoder) {
        RegistrationFinishBody.CredPropsData credPropsData;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            credPropsData = (RegistrationFinishBody.CredPropsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, RegistrationFinishBody$CredPropsData$$serializer.INSTANCE, null);
        } else {
            credPropsData = null;
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
                    credPropsData = (RegistrationFinishBody.CredPropsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, RegistrationFinishBody$CredPropsData$$serializer.INSTANCE, credPropsData);
                    i2 = 1;
                }
            }
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RegistrationFinishBody.ClientExtensionResultsData(i, credPropsData, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RegistrationFinishBody.ClientExtensionResultsData clientExtensionResultsData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(clientExtensionResultsData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RegistrationFinishBody.ClientExtensionResultsData.EZpvd(clientExtensionResultsData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
