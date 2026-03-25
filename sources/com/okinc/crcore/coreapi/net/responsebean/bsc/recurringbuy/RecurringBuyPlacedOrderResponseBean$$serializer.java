package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class RecurringBuyPlacedOrderResponseBean$$serializer implements GeneratedSerializer<RecurringBuyPlacedOrderResponseBean> {
    public static final int $stable;
    public static final RecurringBuyPlacedOrderResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RecurringBuyPlacedOrderResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RecurringBuyPlacedOrderResponseBean$$serializer recurringBuyPlacedOrderResponseBean$$serializer = new RecurringBuyPlacedOrderResponseBean$$serializer();
        INSTANCE = recurringBuyPlacedOrderResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlacedOrderResponseBean", recurringBuyPlacedOrderResponseBean$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("baseAmount", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencySymbol", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencyIcon", true);
        pluginGeneratedSerialDescriptor.addElement("createDate", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("orderNo", true);
        pluginGeneratedSerialDescriptor.addElement("quoteAmount", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrencySymbol", true);
        pluginGeneratedSerialDescriptor.addElement("quoteSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("tradeType", true);
        pluginGeneratedSerialDescriptor.addElement("displayQuoteCurrencyAfterAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, LongSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RecurringBuyPlacedOrderResponseBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        boolean zDecodeBooleanElement;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        long j;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            str2 = strDecodeStringElement2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            str = strDecodeStringElement11;
            str3 = strDecodeStringElement10;
            str6 = strDecodeStringElement8;
            str9 = strDecodeStringElement7;
            str7 = strDecodeStringElement6;
            strDecodeStringElement = strDecodeStringElement5;
            str4 = strDecodeStringElement9;
            str8 = strDecodeStringElement4;
            str5 = strDecodeStringElement3;
            j = jDecodeLongElement;
            i = 4095;
        } else {
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            boolean z2 = true;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement20 = null;
            boolean zDecodeBooleanElement2 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = z;
                        break;
                    case 0:
                        i2 |= 1;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        break;
                    case 1:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        z = z2;
                        z2 = z;
                        break;
                    case 3:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i2 |= 8;
                        z = z2;
                        z2 = z;
                        break;
                    case 4:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 |= 16;
                        z = z2;
                        z2 = z;
                        break;
                    case 5:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        z = z2;
                        z2 = z;
                        break;
                    case 6:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                        z = z2;
                        z2 = z;
                        break;
                    case 7:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 |= 128;
                        z = z2;
                        z2 = z;
                        break;
                    case 8:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 |= 256;
                        z = z2;
                        z2 = z;
                        break;
                    case 9:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 |= 512;
                        z = z2;
                        z2 = z;
                        break;
                    case 10:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i2 |= 1024;
                        z = z2;
                        z2 = z;
                        break;
                    case 11:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i2 |= 2048;
                        z = z2;
                        z2 = z;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str = strDecodeStringElement20;
            str2 = strDecodeStringElement12;
            i = i2;
            long j2 = jDecodeLongElement2;
            str3 = strDecodeStringElement13;
            str4 = strDecodeStringElement17;
            str5 = strDecodeStringElement19;
            str6 = strDecodeStringElement14;
            str7 = strDecodeStringElement16;
            str8 = strDecodeStringElement18;
            str9 = strDecodeStringElement15;
            j = j2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecurringBuyPlacedOrderResponseBean(i, str2, str5, str8, j, strDecodeStringElement, str7, str9, str6, str4, str3, str, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RecurringBuyPlacedOrderResponseBean recurringBuyPlacedOrderResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlacedOrderResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecurringBuyPlacedOrderResponseBean.write$Self$OKCRCore_cr_core(recurringBuyPlacedOrderResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
