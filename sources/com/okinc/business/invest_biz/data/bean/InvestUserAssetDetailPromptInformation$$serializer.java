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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestUserAssetDetailPromptInformation$$serializer implements GeneratedSerializer<InvestUserAssetDetailPromptInformation> {
    public static final int $stable;
    public static final InvestUserAssetDetailPromptInformation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestUserAssetDetailPromptInformation$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestUserAssetDetailPromptInformation$$serializer investUserAssetDetailPromptInformation$$serializer = new InvestUserAssetDetailPromptInformation$$serializer();
        INSTANCE = investUserAssetDetailPromptInformation$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation", investUserAssetDetailPromptInformation$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("investmentNameTip", true);
        pluginGeneratedSerialDescriptor.addElement("totalValueTip", true);
        pluginGeneratedSerialDescriptor.addElement("userAssetTip", true);
        pluginGeneratedSerialDescriptor.addElement("underInvestmentNameTip", true);
        pluginGeneratedSerialDescriptor.addElement("claimTipInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        InvestTipInfoVo$$serializer investTipInfoVo$$serializer = InvestTipInfoVo$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestUserAssetDetailPromptInformation deserialize(@NotNull Decoder decoder) {
        int i;
        InvestTipInfoVo investTipInfoVo;
        InvestTipInfoVo investTipInfoVo2;
        InvestTipInfoVo investTipInfoVo3;
        InvestTipInfoVo investTipInfoVo4;
        InvestTipInfoVo investTipInfoVo5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        InvestTipInfoVo investTipInfoVo6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            InvestTipInfoVo$$serializer investTipInfoVo$$serializer = InvestTipInfoVo$$serializer.INSTANCE;
            InvestTipInfoVo investTipInfoVo7 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, investTipInfoVo$$serializer, null);
            InvestTipInfoVo investTipInfoVo8 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, investTipInfoVo$$serializer, null);
            InvestTipInfoVo investTipInfoVo9 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, investTipInfoVo$$serializer, null);
            InvestTipInfoVo investTipInfoVo10 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, investTipInfoVo$$serializer, null);
            investTipInfoVo2 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, investTipInfoVo$$serializer, null);
            investTipInfoVo3 = investTipInfoVo10;
            i = 31;
            investTipInfoVo = investTipInfoVo9;
            investTipInfoVo5 = investTipInfoVo7;
            investTipInfoVo4 = investTipInfoVo8;
        } else {
            int i2 = 0;
            boolean z = true;
            InvestTipInfoVo investTipInfoVo11 = null;
            InvestTipInfoVo investTipInfoVo12 = null;
            InvestTipInfoVo investTipInfoVo13 = null;
            InvestTipInfoVo investTipInfoVo14 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    investTipInfoVo14 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo14);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    investTipInfoVo13 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo13);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    investTipInfoVo6 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo6);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    investTipInfoVo12 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo12);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    investTipInfoVo11 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo11);
                    i2 |= 16;
                }
            }
            i = i2;
            investTipInfoVo = investTipInfoVo6;
            investTipInfoVo2 = investTipInfoVo11;
            investTipInfoVo3 = investTipInfoVo12;
            investTipInfoVo4 = investTipInfoVo13;
            investTipInfoVo5 = investTipInfoVo14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestUserAssetDetailPromptInformation(i, investTipInfoVo5, investTipInfoVo4, investTipInfoVo, investTipInfoVo3, investTipInfoVo2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investUserAssetDetailPromptInformation, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestUserAssetDetailPromptInformation.write$Self$OKDeFi_invest_biz(investUserAssetDetailPromptInformation, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
