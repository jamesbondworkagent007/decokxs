package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class WalletPnlTokenBean$$serializer implements GeneratedSerializer<WalletPnlTokenBean> {
    public static final int $stable;
    public static final WalletPnlTokenBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletPnlTokenBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletPnlTokenBean$$serializer walletPnlTokenBean$$serializer = new WalletPnlTokenBean$$serializer();
        INSTANCE = walletPnlTokenBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.WalletPnlTokenBean", walletPnlTokenBean$$serializer, 20);
        pluginGeneratedSerialDescriptor.addElement("rowId", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", true);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("latestTime", true);
        pluginGeneratedSerialDescriptor.addElement("totalPnl", true);
        pluginGeneratedSerialDescriptor.addElement("totalPnlPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("buyVolume", true);
        pluginGeneratedSerialDescriptor.addElement("buyAvgPrice", true);
        pluginGeneratedSerialDescriptor.addElement("sellVolume", true);
        pluginGeneratedSerialDescriptor.addElement("sellAvgPrice", true);
        pluginGeneratedSerialDescriptor.addElement("balanceUsd", true);
        pluginGeneratedSerialDescriptor.addElement("balance", true);
        pluginGeneratedSerialDescriptor.addElement("totalTxBuy", true);
        pluginGeneratedSerialDescriptor.addElement("totalTxSell", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenPrice", true);
        pluginGeneratedSerialDescriptor.addElement("riskLevel", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletPnlTokenBean deserialize(@NotNull Decoder decoder) {
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
        String str11;
        String str12;
        String str13;
        Integer num;
        String str14;
        String str15;
        String str16;
        String str17;
        Long l;
        String str18;
        int i;
        String str19;
        String str20;
        String str21;
        Integer num2;
        int i2;
        int i3;
        String str22;
        Integer num3;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
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
            String str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            String str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, IntSerializer.INSTANCE, null);
            str15 = str41;
            str12 = str47;
            str17 = strDecodeStringElement;
            str5 = str46;
            str4 = str45;
            str16 = str44;
            str14 = str43;
            str18 = str42;
            str7 = str33;
            str = str34;
            str8 = str38;
            str10 = str39;
            str2 = str37;
            str3 = str36;
            str9 = str35;
            l = l2;
            str13 = str32;
            i = 1048575;
            str6 = str31;
            str11 = str40;
        } else {
            int i4 = 19;
            boolean z = true;
            Integer num4 = null;
            String str48 = null;
            String str49 = null;
            String str50 = null;
            String str51 = null;
            String str52 = null;
            String str53 = null;
            String str54 = null;
            String str55 = null;
            String str56 = null;
            String strDecodeStringElement2 = null;
            String str57 = null;
            String str58 = null;
            String str59 = null;
            String str60 = null;
            String str61 = null;
            String str62 = null;
            String str63 = null;
            Long l3 = null;
            int i5 = 0;
            String str64 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str22 = str64;
                        num3 = num4;
                        str23 = str48;
                        str24 = str57;
                        str25 = str58;
                        str26 = str59;
                        str27 = str60;
                        str28 = str61;
                        str29 = str63;
                        str30 = str62;
                        z = false;
                        str60 = str27;
                        str61 = str28;
                        str59 = str26;
                        str64 = str22;
                        str58 = str25;
                        str57 = str24;
                        str48 = str23;
                        str62 = str30;
                        num4 = num3;
                        i4 = 19;
                        str63 = str29;
                        break;
                    case 0:
                        str22 = str64;
                        num3 = num4;
                        str23 = str48;
                        str24 = str57;
                        str25 = str58;
                        str26 = str59;
                        str27 = str60;
                        str28 = str61;
                        String str65 = str63;
                        str30 = str62;
                        str29 = str65;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l3);
                        i5 |= 1;
                        str60 = str27;
                        str61 = str28;
                        str59 = str26;
                        str64 = str22;
                        str58 = str25;
                        str57 = str24;
                        str48 = str23;
                        str62 = str30;
                        num4 = num3;
                        i4 = 19;
                        str63 = str29;
                        break;
                    case 1:
                        str22 = str64;
                        num3 = num4;
                        str23 = str48;
                        str24 = str57;
                        str25 = str58;
                        str26 = str59;
                        str27 = str60;
                        str28 = str61;
                        String str66 = str63;
                        str30 = str62;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str66);
                        i5 |= 2;
                        str60 = str27;
                        str61 = str28;
                        str59 = str26;
                        str64 = str22;
                        str58 = str25;
                        str57 = str24;
                        str48 = str23;
                        str62 = str30;
                        num4 = num3;
                        i4 = 19;
                        str63 = str29;
                        break;
                    case 2:
                        str22 = str64;
                        num3 = num4;
                        str23 = str48;
                        str24 = str57;
                        str25 = str58;
                        str26 = str59;
                        str27 = str60;
                        str28 = str61;
                        str62 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str62);
                        i5 |= 4;
                        str29 = str63;
                        str30 = str62;
                        str60 = str27;
                        str61 = str28;
                        str59 = str26;
                        str64 = str22;
                        str58 = str25;
                        str57 = str24;
                        str48 = str23;
                        str62 = str30;
                        num4 = num3;
                        i4 = 19;
                        str63 = str29;
                        break;
                    case 3:
                        str22 = str64;
                        num3 = num4;
                        str23 = str48;
                        str24 = str57;
                        str25 = str58;
                        str27 = str60;
                        str26 = str59;
                        str61 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str61);
                        i5 |= 8;
                        str28 = str61;
                        str29 = str63;
                        str30 = str62;
                        str60 = str27;
                        str61 = str28;
                        str59 = str26;
                        str64 = str22;
                        str58 = str25;
                        str57 = str24;
                        str48 = str23;
                        str62 = str30;
                        num4 = num3;
                        i4 = 19;
                        str63 = str29;
                        break;
                    case 4:
                        num3 = num4;
                        str23 = str48;
                        str24 = str57;
                        str25 = str58;
                        str22 = str64;
                        str60 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str60);
                        str26 = str59;
                        i5 |= 16;
                        str27 = str60;
                        str28 = str61;
                        str29 = str63;
                        str30 = str62;
                        str60 = str27;
                        str61 = str28;
                        str59 = str26;
                        str64 = str22;
                        str58 = str25;
                        str57 = str24;
                        str48 = str23;
                        str62 = str30;
                        num4 = num3;
                        i4 = 19;
                        str63 = str29;
                        break;
                    case 5:
                        num3 = num4;
                        str23 = str48;
                        str24 = str57;
                        str25 = str58;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str64);
                        str26 = str59;
                        i5 |= 32;
                        str27 = str60;
                        str28 = str61;
                        str29 = str63;
                        str30 = str62;
                        str60 = str27;
                        str61 = str28;
                        str59 = str26;
                        str64 = str22;
                        str58 = str25;
                        str57 = str24;
                        str48 = str23;
                        str62 = str30;
                        num4 = num3;
                        i4 = 19;
                        str63 = str29;
                        break;
                    case 6:
                        num3 = num4;
                        str23 = str48;
                        str24 = str57;
                        str25 = str58;
                        i5 |= 64;
                        str22 = str64;
                        str26 = str59;
                        str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str51);
                        str27 = str60;
                        str28 = str61;
                        str29 = str63;
                        str30 = str62;
                        str60 = str27;
                        str61 = str28;
                        str59 = str26;
                        str64 = str22;
                        str58 = str25;
                        str57 = str24;
                        str48 = str23;
                        str62 = str30;
                        num4 = num3;
                        i4 = 19;
                        str63 = str29;
                        break;
                    case 7:
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str50);
                        i5 |= 128;
                        str48 = str48;
                        num4 = num4;
                        i4 = 19;
                        break;
                    case 8:
                        str19 = str48;
                        str20 = str57;
                        str21 = str58;
                        str59 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str59);
                        i5 |= 256;
                        num4 = num4;
                        str58 = str21;
                        str57 = str20;
                        str48 = str19;
                        i4 = 19;
                        break;
                    case 9:
                        num2 = num4;
                        str19 = str48;
                        str20 = str57;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str58);
                        i5 |= 512;
                        num4 = num2;
                        str58 = str21;
                        str57 = str20;
                        str48 = str19;
                        i4 = 19;
                        break;
                    case 10:
                        num2 = num4;
                        str19 = str48;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str57);
                        i5 |= 1024;
                        str21 = str58;
                        num4 = num2;
                        str58 = str21;
                        str57 = str20;
                        str48 = str19;
                        i4 = 19;
                        break;
                    case 11:
                        num2 = num4;
                        i5 |= 2048;
                        str19 = str48;
                        str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str52);
                        str20 = str57;
                        str21 = str58;
                        num4 = num2;
                        str58 = str21;
                        str57 = str20;
                        str48 = str19;
                        i4 = 19;
                        break;
                    case 12:
                        num2 = num4;
                        i5 |= 4096;
                        str19 = str48;
                        str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str53);
                        str20 = str57;
                        str21 = str58;
                        num4 = num2;
                        str58 = str21;
                        str57 = str20;
                        str48 = str19;
                        i4 = 19;
                        break;
                    case 13:
                        num2 = num4;
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str49);
                        i2 = i5 | 8192;
                        str19 = str48;
                        i5 = i2;
                        str20 = str57;
                        str21 = str58;
                        num4 = num2;
                        str58 = str21;
                        str57 = str20;
                        str48 = str19;
                        i4 = 19;
                        break;
                    case 14:
                        num2 = num4;
                        i5 |= 16384;
                        str19 = str48;
                        str54 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str54);
                        str20 = str57;
                        str21 = str58;
                        num4 = num2;
                        str58 = str21;
                        str57 = str20;
                        str48 = str19;
                        i4 = 19;
                        break;
                    case 15:
                        num2 = num4;
                        str55 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str55);
                        i3 = 32768;
                        i2 = i3 | i5;
                        str19 = str48;
                        i5 = i2;
                        str20 = str57;
                        str21 = str58;
                        num4 = num2;
                        str58 = str21;
                        str57 = str20;
                        str48 = str19;
                        i4 = 19;
                        break;
                    case 16:
                        num2 = num4;
                        str56 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str56);
                        i3 = 65536;
                        i2 = i3 | i5;
                        str19 = str48;
                        i5 = i2;
                        str20 = str57;
                        str21 = str58;
                        num4 = num2;
                        str58 = str21;
                        str57 = str20;
                        str48 = str19;
                        i4 = 19;
                        break;
                    case 17:
                        num2 = num4;
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, str48);
                        i3 = 131072;
                        i2 = i3 | i5;
                        str19 = str48;
                        i5 = i2;
                        str20 = str57;
                        str21 = str58;
                        num4 = num2;
                        str58 = str21;
                        str57 = str20;
                        str48 = str19;
                        i4 = 19;
                        break;
                    case 18:
                        i5 |= 262144;
                        str19 = str48;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        str20 = str57;
                        str21 = str58;
                        str58 = str21;
                        str57 = str20;
                        str48 = str19;
                        i4 = 19;
                        break;
                    case 19:
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, IntSerializer.INSTANCE, num4);
                        i5 |= 524288;
                        str19 = str48;
                        str20 = str57;
                        str21 = str58;
                        str58 = str21;
                        str57 = str20;
                        str48 = str19;
                        i4 = 19;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str60;
            str2 = str50;
            str3 = str51;
            str4 = str55;
            str5 = str56;
            str6 = str63;
            str7 = str61;
            str8 = str59;
            str9 = str64;
            str10 = str58;
            str11 = str57;
            str12 = str48;
            str13 = str62;
            num = num4;
            str14 = str49;
            str15 = str52;
            str16 = str54;
            str17 = strDecodeStringElement2;
            l = l3;
            str18 = str53;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletPnlTokenBean(i, l, str6, str13, str7, str, str9, str3, str2, str8, str10, str11, str15, str18, str14, str16, str4, str5, str12, str17, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletPnlTokenBean walletPnlTokenBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(walletPnlTokenBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletPnlTokenBean.write$Self$OKWallet_wallet_impl(walletPnlTokenBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
