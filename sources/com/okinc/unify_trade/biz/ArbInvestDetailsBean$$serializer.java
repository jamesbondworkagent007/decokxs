package com.okinc.unify_trade.biz;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class ArbInvestDetailsBean$$serializer implements GeneratedSerializer<ArbInvestDetailsBean> {
    public static final int $stable;
    public static final ArbInvestDetailsBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ArbInvestDetailsBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ArbInvestDetailsBean$$serializer arbInvestDetailsBean$$serializer = new ArbInvestDetailsBean$$serializer();
        INSTANCE = arbInvestDetailsBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.ArbInvestDetailsBean", arbInvestDetailsBean$$serializer, 26);
        pluginGeneratedSerialDescriptor.addElement("arbItems", true);
        pluginGeneratedSerialDescriptor.addElement("totalAmt", true);
        pluginGeneratedSerialDescriptor.addElement("unit", true);
        pluginGeneratedSerialDescriptor.addElement("estimatingArbPnl", true);
        pluginGeneratedSerialDescriptor.addElement("estimatingEnlargeArbPnl", true);
        pluginGeneratedSerialDescriptor.addElement("instFamily", true);
        pluginGeneratedSerialDescriptor.addElement("isStaking", true);
        pluginGeneratedSerialDescriptor.addElement("spreadRatio", true);
        pluginGeneratedSerialDescriptor.addElement("marketSpreadRatio", true);
        pluginGeneratedSerialDescriptor.addElement("unitAmt", true);
        pluginGeneratedSerialDescriptor.addElement("minUnitAmt", true);
        pluginGeneratedSerialDescriptor.addElement("userExpectSpreadRatio", true);
        pluginGeneratedSerialDescriptor.addElement("userExpectUnitAmt", true);
        pluginGeneratedSerialDescriptor.addElement("arbitrageTotalPnlInfo", true);
        pluginGeneratedSerialDescriptor.addElement("allowLeverPrincipal", true);
        pluginGeneratedSerialDescriptor.addElement("enlargedAmt", true);
        pluginGeneratedSerialDescriptor.addElement("interestDebt", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedStaking", true);
        pluginGeneratedSerialDescriptor.addElement("minAmt", true);
        pluginGeneratedSerialDescriptor.addElement("displayMinPaybackDays", true);
        pluginGeneratedSerialDescriptor.addElement("highestApyPeriod", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedApyList", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedOpenCost", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedClosePnl", true);
        pluginGeneratedSerialDescriptor.addElement("closeCost", true);
        pluginGeneratedSerialDescriptor.addElement("openCost", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ArbInvestDetailsBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        CostVo$$serializer costVo$$serializer = CostVo$$serializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[6], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(ArbitrageTotalPnlInfo$$serializer.INSTANCE), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(EstimatedStakingVo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[21]), BuiltinSerializersKt.getNullable(costVo$$serializer), BuiltinSerializersKt.getNullable(EstimatedClosePnlVo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(costVo$$serializer), BuiltinSerializersKt.getNullable(costVo$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ArbInvestDetailsBean deserialize(@NotNull Decoder decoder) {
        String str;
        List list;
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo;
        String str2;
        CostVo costVo;
        CostVo costVo2;
        String str3;
        String str4;
        String str5;
        String str6;
        ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UI;
        String str7;
        String str8;
        String str9;
        boolean z;
        String str10;
        List list2;
        String str11;
        String str12;
        EstimatedClosePnlVo estimatedClosePnlVo;
        CostVo costVo3;
        int i;
        EstimatedStakingVo estimatedStakingVo;
        String str13;
        String str14;
        String str15;
        String strDecodeStringElement;
        List list3;
        String str16;
        int i2;
        List list4;
        KSerializer[] kSerializerArr;
        List list5;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UI2;
        String str23;
        String str24;
        List list6;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        List list7;
        String str30;
        String str31;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = ArbInvestDetailsBean.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr2[0], null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UI3 = (ArbInvestDetailsBeanStakingType4UI) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr2[6], null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            ArbitrageTotalPnlInfo arbitrageTotalPnlInfo2 = (ArbitrageTotalPnlInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, ArbitrageTotalPnlInfo$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            String str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            z = zDecodeBooleanElement;
            EstimatedStakingVo estimatedStakingVo2 = (EstimatedStakingVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, EstimatedStakingVo$$serializer.INSTANCE, null);
            String str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            String str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, null);
            String str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, null);
            List list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, kSerializerArr2[21], null);
            CostVo$$serializer costVo$$serializer = CostVo$$serializer.INSTANCE;
            CostVo costVo4 = (CostVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, costVo$$serializer, null);
            EstimatedClosePnlVo estimatedClosePnlVo2 = (EstimatedClosePnlVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, EstimatedClosePnlVo$$serializer.INSTANCE, null);
            CostVo costVo5 = (CostVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, costVo$$serializer, null);
            costVo3 = (CostVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, costVo$$serializer, null);
            costVo = costVo5;
            list = list9;
            costVo2 = costVo4;
            str14 = strDecodeStringElement3;
            estimatedClosePnlVo = estimatedClosePnlVo2;
            str2 = str41;
            str8 = str35;
            str11 = str32;
            arbitrageTotalPnlInfo = arbitrageTotalPnlInfo2;
            str5 = str38;
            str3 = str43;
            str4 = str42;
            str13 = str33;
            str = str39;
            str6 = str37;
            str10 = strDecodeStringElement4;
            str12 = str40;
            str9 = str36;
            arbInvestDetailsBeanStakingType4UI = arbInvestDetailsBeanStakingType4UI3;
            list2 = list8;
            estimatedStakingVo = estimatedStakingVo2;
            str7 = str34;
            str15 = strDecodeStringElement2;
            i = 67108863;
        } else {
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            List list10 = null;
            String str44 = null;
            ArbitrageTotalPnlInfo arbitrageTotalPnlInfo3 = null;
            String str45 = null;
            String str46 = null;
            String str47 = null;
            EstimatedClosePnlVo estimatedClosePnlVo3 = null;
            CostVo costVo6 = null;
            CostVo costVo7 = null;
            String str48 = null;
            EstimatedStakingVo estimatedStakingVo3 = null;
            String str49 = null;
            String str50 = null;
            String str51 = null;
            String str52 = null;
            String str53 = null;
            ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UI4 = null;
            String strDecodeStringElement5 = null;
            String str54 = null;
            String str55 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            List list11 = null;
            CostVo costVo8 = null;
            int i3 = 0;
            while (z2) {
                ArbitrageTotalPnlInfo arbitrageTotalPnlInfo4 = arbitrageTotalPnlInfo3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        list5 = list10;
                        str17 = str44;
                        str18 = str45;
                        str19 = str50;
                        str20 = str51;
                        str21 = str52;
                        str22 = str53;
                        arbInvestDetailsBeanStakingType4UI2 = arbInvestDetailsBeanStakingType4UI4;
                        str23 = str54;
                        str24 = str55;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        z2 = false;
                        list10 = list5;
                        str55 = str24;
                        str45 = str18;
                        str44 = str17;
                        str53 = str22;
                        str52 = str21;
                        kSerializerArr2 = kSerializerArr;
                        arbInvestDetailsBeanStakingType4UI4 = arbInvestDetailsBeanStakingType4UI2;
                        str54 = str23;
                        str50 = str19;
                        str51 = str20;
                        break;
                    case 0:
                        list5 = list10;
                        str17 = str44;
                        str18 = str45;
                        str19 = str50;
                        str20 = str51;
                        str21 = str52;
                        str22 = str53;
                        arbInvestDetailsBeanStakingType4UI2 = arbInvestDetailsBeanStakingType4UI4;
                        str23 = str54;
                        str24 = str55;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        kSerializerArr = kSerializerArr2;
                        i3 |= 1;
                        list11 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr2[0], list11);
                        list10 = list5;
                        str55 = str24;
                        str45 = str18;
                        str44 = str17;
                        str53 = str22;
                        str52 = str21;
                        kSerializerArr2 = kSerializerArr;
                        arbInvestDetailsBeanStakingType4UI4 = arbInvestDetailsBeanStakingType4UI2;
                        str54 = str23;
                        str50 = str19;
                        str51 = str20;
                        break;
                    case 1:
                        list6 = list10;
                        str25 = str44;
                        str26 = str45;
                        str19 = str50;
                        str20 = str51;
                        str27 = str52;
                        str28 = str53;
                        arbInvestDetailsBeanStakingType4UI2 = arbInvestDetailsBeanStakingType4UI4;
                        str23 = str54;
                        str29 = str55;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        i3 |= 2;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        list10 = list6;
                        str55 = str29;
                        str45 = str26;
                        str44 = str25;
                        str53 = str28;
                        str52 = str27;
                        arbInvestDetailsBeanStakingType4UI4 = arbInvestDetailsBeanStakingType4UI2;
                        str54 = str23;
                        str50 = str19;
                        str51 = str20;
                        break;
                    case 2:
                        list6 = list10;
                        str25 = str44;
                        str26 = str45;
                        str19 = str50;
                        str20 = str51;
                        str27 = str52;
                        str28 = str53;
                        arbInvestDetailsBeanStakingType4UI2 = arbInvestDetailsBeanStakingType4UI4;
                        str23 = str54;
                        str29 = str55;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        i3 |= 4;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        list10 = list6;
                        str55 = str29;
                        str45 = str26;
                        str44 = str25;
                        str53 = str28;
                        str52 = str27;
                        arbInvestDetailsBeanStakingType4UI4 = arbInvestDetailsBeanStakingType4UI2;
                        str54 = str23;
                        str50 = str19;
                        str51 = str20;
                        break;
                    case 3:
                        list6 = list10;
                        str25 = str44;
                        str26 = str45;
                        str19 = str50;
                        str20 = str51;
                        str27 = str52;
                        str28 = str53;
                        arbInvestDetailsBeanStakingType4UI2 = arbInvestDetailsBeanStakingType4UI4;
                        str23 = str54;
                        str29 = str55;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        i3 |= 8;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        list10 = list6;
                        str55 = str29;
                        str45 = str26;
                        str44 = str25;
                        str53 = str28;
                        str52 = str27;
                        arbInvestDetailsBeanStakingType4UI4 = arbInvestDetailsBeanStakingType4UI2;
                        str54 = str23;
                        str50 = str19;
                        str51 = str20;
                        break;
                    case 4:
                        list6 = list10;
                        str25 = str44;
                        str26 = str45;
                        str19 = str50;
                        str20 = str51;
                        str27 = str52;
                        str28 = str53;
                        arbInvestDetailsBeanStakingType4UI2 = arbInvestDetailsBeanStakingType4UI4;
                        str23 = str54;
                        str29 = str55;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        i3 |= 16;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        list10 = list6;
                        str55 = str29;
                        str45 = str26;
                        str44 = str25;
                        str53 = str28;
                        str52 = str27;
                        arbInvestDetailsBeanStakingType4UI4 = arbInvestDetailsBeanStakingType4UI2;
                        str54 = str23;
                        str50 = str19;
                        str51 = str20;
                        break;
                    case 5:
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str55 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str55);
                        i3 |= 32;
                        list10 = list10;
                        str45 = str45;
                        str44 = str44;
                        arbInvestDetailsBeanStakingType4UI4 = arbInvestDetailsBeanStakingType4UI4;
                        break;
                    case 6:
                        list6 = list10;
                        str25 = str44;
                        str26 = str45;
                        str19 = str50;
                        str20 = str51;
                        str27 = str52;
                        str28 = str53;
                        str23 = str54;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        arbInvestDetailsBeanStakingType4UI2 = (ArbInvestDetailsBeanStakingType4UI) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr2[6], arbInvestDetailsBeanStakingType4UI4);
                        i3 |= 64;
                        str29 = str55;
                        list10 = list6;
                        str55 = str29;
                        str45 = str26;
                        str44 = str25;
                        str53 = str28;
                        str52 = str27;
                        arbInvestDetailsBeanStakingType4UI4 = arbInvestDetailsBeanStakingType4UI2;
                        str54 = str23;
                        str50 = str19;
                        str51 = str20;
                        break;
                    case 7:
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str49);
                        i3 |= 128;
                        list10 = list10;
                        str45 = str45;
                        str44 = str44;
                        str54 = str54;
                        break;
                    case 8:
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str54 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str54);
                        i3 |= 256;
                        list10 = list10;
                        str45 = str45;
                        str44 = str44;
                        str50 = str50;
                        break;
                    case 9:
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str20 = str51;
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str50);
                        i3 |= 512;
                        list10 = list10;
                        str45 = str45;
                        str44 = str44;
                        str51 = str20;
                        break;
                    case 10:
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str51);
                        i3 |= 1024;
                        list10 = list10;
                        str45 = str45;
                        str44 = str44;
                        str52 = str52;
                        break;
                    case 11:
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str52);
                        i3 |= 2048;
                        list10 = list10;
                        str45 = str45;
                        str44 = str44;
                        str53 = str53;
                        break;
                    case 12:
                        list6 = list10;
                        str26 = str45;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str25 = str44;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str53);
                        i3 |= 4096;
                        str19 = str50;
                        str20 = str51;
                        str27 = str52;
                        arbInvestDetailsBeanStakingType4UI2 = arbInvestDetailsBeanStakingType4UI4;
                        str23 = str54;
                        str29 = str55;
                        list10 = list6;
                        str55 = str29;
                        str45 = str26;
                        str44 = str25;
                        str53 = str28;
                        str52 = str27;
                        arbInvestDetailsBeanStakingType4UI4 = arbInvestDetailsBeanStakingType4UI2;
                        str54 = str23;
                        str50 = str19;
                        str51 = str20;
                        break;
                    case 13:
                        list7 = list10;
                        arbitrageTotalPnlInfo3 = (ArbitrageTotalPnlInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, ArbitrageTotalPnlInfo$$serializer.INSTANCE, arbitrageTotalPnlInfo4);
                        i3 |= 8192;
                        str44 = str44;
                        str45 = str45;
                        list10 = list7;
                        break;
                    case 14:
                        list7 = list10;
                        str30 = str44;
                        str31 = str45;
                        i3 |= 16384;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                        str44 = str30;
                        str45 = str31;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        list10 = list7;
                        break;
                    case 15:
                        list7 = list10;
                        str31 = str45;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str44);
                        i3 = 32768 | i3;
                        str44 = str30;
                        str45 = str31;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        list10 = list7;
                        break;
                    case 16:
                        list3 = list10;
                        str16 = str44;
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str46);
                        i2 = 65536;
                        i3 = i2 | i3;
                        list4 = list3;
                        list10 = list4;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str44 = str16;
                        break;
                    case 17:
                        list3 = list10;
                        str16 = str44;
                        estimatedStakingVo3 = (EstimatedStakingVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, EstimatedStakingVo$$serializer.INSTANCE, estimatedStakingVo3);
                        i2 = 131072;
                        i3 = i2 | i3;
                        list4 = list3;
                        list10 = list4;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str44 = str16;
                        break;
                    case 18:
                        str16 = str44;
                        list3 = list10;
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, str47);
                        i2 = 262144;
                        i3 = i2 | i3;
                        list4 = list3;
                        list10 = list4;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str44 = str16;
                        break;
                    case 19:
                        str16 = str44;
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, str45);
                        i2 = 524288;
                        list3 = list10;
                        i3 = i2 | i3;
                        list4 = list3;
                        list10 = list4;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str44 = str16;
                        break;
                    case 20:
                        str16 = str44;
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, str48);
                        i2 = 1048576;
                        list3 = list10;
                        i3 = i2 | i3;
                        list4 = list3;
                        list10 = list4;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str44 = str16;
                        break;
                    case 21:
                        str16 = str44;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, kSerializerArr2[21], list10);
                        i3 = 2097152 | i3;
                        list10 = list4;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str44 = str16;
                        break;
                    case 22:
                        str16 = str44;
                        costVo7 = (CostVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, CostVo$$serializer.INSTANCE, costVo7);
                        i2 = 4194304;
                        list3 = list10;
                        i3 = i2 | i3;
                        list4 = list3;
                        list10 = list4;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str44 = str16;
                        break;
                    case 23:
                        str16 = str44;
                        estimatedClosePnlVo3 = (EstimatedClosePnlVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, EstimatedClosePnlVo$$serializer.INSTANCE, estimatedClosePnlVo3);
                        i2 = 8388608;
                        list3 = list10;
                        i3 = i2 | i3;
                        list4 = list3;
                        list10 = list4;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str44 = str16;
                        break;
                    case 24:
                        str16 = str44;
                        costVo6 = (CostVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, CostVo$$serializer.INSTANCE, costVo6);
                        i2 = 16777216;
                        list3 = list10;
                        i3 = i2 | i3;
                        list4 = list3;
                        list10 = list4;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str44 = str16;
                        break;
                    case 25:
                        str16 = str44;
                        costVo8 = (CostVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, CostVo$$serializer.INSTANCE, costVo8);
                        i2 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        list3 = list10;
                        i3 = i2 | i3;
                        list4 = list3;
                        list10 = list4;
                        arbitrageTotalPnlInfo3 = arbitrageTotalPnlInfo4;
                        str44 = str16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str44;
            list = list10;
            arbitrageTotalPnlInfo = arbitrageTotalPnlInfo3;
            str2 = str47;
            costVo = costVo6;
            costVo2 = costVo7;
            str3 = str48;
            str4 = str45;
            str5 = str53;
            str6 = str52;
            arbInvestDetailsBeanStakingType4UI = arbInvestDetailsBeanStakingType4UI4;
            str7 = str54;
            str8 = str50;
            str9 = str51;
            z = zDecodeBooleanElement2;
            str10 = strDecodeStringElement5;
            list2 = list11;
            str11 = str55;
            str12 = str46;
            estimatedClosePnlVo = estimatedClosePnlVo3;
            costVo3 = costVo8;
            i = i3;
            estimatedStakingVo = estimatedStakingVo3;
            str13 = str49;
            str14 = strDecodeStringElement6;
            str15 = strDecodeStringElement7;
            strDecodeStringElement = strDecodeStringElement8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ArbInvestDetailsBean(i, list2, strDecodeStringElement, str15, str14, str10, str11, arbInvestDetailsBeanStakingType4UI, str13, str7, str8, str9, str6, str5, arbitrageTotalPnlInfo, z, str, str12, estimatedStakingVo, str2, str4, str3, list, costVo2, estimatedClosePnlVo, costVo, costVo3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ArbInvestDetailsBean arbInvestDetailsBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(arbInvestDetailsBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ArbInvestDetailsBean.write$Self$OKTradeCore_trade_core(arbInvestDetailsBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
