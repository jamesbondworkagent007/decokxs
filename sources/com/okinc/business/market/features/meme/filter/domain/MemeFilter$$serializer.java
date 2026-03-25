package com.okinc.business.market.features.meme.filter.domain;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class MemeFilter$$serializer implements GeneratedSerializer<MemeFilter> {
    public static final int $stable;
    public static final MemeFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MemeFilter$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MemeFilter$$serializer memeFilter$$serializer = new MemeFilter$$serializer();
        INSTANCE = memeFilter$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.meme.filter.domain.MemeFilter", memeFilter$$serializer, 37);
        pluginGeneratedSerialDescriptor.addElement("top10HoldingMin", true);
        pluginGeneratedSerialDescriptor.addElement("top10HoldingMax", true);
        pluginGeneratedSerialDescriptor.addElement("devHoldingMin", true);
        pluginGeneratedSerialDescriptor.addElement("devHoldingMax", true);
        pluginGeneratedSerialDescriptor.addElement("insiderMin", true);
        pluginGeneratedSerialDescriptor.addElement("insiderMax", true);
        pluginGeneratedSerialDescriptor.addElement("sniperMin", true);
        pluginGeneratedSerialDescriptor.addElement("sniperMax", true);
        pluginGeneratedSerialDescriptor.addElement("bundleMin", true);
        pluginGeneratedSerialDescriptor.addElement("bundleMax", true);
        pluginGeneratedSerialDescriptor.addElement("freshHoldMin", true);
        pluginGeneratedSerialDescriptor.addElement("freshHoldMax", true);
        pluginGeneratedSerialDescriptor.addElement("phishHoldMin", true);
        pluginGeneratedSerialDescriptor.addElement("phishHoldMax", true);
        pluginGeneratedSerialDescriptor.addElement("bondingMin", true);
        pluginGeneratedSerialDescriptor.addElement("bondingMax", true);
        pluginGeneratedSerialDescriptor.addElement("migratedTokensMin", true);
        pluginGeneratedSerialDescriptor.addElement("migratedTokensMax", true);
        pluginGeneratedSerialDescriptor.addElement("marketCapMin", true);
        pluginGeneratedSerialDescriptor.addElement("marketCapMax", true);
        pluginGeneratedSerialDescriptor.addElement("volumeMin", true);
        pluginGeneratedSerialDescriptor.addElement("volumeMax", true);
        pluginGeneratedSerialDescriptor.addElement("holdersMin", true);
        pluginGeneratedSerialDescriptor.addElement("holdersMax", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAgeMin", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAgeMax", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAgeUnit", true);
        pluginGeneratedSerialDescriptor.addElement("transactionsMin", true);
        pluginGeneratedSerialDescriptor.addElement("transactionsMax", true);
        pluginGeneratedSerialDescriptor.addElement("buyMin", true);
        pluginGeneratedSerialDescriptor.addElement("buyMax", true);
        pluginGeneratedSerialDescriptor.addElement("sellMin", true);
        pluginGeneratedSerialDescriptor.addElement("sellMax", true);
        pluginGeneratedSerialDescriptor.addElement("keyword", true);
        pluginGeneratedSerialDescriptor.addElement("keywordExclude", true);
        pluginGeneratedSerialDescriptor.addElement("selectedSocialData", true);
        pluginGeneratedSerialDescriptor.addElement("lastTab", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = MemeFilter.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[26], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[35], IntSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MemeFilter deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
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
        int i2;
        int iDecodeIntElement;
        TokenAgeType tokenAgeType;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        List list;
        String str31;
        String str32;
        String str33;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = MemeFilter.$childSerializers;
        int i6 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            TokenAgeType tokenAgeType2 = (TokenAgeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 26, kSerializerArr[26], null);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            String strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            String strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            String strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            String strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
            String strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
            String strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
            str20 = strDecodeStringElement33;
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 35, kSerializerArr[35], null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 36);
            str33 = strDecodeStringElement28;
            str2 = strDecodeStringElement29;
            i = -1;
            strDecodeStringElement = strDecodeStringElement25;
            str26 = strDecodeStringElement26;
            str15 = strDecodeStringElement27;
            tokenAgeType = tokenAgeType2;
            str28 = strDecodeStringElement30;
            str24 = strDecodeStringElement31;
            str22 = strDecodeStringElement32;
            str18 = strDecodeStringElement34;
            str13 = strDecodeStringElement35;
            i2 = 31;
            str23 = strDecodeStringElement17;
            str21 = strDecodeStringElement16;
            str19 = strDecodeStringElement15;
            str29 = strDecodeStringElement19;
            str11 = strDecodeStringElement20;
            str31 = strDecodeStringElement21;
            str = strDecodeStringElement22;
            str16 = strDecodeStringElement23;
            str27 = strDecodeStringElement24;
            str7 = strDecodeStringElement5;
            str17 = strDecodeStringElement13;
            str3 = strDecodeStringElement12;
            str32 = strDecodeStringElement11;
            str30 = strDecodeStringElement9;
            str5 = strDecodeStringElement7;
            str12 = strDecodeStringElement10;
            str14 = strDecodeStringElement14;
            str6 = strDecodeStringElement6;
            str9 = strDecodeStringElement3;
            str10 = strDecodeStringElement2;
            str4 = strDecodeStringElement8;
            str25 = strDecodeStringElement18;
            str8 = strDecodeStringElement4;
        } else {
            int i7 = 0;
            int i8 = 0;
            List list2 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            String strDecodeStringElement39 = null;
            String strDecodeStringElement40 = null;
            String strDecodeStringElement41 = null;
            String strDecodeStringElement42 = null;
            String strDecodeStringElement43 = null;
            String strDecodeStringElement44 = null;
            String strDecodeStringElement45 = null;
            String strDecodeStringElement46 = null;
            String strDecodeStringElement47 = null;
            String strDecodeStringElement48 = null;
            String strDecodeStringElement49 = null;
            String strDecodeStringElement50 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement51 = null;
            String strDecodeStringElement52 = null;
            String strDecodeStringElement53 = null;
            String strDecodeStringElement54 = null;
            String strDecodeStringElement55 = null;
            String strDecodeStringElement56 = null;
            String strDecodeStringElement57 = null;
            String strDecodeStringElement58 = null;
            String strDecodeStringElement59 = null;
            String strDecodeStringElement60 = null;
            String strDecodeStringElement61 = null;
            String strDecodeStringElement62 = null;
            String strDecodeStringElement63 = null;
            String strDecodeStringElement64 = null;
            String strDecodeStringElement65 = null;
            String strDecodeStringElement66 = null;
            String strDecodeStringElement67 = null;
            String str34 = null;
            boolean z = true;
            TokenAgeType tokenAgeType3 = null;
            int iDecodeIntElement2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z = false;
                        i6 = 4;
                        break;
                    case 0:
                        String strDecodeStringElement68 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str34 = strDecodeStringElement68;
                        i6 = 4;
                        break;
                    case 1:
                        strDecodeStringElement67 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 2:
                        strDecodeStringElement66 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 3:
                        strDecodeStringElement65 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i7 |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 4:
                        strDecodeStringElement64 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i7 |= 16;
                        Unit unit6 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 5:
                        strDecodeStringElement63 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 |= 32;
                        Unit unit7 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 6:
                        strDecodeStringElement62 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i7 |= 64;
                        Unit unit72 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 7:
                        strDecodeStringElement61 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i7 |= 128;
                        Unit unit722 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 8:
                        strDecodeStringElement60 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i7 |= 256;
                        Unit unit7222 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 9:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i7 |= 512;
                        Unit unit72222 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 10:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i7 |= 1024;
                        Unit unit722222 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 11:
                        strDecodeStringElement59 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i7 |= 2048;
                        Unit unit7222222 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 12:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i7 |= 4096;
                        Unit unit8 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 13:
                        strDecodeStringElement58 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i7 |= 8192;
                        Unit unit9 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 14:
                        strDecodeStringElement57 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i7 |= 16384;
                        Unit unit10 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 15:
                        strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i7 |= 32768;
                        Unit unit11 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 16:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i7 |= 65536;
                        Unit unit12 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 17:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i3 = 131072;
                        i7 |= i3;
                        Unit unit13 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 18:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i3 = 262144;
                        i7 |= i3;
                        Unit unit132 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 19:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i3 = 524288;
                        i7 |= i3;
                        Unit unit1322 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 20:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i3 = 1048576;
                        i7 |= i3;
                        Unit unit13222 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 21:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = 2097152;
                        i7 |= i3;
                        Unit unit132222 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 22:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i3 = 4194304;
                        i7 |= i3;
                        Unit unit1322222 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 23:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i3 = 8388608;
                        i7 |= i3;
                        Unit unit13222222 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 24:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i3 = 16777216;
                        i7 |= i3;
                        Unit unit132222222 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 25:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i3 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i7 |= i3;
                        Unit unit1322222222 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 26:
                        tokenAgeType3 = (TokenAgeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 26, kSerializerArr[26], tokenAgeType3);
                        i3 = 67108864;
                        i7 |= i3;
                        Unit unit13222222222 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 27:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i4 = 134217728;
                        i7 |= i4;
                        Unit unit14 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 28:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i4 = 268435456;
                        i7 |= i4;
                        Unit unit142 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 29:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i4 = 536870912;
                        i7 |= i4;
                        Unit unit1422 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 30:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i4 = 1073741824;
                        i7 |= i4;
                        Unit unit14222 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 31:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i7 |= Integer.MIN_VALUE;
                        Unit unit15 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 32:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
                        i8 |= 1;
                        Unit unit16 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 33:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
                        i5 = i8 | 2;
                        Unit unit17 = Unit.INSTANCE;
                        i8 = i5;
                        i6 = 4;
                        break;
                    case 34:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
                        i5 = i8 | 4;
                        Unit unit172 = Unit.INSTANCE;
                        i8 = i5;
                        i6 = 4;
                        break;
                    case 35:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 35, kSerializerArr[35], list2);
                        i8 |= 8;
                        Unit unit132222222222 = Unit.INSTANCE;
                        i6 = 4;
                        break;
                    case 36:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 36);
                        int i9 = i8 | 16;
                        Unit unit18 = Unit.INSTANCE;
                        i8 = i9;
                        i6 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i7;
            str = strDecodeStringElement39;
            str2 = strDecodeStringElement47;
            str3 = strDecodeStringElement53;
            str4 = strDecodeStringElement62;
            str5 = strDecodeStringElement63;
            str6 = strDecodeStringElement64;
            str7 = strDecodeStringElement65;
            str8 = strDecodeStringElement66;
            str9 = strDecodeStringElement67;
            str10 = str34;
            i2 = i8;
            iDecodeIntElement = iDecodeIntElement2;
            tokenAgeType = tokenAgeType3;
            str11 = strDecodeStringElement37;
            str12 = strDecodeStringElement60;
            str13 = strDecodeStringElement41;
            str14 = strDecodeStringElement52;
            str15 = strDecodeStringElement49;
            str16 = strDecodeStringElement40;
            str17 = strDecodeStringElement59;
            str18 = strDecodeStringElement42;
            str19 = strDecodeStringElement58;
            str20 = strDecodeStringElement43;
            str21 = strDecodeStringElement57;
            str22 = strDecodeStringElement44;
            str23 = strDecodeStringElement56;
            str24 = strDecodeStringElement45;
            str25 = strDecodeStringElement51;
            str26 = strDecodeStringElement50;
            str27 = strDecodeStringElement55;
            str28 = strDecodeStringElement46;
            str29 = strDecodeStringElement36;
            str30 = strDecodeStringElement61;
            list = list2;
            String str35 = strDecodeStringElement48;
            str31 = strDecodeStringElement38;
            str32 = strDecodeStringElement54;
            str33 = str35;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MemeFilter(i, i2, str10, str9, str8, str7, str6, str5, str4, str30, str12, str32, str3, str17, str14, str19, str21, str23, str25, str29, str11, str31, str, str16, str27, strDecodeStringElement, str26, str15, tokenAgeType, str33, str2, str28, str24, str22, str20, str18, str13, list, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MemeFilter memeFilter) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(memeFilter, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MemeFilter.write$Self$OKDex_dex_impl(memeFilter, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
