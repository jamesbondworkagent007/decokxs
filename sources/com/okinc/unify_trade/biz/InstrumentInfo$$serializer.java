package com.okinc.unify_trade.biz;

import com.engagelab.privates.push.constants.MTPushConstants;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class InstrumentInfo$$serializer implements GeneratedSerializer<InstrumentInfo> {
    public static final int $stable;
    public static final InstrumentInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InstrumentInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InstrumentInfo$$serializer instrumentInfo$$serializer = new InstrumentInfo$$serializer();
        INSTANCE = instrumentInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.InstrumentInfo", instrumentInfo$$serializer, 73);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement("uly", true);
        pluginGeneratedSerialDescriptor.addElement("baseCcy", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCcy", true);
        pluginGeneratedSerialDescriptor.addElement("settleCcy", true);
        pluginGeneratedSerialDescriptor.addElement("ctVal", true);
        pluginGeneratedSerialDescriptor.addElement("ctMult", true);
        pluginGeneratedSerialDescriptor.addElement("ctValCcy", true);
        pluginGeneratedSerialDescriptor.addElement("optType", true);
        pluginGeneratedSerialDescriptor.addElement("stk", true);
        pluginGeneratedSerialDescriptor.addElement("listTime", true);
        pluginGeneratedSerialDescriptor.addElement("expTime", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE, true);
        pluginGeneratedSerialDescriptor.addElement("coinLever", true);
        pluginGeneratedSerialDescriptor.addElement("tickSz", true);
        pluginGeneratedSerialDescriptor.addElement("lotSz", true);
        pluginGeneratedSerialDescriptor.addElement("minSz", true);
        pluginGeneratedSerialDescriptor.addElement("ctType", true);
        pluginGeneratedSerialDescriptor.addElement(MTPushConstants.Operation.KEY_ALIAS, true);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("newTag", true);
        pluginGeneratedSerialDescriptor.addElement("newLabel", true);
        pluginGeneratedSerialDescriptor.addElement("category", true);
        pluginGeneratedSerialDescriptor.addElement("coinName", true);
        pluginGeneratedSerialDescriptor.addElement("ruleType", true);
        pluginGeneratedSerialDescriptor.addElement("isoFlag", true);
        pluginGeneratedSerialDescriptor.addElement("onlineTime", true);
        pluginGeneratedSerialDescriptor.addElement("continuous", true);
        pluginGeneratedSerialDescriptor.addElement("preQuote", true);
        pluginGeneratedSerialDescriptor.addElement("closeMaxThresholdRateWeek", true);
        pluginGeneratedSerialDescriptor.addElement("indexMaxThresholdRate", true);
        pluginGeneratedSerialDescriptor.addElement("tenMinsAfterContractGeneration", true);
        pluginGeneratedSerialDescriptor.addElement("withinTenMinsOfContractGeneration", true);
        pluginGeneratedSerialDescriptor.addElement("maxLmtSz", true);
        pluginGeneratedSerialDescriptor.addElement("maxMktSz", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblMinBaseSpread", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblDeltaFactor", true);
        pluginGeneratedSerialDescriptor.addElement("pxLimitFactor", true);
        pluginGeneratedSerialDescriptor.addElement("masPaDeltaThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblMinBaseSpreadV2", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblDeltaFactorGtHaftV2", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblDeltaFactorLtHaftV2", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblMinBaseSpreadV3", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblDeltaFactorGtHaftV3", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblDeltaFactorLtHaftV3", true);
        pluginGeneratedSerialDescriptor.addElement("maxLmtAmt", true);
        pluginGeneratedSerialDescriptor.addElement("maxMktAmt", true);
        pluginGeneratedSerialDescriptor.addElement("expiryDisplay", true);
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
        pluginGeneratedSerialDescriptor.addElement("lpC1", true);
        pluginGeneratedSerialDescriptor.addElement("lpC2", true);
        pluginGeneratedSerialDescriptor.addElement("futureSettlement", true);
        pluginGeneratedSerialDescriptor.addElement("nextSettleTime", true);
        pluginGeneratedSerialDescriptor.addElement("userPositionMaxPercent", true);
        pluginGeneratedSerialDescriptor.addElement("userPositionMaxValueUSD", true);
        pluginGeneratedSerialDescriptor.addElement("platformSidePositionMaxValueUSD", true);
        pluginGeneratedSerialDescriptor.addElement("instFamily", true);
        pluginGeneratedSerialDescriptor.addElement("displayId", true);
        pluginGeneratedSerialDescriptor.addElement("tradeQuoteCcyList", true);
        pluginGeneratedSerialDescriptor.addElement("listStage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = InstrumentInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[71]), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InstrumentInfo deserialize(@NotNull Decoder decoder) {
        int i;
        int i2;
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
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        boolean z;
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
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        String str55;
        String str56;
        String str57;
        String str58;
        String strDecodeStringElement;
        String str59;
        String str60;
        String str61;
        String str62;
        List list;
        int i3;
        String str63;
        String str64;
        String str65;
        String str66;
        String str67;
        String str68;
        String str69;
        String str70;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InstrumentInfo.$childSerializers;
        int i6 = 11;
        int i7 = 5;
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
            String strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 46);
            String strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 47);
            String strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 48);
            String strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 49);
            String strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 50);
            String strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 51);
            String strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 52);
            String strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 53);
            String strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 54);
            String strDecodeStringElement57 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 55);
            String strDecodeStringElement58 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 56);
            String strDecodeStringElement59 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 57);
            String strDecodeStringElement60 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 58);
            String strDecodeStringElement61 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 59);
            String strDecodeStringElement62 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 60);
            String strDecodeStringElement63 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 61);
            String strDecodeStringElement64 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 62);
            String strDecodeStringElement65 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 63);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 64);
            String strDecodeStringElement66 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 65);
            String strDecodeStringElement67 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 66);
            String strDecodeStringElement68 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 67);
            String strDecodeStringElement69 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 68);
            String strDecodeStringElement70 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 69);
            String strDecodeStringElement71 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 70);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 71, kSerializerArr[71], null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 72);
            str42 = strDecodeStringElement69;
            str41 = strDecodeStringElement70;
            str51 = strDecodeStringElement71;
            z = zDecodeBooleanElement;
            str29 = strDecodeStringElement66;
            str28 = strDecodeStringElement67;
            str8 = strDecodeStringElement10;
            str55 = strDecodeStringElement63;
            str52 = strDecodeStringElement64;
            str9 = strDecodeStringElement9;
            str34 = strDecodeStringElement60;
            str45 = strDecodeStringElement61;
            str13 = strDecodeStringElement3;
            str16 = strDecodeStringElement57;
            str15 = strDecodeStringElement58;
            i3 = -1;
            str65 = strDecodeStringElement54;
            str18 = strDecodeStringElement55;
            str70 = strDecodeStringElement51;
            str69 = strDecodeStringElement52;
            str22 = strDecodeStringElement48;
            str66 = strDecodeStringElement49;
            str19 = strDecodeStringElement45;
            str20 = strDecodeStringElement46;
            str47 = strDecodeStringElement42;
            str37 = strDecodeStringElement43;
            str54 = strDecodeStringElement39;
            str57 = strDecodeStringElement40;
            str30 = strDecodeStringElement36;
            str33 = strDecodeStringElement37;
            str43 = strDecodeStringElement34;
            str44 = strDecodeStringElement33;
            str3 = strDecodeStringElement11;
            str14 = strDecodeStringElement2;
            str53 = strDecodeStringElement31;
            str6 = strDecodeStringElement15;
            str67 = strDecodeStringElement29;
            str = strDecodeStringElement14;
            str24 = strDecodeStringElement27;
            str10 = strDecodeStringElement8;
            str26 = strDecodeStringElement25;
            str12 = strDecodeStringElement4;
            str40 = strDecodeStringElement23;
            str62 = strDecodeStringElement21;
            str27 = strDecodeStringElement68;
            str56 = strDecodeStringElement19;
            str68 = strDecodeStringElement65;
            str36 = strDecodeStringElement17;
            str60 = strDecodeStringElement62;
            str5 = strDecodeStringElement16;
            str35 = strDecodeStringElement59;
            str7 = strDecodeStringElement13;
            str17 = strDecodeStringElement56;
            i2 = -1;
            str46 = strDecodeStringElement53;
            str48 = strDecodeStringElement50;
            str21 = strDecodeStringElement47;
            str38 = strDecodeStringElement44;
            str61 = strDecodeStringElement41;
            str63 = strDecodeStringElement38;
            str31 = strDecodeStringElement35;
            str59 = strDecodeStringElement32;
            str49 = strDecodeStringElement30;
            str23 = strDecodeStringElement28;
            str25 = strDecodeStringElement26;
            str39 = strDecodeStringElement24;
            str50 = strDecodeStringElement22;
            str58 = strDecodeStringElement20;
            str64 = strDecodeStringElement18;
            str2 = strDecodeStringElement12;
            i = 511;
            str32 = strDecodeStringElement7;
            str4 = strDecodeStringElement5;
            str11 = strDecodeStringElement6;
        } else {
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            boolean z2 = true;
            List list2 = null;
            String strDecodeStringElement72 = null;
            String strDecodeStringElement73 = null;
            String strDecodeStringElement74 = null;
            String strDecodeStringElement75 = null;
            String strDecodeStringElement76 = null;
            String strDecodeStringElement77 = null;
            String strDecodeStringElement78 = null;
            String strDecodeStringElement79 = null;
            String strDecodeStringElement80 = null;
            String strDecodeStringElement81 = null;
            String strDecodeStringElement82 = null;
            String strDecodeStringElement83 = null;
            String strDecodeStringElement84 = null;
            String strDecodeStringElement85 = null;
            String strDecodeStringElement86 = null;
            String strDecodeStringElement87 = null;
            String strDecodeStringElement88 = null;
            String strDecodeStringElement89 = null;
            String strDecodeStringElement90 = null;
            String strDecodeStringElement91 = null;
            String strDecodeStringElement92 = null;
            String strDecodeStringElement93 = null;
            String strDecodeStringElement94 = null;
            String strDecodeStringElement95 = null;
            String strDecodeStringElement96 = null;
            String strDecodeStringElement97 = null;
            String strDecodeStringElement98 = null;
            String strDecodeStringElement99 = null;
            String strDecodeStringElement100 = null;
            String strDecodeStringElement101 = null;
            String strDecodeStringElement102 = null;
            String strDecodeStringElement103 = null;
            String strDecodeStringElement104 = null;
            String strDecodeStringElement105 = null;
            String strDecodeStringElement106 = null;
            String strDecodeStringElement107 = null;
            String strDecodeStringElement108 = null;
            String strDecodeStringElement109 = null;
            String strDecodeStringElement110 = null;
            String strDecodeStringElement111 = null;
            String strDecodeStringElement112 = null;
            String strDecodeStringElement113 = null;
            String strDecodeStringElement114 = null;
            String strDecodeStringElement115 = null;
            String strDecodeStringElement116 = null;
            String strDecodeStringElement117 = null;
            String strDecodeStringElement118 = null;
            String strDecodeStringElement119 = null;
            String strDecodeStringElement120 = null;
            String strDecodeStringElement121 = null;
            String strDecodeStringElement122 = null;
            String strDecodeStringElement123 = null;
            String strDecodeStringElement124 = null;
            String strDecodeStringElement125 = null;
            String strDecodeStringElement126 = null;
            String strDecodeStringElement127 = null;
            String strDecodeStringElement128 = null;
            String strDecodeStringElement129 = null;
            String strDecodeStringElement130 = null;
            String strDecodeStringElement131 = null;
            String strDecodeStringElement132 = null;
            String strDecodeStringElement133 = null;
            String strDecodeStringElement134 = null;
            String strDecodeStringElement135 = null;
            String strDecodeStringElement136 = null;
            String strDecodeStringElement137 = null;
            String strDecodeStringElement138 = null;
            String strDecodeStringElement139 = null;
            String strDecodeStringElement140 = null;
            String strDecodeStringElement141 = null;
            String str71 = null;
            boolean zDecodeBooleanElement2 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z2 = false;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 0:
                        String strDecodeStringElement142 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i9 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str71 = strDecodeStringElement142;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 1:
                        strDecodeStringElement141 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i9 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 2:
                        strDecodeStringElement140 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i9 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 3:
                        strDecodeStringElement113 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i9 |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 4:
                        strDecodeStringElement139 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i9 |= 16;
                        Unit unit6 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 5:
                        strDecodeStringElement138 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i7);
                        i9 |= 32;
                        Unit unit7 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 6:
                        strDecodeStringElement137 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i9 |= 64;
                        Unit unit8 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 7:
                        strDecodeStringElement136 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i9 |= 128;
                        Unit unit82 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 8:
                        strDecodeStringElement135 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i9 |= 256;
                        Unit unit822 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 9:
                        strDecodeStringElement112 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i9 |= 512;
                        Unit unit8222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 10:
                        strDecodeStringElement111 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i9 |= 1024;
                        Unit unit82222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 11:
                        strDecodeStringElement134 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i9 |= 2048;
                        Unit unit822222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 12:
                        strDecodeStringElement110 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i9 |= 4096;
                        Unit unit9 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 13:
                        strDecodeStringElement133 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i9 |= 8192;
                        Unit unit10 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 14:
                        strDecodeStringElement132 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i9 |= 16384;
                        Unit unit11 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 15:
                        strDecodeStringElement131 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i4 = 32768;
                        i9 |= i4;
                        Unit unit12 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 16:
                        strDecodeStringElement109 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i9 |= 65536;
                        Unit unit13 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 17:
                        strDecodeStringElement130 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i4 = 131072;
                        i9 |= i4;
                        Unit unit122 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 18:
                        strDecodeStringElement129 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i4 = 262144;
                        i9 |= i4;
                        Unit unit1222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 19:
                        strDecodeStringElement128 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i4 = 524288;
                        i9 |= i4;
                        Unit unit12222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 20:
                        strDecodeStringElement127 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i4 = 1048576;
                        i9 |= i4;
                        Unit unit122222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 21:
                        strDecodeStringElement126 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i4 = 2097152;
                        i9 |= i4;
                        Unit unit1222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 22:
                        strDecodeStringElement125 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i4 = 4194304;
                        i9 |= i4;
                        Unit unit12222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 23:
                        strDecodeStringElement124 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i4 = 8388608;
                        i9 |= i4;
                        Unit unit122222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 24:
                        strDecodeStringElement123 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i4 = 16777216;
                        i9 |= i4;
                        Unit unit1222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 25:
                        strDecodeStringElement122 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i4 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i9 |= i4;
                        Unit unit12222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 26:
                        strDecodeStringElement121 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i4 = 67108864;
                        i9 |= i4;
                        Unit unit122222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 27:
                        strDecodeStringElement120 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i4 = 134217728;
                        i9 |= i4;
                        Unit unit1222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 28:
                        strDecodeStringElement119 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i4 = 268435456;
                        i9 |= i4;
                        Unit unit12222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 29:
                        strDecodeStringElement118 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i4 = 536870912;
                        i9 |= i4;
                        Unit unit122222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 30:
                        strDecodeStringElement117 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i4 = 1073741824;
                        i9 |= i4;
                        Unit unit1222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 31:
                        strDecodeStringElement116 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i4 = Integer.MIN_VALUE;
                        i9 |= i4;
                        Unit unit12222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 32:
                        strDecodeStringElement108 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
                        i10 |= 1;
                        Unit unit14 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 33:
                        strDecodeStringElement115 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
                        i10 |= 2;
                        Unit unit122222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 34:
                        strDecodeStringElement114 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
                        i10 |= 4;
                        Unit unit1222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 35:
                        strDecodeStringElement72 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
                        i10 |= 8;
                        Unit unit12222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 36:
                        strDecodeStringElement73 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
                        i10 |= 16;
                        Unit unit122222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 37:
                        strDecodeStringElement74 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 37);
                        i10 |= 32;
                        Unit unit1222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 38:
                        strDecodeStringElement75 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 38);
                        i10 |= 64;
                        Unit unit12222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 39:
                        strDecodeStringElement76 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 39);
                        i10 |= 128;
                        Unit unit122222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 40:
                        strDecodeStringElement77 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 40);
                        i10 |= 256;
                        Unit unit1222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 41:
                        strDecodeStringElement78 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 41);
                        i10 |= 512;
                        Unit unit12222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 42:
                        strDecodeStringElement79 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 42);
                        i10 |= 1024;
                        Unit unit122222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 43:
                        strDecodeStringElement80 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 43);
                        i10 |= 2048;
                        Unit unit1222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 44:
                        strDecodeStringElement81 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 44);
                        i10 |= 4096;
                        Unit unit12222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 45:
                        strDecodeStringElement82 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 45);
                        i10 |= 8192;
                        Unit unit122222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 46:
                        strDecodeStringElement83 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 46);
                        i10 |= 16384;
                        Unit unit1222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 47:
                        strDecodeStringElement84 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 47);
                        i5 = 32768;
                        i10 |= i5;
                        Unit unit12222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 48:
                        strDecodeStringElement85 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 48);
                        i5 = 65536;
                        i10 |= i5;
                        Unit unit122222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 49:
                        strDecodeStringElement107 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 49);
                        i5 = 131072;
                        i10 |= i5;
                        Unit unit1222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 50:
                        strDecodeStringElement106 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 50);
                        i5 = 262144;
                        i10 |= i5;
                        Unit unit12222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 51:
                        strDecodeStringElement105 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 51);
                        i5 = 524288;
                        i10 |= i5;
                        Unit unit122222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 52:
                        strDecodeStringElement104 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 52);
                        i5 = 1048576;
                        i10 |= i5;
                        Unit unit1222222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 53:
                        strDecodeStringElement103 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 53);
                        i5 = 2097152;
                        i10 |= i5;
                        Unit unit12222222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 54:
                        strDecodeStringElement102 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 54);
                        i5 = 4194304;
                        i10 |= i5;
                        Unit unit122222222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 55:
                        strDecodeStringElement101 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 55);
                        i5 = 8388608;
                        i10 |= i5;
                        Unit unit1222222222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 56:
                        strDecodeStringElement100 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 56);
                        i5 = 16777216;
                        i10 |= i5;
                        Unit unit12222222222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 57:
                        strDecodeStringElement99 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 57);
                        i5 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i10 |= i5;
                        Unit unit122222222222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 58:
                        strDecodeStringElement98 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 58);
                        i5 = 67108864;
                        i10 |= i5;
                        Unit unit1222222222222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 59:
                        strDecodeStringElement97 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 59);
                        i5 = 134217728;
                        i10 |= i5;
                        Unit unit12222222222222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 60:
                        strDecodeStringElement96 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 60);
                        i5 = 268435456;
                        i10 |= i5;
                        Unit unit122222222222222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 61:
                        strDecodeStringElement95 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 61);
                        i5 = 536870912;
                        i10 |= i5;
                        Unit unit1222222222222222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 62:
                        strDecodeStringElement94 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 62);
                        i5 = 1073741824;
                        i10 |= i5;
                        Unit unit12222222222222222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 63:
                        strDecodeStringElement93 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 63);
                        i5 = Integer.MIN_VALUE;
                        i10 |= i5;
                        Unit unit122222222222222222222222222222222222222222222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 64:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 64);
                        i8 |= 1;
                        Unit unit15 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 65:
                        strDecodeStringElement92 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 65);
                        i8 |= 2;
                        Unit unit16 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 66:
                        strDecodeStringElement91 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 66);
                        i8 |= 4;
                        Unit unit162 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 67:
                        strDecodeStringElement90 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 67);
                        i8 |= 8;
                        Unit unit1622 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 68:
                        strDecodeStringElement89 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 68);
                        i8 |= 16;
                        Unit unit16222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 69:
                        strDecodeStringElement88 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 69);
                        i8 |= 32;
                        Unit unit162222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 70:
                        strDecodeStringElement86 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 70);
                        i8 |= 64;
                        Unit unit1622222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 71:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 71, kSerializerArr[71], list2);
                        i8 |= 128;
                        Unit unit16222222 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    case 72:
                        strDecodeStringElement87 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 72);
                        i8 |= 256;
                        Unit unit17 = Unit.INSTANCE;
                        i6 = 11;
                        i7 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i8;
            i2 = i10;
            str = strDecodeStringElement110;
            str2 = strDecodeStringElement111;
            str3 = strDecodeStringElement112;
            str4 = strDecodeStringElement113;
            str5 = strDecodeStringElement132;
            str6 = strDecodeStringElement133;
            str7 = strDecodeStringElement134;
            str8 = strDecodeStringElement135;
            str9 = strDecodeStringElement136;
            str10 = strDecodeStringElement137;
            str11 = strDecodeStringElement139;
            str12 = strDecodeStringElement140;
            str13 = strDecodeStringElement141;
            str14 = str71;
            str15 = strDecodeStringElement100;
            str16 = strDecodeStringElement101;
            str17 = strDecodeStringElement102;
            str18 = strDecodeStringElement103;
            str19 = strDecodeStringElement80;
            str20 = strDecodeStringElement81;
            str21 = strDecodeStringElement82;
            str22 = strDecodeStringElement83;
            str23 = strDecodeStringElement121;
            str24 = strDecodeStringElement122;
            str25 = strDecodeStringElement123;
            str26 = strDecodeStringElement124;
            z = zDecodeBooleanElement2;
            str27 = strDecodeStringElement90;
            str28 = strDecodeStringElement91;
            str29 = strDecodeStringElement92;
            str30 = strDecodeStringElement114;
            str31 = strDecodeStringElement115;
            str32 = strDecodeStringElement138;
            str33 = strDecodeStringElement72;
            str34 = strDecodeStringElement98;
            str35 = strDecodeStringElement99;
            str36 = strDecodeStringElement131;
            str37 = strDecodeStringElement78;
            str38 = strDecodeStringElement79;
            str39 = strDecodeStringElement125;
            str40 = strDecodeStringElement126;
            str41 = strDecodeStringElement88;
            str42 = strDecodeStringElement89;
            str43 = strDecodeStringElement108;
            str44 = strDecodeStringElement116;
            str45 = strDecodeStringElement97;
            str46 = strDecodeStringElement105;
            str47 = strDecodeStringElement77;
            str48 = strDecodeStringElement85;
            str49 = strDecodeStringElement119;
            str50 = strDecodeStringElement127;
            str51 = strDecodeStringElement86;
            str52 = strDecodeStringElement94;
            str53 = strDecodeStringElement118;
            str54 = strDecodeStringElement74;
            str55 = strDecodeStringElement95;
            str56 = strDecodeStringElement130;
            str57 = strDecodeStringElement75;
            str58 = strDecodeStringElement129;
            strDecodeStringElement = strDecodeStringElement87;
            str59 = strDecodeStringElement117;
            str60 = strDecodeStringElement96;
            str61 = strDecodeStringElement76;
            str62 = strDecodeStringElement128;
            list = list2;
            i3 = i9;
            String str72 = strDecodeStringElement93;
            str63 = strDecodeStringElement73;
            str64 = strDecodeStringElement109;
            str65 = strDecodeStringElement104;
            str66 = strDecodeStringElement84;
            str67 = strDecodeStringElement120;
            str68 = str72;
            String str73 = strDecodeStringElement107;
            str69 = strDecodeStringElement106;
            str70 = str73;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InstrumentInfo(i3, i2, i, str14, str13, str12, str4, str11, str32, str10, str9, str8, str3, str2, str7, str, str6, str5, str36, str64, str56, str58, str62, str50, str40, str39, str26, str25, str24, str23, str67, str49, str53, str59, str44, str43, str31, str30, str33, str63, str54, str57, str61, str47, str37, str38, str19, str20, str21, str22, str66, str48, str70, str69, str46, str65, str18, str17, str16, str15, str35, str34, str45, str60, str55, str52, str68, z, str29, str28, str27, str42, str41, str51, list, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InstrumentInfo instrumentInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(instrumentInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InstrumentInfo.write$Self$OKTradeCore_trade_core(instrumentInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
