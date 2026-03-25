package com.okinc.okimcore.model.im.inhouseim.ws;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class CustomMessageData$$serializer implements GeneratedSerializer<CustomMessageData> {
    public static final int $stable;
    public static final CustomMessageData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CustomMessageData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CustomMessageData$$serializer customMessageData$$serializer = new CustomMessageData$$serializer();
        INSTANCE = customMessageData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData", customMessageData$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("serviceName", true);
        pluginGeneratedSerialDescriptor.addElement("bizName", true);
        pluginGeneratedSerialDescriptor.addElement("preview", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("pushTemplate", true);
        pluginGeneratedSerialDescriptor.addElement("pushData", true);
        pluginGeneratedSerialDescriptor.addElement("frontendOption", true);
        pluginGeneratedSerialDescriptor.addElement("messageHandling", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = CustomMessageData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(JsonObjectSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[7])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CustomMessageData deserialize(@NotNull Decoder decoder) {
        JsonObject jsonObject;
        List list;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CustomMessageData.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        int i4 = 3;
        String str8 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            JsonObject jsonObject2 = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, JsonObjectSerializer.INSTANCE, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            str = str14;
            jsonObject = jsonObject2;
            str3 = str12;
            str2 = str13;
            str5 = str11;
            str6 = str10;
            str4 = str9;
            i = 255;
        } else {
            int i5 = 0;
            boolean z = true;
            JsonObject jsonObject3 = null;
            String str15 = null;
            String str16 = null;
            List list2 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str7 = str18;
                        z = false;
                        str18 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 0:
                        str7 = str18;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str19);
                        i5 |= 1;
                        str18 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 1:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str18);
                        i5 |= 2;
                        str7 = str18;
                        str18 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 2:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str8);
                        i5 |= 4;
                        str7 = str18;
                        str18 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 3:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str16);
                        i5 |= 8;
                        str7 = str18;
                        str18 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 4:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str15);
                        i5 |= 16;
                        break;
                    case 5:
                        i5 |= 32;
                        jsonObject3 = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, JsonObjectSerializer.INSTANCE, jsonObject3);
                        str7 = str18;
                        str18 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 6:
                        i5 |= 64;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str17);
                        str7 = str18;
                        str18 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 7:
                        i5 |= 128;
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], list2);
                        str7 = str18;
                        str18 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str20 = str18;
            String str21 = str19;
            jsonObject = jsonObject3;
            list = list2;
            str = str17;
            i = i5;
            str2 = str15;
            str3 = str16;
            str4 = str21;
            str5 = str8;
            str6 = str20;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CustomMessageData(i, str4, str6, str5, str3, str2, jsonObject, str, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CustomMessageData customMessageData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(customMessageData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CustomMessageData.write$Self$OKIMCore_okimcore(customMessageData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
