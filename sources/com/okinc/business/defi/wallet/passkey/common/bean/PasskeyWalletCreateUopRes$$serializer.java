package com.okinc.business.defi.wallet.passkey.common.bean;

import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest$$serializer;
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
public final /* synthetic */ class PasskeyWalletCreateUopRes$$serializer implements GeneratedSerializer<PasskeyWalletCreateUopRes> {
    public static final int $stable;
    public static final PasskeyWalletCreateUopRes$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PasskeyWalletCreateUopRes$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PasskeyWalletCreateUopRes$$serializer passkeyWalletCreateUopRes$$serializer = new PasskeyWalletCreateUopRes$$serializer();
        INSTANCE = passkeyWalletCreateUopRes$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCreateUopRes", passkeyWalletCreateUopRes$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("serverOption", false);
        pluginGeneratedSerialDescriptor.addElement("uopHash", false);
        pluginGeneratedSerialDescriptor.addElement("promptType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{PasskeyAuthenticateRequest$$serializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PasskeyWalletCreateUopRes deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        PasskeyAuthenticateRequest passkeyAuthenticateRequest;
        Integer num;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            PasskeyAuthenticateRequest passkeyAuthenticateRequest2 = (PasskeyAuthenticateRequest) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PasskeyAuthenticateRequest$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            passkeyAuthenticateRequest = passkeyAuthenticateRequest2;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, null);
            str = strDecodeStringElement2;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            PasskeyAuthenticateRequest passkeyAuthenticateRequest3 = null;
            Integer num2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    passkeyAuthenticateRequest3 = (PasskeyAuthenticateRequest) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PasskeyAuthenticateRequest$$serializer.INSTANCE, passkeyAuthenticateRequest3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            passkeyAuthenticateRequest = passkeyAuthenticateRequest3;
            num = num2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PasskeyWalletCreateUopRes(i, passkeyAuthenticateRequest, str, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PasskeyWalletCreateUopRes passkeyWalletCreateUopRes) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(passkeyWalletCreateUopRes, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PasskeyWalletCreateUopRes.write$Self$OKWallet_wallet_impl(passkeyWalletCreateUopRes, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
