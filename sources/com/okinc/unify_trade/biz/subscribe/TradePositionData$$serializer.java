package com.okinc.unify_trade.biz.subscribe;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class TradePositionData$$serializer implements GeneratedSerializer<TradePositionData> {
    public static final int $stable;
    public static final TradePositionData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TradePositionData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TradePositionData$$serializer tradePositionData$$serializer = new TradePositionData$$serializer();
        INSTANCE = tradePositionData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.subscribe.TradePositionData", tradePositionData$$serializer, 64);
        pluginGeneratedSerialDescriptor.addElement("posId", true);
        pluginGeneratedSerialDescriptor.addElement("adl", true);
        pluginGeneratedSerialDescriptor.addElement("availPos", true);
        pluginGeneratedSerialDescriptor.addElement("avgPx", true);
        pluginGeneratedSerialDescriptor.addElement("ccy", true);
        pluginGeneratedSerialDescriptor.addElement("cTime", true);
        pluginGeneratedSerialDescriptor.addElement("tradeId", true);
        pluginGeneratedSerialDescriptor.addElement("imr", true);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("interest", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE, true);
        pluginGeneratedSerialDescriptor.addElement("liab", true);
        pluginGeneratedSerialDescriptor.addElement("liabCcy", true);
        pluginGeneratedSerialDescriptor.addElement("liqPx", true);
        pluginGeneratedSerialDescriptor.addElement("margin", true);
        pluginGeneratedSerialDescriptor.addElement("mgnMode", true);
        pluginGeneratedSerialDescriptor.addElement("mgnRatio", true);
        pluginGeneratedSerialDescriptor.addElement("mmr", true);
        pluginGeneratedSerialDescriptor.addElement("optVal", true);
        pluginGeneratedSerialDescriptor.addElement("posSide", true);
        pluginGeneratedSerialDescriptor.addElement("pos", true);
        pluginGeneratedSerialDescriptor.addElement("posCcy", true);
        pluginGeneratedSerialDescriptor.addElement("upl", true);
        pluginGeneratedSerialDescriptor.addElement("uplRatio", true);
        pluginGeneratedSerialDescriptor.addElement("uplLastPx", true);
        pluginGeneratedSerialDescriptor.addElement("uplRatioLastPx", true);
        pluginGeneratedSerialDescriptor.addElement("last", true);
        pluginGeneratedSerialDescriptor.addElement("uTime", true);
        pluginGeneratedSerialDescriptor.addElement("posUserInfo", true);
        pluginGeneratedSerialDescriptor.addElement("notionalUsd", true);
        pluginGeneratedSerialDescriptor.addElement("usdPx", true);
        pluginGeneratedSerialDescriptor.addElement("markPx", true);
        pluginGeneratedSerialDescriptor.addElement("baseBal", true);
        pluginGeneratedSerialDescriptor.addElement("quoteBal", true);
        pluginGeneratedSerialDescriptor.addElement("closeOrderAlgo", true);
        pluginGeneratedSerialDescriptor.addElement("baseBorrowed", true);
        pluginGeneratedSerialDescriptor.addElement("baseInterest", true);
        pluginGeneratedSerialDescriptor.addElement("quoteBorrowed", true);
        pluginGeneratedSerialDescriptor.addElement("quoteInterest", true);
        pluginGeneratedSerialDescriptor.addElement("spotInUseAmt", true);
        pluginGeneratedSerialDescriptor.addElement("spotInUseCcy", true);
        pluginGeneratedSerialDescriptor.addElement("pendingCloseOrdLiabVal", true);
        pluginGeneratedSerialDescriptor.addElement("bizRefId", true);
        pluginGeneratedSerialDescriptor.addElement("bizRefType", true);
        pluginGeneratedSerialDescriptor.addElement("riskUnitCcy", true);
        pluginGeneratedSerialDescriptor.addElement("instFamily", true);
        pluginGeneratedSerialDescriptor.addElement("uly", true);
        pluginGeneratedSerialDescriptor.addElement("realizedPnl", true);
        pluginGeneratedSerialDescriptor.addElement("pnl", true);
        pluginGeneratedSerialDescriptor.addElement("fee", true);
        pluginGeneratedSerialDescriptor.addElement("fundingFee", true);
        pluginGeneratedSerialDescriptor.addElement("liqPenalty", true);
        pluginGeneratedSerialDescriptor.addElement("bestSlTriggerPx", true);
        pluginGeneratedSerialDescriptor.addElement("bestTpTriggerPx", true);
        pluginGeneratedSerialDescriptor.addElement("posRelationAlgoOrdCount", true);
        pluginGeneratedSerialDescriptor.addElement("bePx", true);
        pluginGeneratedSerialDescriptor.addElement("nonSettleAvgPx", true);
        pluginGeneratedSerialDescriptor.addElement("settledPnl", true);
        pluginGeneratedSerialDescriptor.addElement("hedgedPos", true);
        pluginGeneratedSerialDescriptor.addElement("deltaBS", true);
        pluginGeneratedSerialDescriptor.addElement("deltaPA", true);
        pluginGeneratedSerialDescriptor.addElement("thetaBS", true);
        pluginGeneratedSerialDescriptor.addElement("thetaPA", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = TradePositionData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(TradeUserPositionInfo$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[35]), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TradePositionData deserialize(@NotNull Decoder decoder) {
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
        String str17;
        String str18;
        String str19;
        String str20;
        int i;
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
        TradeUserPositionInfo tradeUserPositionInfo;
        String str31;
        String str32;
        int i2;
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
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        String strDecodeStringElement;
        String str55;
        String str56;
        String str57;
        String str58;
        List list;
        String str59;
        String str60;
        String str61;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TradePositionData.$childSerializers;
        int i5 = 10;
        int i6 = 9;
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
            TradeUserPositionInfo tradeUserPositionInfo2 = (TradeUserPositionInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 29, TradeUserPositionInfo$$serializer.INSTANCE, null);
            String strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str62 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 31, stringSerializer, null);
            String strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
            String strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
            String strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 35, kSerializerArr[35], null);
            String strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
            String strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 37);
            String strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 38);
            String strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 39);
            String strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 40);
            String strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 41);
            String strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 42);
            String strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 43);
            String strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 44);
            String strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 45);
            String strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 46);
            String strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 47);
            String strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 48);
            String strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 49);
            String strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 50);
            String strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 51);
            String strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 52);
            String str63 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 53, stringSerializer, null);
            String str64 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 54, stringSerializer, null);
            String str65 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 55, stringSerializer, null);
            String strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 56);
            String strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 57);
            String strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 58);
            String strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 59);
            String strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 60);
            String strDecodeStringElement57 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 61);
            String strDecodeStringElement58 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 62);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 63);
            str24 = strDecodeStringElement52;
            str53 = strDecodeStringElement53;
            str23 = strDecodeStringElement54;
            str20 = strDecodeStringElement55;
            str34 = strDecodeStringElement56;
            str22 = strDecodeStringElement57;
            str21 = strDecodeStringElement58;
            i = -1;
            str19 = str63;
            str56 = strDecodeStringElement49;
            str58 = strDecodeStringElement50;
            str47 = strDecodeStringElement51;
            str31 = str64;
            str30 = strDecodeStringElement17;
            str41 = strDecodeStringElement43;
            str = strDecodeStringElement44;
            str49 = strDecodeStringElement45;
            str25 = strDecodeStringElement47;
            str3 = strDecodeStringElement12;
            str33 = strDecodeStringElement37;
            str50 = strDecodeStringElement38;
            str43 = strDecodeStringElement39;
            str60 = strDecodeStringElement41;
            str18 = strDecodeStringElement3;
            str37 = strDecodeStringElement35;
            str5 = strDecodeStringElement32;
            str2 = strDecodeStringElement33;
            str48 = strDecodeStringElement34;
            str26 = strDecodeStringElement46;
            str13 = strDecodeStringElement9;
            str38 = strDecodeStringElement5;
            tradeUserPositionInfo = tradeUserPositionInfo2;
            str54 = strDecodeStringElement31;
            str61 = strDecodeStringElement40;
            str57 = strDecodeStringElement27;
            str28 = strDecodeStringElement29;
            str39 = strDecodeStringElement30;
            list = list2;
            str32 = str62;
            str42 = strDecodeStringElement23;
            str44 = strDecodeStringElement25;
            str15 = strDecodeStringElement26;
            str12 = strDecodeStringElement10;
            str6 = strDecodeStringElement19;
            str45 = strDecodeStringElement21;
            str52 = strDecodeStringElement22;
            str55 = strDecodeStringElement28;
            str14 = strDecodeStringElement8;
            str7 = strDecodeStringElement18;
            str8 = strDecodeStringElement16;
            str51 = strDecodeStringElement24;
            str40 = str65;
            str16 = strDecodeStringElement20;
            str29 = strDecodeStringElement6;
            str4 = strDecodeStringElement11;
            str11 = strDecodeStringElement13;
            str35 = strDecodeStringElement48;
            str17 = strDecodeStringElement4;
            str59 = strDecodeStringElement7;
            str36 = strDecodeStringElement42;
            i2 = -1;
            str27 = strDecodeStringElement36;
            str10 = strDecodeStringElement14;
            str46 = strDecodeStringElement2;
            str9 = strDecodeStringElement15;
        } else {
            String str66 = null;
            int i7 = 0;
            int i8 = 0;
            TradeUserPositionInfo tradeUserPositionInfo3 = null;
            String str67 = null;
            String str68 = null;
            String str69 = null;
            String str70 = null;
            List list3 = null;
            String str71 = null;
            String str72 = null;
            String str73 = null;
            String str74 = null;
            String str75 = null;
            String str76 = null;
            String str77 = null;
            String str78 = null;
            String str79 = null;
            String str80 = null;
            String str81 = null;
            String str82 = null;
            String str83 = null;
            String str84 = null;
            String str85 = null;
            String str86 = null;
            String str87 = null;
            String str88 = null;
            String str89 = null;
            String str90 = null;
            String str91 = null;
            String str92 = null;
            String str93 = null;
            String str94 = null;
            String str95 = null;
            String str96 = null;
            String str97 = null;
            String strDecodeStringElement59 = null;
            String str98 = null;
            String str99 = null;
            String str100 = null;
            String str101 = null;
            String strDecodeStringElement60 = null;
            String strDecodeStringElement61 = null;
            String strDecodeStringElement62 = null;
            String str102 = null;
            String str103 = null;
            String strDecodeStringElement63 = null;
            String strDecodeStringElement64 = null;
            String strDecodeStringElement65 = null;
            String strDecodeStringElement66 = null;
            String strDecodeStringElement67 = null;
            String str104 = null;
            String strDecodeStringElement68 = null;
            String str105 = null;
            String strDecodeStringElement69 = null;
            String strDecodeStringElement70 = null;
            String strDecodeStringElement71 = null;
            String strDecodeStringElement72 = null;
            String strDecodeStringElement73 = null;
            String str106 = null;
            String str107 = null;
            String str108 = null;
            String strDecodeStringElement74 = null;
            String str109 = null;
            String str110 = null;
            boolean z = true;
            String str111 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z = false;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 0:
                        String strDecodeStringElement75 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str110 = strDecodeStringElement75;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 1:
                        String strDecodeStringElement76 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        str109 = strDecodeStringElement76;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 2:
                        strDecodeStringElement74 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 3:
                        strDecodeStringElement62 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i7 |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 4:
                        strDecodeStringElement61 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        Unit unit6 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 5:
                        strDecodeStringElement73 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 |= 32;
                        Unit unit62 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 6:
                        strDecodeStringElement72 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i7 |= 64;
                        Unit unit622 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 7:
                        strDecodeStringElement71 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i7 |= 128;
                        Unit unit6222 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 8:
                        strDecodeStringElement70 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i7 |= 256;
                        Unit unit62222 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 9:
                        strDecodeStringElement60 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i7 |= 512;
                        Unit unit622222 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 10:
                        strDecodeStringElement59 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i7 |= 1024;
                        Unit unit7 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 11:
                        strDecodeStringElement69 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i7 |= 2048;
                        Unit unit72 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 12:
                        strDecodeStringElement68 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i7 |= 4096;
                        Unit unit8 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 13:
                        strDecodeStringElement67 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i7 |= 8192;
                        Unit unit82 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 14:
                        strDecodeStringElement66 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i7 |= 16384;
                        Unit unit822 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 15:
                        strDecodeStringElement65 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i3 = 32768;
                        i7 |= i3;
                        Unit unit8222 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 16:
                        strDecodeStringElement64 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i3 = 65536;
                        i7 |= i3;
                        Unit unit82222 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 17:
                        strDecodeStringElement63 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i3 = 131072;
                        i7 |= i3;
                        Unit unit822222 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 18:
                        String strDecodeStringElement77 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i7 |= 262144;
                        Unit unit9 = Unit.INSTANCE;
                        str108 = strDecodeStringElement77;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 19:
                        String strDecodeStringElement78 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i7 |= 524288;
                        Unit unit10 = Unit.INSTANCE;
                        str107 = strDecodeStringElement78;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 20:
                        String strDecodeStringElement79 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i7 |= 1048576;
                        Unit unit11 = Unit.INSTANCE;
                        str103 = strDecodeStringElement79;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 21:
                        String strDecodeStringElement80 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i7 |= 2097152;
                        Unit unit12 = Unit.INSTANCE;
                        str72 = strDecodeStringElement80;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 22:
                        String strDecodeStringElement81 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i7 |= 4194304;
                        Unit unit13 = Unit.INSTANCE;
                        str73 = strDecodeStringElement81;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 23:
                        String strDecodeStringElement82 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i7 |= 8388608;
                        Unit unit14 = Unit.INSTANCE;
                        str101 = strDecodeStringElement82;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 24:
                        String strDecodeStringElement83 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i7 |= 16777216;
                        Unit unit15 = Unit.INSTANCE;
                        str106 = strDecodeStringElement83;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 25:
                        String strDecodeStringElement84 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i7 |= MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        Unit unit16 = Unit.INSTANCE;
                        str100 = strDecodeStringElement84;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 26:
                        String strDecodeStringElement85 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i7 |= 67108864;
                        Unit unit17 = Unit.INSTANCE;
                        str99 = strDecodeStringElement85;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 27:
                        String strDecodeStringElement86 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i7 |= 134217728;
                        Unit unit18 = Unit.INSTANCE;
                        str98 = strDecodeStringElement86;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 28:
                        String strDecodeStringElement87 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i7 |= 268435456;
                        Unit unit19 = Unit.INSTANCE;
                        str105 = strDecodeStringElement87;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 29:
                        tradeUserPositionInfo3 = (TradeUserPositionInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 29, TradeUserPositionInfo$$serializer.INSTANCE, tradeUserPositionInfo3);
                        i7 = 536870912 | i7;
                        Unit unit20 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 30:
                        String strDecodeStringElement88 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i7 |= 1073741824;
                        Unit unit21 = Unit.INSTANCE;
                        str104 = strDecodeStringElement88;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 31:
                        String str112 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, str69);
                        i7 |= Integer.MIN_VALUE;
                        Unit unit22 = Unit.INSTANCE;
                        str69 = str112;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 32:
                        String strDecodeStringElement89 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
                        i8 |= 1;
                        Unit unit23 = Unit.INSTANCE;
                        str102 = strDecodeStringElement89;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 33:
                        String strDecodeStringElement90 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
                        i8 |= 2;
                        Unit unit24 = Unit.INSTANCE;
                        str97 = strDecodeStringElement90;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 34:
                        String strDecodeStringElement91 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
                        i8 |= 4;
                        Unit unit25 = Unit.INSTANCE;
                        str96 = strDecodeStringElement91;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 35:
                        List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 35, kSerializerArr[35], list3);
                        i8 |= 8;
                        Unit unit26 = Unit.INSTANCE;
                        list3 = list4;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 36:
                        String strDecodeStringElement92 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
                        i8 |= 16;
                        Unit unit27 = Unit.INSTANCE;
                        str95 = strDecodeStringElement92;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 37:
                        String strDecodeStringElement93 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 37);
                        i8 |= 32;
                        Unit unit28 = Unit.INSTANCE;
                        str94 = strDecodeStringElement93;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 38:
                        String strDecodeStringElement94 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 38);
                        i8 |= 64;
                        Unit unit29 = Unit.INSTANCE;
                        str74 = strDecodeStringElement94;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 39:
                        String strDecodeStringElement95 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 39);
                        i8 |= 128;
                        Unit unit30 = Unit.INSTANCE;
                        str75 = strDecodeStringElement95;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 40:
                        String strDecodeStringElement96 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 40);
                        i8 |= 256;
                        Unit unit31 = Unit.INSTANCE;
                        str76 = strDecodeStringElement96;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 41:
                        String strDecodeStringElement97 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 41);
                        i8 |= 512;
                        Unit unit32 = Unit.INSTANCE;
                        str93 = strDecodeStringElement97;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 42:
                        String strDecodeStringElement98 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 42);
                        i8 |= 1024;
                        Unit unit33 = Unit.INSTANCE;
                        str92 = strDecodeStringElement98;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 43:
                        String strDecodeStringElement99 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 43);
                        i8 |= 2048;
                        Unit unit34 = Unit.INSTANCE;
                        str91 = strDecodeStringElement99;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 44:
                        String strDecodeStringElement100 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 44);
                        i8 |= 4096;
                        Unit unit35 = Unit.INSTANCE;
                        str70 = strDecodeStringElement100;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 45:
                        String strDecodeStringElement101 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 45);
                        i8 |= 8192;
                        Unit unit36 = Unit.INSTANCE;
                        str77 = strDecodeStringElement101;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 46:
                        String strDecodeStringElement102 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 46);
                        i8 |= 16384;
                        Unit unit37 = Unit.INSTANCE;
                        str90 = strDecodeStringElement102;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 47:
                        String strDecodeStringElement103 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 47);
                        i8 |= 32768;
                        Unit unit38 = Unit.INSTANCE;
                        str89 = strDecodeStringElement103;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 48:
                        String strDecodeStringElement104 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 48);
                        i8 |= 65536;
                        Unit unit39 = Unit.INSTANCE;
                        str88 = strDecodeStringElement104;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 49:
                        String strDecodeStringElement105 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 49);
                        i8 |= 131072;
                        Unit unit40 = Unit.INSTANCE;
                        str87 = strDecodeStringElement105;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 50:
                        String strDecodeStringElement106 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 50);
                        i8 |= 262144;
                        Unit unit41 = Unit.INSTANCE;
                        str78 = strDecodeStringElement106;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 51:
                        String strDecodeStringElement107 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 51);
                        i8 |= 524288;
                        Unit unit42 = Unit.INSTANCE;
                        str86 = strDecodeStringElement107;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 52:
                        String strDecodeStringElement108 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 52);
                        i8 |= 1048576;
                        Unit unit43 = Unit.INSTANCE;
                        str85 = strDecodeStringElement108;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 53:
                        str68 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 53, StringSerializer.INSTANCE, str68);
                        i4 = 2097152;
                        i8 = i4 | i8;
                        Unit unit202 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 54:
                        str67 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 54, StringSerializer.INSTANCE, str67);
                        i8 |= 4194304;
                        Unit unit2022 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 55:
                        str111 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 55, StringSerializer.INSTANCE, str111);
                        i4 = 8388608;
                        i8 = i4 | i8;
                        Unit unit20222 = Unit.INSTANCE;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 56:
                        String strDecodeStringElement109 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 56);
                        i8 |= 16777216;
                        Unit unit44 = Unit.INSTANCE;
                        str84 = strDecodeStringElement109;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 57:
                        String strDecodeStringElement110 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 57);
                        i8 |= MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        Unit unit45 = Unit.INSTANCE;
                        str83 = strDecodeStringElement110;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 58:
                        String strDecodeStringElement111 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 58);
                        i8 |= 67108864;
                        Unit unit46 = Unit.INSTANCE;
                        str82 = strDecodeStringElement111;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 59:
                        String strDecodeStringElement112 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 59);
                        i8 |= 134217728;
                        Unit unit47 = Unit.INSTANCE;
                        str66 = strDecodeStringElement112;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 60:
                        String strDecodeStringElement113 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 60);
                        i8 |= 268435456;
                        Unit unit48 = Unit.INSTANCE;
                        str81 = strDecodeStringElement113;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 61:
                        String strDecodeStringElement114 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 61);
                        i8 |= 536870912;
                        Unit unit49 = Unit.INSTANCE;
                        str80 = strDecodeStringElement114;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 62:
                        String strDecodeStringElement115 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 62);
                        i8 |= 1073741824;
                        Unit unit50 = Unit.INSTANCE;
                        str71 = strDecodeStringElement115;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 63:
                        String strDecodeStringElement116 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 63);
                        i8 |= Integer.MIN_VALUE;
                        Unit unit51 = Unit.INSTANCE;
                        str79 = strDecodeStringElement116;
                        i5 = 10;
                        i6 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str77;
            str2 = str97;
            str3 = strDecodeStringElement59;
            str4 = strDecodeStringElement60;
            str5 = str102;
            str6 = strDecodeStringElement63;
            str7 = strDecodeStringElement64;
            str8 = strDecodeStringElement66;
            str9 = strDecodeStringElement67;
            str10 = strDecodeStringElement68;
            str11 = strDecodeStringElement69;
            str12 = strDecodeStringElement70;
            str13 = strDecodeStringElement71;
            str14 = strDecodeStringElement72;
            str15 = str106;
            str16 = str108;
            str17 = strDecodeStringElement74;
            str18 = str109;
            str19 = str68;
            str20 = str66;
            i = i8;
            str21 = str71;
            str22 = str80;
            str23 = str82;
            str24 = str84;
            str25 = str88;
            str26 = str89;
            str27 = str94;
            str28 = str98;
            str29 = strDecodeStringElement61;
            str30 = strDecodeStringElement65;
            tradeUserPositionInfo = tradeUserPositionInfo3;
            str31 = str67;
            str32 = str69;
            i2 = i7;
            str33 = str74;
            str34 = str81;
            str35 = str87;
            str36 = str91;
            str37 = str95;
            str38 = strDecodeStringElement62;
            str39 = str105;
            str40 = str111;
            str41 = str70;
            str42 = str72;
            str43 = str76;
            str44 = str101;
            str45 = str107;
            str46 = str110;
            str47 = str85;
            str48 = str96;
            str49 = str90;
            str50 = str75;
            str51 = str73;
            str52 = str103;
            str53 = str83;
            str54 = str104;
            strDecodeStringElement = str79;
            str55 = str99;
            str56 = str78;
            str57 = str100;
            str58 = str86;
            list = list3;
            str59 = strDecodeStringElement73;
            String str113 = str93;
            str60 = str92;
            str61 = str113;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TradePositionData(i2, i, 0, str46, str18, str17, str38, str29, str59, str14, str13, str12, str4, str3, str11, str10, str9, str8, str30, str7, str6, str16, str45, str52, str42, str51, str44, str15, str57, str55, str28, str39, tradeUserPositionInfo, str54, str32, str5, str2, str48, list, str37, str27, str33, str50, str43, str61, str60, str36, str41, str, str49, str26, str25, str35, str56, str58, str47, str19, str31, str40, str24, str53, str23, str20, str34, str22, str21, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TradePositionData tradePositionData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradePositionData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TradePositionData.write$Self$OKTradeCore_trade_core(tradePositionData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
