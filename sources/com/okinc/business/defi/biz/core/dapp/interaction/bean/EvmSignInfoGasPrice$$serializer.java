package com.okinc.business.defi.biz.core.dapp.interaction.bean;

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

/* JADX INFO: loaded from: classes3.dex */
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
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.dapp.interaction.bean.EvmSignInfoGasPrice", evmSignInfoGasPrice$$serializer, 17);
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
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = EvmSignInfoGasPrice.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[13]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EvmSignInfoGasPrice deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        KSerializer[] kSerializerArr;
        Boolean bool2;
        String str17;
        int i2;
        KSerializer[] kSerializerArr2;
        String str18;
        String str19;
        Boolean bool3;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = EvmSignInfoGasPrice.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr3[13], null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            str8 = str38;
            i = 131071;
            str5 = str35;
            str6 = str27;
            bool = bool4;
            str10 = str26;
            str = str34;
            str7 = str33;
            str4 = str28;
            list = list2;
            str13 = str32;
            str9 = str29;
            str14 = str31;
            str12 = str30;
            str3 = str37;
            str2 = str36;
        } else {
            boolean z = true;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            List list3 = null;
            String str43 = null;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            String str47 = null;
            Boolean bool5 = null;
            String str48 = null;
            String str49 = null;
            String str50 = null;
            String str51 = null;
            String str52 = null;
            i = 0;
            String str53 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        str18 = str39;
                        str19 = str41;
                        bool3 = bool5;
                        str20 = str48;
                        str21 = str49;
                        str22 = str50;
                        str23 = str52;
                        str24 = str51;
                        z = false;
                        str25 = str23;
                        str39 = str18;
                        str48 = str20;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str50 = str22;
                        bool5 = bool3;
                        str41 = str19;
                        str51 = str24;
                        str52 = str25;
                        break;
                    case 0:
                        kSerializerArr2 = kSerializerArr3;
                        str18 = str39;
                        str19 = str41;
                        bool3 = bool5;
                        str20 = str48;
                        str21 = str49;
                        str22 = str50;
                        String str54 = str52;
                        str24 = str51;
                        i |= 1;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str54);
                        str53 = str53;
                        str25 = str23;
                        str39 = str18;
                        str48 = str20;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str50 = str22;
                        bool5 = bool3;
                        str41 = str19;
                        str51 = str24;
                        str52 = str25;
                        break;
                    case 1:
                        kSerializerArr2 = kSerializerArr3;
                        str18 = str39;
                        str19 = str41;
                        bool3 = bool5;
                        str20 = str48;
                        str21 = str49;
                        str22 = str50;
                        str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str51);
                        i |= 2;
                        str53 = str53;
                        str23 = str52;
                        str24 = str51;
                        str25 = str23;
                        str39 = str18;
                        str48 = str20;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str50 = str22;
                        bool5 = bool3;
                        str41 = str19;
                        str51 = str24;
                        str52 = str25;
                        break;
                    case 2:
                        kSerializerArr2 = kSerializerArr3;
                        str18 = str39;
                        str19 = str41;
                        bool3 = bool5;
                        str20 = str48;
                        str21 = str49;
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str50);
                        i |= 4;
                        str53 = str53;
                        str22 = str50;
                        str23 = str52;
                        str24 = str51;
                        str25 = str23;
                        str39 = str18;
                        str48 = str20;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str50 = str22;
                        bool5 = bool3;
                        str41 = str19;
                        str51 = str24;
                        str52 = str25;
                        break;
                    case 3:
                        kSerializerArr2 = kSerializerArr3;
                        str19 = str41;
                        bool3 = bool5;
                        str20 = str48;
                        str21 = str49;
                        str18 = str39;
                        str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str53);
                        i |= 8;
                        str22 = str50;
                        str23 = str52;
                        str24 = str51;
                        str25 = str23;
                        str39 = str18;
                        str48 = str20;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str50 = str22;
                        bool5 = bool3;
                        str41 = str19;
                        str51 = str24;
                        str52 = str25;
                        break;
                    case 4:
                        kSerializerArr2 = kSerializerArr3;
                        str19 = str41;
                        bool3 = bool5;
                        str20 = str48;
                        str21 = str49;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str40);
                        i |= 16;
                        str18 = str39;
                        str22 = str50;
                        str23 = str52;
                        str53 = str53;
                        str24 = str51;
                        str25 = str23;
                        str39 = str18;
                        str48 = str20;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str50 = str22;
                        bool5 = bool3;
                        str41 = str19;
                        str51 = str24;
                        str52 = str25;
                        break;
                    case 5:
                        kSerializerArr2 = kSerializerArr3;
                        str19 = str41;
                        bool3 = bool5;
                        str20 = str48;
                        str21 = str49;
                        i |= 32;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str39);
                        str22 = str50;
                        str25 = str52;
                        str53 = str53;
                        str24 = str51;
                        str48 = str20;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str50 = str22;
                        bool5 = bool3;
                        str41 = str19;
                        str51 = str24;
                        str52 = str25;
                        break;
                    case 6:
                        str16 = str53;
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str45);
                        i |= 64;
                        kSerializerArr3 = kSerializerArr3;
                        str41 = str41;
                        str53 = str16;
                        break;
                    case 7:
                        kSerializerArr = kSerializerArr3;
                        str16 = str53;
                        bool2 = bool5;
                        i |= 128;
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str49);
                        str17 = str48;
                        str41 = str41;
                        str48 = str17;
                        kSerializerArr3 = kSerializerArr;
                        bool5 = bool2;
                        str53 = str16;
                        break;
                    case 8:
                        kSerializerArr = kSerializerArr3;
                        str16 = str53;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str48);
                        bool2 = bool5;
                        i |= 256;
                        str41 = str41;
                        str48 = str17;
                        kSerializerArr3 = kSerializerArr;
                        bool5 = bool2;
                        str53 = str16;
                        break;
                    case 9:
                        kSerializerArr = kSerializerArr3;
                        str16 = str53;
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, bool5);
                        i |= 512;
                        str41 = str41;
                        str17 = str48;
                        str48 = str17;
                        kSerializerArr3 = kSerializerArr;
                        bool5 = bool2;
                        str53 = str16;
                        break;
                    case 10:
                        kSerializerArr = kSerializerArr3;
                        str16 = str53;
                        i |= 1024;
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str41);
                        bool2 = bool5;
                        str17 = str48;
                        str48 = str17;
                        kSerializerArr3 = kSerializerArr;
                        bool5 = bool2;
                        str53 = str16;
                        break;
                    case 11:
                        kSerializerArr = kSerializerArr3;
                        str16 = str53;
                        i |= 2048;
                        str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str42);
                        bool2 = bool5;
                        str17 = str48;
                        str48 = str17;
                        kSerializerArr3 = kSerializerArr;
                        bool5 = bool2;
                        str53 = str16;
                        break;
                    case 12:
                        str16 = str53;
                        kSerializerArr = kSerializerArr3;
                        i |= 4096;
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str47);
                        bool2 = bool5;
                        str17 = str48;
                        str48 = str17;
                        kSerializerArr3 = kSerializerArr;
                        bool5 = bool2;
                        str53 = str16;
                        break;
                    case 13:
                        str16 = str53;
                        i |= 8192;
                        kSerializerArr = kSerializerArr3;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr3[13], list3);
                        bool2 = bool5;
                        str17 = str48;
                        str48 = str17;
                        kSerializerArr3 = kSerializerArr;
                        bool5 = bool2;
                        str53 = str16;
                        break;
                    case 14:
                        str16 = str53;
                        i |= 16384;
                        kSerializerArr = kSerializerArr3;
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str43);
                        bool2 = bool5;
                        str17 = str48;
                        str48 = str17;
                        kSerializerArr3 = kSerializerArr;
                        bool5 = bool2;
                        str53 = str16;
                        break;
                    case 15:
                        str16 = str53;
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str44);
                        i2 = 32768;
                        kSerializerArr = kSerializerArr3;
                        i = i2 | i;
                        bool2 = bool5;
                        str17 = str48;
                        str48 = str17;
                        kSerializerArr3 = kSerializerArr;
                        bool5 = bool2;
                        str53 = str16;
                        break;
                    case 16:
                        str16 = str53;
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str46);
                        i2 = 65536;
                        kSerializerArr = kSerializerArr3;
                        i = i2 | i;
                        bool2 = bool5;
                        str17 = str48;
                        str48 = str17;
                        kSerializerArr3 = kSerializerArr;
                        bool5 = bool2;
                        str53 = str16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str48;
            str2 = str42;
            list = list3;
            str3 = str47;
            str4 = str50;
            bool = bool5;
            str5 = str41;
            str6 = str51;
            str7 = str49;
            str8 = str43;
            str9 = str53;
            str10 = str52;
            str11 = str44;
            str12 = str40;
            String str55 = str46;
            str13 = str45;
            str14 = str39;
            str15 = str55;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EvmSignInfoGasPrice(i, str10, str6, str4, str9, str12, str14, str13, str7, str, bool, str5, str2, str3, list, str8, str11, str15, (SerializationConstructorMarker) null);
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
