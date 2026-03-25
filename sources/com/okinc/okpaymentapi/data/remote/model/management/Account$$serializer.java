package com.okinc.okpaymentapi.data.remote.model.management;

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

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class Account$$serializer implements GeneratedSerializer<Account> {
    public static final int $stable;
    public static final Account$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Account$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Account$$serializer account$$serializer = new Account$$serializer();
        INSTANCE = account$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okpaymentapi.data.remote.model.management.Account", account$$serializer, 38);
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
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(BillingAddress$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Account deserialize(@NotNull Decoder decoder) {
        String str;
        int i;
        int i2;
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
        String str13;
        String str14;
        boolean z;
        String str15;
        boolean zDecodeBooleanElement;
        boolean z2;
        String str16;
        String str17;
        boolean z3;
        BillingAddress billingAddress;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        int i3;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i8 = 7;
        int i9 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            str9 = strDecodeStringElement5;
            BillingAddress billingAddress2 = (BillingAddress) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, BillingAddress$$serializer.INSTANCE, null);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, stringSerializer, null);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 28);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 32);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 33);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 35, stringSerializer, null);
            str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 36, stringSerializer, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 37);
            str26 = strDecodeStringElement24;
            z2 = zDecodeBooleanElement3;
            str15 = str35;
            str32 = strDecodeStringElement21;
            str31 = strDecodeStringElement22;
            str29 = strDecodeStringElement23;
            str = str34;
            i3 = iDecodeIntElement;
            str20 = strDecodeStringElement25;
            str17 = strDecodeStringElement26;
            str16 = strDecodeStringElement27;
            z = zDecodeBooleanElement4;
            str24 = strDecodeStringElement28;
            billingAddress = billingAddress2;
            str27 = strDecodeStringElement18;
            i2 = 63;
            str25 = strDecodeStringElement13;
            str19 = strDecodeStringElement11;
            str4 = strDecodeStringElement10;
            str23 = strDecodeStringElement7;
            str22 = strDecodeStringElement12;
            str18 = strDecodeStringElement16;
            str3 = strDecodeStringElement15;
            str2 = strDecodeStringElement14;
            str13 = strDecodeStringElement;
            str21 = strDecodeStringElement17;
            str12 = strDecodeStringElement2;
            str11 = strDecodeStringElement3;
            str8 = strDecodeStringElement6;
            str28 = str33;
            str10 = strDecodeStringElement4;
            str5 = strDecodeStringElement19;
            z3 = zDecodeBooleanElement2;
            str7 = strDecodeStringElement8;
            i = -1;
            str30 = strDecodeStringElement20;
            str6 = strDecodeStringElement9;
        } else {
            boolean zDecodeBooleanElement5 = false;
            int i10 = 0;
            boolean zDecodeBooleanElement6 = false;
            int iDecodeIntElement2 = 0;
            int i11 = 0;
            boolean zDecodeBooleanElement7 = false;
            BillingAddress billingAddress3 = null;
            String str36 = null;
            String str37 = null;
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
            String strDecodeStringElement47 = null;
            String strDecodeStringElement48 = null;
            String strDecodeStringElement49 = null;
            String strDecodeStringElement50 = null;
            String strDecodeStringElement51 = null;
            String strDecodeStringElement52 = null;
            String strDecodeStringElement53 = null;
            String strDecodeStringElement54 = null;
            String strDecodeStringElement55 = null;
            String str38 = null;
            boolean z4 = true;
            String str39 = null;
            String str40 = null;
            boolean zDecodeBooleanElement8 = false;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z4 = false;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 0:
                        String strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i10 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str38 = strDecodeStringElement56;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 1:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i10 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 2:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i10 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 3:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i10 |= 8;
                        Unit unit42 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 4:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i10 |= 16;
                        Unit unit422 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 5:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i10 |= 32;
                        Unit unit4222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 6:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i10 |= 64;
                        Unit unit42222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 7:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i8);
                        i10 |= 128;
                        Unit unit422222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 8:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i9);
                        i10 |= 256;
                        Unit unit5 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 9:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i10 |= 512;
                        Unit unit6 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 10:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i10 |= 1024;
                        Unit unit62 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 11:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i10 |= 2048;
                        Unit unit622 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 12:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i10 |= 4096;
                        Unit unit6222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 13:
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str36);
                        i10 |= 8192;
                        Unit unit7 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 14:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i10 |= 16384;
                        Unit unit8 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 15:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i4 = 32768;
                        i10 |= i4;
                        Unit unit9 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 16:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i4 = 65536;
                        i10 |= i4;
                        Unit unit92 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 17:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i10 |= 131072;
                        Unit unit10 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 18:
                        billingAddress3 = (BillingAddress) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, BillingAddress$$serializer.INSTANCE, billingAddress3);
                        i5 = 262144;
                        i10 |= i5;
                        Unit unit11 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 19:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i6 = 524288;
                        int i12 = i6 | i10;
                        Unit unit12 = Unit.INSTANCE;
                        i10 = i12;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 20:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i7 = 1048576;
                        Unit unit13 = Unit.INSTANCE;
                        i10 = i7 | i10;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 21:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i7 = 2097152;
                        Unit unit132 = Unit.INSTANCE;
                        i10 = i7 | i10;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 22:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i7 = 4194304;
                        Unit unit1322 = Unit.INSTANCE;
                        i10 = i7 | i10;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 23:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i7 = 8388608;
                        Unit unit13222 = Unit.INSTANCE;
                        i10 = i7 | i10;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 24:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i7 = 16777216;
                        Unit unit132222 = Unit.INSTANCE;
                        i10 = i7 | i10;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 25:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i7 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        Unit unit1322222 = Unit.INSTANCE;
                        i10 = i7 | i10;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 26:
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, str37);
                        i10 |= 67108864;
                        Unit unit14 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 27:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i6 = 134217728;
                        int i122 = i6 | i10;
                        Unit unit122 = Unit.INSTANCE;
                        i10 = i122;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 28:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 28);
                        i5 = 268435456;
                        i10 |= i5;
                        Unit unit112 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 29:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i6 = 536870912;
                        int i1222 = i6 | i10;
                        Unit unit1222 = Unit.INSTANCE;
                        i10 = i1222;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 30:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i6 = 1073741824;
                        int i12222 = i6 | i10;
                        Unit unit12222 = Unit.INSTANCE;
                        i10 = i12222;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 31:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i6 = Integer.MIN_VALUE;
                        int i122222 = i6 | i10;
                        Unit unit122222 = Unit.INSTANCE;
                        i10 = i122222;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 32:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 32);
                        i11 |= 1;
                        Unit unit1122 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 33:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 33);
                        i11 |= 2;
                        Unit unit142 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 34:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
                        Unit unit15 = Unit.INSTANCE;
                        i11 |= 4;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 35:
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, str40);
                        i11 |= 8;
                        Unit unit1422 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 36:
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, str39);
                        i11 |= 16;
                        Unit unit14222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    case 37:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 37);
                        i11 |= 32;
                        Unit unit11222 = Unit.INSTANCE;
                        i9 = 8;
                        i8 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str37;
            i = i10;
            i2 = i11;
            str2 = strDecodeStringElement29;
            str3 = strDecodeStringElement30;
            str4 = strDecodeStringElement46;
            str5 = strDecodeStringElement47;
            str6 = strDecodeStringElement48;
            str7 = strDecodeStringElement49;
            str8 = strDecodeStringElement51;
            str9 = strDecodeStringElement52;
            str10 = strDecodeStringElement53;
            str11 = strDecodeStringElement54;
            str12 = strDecodeStringElement55;
            str13 = str38;
            str14 = str39;
            z = zDecodeBooleanElement8;
            str15 = str40;
            zDecodeBooleanElement = zDecodeBooleanElement5;
            z2 = zDecodeBooleanElement6;
            str16 = strDecodeStringElement35;
            str17 = strDecodeStringElement36;
            z3 = zDecodeBooleanElement7;
            billingAddress = billingAddress3;
            str18 = strDecodeStringElement31;
            str19 = strDecodeStringElement45;
            str20 = strDecodeStringElement37;
            str21 = strDecodeStringElement32;
            str22 = strDecodeStringElement44;
            i3 = iDecodeIntElement2;
            str23 = strDecodeStringElement50;
            str24 = strDecodeStringElement34;
            str25 = strDecodeStringElement43;
            str26 = strDecodeStringElement38;
            str27 = strDecodeStringElement33;
            str28 = str36;
            String str41 = strDecodeStringElement42;
            str29 = strDecodeStringElement39;
            str30 = str41;
            String str42 = strDecodeStringElement41;
            str31 = strDecodeStringElement40;
            str32 = str42;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Account(i, i2, str13, str12, str11, str10, str9, str8, z3, str23, str7, str6, str4, str19, str22, str28, str25, str2, str3, str18, billingAddress, str21, str27, str5, str30, str32, str31, str29, str, str26, i3, str20, str17, str16, z2, z, str24, str15, str14, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Account account) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(account, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Account.write$Self$OKPayments_ok_payment_api(account, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
