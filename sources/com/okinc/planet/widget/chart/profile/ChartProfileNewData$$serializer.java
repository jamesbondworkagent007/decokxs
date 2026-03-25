package com.okinc.planet.widget.chart.profile;

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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class ChartProfileNewData$$serializer implements GeneratedSerializer<ChartProfileNewData> {
    public static final int $stable;
    public static final ChartProfileNewData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ChartProfileNewData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ChartProfileNewData$$serializer chartProfileNewData$$serializer = new ChartProfileNewData$$serializer();
        INSTANCE = chartProfileNewData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.widget.chart.profile.ChartProfileNewData", chartProfileNewData$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("statTime", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("pnl", false);
        pluginGeneratedSerialDescriptor.addElement("pnlRatio", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        C46414tTl c46414tTl = C46414tTl.KWHzl;
        return new KSerializer[]{C46417tTo.KWHzl, c46414tTl, c46414tTl, c46414tTl};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ChartProfileNewData deserialize(@NotNull Decoder decoder) {
        int i;
        long j;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        long jLongValue = 0;
        BigDecimal bigDecimal4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jLongValue2 = ((Number) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, C46417tTo.KWHzl, 0L)).longValue();
            C46414tTl c46414tTl = C46414tTl.KWHzl;
            BigDecimal bigDecimal5 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, c46414tTl, null);
            BigDecimal bigDecimal6 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, c46414tTl, null);
            bigDecimal2 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, c46414tTl, null);
            i = 15;
            bigDecimal = bigDecimal6;
            bigDecimal3 = bigDecimal5;
            j = jLongValue2;
        } else {
            int i2 = 0;
            boolean z = true;
            BigDecimal bigDecimal7 = null;
            BigDecimal bigDecimal8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    jLongValue = ((Number) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, C46417tTo.KWHzl, Long.valueOf(jLongValue))).longValue();
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    bigDecimal8 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, C46414tTl.KWHzl, bigDecimal8);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    bigDecimal4 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, C46414tTl.KWHzl, bigDecimal4);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bigDecimal7 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, C46414tTl.KWHzl, bigDecimal7);
                    i2 |= 8;
                }
            }
            i = i2;
            j = jLongValue;
            bigDecimal = bigDecimal4;
            bigDecimal2 = bigDecimal7;
            bigDecimal3 = bigDecimal8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChartProfileNewData(i, j, bigDecimal3, bigDecimal, bigDecimal2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ChartProfileNewData chartProfileNewData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(chartProfileNewData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ChartProfileNewData.copydefault(chartProfileNewData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
