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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class SpotlightArticle$$serializer implements GeneratedSerializer<SpotlightArticle> {
    public static final int $stable;
    public static final SpotlightArticle$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SpotlightArticle$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SpotlightArticle$$serializer spotlightArticle$$serializer = new SpotlightArticle$$serializer();
        INSTANCE = spotlightArticle$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.biz_content.leaderboard.bean.SpotlightArticle", spotlightArticle$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("contentId", true);
        pluginGeneratedSerialDescriptor.addElement("author", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("translatedContent", true);
        pluginGeneratedSerialDescriptor.addElement("imageList", true);
        pluginGeneratedSerialDescriptor.addElement("publishTime", true);
        pluginGeneratedSerialDescriptor.addElement("likeCount", true);
        pluginGeneratedSerialDescriptor.addElement("viewCount", true);
        pluginGeneratedSerialDescriptor.addElement("orderTag", true);
        pluginGeneratedSerialDescriptor.addElement("tokens", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SpotlightArticle.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(SpotlightAuthor$$serializer.INSTANCE);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(kSerializerArr[4]);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[9])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SpotlightArticle deserialize(@NotNull Decoder decoder) {
        String str;
        SpotlightAuthor spotlightAuthor;
        Long l;
        String str2;
        List list;
        String str3;
        String str4;
        Long l2;
        int i;
        String str5;
        List list2;
        SpotlightAuthor spotlightAuthor2;
        List list3;
        String str6;
        List list4;
        SpotlightAuthor spotlightAuthor3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SpotlightArticle.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 8;
        int i5 = 9;
        Long l3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            SpotlightAuthor spotlightAuthor4 = (SpotlightAuthor) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, SpotlightAuthor$$serializer.INSTANCE, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, longSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, longSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            i = 1023;
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            str2 = str11;
            l = l5;
            l2 = l4;
            str5 = str10;
            spotlightAuthor = spotlightAuthor4;
            str3 = str9;
            str = str8;
            str4 = str7;
        } else {
            int i6 = 0;
            boolean z = true;
            Long l6 = null;
            String str12 = null;
            str = null;
            List list5 = null;
            String str13 = null;
            String str14 = null;
            SpotlightAuthor spotlightAuthor5 = null;
            List list6 = null;
            String str15 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        spotlightAuthor2 = spotlightAuthor5;
                        list3 = list6;
                        str6 = str15;
                        z = false;
                        list6 = list3;
                        spotlightAuthor5 = spotlightAuthor2;
                        str15 = str6;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 0:
                        list4 = list6;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str15);
                        i6 |= 1;
                        spotlightAuthor3 = spotlightAuthor5;
                        spotlightAuthor5 = spotlightAuthor3;
                        list6 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 1:
                        list4 = list6;
                        spotlightAuthor3 = (SpotlightAuthor) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, SpotlightAuthor$$serializer.INSTANCE, spotlightAuthor5);
                        i6 |= 2;
                        spotlightAuthor5 = spotlightAuthor3;
                        list6 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 2:
                        list4 = list6;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str);
                        i6 |= 4;
                        spotlightAuthor3 = spotlightAuthor5;
                        spotlightAuthor5 = spotlightAuthor3;
                        list6 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 3:
                        list4 = list6;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str14);
                        i6 |= 8;
                        spotlightAuthor3 = spotlightAuthor5;
                        spotlightAuthor5 = spotlightAuthor3;
                        list6 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 4:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], list6);
                        i6 |= 16;
                        spotlightAuthor3 = spotlightAuthor5;
                        list4 = list6;
                        spotlightAuthor5 = spotlightAuthor3;
                        list6 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 5:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str13);
                        i6 |= 32;
                        spotlightAuthor3 = spotlightAuthor5;
                        list4 = list6;
                        spotlightAuthor5 = spotlightAuthor3;
                        list6 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 6:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, LongSerializer.INSTANCE, l3);
                        i6 |= 64;
                        spotlightAuthor3 = spotlightAuthor5;
                        list4 = list6;
                        spotlightAuthor5 = spotlightAuthor3;
                        list6 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 7:
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, LongSerializer.INSTANCE, l6);
                        i6 |= 128;
                        spotlightAuthor3 = spotlightAuthor5;
                        list4 = list6;
                        spotlightAuthor5 = spotlightAuthor3;
                        list6 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 8:
                        i6 |= 256;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str12);
                        spotlightAuthor3 = spotlightAuthor5;
                        list4 = list6;
                        spotlightAuthor5 = spotlightAuthor3;
                        list6 = list4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 9:
                        i6 |= 512;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr[i5], list5);
                        spotlightAuthor2 = spotlightAuthor5;
                        list3 = list6;
                        str6 = str15;
                        list6 = list3;
                        spotlightAuthor5 = spotlightAuthor2;
                        str15 = str6;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            spotlightAuthor = spotlightAuthor5;
            l = l6;
            str2 = str12;
            list = list5;
            str3 = str14;
            str4 = str15;
            l2 = l3;
            i = i6;
            str5 = str13;
            list2 = list6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SpotlightArticle(i, str4, spotlightAuthor, str, str3, list2, str5, l2, l, str2, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SpotlightArticle spotlightArticle) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(spotlightArticle, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SpotlightArticle.write$Self$OKPlanet_ok_feature_planet_impl(spotlightArticle, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
