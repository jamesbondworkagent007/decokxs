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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class EarlyFillQuoteBean$$serializer implements GeneratedSerializer<EarlyFillQuoteBean> {
    public static final int $stable;
    public static final EarlyFillQuoteBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EarlyFillQuoteBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EarlyFillQuoteBean$$serializer earlyFillQuoteBean$$serializer = new EarlyFillQuoteBean$$serializer();
        INSTANCE = earlyFillQuoteBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.EarlyFillQuoteBean", earlyFillQuoteBean$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("alternativeCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("earlyFillAmount", true);
        pluginGeneratedSerialDescriptor.addElement("earlyFillCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("notionalAmount", true);
        pluginGeneratedSerialDescriptor.addElement("notionalCurrency", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("ttlMs", true);
        pluginGeneratedSerialDescriptor.addElement("notionalAmountPrecision", true);
        pluginGeneratedSerialDescriptor.addElement("pricePrecision", true);
        pluginGeneratedSerialDescriptor.addElement("earlyFillAmountPrecision", true);
        pluginGeneratedSerialDescriptor.addElement("tradeSide", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EarlyFillQuoteBean deserialize(@NotNull Decoder decoder) {
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
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        int i6 = 8;
        String str19 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str4 = str29;
            str8 = str28;
            str3 = str26;
            str9 = str25;
            str10 = str24;
            str5 = str27;
            str2 = str20;
            str = str22;
            i = 4095;
            str11 = str23;
            str12 = str21;
        } else {
            int i7 = 0;
            boolean z = true;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            str = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        str38 = str38;
                        i6 = 8;
                        break;
                    case 0:
                        str13 = str35;
                        str14 = str37;
                        str15 = str39;
                        String str40 = str38;
                        str16 = str36;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str40);
                        i7 |= 1;
                        str39 = str15;
                        str37 = str14;
                        str35 = str13;
                        str36 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        str38 = str17;
                        break;
                    case 1:
                        str18 = str36;
                        str14 = str37;
                        str15 = str39;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str35);
                        i7 |= 2;
                        str17 = str38;
                        str16 = str18;
                        str39 = str15;
                        str37 = str14;
                        str35 = str13;
                        str36 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        str38 = str17;
                        break;
                    case 2:
                        str18 = str36;
                        str14 = str37;
                        str15 = str39;
                        i7 |= 4;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str34);
                        str13 = str35;
                        str17 = str38;
                        str16 = str18;
                        str39 = str15;
                        str37 = str14;
                        str35 = str13;
                        str36 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        str38 = str17;
                        break;
                    case 3:
                        str18 = str36;
                        str14 = str37;
                        str15 = str39;
                        i7 |= 8;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str);
                        str13 = str35;
                        str17 = str38;
                        str16 = str18;
                        str39 = str15;
                        str37 = str14;
                        str35 = str13;
                        str36 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        str38 = str17;
                        break;
                    case 4:
                        str18 = str36;
                        str15 = str39;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str37);
                        i7 |= 16;
                        str13 = str35;
                        str17 = str38;
                        str16 = str18;
                        str39 = str15;
                        str37 = str14;
                        str35 = str13;
                        str36 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        str38 = str17;
                        break;
                    case 5:
                        str18 = str36;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str39);
                        i7 |= 32;
                        str13 = str35;
                        str14 = str37;
                        str17 = str38;
                        str16 = str18;
                        str39 = str15;
                        str37 = str14;
                        str35 = str13;
                        str36 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        str38 = str17;
                        break;
                    case 6:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str36);
                        i7 |= 64;
                        str13 = str35;
                        str14 = str37;
                        str17 = str38;
                        str15 = str39;
                        str16 = str18;
                        str39 = str15;
                        str37 = str14;
                        str35 = str13;
                        str36 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        str38 = str17;
                        break;
                    case 7:
                        i7 |= 128;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str30);
                        str13 = str35;
                        str14 = str37;
                        str17 = str38;
                        str15 = str39;
                        str16 = str36;
                        str39 = str15;
                        str37 = str14;
                        str35 = str13;
                        str36 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        str38 = str17;
                        break;
                    case 8:
                        i7 |= 256;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str32);
                        str13 = str35;
                        str14 = str37;
                        str17 = str38;
                        str15 = str39;
                        str16 = str36;
                        str39 = str15;
                        str37 = str14;
                        str35 = str13;
                        str36 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        str38 = str17;
                        break;
                    case 9:
                        i7 |= 512;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str19);
                        str13 = str35;
                        str14 = str37;
                        str17 = str38;
                        str15 = str39;
                        str16 = str36;
                        str39 = str15;
                        str37 = str14;
                        str35 = str13;
                        str36 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        str38 = str17;
                        break;
                    case 10:
                        i7 |= 1024;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str31);
                        str13 = str35;
                        str14 = str37;
                        str17 = str38;
                        str15 = str39;
                        str16 = str36;
                        str39 = str15;
                        str37 = str14;
                        str35 = str13;
                        str36 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        str38 = str17;
                        break;
                    case 11:
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str33);
                        i7 |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str41 = str35;
            str2 = str38;
            str3 = str30;
            str4 = str31;
            str5 = str32;
            str6 = str33;
            str7 = str34;
            str8 = str19;
            str9 = str36;
            i = i7;
            str10 = str39;
            str11 = str37;
            str12 = str41;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EarlyFillQuoteBean(i, str2, str12, str7, str, str11, str10, str9, str3, str5, str8, str4, str6, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EarlyFillQuoteBean earlyFillQuoteBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(earlyFillQuoteBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EarlyFillQuoteBean.write$Self$OKTradeCore_trade_core(earlyFillQuoteBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
