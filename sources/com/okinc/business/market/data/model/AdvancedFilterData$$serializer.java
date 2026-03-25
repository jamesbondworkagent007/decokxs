package com.okinc.business.market.data.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.common.constants.RankingType;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.common.constants.TokenAgeType;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class AdvancedFilterData$$serializer implements GeneratedSerializer<AdvancedFilterData> {
    public static final int $stable;
    public static final AdvancedFilterData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AdvancedFilterData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AdvancedFilterData$$serializer advancedFilterData$$serializer = new AdvancedFilterData$$serializer();
        INSTANCE = advancedFilterData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.AdvancedFilterData", advancedFilterData$$serializer, 37);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("changePeriod", true);
        pluginGeneratedSerialDescriptor.addElement("changeMin", true);
        pluginGeneratedSerialDescriptor.addElement("changeMax", true);
        pluginGeneratedSerialDescriptor.addElement("desc", true);
        pluginGeneratedSerialDescriptor.addElement("holdersMin", true);
        pluginGeneratedSerialDescriptor.addElement("holdersMax", true);
        pluginGeneratedSerialDescriptor.addElement("liquidityMin", true);
        pluginGeneratedSerialDescriptor.addElement("liquidityMax", true);
        pluginGeneratedSerialDescriptor.addElement("openSource", true);
        pluginGeneratedSerialDescriptor.addElement("periodType", true);
        pluginGeneratedSerialDescriptor.addElement("riskFilter", true);
        pluginGeneratedSerialDescriptor.addElement("stableTokenFilter", true);
        pluginGeneratedSerialDescriptor.addElement("tradeNumPeriod", true);
        pluginGeneratedSerialDescriptor.addElement("tradeNumMin", true);
        pluginGeneratedSerialDescriptor.addElement("tradeNumMax", true);
        pluginGeneratedSerialDescriptor.addElement("txsPeriod", true);
        pluginGeneratedSerialDescriptor.addElement("txsMin", true);
        pluginGeneratedSerialDescriptor.addElement("txsMax", true);
        pluginGeneratedSerialDescriptor.addElement("volumeMin", true);
        pluginGeneratedSerialDescriptor.addElement("volumeMax", true);
        pluginGeneratedSerialDescriptor.addElement("volumePeriod", true);
        pluginGeneratedSerialDescriptor.addElement("categoryType", true);
        pluginGeneratedSerialDescriptor.addElement("rankBy", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAgeType", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAgeMin", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAgeMax", true);
        pluginGeneratedSerialDescriptor.addElement("pageSize", true);
        pluginGeneratedSerialDescriptor.addElement("page", true);
        pluginGeneratedSerialDescriptor.addElement("totalPage", true);
        pluginGeneratedSerialDescriptor.addElement("uniqueTraderPeriod", true);
        pluginGeneratedSerialDescriptor.addElement("uniqueTraderMin", true);
        pluginGeneratedSerialDescriptor.addElement("uniqueTraderMax", true);
        pluginGeneratedSerialDescriptor.addElement("mentionedPeriod", true);
        pluginGeneratedSerialDescriptor.addElement("projectIds", true);
        pluginGeneratedSerialDescriptor.addElement("marketCapMin", true);
        pluginGeneratedSerialDescriptor.addElement("marketCapMax", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AdvancedFilterData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializerArr[1], stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, kSerializerArr[10], booleanSerializer, booleanSerializer, kSerializerArr[13], stringSerializer, stringSerializer, kSerializerArr[16], stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[21], intSerializer, kSerializerArr[23], kSerializerArr[24], stringSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, kSerializerArr[30], stringSerializer, stringSerializer, kSerializerArr[33], stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AdvancedFilterData deserialize(@NotNull Decoder decoder) {
        TimeIntervalType timeIntervalType;
        TimeIntervalType timeIntervalType2;
        TimeIntervalType timeIntervalType3;
        TimeIntervalType timeIntervalType4;
        int i;
        int i2;
        TokenAgeType tokenAgeType;
        int i3;
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z2;
        boolean z3;
        boolean z4;
        TimeIntervalType timeIntervalType5;
        TimeIntervalType timeIntervalType6;
        String str9;
        String str10;
        String str11;
        String str12;
        int i4;
        RankingType rankingType;
        TimeIntervalType timeIntervalType7;
        String str13;
        String str14;
        String str15;
        String str16;
        String strDecodeStringElement;
        int i5;
        String str17;
        int i6;
        String str18;
        String str19;
        KSerializer[] kSerializerArr;
        TimeIntervalType timeIntervalType8;
        int i7;
        int i8;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = AdvancedFilterData.$childSerializers;
        int i11 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            timeIntervalType5 = (TimeIntervalType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr2[1], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            TimeIntervalType timeIntervalType9 = (TimeIntervalType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr2[10], null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            TimeIntervalType timeIntervalType10 = (TimeIntervalType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, kSerializerArr2[13], null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            str4 = strDecodeStringElement9;
            TimeIntervalType timeIntervalType11 = (TimeIntervalType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, kSerializerArr2[16], null);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            TimeIntervalType timeIntervalType12 = (TimeIntervalType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 21, kSerializerArr2[21], null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 22);
            RankingType rankingType2 = (RankingType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 23, kSerializerArr2[23], null);
            TokenAgeType tokenAgeType2 = (TokenAgeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 24, kSerializerArr2[24], null);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 27);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 28);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 29);
            TimeIntervalType timeIntervalType13 = (TimeIntervalType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 30, kSerializerArr2[30], null);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
            TimeIntervalType timeIntervalType14 = (TimeIntervalType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 33, kSerializerArr2[33], null);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
            timeIntervalType = timeIntervalType14;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
            str11 = strDecodeStringElement19;
            str13 = strDecodeStringElement18;
            str10 = strDecodeStringElement20;
            str5 = strDecodeStringElement8;
            z3 = zDecodeBooleanElement;
            str18 = strDecodeStringElement17;
            timeIntervalType6 = timeIntervalType11;
            str16 = strDecodeStringElement14;
            str15 = strDecodeStringElement5;
            str7 = strDecodeStringElement4;
            i5 = iDecodeIntElement;
            str14 = strDecodeStringElement2;
            str3 = strDecodeStringElement10;
            str9 = strDecodeStringElement13;
            timeIntervalType7 = timeIntervalType12;
            tokenAgeType = tokenAgeType2;
            i4 = 31;
            z4 = zDecodeBooleanElement3;
            str19 = strDecodeStringElement15;
            z2 = zDecodeBooleanElement2;
            str6 = strDecodeStringElement6;
            str12 = strDecodeStringElement11;
            z = zDecodeBooleanElement4;
            timeIntervalType3 = timeIntervalType10;
            str17 = strDecodeStringElement12;
            i2 = -1;
            timeIntervalType4 = timeIntervalType13;
            rankingType = rankingType2;
            str2 = strDecodeStringElement7;
            timeIntervalType2 = timeIntervalType9;
            str8 = strDecodeStringElement3;
            i6 = iDecodeIntElement4;
            i = iDecodeIntElement3;
            i3 = iDecodeIntElement2;
            str = strDecodeStringElement16;
        } else {
            int iDecodeIntElement5 = 0;
            int i12 = 0;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            int i13 = 0;
            boolean z5 = true;
            TimeIntervalType timeIntervalType15 = null;
            TimeIntervalType timeIntervalType16 = null;
            TimeIntervalType timeIntervalType17 = null;
            RankingType rankingType3 = null;
            TimeIntervalType timeIntervalType18 = null;
            TimeIntervalType timeIntervalType19 = null;
            TokenAgeType tokenAgeType3 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
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
            TimeIntervalType timeIntervalType20 = null;
            TimeIntervalType timeIntervalType21 = null;
            int iDecodeIntElement8 = 0;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        timeIntervalType8 = timeIntervalType20;
                        Unit unit = Unit.INSTANCE;
                        z5 = false;
                        timeIntervalType20 = timeIntervalType8;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        timeIntervalType8 = timeIntervalType20;
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i12 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        timeIntervalType20 = timeIntervalType8;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        timeIntervalType20 = (TimeIntervalType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr2[1], timeIntervalType20);
                        i12 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 2:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i12 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 3:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i12 |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 4:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i12 |= 16;
                        Unit unit6 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 5:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i12 |= 32;
                        Unit unit7 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 6:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i12 |= 64;
                        Unit unit8 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 7:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i12 |= 128;
                        Unit unit9 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 8:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i12 |= 256;
                        Unit unit10 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 9:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i12 |= 512;
                        Unit unit11 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 10:
                        timeIntervalType15 = (TimeIntervalType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i11, kSerializerArr2[i11], timeIntervalType15);
                        Unit unit12 = Unit.INSTANCE;
                        i7 = i12 | 1024;
                        kSerializerArr = kSerializerArr2;
                        i12 = i7;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 11:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i12 |= 2048;
                        Unit unit13 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 12:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i12 |= 4096;
                        Unit unit14 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 13:
                        timeIntervalType16 = (TimeIntervalType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, kSerializerArr2[13], timeIntervalType16);
                        int i14 = i12 | 8192;
                        Unit unit15 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        i12 = i14;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 14:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i12 |= 16384;
                        Unit unit16 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 15:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i8 = 32768;
                        i12 |= i8;
                        Unit unit162 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 16:
                        timeIntervalType17 = (TimeIntervalType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, kSerializerArr2[16], timeIntervalType17);
                        i8 = 65536;
                        i12 |= i8;
                        Unit unit1622 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 17:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i9 = 131072;
                        i12 |= i9;
                        Unit unit142 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 18:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i9 = 262144;
                        i12 |= i9;
                        Unit unit1422 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 19:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i9 = 524288;
                        i12 |= i9;
                        Unit unit14222 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 20:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i9 = 1048576;
                        i12 |= i9;
                        Unit unit142222 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 21:
                        TimeIntervalType timeIntervalType22 = (TimeIntervalType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 21, kSerializerArr2[21], timeIntervalType19);
                        i12 |= 2097152;
                        Unit unit17 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        timeIntervalType19 = timeIntervalType22;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 22:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 22);
                        i8 = 4194304;
                        i12 |= i8;
                        Unit unit16222 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 23:
                        rankingType3 = (RankingType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 23, kSerializerArr2[23], rankingType3);
                        i8 = 8388608;
                        i12 |= i8;
                        Unit unit162222 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 24:
                        tokenAgeType3 = (TokenAgeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 24, kSerializerArr2[24], tokenAgeType3);
                        Unit unit18 = Unit.INSTANCE;
                        i12 |= 16777216;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 25:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i8 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i12 |= i8;
                        Unit unit1622222 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 26:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i8 = 67108864;
                        i12 |= i8;
                        Unit unit16222222 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 27:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 27);
                        Unit unit19 = Unit.INSTANCE;
                        i7 = 134217728 | i12;
                        kSerializerArr = kSerializerArr2;
                        i12 = i7;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 28:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 28);
                        i8 = 268435456;
                        i12 |= i8;
                        Unit unit162222222 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 29:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 29);
                        i8 = 536870912;
                        i12 |= i8;
                        Unit unit1622222222 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 30:
                        timeIntervalType18 = (TimeIntervalType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 30, kSerializerArr2[30], timeIntervalType18);
                        i8 = 1073741824;
                        i12 |= i8;
                        Unit unit16222222222 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 31:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i12 |= Integer.MIN_VALUE;
                        Unit unit20 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 32:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
                        i13 |= 1;
                        Unit unit21 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 33:
                        timeIntervalType21 = (TimeIntervalType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 33, kSerializerArr2[33], timeIntervalType21);
                        int i15 = i13 | 2;
                        Unit unit22 = Unit.INSTANCE;
                        kSerializerArr = kSerializerArr2;
                        i13 = i15;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 34:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
                        i10 = i13 | 4;
                        Unit unit23 = Unit.INSTANCE;
                        i13 = i10;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 35:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
                        i10 = i13 | 8;
                        Unit unit232 = Unit.INSTANCE;
                        i13 = i10;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    case 36:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
                        i10 = i13 | 16;
                        Unit unit2322 = Unit.INSTANCE;
                        i13 = i10;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        i11 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            timeIntervalType = timeIntervalType21;
            timeIntervalType2 = timeIntervalType15;
            timeIntervalType3 = timeIntervalType16;
            timeIntervalType4 = timeIntervalType18;
            i = iDecodeIntElement8;
            i2 = i12;
            tokenAgeType = tokenAgeType3;
            i3 = iDecodeIntElement6;
            str = strDecodeStringElement23;
            z = zDecodeBooleanElement5;
            str2 = strDecodeStringElement31;
            str3 = strDecodeStringElement34;
            str4 = strDecodeStringElement35;
            str5 = strDecodeStringElement36;
            str6 = strDecodeStringElement37;
            str7 = strDecodeStringElement39;
            str8 = strDecodeStringElement40;
            z2 = zDecodeBooleanElement6;
            z3 = zDecodeBooleanElement7;
            z4 = zDecodeBooleanElement8;
            timeIntervalType5 = timeIntervalType20;
            timeIntervalType6 = timeIntervalType17;
            str9 = strDecodeStringElement21;
            str10 = strDecodeStringElement25;
            str11 = strDecodeStringElement27;
            str12 = strDecodeStringElement30;
            i4 = i13;
            rankingType = rankingType3;
            timeIntervalType7 = timeIntervalType19;
            str13 = strDecodeStringElement24;
            str14 = strDecodeStringElement32;
            str15 = strDecodeStringElement38;
            str16 = strDecodeStringElement22;
            strDecodeStringElement = strDecodeStringElement26;
            i5 = iDecodeIntElement7;
            str17 = strDecodeStringElement29;
            i6 = iDecodeIntElement5;
            str18 = strDecodeStringElement28;
            str19 = strDecodeStringElement33;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AdvancedFilterData(i2, i4, str14, timeIntervalType5, str8, str7, z3, str15, str6, str2, str5, z2, timeIntervalType2, z4, z, timeIntervalType3, str4, str3, timeIntervalType6, str12, str17, str9, str16, timeIntervalType7, i5, rankingType, tokenAgeType, str19, str, i3, i, i6, timeIntervalType4, str18, str13, timeIntervalType, str11, str10, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AdvancedFilterData advancedFilterData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(advancedFilterData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AdvancedFilterData.KWHzl(advancedFilterData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
