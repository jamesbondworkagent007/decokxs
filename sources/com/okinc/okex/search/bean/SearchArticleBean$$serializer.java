package com.okinc.okex.search.bean;

import com.okinc.okex.center.bean.enums.CategorySlug;
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

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class SearchArticleBean$$serializer implements GeneratedSerializer<SearchArticleBean> {
    public static final int $stable;
    public static final SearchArticleBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SearchArticleBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SearchArticleBean$$serializer searchArticleBean$$serializer = new SearchArticleBean$$serializer();
        INSTANCE = searchArticleBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.search.bean.SearchArticleBean", searchArticleBean$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("categoryName", true);
        pluginGeneratedSerialDescriptor.addElement("categorySlug", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("okxLikesNums", true);
        pluginGeneratedSerialDescriptor.addElement("publishTime", true);
        pluginGeneratedSerialDescriptor.addElement("rootSectionId", true);
        pluginGeneratedSerialDescriptor.addElement("sectionSlug", true);
        pluginGeneratedSerialDescriptor.addElement("slug", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("updateTime", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SearchArticleBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(kSerializerArr[1]);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SearchArticleBean deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        Long l;
        int i;
        String str5;
        CategorySlug categorySlug;
        String str6;
        Integer num;
        Long l2;
        String str7;
        String str8;
        Long l3;
        KSerializer[] kSerializerArr;
        CategorySlug categorySlug2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = SearchArticleBean.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 8;
        Long l4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            CategorySlug categorySlug3 = (CategorySlug) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr2[1], null);
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, longSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, longSerializer, null);
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            l = l6;
            str3 = str12;
            str = str11;
            str6 = str10;
            str2 = str13;
            l2 = l5;
            str7 = str9;
            categorySlug = categorySlug3;
            num = num2;
            i = 2047;
        } else {
            int i6 = 0;
            boolean z = true;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            Integer num3 = null;
            String str19 = null;
            CategorySlug categorySlug4 = null;
            Long l7 = null;
            String str20 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 10;
                        i3 = 9;
                        i5 = 8;
                        kSerializerArr2 = kSerializerArr2;
                        break;
                    case 0:
                        str8 = str19;
                        l3 = l7;
                        kSerializerArr = kSerializerArr2;
                        i6 |= 1;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str20);
                        categorySlug2 = categorySlug4;
                        kSerializerArr2 = kSerializerArr;
                        l7 = l3;
                        str19 = str8;
                        categorySlug4 = categorySlug2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 1:
                        str8 = str19;
                        l3 = l7;
                        categorySlug2 = (CategorySlug) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr2[1], categorySlug4);
                        i6 |= 2;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        l7 = l3;
                        str19 = str8;
                        categorySlug4 = categorySlug2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 2:
                        l3 = l7;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str19);
                        i6 |= 4;
                        kSerializerArr = kSerializerArr2;
                        categorySlug2 = categorySlug4;
                        kSerializerArr2 = kSerializerArr;
                        l7 = l3;
                        str19 = str8;
                        categorySlug4 = categorySlug2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 3:
                        l3 = l7;
                        i6 |= 8;
                        kSerializerArr = kSerializerArr2;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num3);
                        str8 = str19;
                        categorySlug2 = categorySlug4;
                        kSerializerArr2 = kSerializerArr;
                        l7 = l3;
                        str19 = str8;
                        categorySlug4 = categorySlug2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 4:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, l7);
                        i6 |= 16;
                        kSerializerArr = kSerializerArr2;
                        str8 = str19;
                        categorySlug2 = categorySlug4;
                        kSerializerArr2 = kSerializerArr;
                        l7 = l3;
                        str19 = str8;
                        categorySlug4 = categorySlug2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 5:
                        i6 |= 32;
                        kSerializerArr = kSerializerArr2;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str18);
                        str8 = str19;
                        categorySlug2 = categorySlug4;
                        l3 = l7;
                        kSerializerArr2 = kSerializerArr;
                        l7 = l3;
                        str19 = str8;
                        categorySlug4 = categorySlug2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 6:
                        i6 |= 64;
                        kSerializerArr = kSerializerArr2;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str14);
                        str8 = str19;
                        categorySlug2 = categorySlug4;
                        l3 = l7;
                        kSerializerArr2 = kSerializerArr;
                        l7 = l3;
                        str19 = str8;
                        categorySlug4 = categorySlug2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 7:
                        i6 |= 128;
                        kSerializerArr = kSerializerArr2;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str16);
                        str8 = str19;
                        categorySlug2 = categorySlug4;
                        l3 = l7;
                        kSerializerArr2 = kSerializerArr;
                        l7 = l3;
                        str19 = str8;
                        categorySlug4 = categorySlug2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 8:
                        i6 |= 256;
                        kSerializerArr = kSerializerArr2;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str15);
                        str8 = str19;
                        categorySlug2 = categorySlug4;
                        l3 = l7;
                        kSerializerArr2 = kSerializerArr;
                        l7 = l3;
                        str19 = str8;
                        categorySlug4 = categorySlug2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 9:
                        i6 |= 512;
                        kSerializerArr = kSerializerArr2;
                        l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, LongSerializer.INSTANCE, l4);
                        str8 = str19;
                        categorySlug2 = categorySlug4;
                        l3 = l7;
                        kSerializerArr2 = kSerializerArr;
                        l7 = l3;
                        str19 = str8;
                        categorySlug4 = categorySlug2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 10:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str17);
                        i6 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str21 = str19;
            CategorySlug categorySlug5 = categorySlug4;
            str = str14;
            str2 = str15;
            str3 = str16;
            str4 = str17;
            l = l4;
            i = i6;
            str5 = str21;
            categorySlug = categorySlug5;
            str6 = str18;
            num = num3;
            l2 = l7;
            str7 = str20;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SearchArticleBean(i, str7, categorySlug, str5, num, l2, str6, str, str3, str2, l, str4, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SearchArticleBean searchArticleBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(searchArticleBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SearchArticleBean.write$Self$OKSupport_support_impl(searchArticleBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
