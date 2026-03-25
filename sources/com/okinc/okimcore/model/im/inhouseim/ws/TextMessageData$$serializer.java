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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class TextMessageData$$serializer implements GeneratedSerializer<TextMessageData> {
    public static final int $stable;
    public static final TextMessageData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TextMessageData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TextMessageData$$serializer textMessageData$$serializer = new TextMessageData$$serializer();
        INSTANCE = textMessageData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData", textMessageData$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("atType", true);
        pluginGeneratedSerialDescriptor.addElement("atUserList", true);
        pluginGeneratedSerialDescriptor.addElement("text", true);
        pluginGeneratedSerialDescriptor.addElement("longTextList", true);
        pluginGeneratedSerialDescriptor.addElement("quotedMsgSeq", true);
        pluginGeneratedSerialDescriptor.addElement("urlList", true);
        pluginGeneratedSerialDescriptor.addElement("siteMeta", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = TextMessageData.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(kSerializerArr[1]);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[5]), BuiltinSerializersKt.getNullable(SiteMeta$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TextMessageData deserialize(@NotNull Decoder decoder) {
        List list;
        String str;
        List list2;
        String str2;
        SiteMeta siteMeta;
        List list3;
        int i;
        Integer num;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TextMessageData.$childSerializers;
        int i2 = 6;
        int i3 = 4;
        int i4 = 2;
        List list4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            num = num2;
            siteMeta = (SiteMeta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, SiteMeta$$serializer.INSTANCE, null);
            str2 = str4;
            str = str3;
            i = 127;
            list2 = list5;
        } else {
            int i5 = 0;
            boolean z = true;
            list = null;
            String str5 = null;
            SiteMeta siteMeta2 = null;
            List list6 = null;
            str = null;
            Integer num3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        i3 = 4;
                        i4 = 2;
                        break;
                    case 0:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num3);
                        i5 |= 1;
                        i2 = 6;
                        i3 = 4;
                        i4 = 2;
                        break;
                    case 1:
                        i5 |= 2;
                        list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], list);
                        i2 = 6;
                        i3 = 4;
                        i4 = 2;
                        break;
                    case 2:
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str);
                        i5 |= 4;
                        break;
                    case 3:
                        i5 |= 8;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list4);
                        i2 = 6;
                        i3 = 4;
                        i4 = 2;
                        break;
                    case 4:
                        i5 |= 16;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str5);
                        i2 = 6;
                        i3 = 4;
                        i4 = 2;
                        break;
                    case 5:
                        i5 |= 32;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], list6);
                        i2 = 6;
                        i3 = 4;
                        i4 = 2;
                        break;
                    case 6:
                        i5 |= 64;
                        siteMeta2 = (SiteMeta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, SiteMeta$$serializer.INSTANCE, siteMeta2);
                        i2 = 6;
                        i3 = 4;
                        i4 = 2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Integer num4 = num3;
            list2 = list4;
            str2 = str5;
            siteMeta = siteMeta2;
            list3 = list6;
            i = i5;
            num = num4;
        }
        List list7 = list;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TextMessageData(i, num, list7, str, list2, str2, list3, siteMeta, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TextMessageData textMessageData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(textMessageData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TextMessageData.KWHzl(textMessageData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
