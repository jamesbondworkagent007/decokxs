package com.okinc.auth.impl.mfa.model;

import com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody;
import com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$$serializer;
import com.okinc.p2p.api.OtcExtraKeys;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class FinishAuthPasskeyRequest$$serializer implements GeneratedSerializer<FinishAuthPasskeyRequest> {
    public static final int $stable;
    public static final FinishAuthPasskeyRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FinishAuthPasskeyRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FinishAuthPasskeyRequest$$serializer finishAuthPasskeyRequest$$serializer = new FinishAuthPasskeyRequest$$serializer();
        INSTANCE = finishAuthPasskeyRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.auth.impl.mfa.model.FinishAuthPasskeyRequest", finishAuthPasskeyRequest$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.SESSIONID, false);
        pluginGeneratedSerialDescriptor.addElement("passkeyString", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(UnlockTokenWithFidoRequestBody$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FinishAuthPasskeyRequest deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            unlockTokenWithFidoRequestBody = (UnlockTokenWithFidoRequestBody) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, UnlockTokenWithFidoRequestBody$$serializer.INSTANCE, null);
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
                    unlockTokenWithFidoRequestBody2 = (UnlockTokenWithFidoRequestBody) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, UnlockTokenWithFidoRequestBody$$serializer.INSTANCE, unlockTokenWithFidoRequestBody2);
                    i2 |= 2;
                }
            }
            unlockTokenWithFidoRequestBody = unlockTokenWithFidoRequestBody2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FinishAuthPasskeyRequest(i, strDecodeStringElement, unlockTokenWithFidoRequestBody, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FinishAuthPasskeyRequest finishAuthPasskeyRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(finishAuthPasskeyRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FinishAuthPasskeyRequest.KWHzl(finishAuthPasskeyRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
