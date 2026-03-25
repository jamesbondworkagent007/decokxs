package com.okinc.business.invest_biz.data.bean;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class InvestGasPriceConfig$$serializer implements GeneratedSerializer<InvestGasPriceConfig> {
    public static final int $stable;
    public static final InvestGasPriceConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestGasPriceConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestGasPriceConfig$$serializer investGasPriceConfig$$serializer = new InvestGasPriceConfig$$serializer();
        INSTANCE = investGasPriceConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig", investGasPriceConfig$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("investSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("networkFee", true);
        pluginGeneratedSerialDescriptor.addElement("estimateGasFee", true);
        pluginGeneratedSerialDescriptor.addElement("swapSlippage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(InvestSlippageConfig$$serializer.INSTANCE), NetworkFee$$serializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(SwapSlippageConfig$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestGasPriceConfig deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        NetworkFee networkFee;
        InvestSlippageConfig investSlippageConfig;
        SwapSlippageConfig swapSlippageConfig;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            InvestSlippageConfig investSlippageConfig2 = (InvestSlippageConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, InvestSlippageConfig$$serializer.INSTANCE, null);
            NetworkFee networkFee2 = (NetworkFee) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, NetworkFee$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            investSlippageConfig = investSlippageConfig2;
            swapSlippageConfig = (SwapSlippageConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, SwapSlippageConfig$$serializer.INSTANCE, null);
            str = strDecodeStringElement2;
            networkFee = networkFee2;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            NetworkFee networkFee3 = null;
            InvestSlippageConfig investSlippageConfig3 = null;
            SwapSlippageConfig swapSlippageConfig2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    investSlippageConfig3 = (InvestSlippageConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, InvestSlippageConfig$$serializer.INSTANCE, investSlippageConfig3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    networkFee3 = (NetworkFee) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, NetworkFee$$serializer.INSTANCE, networkFee3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    swapSlippageConfig2 = (SwapSlippageConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, SwapSlippageConfig$$serializer.INSTANCE, swapSlippageConfig2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            networkFee = networkFee3;
            investSlippageConfig = investSlippageConfig3;
            swapSlippageConfig = swapSlippageConfig2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestGasPriceConfig(i, investSlippageConfig, networkFee, str, swapSlippageConfig, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestGasPriceConfig.write$Self$OKDeFi_invest_biz(investGasPriceConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
