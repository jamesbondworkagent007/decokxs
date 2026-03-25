package com.okinc.okimcore.model.im.group.voicecall;

import com.okinc.okimcore.model.im.GroupVoiceCallData;
import com.okinc.okimcore.model.im.GroupVoiceCallData$$serializer;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class GroupVoiceCallConfig$$serializer implements GeneratedSerializer<GroupVoiceCallConfig> {
    public static final int $stable;
    public static final GroupVoiceCallConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GroupVoiceCallConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GroupVoiceCallConfig$$serializer groupVoiceCallConfig$$serializer = new GroupVoiceCallConfig$$serializer();
        INSTANCE = groupVoiceCallConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig", groupVoiceCallConfig$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("maxParticipants", true);
        pluginGeneratedSerialDescriptor.addElement("tokenTtlSeconds", true);
        pluginGeneratedSerialDescriptor.addElement("currentCall", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(GroupVoiceCallData$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GroupVoiceCallConfig deserialize(@NotNull Decoder decoder) {
        int i;
        Long l;
        Integer num;
        GroupVoiceCallData groupVoiceCallData;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Long l2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, null);
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, null);
            num = num2;
            groupVoiceCallData = (GroupVoiceCallData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, GroupVoiceCallData$$serializer.INSTANCE, null);
            l = l3;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            Integer num3 = null;
            GroupVoiceCallData groupVoiceCallData2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    groupVoiceCallData2 = (GroupVoiceCallData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, GroupVoiceCallData$$serializer.INSTANCE, groupVoiceCallData2);
                    i2 |= 4;
                }
            }
            i = i2;
            l = l2;
            num = num3;
            groupVoiceCallData = groupVoiceCallData2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupVoiceCallConfig(i, num, l, groupVoiceCallData, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GroupVoiceCallConfig groupVoiceCallConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(groupVoiceCallConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GroupVoiceCallConfig.write$Self$OKIMCore_okimcore(groupVoiceCallConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
