package com.okinc.fiat.api.bean;

import com.huawei.hms.push.constant.RemoteMessageConst;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class FiatCryptoCoinBean$$serializer implements GeneratedSerializer<FiatCryptoCoinBean> {
    public static final int $stable;
    public static final FiatCryptoCoinBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FiatCryptoCoinBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FiatCryptoCoinBean$$serializer fiatCryptoCoinBean$$serializer = new FiatCryptoCoinBean$$serializer();
        INSTANCE = fiatCryptoCoinBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.fiat.api.bean.FiatCryptoCoinBean", fiatCryptoCoinBean$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("valuation", true);
        pluginGeneratedSerialDescriptor.addElement("availableBalance", true);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("scale", true);
        pluginGeneratedSerialDescriptor.addElement("symbol", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("tradeRange", true);
        pluginGeneratedSerialDescriptor.addElement("priceScale", true);
        pluginGeneratedSerialDescriptor.addElement("nightIcon", true);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement("currencyName", true);
        pluginGeneratedSerialDescriptor.addElement("channelAvailable", true);
        pluginGeneratedSerialDescriptor.addElement("countryNames", true);
        pluginGeneratedSerialDescriptor.addElement("usdRate", true);
        pluginGeneratedSerialDescriptor.addElement("tickerPrice", true);
        pluginGeneratedSerialDescriptor.addElement("priceLimit", true);
        pluginGeneratedSerialDescriptor.addElement("hidden", true);
        pluginGeneratedSerialDescriptor.addElement("quickAmountList", true);
        pluginGeneratedSerialDescriptor.addElement("earnRate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = FiatCryptoCoinBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), kSerializerArr[12], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[15]), booleanSerializer, kSerializerArr[17], BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FiatCryptoCoinBean deserialize(@NotNull Decoder decoder) {
        boolean z;
        Boolean bool;
        List list;
        String str;
        List list2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i;
        int i2;
        String str10;
        Pair pair;
        String str11;
        int i3;
        String str12;
        KSerializer[] kSerializerArr;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        KSerializer[] kSerializerArr2;
        String str21;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = FiatCryptoCoinBean.$childSerializers;
        int i5 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr3[12], null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            Pair pair2 = (Pair) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr3[15], null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr3[17], null);
            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            z = zDecodeBooleanElement;
            i = iDecodeIntElement2;
            pair = pair2;
            str2 = str30;
            bool = bool2;
            i3 = 524287;
            str6 = str28;
            str = str25;
            str3 = str24;
            str9 = strDecodeStringElement;
            str8 = strDecodeStringElement2;
            list2 = list3;
            str5 = str27;
            i2 = iDecodeIntElement;
            str10 = str22;
            str4 = str26;
            str12 = str23;
            str11 = str29;
        } else {
            int i6 = 18;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            boolean z2 = true;
            String str31 = null;
            String str32 = null;
            Boolean bool3 = null;
            Pair pair3 = null;
            List list4 = null;
            String str33 = null;
            List list5 = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str40 = null;
            boolean zDecodeBooleanElement2 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr3;
                        str13 = str31;
                        str14 = str37;
                        str15 = str38;
                        str16 = str32;
                        str17 = str36;
                        str18 = str40;
                        z2 = false;
                        str19 = str13;
                        str31 = str19;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str18;
                        str38 = str15;
                        i6 = 18;
                        str36 = str17;
                        str32 = str16;
                        str37 = str14;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr3;
                        str13 = str31;
                        str14 = str37;
                        str15 = str38;
                        str16 = str32;
                        str17 = str36;
                        str18 = str40;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        str19 = str13;
                        str31 = str19;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str18;
                        str38 = str15;
                        i6 = 18;
                        str36 = str17;
                        str32 = str16;
                        str37 = str14;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr3;
                        str13 = str31;
                        str14 = str37;
                        str15 = str38;
                        str16 = str32;
                        str17 = str36;
                        str18 = str40;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        str19 = str13;
                        str31 = str19;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str18;
                        str38 = str15;
                        i6 = 18;
                        str36 = str17;
                        str32 = str16;
                        str37 = str14;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr3;
                        str14 = str37;
                        str15 = str38;
                        str16 = str32;
                        str17 = str36;
                        str18 = str40;
                        str13 = str31;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str39);
                        i5 |= 4;
                        str19 = str13;
                        str31 = str19;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str18;
                        str38 = str15;
                        i6 = 18;
                        str36 = str17;
                        str32 = str16;
                        str37 = str14;
                        break;
                    case 3:
                        kSerializerArr = kSerializerArr3;
                        str14 = str37;
                        str15 = str38;
                        str16 = str32;
                        str17 = str36;
                        str18 = str40;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i5 |= 8;
                        str13 = str31;
                        str19 = str13;
                        str31 = str19;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str18;
                        str38 = str15;
                        i6 = 18;
                        str36 = str17;
                        str32 = str16;
                        str37 = str14;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr3;
                        str14 = str37;
                        str15 = str38;
                        str16 = str32;
                        String str41 = str36;
                        str18 = str40;
                        i5 |= 16;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str41);
                        str13 = str31;
                        str19 = str13;
                        str31 = str19;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str18;
                        str38 = str15;
                        i6 = 18;
                        str36 = str17;
                        str32 = str16;
                        str37 = str14;
                        break;
                    case 5:
                        kSerializerArr = kSerializerArr3;
                        str14 = str37;
                        str15 = str38;
                        str16 = str32;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str31);
                        i5 |= 32;
                        str17 = str36;
                        str18 = str40;
                        str31 = str19;
                        kSerializerArr3 = kSerializerArr;
                        str40 = str18;
                        str38 = str15;
                        i6 = 18;
                        str36 = str17;
                        str32 = str16;
                        str37 = str14;
                        break;
                    case 6:
                        str14 = str37;
                        str20 = str32;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str33);
                        i5 |= 64;
                        kSerializerArr3 = kSerializerArr3;
                        str32 = str20;
                        i6 = 18;
                        str37 = str14;
                        break;
                    case 7:
                        kSerializerArr2 = kSerializerArr3;
                        str14 = str37;
                        str21 = str38;
                        str20 = str32;
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i5 |= 128;
                        kSerializerArr3 = kSerializerArr2;
                        str38 = str21;
                        str32 = str20;
                        i6 = 18;
                        str37 = str14;
                        break;
                    case 8:
                        kSerializerArr2 = kSerializerArr3;
                        str14 = str37;
                        str20 = str32;
                        str21 = str38;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str40);
                        i5 |= 256;
                        kSerializerArr3 = kSerializerArr2;
                        str38 = str21;
                        str32 = str20;
                        i6 = 18;
                        str37 = str14;
                        break;
                    case 9:
                        kSerializerArr2 = kSerializerArr3;
                        String str42 = str37;
                        str20 = str32;
                        str14 = str42;
                        i5 |= 512;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str38);
                        kSerializerArr3 = kSerializerArr2;
                        str38 = str21;
                        str32 = str20;
                        i6 = 18;
                        str37 = str14;
                        break;
                    case 10:
                        kSerializerArr2 = kSerializerArr3;
                        String str43 = str37;
                        str20 = str32;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str43);
                        i5 |= 1024;
                        str21 = str38;
                        kSerializerArr3 = kSerializerArr2;
                        str38 = str21;
                        str32 = str20;
                        i6 = 18;
                        str37 = str14;
                        break;
                    case 11:
                        kSerializerArr2 = kSerializerArr3;
                        i5 |= 2048;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, bool3);
                        str14 = str37;
                        str21 = str38;
                        str20 = str32;
                        kSerializerArr3 = kSerializerArr2;
                        str38 = str21;
                        str32 = str20;
                        i6 = 18;
                        str37 = str14;
                        break;
                    case 12:
                        i5 |= 4096;
                        kSerializerArr2 = kSerializerArr3;
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr3[12], list5);
                        str14 = str37;
                        str21 = str38;
                        str20 = str32;
                        kSerializerArr3 = kSerializerArr2;
                        str38 = str21;
                        str32 = str20;
                        i6 = 18;
                        str37 = str14;
                        break;
                    case 13:
                        i5 |= 8192;
                        kSerializerArr2 = kSerializerArr3;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str35);
                        str14 = str37;
                        str21 = str38;
                        str20 = str32;
                        kSerializerArr3 = kSerializerArr2;
                        str38 = str21;
                        str32 = str20;
                        i6 = 18;
                        str37 = str14;
                        break;
                    case 14:
                        i5 |= 16384;
                        kSerializerArr2 = kSerializerArr3;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str34);
                        str14 = str37;
                        str21 = str38;
                        str20 = str32;
                        kSerializerArr3 = kSerializerArr2;
                        str38 = str21;
                        str32 = str20;
                        i6 = 18;
                        str37 = str14;
                        break;
                    case 15:
                        pair3 = (Pair) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr3[15], pair3);
                        i4 = 32768;
                        i5 |= i4;
                        kSerializerArr2 = kSerializerArr3;
                        str14 = str37;
                        str21 = str38;
                        str20 = str32;
                        kSerializerArr3 = kSerializerArr2;
                        str38 = str21;
                        str32 = str20;
                        i6 = 18;
                        str37 = str14;
                        break;
                    case 16:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
                        i5 |= 65536;
                        kSerializerArr2 = kSerializerArr3;
                        str14 = str37;
                        str21 = str38;
                        str20 = str32;
                        kSerializerArr3 = kSerializerArr2;
                        str38 = str21;
                        str32 = str20;
                        i6 = 18;
                        str37 = str14;
                        break;
                    case 17:
                        i5 |= 131072;
                        kSerializerArr2 = kSerializerArr3;
                        list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr3[17], list4);
                        str14 = str37;
                        str21 = str38;
                        str20 = str32;
                        kSerializerArr3 = kSerializerArr2;
                        str38 = str21;
                        str32 = str20;
                        i6 = 18;
                        str37 = str14;
                        break;
                    case 18:
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str32);
                        i4 = 262144;
                        i5 |= i4;
                        kSerializerArr2 = kSerializerArr3;
                        str14 = str37;
                        str21 = str38;
                        str20 = str32;
                        kSerializerArr3 = kSerializerArr2;
                        str38 = str21;
                        str32 = str20;
                        i6 = 18;
                        str37 = str14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str44 = str37;
            String str45 = str32;
            String str46 = str36;
            z = zDecodeBooleanElement2;
            bool = bool3;
            list = list4;
            str = str33;
            list2 = list5;
            str2 = str34;
            str3 = str31;
            str4 = str40;
            str5 = str38;
            str6 = str44;
            str7 = str45;
            str8 = strDecodeStringElement3;
            str9 = strDecodeStringElement4;
            i = iDecodeIntElement3;
            i2 = iDecodeIntElement4;
            str10 = str39;
            pair = pair3;
            str11 = str35;
            i3 = i5;
            str12 = str46;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FiatCryptoCoinBean(i3, str9, str8, str10, i2, str12, str3, str, i, str4, str5, str6, bool, list2, str11, str2, pair, z, list, str7, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FiatCryptoCoinBean fiatCryptoCoinBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(fiatCryptoCoinBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FiatCryptoCoinBean.write$Self$OKPayments_ok_payment_api(fiatCryptoCoinBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
