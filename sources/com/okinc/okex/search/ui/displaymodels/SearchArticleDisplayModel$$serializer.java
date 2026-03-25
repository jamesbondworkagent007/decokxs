package com.okinc.okex.search.ui.displaymodels;

import com.okinc.okex.center.bean.enums.CategorySlug;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class SearchArticleDisplayModel$$serializer implements GeneratedSerializer<SearchArticleDisplayModel> {
    public static final int $stable;
    public static final SearchArticleDisplayModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SearchArticleDisplayModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SearchArticleDisplayModel$$serializer searchArticleDisplayModel$$serializer = new SearchArticleDisplayModel$$serializer();
        INSTANCE = searchArticleDisplayModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.search.ui.displaymodels.SearchArticleDisplayModel", searchArticleDisplayModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("url", false);
        pluginGeneratedSerialDescriptor.addElement("slug", false);
        pluginGeneratedSerialDescriptor.addElement("publishTime", false);
        pluginGeneratedSerialDescriptor.addElement("updateTime", false);
        pluginGeneratedSerialDescriptor.addElement("okxLikesNums", false);
        pluginGeneratedSerialDescriptor.addElement("categoryName", false);
        pluginGeneratedSerialDescriptor.addElement("categorySlug", false);
        pluginGeneratedSerialDescriptor.addElement("sectionId", false);
        pluginGeneratedSerialDescriptor.addElement("sectionName", false);
        pluginGeneratedSerialDescriptor.addElement("sectionSlug", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SearchArticleDisplayModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, longSerializer, longSerializer, IntSerializer.INSTANCE, stringSerializer, kSerializerArr[7], stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SearchArticleDisplayModel deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        CategorySlug categorySlug;
        String str;
        String str2;
        String strDecodeStringElement2;
        String str3;
        String str4;
        long j;
        long j2;
        int i;
        int i2;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SearchArticleDisplayModel.$childSerializers;
        int i3 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            CategorySlug categorySlug2 = (CategorySlug) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            categorySlug = categorySlug2;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            str2 = strDecodeStringElement8;
            str5 = strDecodeStringElement6;
            i = iDecodeIntElement;
            str = strDecodeStringElement7;
            strDecodeStringElement = strDecodeStringElement5;
            str3 = strDecodeStringElement4;
            j = jDecodeLongElement;
            j2 = jDecodeLongElement2;
            str4 = strDecodeStringElement3;
            i2 = 2047;
        } else {
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            int i4 = 0;
            CategorySlug categorySlug3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 10;
                        break;
                    case 0:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 10;
                        break;
                    case 1:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        i4 |= 4;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i4 |= 32;
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        break;
                    case 7:
                        categorySlug3 = (CategorySlug) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], categorySlug3);
                        i4 |= 128;
                        break;
                    case 8:
                        i4 |= 256;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        break;
                    case 9:
                        i4 |= 512;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        break;
                    case 10:
                        i4 |= 1024;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            categorySlug = categorySlug3;
            str = strDecodeStringElement14;
            str2 = strDecodeStringElement9;
            strDecodeStringElement2 = strDecodeStringElement10;
            str3 = strDecodeStringElement11;
            str4 = strDecodeStringElement12;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement4;
            i = iDecodeIntElement2;
            i2 = i4;
            str5 = strDecodeStringElement13;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SearchArticleDisplayModel(i2, str4, str3, strDecodeStringElement, j, j2, i, str5, categorySlug, str, str2, strDecodeStringElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SearchArticleDisplayModel searchArticleDisplayModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(searchArticleDisplayModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SearchArticleDisplayModel.write$Self$OKSupport_support_impl(searchArticleDisplayModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
