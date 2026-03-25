package com.okinc.auth.impl.passkey.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class PasskeyRebindFinishRequestBody$$serializer implements GeneratedSerializer<PasskeyRebindFinishRequestBody> {
    public static final int $stable;
    public static final PasskeyRebindFinishRequestBody$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PasskeyRebindFinishRequestBody$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PasskeyRebindFinishRequestBody$$serializer passkeyRebindFinishRequestBody$$serializer = new PasskeyRebindFinishRequestBody$$serializer();
        INSTANCE = passkeyRebindFinishRequestBody$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.auth.impl.passkey.model.PasskeyRebindFinishRequestBody", passkeyRebindFinishRequestBody$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("isInHouse", false);
        pluginGeneratedSerialDescriptor.addElement("inHouseVer", true);
        pluginGeneratedSerialDescriptor.addElement("workflowToken", true);
        pluginGeneratedSerialDescriptor.addElement("responseJson", false);
        pluginGeneratedSerialDescriptor.addElement("scenario", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), stringSerializer, RegistrationFinishBody$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PasskeyRebindFinishRequestBody deserialize(@NotNull Decoder decoder) {
        boolean z;
        int i;
        RegistrationFinishBody registrationFinishBody;
        String str;
        String str2;
        Integer num;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            z = zDecodeBooleanElement;
            registrationFinishBody = (RegistrationFinishBody) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, RegistrationFinishBody$$serializer.INSTANCE, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, null);
            str2 = strDecodeStringElement;
            i = 31;
            num = num2;
        } else {
            RegistrationFinishBody registrationFinishBody2 = null;
            String str3 = null;
            String strDecodeStringElement2 = null;
            Integer num3 = null;
            boolean zDecodeBooleanElement2 = false;
            int i2 = 0;
            boolean z2 = true;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z2 = false;
                } else if (iDecodeElementIndex == 0) {
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    registrationFinishBody2 = (RegistrationFinishBody) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, RegistrationFinishBody$$serializer.INSTANCE, registrationFinishBody2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str3);
                    i2 |= 16;
                }
            }
            z = zDecodeBooleanElement2;
            i = i2;
            registrationFinishBody = registrationFinishBody2;
            str = str3;
            str2 = strDecodeStringElement2;
            num = num3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PasskeyRebindFinishRequestBody(i, z, num, str2, registrationFinishBody, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PasskeyRebindFinishRequestBody passkeyRebindFinishRequestBody) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(passkeyRebindFinishRequestBody, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PasskeyRebindFinishRequestBody.AEQbTJ(passkeyRebindFinishRequestBody, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
