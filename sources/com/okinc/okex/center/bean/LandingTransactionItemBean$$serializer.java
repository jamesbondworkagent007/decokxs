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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class LandingTransactionItemBean$$serializer implements GeneratedSerializer<LandingTransactionItemBean> {
    public static final int $stable;
    public static final LandingTransactionItemBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LandingTransactionItemBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LandingTransactionItemBean$$serializer landingTransactionItemBean$$serializer = new LandingTransactionItemBean$$serializer();
        INSTANCE = landingTransactionItemBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.center.bean.LandingTransactionItemBean", landingTransactionItemBean$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("contextualScenario", true);
        pluginGeneratedSerialDescriptor.addElement("selfServiceTools", true);
        pluginGeneratedSerialDescriptor.addElement("transaction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(ContextualScenarioModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(SelfServiceTools$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TransactionBean$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LandingTransactionItemBean deserialize(@NotNull Decoder decoder) {
        int i;
        SelfServiceTools selfServiceTools;
        ContextualScenarioModel contextualScenarioModel;
        TransactionBean transactionBean;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        SelfServiceTools selfServiceTools2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ContextualScenarioModel contextualScenarioModel2 = (ContextualScenarioModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ContextualScenarioModel$$serializer.INSTANCE, null);
            SelfServiceTools selfServiceTools3 = (SelfServiceTools) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, SelfServiceTools$$serializer.INSTANCE, null);
            contextualScenarioModel = contextualScenarioModel2;
            transactionBean = (TransactionBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TransactionBean$$serializer.INSTANCE, null);
            selfServiceTools = selfServiceTools3;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            ContextualScenarioModel contextualScenarioModel3 = null;
            TransactionBean transactionBean2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    contextualScenarioModel3 = (ContextualScenarioModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ContextualScenarioModel$$serializer.INSTANCE, contextualScenarioModel3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    selfServiceTools2 = (SelfServiceTools) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, SelfServiceTools$$serializer.INSTANCE, selfServiceTools2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    transactionBean2 = (TransactionBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TransactionBean$$serializer.INSTANCE, transactionBean2);
                    i2 |= 4;
                }
            }
            i = i2;
            selfServiceTools = selfServiceTools2;
            contextualScenarioModel = contextualScenarioModel3;
            transactionBean = transactionBean2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LandingTransactionItemBean(i, contextualScenarioModel, selfServiceTools, transactionBean, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LandingTransactionItemBean landingTransactionItemBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(landingTransactionItemBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LandingTransactionItemBean.write$Self$OKSupport_support_impl(landingTransactionItemBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
