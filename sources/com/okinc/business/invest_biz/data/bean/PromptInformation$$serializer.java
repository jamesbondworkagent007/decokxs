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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class PromptInformation$$serializer implements GeneratedSerializer<PromptInformation> {
    public static final int $stable;
    public static final PromptInformation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PromptInformation$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PromptInformation$$serializer promptInformation$$serializer = new PromptInformation$$serializer();
        INSTANCE = promptInformation$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.PromptInformation", promptInformation$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("exceptionTip", true);
        pluginGeneratedSerialDescriptor.addElement("investmentInfoTip", true);
        pluginGeneratedSerialDescriptor.addElement("estDailyYieldTip ", true);
        pluginGeneratedSerialDescriptor.addElement("redeemAllTip", true);
        pluginGeneratedSerialDescriptor.addElement("receiveTip", true);
        pluginGeneratedSerialDescriptor.addElement("assetsTip", true);
        pluginGeneratedSerialDescriptor.addElement("payWithTokenTip", true);
        pluginGeneratedSerialDescriptor.addElement("pendingFeeTip", true);
        pluginGeneratedSerialDescriptor.addElement("xrc20RedeemTip", true);
        pluginGeneratedSerialDescriptor.addElement("inputHintTip", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        InvestTipInfoVo$$serializer investTipInfoVo$$serializer = InvestTipInfoVo$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer), BuiltinSerializersKt.getNullable(investTipInfoVo$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PromptInformation deserialize(@NotNull Decoder decoder) {
        InvestTipInfoVo investTipInfoVo;
        int i;
        InvestTipInfoVo investTipInfoVo2;
        InvestTipInfoVo investTipInfoVo3;
        InvestTipInfoVo investTipInfoVo4;
        InvestTipInfoVo investTipInfoVo5;
        InvestTipInfoVo investTipInfoVo6;
        InvestTipInfoVo investTipInfoVo7;
        InvestTipInfoVo investTipInfoVo8;
        InvestTipInfoVo investTipInfoVo9;
        InvestTipInfoVo investTipInfoVo10;
        InvestTipInfoVo investTipInfoVo11;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        InvestTipInfoVo investTipInfoVo12 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            InvestTipInfoVo$$serializer investTipInfoVo$$serializer = InvestTipInfoVo$$serializer.INSTANCE;
            InvestTipInfoVo investTipInfoVo13 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, investTipInfoVo$$serializer, null);
            InvestTipInfoVo investTipInfoVo14 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, investTipInfoVo$$serializer, null);
            InvestTipInfoVo investTipInfoVo15 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, investTipInfoVo$$serializer, null);
            InvestTipInfoVo investTipInfoVo16 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, investTipInfoVo$$serializer, null);
            InvestTipInfoVo investTipInfoVo17 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, investTipInfoVo$$serializer, null);
            InvestTipInfoVo investTipInfoVo18 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, investTipInfoVo$$serializer, null);
            InvestTipInfoVo investTipInfoVo19 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, investTipInfoVo$$serializer, null);
            InvestTipInfoVo investTipInfoVo20 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, investTipInfoVo$$serializer, null);
            InvestTipInfoVo investTipInfoVo21 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, investTipInfoVo$$serializer, null);
            investTipInfoVo3 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, investTipInfoVo$$serializer, null);
            investTipInfoVo4 = investTipInfoVo20;
            investTipInfoVo8 = investTipInfoVo19;
            investTipInfoVo9 = investTipInfoVo18;
            investTipInfoVo2 = investTipInfoVo21;
            investTipInfoVo7 = investTipInfoVo17;
            investTipInfoVo10 = investTipInfoVo13;
            i = 1023;
            investTipInfoVo = investTipInfoVo15;
            investTipInfoVo6 = investTipInfoVo14;
            investTipInfoVo5 = investTipInfoVo16;
        } else {
            int i5 = 0;
            boolean z = true;
            InvestTipInfoVo investTipInfoVo22 = null;
            InvestTipInfoVo investTipInfoVo23 = null;
            InvestTipInfoVo investTipInfoVo24 = null;
            investTipInfoVo = null;
            InvestTipInfoVo investTipInfoVo25 = null;
            InvestTipInfoVo investTipInfoVo26 = null;
            InvestTipInfoVo investTipInfoVo27 = null;
            InvestTipInfoVo investTipInfoVo28 = null;
            InvestTipInfoVo investTipInfoVo29 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        investTipInfoVo11 = investTipInfoVo28;
                        z = false;
                        investTipInfoVo28 = investTipInfoVo11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 0:
                        investTipInfoVo11 = investTipInfoVo28;
                        investTipInfoVo29 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo29);
                        i5 |= 1;
                        investTipInfoVo28 = investTipInfoVo11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 1:
                        investTipInfoVo11 = investTipInfoVo28;
                        investTipInfoVo27 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo27);
                        i5 |= 2;
                        investTipInfoVo28 = investTipInfoVo11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 2:
                        investTipInfoVo11 = investTipInfoVo28;
                        investTipInfoVo = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo);
                        i5 |= 4;
                        investTipInfoVo28 = investTipInfoVo11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 3:
                        investTipInfoVo11 = investTipInfoVo28;
                        investTipInfoVo26 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo26);
                        i5 |= 8;
                        investTipInfoVo28 = investTipInfoVo11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 4:
                        investTipInfoVo28 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo28);
                        i5 |= 16;
                        investTipInfoVo11 = investTipInfoVo28;
                        investTipInfoVo28 = investTipInfoVo11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 5:
                        investTipInfoVo23 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo23);
                        i5 |= 32;
                        investTipInfoVo11 = investTipInfoVo28;
                        investTipInfoVo28 = investTipInfoVo11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 6:
                        investTipInfoVo22 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo22);
                        i5 |= 64;
                        investTipInfoVo11 = investTipInfoVo28;
                        investTipInfoVo28 = investTipInfoVo11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 7:
                        investTipInfoVo12 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo12);
                        i5 |= 128;
                        break;
                    case 8:
                        i5 |= 256;
                        investTipInfoVo24 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo24);
                        investTipInfoVo11 = investTipInfoVo28;
                        investTipInfoVo28 = investTipInfoVo11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 9:
                        i5 |= 512;
                        investTipInfoVo25 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo25);
                        investTipInfoVo11 = investTipInfoVo28;
                        investTipInfoVo28 = investTipInfoVo11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            investTipInfoVo2 = investTipInfoVo24;
            investTipInfoVo3 = investTipInfoVo25;
            investTipInfoVo4 = investTipInfoVo12;
            investTipInfoVo5 = investTipInfoVo26;
            investTipInfoVo6 = investTipInfoVo27;
            investTipInfoVo7 = investTipInfoVo28;
            investTipInfoVo8 = investTipInfoVo22;
            investTipInfoVo9 = investTipInfoVo23;
            investTipInfoVo10 = investTipInfoVo29;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PromptInformation(i, investTipInfoVo10, investTipInfoVo6, investTipInfoVo, investTipInfoVo5, investTipInfoVo7, investTipInfoVo9, investTipInfoVo8, investTipInfoVo4, investTipInfoVo2, investTipInfoVo3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PromptInformation promptInformation) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(promptInformation, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PromptInformation.write$Self$OKDeFi_invest_biz(promptInformation, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
