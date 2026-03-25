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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class ArbitrageTotalPnlInfo$$serializer implements GeneratedSerializer<ArbitrageTotalPnlInfo> {
    public static final int $stable;
    public static final ArbitrageTotalPnlInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ArbitrageTotalPnlInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ArbitrageTotalPnlInfo$$serializer arbitrageTotalPnlInfo$$serializer = new ArbitrageTotalPnlInfo$$serializer();
        INSTANCE = arbitrageTotalPnlInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo", arbitrageTotalPnlInfo$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("totalPnlRatio", true);
        pluginGeneratedSerialDescriptor.addElement("totalPnl", true);
        pluginGeneratedSerialDescriptor.addElement("arbitrageGainVo", true);
        pluginGeneratedSerialDescriptor.addElement("arbitrageCostVo", true);
        pluginGeneratedSerialDescriptor.addElement("otherPnlRatio", true);
        pluginGeneratedSerialDescriptor.addElement("interestRate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(ArbitrageGainVo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ArbitrageCostVo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ArbitrageTotalPnlInfo deserialize(@NotNull Decoder decoder) {
        ArbitrageGainVo arbitrageGainVo;
        String str;
        String str2;
        String str3;
        String str4;
        ArbitrageCostVo arbitrageCostVo;
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        ArbitrageCostVo arbitrageCostVo2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            ArbitrageGainVo arbitrageGainVo2 = (ArbitrageGainVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, ArbitrageGainVo$$serializer.INSTANCE, null);
            ArbitrageCostVo arbitrageCostVo3 = (ArbitrageCostVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ArbitrageCostVo$$serializer.INSTANCE, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            i = 63;
            arbitrageCostVo = arbitrageCostVo3;
            str3 = str7;
            arbitrageGainVo = arbitrageGainVo2;
            str2 = str5;
            str4 = str6;
        } else {
            int i3 = 0;
            boolean z2 = true;
            String str8 = null;
            String str9 = null;
            arbitrageGainVo = null;
            String str10 = null;
            String str11 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = false;
                        i2 = 5;
                        break;
                    case 0:
                        z = false;
                        i3 |= 1;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str11);
                        i2 = 5;
                        break;
                    case 1:
                        i3 |= 2;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str10);
                        break;
                    case 2:
                        i3 |= 4;
                        arbitrageGainVo = (ArbitrageGainVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, ArbitrageGainVo$$serializer.INSTANCE, arbitrageGainVo);
                        break;
                    case 3:
                        i3 |= 8;
                        arbitrageCostVo2 = (ArbitrageCostVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ArbitrageCostVo$$serializer.INSTANCE, arbitrageCostVo2);
                        break;
                    case 4:
                        i3 |= 16;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str9);
                        break;
                    case 5:
                        i3 |= 32;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str8);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str8;
            str2 = str11;
            str3 = str9;
            str4 = str10;
            arbitrageCostVo = arbitrageCostVo2;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ArbitrageTotalPnlInfo(i, str2, str4, arbitrageGainVo, arbitrageCostVo, str3, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ArbitrageTotalPnlInfo arbitrageTotalPnlInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(arbitrageTotalPnlInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ArbitrageTotalPnlInfo.write$Self$OKTradeCore_trade_core(arbitrageTotalPnlInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
