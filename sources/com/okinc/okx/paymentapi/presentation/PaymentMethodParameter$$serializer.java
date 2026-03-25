package com.okinc.okx.paymentapi.presentation;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.Channel$$serializer;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
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

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class PaymentMethodParameter$$serializer implements GeneratedSerializer<PaymentMethodParameter> {
    public static final int $stable;
    public static final PaymentMethodParameter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PaymentMethodParameter$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PaymentMethodParameter$$serializer paymentMethodParameter$$serializer = new PaymentMethodParameter$$serializer();
        INSTANCE = paymentMethodParameter$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okx.paymentapi.presentation.PaymentMethodParameter", paymentMethodParameter$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("fiatCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("fiatAmount", true);
        pluginGeneratedSerialDescriptor.addElement("cryptoCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("cryptoAmount", true);
        pluginGeneratedSerialDescriptor.addElement("tradeType", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.INPUT_TYPE, true);
        pluginGeneratedSerialDescriptor.addElement("cryptoPrecision", false);
        pluginGeneratedSerialDescriptor.addElement("isFromBSC", true);
        pluginGeneratedSerialDescriptor.addElement("currencyScale", true);
        pluginGeneratedSerialDescriptor.addElement("isRecurringFlow", true);
        pluginGeneratedSerialDescriptor.addElement("userSelectedChannel", true);
        pluginGeneratedSerialDescriptor.addElement("userSelectedPaymentMethod", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = PaymentMethodParameter.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[4], intSerializer, intSerializer, booleanSerializer, intSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(Channel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PaymentMethodParameter deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        String str;
        TradeType tradeType;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod paymentMethod;
        String str2;
        Channel channel;
        String str3;
        String str4;
        String str5;
        String str6;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PaymentMethodParameter.$childSerializers;
        int i7 = 10;
        int i8 = 9;
        int i9 = 7;
        com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod paymentMethod2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            TradeType tradeType2 = (TradeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            Channel channel2 = (Channel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, Channel$$serializer.INSTANCE, null);
            i = 4095;
            tradeType = tradeType2;
            str3 = str10;
            paymentMethod = (com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod$$serializer.INSTANCE, null);
            channel = channel2;
            zDecodeBooleanElement = zDecodeBooleanElement3;
            z = zDecodeBooleanElement2;
            i2 = iDecodeIntElement2;
            i3 = iDecodeIntElement;
            i4 = iDecodeIntElement3;
            str = str9;
            str2 = str7;
            str4 = str8;
        } else {
            int i10 = 11;
            Channel channel3 = null;
            TradeType tradeType3 = null;
            String str11 = null;
            String str12 = null;
            int i11 = 0;
            zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement4 = false;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            boolean z2 = true;
            String str13 = null;
            str = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str5 = str11;
                        str6 = str12;
                        z2 = false;
                        str11 = str5;
                        str12 = str6;
                        i10 = 11;
                        i7 = 10;
                        i8 = 9;
                        i9 = 7;
                        break;
                    case 0:
                        str6 = str12;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str11);
                        i5 = i11 | 1;
                        i11 = i5;
                        str12 = str6;
                        i10 = 11;
                        i7 = 10;
                        i8 = 9;
                        i9 = 7;
                        break;
                    case 1:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str12);
                        i5 = i11 | 2;
                        str6 = str12;
                        i11 = i5;
                        str12 = str6;
                        i10 = 11;
                        i7 = 10;
                        i8 = 9;
                        i9 = 7;
                        break;
                    case 2:
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str);
                        i5 = i11 | 4;
                        str6 = str12;
                        i11 = i5;
                        str12 = str6;
                        i10 = 11;
                        i7 = 10;
                        i8 = 9;
                        i9 = 7;
                        break;
                    case 3:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str13);
                        i5 = i11 | 8;
                        str6 = str12;
                        i11 = i5;
                        str12 = str6;
                        i10 = 11;
                        i7 = 10;
                        i8 = 9;
                        i9 = 7;
                        break;
                    case 4:
                        tradeType3 = (TradeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], tradeType3);
                        i5 = i11 | 16;
                        str6 = str12;
                        i11 = i5;
                        str12 = str6;
                        i10 = 11;
                        i7 = 10;
                        i8 = 9;
                        i9 = 7;
                        break;
                    case 5:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i11 |= 32;
                        str5 = str11;
                        str6 = str12;
                        str11 = str5;
                        str12 = str6;
                        i10 = 11;
                        i7 = 10;
                        i8 = 9;
                        i9 = 7;
                        break;
                    case 6:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i11 |= 64;
                        break;
                    case 7:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i9);
                        i6 = i11 | 128;
                        i11 = i6;
                        str6 = str12;
                        str12 = str6;
                        i10 = 11;
                        i7 = 10;
                        i8 = 9;
                        i9 = 7;
                        break;
                    case 8:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i6 = i11 | 256;
                        i11 = i6;
                        str6 = str12;
                        str12 = str6;
                        i10 = 11;
                        i7 = 10;
                        i8 = 9;
                        i9 = 7;
                        break;
                    case 9:
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i8);
                        i6 = i11 | 512;
                        i11 = i6;
                        str6 = str12;
                        str12 = str6;
                        i10 = 11;
                        i7 = 10;
                        i8 = 9;
                        i9 = 7;
                        break;
                    case 10:
                        channel3 = (Channel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i7, Channel$$serializer.INSTANCE, channel3);
                        i6 = i11 | 1024;
                        i11 = i6;
                        str6 = str12;
                        str12 = str6;
                        i10 = 11;
                        i7 = 10;
                        i8 = 9;
                        i9 = 7;
                        break;
                    case 11:
                        paymentMethod2 = (com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i10, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod$$serializer.INSTANCE, paymentMethod2);
                        i6 = i11 | 2048;
                        i11 = i6;
                        str6 = str12;
                        str12 = str6;
                        i10 = 11;
                        i7 = 10;
                        i8 = 9;
                        i9 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str14 = str11;
            String str15 = str12;
            tradeType = tradeType3;
            i = i11;
            z = zDecodeBooleanElement4;
            i2 = iDecodeIntElement4;
            i3 = iDecodeIntElement5;
            i4 = iDecodeIntElement6;
            paymentMethod = paymentMethod2;
            str2 = str14;
            channel = channel3;
            str3 = str13;
            str4 = str15;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PaymentMethodParameter(i, str2, str4, str, str3, tradeType, i3, i2, z, i4, zDecodeBooleanElement, channel, paymentMethod, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PaymentMethodParameter paymentMethodParameter) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(paymentMethodParameter, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PaymentMethodParameter.write$Self$OKPayments_ok_payment_api(paymentMethodParameter, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
