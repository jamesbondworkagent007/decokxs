package com.okinc.business.market.features.meme.data.model;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class PublicMetricsWsData$$serializer implements GeneratedSerializer<PublicMetricsWsData> {
    public static final int $stable;
    public static final PublicMetricsWsData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PublicMetricsWsData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PublicMetricsWsData$$serializer publicMetricsWsData$$serializer = new PublicMetricsWsData$$serializer();
        INSTANCE = publicMetricsWsData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.meme.data.model.PublicMetricsWsData", publicMetricsWsData$$serializer, 34);
        pluginGeneratedSerialDescriptor.addElement("chain", true);
        pluginGeneratedSerialDescriptor.addElement("ca", true);
        pluginGeneratedSerialDescriptor.addElement("smbl", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("logo", true);
        pluginGeneratedSerialDescriptor.addElement("bigLogo", true);
        pluginGeneratedSerialDescriptor.addElement("createTime", true);
        pluginGeneratedSerialDescriptor.addElement("creator", true);
        pluginGeneratedSerialDescriptor.addElement("txs1h", true);
        pluginGeneratedSerialDescriptor.addElement("txsb1h", true);
        pluginGeneratedSerialDescriptor.addElement("txss1h", true);
        pluginGeneratedSerialDescriptor.addElement("vol1h", true);
        pluginGeneratedSerialDescriptor.addElement("mcap", true);
        pluginGeneratedSerialDescriptor.addElement("fee", true);
        pluginGeneratedSerialDescriptor.addElement("bots", true);
        pluginGeneratedSerialDescriptor.addElement("hold", true);
        pluginGeneratedSerialDescriptor.addElement("top10HoldRto", true);
        pluginGeneratedSerialDescriptor.addElement("devHoldRto", true);
        pluginGeneratedSerialDescriptor.addElement("suspHoldRto", true);
        pluginGeneratedSerialDescriptor.addElement("sniperBuy", true);
        pluginGeneratedSerialDescriptor.addElement("sniperCnt", true);
        pluginGeneratedSerialDescriptor.addElement("sniperHoldRto", true);
        pluginGeneratedSerialDescriptor.addElement("bundHoldRto", true);
        pluginGeneratedSerialDescriptor.addElement("creatorMigrCnt", true);
        pluginGeneratedSerialDescriptor.addElement("t", true);
        pluginGeneratedSerialDescriptor.addElement("migrBegin", true);
        pluginGeneratedSerialDescriptor.addElement("migrEnd", true);
        pluginGeneratedSerialDescriptor.addElement("prog", true);
        pluginGeneratedSerialDescriptor.addElement("protoId", true);
        pluginGeneratedSerialDescriptor.addElement("extProtoId", true);
        pluginGeneratedSerialDescriptor.addElement("projLink", true);
        pluginGeneratedSerialDescriptor.addElement("media", true);
        pluginGeneratedSerialDescriptor.addElement("rankTypes", true);
        pluginGeneratedSerialDescriptor.addElement("logoPass", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = PublicMetricsWsData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[24], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, MediaWsData$$serializer.INSTANCE, kSerializerArr[32], stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PublicMetricsWsData deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
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
        String str11;
        List list2;
        String strDecodeStringElement;
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
        MediaWsData mediaWsData;
        String str27;
        String str28;
        String str29;
        String str30;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PublicMetricsWsData.$childSerializers;
        int i5 = 6;
        int i6 = 8;
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
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 24, kSerializerArr[24], null);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            String strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            String strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            MediaWsData mediaWsData2 = (MediaWsData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 31, MediaWsData$$serializer.INSTANCE, null);
            list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 32, kSerializerArr[32], null);
            mediaWsData = mediaWsData2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
            str21 = strDecodeStringElement27;
            str7 = strDecodeStringElement5;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement7;
            str15 = strDecodeStringElement22;
            str18 = strDecodeStringElement23;
            str24 = strDecodeStringElement24;
            str12 = strDecodeStringElement25;
            str19 = strDecodeStringElement10;
            list = list3;
            str29 = strDecodeStringElement28;
            str27 = strDecodeStringElement29;
            str16 = strDecodeStringElement30;
            str20 = strDecodeStringElement31;
            str2 = strDecodeStringElement26;
            str13 = strDecodeStringElement20;
            str17 = strDecodeStringElement14;
            str22 = strDecodeStringElement13;
            str3 = strDecodeStringElement12;
            str14 = strDecodeStringElement11;
            str = strDecodeStringElement19;
            str11 = strDecodeStringElement18;
            str23 = strDecodeStringElement17;
            str30 = strDecodeStringElement16;
            str28 = strDecodeStringElement15;
            str9 = strDecodeStringElement2;
            i2 = 3;
            str8 = strDecodeStringElement4;
            i = -1;
            str6 = strDecodeStringElement6;
            str10 = strDecodeStringElement3;
            str25 = strDecodeStringElement21;
            str26 = strDecodeStringElement9;
        } else {
            String str31 = null;
            int i7 = 0;
            int i8 = 0;
            MediaWsData mediaWsData3 = null;
            String str32 = null;
            List list4 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
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
            String strDecodeStringElement51 = null;
            String strDecodeStringElement52 = null;
            String strDecodeStringElement53 = null;
            String strDecodeStringElement54 = null;
            String strDecodeStringElement55 = null;
            String strDecodeStringElement56 = null;
            String strDecodeStringElement57 = null;
            String strDecodeStringElement58 = null;
            String str33 = null;
            String str34 = null;
            boolean z = true;
            List list5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z = false;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 0:
                        String strDecodeStringElement59 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str33 = strDecodeStringElement59;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 1:
                        String strDecodeStringElement60 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        str34 = strDecodeStringElement60;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 2:
                        strDecodeStringElement58 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 3:
                        strDecodeStringElement57 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i7 |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 4:
                        strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        Unit unit6 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 5:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 |= 32;
                        Unit unit62 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 6:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i7 |= 64;
                        Unit unit622 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 7:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i7 |= 128;
                        Unit unit6222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 8:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i7 |= 256;
                        Unit unit62222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 9:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i7 |= 512;
                        Unit unit622222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 10:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i7 |= 1024;
                        Unit unit6222222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 11:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i7 |= 2048;
                        Unit unit62222222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 12:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i7 |= 4096;
                        Unit unit622222222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 13:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i7 |= 8192;
                        Unit unit7 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 14:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i7 |= 16384;
                        Unit unit8 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 15:
                        String strDecodeStringElement61 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i7 |= 32768;
                        Unit unit9 = Unit.INSTANCE;
                        str31 = strDecodeStringElement61;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 16:
                        String strDecodeStringElement62 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i7 |= 65536;
                        Unit unit10 = Unit.INSTANCE;
                        str32 = strDecodeStringElement62;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 17:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i7 |= 131072;
                        Unit unit11 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 18:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i7 |= 262144;
                        Unit unit12 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 19:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i3 = 524288;
                        i7 |= i3;
                        Unit unit13 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 20:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i3 = 1048576;
                        i7 |= i3;
                        Unit unit132 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 21:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = 2097152;
                        i7 |= i3;
                        Unit unit1322 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 22:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i3 = 4194304;
                        i7 |= i3;
                        Unit unit13222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 23:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i3 = 8388608;
                        i7 |= i3;
                        Unit unit132222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 24:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 24, kSerializerArr[24], list5);
                        i3 = 16777216;
                        i7 |= i3;
                        Unit unit1322222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 25:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i4 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i7 |= i4;
                        Unit unit14 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 26:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i4 = 67108864;
                        i7 |= i4;
                        Unit unit142 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 27:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i4 = 134217728;
                        i7 |= i4;
                        Unit unit1422 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 28:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i4 = 268435456;
                        i7 |= i4;
                        Unit unit14222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 29:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i4 = 536870912;
                        i7 |= i4;
                        Unit unit142222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 30:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i4 = 1073741824;
                        i7 |= i4;
                        Unit unit1422222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 31:
                        mediaWsData3 = (MediaWsData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 31, MediaWsData$$serializer.INSTANCE, mediaWsData3);
                        i4 = Integer.MIN_VALUE;
                        i7 |= i4;
                        Unit unit14222222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 32:
                        list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 32, kSerializerArr[32], list4);
                        i8 |= 1;
                        Unit unit13222222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 6;
                        break;
                    case 33:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
                        int i9 = i8 | 2;
                        Unit unit15 = Unit.INSTANCE;
                        i8 = i9;
                        i6 = 8;
                        i5 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i7;
            list = list5;
            str = strDecodeStringElement32;
            str2 = strDecodeStringElement41;
            str3 = strDecodeStringElement47;
            str4 = strDecodeStringElement54;
            str5 = strDecodeStringElement55;
            str6 = strDecodeStringElement56;
            str7 = strDecodeStringElement57;
            str8 = strDecodeStringElement58;
            str9 = str33;
            str10 = str34;
            i2 = i8;
            str11 = str32;
            list2 = list4;
            strDecodeStringElement = strDecodeStringElement35;
            str12 = strDecodeStringElement42;
            str13 = strDecodeStringElement44;
            str14 = strDecodeStringElement51;
            str15 = strDecodeStringElement34;
            str16 = strDecodeStringElement37;
            str17 = strDecodeStringElement45;
            str18 = strDecodeStringElement48;
            str19 = strDecodeStringElement52;
            str20 = strDecodeStringElement36;
            str21 = strDecodeStringElement40;
            str22 = strDecodeStringElement46;
            str23 = str31;
            str24 = strDecodeStringElement43;
            str25 = strDecodeStringElement33;
            str26 = strDecodeStringElement53;
            mediaWsData = mediaWsData3;
            String str35 = strDecodeStringElement50;
            str27 = strDecodeStringElement38;
            str28 = str35;
            String str36 = strDecodeStringElement49;
            str29 = strDecodeStringElement39;
            str30 = str36;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PublicMetricsWsData(i, i2, str9, str10, str8, str7, str6, str5, str4, str26, str19, str14, str3, str22, str17, str28, str30, str23, str11, str, str13, str25, str15, str18, str24, str12, list, str2, str21, str29, str27, str16, str20, mediaWsData, list2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PublicMetricsWsData publicMetricsWsData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(publicMetricsWsData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PublicMetricsWsData.write$Self$OKDex_dex_impl(publicMetricsWsData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
