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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class RegistrationFinishBody$$serializer implements GeneratedSerializer<RegistrationFinishBody> {
    public static final int $stable;
    public static final RegistrationFinishBody$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RegistrationFinishBody$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RegistrationFinishBody$$serializer registrationFinishBody$$serializer = new RegistrationFinishBody$$serializer();
        INSTANCE = registrationFinishBody$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.auth.impl.passkey.model.RegistrationFinishBody", registrationFinishBody$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("rawId", true);
        pluginGeneratedSerialDescriptor.addElement("authenticatorAttachment", true);
        pluginGeneratedSerialDescriptor.addElement("response", false);
        pluginGeneratedSerialDescriptor.addElement("clientExtensionResults", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), RegistrationFinishBody$ResponseData$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(RegistrationFinishBody$ClientExtensionResultsData$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RegistrationFinishBody deserialize(@NotNull Decoder decoder) {
        RegistrationFinishBody.ClientExtensionResultsData clientExtensionResultsData;
        String str;
        int i;
        RegistrationFinishBody.ResponseData responseData;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            RegistrationFinishBody.ResponseData responseData2 = (RegistrationFinishBody.ResponseData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, RegistrationFinishBody$ResponseData$$serializer.INSTANCE, null);
            str2 = strDecodeStringElement;
            clientExtensionResultsData = (RegistrationFinishBody.ClientExtensionResultsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, RegistrationFinishBody$ClientExtensionResultsData$$serializer.INSTANCE, null);
            str = str7;
            responseData = responseData2;
            str3 = str6;
            str4 = strDecodeStringElement2;
            i = 63;
        } else {
            int i2 = 0;
            boolean z = true;
            RegistrationFinishBody.ResponseData responseData3 = null;
            String str8 = null;
            String strDecodeStringElement3 = null;
            RegistrationFinishBody.ClientExtensionResultsData clientExtensionResultsData2 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        i2 |= 2;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        i2 |= 4;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str8);
                        break;
                    case 3:
                        i2 |= 8;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str5);
                        break;
                    case 4:
                        i2 |= 16;
                        responseData3 = (RegistrationFinishBody.ResponseData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, RegistrationFinishBody$ResponseData$$serializer.INSTANCE, responseData3);
                        break;
                    case 5:
                        i2 |= 32;
                        clientExtensionResultsData2 = (RegistrationFinishBody.ClientExtensionResultsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, RegistrationFinishBody$ClientExtensionResultsData$$serializer.INSTANCE, clientExtensionResultsData2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            clientExtensionResultsData = clientExtensionResultsData2;
            str = str5;
            i = i2;
            String str9 = strDecodeStringElement4;
            responseData = responseData3;
            str2 = strDecodeStringElement3;
            str3 = str8;
            str4 = str9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RegistrationFinishBody(i, str2, str4, str3, str, responseData, clientExtensionResultsData, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RegistrationFinishBody registrationFinishBody) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(registrationFinishBody, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RegistrationFinishBody.EZpvd(registrationFinishBody, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
