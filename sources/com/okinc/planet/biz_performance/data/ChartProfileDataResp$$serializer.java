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
public final /* synthetic */ class ChartProfileDataResp$$serializer implements GeneratedSerializer<ChartProfileDataResp> {
    public static final int $stable;
    public static final ChartProfileDataResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ChartProfileDataResp$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ChartProfileDataResp$$serializer chartProfileDataResp$$serializer = new ChartProfileDataResp$$serializer();
        INSTANCE = chartProfileDataResp$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.biz_performance.data.ChartProfileDataResp", chartProfileDataResp$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("statTime", false);
        pluginGeneratedSerialDescriptor.addElement("pnl", false);
        pluginGeneratedSerialDescriptor.addElement("pnlRatio", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        C46414tTl c46414tTl = C46414tTl.KWHzl;
        return new KSerializer[]{C46417tTo.KWHzl, c46414tTl, c46414tTl};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ChartProfileDataResp deserialize(@NotNull Decoder decoder) {
        int i;
        long j;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        long jLongValue = 0;
        BigDecimal bigDecimal3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jLongValue2 = ((Number) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, C46417tTo.KWHzl, 0L)).longValue();
            C46414tTl c46414tTl = C46414tTl.KWHzl;
            BigDecimal bigDecimal4 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, c46414tTl, null);
            bigDecimal = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, c46414tTl, null);
            i = 7;
            bigDecimal2 = bigDecimal4;
            j = jLongValue2;
        } else {
            int i2 = 0;
            boolean z = true;
            BigDecimal bigDecimal5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    jLongValue = ((Number) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, C46417tTo.KWHzl, Long.valueOf(jLongValue))).longValue();
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    bigDecimal5 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, C46414tTl.KWHzl, bigDecimal5);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bigDecimal3 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, C46414tTl.KWHzl, bigDecimal3);
                    i2 |= 4;
                }
            }
            i = i2;
            j = jLongValue;
            bigDecimal = bigDecimal3;
            bigDecimal2 = bigDecimal5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChartProfileDataResp(i, j, bigDecimal2, bigDecimal, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ChartProfileDataResp chartProfileDataResp) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(chartProfileDataResp, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ChartProfileDataResp.OLrzqt(chartProfileDataResp, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
