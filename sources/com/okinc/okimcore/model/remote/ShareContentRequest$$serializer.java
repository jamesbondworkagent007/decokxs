package com.okinc.okimcore.model.remote;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData$$serializer;
import java.util.List;
import java.util.Map;
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

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class ShareContentRequest$$serializer implements GeneratedSerializer<ShareContentRequest> {
    public static final int $stable;
    public static final ShareContentRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ShareContentRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ShareContentRequest$$serializer shareContentRequest$$serializer = new ShareContentRequest$$serializer();
        INSTANCE = shareContentRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.ShareContentRequest", shareContentRequest$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("bizName", false);
        pluginGeneratedSerialDescriptor.addElement("channelIds", true);
        pluginGeneratedSerialDescriptor.addElement("userUids", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("deeplink", true);
        pluginGeneratedSerialDescriptor.addElement("messagePreview", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_IMAGE, true);
        pluginGeneratedSerialDescriptor.addElement("shortLink", true);
        pluginGeneratedSerialDescriptor.addElement("ctaType", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        pluginGeneratedSerialDescriptor.addElement("tagLine", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = ShareContentRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[1]), BuiltinSerializersKt.getNullable(kSerializerArr[2]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(ImageMessageData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[10]), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ShareContentRequest deserialize(@NotNull Decoder decoder) {
        ImageMessageData imageMessageData;
        String str;
        String str2;
        Integer num;
        String str3;
        int i;
        List list;
        String str4;
        String str5;
        List list2;
        String str6;
        Map map;
        String str7;
        String str8;
        String str9;
        List list3;
        KSerializer[] kSerializerArr;
        List list4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = ShareContentRequest.$childSerializers;
        int i2 = 9;
        int i3 = 8;
        String str10 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr2[1], null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr2[2], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            ImageMessageData imageMessageData2 = (ImageMessageData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ImageMessageData$$serializer.INSTANCE, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, null);
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr2[10], null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            num = num2;
            imageMessageData = imageMessageData2;
            str6 = str14;
            str2 = str15;
            list2 = list5;
            str5 = str12;
            list = list6;
            str4 = str13;
            i = 4095;
            str3 = str11;
            str7 = strDecodeStringElement;
        } else {
            int i4 = 11;
            ImageMessageData imageMessageData3 = null;
            String str16 = null;
            Map map2 = null;
            Integer num3 = null;
            String str17 = null;
            String strDecodeStringElement2 = null;
            String str18 = null;
            List list7 = null;
            List list8 = null;
            int i5 = 0;
            boolean z = true;
            String str19 = null;
            String str20 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str18;
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        list4 = list8;
                        z = false;
                        list8 = list4;
                        str18 = str9;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i4 = 11;
                        list7 = list3;
                        i3 = 8;
                        break;
                    case 0:
                        str9 = str18;
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        list4 = list8;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        list8 = list4;
                        str18 = str9;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i4 = 11;
                        list7 = list3;
                        i3 = 8;
                        break;
                    case 1:
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr2[1], list8);
                        i5 |= 2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i4 = 11;
                        list7 = list3;
                        i3 = 8;
                        break;
                    case 2:
                        str8 = str18;
                        i5 |= 4;
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr2[2], list7);
                        str18 = str8;
                        i2 = 9;
                        i3 = 8;
                        i4 = 11;
                        break;
                    case 3:
                        str8 = str18;
                        i5 |= 8;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str17);
                        str18 = str8;
                        i2 = 9;
                        i3 = 8;
                        i4 = 11;
                        break;
                    case 4:
                        str8 = str18;
                        i5 |= 16;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str20);
                        str18 = str8;
                        i2 = 9;
                        i3 = 8;
                        i4 = 11;
                        break;
                    case 5:
                        str8 = str18;
                        i5 |= 32;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str19);
                        str18 = str8;
                        i2 = 9;
                        i3 = 8;
                        i4 = 11;
                        break;
                    case 6:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str18);
                        i5 |= 64;
                        str18 = str8;
                        i2 = 9;
                        i3 = 8;
                        i4 = 11;
                        break;
                    case 7:
                        imageMessageData3 = (ImageMessageData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ImageMessageData$$serializer.INSTANCE, imageMessageData3);
                        i5 |= 128;
                        str8 = str18;
                        str18 = str8;
                        i2 = 9;
                        i3 = 8;
                        i4 = 11;
                        break;
                    case 8:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str16);
                        i5 |= 256;
                        str8 = str18;
                        str18 = str8;
                        i2 = 9;
                        i3 = 8;
                        i4 = 11;
                        break;
                    case 9:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IntSerializer.INSTANCE, num3);
                        i5 |= 512;
                        str8 = str18;
                        str18 = str8;
                        i2 = 9;
                        i3 = 8;
                        i4 = 11;
                        break;
                    case 10:
                        map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr2[10], map2);
                        i5 |= 1024;
                        str8 = str18;
                        str18 = str8;
                        i2 = 9;
                        i3 = 8;
                        i4 = 11;
                        break;
                    case 11:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str10);
                        i5 |= 2048;
                        str8 = str18;
                        str18 = str8;
                        i2 = 9;
                        i3 = 8;
                        i4 = 11;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            imageMessageData = imageMessageData3;
            str = str10;
            str2 = str16;
            num = num3;
            str3 = str17;
            i = i5;
            list = list7;
            str4 = str19;
            str5 = str20;
            list2 = list8;
            str6 = str18;
            String str21 = strDecodeStringElement2;
            map = map2;
            str7 = str21;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ShareContentRequest(i, str7, list2, list, str3, str5, str4, str6, imageMessageData, str2, num, map, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ShareContentRequest shareContentRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(shareContentRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ShareContentRequest.write$Self$OKIMCore_okimcore(shareContentRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
