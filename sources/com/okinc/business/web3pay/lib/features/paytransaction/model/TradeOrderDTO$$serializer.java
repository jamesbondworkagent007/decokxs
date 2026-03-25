package com.okinc.business.web3pay.lib.features.paytransaction.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class TradeOrderDTO$$serializer implements GeneratedSerializer<TradeOrderDTO> {
    public static final int $stable;
    public static final TradeOrderDTO$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TradeOrderDTO$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TradeOrderDTO$$serializer tradeOrderDTO$$serializer = new TradeOrderDTO$$serializer();
        INSTANCE = tradeOrderDTO$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.paytransaction.model.TradeOrderDTO", tradeOrderDTO$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("tradeOrderId", true);
        pluginGeneratedSerialDescriptor.addElement("merchantId", false);
        pluginGeneratedSerialDescriptor.addElement("productCode", false);
        pluginGeneratedSerialDescriptor.addElement("receiverInfo", false);
        pluginGeneratedSerialDescriptor.addElement("orderFiatAmount", true);
        pluginGeneratedSerialDescriptor.addElement("fiatCurrencyCode", true);
        pluginGeneratedSerialDescriptor.addElement("maxLimitAmount", true);
        pluginGeneratedSerialDescriptor.addElement("minLimitAmount", true);
        pluginGeneratedSerialDescriptor.addElement("createTime", true);
        pluginGeneratedSerialDescriptor.addElement("expireTime", true);
        pluginGeneratedSerialDescriptor.addElement("qrCodeAcquire", true);
        pluginGeneratedSerialDescriptor.addElement("usdAmount", true);
        pluginGeneratedSerialDescriptor.addElement("rateInfo", true);
        pluginGeneratedSerialDescriptor.addElement("externalFeeInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(FiatAmountDTO$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(QRCodeAcquire$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(RateInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ExternalFeeInfo$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TradeOrderDTO deserialize(@NotNull Decoder decoder) {
        RateInfo rateInfo;
        Long l;
        ExternalFeeInfo externalFeeInfo;
        String str;
        FiatAmountDTO fiatAmountDTO;
        String str2;
        String str3;
        String str4;
        QRCodeAcquire qRCodeAcquire;
        int i;
        String str5;
        String str6;
        String str7;
        Long l2;
        String str8;
        FiatAmountDTO fiatAmountDTO2;
        String str9;
        String str10;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        ExternalFeeInfo externalFeeInfo2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            FiatAmountDTO fiatAmountDTO3 = (FiatAmountDTO) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FiatAmountDTO$$serializer.INSTANCE, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, longSerializer, null);
            QRCodeAcquire qRCodeAcquire2 = (QRCodeAcquire) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, QRCodeAcquire$$serializer.INSTANCE, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            rateInfo = (RateInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, RateInfo$$serializer.INSTANCE, null);
            externalFeeInfo = (ExternalFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, ExternalFeeInfo$$serializer.INSTANCE, null);
            fiatAmountDTO = fiatAmountDTO3;
            qRCodeAcquire = qRCodeAcquire2;
            l2 = l4;
            str2 = str14;
            l = l3;
            str5 = str15;
            str7 = strDecodeStringElement;
            str = str13;
            str3 = str12;
            i = 16383;
            str8 = strDecodeStringElement2;
            str4 = strDecodeStringElement3;
            str6 = str11;
        } else {
            int i5 = 13;
            int i6 = 0;
            boolean z = true;
            RateInfo rateInfo2 = null;
            Long l5 = null;
            QRCodeAcquire qRCodeAcquire3 = null;
            String str16 = null;
            String str17 = null;
            Long l6 = null;
            String str18 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            FiatAmountDTO fiatAmountDTO4 = null;
            String str19 = null;
            String str20 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        fiatAmountDTO2 = fiatAmountDTO4;
                        str9 = str19;
                        str10 = str20;
                        z = false;
                        str19 = str9;
                        fiatAmountDTO4 = fiatAmountDTO2;
                        str20 = str10;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 0:
                        fiatAmountDTO2 = fiatAmountDTO4;
                        str9 = str19;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str20);
                        i6 |= 1;
                        str19 = str9;
                        fiatAmountDTO4 = fiatAmountDTO2;
                        str20 = str10;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 1:
                        fiatAmountDTO2 = fiatAmountDTO4;
                        str9 = str19;
                        i6 |= 2;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        str10 = str20;
                        str19 = str9;
                        fiatAmountDTO4 = fiatAmountDTO2;
                        str20 = str10;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 2:
                        fiatAmountDTO2 = fiatAmountDTO4;
                        str9 = str19;
                        i6 |= 4;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        str10 = str20;
                        str19 = str9;
                        fiatAmountDTO4 = fiatAmountDTO2;
                        str20 = str10;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 3:
                        fiatAmountDTO2 = fiatAmountDTO4;
                        str9 = str19;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        str10 = str20;
                        str19 = str9;
                        fiatAmountDTO4 = fiatAmountDTO2;
                        str20 = str10;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 4:
                        str9 = str19;
                        fiatAmountDTO2 = (FiatAmountDTO) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FiatAmountDTO$$serializer.INSTANCE, fiatAmountDTO4);
                        i6 |= 16;
                        str10 = str20;
                        str19 = str9;
                        fiatAmountDTO4 = fiatAmountDTO2;
                        str20 = str10;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 5:
                        str9 = str19;
                        i6 |= 32;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str18);
                        fiatAmountDTO2 = fiatAmountDTO4;
                        str10 = str20;
                        str19 = str9;
                        fiatAmountDTO4 = fiatAmountDTO2;
                        str20 = str10;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 6:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str19);
                        i6 |= 64;
                        fiatAmountDTO2 = fiatAmountDTO4;
                        str10 = str20;
                        str19 = str9;
                        fiatAmountDTO4 = fiatAmountDTO2;
                        str20 = str10;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 7:
                        i6 |= 128;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str16);
                        fiatAmountDTO2 = fiatAmountDTO4;
                        str9 = str19;
                        str10 = str20;
                        str19 = str9;
                        fiatAmountDTO4 = fiatAmountDTO2;
                        str20 = str10;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 8:
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, LongSerializer.INSTANCE, l5);
                        i6 |= 256;
                        fiatAmountDTO2 = fiatAmountDTO4;
                        str9 = str19;
                        str10 = str20;
                        str19 = str9;
                        fiatAmountDTO4 = fiatAmountDTO2;
                        str20 = str10;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 9:
                        i6 |= 512;
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, LongSerializer.INSTANCE, l6);
                        fiatAmountDTO2 = fiatAmountDTO4;
                        str9 = str19;
                        str10 = str20;
                        str19 = str9;
                        fiatAmountDTO4 = fiatAmountDTO2;
                        str20 = str10;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 10:
                        qRCodeAcquire3 = (QRCodeAcquire) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, QRCodeAcquire$$serializer.INSTANCE, qRCodeAcquire3);
                        i6 |= 1024;
                        i5 = 13;
                        break;
                    case 11:
                        i6 |= 2048;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str17);
                        fiatAmountDTO2 = fiatAmountDTO4;
                        str9 = str19;
                        str10 = str20;
                        str19 = str9;
                        fiatAmountDTO4 = fiatAmountDTO2;
                        str20 = str10;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 12:
                        rateInfo2 = (RateInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, RateInfo$$serializer.INSTANCE, rateInfo2);
                        i6 |= 4096;
                        fiatAmountDTO2 = fiatAmountDTO4;
                        str9 = str19;
                        str10 = str20;
                        str19 = str9;
                        fiatAmountDTO4 = fiatAmountDTO2;
                        str20 = str10;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 13:
                        externalFeeInfo2 = (ExternalFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, ExternalFeeInfo$$serializer.INSTANCE, externalFeeInfo2);
                        i6 |= 8192;
                        fiatAmountDTO2 = fiatAmountDTO4;
                        str9 = str19;
                        str10 = str20;
                        str19 = str9;
                        fiatAmountDTO4 = fiatAmountDTO2;
                        str20 = str10;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            rateInfo = rateInfo2;
            l = l5;
            externalFeeInfo = externalFeeInfo2;
            str = str19;
            fiatAmountDTO = fiatAmountDTO4;
            str2 = str16;
            str3 = str18;
            str4 = strDecodeStringElement5;
            qRCodeAcquire = qRCodeAcquire3;
            i = i6;
            String str21 = strDecodeStringElement6;
            str5 = str17;
            str6 = str20;
            str7 = str21;
            String str22 = strDecodeStringElement4;
            l2 = l6;
            str8 = str22;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TradeOrderDTO(i, str6, str7, str8, str4, fiatAmountDTO, str3, str, str2, l, l2, qRCodeAcquire, str5, rateInfo, externalFeeInfo, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TradeOrderDTO tradeOrderDTO) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradeOrderDTO, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TradeOrderDTO.write$Self$OKPayCore_web3pay_lib(tradeOrderDTO, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
