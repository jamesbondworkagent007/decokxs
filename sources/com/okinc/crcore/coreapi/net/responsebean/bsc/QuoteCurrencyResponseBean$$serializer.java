package com.okinc.crcore.coreapi.net.responsebean.bsc;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.localization2.bean.AppLocaleInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class QuoteCurrencyResponseBean$$serializer implements GeneratedSerializer<QuoteCurrencyResponseBean> {
    public static final int $stable;
    public static final QuoteCurrencyResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private QuoteCurrencyResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        QuoteCurrencyResponseBean$$serializer quoteCurrencyResponseBean$$serializer = new QuoteCurrencyResponseBean$$serializer();
        INSTANCE = quoteCurrencyResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.QuoteCurrencyResponseBean", quoteCurrencyResponseBean$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("multipleQuoteCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("scale", true);
        pluginGeneratedSerialDescriptor.addElement("currencyName", true);
        pluginGeneratedSerialDescriptor.addElement("nightIcon", true);
        pluginGeneratedSerialDescriptor.addElement("quickAmountList", true);
        pluginGeneratedSerialDescriptor.addElement("symbol", true);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement(AppLocaleInfo.KEY_DISPLAY_NAME, true);
        pluginGeneratedSerialDescriptor.addElement("usdRate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = QuoteCurrencyResponseBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BooleanSerializer.INSTANCE, IntSerializer.INSTANCE, stringSerializer, stringSerializer, kSerializerArr[4], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, DoubleSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final QuoteCurrencyResponseBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        double dDecodeDoubleElement;
        String str2;
        String str3;
        String str4;
        int i;
        boolean z;
        int i2;
        String str5;
        String str6;
        List list;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = QuoteCurrencyResponseBean.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            list = list2;
            z = zDecodeBooleanElement;
            i2 = 2047;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            str3 = strDecodeStringElement6;
            str5 = strDecodeStringElement5;
            str4 = strDecodeStringElement4;
            str6 = strDecodeStringElement3;
            str2 = strDecodeStringElement7;
            str = strDecodeStringElement2;
            i = iDecodeIntElement;
            dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 10);
        } else {
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement2 = 0;
            boolean z3 = true;
            double dDecodeDoubleElement2 = 0.0d;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            int i3 = 0;
            List list3 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        z3 = z2;
                        break;
                    case 0:
                        i3 |= 1;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        break;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        z2 = z3;
                        z3 = z2;
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        z2 = z3;
                        z3 = z2;
                        break;
                    case 4:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], list3);
                        i3 |= 16;
                        z2 = z3;
                        z3 = z2;
                        break;
                    case 5:
                        i3 |= 32;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        z2 = z3;
                        z3 = z2;
                        break;
                    case 6:
                        i3 |= 64;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        z2 = z3;
                        z3 = z2;
                        break;
                    case 7:
                        i3 |= 128;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        z2 = z3;
                        z3 = z2;
                        break;
                    case 8:
                        i3 |= 256;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        z2 = z3;
                        z3 = z2;
                        break;
                    case 9:
                        i3 |= 512;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        z2 = z3;
                        z3 = z2;
                        break;
                    case 10:
                        dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 10);
                        i3 |= 1024;
                        z2 = z3;
                        z3 = z2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement = strDecodeStringElement9;
            str = strDecodeStringElement12;
            dDecodeDoubleElement = dDecodeDoubleElement2;
            str2 = strDecodeStringElement13;
            str3 = strDecodeStringElement14;
            str4 = strDecodeStringElement8;
            i = iDecodeIntElement2;
            z = zDecodeBooleanElement2;
            i2 = i3;
            str5 = strDecodeStringElement10;
            str6 = strDecodeStringElement11;
            list = list3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new QuoteCurrencyResponseBean(i2, z, i, str, str6, list, str4, str5, str3, str2, strDecodeStringElement, dDecodeDoubleElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull QuoteCurrencyResponseBean quoteCurrencyResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(quoteCurrencyResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        QuoteCurrencyResponseBean.write$Self$OKCRCore_cr_core(quoteCurrencyResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
