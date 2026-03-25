package com.okinc.okex.center.bean;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class RecommendationSection$$serializer implements GeneratedSerializer<RecommendationSection> {
    public static final int $stable;
    public static final RecommendationSection$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RecommendationSection$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RecommendationSection$$serializer recommendationSection$$serializer = new RecommendationSection$$serializer();
        INSTANCE = recommendationSection$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.center.bean.RecommendationSection", recommendationSection$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("recommendationCard", true);
        pluginGeneratedSerialDescriptor.addElement("selfServiceTools", true);
        pluginGeneratedSerialDescriptor.addElement("relatedArticles", true);
        pluginGeneratedSerialDescriptor.addElement("transaction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(RecommendationCard$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(SelfServiceTools$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(RelatedArticleListModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TransactionBean$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RecommendationSection deserialize(@NotNull Decoder decoder) {
        int i;
        RelatedArticleListModel relatedArticleListModel;
        SelfServiceTools selfServiceTools;
        RecommendationCard recommendationCard;
        TransactionBean transactionBean;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        RelatedArticleListModel relatedArticleListModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            RecommendationCard recommendationCard2 = (RecommendationCard) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, RecommendationCard$$serializer.INSTANCE, null);
            SelfServiceTools selfServiceTools2 = (SelfServiceTools) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, SelfServiceTools$$serializer.INSTANCE, null);
            RelatedArticleListModel relatedArticleListModel3 = (RelatedArticleListModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, RelatedArticleListModel$$serializer.INSTANCE, null);
            recommendationCard = recommendationCard2;
            transactionBean = (TransactionBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, TransactionBean$$serializer.INSTANCE, null);
            relatedArticleListModel = relatedArticleListModel3;
            selfServiceTools = selfServiceTools2;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            SelfServiceTools selfServiceTools3 = null;
            RecommendationCard recommendationCard3 = null;
            TransactionBean transactionBean2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    recommendationCard3 = (RecommendationCard) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, RecommendationCard$$serializer.INSTANCE, recommendationCard3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    selfServiceTools3 = (SelfServiceTools) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, SelfServiceTools$$serializer.INSTANCE, selfServiceTools3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    relatedArticleListModel2 = (RelatedArticleListModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, RelatedArticleListModel$$serializer.INSTANCE, relatedArticleListModel2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    transactionBean2 = (TransactionBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, TransactionBean$$serializer.INSTANCE, transactionBean2);
                    i2 |= 8;
                }
            }
            i = i2;
            relatedArticleListModel = relatedArticleListModel2;
            selfServiceTools = selfServiceTools3;
            recommendationCard = recommendationCard3;
            transactionBean = transactionBean2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecommendationSection(i, recommendationCard, selfServiceTools, relatedArticleListModel, transactionBean, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RecommendationSection recommendationSection) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(recommendationSection, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecommendationSection.write$Self$OKSupport_support_impl(recommendationSection, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
