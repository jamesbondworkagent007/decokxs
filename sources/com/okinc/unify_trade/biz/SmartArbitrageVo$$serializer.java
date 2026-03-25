package com.okinc.unify_trade.biz;

import java.util.List;
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

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class SmartArbitrageVo$$serializer implements GeneratedSerializer<SmartArbitrageVo> {
    public static final int $stable;
    public static final SmartArbitrageVo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SmartArbitrageVo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SmartArbitrageVo$$serializer smartArbitrageVo$$serializer = new SmartArbitrageVo$$serializer();
        INSTANCE = smartArbitrageVo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.SmartArbitrageVo", smartArbitrageVo$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("enlargedAmt", true);
        pluginGeneratedSerialDescriptor.addElement("interestDebt", true);
        pluginGeneratedSerialDescriptor.addElement("minimalPaybackDays", true);
        pluginGeneratedSerialDescriptor.addElement("openCost", true);
        pluginGeneratedSerialDescriptor.addElement("closeCost", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedApyList", true);
        pluginGeneratedSerialDescriptor.addElement("totalReturnedAmt", true);
        pluginGeneratedSerialDescriptor.addElement("openCondition", true);
        pluginGeneratedSerialDescriptor.addElement("autoStakingProfit", true);
        pluginGeneratedSerialDescriptor.addElement("autoStakingPos", true);
        pluginGeneratedSerialDescriptor.addElement("autoStakingPosUsdt", true);
        pluginGeneratedSerialDescriptor.addElement("stakePosUsdt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SmartArbitrageVo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        CostVo$$serializer costVo$$serializer = CostVo$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, costVo$$serializer, costVo$$serializer, kSerializerArr[5], stringSerializer, BuiltinSerializersKt.getNullable(PlaceOrderCondition$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ProfitDetailResponse$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SmartArbitrageVo deserialize(@NotNull Decoder decoder) {
        String str;
        CostVo costVo;
        CostVo costVo2;
        List list;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String str2;
        String str3;
        ProfitDetailResponse profitDetailResponse;
        String str4;
        String str5;
        PlaceOrderCondition placeOrderCondition;
        int i;
        CostVo costVo3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SmartArbitrageVo.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            CostVo$$serializer costVo$$serializer = CostVo$$serializer.INSTANCE;
            CostVo costVo4 = (CostVo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, costVo$$serializer, null);
            CostVo costVo5 = (CostVo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, costVo$$serializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            PlaceOrderCondition placeOrderCondition2 = (PlaceOrderCondition) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, PlaceOrderCondition$$serializer.INSTANCE, null);
            ProfitDetailResponse profitDetailResponse2 = (ProfitDetailResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ProfitDetailResponse$$serializer.INSTANCE, null);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            list = list2;
            str3 = strDecodeStringElement4;
            profitDetailResponse = profitDetailResponse2;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            str4 = strDecodeStringElement8;
            placeOrderCondition = placeOrderCondition2;
            str = strDecodeStringElement7;
            costVo = costVo4;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            costVo2 = costVo5;
            str5 = strDecodeStringElement6;
            i = 4095;
            str2 = strDecodeStringElement5;
        } else {
            int i4 = 11;
            CostVo costVo6 = null;
            List list3 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            CostVo costVo7 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            int i5 = 0;
            boolean z = true;
            ProfitDetailResponse profitDetailResponse3 = null;
            PlaceOrderCondition placeOrderCondition3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 0:
                        costVo3 = costVo7;
                        i5 |= 1;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        costVo7 = costVo3;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 1:
                        costVo3 = costVo7;
                        i5 |= 2;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        costVo7 = costVo3;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 2:
                        costVo3 = costVo7;
                        i5 |= 4;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        costVo7 = costVo3;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 3:
                        i5 |= 8;
                        costVo3 = (CostVo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, CostVo$$serializer.INSTANCE, costVo7);
                        costVo7 = costVo3;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        i5 |= 16;
                        costVo3 = costVo7;
                        costVo6 = (CostVo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, CostVo$$serializer.INSTANCE, costVo6);
                        costVo7 = costVo3;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 5:
                        i5 |= 32;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], list3);
                        costVo3 = costVo7;
                        costVo7 = costVo3;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 6:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 |= 64;
                        break;
                    case 7:
                        i5 |= 128;
                        placeOrderCondition3 = (PlaceOrderCondition) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, PlaceOrderCondition$$serializer.INSTANCE, placeOrderCondition3);
                        break;
                    case 8:
                        i5 |= 256;
                        profitDetailResponse3 = (ProfitDetailResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ProfitDetailResponse$$serializer.INSTANCE, profitDetailResponse3);
                        break;
                    case 9:
                        i5 |= 512;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    case 10:
                        i5 |= 1024;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    case 11:
                        i5 |= 2048;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            CostVo costVo8 = costVo7;
            str = strDecodeStringElement3;
            costVo = costVo8;
            costVo2 = costVo6;
            list = list3;
            strDecodeStringElement = strDecodeStringElement9;
            strDecodeStringElement2 = strDecodeStringElement10;
            str2 = strDecodeStringElement13;
            str3 = strDecodeStringElement14;
            profitDetailResponse = profitDetailResponse3;
            str4 = strDecodeStringElement11;
            str5 = strDecodeStringElement12;
            placeOrderCondition = placeOrderCondition3;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SmartArbitrageVo(i, str3, str2, str5, costVo, costVo2, list, str, placeOrderCondition, profitDetailResponse, str4, strDecodeStringElement2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SmartArbitrageVo smartArbitrageVo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(smartArbitrageVo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SmartArbitrageVo.write$Self$OKTradeCore_trade_core(smartArbitrageVo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
