package com.okinc.okex.center.bean;

import com.okinc.p2p.api.OtcRouteConst;
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
public final /* synthetic */ class ContextualScenarios$$serializer implements GeneratedSerializer<ContextualScenarios> {
    public static final int $stable;
    public static final ContextualScenarios$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ContextualScenarios$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ContextualScenarios$$serializer contextualScenarios$$serializer = new ContextualScenarios$$serializer();
        INSTANCE = contextualScenarios$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.center.bean.ContextualScenarios", contextualScenarios$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("deposit", true);
        pluginGeneratedSerialDescriptor.addElement(OtcRouteConst.P2P, true);
        pluginGeneratedSerialDescriptor.addElement("withdraw", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        TxnContextualModel$$serializer txnContextualModel$$serializer = TxnContextualModel$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(txnContextualModel$$serializer), BuiltinSerializersKt.getNullable(txnContextualModel$$serializer), BuiltinSerializersKt.getNullable(txnContextualModel$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ContextualScenarios deserialize(@NotNull Decoder decoder) {
        int i;
        TxnContextualModel txnContextualModel;
        TxnContextualModel txnContextualModel2;
        TxnContextualModel txnContextualModel3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        TxnContextualModel txnContextualModel4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            TxnContextualModel$$serializer txnContextualModel$$serializer = TxnContextualModel$$serializer.INSTANCE;
            TxnContextualModel txnContextualModel5 = (TxnContextualModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, txnContextualModel$$serializer, null);
            TxnContextualModel txnContextualModel6 = (TxnContextualModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, txnContextualModel$$serializer, null);
            txnContextualModel2 = (TxnContextualModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, txnContextualModel$$serializer, null);
            i = 7;
            txnContextualModel3 = txnContextualModel5;
            txnContextualModel = txnContextualModel6;
        } else {
            int i2 = 0;
            boolean z = true;
            TxnContextualModel txnContextualModel7 = null;
            TxnContextualModel txnContextualModel8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    txnContextualModel8 = (TxnContextualModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, TxnContextualModel$$serializer.INSTANCE, txnContextualModel8);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    txnContextualModel4 = (TxnContextualModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, TxnContextualModel$$serializer.INSTANCE, txnContextualModel4);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    txnContextualModel7 = (TxnContextualModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TxnContextualModel$$serializer.INSTANCE, txnContextualModel7);
                    i2 |= 4;
                }
            }
            i = i2;
            txnContextualModel = txnContextualModel4;
            txnContextualModel2 = txnContextualModel7;
            txnContextualModel3 = txnContextualModel8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ContextualScenarios(i, txnContextualModel3, txnContextualModel, txnContextualModel2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ContextualScenarios contextualScenarios) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(contextualScenarios, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ContextualScenarios.write$Self$OKSupport_support_impl(contextualScenarios, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
