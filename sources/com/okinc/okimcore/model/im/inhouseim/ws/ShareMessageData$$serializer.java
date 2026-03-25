package com.okinc.okimcore.model.im.inhouseim.ws;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ShareMessageData$$serializer implements GeneratedSerializer<ShareMessageData> {
    public static final int $stable;
    public static final ShareMessageData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ShareMessageData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ShareMessageData$$serializer shareMessageData$$serializer = new ShareMessageData$$serializer();
        INSTANCE = shareMessageData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData", shareMessageData$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("bizName", false);
        pluginGeneratedSerialDescriptor.addElement("ctaType", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("preview", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_IMAGE, true);
        pluginGeneratedSerialDescriptor.addElement("deepLink", true);
        pluginGeneratedSerialDescriptor.addElement("shortLink", true);
        pluginGeneratedSerialDescriptor.addElement("tagLine", true);
        pluginGeneratedSerialDescriptor.addElement("quotedMsgSeq", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(ImageMessageData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(JsonElementSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ShareMessageData deserialize(@NotNull Decoder decoder) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        JsonElement jsonElement;
        String str5;
        String str6;
        ImageMessageData imageMessageData;
        Integer num;
        String str7;
        String str8;
        String str9;
        ImageMessageData imageMessageData2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        JsonElement jsonElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            ImageMessageData imageMessageData3 = (ImageMessageData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ImageMessageData$$serializer.INSTANCE, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            jsonElement = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, JsonElementSerializer.INSTANCE, null);
            str4 = str16;
            str3 = str14;
            str5 = str13;
            imageMessageData = imageMessageData3;
            str2 = str15;
            str7 = str12;
            i = 2047;
            str6 = strDecodeStringElement;
            str = str11;
            str8 = str10;
            num = num2;
        } else {
            int i6 = 0;
            boolean z = true;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            str = null;
            String str21 = null;
            String str22 = null;
            Integer num3 = null;
            String strDecodeStringElement2 = null;
            ImageMessageData imageMessageData4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str22;
                        imageMessageData2 = imageMessageData4;
                        z = false;
                        imageMessageData4 = imageMessageData2;
                        str22 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 0:
                        str9 = str22;
                        imageMessageData2 = imageMessageData4;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        imageMessageData4 = imageMessageData2;
                        str22 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 1:
                        str9 = str22;
                        imageMessageData2 = imageMessageData4;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num3);
                        i6 |= 2;
                        imageMessageData4 = imageMessageData2;
                        str22 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 2:
                        imageMessageData2 = imageMessageData4;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str22);
                        i6 |= 4;
                        imageMessageData4 = imageMessageData2;
                        str22 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 3:
                        imageMessageData2 = imageMessageData4;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str);
                        i6 |= 8;
                        str9 = str22;
                        imageMessageData4 = imageMessageData2;
                        str22 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 4:
                        imageMessageData2 = imageMessageData4;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str20);
                        i6 |= 16;
                        str9 = str22;
                        imageMessageData4 = imageMessageData2;
                        str22 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 5:
                        imageMessageData2 = (ImageMessageData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ImageMessageData$$serializer.INSTANCE, imageMessageData4);
                        i6 |= 32;
                        str9 = str22;
                        imageMessageData4 = imageMessageData2;
                        str22 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 6:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str21);
                        i6 |= 64;
                        str9 = str22;
                        imageMessageData2 = imageMessageData4;
                        imageMessageData4 = imageMessageData2;
                        str22 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 7:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str18);
                        i6 |= 128;
                        str9 = str22;
                        imageMessageData2 = imageMessageData4;
                        imageMessageData4 = imageMessageData2;
                        str22 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 8:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str17);
                        i6 |= 256;
                        str9 = str22;
                        imageMessageData2 = imageMessageData4;
                        imageMessageData4 = imageMessageData2;
                        str22 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 9:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str19);
                        i6 |= 512;
                        break;
                    case 10:
                        i6 |= 1024;
                        jsonElement2 = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, JsonElementSerializer.INSTANCE, jsonElement2);
                        str9 = str22;
                        imageMessageData2 = imageMessageData4;
                        imageMessageData4 = imageMessageData2;
                        str22 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str23 = str22;
            Integer num4 = num3;
            i = i6;
            str2 = str17;
            str3 = str18;
            str4 = str19;
            jsonElement = jsonElement2;
            str5 = str21;
            str6 = strDecodeStringElement2;
            imageMessageData = imageMessageData4;
            num = num4;
            str7 = str20;
            str8 = str23;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ShareMessageData(i, str6, num, str8, str, str7, imageMessageData, str5, str3, str2, str4, jsonElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ShareMessageData shareMessageData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(shareMessageData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ShareMessageData.copydefault(shareMessageData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
