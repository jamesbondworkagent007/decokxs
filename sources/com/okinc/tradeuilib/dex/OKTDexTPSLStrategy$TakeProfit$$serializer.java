package com.okinc.tradeuilib.dex;

import com.okinc.dex.DexTPSLLabelType;
import com.okinc.tradeuilib.dex.OKTDexTPSLStrategy;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class OKTDexTPSLStrategy$TakeProfit$$serializer implements GeneratedSerializer<OKTDexTPSLStrategy.TakeProfit> {
    public static final int $stable;
    public static final OKTDexTPSLStrategy$TakeProfit$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKTDexTPSLStrategy$TakeProfit$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKTDexTPSLStrategy$TakeProfit$$serializer oKTDexTPSLStrategy$TakeProfit$$serializer = new OKTDexTPSLStrategy$TakeProfit$$serializer();
        INSTANCE = oKTDexTPSLStrategy$TakeProfit$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("takeProfit", oKTDexTPSLStrategy$TakeProfit$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("priceIncreaseRatio", false);
        pluginGeneratedSerialDescriptor.addElement("sellBuyPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("sellBuyType", false);
        pluginGeneratedSerialDescriptor.addElement("tpSlType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKTDexTPSLStrategy.TakeProfit.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, kSerializerArr[2], kSerializerArr[3]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKTDexTPSLStrategy.TakeProfit deserialize(@NotNull Decoder decoder) {
        int i;
        DexTPSLLabelType dexTPSLLabelType;
        DexTPSLLabelType dexTPSLLabelType2;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OKTDexTPSLStrategy.TakeProfit.$childSerializers;
        DexTPSLLabelType dexTPSLLabelType3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            DexTPSLLabelType dexTPSLLabelType4 = (DexTPSLLabelType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            dexTPSLLabelType2 = (DexTPSLLabelType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            str2 = strDecodeStringElement;
            str = strDecodeStringElement2;
            i = 15;
            dexTPSLLabelType = dexTPSLLabelType4;
        } else {
            int i2 = 0;
            boolean z = true;
            DexTPSLLabelType dexTPSLLabelType5 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    dexTPSLLabelType3 = (DexTPSLLabelType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], dexTPSLLabelType3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    dexTPSLLabelType5 = (DexTPSLLabelType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], dexTPSLLabelType5);
                    i2 |= 8;
                }
            }
            i = i2;
            dexTPSLLabelType = dexTPSLLabelType3;
            dexTPSLLabelType2 = dexTPSLLabelType5;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKTDexTPSLStrategy.TakeProfit(i, str2, str, dexTPSLLabelType, dexTPSLLabelType2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKTDexTPSLStrategy.TakeProfit takeProfit) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(takeProfit, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKTDexTPSLStrategy.TakeProfit.EZpvd(takeProfit, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
