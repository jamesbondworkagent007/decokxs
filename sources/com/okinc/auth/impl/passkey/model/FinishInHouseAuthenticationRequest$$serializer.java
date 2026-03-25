package com.okinc.auth.impl.passkey.model;

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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class FinishInHouseAuthenticationRequest$$serializer implements GeneratedSerializer<FinishInHouseAuthenticationRequest> {
    public static final int $stable;
    public static final FinishInHouseAuthenticationRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FinishInHouseAuthenticationRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FinishInHouseAuthenticationRequest$$serializer finishInHouseAuthenticationRequest$$serializer = new FinishInHouseAuthenticationRequest$$serializer();
        INSTANCE = finishInHouseAuthenticationRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.auth.impl.passkey.model.FinishInHouseAuthenticationRequest", finishInHouseAuthenticationRequest$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("crossDevicePasskeySessionId", false);
        pluginGeneratedSerialDescriptor.addElement("passkeyString", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, UnlockTokenWithFidoRequestBody$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FinishInHouseAuthenticationRequest deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            unlockTokenWithFidoRequestBody = (UnlockTokenWithFidoRequestBody) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, UnlockTokenWithFidoRequestBody$$serializer.INSTANCE, null);
            i = 3;
        } else {
            strDecodeStringElement = null;
            UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    unlockTokenWithFidoRequestBody2 = (UnlockTokenWithFidoRequestBody) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, UnlockTokenWithFidoRequestBody$$serializer.INSTANCE, unlockTokenWithFidoRequestBody2);
                    i2 |= 2;
                }
            }
            unlockTokenWithFidoRequestBody = unlockTokenWithFidoRequestBody2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FinishInHouseAuthenticationRequest(i, strDecodeStringElement, unlockTokenWithFidoRequestBody, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FinishInHouseAuthenticationRequest finishInHouseAuthenticationRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(finishInHouseAuthenticationRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FinishInHouseAuthenticationRequest.AEQbTJ(finishInHouseAuthenticationRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
