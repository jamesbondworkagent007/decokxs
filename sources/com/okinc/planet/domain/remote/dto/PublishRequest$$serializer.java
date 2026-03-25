package com.okinc.planet.domain.remote.dto;

import com.huawei.hms.push.constant.RemoteMessageConst;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class PublishRequest$$serializer implements GeneratedSerializer<PublishRequest> {
    public static final int $stable;
    public static final PublishRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PublishRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PublishRequest$$serializer publishRequest$$serializer = new PublishRequest$$serializer();
        INSTANCE = publishRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.domain.remote.dto.PublishRequest", publishRequest$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("publishId", false);
        pluginGeneratedSerialDescriptor.addElement("draftId", true);
        pluginGeneratedSerialDescriptor.addElement("content", false);
        pluginGeneratedSerialDescriptor.addElement("imageList", true);
        pluginGeneratedSerialDescriptor.addElement("pluginList", true);
        pluginGeneratedSerialDescriptor.addElement("contentTags", true);
        pluginGeneratedSerialDescriptor.addElement("activityCard", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.CHANNEL_ID, false);
        pluginGeneratedSerialDescriptor.addElement("channelData", true);
        pluginGeneratedSerialDescriptor.addElement("group", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = PublishRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, kSerializerArr[3], kSerializerArr[4], ContentTags$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(ActivityCardPublish$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[8]), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PublishRequest deserialize(@NotNull Decoder decoder) {
        String str;
        ActivityCardPublish activityCardPublish;
        Map map;
        String str2;
        String strDecodeStringElement;
        String str3;
        String str4;
        List list;
        List list2;
        ContentTags contentTags;
        int i;
        List list3;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PublishRequest.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 5;
        Map map2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            List list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            ContentTags contentTags2 = (ContentTags) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, ContentTags$$serializer.INSTANCE, null);
            ActivityCardPublish activityCardPublish2 = (ActivityCardPublish) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ActivityCardPublish$$serializer.INSTANCE, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            str3 = strDecodeStringElement4;
            activityCardPublish = activityCardPublish2;
            contentTags = contentTags2;
            str2 = strDecodeStringElement3;
            list = list4;
            str = str6;
            list2 = list5;
            i = 1023;
            str4 = strDecodeStringElement2;
        } else {
            int i6 = 0;
            boolean z = true;
            List list6 = null;
            ActivityCardPublish activityCardPublish3 = null;
            ContentTags contentTags3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            List list7 = null;
            String str7 = null;
            String strDecodeStringElement8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list3 = list7;
                        str5 = str7;
                        z = false;
                        str7 = str5;
                        list7 = list3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 0:
                        list3 = list7;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        list7 = list3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 1:
                        list3 = list7;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str7);
                        i6 |= 2;
                        list7 = list3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 2:
                        list3 = list7;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        list7 = list3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 3:
                        i6 |= 8;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list7);
                        list7 = list3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 4:
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], list6);
                        i6 |= 16;
                        list3 = list7;
                        str5 = str7;
                        str7 = str5;
                        list7 = list3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 5:
                        contentTags3 = (ContentTags) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, ContentTags$$serializer.INSTANCE, contentTags3);
                        i6 |= 32;
                        break;
                    case 6:
                        i6 |= 64;
                        activityCardPublish3 = (ActivityCardPublish) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, ActivityCardPublish$$serializer.INSTANCE, activityCardPublish3);
                        list3 = list7;
                        list7 = list3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 7:
                        i6 |= 128;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        list3 = list7;
                        list7 = list3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 8:
                        i6 |= 256;
                        map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], map2);
                        list3 = list7;
                        list7 = list3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 9:
                        i6 |= 512;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        list3 = list7;
                        list7 = list3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list8 = list7;
            str = str7;
            activityCardPublish = activityCardPublish3;
            map = map2;
            str2 = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            list = list8;
            list2 = list6;
            contentTags = contentTags3;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PublishRequest(i, str4, str, str2, list, list2, contentTags, activityCardPublish, str3, map, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PublishRequest publishRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(publishRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PublishRequest.OLrzqt(publishRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
