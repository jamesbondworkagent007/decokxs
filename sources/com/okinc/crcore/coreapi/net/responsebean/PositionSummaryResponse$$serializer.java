package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class PositionSummaryResponse$$serializer implements GeneratedSerializer<PositionSummaryResponse> {
    public static final int $stable;
    public static final PositionSummaryResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PositionSummaryResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PositionSummaryResponse$$serializer positionSummaryResponse$$serializer = new PositionSummaryResponse$$serializer();
        INSTANCE = positionSummaryResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.PositionSummaryResponse", positionSummaryResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("orders", false);
        pluginGeneratedSerialDescriptor.addElement("positions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{OrderSummary$$serializer.INSTANCE, PositionSummary$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PositionSummaryResponse deserialize(@NotNull Decoder decoder) {
        OrderSummary orderSummary;
        PositionSummary positionSummary;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            orderSummary = (OrderSummary) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, OrderSummary$$serializer.INSTANCE, null);
            positionSummary = (PositionSummary) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PositionSummary$$serializer.INSTANCE, null);
            i = 3;
        } else {
            orderSummary = null;
            PositionSummary positionSummary2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    orderSummary = (OrderSummary) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, OrderSummary$$serializer.INSTANCE, orderSummary);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    positionSummary2 = (PositionSummary) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PositionSummary$$serializer.INSTANCE, positionSummary2);
                    i2 |= 2;
                }
            }
            positionSummary = positionSummary2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PositionSummaryResponse(i, orderSummary, positionSummary, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PositionSummaryResponse positionSummaryResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(positionSummaryResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PositionSummaryResponse.write$Self$OKCRCore_cr_core(positionSummaryResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
