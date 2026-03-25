package com.okinc.market.common.biz_spot.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class DefiWebCoins$$serializer implements GeneratedSerializer<DefiWebCoins> {
    public static final int $stable;
    public static final DefiWebCoins$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DefiWebCoins$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DefiWebCoins$$serializer defiWebCoins$$serializer = new DefiWebCoins$$serializer();
        INSTANCE = defiWebCoins$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.market.common.biz_spot.bean.DefiWebCoins", defiWebCoins$$serializer, 22);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("chainName", false);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", false);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("tokenName", false);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", false);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", false);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, false);
        pluginGeneratedSerialDescriptor.addElement("priceChange24H", false);
        pluginGeneratedSerialDescriptor.addElement("priceChange4H", false);
        pluginGeneratedSerialDescriptor.addElement("priceChange1H", false);
        pluginGeneratedSerialDescriptor.addElement("priceChangeUtc0", false);
        pluginGeneratedSerialDescriptor.addElement("priceChangeUtc8", false);
        pluginGeneratedSerialDescriptor.addElement("liquidity", false);
        pluginGeneratedSerialDescriptor.addElement("turnOver24", false);
        pluginGeneratedSerialDescriptor.addElement("communityRecognized", false);
        pluginGeneratedSerialDescriptor.addElement("riskLevel", false);
        pluginGeneratedSerialDescriptor.addElement("cedefiSupport", false);
        pluginGeneratedSerialDescriptor.addElement("verified", false);
        pluginGeneratedSerialDescriptor.addElement("boosted", false);
        pluginGeneratedSerialDescriptor.addElement("boostPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("boostRate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), booleanSerializer, booleanSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DefiWebCoins deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z;
        boolean z2;
        Boolean bool;
        String str11;
        String str12;
        String str13;
        Boolean bool2;
        String str14;
        String str15;
        String str16;
        int i;
        boolean z3;
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
        boolean z4;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        char c = 11;
        String str27 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, booleanSerializer, null);
            String str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, booleanSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            bool2 = bool4;
            z2 = zDecodeBooleanElement;
            str6 = str32;
            z = zDecodeBooleanElement2;
            str15 = str39;
            str = str43;
            bool = bool3;
            str11 = str42;
            str13 = str41;
            str10 = str40;
            str2 = str33;
            str5 = str31;
            str9 = str36;
            str3 = str29;
            str14 = str38;
            str12 = str37;
            str8 = str35;
            str7 = str34;
            i = 4194303;
            str4 = str30;
            str16 = str28;
        } else {
            boolean zDecodeBooleanElement3 = false;
            int i4 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean z5 = true;
            String str44 = null;
            Boolean bool5 = null;
            String str45 = null;
            String str46 = null;
            String str47 = null;
            String str48 = null;
            Boolean bool6 = null;
            String str49 = null;
            String str50 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str51 = null;
            String str52 = null;
            String str53 = null;
            String str54 = null;
            String str55 = null;
            String str56 = null;
            String str57 = null;
            String str58 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = zDecodeBooleanElement3;
                        str17 = str51;
                        str18 = str52;
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str24 = str44;
                        z5 = false;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str54 = str20;
                        str53 = str19;
                        str52 = str18;
                        str44 = str24;
                        zDecodeBooleanElement3 = z3;
                        c = 11;
                        str51 = str17;
                        break;
                    case 0:
                        z3 = zDecodeBooleanElement3;
                        str17 = str51;
                        str18 = str52;
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str24 = str44;
                        str23 = str57;
                        str58 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str58);
                        i4 |= 1;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str54 = str20;
                        str53 = str19;
                        str52 = str18;
                        str44 = str24;
                        zDecodeBooleanElement3 = z3;
                        c = 11;
                        str51 = str17;
                        break;
                    case 1:
                        z3 = zDecodeBooleanElement3;
                        str17 = str51;
                        str18 = str52;
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str24 = str44;
                        str22 = str56;
                        str57 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str57);
                        i4 |= 2;
                        str23 = str57;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str54 = str20;
                        str53 = str19;
                        str52 = str18;
                        str44 = str24;
                        zDecodeBooleanElement3 = z3;
                        c = 11;
                        str51 = str17;
                        break;
                    case 2:
                        z3 = zDecodeBooleanElement3;
                        str17 = str51;
                        str18 = str52;
                        str19 = str53;
                        str20 = str54;
                        str24 = str44;
                        str21 = str55;
                        str56 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str56);
                        i4 |= 4;
                        str22 = str56;
                        str23 = str57;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str54 = str20;
                        str53 = str19;
                        str52 = str18;
                        str44 = str24;
                        zDecodeBooleanElement3 = z3;
                        c = 11;
                        str51 = str17;
                        break;
                    case 3:
                        z3 = zDecodeBooleanElement3;
                        str17 = str51;
                        str18 = str52;
                        str19 = str53;
                        str24 = str44;
                        str20 = str54;
                        str55 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str55);
                        i4 |= 8;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str54 = str20;
                        str53 = str19;
                        str52 = str18;
                        str44 = str24;
                        zDecodeBooleanElement3 = z3;
                        c = 11;
                        str51 = str17;
                        break;
                    case 4:
                        z3 = zDecodeBooleanElement3;
                        str17 = str51;
                        str18 = str52;
                        str24 = str44;
                        str19 = str53;
                        str54 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str54);
                        i4 |= 16;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str54 = str20;
                        str53 = str19;
                        str52 = str18;
                        str44 = str24;
                        zDecodeBooleanElement3 = z3;
                        c = 11;
                        str51 = str17;
                        break;
                    case 5:
                        z3 = zDecodeBooleanElement3;
                        str17 = str51;
                        str18 = str52;
                        str24 = str44;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str27);
                        str19 = str53;
                        i4 |= 32;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str54 = str20;
                        str53 = str19;
                        str52 = str18;
                        str44 = str24;
                        zDecodeBooleanElement3 = z3;
                        c = 11;
                        str51 = str17;
                        break;
                    case 6:
                        str17 = str51;
                        str25 = str44;
                        str26 = str52;
                        str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str53);
                        i4 |= 64;
                        zDecodeBooleanElement3 = zDecodeBooleanElement3;
                        str52 = str26;
                        str44 = str25;
                        c = 11;
                        str51 = str17;
                        break;
                    case 7:
                        z4 = zDecodeBooleanElement3;
                        String str59 = str51;
                        str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str52);
                        i4 |= 128;
                        str44 = str44;
                        str51 = str59;
                        zDecodeBooleanElement3 = z4;
                        c = 11;
                        break;
                    case 8:
                        z4 = zDecodeBooleanElement3;
                        i4 |= 256;
                        str44 = str44;
                        str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str51);
                        zDecodeBooleanElement3 = z4;
                        c = 11;
                        break;
                    case 9:
                        z4 = zDecodeBooleanElement3;
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str46);
                        i2 = i4 | 512;
                        i4 = i2;
                        zDecodeBooleanElement3 = z4;
                        c = 11;
                        break;
                    case 10:
                        z4 = zDecodeBooleanElement3;
                        i4 |= 1024;
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str49);
                        zDecodeBooleanElement3 = z4;
                        c = 11;
                        break;
                    case 11:
                        z4 = zDecodeBooleanElement3;
                        i4 |= 2048;
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str50);
                        zDecodeBooleanElement3 = z4;
                        c = 11;
                        break;
                    case 12:
                        z4 = zDecodeBooleanElement3;
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str44);
                        i2 = i4 | 4096;
                        i4 = i2;
                        zDecodeBooleanElement3 = z4;
                        c = 11;
                        break;
                    case 13:
                        z4 = zDecodeBooleanElement3;
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str48);
                        i2 = i4 | 8192;
                        i4 = i2;
                        zDecodeBooleanElement3 = z4;
                        c = 11;
                        break;
                    case 14:
                        z4 = zDecodeBooleanElement3;
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str45);
                        i2 = i4 | 16384;
                        i4 = i2;
                        zDecodeBooleanElement3 = z4;
                        c = 11;
                        break;
                    case 15:
                        z4 = zDecodeBooleanElement3;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, bool5);
                        i3 = 32768;
                        i2 = i3 | i4;
                        i4 = i2;
                        zDecodeBooleanElement3 = z4;
                        c = 11;
                        break;
                    case 16:
                        z4 = zDecodeBooleanElement3;
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str47);
                        i3 = 65536;
                        i2 = i3 | i4;
                        i4 = i2;
                        zDecodeBooleanElement3 = z4;
                        c = 11;
                        break;
                    case 17:
                        z4 = zDecodeBooleanElement3;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, BooleanSerializer.INSTANCE, bool6);
                        i3 = 131072;
                        i2 = i3 | i4;
                        i4 = i2;
                        zDecodeBooleanElement3 = z4;
                        c = 11;
                        break;
                    case 18:
                        i4 |= 262144;
                        str17 = str51;
                        str26 = str52;
                        str25 = str44;
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
                        str52 = str26;
                        str44 = str25;
                        c = 11;
                        str51 = str17;
                        break;
                    case 19:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
                        i4 |= 524288;
                        str17 = str51;
                        str26 = str52;
                        str25 = str44;
                        str52 = str26;
                        str44 = str25;
                        c = 11;
                        str51 = str17;
                        break;
                    case 20:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i4 |= 1048576;
                        str17 = str51;
                        str26 = str52;
                        str25 = str44;
                        str52 = str26;
                        str44 = str25;
                        c = 11;
                        str51 = str17;
                        break;
                    case 21:
                        i4 |= 2097152;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        str17 = str51;
                        str26 = str52;
                        str25 = str44;
                        str52 = str26;
                        str44 = str25;
                        c = 11;
                        str51 = str17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str60 = str52;
            String str61 = str53;
            str = str47;
            str2 = str27;
            str3 = str57;
            strDecodeStringElement = strDecodeStringElement3;
            strDecodeStringElement2 = strDecodeStringElement4;
            str4 = str56;
            str5 = str55;
            str6 = str54;
            str7 = str61;
            str8 = str60;
            str9 = str51;
            str10 = str44;
            z = zDecodeBooleanElement4;
            z2 = zDecodeBooleanElement3;
            bool = bool5;
            str11 = str45;
            str12 = str46;
            str13 = str48;
            bool2 = bool6;
            str14 = str49;
            str15 = str50;
            str16 = str58;
            i = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DefiWebCoins(i, str16, str3, str4, str5, str6, str2, str7, str8, str9, str12, str14, str15, str10, str13, str11, bool, str, bool2, z2, z, strDecodeStringElement, strDecodeStringElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DefiWebCoins defiWebCoins) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(defiWebCoins, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DefiWebCoins.write$Self$OKMarket_market_api(defiWebCoins, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
