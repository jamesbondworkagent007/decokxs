package com.okinc.okpaymentapi.data.remote.model.management;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class RecurringBuyPlanList$$serializer implements GeneratedSerializer<RecurringBuyPlanList> {
    public static final int $stable;
    public static final RecurringBuyPlanList$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RecurringBuyPlanList$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RecurringBuyPlanList$$serializer recurringBuyPlanList$$serializer = new RecurringBuyPlanList$$serializer();
        INSTANCE = recurringBuyPlanList$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okpaymentapi.data.remote.model.management.RecurringBuyPlanList", recurringBuyPlanList$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("baseCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencyIcon", true);
        pluginGeneratedSerialDescriptor.addElement("createTime", true);
        pluginGeneratedSerialDescriptor.addElement("firstOrderId", true);
        pluginGeneratedSerialDescriptor.addElement("frequency", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("nextPurchase", true);
        pluginGeneratedSerialDescriptor.addElement("orderList", true);
        pluginGeneratedSerialDescriptor.addElement("planId", true);
        pluginGeneratedSerialDescriptor.addElement("purchaseTimes", true);
        pluginGeneratedSerialDescriptor.addElement("quoteAmount", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("totalBaseAmount", true);
        pluginGeneratedSerialDescriptor.addElement("totalQuoteAmount", true);
        pluginGeneratedSerialDescriptor.addElement("currencySymbol", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrencySymbol", true);
        pluginGeneratedSerialDescriptor.addElement("quoteSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("lowBalance", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = RecurringBuyPlanList.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, longSerializer, stringSerializer, stringSerializer, longSerializer, stringSerializer, kSerializerArr[7], stringSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RecurringBuyPlanList deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        List list;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean zDecodeBooleanElement;
        long j;
        long j2;
        long j3;
        String strDecodeStringElement2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RecurringBuyPlanList.$childSerializers;
        String strDecodeStringElement3 = null;
        int i3 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
            str12 = strDecodeStringElement12;
            str4 = strDecodeStringElement5;
            str7 = strDecodeStringElement16;
            str9 = strDecodeStringElement15;
            str11 = strDecodeStringElement14;
            strDecodeStringElement = strDecodeStringElement13;
            list = list2;
            i = 524287;
            str6 = strDecodeStringElement9;
            str = strDecodeStringElement8;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement2;
            j3 = jDecodeLongElement;
            str5 = strDecodeStringElement4;
            str8 = strDecodeStringElement10;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement6;
            str10 = strDecodeStringElement11;
        } else {
            int i4 = 18;
            boolean zDecodeBooleanElement2 = false;
            String strDecodeStringElement17 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            boolean z = true;
            long jDecodeLongElement4 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            int i5 = 0;
            List list3 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 0:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 1:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 2:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i5 |= 4;
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 3:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = i5 | 8;
                        i5 = i2;
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 4:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = i5 | 16;
                        i5 = i2;
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 5:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i2 = i5 | 32;
                        i5 = i2;
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 6:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = i5 | 64;
                        i5 = i2;
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 7:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], list3);
                        i2 = i5 | 128;
                        i5 = i2;
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 8:
                        i5 |= 256;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 9:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
                        i5 |= 512;
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 10:
                        i5 |= 1024;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 11:
                        i5 |= 2048;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 12:
                        i5 |= 4096;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 13:
                        i5 |= 8192;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 14:
                        i5 |= 16384;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 15:
                        i5 |= 32768;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 16:
                        i5 |= 65536;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 17:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i5 |= 131072;
                        i3 = 8;
                        i4 = 18;
                        break;
                    case 18:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i5 = 262144 | i5;
                        i3 = 8;
                        i4 = 18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list3;
            i = i5;
            str = strDecodeStringElement21;
            str2 = strDecodeStringElement22;
            str3 = strDecodeStringElement23;
            str4 = strDecodeStringElement24;
            str5 = strDecodeStringElement25;
            str6 = strDecodeStringElement26;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            j = jDecodeLongElement4;
            j2 = jDecodeLongElement5;
            j3 = jDecodeLongElement6;
            strDecodeStringElement2 = strDecodeStringElement3;
            String str13 = strDecodeStringElement20;
            str7 = strDecodeStringElement27;
            str8 = str13;
            String str14 = strDecodeStringElement19;
            str9 = strDecodeStringElement28;
            str10 = str14;
            String str15 = strDecodeStringElement18;
            str11 = strDecodeStringElement17;
            str12 = str15;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecurringBuyPlanList(i, str5, str4, j3, str3, str2, j2, str, list, str6, j, str8, str10, str12, strDecodeStringElement, str11, str9, str7, strDecodeStringElement2, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RecurringBuyPlanList recurringBuyPlanList) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlanList, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecurringBuyPlanList.write$Self$OKPayments_ok_payment_api(recurringBuyPlanList, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
