package com.okinc.business.finance_api.bean;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class Rate$$serializer implements GeneratedSerializer<Rate> {
    public static final int $stable;
    public static final Rate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Rate$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Rate$$serializer rate$$serializer = new Rate$$serializer();
        INSTANCE = rate$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.finance_api.bean.Rate", rate$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("dataDate", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.END, true);
        pluginGeneratedSerialDescriptor.addElement("rate", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.START, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(DoubleSerializer.INSTANCE), BuiltinSerializersKt.getNullable(longSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Rate deserialize(@NotNull Decoder decoder) {
        int i;
        Double d;
        Long l;
        Long l2;
        Long l3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Double d2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, longSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            Double d3 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.INSTANCE, null);
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            i = 15;
            d = d3;
            l3 = l4;
            l2 = l5;
        } else {
            int i2 = 0;
            boolean z = true;
            Long l6 = null;
            Long l7 = null;
            Long l8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l8);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l7);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    d2 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.INSTANCE, d2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, l6);
                    i2 |= 8;
                }
            }
            i = i2;
            d = d2;
            l = l6;
            l2 = l7;
            l3 = l8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Rate(i, l3, l2, d, l, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Rate rate) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(rate, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Rate.write$Self$OKFinance_finance_api(rate, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
