package com.okinc.business.invest_biz.data.bean;

import java.util.Map;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestOrder$$serializer implements GeneratedSerializer<InvestOrder> {
    public static final int $stable;
    public static final InvestOrder$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestOrder$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestOrder$$serializer investOrder$$serializer = new InvestOrder$$serializer();
        INSTANCE = investOrder$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestOrder", investOrder$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("stakedAmount", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("validatorName", true);
        pluginGeneratedSerialDescriptor.addElement("isAllowedRedeem", true);
        pluginGeneratedSerialDescriptor.addElement("redeemId", true);
        pluginGeneratedSerialDescriptor.addElement("unableRedeemTip", true);
        pluginGeneratedSerialDescriptor.addElement("redeemExtra", true);
        pluginGeneratedSerialDescriptor.addElement("orderStatus", true);
        pluginGeneratedSerialDescriptor.addElement("babylonOrderStatus", true);
        pluginGeneratedSerialDescriptor.addElement("isOverflow", true);
        pluginGeneratedSerialDescriptor.addElement("redeemNeedUnbond", true);
        pluginGeneratedSerialDescriptor.addElement("stakeTime", true);
        pluginGeneratedSerialDescriptor.addElement("assetIndex", true);
        pluginGeneratedSerialDescriptor.addElement("remainTimeTip", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = InvestOrder.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(UnableRedeemTip$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[7]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(InvestTipInfoVo$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestOrder deserialize(@NotNull Decoder decoder) {
        String str;
        InvestTipInfoVo investTipInfoVo;
        String str2;
        UnableRedeemTip unableRedeemTip;
        String str3;
        Integer num;
        Boolean bool;
        String str4;
        String str5;
        Boolean bool2;
        String str6;
        boolean z;
        Map map;
        String str7;
        String str8;
        int i;
        KSerializer[] kSerializerArr;
        UnableRedeemTip unableRedeemTip2;
        KSerializer[] kSerializerArr2;
        String str9;
        String str10;
        UnableRedeemTip unableRedeemTip3;
        Boolean bool3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = InvestOrder.$childSerializers;
        int i2 = 9;
        InvestTipInfoVo investTipInfoVo2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            UnableRedeemTip unableRedeemTip4 = (UnableRedeemTip) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, UnableRedeemTip$$serializer.INSTANCE, null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr3[7], null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, null);
            str7 = str15;
            investTipInfoVo = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, InvestTipInfoVo$$serializer.INSTANCE, null);
            unableRedeemTip = unableRedeemTip4;
            str3 = str16;
            str8 = str14;
            bool = bool4;
            z = zDecodeBooleanElement;
            str4 = str12;
            str2 = str17;
            bool2 = bool5;
            map = map2;
            str6 = strDecodeStringElement;
            str = str11;
            i = 32767;
            str5 = str13;
        } else {
            int i3 = 14;
            int i4 = 0;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            Boolean bool6 = null;
            Map map3 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            Integer num2 = null;
            Boolean bool7 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String strDecodeStringElement2 = null;
            UnableRedeemTip unableRedeemTip5 = null;
            String str24 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        str9 = str22;
                        str10 = str23;
                        unableRedeemTip3 = unableRedeemTip5;
                        bool3 = bool6;
                        z2 = false;
                        unableRedeemTip5 = unableRedeemTip3;
                        str22 = str9;
                        bool6 = bool3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        str23 = str10;
                        break;
                    case 0:
                        kSerializerArr2 = kSerializerArr3;
                        str9 = str22;
                        str10 = str23;
                        unableRedeemTip3 = unableRedeemTip5;
                        bool3 = bool6;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        unableRedeemTip5 = unableRedeemTip3;
                        str22 = str9;
                        bool6 = bool3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        str23 = str10;
                        break;
                    case 1:
                        kSerializerArr2 = kSerializerArr3;
                        str10 = str23;
                        unableRedeemTip3 = unableRedeemTip5;
                        bool3 = bool6;
                        str9 = str22;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str24);
                        i4 |= 2;
                        unableRedeemTip5 = unableRedeemTip3;
                        str22 = str9;
                        bool6 = bool3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        str23 = str10;
                        break;
                    case 2:
                        kSerializerArr2 = kSerializerArr3;
                        String str25 = str23;
                        unableRedeemTip3 = unableRedeemTip5;
                        bool3 = bool6;
                        str10 = str25;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str22);
                        i4 |= 4;
                        unableRedeemTip5 = unableRedeemTip3;
                        str22 = str9;
                        bool6 = bool3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        str23 = str10;
                        break;
                    case 3:
                        KSerializer[] kSerializerArr4 = kSerializerArr3;
                        i4 |= 8;
                        bool6 = bool6;
                        i3 = 14;
                        i2 = 9;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str23);
                        kSerializerArr3 = kSerializerArr4;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr3;
                        unableRedeemTip2 = unableRedeemTip5;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i4 |= 16;
                        unableRedeemTip5 = unableRedeemTip2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 5:
                        kSerializerArr = kSerializerArr3;
                        unableRedeemTip2 = unableRedeemTip5;
                        i4 |= 32;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str21);
                        unableRedeemTip5 = unableRedeemTip2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 6:
                        kSerializerArr = kSerializerArr3;
                        i4 |= 64;
                        unableRedeemTip2 = (UnableRedeemTip) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, UnableRedeemTip$$serializer.INSTANCE, unableRedeemTip5);
                        unableRedeemTip5 = unableRedeemTip2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 7:
                        i4 |= 128;
                        kSerializerArr = kSerializerArr3;
                        map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr3[7], map3);
                        unableRedeemTip2 = unableRedeemTip5;
                        unableRedeemTip5 = unableRedeemTip2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 8:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str19);
                        i4 |= 256;
                        kSerializerArr = kSerializerArr3;
                        unableRedeemTip2 = unableRedeemTip5;
                        unableRedeemTip5 = unableRedeemTip2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 9:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str20);
                        i4 |= 512;
                        kSerializerArr = kSerializerArr3;
                        unableRedeemTip2 = unableRedeemTip5;
                        unableRedeemTip5 = unableRedeemTip2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 10:
                        i4 |= 1024;
                        kSerializerArr = kSerializerArr3;
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool7);
                        unableRedeemTip2 = unableRedeemTip5;
                        unableRedeemTip5 = unableRedeemTip2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 11:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, bool6);
                        i4 |= 2048;
                        kSerializerArr = kSerializerArr3;
                        unableRedeemTip2 = unableRedeemTip5;
                        unableRedeemTip5 = unableRedeemTip2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 12:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str18);
                        i4 |= 4096;
                        kSerializerArr = kSerializerArr3;
                        unableRedeemTip2 = unableRedeemTip5;
                        unableRedeemTip5 = unableRedeemTip2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 13:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, num2);
                        i4 |= 8192;
                        kSerializerArr = kSerializerArr3;
                        unableRedeemTip2 = unableRedeemTip5;
                        unableRedeemTip5 = unableRedeemTip2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 14:
                        investTipInfoVo2 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo2);
                        i4 |= 16384;
                        kSerializerArr = kSerializerArr3;
                        unableRedeemTip2 = unableRedeemTip5;
                        unableRedeemTip5 = unableRedeemTip2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 14;
                        i2 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str26 = str22;
            str = str24;
            investTipInfoVo = investTipInfoVo2;
            str2 = str18;
            unableRedeemTip = unableRedeemTip5;
            str3 = str20;
            num = num2;
            bool = bool7;
            str4 = str26;
            str5 = str23;
            bool2 = bool6;
            str6 = strDecodeStringElement2;
            z = zDecodeBooleanElement2;
            map = map3;
            str7 = str19;
            str8 = str21;
            i = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestOrder(i, str6, str, str4, str5, z, str8, unableRedeemTip, map, str7, str3, bool, bool2, str2, num, investTipInfoVo, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestOrder investOrder) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investOrder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestOrder.write$Self$OKDeFi_invest_biz(investOrder, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
