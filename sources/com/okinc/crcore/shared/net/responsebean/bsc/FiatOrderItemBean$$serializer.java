package com.okinc.crcore.shared.net.responsebean.bsc;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.push.constant.RemoteMessageConst;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class FiatOrderItemBean$$serializer implements GeneratedSerializer<FiatOrderItemBean> {
    public static final int $stable;
    public static final FiatOrderItemBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FiatOrderItemBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FiatOrderItemBean$$serializer fiatOrderItemBean$$serializer = new FiatOrderItemBean$$serializer();
        INSTANCE = fiatOrderItemBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.shared.net.responsebean.bsc.FiatOrderItemBean", fiatOrderItemBean$$serializer, 37);
        pluginGeneratedSerialDescriptor.addElement("orderNo", true);
        pluginGeneratedSerialDescriptor.addElement("tradeType", true);
        pluginGeneratedSerialDescriptor.addElement("baseAmount", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencySymbol", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencyUrl", true);
        pluginGeneratedSerialDescriptor.addElement("quoteAmount", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrencySymbol", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("createDate", true);
        pluginGeneratedSerialDescriptor.addElement("completedTime", true);
        pluginGeneratedSerialDescriptor.addElement("expireSeconds", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("depositName", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("iconNight", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("chainUrl", true);
        pluginGeneratedSerialDescriptor.addElement("isConvert", true);
        pluginGeneratedSerialDescriptor.addElement("payCardNumber", true);
        pluginGeneratedSerialDescriptor.addElement("paymentMethod", true);
        pluginGeneratedSerialDescriptor.addElement("paymentMethodUrl", true);
        pluginGeneratedSerialDescriptor.addElement("paymentMethodNightUrl", true);
        pluginGeneratedSerialDescriptor.addElement("depositPlatformCode", true);
        pluginGeneratedSerialDescriptor.addElement("channelIcon", true);
        pluginGeneratedSerialDescriptor.addElement("channelIconNight", true);
        pluginGeneratedSerialDescriptor.addElement("totalFee", true);
        pluginGeneratedSerialDescriptor.addElement("errorCode", true);
        pluginGeneratedSerialDescriptor.addElement("requestCurrencySymbol", true);
        pluginGeneratedSerialDescriptor.addElement("requestCurrencySign", true);
        pluginGeneratedSerialDescriptor.addElement("requestAmount", true);
        pluginGeneratedSerialDescriptor.addElement("realAmount", true);
        pluginGeneratedSerialDescriptor.addElement("last4", true);
        pluginGeneratedSerialDescriptor.addElement("convertOrderDetail", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("networkFee", true);
        pluginGeneratedSerialDescriptor.addElement("networkFeeCurrency", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, LongSerializer.INSTANCE, stringSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(ConvertOrderDetailBean$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FiatOrderItemBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String strDecodeStringElement2;
        String str8;
        String str9;
        String str10;
        String str11;
        int i2;
        int i3;
        long j;
        int i4;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        boolean z;
        String str18;
        String str19;
        String strDecodeStringElement3;
        String str20;
        ConvertOrderDetailBean convertOrderDetailBean;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i7 = 3;
        int i8 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            String strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            String strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
            ConvertOrderDetailBean convertOrderDetailBean2 = (ConvertOrderDetailBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 33, ConvertOrderDetailBean$$serializer.INSTANCE, null);
            String strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
            String strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
            str13 = strDecodeStringElement32;
            str14 = strDecodeStringElement33;
            convertOrderDetailBean = convertOrderDetailBean2;
            str4 = strDecodeStringElement31;
            str12 = strDecodeStringElement30;
            i2 = iDecodeIntElement;
            str20 = strDecodeStringElement10;
            str26 = strDecodeStringElement26;
            str9 = strDecodeStringElement7;
            str27 = strDecodeStringElement22;
            i = -1;
            str5 = strDecodeStringElement18;
            str15 = strDecodeStringElement29;
            str6 = strDecodeStringElement13;
            str28 = strDecodeStringElement25;
            str3 = strDecodeStringElement6;
            str21 = strDecodeStringElement21;
            z = zDecodeBooleanElement;
            str = strDecodeStringElement12;
            i4 = 31;
            i3 = iDecodeIntElement2;
            str11 = strDecodeStringElement4;
            str2 = strDecodeStringElement11;
            str10 = strDecodeStringElement5;
            str25 = strDecodeStringElement28;
            strDecodeStringElement = strDecodeStringElement24;
            str23 = strDecodeStringElement20;
            str16 = strDecodeStringElement17;
            j = jDecodeLongElement;
            str24 = strDecodeStringElement14;
            str22 = strDecodeStringElement15;
            str7 = strDecodeStringElement9;
            str8 = strDecodeStringElement8;
            str19 = strDecodeStringElement27;
            str29 = strDecodeStringElement23;
            str18 = strDecodeStringElement19;
            str17 = strDecodeStringElement16;
        } else {
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            int i9 = 0;
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
            String strDecodeStringElement58 = null;
            String strDecodeStringElement59 = null;
            String strDecodeStringElement60 = null;
            String strDecodeStringElement61 = null;
            String str30 = null;
            boolean z2 = true;
            long jDecodeLongElement2 = 0;
            i = 0;
            ConvertOrderDetailBean convertOrderDetailBean3 = null;
            String strDecodeStringElement62 = null;
            String strDecodeStringElement63 = null;
            boolean zDecodeBooleanElement2 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z2 = false;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 0:
                        String strDecodeStringElement64 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str30 = strDecodeStringElement64;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 1:
                        strDecodeStringElement61 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 2:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 3:
                        strDecodeStringElement60 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i7);
                        i |= 8;
                        Unit unit42 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 4:
                        strDecodeStringElement59 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i8);
                        i |= 16;
                        Unit unit422 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 5:
                        strDecodeStringElement58 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        Unit unit4222 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 6:
                        strDecodeStringElement57 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        Unit unit42222 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 7:
                        strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        Unit unit422222 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 8:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i |= 256;
                        Unit unit4222222 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 9:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
                        i |= 512;
                        Unit unit42222222 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 10:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i |= 1024;
                        Unit unit422222222 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 11:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
                        i |= 2048;
                        Unit unit4222222222 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 12:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i |= 4096;
                        Unit unit42222222222 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 13:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i |= 8192;
                        Unit unit32 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 14:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i |= 16384;
                        Unit unit5 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 15:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i |= 32768;
                        Unit unit6 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 16:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i |= 65536;
                        Unit unit7 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 17:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i |= 131072;
                        Unit unit8 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 18:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
                        i |= 262144;
                        Unit unit9 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 19:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i5 = 524288;
                        int i10 = i5 | i;
                        Unit unit10 = Unit.INSTANCE;
                        i = i10;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 20:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i5 = 1048576;
                        int i102 = i5 | i;
                        Unit unit102 = Unit.INSTANCE;
                        i = i102;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 21:
                        strDecodeStringElement62 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i5 = 2097152;
                        int i1022 = i5 | i;
                        Unit unit1022 = Unit.INSTANCE;
                        i = i1022;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 22:
                        strDecodeStringElement63 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i5 = 4194304;
                        int i10222 = i5 | i;
                        Unit unit10222 = Unit.INSTANCE;
                        i = i10222;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 23:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i5 = 8388608;
                        int i102222 = i5 | i;
                        Unit unit102222 = Unit.INSTANCE;
                        i = i102222;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 24:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i5 = 16777216;
                        int i1022222 = i5 | i;
                        Unit unit1022222 = Unit.INSTANCE;
                        i = i1022222;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 25:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i5 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        int i10222222 = i5 | i;
                        Unit unit10222222 = Unit.INSTANCE;
                        i = i10222222;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 26:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i5 = 67108864;
                        int i102222222 = i5 | i;
                        Unit unit102222222 = Unit.INSTANCE;
                        i = i102222222;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 27:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i5 = 134217728;
                        int i1022222222 = i5 | i;
                        Unit unit1022222222 = Unit.INSTANCE;
                        i = i1022222222;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 28:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i5 = 268435456;
                        int i10222222222 = i5 | i;
                        Unit unit10222222222 = Unit.INSTANCE;
                        i = i10222222222;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 29:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i5 = 536870912;
                        int i102222222222 = i5 | i;
                        Unit unit102222222222 = Unit.INSTANCE;
                        i = i102222222222;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 30:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i5 = 1073741824;
                        int i1022222222222 = i5 | i;
                        Unit unit1022222222222 = Unit.INSTANCE;
                        i = i1022222222222;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 31:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i |= Integer.MIN_VALUE;
                        Unit unit11 = Unit.INSTANCE;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 32:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
                        Unit unit12 = Unit.INSTANCE;
                        i9 |= 1;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 33:
                        convertOrderDetailBean3 = (ConvertOrderDetailBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 33, ConvertOrderDetailBean$$serializer.INSTANCE, convertOrderDetailBean3);
                        i6 = i9 | 2;
                        Unit unit13 = Unit.INSTANCE;
                        i9 = i6;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 34:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
                        i6 = i9 | 4;
                        Unit unit14 = Unit.INSTANCE;
                        i9 = i6;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 35:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
                        i6 = i9 | 8;
                        Unit unit142 = Unit.INSTANCE;
                        i9 = i6;
                        i8 = 4;
                        i7 = 3;
                        break;
                    case 36:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
                        i6 = i9 | 16;
                        Unit unit1422 = Unit.INSTANCE;
                        i9 = i6;
                        i8 = 4;
                        i7 = 3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement47;
            str2 = strDecodeStringElement48;
            str3 = strDecodeStringElement49;
            str4 = strDecodeStringElement51;
            str5 = strDecodeStringElement52;
            str6 = strDecodeStringElement55;
            str7 = strDecodeStringElement57;
            strDecodeStringElement2 = strDecodeStringElement58;
            str8 = strDecodeStringElement59;
            str9 = strDecodeStringElement60;
            str10 = strDecodeStringElement61;
            str11 = str30;
            i2 = iDecodeIntElement3;
            i3 = iDecodeIntElement4;
            j = jDecodeLongElement2;
            i4 = i9;
            str12 = strDecodeStringElement35;
            str13 = strDecodeStringElement36;
            str14 = strDecodeStringElement37;
            str15 = strDecodeStringElement38;
            str16 = strDecodeStringElement45;
            str17 = strDecodeStringElement53;
            z = zDecodeBooleanElement2;
            str18 = strDecodeStringElement34;
            str19 = strDecodeStringElement40;
            strDecodeStringElement3 = strDecodeStringElement50;
            str20 = strDecodeStringElement56;
            convertOrderDetailBean = convertOrderDetailBean3;
            str21 = strDecodeStringElement63;
            str22 = strDecodeStringElement54;
            String str31 = strDecodeStringElement39;
            str23 = strDecodeStringElement62;
            str24 = strDecodeStringElement46;
            str25 = str31;
            String str32 = strDecodeStringElement44;
            str26 = strDecodeStringElement41;
            str27 = str32;
            String str33 = strDecodeStringElement43;
            str28 = strDecodeStringElement42;
            str29 = str33;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FiatOrderItemBean(i, i4, str11, str10, str3, str9, str8, strDecodeStringElement2, str7, str20, i2, j, str2, i3, str, str6, str24, str22, str17, str16, z, str5, str18, str23, str21, str27, str29, strDecodeStringElement, str28, str26, str19, str25, str15, str12, str4, convertOrderDetailBean, str13, str14, strDecodeStringElement3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FiatOrderItemBean fiatOrderItemBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(fiatOrderItemBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FiatOrderItemBean.write$Self$OKCRCore_cr_core(fiatOrderItemBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
