package com.okinc.business.invest_biz.data.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class InvestOrderBean$$serializer implements GeneratedSerializer<InvestOrderBean> {
    public static final int $stable;
    public static final InvestOrderBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestOrderBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestOrderBean$$serializer investOrderBean$$serializer = new InvestOrderBean$$serializer();
        INSTANCE = investOrderBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestOrderBean", investOrderBean$$serializer, 32);
        pluginGeneratedSerialDescriptor.addElement("bottomRightLogoList", true);
        pluginGeneratedSerialDescriptor.addElement("browserUrl", true);
        pluginGeneratedSerialDescriptor.addElement(WiseOpenHianalyticsData.UNION_COSTTIME, true);
        pluginGeneratedSerialDescriptor.addElement("createTime", true);
        pluginGeneratedSerialDescriptor.addElement("investInfo", true);
        pluginGeneratedSerialDescriptor.addElement("investType", true);
        pluginGeneratedSerialDescriptor.addElement("investmentId", true);
        pluginGeneratedSerialDescriptor.addElement("investmentName", true);
        pluginGeneratedSerialDescriptor.addElement("middleLogoList", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("networkName", true);
        pluginGeneratedSerialDescriptor.addElement("nickname", true);
        pluginGeneratedSerialDescriptor.addElement("orderId", true);
        pluginGeneratedSerialDescriptor.addElement("orderStatus", true);
        pluginGeneratedSerialDescriptor.addElement("orderType", true);
        pluginGeneratedSerialDescriptor.addElement("orderVoStatus", true);
        pluginGeneratedSerialDescriptor.addElement("platformId", true);
        pluginGeneratedSerialDescriptor.addElement("platformLogo", true);
        pluginGeneratedSerialDescriptor.addElement("platformName", true);
        pluginGeneratedSerialDescriptor.addElement("sourcePlatformName", true);
        pluginGeneratedSerialDescriptor.addElement("tokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("topLeftLogoList", true);
        pluginGeneratedSerialDescriptor.addElement("topRightLogoList", true);
        pluginGeneratedSerialDescriptor.addElement("totalValue", true);
        pluginGeneratedSerialDescriptor.addElement("txHash", true);
        pluginGeneratedSerialDescriptor.addElement("txId", true);
        pluginGeneratedSerialDescriptor.addElement("underlyingToken", true);
        pluginGeneratedSerialDescriptor.addElement("updateTime", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("uopHash", true);
        pluginGeneratedSerialDescriptor.addElement("poolId", true);
        pluginGeneratedSerialDescriptor.addElement("investmentClassify", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InvestOrderBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], stringSerializer, stringSerializer, longSerializer, kSerializerArr[4], intSerializer, longSerializer, stringSerializer, kSerializerArr[8], stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[20], kSerializerArr[21], kSerializerArr[22], stringSerializer, stringSerializer, stringSerializer, kSerializerArr[26], longSerializer, longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestOrderBean deserialize(@NotNull Decoder decoder) {
        int i;
        int i2;
        int i3;
        List list;
        List list2;
        List list3;
        String str;
        List list4;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String strDecodeStringElement;
        String str7;
        String str8;
        String str9;
        String str10;
        int i4;
        long j;
        long j2;
        long j3;
        int i5;
        List list5;
        List list6;
        String str11;
        String str12;
        long j4;
        List list7;
        String str13;
        String str14;
        String strDecodeStringElement2;
        KSerializer[] kSerializerArr;
        List list8;
        int iDecodeIntElement;
        List list9;
        List list10;
        List list11;
        int i6;
        char c;
        int iDecodeIntElement2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = InvestOrderBean.$childSerializers;
        int i13 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list12 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr2[0], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            List list13 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr2[4], null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            List list14 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr2[8], null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 14);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
            int iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 16);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            List list15 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 20, kSerializerArr2[20], null);
            List list16 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 21, kSerializerArr2[21], null);
            List list17 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 22, kSerializerArr2[22], null);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            List list18 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 26, kSerializerArr2[26], null);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 27);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 28);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 29, stringSerializer, null);
            str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 30, stringSerializer, null);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            j2 = jDecodeLongElement3;
            j3 = jDecodeLongElement4;
            str11 = str15;
            str13 = strDecodeStringElement13;
            str2 = strDecodeStringElement12;
            list6 = list18;
            list3 = list17;
            str = strDecodeStringElement14;
            i = iDecodeIntElement7;
            i13 = -1;
            list = list16;
            list4 = list15;
            list2 = list14;
            str8 = strDecodeStringElement5;
            str9 = strDecodeStringElement4;
            str6 = strDecodeStringElement11;
            str3 = strDecodeStringElement10;
            str14 = strDecodeStringElement9;
            i5 = iDecodeIntElement6;
            j = jDecodeLongElement2;
            j4 = jDecodeLongElement;
            list7 = list13;
            i4 = iDecodeIntElement3;
            list5 = list12;
            i2 = iDecodeIntElement5;
            str4 = strDecodeStringElement7;
            str5 = strDecodeStringElement6;
            str10 = strDecodeStringElement3;
            i3 = iDecodeIntElement4;
            str7 = strDecodeStringElement8;
        } else {
            boolean z = true;
            List list19 = null;
            List list20 = null;
            List list21 = null;
            String str16 = null;
            List list22 = null;
            String str17 = null;
            List list23 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            List list24 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String str18 = null;
            List list25 = null;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            long j5 = 0;
            long j6 = 0;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        list8 = list19;
                        iDecodeIntElement = i14;
                        Unit unit = Unit.INSTANCE;
                        list9 = list24;
                        z = false;
                        list19 = list8;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 0:
                        list8 = list19;
                        iDecodeIntElement = i14;
                        list10 = list24;
                        kSerializerArr = kSerializerArr2;
                        List list26 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr2[0], list25);
                        i13 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        list25 = list26;
                        list9 = list10;
                        list19 = list8;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 1:
                        list8 = list19;
                        iDecodeIntElement = i14;
                        list10 = list24;
                        String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i13 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        str18 = strDecodeStringElement28;
                        kSerializerArr = kSerializerArr2;
                        list9 = list10;
                        list19 = list8;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 2:
                        iDecodeIntElement = i14;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i13 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        list19 = list19;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 3:
                        iDecodeIntElement = i14;
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i13 |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        list19 = list19;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 4:
                        iDecodeIntElement = i14;
                        list11 = list19;
                        list24 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr2[4], list24);
                        i6 = i13 | 16;
                        Unit unit6 = Unit.INSTANCE;
                        i13 = i6;
                        list19 = list11;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 5:
                        iDecodeIntElement = i14;
                        int iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i13 |= 32;
                        Unit unit7 = Unit.INSTANCE;
                        i16 = iDecodeIntElement10;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 6:
                        iDecodeIntElement = i14;
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i13 |= 64;
                        Unit unit8 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 7:
                        iDecodeIntElement = i14;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i13 |= 128;
                        Unit unit9 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 8:
                        iDecodeIntElement = i14;
                        list22 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr2[8], list22);
                        i6 = i13 | 256;
                        list11 = list19;
                        Unit unit62 = Unit.INSTANCE;
                        i13 = i6;
                        list19 = list11;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 9:
                        iDecodeIntElement = i14;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i13 |= 512;
                        Unit unit10 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 10:
                        iDecodeIntElement = i14;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i13 |= 1024;
                        Unit unit102 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 11:
                        iDecodeIntElement = i14;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i13 |= 2048;
                        Unit unit1022 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 12:
                        iDecodeIntElement = i14;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i13 |= 4096;
                        Unit unit10222 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 13:
                        iDecodeIntElement = i14;
                        c = '\r';
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
                        i13 |= 8192;
                        Unit unit11 = Unit.INSTANCE;
                        i15 = iDecodeIntElement2;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 14:
                        iDecodeIntElement = i14;
                        i13 |= 16384;
                        iDecodeIntElement2 = i15;
                        c = '\r';
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 14);
                        Unit unit112 = Unit.INSTANCE;
                        i15 = iDecodeIntElement2;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 15:
                        i7 = 32768;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
                        i13 |= i7;
                        Unit unit12 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 16:
                        iDecodeIntElement = i14;
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 16);
                        i13 |= 65536;
                        iDecodeIntElement2 = i15;
                        c = '\r';
                        Unit unit1122 = Unit.INSTANCE;
                        i15 = iDecodeIntElement2;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 17:
                        iDecodeIntElement = i14;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i8 = 131072;
                        i9 = i8 | i13;
                        Unit unit13 = Unit.INSTANCE;
                        i13 = i9;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 18:
                        iDecodeIntElement = i14;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i8 = 262144;
                        i9 = i8 | i13;
                        Unit unit132 = Unit.INSTANCE;
                        i13 = i9;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 19:
                        iDecodeIntElement = i14;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i8 = 524288;
                        i9 = i8 | i13;
                        Unit unit1322 = Unit.INSTANCE;
                        i13 = i9;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 20:
                        iDecodeIntElement = i14;
                        list19 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 20, kSerializerArr2[20], list19);
                        i7 = 1048576;
                        i13 |= i7;
                        Unit unit122 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 21:
                        iDecodeIntElement = i14;
                        list21 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 21, kSerializerArr2[21], list21);
                        i10 = 2097152;
                        i11 = i10 | i13;
                        Unit unit14 = Unit.INSTANCE;
                        i13 = i11;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 22:
                        iDecodeIntElement = i14;
                        list23 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 22, kSerializerArr2[22], list23);
                        i7 = 4194304;
                        i13 |= i7;
                        Unit unit1222 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 23:
                        iDecodeIntElement = i14;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i10 = 8388608;
                        i11 = i10 | i13;
                        Unit unit142 = Unit.INSTANCE;
                        i13 = i11;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 24:
                        iDecodeIntElement = i14;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i10 = 16777216;
                        i11 = i10 | i13;
                        Unit unit1422 = Unit.INSTANCE;
                        i13 = i11;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 25:
                        iDecodeIntElement = i14;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i10 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i11 = i10 | i13;
                        Unit unit14222 = Unit.INSTANCE;
                        i13 = i11;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 26:
                        iDecodeIntElement = i14;
                        list20 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 26, kSerializerArr2[26], list20);
                        i10 = 67108864;
                        i11 = i10 | i13;
                        Unit unit142222 = Unit.INSTANCE;
                        i13 = i11;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 27:
                        iDecodeIntElement = i14;
                        long jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 27);
                        i13 |= 134217728;
                        Unit unit15 = Unit.INSTANCE;
                        j5 = jDecodeLongElement7;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 28:
                        iDecodeIntElement = i14;
                        long jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 28);
                        i13 |= 268435456;
                        Unit unit16 = Unit.INSTANCE;
                        j6 = jDecodeLongElement8;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 29:
                        iDecodeIntElement = i14;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, str16);
                        i12 = 536870912;
                        i9 = i12 | i13;
                        Unit unit17 = Unit.INSTANCE;
                        i13 = i9;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 30:
                        iDecodeIntElement = i14;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, str17);
                        i12 = 1073741824;
                        i9 = i12 | i13;
                        Unit unit172 = Unit.INSTANCE;
                        i13 = i9;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    case 31:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i11 = Integer.MIN_VALUE | i13;
                        Unit unit18 = Unit.INSTANCE;
                        iDecodeIntElement = i14;
                        i13 = i11;
                        kSerializerArr = kSerializerArr2;
                        list9 = list24;
                        list24 = list9;
                        kSerializerArr2 = kSerializerArr;
                        i14 = iDecodeIntElement;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement8;
            i2 = iDecodeIntElement9;
            i3 = i15;
            list = list21;
            list2 = list22;
            list3 = list23;
            str = strDecodeStringElement16;
            list4 = list19;
            str2 = strDecodeStringElement18;
            str3 = strDecodeStringElement19;
            str4 = strDecodeStringElement20;
            str5 = strDecodeStringElement21;
            str6 = strDecodeStringElement22;
            strDecodeStringElement = strDecodeStringElement24;
            str7 = strDecodeStringElement25;
            str8 = strDecodeStringElement26;
            str9 = strDecodeStringElement27;
            str10 = str18;
            i4 = i16;
            j = jDecodeLongElement5;
            j2 = j5;
            j3 = j6;
            i5 = i14;
            list5 = list25;
            list6 = list20;
            str11 = str16;
            str12 = str17;
            j4 = jDecodeLongElement6;
            list7 = list24;
            String str19 = strDecodeStringElement17;
            str13 = strDecodeStringElement15;
            str14 = strDecodeStringElement23;
            strDecodeStringElement2 = str19;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestOrderBean(i13, 0, list5, str10, str9, j4, list7, i4, j, str8, list2, str5, str4, str7, strDecodeStringElement, i3, i2, i5, i, str14, str3, str6, list4, list, list3, str2, str13, str, list6, j2, j3, str11, str12, strDecodeStringElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestOrderBean investOrderBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investOrderBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestOrderBean.write$Self$OKDeFi_invest_biz(investOrderBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
