package com.okinc.okpaymentapi.data.remote.model.management;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class OrderDetailList$$serializer implements GeneratedSerializer<OrderDetailList> {
    public static final int $stable;
    public static final OrderDetailList$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OrderDetailList$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OrderDetailList$$serializer orderDetailList$$serializer = new OrderDetailList$$serializer();
        INSTANCE = orderDetailList$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okpaymentapi.data.remote.model.management.OrderDetailList", orderDetailList$$serializer, 28);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencySymbol", false);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrencySymbol", false);
        pluginGeneratedSerialDescriptor.addElement("baseAmount", false);
        pluginGeneratedSerialDescriptor.addElement("quoteAmount", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("withdrawStatus", false);
        pluginGeneratedSerialDescriptor.addElement("txId", false);
        pluginGeneratedSerialDescriptor.addElement("failReason", false);
        pluginGeneratedSerialDescriptor.addElement("userCountry", false);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, false);
        pluginGeneratedSerialDescriptor.addElement("lastFour", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("orderNo", false);
        pluginGeneratedSerialDescriptor.addElement("realOrderNo", false);
        pluginGeneratedSerialDescriptor.addElement("depositName", false);
        pluginGeneratedSerialDescriptor.addElement("createDate", false);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, false);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, false);
        pluginGeneratedSerialDescriptor.addElement("url", false);
        pluginGeneratedSerialDescriptor.addElement("isConvert", false);
        pluginGeneratedSerialDescriptor.addElement("convertOrderDetail", true);
        pluginGeneratedSerialDescriptor.addElement("logoUrl", false);
        pluginGeneratedSerialDescriptor.addElement("channelFee", false);
        pluginGeneratedSerialDescriptor.addElement("quoteSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("paymentMethod", false);
        pluginGeneratedSerialDescriptor.addElement("paymentMethodUrl", false);
        pluginGeneratedSerialDescriptor.addElement("paymentMethodNightUrl", false);
        pluginGeneratedSerialDescriptor.addElement("payCardNumber", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, LongSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, RecurringConvertOrderDetail$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OrderDetailList deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String strDecodeStringElement;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        long j;
        RecurringConvertOrderDetail recurringConvertOrderDetail;
        String strDecodeStringElement2;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        boolean z;
        String str21;
        String str22;
        String str23;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 5;
        int i6 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, null);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 15);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
            RecurringConvertOrderDetail recurringConvertOrderDetail2 = (RecurringConvertOrderDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 20, RecurringConvertOrderDetail$$serializer.INSTANCE, null);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            str3 = strDecodeStringElement21;
            str20 = strDecodeStringElement22;
            str18 = strDecodeStringElement23;
            str16 = strDecodeStringElement24;
            str23 = strDecodeStringElement19;
            z = zDecodeBooleanElement;
            str15 = strDecodeStringElement16;
            recurringConvertOrderDetail = recurringConvertOrderDetail2;
            str12 = strDecodeStringElement11;
            str2 = strDecodeStringElement14;
            str7 = strDecodeStringElement9;
            str6 = strDecodeStringElement10;
            i = 268435455;
            str22 = strDecodeStringElement20;
            str8 = strDecodeStringElement6;
            str14 = strDecodeStringElement7;
            str9 = strDecodeStringElement5;
            str10 = strDecodeStringElement3;
            j = jDecodeLongElement;
            str19 = strDecodeStringElement18;
            str17 = strDecodeStringElement17;
            str5 = strDecodeStringElement13;
            str11 = strDecodeStringElement12;
            str13 = strDecodeStringElement8;
            str4 = strDecodeStringElement15;
            str21 = strDecodeStringElement4;
        } else {
            String strDecodeStringElement25 = null;
            int i7 = 0;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            RecurringConvertOrderDetail recurringConvertOrderDetail3 = null;
            String str24 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            String strDecodeStringElement39 = null;
            String strDecodeStringElement40 = null;
            String strDecodeStringElement41 = null;
            String strDecodeStringElement42 = null;
            String strDecodeStringElement43 = null;
            String strDecodeStringElement44 = null;
            String strDecodeStringElement45 = null;
            String strDecodeStringElement46 = null;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement47 = null;
            String strDecodeStringElement48 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i2 = i6;
                        z2 = false;
                        i6 = i2;
                        i5 = 5;
                        break;
                    case 0:
                        i2 = i6;
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        i6 = i2;
                        i5 = 5;
                        break;
                    case 1:
                        i2 = i6;
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        i6 = i2;
                        i5 = 5;
                        break;
                    case 2:
                        i2 = i6;
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        i6 = i2;
                        i5 = 5;
                        break;
                    case 3:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i7 |= 8;
                        i6 = i6;
                        i5 = 5;
                        break;
                    case 4:
                        i2 = i6;
                        i7 |= 16;
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i6 = i2;
                        i5 = 5;
                        break;
                    case 5:
                        i7 |= 32;
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i6 = 4;
                        break;
                    case 6:
                        i7 |= 64;
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i6 = 4;
                        break;
                    case 7:
                        i7 |= 128;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str24);
                        i6 = 4;
                        break;
                    case 8:
                        i7 |= 256;
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i6 = 4;
                        break;
                    case 9:
                        i7 |= 512;
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i6 = 4;
                        break;
                    case 10:
                        i7 |= 1024;
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i6 = 4;
                        break;
                    case 11:
                        i7 |= 2048;
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i6 = 4;
                        break;
                    case 12:
                        i7 |= 4096;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i6 = 4;
                        break;
                    case 13:
                        i7 |= 8192;
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i6 = 4;
                        break;
                    case 14:
                        i7 |= 16384;
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i6 = 4;
                        break;
                    case 15:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 15);
                        i4 = 32768;
                        i7 |= i4;
                        i6 = 4;
                        break;
                    case 16:
                        i7 |= 65536;
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i6 = 4;
                        break;
                    case 17:
                        i7 |= 131072;
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i6 = 4;
                        break;
                    case 18:
                        i7 |= 262144;
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i6 = 4;
                        break;
                    case 19:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
                        i4 = 524288;
                        i7 |= i4;
                        i6 = 4;
                        break;
                    case 20:
                        recurringConvertOrderDetail3 = (RecurringConvertOrderDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 20, RecurringConvertOrderDetail$$serializer.INSTANCE, recurringConvertOrderDetail3);
                        i7 = 1048576 | i7;
                        i6 = 4;
                        break;
                    case 21:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = 2097152;
                        i7 |= i3;
                        i2 = i6;
                        i6 = i2;
                        i5 = 5;
                        break;
                    case 22:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i3 = 4194304;
                        i7 |= i3;
                        i2 = i6;
                        i6 = i2;
                        i5 = 5;
                        break;
                    case 23:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i3 = 8388608;
                        i7 |= i3;
                        i2 = i6;
                        i6 = i2;
                        i5 = 5;
                        break;
                    case 24:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i3 = 16777216;
                        i7 |= i3;
                        i2 = i6;
                        i6 = i2;
                        i5 = 5;
                        break;
                    case 25:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i3 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i7 |= i3;
                        i2 = i6;
                        i6 = i2;
                        i5 = 5;
                        break;
                    case 26:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i3 = 67108864;
                        i7 |= i3;
                        i2 = i6;
                        i6 = i2;
                        i5 = 5;
                        break;
                    case 27:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i3 = 134217728;
                        i7 |= i3;
                        i2 = i6;
                        i6 = i2;
                        i5 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i7;
            str = str24;
            str2 = strDecodeStringElement25;
            str3 = strDecodeStringElement28;
            strDecodeStringElement = strDecodeStringElement34;
            str4 = strDecodeStringElement35;
            str5 = strDecodeStringElement36;
            str6 = strDecodeStringElement37;
            str7 = strDecodeStringElement38;
            str8 = strDecodeStringElement39;
            str9 = strDecodeStringElement40;
            str10 = strDecodeStringElement42;
            str11 = strDecodeStringElement43;
            str12 = strDecodeStringElement44;
            str13 = strDecodeStringElement45;
            str14 = strDecodeStringElement46;
            j = jDecodeLongElement2;
            recurringConvertOrderDetail = recurringConvertOrderDetail3;
            strDecodeStringElement2 = strDecodeStringElement47;
            str15 = strDecodeStringElement33;
            str16 = strDecodeStringElement48;
            str17 = strDecodeStringElement32;
            str18 = strDecodeStringElement26;
            str19 = strDecodeStringElement31;
            str20 = strDecodeStringElement27;
            z = zDecodeBooleanElement2;
            str21 = strDecodeStringElement41;
            String str25 = strDecodeStringElement30;
            str22 = strDecodeStringElement29;
            str23 = str25;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OrderDetailList(i, str10, str21, str9, str8, str14, str13, str7, str, str6, str12, str11, str5, str2, str4, strDecodeStringElement, j, str15, str17, str19, z, recurringConvertOrderDetail, str23, str22, str3, str20, str18, str16, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OrderDetailList orderDetailList) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(orderDetailList, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OrderDetailList.write$Self$OKPayments_ok_payment_api(orderDetailList, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
