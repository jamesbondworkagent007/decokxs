package com.okinc.im.call.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.im.call.model.CallStateV2;
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

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class CallStateV2$Connecting$$serializer implements GeneratedSerializer<CallStateV2.Connecting> {
    public static final int $stable;
    public static final CallStateV2$Connecting$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CallStateV2$Connecting$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CallStateV2$Connecting$$serializer callStateV2$Connecting$$serializer = new CallStateV2$Connecting$$serializer();
        INSTANCE = callStateV2$Connecting$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.im.call.model.CallStateV2.Connecting", callStateV2$Connecting$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("session", false);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{CallSessionV2$$serializer.INSTANCE, CallStateV2.Connecting.$childSerializers[1]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CallStateV2.Connecting deserialize(@NotNull Decoder decoder) {
        CallDirection callDirection;
        CallSessionV2 callSessionV2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CallStateV2.Connecting.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            callSessionV2 = (CallSessionV2) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, CallSessionV2$$serializer.INSTANCE, null);
            callDirection = (CallDirection) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            CallDirection callDirection2 = null;
            CallSessionV2 callSessionV22 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    callSessionV22 = (CallSessionV2) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, CallSessionV2$$serializer.INSTANCE, callSessionV22);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    callDirection2 = (CallDirection) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], callDirection2);
                    i2 |= 2;
                }
            }
            callDirection = callDirection2;
            callSessionV2 = callSessionV22;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CallStateV2.Connecting(i, callSessionV2, callDirection, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CallStateV2.Connecting connecting) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(connecting, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CallStateV2.Connecting.AEQbTJ(connecting, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
