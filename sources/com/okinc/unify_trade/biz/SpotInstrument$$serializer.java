package com.okinc.unify_trade.biz;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Unit;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class SpotInstrument$$serializer implements GeneratedSerializer<SpotInstrument> {
    public static final int $stable;
    public static final SpotInstrument$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SpotInstrument$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SpotInstrument$$serializer spotInstrument$$serializer = new SpotInstrument$$serializer();
        INSTANCE = spotInstrument$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.SpotInstrument", spotInstrument$$serializer, 35);
        pluginGeneratedSerialDescriptor.addElement("instId", false);
        pluginGeneratedSerialDescriptor.addElement("instType", false);
        pluginGeneratedSerialDescriptor.addElement("baseInfo", false);
        pluginGeneratedSerialDescriptor.addElement("uly", true);
        pluginGeneratedSerialDescriptor.addElement("instFly", true);
        pluginGeneratedSerialDescriptor.addElement("baseCcy", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCcy", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.LEVEL, true);
        pluginGeneratedSerialDescriptor.addElement("coinLever", true);
        pluginGeneratedSerialDescriptor.addElement("preQuote", true);
        pluginGeneratedSerialDescriptor.addElement("continuous", true);
        pluginGeneratedSerialDescriptor.addElement("enableFilter", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("listTime", true);
        pluginGeneratedSerialDescriptor.addElement("maxLmtAmt", true);
        pluginGeneratedSerialDescriptor.addElement("maxMktAmt", true);
        pluginGeneratedSerialDescriptor.addElement("withinTenMinsOfContractGeneration", true);
        pluginGeneratedSerialDescriptor.addElement("tenMinsAfterContractGeneration", true);
        pluginGeneratedSerialDescriptor.addElement("indexMaxThresholdRate", true);
        pluginGeneratedSerialDescriptor.addElement("priceLimitStatus", true);
        pluginGeneratedSerialDescriptor.addElement("spotLpH1", true);
        pluginGeneratedSerialDescriptor.addElement("spotLpH2", true);
        pluginGeneratedSerialDescriptor.addElement("spotLpH3", true);
        pluginGeneratedSerialDescriptor.addElement("spotLpJ1", true);
        pluginGeneratedSerialDescriptor.addElement("spotLpJ2", true);
        pluginGeneratedSerialDescriptor.addElement("lpX1", true);
        pluginGeneratedSerialDescriptor.addElement("lpX2", true);
        pluginGeneratedSerialDescriptor.addElement("lpY1", true);
        pluginGeneratedSerialDescriptor.addElement("lpY2", true);
        pluginGeneratedSerialDescriptor.addElement("lpZ1", true);
        pluginGeneratedSerialDescriptor.addElement("lpZ2", true);
        pluginGeneratedSerialDescriptor.addElement("displayId", true);
        pluginGeneratedSerialDescriptor.addElement("displayQuoteCcy", true);
        pluginGeneratedSerialDescriptor.addElement("tradeQuoteCcyList", true);
        pluginGeneratedSerialDescriptor.addElement("listStage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SpotInstrument.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BaseInstrument$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[33]), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SpotInstrument deserialize(@NotNull Decoder decoder) {
        int i;
        BaseInstrument baseInstrument;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i2;
        List list;
        String strDecodeStringElement;
        String str8;
        String str9;
        String str10;
        boolean z;
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
        String str31;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SpotInstrument.$childSerializers;
        int i4 = 8;
        int i5 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            BaseInstrument baseInstrument2 = (BaseInstrument) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BaseInstrument$$serializer.INSTANCE, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            String strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            String strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            String strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 33, kSerializerArr[33], null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
            str3 = strDecodeStringElement7;
            str14 = strDecodeStringElement8;
            str15 = strDecodeStringElement32;
            str25 = strDecodeStringElement20;
            str31 = strDecodeStringElement21;
            str30 = strDecodeStringElement22;
            str29 = strDecodeStringElement23;
            str9 = strDecodeStringElement24;
            str20 = strDecodeStringElement25;
            str23 = strDecodeStringElement26;
            str27 = strDecodeStringElement27;
            str8 = strDecodeStringElement28;
            str12 = strDecodeStringElement29;
            str16 = strDecodeStringElement30;
            str19 = strDecodeStringElement31;
            str22 = strDecodeStringElement18;
            z = zDecodeBooleanElement;
            str26 = strDecodeStringElement9;
            str = strDecodeStringElement12;
            str17 = strDecodeStringElement11;
            str21 = strDecodeStringElement10;
            str24 = strDecodeStringElement17;
            str28 = strDecodeStringElement16;
            str10 = strDecodeStringElement15;
            str13 = strDecodeStringElement14;
            str6 = strDecodeStringElement3;
            str18 = strDecodeStringElement13;
            str7 = strDecodeStringElement2;
            str11 = strDecodeStringElement19;
            i2 = 7;
            str2 = strDecodeStringElement5;
            baseInstrument = baseInstrument2;
            i = -1;
            str5 = strDecodeStringElement4;
            str4 = strDecodeStringElement6;
        } else {
            String strDecodeStringElement33 = null;
            boolean zDecodeBooleanElement2 = false;
            int i6 = 0;
            int i7 = 0;
            List list2 = null;
            String str32 = null;
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
            String strDecodeStringElement59 = null;
            String strDecodeStringElement60 = null;
            String strDecodeStringElement61 = null;
            String strDecodeStringElement62 = null;
            String str33 = null;
            boolean z2 = true;
            BaseInstrument baseInstrument3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z2 = false;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 0:
                        String strDecodeStringElement63 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str33 = strDecodeStringElement63;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 1:
                        strDecodeStringElement62 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 2:
                        baseInstrument3 = (BaseInstrument) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BaseInstrument$$serializer.INSTANCE, baseInstrument3);
                        int i8 = i6 | 4;
                        Unit unit4 = Unit.INSTANCE;
                        i6 = i8;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 3:
                        strDecodeStringElement61 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 4:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i6 |= 16;
                        Unit unit6 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 5:
                        strDecodeStringElement60 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        Unit unit7 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 6:
                        strDecodeStringElement59 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i6 |= 64;
                        Unit unit72 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 7:
                        strDecodeStringElement58 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i6 |= 128;
                        Unit unit722 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 8:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i6 |= 256;
                        Unit unit8 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 9:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i6 |= 512;
                        Unit unit82 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 10:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i6 |= 1024;
                        Unit unit822 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 11:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i6 |= 2048;
                        Unit unit9 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 12:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i6 |= 4096;
                        Unit unit10 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 13:
                        strDecodeStringElement57 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i6 |= 8192;
                        Unit unit11 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 14:
                        strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i6 |= 16384;
                        Unit unit12 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 15:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i6 |= 32768;
                        Unit unit13 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 16:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i6 |= 65536;
                        Unit unit14 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 17:
                        String strDecodeStringElement64 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i6 |= 131072;
                        Unit unit15 = Unit.INSTANCE;
                        str32 = strDecodeStringElement64;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 18:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i6 |= 262144;
                        Unit unit16 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 19:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i3 = 524288;
                        i6 |= i3;
                        Unit unit17 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 20:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i3 = 1048576;
                        i6 |= i3;
                        Unit unit172 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 21:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = 2097152;
                        i6 |= i3;
                        Unit unit1722 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 22:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i3 = 4194304;
                        i6 |= i3;
                        Unit unit17222 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 23:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i3 = 8388608;
                        i6 |= i3;
                        Unit unit172222 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 24:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i3 = 16777216;
                        i6 |= i3;
                        Unit unit1722222 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 25:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i3 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i6 |= i3;
                        Unit unit17222222 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 26:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i3 = 67108864;
                        i6 |= i3;
                        Unit unit172222222 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 27:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i3 = 134217728;
                        i6 |= i3;
                        Unit unit1722222222 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 28:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i3 = 268435456;
                        i6 |= i3;
                        Unit unit17222222222 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 29:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i3 = 536870912;
                        i6 |= i3;
                        Unit unit172222222222 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 30:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i3 = 1073741824;
                        i6 |= i3;
                        Unit unit1722222222222 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 31:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i3 = Integer.MIN_VALUE;
                        i6 |= i3;
                        Unit unit17222222222222 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 32:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
                        i7 |= 1;
                        Unit unit18 = Unit.INSTANCE;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 33:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 33, kSerializerArr[33], list2);
                        int i9 = i7 | 2;
                        Unit unit19 = Unit.INSTANCE;
                        i7 = i9;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 34:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
                        int i10 = i7 | 4;
                        Unit unit20 = Unit.INSTANCE;
                        i7 = i10;
                        i4 = 8;
                        i5 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i6;
            baseInstrument = baseInstrument3;
            str = strDecodeStringElement50;
            str2 = strDecodeStringElement54;
            str3 = strDecodeStringElement59;
            str4 = strDecodeStringElement60;
            str5 = strDecodeStringElement61;
            str6 = strDecodeStringElement62;
            str7 = str33;
            i2 = i7;
            list = list2;
            strDecodeStringElement = strDecodeStringElement38;
            str8 = strDecodeStringElement41;
            str9 = strDecodeStringElement45;
            str10 = strDecodeStringElement55;
            z = zDecodeBooleanElement2;
            str11 = strDecodeStringElement34;
            str12 = strDecodeStringElement40;
            str13 = strDecodeStringElement56;
            str14 = strDecodeStringElement58;
            str15 = strDecodeStringElement37;
            str16 = strDecodeStringElement39;
            str17 = strDecodeStringElement51;
            str18 = strDecodeStringElement57;
            str19 = strDecodeStringElement36;
            str20 = strDecodeStringElement44;
            str21 = strDecodeStringElement52;
            str22 = strDecodeStringElement33;
            str23 = strDecodeStringElement43;
            str24 = str32;
            String str34 = strDecodeStringElement46;
            str25 = strDecodeStringElement35;
            str26 = strDecodeStringElement53;
            str27 = strDecodeStringElement42;
            str28 = strDecodeStringElement49;
            str29 = str34;
            String str35 = strDecodeStringElement48;
            str30 = strDecodeStringElement47;
            str31 = str35;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SpotInstrument(i, i2, str7, str6, baseInstrument, str5, str2, str4, str3, str14, str26, str21, str17, z, str, str18, str13, str10, str28, str24, str22, str11, str25, str31, str30, str29, str9, str20, str23, str27, str8, str12, str16, str19, str15, list, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SpotInstrument spotInstrument) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(spotInstrument, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SpotInstrument.write$Self$OKTradeCore_trade_core(spotInstrument, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
