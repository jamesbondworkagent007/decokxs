package com.okinc.business.dex.tee.domain.model;

import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
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
public final /* synthetic */ class TeeLimitPlaceOrderParams$$serializer implements GeneratedSerializer<TeeLimitPlaceOrderParams> {
    public static final int $stable;
    public static final TeeLimitPlaceOrderParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TeeLimitPlaceOrderParams$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TeeLimitPlaceOrderParams$$serializer teeLimitPlaceOrderParams$$serializer = new TeeLimitPlaceOrderParams$$serializer();
        INSTANCE = teeLimitPlaceOrderParams$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.tee.domain.model.TeeLimitPlaceOrderParams", teeLimitPlaceOrderParams$$serializer, 24);
        pluginGeneratedSerialDescriptor.addElement("accountId", true);
        pluginGeneratedSerialDescriptor.addElement("teeId", true);
        pluginGeneratedSerialDescriptor.addElement("strategyType", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("fromAmount", true);
        pluginGeneratedSerialDescriptor.addElement("toAmount", true);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("rule", true);
        pluginGeneratedSerialDescriptor.addElement("preset", true);
        pluginGeneratedSerialDescriptor.addElement("referralCode", true);
        pluginGeneratedSerialDescriptor.addElement("sourceType", true);
        pluginGeneratedSerialDescriptor.addElement("strategyDirection", true);
        pluginGeneratedSerialDescriptor.addElement("referrerAddress", true);
        pluginGeneratedSerialDescriptor.addElement("expireTime", true);
        pluginGeneratedSerialDescriptor.addElement("serviceFeeInfo", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenDecimals", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenDecimals", false);
        pluginGeneratedSerialDescriptor.addElement("estimateGasFee", true);
        pluginGeneratedSerialDescriptor.addElement("minimumReceived", true);
        pluginGeneratedSerialDescriptor.addElement("isCustomExpireTime", true);
        pluginGeneratedSerialDescriptor.addElement("strategyTypeParam", true);
        pluginGeneratedSerialDescriptor.addElement("teeSilentSignEnabled", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TeeLimitPlaceOrderParams.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, kSerializerArr[2], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(Rule$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(LimitPreset$$serializer.INSTANCE), stringSerializer, intSerializer, BuiltinSerializersKt.getNullable(intSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(ServiceFeeInfo$$serializer.INSTANCE), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, booleanSerializer, stringSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TeeLimitPlaceOrderParams deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        LimitPreset limitPreset;
        Rule rule;
        ServiceFeeInfo serviceFeeInfo;
        boolean zDecodeBooleanElement;
        Integer num;
        StrategyType strategyType;
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
        int i;
        String str14;
        int i2;
        boolean z;
        String str15;
        StrategyType strategyType2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TeeLimitPlaceOrderParams.$childSerializers;
        int i5 = 10;
        int i6 = 7;
        int i7 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            StrategyType strategyType3 = (StrategyType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            Rule rule2 = (Rule) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, Rule$$serializer.INSTANCE, null);
            LimitPreset limitPreset2 = (LimitPreset) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, LimitPreset$$serializer.INSTANCE, null);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, null);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            num = num2;
            str5 = strDecodeStringElement11;
            ServiceFeeInfo serviceFeeInfo2 = (ServiceFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, ServiceFeeInfo$$serializer.INSTANCE, null);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, null);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 21);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            str14 = str16;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
            str4 = strDecodeStringElement15;
            z = zDecodeBooleanElement2;
            strDecodeStringElement = strDecodeStringElement16;
            str9 = strDecodeStringElement4;
            str12 = strDecodeStringElement12;
            i2 = 16777215;
            str15 = strDecodeStringElement6;
            str3 = strDecodeStringElement14;
            strategyType = strategyType3;
            serviceFeeInfo = serviceFeeInfo2;
            limitPreset = limitPreset2;
            str7 = strDecodeStringElement7;
            str = strDecodeStringElement9;
            str11 = strDecodeStringElement2;
            str2 = strDecodeStringElement13;
            str6 = strDecodeStringElement10;
            str13 = strDecodeStringElement8;
            rule = rule2;
            str8 = strDecodeStringElement5;
            str10 = strDecodeStringElement3;
            i = iDecodeIntElement;
        } else {
            int i8 = 0;
            boolean zDecodeBooleanElement3 = false;
            int iDecodeIntElement2 = 0;
            boolean z2 = true;
            LimitPreset limitPreset3 = null;
            Rule rule3 = null;
            ServiceFeeInfo serviceFeeInfo3 = null;
            Integer num3 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            StrategyType strategyType4 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String str17 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        strategyType2 = strategyType4;
                        z2 = false;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 0:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i8 |= 1;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 1:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i8 |= 2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 2:
                        strategyType4 = (StrategyType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], strategyType4);
                        i8 |= 4;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 3:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i8 |= 8;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 4:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i8 |= 16;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 5:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i8 |= 32;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 6:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i8 |= 64;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 7:
                        int i9 = i6;
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i9);
                        i8 |= 128;
                        i6 = i9;
                        break;
                    case 8:
                        i8 |= 256;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i7);
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 9:
                        rule3 = (Rule) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, Rule$$serializer.INSTANCE, rule3);
                        i8 |= 512;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 10:
                        limitPreset3 = (LimitPreset) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, LimitPreset$$serializer.INSTANCE, limitPreset3);
                        i8 |= 1024;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 11:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i8 |= 2048;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 12:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        i8 |= 4096;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 13:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, num3);
                        i8 |= 8192;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 14:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i8 |= 16384;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 15:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i8 |= 32768;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 16:
                        serviceFeeInfo3 = (ServiceFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, ServiceFeeInfo$$serializer.INSTANCE, serviceFeeInfo3);
                        i3 = 65536;
                        i8 |= i3;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 17:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i8 |= 131072;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 18:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i8 |= 262144;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 19:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, str17);
                        i3 = 524288;
                        i8 |= i3;
                        strategyType2 = strategyType4;
                        strategyType4 = strategyType2;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 20:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i8 |= 1048576;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 21:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 21);
                        i4 = 2097152;
                        i8 = i4 | i8;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 22:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i4 = 4194304;
                        i8 = i4 | i8;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    case 23:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
                        i4 = 8388608;
                        i8 = i4 | i8;
                        i7 = 8;
                        i5 = 10;
                        i6 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            limitPreset = limitPreset3;
            rule = rule3;
            serviceFeeInfo = serviceFeeInfo3;
            zDecodeBooleanElement = zDecodeBooleanElement4;
            num = num3;
            strategyType = strategyType4;
            str = strDecodeStringElement17;
            str2 = strDecodeStringElement18;
            str3 = strDecodeStringElement19;
            str4 = strDecodeStringElement20;
            str5 = strDecodeStringElement21;
            str6 = strDecodeStringElement22;
            str7 = strDecodeStringElement23;
            str8 = strDecodeStringElement25;
            str9 = strDecodeStringElement26;
            str10 = strDecodeStringElement27;
            str11 = strDecodeStringElement28;
            str12 = strDecodeStringElement29;
            str13 = strDecodeStringElement30;
            i = iDecodeIntElement2;
            str14 = str17;
            i2 = i8;
            z = zDecodeBooleanElement3;
            str15 = strDecodeStringElement24;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TeeLimitPlaceOrderParams(i2, str11, str10, strategyType, str9, str8, str15, str7, str13, str, rule, limitPreset, str6, i, num, str5, str12, serviceFeeInfo, str2, str3, str14, str4, z, strDecodeStringElement, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TeeLimitPlaceOrderParams teeLimitPlaceOrderParams) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(teeLimitPlaceOrderParams, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TeeLimitPlaceOrderParams.write$Self$OKDex_dex_impl(teeLimitPlaceOrderParams, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
