package com.okinc.auth.impl.passkey.model;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import java.util.List;
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
public final /* synthetic */ class AuthenticationStartResponse$PublicKey$$serializer implements GeneratedSerializer<AuthenticationStartResponse.PublicKey> {
    public static final int $stable;
    public static final AuthenticationStartResponse$PublicKey$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AuthenticationStartResponse$PublicKey$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AuthenticationStartResponse$PublicKey$$serializer authenticationStartResponse$PublicKey$$serializer = new AuthenticationStartResponse$PublicKey$$serializer();
        INSTANCE = authenticationStartResponse$PublicKey$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.PublicKey", authenticationStartResponse$PublicKey$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("extensions", true);
        pluginGeneratedSerialDescriptor.addElement("userVerification", true);
        pluginGeneratedSerialDescriptor.addElement(ClientData.KEY_CHALLENGE, true);
        pluginGeneratedSerialDescriptor.addElement("rpId", true);
        pluginGeneratedSerialDescriptor.addElement("allowCredentials", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = AuthenticationStartResponse.PublicKey.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable(AuthenticationStartResponse$Extensions$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[4])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AuthenticationStartResponse.PublicKey deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        List list;
        String str2;
        String str3;
        AuthenticationStartResponse.Extensions extensions;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AuthenticationStartResponse.PublicKey.$childSerializers;
        String str4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            AuthenticationStartResponse.Extensions extensions2 = (AuthenticationStartResponse.Extensions) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, AuthenticationStartResponse$Extensions$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            extensions = extensions2;
            str2 = str7;
            str = str6;
            i = 31;
            str3 = str5;
        } else {
            int i2 = 0;
            boolean z = true;
            List list2 = null;
            String str8 = null;
            String str9 = null;
            AuthenticationStartResponse.Extensions extensions3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    extensions3 = (AuthenticationStartResponse.Extensions) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, AuthenticationStartResponse$Extensions$$serializer.INSTANCE, extensions3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    i2 |= 2;
                    str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str9);
                } else if (iDecodeElementIndex == 2) {
                    i2 |= 4;
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str4);
                } else if (iDecodeElementIndex == 3) {
                    i2 |= 8;
                    str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str8);
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i2 |= 16;
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], list2);
                }
            }
            i = i2;
            str = str4;
            list = list2;
            str2 = str8;
            str3 = str9;
            extensions = extensions3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AuthenticationStartResponse.PublicKey(i, extensions, str3, str, str2, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AuthenticationStartResponse.PublicKey publicKey) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(publicKey, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AuthenticationStartResponse.PublicKey.write$Self$OKAuth_auth_impl(publicKey, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
