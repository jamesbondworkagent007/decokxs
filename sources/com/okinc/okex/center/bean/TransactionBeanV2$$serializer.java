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
public final /* synthetic */ class TransactionBeanV2$$serializer implements GeneratedSerializer<TransactionBeanV2> {
    public static final int $stable;
    public static final TransactionBeanV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TransactionBeanV2$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TransactionBeanV2$$serializer transactionBeanV2$$serializer = new TransactionBeanV2$$serializer();
        INSTANCE = transactionBeanV2$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.center.bean.TransactionBeanV2", transactionBeanV2$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("transaction", true);
        pluginGeneratedSerialDescriptor.addElement("contextualScenario", true);
        pluginGeneratedSerialDescriptor.addElement("selfServiceTools", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(TransactionBean$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ContextualScenarioModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(SelfServiceTools$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TransactionBeanV2 deserialize(@NotNull Decoder decoder) {
        int i;
        ContextualScenarioModel contextualScenarioModel;
        TransactionBean transactionBean;
        SelfServiceTools selfServiceTools;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        ContextualScenarioModel contextualScenarioModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            TransactionBean transactionBean2 = (TransactionBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, TransactionBean$$serializer.INSTANCE, null);
            ContextualScenarioModel contextualScenarioModel3 = (ContextualScenarioModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ContextualScenarioModel$$serializer.INSTANCE, null);
            transactionBean = transactionBean2;
            selfServiceTools = (SelfServiceTools) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SelfServiceTools$$serializer.INSTANCE, null);
            contextualScenarioModel = contextualScenarioModel3;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            TransactionBean transactionBean3 = null;
            SelfServiceTools selfServiceTools2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    transactionBean3 = (TransactionBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, TransactionBean$$serializer.INSTANCE, transactionBean3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    contextualScenarioModel2 = (ContextualScenarioModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ContextualScenarioModel$$serializer.INSTANCE, contextualScenarioModel2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    selfServiceTools2 = (SelfServiceTools) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SelfServiceTools$$serializer.INSTANCE, selfServiceTools2);
                    i2 |= 4;
                }
            }
            i = i2;
            contextualScenarioModel = contextualScenarioModel2;
            transactionBean = transactionBean3;
            selfServiceTools = selfServiceTools2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TransactionBeanV2(i, transactionBean, contextualScenarioModel, selfServiceTools, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TransactionBeanV2 transactionBeanV2) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(transactionBeanV2, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TransactionBeanV2.write$Self$OKSupport_support_impl(transactionBeanV2, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
