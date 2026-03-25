package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class SmartArbitrageReq$$serializer implements GeneratedSerializer<SmartArbitrageReq> {
    public static final int $stable;
    public static final SmartArbitrageReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SmartArbitrageReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SmartArbitrageReq$$serializer smartArbitrageReq$$serializer = new SmartArbitrageReq$$serializer();
        INSTANCE = smartArbitrageReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.SmartArbitrageReq", smartArbitrageReq$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("instFamily", true);
        pluginGeneratedSerialDescriptor.addElement("totalAmt", true);
        pluginGeneratedSerialDescriptor.addElement("arbType", true);
        pluginGeneratedSerialDescriptor.addElement("investDetails", true);
        pluginGeneratedSerialDescriptor.addElement("leveragePrincipal", true);
        pluginGeneratedSerialDescriptor.addElement("openCondition", true);
        pluginGeneratedSerialDescriptor.addElement("smartArbiStakingApy", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedStaking", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedAutoStaking", true);
        pluginGeneratedSerialDescriptor.addElement("config", true);
        pluginGeneratedSerialDescriptor.addElement("openPosSlippage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        EstimatedStakingVo$$serializer estimatedStakingVo$$serializer = EstimatedStakingVo$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(ArbInvestDetailsBean$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE), BuiltinSerializersKt.getNullable(PlaceOrderCondition$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(estimatedStakingVo$$serializer), BuiltinSerializersKt.getNullable(estimatedStakingVo$$serializer), BuiltinSerializersKt.getNullable(StrategyConfigInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SmartArbitrageReq deserialize(@NotNull Decoder decoder) {
        ArbInvestDetailsBean arbInvestDetailsBean;
        int i;
        EstimatedStakingVo estimatedStakingVo;
        StrategyConfigInfo strategyConfigInfo;
        String str;
        String str2;
        String str3;
        PlaceOrderCondition placeOrderCondition;
        String str4;
        EstimatedStakingVo estimatedStakingVo2;
        Float f;
        String str5;
        String str6;
        PlaceOrderCondition placeOrderCondition2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 8;
        String str7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            ArbInvestDetailsBean arbInvestDetailsBean2 = (ArbInvestDetailsBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ArbInvestDetailsBean$$serializer.INSTANCE, null);
            Float f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FloatSerializer.INSTANCE, null);
            PlaceOrderCondition placeOrderCondition3 = (PlaceOrderCondition) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, PlaceOrderCondition$$serializer.INSTANCE, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            EstimatedStakingVo$$serializer estimatedStakingVo$$serializer = EstimatedStakingVo$$serializer.INSTANCE;
            EstimatedStakingVo estimatedStakingVo3 = (EstimatedStakingVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, estimatedStakingVo$$serializer, null);
            EstimatedStakingVo estimatedStakingVo4 = (EstimatedStakingVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, estimatedStakingVo$$serializer, null);
            StrategyConfigInfo strategyConfigInfo2 = (StrategyConfigInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StrategyConfigInfo$$serializer.INSTANCE, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            strategyConfigInfo = strategyConfigInfo2;
            estimatedStakingVo = estimatedStakingVo3;
            str2 = str10;
            placeOrderCondition = placeOrderCondition3;
            estimatedStakingVo2 = estimatedStakingVo4;
            f = f2;
            str4 = str8;
            i = 2047;
            str5 = str9;
            str3 = strDecodeStringElement;
            arbInvestDetailsBean = arbInvestDetailsBean2;
        } else {
            int i7 = 0;
            boolean z = true;
            EstimatedStakingVo estimatedStakingVo5 = null;
            EstimatedStakingVo estimatedStakingVo6 = null;
            StrategyConfigInfo strategyConfigInfo3 = null;
            Float f3 = null;
            arbInvestDetailsBean = null;
            String str11 = null;
            String str12 = null;
            String strDecodeStringElement2 = null;
            PlaceOrderCondition placeOrderCondition4 = null;
            String str13 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str6 = str12;
                        placeOrderCondition2 = placeOrderCondition4;
                        z = false;
                        placeOrderCondition4 = placeOrderCondition2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 0:
                        str6 = str12;
                        placeOrderCondition2 = placeOrderCondition4;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str13);
                        i7 |= 1;
                        placeOrderCondition4 = placeOrderCondition2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 1:
                        str6 = str12;
                        placeOrderCondition2 = placeOrderCondition4;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        placeOrderCondition4 = placeOrderCondition2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 2:
                        placeOrderCondition2 = placeOrderCondition4;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str12);
                        i7 |= 4;
                        placeOrderCondition4 = placeOrderCondition2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 3:
                        placeOrderCondition2 = placeOrderCondition4;
                        arbInvestDetailsBean = (ArbInvestDetailsBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ArbInvestDetailsBean$$serializer.INSTANCE, arbInvestDetailsBean);
                        i7 |= 8;
                        str6 = str12;
                        placeOrderCondition4 = placeOrderCondition2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 4:
                        placeOrderCondition2 = placeOrderCondition4;
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FloatSerializer.INSTANCE, f3);
                        i7 |= 16;
                        str6 = str12;
                        placeOrderCondition4 = placeOrderCondition2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 5:
                        placeOrderCondition2 = (PlaceOrderCondition) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, PlaceOrderCondition$$serializer.INSTANCE, placeOrderCondition4);
                        i7 |= 32;
                        str6 = str12;
                        placeOrderCondition4 = placeOrderCondition2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 6:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str11);
                        i7 |= 64;
                        str6 = str12;
                        placeOrderCondition2 = placeOrderCondition4;
                        placeOrderCondition4 = placeOrderCondition2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 7:
                        estimatedStakingVo6 = (EstimatedStakingVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, EstimatedStakingVo$$serializer.INSTANCE, estimatedStakingVo6);
                        i7 |= 128;
                        str6 = str12;
                        placeOrderCondition2 = placeOrderCondition4;
                        placeOrderCondition4 = placeOrderCondition2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 8:
                        estimatedStakingVo5 = (EstimatedStakingVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, EstimatedStakingVo$$serializer.INSTANCE, estimatedStakingVo5);
                        i7 |= 256;
                        str6 = str12;
                        placeOrderCondition2 = placeOrderCondition4;
                        placeOrderCondition4 = placeOrderCondition2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 9:
                        strategyConfigInfo3 = (StrategyConfigInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StrategyConfigInfo$$serializer.INSTANCE, strategyConfigInfo3);
                        i7 |= 512;
                        break;
                    case 10:
                        i7 |= 1024;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str7);
                        str6 = str12;
                        placeOrderCondition2 = placeOrderCondition4;
                        placeOrderCondition4 = placeOrderCondition2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str14 = str12;
            i = i7;
            estimatedStakingVo = estimatedStakingVo6;
            strategyConfigInfo = strategyConfigInfo3;
            str = str7;
            str2 = str11;
            str3 = strDecodeStringElement2;
            placeOrderCondition = placeOrderCondition4;
            str4 = str13;
            estimatedStakingVo2 = estimatedStakingVo5;
            f = f3;
            str5 = str14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SmartArbitrageReq(i, str4, str3, str5, arbInvestDetailsBean, f, placeOrderCondition, str2, estimatedStakingVo, estimatedStakingVo2, strategyConfigInfo, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SmartArbitrageReq smartArbitrageReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(smartArbitrageReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SmartArbitrageReq.write$Self$OKTradeCore_trade_core(smartArbitrageReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
