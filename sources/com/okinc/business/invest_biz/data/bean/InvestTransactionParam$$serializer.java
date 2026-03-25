package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3$$serializer;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestTransactionParam$$serializer implements GeneratedSerializer<InvestTransactionParam> {
    public static final int $stable;
    public static final InvestTransactionParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestTransactionParam$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestTransactionParam$$serializer investTransactionParam$$serializer = new InvestTransactionParam$$serializer();
        INSTANCE = investTransactionParam$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestTransactionParam", investTransactionParam$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("inputList", true);
        pluginGeneratedSerialDescriptor.addElement("isSingle", true);
        pluginGeneratedSerialDescriptor.addElement("isHalfApproved", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("investType", true);
        pluginGeneratedSerialDescriptor.addElement("analysisPlatformId", true);
        pluginGeneratedSerialDescriptor.addElement("router", true);
        pluginGeneratedSerialDescriptor.addElement("investmentIdList", true);
        pluginGeneratedSerialDescriptor.addElement("relatedInvestmentId", true);
        pluginGeneratedSerialDescriptor.addElement("estTime", true);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        pluginGeneratedSerialDescriptor.addElement("poolVersion", true);
        pluginGeneratedSerialDescriptor.addElement("nextOrderType", true);
        pluginGeneratedSerialDescriptor.addElement("poolInvestV3", true);
        pluginGeneratedSerialDescriptor.addElement("stakingMode", true);
        pluginGeneratedSerialDescriptor.addElement("isBorrowSupply", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InvestTransactionParam.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(kSerializerArr[0]), booleanSerializer, booleanSerializer, longSerializer, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(longSerializer), stringSerializer, kSerializerArr[7], BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(InvestPoolV3$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestTransactionParam deserialize(@NotNull Decoder decoder) {
        Integer num;
        Long l;
        Integer num2;
        Integer num3;
        Boolean bool;
        Integer num4;
        boolean z;
        String str;
        Long l2;
        List list;
        long j;
        int i;
        InvestPoolV3 investPoolV3;
        String str2;
        Integer num5;
        List list2;
        boolean z2;
        List list3;
        Long l3;
        Integer num6;
        Long l4;
        KSerializer[] kSerializerArr;
        char c;
        boolean zDecodeBooleanElement;
        KSerializer[] kSerializerArr2;
        List list4;
        Long l5;
        Integer num7;
        List list5;
        Long l6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = InvestTransactionParam.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr3[0], null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, intSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            List list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr3[7], null);
            Long l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            Integer num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, intSerializer, null);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, null);
            Integer num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            Integer num11 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, intSerializer, null);
            investPoolV3 = (InvestPoolV3) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, InvestPoolV3$$serializer.INSTANCE, null);
            num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, intSerializer, null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, null);
            str2 = str3;
            num3 = num9;
            num = num8;
            num4 = num10;
            num5 = num11;
            z = zDecodeBooleanElement2;
            j = jDecodeLongElement;
            z2 = zDecodeBooleanElement3;
            l2 = l8;
            list = list7;
            l = l7;
            list2 = list6;
            str = strDecodeStringElement;
            i = 65535;
        } else {
            int i2 = 15;
            boolean z3 = true;
            List list8 = null;
            Long l9 = null;
            Integer num12 = null;
            Integer num13 = null;
            String str4 = null;
            Boolean bool2 = null;
            Integer num14 = null;
            Integer num15 = null;
            String strDecodeStringElement2 = null;
            Integer num16 = null;
            List list9 = null;
            Long l10 = null;
            int i3 = 0;
            long jDecodeLongElement2 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean z4 = false;
            InvestPoolV3 investPoolV32 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        list4 = list8;
                        l5 = l9;
                        num7 = num16;
                        list5 = list9;
                        l6 = l10;
                        z3 = false;
                        list9 = list5;
                        num16 = num7;
                        l10 = l6;
                        l9 = l5;
                        list8 = list4;
                        i2 = 15;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 0:
                        list3 = list8;
                        l3 = l9;
                        num6 = num16;
                        l4 = l10;
                        kSerializerArr = kSerializerArr3;
                        i3 |= 1;
                        list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr3[0], list9);
                        kSerializerArr3 = kSerializerArr;
                        num16 = num6;
                        l10 = l4;
                        l9 = l3;
                        list8 = list3;
                        i2 = 15;
                        break;
                    case 1:
                        list4 = list8;
                        l5 = l9;
                        num7 = num16;
                        l6 = l10;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i3 |= 2;
                        kSerializerArr2 = kSerializerArr3;
                        list5 = list9;
                        list9 = list5;
                        num16 = num7;
                        l10 = l6;
                        l9 = l5;
                        list8 = list4;
                        i2 = 15;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 2:
                        list3 = list8;
                        l3 = l9;
                        num6 = num16;
                        l4 = l10;
                        c = 2;
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i3 |= 4;
                        kSerializerArr = kSerializerArr3;
                        z4 = zDecodeBooleanElement;
                        kSerializerArr3 = kSerializerArr;
                        num16 = num6;
                        l10 = l4;
                        l9 = l3;
                        list8 = list3;
                        i2 = 15;
                        break;
                    case 3:
                        list3 = list8;
                        l3 = l9;
                        num6 = num16;
                        l4 = l10;
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i3 |= 8;
                        zDecodeBooleanElement = z4;
                        c = 2;
                        kSerializerArr = kSerializerArr3;
                        z4 = zDecodeBooleanElement;
                        kSerializerArr3 = kSerializerArr;
                        num16 = num6;
                        l10 = l4;
                        l9 = l3;
                        list8 = list3;
                        i2 = 15;
                        break;
                    case 4:
                        list3 = list8;
                        l4 = l10;
                        l3 = l9;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num16);
                        i3 |= 16;
                        kSerializerArr = kSerializerArr3;
                        kSerializerArr3 = kSerializerArr;
                        num16 = num6;
                        l10 = l4;
                        l9 = l3;
                        list8 = list3;
                        i2 = 15;
                        break;
                    case 5:
                        list3 = list8;
                        i3 |= 32;
                        l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l10);
                        list8 = list3;
                        i2 = 15;
                        break;
                    case 6:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        list3 = list8;
                        list8 = list3;
                        i2 = 15;
                        break;
                    case 7:
                        list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr3[7], list8);
                        i3 |= 128;
                        list3 = list8;
                        list8 = list3;
                        i2 = 15;
                        break;
                    case 8:
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, l9);
                        i3 |= 256;
                        list3 = list8;
                        list8 = list3;
                        i2 = 15;
                        break;
                    case 9:
                        i3 |= 512;
                        list3 = list8;
                        num13 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, num13);
                        list8 = list3;
                        i2 = 15;
                        break;
                    case 10:
                        i3 |= 1024;
                        list3 = list8;
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str4);
                        list8 = list3;
                        i2 = 15;
                        break;
                    case 11:
                        i3 |= 2048;
                        list3 = list8;
                        num15 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, num15);
                        list8 = list3;
                        i2 = 15;
                        break;
                    case 12:
                        i3 |= 4096;
                        list3 = list8;
                        num14 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, num14);
                        list8 = list3;
                        i2 = 15;
                        break;
                    case 13:
                        investPoolV32 = (InvestPoolV3) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, InvestPoolV3$$serializer.INSTANCE, investPoolV32);
                        i3 |= 8192;
                        list3 = list8;
                        list8 = list3;
                        i2 = 15;
                        break;
                    case 14:
                        i3 |= 16384;
                        list3 = list8;
                        num12 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, num12);
                        list8 = list3;
                        i2 = 15;
                        break;
                    case 15:
                        i3 |= 32768;
                        list3 = list8;
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool2);
                        list8 = list3;
                        i2 = 15;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num16;
            l = l10;
            num2 = num12;
            num3 = num13;
            bool = bool2;
            num4 = num15;
            z = zDecodeBooleanElement4;
            str = strDecodeStringElement2;
            l2 = l9;
            list = list8;
            j = jDecodeLongElement2;
            i = i3;
            investPoolV3 = investPoolV32;
            str2 = str4;
            num5 = num14;
            list2 = list9;
            z2 = z4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestTransactionParam(i, list2, z, z2, j, num, l, str, list, l2, num3, str2, num4, num5, investPoolV3, num2, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestTransactionParam investTransactionParam) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investTransactionParam, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestTransactionParam.write$Self$OKDeFi_invest_biz(investTransactionParam, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
