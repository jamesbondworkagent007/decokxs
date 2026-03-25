package com.okinc.business.dex.trade.copytrading.home.data;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class StrategyPnLData$$serializer implements GeneratedSerializer<StrategyPnLData> {
    public static final int $stable;
    public static final StrategyPnLData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private StrategyPnLData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        StrategyPnLData$$serializer strategyPnLData$$serializer = new StrategyPnLData$$serializer();
        INSTANCE = strategyPnLData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.copytrading.home.data.StrategyPnLData", strategyPnLData$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("buyCountDelta", false);
        pluginGeneratedSerialDescriptor.addElement("buyUsdValueDelta", false);
        pluginGeneratedSerialDescriptor.addElement("sellCountDelta", false);
        pluginGeneratedSerialDescriptor.addElement("sellUsdValueDelta", false);
        pluginGeneratedSerialDescriptor.addElement("realizedPnLUsd", false);
        pluginGeneratedSerialDescriptor.addElement("unrealizedPnLUsd", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, doubleSerializer, intSerializer, doubleSerializer, doubleSerializer, doubleSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final StrategyPnLData deserialize(@NotNull Decoder decoder) {
        int i;
        double dDecodeDoubleElement;
        int i2;
        int i3;
        double d;
        double d2;
        double dDecodeDoubleElement2;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            double dDecodeDoubleElement3 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 1);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            double dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 3);
            dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 4);
            i3 = iDecodeIntElement2;
            d2 = dDecodeDoubleElement4;
            dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
            i2 = iDecodeIntElement;
            i = 63;
            d = dDecodeDoubleElement3;
        } else {
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            boolean z = true;
            double dDecodeDoubleElement5 = 0.0d;
            double dDecodeDoubleElement6 = 0.0d;
            double dDecodeDoubleElement7 = 0.0d;
            double dDecodeDoubleElement8 = 0.0d;
            i = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i |= 1;
                        continue;
                    case 1:
                        dDecodeDoubleElement5 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 1);
                        i4 = i | 2;
                        break;
                    case 2:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i4 = i | 4;
                        break;
                    case 3:
                        dDecodeDoubleElement6 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 3);
                        i4 = i | 8;
                        break;
                    case 4:
                        dDecodeDoubleElement8 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 4);
                        i4 = i | 16;
                        break;
                    case 5:
                        dDecodeDoubleElement7 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
                        i4 = i | 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                i = i4;
            }
            dDecodeDoubleElement = dDecodeDoubleElement7;
            double d3 = dDecodeDoubleElement8;
            i2 = iDecodeIntElement3;
            double d4 = dDecodeDoubleElement5;
            i3 = iDecodeIntElement4;
            d = d4;
            d2 = dDecodeDoubleElement6;
            dDecodeDoubleElement2 = d3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StrategyPnLData(i, i2, d, i3, d2, dDecodeDoubleElement2, dDecodeDoubleElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull StrategyPnLData strategyPnLData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(strategyPnLData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StrategyPnLData.OLrzqt(strategyPnLData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
