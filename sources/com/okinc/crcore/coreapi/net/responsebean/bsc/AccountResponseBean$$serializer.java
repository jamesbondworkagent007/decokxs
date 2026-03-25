package com.okinc.crcore.coreapi.net.responsebean.bsc;

import com.appsflyer.AdRevenueScheme;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.Unit;
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

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class AccountResponseBean$$serializer implements GeneratedSerializer<AccountResponseBean> {
    public static final int $stable;
    public static final AccountResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AccountResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AccountResponseBean$$serializer accountResponseBean$$serializer = new AccountResponseBean$$serializer();
        INSTANCE = accountResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean", accountResponseBean$$serializer, 38);
        pluginGeneratedSerialDescriptor.addElement("paymentAccountId", true);
        pluginGeneratedSerialDescriptor.addElement("recipientName", true);
        pluginGeneratedSerialDescriptor.addElement("accountNumber", true);
        pluginGeneratedSerialDescriptor.addElement("accountType", true);
        pluginGeneratedSerialDescriptor.addElement("bankAccountType", true);
        pluginGeneratedSerialDescriptor.addElement("bankName", true);
        pluginGeneratedSerialDescriptor.addElement("isAccountLabel", true);
        pluginGeneratedSerialDescriptor.addElement("bankAddress", true);
        pluginGeneratedSerialDescriptor.addElement("bankIdentifierCode", true);
        pluginGeneratedSerialDescriptor.addElement("bankCode", true);
        pluginGeneratedSerialDescriptor.addElement("routingNumber", true);
        pluginGeneratedSerialDescriptor.addElement("iban", true);
        pluginGeneratedSerialDescriptor.addElement("bsbNumber", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("sortCode", true);
        pluginGeneratedSerialDescriptor.addElement("last4", true);
        pluginGeneratedSerialDescriptor.addElement("brand", true);
        pluginGeneratedSerialDescriptor.addElement("billing", true);
        pluginGeneratedSerialDescriptor.addElement("redirectUrl", true);
        pluginGeneratedSerialDescriptor.addElement(AdRevenueScheme.COUNTRY, true);
        pluginGeneratedSerialDescriptor.addElement("expMonth", true);
        pluginGeneratedSerialDescriptor.addElement("expYear", true);
        pluginGeneratedSerialDescriptor.addElement("availableBalance", true);
        pluginGeneratedSerialDescriptor.addElement("unavailableBalance", true);
        pluginGeneratedSerialDescriptor.addElement("totalBalance", true);
        pluginGeneratedSerialDescriptor.addElement("balanceAccountType", true);
        pluginGeneratedSerialDescriptor.addElement("userId", true);
        pluginGeneratedSerialDescriptor.addElement("remainVerificationAttempts", true);
        pluginGeneratedSerialDescriptor.addElement("intermediaryBankName", true);
        pluginGeneratedSerialDescriptor.addElement("intermediaryBankAddress", true);
        pluginGeneratedSerialDescriptor.addElement("intermediaryBankIdentifierCode", true);
        pluginGeneratedSerialDescriptor.addElement("bestOption", true);
        pluginGeneratedSerialDescriptor.addElement("isSelected", true);
        pluginGeneratedSerialDescriptor.addElement("pixKey", true);
        pluginGeneratedSerialDescriptor.addElement("merchantId", true);
        pluginGeneratedSerialDescriptor.addElement("countryCode", true);
        pluginGeneratedSerialDescriptor.addElement("allowCreditCard", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(BillingAddressResponseBean$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AccountResponseBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        int i2;
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
        String str12;
        boolean zDecodeBooleanElement;
        boolean z;
        int i3;
        String str13;
        String str14;
        String str15;
        String str16;
        boolean z2;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        boolean z3;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        BillingAddressResponseBean billingAddressResponseBean;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i8 = 6;
        int i9 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            BillingAddressResponseBean billingAddressResponseBean2 = (BillingAddressResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, BillingAddressResponseBean$$serializer.INSTANCE, null);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, stringSerializer, null);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 28);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            String strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 32);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 33);
            String strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 35, stringSerializer, null);
            str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 36, stringSerializer, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 37);
            str28 = strDecodeStringElement26;
            z = zDecodeBooleanElement3;
            str18 = str33;
            str5 = strDecodeStringElement22;
            strDecodeStringElement = strDecodeStringElement23;
            str2 = strDecodeStringElement24;
            str25 = strDecodeStringElement25;
            str12 = str32;
            i3 = iDecodeIntElement;
            str31 = strDecodeStringElement27;
            str23 = strDecodeStringElement28;
            str14 = strDecodeStringElement29;
            z3 = zDecodeBooleanElement4;
            str13 = strDecodeStringElement30;
            i = -1;
            billingAddressResponseBean = billingAddressResponseBean2;
            str21 = strDecodeStringElement9;
            str30 = strDecodeStringElement11;
            str22 = strDecodeStringElement10;
            str7 = strDecodeStringElement8;
            str3 = strDecodeStringElement14;
            str16 = strDecodeStringElement6;
            str24 = strDecodeStringElement18;
            str20 = strDecodeStringElement17;
            str19 = strDecodeStringElement16;
            str6 = strDecodeStringElement15;
            str11 = strDecodeStringElement2;
            str8 = strDecodeStringElement5;
            str26 = strDecodeStringElement21;
            str29 = strDecodeStringElement19;
            str10 = strDecodeStringElement3;
            str9 = strDecodeStringElement4;
            i2 = 63;
            str15 = strDecodeStringElement7;
            str4 = strDecodeStringElement12;
            z2 = zDecodeBooleanElement2;
            str = strDecodeStringElement20;
            str27 = strDecodeStringElement13;
        } else {
            int i10 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            int iDecodeIntElement2 = 0;
            int i11 = 0;
            boolean zDecodeBooleanElement7 = false;
            BillingAddressResponseBean billingAddressResponseBean3 = null;
            String str34 = null;
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
            strDecodeStringElement = null;
            String strDecodeStringElement43 = null;
            String strDecodeStringElement44 = null;
            String strDecodeStringElement45 = null;
            String strDecodeStringElement46 = null;
            String strDecodeStringElement47 = null;
            String strDecodeStringElement48 = null;
            String strDecodeStringElement49 = null;
            String strDecodeStringElement50 = null;
            String strDecodeStringElement51 = null;
            String strDecodeStringElement52 = null;
            String strDecodeStringElement53 = null;
            String strDecodeStringElement54 = null;
            String strDecodeStringElement55 = null;
            String strDecodeStringElement56 = null;
            String strDecodeStringElement57 = null;
            String str35 = null;
            boolean z4 = true;
            String str36 = null;
            String str37 = null;
            boolean zDecodeBooleanElement8 = false;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z4 = false;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 0:
                        String strDecodeStringElement58 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i10 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str35 = strDecodeStringElement58;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 1:
                        strDecodeStringElement57 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i10 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 2:
                        strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i10 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 3:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i10 |= 8;
                        Unit unit42 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 4:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i10 |= 16;
                        Unit unit422 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 5:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i10 |= 32;
                        Unit unit4222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 6:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i8);
                        i10 |= 64;
                        Unit unit42222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 7:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i10 |= 128;
                        Unit unit5 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 8:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i9);
                        i10 |= 256;
                        Unit unit52 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 9:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i10 |= 512;
                        Unit unit522 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 10:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i10 |= 1024;
                        Unit unit5222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 11:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i10 |= 2048;
                        Unit unit52222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 12:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i10 |= 4096;
                        Unit unit522222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 13:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i10 |= 8192;
                        Unit unit6 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 14:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i10 |= 16384;
                        Unit unit7 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 15:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i4 = 32768;
                        i10 |= i4;
                        Unit unit72 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 16:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i4 = 65536;
                        i10 |= i4;
                        Unit unit722 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 17:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i10 |= 131072;
                        Unit unit8 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 18:
                        billingAddressResponseBean3 = (BillingAddressResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, BillingAddressResponseBean$$serializer.INSTANCE, billingAddressResponseBean3);
                        i5 = 262144;
                        i10 |= i5;
                        Unit unit9 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 19:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i6 = 524288;
                        i10 |= i6;
                        Unit unit10 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 20:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i7 = 1048576;
                        i10 |= i7;
                        Unit unit11 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 21:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i7 = 2097152;
                        i10 |= i7;
                        Unit unit112 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 22:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i7 = 4194304;
                        i10 |= i7;
                        Unit unit1122 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 23:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i7 = 8388608;
                        i10 |= i7;
                        Unit unit11222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 24:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i7 = 16777216;
                        i10 |= i7;
                        Unit unit112222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 25:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i7 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i10 |= i7;
                        Unit unit1122222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 26:
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, str34);
                        i7 = 67108864;
                        i10 |= i7;
                        Unit unit11222222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 27:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i6 = 134217728;
                        i10 |= i6;
                        Unit unit102 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 28:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 28);
                        i5 = 268435456;
                        i10 |= i5;
                        Unit unit92 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 29:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i6 = 536870912;
                        i10 |= i6;
                        Unit unit1022 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 30:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i6 = 1073741824;
                        i10 |= i6;
                        Unit unit10222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 31:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i6 = Integer.MIN_VALUE;
                        i10 |= i6;
                        Unit unit102222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 32:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 32);
                        i11 |= 1;
                        Unit unit922 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 33:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 33);
                        i11 |= 2;
                        Unit unit112222222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 34:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
                        Unit unit12 = Unit.INSTANCE;
                        i11 |= 4;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 35:
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, str37);
                        i11 |= 8;
                        Unit unit1122222222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 36:
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, str36);
                        i11 |= 16;
                        Unit unit11222222222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    case 37:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 37);
                        i11 |= 32;
                        Unit unit9222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i10;
            i2 = i11;
            str = strDecodeStringElement34;
            str2 = strDecodeStringElement42;
            str3 = strDecodeStringElement44;
            str4 = strDecodeStringElement46;
            str5 = strDecodeStringElement49;
            str6 = strDecodeStringElement50;
            str7 = strDecodeStringElement52;
            str8 = strDecodeStringElement55;
            str9 = strDecodeStringElement56;
            str10 = strDecodeStringElement57;
            str11 = str35;
            str12 = str34;
            zDecodeBooleanElement = zDecodeBooleanElement5;
            z = zDecodeBooleanElement6;
            i3 = iDecodeIntElement2;
            str13 = strDecodeStringElement36;
            str14 = strDecodeStringElement37;
            str15 = strDecodeStringElement53;
            str16 = strDecodeStringElement54;
            z2 = zDecodeBooleanElement7;
            str17 = str36;
            str18 = str37;
            str19 = strDecodeStringElement31;
            str20 = strDecodeStringElement32;
            str21 = strDecodeStringElement48;
            str22 = strDecodeStringElement51;
            z3 = zDecodeBooleanElement8;
            str23 = strDecodeStringElement38;
            str24 = strDecodeStringElement43;
            str25 = strDecodeStringElement41;
            str26 = strDecodeStringElement35;
            str27 = strDecodeStringElement45;
            str28 = strDecodeStringElement40;
            str29 = strDecodeStringElement33;
            str30 = strDecodeStringElement47;
            str31 = strDecodeStringElement39;
            billingAddressResponseBean = billingAddressResponseBean3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AccountResponseBean(i, i2, str11, str10, str9, str8, str16, str15, z2, str7, str21, str22, str30, str4, str27, str3, str6, str19, str20, str24, billingAddressResponseBean, str29, str, str26, str5, strDecodeStringElement, str2, str25, str12, str28, i3, str31, str23, str14, z, z3, str13, str18, str17, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AccountResponseBean accountResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(accountResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AccountResponseBean.write$Self$OKCRCore_cr_core(accountResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
