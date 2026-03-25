package com.okinc.okex.article.bean;

import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.bean.GetSupportRatingBean$$serializer;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class ArticleListResponse$$serializer implements GeneratedSerializer<ArticleListResponse> {
    public static final int $stable;
    public static final ArticleListResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ArticleListResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ArticleListResponse$$serializer articleListResponse$$serializer = new ArticleListResponse$$serializer();
        INSTANCE = articleListResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.article.bean.ArticleListResponse", articleListResponse$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("list", false);
        pluginGeneratedSerialDescriptor.addElement("rating", true);
        pluginGeneratedSerialDescriptor.addElement("pageNum", false);
        pluginGeneratedSerialDescriptor.addElement("pageSize", false);
        pluginGeneratedSerialDescriptor.addElement("total", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{ArticleListResponse.$childSerializers[0], BuiltinSerializersKt.getNullable(GetSupportRatingBean$$serializer.INSTANCE), intSerializer, intSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ArticleListResponse deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        int i;
        GetSupportRatingBean getSupportRatingBean;
        List list;
        int iDecodeIntElement2;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ArticleListResponse.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            GetSupportRatingBean getSupportRatingBean2 = (GetSupportRatingBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, GetSupportRatingBean$$serializer.INSTANCE, null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            list = list2;
            getSupportRatingBean = getSupportRatingBean2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            i = iDecodeIntElement3;
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            i2 = 31;
        } else {
            GetSupportRatingBean getSupportRatingBean3 = null;
            List list3 = null;
            boolean z = true;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int i4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list3);
                    i4 |= 1;
                } else if (iDecodeElementIndex != 1) {
                    if (iDecodeElementIndex == 2) {
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i3 = i4 | 4;
                    } else if (iDecodeElementIndex == 3) {
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i3 = i4 | 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i3 = i4 | 16;
                    }
                    i4 = i3;
                } else {
                    i4 |= 2;
                    getSupportRatingBean3 = (GetSupportRatingBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, GetSupportRatingBean$$serializer.INSTANCE, getSupportRatingBean3);
                }
            }
            iDecodeIntElement = iDecodeIntElement4;
            i = iDecodeIntElement5;
            getSupportRatingBean = getSupportRatingBean3;
            list = list3;
            iDecodeIntElement2 = iDecodeIntElement6;
            i2 = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ArticleListResponse(i2, list, getSupportRatingBean, i, iDecodeIntElement, iDecodeIntElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ArticleListResponse articleListResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(articleListResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ArticleListResponse.write$Self$OKSupport_support_impl(articleListResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
