package com.okinc.business.trade.features.home.ui.cefi.data;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam$$serializer;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TraceData$$serializer;
import java.util.List;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class AdvancedCallDataRequest$$serializer implements GeneratedSerializer<AdvancedCallDataRequest> {
    public static final int $stable;
    public static final AdvancedCallDataRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AdvancedCallDataRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AdvancedCallDataRequest$$serializer advancedCallDataRequest$$serializer = new AdvancedCallDataRequest$$serializer();
        INSTANCE = advancedCallDataRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCallDataRequest", advancedCallDataRequest$$serializer, 27);
        pluginGeneratedSerialDescriptor.addElement("dexRouterList", false);
        pluginGeneratedSerialDescriptor.addElement("priorityFee", false);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", false);
        pluginGeneratedSerialDescriptor.addElement("estimateGasFee", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("fromAmount", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("toAmount", false);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", false);
        pluginGeneratedSerialDescriptor.addElement("enableJito", true);
        pluginGeneratedSerialDescriptor.addElement("routerModeType", false);
        pluginGeneratedSerialDescriptor.addElement("priorityFeeType", false);
        pluginGeneratedSerialDescriptor.addElement("customPriorityFee", false);
        pluginGeneratedSerialDescriptor.addElement("traceData", true);
        pluginGeneratedSerialDescriptor.addElement("mevInfo", true);
        pluginGeneratedSerialDescriptor.addElement("serviceFeeInfo", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, true);
        pluginGeneratedSerialDescriptor.addElement("tradeMode", true);
        pluginGeneratedSerialDescriptor.addElement("autoSlippageInfo", true);
        pluginGeneratedSerialDescriptor.addElement("customSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("maxSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("defiPlatformId", true);
        pluginGeneratedSerialDescriptor.addElement("referralCommissionJsVersion", true);
        pluginGeneratedSerialDescriptor.addElement("orderId", true);
        pluginGeneratedSerialDescriptor.addElement("unsignedTx", true);
        pluginGeneratedSerialDescriptor.addElement("signature", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{AdvancedCallDataRequest.$childSerializers[0], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, stringSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(TraceData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(ServiceFeeInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(DexAutoSlippageInfoParam$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AdvancedCallDataRequest deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        String str2;
        TraceData traceData;
        String str3;
        ServiceFeeInfo serviceFeeInfo;
        Integer num2;
        String str4;
        String str5;
        String str6;
        boolean z;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam;
        List list;
        Boolean bool;
        int i;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        Boolean bool2;
        int i2;
        String str21;
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam2;
        List list2;
        Boolean bool3;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AdvancedCallDataRequest.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, null);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            TraceData traceData2 = (TraceData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, TraceData$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            ServiceFeeInfo serviceFeeInfo2 = (ServiceFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, ServiceFeeInfo$$serializer.INSTANCE, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, intSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, intSerializer, null);
            DexAutoSlippageInfoParam dexAutoSlippageInfoParam3 = (DexAutoSlippageInfoParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, DexAutoSlippageInfoParam$$serializer.INSTANCE, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, null);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            str9 = str24;
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, stringSerializer, null);
            str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, stringSerializer, null);
            str18 = strDecodeStringElement5;
            list = list3;
            str14 = str25;
            str2 = str23;
            num = num3;
            z = zDecodeBooleanElement;
            str6 = strDecodeStringElement10;
            str5 = strDecodeStringElement9;
            str16 = strDecodeStringElement7;
            serviceFeeInfo = serviceFeeInfo2;
            traceData = traceData2;
            str8 = strDecodeStringElement13;
            dexAutoSlippageInfoParam = dexAutoSlippageInfoParam3;
            str7 = strDecodeStringElement12;
            str17 = strDecodeStringElement6;
            str = str22;
            i = 134217727;
            str12 = strDecodeStringElement3;
            str19 = strDecodeStringElement;
            num2 = num4;
            str10 = strDecodeStringElement11;
            bool = bool4;
            str4 = strDecodeStringElement8;
            str13 = strDecodeStringElement2;
            str11 = strDecodeStringElement4;
        } else {
            boolean z2 = true;
            String str26 = null;
            DexAutoSlippageInfoParam dexAutoSlippageInfoParam4 = null;
            String str27 = null;
            Boolean bool5 = null;
            Integer num5 = null;
            String str28 = null;
            TraceData traceData3 = null;
            String str29 = null;
            String str30 = null;
            ServiceFeeInfo serviceFeeInfo3 = null;
            Integer num6 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            List list4 = null;
            boolean zDecodeBooleanElement2 = false;
            int i4 = 0;
            String str31 = null;
            while (z2) {
                KSerializer[] kSerializerArr2 = kSerializerArr;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str21 = str26;
                        dexAutoSlippageInfoParam2 = dexAutoSlippageInfoParam4;
                        list2 = list4;
                        z2 = false;
                        list4 = list2;
                        str26 = str21;
                        kSerializerArr = kSerializerArr2;
                        dexAutoSlippageInfoParam4 = dexAutoSlippageInfoParam2;
                        break;
                    case 0:
                        str20 = str26;
                        list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr2[0], list4);
                        i4 |= 1;
                        dexAutoSlippageInfoParam4 = dexAutoSlippageInfoParam4;
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    case 1:
                        str21 = str26;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        dexAutoSlippageInfoParam2 = dexAutoSlippageInfoParam4;
                        list2 = list4;
                        list4 = list2;
                        str26 = str21;
                        kSerializerArr = kSerializerArr2;
                        dexAutoSlippageInfoParam4 = dexAutoSlippageInfoParam2;
                        break;
                    case 2:
                        str21 = str26;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        dexAutoSlippageInfoParam2 = dexAutoSlippageInfoParam4;
                        list2 = list4;
                        list4 = list2;
                        str26 = str21;
                        kSerializerArr = kSerializerArr2;
                        dexAutoSlippageInfoParam4 = dexAutoSlippageInfoParam2;
                        break;
                    case 3:
                        str21 = str26;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        dexAutoSlippageInfoParam2 = dexAutoSlippageInfoParam4;
                        list2 = list4;
                        list4 = list2;
                        str26 = str21;
                        kSerializerArr = kSerializerArr2;
                        dexAutoSlippageInfoParam4 = dexAutoSlippageInfoParam2;
                        break;
                    case 4:
                        str21 = str26;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                        dexAutoSlippageInfoParam2 = dexAutoSlippageInfoParam4;
                        list2 = list4;
                        list4 = list2;
                        str26 = str21;
                        kSerializerArr = kSerializerArr2;
                        dexAutoSlippageInfoParam4 = dexAutoSlippageInfoParam2;
                        break;
                    case 5:
                        str21 = str26;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 |= 32;
                        dexAutoSlippageInfoParam2 = dexAutoSlippageInfoParam4;
                        list2 = list4;
                        list4 = list2;
                        str26 = str21;
                        kSerializerArr = kSerializerArr2;
                        dexAutoSlippageInfoParam4 = dexAutoSlippageInfoParam2;
                        break;
                    case 6:
                        str21 = str26;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 |= 64;
                        dexAutoSlippageInfoParam2 = dexAutoSlippageInfoParam4;
                        list2 = list4;
                        list4 = list2;
                        str26 = str21;
                        kSerializerArr = kSerializerArr2;
                        dexAutoSlippageInfoParam4 = dexAutoSlippageInfoParam2;
                        break;
                    case 7:
                        str21 = str26;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 |= 128;
                        dexAutoSlippageInfoParam2 = dexAutoSlippageInfoParam4;
                        list2 = list4;
                        list4 = list2;
                        str26 = str21;
                        kSerializerArr = kSerializerArr2;
                        dexAutoSlippageInfoParam4 = dexAutoSlippageInfoParam2;
                        break;
                    case 8:
                        str21 = str26;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 |= 256;
                        dexAutoSlippageInfoParam2 = dexAutoSlippageInfoParam4;
                        list2 = list4;
                        list4 = list2;
                        str26 = str21;
                        kSerializerArr = kSerializerArr2;
                        dexAutoSlippageInfoParam4 = dexAutoSlippageInfoParam2;
                        break;
                    case 9:
                        str21 = str26;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i4 |= 512;
                        dexAutoSlippageInfoParam2 = dexAutoSlippageInfoParam4;
                        list2 = list4;
                        list4 = list2;
                        str26 = str21;
                        kSerializerArr = kSerializerArr2;
                        dexAutoSlippageInfoParam4 = dexAutoSlippageInfoParam2;
                        break;
                    case 10:
                        str21 = str26;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool5);
                        i4 |= 1024;
                        dexAutoSlippageInfoParam2 = dexAutoSlippageInfoParam4;
                        list2 = list4;
                        list4 = list2;
                        str26 = str21;
                        kSerializerArr = kSerializerArr2;
                        dexAutoSlippageInfoParam4 = dexAutoSlippageInfoParam2;
                        break;
                    case 11:
                        bool2 = bool5;
                        i4 |= 2048;
                        str20 = str26;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        bool5 = bool2;
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    case 12:
                        bool2 = bool5;
                        i4 |= 4096;
                        str20 = str26;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        bool5 = bool2;
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    case 13:
                        bool2 = bool5;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                        i4 |= 8192;
                        str20 = str26;
                        bool5 = bool2;
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    case 14:
                        str20 = str26;
                        i4 |= 16384;
                        bool5 = bool5;
                        traceData3 = (TraceData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, TraceData$$serializer.INSTANCE, traceData3);
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    case 15:
                        bool2 = bool5;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str30);
                        i2 = 32768;
                        i4 = i2 | i4;
                        str20 = str26;
                        bool5 = bool2;
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    case 16:
                        bool2 = bool5;
                        serviceFeeInfo3 = (ServiceFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, ServiceFeeInfo$$serializer.INSTANCE, serviceFeeInfo3);
                        i2 = 65536;
                        i4 = i2 | i4;
                        str20 = str26;
                        bool5 = bool2;
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    case 17:
                        bool2 = bool5;
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, num5);
                        i2 = 131072;
                        i4 = i2 | i4;
                        str20 = str26;
                        bool5 = bool2;
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    case 18:
                        bool2 = bool5;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, num6);
                        i2 = 262144;
                        i4 = i2 | i4;
                        str20 = str26;
                        bool5 = bool2;
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    case 19:
                        bool2 = bool5;
                        dexAutoSlippageInfoParam4 = (DexAutoSlippageInfoParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, DexAutoSlippageInfoParam$$serializer.INSTANCE, dexAutoSlippageInfoParam4);
                        i2 = 524288;
                        i4 = i2 | i4;
                        str20 = str26;
                        bool5 = bool2;
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    case 20:
                        bool2 = bool5;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, str27);
                        i2 = 1048576;
                        i4 = i2 | i4;
                        str20 = str26;
                        bool5 = bool2;
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    case 21:
                        bool2 = bool5;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, str28);
                        i2 = 2097152;
                        i4 = i2 | i4;
                        str20 = str26;
                        bool5 = bool2;
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    case 22:
                        bool2 = bool5;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, str26);
                        i2 = 4194304;
                        i4 = i2 | i4;
                        str20 = str26;
                        bool5 = bool2;
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    case 23:
                        bool3 = bool5;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i3 = 8388608;
                        i4 = i3 | i4;
                        str21 = str26;
                        bool5 = bool3;
                        dexAutoSlippageInfoParam2 = dexAutoSlippageInfoParam4;
                        list2 = list4;
                        list4 = list2;
                        str26 = str21;
                        kSerializerArr = kSerializerArr2;
                        dexAutoSlippageInfoParam4 = dexAutoSlippageInfoParam2;
                        break;
                    case 24:
                        bool3 = bool5;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i3 = 16777216;
                        i4 = i3 | i4;
                        str21 = str26;
                        bool5 = bool3;
                        dexAutoSlippageInfoParam2 = dexAutoSlippageInfoParam4;
                        list2 = list4;
                        list4 = list2;
                        str26 = str21;
                        kSerializerArr = kSerializerArr2;
                        dexAutoSlippageInfoParam4 = dexAutoSlippageInfoParam2;
                        break;
                    case 25:
                        bool2 = bool5;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, str31);
                        i2 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i4 = i2 | i4;
                        str20 = str26;
                        bool5 = bool2;
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    case 26:
                        bool2 = bool5;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, str29);
                        i2 = 67108864;
                        i4 = i2 | i4;
                        str20 = str26;
                        bool5 = bool2;
                        str26 = str20;
                        kSerializerArr = kSerializerArr2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str27;
            num = num5;
            str2 = str28;
            traceData = traceData3;
            str3 = str30;
            serviceFeeInfo = serviceFeeInfo3;
            num2 = num6;
            str4 = strDecodeStringElement14;
            str5 = strDecodeStringElement15;
            str6 = strDecodeStringElement16;
            z = zDecodeBooleanElement2;
            str7 = strDecodeStringElement17;
            str8 = strDecodeStringElement18;
            str9 = str26;
            str10 = strDecodeStringElement19;
            str11 = strDecodeStringElement23;
            str12 = strDecodeStringElement24;
            str13 = strDecodeStringElement25;
            dexAutoSlippageInfoParam = dexAutoSlippageInfoParam4;
            list = list4;
            bool = bool5;
            i = i4;
            str14 = str31;
            str15 = str29;
            str16 = strDecodeStringElement20;
            str17 = strDecodeStringElement21;
            str18 = strDecodeStringElement22;
            str19 = strDecodeStringElement26;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AdvancedCallDataRequest(i, list, str19, str13, str12, str11, str18, str17, str16, str4, str5, bool, str6, str10, z, traceData, str3, serviceFeeInfo, num, num2, dexAutoSlippageInfoParam, str, str2, str9, str7, str8, str14, str15, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AdvancedCallDataRequest advancedCallDataRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(advancedCallDataRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AdvancedCallDataRequest.write$Self$OKDex_dex_impl(advancedCallDataRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
