package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class DcdOrderReq$$serializer implements GeneratedSerializer<DcdOrderReq> {
    public static final int $stable;
    public static final DcdOrderReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DcdOrderReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DcdOrderReq$$serializer dcdOrderReq$$serializer = new DcdOrderReq$$serializer();
        INSTANCE = dcdOrderReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.DcdOrderReq", dcdOrderReq$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("quoteId", true);
        pluginGeneratedSerialDescriptor.addElement("notional", true);
        pluginGeneratedSerialDescriptor.addElement("notionalCcy", true);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement("altCurrencyId", true);
        pluginGeneratedSerialDescriptor.addElement("dcdOptionType", true);
        pluginGeneratedSerialDescriptor.addElement("strike", true);
        pluginGeneratedSerialDescriptor.addElement("currentStrike", true);
        pluginGeneratedSerialDescriptor.addElement("strikePercentage", true);
        pluginGeneratedSerialDescriptor.addElement("minAnnualYieldPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("maxSettlementDay", true);
        pluginGeneratedSerialDescriptor.addElement("stopPrice", true);
        pluginGeneratedSerialDescriptor.addElement("stopPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("reinvestment", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.TERM, true);
        pluginGeneratedSerialDescriptor.addElement("expiryTime", true);
        pluginGeneratedSerialDescriptor.addElement("apr", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DcdOrderReq deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i;
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
        int i2;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            str12 = str45;
            str3 = str41;
            str9 = str40;
            str11 = str44;
            str4 = str43;
            str6 = str42;
            str8 = str37;
            str = str36;
            str2 = str38;
            str15 = str30;
            i = 131071;
            str5 = str35;
            str7 = str34;
            str13 = str31;
            str17 = str33;
            str10 = str32;
            str14 = str39;
        } else {
            int i4 = 16;
            boolean z = true;
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
            String str56 = null;
            String str57 = null;
            String str58 = null;
            String str59 = null;
            String str60 = null;
            String str61 = null;
            int i5 = 0;
            String str62 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str22 = str62;
                        str23 = str46;
                        str24 = str55;
                        str25 = str56;
                        str26 = str57;
                        str27 = str58;
                        str28 = str60;
                        str29 = str59;
                        z = false;
                        str58 = str27;
                        str56 = str25;
                        str46 = str23;
                        str57 = str26;
                        str55 = str24;
                        str62 = str22;
                        str59 = str29;
                        i4 = 16;
                        i3 = 11;
                        str60 = str28;
                        break;
                    case 0:
                        str22 = str62;
                        str23 = str46;
                        str24 = str55;
                        str25 = str56;
                        str26 = str57;
                        str27 = str58;
                        String str63 = str60;
                        str29 = str59;
                        str28 = str63;
                        str61 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str61);
                        i5 |= 1;
                        str58 = str27;
                        str56 = str25;
                        str46 = str23;
                        str57 = str26;
                        str55 = str24;
                        str62 = str22;
                        str59 = str29;
                        i4 = 16;
                        i3 = 11;
                        str60 = str28;
                        break;
                    case 1:
                        str22 = str62;
                        str23 = str46;
                        str24 = str55;
                        str25 = str56;
                        str26 = str57;
                        str27 = str58;
                        String str64 = str60;
                        str29 = str59;
                        i5 |= 2;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str64);
                        str58 = str27;
                        str56 = str25;
                        str46 = str23;
                        str57 = str26;
                        str55 = str24;
                        str62 = str22;
                        str59 = str29;
                        i4 = 16;
                        i3 = 11;
                        str60 = str28;
                        break;
                    case 2:
                        str22 = str62;
                        str24 = str55;
                        str25 = str56;
                        str26 = str57;
                        str27 = str58;
                        str23 = str46;
                        str59 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str59);
                        i5 |= 4;
                        str28 = str60;
                        str29 = str59;
                        str58 = str27;
                        str56 = str25;
                        str46 = str23;
                        str57 = str26;
                        str55 = str24;
                        str62 = str22;
                        str59 = str29;
                        i4 = 16;
                        i3 = 11;
                        str60 = str28;
                        break;
                    case 3:
                        str22 = str62;
                        str24 = str55;
                        str25 = str56;
                        str26 = str57;
                        str27 = str58;
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str47);
                        i5 |= 8;
                        str23 = str46;
                        str28 = str60;
                        str29 = str59;
                        str58 = str27;
                        str56 = str25;
                        str46 = str23;
                        str57 = str26;
                        str55 = str24;
                        str62 = str22;
                        str59 = str29;
                        i4 = 16;
                        i3 = 11;
                        str60 = str28;
                        break;
                    case 4:
                        str22 = str62;
                        str24 = str55;
                        str25 = str56;
                        str26 = str57;
                        str27 = str58;
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str46);
                        i5 |= 16;
                        str23 = str46;
                        str28 = str60;
                        str29 = str59;
                        str58 = str27;
                        str56 = str25;
                        str46 = str23;
                        str57 = str26;
                        str55 = str24;
                        str62 = str22;
                        str59 = str29;
                        i4 = 16;
                        i3 = 11;
                        str60 = str28;
                        break;
                    case 5:
                        str18 = str62;
                        str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str52);
                        i5 |= 32;
                        str62 = str18;
                        i4 = 16;
                        i3 = 11;
                        break;
                    case 6:
                        str18 = str62;
                        str19 = str56;
                        str20 = str57;
                        i5 |= 64;
                        str58 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str58);
                        str21 = str55;
                        str55 = str21;
                        str56 = str19;
                        str57 = str20;
                        str62 = str18;
                        i4 = 16;
                        i3 = 11;
                        break;
                    case 7:
                        str18 = str62;
                        str19 = str56;
                        i5 |= 128;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str57);
                        str21 = str55;
                        str55 = str21;
                        str56 = str19;
                        str57 = str20;
                        str62 = str18;
                        i4 = 16;
                        i3 = 11;
                        break;
                    case 8:
                        str21 = str55;
                        str18 = str62;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str56);
                        i5 |= 256;
                        str20 = str57;
                        str55 = str21;
                        str56 = str19;
                        str57 = str20;
                        str62 = str18;
                        i4 = 16;
                        i3 = 11;
                        break;
                    case 9:
                        str21 = str55;
                        str62 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str62);
                        i5 |= 512;
                        str18 = str62;
                        str19 = str56;
                        str20 = str57;
                        str55 = str21;
                        str56 = str19;
                        str57 = str20;
                        str62 = str18;
                        i4 = 16;
                        i3 = 11;
                        break;
                    case 10:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str55);
                        i5 |= 1024;
                        str18 = str62;
                        str19 = str56;
                        str20 = str57;
                        str55 = str21;
                        str56 = str19;
                        str57 = str20;
                        str62 = str18;
                        i4 = 16;
                        i3 = 11;
                        break;
                    case 11:
                        i5 |= 2048;
                        str18 = str62;
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str48);
                        str21 = str55;
                        str19 = str56;
                        str20 = str57;
                        str55 = str21;
                        str56 = str19;
                        str57 = str20;
                        str62 = str18;
                        i4 = 16;
                        i3 = 11;
                        break;
                    case 12:
                        i5 |= 4096;
                        str18 = str62;
                        str54 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str54);
                        str21 = str55;
                        str19 = str56;
                        str20 = str57;
                        str55 = str21;
                        str56 = str19;
                        str57 = str20;
                        str62 = str18;
                        i4 = 16;
                        i3 = 11;
                        break;
                    case 13:
                        i5 |= 8192;
                        str18 = str62;
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str49);
                        str21 = str55;
                        str19 = str56;
                        str20 = str57;
                        str55 = str21;
                        str56 = str19;
                        str57 = str20;
                        str62 = str18;
                        i4 = 16;
                        i3 = 11;
                        break;
                    case 14:
                        i5 |= 16384;
                        str18 = str62;
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str50);
                        str21 = str55;
                        str19 = str56;
                        str20 = str57;
                        str55 = str21;
                        str56 = str19;
                        str57 = str20;
                        str62 = str18;
                        i4 = 16;
                        i3 = 11;
                        break;
                    case 15:
                        str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str51);
                        i2 = 32768;
                        i5 |= i2;
                        str18 = str62;
                        str21 = str55;
                        str19 = str56;
                        str20 = str57;
                        str55 = str21;
                        str56 = str19;
                        str57 = str20;
                        str62 = str18;
                        i4 = 16;
                        i3 = 11;
                        break;
                    case 16:
                        str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str53);
                        i2 = 65536;
                        i5 |= i2;
                        str18 = str62;
                        str21 = str55;
                        str19 = str56;
                        str20 = str57;
                        str55 = str21;
                        str56 = str19;
                        str57 = str20;
                        str62 = str18;
                        i4 = 16;
                        i3 = 11;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str58;
            str2 = str56;
            str3 = str48;
            str4 = str49;
            str5 = str52;
            str6 = str54;
            str7 = str46;
            str8 = str57;
            str9 = str55;
            str10 = str59;
            i = i5;
            str11 = str50;
            str12 = str51;
            str13 = str60;
            str14 = str62;
            str15 = str61;
            str16 = str53;
            str17 = str47;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DcdOrderReq(i, str15, str13, str10, str17, str7, str5, str, str8, str2, str14, str9, str3, str6, str4, str11, str12, str16, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DcdOrderReq dcdOrderReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dcdOrderReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DcdOrderReq.write$Self$OKTradeCore_trade_core(dcdOrderReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
