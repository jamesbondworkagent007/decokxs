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
public final /* synthetic */ class InvestDetailPagePromptInformation$$serializer implements GeneratedSerializer<InvestDetailPagePromptInformation> {
    public static final int $stable;
    public static final InvestDetailPagePromptInformation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestDetailPagePromptInformation$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestDetailPagePromptInformation$$serializer investDetailPagePromptInformation$$serializer = new InvestDetailPagePromptInformation$$serializer();
        INSTANCE = investDetailPagePromptInformation$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation", investDetailPagePromptInformation$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("topBannerTip", true);
        pluginGeneratedSerialDescriptor.addElement("unableToRedeemTip", true);
        pluginGeneratedSerialDescriptor.addElement("unableSubscribeTip", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        InvestTipInfoVo$$serializer investTipInfoVo$$serializer = InvestTipInfoVo$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestDetailPagePromptInformation deserialize(@NotNull Decoder decoder) {
        int i;
        InvestTipInfoVo investTipInfoVo;
        InvestTipInfoVo investTipInfoVo2;
        InvestTipInfoVo investTipInfoVo3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        InvestTipInfoVo investTipInfoVo4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            InvestTipInfoVo$$serializer investTipInfoVo$$serializer = InvestTipInfoVo$$serializer.INSTANCE;
            InvestTipInfoVo investTipInfoVo5 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, investTipInfoVo$$serializer, null);
            InvestTipInfoVo investTipInfoVo6 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, investTipInfoVo$$serializer, null);
            investTipInfoVo2 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, investTipInfoVo$$serializer, null);
            i = 7;
            investTipInfoVo3 = investTipInfoVo5;
            investTipInfoVo = investTipInfoVo6;
        } else {
            int i2 = 0;
            boolean z = true;
            InvestTipInfoVo investTipInfoVo7 = null;
            InvestTipInfoVo investTipInfoVo8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    investTipInfoVo8 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo8);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    investTipInfoVo4 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo4);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    investTipInfoVo7 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo7);
                    i2 |= 4;
                }
            }
            i = i2;
            investTipInfoVo = investTipInfoVo4;
            investTipInfoVo2 = investTipInfoVo7;
            investTipInfoVo3 = investTipInfoVo8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestDetailPagePromptInformation(i, investTipInfoVo3, investTipInfoVo, investTipInfoVo2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestDetailPagePromptInformation investDetailPagePromptInformation) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investDetailPagePromptInformation, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestDetailPagePromptInformation.write$Self$OKDeFi_invest_biz(investDetailPagePromptInformation, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
