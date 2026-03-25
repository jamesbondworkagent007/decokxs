package com.okinc.planet.biz_plugin.future.data;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class FilteringStatistics$$serializer implements GeneratedSerializer<FilteringStatistics> {
    public static final int $stable;
    public static final FilteringStatistics$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FilteringStatistics$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FilteringStatistics$$serializer filteringStatistics$$serializer = new FilteringStatistics$$serializer();
        INSTANCE = filteringStatistics$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.biz_plugin.future.data.FilteringStatistics", filteringStatistics$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("originalBuyOrdersCount", false);
        pluginGeneratedSerialDescriptor.addElement("originalSellOrdersCount", false);
        pluginGeneratedSerialDescriptor.addElement("filteredBuyOrdersCount", false);
        pluginGeneratedSerialDescriptor.addElement("filteredSellOrdersCount", false);
        pluginGeneratedSerialDescriptor.addElement("klinePointsCount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, intSerializer, intSerializer, intSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FilteringStatistics deserialize(@NotNull Decoder decoder) {
        int i;
        int iDecodeIntElement;
        int iDecodeIntElement2;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            i = iDecodeIntElement3;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            i2 = iDecodeIntElement5;
            i3 = iDecodeIntElement4;
            i4 = 31;
        } else {
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i5 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i5 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                    i5 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                    i5 |= 16;
                }
            }
            i = iDecodeIntElement6;
            iDecodeIntElement = iDecodeIntElement7;
            iDecodeIntElement2 = iDecodeIntElement8;
            i2 = iDecodeIntElement9;
            i3 = iDecodeIntElement10;
            i4 = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FilteringStatistics(i4, i, i3, i2, iDecodeIntElement, iDecodeIntElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FilteringStatistics filteringStatistics) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(filteringStatistics, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FilteringStatistics.write$Self$OKPlanet_ok_feature_planet_impl(filteringStatistics, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
