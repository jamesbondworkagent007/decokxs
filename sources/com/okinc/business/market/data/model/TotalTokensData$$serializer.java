package com.okinc.business.market.data.model;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class TotalTokensData$$serializer implements GeneratedSerializer<TotalTokensData> {
    public static final int $stable;
    public static final TotalTokensData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TotalTokensData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TotalTokensData$$serializer totalTokensData$$serializer = new TotalTokensData$$serializer();
        INSTANCE = totalTokensData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.TotalTokensData", totalTokensData$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("fallNum", true);
        pluginGeneratedSerialDescriptor.addElement("flatNum", true);
        pluginGeneratedSerialDescriptor.addElement("riseNum", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, intSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TotalTokensData deserialize(@NotNull Decoder decoder) {
        int i;
        int iDecodeIntElement;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            i = iDecodeIntElement2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            i2 = iDecodeIntElement3;
            i3 = 7;
        } else {
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i4 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i4 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i4 |= 4;
                }
            }
            i = iDecodeIntElement4;
            iDecodeIntElement = iDecodeIntElement5;
            i2 = iDecodeIntElement6;
            i3 = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TotalTokensData(i3, i, i2, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TotalTokensData totalTokensData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(totalTokensData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TotalTokensData.AEQbTJ(totalTokensData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
