package com.okinc.business.invest_biz.data.bean.response;

import java.util.List;
import java.util.Map;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class MarketInvestTokenInfo$$serializer implements GeneratedSerializer<MarketInvestTokenInfo> {
    public static final int $stable;
    public static final MarketInvestTokenInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MarketInvestTokenInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MarketInvestTokenInfo$$serializer marketInvestTokenInfo$$serializer = new MarketInvestTokenInfo$$serializer();
        INSTANCE = marketInvestTokenInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.response.MarketInvestTokenInfo", marketInvestTokenInfo$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("healthRate", true);
        pluginGeneratedSerialDescriptor.addElement("marketRewards", true);
        pluginGeneratedSerialDescriptor.addElement("investTypeName", true);
        pluginGeneratedSerialDescriptor.addElement("investmentId", true);
        pluginGeneratedSerialDescriptor.addElement("marketRewardTotalValue", true);
        pluginGeneratedSerialDescriptor.addElement("totalValue", true);
        pluginGeneratedSerialDescriptor.addElement("marketId", true);
        pluginGeneratedSerialDescriptor.addElement("assetMap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = MarketInvestTokenInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(HealthRate$$serializer.INSTANCE), kSerializerArr[1], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[7]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MarketInvestTokenInfo deserialize(@NotNull Decoder decoder) {
        Map map;
        String str;
        HealthRate healthRate;
        String str2;
        List list;
        int i;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = MarketInvestTokenInfo.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        int i4 = 3;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            HealthRate healthRate2 = (HealthRate) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, HealthRate$$serializer.INSTANCE, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            healthRate = healthRate2;
            str = strDecodeStringElement6;
            str5 = strDecodeStringElement5;
            str2 = strDecodeStringElement3;
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement2;
            list = list2;
            i = 255;
        } else {
            int i5 = 0;
            boolean z = true;
            List list3 = null;
            Map map2 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            HealthRate healthRate3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 0:
                        i5 |= 1;
                        healthRate3 = (HealthRate) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, HealthRate$$serializer.INSTANCE, healthRate3);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 1:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], list3);
                        i5 |= 2;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 2:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        i5 |= 8;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        break;
                    case 4:
                        i5 |= 16;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i5 |= 32;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    case 6:
                        i5 |= 64;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    case 7:
                        i5 |= 128;
                        map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], map2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            HealthRate healthRate4 = healthRate3;
            map = map2;
            str = strDecodeStringElement8;
            healthRate = healthRate4;
            str2 = strDecodeStringElement;
            list = list3;
            i = i5;
            String str6 = strDecodeStringElement9;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement10;
            str5 = str6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MarketInvestTokenInfo(i, healthRate, list, str4, str2, str3, str5, str, map, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MarketInvestTokenInfo marketInvestTokenInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(marketInvestTokenInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MarketInvestTokenInfo.EZpvd(marketInvestTokenInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
