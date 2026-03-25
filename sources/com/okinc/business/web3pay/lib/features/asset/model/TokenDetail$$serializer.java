package com.okinc.business.web3pay.lib.features.asset.model;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class TokenDetail$$serializer implements GeneratedSerializer<TokenDetail> {
    public static final int $stable;
    public static final TokenDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TokenDetail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TokenDetail$$serializer tokenDetail$$serializer = new TokenDetail$$serializer();
        INSTANCE = tokenDetail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.asset.model.TokenDetail", tokenDetail$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("chainName", false);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbolTicker", false);
        pluginGeneratedSerialDescriptor.addElement("tokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("tokenName", false);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("tokenPrice", false);
        pluginGeneratedSerialDescriptor.addElement("pay", false);
        pluginGeneratedSerialDescriptor.addElement("usdAmount", true);
        pluginGeneratedSerialDescriptor.addElement("tokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("masterCurrencyId", true);
        pluginGeneratedSerialDescriptor.addElement("cefiSupport", false);
        pluginGeneratedSerialDescriptor.addElement("sendSupport", false);
        pluginGeneratedSerialDescriptor.addElement("deficitAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, booleanSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TokenDetail deserialize(@NotNull Decoder decoder) {
        String str;
        int i;
        String str2;
        String str3;
        boolean z;
        String str4;
        String str5;
        int i2;
        String str6;
        String str7;
        boolean z2;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        boolean z3;
        String strDecodeStringElement;
        String str13;
        String str14;
        int i3;
        String str15;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 11;
        int i6 = 10;
        int i7 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
            str6 = str19;
            str4 = strDecodeStringElement3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            z = zDecodeBooleanElement3;
            str7 = str18;
            z3 = zDecodeBooleanElement;
            str = str17;
            str11 = strDecodeStringElement7;
            str9 = strDecodeStringElement6;
            i2 = iDecodeIntElement;
            str12 = strDecodeStringElement5;
            str2 = strDecodeStringElement8;
            z2 = zDecodeBooleanElement2;
            i = 131071;
            str8 = strDecodeStringElement9;
            str5 = strDecodeStringElement2;
            str3 = strDecodeStringElement4;
            str10 = str16;
        } else {
            int i8 = 16;
            int i9 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            int iDecodeIntElement2 = 0;
            boolean z4 = true;
            String str20 = null;
            String str21 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String str22 = null;
            String str23 = null;
            boolean zDecodeBooleanElement6 = false;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str13 = str22;
                        z4 = false;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 0:
                        str14 = str22;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 = i9 | 1;
                        int i10 = i3;
                        str15 = str14;
                        i4 = i10;
                        String str24 = str15;
                        i9 = i4;
                        str13 = str24;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 1:
                        str14 = str22;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 = i9 | 2;
                        int i102 = i3;
                        str15 = str14;
                        i4 = i102;
                        String str242 = str15;
                        i9 = i4;
                        str13 = str242;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 2:
                        str14 = str22;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 = i9 | 4;
                        int i1022 = i3;
                        str15 = str14;
                        i4 = i1022;
                        String str2422 = str15;
                        i9 = i4;
                        str13 = str2422;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 3:
                        i4 = i9 | 8;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str22);
                        String str24222 = str15;
                        i9 = i4;
                        str13 = str24222;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 4:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i9 |= 16;
                        str13 = str22;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 5:
                        int i11 = i7;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i11);
                        i9 |= 32;
                        i7 = i11;
                        i8 = 16;
                        break;
                    case 6:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i9 |= 64;
                        str13 = str22;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 7:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i9 |= 128;
                        str13 = str22;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 8:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i9 |= 256;
                        str13 = str22;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 9:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str20);
                        i9 |= 512;
                        str13 = str22;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 10:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i6);
                        i9 |= 1024;
                        str13 = str22;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 11:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str21);
                        i9 |= 2048;
                        str13 = str22;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 12:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i9 |= 4096;
                        str13 = str22;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 13:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str23);
                        i9 |= 8192;
                        str13 = str22;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 14:
                        i9 |= 16384;
                        str13 = str22;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 15:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
                        i9 |= 32768;
                        str13 = str22;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    case 16:
                        i9 |= 65536;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i8);
                        str13 = str22;
                        str22 = str13;
                        i8 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str25 = str22;
            str = str20;
            i = i9;
            str2 = strDecodeStringElement12;
            str3 = strDecodeStringElement16;
            z = zDecodeBooleanElement4;
            str4 = strDecodeStringElement17;
            str5 = strDecodeStringElement18;
            i2 = iDecodeIntElement2;
            str6 = str23;
            str7 = str21;
            z2 = zDecodeBooleanElement6;
            str8 = strDecodeStringElement13;
            str9 = strDecodeStringElement10;
            str10 = str25;
            String str26 = strDecodeStringElement14;
            str11 = strDecodeStringElement11;
            str12 = strDecodeStringElement15;
            z3 = zDecodeBooleanElement5;
            strDecodeStringElement = str26;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TokenDetail(i, str5, str4, str3, str10, str12, i2, str9, str11, str2, str, z3, str7, str8, str6, z2, z, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TokenDetail tokenDetail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tokenDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TokenDetail.write$Self$OKPayCore_web3pay_lib(tokenDetail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
