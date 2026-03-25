package com.okinc.business.defi.biz.net.bean;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.p2p.api.OtcExtraKeys;
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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class TxAssetChangeBean$$serializer implements GeneratedSerializer<TxAssetChangeBean> {
    public static final int $stable;
    public static final TxAssetChangeBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TxAssetChangeBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TxAssetChangeBean$$serializer txAssetChangeBean$$serializer = new TxAssetChangeBean$$serializer();
        INSTANCE = txAssetChangeBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.TxAssetChangeBean", txAssetChangeBean$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("nftId", true);
        pluginGeneratedSerialDescriptor.addElement("vdecimalNum", true);
        pluginGeneratedSerialDescriptor.addElement("decimalNum", true);
        pluginGeneratedSerialDescriptor.addElement("brc20Coin", true);
        pluginGeneratedSerialDescriptor.addElement("nftCollectionName", true);
        pluginGeneratedSerialDescriptor.addElement("nftCollectionIcon", true);
        pluginGeneratedSerialDescriptor.addElement("nftImageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("protocolName", true);
        pluginGeneratedSerialDescriptor.addElement("protocolId", true);
        pluginGeneratedSerialDescriptor.addElement("coinId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TxAssetChangeBean deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        String str2;
        String str3;
        Integer num2;
        String str4;
        Long l;
        String str5;
        String str6;
        String str7;
        boolean z;
        String str8;
        String str9;
        int i;
        String str10;
        Integer num3;
        Integer num4;
        String str11;
        String str12;
        String str13;
        String str14;
        Integer num5;
        String str15;
        String str16;
        String str17;
        String str18;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        String str19 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
            Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, intSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            Integer num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, intSerializer, null);
            str4 = str29;
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, LongSerializer.INSTANCE, null);
            str5 = str21;
            str3 = str27;
            str2 = str26;
            num3 = num7;
            num = num6;
            str9 = str25;
            z = zDecodeBooleanElement;
            str6 = str24;
            num2 = num8;
            str10 = str28;
            str = str20;
            str8 = str23;
            str7 = str22;
            i = 32767;
        } else {
            int i4 = 14;
            int i5 = 0;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            String str30 = null;
            String str31 = null;
            Integer num9 = null;
            String str32 = null;
            String str33 = null;
            Integer num10 = null;
            String str34 = null;
            Long l2 = null;
            Integer num11 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str13 = str30;
                        str14 = str19;
                        num5 = num11;
                        str15 = str35;
                        str16 = str36;
                        str17 = str38;
                        str18 = str31;
                        z2 = false;
                        str38 = str17;
                        num11 = num5;
                        str35 = str15;
                        str30 = str13;
                        str19 = str14;
                        str31 = str18;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        str36 = str16;
                        break;
                    case 0:
                        str13 = str30;
                        str14 = str19;
                        num5 = num11;
                        str15 = str35;
                        String str39 = str36;
                        str17 = str38;
                        str18 = str31;
                        str16 = str39;
                        i5 |= 1;
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str37);
                        str38 = str17;
                        num11 = num5;
                        str35 = str15;
                        str30 = str13;
                        str19 = str14;
                        str31 = str18;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        str36 = str16;
                        break;
                    case 1:
                        str13 = str30;
                        str14 = str19;
                        num5 = num11;
                        str15 = str35;
                        str17 = str38;
                        String str40 = str36;
                        str18 = str31;
                        i5 |= 2;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str40);
                        str38 = str17;
                        num11 = num5;
                        str35 = str15;
                        str30 = str13;
                        str19 = str14;
                        str31 = str18;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        str36 = str16;
                        break;
                    case 2:
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str31);
                        i5 |= 4;
                        str30 = str30;
                        str19 = str19;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 3:
                        num4 = num11;
                        str11 = str35;
                        str12 = str30;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str38);
                        i5 |= 8;
                        str19 = str19;
                        num11 = num4;
                        str35 = str11;
                        str30 = str12;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        num4 = num11;
                        str11 = str35;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str30);
                        i5 |= 16;
                        str19 = str19;
                        num11 = num4;
                        str35 = str11;
                        str30 = str12;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 5:
                        num4 = num11;
                        str12 = str30;
                        i5 |= 32;
                        str19 = str19;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str35);
                        num11 = num4;
                        str35 = str11;
                        str30 = str12;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 6:
                        num4 = num11;
                        str12 = str30;
                        i5 |= 64;
                        str11 = str35;
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num9);
                        num11 = num4;
                        str35 = str11;
                        str30 = str12;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 7:
                        str12 = str30;
                        i5 |= 128;
                        str11 = str35;
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, num11);
                        num11 = num4;
                        str35 = str11;
                        str30 = str12;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 8:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i5 |= 256;
                        str12 = str30;
                        num4 = num11;
                        str11 = str35;
                        num11 = num4;
                        str35 = str11;
                        str30 = str12;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 9:
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str32);
                        i5 |= 512;
                        str12 = str30;
                        num4 = num11;
                        str11 = str35;
                        num11 = num4;
                        str35 = str11;
                        str30 = str12;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 10:
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str33);
                        i5 |= 1024;
                        str12 = str30;
                        num4 = num11;
                        str11 = str35;
                        num11 = num4;
                        str35 = str11;
                        str30 = str12;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 11:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str19);
                        i5 |= 2048;
                        str12 = str30;
                        num4 = num11;
                        str11 = str35;
                        num11 = num4;
                        str35 = str11;
                        str30 = str12;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 12:
                        i5 |= 4096;
                        str12 = str30;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str34);
                        num4 = num11;
                        str11 = str35;
                        num11 = num4;
                        str35 = str11;
                        str30 = str12;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 13:
                        num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, num10);
                        i5 |= 8192;
                        str12 = str30;
                        num4 = num11;
                        str11 = str35;
                        num11 = num4;
                        str35 = str11;
                        str30 = str12;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 14:
                        i5 |= 16384;
                        str12 = str30;
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, LongSerializer.INSTANCE, l2);
                        num4 = num11;
                        str11 = str35;
                        num11 = num4;
                        str35 = str11;
                        str30 = str12;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str41 = str19;
            Integer num12 = num11;
            String str42 = str35;
            String str43 = str38;
            str = str37;
            num = num9;
            str2 = str32;
            str3 = str33;
            num2 = num10;
            str4 = str34;
            l = l2;
            str5 = str36;
            str6 = str30;
            str7 = str31;
            z = zDecodeBooleanElement2;
            str8 = str43;
            str9 = str42;
            i = i5;
            str10 = str41;
            num3 = num12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TxAssetChangeBean(i, str, str5, str7, str8, str6, str9, num, num3, z, str2, str3, str10, str4, num2, l, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TxAssetChangeBean txAssetChangeBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(txAssetChangeBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TxAssetChangeBean.write$Self$OKWallet_wallet_impl(txAssetChangeBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
