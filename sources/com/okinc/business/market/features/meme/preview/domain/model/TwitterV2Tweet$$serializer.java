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
public final /* synthetic */ class TwitterV2Tweet$$serializer implements GeneratedSerializer<TwitterV2Tweet> {
    public static final int $stable;
    public static final TwitterV2Tweet$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TwitterV2Tweet$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TwitterV2Tweet$$serializer twitterV2Tweet$$serializer = new TwitterV2Tweet$$serializer();
        INSTANCE = twitterV2Tweet$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Tweet", twitterV2Tweet$$serializer, 23);
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
        pluginGeneratedSerialDescriptor.addElement("inReplyToScreenName", true);
        pluginGeneratedSerialDescriptor.addElement("inReplyToStatusIdStr", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TwitterV2Tweet.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[3], BuiltinSerializersKt.getNullable(TwitterV2Entities$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), longSerializer, kSerializerArr[8], longSerializer, BuiltinSerializersKt.getNullable(TwitterV2QuotedTweet$$serializer.INSTANCE), kSerializerArr[11], longSerializer, longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(TwitterV2User$$serializer.INSTANCE), longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TwitterV2Tweet deserialize(@NotNull Decoder decoder) {
        int i;
        TwitterReferenceType twitterReferenceType;
        TwitterV2QuotedTweet twitterV2QuotedTweet;
        String str;
        String str2;
        String str3;
        List list;
        String str4;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long jDecodeLongElement;
        String str5;
        String str6;
        List list2;
        String str7;
        String str8;
        String str9;
        String str10;
        TwitterV2User twitterV2User;
        TwitterV2Entities twitterV2Entities;
        String str11;
        List list3;
        int i2;
        String str12;
        String str13;
        List list4;
        TwitterV2Entities twitterV2Entities2;
        List list5;
        String str14;
        String str15;
        String str16;
        KSerializer[] kSerializerArr;
        String str17;
        String str18;
        String str19;
        String str20;
        List list6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = TwitterV2Tweet.$childSerializers;
        String str21 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            List list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr2[3], null);
            TwitterV2Entities twitterV2Entities3 = (TwitterV2Entities) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, TwitterV2Entities$$serializer.INSTANCE, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            List list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr2[8], null);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
            TwitterV2QuotedTweet twitterV2QuotedTweet2 = (TwitterV2QuotedTweet) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, TwitterV2QuotedTweet$$serializer.INSTANCE, null);
            TwitterReferenceType twitterReferenceType2 = (TwitterReferenceType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr2[11], null);
            long jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 12);
            long jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            twitterReferenceType = twitterReferenceType2;
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            TwitterV2User twitterV2User2 = (TwitterV2User) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, TwitterV2User$$serializer.INSTANCE, null);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 20);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, null);
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, null);
            str6 = str30;
            j2 = jDecodeLongElement3;
            str = str26;
            twitterV2QuotedTweet = twitterV2QuotedTweet2;
            j3 = jDecodeLongElement5;
            str3 = str24;
            str5 = str22;
            twitterV2User = twitterV2User2;
            str9 = str29;
            list = list8;
            list2 = list7;
            j4 = jDecodeLongElement2;
            j5 = jDecodeLongElement6;
            str11 = str25;
            i = 8388607;
            str2 = str28;
            str7 = str27;
            j = jDecodeLongElement4;
            str8 = str23;
            twitterV2Entities = twitterV2Entities3;
        } else {
            String str31 = null;
            String str32 = null;
            TwitterReferenceType twitterReferenceType3 = null;
            TwitterV2QuotedTweet twitterV2QuotedTweet3 = null;
            String str33 = null;
            TwitterV2User twitterV2User3 = null;
            String str34 = null;
            String str35 = null;
            List list9 = null;
            TwitterV2Entities twitterV2Entities4 = null;
            List list10 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            int i3 = 0;
            boolean z = true;
            long jDecodeLongElement7 = 0;
            long jDecodeLongElement8 = 0;
            long jDecodeLongElement9 = 0;
            long jDecodeLongElement10 = 0;
            long jDecodeLongElement11 = 0;
            long jDecodeLongElement12 = 0;
            String str39 = null;
            String str40 = null;
            while (z) {
                String str41 = str31;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str12 = str21;
                        str13 = str32;
                        list4 = list9;
                        twitterV2Entities2 = twitterV2Entities4;
                        list5 = list10;
                        str14 = str36;
                        str15 = str38;
                        str16 = str41;
                        kSerializerArr = kSerializerArr2;
                        z = false;
                        str17 = str14;
                        str31 = str16;
                        str36 = str17;
                        list10 = list5;
                        str38 = str15;
                        str32 = str13;
                        list9 = list4;
                        str21 = str12;
                        kSerializerArr2 = kSerializerArr;
                        twitterV2Entities4 = twitterV2Entities2;
                        break;
                    case 0:
                        str12 = str21;
                        str13 = str32;
                        list4 = list9;
                        twitterV2Entities2 = twitterV2Entities4;
                        list5 = list10;
                        str14 = str36;
                        str15 = str38;
                        str16 = str41;
                        kSerializerArr = kSerializerArr2;
                        jDecodeLongElement10 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i3 |= 1;
                        str17 = str14;
                        str31 = str16;
                        str36 = str17;
                        list10 = list5;
                        str38 = str15;
                        str32 = str13;
                        list9 = list4;
                        str21 = str12;
                        kSerializerArr2 = kSerializerArr;
                        twitterV2Entities4 = twitterV2Entities2;
                        break;
                    case 1:
                        str12 = str21;
                        str13 = str32;
                        list4 = list9;
                        TwitterV2Entities twitterV2Entities5 = twitterV2Entities4;
                        list5 = list10;
                        str14 = str36;
                        str15 = str38;
                        str16 = str41;
                        kSerializerArr = kSerializerArr2;
                        twitterV2Entities2 = twitterV2Entities5;
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str37);
                        i3 |= 2;
                        str17 = str14;
                        str31 = str16;
                        str36 = str17;
                        list10 = list5;
                        str38 = str15;
                        str32 = str13;
                        list9 = list4;
                        str21 = str12;
                        kSerializerArr2 = kSerializerArr;
                        twitterV2Entities4 = twitterV2Entities2;
                        break;
                    case 2:
                        str12 = str21;
                        str13 = str32;
                        list4 = list9;
                        TwitterV2Entities twitterV2Entities6 = twitterV2Entities4;
                        str15 = str38;
                        str16 = str41;
                        kSerializerArr = kSerializerArr2;
                        list5 = list10;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str36);
                        i3 |= 4;
                        twitterV2Entities2 = twitterV2Entities6;
                        str14 = str36;
                        str17 = str14;
                        str31 = str16;
                        str36 = str17;
                        list10 = list5;
                        str38 = str15;
                        str32 = str13;
                        list9 = list4;
                        str21 = str12;
                        kSerializerArr2 = kSerializerArr;
                        twitterV2Entities4 = twitterV2Entities2;
                        break;
                    case 3:
                        str12 = str21;
                        str13 = str32;
                        list4 = list9;
                        TwitterV2Entities twitterV2Entities7 = twitterV2Entities4;
                        str15 = str38;
                        str16 = str41;
                        kSerializerArr = kSerializerArr2;
                        i3 |= 8;
                        twitterV2Entities2 = twitterV2Entities7;
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr2[3], list10);
                        str14 = str36;
                        str17 = str14;
                        str31 = str16;
                        str36 = str17;
                        list10 = list5;
                        str38 = str15;
                        str32 = str13;
                        list9 = list4;
                        str21 = str12;
                        kSerializerArr2 = kSerializerArr;
                        twitterV2Entities4 = twitterV2Entities2;
                        break;
                    case 4:
                        str12 = str21;
                        str13 = str32;
                        list4 = list9;
                        str18 = str41;
                        twitterV2Entities4 = (TwitterV2Entities) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, TwitterV2Entities$$serializer.INSTANCE, twitterV2Entities4);
                        i3 |= 16;
                        str19 = str38;
                        str15 = str19;
                        str31 = str18;
                        twitterV2Entities2 = twitterV2Entities4;
                        list5 = list10;
                        kSerializerArr = kSerializerArr2;
                        str17 = str36;
                        str36 = str17;
                        list10 = list5;
                        str38 = str15;
                        str32 = str13;
                        list9 = list4;
                        str21 = str12;
                        kSerializerArr2 = kSerializerArr;
                        twitterV2Entities4 = twitterV2Entities2;
                        break;
                    case 5:
                        str12 = str21;
                        list4 = list9;
                        str18 = str41;
                        str13 = str32;
                        i3 |= 32;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str38);
                        str15 = str19;
                        str31 = str18;
                        twitterV2Entities2 = twitterV2Entities4;
                        list5 = list10;
                        kSerializerArr = kSerializerArr2;
                        str17 = str36;
                        str36 = str17;
                        list10 = list5;
                        str38 = str15;
                        str32 = str13;
                        list9 = list4;
                        str21 = str12;
                        kSerializerArr2 = kSerializerArr;
                        twitterV2Entities4 = twitterV2Entities2;
                        break;
                    case 6:
                        str12 = str21;
                        list4 = list9;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str41);
                        i3 |= 64;
                        str13 = str32;
                        twitterV2Entities2 = twitterV2Entities4;
                        list5 = list10;
                        str15 = str38;
                        kSerializerArr = kSerializerArr2;
                        str17 = str36;
                        str36 = str17;
                        list10 = list5;
                        str38 = str15;
                        str32 = str13;
                        list9 = list4;
                        str21 = str12;
                        kSerializerArr2 = kSerializerArr;
                        twitterV2Entities4 = twitterV2Entities2;
                        break;
                    case 7:
                        str20 = str21;
                        list6 = list9;
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
                        i3 |= 128;
                        list9 = list6;
                        str21 = str20;
                        str31 = str41;
                        break;
                    case 8:
                        str20 = str21;
                        i3 |= 256;
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr2[8], list9);
                        list9 = list6;
                        str21 = str20;
                        str31 = str41;
                        break;
                    case 9:
                        list3 = list9;
                        jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
                        i3 |= 512;
                        str31 = str41;
                        list9 = list3;
                        break;
                    case 10:
                        list3 = list9;
                        i3 |= 1024;
                        twitterV2QuotedTweet3 = (TwitterV2QuotedTweet) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, TwitterV2QuotedTweet$$serializer.INSTANCE, twitterV2QuotedTweet3);
                        str31 = str41;
                        list9 = list3;
                        break;
                    case 11:
                        list3 = list9;
                        i3 |= 2048;
                        twitterReferenceType3 = (TwitterReferenceType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr2[11], twitterReferenceType3);
                        str31 = str41;
                        list9 = list3;
                        break;
                    case 12:
                        list3 = list9;
                        jDecodeLongElement9 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 12);
                        i3 |= 4096;
                        str31 = str41;
                        list9 = list3;
                        break;
                    case 13:
                        list3 = list9;
                        jDecodeLongElement11 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
                        i3 |= 8192;
                        str31 = str41;
                        list9 = list3;
                        break;
                    case 14:
                        list3 = list9;
                        i3 |= 16384;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str32);
                        str31 = str41;
                        list9 = list3;
                        break;
                    case 15:
                        list3 = list9;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str40);
                        i2 = 32768;
                        i3 |= i2;
                        str31 = str41;
                        list9 = list3;
                        break;
                    case 16:
                        list3 = list9;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str34);
                        i2 = 65536;
                        i3 |= i2;
                        str31 = str41;
                        list9 = list3;
                        break;
                    case 17:
                        list3 = list9;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, str35);
                        i2 = 131072;
                        i3 |= i2;
                        str31 = str41;
                        list9 = list3;
                        break;
                    case 18:
                        list3 = list9;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, str39);
                        i2 = 262144;
                        i3 |= i2;
                        str31 = str41;
                        list9 = list3;
                        break;
                    case 19:
                        list3 = list9;
                        twitterV2User3 = (TwitterV2User) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, TwitterV2User$$serializer.INSTANCE, twitterV2User3);
                        i2 = 524288;
                        i3 |= i2;
                        str31 = str41;
                        list9 = list3;
                        break;
                    case 20:
                        jDecodeLongElement12 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 20);
                        i3 |= 1048576;
                        str20 = str21;
                        list6 = list9;
                        list9 = list6;
                        str21 = str20;
                        str31 = str41;
                        break;
                    case 21:
                        list3 = list9;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, str33);
                        i2 = 2097152;
                        i3 |= i2;
                        str31 = str41;
                        list9 = list3;
                        break;
                    case 22:
                        list3 = list9;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, str21);
                        i2 = 4194304;
                        i3 |= i2;
                        str31 = str41;
                        list9 = list3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str42 = str32;
            i = i3;
            twitterReferenceType = twitterReferenceType3;
            twitterV2QuotedTweet = twitterV2QuotedTweet3;
            str = str40;
            str2 = str35;
            str3 = str31;
            list = list9;
            str4 = str21;
            j = jDecodeLongElement7;
            j2 = jDecodeLongElement8;
            j3 = jDecodeLongElement9;
            j4 = jDecodeLongElement10;
            j5 = jDecodeLongElement11;
            jDecodeLongElement = jDecodeLongElement12;
            str5 = str36;
            str6 = str33;
            list2 = list10;
            str7 = str34;
            str8 = str38;
            str9 = str39;
            str10 = str37;
            twitterV2User = twitterV2User3;
            twitterV2Entities = twitterV2Entities4;
            str11 = str42;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TwitterV2Tweet(i, j4, str10, str5, list2, twitterV2Entities, str8, str3, j2, list, j, twitterV2QuotedTweet, twitterReferenceType, j3, j5, str11, str, str7, str2, str9, twitterV2User, jDecodeLongElement, str6, str4, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TwitterV2Tweet twitterV2Tweet) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(twitterV2Tweet, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TwitterV2Tweet.write$Self$OKDex_dex_impl(twitterV2Tweet, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
