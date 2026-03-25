package com.okinc.okpaymentapi.data.remote.model.management;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.p2p.api.OtcExtraKeys;
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

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class PaymentMethod$$serializer implements GeneratedSerializer<PaymentMethod> {
    public static final int $stable;
    public static final PaymentMethod$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PaymentMethod$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PaymentMethod$$serializer paymentMethod$$serializer = new PaymentMethod$$serializer();
        INSTANCE = paymentMethod$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod", paymentMethod$$serializer, 29);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.PAYMENT, true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, true);
        pluginGeneratedSerialDescriptor.addElement("iconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("iconUrlNight", true);
        pluginGeneratedSerialDescriptor.addElement("mainColor", true);
        pluginGeneratedSerialDescriptor.addElement("paymentCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("paymentMethodType", true);
        pluginGeneratedSerialDescriptor.addElement("paymentMethodId", true);
        pluginGeneratedSerialDescriptor.addElement("paymentMethod", true);
        pluginGeneratedSerialDescriptor.addElement("supportedTransactionType", true);
        pluginGeneratedSerialDescriptor.addElement("baseAmount", true);
        pluginGeneratedSerialDescriptor.addElement("depositToWithdraw", true);
        pluginGeneratedSerialDescriptor.addElement("allowManualAddition", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.Account.KEY_ACCOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrency", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("publicTradingOrderId", true);
        pluginGeneratedSerialDescriptor.addElement("sellerReceiptAccountList", true);
        pluginGeneratedSerialDescriptor.addElement("bestOption", true);
        pluginGeneratedSerialDescriptor.addElement("finalPriceForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("isSelected", true);
        pluginGeneratedSerialDescriptor.addElement("selectedSellerReceiptAccount", true);
        pluginGeneratedSerialDescriptor.addElement("depositPlatformCode", true);
        pluginGeneratedSerialDescriptor.addElement("deepLink", true);
        pluginGeneratedSerialDescriptor.addElement("storeUrl", true);
        pluginGeneratedSerialDescriptor.addElement("showTransfer", true);
        pluginGeneratedSerialDescriptor.addElement("accounts", true);
        pluginGeneratedSerialDescriptor.addElement("numOfRecurringPlans", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = PaymentMethod.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[10]), stringSerializer, booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(Account$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[18]), booleanSerializer, stringSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(SellerReceiptAccount$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[27]), IntSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PaymentMethod deserialize(@NotNull Decoder decoder) {
        List list;
        SellerReceiptAccount sellerReceiptAccount;
        boolean z;
        boolean z2;
        String str;
        String str2;
        boolean z3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int iDecodeIntElement;
        Account account;
        boolean z4;
        boolean z5;
        String str13;
        String str14;
        String str15;
        List list2;
        List list3;
        int i;
        String str16;
        String str17;
        String str18;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PaymentMethod.$childSerializers;
        int i3 = 9;
        int i4 = 8;
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
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            Account account2 = (Account) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, Account$$serializer.INSTANCE, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, null);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            str8 = strDecodeStringElement4;
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, kSerializerArr[18], null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 21);
            SellerReceiptAccount sellerReceiptAccount2 = (SellerReceiptAccount) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, SellerReceiptAccount$$serializer.INSTANCE, null);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 26);
            list3 = list5;
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 27, kSerializerArr[27], null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 28);
            str3 = strDecodeStringElement15;
            str18 = strDecodeStringElement16;
            str17 = strDecodeStringElement13;
            str16 = strDecodeStringElement14;
            str13 = strDecodeStringElement11;
            z4 = zDecodeBooleanElement4;
            z2 = zDecodeBooleanElement3;
            sellerReceiptAccount = sellerReceiptAccount2;
            str14 = strDecodeStringElement17;
            z = zDecodeBooleanElement5;
            z3 = zDecodeBooleanElement;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement6;
            i = 536870911;
            str15 = str19;
            str4 = strDecodeStringElement12;
            str10 = strDecodeStringElement2;
            str11 = strDecodeStringElement;
            str7 = strDecodeStringElement5;
            account = account2;
            str9 = strDecodeStringElement3;
            str = strDecodeStringElement9;
            list2 = list4;
            str2 = strDecodeStringElement10;
            z5 = zDecodeBooleanElement2;
            str12 = strDecodeStringElement8;
        } else {
            int iDecodeIntElement2 = 0;
            int i5 = 0;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            boolean zDecodeBooleanElement9 = false;
            boolean z6 = true;
            String str20 = null;
            List list6 = null;
            List list7 = null;
            SellerReceiptAccount sellerReceiptAccount3 = null;
            Account account3 = null;
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
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            List list8 = null;
            boolean zDecodeBooleanElement10 = false;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 0:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 1:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 2:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 3:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 4:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 5:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 6:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 |= 64;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 7:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i5 |= 128;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 8:
                        i5 |= 256;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 9:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i5 |= 512;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 10:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], list6);
                        i5 |= 1024;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 11:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i5 |= 2048;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 12:
                        i5 |= 4096;
                        zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 13:
                        i5 |= 8192;
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 14:
                        account3 = (Account) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, Account$$serializer.INSTANCE, account3);
                        i5 |= 16384;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 15:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str20);
                        i2 = 32768;
                        i5 |= i2;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 16:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i5 |= 65536;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 17:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i5 |= 131072;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 18:
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, kSerializerArr[18], list7);
                        i2 = 262144;
                        i5 |= i2;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 19:
                        i5 |= 524288;
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 20:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i2 = 1048576;
                        i5 |= i2;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 21:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 21);
                        i2 = 2097152;
                        i5 |= i2;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 22:
                        sellerReceiptAccount3 = (SellerReceiptAccount) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, SellerReceiptAccount$$serializer.INSTANCE, sellerReceiptAccount3);
                        i2 = 4194304;
                        i5 |= i2;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 23:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i2 = 8388608;
                        i5 |= i2;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 24:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i2 = 16777216;
                        i5 |= i2;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 25:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i2 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i5 |= i2;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 26:
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 26);
                        i2 = 67108864;
                        i5 |= i2;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 27:
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 27, kSerializerArr[27], list8);
                        i2 = 134217728;
                        i5 |= i2;
                        i4 = 8;
                        i3 = 9;
                        break;
                    case 28:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 28);
                        i5 = 268435456 | i5;
                        i4 = 8;
                        i3 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list8;
            sellerReceiptAccount = sellerReceiptAccount3;
            z = zDecodeBooleanElement10;
            z2 = zDecodeBooleanElement8;
            str = strDecodeStringElement18;
            str2 = strDecodeStringElement19;
            z3 = zDecodeBooleanElement9;
            str3 = strDecodeStringElement24;
            str4 = strDecodeStringElement26;
            str5 = strDecodeStringElement27;
            str6 = strDecodeStringElement28;
            str7 = strDecodeStringElement29;
            str8 = strDecodeStringElement30;
            str9 = strDecodeStringElement31;
            str10 = strDecodeStringElement32;
            str11 = strDecodeStringElement33;
            str12 = strDecodeStringElement34;
            iDecodeIntElement = iDecodeIntElement2;
            account = account3;
            z4 = zDecodeBooleanElement6;
            z5 = zDecodeBooleanElement7;
            str13 = strDecodeStringElement20;
            str14 = strDecodeStringElement22;
            str15 = str20;
            list2 = list6;
            list3 = list7;
            i = i5;
            String str21 = strDecodeStringElement23;
            str16 = strDecodeStringElement21;
            str17 = strDecodeStringElement25;
            str18 = str21;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PaymentMethod(i, str11, str10, str9, str8, str7, str6, str5, str12, str, str2, list2, str13, z3, z5, account, str15, str4, str17, list3, z2, str16, z4, sellerReceiptAccount, str3, str18, str14, z, list, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PaymentMethod.write$Self$OKPayments_ok_payment_api(paymentMethod, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
