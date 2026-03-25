package com.okinc.okex.center.ui.displaymodels;

import com.okinc.okex.center.bean.ContextualScenarioModel;
import com.okinc.okex.center.bean.ContextualScenarioModel$$serializer;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class TransactionDisplayModelV2$$serializer implements GeneratedSerializer<TransactionDisplayModelV2> {
    public static final int $stable;
    public static final TransactionDisplayModelV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TransactionDisplayModelV2$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TransactionDisplayModelV2$$serializer transactionDisplayModelV2$$serializer = new TransactionDisplayModelV2$$serializer();
        INSTANCE = transactionDisplayModelV2$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2", transactionDisplayModelV2$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("transaction", true);
        pluginGeneratedSerialDescriptor.addElement("contextualScenario", true);
        pluginGeneratedSerialDescriptor.addElement("selfServiceTools", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(TransactionDisplayModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ContextualScenarioModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TransactionDisplayModelV2.$childSerializers[2])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TransactionDisplayModelV2 deserialize(@NotNull Decoder decoder) {
        int i;
        ContextualScenarioModel contextualScenarioModel;
        List list;
        TransactionDisplayModel transactionDisplayModel;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TransactionDisplayModelV2.$childSerializers;
        ContextualScenarioModel contextualScenarioModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            TransactionDisplayModel transactionDisplayModel2 = (TransactionDisplayModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, TransactionDisplayModel$$serializer.INSTANCE, null);
            ContextualScenarioModel contextualScenarioModel3 = (ContextualScenarioModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ContextualScenarioModel$$serializer.INSTANCE, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            transactionDisplayModel = transactionDisplayModel2;
            contextualScenarioModel = contextualScenarioModel3;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            List list2 = null;
            TransactionDisplayModel transactionDisplayModel3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    transactionDisplayModel3 = (TransactionDisplayModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, TransactionDisplayModel$$serializer.INSTANCE, transactionDisplayModel3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    contextualScenarioModel2 = (ContextualScenarioModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ContextualScenarioModel$$serializer.INSTANCE, contextualScenarioModel2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], list2);
                    i2 |= 4;
                }
            }
            i = i2;
            contextualScenarioModel = contextualScenarioModel2;
            list = list2;
            transactionDisplayModel = transactionDisplayModel3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TransactionDisplayModelV2(i, transactionDisplayModel, contextualScenarioModel, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TransactionDisplayModelV2 transactionDisplayModelV2) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(transactionDisplayModelV2, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TransactionDisplayModelV2.write$Self$OKSupport_support_impl(transactionDisplayModelV2, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
