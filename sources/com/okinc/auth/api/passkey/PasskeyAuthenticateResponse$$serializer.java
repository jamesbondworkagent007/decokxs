package com.okinc.auth.api.passkey;

import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse;
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

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class PasskeyAuthenticateResponse$$serializer implements GeneratedSerializer<PasskeyAuthenticateResponse> {
    public static final int $stable;
    public static final PasskeyAuthenticateResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PasskeyAuthenticateResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PasskeyAuthenticateResponse$$serializer passkeyAuthenticateResponse$$serializer = new PasskeyAuthenticateResponse$$serializer();
        INSTANCE = passkeyAuthenticateResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.auth.api.passkey.PasskeyAuthenticateResponse", passkeyAuthenticateResponse$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("authenticatorAttachment", true);
        pluginGeneratedSerialDescriptor.addElement("response", false);
        pluginGeneratedSerialDescriptor.addElement("clientExtensionResults", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), PasskeyAuthenticateResponse$Response$$serializer.INSTANCE, PasskeyAuthenticateResponse$ClientExtensionResultsData$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PasskeyAuthenticateResponse deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        PasskeyAuthenticateResponse.ClientExtensionResultsData clientExtensionResultsData;
        PasskeyAuthenticateResponse.Response response;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            response = (PasskeyAuthenticateResponse.Response) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PasskeyAuthenticateResponse$Response$$serializer.INSTANCE, null);
            clientExtensionResultsData = (PasskeyAuthenticateResponse.ClientExtensionResultsData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, PasskeyAuthenticateResponse$ClientExtensionResultsData$$serializer.INSTANCE, null);
            i = 31;
            str3 = str5;
            str2 = str6;
        } else {
            int i2 = 0;
            boolean z = true;
            PasskeyAuthenticateResponse.ClientExtensionResultsData clientExtensionResultsData2 = null;
            PasskeyAuthenticateResponse.Response response2 = null;
            String str7 = null;
            String str8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str8);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str7);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str4);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    response2 = (PasskeyAuthenticateResponse.Response) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PasskeyAuthenticateResponse$Response$$serializer.INSTANCE, response2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    clientExtensionResultsData2 = (PasskeyAuthenticateResponse.ClientExtensionResultsData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, PasskeyAuthenticateResponse$ClientExtensionResultsData$$serializer.INSTANCE, clientExtensionResultsData2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str4;
            clientExtensionResultsData = clientExtensionResultsData2;
            response = response2;
            str2 = str7;
            str3 = str8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PasskeyAuthenticateResponse(i, str3, str2, str, response, clientExtensionResultsData, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PasskeyAuthenticateResponse passkeyAuthenticateResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(passkeyAuthenticateResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PasskeyAuthenticateResponse.write$Self$OKAuth_auth_api(passkeyAuthenticateResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
