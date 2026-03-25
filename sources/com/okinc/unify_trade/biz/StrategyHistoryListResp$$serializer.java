package com.okinc.unify_trade.biz;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.p2p.api.OtcExtraKeys;
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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class StrategyHistoryListResp$$serializer implements GeneratedSerializer<StrategyHistoryListResp> {
    public static final int $stable;
    public static final StrategyHistoryListResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private StrategyHistoryListResp$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        StrategyHistoryListResp$$serializer strategyHistoryListResp$$serializer = new StrategyHistoryListResp$$serializer();
        INSTANCE = strategyHistoryListResp$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.StrategyHistoryListResp", strategyHistoryListResp$$serializer, 47);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement("uly", true);
        pluginGeneratedSerialDescriptor.addElement("ccy", true);
        pluginGeneratedSerialDescriptor.addElement("ctVal", true);
        pluginGeneratedSerialDescriptor.addElement("ordId", true);
        pluginGeneratedSerialDescriptor.addElement("algoId", true);
        pluginGeneratedSerialDescriptor.addElement("ordType", true);
        pluginGeneratedSerialDescriptor.addElement("tdMode", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE, true);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("triggerTime", true);
        pluginGeneratedSerialDescriptor.addElement("cTime", true);
        pluginGeneratedSerialDescriptor.addElement("pxVar", true);
        pluginGeneratedSerialDescriptor.addElement("pxSpread", true);
        pluginGeneratedSerialDescriptor.addElement("szLimit", true);
        pluginGeneratedSerialDescriptor.addElement("pxLimit", true);
        pluginGeneratedSerialDescriptor.addElement("actualSz", true);
        pluginGeneratedSerialDescriptor.addElement("sz", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.SIDE, true);
        pluginGeneratedSerialDescriptor.addElement("posSide", true);
        pluginGeneratedSerialDescriptor.addElement("timeInterval", true);
        pluginGeneratedSerialDescriptor.addElement("maxPx", true);
        pluginGeneratedSerialDescriptor.addElement("minPx", true);
        pluginGeneratedSerialDescriptor.addElement("gridNum", true);
        pluginGeneratedSerialDescriptor.addElement("runType", true);
        pluginGeneratedSerialDescriptor.addElement("quoteSz", true);
        pluginGeneratedSerialDescriptor.addElement("baseSz", true);
        pluginGeneratedSerialDescriptor.addElement("tpTriggerPx", true);
        pluginGeneratedSerialDescriptor.addElement("slTriggerPx", true);
        pluginGeneratedSerialDescriptor.addElement("tpOrderPx", true);
        pluginGeneratedSerialDescriptor.addElement("slOrderPx", true);
        pluginGeneratedSerialDescriptor.addElement("tradeNum", true);
        pluginGeneratedSerialDescriptor.addElement("totalPnl", true);
        pluginGeneratedSerialDescriptor.addElement("pnlRatio", true);
        pluginGeneratedSerialDescriptor.addElement("investment", true);
        pluginGeneratedSerialDescriptor.addElement("cancelType", true);
        pluginGeneratedSerialDescriptor.addElement("stopResult", true);
        pluginGeneratedSerialDescriptor.addElement("profitNum", true);
        pluginGeneratedSerialDescriptor.addElement("arbitrageNum", true);
        pluginGeneratedSerialDescriptor.addElement("triggerType", false);
        pluginGeneratedSerialDescriptor.addElement("maxSafetyOrds", false);
        pluginGeneratedSerialDescriptor.addElement("fillSafetyOrds", false);
        pluginGeneratedSerialDescriptor.addElement("avgPx", false);
        pluginGeneratedSerialDescriptor.addElement("tpPx", false);
        pluginGeneratedSerialDescriptor.addElement("slPx", false);
        pluginGeneratedSerialDescriptor.addElement("completedCycles", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final StrategyHistoryListResp deserialize(@NotNull Decoder decoder) {
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
        int i2;
        String strDecodeStringElement;
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
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 3;
        int i5 = 0;
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
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            String strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            String strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            String strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            String strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            String strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
            String strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
            String strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
            String strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
            String strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
            String strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 37);
            String strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 38);
            String strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 39);
            String strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 40);
            String strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 41);
            String strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 42);
            String strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 43);
            String strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 44);
            String strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 45);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 46);
            str18 = strDecodeStringElement42;
            str22 = strDecodeStringElement43;
            str17 = strDecodeStringElement44;
            str39 = strDecodeStringElement45;
            str33 = strDecodeStringElement46;
            str14 = strDecodeStringElement47;
            str26 = strDecodeStringElement34;
            str31 = strDecodeStringElement35;
            str37 = strDecodeStringElement36;
            str21 = strDecodeStringElement37;
            str27 = strDecodeStringElement38;
            str23 = strDecodeStringElement39;
            str12 = strDecodeStringElement9;
            str24 = strDecodeStringElement27;
            str28 = strDecodeStringElement28;
            str44 = strDecodeStringElement29;
            str46 = strDecodeStringElement30;
            str45 = strDecodeStringElement31;
            str40 = strDecodeStringElement21;
            str2 = strDecodeStringElement5;
            str34 = strDecodeStringElement20;
            str20 = strDecodeStringElement22;
            str25 = strDecodeStringElement23;
            str19 = strDecodeStringElement24;
            str13 = strDecodeStringElement8;
            str29 = strDecodeStringElement15;
            str38 = strDecodeStringElement17;
            str32 = strDecodeStringElement16;
            str3 = strDecodeStringElement6;
            str7 = strDecodeStringElement7;
            str9 = strDecodeStringElement13;
            str10 = strDecodeStringElement12;
            str = strDecodeStringElement2;
            i2 = -1;
            str6 = strDecodeStringElement3;
            str8 = strDecodeStringElement14;
            str35 = strDecodeStringElement41;
            i = 32767;
            str30 = strDecodeStringElement33;
            str41 = strDecodeStringElement40;
            str42 = strDecodeStringElement26;
            str43 = strDecodeStringElement32;
            str15 = strDecodeStringElement19;
            str36 = strDecodeStringElement25;
            str4 = strDecodeStringElement10;
            str16 = strDecodeStringElement18;
            str11 = strDecodeStringElement11;
            str5 = strDecodeStringElement4;
        } else {
            String strDecodeStringElement48 = null;
            String str47 = null;
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
            String strDecodeStringElement68 = null;
            String strDecodeStringElement69 = null;
            String strDecodeStringElement70 = null;
            String strDecodeStringElement71 = null;
            String strDecodeStringElement72 = null;
            String strDecodeStringElement73 = null;
            String str48 = null;
            String str49 = null;
            String strDecodeStringElement74 = null;
            String str50 = null;
            String str51 = null;
            String str52 = null;
            String strDecodeStringElement75 = null;
            String strDecodeStringElement76 = null;
            String strDecodeStringElement77 = null;
            String strDecodeStringElement78 = null;
            String strDecodeStringElement79 = null;
            String str53 = null;
            String strDecodeStringElement80 = null;
            String strDecodeStringElement81 = null;
            String strDecodeStringElement82 = null;
            String strDecodeStringElement83 = null;
            String strDecodeStringElement84 = null;
            String strDecodeStringElement85 = null;
            String strDecodeStringElement86 = null;
            String strDecodeStringElement87 = null;
            boolean z = true;
            int i6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z = false;
                        i4 = 3;
                        break;
                    case 0:
                        strDecodeStringElement75 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 1:
                        String strDecodeStringElement88 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        str53 = strDecodeStringElement88;
                        i4 = 3;
                        break;
                    case 2:
                        strDecodeStringElement79 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 3:
                        strDecodeStringElement76 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i6 |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 4:
                        strDecodeStringElement77 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        Unit unit52 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 5:
                        strDecodeStringElement80 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        Unit unit522 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 6:
                        strDecodeStringElement86 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i6 |= 64;
                        Unit unit5222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 7:
                        strDecodeStringElement85 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i6 |= 128;
                        Unit unit52222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 8:
                        strDecodeStringElement78 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i6 |= 256;
                        Unit unit522222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 9:
                        strDecodeStringElement84 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i6 |= 512;
                        Unit unit5222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 10:
                        strDecodeStringElement83 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i6 |= 1024;
                        Unit unit52222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 11:
                        strDecodeStringElement82 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i6 |= 2048;
                        Unit unit522222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 12:
                        strDecodeStringElement81 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i6 |= 4096;
                        Unit unit5222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 13:
                        strDecodeStringElement87 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i6 |= 8192;
                        Unit unit52222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 14:
                        String strDecodeStringElement89 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i6 |= 16384;
                        Unit unit6 = Unit.INSTANCE;
                        str52 = strDecodeStringElement89;
                        i4 = 3;
                        break;
                    case 15:
                        String strDecodeStringElement90 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i6 |= 32768;
                        Unit unit7 = Unit.INSTANCE;
                        str51 = strDecodeStringElement90;
                        i4 = 3;
                        break;
                    case 16:
                        String strDecodeStringElement91 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i6 |= 65536;
                        Unit unit8 = Unit.INSTANCE;
                        str50 = strDecodeStringElement91;
                        i4 = 3;
                        break;
                    case 17:
                        String strDecodeStringElement92 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i6 |= 131072;
                        Unit unit9 = Unit.INSTANCE;
                        str49 = strDecodeStringElement92;
                        i4 = 3;
                        break;
                    case 18:
                        String strDecodeStringElement93 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i6 |= 262144;
                        Unit unit10 = Unit.INSTANCE;
                        str48 = strDecodeStringElement93;
                        i4 = 3;
                        break;
                    case 19:
                        strDecodeStringElement73 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i6 |= 524288;
                        Unit unit11 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 20:
                        strDecodeStringElement72 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i3 = 1048576;
                        i6 |= i3;
                        Unit unit12 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 21:
                        strDecodeStringElement71 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = 2097152;
                        i6 |= i3;
                        Unit unit122 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 22:
                        strDecodeStringElement70 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i3 = 4194304;
                        i6 |= i3;
                        Unit unit1222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 23:
                        strDecodeStringElement69 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i3 = 8388608;
                        i6 |= i3;
                        Unit unit12222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 24:
                        strDecodeStringElement68 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i3 = 16777216;
                        i6 |= i3;
                        Unit unit122222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 25:
                        strDecodeStringElement67 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i3 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i6 |= i3;
                        Unit unit1222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 26:
                        strDecodeStringElement66 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i3 = 67108864;
                        i6 |= i3;
                        Unit unit12222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 27:
                        strDecodeStringElement65 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i3 = 134217728;
                        i6 |= i3;
                        Unit unit122222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 28:
                        strDecodeStringElement64 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i3 = 268435456;
                        i6 |= i3;
                        Unit unit1222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 29:
                        strDecodeStringElement63 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i3 = 536870912;
                        i6 |= i3;
                        Unit unit12222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 30:
                        strDecodeStringElement62 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i3 = 1073741824;
                        i6 |= i3;
                        Unit unit122222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 31:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i3 = Integer.MIN_VALUE;
                        i6 |= i3;
                        Unit unit1222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 32:
                        String strDecodeStringElement94 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
                        i5 |= 1;
                        Unit unit13 = Unit.INSTANCE;
                        str47 = strDecodeStringElement94;
                        i4 = 3;
                        break;
                    case 33:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
                        i5 |= 2;
                        Unit unit12222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 34:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
                        i5 |= 4;
                        Unit unit122222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 35:
                        strDecodeStringElement74 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
                        i5 |= 8;
                        Unit unit1222222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 36:
                        strDecodeStringElement61 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
                        i5 |= 16;
                        Unit unit12222222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 37:
                        strDecodeStringElement60 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 37);
                        i5 |= 32;
                        Unit unit122222222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 38:
                        strDecodeStringElement59 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 38);
                        i5 |= 64;
                        Unit unit1222222222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 39:
                        strDecodeStringElement58 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 39);
                        i5 |= 128;
                        Unit unit12222222222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 40:
                        strDecodeStringElement57 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 40);
                        i5 |= 256;
                        Unit unit122222222222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 41:
                        strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 41);
                        i5 |= 512;
                        Unit unit1222222222222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 42:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 42);
                        i5 |= 1024;
                        Unit unit12222222222222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 43:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 43);
                        i5 |= 2048;
                        Unit unit122222222222222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 44:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 44);
                        i5 |= 4096;
                        Unit unit1222222222222222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 45:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 45);
                        i5 |= 8192;
                        Unit unit12222222222222222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    case 46:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 46);
                        i5 |= 16384;
                        Unit unit122222222222222222222222222 = Unit.INSTANCE;
                        i4 = 3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            str = strDecodeStringElement75;
            str2 = strDecodeStringElement76;
            str3 = strDecodeStringElement77;
            str4 = strDecodeStringElement78;
            str5 = strDecodeStringElement79;
            str6 = str53;
            str7 = strDecodeStringElement80;
            str8 = strDecodeStringElement81;
            str9 = strDecodeStringElement82;
            str10 = strDecodeStringElement83;
            str11 = strDecodeStringElement84;
            str12 = strDecodeStringElement85;
            str13 = strDecodeStringElement86;
            i2 = i6;
            strDecodeStringElement = strDecodeStringElement51;
            str14 = strDecodeStringElement52;
            str15 = str49;
            str16 = str50;
            str17 = strDecodeStringElement55;
            str18 = strDecodeStringElement57;
            str19 = strDecodeStringElement70;
            str20 = strDecodeStringElement72;
            str21 = strDecodeStringElement74;
            str22 = strDecodeStringElement56;
            str23 = strDecodeStringElement60;
            str24 = strDecodeStringElement67;
            str25 = strDecodeStringElement71;
            str26 = str47;
            str27 = strDecodeStringElement61;
            str28 = strDecodeStringElement66;
            str29 = strDecodeStringElement87;
            str30 = strDecodeStringElement48;
            String str54 = strDecodeStringElement68;
            str31 = strDecodeStringElement49;
            str32 = str52;
            str33 = strDecodeStringElement53;
            str34 = str48;
            str35 = strDecodeStringElement58;
            str36 = strDecodeStringElement69;
            str37 = strDecodeStringElement50;
            str38 = str51;
            str39 = strDecodeStringElement54;
            str40 = strDecodeStringElement73;
            str41 = strDecodeStringElement59;
            str42 = str54;
            String str55 = strDecodeStringElement65;
            str43 = strDecodeStringElement62;
            str44 = str55;
            String str56 = strDecodeStringElement64;
            str45 = strDecodeStringElement63;
            str46 = str56;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StrategyHistoryListResp(i2, i, str, str6, str5, str2, str3, str7, str13, str12, str4, str11, str10, str9, str8, str29, str32, str38, str16, str15, str34, str40, str20, str25, str19, str36, str42, str24, str28, str44, str46, str45, str43, str30, str26, str31, str37, str21, str27, str23, str41, str35, str18, str22, str17, str39, str33, str14, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull StrategyHistoryListResp strategyHistoryListResp) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(strategyHistoryListResp, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StrategyHistoryListResp.write$Self$OKTradeCore_trade_core(strategyHistoryListResp, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
