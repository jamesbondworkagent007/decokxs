package com.okinc.business.defi.api.bean;

import com.huawei.hms.push.constant.RemoteMessageConst;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class BTCNFTInfo$$serializer implements GeneratedSerializer<BTCNFTInfo> {
    public static final int $stable;
    public static final BTCNFTInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BTCNFTInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BTCNFTInfo$$serializer bTCNFTInfo$$serializer = new BTCNFTInfo$$serializer();
        INSTANCE = bTCNFTInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.api.bean.BTCNFTInfo", bTCNFTInfo$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("coinId", true);
        pluginGeneratedSerialDescriptor.addElement("nftId", true);
        pluginGeneratedSerialDescriptor.addElement("txHash", true);
        pluginGeneratedSerialDescriptor.addElement("vOut", true);
        pluginGeneratedSerialDescriptor.addElement("inscriptionId", true);
        pluginGeneratedSerialDescriptor.addElement("coinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("nftPrice", true);
        pluginGeneratedSerialDescriptor.addElement("signData", true);
        pluginGeneratedSerialDescriptor.addElement("from", true);
        pluginGeneratedSerialDescriptor.addElement("isUTXODup", true);
        pluginGeneratedSerialDescriptor.addElement("utxoHash", true);
        pluginGeneratedSerialDescriptor.addElement("utxoIndex", true);
        pluginGeneratedSerialDescriptor.addElement("protocolId", true);
        pluginGeneratedSerialDescriptor.addElement("nftLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        pluginGeneratedSerialDescriptor.addElement("tickerId", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.TICKER, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BTCNFTInfo deserialize(@NotNull Decoder decoder) {
        Integer num;
        String str;
        Integer num2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z;
        String str11;
        int i;
        String str12;
        Long l;
        String str13;
        String str14;
        Integer num3;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        int i6 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, intSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, intSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            str12 = str18;
            str4 = str16;
            z = zDecodeBooleanElement;
            str6 = strDecodeStringElement3;
            str7 = strDecodeStringElement6;
            str9 = strDecodeStringElement;
            str13 = str19;
            num = num5;
            str3 = str17;
            str2 = str15;
            str10 = strDecodeStringElement4;
            num2 = num4;
            str5 = strDecodeStringElement2;
            l = l2;
            i = 131071;
            str8 = strDecodeStringElement5;
        } else {
            int i7 = 16;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String str26 = null;
            String strDecodeStringElement11 = null;
            Long l3 = null;
            Integer num6 = null;
            String strDecodeStringElement12 = null;
            Integer num7 = null;
            int i8 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str14 = str26;
                        num3 = num6;
                        z2 = false;
                        num6 = num3;
                        str26 = str14;
                        i7 = 16;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 0:
                        str14 = str26;
                        num3 = num6;
                        i8 |= 1;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l3);
                        num6 = num3;
                        str26 = str14;
                        i7 = 16;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 1:
                        str14 = str26;
                        num3 = num6;
                        i8 |= 2;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        num6 = num3;
                        str26 = str14;
                        i7 = 16;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 2:
                        num3 = num6;
                        i8 |= 4;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str26);
                        num6 = num3;
                        str26 = str14;
                        i7 = 16;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 3:
                        i8 |= 8;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num6);
                        str14 = str26;
                        num6 = num3;
                        str26 = str14;
                        i7 = 16;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 4:
                        i8 |= 16;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 = 16;
                        break;
                    case 5:
                        i8 |= 32;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 = 16;
                        break;
                    case 6:
                        i8 |= 64;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i7 = 16;
                        break;
                    case 7:
                        i8 |= 128;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i7 = 16;
                        break;
                    case 8:
                        i8 |= 256;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i7 = 16;
                        break;
                    case 9:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i8 |= 512;
                        i7 = 16;
                        break;
                    case 10:
                        i8 |= 1024;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str25);
                        str14 = str26;
                        num3 = num6;
                        num6 = num3;
                        str26 = str14;
                        i7 = 16;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 11:
                        i8 |= 2048;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str24);
                        str14 = str26;
                        num3 = num6;
                        num6 = num3;
                        str26 = str14;
                        i7 = 16;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 12:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, num7);
                        i8 |= 4096;
                        str14 = str26;
                        num3 = num6;
                        num6 = num3;
                        str26 = str14;
                        i7 = 16;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 13:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str22);
                        i8 |= 8192;
                        str14 = str26;
                        num3 = num6;
                        num6 = num3;
                        str26 = str14;
                        i7 = 16;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 14:
                        i8 |= 16384;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str23);
                        str14 = str26;
                        num3 = num6;
                        num6 = num3;
                        str26 = str14;
                        i7 = 16;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 15:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str20);
                        i2 = 32768;
                        i8 |= i2;
                        str14 = str26;
                        num3 = num6;
                        num6 = num3;
                        str26 = str14;
                        i7 = 16;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 16:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i7, StringSerializer.INSTANCE, str21);
                        i2 = 65536;
                        i8 |= i2;
                        str14 = str26;
                        num3 = num6;
                        num6 = num3;
                        str26 = str14;
                        i7 = 16;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str27 = str26;
            num = num7;
            str = str20;
            num2 = num6;
            str2 = str27;
            str3 = str24;
            str4 = str25;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement9;
            str8 = strDecodeStringElement10;
            str9 = strDecodeStringElement11;
            str10 = strDecodeStringElement12;
            z = zDecodeBooleanElement2;
            str11 = str21;
            i = i8;
            str12 = str22;
            l = l3;
            str13 = str23;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BTCNFTInfo(i, l, str9, str2, num2, str5, str6, str10, str8, str7, z, str4, str3, num, str12, str13, str, str11, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BTCNFTInfo bTCNFTInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bTCNFTInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BTCNFTInfo.write$Self$OKWallet_wallet_api(bTCNFTInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
