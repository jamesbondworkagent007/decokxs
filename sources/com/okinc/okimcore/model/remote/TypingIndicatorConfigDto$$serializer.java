package com.okinc.okimcore.model.remote;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class TypingIndicatorConfigDto$$serializer implements GeneratedSerializer<TypingIndicatorConfigDto> {
    public static final int $stable;
    public static final TypingIndicatorConfigDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TypingIndicatorConfigDto$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TypingIndicatorConfigDto$$serializer typingIndicatorConfigDto$$serializer = new TypingIndicatorConfigDto$$serializer();
        INSTANCE = typingIndicatorConfigDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.TypingIndicatorConfigDto", typingIndicatorConfigDto$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("throttleIntervalMs", true);
        pluginGeneratedSerialDescriptor.addElement("expiryMs", true);
        pluginGeneratedSerialDescriptor.addElement("largeGroupThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("allowedRolesInLargeGroup", true);
        pluginGeneratedSerialDescriptor.addElement("individualChatEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("groupChatEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("chatroomEnabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = TypingIndicatorConfigDto.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(kSerializerArr[3]);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TypingIndicatorConfigDto deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        List list;
        int i;
        Long l;
        Long l2;
        Integer num;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TypingIndicatorConfigDto.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        Integer num2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, longSerializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            list = list2;
            l2 = l4;
            bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            bool3 = bool5;
            bool = bool4;
            num = num3;
            i = 127;
            l = l3;
        } else {
            int i4 = 0;
            boolean z = true;
            Long l5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            List list3 = null;
            Long l6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 0:
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l6);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 1:
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l5);
                        i4 |= 2;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 2:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num2);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list3);
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 4:
                        i4 |= 16;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool6);
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 5:
                        i4 |= 32;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.INSTANCE, bool8);
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 6:
                        i4 |= 64;
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool7);
                        i2 = 6;
                        i3 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Long l7 = l6;
            bool = bool6;
            bool2 = bool7;
            bool3 = bool8;
            list = list3;
            i = i4;
            l = l7;
            l2 = l5;
            num = num2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TypingIndicatorConfigDto(i, l, l2, num, list, bool, bool3, bool2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TypingIndicatorConfigDto typingIndicatorConfigDto) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(typingIndicatorConfigDto, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TypingIndicatorConfigDto.write$Self$OKIMCore_okimcore(typingIndicatorConfigDto, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
