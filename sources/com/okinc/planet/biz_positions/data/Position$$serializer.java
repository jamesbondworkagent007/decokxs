package com.okinc.planet.biz_positions.data;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.planet.serializer.PlanetNumericString$$serializer;
import java.math.BigDecimal;
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
import kotlinx.serialization.internal.StringSerializer;
import o.C46414tTl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class Position$$serializer implements GeneratedSerializer<Position> {
    public static final int $stable;
    public static final Position$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Position$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Position$$serializer position$$serializer = new Position$$serializer();
        INSTANCE = position$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.biz_positions.data.Position", position$$serializer, 27);
        pluginGeneratedSerialDescriptor.addElement("avgPx", true);
        pluginGeneratedSerialDescriptor.addElement("cTime", true);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE, true);
        pluginGeneratedSerialDescriptor.addElement(MTPushConstants.Operation.KEY_ALIAS, true);
        pluginGeneratedSerialDescriptor.addElement("posSide", true);
        pluginGeneratedSerialDescriptor.addElement("pos", true);
        pluginGeneratedSerialDescriptor.addElement("posCcy", true);
        pluginGeneratedSerialDescriptor.addElement("liqPx", true);
        pluginGeneratedSerialDescriptor.addElement("mgnMode", true);
        pluginGeneratedSerialDescriptor.addElement("uplRatio", true);
        pluginGeneratedSerialDescriptor.addElement("posSpace", true);
        pluginGeneratedSerialDescriptor.addElement("posId", true);
        pluginGeneratedSerialDescriptor.addElement("margin", true);
        pluginGeneratedSerialDescriptor.addElement("mgnRatio", true);
        pluginGeneratedSerialDescriptor.addElement("markPx", true);
        pluginGeneratedSerialDescriptor.addElement("upl", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCcy", true);
        pluginGeneratedSerialDescriptor.addElement("marginCcy", true);
        pluginGeneratedSerialDescriptor.addElement("realizedPnl", true);
        pluginGeneratedSerialDescriptor.addElement("pnl", true);
        pluginGeneratedSerialDescriptor.addElement("fundingFee", true);
        pluginGeneratedSerialDescriptor.addElement("fee", true);
        pluginGeneratedSerialDescriptor.addElement("bePx", true);
        pluginGeneratedSerialDescriptor.addElement("last", true);
        pluginGeneratedSerialDescriptor.addElement("notionalUsd", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        PlanetNumericString$$serializer planetNumericString$$serializer = PlanetNumericString$$serializer.INSTANCE;
        C46414tTl c46414tTl = C46414tTl.KWHzl;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, planetNumericString$$serializer, c46414tTl, planetNumericString$$serializer, c46414tTl, stringSerializer, stringSerializer, c46414tTl, c46414tTl, c46414tTl, c46414tTl, planetNumericString$$serializer, planetNumericString$$serializer, planetNumericString$$serializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Position deserialize(@NotNull Decoder decoder) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
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
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        BigDecimal bigDecimal5;
        BigDecimal bigDecimal6;
        String strAEQbTJ;
        String str17;
        String str18;
        String str19;
        String str20;
        int i2;
        int i3;
        PlanetNumericString planetNumericStringOLrzqt;
        int i4;
        BigDecimal bigDecimal7;
        String strAEQbTJ2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 9;
        int i6 = 7;
        int i7 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            PlanetNumericString$$serializer planetNumericString$$serializer = PlanetNumericString$$serializer.INSTANCE;
            str3 = strDecodeStringElement6;
            PlanetNumericString planetNumericString = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, planetNumericString$$serializer, null);
            String strAEQbTJ3 = planetNumericString != null ? planetNumericString.AEQbTJ() : null;
            C46414tTl c46414tTl = C46414tTl.KWHzl;
            BigDecimal bigDecimal8 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, c46414tTl, null);
            PlanetNumericString planetNumericString2 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, planetNumericString$$serializer, null);
            String strAEQbTJ4 = planetNumericString2 != null ? planetNumericString2.AEQbTJ() : null;
            BigDecimal bigDecimal9 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, c46414tTl, null);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            BigDecimal bigDecimal10 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 20, c46414tTl, null);
            BigDecimal bigDecimal11 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 21, c46414tTl, null);
            BigDecimal bigDecimal12 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 22, c46414tTl, null);
            BigDecimal bigDecimal13 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 23, c46414tTl, null);
            PlanetNumericString planetNumericString3 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 24, planetNumericString$$serializer, null);
            if (planetNumericString3 != null) {
                strAEQbTJ2 = planetNumericString3.AEQbTJ();
                bigDecimal7 = bigDecimal13;
            } else {
                bigDecimal7 = bigDecimal13;
                strAEQbTJ2 = null;
            }
            PlanetNumericString planetNumericString4 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 25, planetNumericString$$serializer, null);
            String strAEQbTJ5 = planetNumericString4 != null ? planetNumericString4.AEQbTJ() : null;
            PlanetNumericString planetNumericString5 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 26, planetNumericString$$serializer, null);
            strAEQbTJ = planetNumericString5 != null ? planetNumericString5.AEQbTJ() : null;
            str18 = strAEQbTJ2;
            str10 = strDecodeStringElement15;
            str13 = strDecodeStringElement14;
            str20 = strDecodeStringElement13;
            str4 = strDecodeStringElement16;
            bigDecimal2 = bigDecimal9;
            str5 = strAEQbTJ4;
            bigDecimal4 = bigDecimal10;
            bigDecimal = bigDecimal8;
            str11 = strDecodeStringElement2;
            str = strDecodeStringElement;
            str2 = strAEQbTJ3;
            str6 = strDecodeStringElement4;
            bigDecimal5 = bigDecimal11;
            bigDecimal6 = bigDecimal12;
            bigDecimal3 = bigDecimal7;
            str17 = strAEQbTJ5;
            str12 = strDecodeStringElement7;
            i = 134217727;
            str7 = strDecodeStringElement5;
            str8 = strDecodeStringElement9;
            str9 = strDecodeStringElement3;
            str14 = strDecodeStringElement12;
            str15 = strDecodeStringElement11;
            str19 = strDecodeStringElement10;
            str16 = strDecodeStringElement8;
        } else {
            boolean z = true;
            BigDecimal bigDecimal14 = null;
            BigDecimal bigDecimal15 = null;
            BigDecimal bigDecimal16 = null;
            BigDecimal bigDecimal17 = null;
            BigDecimal bigDecimal18 = null;
            String strAEQbTJ6 = null;
            String strDecodeStringElement17 = null;
            String str21 = null;
            String strAEQbTJ7 = null;
            String strDecodeStringElement18 = null;
            String strAEQbTJ8 = null;
            String strDecodeStringElement19 = null;
            String strAEQbTJ9 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            int i8 = 0;
            BigDecimal bigDecimal19 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 0:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i8 |= 1;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 1:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i8 |= 2;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 2:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i8 |= 4;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 3:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i8 |= 8;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 4:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i8 |= 16;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 5:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i8 |= 32;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 6:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i8 |= 64;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 7:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i8 |= 128;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 8:
                        i8 |= 256;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i7);
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 9:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i8 |= 512;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 10:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i8 |= 1024;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 11:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i8 |= 2048;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 12:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i8 |= 4096;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 13:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i8 |= 8192;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 14:
                        PlanetNumericString planetNumericString6 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, PlanetNumericString$$serializer.INSTANCE, strAEQbTJ7 != null ? PlanetNumericString.OLrzqt(strAEQbTJ7) : null);
                        strAEQbTJ7 = planetNumericString6 != null ? planetNumericString6.AEQbTJ() : null;
                        i8 |= 16384;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 15:
                        bigDecimal14 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, C46414tTl.KWHzl, bigDecimal14);
                        i2 = 32768;
                        i8 |= i2;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 16:
                        PlanetNumericString$$serializer planetNumericString$$serializer2 = PlanetNumericString$$serializer.INSTANCE;
                        if (strAEQbTJ9 != null) {
                            planetNumericStringOLrzqt = PlanetNumericString.OLrzqt(strAEQbTJ9);
                            i3 = 16;
                        } else {
                            i3 = 16;
                            planetNumericStringOLrzqt = null;
                        }
                        PlanetNumericString planetNumericString7 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, planetNumericString$$serializer2, planetNumericStringOLrzqt);
                        strAEQbTJ9 = planetNumericString7 != null ? planetNumericString7.AEQbTJ() : null;
                        i2 = 65536;
                        i8 |= i2;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 17:
                        bigDecimal16 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, C46414tTl.KWHzl, bigDecimal16);
                        i2 = 131072;
                        i8 |= i2;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 18:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i8 |= 262144;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 19:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i8 |= 524288;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 20:
                        bigDecimal15 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 20, C46414tTl.KWHzl, bigDecimal15);
                        i2 = 1048576;
                        i8 |= i2;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 21:
                        i4 = 2097152;
                        bigDecimal17 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 21, C46414tTl.KWHzl, bigDecimal17);
                        i2 = i4;
                        i8 |= i2;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 22:
                        i4 = 4194304;
                        bigDecimal18 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 22, C46414tTl.KWHzl, bigDecimal18);
                        i2 = i4;
                        i8 |= i2;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 23:
                        bigDecimal19 = (BigDecimal) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 23, C46414tTl.KWHzl, bigDecimal19);
                        i4 = 8388608;
                        i2 = i4;
                        i8 |= i2;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 24:
                        PlanetNumericString planetNumericString8 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 24, PlanetNumericString$$serializer.INSTANCE, strAEQbTJ8 != null ? PlanetNumericString.OLrzqt(strAEQbTJ8) : null);
                        i4 = 16777216;
                        strAEQbTJ8 = planetNumericString8 != null ? planetNumericString8.AEQbTJ() : null;
                        i2 = i4;
                        i8 |= i2;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 25:
                        PlanetNumericString planetNumericString9 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 25, PlanetNumericString$$serializer.INSTANCE, str21 != null ? PlanetNumericString.OLrzqt(str21) : null);
                        String strAEQbTJ10 = planetNumericString9 != null ? planetNumericString9.AEQbTJ() : null;
                        i4 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        str21 = strAEQbTJ10;
                        i2 = i4;
                        i8 |= i2;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 26:
                        PlanetNumericString planetNumericString10 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 26, PlanetNumericString$$serializer.INSTANCE, strAEQbTJ6 != null ? PlanetNumericString.OLrzqt(strAEQbTJ6) : null);
                        strAEQbTJ6 = planetNumericString10 != null ? planetNumericString10.AEQbTJ() : null;
                        i8 |= 67108864;
                        i7 = 8;
                        i5 = 9;
                        i6 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            bigDecimal = bigDecimal14;
            bigDecimal2 = bigDecimal16;
            i = i8;
            str = strDecodeStringElement17;
            str2 = strAEQbTJ7;
            str3 = strDecodeStringElement18;
            str4 = strDecodeStringElement19;
            str5 = strAEQbTJ9;
            str6 = strDecodeStringElement20;
            str7 = strDecodeStringElement21;
            str8 = strDecodeStringElement22;
            str9 = strDecodeStringElement23;
            str10 = strDecodeStringElement24;
            str11 = strDecodeStringElement25;
            str12 = strDecodeStringElement26;
            str13 = strDecodeStringElement27;
            str14 = strDecodeStringElement28;
            str15 = strDecodeStringElement29;
            str16 = strDecodeStringElement31;
            bigDecimal3 = bigDecimal19;
            bigDecimal4 = bigDecimal15;
            bigDecimal5 = bigDecimal17;
            bigDecimal6 = bigDecimal18;
            strAEQbTJ = strAEQbTJ6;
            str17 = str21;
            str18 = strAEQbTJ8;
            str19 = strDecodeStringElement30;
            str20 = strDecodeStringElement32;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Position(i, str, str11, str9, str6, str7, str3, str12, str16, str8, str19, str15, str14, str20, str13, str2, bigDecimal, str5, bigDecimal2, str10, str4, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal3, str18, str17, strAEQbTJ, null, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Position position) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(position, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Position.write$Self$OKPlanet_ok_feature_planet_impl(position, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
