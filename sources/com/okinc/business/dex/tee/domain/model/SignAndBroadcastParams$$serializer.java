package com.okinc.business.dex.tee.domain.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TraceData$$serializer;
import com.okinc.p2p.api.OtcExtraKeys;
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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class SignAndBroadcastParams$$serializer implements GeneratedSerializer<SignAndBroadcastParams> {
    public static final int $stable;
    public static final SignAndBroadcastParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SignAndBroadcastParams$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SignAndBroadcastParams$$serializer signAndBroadcastParams$$serializer = new SignAndBroadcastParams$$serializer();
        INSTANCE = signAndBroadcastParams$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.tee.domain.model.SignAndBroadcastParams", signAndBroadcastParams$$serializer, 27);
        pluginGeneratedSerialDescriptor.addElement("maxSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("priorityFeeType", true);
        pluginGeneratedSerialDescriptor.addElement("priorityFee", true);
        pluginGeneratedSerialDescriptor.addElement("routerModeType", true);
        pluginGeneratedSerialDescriptor.addElement("tpslConfig", true);
        pluginGeneratedSerialDescriptor.addElement("orderSource", true);
        pluginGeneratedSerialDescriptor.addElement("walletAuthParam", true);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("enableJito", true);
        pluginGeneratedSerialDescriptor.addElement("gasUsed", true);
        pluginGeneratedSerialDescriptor.addElement("mevInfo", true);
        pluginGeneratedSerialDescriptor.addElement("serviceFeeInfo", true);
        pluginGeneratedSerialDescriptor.addElement("tradeMode", false);
        pluginGeneratedSerialDescriptor.addElement("traceData", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("slippageType", true);
        pluginGeneratedSerialDescriptor.addElement("slippage", true);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("accountId", true);
        pluginGeneratedSerialDescriptor.addElement("toAmount", true);
        pluginGeneratedSerialDescriptor.addElement("dexRouterList", true);
        pluginGeneratedSerialDescriptor.addElement("teeSilentSignEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("quoteId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SignAndBroadcastParams.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(TpslConfig$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(WalletAuthParam$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(ServiceFeeInfo$$serializer.INSTANCE), IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(TraceData$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[24], booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SignAndBroadcastParams deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        ServiceFeeInfo serviceFeeInfo;
        String str;
        Boolean bool;
        int i;
        int i2;
        TraceData traceData;
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
        List list;
        boolean z;
        WalletAuthParam walletAuthParam;
        String str14;
        TpslConfig tpslConfig;
        String str15;
        String str16;
        String str17;
        KSerializer[] kSerializerArr;
        String str18;
        String str19;
        String str20;
        WalletAuthParam walletAuthParam2;
        String str21;
        String str22;
        WalletAuthParam walletAuthParam3;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = SignAndBroadcastParams.$childSerializers;
        int i5 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            TpslConfig tpslConfig2 = (TpslConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, TpslConfig$$serializer.INSTANCE, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            WalletAuthParam walletAuthParam4 = (WalletAuthParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, WalletAuthParam$$serializer.INSTANCE, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            ServiceFeeInfo serviceFeeInfo2 = (ServiceFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, ServiceFeeInfo$$serializer.INSTANCE, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            TraceData traceData2 = (TraceData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, TraceData$$serializer.INSTANCE, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 24, kSerializerArr2[24], null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 25);
            str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, stringSerializer, null);
            z = zDecodeBooleanElement;
            str12 = strDecodeStringElement3;
            str5 = strDecodeStringElement13;
            str15 = str23;
            i2 = iDecodeIntElement;
            list = list2;
            str17 = strDecodeStringElement14;
            str16 = strDecodeStringElement15;
            strDecodeStringElement2 = strDecodeStringElement11;
            str8 = strDecodeStringElement7;
            strDecodeStringElement = strDecodeStringElement10;
            traceData = traceData2;
            str6 = strDecodeStringElement12;
            serviceFeeInfo = serviceFeeInfo2;
            str9 = strDecodeStringElement6;
            str14 = strDecodeStringElement4;
            str2 = str26;
            str = str27;
            str11 = str25;
            i = 134217727;
            walletAuthParam = walletAuthParam4;
            str3 = strDecodeStringElement8;
            str4 = str24;
            str10 = strDecodeStringElement5;
            str7 = strDecodeStringElement9;
            bool = bool2;
            tpslConfig = tpslConfig2;
        } else {
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement2 = 0;
            boolean z2 = true;
            ServiceFeeInfo serviceFeeInfo3 = null;
            TpslConfig tpslConfig3 = null;
            String str28 = null;
            Boolean bool3 = null;
            List list3 = null;
            TraceData traceData3 = null;
            String str29 = null;
            String strDecodeStringElement16 = null;
            strDecodeStringElement = null;
            strDecodeStringElement2 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String str30 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String str31 = null;
            WalletAuthParam walletAuthParam5 = null;
            String str32 = null;
            String str33 = null;
            int i6 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        str19 = str30;
                        str20 = str31;
                        walletAuthParam2 = walletAuthParam5;
                        z2 = false;
                        walletAuthParam5 = walletAuthParam2;
                        str30 = str19;
                        str31 = str20;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        str20 = str31;
                        walletAuthParam2 = walletAuthParam5;
                        str19 = str30;
                        i6 |= 1;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str32);
                        walletAuthParam5 = walletAuthParam2;
                        str30 = str19;
                        str31 = str20;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        str21 = str30;
                        str20 = str31;
                        walletAuthParam2 = walletAuthParam5;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        str19 = str21;
                        walletAuthParam5 = walletAuthParam2;
                        str30 = str19;
                        str31 = str20;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        str21 = str30;
                        str20 = str31;
                        walletAuthParam2 = walletAuthParam5;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        str19 = str21;
                        walletAuthParam5 = walletAuthParam2;
                        str30 = str19;
                        str31 = str20;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 3:
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        walletAuthParam2 = walletAuthParam5;
                        str20 = str31;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str30);
                        i6 |= 8;
                        str19 = str21;
                        walletAuthParam5 = walletAuthParam2;
                        str30 = str19;
                        str31 = str20;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        tpslConfig3 = (TpslConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, TpslConfig$$serializer.INSTANCE, tpslConfig3);
                        i6 |= 16;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 5:
                        kSerializerArr = kSerializerArr2;
                        walletAuthParam3 = walletAuthParam5;
                        str18 = str33;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str31);
                        i6 |= 32;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 6:
                        kSerializerArr = kSerializerArr2;
                        i6 |= 64;
                        str18 = str33;
                        walletAuthParam3 = (WalletAuthParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, WalletAuthParam$$serializer.INSTANCE, walletAuthParam5);
                        str22 = str31;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 7:
                        i6 |= 128;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str29);
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 8:
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        i6 |= 256;
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool3);
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 9:
                        i6 |= 512;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 10:
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        i6 |= 1024;
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str28);
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 11:
                        serviceFeeInfo3 = (ServiceFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, ServiceFeeInfo$$serializer.INSTANCE, serviceFeeInfo3);
                        i3 = i6 | 2048;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        i6 = i3;
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 12:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        i6 |= 4096;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 13:
                        i6 |= 8192;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        traceData3 = (TraceData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, TraceData$$serializer.INSTANCE, traceData3);
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 14:
                        i6 |= 16384;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 15:
                        i6 |= 32768;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 16:
                        i6 |= 65536;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 17:
                        i6 |= 131072;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 18:
                        i6 |= 262144;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 19:
                        i6 |= 524288;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 20:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i4 = 1048576;
                        i3 = i4 | i6;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        i6 = i3;
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 21:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i4 = 2097152;
                        i3 = i4 | i6;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        i6 = i3;
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 22:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i4 = 4194304;
                        i3 = i4 | i6;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        i6 = i3;
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 23:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i4 = 8388608;
                        i3 = i4 | i6;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        i6 = i3;
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 24:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 24, kSerializerArr2[24], list3);
                        i4 = 16777216;
                        i3 = i4 | i6;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        i6 = i3;
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 25:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 25);
                        i4 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i3 = i4 | i6;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        i6 = i3;
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    case 26:
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, str33);
                        i4 = 67108864;
                        i3 = i4 | i6;
                        kSerializerArr = kSerializerArr2;
                        str18 = str33;
                        i6 = i3;
                        str22 = str31;
                        walletAuthParam3 = walletAuthParam5;
                        str31 = str22;
                        walletAuthParam5 = walletAuthParam3;
                        str33 = str18;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            serviceFeeInfo = serviceFeeInfo3;
            str = str28;
            bool = bool3;
            i = i6;
            i2 = iDecodeIntElement2;
            traceData = traceData3;
            str2 = str29;
            str3 = strDecodeStringElement16;
            str4 = str30;
            str5 = strDecodeStringElement19;
            str6 = strDecodeStringElement20;
            str7 = strDecodeStringElement21;
            str8 = strDecodeStringElement22;
            str9 = strDecodeStringElement23;
            str10 = strDecodeStringElement24;
            str11 = str31;
            str12 = strDecodeStringElement26;
            str13 = str33;
            list = list3;
            z = zDecodeBooleanElement2;
            walletAuthParam = walletAuthParam5;
            str14 = strDecodeStringElement25;
            tpslConfig = tpslConfig3;
            str15 = str32;
            String str34 = strDecodeStringElement18;
            str16 = strDecodeStringElement17;
            str17 = str34;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SignAndBroadcastParams(i, str15, str12, str14, str4, tpslConfig, str11, walletAuthParam, str2, bool, str10, str, serviceFeeInfo, i2, traceData, str9, str8, str3, str7, strDecodeStringElement, strDecodeStringElement2, str6, str5, str17, str16, list, z, str13, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SignAndBroadcastParams signAndBroadcastParams) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(signAndBroadcastParams, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SignAndBroadcastParams.write$Self$OKDex_dex_impl(signAndBroadcastParams, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
