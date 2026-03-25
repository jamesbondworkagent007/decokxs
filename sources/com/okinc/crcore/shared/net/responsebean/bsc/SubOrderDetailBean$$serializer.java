package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.localization2.bean.AppLocaleInfo;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class SubOrderDetailBean$$serializer implements GeneratedSerializer<SubOrderDetailBean> {
    public static final int $stable;
    public static final SubOrderDetailBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SubOrderDetailBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SubOrderDetailBean$$serializer subOrderDetailBean$$serializer = new SubOrderDetailBean$$serializer();
        INSTANCE = subOrderDetailBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.shared.net.responsebean.bsc.SubOrderDetailBean", subOrderDetailBean$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("baseAmount", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencyUrl", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencyNightUrl", true);
        pluginGeneratedSerialDescriptor.addElement("quoteAmount", true);
        pluginGeneratedSerialDescriptor.addElement("tradeType", true);
        pluginGeneratedSerialDescriptor.addElement("paymentMethod", true);
        pluginGeneratedSerialDescriptor.addElement("displayTitle", true);
        pluginGeneratedSerialDescriptor.addElement("clickable", true);
        pluginGeneratedSerialDescriptor.addElement(AppLocaleInfo.KEY_DISPLAY_NAME, true);
        pluginGeneratedSerialDescriptor.addElement("paymentMethodUrl", true);
        pluginGeneratedSerialDescriptor.addElement("paymentMethodNightUrl", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("orderNo", true);
        pluginGeneratedSerialDescriptor.addElement("createDate", true);
        pluginGeneratedSerialDescriptor.addElement("localizedNetworkInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SubOrderDetailBean.$childSerializers;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{IntSerializer.INSTANCE, doubleSerializer, stringSerializer, stringSerializer, stringSerializer, doubleSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[16])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SubOrderDetailBean deserialize(@NotNull Decoder decoder) {
        double d;
        boolean z;
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
        double d2;
        long j;
        List list;
        int i;
        int i2;
        int iDecodeIntElement;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SubOrderDetailBean.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 1);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            double dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 15);
            i2 = 131071;
            str6 = strDecodeStringElement7;
            str9 = strDecodeStringElement4;
            str10 = strDecodeStringElement2;
            str4 = strDecodeStringElement10;
            str = strDecodeStringElement6;
            str7 = strDecodeStringElement3;
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], null);
            j = jDecodeLongElement;
            str3 = strDecodeStringElement11;
            str8 = strDecodeStringElement5;
            str11 = strDecodeStringElement;
            str5 = strDecodeStringElement9;
            str2 = strDecodeStringElement8;
            i = iDecodeIntElement2;
            d2 = dDecodeDoubleElement2;
            z = zDecodeBooleanElement;
            d = dDecodeDoubleElement;
        } else {
            int i3 = 0;
            int i4 = 16;
            boolean z2 = true;
            List list2 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            int i5 = 0;
            double dDecodeDoubleElement3 = 0.0d;
            long jDecodeLongElement2 = 0;
            boolean zDecodeBooleanElement2 = false;
            double dDecodeDoubleElement4 = 0.0d;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i4 = 16;
                        break;
                    case 0:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i3 |= 1;
                        i5 = iDecodeIntElement;
                        i4 = 16;
                        break;
                    case 1:
                        dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 1);
                        i3 |= 2;
                        iDecodeIntElement = i5;
                        i5 = iDecodeIntElement;
                        i4 = 16;
                        break;
                    case 2:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i4 = 16;
                        break;
                    case 3:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i4 = 16;
                        break;
                    case 4:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        i4 = 16;
                        break;
                    case 5:
                        dDecodeDoubleElement3 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
                        i3 |= 32;
                        i4 = 16;
                        break;
                    case 6:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        i4 = 16;
                        break;
                    case 7:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        i4 = 16;
                        break;
                    case 8:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                        i4 = 16;
                        break;
                    case 9:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i3 |= 512;
                        i4 = 16;
                        break;
                    case 10:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 |= 1024;
                        i4 = 16;
                        break;
                    case 11:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 |= 2048;
                        i4 = 16;
                        break;
                    case 12:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i3 |= 4096;
                        i4 = 16;
                        break;
                    case 13:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i3 |= 8192;
                        i4 = 16;
                        break;
                    case 14:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 |= 16384;
                        i4 = 16;
                        break;
                    case 15:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 15);
                        i3 |= 32768;
                        i4 = 16;
                        break;
                    case 16:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kSerializerArr[i4], list2);
                        i3 |= 65536;
                        i4 = 16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            d = dDecodeDoubleElement4;
            z = zDecodeBooleanElement2;
            str = strDecodeStringElement12;
            str2 = strDecodeStringElement13;
            str3 = strDecodeStringElement14;
            str4 = strDecodeStringElement15;
            str5 = strDecodeStringElement16;
            str6 = strDecodeStringElement17;
            str7 = strDecodeStringElement18;
            str8 = strDecodeStringElement19;
            str9 = strDecodeStringElement20;
            str10 = strDecodeStringElement21;
            str11 = strDecodeStringElement22;
            d2 = dDecodeDoubleElement3;
            j = jDecodeLongElement2;
            list = list2;
            int i6 = i3;
            i = i5;
            i2 = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SubOrderDetailBean(i2, i, d, str11, str10, str7, d2, str9, str8, str, z, str6, str2, str5, str4, str3, j, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SubOrderDetailBean subOrderDetailBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(subOrderDetailBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SubOrderDetailBean.write$Self$OKCRCore_cr_core(subOrderDetailBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
