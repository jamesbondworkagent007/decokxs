package com.okinc.crcore.shared.net.responsebean.bsc;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.push.constant.RemoteMessageConst;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class CurrencyTokenBean$$serializer implements GeneratedSerializer<CurrencyTokenBean> {
    public static final int $stable;
    public static final CurrencyTokenBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CurrencyTokenBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CurrencyTokenBean$$serializer currencyTokenBean$$serializer = new CurrencyTokenBean$$serializer();
        INSTANCE = currencyTokenBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.shared.net.responsebean.bsc.CurrencyTokenBean", currencyTokenBean$$serializer, 27);
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
        pluginGeneratedSerialDescriptor.addElement("percentageValue", true);
        pluginGeneratedSerialDescriptor.addElement("fiatFlag", true);
        pluginGeneratedSerialDescriptor.addElement("transferable", true);
        pluginGeneratedSerialDescriptor.addElement("dexInfoBean", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CurrencyTokenBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, booleanSerializer, kSerializerArr[2], stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, intSerializer, kSerializerArr[11], intSerializer, stringSerializer, stringSerializer, doubleSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(EarnOptionBean$$serializer.INSTANCE), kSerializerArr[20], stringSerializer, stringSerializer, doubleSerializer, booleanSerializer, booleanSerializer, DexInfoBean$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CurrencyTokenBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        int i2;
        boolean z2;
        double d;
        List list2;
        boolean z3;
        DexInfoBean dexInfoBean;
        boolean z4;
        EarnOptionBean earnOptionBean;
        String str8;
        String str9;
        String str10;
        double d2;
        String str11;
        String str12;
        int i3;
        String str13;
        List list3;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CurrencyTokenBean.$childSerializers;
        int i8 = 10;
        int i9 = 9;
        int i10 = 6;
        int i11 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            List list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 15);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            EarnOptionBean earnOptionBean2 = (EarnOptionBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, EarnOptionBean$$serializer.INSTANCE, null);
            List list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 20, kSerializerArr[20], null);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            double dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 23);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 25);
            dexInfoBean = (DexInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 26, DexInfoBean$$serializer.INSTANCE, null);
            str10 = strDecodeStringElement14;
            str9 = strDecodeStringElement15;
            z2 = zDecodeBooleanElement2;
            str8 = strDecodeStringElement13;
            str12 = strDecodeStringElement12;
            strDecodeStringElement = strDecodeStringElement11;
            list2 = list6;
            z4 = zDecodeBooleanElement3;
            str6 = strDecodeStringElement2;
            d2 = dDecodeDoubleElement;
            d = dDecodeDoubleElement2;
            z3 = zDecodeBooleanElement4;
            earnOptionBean = earnOptionBean2;
            list = list4;
            i = 134217727;
            str2 = strDecodeStringElement7;
            str13 = strDecodeStringElement9;
            str3 = strDecodeStringElement5;
            i2 = iDecodeIntElement;
            str = strDecodeStringElement8;
            str7 = strDecodeStringElement6;
            i3 = iDecodeIntElement2;
            str11 = strDecodeStringElement10;
            list3 = list5;
            str4 = strDecodeStringElement4;
            str5 = strDecodeStringElement3;
            z = zDecodeBooleanElement;
        } else {
            int i12 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            int iDecodeIntElement3 = 0;
            boolean zDecodeBooleanElement7 = false;
            int iDecodeIntElement4 = 0;
            boolean z5 = true;
            List list7 = null;
            List list8 = null;
            DexInfoBean dexInfoBean2 = null;
            EarnOptionBean earnOptionBean3 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            List list9 = null;
            String strDecodeStringElement28 = null;
            double dDecodeDoubleElement3 = 0.0d;
            double dDecodeDoubleElement4 = 0.0d;
            boolean zDecodeBooleanElement8 = false;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i4 = i10;
                        z5 = false;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 0:
                        i4 = i10;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i12 |= 1;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 1:
                        i4 = i10;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i12 |= 2;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 2:
                        i4 = i10;
                        list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list9);
                        i12 |= 4;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 3:
                        i4 = i10;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i12 |= 8;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 4:
                        i4 = i10;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i12 |= 16;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 5:
                        i4 = i10;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i12 |= 32;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 6:
                        int i13 = i10;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i13);
                        i12 |= 64;
                        i10 = i13;
                        break;
                    case 7:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i12 |= 128;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 8:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i11);
                        i12 |= 256;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 9:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i9);
                        i12 |= 512;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 10:
                        i12 |= 1024;
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i8);
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 11:
                        list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], list8);
                        i12 |= 2048;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 12:
                        i12 |= 4096;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 13:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i12 |= 8192;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 14:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i12 |= 16384;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 15:
                        dDecodeDoubleElement3 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 15);
                        i5 = 32768;
                        i12 |= i5;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 16:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i5 = 65536;
                        i12 |= i5;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 17:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i5 = 131072;
                        i12 |= i5;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 18:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i5 = 262144;
                        i12 |= i5;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 19:
                        earnOptionBean3 = (EarnOptionBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, EarnOptionBean$$serializer.INSTANCE, earnOptionBean3);
                        i6 = 524288;
                        i12 |= i6;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 20:
                        list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 20, kSerializerArr[20], list7);
                        i5 = 1048576;
                        i12 |= i5;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 21:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i7 = 2097152;
                        i6 = i7;
                        i12 |= i6;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 22:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i7 = 4194304;
                        i6 = i7;
                        i12 |= i6;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 23:
                        dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 23);
                        i7 = 8388608;
                        i6 = i7;
                        i12 |= i6;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 24:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
                        i7 = 16777216;
                        i6 = i7;
                        i12 |= i6;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 25:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 25);
                        i7 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i6 = i7;
                        i12 |= i6;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    case 26:
                        dexInfoBean2 = (DexInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 26, DexInfoBean$$serializer.INSTANCE, dexInfoBean2);
                        i7 = 67108864;
                        i6 = i7;
                        i12 |= i6;
                        i4 = 6;
                        i10 = i4;
                        i11 = 8;
                        i8 = 10;
                        i9 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i12;
            list = list9;
            str = strDecodeStringElement16;
            str2 = strDecodeStringElement23;
            str3 = strDecodeStringElement24;
            str4 = strDecodeStringElement25;
            str5 = strDecodeStringElement26;
            str6 = strDecodeStringElement27;
            str7 = strDecodeStringElement28;
            z = zDecodeBooleanElement6;
            i2 = iDecodeIntElement3;
            z2 = zDecodeBooleanElement7;
            d = dDecodeDoubleElement4;
            list2 = list7;
            z3 = zDecodeBooleanElement5;
            dexInfoBean = dexInfoBean2;
            z4 = zDecodeBooleanElement8;
            earnOptionBean = earnOptionBean3;
            str8 = strDecodeStringElement20;
            str9 = strDecodeStringElement21;
            str10 = strDecodeStringElement22;
            d2 = dDecodeDoubleElement3;
            str11 = strDecodeStringElement18;
            str12 = strDecodeStringElement19;
            i3 = iDecodeIntElement4;
            str13 = strDecodeStringElement17;
            list3 = list8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CurrencyTokenBean(i, str6, z, list, str5, str4, str3, str7, z2, str2, str, i2, list3, i3, str13, str11, d2, strDecodeStringElement, str12, str8, earnOptionBean, list2, str10, str9, d, z4, z3, dexInfoBean, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CurrencyTokenBean currencyTokenBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(currencyTokenBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CurrencyTokenBean.write$Self$OKCRCore_cr_core(currencyTokenBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
