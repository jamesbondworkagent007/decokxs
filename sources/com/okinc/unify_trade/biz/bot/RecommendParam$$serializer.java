package com.okinc.unify_trade.biz.bot;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class RecommendParam$$serializer implements GeneratedSerializer<RecommendParam> {
    public static final int $stable;
    public static final RecommendParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RecommendParam$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RecommendParam$$serializer recommendParam$$serializer = new RecommendParam$$serializer();
        INSTANCE = recommendParam$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.bot.RecommendParam", recommendParam$$serializer, 32);
        pluginGeneratedSerialDescriptor.addElement("pnlRatio", true);
        pluginGeneratedSerialDescriptor.addElement("reserveFunds", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, true);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement("userRiskMode", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE, true);
        pluginGeneratedSerialDescriptor.addElement("slMode", true);
        pluginGeneratedSerialDescriptor.addElement("triggerParams", true);
        pluginGeneratedSerialDescriptor.addElement("maxSafetyOrds", true);
        pluginGeneratedSerialDescriptor.addElement("pxStepsMult", true);
        pluginGeneratedSerialDescriptor.addElement("volMult", true);
        pluginGeneratedSerialDescriptor.addElement("tag", true);
        pluginGeneratedSerialDescriptor.addElement("tpPct", true);
        pluginGeneratedSerialDescriptor.addElement("slPct", true);
        pluginGeneratedSerialDescriptor.addElement("pxSteps", true);
        pluginGeneratedSerialDescriptor.addElement("initOrdPct", true);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("gridNum", true);
        pluginGeneratedSerialDescriptor.addElement("minPx", true);
        pluginGeneratedSerialDescriptor.addElement("maxPx", true);
        pluginGeneratedSerialDescriptor.addElement("sz", true);
        pluginGeneratedSerialDescriptor.addElement("runType", true);
        pluginGeneratedSerialDescriptor.addElement("slTriggerPx", true);
        pluginGeneratedSerialDescriptor.addElement("tpTriggerPx", true);
        pluginGeneratedSerialDescriptor.addElement("tpRatio", true);
        pluginGeneratedSerialDescriptor.addElement("slRatio", true);
        pluginGeneratedSerialDescriptor.addElement("basePos", true);
        pluginGeneratedSerialDescriptor.addElement("ordType", true);
        pluginGeneratedSerialDescriptor.addElement("signParams", true);
        pluginGeneratedSerialDescriptor.addElement("earnParam", true);
        pluginGeneratedSerialDescriptor.addElement("quoteSz", true);
        pluginGeneratedSerialDescriptor.addElement("tpslTriggerParam", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = RecommendParam.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[7], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, kSerializerArr[28], BuiltinSerializersKt.getNullable(EarnParam$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(TpSlTriggerParamReqResp$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RecommendParam deserialize(@NotNull Decoder decoder) {
        int i;
        boolean z;
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
        EarnParam earnParam;
        boolean z2;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp;
        List list;
        String str22;
        String str23;
        String str24;
        List list2;
        String str25;
        String str26;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RecommendParam.$childSerializers;
        int i4 = 6;
        int i5 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
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
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 26);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 28, kSerializerArr[28], null);
            EarnParam earnParam2 = (EarnParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 29, EarnParam$$serializer.INSTANCE, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, null);
            str19 = strDecodeStringElement18;
            tpSlTriggerParamReqResp = (TpSlTriggerParamReqResp) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 31, TpSlTriggerParamReqResp$$serializer.INSTANCE, null);
            str14 = strDecodeStringElement17;
            str3 = strDecodeStringElement16;
            str7 = strDecodeStringElement15;
            str25 = strDecodeStringElement19;
            list2 = list4;
            str22 = strDecodeStringElement20;
            str15 = strDecodeStringElement21;
            str18 = strDecodeStringElement22;
            str16 = strDecodeStringElement23;
            str23 = strDecodeStringElement24;
            z2 = zDecodeBooleanElement2;
            str17 = strDecodeStringElement25;
            earnParam = earnParam2;
            str13 = str27;
            i = -1;
            str26 = strDecodeStringElement7;
            list = list3;
            str9 = strDecodeStringElement11;
            str20 = strDecodeStringElement9;
            str21 = strDecodeStringElement8;
            str5 = strDecodeStringElement6;
            str2 = strDecodeStringElement10;
            str24 = strDecodeStringElement14;
            str8 = strDecodeStringElement13;
            str = strDecodeStringElement5;
            str4 = strDecodeStringElement12;
            str12 = strDecodeStringElement;
            str6 = strDecodeStringElement3;
            str10 = strDecodeStringElement4;
            str11 = strDecodeStringElement2;
            z = zDecodeBooleanElement;
        } else {
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            boolean z3 = true;
            List list5 = null;
            String str28 = null;
            List list6 = null;
            EarnParam earnParam3 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
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
            String str29 = null;
            TpSlTriggerParamReqResp tpSlTriggerParamReqResp2 = null;
            int i6 = 0;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z3 = false;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 0:
                        String strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str29 = strDecodeStringElement50;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 1:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i6 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 2:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 3:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        Unit unit32 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 4:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        Unit unit5 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 5:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        Unit unit52 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 6:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i6 |= 64;
                        Unit unit522 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 7:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], list5);
                        i6 |= 128;
                        Unit unit6 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 8:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i6 |= 256;
                        Unit unit5222 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 9:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i6 |= 512;
                        Unit unit52222 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 10:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i6 |= 1024;
                        Unit unit522222 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 11:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i6 |= 2048;
                        Unit unit5222222 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 12:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i6 |= 4096;
                        Unit unit7 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 13:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i6 |= 8192;
                        Unit unit8 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 14:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i6 |= 16384;
                        Unit unit9 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 15:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i6 |= 32768;
                        Unit unit10 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 16:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i6 |= 65536;
                        Unit unit11 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 17:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i6 |= 131072;
                        Unit unit12 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 18:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i6 |= 262144;
                        Unit unit13 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 19:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i6 |= 524288;
                        Unit unit14 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 20:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i2 = 1048576;
                        i6 |= i2;
                        Unit unit15 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 21:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i2 = 2097152;
                        i6 |= i2;
                        Unit unit152 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 22:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i2 = 4194304;
                        i6 |= i2;
                        Unit unit1522 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 23:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i2 = 8388608;
                        i6 |= i2;
                        Unit unit15222 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 24:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i2 = 16777216;
                        i6 |= i2;
                        Unit unit152222 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 25:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i2 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i6 |= i2;
                        Unit unit1522222 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 26:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 26);
                        i2 = 67108864;
                        i6 |= i2;
                        Unit unit15222222 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 27:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i2 = 134217728;
                        i6 |= i2;
                        Unit unit152222222 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 28:
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 28, kSerializerArr[28], list6);
                        i2 = 268435456;
                        i6 |= i2;
                        Unit unit1522222222 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 29:
                        earnParam3 = (EarnParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 29, EarnParam$$serializer.INSTANCE, earnParam3);
                        i3 = 536870912;
                        i6 |= i3;
                        Unit unit16 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 30:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, str28);
                        i3 = 1073741824;
                        i6 |= i3;
                        Unit unit162 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    case 31:
                        tpSlTriggerParamReqResp2 = (TpSlTriggerParamReqResp) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 31, TpSlTriggerParamReqResp$$serializer.INSTANCE, tpSlTriggerParamReqResp2);
                        i3 = Integer.MIN_VALUE;
                        i6 |= i3;
                        Unit unit1622 = Unit.INSTANCE;
                        i5 = 8;
                        i4 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i6;
            z = zDecodeBooleanElement4;
            str = strDecodeStringElement30;
            str2 = strDecodeStringElement32;
            str3 = strDecodeStringElement36;
            str4 = strDecodeStringElement37;
            str5 = strDecodeStringElement38;
            str6 = strDecodeStringElement40;
            str7 = strDecodeStringElement41;
            str8 = strDecodeStringElement43;
            str9 = strDecodeStringElement44;
            str10 = strDecodeStringElement48;
            str11 = strDecodeStringElement49;
            str12 = str29;
            str13 = str28;
            earnParam = earnParam3;
            z2 = zDecodeBooleanElement3;
            str14 = strDecodeStringElement26;
            str15 = strDecodeStringElement28;
            str16 = strDecodeStringElement29;
            str17 = strDecodeStringElement33;
            str18 = strDecodeStringElement35;
            str19 = strDecodeStringElement39;
            str20 = strDecodeStringElement45;
            str21 = strDecodeStringElement46;
            tpSlTriggerParamReqResp = tpSlTriggerParamReqResp2;
            list = list5;
            str22 = strDecodeStringElement31;
            str23 = strDecodeStringElement34;
            str24 = strDecodeStringElement42;
            list2 = list6;
            str25 = strDecodeStringElement27;
            str26 = strDecodeStringElement47;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecommendParam(i, 0, str12, z, str11, str6, str10, str, str5, list, str26, str21, str20, str2, str9, str4, str8, str24, str7, str3, str14, str19, str25, str22, str15, str18, str16, str23, z2, str17, list2, earnParam, str13, tpSlTriggerParamReqResp, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RecommendParam recommendParam) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(recommendParam, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecommendParam.write$Self$OKTradeCore_trade_core(recommendParam, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
