package com.okinc.planet.biz_performance.data;

import java.math.BigDecimal;
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
import o.C46414tTl;
import o.C46417tTo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ChartProfileCopyTrading$$serializer implements GeneratedSerializer<ChartProfileCopyTrading> {
    public static final int $stable;
    public static final ChartProfileCopyTrading$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ChartProfileCopyTrading$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ChartProfileCopyTrading$$serializer chartProfileCopyTrading$$serializer = new ChartProfileCopyTrading$$serializer();
        INSTANCE = chartProfileCopyTrading$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.biz_performance.data.ChartProfileCopyTrading", chartProfileCopyTrading$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("statTime", false);
        pluginGeneratedSerialDescriptor.addElement("ratio", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C46417tTo.KWHzl, C46414tTl.KWHzl};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ChartProfileCopyTrading deserialize(@NotNull Decoder decoder) {
        BigDecimal bigDecimal;
        int i;
        long jLongValue;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            jLongValue = ((Number) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, C46417tTo.KWHzl, 0L)).longValue();
            bigDecimal = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, C46414tTl.KWHzl, null);
            i = 3;
        } else {
            boolean z = true;
            BigDecimal bigDecimal2 = null;
            long jLongValue2 = 0;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    jLongValue2 = ((Number) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, C46417tTo.KWHzl, Long.valueOf(jLongValue2))).longValue();
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bigDecimal2 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, C46414tTl.KWHzl, bigDecimal2);
                    i2 |= 2;
                }
            }
            bigDecimal = bigDecimal2;
            i = i2;
            jLongValue = jLongValue2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChartProfileCopyTrading(i, jLongValue, bigDecimal, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ChartProfileCopyTrading chartProfileCopyTrading) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(chartProfileCopyTrading, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ChartProfileCopyTrading.copydefault(chartProfileCopyTrading, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
