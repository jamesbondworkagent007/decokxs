package com.okinc.crcore.coreapi.net.responsebean.content;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class CommunityPostReferencedContentResponseBean$$serializer implements GeneratedSerializer<CommunityPostReferencedContentResponseBean> {
    public static final int $stable;
    public static final CommunityPostReferencedContentResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CommunityPostReferencedContentResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CommunityPostReferencedContentResponseBean$$serializer communityPostReferencedContentResponseBean$$serializer = new CommunityPostReferencedContentResponseBean$$serializer();
        INSTANCE = communityPostReferencedContentResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.content.CommunityPostReferencedContentResponseBean", communityPostReferencedContentResponseBean$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("author", true);
        pluginGeneratedSerialDescriptor.addElement("contentId", true);
        pluginGeneratedSerialDescriptor.addElement("formatType", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("translatedContent", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("enTitle", true);
        pluginGeneratedSerialDescriptor.addElement("imageList", true);
        pluginGeneratedSerialDescriptor.addElement("retweetTotal", true);
        pluginGeneratedSerialDescriptor.addElement("retweetAuthorInfo", true);
        pluginGeneratedSerialDescriptor.addElement("referencedContent", true);
        pluginGeneratedSerialDescriptor.addElement("publishTime", true);
        pluginGeneratedSerialDescriptor.addElement("sourcePlatform", true);
        pluginGeneratedSerialDescriptor.addElement("tokens", true);
        pluginGeneratedSerialDescriptor.addElement("isLiked", true);
        pluginGeneratedSerialDescriptor.addElement("likeCount", true);
        pluginGeneratedSerialDescriptor.addElement("viewCount", true);
        pluginGeneratedSerialDescriptor.addElement("shareUrl", true);
        pluginGeneratedSerialDescriptor.addElement("translatedTitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CommunityPostReferencedContentResponseBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{CommunityAuthorResponseBean$$serializer.INSTANCE, stringSerializer, BuiltinSerializersKt.getNullable(intSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[7], BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[9]), BuiltinSerializersKt.getNullable(INSTANCE), LongSerializer.INSTANCE, stringSerializer, kSerializerArr[13], BooleanSerializer.INSTANCE, intSerializer, intSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CommunityPostReferencedContentResponseBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        String str2;
        CommunityPostReferencedContentResponseBean communityPostReferencedContentResponseBean;
        List list;
        Integer num;
        List list2;
        Integer num2;
        List list3;
        String strDecodeStringElement2;
        String str3;
        int i;
        String str4;
        long j;
        String str5;
        int i2;
        boolean z;
        int i3;
        String str6;
        CommunityAuthorResponseBean communityAuthorResponseBean;
        KSerializer[] kSerializerArr;
        List list4;
        String str7;
        Integer num3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = CommunityPostReferencedContentResponseBean.$childSerializers;
        int i4 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            CommunityAuthorResponseBean communityAuthorResponseBean2 = (CommunityAuthorResponseBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, CommunityAuthorResponseBean$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr2[7], null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, intSerializer, null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr2[9], null);
            CommunityPostReferencedContentResponseBean communityPostReferencedContentResponseBean2 = (CommunityPostReferencedContentResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, INSTANCE, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 11);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            List list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, kSerializerArr2[13], null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 16);
            list = list6;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            z = zDecodeBooleanElement;
            str3 = strDecodeStringElement4;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            i = iDecodeIntElement;
            i3 = 524287;
            i2 = iDecodeIntElement2;
            communityPostReferencedContentResponseBean = communityPostReferencedContentResponseBean2;
            j = jDecodeLongElement;
            communityAuthorResponseBean = communityAuthorResponseBean2;
            list3 = list5;
            str4 = strDecodeStringElement5;
            list2 = list7;
            num = num5;
            str5 = str8;
            num2 = num4;
            str = str9;
            str6 = strDecodeStringElement3;
        } else {
            int i5 = 18;
            List list8 = null;
            boolean z2 = true;
            int i6 = 0;
            int iDecodeIntElement3 = 0;
            long jDecodeLongElement2 = 0;
            List list9 = null;
            String str10 = null;
            String str11 = null;
            List list10 = null;
            Integer num6 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement8 = null;
            String str12 = null;
            String strDecodeStringElement9 = null;
            CommunityAuthorResponseBean communityAuthorResponseBean3 = null;
            Integer num7 = null;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement2 = false;
            CommunityPostReferencedContentResponseBean communityPostReferencedContentResponseBean3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str7 = str12;
                        num3 = num7;
                        z2 = false;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        str7 = str12;
                        num3 = num7;
                        list4 = list9;
                        i6 |= 1;
                        communityAuthorResponseBean3 = (CommunityAuthorResponseBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, CommunityAuthorResponseBean$$serializer.INSTANCE, communityAuthorResponseBean3);
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        str7 = str12;
                        num3 = num7;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        list4 = list9;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 2:
                        str7 = str12;
                        kSerializerArr = kSerializerArr2;
                        i6 |= 4;
                        list4 = list9;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num7);
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 3:
                        str7 = str12;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        num3 = num7;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 4:
                        str7 = str12;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        num3 = num7;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 5:
                        i6 |= 32;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str12);
                        num3 = num7;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 6:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str10);
                        i6 |= 64;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str7 = str12;
                        num3 = num7;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 7:
                        list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr2[7], list9);
                        i6 |= 128;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str7 = str12;
                        num3 = num7;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 8:
                        i6 |= 256;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, IntSerializer.INSTANCE, num6);
                        str7 = str12;
                        num3 = num7;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 9:
                        i6 |= 512;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr2[9], list10);
                        str7 = str12;
                        num3 = num7;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 10:
                        communityPostReferencedContentResponseBean3 = (CommunityPostReferencedContentResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, INSTANCE, communityPostReferencedContentResponseBean3);
                        i6 |= 1024;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str7 = str12;
                        num3 = num7;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 11:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 11);
                        i6 |= 2048;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str7 = str12;
                        num3 = num7;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 12:
                        i6 |= 4096;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        str7 = str12;
                        num3 = num7;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 13:
                        i6 |= 8192;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, kSerializerArr2[13], list8);
                        str7 = str12;
                        num3 = num7;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 14:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                        i6 |= 16384;
                        i5 = 18;
                        break;
                    case 15:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
                        i6 |= 32768;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str7 = str12;
                        num3 = num7;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 16:
                        i6 |= 65536;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str7 = str12;
                        num3 = num7;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 16);
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 17:
                        i6 |= 131072;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        str7 = str12;
                        num3 = num7;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    case 18:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str11);
                        i6 |= 262144;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str7 = str12;
                        num3 = num7;
                        str12 = str7;
                        num7 = num3;
                        list9 = list4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str10;
            str2 = str11;
            communityPostReferencedContentResponseBean = communityPostReferencedContentResponseBean3;
            list = list10;
            num = num6;
            list2 = list8;
            num2 = num7;
            list3 = list9;
            strDecodeStringElement2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            i = iDecodeIntElement3;
            str4 = strDecodeStringElement8;
            j = jDecodeLongElement2;
            str5 = str12;
            i2 = iDecodeIntElement4;
            z = zDecodeBooleanElement2;
            i3 = i6;
            str6 = strDecodeStringElement9;
            communityAuthorResponseBean = communityAuthorResponseBean3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CommunityPostReferencedContentResponseBean(i3, communityAuthorResponseBean, str6, num2, strDecodeStringElement2, str3, str5, str, list3, num, list, communityPostReferencedContentResponseBean, j, str4, list2, z, i, i2, strDecodeStringElement, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CommunityPostReferencedContentResponseBean communityPostReferencedContentResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(communityPostReferencedContentResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CommunityPostReferencedContentResponseBean.write$Self$OKCRCore_cr_core(communityPostReferencedContentResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
