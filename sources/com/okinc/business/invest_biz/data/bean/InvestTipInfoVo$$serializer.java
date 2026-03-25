package com.okinc.business.invest_biz.data.bean;

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
public final /* synthetic */ class InvestTipInfoVo$$serializer implements GeneratedSerializer<InvestTipInfoVo> {
    public static final int $stable;
    public static final InvestTipInfoVo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestTipInfoVo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestTipInfoVo$$serializer investTipInfoVo$$serializer = new InvestTipInfoVo$$serializer();
        INSTANCE = investTipInfoVo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestTipInfoVo", investTipInfoVo$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("clickAction", true);
        pluginGeneratedSerialDescriptor.addElement("customRedirectData", true);
        pluginGeneratedSerialDescriptor.addElement("hoverOnData", true);
        pluginGeneratedSerialDescriptor.addElement("popUpData", true);
        pluginGeneratedSerialDescriptor.addElement("redirectData", true);
        pluginGeneratedSerialDescriptor.addElement("tipContent", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("disappearAfterInput", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("contentType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{InvestTipInfoVo.$childSerializers[0], BuiltinSerializersKt.getNullable(InvestCustomRedirectData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(InvestHoverOnData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(InvestPopUpData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(InvestRedirectData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestTipInfoVo deserialize(@NotNull Decoder decoder) {
        InvestHoverOnData investHoverOnData;
        String str;
        InvestPopUpData investPopUpData;
        boolean z;
        String str2;
        String str3;
        Integer num;
        InvestCustomRedirectData investCustomRedirectData;
        InvestClickActionType investClickActionType;
        int i;
        InvestRedirectData investRedirectData;
        InvestCustomRedirectData investCustomRedirectData2;
        InvestRedirectData investRedirectData2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InvestTipInfoVo.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            InvestClickActionType investClickActionType2 = (InvestClickActionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            InvestCustomRedirectData investCustomRedirectData3 = (InvestCustomRedirectData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestCustomRedirectData$$serializer.INSTANCE, null);
            InvestHoverOnData investHoverOnData2 = (InvestHoverOnData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, InvestHoverOnData$$serializer.INSTANCE, null);
            InvestPopUpData investPopUpData2 = (InvestPopUpData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, InvestPopUpData$$serializer.INSTANCE, null);
            InvestRedirectData investRedirectData3 = (InvestRedirectData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, InvestRedirectData$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, null);
            z = zDecodeBooleanElement;
            str3 = str5;
            str = str4;
            investPopUpData = investPopUpData2;
            str2 = str6;
            investRedirectData = investRedirectData3;
            i = 1023;
            investClickActionType = investClickActionType2;
            investHoverOnData = investHoverOnData2;
            investCustomRedirectData = investCustomRedirectData3;
        } else {
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            String str7 = null;
            String str8 = null;
            Integer num2 = null;
            investHoverOnData = null;
            str = null;
            InvestCustomRedirectData investCustomRedirectData4 = null;
            InvestClickActionType investClickActionType3 = null;
            InvestRedirectData investRedirectData4 = null;
            investPopUpData = null;
            int i6 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        investCustomRedirectData2 = investCustomRedirectData4;
                        investRedirectData2 = investRedirectData4;
                        z2 = false;
                        investRedirectData4 = investRedirectData2;
                        investCustomRedirectData4 = investCustomRedirectData2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 0:
                        investCustomRedirectData2 = investCustomRedirectData4;
                        investRedirectData2 = investRedirectData4;
                        investClickActionType3 = (InvestClickActionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], investClickActionType3);
                        i6 |= 1;
                        investRedirectData4 = investRedirectData2;
                        investCustomRedirectData4 = investCustomRedirectData2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 1:
                        investRedirectData2 = investRedirectData4;
                        investCustomRedirectData4 = (InvestCustomRedirectData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestCustomRedirectData$$serializer.INSTANCE, investCustomRedirectData4);
                        i6 |= 2;
                        investCustomRedirectData2 = investCustomRedirectData4;
                        investRedirectData4 = investRedirectData2;
                        investCustomRedirectData4 = investCustomRedirectData2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 2:
                        investRedirectData2 = investRedirectData4;
                        investHoverOnData = (InvestHoverOnData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, InvestHoverOnData$$serializer.INSTANCE, investHoverOnData);
                        i6 |= 4;
                        investCustomRedirectData2 = investCustomRedirectData4;
                        investRedirectData4 = investRedirectData2;
                        investCustomRedirectData4 = investCustomRedirectData2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 3:
                        investRedirectData2 = investRedirectData4;
                        investPopUpData = (InvestPopUpData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, InvestPopUpData$$serializer.INSTANCE, investPopUpData);
                        i6 |= 8;
                        investCustomRedirectData2 = investCustomRedirectData4;
                        investRedirectData4 = investRedirectData2;
                        investCustomRedirectData4 = investCustomRedirectData2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 4:
                        investRedirectData4 = (InvestRedirectData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, InvestRedirectData$$serializer.INSTANCE, investRedirectData4);
                        i6 |= 16;
                        investCustomRedirectData2 = investCustomRedirectData4;
                        investRedirectData2 = investRedirectData4;
                        investRedirectData4 = investRedirectData2;
                        investCustomRedirectData4 = investCustomRedirectData2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 5:
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str);
                        i6 |= 32;
                        investCustomRedirectData2 = investCustomRedirectData4;
                        investRedirectData2 = investRedirectData4;
                        investRedirectData4 = investRedirectData2;
                        investCustomRedirectData4 = investCustomRedirectData2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 6:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str8);
                        i6 |= 64;
                        investCustomRedirectData2 = investCustomRedirectData4;
                        investRedirectData2 = investRedirectData4;
                        investRedirectData4 = investRedirectData2;
                        investCustomRedirectData4 = investCustomRedirectData2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 7:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i6 |= 128;
                        break;
                    case 8:
                        i6 |= 256;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str7);
                        break;
                    case 9:
                        Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IntSerializer.INSTANCE, num2);
                        i6 |= 512;
                        investCustomRedirectData2 = investCustomRedirectData4;
                        investRedirectData2 = investRedirectData4;
                        num2 = num3;
                        investRedirectData4 = investRedirectData2;
                        investCustomRedirectData4 = investCustomRedirectData2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            InvestCustomRedirectData investCustomRedirectData5 = investCustomRedirectData4;
            InvestClickActionType investClickActionType4 = investClickActionType3;
            z = zDecodeBooleanElement2;
            str2 = str7;
            str3 = str8;
            num = num2;
            investCustomRedirectData = investCustomRedirectData5;
            investClickActionType = investClickActionType4;
            i = i6;
            investRedirectData = investRedirectData4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestTipInfoVo(i, investClickActionType, investCustomRedirectData, investHoverOnData, investPopUpData, investRedirectData, str, str3, z, str2, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investTipInfoVo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestTipInfoVo.write$Self$OKDeFi_invest_biz(investTipInfoVo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
