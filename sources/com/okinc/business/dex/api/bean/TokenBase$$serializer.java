package com.okinc.business.dex.api.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class TokenBase$$serializer implements GeneratedSerializer<TokenBase> {
    public static final int $stable;
    public static final TokenBase$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TokenBase$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TokenBase$$serializer tokenBase$$serializer = new TokenBase$$serializer();
        INSTANCE = tokenBase$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.api.bean.TokenBase", tokenBase$$serializer, 32);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("chainBWLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("tokenName", true);
        pluginGeneratedSerialDescriptor.addElement("isCollected", true);
        pluginGeneratedSerialDescriptor.addElement("decimals", true);
        pluginGeneratedSerialDescriptor.addElement("isCustomToken", true);
        pluginGeneratedSerialDescriptor.addElement("isSubscribe", true);
        pluginGeneratedSerialDescriptor.addElement("uniqueId", true);
        pluginGeneratedSerialDescriptor.addElement("source", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSource", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("chainName", true);
        pluginGeneratedSerialDescriptor.addElement("isLeveraged", true);
        pluginGeneratedSerialDescriptor.addElement("isSafeMoonToken", true);
        pluginGeneratedSerialDescriptor.addElement("isHoneypot", true);
        pluginGeneratedSerialDescriptor.addElement("localIsNeedRequestNet", true);
        pluginGeneratedSerialDescriptor.addElement("eventSource", true);
        pluginGeneratedSerialDescriptor.addElement("marketTabName", true);
        pluginGeneratedSerialDescriptor.addElement("showSourceAlert", true);
        pluginGeneratedSerialDescriptor.addElement("fromTrading", true);
        pluginGeneratedSerialDescriptor.addElement("moduleNameEnglish", true);
        pluginGeneratedSerialDescriptor.addElement("moduleId", true);
        pluginGeneratedSerialDescriptor.addElement("sourcePageName", true);
        pluginGeneratedSerialDescriptor.addElement("srcType", true);
        pluginGeneratedSerialDescriptor.addElement("isHighRisk", true);
        pluginGeneratedSerialDescriptor.addElement("referralCode", true);
        pluginGeneratedSerialDescriptor.addElement("isNativeToken", true);
        pluginGeneratedSerialDescriptor.addElement("isMarketDetailEntry", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, booleanSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TokenBase deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i;
        String strDecodeStringElement3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i2;
        int i3;
        int i4;
        String str10;
        int i5;
        boolean z;
        String str11;
        String str12;
        int i6;
        boolean z2;
        String str13;
        boolean z3;
        String str14;
        int i7;
        String str15;
        String str16;
        boolean z4;
        String str17;
        boolean zDecodeBooleanElement;
        int i8;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i11 = 5;
        int i12 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
            int iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 18);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 22);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            int iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 27);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 28);
            str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, null);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 31);
            i6 = -1;
            z2 = zDecodeBooleanElement4;
            strDecodeStringElement = strDecodeStringElement19;
            str2 = strDecodeStringElement20;
            strDecodeStringElement2 = strDecodeStringElement21;
            i7 = iDecodeIntElement8;
            z = zDecodeBooleanElement5;
            str16 = strDecodeStringElement17;
            str14 = strDecodeStringElement11;
            z3 = zDecodeBooleanElement2;
            i5 = iDecodeIntElement7;
            iDecodeIntElement = iDecodeIntElement6;
            str11 = strDecodeStringElement16;
            str15 = strDecodeStringElement15;
            str8 = strDecodeStringElement4;
            str = strDecodeStringElement9;
            str4 = strDecodeStringElement10;
            i = iDecodeIntElement3;
            str3 = strDecodeStringElement12;
            i3 = iDecodeIntElement4;
            i4 = iDecodeIntElement2;
            str12 = strDecodeStringElement18;
            z4 = zDecodeBooleanElement3;
            str6 = strDecodeStringElement7;
            str7 = strDecodeStringElement6;
            str17 = strDecodeStringElement13;
            str13 = strDecodeStringElement14;
            str5 = strDecodeStringElement8;
            i2 = iDecodeIntElement5;
            str9 = strDecodeStringElement5;
        } else {
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            int iDecodeIntElement9 = 0;
            boolean zDecodeBooleanElement9 = false;
            iDecodeIntElement = 0;
            int iDecodeIntElement10 = 0;
            boolean zDecodeBooleanElement10 = false;
            int iDecodeIntElement11 = 0;
            int iDecodeIntElement12 = 0;
            int iDecodeIntElement13 = 0;
            boolean z5 = true;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement27 = null;
            strDecodeStringElement2 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            int i13 = 0;
            String str18 = null;
            int iDecodeIntElement14 = 0;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 0:
                        i13 |= 1;
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 1:
                        i13 |= 2;
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 2:
                        i13 |= 4;
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 3:
                        i13 |= 8;
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i12);
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 4:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i13 |= 16;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 5:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i11);
                        i13 |= 32;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 6:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i13 |= 64;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 7:
                        iDecodeIntElement13 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i13 |= 128;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 8:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i13 |= 256;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 9:
                        iDecodeIntElement12 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i13 |= 512;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 10:
                        iDecodeIntElement11 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i13 |= 1024;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 11:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i13 |= 2048;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 12:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i13 |= 4096;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 13:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i13 |= 8192;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 14:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i13 |= 16384;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 15:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i8 = 32768;
                        i13 |= i8;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 16:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i8 = 65536;
                        i13 |= i8;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 17:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
                        i8 = 131072;
                        i13 |= i8;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 18:
                        i8 = 262144;
                        iDecodeIntElement14 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 18);
                        i13 |= i8;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 19:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
                        i8 = 524288;
                        i13 |= i8;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 20:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i13 |= 1048576;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 21:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i9 = 2097152;
                        i13 |= i9;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 22:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 22);
                        i9 = 4194304;
                        i13 |= i9;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 23:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
                        i9 = 8388608;
                        i13 |= i9;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 24:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i9 = 16777216;
                        i13 |= i9;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 25:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i9 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i13 |= i9;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 26:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i9 = 67108864;
                        i13 |= i9;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 27:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 27);
                        i9 = 134217728;
                        i13 |= i9;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 28:
                        zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 28);
                        i9 = 268435456;
                        i13 |= i9;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 29:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, str18);
                        i9 = 536870912;
                        i13 |= i9;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 30:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i10 = 1073741824;
                        i13 = i10 | i13;
                        i11 = 5;
                        i12 = 3;
                        break;
                    case 31:
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 31);
                        i10 = Integer.MIN_VALUE;
                        i13 = i10 | i13;
                        i11 = 5;
                        i12 = 3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement10;
            strDecodeStringElement3 = strDecodeStringElement27;
            str = strDecodeStringElement29;
            str2 = strDecodeStringElement30;
            str3 = strDecodeStringElement32;
            str4 = strDecodeStringElement33;
            str5 = strDecodeStringElement34;
            str6 = strDecodeStringElement35;
            str7 = strDecodeStringElement36;
            str8 = strDecodeStringElement37;
            str9 = strDecodeStringElement38;
            i2 = iDecodeIntElement11;
            i3 = iDecodeIntElement12;
            i4 = iDecodeIntElement13;
            str10 = str18;
            i5 = iDecodeIntElement14;
            z = zDecodeBooleanElement9;
            str11 = strDecodeStringElement24;
            str12 = strDecodeStringElement26;
            i6 = i13;
            z2 = zDecodeBooleanElement8;
            str13 = strDecodeStringElement22;
            z3 = zDecodeBooleanElement6;
            str14 = strDecodeStringElement28;
            i7 = iDecodeIntElement9;
            str15 = strDecodeStringElement23;
            str16 = strDecodeStringElement25;
            z4 = zDecodeBooleanElement7;
            str17 = strDecodeStringElement31;
            zDecodeBooleanElement = zDecodeBooleanElement10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TokenBase(i6, 0, str8, str9, str7, str6, str5, str, str4, i4, i, i3, i2, str14, str3, str17, str13, str15, str11, iDecodeIntElement, i5, z3, str16, str12, z4, z2, strDecodeStringElement, str2, strDecodeStringElement2, i7, z, str10, strDecodeStringElement3, zDecodeBooleanElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TokenBase.write$Self$OKDex_dex_api(tokenBase, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
