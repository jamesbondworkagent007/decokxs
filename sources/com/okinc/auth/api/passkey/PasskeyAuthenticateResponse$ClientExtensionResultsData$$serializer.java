package com.okinc.auth.api.passkey;

import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse;
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

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class PasskeyAuthenticateResponse$ClientExtensionResultsData$$serializer implements GeneratedSerializer<PasskeyAuthenticateResponse.ClientExtensionResultsData> {
    public static final int $stable;
    public static final PasskeyAuthenticateResponse$ClientExtensionResultsData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PasskeyAuthenticateResponse$ClientExtensionResultsData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PasskeyAuthenticateResponse$ClientExtensionResultsData$$serializer passkeyAuthenticateResponse$ClientExtensionResultsData$$serializer = new PasskeyAuthenticateResponse$ClientExtensionResultsData$$serializer();
        INSTANCE = passkeyAuthenticateResponse$ClientExtensionResultsData$$serializer;
        $stable = 8;
        descriptor = new PluginGeneratedSerialDescriptor("com.okinc.auth.api.passkey.PasskeyAuthenticateResponse.ClientExtensionResultsData", passkeyAuthenticateResponse$ClientExtensionResultsData$$serializer, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PasskeyAuthenticateResponse.ClientExtensionResultsData deserialize(@NotNull Decoder decoder) {
        int iDecodeElementIndex;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (!compositeDecoderBeginStructure.decodeSequentially() && (iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor)) != -1) {
            throw new UnknownFieldException(iDecodeElementIndex);
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PasskeyAuthenticateResponse.ClientExtensionResultsData(0, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PasskeyAuthenticateResponse.ClientExtensionResultsData clientExtensionResultsData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(clientExtensionResultsData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PasskeyAuthenticateResponse.ClientExtensionResultsData.write$Self$OKAuth_auth_api(clientExtensionResultsData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
