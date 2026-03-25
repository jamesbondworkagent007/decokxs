package com.okinc.crcore.coreapi.net.responsebean.bsc;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ConvertOrderDetailResponseBean$$serializer implements GeneratedSerializer<ConvertOrderDetailResponseBean> {
    public static final int $stable;
    public static final ConvertOrderDetailResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ConvertOrderDetailResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ConvertOrderDetailResponseBean$$serializer convertOrderDetailResponseBean$$serializer = new ConvertOrderDetailResponseBean$$serializer();
        INSTANCE = convertOrderDetailResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.ConvertOrderDetailResponseBean", convertOrderDetailResponseBean$$serializer, 22);
        pluginGeneratedSerialDescriptor.addElement("baseAmount", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencyName", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencyUrl", true);
        pluginGeneratedSerialDescriptor.addElement("brokerId", true);
        pluginGeneratedSerialDescriptor.addElement("convertBaseAmount", true);
        pluginGeneratedSerialDescriptor.addElement("convertBaseCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("convertBaseCurrencyName", true);
        pluginGeneratedSerialDescriptor.addElement("convertBaseCurrencyUrl", true);
        pluginGeneratedSerialDescriptor.addElement("orderStatus", true);
        pluginGeneratedSerialDescriptor.addElement("exchangeRate", true);
        pluginGeneratedSerialDescriptor.addElement("preExchangeRate", true);
        pluginGeneratedSerialDescriptor.addElement("convertUrl", true);
        pluginGeneratedSerialDescriptor.addElement("createdDate", true);
        pluginGeneratedSerialDescriptor.addElement("modifyDate", true);
        pluginGeneratedSerialDescriptor.addElement("userId", true);
        pluginGeneratedSerialDescriptor.addElement("slippageTolerance", true);
        pluginGeneratedSerialDescriptor.addElement("realPremiumRate", true);
        pluginGeneratedSerialDescriptor.addElement("failReason", true);
        pluginGeneratedSerialDescriptor.addElement("priceScale", true);
        pluginGeneratedSerialDescriptor.addElement("convertBaseCurrencyId", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencyId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, LongSerializer.INSTANCE, stringSerializer, stringSerializer, doubleSerializer, doubleSerializer, stringSerializer, intSerializer, intSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ConvertOrderDetailResponseBean deserialize(@NotNull Decoder decoder) {
        int i;
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
        int i2;
        String str11;
        double d;
        double d2;
        int iDecodeIntElement;
        int i3;
        String str12;
        String str13;
        String str14;
        String str15;
        long j;
        int iDecodeIntElement2;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 5;
        int i6 = 2;
        int i7 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 16);
            double dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 17);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 19);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 20);
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 21);
            i3 = iDecodeIntElement4;
            str12 = strDecodeStringElement15;
            d = dDecodeDoubleElement2;
            str13 = strDecodeStringElement14;
            d2 = dDecodeDoubleElement;
            str2 = strDecodeStringElement6;
            str5 = strDecodeStringElement9;
            str8 = strDecodeStringElement7;
            i2 = iDecodeIntElement3;
            str11 = strDecodeStringElement8;
            j = jDecodeLongElement;
            str3 = strDecodeStringElement4;
            str6 = strDecodeStringElement3;
            str14 = strDecodeStringElement12;
            str9 = strDecodeStringElement11;
            str = strDecodeStringElement;
            i = 4194303;
            str10 = strDecodeStringElement10;
            str15 = strDecodeStringElement13;
            str4 = strDecodeStringElement5;
            str7 = strDecodeStringElement2;
        } else {
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            boolean z = true;
            int iDecodeIntElement5 = 0;
            long jDecodeLongElement2 = 0;
            double dDecodeDoubleElement3 = 0.0d;
            double dDecodeDoubleElement4 = 0.0d;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 0:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 1:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 2:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i7 |= 4;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 3:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i7 |= 8;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 4:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 5:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i7 |= 32;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 6:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i7 |= 64;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 7:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i7 |= 128;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 8:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i7 |= 256;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 9:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i7 |= 512;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 10:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i7 |= 1024;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 11:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i7 |= 2048;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 12:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i7 |= 4096;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 13:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
                        i7 |= 8192;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 14:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i7 |= 16384;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 15:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i7 |= 32768;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 16:
                        dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 16);
                        i7 |= 65536;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 17:
                        dDecodeDoubleElement3 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 17);
                        i7 |= 131072;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 18:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i7 |= 262144;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 19:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 19);
                        i7 |= 524288;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 20:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 20);
                        i4 = 1048576;
                        i7 |= i4;
                        i5 = 5;
                        i6 = 2;
                        break;
                    case 21:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 21);
                        i4 = 2097152;
                        i7 |= i4;
                        i5 = 5;
                        i6 = 2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i7;
            str = strDecodeStringElement16;
            str2 = strDecodeStringElement17;
            str3 = strDecodeStringElement18;
            str4 = strDecodeStringElement19;
            str5 = strDecodeStringElement20;
            str6 = strDecodeStringElement21;
            str7 = strDecodeStringElement22;
            str8 = strDecodeStringElement23;
            str9 = strDecodeStringElement25;
            str10 = strDecodeStringElement26;
            i2 = iDecodeIntElement5;
            str11 = strDecodeStringElement27;
            d = dDecodeDoubleElement3;
            d2 = dDecodeDoubleElement4;
            iDecodeIntElement = iDecodeIntElement7;
            i3 = iDecodeIntElement8;
            str12 = strDecodeStringElement29;
            str13 = strDecodeStringElement30;
            str14 = strDecodeStringElement24;
            str15 = strDecodeStringElement28;
            j = jDecodeLongElement2;
            iDecodeIntElement2 = iDecodeIntElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ConvertOrderDetailResponseBean(i, str, str7, str6, str3, str4, str2, str8, str11, str5, i2, str10, str9, str14, j, str15, str13, d2, d, str12, i3, iDecodeIntElement, iDecodeIntElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ConvertOrderDetailResponseBean convertOrderDetailResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(convertOrderDetailResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ConvertOrderDetailResponseBean.write$Self$OKCRCore_cr_core(convertOrderDetailResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
