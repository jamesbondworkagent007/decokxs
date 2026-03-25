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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class IntentBridgeQuoteCallData$$serializer implements GeneratedSerializer<IntentBridgeQuoteCallData> {
    public static final int $stable;
    public static final IntentBridgeQuoteCallData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private IntentBridgeQuoteCallData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        IntentBridgeQuoteCallData$$serializer intentBridgeQuoteCallData$$serializer = new IntentBridgeQuoteCallData$$serializer();
        INSTANCE = intentBridgeQuoteCallData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallData", intentBridgeQuoteCallData$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("quoteResult", true);
        pluginGeneratedSerialDescriptor.addElement("deadline", true);
        pluginGeneratedSerialDescriptor.addElement("unsignedTx", true);
        pluginGeneratedSerialDescriptor.addElement("amountOut", true);
        pluginGeneratedSerialDescriptor.addElement("minimumReceived", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(QuotePriceRes$$serializer.INSTANCE), LongSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final IntentBridgeQuoteCallData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String strDecodeStringElement3;
        QuotePriceRes quotePriceRes;
        int i;
        long j;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            QuotePriceRes quotePriceRes2 = (QuotePriceRes) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, QuotePriceRes$$serializer.INSTANCE, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            quotePriceRes = quotePriceRes2;
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            i = 31;
            j = jDecodeLongElement;
        } else {
            String strDecodeStringElement5 = null;
            int i3 = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement6 = null;
            QuotePriceRes quotePriceRes3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i2 = i3 | 2;
                    } else if (iDecodeElementIndex == 2) {
                        i3 |= 4;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    } else if (iDecodeElementIndex == 3) {
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = i3 | 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = i3 | 16;
                    }
                    i3 = i2;
                } else {
                    quotePriceRes3 = (QuotePriceRes) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, QuotePriceRes$$serializer.INSTANCE, quotePriceRes3);
                    i3 |= 1;
                }
            }
            strDecodeStringElement = strDecodeStringElement5;
            strDecodeStringElement2 = strDecodeStringElement4;
            strDecodeStringElement3 = strDecodeStringElement6;
            quotePriceRes = quotePriceRes3;
            i = i3;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new IntentBridgeQuoteCallData(i, quotePriceRes, j, strDecodeStringElement3, strDecodeStringElement2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull IntentBridgeQuoteCallData intentBridgeQuoteCallData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(intentBridgeQuoteCallData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        IntentBridgeQuoteCallData.write$Self$OKDex_dex_impl(intentBridgeQuoteCallData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
