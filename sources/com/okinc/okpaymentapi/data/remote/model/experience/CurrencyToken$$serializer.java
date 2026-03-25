package com.okinc.okpaymentapi.data.remote.model.experience;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.localization2.bean.AppLocaleInfo;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption$$serializer;
import java.util.List;
import kotlin.Pair;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class CurrencyToken$$serializer implements GeneratedSerializer<CurrencyToken> {
    public static final int $stable;
    public static final CurrencyToken$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CurrencyToken$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CurrencyToken$$serializer currencyToken$$serializer = new CurrencyToken$$serializer();
        INSTANCE = currencyToken$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken", currencyToken$$serializer, 26);
        pluginGeneratedSerialDescriptor.addElement("availableBalance", true);
        pluginGeneratedSerialDescriptor.addElement("channelAvailable", true);
        pluginGeneratedSerialDescriptor.addElement("countryNames", true);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement("currencyName", true);
        pluginGeneratedSerialDescriptor.addElement(AppLocaleInfo.KEY_DISPLAY_NAME, true);
        pluginGeneratedSerialDescriptor.addElement("hidden", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("nightIcon", true);
        pluginGeneratedSerialDescriptor.addElement("priceScale", true);
        pluginGeneratedSerialDescriptor.addElement("quickAmountList", true);
        pluginGeneratedSerialDescriptor.addElement("scale", true);
        pluginGeneratedSerialDescriptor.addElement("symbol", true);
        pluginGeneratedSerialDescriptor.addElement("tradeRange", true);
        pluginGeneratedSerialDescriptor.addElement("usdRate", true);
        pluginGeneratedSerialDescriptor.addElement("valuation", true);
        pluginGeneratedSerialDescriptor.addElement("cryptoToLocalCurrencyPrice", true);
        pluginGeneratedSerialDescriptor.addElement("earnRate", true);
        pluginGeneratedSerialDescriptor.addElement("earnOption", true);
        pluginGeneratedSerialDescriptor.addElement("tradeSupportedCurrencies", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("percentage", true);
        pluginGeneratedSerialDescriptor.addElement("fiatFlag", true);
        pluginGeneratedSerialDescriptor.addElement("transferable", true);
        pluginGeneratedSerialDescriptor.addElement("dexInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CurrencyToken.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, booleanSerializer, kSerializerArr[2], stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, intSerializer, kSerializerArr[11], intSerializer, stringSerializer, stringSerializer, DoubleSerializer.INSTANCE, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(EarnOption$$serializer.INSTANCE), kSerializerArr[20], stringSerializer, kSerializerArr[22], booleanSerializer, booleanSerializer, DexInfo$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CurrencyToken deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String str;
        List list;
        EarnOption earnOption;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i;
        boolean z2;
        Pair pair;
        DexInfo dexInfo;
        int i2;
        List list2;
        boolean z3;
        List list3;
        boolean z4;
        String str10;
        String str11;
        int i3;
        double d;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CurrencyToken.$childSerializers;
        int i7 = 10;
        int i8 = 9;
        int i9 = 7;
        int i10 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            List list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 15);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, null);
            EarnOption earnOption2 = (EarnOption) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, EarnOption$$serializer.INSTANCE, null);
            List list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 20, kSerializerArr[20], null);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            Pair pair2 = (Pair) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 22, kSerializerArr[22], null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
            dexInfo = (DexInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 25, DexInfo$$serializer.INSTANCE, null);
            str11 = strDecodeStringElement14;
            z4 = zDecodeBooleanElement4;
            i3 = iDecodeIntElement2;
            str3 = strDecodeStringElement13;
            str4 = strDecodeStringElement12;
            pair = pair2;
            earnOption = earnOption2;
            str = str12;
            str9 = strDecodeStringElement3;
            list2 = list6;
            d = dDecodeDoubleElement;
            z3 = zDecodeBooleanElement3;
            z = zDecodeBooleanElement;
            i2 = 67108863;
            str2 = strDecodeStringElement8;
            str5 = strDecodeStringElement4;
            strDecodeStringElement = strDecodeStringElement10;
            i = iDecodeIntElement;
            str10 = strDecodeStringElement9;
            z2 = zDecodeBooleanElement2;
            str8 = strDecodeStringElement5;
            list3 = list5;
            list = list4;
            str6 = strDecodeStringElement7;
            strDecodeStringElement2 = strDecodeStringElement11;
            str7 = strDecodeStringElement6;
        } else {
            boolean z5 = true;
            boolean zDecodeBooleanElement5 = false;
            int iDecodeIntElement3 = 0;
            boolean zDecodeBooleanElement6 = false;
            int iDecodeIntElement4 = 0;
            Pair pair3 = null;
            String str13 = null;
            List list7 = null;
            List list8 = null;
            EarnOption earnOption3 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            strDecodeStringElement = null;
            strDecodeStringElement2 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            List list9 = null;
            double dDecodeDoubleElement2 = 0.0d;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            DexInfo dexInfo2 = null;
            int i11 = 0;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i4 = i9;
                        z5 = false;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 0:
                        i4 = i9;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i11 |= 1;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 1:
                        i4 = i9;
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i11 |= 2;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 2:
                        i4 = i9;
                        list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list9);
                        i11 |= 4;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 3:
                        i4 = i9;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i11 |= 8;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 4:
                        i4 = i9;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i11 |= 16;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 5:
                        i4 = i9;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i11 |= 32;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 6:
                        i4 = i9;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i11 |= 64;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 7:
                        int i12 = i9;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i12);
                        i11 |= 128;
                        i9 = i12;
                        break;
                    case 8:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i10);
                        i11 |= 256;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 9:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i8);
                        i11 |= 512;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 10:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i7);
                        i11 |= 1024;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 11:
                        list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], list8);
                        i11 |= 2048;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 12:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        i11 |= 4096;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 13:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i11 |= 8192;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 14:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i11 |= 16384;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 15:
                        dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 15);
                        i11 |= 32768;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 16:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i11 |= 65536;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 17:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i11 |= 131072;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 18:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, str13);
                        i5 = 262144;
                        i11 |= i5;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 19:
                        earnOption3 = (EarnOption) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, EarnOption$$serializer.INSTANCE, earnOption3);
                        i5 = 524288;
                        i11 |= i5;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 20:
                        list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 20, kSerializerArr[20], list7);
                        i5 = 1048576;
                        i11 |= i5;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 21:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i6 = 2097152;
                        i11 |= i6;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 22:
                        pair3 = (Pair) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 22, kSerializerArr[22], pair3);
                        i6 = 4194304;
                        i11 |= i6;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 23:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
                        i5 = 8388608;
                        i11 |= i5;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 24:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
                        i5 = 16777216;
                        i11 |= i5;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 25:
                        dexInfo2 = (DexInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 25, DexInfo$$serializer.INSTANCE, dexInfo2);
                        i5 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i11 |= i5;
                        i4 = 7;
                        i9 = i4;
                        i10 = 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str13;
            list = list9;
            earnOption = earnOption3;
            z = zDecodeBooleanElement8;
            str2 = strDecodeStringElement15;
            str3 = strDecodeStringElement18;
            str4 = strDecodeStringElement19;
            str5 = strDecodeStringElement20;
            str6 = strDecodeStringElement21;
            str7 = strDecodeStringElement22;
            str8 = strDecodeStringElement23;
            str9 = strDecodeStringElement24;
            i = iDecodeIntElement3;
            z2 = zDecodeBooleanElement6;
            pair = pair3;
            dexInfo = dexInfo2;
            i2 = i11;
            list2 = list7;
            z3 = zDecodeBooleanElement5;
            list3 = list8;
            z4 = zDecodeBooleanElement7;
            str10 = strDecodeStringElement16;
            str11 = strDecodeStringElement17;
            i3 = iDecodeIntElement4;
            d = dDecodeDoubleElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CurrencyToken(i2, str9, z, list, str5, str8, str7, str6, z2, str2, str10, i, list3, i3, strDecodeStringElement, strDecodeStringElement2, d, str4, str3, str, earnOption, list2, str11, pair, z3, z4, dexInfo, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CurrencyToken currencyToken) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(currencyToken, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CurrencyToken.write$Self$OKPayments_ok_payment_api(currencyToken, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
