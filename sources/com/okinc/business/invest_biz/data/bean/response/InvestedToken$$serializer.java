package com.okinc.business.invest_biz.data.bean.response;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.InvestLogo;
import com.okinc.business.invest_biz.data.bean.InvestLogo$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation$$serializer;
import com.okinc.business.invest_biz.data.bean.NetworkLogoUrl;
import com.okinc.business.invest_biz.data.bean.NetworkLogoUrl$$serializer;
import com.okinc.business.invest_biz.data.bean.Perpetual;
import com.okinc.business.invest_biz.data.bean.Perpetual$$serializer;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.contants.V3BonusStatus;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestedToken$$serializer implements GeneratedSerializer<InvestedToken> {
    public static final int $stable;
    public static final InvestedToken$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestedToken$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestedToken$$serializer investedToken$$serializer = new InvestedToken$$serializer();
        INSTANCE = investedToken$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.response.InvestedToken", investedToken$$serializer, 27);
        pluginGeneratedSerialDescriptor.addElement("aggregateProductId", true);
        pluginGeneratedSerialDescriptor.addElement("sourceInvestmentId", true);
        pluginGeneratedSerialDescriptor.addElement("investmentId", true);
        pluginGeneratedSerialDescriptor.addElement("specialPositionAssetKey", true);
        pluginGeneratedSerialDescriptor.addElement("investmentCategory", true);
        pluginGeneratedSerialDescriptor.addElement("investType", true);
        pluginGeneratedSerialDescriptor.addElement("investLogo", true);
        pluginGeneratedSerialDescriptor.addElement("networkLog", true);
        pluginGeneratedSerialDescriptor.addElement("investmentName", true);
        pluginGeneratedSerialDescriptor.addElement("isHaveV3Bonus", true);
        pluginGeneratedSerialDescriptor.addElement("investName", true);
        pluginGeneratedSerialDescriptor.addElement("totalValue", true);
        pluginGeneratedSerialDescriptor.addElement("isInvestTypeSupport", true);
        pluginGeneratedSerialDescriptor.addElement("extraData", true);
        pluginGeneratedSerialDescriptor.addElement("extraFieldList", true);
        pluginGeneratedSerialDescriptor.addElement("perpetual", true);
        pluginGeneratedSerialDescriptor.addElement("extraAssetList", true);
        pluginGeneratedSerialDescriptor.addElement("supplied", true);
        pluginGeneratedSerialDescriptor.addElement("borrowed", true);
        pluginGeneratedSerialDescriptor.addElement("rewards", true);
        pluginGeneratedSerialDescriptor.addElement("unclaimedFeeRewards", true);
        pluginGeneratedSerialDescriptor.addElement("positionInfoList", true);
        pluginGeneratedSerialDescriptor.addElement("totalEarnings", true);
        pluginGeneratedSerialDescriptor.addElement("healthRate", true);
        pluginGeneratedSerialDescriptor.addElement("investmentClassify", true);
        pluginGeneratedSerialDescriptor.addElement("totalRewardValue", true);
        pluginGeneratedSerialDescriptor.addElement("feeRate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InvestedToken.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, longSerializer, longSerializer, stringSerializer, kSerializerArr[4], kSerializerArr[5], InvestLogo$$serializer.INSTANCE, NetworkLogoUrl$$serializer.INSTANCE, stringSerializer, kSerializerArr[9], stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, InvestUserAssetDetailPromptInformation$$serializer.INSTANCE, kSerializerArr[14], BuiltinSerializersKt.getNullable(Perpetual$$serializer.INSTANCE), kSerializerArr[16], kSerializerArr[17], kSerializerArr[18], kSerializerArr[19], kSerializerArr[20], kSerializerArr[21], stringSerializer, BuiltinSerializersKt.getNullable(HealthRate$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestedToken deserialize(@NotNull Decoder decoder) {
        InvestmentKind investmentKind;
        InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation;
        List list;
        List list2;
        String str;
        String str2;
        List list3;
        V3BonusStatus v3BonusStatus;
        String str3;
        String str4;
        String str5;
        List list4;
        long j;
        boolean z;
        long j2;
        long j3;
        String str6;
        InvestLogo investLogo;
        int i;
        Perpetual perpetual;
        List list5;
        List list6;
        HealthRate healthRate;
        List list7;
        String str7;
        String strDecodeStringElement;
        ProductType productType;
        NetworkLogoUrl networkLogoUrl;
        List list8;
        V3BonusStatus v3BonusStatus2;
        int i2;
        List list9;
        List list10;
        NetworkLogoUrl networkLogoUrl2;
        ProductType productType2;
        KSerializer[] kSerializerArr;
        V3BonusStatus v3BonusStatus3;
        NetworkLogoUrl networkLogoUrl3;
        NetworkLogoUrl networkLogoUrl4;
        InvestLogo investLogo2;
        V3BonusStatus v3BonusStatus4;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = InvestedToken.$childSerializers;
        List list11 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            InvestmentKind investmentKind2 = (InvestmentKind) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr2[4], null);
            ProductType productType3 = (ProductType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr2[5], null);
            InvestLogo investLogo3 = (InvestLogo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, InvestLogo$$serializer.INSTANCE, null);
            NetworkLogoUrl networkLogoUrl5 = (NetworkLogoUrl) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, NetworkLogoUrl$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            V3BonusStatus v3BonusStatus5 = (V3BonusStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr2[9], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            investmentKind = investmentKind2;
            InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation2 = (InvestUserAssetDetailPromptInformation) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, InvestUserAssetDetailPromptInformation$$serializer.INSTANCE, null);
            List list12 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr2[14], null);
            Perpetual perpetual2 = (Perpetual) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, Perpetual$$serializer.INSTANCE, null);
            List list13 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, kSerializerArr2[16], null);
            List list14 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr2[17], null);
            List list15 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 18, kSerializerArr2[18], null);
            List list16 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 19, kSerializerArr2[19], null);
            List list17 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 20, kSerializerArr2[20], null);
            List list18 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 21, kSerializerArr2[21], null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            HealthRate healthRate2 = (HealthRate) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, HealthRate$$serializer.INSTANCE, null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            list3 = list18;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            str7 = strDecodeStringElement7;
            str6 = strDecodeStringElement6;
            str = strDecodeStringElement8;
            list5 = list16;
            list4 = list15;
            list2 = list14;
            list6 = list13;
            investUserAssetDetailPromptInformation = investUserAssetDetailPromptInformation2;
            perpetual = perpetual2;
            j2 = jDecodeLongElement;
            list7 = list12;
            list = list17;
            healthRate = healthRate2;
            str2 = strDecodeStringElement4;
            investLogo = investLogo3;
            productType = productType3;
            v3BonusStatus = v3BonusStatus5;
            j = jDecodeLongElement2;
            str5 = strDecodeStringElement5;
            str3 = strDecodeStringElement2;
            j3 = jDecodeLongElement3;
            networkLogoUrl = networkLogoUrl5;
            str4 = strDecodeStringElement3;
            z = zDecodeBooleanElement;
            i = 134217727;
        } else {
            List list19 = null;
            InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation3 = null;
            Perpetual perpetual3 = null;
            V3BonusStatus v3BonusStatus6 = null;
            List list20 = null;
            List list21 = null;
            List list22 = null;
            List list23 = null;
            List list24 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            NetworkLogoUrl networkLogoUrl6 = null;
            ProductType productType4 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            InvestmentKind investmentKind3 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            boolean z2 = true;
            int i5 = 0;
            boolean zDecodeBooleanElement2 = false;
            long jDecodeLongElement4 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            HealthRate healthRate3 = null;
            InvestLogo investLogo4 = null;
            String strDecodeStringElement16 = null;
            while (z2) {
                InvestLogo investLogo5 = investLogo4;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list9 = list19;
                        list10 = list11;
                        networkLogoUrl2 = networkLogoUrl6;
                        productType2 = productType4;
                        kSerializerArr = kSerializerArr2;
                        v3BonusStatus3 = v3BonusStatus6;
                        z2 = false;
                        networkLogoUrl3 = networkLogoUrl2;
                        investLogo4 = investLogo5;
                        list11 = list10;
                        v3BonusStatus6 = v3BonusStatus3;
                        networkLogoUrl6 = networkLogoUrl3;
                        kSerializerArr2 = kSerializerArr;
                        productType4 = productType2;
                        list19 = list9;
                        break;
                    case 0:
                        list9 = list19;
                        list10 = list11;
                        networkLogoUrl2 = networkLogoUrl6;
                        productType2 = productType4;
                        kSerializerArr = kSerializerArr2;
                        v3BonusStatus3 = v3BonusStatus6;
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i5 |= 1;
                        networkLogoUrl3 = networkLogoUrl2;
                        investLogo4 = investLogo5;
                        list11 = list10;
                        v3BonusStatus6 = v3BonusStatus3;
                        networkLogoUrl6 = networkLogoUrl3;
                        kSerializerArr2 = kSerializerArr;
                        productType4 = productType2;
                        list19 = list9;
                        break;
                    case 1:
                        list9 = list19;
                        list10 = list11;
                        networkLogoUrl2 = networkLogoUrl6;
                        productType2 = productType4;
                        kSerializerArr = kSerializerArr2;
                        v3BonusStatus3 = v3BonusStatus6;
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i5 |= 2;
                        networkLogoUrl3 = networkLogoUrl2;
                        investLogo4 = investLogo5;
                        list11 = list10;
                        v3BonusStatus6 = v3BonusStatus3;
                        networkLogoUrl6 = networkLogoUrl3;
                        kSerializerArr2 = kSerializerArr;
                        productType4 = productType2;
                        list19 = list9;
                        break;
                    case 2:
                        list9 = list19;
                        list10 = list11;
                        networkLogoUrl2 = networkLogoUrl6;
                        productType2 = productType4;
                        kSerializerArr = kSerializerArr2;
                        v3BonusStatus3 = v3BonusStatus6;
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i5 |= 4;
                        networkLogoUrl3 = networkLogoUrl2;
                        investLogo4 = investLogo5;
                        list11 = list10;
                        v3BonusStatus6 = v3BonusStatus3;
                        networkLogoUrl6 = networkLogoUrl3;
                        kSerializerArr2 = kSerializerArr;
                        productType4 = productType2;
                        list19 = list9;
                        break;
                    case 3:
                        list9 = list19;
                        list10 = list11;
                        networkLogoUrl2 = networkLogoUrl6;
                        productType2 = productType4;
                        kSerializerArr = kSerializerArr2;
                        v3BonusStatus3 = v3BonusStatus6;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        networkLogoUrl3 = networkLogoUrl2;
                        investLogo4 = investLogo5;
                        list11 = list10;
                        v3BonusStatus6 = v3BonusStatus3;
                        networkLogoUrl6 = networkLogoUrl3;
                        kSerializerArr2 = kSerializerArr;
                        productType4 = productType2;
                        list19 = list9;
                        break;
                    case 4:
                        list9 = list19;
                        list10 = list11;
                        networkLogoUrl2 = networkLogoUrl6;
                        productType2 = productType4;
                        v3BonusStatus3 = v3BonusStatus6;
                        kSerializerArr = kSerializerArr2;
                        investmentKind3 = (InvestmentKind) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr2[4], investmentKind3);
                        i5 |= 16;
                        networkLogoUrl3 = networkLogoUrl2;
                        investLogo4 = investLogo5;
                        list11 = list10;
                        v3BonusStatus6 = v3BonusStatus3;
                        networkLogoUrl6 = networkLogoUrl3;
                        kSerializerArr2 = kSerializerArr;
                        productType4 = productType2;
                        list19 = list9;
                        break;
                    case 5:
                        list9 = list19;
                        list10 = list11;
                        networkLogoUrl4 = networkLogoUrl6;
                        v3BonusStatus3 = v3BonusStatus6;
                        productType4 = (ProductType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr2[5], productType4);
                        i5 |= 32;
                        investLogo2 = investLogo5;
                        ProductType productType5 = productType4;
                        kSerializerArr = kSerializerArr2;
                        networkLogoUrl3 = networkLogoUrl4;
                        investLogo4 = investLogo2;
                        productType2 = productType5;
                        list11 = list10;
                        v3BonusStatus6 = v3BonusStatus3;
                        networkLogoUrl6 = networkLogoUrl3;
                        kSerializerArr2 = kSerializerArr;
                        productType4 = productType2;
                        list19 = list9;
                        break;
                    case 6:
                        list9 = list19;
                        networkLogoUrl4 = networkLogoUrl6;
                        v3BonusStatus3 = v3BonusStatus6;
                        list10 = list11;
                        investLogo2 = (InvestLogo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, InvestLogo$$serializer.INSTANCE, investLogo5);
                        i5 |= 64;
                        ProductType productType52 = productType4;
                        kSerializerArr = kSerializerArr2;
                        networkLogoUrl3 = networkLogoUrl4;
                        investLogo4 = investLogo2;
                        productType2 = productType52;
                        list11 = list10;
                        v3BonusStatus6 = v3BonusStatus3;
                        networkLogoUrl6 = networkLogoUrl3;
                        kSerializerArr2 = kSerializerArr;
                        productType4 = productType2;
                        list19 = list9;
                        break;
                    case 7:
                        list9 = list19;
                        NetworkLogoUrl networkLogoUrl7 = networkLogoUrl6;
                        v3BonusStatus3 = v3BonusStatus6;
                        NetworkLogoUrl networkLogoUrl8 = (NetworkLogoUrl) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, NetworkLogoUrl$$serializer.INSTANCE, networkLogoUrl7);
                        i5 |= 128;
                        list10 = list11;
                        productType2 = productType4;
                        investLogo4 = investLogo5;
                        kSerializerArr = kSerializerArr2;
                        networkLogoUrl3 = networkLogoUrl8;
                        list11 = list10;
                        v3BonusStatus6 = v3BonusStatus3;
                        networkLogoUrl6 = networkLogoUrl3;
                        kSerializerArr2 = kSerializerArr;
                        productType4 = productType2;
                        list19 = list9;
                        break;
                    case 8:
                        list8 = list19;
                        v3BonusStatus2 = v3BonusStatus6;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i5 |= 256;
                        v3BonusStatus6 = v3BonusStatus2;
                        list19 = list8;
                        investLogo4 = investLogo5;
                        break;
                    case 9:
                        list8 = list19;
                        v3BonusStatus2 = (V3BonusStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr2[9], v3BonusStatus6);
                        i5 |= 512;
                        v3BonusStatus6 = v3BonusStatus2;
                        list19 = list8;
                        investLogo4 = investLogo5;
                        break;
                    case 10:
                        v3BonusStatus4 = v3BonusStatus6;
                        i5 |= 1024;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        investLogo4 = investLogo5;
                        v3BonusStatus6 = v3BonusStatus4;
                        break;
                    case 11:
                        v3BonusStatus4 = v3BonusStatus6;
                        i5 |= 2048;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        investLogo4 = investLogo5;
                        v3BonusStatus6 = v3BonusStatus4;
                        break;
                    case 12:
                        v3BonusStatus4 = v3BonusStatus6;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i5 |= 4096;
                        investLogo4 = investLogo5;
                        v3BonusStatus6 = v3BonusStatus4;
                        break;
                    case 13:
                        v3BonusStatus4 = v3BonusStatus6;
                        investUserAssetDetailPromptInformation3 = (InvestUserAssetDetailPromptInformation) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, InvestUserAssetDetailPromptInformation$$serializer.INSTANCE, investUserAssetDetailPromptInformation3);
                        i5 |= 8192;
                        investLogo4 = investLogo5;
                        v3BonusStatus6 = v3BonusStatus4;
                        break;
                    case 14:
                        v3BonusStatus4 = v3BonusStatus6;
                        i5 |= 16384;
                        list23 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr2[14], list23);
                        investLogo4 = investLogo5;
                        v3BonusStatus6 = v3BonusStatus4;
                        break;
                    case 15:
                        v3BonusStatus4 = v3BonusStatus6;
                        perpetual3 = (Perpetual) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, Perpetual$$serializer.INSTANCE, perpetual3);
                        i3 = 32768;
                        i5 |= i3;
                        investLogo4 = investLogo5;
                        v3BonusStatus6 = v3BonusStatus4;
                        break;
                    case 16:
                        v3BonusStatus4 = v3BonusStatus6;
                        list21 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, kSerializerArr2[16], list21);
                        i3 = 65536;
                        i5 |= i3;
                        investLogo4 = investLogo5;
                        v3BonusStatus6 = v3BonusStatus4;
                        break;
                    case 17:
                        v3BonusStatus4 = v3BonusStatus6;
                        list24 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr2[17], list24);
                        i4 = 131072;
                        i5 |= i4;
                        investLogo4 = investLogo5;
                        v3BonusStatus6 = v3BonusStatus4;
                        break;
                    case 18:
                        v3BonusStatus4 = v3BonusStatus6;
                        list19 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 18, kSerializerArr2[18], list19);
                        i3 = 262144;
                        i5 |= i3;
                        investLogo4 = investLogo5;
                        v3BonusStatus6 = v3BonusStatus4;
                        break;
                    case 19:
                        v3BonusStatus4 = v3BonusStatus6;
                        list20 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 19, kSerializerArr2[19], list20);
                        i4 = 524288;
                        i5 |= i4;
                        investLogo4 = investLogo5;
                        v3BonusStatus6 = v3BonusStatus4;
                        break;
                    case 20:
                        v3BonusStatus4 = v3BonusStatus6;
                        list22 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 20, kSerializerArr2[20], list22);
                        i3 = 1048576;
                        i5 |= i3;
                        investLogo4 = investLogo5;
                        v3BonusStatus6 = v3BonusStatus4;
                        break;
                    case 21:
                        v3BonusStatus4 = v3BonusStatus6;
                        list11 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 21, kSerializerArr2[21], list11);
                        i4 = 2097152;
                        i5 |= i4;
                        investLogo4 = investLogo5;
                        v3BonusStatus6 = v3BonusStatus4;
                        break;
                    case 22:
                        v3BonusStatus4 = v3BonusStatus6;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i3 = 4194304;
                        i5 |= i3;
                        investLogo4 = investLogo5;
                        v3BonusStatus6 = v3BonusStatus4;
                        break;
                    case 23:
                        v3BonusStatus4 = v3BonusStatus6;
                        healthRate3 = (HealthRate) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, HealthRate$$serializer.INSTANCE, healthRate3);
                        i3 = 8388608;
                        i5 |= i3;
                        investLogo4 = investLogo5;
                        v3BonusStatus6 = v3BonusStatus4;
                        break;
                    case 24:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i2 = 16777216;
                        i5 |= i2;
                        list8 = list19;
                        v3BonusStatus2 = v3BonusStatus6;
                        v3BonusStatus6 = v3BonusStatus2;
                        list19 = list8;
                        investLogo4 = investLogo5;
                        break;
                    case 25:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i2 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i5 |= i2;
                        list8 = list19;
                        v3BonusStatus2 = v3BonusStatus6;
                        v3BonusStatus6 = v3BonusStatus2;
                        list19 = list8;
                        investLogo4 = investLogo5;
                        break;
                    case 26:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i2 = 67108864;
                        i5 |= i2;
                        list8 = list19;
                        v3BonusStatus2 = v3BonusStatus6;
                        v3BonusStatus6 = v3BonusStatus2;
                        list19 = list8;
                        investLogo4 = investLogo5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list25 = list19;
            InvestLogo investLogo6 = investLogo4;
            NetworkLogoUrl networkLogoUrl9 = networkLogoUrl6;
            ProductType productType6 = productType4;
            investmentKind = investmentKind3;
            investUserAssetDetailPromptInformation = investUserAssetDetailPromptInformation3;
            list = list22;
            list2 = list24;
            str = strDecodeStringElement10;
            str2 = strDecodeStringElement11;
            list3 = list11;
            v3BonusStatus = v3BonusStatus6;
            str3 = strDecodeStringElement12;
            str4 = strDecodeStringElement13;
            str5 = strDecodeStringElement14;
            list4 = list25;
            j = jDecodeLongElement4;
            z = zDecodeBooleanElement2;
            j2 = jDecodeLongElement5;
            j3 = jDecodeLongElement6;
            str6 = strDecodeStringElement15;
            investLogo = investLogo6;
            i = i5;
            perpetual = perpetual3;
            list5 = list20;
            list6 = list21;
            healthRate = healthRate3;
            list7 = list23;
            str7 = strDecodeStringElement16;
            strDecodeStringElement = strDecodeStringElement9;
            productType = productType6;
            networkLogoUrl = networkLogoUrl9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestedToken(i, j2, j, j3, str3, investmentKind, productType, investLogo, networkLogoUrl, str4, v3BonusStatus, str2, str5, z, investUserAssetDetailPromptInformation, list7, perpetual, list6, list2, list4, list5, list, list3, str6, healthRate, str7, str, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestedToken investedToken) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investedToken, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestedToken.AEQbTJ(investedToken, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
