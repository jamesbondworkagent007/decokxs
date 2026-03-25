package com.okinc.business.defi.wallet.transfer.receive.exchange.bean;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ExchangeSelectCoinBean$$serializer implements GeneratedSerializer<ExchangeSelectCoinBean> {
    public static final int $stable;
    public static final ExchangeSelectCoinBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ExchangeSelectCoinBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ExchangeSelectCoinBean$$serializer exchangeSelectCoinBean$$serializer = new ExchangeSelectCoinBean$$serializer();
        INSTANCE = exchangeSelectCoinBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeSelectCoinBean", exchangeSelectCoinBean$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, false);
        pluginGeneratedSerialDescriptor.addElement("currency", false);
        pluginGeneratedSerialDescriptor.addElement("fullName", false);
        pluginGeneratedSerialDescriptor.addElement("balance", false);
        pluginGeneratedSerialDescriptor.addElement("valuation", false);
        pluginGeneratedSerialDescriptor.addElement("currencyId", false);
        pluginGeneratedSerialDescriptor.addElement("isSupportWallet", true);
        pluginGeneratedSerialDescriptor.addElement("networks", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencySymbol", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = ExchangeSelectCoinBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[7]), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ExchangeSelectCoinBean deserialize(@NotNull Decoder decoder) {
        String str;
        int i;
        Integer num;
        Boolean bool;
        String str2;
        ArrayList arrayList;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ExchangeSelectCoinBean.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        int i4 = 8;
        ArrayList arrayList2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, null);
            arrayList = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            bool = bool2;
            num = num2;
            str = str9;
            i = 511;
            str4 = str10;
            str5 = str8;
        } else {
            int i5 = 0;
            boolean z = true;
            Integer num3 = null;
            Boolean bool3 = null;
            String str11 = null;
            String str12 = null;
            str = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str7 = str14;
                        z = false;
                        str14 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 0:
                        str7 = str14;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str15);
                        i5 |= 1;
                        str14 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 1:
                        str7 = str14;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str13);
                        i5 |= 2;
                        str14 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 2:
                        str7 = str14;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str11);
                        i5 |= 4;
                        str14 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 3:
                        str7 = str14;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str);
                        i5 |= 8;
                        str14 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 4:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str14);
                        i5 |= 16;
                        str14 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 5:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, IntSerializer.INSTANCE, num3);
                        i5 |= 32;
                        str7 = str14;
                        str14 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 6:
                        i5 |= 64;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool3);
                        str7 = str14;
                        str14 = str7;
                        i2 = 6;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 7:
                        i5 |= 128;
                        arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], arrayList2);
                        break;
                    case 8:
                        i5 |= 256;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str12);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str16 = str14;
            i = i5;
            num = num3;
            bool = bool3;
            str2 = str12;
            arrayList = arrayList2;
            str3 = str13;
            str4 = str16;
            str5 = str11;
            str6 = str15;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ExchangeSelectCoinBean(i, str6, str3, str5, str, str4, num, bool, arrayList, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ExchangeSelectCoinBean exchangeSelectCoinBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(exchangeSelectCoinBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ExchangeSelectCoinBean.write$Self$OKWallet_wallet_impl(exchangeSelectCoinBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
