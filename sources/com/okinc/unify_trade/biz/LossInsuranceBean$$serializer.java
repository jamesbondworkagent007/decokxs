package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class LossInsuranceBean$$serializer implements GeneratedSerializer<LossInsuranceBean> {
    public static final int $stable;
    public static final LossInsuranceBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LossInsuranceBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LossInsuranceBean$$serializer lossInsuranceBean$$serializer = new LossInsuranceBean$$serializer();
        INSTANCE = lossInsuranceBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.LossInsuranceBean", lossInsuranceBean$$serializer, 20);
        pluginGeneratedSerialDescriptor.addElement("voucherVisible", true);
        pluginGeneratedSerialDescriptor.addElement("voucherStatus", true);
        pluginGeneratedSerialDescriptor.addElement("voucherBatch", true);
        pluginGeneratedSerialDescriptor.addElement("voucherValue", true);
        pluginGeneratedSerialDescriptor.addElement("voucherCcy", true);
        pluginGeneratedSerialDescriptor.addElement("appliedVoucherCount", true);
        pluginGeneratedSerialDescriptor.addElement("totalVoucherCount", true);
        pluginGeneratedSerialDescriptor.addElement("pTime", true);
        pluginGeneratedSerialDescriptor.addElement("endTime", true);
        pluginGeneratedSerialDescriptor.addElement("voucherIssueTime", true);
        pluginGeneratedSerialDescriptor.addElement("voucherExpireTime", true);
        pluginGeneratedSerialDescriptor.addElement("deeplink", true);
        pluginGeneratedSerialDescriptor.addElement("realTimestamp", true);
        pluginGeneratedSerialDescriptor.addElement("instIds", true);
        pluginGeneratedSerialDescriptor.addElement("algoOrdTypes", true);
        pluginGeneratedSerialDescriptor.addElement("claimed", true);
        pluginGeneratedSerialDescriptor.addElement("voucherType", true);
        pluginGeneratedSerialDescriptor.addElement("arbitrageTotalPnlInfo", true);
        pluginGeneratedSerialDescriptor.addElement("leveragePrincipal", true);
        pluginGeneratedSerialDescriptor.addElement("totalInterestAmt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = LossInsuranceBean.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[13]), BuiltinSerializersKt.getNullable(kSerializerArr[14]), booleanSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[16]), BuiltinSerializersKt.getNullable(ArbitrageTotalPnlInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LossInsuranceBean deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        List list;
        List list2;
        String str3;
        String str4;
        String str5;
        boolean z;
        String str6;
        TacticsVoucherType tacticsVoucherType;
        long j;
        String str7;
        int i;
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Integer num;
        boolean z2;
        KSerializer[] kSerializerArr;
        TacticsVoucherType tacticsVoucherType2;
        boolean zDecodeBooleanElement;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        KSerializer[] kSerializerArr2;
        String str20;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = LossInsuranceBean.$childSerializers;
        int i3 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 12);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr3[13], null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr3[14], null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
            tacticsVoucherType = (TacticsVoucherType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr3[16], null);
            ArbitrageTotalPnlInfo arbitrageTotalPnlInfo2 = (ArbitrageTotalPnlInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, ArbitrageTotalPnlInfo$$serializer.INSTANCE, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, null);
            num = num2;
            str4 = str22;
            str6 = str30;
            z2 = zDecodeBooleanElement2;
            str3 = str24;
            i = 1048575;
            arbitrageTotalPnlInfo = arbitrageTotalPnlInfo2;
            str2 = str31;
            str10 = str21;
            str11 = str32;
            list = list3;
            str9 = str28;
            z = zDecodeBooleanElement3;
            str12 = str23;
            list2 = list4;
            j = jDecodeLongElement;
            str5 = str29;
            str7 = str25;
            str = str27;
            str8 = str26;
        } else {
            boolean zDecodeBooleanElement4 = false;
            TacticsVoucherType tacticsVoucherType3 = null;
            String str33 = null;
            Integer num3 = null;
            List list5 = null;
            List list6 = null;
            ArbitrageTotalPnlInfo arbitrageTotalPnlInfo3 = null;
            str = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            boolean z3 = true;
            long jDecodeLongElement2 = 0;
            String str43 = null;
            boolean z4 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        zDecodeBooleanElement = z4;
                        str13 = str36;
                        str14 = str37;
                        str15 = str38;
                        str16 = str39;
                        str17 = str40;
                        str18 = str42;
                        z3 = false;
                        str36 = str13;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str17;
                        str39 = str16;
                        str38 = str15;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        str13 = str36;
                        str14 = str37;
                        str15 = str38;
                        str16 = str39;
                        str17 = str40;
                        str18 = str42;
                        i3 |= 1;
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        str41 = str41;
                        str36 = str13;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str17;
                        str39 = str16;
                        str38 = str15;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        zDecodeBooleanElement = z4;
                        str13 = str36;
                        str14 = str37;
                        str15 = str38;
                        str16 = str39;
                        str18 = str42;
                        str17 = str40;
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str41);
                        i3 |= 2;
                        str36 = str13;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str17;
                        str39 = str16;
                        str38 = str15;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        zDecodeBooleanElement = z4;
                        str13 = str36;
                        str14 = str37;
                        str15 = str38;
                        str18 = str42;
                        str16 = str39;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str40);
                        i3 |= 4;
                        str17 = str40;
                        str36 = str13;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str17;
                        str39 = str16;
                        str38 = str15;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 3:
                        kSerializerArr = kSerializerArr3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        zDecodeBooleanElement = z4;
                        str13 = str36;
                        str14 = str37;
                        str18 = str42;
                        str15 = str38;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str39);
                        i3 |= 8;
                        str16 = str39;
                        str17 = str40;
                        str36 = str13;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str17;
                        str39 = str16;
                        str38 = str15;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        zDecodeBooleanElement = z4;
                        str13 = str36;
                        str14 = str37;
                        str19 = str38;
                        str18 = str42;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str35);
                        i3 |= 16;
                        str15 = str19;
                        str16 = str39;
                        str17 = str40;
                        str36 = str13;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str17;
                        str39 = str16;
                        str38 = str15;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 5:
                        kSerializerArr = kSerializerArr3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        zDecodeBooleanElement = z4;
                        str13 = str36;
                        str14 = str37;
                        str19 = str38;
                        str18 = str42;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str33);
                        i3 |= 32;
                        str15 = str19;
                        str16 = str39;
                        str17 = str40;
                        str36 = str13;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str17;
                        str39 = str16;
                        str38 = str15;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 6:
                        kSerializerArr = kSerializerArr3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        zDecodeBooleanElement = z4;
                        str13 = str36;
                        str14 = str37;
                        str18 = str42;
                        i3 |= 64;
                        str15 = str38;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str34);
                        str16 = str39;
                        str17 = str40;
                        str36 = str13;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str17;
                        str39 = str16;
                        str38 = str15;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 7:
                        tacticsVoucherType2 = tacticsVoucherType3;
                        zDecodeBooleanElement = z4;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str);
                        i3 |= 128;
                        kSerializerArr3 = kSerializerArr3;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 8:
                        kSerializerArr2 = kSerializerArr3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        zDecodeBooleanElement = z4;
                        str20 = str36;
                        str14 = str37;
                        str18 = str42;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str38);
                        i3 |= 256;
                        str36 = str20;
                        kSerializerArr3 = kSerializerArr2;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 9:
                        kSerializerArr2 = kSerializerArr3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        zDecodeBooleanElement = z4;
                        str20 = str36;
                        str14 = str37;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str42);
                        i3 |= 512;
                        str36 = str20;
                        kSerializerArr3 = kSerializerArr2;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 10:
                        kSerializerArr2 = kSerializerArr3;
                        zDecodeBooleanElement = z4;
                        str20 = str36;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str37);
                        i3 |= 1024;
                        str18 = str42;
                        str36 = str20;
                        kSerializerArr3 = kSerializerArr2;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 11:
                        zDecodeBooleanElement = z4;
                        kSerializerArr2 = kSerializerArr3;
                        i3 |= 2048;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str36);
                        tacticsVoucherType2 = tacticsVoucherType3;
                        str14 = str37;
                        str18 = str42;
                        str36 = str20;
                        kSerializerArr3 = kSerializerArr2;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 12:
                        zDecodeBooleanElement = z4;
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 12);
                        i3 |= 4096;
                        kSerializerArr2 = kSerializerArr3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        str20 = str36;
                        str14 = str37;
                        str18 = str42;
                        str36 = str20;
                        kSerializerArr3 = kSerializerArr2;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 13:
                        zDecodeBooleanElement = z4;
                        i3 |= 8192;
                        kSerializerArr2 = kSerializerArr3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr3[13], list5);
                        str20 = str36;
                        str14 = str37;
                        str18 = str42;
                        str36 = str20;
                        kSerializerArr3 = kSerializerArr2;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 14:
                        zDecodeBooleanElement = z4;
                        i3 |= 16384;
                        kSerializerArr2 = kSerializerArr3;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr3[14], list6);
                        tacticsVoucherType2 = tacticsVoucherType3;
                        str20 = str36;
                        str14 = str37;
                        str18 = str42;
                        str36 = str20;
                        kSerializerArr3 = kSerializerArr2;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 15:
                        zDecodeBooleanElement = z4;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
                        i3 |= 32768;
                        kSerializerArr2 = kSerializerArr3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        str20 = str36;
                        str14 = str37;
                        str18 = str42;
                        str36 = str20;
                        kSerializerArr3 = kSerializerArr2;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 16:
                        zDecodeBooleanElement = z4;
                        tacticsVoucherType3 = (TacticsVoucherType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr3[16], tacticsVoucherType3);
                        i3 |= 65536;
                        kSerializerArr2 = kSerializerArr3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        str20 = str36;
                        str14 = str37;
                        str18 = str42;
                        str36 = str20;
                        kSerializerArr3 = kSerializerArr2;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 17:
                        zDecodeBooleanElement = z4;
                        arbitrageTotalPnlInfo3 = (ArbitrageTotalPnlInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, ArbitrageTotalPnlInfo$$serializer.INSTANCE, arbitrageTotalPnlInfo3);
                        i2 = 131072;
                        kSerializerArr2 = kSerializerArr3;
                        i3 = i2 | i3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        str20 = str36;
                        str14 = str37;
                        str18 = str42;
                        str36 = str20;
                        kSerializerArr3 = kSerializerArr2;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 18:
                        zDecodeBooleanElement = z4;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, num3);
                        i2 = 262144;
                        kSerializerArr2 = kSerializerArr3;
                        i3 = i2 | i3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        str20 = str36;
                        str14 = str37;
                        str18 = str42;
                        str36 = str20;
                        kSerializerArr3 = kSerializerArr2;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 19:
                        zDecodeBooleanElement = z4;
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, str43);
                        i2 = 524288;
                        kSerializerArr2 = kSerializerArr3;
                        i3 = i2 | i3;
                        tacticsVoucherType2 = tacticsVoucherType3;
                        str20 = str36;
                        str14 = str37;
                        str18 = str42;
                        str36 = str20;
                        kSerializerArr3 = kSerializerArr2;
                        str42 = str18;
                        str37 = str14;
                        tacticsVoucherType3 = tacticsVoucherType2;
                        z4 = zDecodeBooleanElement;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            boolean z5 = z4;
            str2 = str36;
            list = list5;
            list2 = list6;
            str3 = str35;
            str4 = str40;
            str5 = str42;
            z = zDecodeBooleanElement4;
            str6 = str37;
            tacticsVoucherType = tacticsVoucherType3;
            j = jDecodeLongElement2;
            str7 = str33;
            i = i3;
            arbitrageTotalPnlInfo = arbitrageTotalPnlInfo3;
            str8 = str34;
            str9 = str38;
            str10 = str41;
            str11 = str43;
            str12 = str39;
            num = num3;
            z2 = z5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LossInsuranceBean(i, z2, str10, str4, str12, str3, str7, str8, str, str9, str5, str6, str2, j, list, list2, z, tacticsVoucherType, arbitrageTotalPnlInfo, num, str11, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LossInsuranceBean lossInsuranceBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(lossInsuranceBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LossInsuranceBean.write$Self$OKTradeCore_trade_core(lossInsuranceBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
