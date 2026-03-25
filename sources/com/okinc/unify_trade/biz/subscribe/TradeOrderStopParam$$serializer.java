package com.okinc.unify_trade.biz.subscribe;

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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class TradeOrderStopParam$$serializer implements GeneratedSerializer<TradeOrderStopParam> {
    public static final int $stable;
    public static final TradeOrderStopParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TradeOrderStopParam$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TradeOrderStopParam$$serializer tradeOrderStopParam$$serializer = new TradeOrderStopParam$$serializer();
        INSTANCE = tradeOrderStopParam$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam", tradeOrderStopParam$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("tpTriggerPxType", true);
        pluginGeneratedSerialDescriptor.addElement("slTriggerPxType", true);
        pluginGeneratedSerialDescriptor.addElement("tpTriggerPx", true);
        pluginGeneratedSerialDescriptor.addElement("tpOrdPx", true);
        pluginGeneratedSerialDescriptor.addElement("slTriggerPx", true);
        pluginGeneratedSerialDescriptor.addElement("slOrdPx", true);
        pluginGeneratedSerialDescriptor.addElement("sz", true);
        pluginGeneratedSerialDescriptor.addElement("percent", true);
        pluginGeneratedSerialDescriptor.addElement("attachAlgoId", true);
        pluginGeneratedSerialDescriptor.addElement("amendPxOnTriggerType", true);
        pluginGeneratedSerialDescriptor.addElement("tpOrdKind", true);
        pluginGeneratedSerialDescriptor.addElement("failCode", true);
        pluginGeneratedSerialDescriptor.addElement("failReason", true);
        pluginGeneratedSerialDescriptor.addElement("tpslMode", true);
        pluginGeneratedSerialDescriptor.addElement("tpTriggerRatio", true);
        pluginGeneratedSerialDescriptor.addElement("slTriggerRatio", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TradeOrderStopParam deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            str10 = str40;
            str5 = str37;
            str3 = str36;
            str8 = str35;
            str15 = str39;
            str4 = str38;
            str2 = str33;
            str7 = str32;
            str16 = str27;
            i = 65535;
            str = str31;
            str12 = str28;
            str9 = str30;
            str14 = str29;
            str13 = str34;
        } else {
            int i3 = 15;
            boolean z = true;
            String str41 = null;
            String str42 = null;
            String str43 = null;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            String str47 = null;
            String str48 = null;
            String str49 = null;
            String str50 = null;
            String str51 = null;
            String str52 = null;
            String str53 = null;
            String str54 = null;
            String str55 = null;
            int i4 = 0;
            String str56 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str17 = str56;
                        str18 = str50;
                        str19 = str51;
                        str20 = str52;
                        str21 = str53;
                        str22 = str54;
                        str23 = str41;
                        z = false;
                        str41 = str23;
                        str54 = str22;
                        str53 = str21;
                        str51 = str19;
                        str52 = str20;
                        str50 = str18;
                        str56 = str17;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 0:
                        str17 = str56;
                        str18 = str50;
                        str19 = str51;
                        str20 = str52;
                        str21 = str53;
                        String str57 = str54;
                        str23 = str41;
                        str22 = str57;
                        str55 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str55);
                        i4 |= 1;
                        str41 = str23;
                        str54 = str22;
                        str53 = str21;
                        str51 = str19;
                        str52 = str20;
                        str50 = str18;
                        str56 = str17;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 1:
                        str17 = str56;
                        str18 = str50;
                        str19 = str51;
                        str20 = str52;
                        str21 = str53;
                        String str58 = str54;
                        str23 = str41;
                        i4 |= 2;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str58);
                        str41 = str23;
                        str54 = str22;
                        str53 = str21;
                        str51 = str19;
                        str52 = str20;
                        str50 = str18;
                        str56 = str17;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 2:
                        str17 = str56;
                        str18 = str50;
                        str19 = str51;
                        str20 = str52;
                        i4 |= 4;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str53);
                        str22 = str54;
                        str23 = str41;
                        str41 = str23;
                        str54 = str22;
                        str53 = str21;
                        str51 = str19;
                        str52 = str20;
                        str50 = str18;
                        str56 = str17;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 3:
                        str17 = str56;
                        str18 = str50;
                        str19 = str51;
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str41);
                        i4 |= 8;
                        str20 = str52;
                        str21 = str53;
                        str53 = str21;
                        str51 = str19;
                        str52 = str20;
                        str50 = str18;
                        str56 = str17;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 4:
                        str17 = str56;
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str47);
                        i4 |= 16;
                        str56 = str17;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 5:
                        str24 = str50;
                        str25 = str51;
                        str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str42);
                        i4 |= 32;
                        str26 = str52;
                        str56 = str56;
                        str51 = str25;
                        str52 = str26;
                        str50 = str24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 6:
                        str25 = str51;
                        str24 = str50;
                        i4 |= 64;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str52);
                        str56 = str56;
                        str51 = str25;
                        str52 = str26;
                        str50 = str24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 7:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str51);
                        i4 |= 128;
                        str24 = str50;
                        str56 = str56;
                        str26 = str52;
                        str51 = str25;
                        str52 = str26;
                        str50 = str24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 8:
                        i4 |= 256;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str50);
                        str25 = str51;
                        str26 = str52;
                        str51 = str25;
                        str52 = str26;
                        str50 = str24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 9:
                        str56 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str56);
                        i4 |= 512;
                        str24 = str50;
                        str25 = str51;
                        str26 = str52;
                        str51 = str25;
                        str52 = str26;
                        str50 = str24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 10:
                        i4 |= 1024;
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str43);
                        str24 = str50;
                        str25 = str51;
                        str26 = str52;
                        str51 = str25;
                        str52 = str26;
                        str50 = str24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 11:
                        i4 |= 2048;
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str48);
                        str24 = str50;
                        str25 = str51;
                        str26 = str52;
                        str51 = str25;
                        str52 = str26;
                        str50 = str24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 12:
                        i4 |= 4096;
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str44);
                        str24 = str50;
                        str25 = str51;
                        str26 = str52;
                        str51 = str25;
                        str52 = str26;
                        str50 = str24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 13:
                        i4 |= 8192;
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str45);
                        str24 = str50;
                        str25 = str51;
                        str26 = str52;
                        str51 = str25;
                        str52 = str26;
                        str50 = str24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 14:
                        i4 |= 16384;
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str46);
                        str24 = str50;
                        str25 = str51;
                        str26 = str52;
                        str51 = str25;
                        str52 = str26;
                        str50 = str24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 15:
                        i4 |= 32768;
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str49);
                        str24 = str50;
                        str25 = str51;
                        str26 = str52;
                        str51 = str25;
                        str52 = str26;
                        str50 = str24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str42;
            str2 = str51;
            str3 = str43;
            str4 = str44;
            str5 = str48;
            str6 = str49;
            str7 = str52;
            str8 = str56;
            str9 = str41;
            i = i4;
            str10 = str46;
            str11 = str47;
            str12 = str54;
            str13 = str50;
            str14 = str53;
            str15 = str45;
            str16 = str55;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TradeOrderStopParam(i, str16, str12, str14, str9, str11, str, str7, str2, str13, str8, str3, str5, str4, str15, str10, str6, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TradeOrderStopParam tradeOrderStopParam) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradeOrderStopParam, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TradeOrderStopParam.write$Self$OKTradeCore_trade_core(tradeOrderStopParam, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
