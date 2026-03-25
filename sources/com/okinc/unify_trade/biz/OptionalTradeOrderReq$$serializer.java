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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class OptionalTradeOrderReq$$serializer implements GeneratedSerializer<OptionalTradeOrderReq> {
    public static final int $stable;
    public static final OptionalTradeOrderReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OptionalTradeOrderReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OptionalTradeOrderReq$$serializer optionalTradeOrderReq$$serializer = new OptionalTradeOrderReq$$serializer();
        INSTANCE = optionalTradeOrderReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.OptionalTradeOrderReq", optionalTradeOrderReq$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("posSide", true);
        pluginGeneratedSerialDescriptor.addElement("px", true);
        pluginGeneratedSerialDescriptor.addElement("reduceOnly", true);
        pluginGeneratedSerialDescriptor.addElement("bboType", true);
        pluginGeneratedSerialDescriptor.addElement("ccy", true);
        pluginGeneratedSerialDescriptor.addElement("tgtCcy", true);
        pluginGeneratedSerialDescriptor.addElement("quickMgnType", true);
        pluginGeneratedSerialDescriptor.addElement("cost", true);
        pluginGeneratedSerialDescriptor.addElement("probablyValue", true);
        pluginGeneratedSerialDescriptor.addElement("pxUsd", true);
        pluginGeneratedSerialDescriptor.addElement("pxVol", true);
        pluginGeneratedSerialDescriptor.addElement("isTradeBorrowMode", true);
        pluginGeneratedSerialDescriptor.addElement("banAmend", true);
        pluginGeneratedSerialDescriptor.addElement("assetNeedTransfer", true);
        pluginGeneratedSerialDescriptor.addElement("simpleEarnNeedTransfer", true);
        pluginGeneratedSerialDescriptor.addElement("tradeAvail", true);
        pluginGeneratedSerialDescriptor.addElement("orderValue", true);
        pluginGeneratedSerialDescriptor.addElement("disableSlLiqTip", true);
        pluginGeneratedSerialDescriptor.addElement("tradeQuoteCcy", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OptionalTradeOrderReq deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        String str7;
        String str8;
        String str9;
        String str10;
        Boolean bool2;
        String str11;
        String str12;
        Boolean bool3;
        String str13;
        String str14;
        String str15;
        String str16;
        int i;
        String str17;
        String str18;
        String str19;
        String str20;
        int i2;
        int i3;
        Boolean bool4;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        Boolean bool5;
        String str26;
        String str27;
        String str28;
        String str29;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str30 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            String str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, booleanSerializer, null);
            str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            bool2 = bool8;
            str4 = str44;
            str5 = str43;
            str14 = str42;
            str13 = str41;
            str12 = str40;
            str8 = str33;
            str9 = str37;
            str10 = str38;
            str6 = str36;
            str = str35;
            str3 = str34;
            bool3 = bool7;
            bool = bool6;
            str16 = str31;
            str15 = str32;
            i = 524287;
            str2 = str39;
        } else {
            int i4 = 0;
            boolean z = true;
            String str45 = null;
            Boolean bool9 = null;
            String str46 = null;
            String str47 = null;
            String str48 = null;
            String str49 = null;
            Boolean bool10 = null;
            String str50 = null;
            String str51 = null;
            String str52 = null;
            String str53 = null;
            String str54 = null;
            String str55 = null;
            String str56 = null;
            String str57 = null;
            Boolean bool11 = null;
            String str58 = null;
            String str59 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool4 = bool9;
                        str21 = str48;
                        str22 = str54;
                        str23 = str55;
                        str24 = str56;
                        str25 = str57;
                        bool5 = bool11;
                        str26 = str45;
                        str27 = str59;
                        str28 = str58;
                        z = false;
                        bool11 = bool5;
                        str57 = str25;
                        str56 = str24;
                        str55 = str23;
                        bool9 = bool4;
                        str58 = str28;
                        str59 = str27;
                        str45 = str26;
                        str54 = str22;
                        str48 = str21;
                        break;
                    case 0:
                        bool4 = bool9;
                        str21 = str48;
                        str22 = str54;
                        str23 = str55;
                        str24 = str56;
                        str25 = str57;
                        bool5 = bool11;
                        str26 = str45;
                        String str60 = str59;
                        str28 = str58;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str60);
                        i4 |= 1;
                        bool11 = bool5;
                        str57 = str25;
                        str56 = str24;
                        str55 = str23;
                        bool9 = bool4;
                        str58 = str28;
                        str59 = str27;
                        str45 = str26;
                        str54 = str22;
                        str48 = str21;
                        break;
                    case 1:
                        bool4 = bool9;
                        str21 = str48;
                        str22 = str54;
                        str23 = str55;
                        str24 = str56;
                        str25 = str57;
                        str26 = str45;
                        bool5 = bool11;
                        str58 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str58);
                        i4 |= 2;
                        str27 = str59;
                        str28 = str58;
                        bool11 = bool5;
                        str57 = str25;
                        str56 = str24;
                        str55 = str23;
                        bool9 = bool4;
                        str58 = str28;
                        str59 = str27;
                        str45 = str26;
                        str54 = str22;
                        str48 = str21;
                        break;
                    case 2:
                        bool4 = bool9;
                        str21 = str48;
                        str22 = str54;
                        str23 = str55;
                        str24 = str56;
                        str26 = str45;
                        str25 = str57;
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool11);
                        i4 |= 4;
                        bool5 = bool11;
                        str27 = str59;
                        str28 = str58;
                        bool11 = bool5;
                        str57 = str25;
                        str56 = str24;
                        str55 = str23;
                        bool9 = bool4;
                        str58 = str28;
                        str59 = str27;
                        str45 = str26;
                        str54 = str22;
                        str48 = str21;
                        break;
                    case 3:
                        bool4 = bool9;
                        str23 = str55;
                        str24 = str56;
                        String str61 = str54;
                        str26 = str45;
                        String str62 = str48;
                        str22 = str61;
                        str21 = str62;
                        str57 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str57);
                        i4 |= 8;
                        str25 = str57;
                        bool5 = bool11;
                        str27 = str59;
                        str28 = str58;
                        bool11 = bool5;
                        str57 = str25;
                        str56 = str24;
                        str55 = str23;
                        bool9 = bool4;
                        str58 = str28;
                        str59 = str27;
                        str45 = str26;
                        str54 = str22;
                        str48 = str21;
                        break;
                    case 4:
                        bool4 = bool9;
                        String str63 = str48;
                        str22 = str54;
                        str23 = str55;
                        str26 = str45;
                        str24 = str56;
                        i4 |= 16;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str63);
                        str25 = str57;
                        bool5 = bool11;
                        str27 = str59;
                        str28 = str58;
                        bool11 = bool5;
                        str57 = str25;
                        str56 = str24;
                        str55 = str23;
                        bool9 = bool4;
                        str58 = str28;
                        str59 = str27;
                        str45 = str26;
                        str54 = str22;
                        str48 = str21;
                        break;
                    case 5:
                        bool4 = bool9;
                        str29 = str48;
                        str22 = str54;
                        str23 = str55;
                        str26 = str45;
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str49);
                        i4 |= 32;
                        str24 = str56;
                        str25 = str57;
                        bool5 = bool11;
                        str27 = str59;
                        str21 = str29;
                        str28 = str58;
                        bool11 = bool5;
                        str57 = str25;
                        str56 = str24;
                        str55 = str23;
                        bool9 = bool4;
                        str58 = str28;
                        str59 = str27;
                        str45 = str26;
                        str54 = str22;
                        str48 = str21;
                        break;
                    case 6:
                        bool4 = bool9;
                        str29 = str48;
                        str22 = str54;
                        str23 = str55;
                        str26 = str45;
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str47);
                        str24 = str56;
                        i4 |= 64;
                        str25 = str57;
                        bool5 = bool11;
                        str27 = str59;
                        str21 = str29;
                        str28 = str58;
                        bool11 = bool5;
                        str57 = str25;
                        str56 = str24;
                        str55 = str23;
                        bool9 = bool4;
                        str58 = str28;
                        str59 = str27;
                        str45 = str26;
                        str54 = str22;
                        str48 = str21;
                        break;
                    case 7:
                        str17 = str48;
                        str18 = str54;
                        str19 = str45;
                        str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str53);
                        i4 |= 128;
                        bool9 = bool9;
                        str45 = str19;
                        str54 = str18;
                        str48 = str17;
                        break;
                    case 8:
                        str17 = str48;
                        str18 = str54;
                        str19 = str45;
                        str20 = str55;
                        str56 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str56);
                        i4 |= 256;
                        bool9 = bool9;
                        str55 = str20;
                        str45 = str19;
                        str54 = str18;
                        str48 = str17;
                        break;
                    case 9:
                        str17 = str48;
                        str18 = str54;
                        str19 = str45;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str55);
                        i4 |= 512;
                        bool9 = bool9;
                        str55 = str20;
                        str45 = str19;
                        str54 = str18;
                        str48 = str17;
                        break;
                    case 10:
                        str17 = str48;
                        String str64 = str54;
                        str19 = str45;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str64);
                        i4 |= 1024;
                        str20 = str55;
                        str55 = str20;
                        str45 = str19;
                        str54 = str18;
                        str48 = str17;
                        break;
                    case 11:
                        str17 = str48;
                        i4 |= 2048;
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, bool10);
                        str18 = str54;
                        str20 = str55;
                        str19 = str45;
                        str55 = str20;
                        str45 = str19;
                        str54 = str18;
                        str48 = str17;
                        break;
                    case 12:
                        str17 = str48;
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str46);
                        i2 = i4 | 4096;
                        i4 = i2;
                        str18 = str54;
                        str20 = str55;
                        str19 = str45;
                        str55 = str20;
                        str45 = str19;
                        str54 = str18;
                        str48 = str17;
                        break;
                    case 13:
                        str17 = str48;
                        i4 |= 8192;
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str50);
                        str18 = str54;
                        str20 = str55;
                        str19 = str45;
                        str55 = str20;
                        str45 = str19;
                        str54 = str18;
                        str48 = str17;
                        break;
                    case 14:
                        str17 = str48;
                        i4 |= 16384;
                        str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str51);
                        str18 = str54;
                        str20 = str55;
                        str19 = str45;
                        str55 = str20;
                        str45 = str19;
                        str54 = str18;
                        str48 = str17;
                        break;
                    case 15:
                        str17 = str48;
                        str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str52);
                        i3 = 32768;
                        i2 = i3 | i4;
                        i4 = i2;
                        str18 = str54;
                        str20 = str55;
                        str19 = str45;
                        str55 = str20;
                        str45 = str19;
                        str54 = str18;
                        str48 = str17;
                        break;
                    case 16:
                        str17 = str48;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str30);
                        i3 = 65536;
                        i2 = i3 | i4;
                        i4 = i2;
                        str18 = str54;
                        str20 = str55;
                        str19 = str45;
                        str55 = str20;
                        str45 = str19;
                        str54 = str18;
                        str48 = str17;
                        break;
                    case 17:
                        str17 = str48;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, BooleanSerializer.INSTANCE, bool9);
                        i3 = 131072;
                        i2 = i3 | i4;
                        i4 = i2;
                        str18 = str54;
                        str20 = str55;
                        str19 = str45;
                        str55 = str20;
                        str45 = str19;
                        str54 = str18;
                        str48 = str17;
                        break;
                    case 18:
                        str17 = str48;
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, str45);
                        i3 = 262144;
                        i2 = i3 | i4;
                        i4 = i2;
                        str18 = str54;
                        str20 = str55;
                        str19 = str45;
                        str55 = str20;
                        str45 = str19;
                        str54 = str18;
                        str48 = str17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str65 = str48;
            String str66 = str54;
            str = str47;
            str2 = str66;
            str3 = str49;
            str4 = str30;
            str5 = str52;
            str6 = str53;
            bool = bool11;
            str7 = str57;
            str8 = str65;
            str9 = str56;
            str10 = str55;
            bool2 = bool9;
            str11 = str45;
            str12 = str46;
            bool3 = bool10;
            str13 = str50;
            str14 = str51;
            str15 = str58;
            str16 = str59;
            i = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OptionalTradeOrderReq(i, str16, str15, bool, str7, str8, str3, str, str6, str9, str10, str2, bool3, str12, str13, str14, str5, str4, bool2, str11, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OptionalTradeOrderReq optionalTradeOrderReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(optionalTradeOrderReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OptionalTradeOrderReq.write$Self$OKTradeCore_trade_core(optionalTradeOrderReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
