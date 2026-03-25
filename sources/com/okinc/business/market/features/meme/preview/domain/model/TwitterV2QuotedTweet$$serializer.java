package com.okinc.business.market.features.meme.preview.domain.model;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class TwitterV2QuotedTweet$$serializer implements GeneratedSerializer<TwitterV2QuotedTweet> {
    public static final int $stable;
    public static final TwitterV2QuotedTweet$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TwitterV2QuotedTweet$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TwitterV2QuotedTweet$$serializer twitterV2QuotedTweet$$serializer = new TwitterV2QuotedTweet$$serializer();
        INSTANCE = twitterV2QuotedTweet$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.meme.preview.domain.model.TwitterV2QuotedTweet", twitterV2QuotedTweet$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement("bookmarkCount", true);
        pluginGeneratedSerialDescriptor.addElement("contentId", true);
        pluginGeneratedSerialDescriptor.addElement("createdAt", true);
        pluginGeneratedSerialDescriptor.addElement("displayTextRange", true);
        pluginGeneratedSerialDescriptor.addElement("entities", true);
        pluginGeneratedSerialDescriptor.addElement("idStr", true);
        pluginGeneratedSerialDescriptor.addElement("lang", true);
        pluginGeneratedSerialDescriptor.addElement("likeCount", true);
        pluginGeneratedSerialDescriptor.addElement("mediaDetails", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCount", true);
        pluginGeneratedSerialDescriptor.addElement("quotedTweet", true);
        pluginGeneratedSerialDescriptor.addElement("referencedType", true);
        pluginGeneratedSerialDescriptor.addElement("replyCount", true);
        pluginGeneratedSerialDescriptor.addElement("retweetCount", true);
        pluginGeneratedSerialDescriptor.addElement("sourceLanguage", true);
        pluginGeneratedSerialDescriptor.addElement("text", true);
        pluginGeneratedSerialDescriptor.addElement("translatedLanguage", true);
        pluginGeneratedSerialDescriptor.addElement("translatedText", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("viewCount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TwitterV2QuotedTweet.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[3], BuiltinSerializersKt.getNullable(TwitterV2Entities$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), longSerializer, kSerializerArr[8], longSerializer, BuiltinSerializersKt.getNullable(INSTANCE), kSerializerArr[11], longSerializer, longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(TwitterV2User$$serializer.INSTANCE), longSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TwitterV2QuotedTweet deserialize(@NotNull Decoder decoder) {
        String str;
        TwitterV2Entities twitterV2Entities;
        String str2;
        TwitterV2QuotedTweet twitterV2QuotedTweet;
        String str3;
        String str4;
        String str5;
        TwitterV2User twitterV2User;
        String str6;
        TwitterReferenceType twitterReferenceType;
        String str7;
        String str8;
        List list;
        List list2;
        String str9;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long jDecodeLongElement;
        int i;
        String str10;
        String str11;
        int i2;
        String str12;
        List list3;
        List list4;
        String str13;
        TwitterV2Entities twitterV2Entities2;
        String str14;
        String str15;
        KSerializer[] kSerializerArr;
        String str16;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = TwitterV2QuotedTweet.$childSerializers;
        int i3 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr2[3], null);
            TwitterV2Entities twitterV2Entities3 = (TwitterV2Entities) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, TwitterV2Entities$$serializer.INSTANCE, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            List list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr2[8], null);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
            TwitterV2QuotedTweet twitterV2QuotedTweet2 = (TwitterV2QuotedTweet) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, INSTANCE, null);
            TwitterReferenceType twitterReferenceType2 = (TwitterReferenceType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr2[11], null);
            long jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 12);
            long jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            twitterV2User = (TwitterV2User) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, TwitterV2User$$serializer.INSTANCE, null);
            twitterV2QuotedTweet = twitterV2QuotedTweet2;
            str = str17;
            str3 = str25;
            str7 = str24;
            str9 = str23;
            str4 = str22;
            str6 = str19;
            twitterV2Entities = twitterV2Entities3;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 20);
            str2 = str21;
            str8 = str18;
            list = list5;
            twitterReferenceType = twitterReferenceType2;
            j5 = jDecodeLongElement6;
            str5 = str20;
            j3 = jDecodeLongElement5;
            list2 = list6;
            j2 = jDecodeLongElement3;
            j4 = jDecodeLongElement2;
            j = jDecodeLongElement4;
            i = 2097151;
        } else {
            int i4 = 20;
            String str26 = null;
            List list7 = null;
            String str27 = null;
            TwitterV2QuotedTweet twitterV2QuotedTweet3 = null;
            TwitterV2User twitterV2User2 = null;
            TwitterReferenceType twitterReferenceType3 = null;
            String str28 = null;
            List list8 = null;
            String str29 = null;
            TwitterV2Entities twitterV2Entities4 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            boolean z = true;
            long jDecodeLongElement7 = 0;
            long jDecodeLongElement8 = 0;
            long jDecodeLongElement9 = 0;
            long jDecodeLongElement10 = 0;
            long jDecodeLongElement11 = 0;
            long jDecodeLongElement12 = 0;
            String str33 = null;
            int i5 = 0;
            String str34 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str12 = str26;
                        list3 = list7;
                        list4 = list8;
                        str13 = str29;
                        twitterV2Entities2 = twitterV2Entities4;
                        str14 = str30;
                        str15 = str32;
                        kSerializerArr = kSerializerArr2;
                        str16 = str31;
                        z = false;
                        str31 = str16;
                        str32 = str15;
                        str29 = str13;
                        str30 = str14;
                        list8 = list4;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 20;
                        i3 = 9;
                        twitterV2Entities4 = twitterV2Entities2;
                        str26 = str12;
                        break;
                    case 0:
                        str12 = str26;
                        list3 = list7;
                        list4 = list8;
                        str13 = str29;
                        twitterV2Entities2 = twitterV2Entities4;
                        str14 = str30;
                        str15 = str32;
                        kSerializerArr = kSerializerArr2;
                        jDecodeLongElement10 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i5 |= 1;
                        str32 = str15;
                        str29 = str13;
                        str30 = str14;
                        list8 = list4;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 20;
                        i3 = 9;
                        twitterV2Entities4 = twitterV2Entities2;
                        str26 = str12;
                        break;
                    case 1:
                        str12 = str26;
                        list3 = list7;
                        list4 = list8;
                        str13 = str29;
                        twitterV2Entities2 = twitterV2Entities4;
                        str15 = str32;
                        kSerializerArr = kSerializerArr2;
                        str14 = str30;
                        i5 |= 2;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str31);
                        str32 = str15;
                        str29 = str13;
                        str30 = str14;
                        list8 = list4;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 20;
                        i3 = 9;
                        twitterV2Entities4 = twitterV2Entities2;
                        str26 = str12;
                        break;
                    case 2:
                        str12 = str26;
                        list3 = list7;
                        str13 = str29;
                        twitterV2Entities2 = twitterV2Entities4;
                        str15 = str32;
                        kSerializerArr = kSerializerArr2;
                        list4 = list8;
                        i5 |= 4;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str30);
                        str32 = str15;
                        str29 = str13;
                        str30 = str14;
                        list8 = list4;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 20;
                        i3 = 9;
                        twitterV2Entities4 = twitterV2Entities2;
                        str26 = str12;
                        break;
                    case 3:
                        str12 = str26;
                        list3 = list7;
                        str13 = str29;
                        twitterV2Entities2 = twitterV2Entities4;
                        str15 = str32;
                        kSerializerArr = kSerializerArr2;
                        i5 |= 8;
                        list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr2[3], list8);
                        str14 = str30;
                        str32 = str15;
                        str29 = str13;
                        str30 = str14;
                        list8 = list4;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 20;
                        i3 = 9;
                        twitterV2Entities4 = twitterV2Entities2;
                        str26 = str12;
                        break;
                    case 4:
                        str12 = str26;
                        str13 = str29;
                        str15 = str32;
                        list3 = list7;
                        TwitterV2Entities twitterV2Entities5 = (TwitterV2Entities) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, TwitterV2Entities$$serializer.INSTANCE, twitterV2Entities4);
                        i5 |= 16;
                        kSerializerArr = kSerializerArr2;
                        twitterV2Entities2 = twitterV2Entities5;
                        list4 = list8;
                        str14 = str30;
                        str16 = str31;
                        str31 = str16;
                        str32 = str15;
                        str29 = str13;
                        str30 = str14;
                        list8 = list4;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 20;
                        i3 = 9;
                        twitterV2Entities4 = twitterV2Entities2;
                        str26 = str12;
                        break;
                    case 5:
                        str10 = str32;
                        str11 = str26;
                        i5 |= 32;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str29);
                        str32 = str10;
                        str26 = str11;
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 6:
                        i5 |= 64;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str32);
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 7:
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
                        i5 |= 128;
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 8:
                        i5 |= 256;
                        list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr2[8], list7);
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 9:
                        jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i3);
                        i5 |= 512;
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 10:
                        twitterV2QuotedTweet3 = (TwitterV2QuotedTweet) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, INSTANCE, twitterV2QuotedTweet3);
                        i5 |= 1024;
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 11:
                        i5 |= 2048;
                        twitterReferenceType3 = (TwitterReferenceType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr2[11], twitterReferenceType3);
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 12:
                        jDecodeLongElement9 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 12);
                        i5 |= 4096;
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 13:
                        jDecodeLongElement11 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
                        i5 |= 8192;
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 14:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str27);
                        i5 |= 16384;
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 15:
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str33);
                        i2 = 32768;
                        i5 |= i2;
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 16:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str26);
                        i2 = 65536;
                        i5 |= i2;
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 17:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, str28);
                        i2 = 131072;
                        i5 |= i2;
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 18:
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, str34);
                        i2 = 262144;
                        i5 |= i2;
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 19:
                        twitterV2User2 = (TwitterV2User) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, TwitterV2User$$serializer.INSTANCE, twitterV2User2);
                        i2 = 524288;
                        i5 |= i2;
                        i4 = 20;
                        i3 = 9;
                        break;
                    case 20:
                        jDecodeLongElement12 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i4);
                        i5 |= 1048576;
                        str11 = str26;
                        str10 = str32;
                        str32 = str10;
                        str26 = str11;
                        i4 = 20;
                        i3 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list9 = list8;
            String str35 = str30;
            str = str31;
            twitterV2Entities = twitterV2Entities4;
            str2 = str27;
            twitterV2QuotedTweet = twitterV2QuotedTweet3;
            str3 = str34;
            str4 = str33;
            str5 = str32;
            twitterV2User = twitterV2User2;
            str6 = str29;
            twitterReferenceType = twitterReferenceType3;
            str7 = str28;
            str8 = str35;
            list = list9;
            list2 = list7;
            str9 = str26;
            j = jDecodeLongElement7;
            j2 = jDecodeLongElement8;
            j3 = jDecodeLongElement9;
            j4 = jDecodeLongElement10;
            j5 = jDecodeLongElement11;
            jDecodeLongElement = jDecodeLongElement12;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TwitterV2QuotedTweet(i, j4, str, str8, list, twitterV2Entities, str6, str5, j2, list2, j, twitterV2QuotedTweet, twitterReferenceType, j3, j5, str2, str4, str9, str7, str3, twitterV2User, jDecodeLongElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TwitterV2QuotedTweet twitterV2QuotedTweet) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(twitterV2QuotedTweet, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TwitterV2QuotedTweet.write$Self$OKDex_dex_impl(twitterV2QuotedTweet, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
