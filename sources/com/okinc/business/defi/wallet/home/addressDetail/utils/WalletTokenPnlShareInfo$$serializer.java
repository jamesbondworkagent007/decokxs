package com.okinc.business.defi.wallet.home.addressDetail.utils;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class WalletTokenPnlShareInfo$$serializer implements GeneratedSerializer<WalletTokenPnlShareInfo> {
    public static final int $stable;
    public static final WalletTokenPnlShareInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletTokenPnlShareInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletTokenPnlShareInfo$$serializer walletTokenPnlShareInfo$$serializer = new WalletTokenPnlShareInfo$$serializer();
        INSTANCE = walletTokenPnlShareInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.home.addressDetail.utils.WalletTokenPnlShareInfo", walletTokenPnlShareInfo$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("averageCost", false);
        pluginGeneratedSerialDescriptor.addElement("averageSell", false);
        pluginGeneratedSerialDescriptor.addElement("balance", false);
        pluginGeneratedSerialDescriptor.addElement("boughtVolume", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("chainLogoUrl", false);
        pluginGeneratedSerialDescriptor.addElement("currencyName", false);
        pluginGeneratedSerialDescriptor.addElement("currentCurrencyProfit", false);
        pluginGeneratedSerialDescriptor.addElement("currentPrice", false);
        pluginGeneratedSerialDescriptor.addElement("currentProfit", false);
        pluginGeneratedSerialDescriptor.addElement("currentProfitPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("kLinesData", false);
        pluginGeneratedSerialDescriptor.addElement("soldVolume", false);
        pluginGeneratedSerialDescriptor.addElement("tokenLogoUrl", false);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", false);
        pluginGeneratedSerialDescriptor.addElement("isMyWallet", false);
        pluginGeneratedSerialDescriptor.addElement("twitterAvatar", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = WalletTokenPnlShareInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[11]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletTokenPnlShareInfo deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        Long l;
        String str7;
        String str8;
        List list;
        String str9;
        String str10;
        int i;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        KSerializer[] kSerializerArr;
        Long l2;
        String str16;
        int i2;
        KSerializer[] kSerializerArr2;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        List list2;
        String str23;
        Long l3;
        String str24;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = WalletTokenPnlShareInfo.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr3[11], null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, null);
            str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            str13 = str25;
            str9 = str26;
            str = str33;
            str12 = str27;
            str8 = str32;
            i = 262143;
            l = l4;
            str15 = str28;
            str7 = str31;
            bool = bool2;
            str6 = str30;
            str11 = str29;
            str5 = str36;
            list = list3;
            str4 = str35;
            str2 = str34;
        } else {
            List list4 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            String str43 = null;
            Boolean bool3 = null;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            String str47 = null;
            String str48 = null;
            String str49 = null;
            String str50 = null;
            boolean z = true;
            String str51 = null;
            int i3 = 0;
            Long l5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        str17 = str44;
                        str18 = str45;
                        str19 = str46;
                        str20 = str48;
                        str21 = str49;
                        str22 = str50;
                        list2 = list4;
                        str23 = str47;
                        z = false;
                        str50 = str22;
                        str48 = str20;
                        str46 = str19;
                        str45 = str18;
                        list4 = list2;
                        str47 = str23;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str44 = str17;
                        break;
                    case 0:
                        kSerializerArr2 = kSerializerArr3;
                        str17 = str44;
                        str18 = str45;
                        str19 = str46;
                        str20 = str48;
                        str22 = str50;
                        list2 = list4;
                        String str52 = str49;
                        str23 = str47;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str52);
                        i3 |= 1;
                        l5 = l5;
                        str50 = str22;
                        str48 = str20;
                        str46 = str19;
                        str45 = str18;
                        list4 = list2;
                        str47 = str23;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str44 = str17;
                        break;
                    case 1:
                        kSerializerArr2 = kSerializerArr3;
                        str17 = str44;
                        str18 = str45;
                        str19 = str46;
                        str22 = str50;
                        list2 = list4;
                        str20 = str48;
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str47);
                        i3 |= 2;
                        l5 = l5;
                        str21 = str49;
                        str23 = str47;
                        str50 = str22;
                        str48 = str20;
                        str46 = str19;
                        str45 = str18;
                        list4 = list2;
                        str47 = str23;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str44 = str17;
                        break;
                    case 2:
                        kSerializerArr2 = kSerializerArr3;
                        str17 = str44;
                        str18 = str45;
                        str22 = str50;
                        list2 = list4;
                        str19 = str46;
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str48);
                        i3 |= 4;
                        l5 = l5;
                        str20 = str48;
                        str21 = str49;
                        str23 = str47;
                        str50 = str22;
                        str48 = str20;
                        str46 = str19;
                        str45 = str18;
                        list4 = list2;
                        str47 = str23;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str44 = str17;
                        break;
                    case 3:
                        kSerializerArr2 = kSerializerArr3;
                        str17 = str44;
                        str18 = str45;
                        str22 = str50;
                        list2 = list4;
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str46);
                        i3 |= 8;
                        l5 = l5;
                        str19 = str46;
                        str20 = str48;
                        str21 = str49;
                        str23 = str47;
                        str50 = str22;
                        str48 = str20;
                        str46 = str19;
                        str45 = str18;
                        list4 = list2;
                        str47 = str23;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str44 = str17;
                        break;
                    case 4:
                        kSerializerArr2 = kSerializerArr3;
                        str17 = str44;
                        str22 = str50;
                        list2 = list4;
                        str18 = str45;
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, l5);
                        i3 |= 16;
                        str19 = str46;
                        str20 = str48;
                        str21 = str49;
                        str23 = str47;
                        str50 = str22;
                        str48 = str20;
                        str46 = str19;
                        str45 = str18;
                        list4 = list2;
                        str47 = str23;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str44 = str17;
                        break;
                    case 5:
                        kSerializerArr2 = kSerializerArr3;
                        l3 = l5;
                        str17 = str44;
                        str22 = str50;
                        list2 = list4;
                        str24 = str45;
                        str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str51);
                        i3 |= 32;
                        str18 = str24;
                        str19 = str46;
                        str20 = str48;
                        str21 = str49;
                        l5 = l3;
                        str23 = str47;
                        str50 = str22;
                        str48 = str20;
                        str46 = str19;
                        str45 = str18;
                        list4 = list2;
                        str47 = str23;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str44 = str17;
                        break;
                    case 6:
                        kSerializerArr2 = kSerializerArr3;
                        l3 = l5;
                        str17 = str44;
                        str22 = str50;
                        list2 = list4;
                        str24 = str45;
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str37);
                        i3 |= 64;
                        str18 = str24;
                        str19 = str46;
                        str20 = str48;
                        str21 = str49;
                        l5 = l3;
                        str23 = str47;
                        str50 = str22;
                        str48 = str20;
                        str46 = str19;
                        str45 = str18;
                        list4 = list2;
                        str47 = str23;
                        str49 = str21;
                        kSerializerArr3 = kSerializerArr2;
                        str44 = str17;
                        break;
                    case 7:
                        str17 = str44;
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str43);
                        i3 |= 128;
                        kSerializerArr3 = kSerializerArr3;
                        list4 = list4;
                        l5 = l5;
                        str44 = str17;
                        break;
                    case 8:
                        kSerializerArr = kSerializerArr3;
                        l2 = l5;
                        str16 = str50;
                        i3 |= 256;
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str45);
                        list4 = list4;
                        str44 = str44;
                        str50 = str16;
                        kSerializerArr3 = kSerializerArr;
                        l5 = l2;
                        break;
                    case 9:
                        kSerializerArr = kSerializerArr3;
                        l2 = l5;
                        str16 = str50;
                        i3 |= 512;
                        list4 = list4;
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str44);
                        str50 = str16;
                        kSerializerArr3 = kSerializerArr;
                        l5 = l2;
                        break;
                    case 10:
                        l2 = l5;
                        kSerializerArr = kSerializerArr3;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str50);
                        i3 |= 1024;
                        str50 = str16;
                        kSerializerArr3 = kSerializerArr;
                        l5 = l2;
                        break;
                    case 11:
                        l2 = l5;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr3[11], list4);
                        i3 |= 2048;
                        kSerializerArr = kSerializerArr3;
                        str16 = str50;
                        str50 = str16;
                        kSerializerArr3 = kSerializerArr;
                        l5 = l2;
                        break;
                    case 12:
                        l2 = l5;
                        i3 |= 4096;
                        kSerializerArr = kSerializerArr3;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str39);
                        str16 = str50;
                        str50 = str16;
                        kSerializerArr3 = kSerializerArr;
                        l5 = l2;
                        break;
                    case 13:
                        l2 = l5;
                        i3 |= 8192;
                        kSerializerArr = kSerializerArr3;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str40);
                        str16 = str50;
                        str50 = str16;
                        kSerializerArr3 = kSerializerArr;
                        l5 = l2;
                        break;
                    case 14:
                        l2 = l5;
                        i3 |= 16384;
                        kSerializerArr = kSerializerArr3;
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str41);
                        str16 = str50;
                        str50 = str16;
                        kSerializerArr3 = kSerializerArr;
                        l5 = l2;
                        break;
                    case 15:
                        l2 = l5;
                        str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str42);
                        i2 = 32768;
                        kSerializerArr = kSerializerArr3;
                        i3 = i2 | i3;
                        str16 = str50;
                        str50 = str16;
                        kSerializerArr3 = kSerializerArr;
                        l5 = l2;
                        break;
                    case 16:
                        l2 = l5;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, bool3);
                        i2 = 65536;
                        kSerializerArr = kSerializerArr3;
                        i3 = i2 | i3;
                        str16 = str50;
                        str50 = str16;
                        kSerializerArr3 = kSerializerArr;
                        l5 = l2;
                        break;
                    case 17:
                        l2 = l5;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, str38);
                        i2 = 131072;
                        kSerializerArr = kSerializerArr3;
                        i3 = i2 | i3;
                        str16 = str50;
                        str50 = str16;
                        kSerializerArr3 = kSerializerArr;
                        l5 = l2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str50;
            str2 = str39;
            str3 = str40;
            str4 = str41;
            str5 = str42;
            str6 = str43;
            bool = bool3;
            l = l5;
            str7 = str45;
            str8 = str44;
            list = list4;
            str9 = str47;
            str10 = str37;
            i = i3;
            str11 = str51;
            str12 = str48;
            str13 = str49;
            str14 = str38;
            str15 = str46;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletTokenPnlShareInfo(i, str13, str9, str12, str15, l, str11, str10, str6, str7, str8, str, list, str2, str3, str4, str5, bool, str14, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletTokenPnlShareInfo walletTokenPnlShareInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(walletTokenPnlShareInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletTokenPnlShareInfo.write$Self$OKWallet_wallet_impl(walletTokenPnlShareInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
