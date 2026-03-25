package com.okinc.business.defi.wallet.passkey.common.bean;

import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse;
import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse$$serializer;
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

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class PasskeyWalletSignedMsg$$serializer implements GeneratedSerializer<PasskeyWalletSignedMsg> {
    public static final int $stable;
    public static final PasskeyWalletSignedMsg$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PasskeyWalletSignedMsg$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PasskeyWalletSignedMsg$$serializer passkeyWalletSignedMsg$$serializer = new PasskeyWalletSignedMsg$$serializer();
        INSTANCE = passkeyWalletSignedMsg$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSignedMsg", passkeyWalletSignedMsg$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("responseJson", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(PasskeyAuthenticateResponse$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PasskeyWalletSignedMsg deserialize(@NotNull Decoder decoder) {
        PasskeyAuthenticateResponse passkeyAuthenticateResponse;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        SerializationConstructorMarker serializationConstructorMarker = null;
        int i = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            passkeyAuthenticateResponse = (PasskeyAuthenticateResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, PasskeyAuthenticateResponse$$serializer.INSTANCE, null);
        } else {
            passkeyAuthenticateResponse = null;
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
                    passkeyAuthenticateResponse = (PasskeyAuthenticateResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, PasskeyAuthenticateResponse$$serializer.INSTANCE, passkeyAuthenticateResponse);
                    i2 = 1;
                }
            }
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PasskeyWalletSignedMsg(i, passkeyAuthenticateResponse, serializationConstructorMarker);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PasskeyWalletSignedMsg passkeyWalletSignedMsg) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(passkeyWalletSignedMsg, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, PasskeyAuthenticateResponse$$serializer.INSTANCE, passkeyWalletSignedMsg.responseJson);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
