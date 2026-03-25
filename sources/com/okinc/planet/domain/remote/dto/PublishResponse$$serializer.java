package com.okinc.planet.domain.remote.dto;

import com.huawei.hms.push.constant.RemoteMessageConst;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class PublishResponse$$serializer implements GeneratedSerializer<PublishResponse> {
    public static final int $stable;
    public static final PublishResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PublishResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PublishResponse$$serializer publishResponse$$serializer = new PublishResponse$$serializer();
        INSTANCE = publishResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.domain.remote.dto.PublishResponse", publishResponse$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("contentId", false);
        pluginGeneratedSerialDescriptor.addElement("author", false);
        pluginGeneratedSerialDescriptor.addElement("formatType", false);
        pluginGeneratedSerialDescriptor.addElement("publishTime", false);
        pluginGeneratedSerialDescriptor.addElement("imageList", true);
        pluginGeneratedSerialDescriptor.addElement("tagList", true);
        pluginGeneratedSerialDescriptor.addElement("activityCard", true);
        pluginGeneratedSerialDescriptor.addElement("pluginInfo", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.CHANNEL_ID, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = PublishResponse.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, PublishAuthor$$serializer.INSTANCE, IntSerializer.INSTANCE, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(TagList$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ActivityCardResponse$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[7]), stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PublishResponse deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
        TagList tagList;
        List list2;
        String str;
        String strDecodeStringElement;
        String str2;
        String str3;
        PublishAuthor publishAuthor;
        ActivityCardResponse activityCardResponse;
        int i2;
        PublishAuthor publishAuthor2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PublishResponse.$childSerializers;
        int i4 = 9;
        int i5 = 6;
        int i6 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            PublishAuthor publishAuthor3 = (PublishAuthor) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PublishAuthor$$serializer.INSTANCE, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            TagList tagList2 = (TagList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, TagList$$serializer.INSTANCE, null);
            ActivityCardResponse activityCardResponse2 = (ActivityCardResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ActivityCardResponse$$serializer.INSTANCE, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            list2 = list4;
            str3 = strDecodeStringElement2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            activityCardResponse = activityCardResponse2;
            tagList = tagList2;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            i = iDecodeIntElement;
            i2 = 1023;
            publishAuthor = publishAuthor3;
            list = list3;
        } else {
            int iDecodeIntElement2 = 0;
            boolean z = true;
            List list5 = null;
            TagList tagList3 = null;
            ActivityCardResponse activityCardResponse3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            PublishAuthor publishAuthor4 = null;
            String strDecodeStringElement8 = null;
            List list6 = null;
            int i7 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        publishAuthor2 = publishAuthor4;
                        z = false;
                        publishAuthor4 = publishAuthor2;
                        i4 = 9;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 0:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        i4 = 9;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 1:
                        publishAuthor4 = (PublishAuthor) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PublishAuthor$$serializer.INSTANCE, publishAuthor4);
                        i7 |= 2;
                        i4 = 9;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 2:
                        i7 |= 4;
                        publishAuthor2 = publishAuthor4;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        publishAuthor4 = publishAuthor2;
                        i4 = 9;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 3:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i7 |= 8;
                        publishAuthor2 = publishAuthor4;
                        publishAuthor4 = publishAuthor2;
                        i4 = 9;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 4:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], list5);
                        i7 |= 16;
                        publishAuthor2 = publishAuthor4;
                        publishAuthor4 = publishAuthor2;
                        i4 = 9;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 5:
                        tagList3 = (TagList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, TagList$$serializer.INSTANCE, tagList3);
                        i7 |= 32;
                        break;
                    case 6:
                        activityCardResponse3 = (ActivityCardResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, ActivityCardResponse$$serializer.INSTANCE, activityCardResponse3);
                        i3 = i7 | 64;
                        i7 = i3;
                        i4 = 9;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 7:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], list6);
                        i3 = i7 | 128;
                        i7 = i3;
                        i4 = 9;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 8:
                        i7 |= 256;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 = 9;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 9:
                        i7 |= 512;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i4 = 9;
                        i5 = 6;
                        i6 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            PublishAuthor publishAuthor5 = publishAuthor4;
            i = iDecodeIntElement2;
            list = list5;
            tagList = tagList3;
            list2 = list6;
            str = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement6;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            publishAuthor = publishAuthor5;
            activityCardResponse = activityCardResponse3;
            i2 = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PublishResponse(i2, str3, publishAuthor, i, str, list, tagList, activityCardResponse, list2, str2, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PublishResponse publishResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(publishResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PublishResponse.copydefault(publishResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
