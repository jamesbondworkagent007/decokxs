package com.okinc.market.common.biz_spot.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class PriceRemindAddReq$$serializer implements GeneratedSerializer<PriceRemindAddReq> {
    public static final int $stable;
    public static final PriceRemindAddReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PriceRemindAddReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PriceRemindAddReq$$serializer priceRemindAddReq$$serializer = new PriceRemindAddReq$$serializer();
        INSTANCE = priceRemindAddReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.market.common.biz_spot.bean.PriceRemindAddReq", priceRemindAddReq$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("sourceType", false);
        pluginGeneratedSerialDescriptor.addElement("bizType", true);
        pluginGeneratedSerialDescriptor.addElement("instrumentName", true);
        pluginGeneratedSerialDescriptor.addElement("promptType", true);
        pluginGeneratedSerialDescriptor.addElement("repeatType", false);
        pluginGeneratedSerialDescriptor.addElement("promptThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("customMsg", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("wrappedAddress", true);
        pluginGeneratedSerialDescriptor.addElement("token", true);
        pluginGeneratedSerialDescriptor.addElement("timePeriod", true);
        pluginGeneratedSerialDescriptor.addElement("indicatorType", true);
        pluginGeneratedSerialDescriptor.addElement("signalType", true);
        pluginGeneratedSerialDescriptor.addElement("condition1", true);
        pluginGeneratedSerialDescriptor.addElement("condition2", true);
        pluginGeneratedSerialDescriptor.addElement("presetCondition", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, intSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PriceRemindAddReq deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        String str8;
        int i2;
        Integer num2;
        String str9;
        String str10;
        String str11;
        Integer num3;
        int i3;
        int i4;
        int iDecodeIntElement;
        String str12;
        String str13;
        String str14;
        String str15;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i7 = 10;
        Integer num4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, intSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, intSerializer, null);
            str11 = str20;
            i2 = iDecodeIntElement4;
            str = str23;
            str5 = str22;
            str3 = str21;
            num3 = num6;
            str10 = str16;
            str2 = str17;
            str7 = strDecodeStringElement2;
            str8 = strDecodeStringElement;
            str6 = str18;
            i = iDecodeIntElement2;
            i3 = 131071;
            str9 = str19;
            i4 = iDecodeIntElement3;
            num2 = num5;
        } else {
            int i8 = 16;
            int i9 = 0;
            int i10 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            boolean z = true;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            Integer num7 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str31 = null;
            Integer num8 = null;
            String str32 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        iDecodeIntElement = i9;
                        str12 = str24;
                        str13 = str31;
                        str14 = str32;
                        z = false;
                        str32 = str14;
                        str31 = str13;
                        str24 = str12;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 0:
                        str12 = str24;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i10 |= 1;
                        str24 = str12;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 1:
                        iDecodeIntElement = i9;
                        str13 = str31;
                        str14 = str32;
                        str12 = str24;
                        i10 |= 2;
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num8);
                        str32 = str14;
                        str31 = str13;
                        str24 = str12;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 2:
                        str15 = str32;
                        iDecodeIntElement = i9;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str31);
                        i10 |= 4;
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 3:
                        str15 = str32;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i10 |= 8;
                        iDecodeIntElement = i9;
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 4:
                        str15 = str32;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i10 |= 16;
                        iDecodeIntElement = i9;
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 5:
                        str15 = str32;
                        i10 |= 32;
                        iDecodeIntElement = i9;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 6:
                        str15 = str32;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i10 |= 64;
                        iDecodeIntElement = i9;
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 7:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str32);
                        iDecodeIntElement = i9;
                        i10 |= 128;
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 8:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str24);
                        i5 = i10 | 256;
                        iDecodeIntElement = i9;
                        i10 = i5;
                        str15 = str32;
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 9:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str25);
                        i5 = i10 | 512;
                        iDecodeIntElement = i9;
                        i10 = i5;
                        str15 = str32;
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 10:
                        iDecodeIntElement = i9;
                        i10 |= 1024;
                        str15 = str32;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i7, StringSerializer.INSTANCE, str27);
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 11:
                        iDecodeIntElement = i9;
                        i10 |= 2048;
                        str15 = str32;
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, num7);
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 12:
                        iDecodeIntElement = i9;
                        i10 |= 4096;
                        str15 = str32;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str28);
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 13:
                        iDecodeIntElement = i9;
                        i10 |= 8192;
                        str15 = str32;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str30);
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 14:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str26);
                        i5 = i10 | 16384;
                        iDecodeIntElement = i9;
                        i10 = i5;
                        str15 = str32;
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 15:
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str29);
                        i6 = 32768;
                        i5 = i6 | i10;
                        iDecodeIntElement = i9;
                        i10 = i5;
                        str15 = str32;
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    case 16:
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i8, IntSerializer.INSTANCE, num4);
                        i6 = 65536;
                        i5 = i6 | i10;
                        iDecodeIntElement = i9;
                        i10 = i5;
                        str15 = str32;
                        str32 = str15;
                        i9 = iDecodeIntElement;
                        i8 = 16;
                        i7 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str26;
            num = num4;
            str2 = str32;
            str3 = str28;
            str4 = str29;
            str5 = str30;
            str6 = str24;
            str7 = strDecodeStringElement3;
            i = i9;
            str8 = strDecodeStringElement4;
            i2 = iDecodeIntElement6;
            num2 = num8;
            str9 = str25;
            str10 = str31;
            str11 = str27;
            num3 = num7;
            i3 = i10;
            i4 = iDecodeIntElement5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PriceRemindAddReq(i3, i, num2, str10, i4, i2, str8, str7, str2, str6, str9, str11, num3, str3, str5, str, str4, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PriceRemindAddReq priceRemindAddReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(priceRemindAddReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PriceRemindAddReq.write$Self$OKMarket_market_api(priceRemindAddReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
