package com.okinc.planet.biz_plugin;

import com.okinc.tradeshare.api.TradeKLineBar;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class ChartTimeframeConfig$$serializer implements GeneratedSerializer<ChartTimeframeConfig> {
    public static final int $stable;
    public static final ChartTimeframeConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ChartTimeframeConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ChartTimeframeConfig$$serializer chartTimeframeConfig$$serializer = new ChartTimeframeConfig$$serializer();
        INSTANCE = chartTimeframeConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.biz_plugin.ChartTimeframeConfig", chartTimeframeConfig$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("tradeAgeSinceEntry", false);
        pluginGeneratedSerialDescriptor.addElement("chartTimeframe", false);
        pluginGeneratedSerialDescriptor.addElement("intervalMinutes", false);
        pluginGeneratedSerialDescriptor.addElement("approximateDataPoints", false);
        pluginGeneratedSerialDescriptor.addElement("startTimestamp", false);
        pluginGeneratedSerialDescriptor.addElement("endTimestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ChartTimeframeConfig.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, kSerializerArr[2], IntSerializer.INSTANCE, longSerializer, longSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ChartTimeframeConfig deserialize(@NotNull Decoder decoder) {
        int i;
        long jDecodeLongElement;
        int iDecodeIntElement;
        String str;
        TradeKLineBar tradeKLineBar;
        String str2;
        long jDecodeLongElement2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ChartTimeframeConfig.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            TradeKLineBar tradeKLineBar2 = (TradeKLineBar) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            tradeKLineBar = tradeKLineBar2;
            str2 = strDecodeStringElement;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            str = strDecodeStringElement2;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            i = 63;
        } else {
            TradeKLineBar tradeKLineBar3 = null;
            String strDecodeStringElement3 = null;
            int i2 = 0;
            boolean z = true;
            long jDecodeLongElement3 = 0;
            int iDecodeIntElement2 = 0;
            long jDecodeLongElement4 = 0;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        i2 |= 4;
                        tradeKLineBar3 = (TradeKLineBar) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], tradeKLineBar3);
                        break;
                    case 3:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            jDecodeLongElement = jDecodeLongElement3;
            TradeKLineBar tradeKLineBar4 = tradeKLineBar3;
            iDecodeIntElement = iDecodeIntElement2;
            long j = jDecodeLongElement4;
            str = strDecodeStringElement4;
            tradeKLineBar = tradeKLineBar4;
            str2 = strDecodeStringElement3;
            jDecodeLongElement2 = j;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChartTimeframeConfig(i, str2, str, tradeKLineBar, iDecodeIntElement, jDecodeLongElement2, jDecodeLongElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ChartTimeframeConfig chartTimeframeConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(chartTimeframeConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ChartTimeframeConfig.write$Self$OKPlanet_ok_feature_planet_impl(chartTimeframeConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
