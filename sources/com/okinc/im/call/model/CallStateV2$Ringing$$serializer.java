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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class CallStateV2$Ringing$$serializer implements GeneratedSerializer<CallStateV2.Ringing> {
    public static final int $stable;
    public static final CallStateV2$Ringing$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CallStateV2$Ringing$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CallStateV2$Ringing$$serializer callStateV2$Ringing$$serializer = new CallStateV2$Ringing$$serializer();
        INSTANCE = callStateV2$Ringing$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.im.call.model.CallStateV2.Ringing", callStateV2$Ringing$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("session", false);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, false);
        pluginGeneratedSerialDescriptor.addElement("startedAt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{CallSessionV2$$serializer.INSTANCE, CallStateV2.Ringing.$childSerializers[1], LongSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CallStateV2.Ringing deserialize(@NotNull Decoder decoder) {
        int i;
        CallDirection callDirection;
        long jDecodeLongElement;
        CallSessionV2 callSessionV2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CallStateV2.Ringing.$childSerializers;
        CallDirection callDirection2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            CallSessionV2 callSessionV22 = (CallSessionV2) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, CallSessionV2$$serializer.INSTANCE, null);
            callDirection = (CallDirection) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            callSessionV2 = callSessionV22;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            i = 7;
        } else {
            long jDecodeLongElement2 = 0;
            int i2 = 0;
            boolean z = true;
            CallSessionV2 callSessionV23 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    callSessionV23 = (CallSessionV2) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, CallSessionV2$$serializer.INSTANCE, callSessionV23);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    callDirection2 = (CallDirection) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], callDirection2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            callDirection = callDirection2;
            jDecodeLongElement = jDecodeLongElement2;
            callSessionV2 = callSessionV23;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CallStateV2.Ringing(i, callSessionV2, callDirection, jDecodeLongElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CallStateV2.Ringing ringing) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(ringing, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CallStateV2.Ringing.KWHzl(ringing, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
