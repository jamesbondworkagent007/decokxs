package com.okinc.business.defi.wallet.transfer.receive.exchange.bean;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ExchangeSelectNetworkBean$$serializer implements GeneratedSerializer<ExchangeSelectNetworkBean> {
    public static final int $stable;
    public static final ExchangeSelectNetworkBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ExchangeSelectNetworkBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ExchangeSelectNetworkBean$$serializer exchangeSelectNetworkBean$$serializer = new ExchangeSelectNetworkBean$$serializer();
        INSTANCE = exchangeSelectNetworkBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeSelectNetworkBean", exchangeSelectNetworkBean$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("gasFee", false);
        pluginGeneratedSerialDescriptor.addElement("gasFeeSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("usdGasFee", false);
        pluginGeneratedSerialDescriptor.addElement("estimatedArrivalTime", false);
        pluginGeneratedSerialDescriptor.addElement("subCurrencyId", false);
        pluginGeneratedSerialDescriptor.addElement("usdGasFeeSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("coinId", false);
        pluginGeneratedSerialDescriptor.addElement("realChainId", false);
        pluginGeneratedSerialDescriptor.addElement("networkName", true);
        pluginGeneratedSerialDescriptor.addElement("assetAccountWalletCurrencies", true);
        pluginGeneratedSerialDescriptor.addElement("coinMetaSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("coinMetaAddress", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(stringSerializer);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ExchangeSelectNetworkBean deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        String str2;
        Long l;
        Long l2;
        String str3;
        String str4;
        String str5;
        String str6;
        Integer num2;
        String str7;
        String str8;
        String str9;
        String str10;
        int i;
        String str11;
        Integer num3;
        Integer num4;
        String str12;
        String str13;
        Integer num5;
        String str14;
        String str15;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, intSerializer, null);
            Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, longSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            num2 = num7;
            str = str22;
            l2 = l4;
            str6 = str21;
            str3 = str23;
            num = num6;
            str8 = str19;
            l = l3;
            str9 = str20;
            str5 = str24;
            str7 = str17;
            str10 = str16;
            str2 = str18;
            i = 16383;
        } else {
            int i4 = 13;
            String str25 = null;
            Long l5 = null;
            Long l6 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            Integer num8 = null;
            String str32 = null;
            String str33 = null;
            boolean z = true;
            int i5 = 0;
            Integer num9 = null;
            String str34 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        num4 = num9;
                        str12 = str30;
                        str13 = str31;
                        num5 = num8;
                        str14 = str33;
                        str15 = str32;
                        z = false;
                        num8 = num5;
                        str30 = str12;
                        str31 = str13;
                        num9 = num4;
                        str32 = str15;
                        i2 = 10;
                        i3 = 9;
                        str33 = str14;
                        i4 = 13;
                        break;
                    case 0:
                        num4 = num9;
                        str12 = str30;
                        str13 = str31;
                        num5 = num8;
                        String str35 = str33;
                        str15 = str32;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str35);
                        i5 |= 1;
                        num8 = num5;
                        str30 = str12;
                        str31 = str13;
                        num9 = num4;
                        str32 = str15;
                        i2 = 10;
                        i3 = 9;
                        str33 = str14;
                        i4 = 13;
                        break;
                    case 1:
                        num4 = num9;
                        str12 = str30;
                        num5 = num8;
                        str13 = str31;
                        i5 |= 2;
                        str14 = str33;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str32);
                        num8 = num5;
                        str30 = str12;
                        str31 = str13;
                        num9 = num4;
                        str32 = str15;
                        i2 = 10;
                        i3 = 9;
                        str33 = str14;
                        i4 = 13;
                        break;
                    case 2:
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str30);
                        i5 |= 4;
                        num9 = num9;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 3:
                        str11 = str31;
                        num3 = num8;
                        i5 |= 8;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str29);
                        str31 = str11;
                        num8 = num3;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        str11 = str31;
                        num3 = num8;
                        i5 |= 16;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str34);
                        str31 = str11;
                        num8 = num3;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 5:
                        str11 = str31;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num8);
                        i5 |= 32;
                        str31 = str11;
                        num8 = num3;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 6:
                        str11 = str31;
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num9);
                        i5 |= 64;
                        num3 = num8;
                        str31 = str11;
                        num8 = num3;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 7:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str31);
                        i5 |= 128;
                        num3 = num8;
                        str31 = str11;
                        num8 = num3;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 8:
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, l5);
                        i5 |= 256;
                        str11 = str31;
                        num3 = num8;
                        str31 = str11;
                        num8 = num3;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 9:
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, LongSerializer.INSTANCE, l6);
                        i5 |= 512;
                        str11 = str31;
                        num3 = num8;
                        str31 = str11;
                        num8 = num3;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 10:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str25);
                        i5 |= 1024;
                        str11 = str31;
                        num3 = num8;
                        str31 = str11;
                        num8 = num3;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 11:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str26);
                        i5 |= 2048;
                        str11 = str31;
                        num3 = num8;
                        str31 = str11;
                        num8 = num3;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 12:
                        i5 |= 4096;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str28);
                        str11 = str31;
                        num3 = num8;
                        str31 = str11;
                        num8 = num3;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 13:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str27);
                        i5 |= 8192;
                        str11 = str31;
                        num3 = num8;
                        str31 = str11;
                        num8 = num3;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str36 = str30;
            String str37 = str31;
            String str38 = str33;
            String str39 = str32;
            str = str25;
            num = num8;
            str2 = str36;
            l = l5;
            l2 = l6;
            str3 = str26;
            str4 = str27;
            str5 = str28;
            str6 = str37;
            num2 = num9;
            str7 = str39;
            str8 = str29;
            str9 = str34;
            str10 = str38;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ExchangeSelectNetworkBean(i, str10, str7, str2, str8, str9, num, num2, str6, l, l2, str, str3, str5, str4, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ExchangeSelectNetworkBean exchangeSelectNetworkBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(exchangeSelectNetworkBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ExchangeSelectNetworkBean.write$Self$OKWallet_wallet_impl(exchangeSelectNetworkBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
