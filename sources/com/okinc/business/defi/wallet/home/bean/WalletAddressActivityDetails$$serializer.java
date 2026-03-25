package com.okinc.business.defi.wallet.home.bean;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class WalletAddressActivityDetails$$serializer implements GeneratedSerializer<WalletAddressActivityDetails> {
    public static final int $stable;
    public static final WalletAddressActivityDetails$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletAddressActivityDetails$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletAddressActivityDetails$$serializer walletAddressActivityDetails$$serializer = new WalletAddressActivityDetails$$serializer();
        INSTANCE = walletAddressActivityDetails$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.home.bean.WalletAddressActivityDetails", walletAddressActivityDetails$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", false);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", false);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", false);
        pluginGeneratedSerialDescriptor.addElement("txHash", false);
        pluginGeneratedSerialDescriptor.addElement("blockHeight", false);
        pluginGeneratedSerialDescriptor.addElement("blockTime", false);
        pluginGeneratedSerialDescriptor.addElement("globalIndex", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, false);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, false);
        pluginGeneratedSerialDescriptor.addElement("turnover", false);
        pluginGeneratedSerialDescriptor.addElement("singleRealizedProfit", false);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenPrice", false);
        pluginGeneratedSerialDescriptor.addElement("mcap", false);
        pluginGeneratedSerialDescriptor.addElement("innerGotoUrl", false);
        pluginGeneratedSerialDescriptor.addElement("openLink", false);
        pluginGeneratedSerialDescriptor.addElement("riskControlLevel", true);
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
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletAddressActivityDetails deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        Long l;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l2;
        Integer num;
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
        Long l3;
        String str16;
        String str17;
        String str18;
        Integer num2;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        Integer num3;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, longSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            str10 = str40;
            str15 = str34;
            str12 = str35;
            str9 = str27;
            str6 = str39;
            str5 = str38;
            str4 = str37;
            str7 = str36;
            num = num4;
            l = l5;
            str2 = str33;
            str = str32;
            l2 = l4;
            str3 = str31;
            i = 262143;
            str8 = str28;
            str11 = str30;
            str14 = str29;
        } else {
            int i3 = 17;
            boolean z = true;
            String str41 = null;
            String str42 = null;
            Long l6 = null;
            String str43 = null;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            String str47 = null;
            String str48 = null;
            String str49 = null;
            String str50 = null;
            Integer num5 = null;
            String str51 = null;
            String str52 = null;
            String str53 = null;
            String str54 = null;
            String str55 = null;
            int i4 = 0;
            Long l7 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        l3 = l7;
                        str16 = str41;
                        str17 = str42;
                        str18 = str50;
                        num2 = num5;
                        str19 = str51;
                        str20 = str52;
                        str21 = str53;
                        str22 = str55;
                        str23 = str54;
                        z = false;
                        str24 = str22;
                        l7 = l3;
                        str51 = str19;
                        str50 = str18;
                        str53 = str21;
                        str52 = str20;
                        num5 = num2;
                        str42 = str17;
                        str41 = str16;
                        str54 = str23;
                        i3 = 17;
                        str55 = str24;
                        break;
                    case 0:
                        l3 = l7;
                        str16 = str41;
                        str17 = str42;
                        str18 = str50;
                        num2 = num5;
                        str19 = str51;
                        str20 = str52;
                        str21 = str53;
                        String str56 = str55;
                        str23 = str54;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str56);
                        i4 |= 1;
                        str24 = str22;
                        l7 = l3;
                        str51 = str19;
                        str50 = str18;
                        str53 = str21;
                        str52 = str20;
                        num5 = num2;
                        str42 = str17;
                        str41 = str16;
                        str54 = str23;
                        i3 = 17;
                        str55 = str24;
                        break;
                    case 1:
                        l3 = l7;
                        str16 = str41;
                        str17 = str42;
                        str18 = str50;
                        num2 = num5;
                        str19 = str51;
                        str20 = str52;
                        str21 = str53;
                        str54 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str54);
                        i4 |= 2;
                        str22 = str55;
                        str23 = str54;
                        str24 = str22;
                        l7 = l3;
                        str51 = str19;
                        str50 = str18;
                        str53 = str21;
                        str52 = str20;
                        num5 = num2;
                        str42 = str17;
                        str41 = str16;
                        str54 = str23;
                        i3 = 17;
                        str55 = str24;
                        break;
                    case 2:
                        l3 = l7;
                        str16 = str41;
                        str17 = str42;
                        str18 = str50;
                        num2 = num5;
                        str19 = str51;
                        str20 = str52;
                        str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str53);
                        i4 |= 4;
                        str21 = str53;
                        str22 = str55;
                        str23 = str54;
                        str24 = str22;
                        l7 = l3;
                        str51 = str19;
                        str50 = str18;
                        str53 = str21;
                        str52 = str20;
                        num5 = num2;
                        str42 = str17;
                        str41 = str16;
                        str54 = str23;
                        i3 = 17;
                        str55 = str24;
                        break;
                    case 3:
                        str16 = str41;
                        str17 = str42;
                        str18 = str50;
                        num2 = num5;
                        str19 = str51;
                        l3 = l7;
                        str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str52);
                        i4 |= 8;
                        str20 = str52;
                        str21 = str53;
                        str22 = str55;
                        str23 = str54;
                        str24 = str22;
                        l7 = l3;
                        str51 = str19;
                        str50 = str18;
                        str53 = str21;
                        str52 = str20;
                        num5 = num2;
                        str42 = str17;
                        str41 = str16;
                        str54 = str23;
                        i3 = 17;
                        str55 = str24;
                        break;
                    case 4:
                        str16 = str41;
                        str17 = str42;
                        str18 = str50;
                        num2 = num5;
                        str19 = str51;
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str43);
                        i4 |= 16;
                        l3 = l7;
                        str20 = str52;
                        str21 = str53;
                        str22 = str55;
                        str23 = str54;
                        str24 = str22;
                        l7 = l3;
                        str51 = str19;
                        str50 = str18;
                        str53 = str21;
                        str52 = str20;
                        num5 = num2;
                        str42 = str17;
                        str41 = str16;
                        str54 = str23;
                        i3 = 17;
                        str55 = str24;
                        break;
                    case 5:
                        str16 = str41;
                        str17 = str42;
                        str18 = str50;
                        num2 = num5;
                        str19 = str51;
                        l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l7);
                        i4 |= 32;
                        str20 = str52;
                        str21 = str53;
                        str24 = str55;
                        str23 = str54;
                        str51 = str19;
                        str50 = str18;
                        str53 = str21;
                        str52 = str20;
                        num5 = num2;
                        str42 = str17;
                        str41 = str16;
                        str54 = str23;
                        i3 = 17;
                        str55 = str24;
                        break;
                    case 6:
                        str25 = str41;
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, l6);
                        i4 |= 64;
                        str42 = str42;
                        str41 = str25;
                        i3 = 17;
                        break;
                    case 7:
                        str25 = str41;
                        str26 = str50;
                        num3 = num5;
                        i4 |= 128;
                        str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str51);
                        str42 = str42;
                        str50 = str26;
                        num5 = num3;
                        str41 = str25;
                        i3 = 17;
                        break;
                    case 8:
                        str25 = str41;
                        str26 = str50;
                        i4 |= 256;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, num5);
                        str42 = str42;
                        str50 = str26;
                        num5 = num3;
                        str41 = str25;
                        i3 = 17;
                        break;
                    case 9:
                        str25 = str41;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str50);
                        i4 |= 512;
                        num3 = num5;
                        str50 = str26;
                        num5 = num3;
                        str41 = str25;
                        i3 = 17;
                        break;
                    case 10:
                        str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str42);
                        i4 |= 1024;
                        str25 = str41;
                        str26 = str50;
                        num3 = num5;
                        str50 = str26;
                        num5 = num3;
                        str41 = str25;
                        i3 = 17;
                        break;
                    case 11:
                        i4 |= 2048;
                        str25 = str41;
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str44);
                        str26 = str50;
                        num3 = num5;
                        str50 = str26;
                        num5 = num3;
                        str41 = str25;
                        i3 = 17;
                        break;
                    case 12:
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str41);
                        i4 |= 4096;
                        str25 = str41;
                        str26 = str50;
                        num3 = num5;
                        str50 = str26;
                        num5 = num3;
                        str41 = str25;
                        i3 = 17;
                        break;
                    case 13:
                        i4 |= 8192;
                        str25 = str41;
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str45);
                        str26 = str50;
                        num3 = num5;
                        str50 = str26;
                        num5 = num3;
                        str41 = str25;
                        i3 = 17;
                        break;
                    case 14:
                        i4 |= 16384;
                        str25 = str41;
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str46);
                        str26 = str50;
                        num3 = num5;
                        str50 = str26;
                        num5 = num3;
                        str41 = str25;
                        i3 = 17;
                        break;
                    case 15:
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str47);
                        i2 = 32768;
                        i4 |= i2;
                        str25 = str41;
                        str26 = str50;
                        num3 = num5;
                        str50 = str26;
                        num5 = num3;
                        str41 = str25;
                        i3 = 17;
                        break;
                    case 16:
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str49);
                        i2 = 65536;
                        i4 |= i2;
                        str25 = str41;
                        str26 = str50;
                        num3 = num5;
                        str50 = str26;
                        num5 = num3;
                        str41 = str25;
                        i3 = 17;
                        break;
                    case 17:
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str48);
                        i2 = 131072;
                        i4 |= i2;
                        str25 = str41;
                        str26 = str50;
                        num3 = num5;
                        str50 = str26;
                        num5 = num3;
                        str41 = str25;
                        i3 = 17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str51;
            str2 = str50;
            l = l6;
            str3 = str43;
            str4 = str45;
            str5 = str46;
            str6 = str47;
            l2 = l7;
            num = num5;
            str7 = str41;
            str8 = str54;
            str9 = str55;
            i = i4;
            str10 = str49;
            str11 = str52;
            str12 = str44;
            str13 = str48;
            str14 = str53;
            str15 = str42;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletAddressActivityDetails(i, str9, str8, str14, str11, str3, l2, l, str, num, str2, str15, str12, str7, str4, str5, str6, str10, str13, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletAddressActivityDetails walletAddressActivityDetails) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(walletAddressActivityDetails, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletAddressActivityDetails.EZpvd(walletAddressActivityDetails, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
