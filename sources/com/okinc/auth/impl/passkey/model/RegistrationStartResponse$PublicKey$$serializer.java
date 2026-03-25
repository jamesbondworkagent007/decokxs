package com.okinc.auth.impl.passkey.model;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class RegistrationStartResponse$PublicKey$$serializer implements GeneratedSerializer<RegistrationStartResponse.PublicKey> {
    public static final int $stable;
    public static final RegistrationStartResponse$PublicKey$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RegistrationStartResponse$PublicKey$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RegistrationStartResponse$PublicKey$$serializer registrationStartResponse$PublicKey$$serializer = new RegistrationStartResponse$PublicKey$$serializer();
        INSTANCE = registrationStartResponse$PublicKey$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.auth.impl.passkey.model.RegistrationStartResponse.PublicKey", registrationStartResponse$PublicKey$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("extensions", true);
        pluginGeneratedSerialDescriptor.addElement("attestation", true);
        pluginGeneratedSerialDescriptor.addElement(ClientData.KEY_CHALLENGE, true);
        pluginGeneratedSerialDescriptor.addElement("authenticatorSelection", true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("rp", true);
        pluginGeneratedSerialDescriptor.addElement("timeout", false);
        pluginGeneratedSerialDescriptor.addElement("excludeCredentials", true);
        pluginGeneratedSerialDescriptor.addElement("pubKeyCredParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = RegistrationStartResponse.PublicKey.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(RegistrationStartResponse$PublicKey$Extensions$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(RegistrationStartResponse$PublicKey$AuthenticatorSelection$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(RegistrationStartResponse$PublicKey$User$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(RegistrationStartResponse$PublicKey$Rp$$serializer.INSTANCE), IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[7]), BuiltinSerializersKt.getNullable(kSerializerArr[8])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RegistrationStartResponse.PublicKey deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        List list;
        int i2;
        List list2;
        RegistrationStartResponse.PublicKey.AuthenticatorSelection authenticatorSelection;
        String str2;
        RegistrationStartResponse.PublicKey.Extensions extensions;
        RegistrationStartResponse.PublicKey.User user;
        RegistrationStartResponse.PublicKey.Rp rp;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RegistrationStartResponse.PublicKey.$childSerializers;
        int i3 = 6;
        int i4 = 5;
        int i5 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            RegistrationStartResponse.PublicKey.Extensions extensions2 = (RegistrationStartResponse.PublicKey.Extensions) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, RegistrationStartResponse$PublicKey$Extensions$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            RegistrationStartResponse.PublicKey.AuthenticatorSelection authenticatorSelection2 = (RegistrationStartResponse.PublicKey.AuthenticatorSelection) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, RegistrationStartResponse$PublicKey$AuthenticatorSelection$$serializer.INSTANCE, null);
            RegistrationStartResponse.PublicKey.User user2 = (RegistrationStartResponse.PublicKey.User) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, RegistrationStartResponse$PublicKey$User$$serializer.INSTANCE, null);
            RegistrationStartResponse.PublicKey.Rp rp2 = (RegistrationStartResponse.PublicKey.Rp) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, RegistrationStartResponse$PublicKey$Rp$$serializer.INSTANCE, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            i = iDecodeIntElement;
            rp = rp2;
            authenticatorSelection = authenticatorSelection2;
            user = user2;
            str = str4;
            list2 = list3;
            i2 = 511;
            extensions = extensions2;
        } else {
            int iDecodeIntElement2 = 0;
            boolean z = true;
            RegistrationStartResponse.PublicKey.User user3 = null;
            RegistrationStartResponse.PublicKey.Rp rp3 = null;
            List list4 = null;
            List list5 = null;
            RegistrationStartResponse.PublicKey.AuthenticatorSelection authenticatorSelection3 = null;
            String str5 = null;
            RegistrationStartResponse.PublicKey.Extensions extensions3 = null;
            String str6 = null;
            int i6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str3 = str5;
                        z = false;
                        str5 = str3;
                        i3 = 6;
                        i4 = 5;
                        i5 = 7;
                        break;
                    case 0:
                        str3 = str5;
                        i6 |= 1;
                        extensions3 = (RegistrationStartResponse.PublicKey.Extensions) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, RegistrationStartResponse$PublicKey$Extensions$$serializer.INSTANCE, extensions3);
                        str5 = str3;
                        i3 = 6;
                        i4 = 5;
                        i5 = 7;
                        break;
                    case 1:
                        str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str5);
                        i6 |= 2;
                        str5 = str3;
                        i3 = 6;
                        i4 = 5;
                        i5 = 7;
                        break;
                    case 2:
                        i6 |= 4;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str6);
                        str3 = str5;
                        str5 = str3;
                        i3 = 6;
                        i4 = 5;
                        i5 = 7;
                        break;
                    case 3:
                        i6 |= 8;
                        authenticatorSelection3 = (RegistrationStartResponse.PublicKey.AuthenticatorSelection) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, RegistrationStartResponse$PublicKey$AuthenticatorSelection$$serializer.INSTANCE, authenticatorSelection3);
                        str3 = str5;
                        str5 = str3;
                        i3 = 6;
                        i4 = 5;
                        i5 = 7;
                        break;
                    case 4:
                        user3 = (RegistrationStartResponse.PublicKey.User) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, RegistrationStartResponse$PublicKey$User$$serializer.INSTANCE, user3);
                        i6 |= 16;
                        str3 = str5;
                        str5 = str3;
                        i3 = 6;
                        i4 = 5;
                        i5 = 7;
                        break;
                    case 5:
                        i6 |= 32;
                        rp3 = (RegistrationStartResponse.PublicKey.Rp) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, RegistrationStartResponse$PublicKey$Rp$$serializer.INSTANCE, rp3);
                        str3 = str5;
                        str5 = str3;
                        i3 = 6;
                        i4 = 5;
                        i5 = 7;
                        break;
                    case 6:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i3);
                        i6 |= 64;
                        break;
                    case 7:
                        i6 |= 128;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr[i5], list5);
                        break;
                    case 8:
                        i6 |= 256;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], list4);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str7 = str5;
            i = iDecodeIntElement2;
            str = str6;
            list = list4;
            i2 = i6;
            list2 = list5;
            authenticatorSelection = authenticatorSelection3;
            str2 = str7;
            extensions = extensions3;
            user = user3;
            rp = rp3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RegistrationStartResponse.PublicKey(i2, extensions, str2, str, authenticatorSelection, user, rp, i, list2, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RegistrationStartResponse.PublicKey publicKey) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(publicKey, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RegistrationStartResponse.PublicKey.write$Self$OKAuth_auth_impl(publicKey, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
