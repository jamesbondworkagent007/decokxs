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
public final /* synthetic */ class InvestSubscriptionReceiveInfoUIBean$$serializer implements GeneratedSerializer<InvestSubscriptionReceiveInfoUIBean> {
    public static final int $stable;
    public static final InvestSubscriptionReceiveInfoUIBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestSubscriptionReceiveInfoUIBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestSubscriptionReceiveInfoUIBean$$serializer investSubscriptionReceiveInfoUIBean$$serializer = new InvestSubscriptionReceiveInfoUIBean$$serializer();
        INSTANCE = investSubscriptionReceiveInfoUIBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean", investSubscriptionReceiveInfoUIBean$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("isInit", false);
        pluginGeneratedSerialDescriptor.addElement("platformLogo", true);
        pluginGeneratedSerialDescriptor.addElement("platformName", true);
        pluginGeneratedSerialDescriptor.addElement("investWithToken", true);
        pluginGeneratedSerialDescriptor.addElement("swapToToken", true);
        pluginGeneratedSerialDescriptor.addElement("receiveTokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("isDataErro", true);
        pluginGeneratedSerialDescriptor.addElement("tipsBean", true);
        pluginGeneratedSerialDescriptor.addElement("exchangeBean", true);
        pluginGeneratedSerialDescriptor.addElement("fixedApy", true);
        pluginGeneratedSerialDescriptor.addElement("maturityTime", true);
        pluginGeneratedSerialDescriptor.addElement("investmentCategory", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = InvestSubscriptionReceiveInfoUIBean.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(InvestTokenWithAmount$$serializer.INSTANCE), booleanSerializer, InvestTipsBean$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(InvestExchangeRateBean$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestSubscriptionReceiveInfoUIBean deserialize(@NotNull Decoder decoder) {
        InvestTipsBean investTipsBean;
        String str;
        List list;
        InvestExchangeRateBean investExchangeRateBean;
        List list2;
        String str2;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        InvestTokenWithAmount investTokenWithAmount;
        Integer num;
        int i;
        InvestTokenWithAmount investTokenWithAmount2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InvestSubscriptionReceiveInfoUIBean.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            InvestTokenWithAmount investTokenWithAmount3 = (InvestTokenWithAmount) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, InvestTokenWithAmount$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            InvestTipsBean investTipsBean2 = (InvestTipsBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, InvestTipsBean$$serializer.INSTANCE, null);
            InvestExchangeRateBean investExchangeRateBean2 = (InvestExchangeRateBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, InvestExchangeRateBean$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            list2 = list4;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, null);
            str2 = str6;
            str = str5;
            investTipsBean = investTipsBean2;
            z = zDecodeBooleanElement2;
            investTokenWithAmount = investTokenWithAmount3;
            investExchangeRateBean = investExchangeRateBean2;
            str3 = strDecodeStringElement2;
            list = list3;
            i = 4095;
            str4 = strDecodeStringElement;
            z2 = zDecodeBooleanElement;
        } else {
            int i4 = 11;
            InvestTipsBean investTipsBean3 = null;
            String str7 = null;
            List list5 = null;
            Integer num2 = null;
            String str8 = null;
            String strDecodeStringElement3 = null;
            InvestTokenWithAmount investTokenWithAmount4 = null;
            String strDecodeStringElement4 = null;
            int i5 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean z3 = true;
            List list6 = null;
            boolean zDecodeBooleanElement4 = false;
            InvestExchangeRateBean investExchangeRateBean3 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        investTokenWithAmount2 = investTokenWithAmount4;
                        z3 = false;
                        investTokenWithAmount4 = investTokenWithAmount2;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 0:
                        investTokenWithAmount2 = investTokenWithAmount4;
                        i5 |= 1;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        investTokenWithAmount4 = investTokenWithAmount2;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 1:
                        investTokenWithAmount2 = investTokenWithAmount4;
                        i5 |= 2;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        investTokenWithAmount4 = investTokenWithAmount2;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 2:
                        investTokenWithAmount2 = investTokenWithAmount4;
                        i5 |= 4;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        investTokenWithAmount4 = investTokenWithAmount2;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 3:
                        investTokenWithAmount2 = investTokenWithAmount4;
                        i5 |= 8;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list5);
                        investTokenWithAmount4 = investTokenWithAmount2;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        investTokenWithAmount2 = investTokenWithAmount4;
                        i5 |= 16;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], list6);
                        investTokenWithAmount4 = investTokenWithAmount2;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 5:
                        i5 |= 32;
                        investTokenWithAmount2 = (InvestTokenWithAmount) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, InvestTokenWithAmount$$serializer.INSTANCE, investTokenWithAmount4);
                        investTokenWithAmount4 = investTokenWithAmount2;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 6:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i5 |= 64;
                        investTokenWithAmount2 = investTokenWithAmount4;
                        investTokenWithAmount4 = investTokenWithAmount2;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 7:
                        investTipsBean3 = (InvestTipsBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, InvestTipsBean$$serializer.INSTANCE, investTipsBean3);
                        i5 |= 128;
                        investTokenWithAmount2 = investTokenWithAmount4;
                        investTokenWithAmount4 = investTokenWithAmount2;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 8:
                        i5 |= 256;
                        investExchangeRateBean3 = (InvestExchangeRateBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, InvestExchangeRateBean$$serializer.INSTANCE, investExchangeRateBean3);
                        investTokenWithAmount2 = investTokenWithAmount4;
                        investTokenWithAmount4 = investTokenWithAmount2;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 9:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str7);
                        i5 |= 512;
                        break;
                    case 10:
                        i5 |= 1024;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str8);
                        investTokenWithAmount2 = investTokenWithAmount4;
                        investTokenWithAmount4 = investTokenWithAmount2;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 11:
                        i5 |= 2048;
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, IntSerializer.INSTANCE, num2);
                        investTokenWithAmount2 = investTokenWithAmount4;
                        investTokenWithAmount4 = investTokenWithAmount2;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            InvestTokenWithAmount investTokenWithAmount5 = investTokenWithAmount4;
            investTipsBean = investTipsBean3;
            str = str7;
            list = list5;
            investExchangeRateBean = investExchangeRateBean3;
            list2 = list6;
            str2 = str8;
            str3 = strDecodeStringElement3;
            str4 = strDecodeStringElement4;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement4;
            investTokenWithAmount = investTokenWithAmount5;
            num = num2;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestSubscriptionReceiveInfoUIBean(i, z2, str4, str3, list, list2, investTokenWithAmount, z, investTipsBean, investExchangeRateBean, str, str2, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investSubscriptionReceiveInfoUIBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestSubscriptionReceiveInfoUIBean.write$Self$OKDeFi_invest_biz(investSubscriptionReceiveInfoUIBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
