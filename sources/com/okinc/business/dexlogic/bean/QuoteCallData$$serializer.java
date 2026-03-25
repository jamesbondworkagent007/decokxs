package com.okinc.business.dexlogic.bean;

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
public final /* synthetic */ class QuoteCallData$$serializer implements GeneratedSerializer<QuoteCallData> {
    public static final int $stable;
    public static final QuoteCallData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private QuoteCallData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        QuoteCallData$$serializer quoteCallData$$serializer = new QuoteCallData$$serializer();
        INSTANCE = quoteCallData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.QuoteCallData", quoteCallData$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("callDataResult", true);
        pluginGeneratedSerialDescriptor.addElement("quoteResult", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(UnsignedSwapData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(QuotePriceRes$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final QuoteCallData deserialize(@NotNull Decoder decoder) {
        UnsignedSwapData unsignedSwapData;
        QuotePriceRes quotePriceRes;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            unsignedSwapData = (UnsignedSwapData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, UnsignedSwapData$$serializer.INSTANCE, null);
            quotePriceRes = (QuotePriceRes) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, QuotePriceRes$$serializer.INSTANCE, null);
            i = 3;
        } else {
            unsignedSwapData = null;
            QuotePriceRes quotePriceRes2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    unsignedSwapData = (UnsignedSwapData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, UnsignedSwapData$$serializer.INSTANCE, unsignedSwapData);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    quotePriceRes2 = (QuotePriceRes) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, QuotePriceRes$$serializer.INSTANCE, quotePriceRes2);
                    i2 |= 2;
                }
            }
            quotePriceRes = quotePriceRes2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new QuoteCallData(i, unsignedSwapData, quotePriceRes, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull QuoteCallData quoteCallData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(quoteCallData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        QuoteCallData.write$Self$OKDex_dex_impl(quoteCallData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
