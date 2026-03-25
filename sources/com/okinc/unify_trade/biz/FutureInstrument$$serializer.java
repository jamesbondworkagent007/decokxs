package com.okinc.unify_trade.biz;

import com.engagelab.privates.push.constants.MTPushConstants;
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
public final /* synthetic */ class FutureInstrument$$serializer implements GeneratedSerializer<FutureInstrument> {
    public static final int $stable;
    public static final FutureInstrument$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FutureInstrument$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FutureInstrument$$serializer futureInstrument$$serializer = new FutureInstrument$$serializer();
        INSTANCE = futureInstrument$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.FutureInstrument", futureInstrument$$serializer, 39);
        pluginGeneratedSerialDescriptor.addElement("instId", false);
        pluginGeneratedSerialDescriptor.addElement("instType", false);
        pluginGeneratedSerialDescriptor.addElement("baseInfo", false);
        pluginGeneratedSerialDescriptor.addElement("uly", true);
        pluginGeneratedSerialDescriptor.addElement("instFly", true);
        pluginGeneratedSerialDescriptor.addElement("settleCcy", true);
        pluginGeneratedSerialDescriptor.addElement("ctVal", true);
        pluginGeneratedSerialDescriptor.addElement("ctMult", true);
        pluginGeneratedSerialDescriptor.addElement("ctValCcy", true);
        pluginGeneratedSerialDescriptor.addElement("listTime", true);
        pluginGeneratedSerialDescriptor.addElement("expTime", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.LEVEL, true);
        pluginGeneratedSerialDescriptor.addElement("enableFilter", true);
        pluginGeneratedSerialDescriptor.addElement("ctType", true);
        pluginGeneratedSerialDescriptor.addElement(MTPushConstants.Operation.KEY_ALIAS, true);
        pluginGeneratedSerialDescriptor.addElement("closeMaxThresholdRateWeek", true);
        pluginGeneratedSerialDescriptor.addElement("indexMaxThresholdRate", true);
        pluginGeneratedSerialDescriptor.addElement("tenMinsAfterContractGeneration", true);
        pluginGeneratedSerialDescriptor.addElement("withinTenMinsOfContractGeneration", true);
        pluginGeneratedSerialDescriptor.addElement("maxLmtSz", true);
        pluginGeneratedSerialDescriptor.addElement("maxMktSz", true);
        pluginGeneratedSerialDescriptor.addElement("maxLmtAmt", true);
        pluginGeneratedSerialDescriptor.addElement("maxMktAmt", true);
        pluginGeneratedSerialDescriptor.addElement("expiryDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("futureSettlement", true);
        pluginGeneratedSerialDescriptor.addElement("nextSettleTime", true);
        pluginGeneratedSerialDescriptor.addElement("userPositionMaxPercent", true);
        pluginGeneratedSerialDescriptor.addElement("userPositionMaxValueUSD", true);
        pluginGeneratedSerialDescriptor.addElement("platformSidePositionMaxValueUSD", true);
        pluginGeneratedSerialDescriptor.addElement("lpX1", true);
        pluginGeneratedSerialDescriptor.addElement("lpX2", true);
        pluginGeneratedSerialDescriptor.addElement("lpY1", true);
        pluginGeneratedSerialDescriptor.addElement("lpY2", true);
        pluginGeneratedSerialDescriptor.addElement("lpZ1", true);
        pluginGeneratedSerialDescriptor.addElement("lpZ2", true);
        pluginGeneratedSerialDescriptor.addElement("lpC1", true);
        pluginGeneratedSerialDescriptor.addElement("lpC2", true);
        pluginGeneratedSerialDescriptor.addElement("mIsPreMarket", true);
        pluginGeneratedSerialDescriptor.addElement("mIsRebase", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BaseInstrument$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FutureInstrument deserialize(@NotNull Decoder decoder) {
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
        boolean z;
        int i2;
        boolean zDecodeBooleanElement;
        boolean z2;
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
        boolean z3;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        char c;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 3;
        int i6 = 8;
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
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
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
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            String strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            String strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
            String strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
            String strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
            String strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
            String strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 37);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 38);
            str22 = strDecodeStringElement30;
            str18 = strDecodeStringElement29;
            str30 = strDecodeStringElement31;
            str14 = strDecodeStringElement32;
            str13 = strDecodeStringElement33;
            str12 = strDecodeStringElement34;
            z2 = zDecodeBooleanElement4;
            str7 = strDecodeStringElement7;
            str17 = strDecodeStringElement22;
            z3 = zDecodeBooleanElement3;
            str25 = strDecodeStringElement23;
            str21 = strDecodeStringElement24;
            str32 = strDecodeStringElement25;
            str34 = strDecodeStringElement26;
            str27 = strDecodeStringElement18;
            baseInstrument = baseInstrument2;
            str20 = strDecodeStringElement17;
            str19 = strDecodeStringElement16;
            str26 = strDecodeStringElement15;
            str28 = strDecodeStringElement14;
            str24 = strDecodeStringElement19;
            str3 = strDecodeStringElement8;
            str9 = strDecodeStringElement5;
            str8 = strDecodeStringElement6;
            str6 = strDecodeStringElement9;
            z = zDecodeBooleanElement2;
            i = -1;
            str5 = strDecodeStringElement3;
            str10 = strDecodeStringElement2;
            str31 = strDecodeStringElement28;
            str16 = strDecodeStringElement21;
            str23 = strDecodeStringElement13;
            str2 = strDecodeStringElement10;
            str11 = strDecodeStringElement;
            str = strDecodeStringElement11;
            i2 = 127;
            str33 = strDecodeStringElement27;
            str15 = strDecodeStringElement20;
            str29 = strDecodeStringElement12;
            str4 = strDecodeStringElement4;
        } else {
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
            String strDecodeStringElement63 = null;
            String strDecodeStringElement64 = null;
            String strDecodeStringElement65 = null;
            String strDecodeStringElement66 = null;
            String strDecodeStringElement67 = null;
            String str35 = null;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            int i7 = 0;
            boolean z4 = true;
            boolean zDecodeBooleanElement8 = false;
            i = 0;
            BaseInstrument baseInstrument3 = null;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        c = 2;
                        Unit unit = Unit.INSTANCE;
                        z4 = false;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 0:
                        c = 2;
                        String strDecodeStringElement68 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str35 = strDecodeStringElement68;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 1:
                        c = 2;
                        strDecodeStringElement67 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 2:
                        c = 2;
                        baseInstrument3 = (BaseInstrument) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BaseInstrument$$serializer.INSTANCE, baseInstrument3);
                        int i8 = i | 4;
                        Unit unit4 = Unit.INSTANCE;
                        i = i8;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 3:
                        strDecodeStringElement59 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 4:
                        strDecodeStringElement58 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        Unit unit6 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 5:
                        strDecodeStringElement66 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        Unit unit62 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 6:
                        strDecodeStringElement65 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        Unit unit622 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 7:
                        strDecodeStringElement64 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        Unit unit6222 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 8:
                        strDecodeStringElement57 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i |= 256;
                        Unit unit62222 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 9:
                        strDecodeStringElement63 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i |= 512;
                        Unit unit622222 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 10:
                        strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i |= 1024;
                        Unit unit6222222 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 11:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i |= 2048;
                        Unit unit62222222 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 12:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i |= 4096;
                        Unit unit622222222 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 13:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i |= 8192;
                        Unit unit7 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 14:
                        strDecodeStringElement62 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i |= 16384;
                        Unit unit8 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 15:
                        strDecodeStringElement61 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i |= 32768;
                        Unit unit9 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 16:
                        strDecodeStringElement60 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i |= 65536;
                        Unit unit10 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 17:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i |= 131072;
                        Unit unit11 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 18:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i |= 262144;
                        Unit unit12 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 19:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i |= 524288;
                        Unit unit13 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 20:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i3 = 1048576;
                        int i9 = i3 | i;
                        Unit unit14 = Unit.INSTANCE;
                        i = i9;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 21:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = 2097152;
                        int i92 = i3 | i;
                        Unit unit142 = Unit.INSTANCE;
                        i = i92;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 22:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i3 = 4194304;
                        int i922 = i3 | i;
                        Unit unit1422 = Unit.INSTANCE;
                        i = i922;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 23:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i3 = 8388608;
                        int i9222 = i3 | i;
                        Unit unit14222 = Unit.INSTANCE;
                        i = i9222;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 24:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
                        i |= 16777216;
                        Unit unit15 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 25:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i3 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        int i92222 = i3 | i;
                        Unit unit142222 = Unit.INSTANCE;
                        i = i92222;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 26:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i3 = 67108864;
                        int i922222 = i3 | i;
                        Unit unit1422222 = Unit.INSTANCE;
                        i = i922222;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 27:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i3 = 134217728;
                        int i9222222 = i3 | i;
                        Unit unit14222222 = Unit.INSTANCE;
                        i = i9222222;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 28:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i3 = 268435456;
                        int i92222222 = i3 | i;
                        Unit unit142222222 = Unit.INSTANCE;
                        i = i92222222;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 29:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i3 = 536870912;
                        int i922222222 = i3 | i;
                        Unit unit1422222222 = Unit.INSTANCE;
                        i = i922222222;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 30:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i3 = 1073741824;
                        int i9222222222 = i3 | i;
                        Unit unit14222222222 = Unit.INSTANCE;
                        i = i9222222222;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 31:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i3 = Integer.MIN_VALUE;
                        int i92222222222 = i3 | i;
                        Unit unit142222222222 = Unit.INSTANCE;
                        i = i92222222222;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 32:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
                        int i10 = i7 | 1;
                        Unit unit16 = Unit.INSTANCE;
                        i7 = i10;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 33:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
                        i4 = i7 | 2;
                        Unit unit17 = Unit.INSTANCE;
                        i7 = i4;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 34:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
                        i4 = i7 | 4;
                        Unit unit172 = Unit.INSTANCE;
                        i7 = i4;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 35:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
                        i4 = i7 | 8;
                        Unit unit1722 = Unit.INSTANCE;
                        i7 = i4;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 36:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
                        i4 = i7 | 16;
                        Unit unit17222 = Unit.INSTANCE;
                        i7 = i4;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 37:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 37);
                        i7 |= 32;
                        Unit unit152 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    case 38:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 38);
                        i7 |= 64;
                        Unit unit1522 = Unit.INSTANCE;
                        c = 2;
                        i5 = 3;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            baseInstrument = baseInstrument3;
            str = strDecodeStringElement55;
            str2 = strDecodeStringElement56;
            str3 = strDecodeStringElement57;
            str4 = strDecodeStringElement58;
            str5 = strDecodeStringElement59;
            str6 = strDecodeStringElement63;
            str7 = strDecodeStringElement64;
            str8 = strDecodeStringElement65;
            str9 = strDecodeStringElement66;
            str10 = strDecodeStringElement67;
            str11 = str35;
            z = zDecodeBooleanElement7;
            i2 = i7;
            zDecodeBooleanElement = zDecodeBooleanElement5;
            z2 = zDecodeBooleanElement8;
            str12 = strDecodeStringElement42;
            str13 = strDecodeStringElement43;
            str14 = strDecodeStringElement44;
            str15 = strDecodeStringElement52;
            str16 = strDecodeStringElement38;
            str17 = strDecodeStringElement39;
            str18 = strDecodeStringElement47;
            str19 = strDecodeStringElement53;
            str20 = strDecodeStringElement35;
            str21 = strDecodeStringElement41;
            str22 = strDecodeStringElement46;
            str23 = strDecodeStringElement62;
            str24 = strDecodeStringElement37;
            str25 = strDecodeStringElement40;
            str26 = strDecodeStringElement60;
            str27 = strDecodeStringElement36;
            str28 = strDecodeStringElement61;
            String str36 = strDecodeStringElement45;
            z3 = zDecodeBooleanElement6;
            str29 = strDecodeStringElement54;
            str30 = str36;
            String str37 = strDecodeStringElement51;
            str31 = strDecodeStringElement48;
            str32 = str37;
            String str38 = strDecodeStringElement50;
            str33 = strDecodeStringElement49;
            str34 = str38;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FutureInstrument(i, i2, str11, str10, baseInstrument, str5, str4, str9, str8, str7, str3, str6, str2, str, z, str29, str23, str28, str26, str19, str20, str27, str24, str15, str16, str17, z3, str25, str21, str32, str34, str33, str31, str18, str22, str30, str14, str13, str12, z2, zDecodeBooleanElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FutureInstrument futureInstrument) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(futureInstrument, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FutureInstrument.write$Self$OKTradeCore_trade_core(futureInstrument, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
