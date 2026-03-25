package com.okinc.unify_trade.biz;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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
public final /* synthetic */ class SwapInstrument$$serializer implements GeneratedSerializer<SwapInstrument> {
    public static final int $stable;
    public static final SwapInstrument$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SwapInstrument$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SwapInstrument$$serializer swapInstrument$$serializer = new SwapInstrument$$serializer();
        INSTANCE = swapInstrument$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.SwapInstrument", swapInstrument$$serializer, 35);
        pluginGeneratedSerialDescriptor.addElement("instId", false);
        pluginGeneratedSerialDescriptor.addElement("instType", false);
        pluginGeneratedSerialDescriptor.addElement("baseInfo", false);
        pluginGeneratedSerialDescriptor.addElement("uly", true);
        pluginGeneratedSerialDescriptor.addElement("instFly", true);
        pluginGeneratedSerialDescriptor.addElement("settleCcy", true);
        pluginGeneratedSerialDescriptor.addElement("ctVal", true);
        pluginGeneratedSerialDescriptor.addElement("ctMult", true);
        pluginGeneratedSerialDescriptor.addElement("ctValCcy", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.LEVEL, true);
        pluginGeneratedSerialDescriptor.addElement("enableFilter", true);
        pluginGeneratedSerialDescriptor.addElement("ctType", true);
        pluginGeneratedSerialDescriptor.addElement("indexMaxThresholdRate", true);
        pluginGeneratedSerialDescriptor.addElement("tenMinsAfterContractGeneration", true);
        pluginGeneratedSerialDescriptor.addElement("withinTenMinsOfContractGeneration", true);
        pluginGeneratedSerialDescriptor.addElement("maxLmtSz", true);
        pluginGeneratedSerialDescriptor.addElement("maxMktSz", true);
        pluginGeneratedSerialDescriptor.addElement("maxLmtAmt", true);
        pluginGeneratedSerialDescriptor.addElement("maxMktAmt", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("listTime", true);
        pluginGeneratedSerialDescriptor.addElement("userPositionMaxPercent", true);
        pluginGeneratedSerialDescriptor.addElement("userPositionMaxValueUSD", true);
        pluginGeneratedSerialDescriptor.addElement("platformSidePositionMaxValueUSD", true);
        pluginGeneratedSerialDescriptor.addElement("lpX1", true);
        pluginGeneratedSerialDescriptor.addElement("lpX2", true);
        pluginGeneratedSerialDescriptor.addElement("lpY1", true);
        pluginGeneratedSerialDescriptor.addElement("lpY2", true);
        pluginGeneratedSerialDescriptor.addElement("lpZ1", true);
        pluginGeneratedSerialDescriptor.addElement("lpZ2", true);
        pluginGeneratedSerialDescriptor.addElement("preQuote", true);
        pluginGeneratedSerialDescriptor.addElement("listStage", true);
        pluginGeneratedSerialDescriptor.addElement("ruleType", true);
        pluginGeneratedSerialDescriptor.addElement("mIsPreMarket", true);
        pluginGeneratedSerialDescriptor.addElement("mIsRebase", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BaseInstrument$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SwapInstrument deserialize(@NotNull Decoder decoder) {
        int i;
        BaseInstrument baseInstrument;
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
        boolean z;
        boolean zDecodeBooleanElement;
        boolean z2;
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
        int i2;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        char c;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 3;
        int i6 = 8;
        int i7 = 4;
        String str32 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            BaseInstrument baseInstrument2 = (BaseInstrument) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BaseInstrument$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            String strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            String strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 33);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 34);
            str15 = strDecodeStringElement31;
            str10 = strDecodeStringElement13;
            str26 = strDecodeStringElement27;
            str24 = strDecodeStringElement28;
            str16 = strDecodeStringElement29;
            str14 = strDecodeStringElement30;
            z2 = zDecodeBooleanElement3;
            str2 = strDecodeStringElement10;
            str8 = strDecodeStringElement6;
            str13 = strDecodeStringElement;
            str25 = strDecodeStringElement21;
            str27 = strDecodeStringElement22;
            str29 = strDecodeStringElement23;
            str31 = strDecodeStringElement24;
            str30 = strDecodeStringElement25;
            str17 = strDecodeStringElement18;
            str11 = strDecodeStringElement3;
            str6 = strDecodeStringElement11;
            str22 = strDecodeStringElement17;
            str21 = strDecodeStringElement16;
            str20 = strDecodeStringElement15;
            str18 = strDecodeStringElement19;
            i = -1;
            str4 = strDecodeStringElement8;
            str = strDecodeStringElement12;
            str9 = strDecodeStringElement5;
            str3 = strDecodeStringElement9;
            str7 = strDecodeStringElement7;
            str28 = strDecodeStringElement26;
            i2 = 7;
            str5 = strDecodeStringElement4;
            baseInstrument = baseInstrument2;
            str19 = strDecodeStringElement20;
            str23 = strDecodeStringElement14;
            z = zDecodeBooleanElement2;
            str12 = strDecodeStringElement2;
        } else {
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            int i8 = 0;
            boolean z3 = true;
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
            String strDecodeStringElement59 = null;
            String strDecodeStringElement60 = null;
            String str33 = null;
            i = 0;
            BaseInstrument baseInstrument3 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        c = 2;
                        Unit unit = Unit.INSTANCE;
                        z3 = false;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 0:
                        c = 2;
                        String strDecodeStringElement61 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str33 = strDecodeStringElement61;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 1:
                        c = 2;
                        strDecodeStringElement60 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 2:
                        c = 2;
                        baseInstrument3 = (BaseInstrument) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BaseInstrument$$serializer.INSTANCE, baseInstrument3);
                        int i9 = i | 4;
                        Unit unit4 = Unit.INSTANCE;
                        i = i9;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 3:
                        strDecodeStringElement59 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 4:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i7);
                        i |= 16;
                        Unit unit6 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 5:
                        strDecodeStringElement57 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        Unit unit62 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 6:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        Unit unit622 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 7:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        Unit unit6222 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 8:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i |= 256;
                        Unit unit7 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 9:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i |= 512;
                        Unit unit72 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 10:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i |= 1024;
                        Unit unit722 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 11:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i |= 2048;
                        Unit unit7222 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 12:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i |= 4096;
                        Unit unit72222 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 13:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i |= 8192;
                        Unit unit8 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 14:
                        strDecodeStringElement58 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i |= 16384;
                        Unit unit9 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 15:
                        strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i |= 32768;
                        Unit unit10 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 16:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i |= 65536;
                        Unit unit11 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 17:
                        String strDecodeStringElement62 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i |= 131072;
                        Unit unit12 = Unit.INSTANCE;
                        c = 2;
                        str32 = strDecodeStringElement62;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 18:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i |= 262144;
                        Unit unit13 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 19:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i |= 524288;
                        Unit unit14 = Unit.INSTANCE;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 20:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i3 = 1048576;
                        int i10 = i3 | i;
                        Unit unit15 = Unit.INSTANCE;
                        i = i10;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 21:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = 2097152;
                        int i102 = i3 | i;
                        Unit unit152 = Unit.INSTANCE;
                        i = i102;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 22:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i3 = 4194304;
                        int i1022 = i3 | i;
                        Unit unit1522 = Unit.INSTANCE;
                        i = i1022;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 23:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i3 = 8388608;
                        int i10222 = i3 | i;
                        Unit unit15222 = Unit.INSTANCE;
                        i = i10222;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 24:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i3 = 16777216;
                        int i102222 = i3 | i;
                        Unit unit152222 = Unit.INSTANCE;
                        i = i102222;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 25:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i3 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        int i1022222 = i3 | i;
                        Unit unit1522222 = Unit.INSTANCE;
                        i = i1022222;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 26:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i3 = 67108864;
                        int i10222222 = i3 | i;
                        Unit unit15222222 = Unit.INSTANCE;
                        i = i10222222;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 27:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i3 = 134217728;
                        int i102222222 = i3 | i;
                        Unit unit152222222 = Unit.INSTANCE;
                        i = i102222222;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 28:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i3 = 268435456;
                        int i1022222222 = i3 | i;
                        Unit unit1522222222 = Unit.INSTANCE;
                        i = i1022222222;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 29:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i3 = 536870912;
                        int i10222222222 = i3 | i;
                        Unit unit15222222222 = Unit.INSTANCE;
                        i = i10222222222;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 30:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i3 = 1073741824;
                        int i102222222222 = i3 | i;
                        Unit unit152222222222 = Unit.INSTANCE;
                        i = i102222222222;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 31:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i3 = Integer.MIN_VALUE;
                        int i1022222222222 = i3 | i;
                        Unit unit1522222222222 = Unit.INSTANCE;
                        i = i1022222222222;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 32:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
                        int i11 = i8 | 1;
                        Unit unit16 = Unit.INSTANCE;
                        i8 = i11;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 33:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 33);
                        i4 = i8 | 2;
                        Unit unit17 = Unit.INSTANCE;
                        i8 = i4;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    case 34:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 34);
                        i4 = i8 | 4;
                        Unit unit172 = Unit.INSTANCE;
                        i8 = i4;
                        c = 2;
                        i7 = 4;
                        i6 = 8;
                        i5 = 3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            baseInstrument = baseInstrument3;
            str = strDecodeStringElement47;
            str2 = strDecodeStringElement48;
            str3 = strDecodeStringElement49;
            str4 = strDecodeStringElement50;
            str5 = strDecodeStringElement51;
            str6 = strDecodeStringElement52;
            str7 = strDecodeStringElement53;
            str8 = strDecodeStringElement55;
            str9 = strDecodeStringElement57;
            str10 = strDecodeStringElement58;
            str11 = strDecodeStringElement59;
            str12 = strDecodeStringElement60;
            str13 = str33;
            z = zDecodeBooleanElement6;
            zDecodeBooleanElement = zDecodeBooleanElement4;
            z2 = zDecodeBooleanElement5;
            str14 = strDecodeStringElement36;
            str15 = strDecodeStringElement37;
            str16 = strDecodeStringElement38;
            str17 = strDecodeStringElement33;
            str18 = strDecodeStringElement34;
            str19 = strDecodeStringElement35;
            str20 = strDecodeStringElement54;
            str21 = str32;
            str22 = strDecodeStringElement32;
            str23 = strDecodeStringElement56;
            i2 = i8;
            String str34 = strDecodeStringElement46;
            str24 = strDecodeStringElement39;
            str25 = str34;
            String str35 = strDecodeStringElement45;
            str26 = strDecodeStringElement40;
            str27 = str35;
            String str36 = strDecodeStringElement44;
            str28 = strDecodeStringElement41;
            str29 = str36;
            String str37 = strDecodeStringElement43;
            str30 = strDecodeStringElement42;
            str31 = str37;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SwapInstrument(i, i2, str13, str12, baseInstrument, str11, str5, str9, str8, str7, str4, str3, z, str2, str6, str, str10, str23, str20, str21, str22, str17, str18, str19, str25, str27, str29, str31, str30, str28, str26, str24, str16, str14, str15, z2, zDecodeBooleanElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SwapInstrument swapInstrument) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(swapInstrument, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SwapInstrument.write$Self$OKTradeCore_trade_core(swapInstrument, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
