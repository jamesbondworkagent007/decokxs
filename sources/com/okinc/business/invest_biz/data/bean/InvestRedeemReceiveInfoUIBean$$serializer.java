package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount$$serializer;
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
public final /* synthetic */ class InvestRedeemReceiveInfoUIBean$$serializer implements GeneratedSerializer<InvestRedeemReceiveInfoUIBean> {
    public static final int $stable;
    public static final InvestRedeemReceiveInfoUIBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestRedeemReceiveInfoUIBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestRedeemReceiveInfoUIBean$$serializer investRedeemReceiveInfoUIBean$$serializer = new InvestRedeemReceiveInfoUIBean$$serializer();
        INSTANCE = investRedeemReceiveInfoUIBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfoUIBean", investRedeemReceiveInfoUIBean$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("isInit", false);
        pluginGeneratedSerialDescriptor.addElement("platformLogo", true);
        pluginGeneratedSerialDescriptor.addElement("platformName", true);
        pluginGeneratedSerialDescriptor.addElement("swapToToken", true);
        pluginGeneratedSerialDescriptor.addElement("receiveTokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("isDataErro", true);
        pluginGeneratedSerialDescriptor.addElement("investmentCategory", true);
        pluginGeneratedSerialDescriptor.addElement("redeemTips", true);
        pluginGeneratedSerialDescriptor.addElement("exchangeBean", true);
        pluginGeneratedSerialDescriptor.addElement("payWithTokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("payWithTokenTip", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InvestRedeemReceiveInfoUIBean.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, stringSerializer, stringSerializer, kSerializerArr[3], kSerializerArr[4], booleanSerializer, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), InvestTipsBean$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(InvestExchangeRateBean$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(InvestTokenWithAmount$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(InvestTipInfoVo$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestRedeemReceiveInfoUIBean deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        boolean z;
        InvestTipsBean investTipsBean;
        InvestExchangeRateBean investExchangeRateBean;
        InvestTipInfoVo investTipInfoVo;
        int i;
        String str;
        Integer num;
        InvestTokenWithAmount investTokenWithAmount;
        List list;
        List list2;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InvestRedeemReceiveInfoUIBean.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, null);
            InvestTipsBean investTipsBean2 = (InvestTipsBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, InvestTipsBean$$serializer.INSTANCE, null);
            InvestExchangeRateBean investExchangeRateBean2 = (InvestExchangeRateBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, InvestExchangeRateBean$$serializer.INSTANCE, null);
            InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, InvestTokenWithAmount$$serializer.INSTANCE, null);
            investTipInfoVo = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, InvestTipInfoVo$$serializer.INSTANCE, null);
            investTokenWithAmount = investTokenWithAmount2;
            investTipsBean = investTipsBean2;
            num = num2;
            zDecodeBooleanElement = zDecodeBooleanElement3;
            investExchangeRateBean = investExchangeRateBean2;
            i = 2047;
            list = list4;
            z = zDecodeBooleanElement2;
            str = strDecodeStringElement2;
            str2 = strDecodeStringElement;
            list2 = list3;
        } else {
            boolean z2 = true;
            InvestTipsBean investTipsBean3 = null;
            InvestExchangeRateBean investExchangeRateBean3 = null;
            List list5 = null;
            InvestTipInfoVo investTipInfoVo2 = null;
            Integer num3 = null;
            InvestTokenWithAmount investTokenWithAmount3 = null;
            String strDecodeStringElement3 = null;
            List list6 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement4 = false;
            zDecodeBooleanElement = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 0:
                        i4 |= 1;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 2:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 3:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list5);
                        i4 |= 8;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], list6);
                        i4 |= 16;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 5:
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i4 |= 32;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 6:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num3);
                        i4 |= 64;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 7:
                        investTipsBean3 = (InvestTipsBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, InvestTipsBean$$serializer.INSTANCE, investTipsBean3);
                        i4 |= 128;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 8:
                        investExchangeRateBean3 = (InvestExchangeRateBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, InvestExchangeRateBean$$serializer.INSTANCE, investExchangeRateBean3);
                        i4 |= 256;
                        break;
                    case 9:
                        i4 |= 512;
                        investTokenWithAmount3 = (InvestTokenWithAmount) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, InvestTokenWithAmount$$serializer.INSTANCE, investTokenWithAmount3);
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 10:
                        i4 |= 1024;
                        investTipInfoVo2 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo2);
                        i2 = 10;
                        i3 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement4;
            investTipsBean = investTipsBean3;
            investExchangeRateBean = investExchangeRateBean3;
            investTipInfoVo = investTipInfoVo2;
            i = i4;
            str = strDecodeStringElement3;
            num = num3;
            investTokenWithAmount = investTokenWithAmount3;
            list = list6;
            list2 = list5;
            str2 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestRedeemReceiveInfoUIBean(i, z, str2, str, list2, list, zDecodeBooleanElement, num, investTipsBean, investExchangeRateBean, investTokenWithAmount, investTipInfoVo, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestRedeemReceiveInfoUIBean investRedeemReceiveInfoUIBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investRedeemReceiveInfoUIBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestRedeemReceiveInfoUIBean.write$Self$OKDeFi_invest_biz(investRedeemReceiveInfoUIBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
