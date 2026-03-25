package com.okinc.okimcore.model.im;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class GroupVoiceCallData$$serializer implements GeneratedSerializer<GroupVoiceCallData> {
    public static final int $stable;
    public static final GroupVoiceCallData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GroupVoiceCallData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GroupVoiceCallData$$serializer groupVoiceCallData$$serializer = new GroupVoiceCallData$$serializer();
        INSTANCE = groupVoiceCallData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.GroupVoiceCallData", groupVoiceCallData$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("initiatorUid", true);
        pluginGeneratedSerialDescriptor.addElement("historicalUids", true);
        pluginGeneratedSerialDescriptor.addElement("activeUsers", true);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("startTime", true);
        pluginGeneratedSerialDescriptor.addElement("targetUids", true);
        pluginGeneratedSerialDescriptor.addElement("maxParticipants", true);
        pluginGeneratedSerialDescriptor.addElement("endTime", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = GroupVoiceCallData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(kSerializerArr[1]);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(kSerializerArr[2]);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[5]), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GroupVoiceCallData deserialize(@NotNull Decoder decoder) {
        List list;
        String str;
        Integer num;
        String str2;
        Integer num2;
        String str3;
        List list2;
        List list3;
        int i;
        List list4;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = GroupVoiceCallData.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 3;
        int i5 = 4;
        List list5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            List list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, intSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            List list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
            list = list8;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            i = 255;
            num2 = num4;
            num = num3;
            str = str6;
            str3 = str5;
            list3 = list7;
            list2 = list6;
        } else {
            int i6 = 0;
            boolean z = true;
            List list9 = null;
            String str7 = null;
            Integer num5 = null;
            String str8 = null;
            Integer num6 = null;
            List list10 = null;
            String str9 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list4 = list10;
                        str4 = str9;
                        z = false;
                        str9 = str4;
                        list10 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 0:
                        list4 = list10;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str9);
                        i6 |= 1;
                        list10 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 1:
                        i6 |= 2;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], list10);
                        list10 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 2:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], list5);
                        i6 |= 4;
                        list4 = list10;
                        str4 = str9;
                        str9 = str4;
                        list10 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 3:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, IntSerializer.INSTANCE, num5);
                        i6 |= 8;
                        list4 = list10;
                        str4 = str9;
                        str9 = str4;
                        list10 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 4:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str7);
                        i6 |= 16;
                        break;
                    case 5:
                        list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], list9);
                        i6 |= 32;
                        list4 = list10;
                        list10 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 6:
                        i6 |= 64;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, IntSerializer.INSTANCE, num6);
                        list4 = list10;
                        list10 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 7:
                        i6 |= 128;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str8);
                        list4 = list10;
                        list10 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 3;
                        i5 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list11 = list10;
            String str10 = str9;
            list = list9;
            str = str7;
            num = num5;
            str2 = str8;
            num2 = num6;
            str3 = str10;
            list2 = list11;
            list3 = list5;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupVoiceCallData(i, str3, list2, list3, num, str, list, num2, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GroupVoiceCallData groupVoiceCallData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(groupVoiceCallData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GroupVoiceCallData.write$Self$OKIMCore_okimcore(groupVoiceCallData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
