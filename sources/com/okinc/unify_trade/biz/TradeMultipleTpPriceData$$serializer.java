package com.okinc.unify_trade.biz;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.p2p.api.OtcExtraKeys;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class TradeMultipleTpPriceData$$serializer implements GeneratedSerializer<TradeMultipleTpPriceData> {
    public static final int $stable;
    public static final TradeMultipleTpPriceData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TradeMultipleTpPriceData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TradeMultipleTpPriceData$$serializer tradeMultipleTpPriceData$$serializer = new TradeMultipleTpPriceData$$serializer();
        INSTANCE = tradeMultipleTpPriceData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.TradeMultipleTpPriceData", tradeMultipleTpPriceData$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, false);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, false);
        pluginGeneratedSerialDescriptor.addElement("percent", true);
        pluginGeneratedSerialDescriptor.addElement("color", true);
        pluginGeneratedSerialDescriptor.addElement("amountApi", true);
        pluginGeneratedSerialDescriptor.addElement("triggerPriceType", true);
        pluginGeneratedSerialDescriptor.addElement("profit", true);
        pluginGeneratedSerialDescriptor.addElement("isPriceValid", true);
        pluginGeneratedSerialDescriptor.addElement("isAmountValid", true);
        pluginGeneratedSerialDescriptor.addElement("isTpLimit", true);
        pluginGeneratedSerialDescriptor.addElement("failCode", true);
        pluginGeneratedSerialDescriptor.addElement("failReason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, FloatSerializer.INSTANCE, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TradeMultipleTpPriceData deserialize(@NotNull Decoder decoder) {
        boolean z;
        int i;
        String str;
        String str2;
        float f;
        String str3;
        String str4;
        boolean z2;
        String str5;
        String str6;
        boolean z3;
        String str7;
        Integer num;
        Integer num2;
        Integer num3;
        int i2;
        Integer num4;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 11;
        int i6 = 10;
        int i7 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            float fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 2);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str2 = str10;
            z = zDecodeBooleanElement3;
            z3 = zDecodeBooleanElement;
            str4 = str9;
            str6 = str8;
            z2 = zDecodeBooleanElement2;
            str3 = strDecodeStringElement3;
            i = 4095;
            str7 = strDecodeStringElement;
            num = num5;
            f = fDecodeFloatElement;
            str5 = strDecodeStringElement2;
        } else {
            float fDecodeFloatElement2 = 0.0f;
            boolean z4 = true;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            Integer num6 = null;
            String strDecodeStringElement6 = null;
            boolean zDecodeBooleanElement4 = false;
            int i8 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            String str14 = null;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        num2 = num6;
                        z4 = false;
                        num6 = num2;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 0:
                        num3 = num6;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = i8 | 1;
                        int i9 = i2;
                        num4 = num3;
                        i3 = i9;
                        Integer num7 = num4;
                        i8 = i3;
                        num2 = num7;
                        num6 = num2;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 1:
                        num3 = num6;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = i8 | 2;
                        int i92 = i2;
                        num4 = num3;
                        i3 = i92;
                        Integer num72 = num4;
                        i8 = i3;
                        num2 = num72;
                        num6 = num2;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 2:
                        num3 = num6;
                        fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 2);
                        i2 = i8 | 4;
                        int i922 = i2;
                        num4 = num3;
                        i3 = i922;
                        Integer num722 = num4;
                        i8 = i3;
                        num2 = num722;
                        num6 = num2;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 3:
                        i3 = i8 | 8;
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num6);
                        Integer num7222 = num4;
                        i8 = i3;
                        num2 = num7222;
                        num6 = num2;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 4:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i8 |= 16;
                        num2 = num6;
                        num6 = num2;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 5:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str11);
                        i8 |= 32;
                        num2 = num6;
                        num6 = num2;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 6:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str12);
                        i8 |= 64;
                        break;
                    case 7:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i4 = i8 | 128;
                        i8 = i4;
                        num2 = num6;
                        num6 = num2;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 8:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i4 = i8 | 256;
                        i8 = i4;
                        num2 = num6;
                        num6 = num2;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 9:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i7);
                        i4 = i8 | 512;
                        i8 = i4;
                        num2 = num6;
                        num6 = num2;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 10:
                        i8 |= 1024;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str14);
                        num2 = num6;
                        num6 = num2;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 11:
                        i8 |= 2048;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str13);
                        num2 = num6;
                        num6 = num2;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Integer num8 = num6;
            z = zDecodeBooleanElement4;
            i = i8;
            str = str13;
            str2 = str14;
            f = fDecodeFloatElement2;
            str3 = strDecodeStringElement5;
            str4 = str12;
            z2 = zDecodeBooleanElement5;
            str5 = strDecodeStringElement4;
            str6 = str11;
            z3 = zDecodeBooleanElement6;
            str7 = strDecodeStringElement6;
            num = num8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TradeMultipleTpPriceData(i, str7, str5, f, num, str3, str6, str4, z3, z2, z, str2, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TradeMultipleTpPriceData tradeMultipleTpPriceData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradeMultipleTpPriceData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TradeMultipleTpPriceData.write$Self$OKTradeCore_trade_core(tradeMultipleTpPriceData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
