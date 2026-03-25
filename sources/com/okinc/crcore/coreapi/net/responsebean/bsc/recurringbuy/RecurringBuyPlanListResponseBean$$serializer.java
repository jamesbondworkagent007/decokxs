package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class RecurringBuyPlanListResponseBean$$serializer implements GeneratedSerializer<RecurringBuyPlanListResponseBean> {
    public static final int $stable;
    public static final RecurringBuyPlanListResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RecurringBuyPlanListResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RecurringBuyPlanListResponseBean$$serializer recurringBuyPlanListResponseBean$$serializer = new RecurringBuyPlanListResponseBean$$serializer();
        INSTANCE = recurringBuyPlanListResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanListResponseBean", recurringBuyPlanListResponseBean$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement("baseCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencyIcon", true);
        pluginGeneratedSerialDescriptor.addElement("createTime", true);
        pluginGeneratedSerialDescriptor.addElement("firstOrder", true);
        pluginGeneratedSerialDescriptor.addElement("frequency", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("nextPurchase", true);
        pluginGeneratedSerialDescriptor.addElement("orderList", false);
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
        pluginGeneratedSerialDescriptor.addElement("recurringBuyErrorType", true);
        pluginGeneratedSerialDescriptor.addElement("displayQuoteCurrencyAfterAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = RecurringBuyPlanListResponseBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, longSerializer, stringSerializer, stringSerializer, longSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[7]), stringSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RecurringBuyPlanListResponseBean deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        List list;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        long j;
        long j2;
        long j3;
        String strDecodeStringElement;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        boolean z;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RecurringBuyPlanListResponseBean.$childSerializers;
        int i3 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            list = list2;
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 20);
            j = jDecodeLongElement3;
            str13 = strDecodeStringElement12;
            z = zDecodeBooleanElement2;
            str8 = strDecodeStringElement15;
            str10 = strDecodeStringElement14;
            str12 = strDecodeStringElement13;
            j2 = jDecodeLongElement;
            j3 = jDecodeLongElement2;
            str4 = strDecodeStringElement4;
            str14 = strDecodeStringElement8;
            str3 = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str7 = strDecodeStringElement9;
            str9 = strDecodeStringElement10;
            str11 = strDecodeStringElement11;
            str6 = strDecodeStringElement2;
            str5 = strDecodeStringElement3;
            i = 2097151;
            str = strDecodeStringElement7;
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
            boolean zDecodeBooleanElement3 = false;
            boolean z2 = true;
            long jDecodeLongElement4 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            boolean zDecodeBooleanElement4 = false;
            int i4 = 0;
            List list3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 3;
                        break;
                    case 0:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 3;
                        break;
                    case 1:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 3;
                        break;
                    case 2:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i4 |= 4;
                        i3 = 3;
                        break;
                    case 3:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i4 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = i4 | 16;
                        i4 = i2;
                        i3 = 3;
                        break;
                    case 5:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i2 = i4 | 32;
                        i4 = i2;
                        i3 = 3;
                        break;
                    case 6:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = i4 | 64;
                        i4 = i2;
                        i3 = 3;
                        break;
                    case 7:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], list3);
                        i2 = i4 | 128;
                        i4 = i2;
                        i3 = 3;
                        break;
                    case 8:
                        i4 |= 256;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 = 3;
                        break;
                    case 9:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
                        i4 |= 512;
                        i3 = 3;
                        break;
                    case 10:
                        i4 |= 1024;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 = 3;
                        break;
                    case 11:
                        i4 |= 2048;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 = 3;
                        break;
                    case 12:
                        i4 |= 4096;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i3 = 3;
                        break;
                    case 13:
                        i4 |= 8192;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i3 = 3;
                        break;
                    case 14:
                        i4 |= 16384;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 = 3;
                        break;
                    case 15:
                        i4 |= 32768;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i3 = 3;
                        break;
                    case 16:
                        i4 |= 65536;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i3 = 3;
                        break;
                    case 17:
                        i4 |= 131072;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i3 = 3;
                        break;
                    case 18:
                        i4 |= 262144;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
                        break;
                    case 19:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i4 |= 524288;
                        break;
                    case 20:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 20);
                        i4 = 1048576 | i4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            list = list3;
            i = i4;
            str = strDecodeStringElement23;
            str2 = strDecodeStringElement24;
            str3 = strDecodeStringElement25;
            str4 = strDecodeStringElement26;
            str5 = strDecodeStringElement27;
            str6 = strDecodeStringElement28;
            j = jDecodeLongElement4;
            j2 = jDecodeLongElement5;
            j3 = jDecodeLongElement6;
            strDecodeStringElement = strDecodeStringElement30;
            str7 = strDecodeStringElement21;
            str8 = strDecodeStringElement16;
            str9 = strDecodeStringElement20;
            str10 = strDecodeStringElement17;
            str11 = strDecodeStringElement19;
            str12 = strDecodeStringElement18;
            str13 = strDecodeStringElement29;
            str14 = strDecodeStringElement22;
            z = zDecodeBooleanElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecurringBuyPlanListResponseBean(i, str6, str5, j2, str4, str3, j3, str2, list, str, j, str14, str7, str9, str11, str13, str12, str10, str8, z, strDecodeStringElement, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RecurringBuyPlanListResponseBean recurringBuyPlanListResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlanListResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecurringBuyPlanListResponseBean.write$Self$OKCRCore_cr_core(recurringBuyPlanListResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
