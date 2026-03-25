package com.okinc.planet.biz_content.leaderboard.bean;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class NewsFlashArticle$$serializer implements GeneratedSerializer<NewsFlashArticle> {
    public static final int $stable;
    public static final NewsFlashArticle$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NewsFlashArticle$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NewsFlashArticle$$serializer newsFlashArticle$$serializer = new NewsFlashArticle$$serializer();
        INSTANCE = newsFlashArticle$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.biz_content.leaderboard.bean.NewsFlashArticle", newsFlashArticle$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("contentId", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("translatedTitle", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("translatedContent", true);
        pluginGeneratedSerialDescriptor.addElement("publishTime", true);
        pluginGeneratedSerialDescriptor.addElement("tokens", true);
        pluginGeneratedSerialDescriptor.addElement("mentionDetail", true);
        pluginGeneratedSerialDescriptor.addElement("orderTag", true);
        pluginGeneratedSerialDescriptor.addElement("important", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = NewsFlashArticle.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[6]), BuiltinSerializersKt.getNullable(NewsFlashMentionDetail$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NewsFlashArticle deserialize(@NotNull Decoder decoder) {
        NewsFlashMentionDetail newsFlashMentionDetail;
        String str;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        String str5;
        List list;
        String str6;
        String str7;
        int i;
        String str8;
        String str9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = NewsFlashArticle.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 8;
        int i5 = 6;
        String str10 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            NewsFlashMentionDetail newsFlashMentionDetail2 = (NewsFlashMentionDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, NewsFlashMentionDetail$$serializer.INSTANCE, null);
            i = 1023;
            list = list2;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, null);
            newsFlashMentionDetail = newsFlashMentionDetail2;
            str6 = str16;
            str = str13;
            str5 = str12;
            str4 = str15;
            str7 = str11;
            str3 = str14;
        } else {
            int i6 = 0;
            boolean z = true;
            List list3 = null;
            String str17 = null;
            NewsFlashMentionDetail newsFlashMentionDetail3 = null;
            String str18 = null;
            Boolean bool2 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str8 = str20;
                        str9 = str21;
                        z = false;
                        str21 = str9;
                        str20 = str8;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 0:
                        str8 = str20;
                        str9 = str21;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str22);
                        i6 |= 1;
                        str21 = str9;
                        str20 = str8;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 1:
                        str9 = str21;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str20);
                        i6 |= 2;
                        str21 = str9;
                        str20 = str8;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 2:
                        str9 = str21;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str18);
                        i6 |= 4;
                        str8 = str20;
                        str21 = str9;
                        str20 = str8;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 3:
                        str9 = str21;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str19);
                        i6 |= 8;
                        str8 = str20;
                        str21 = str9;
                        str20 = str8;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 4:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str21);
                        i6 |= 16;
                        str8 = str20;
                        str9 = str21;
                        str21 = str9;
                        str20 = str8;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 5:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str17);
                        i6 |= 32;
                        str8 = str20;
                        str9 = str21;
                        str21 = str9;
                        str20 = str8;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 6:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr[i5], list3);
                        i6 |= 64;
                        str8 = str20;
                        str9 = str21;
                        str21 = str9;
                        str20 = str8;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 7:
                        newsFlashMentionDetail3 = (NewsFlashMentionDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, NewsFlashMentionDetail$$serializer.INSTANCE, newsFlashMentionDetail3);
                        i6 |= 128;
                        str8 = str20;
                        str9 = str21;
                        str21 = str9;
                        str20 = str8;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 8:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str10);
                        i6 |= 256;
                        break;
                    case 9:
                        i6 |= 512;
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool2);
                        str8 = str20;
                        str9 = str21;
                        str21 = str9;
                        str20 = str8;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str23 = str20;
            newsFlashMentionDetail = newsFlashMentionDetail3;
            str = str18;
            bool = bool2;
            str2 = str10;
            str3 = str19;
            str4 = str21;
            str5 = str23;
            list = list3;
            str6 = str17;
            str7 = str22;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NewsFlashArticle(i, str7, str5, str, str3, str4, str6, list, newsFlashMentionDetail, str2, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NewsFlashArticle newsFlashArticle) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(newsFlashArticle, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NewsFlashArticle.write$Self$OKPlanet_ok_feature_planet_impl(newsFlashArticle, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
