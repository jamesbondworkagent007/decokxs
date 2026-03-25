package com.okinc.im.call.model;

import com.okinc.im.call.model.CallStateV2;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class CallStateV2$Disconnected$$serializer implements GeneratedSerializer<CallStateV2.Disconnected> {
    public static final int $stable;
    public static final CallStateV2$Disconnected$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CallStateV2$Disconnected$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CallStateV2$Disconnected$$serializer callStateV2$Disconnected$$serializer = new CallStateV2$Disconnected$$serializer();
        INSTANCE = callStateV2$Disconnected$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.im.call.model.CallStateV2.Disconnected", callStateV2$Disconnected$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("session", false);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.REASON, false);
        pluginGeneratedSerialDescriptor.addElement("duration", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(CallSessionV2$$serializer.INSTANCE), CallStateV2.Disconnected.$childSerializers[1], BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CallStateV2.Disconnected deserialize(@NotNull Decoder decoder) {
        int i;
        DisconnectReason disconnectReason;
        Long l;
        CallSessionV2 callSessionV2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CallStateV2.Disconnected.$childSerializers;
        DisconnectReason disconnectReason2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            CallSessionV2 callSessionV22 = (CallSessionV2) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CallSessionV2$$serializer.INSTANCE, null);
            disconnectReason = (DisconnectReason) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            callSessionV2 = callSessionV22;
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, null);
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            Long l2 = null;
            CallSessionV2 callSessionV23 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    callSessionV23 = (CallSessionV2) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CallSessionV2$$serializer.INSTANCE, callSessionV23);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    disconnectReason2 = (DisconnectReason) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], disconnectReason2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, l2);
                    i2 |= 4;
                }
            }
            i = i2;
            disconnectReason = disconnectReason2;
            l = l2;
            callSessionV2 = callSessionV23;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CallStateV2.Disconnected(i, callSessionV2, disconnectReason, l, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CallStateV2.Disconnected disconnected) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(disconnected, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CallStateV2.Disconnected.KWHzl(disconnected, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
