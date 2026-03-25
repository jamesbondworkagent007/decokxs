package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class RecurringBuyFrequencyResponseBean$$serializer implements GeneratedSerializer<RecurringBuyFrequencyResponseBean> {
    public static final int $stable;
    public static final RecurringBuyFrequencyResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RecurringBuyFrequencyResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RecurringBuyFrequencyResponseBean$$serializer recurringBuyFrequencyResponseBean$$serializer = new RecurringBuyFrequencyResponseBean$$serializer();
        INSTANCE = recurringBuyFrequencyResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyFrequencyResponseBean", recurringBuyFrequencyResponseBean$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("code", false);
        pluginGeneratedSerialDescriptor.addElement("frequency", false);
        pluginGeneratedSerialDescriptor.addElement("localizedName", false);
        pluginGeneratedSerialDescriptor.addElement("nextPurchaseTime", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RecurringBuyFrequencyResponseBean deserialize(@NotNull Decoder decoder) {
        int i;
        String strDecodeStringElement;
        String str;
        String str2;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            i = iDecodeIntElement;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            i2 = 15;
        } else {
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int iDecodeIntElement2 = 0;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i3 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i3 |= 8;
                }
            }
            i = iDecodeIntElement2;
            strDecodeStringElement = strDecodeStringElement4;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            i2 = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecurringBuyFrequencyResponseBean(i2, i, str2, str, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RecurringBuyFrequencyResponseBean recurringBuyFrequencyResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(recurringBuyFrequencyResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecurringBuyFrequencyResponseBean.write$Self$OKCRCore_cr_core(recurringBuyFrequencyResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
