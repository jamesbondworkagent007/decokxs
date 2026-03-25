package com.okinc.unify_trade.biz;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class ArbitrageOrderBean$$serializer implements GeneratedSerializer<ArbitrageOrderBean> {
    public static final int $stable;
    public static final ArbitrageOrderBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ArbitrageOrderBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ArbitrageOrderBean$$serializer arbitrageOrderBean$$serializer = new ArbitrageOrderBean$$serializer();
        INSTANCE = arbitrageOrderBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.ArbitrageOrderBean", arbitrageOrderBean$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement("posSide", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.SIDE, true);
        pluginGeneratedSerialDescriptor.addElement("avgPx", true);
        pluginGeneratedSerialDescriptor.addElement("accFillSz", true);
        pluginGeneratedSerialDescriptor.addElement("px", true);
        pluginGeneratedSerialDescriptor.addElement("sz", true);
        pluginGeneratedSerialDescriptor.addElement("reduceOnly", true);
        pluginGeneratedSerialDescriptor.addElement("subOrderState", true);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("major", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE, true);
        pluginGeneratedSerialDescriptor.addElement("tdMode", true);
        pluginGeneratedSerialDescriptor.addElement("pxType", true);
        pluginGeneratedSerialDescriptor.addElement("_last", true);
        pluginGeneratedSerialDescriptor.addElement("transform", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ArbitrageOrderBean deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Boolean bool;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Boolean bool2;
        Boolean bool3;
        String str14;
        int i;
        String str15;
        Boolean bool4;
        String str16;
        int i2;
        int i3;
        String str17;
        String str18;
        Boolean bool5;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str24 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, booleanSerializer, null);
            str5 = str30;
            str3 = str37;
            str2 = str36;
            str = str35;
            bool2 = bool7;
            str9 = str26;
            str4 = str33;
            str7 = str32;
            str6 = str31;
            bool = bool6;
            str10 = str25;
            i = 131071;
            str12 = str29;
            str11 = str28;
            str14 = str27;
            str13 = str34;
        } else {
            int i4 = 16;
            int i5 = 0;
            boolean z = true;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            Boolean bool8 = null;
            String str42 = null;
            String str43 = null;
            Boolean bool9 = null;
            String str44 = null;
            String str45 = null;
            Boolean bool10 = null;
            String str46 = null;
            String str47 = null;
            String str48 = null;
            String str49 = null;
            String str50 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str17 = str38;
                        str18 = str24;
                        bool5 = bool10;
                        str19 = str46;
                        str20 = str47;
                        str21 = str48;
                        str22 = str50;
                        str23 = str49;
                        z = false;
                        str48 = str21;
                        str47 = str20;
                        str46 = str19;
                        bool10 = bool5;
                        str24 = str18;
                        str49 = str23;
                        i4 = 16;
                        str50 = str22;
                        str38 = str17;
                        break;
                    case 0:
                        str17 = str38;
                        str18 = str24;
                        bool5 = bool10;
                        str19 = str46;
                        str20 = str47;
                        str21 = str48;
                        String str51 = str50;
                        str23 = str49;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str51);
                        i5 |= 1;
                        str48 = str21;
                        str47 = str20;
                        str46 = str19;
                        bool10 = bool5;
                        str24 = str18;
                        str49 = str23;
                        i4 = 16;
                        str50 = str22;
                        str38 = str17;
                        break;
                    case 1:
                        str18 = str24;
                        bool5 = bool10;
                        str19 = str46;
                        str20 = str47;
                        str21 = str48;
                        str17 = str38;
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str49);
                        i5 |= 2;
                        str22 = str50;
                        str23 = str49;
                        str48 = str21;
                        str47 = str20;
                        str46 = str19;
                        bool10 = bool5;
                        str24 = str18;
                        str49 = str23;
                        i4 = 16;
                        str50 = str22;
                        str38 = str17;
                        break;
                    case 2:
                        str18 = str24;
                        bool5 = bool10;
                        str19 = str46;
                        str20 = str47;
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str48);
                        i5 |= 4;
                        str17 = str38;
                        str21 = str48;
                        str22 = str50;
                        str23 = str49;
                        str48 = str21;
                        str47 = str20;
                        str46 = str19;
                        bool10 = bool5;
                        str24 = str18;
                        str49 = str23;
                        i4 = 16;
                        str50 = str22;
                        str38 = str17;
                        break;
                    case 3:
                        str18 = str24;
                        bool5 = bool10;
                        str19 = str46;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str39);
                        i5 |= 8;
                        str20 = str47;
                        str17 = str38;
                        str21 = str48;
                        str22 = str50;
                        str23 = str49;
                        str48 = str21;
                        str47 = str20;
                        str46 = str19;
                        bool10 = bool5;
                        str24 = str18;
                        str49 = str23;
                        i4 = 16;
                        str50 = str22;
                        str38 = str17;
                        break;
                    case 4:
                        str18 = str24;
                        bool5 = bool10;
                        str19 = str46;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str40);
                        str20 = str47;
                        str17 = str38;
                        i5 |= 16;
                        str21 = str48;
                        str22 = str50;
                        str23 = str49;
                        str48 = str21;
                        str47 = str20;
                        str46 = str19;
                        bool10 = bool5;
                        str24 = str18;
                        str49 = str23;
                        i4 = 16;
                        str50 = str22;
                        str38 = str17;
                        break;
                    case 5:
                        str15 = str24;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str38);
                        i5 |= 32;
                        str24 = str15;
                        i4 = 16;
                        break;
                    case 6:
                        str15 = str24;
                        bool4 = bool10;
                        str16 = str46;
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str47);
                        i5 |= 64;
                        str46 = str16;
                        bool10 = bool4;
                        str24 = str15;
                        i4 = 16;
                        break;
                    case 7:
                        str15 = str24;
                        bool4 = bool10;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str46);
                        i5 |= 128;
                        str46 = str16;
                        bool10 = bool4;
                        str24 = str15;
                        i4 = 16;
                        break;
                    case 8:
                        str15 = str24;
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool10);
                        i5 |= 256;
                        str16 = str46;
                        str46 = str16;
                        bool10 = bool4;
                        str24 = str15;
                        i4 = 16;
                        break;
                    case 9:
                        i5 |= 512;
                        str15 = str24;
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str45);
                        bool4 = bool10;
                        str16 = str46;
                        str46 = str16;
                        bool10 = bool4;
                        str24 = str15;
                        i4 = 16;
                        break;
                    case 10:
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str41);
                        i2 = i5 | 1024;
                        str15 = str24;
                        i5 = i2;
                        bool4 = bool10;
                        str16 = str46;
                        str46 = str16;
                        bool10 = bool4;
                        str24 = str15;
                        i4 = 16;
                        break;
                    case 11:
                        i5 |= 2048;
                        str15 = str24;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, bool8);
                        bool4 = bool10;
                        str16 = str46;
                        str46 = str16;
                        bool10 = bool4;
                        str24 = str15;
                        i4 = 16;
                        break;
                    case 12:
                        i5 |= 4096;
                        str15 = str24;
                        str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str42);
                        bool4 = bool10;
                        str16 = str46;
                        str46 = str16;
                        bool10 = bool4;
                        str24 = str15;
                        i4 = 16;
                        break;
                    case 13:
                        i5 |= 8192;
                        str15 = str24;
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str43);
                        bool4 = bool10;
                        str16 = str46;
                        str46 = str16;
                        bool10 = bool4;
                        str24 = str15;
                        i4 = 16;
                        break;
                    case 14:
                        i5 |= 16384;
                        str15 = str24;
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str44);
                        bool4 = bool10;
                        str16 = str46;
                        str46 = str16;
                        bool10 = bool4;
                        str24 = str15;
                        i4 = 16;
                        break;
                    case 15:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str24);
                        i3 = 32768;
                        i2 = i3 | i5;
                        str15 = str24;
                        i5 = i2;
                        bool4 = bool10;
                        str16 = str46;
                        str46 = str16;
                        bool10 = bool4;
                        str24 = str15;
                        i4 = 16;
                        break;
                    case 16:
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool9);
                        i3 = 65536;
                        i2 = i3 | i5;
                        str15 = str24;
                        i5 = i2;
                        bool4 = bool10;
                        str16 = str46;
                        str46 = str16;
                        bool10 = bool4;
                        str24 = str15;
                        i4 = 16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str42;
            str2 = str43;
            str3 = str44;
            str4 = str45;
            str5 = str38;
            str6 = str47;
            str7 = str46;
            bool = bool10;
            str8 = str24;
            str9 = str49;
            str10 = str50;
            str11 = str39;
            str12 = str40;
            str13 = str41;
            bool2 = bool8;
            bool3 = bool9;
            str14 = str48;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ArbitrageOrderBean(i, str10, str9, str14, str11, str12, str5, str6, str7, bool, str4, str13, bool2, str, str2, str3, str8, bool3, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ArbitrageOrderBean arbitrageOrderBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(arbitrageOrderBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ArbitrageOrderBean.write$Self$OKTradeCore_trade_core(arbitrageOrderBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
