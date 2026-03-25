package com.okinc.okex.article.bean;

import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.center.bean.enums.TopCategory;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class SupportFaqArticle$$serializer implements GeneratedSerializer<SupportFaqArticle> {
    public static final int $stable;
    public static final SupportFaqArticle$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SupportFaqArticle$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SupportFaqArticle$$serializer supportFaqArticle$$serializer = new SupportFaqArticle$$serializer();
        INSTANCE = supportFaqArticle$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.article.bean.SupportFaqArticle", supportFaqArticle$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("slug", true);
        pluginGeneratedSerialDescriptor.addElement("categoryName", true);
        pluginGeneratedSerialDescriptor.addElement("categorySlug", true);
        pluginGeneratedSerialDescriptor.addElement("sectionSlug", true);
        pluginGeneratedSerialDescriptor.addElement("topCategory", true);
        pluginGeneratedSerialDescriptor.addElement("publishTime", true);
        pluginGeneratedSerialDescriptor.addElement("updateTime", true);
        pluginGeneratedSerialDescriptor.addElement("okxLikesNums", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SupportFaqArticle.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(kSerializerArr[4]);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(kSerializerArr[6]);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SupportFaqArticle deserialize(@NotNull Decoder decoder) {
        TopCategory topCategory;
        String str;
        Long l;
        Integer num;
        Long l2;
        String str2;
        String str3;
        int i;
        CategorySlug categorySlug;
        String str4;
        String str5;
        String str6;
        CategorySlug categorySlug2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SupportFaqArticle.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 8;
        int i5 = 6;
        Long l3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            categorySlug = (CategorySlug) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            TopCategory topCategory2 = (TopCategory) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, longSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            i = 1023;
            topCategory = topCategory2;
            str3 = str11;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, null);
            l = l4;
            l2 = l5;
            str = str8;
            str4 = str10;
            str5 = str9;
            str2 = str7;
        } else {
            int i6 = 0;
            boolean z = true;
            Long l6 = null;
            Integer num2 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            topCategory = null;
            String str15 = null;
            CategorySlug categorySlug3 = null;
            String str16 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str6 = str15;
                        categorySlug2 = categorySlug3;
                        z = false;
                        categorySlug3 = categorySlug2;
                        str15 = str6;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 0:
                        str6 = str15;
                        categorySlug2 = categorySlug3;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str16);
                        i6 |= 1;
                        categorySlug3 = categorySlug2;
                        str15 = str6;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 1:
                        categorySlug2 = categorySlug3;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str15);
                        i6 |= 2;
                        str6 = str15;
                        categorySlug3 = categorySlug2;
                        str15 = str6;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 2:
                        categorySlug2 = categorySlug3;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str13);
                        i6 |= 4;
                        str6 = str15;
                        categorySlug3 = categorySlug2;
                        str15 = str6;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 3:
                        categorySlug2 = categorySlug3;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str12);
                        i6 |= 8;
                        str6 = str15;
                        categorySlug3 = categorySlug2;
                        str15 = str6;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 4:
                        categorySlug3 = (CategorySlug) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], categorySlug3);
                        i6 |= 16;
                        str6 = str15;
                        categorySlug2 = categorySlug3;
                        categorySlug3 = categorySlug2;
                        str15 = str6;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 5:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str14);
                        i6 |= 32;
                        str6 = str15;
                        categorySlug2 = categorySlug3;
                        categorySlug3 = categorySlug2;
                        str15 = str6;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 6:
                        topCategory = (TopCategory) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr[i5], topCategory);
                        i6 |= 64;
                        str6 = str15;
                        categorySlug2 = categorySlug3;
                        categorySlug3 = categorySlug2;
                        str15 = str6;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 7:
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, LongSerializer.INSTANCE, l6);
                        i6 |= 128;
                        str6 = str15;
                        categorySlug2 = categorySlug3;
                        categorySlug3 = categorySlug2;
                        str15 = str6;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    case 8:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, LongSerializer.INSTANCE, l3);
                        i6 |= 256;
                        break;
                    case 9:
                        i6 |= 512;
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IntSerializer.INSTANCE, num2);
                        str6 = str15;
                        categorySlug2 = categorySlug3;
                        categorySlug3 = categorySlug2;
                        str15 = str6;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str15;
            l = l6;
            num = num2;
            l2 = l3;
            str2 = str16;
            str3 = str14;
            i = i6;
            categorySlug = categorySlug3;
            String str17 = str13;
            str4 = str12;
            str5 = str17;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SupportFaqArticle(i, str2, str, str5, str4, categorySlug, str3, topCategory, l, l2, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SupportFaqArticle supportFaqArticle) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(supportFaqArticle, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SupportFaqArticle.write$Self$OKSupport_support_impl(supportFaqArticle, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
