package com.okinc.okex.center.bean;

import com.okinc.okex.center.bean.enums.ContextualScenario;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.bean.GetSupportRatingBean$$serializer;
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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class TxnContextualModel$$serializer implements GeneratedSerializer<TxnContextualModel> {
    public static final int $stable;
    public static final TxnContextualModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TxnContextualModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TxnContextualModel$$serializer txnContextualModel$$serializer = new TxnContextualModel$$serializer();
        INSTANCE = txnContextualModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.center.bean.TxnContextualModel", txnContextualModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("contactInformation", true);
        pluginGeneratedSerialDescriptor.addElement("contextualScenario", true);
        pluginGeneratedSerialDescriptor.addElement("rating", true);
        pluginGeneratedSerialDescriptor.addElement("relatedArticles", true);
        pluginGeneratedSerialDescriptor.addElement("scenarioKey", true);
        pluginGeneratedSerialDescriptor.addElement("selfServiceTools", true);
        pluginGeneratedSerialDescriptor.addElement("transactionInformation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(ContactInfoBean$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ContextualScenarioModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(GetSupportRatingBean$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(RelatedArticleListModel$$serializer.INSTANCE), TxnContextualModel.$childSerializers[4], BuiltinSerializersKt.getNullable(SelfServiceTools$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TransactionBean$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TxnContextualModel deserialize(@NotNull Decoder decoder) {
        ContextualScenario contextualScenario;
        TransactionBean transactionBean;
        SelfServiceTools selfServiceTools;
        int i;
        ContactInfoBean contactInfoBean;
        ContextualScenarioModel contextualScenarioModel;
        RelatedArticleListModel relatedArticleListModel;
        GetSupportRatingBean getSupportRatingBean;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TxnContextualModel.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        ContextualScenario contextualScenario2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ContactInfoBean contactInfoBean2 = (ContactInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ContactInfoBean$$serializer.INSTANCE, null);
            ContextualScenarioModel contextualScenarioModel2 = (ContextualScenarioModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ContextualScenarioModel$$serializer.INSTANCE, null);
            GetSupportRatingBean getSupportRatingBean2 = (GetSupportRatingBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, GetSupportRatingBean$$serializer.INSTANCE, null);
            RelatedArticleListModel relatedArticleListModel2 = (RelatedArticleListModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, RelatedArticleListModel$$serializer.INSTANCE, null);
            ContextualScenario contextualScenario3 = (ContextualScenario) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            SelfServiceTools selfServiceTools2 = (SelfServiceTools) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, SelfServiceTools$$serializer.INSTANCE, null);
            contextualScenario = contextualScenario3;
            contactInfoBean = contactInfoBean2;
            transactionBean = (TransactionBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, TransactionBean$$serializer.INSTANCE, null);
            selfServiceTools = selfServiceTools2;
            relatedArticleListModel = relatedArticleListModel2;
            getSupportRatingBean = getSupportRatingBean2;
            contextualScenarioModel = contextualScenarioModel2;
            i = 127;
        } else {
            int i4 = 0;
            boolean z = true;
            ContextualScenarioModel contextualScenarioModel3 = null;
            TransactionBean transactionBean2 = null;
            SelfServiceTools selfServiceTools3 = null;
            RelatedArticleListModel relatedArticleListModel3 = null;
            GetSupportRatingBean getSupportRatingBean3 = null;
            ContactInfoBean contactInfoBean3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 0:
                        contactInfoBean3 = (ContactInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ContactInfoBean$$serializer.INSTANCE, contactInfoBean3);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 1:
                        contextualScenarioModel3 = (ContextualScenarioModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ContextualScenarioModel$$serializer.INSTANCE, contextualScenarioModel3);
                        i4 |= 2;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 2:
                        getSupportRatingBean3 = (GetSupportRatingBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, GetSupportRatingBean$$serializer.INSTANCE, getSupportRatingBean3);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        relatedArticleListModel3 = (RelatedArticleListModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, RelatedArticleListModel$$serializer.INSTANCE, relatedArticleListModel3);
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 4:
                        i4 |= 16;
                        contextualScenario2 = (ContextualScenario) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], contextualScenario2);
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 5:
                        i4 |= 32;
                        selfServiceTools3 = (SelfServiceTools) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, SelfServiceTools$$serializer.INSTANCE, selfServiceTools3);
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 6:
                        i4 |= 64;
                        transactionBean2 = (TransactionBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, TransactionBean$$serializer.INSTANCE, transactionBean2);
                        i2 = 6;
                        i3 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            ContactInfoBean contactInfoBean4 = contactInfoBean3;
            contextualScenario = contextualScenario2;
            transactionBean = transactionBean2;
            selfServiceTools = selfServiceTools3;
            i = i4;
            contactInfoBean = contactInfoBean4;
            contextualScenarioModel = contextualScenarioModel3;
            GetSupportRatingBean getSupportRatingBean4 = getSupportRatingBean3;
            relatedArticleListModel = relatedArticleListModel3;
            getSupportRatingBean = getSupportRatingBean4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TxnContextualModel(i, contactInfoBean, contextualScenarioModel, getSupportRatingBean, relatedArticleListModel, contextualScenario, selfServiceTools, transactionBean, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TxnContextualModel txnContextualModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(txnContextualModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TxnContextualModel.write$Self$OKSupport_support_impl(txnContextualModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
