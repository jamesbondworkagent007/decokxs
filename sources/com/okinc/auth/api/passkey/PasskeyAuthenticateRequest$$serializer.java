package com.okinc.auth.api.passkey;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import java.util.List;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class PasskeyAuthenticateRequest$$serializer implements GeneratedSerializer<PasskeyAuthenticateRequest> {
    public static final int $stable;
    public static final PasskeyAuthenticateRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PasskeyAuthenticateRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PasskeyAuthenticateRequest$$serializer passkeyAuthenticateRequest$$serializer = new PasskeyAuthenticateRequest$$serializer();
        INSTANCE = passkeyAuthenticateRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.auth.api.passkey.PasskeyAuthenticateRequest", passkeyAuthenticateRequest$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("extensions", false);
        pluginGeneratedSerialDescriptor.addElement(ClientData.KEY_CHALLENGE, false);
        pluginGeneratedSerialDescriptor.addElement("rpId", false);
        pluginGeneratedSerialDescriptor.addElement("allowCredentials", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = PasskeyAuthenticateRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{PasskeyAuthenticateRequest$Extensions$$serializer.INSTANCE, stringSerializer, stringSerializer, kSerializerArr[3]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PasskeyAuthenticateRequest deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        List list;
        String str2;
        PasskeyAuthenticateRequest.Extensions extensions;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PasskeyAuthenticateRequest.$childSerializers;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            PasskeyAuthenticateRequest.Extensions extensions2 = (PasskeyAuthenticateRequest.Extensions) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PasskeyAuthenticateRequest$Extensions$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            extensions = extensions2;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            List list2 = null;
            String strDecodeStringElement4 = null;
            PasskeyAuthenticateRequest.Extensions extensions3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    extensions3 = (PasskeyAuthenticateRequest.Extensions) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PasskeyAuthenticateRequest$Extensions$$serializer.INSTANCE, extensions3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            list = list2;
            str2 = strDecodeStringElement4;
            extensions = extensions3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PasskeyAuthenticateRequest(i, extensions, str2, str, list, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PasskeyAuthenticateRequest passkeyAuthenticateRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(passkeyAuthenticateRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PasskeyAuthenticateRequest.copydefault(passkeyAuthenticateRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
