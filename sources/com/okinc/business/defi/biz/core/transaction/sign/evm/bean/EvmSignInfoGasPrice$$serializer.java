package com.okinc.business.defi.biz.core.transaction.sign.evm.bean;

import java.util.List;
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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class EvmSignInfoGasPrice$$serializer implements GeneratedSerializer<EvmSignInfoGasPrice> {
    public static final int $stable;
    public static final EvmSignInfoGasPrice$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EvmSignInfoGasPrice$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EvmSignInfoGasPrice$$serializer evmSignInfoGasPrice$$serializer = new EvmSignInfoGasPrice$$serializer();
        INSTANCE = evmSignInfoGasPrice$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice", evmSignInfoGasPrice$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("min", true);
        pluginGeneratedSerialDescriptor.addElement("normal", true);
        pluginGeneratedSerialDescriptor.addElement("max", true);
        pluginGeneratedSerialDescriptor.addElement("minCost", true);
        pluginGeneratedSerialDescriptor.addElement("normalCost", true);
        pluginGeneratedSerialDescriptor.addElement("maxCost", true);
        pluginGeneratedSerialDescriptor.addElement("safePriorityFee", true);
        pluginGeneratedSerialDescriptor.addElement("proposePriorityFee", true);
        pluginGeneratedSerialDescriptor.addElement("fastPriorityFee", true);
        pluginGeneratedSerialDescriptor.addElement("supportEip1559", true);
        pluginGeneratedSerialDescriptor.addElement("suggestBaseFee", true);
        pluginGeneratedSerialDescriptor.addElement("baseFee", true);
        pluginGeneratedSerialDescriptor.addElement("minGasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("estimateTimeList", true);
        pluginGeneratedSerialDescriptor.addElement("oriMin", true);
        pluginGeneratedSerialDescriptor.addElement("oriNormal", true);
        pluginGeneratedSerialDescriptor.addElement("oriMax", true);
        pluginGeneratedSerialDescriptor.addElement("original", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = EvmSignInfoGasPrice.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[13]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EvmSignInfoGasPrice deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        String str7;
        String str8;
        List list;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        KSerializer[] kSerializerArr;
        String str18;
        String str19;
        Boolean bool2;
        int i2;
        KSerializer[] kSerializerArr2;
        String str20;
        String str21;
        Boolean bool3;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = EvmSignInfoGasPrice.$childSerializers;
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
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr3[13], null);
            String str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            str11 = str40;
            i = 262143;
            str5 = str37;
            str13 = str41;
            str4 = str36;
            str6 = str29;
            list = list2;
            bool = bool4;
            str10 = str28;
            str2 = str35;
            str9 = str30;
            str16 = str34;
            str12 = str31;
            str7 = str33;
            str14 = str32;
            str3 = str39;
            str = str38;
        } else {
            boolean z = true;
            String str42 = null;
            String str43 = null;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            List list3 = null;
            String str47 = null;
            String str48 = null;
            String str49 = null;
            String str50 = null;
            String str51 = null;
            Boolean bool5 = null;
            String str52 = null;
            String str53 = null;
            String str54 = null;
            String str55 = null;
            String str56 = null;
            i = 0;
            String str57 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        str20 = str42;
                        str21 = str51;
                        bool3 = bool5;
                        str22 = str52;
                        str23 = str53;
                        str24 = str55;
                        str25 = str56;
                        str26 = str54;
                        z = false;
                        kSerializerArr3 = kSerializerArr2;
                        str55 = str24;
                        str53 = str23;
                        str52 = str22;
                        bool5 = bool3;
                        str51 = str21;
                        str54 = str26;
                        str56 = str25;
                        str42 = str20;
                        break;
                    case 0:
                        kSerializerArr2 = kSerializerArr3;
                        str20 = str42;
                        str21 = str51;
                        bool3 = bool5;
                        str22 = str52;
                        str23 = str53;
                        str24 = str55;
                        String str58 = str56;
                        str26 = str54;
                        i |= 1;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str58);
                        str57 = str57;
                        kSerializerArr3 = kSerializerArr2;
                        str55 = str24;
                        str53 = str23;
                        str52 = str22;
                        bool5 = bool3;
                        str51 = str21;
                        str54 = str26;
                        str56 = str25;
                        str42 = str20;
                        break;
                    case 1:
                        kSerializerArr2 = kSerializerArr3;
                        str20 = str42;
                        str21 = str51;
                        bool3 = bool5;
                        str22 = str52;
                        str23 = str53;
                        str24 = str55;
                        str54 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str54);
                        i |= 2;
                        str57 = str57;
                        str25 = str56;
                        str26 = str54;
                        kSerializerArr3 = kSerializerArr2;
                        str55 = str24;
                        str53 = str23;
                        str52 = str22;
                        bool5 = bool3;
                        str51 = str21;
                        str54 = str26;
                        str56 = str25;
                        str42 = str20;
                        break;
                    case 2:
                        kSerializerArr2 = kSerializerArr3;
                        str20 = str42;
                        str21 = str51;
                        bool3 = bool5;
                        str22 = str52;
                        str23 = str53;
                        str55 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str55);
                        i |= 4;
                        str57 = str57;
                        str24 = str55;
                        str25 = str56;
                        str26 = str54;
                        kSerializerArr3 = kSerializerArr2;
                        str55 = str24;
                        str53 = str23;
                        str52 = str22;
                        bool5 = bool3;
                        str51 = str21;
                        str54 = str26;
                        str56 = str25;
                        str42 = str20;
                        break;
                    case 3:
                        kSerializerArr2 = kSerializerArr3;
                        str20 = str42;
                        str21 = str51;
                        bool3 = bool5;
                        str22 = str52;
                        str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str53);
                        i |= 8;
                        str57 = str57;
                        str23 = str53;
                        str24 = str55;
                        str25 = str56;
                        str26 = str54;
                        kSerializerArr3 = kSerializerArr2;
                        str55 = str24;
                        str53 = str23;
                        str52 = str22;
                        bool5 = bool3;
                        str51 = str21;
                        str54 = str26;
                        str56 = str25;
                        str42 = str20;
                        break;
                    case 4:
                        kSerializerArr2 = kSerializerArr3;
                        str20 = str42;
                        str21 = str51;
                        bool3 = bool5;
                        str22 = str52;
                        str57 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str57);
                        i |= 16;
                        str23 = str53;
                        str24 = str55;
                        str25 = str56;
                        str26 = str54;
                        kSerializerArr3 = kSerializerArr2;
                        str55 = str24;
                        str53 = str23;
                        str52 = str22;
                        bool5 = bool3;
                        str51 = str21;
                        str54 = str26;
                        str56 = str25;
                        str42 = str20;
                        break;
                    case 5:
                        kSerializerArr2 = kSerializerArr3;
                        str27 = str57;
                        str20 = str42;
                        str21 = str51;
                        bool3 = bool5;
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str44);
                        str22 = str52;
                        i |= 32;
                        str23 = str53;
                        str24 = str55;
                        str25 = str56;
                        str57 = str27;
                        str26 = str54;
                        kSerializerArr3 = kSerializerArr2;
                        str55 = str24;
                        str53 = str23;
                        str52 = str22;
                        bool5 = bool3;
                        str51 = str21;
                        str54 = str26;
                        str56 = str25;
                        str42 = str20;
                        break;
                    case 6:
                        kSerializerArr2 = kSerializerArr3;
                        str27 = str57;
                        str20 = str42;
                        str21 = str51;
                        bool3 = bool5;
                        i |= 64;
                        str22 = str52;
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str43);
                        str23 = str53;
                        str24 = str55;
                        str25 = str56;
                        str57 = str27;
                        str26 = str54;
                        kSerializerArr3 = kSerializerArr2;
                        str55 = str24;
                        str53 = str23;
                        str52 = str22;
                        bool5 = bool3;
                        str51 = str21;
                        str54 = str26;
                        str56 = str25;
                        str42 = str20;
                        break;
                    case 7:
                        str17 = str57;
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str49);
                        i |= 128;
                        kSerializerArr3 = kSerializerArr3;
                        str42 = str42;
                        str57 = str17;
                        break;
                    case 8:
                        kSerializerArr = kSerializerArr3;
                        str17 = str57;
                        str18 = str42;
                        str19 = str51;
                        bool2 = bool5;
                        str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str52);
                        i |= 256;
                        kSerializerArr3 = kSerializerArr;
                        str42 = str18;
                        bool5 = bool2;
                        str51 = str19;
                        str57 = str17;
                        break;
                    case 9:
                        kSerializerArr = kSerializerArr3;
                        str17 = str57;
                        str18 = str42;
                        str19 = str51;
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, bool5);
                        i |= 512;
                        kSerializerArr3 = kSerializerArr;
                        str42 = str18;
                        bool5 = bool2;
                        str51 = str19;
                        str57 = str17;
                        break;
                    case 10:
                        kSerializerArr = kSerializerArr3;
                        str17 = str57;
                        str18 = str42;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str51);
                        i |= 1024;
                        bool2 = bool5;
                        kSerializerArr3 = kSerializerArr;
                        str42 = str18;
                        bool5 = bool2;
                        str51 = str19;
                        str57 = str17;
                        break;
                    case 11:
                        kSerializerArr = kSerializerArr3;
                        str17 = str57;
                        i |= 2048;
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str46);
                        str18 = str42;
                        str19 = str51;
                        bool2 = bool5;
                        kSerializerArr3 = kSerializerArr;
                        str42 = str18;
                        bool5 = bool2;
                        str51 = str19;
                        str57 = str17;
                        break;
                    case 12:
                        str17 = str57;
                        kSerializerArr = kSerializerArr3;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str42);
                        i |= 4096;
                        str19 = str51;
                        bool2 = bool5;
                        kSerializerArr3 = kSerializerArr;
                        str42 = str18;
                        bool5 = bool2;
                        str51 = str19;
                        str57 = str17;
                        break;
                    case 13:
                        str17 = str57;
                        i |= 8192;
                        kSerializerArr = kSerializerArr3;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr3[13], list3);
                        str18 = str42;
                        str19 = str51;
                        bool2 = bool5;
                        kSerializerArr3 = kSerializerArr;
                        str42 = str18;
                        bool5 = bool2;
                        str51 = str19;
                        str57 = str17;
                        break;
                    case 14:
                        str17 = str57;
                        i |= 16384;
                        kSerializerArr = kSerializerArr3;
                        str18 = str42;
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str47);
                        str19 = str51;
                        bool2 = bool5;
                        kSerializerArr3 = kSerializerArr;
                        str42 = str18;
                        bool5 = bool2;
                        str51 = str19;
                        str57 = str17;
                        break;
                    case 15:
                        str17 = str57;
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str48);
                        i2 = 32768;
                        kSerializerArr = kSerializerArr3;
                        str18 = str42;
                        i = i2 | i;
                        str19 = str51;
                        bool2 = bool5;
                        kSerializerArr3 = kSerializerArr;
                        str42 = str18;
                        bool5 = bool2;
                        str51 = str19;
                        str57 = str17;
                        break;
                    case 16:
                        str17 = str57;
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str50);
                        i2 = 65536;
                        kSerializerArr = kSerializerArr3;
                        str18 = str42;
                        i = i2 | i;
                        str19 = str51;
                        bool2 = bool5;
                        kSerializerArr3 = kSerializerArr;
                        str42 = str18;
                        bool5 = bool2;
                        str51 = str19;
                        str57 = str17;
                        break;
                    case 17:
                        str17 = str57;
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, str45);
                        i2 = 131072;
                        kSerializerArr = kSerializerArr3;
                        str18 = str42;
                        i = i2 | i;
                        str19 = str51;
                        bool2 = bool5;
                        kSerializerArr3 = kSerializerArr;
                        str42 = str18;
                        bool5 = bool2;
                        str51 = str19;
                        str57 = str17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str46;
            str2 = str49;
            str3 = str42;
            str4 = str52;
            bool = bool5;
            str5 = str51;
            str6 = str54;
            str7 = str44;
            str8 = str45;
            list = list3;
            str9 = str55;
            str10 = str56;
            str11 = str47;
            str12 = str53;
            str13 = str48;
            str14 = str57;
            str15 = str50;
            str16 = str43;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EvmSignInfoGasPrice(i, str10, str6, str9, str12, str14, str7, str16, str2, str4, bool, str5, str, str3, list, str11, str13, str15, str8, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EvmSignInfoGasPrice evmSignInfoGasPrice) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(evmSignInfoGasPrice, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EvmSignInfoGasPrice.write$Self$OKWallet_wallet_impl(evmSignInfoGasPrice, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
