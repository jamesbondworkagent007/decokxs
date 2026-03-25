package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
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
public final /* synthetic */ class AddressCoinBalanceDetail$$serializer implements GeneratedSerializer<AddressCoinBalanceDetail> {
    public static final int $stable;
    public static final AddressCoinBalanceDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AddressCoinBalanceDetail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AddressCoinBalanceDetail$$serializer addressCoinBalanceDetail$$serializer = new AddressCoinBalanceDetail$$serializer();
        INSTANCE = addressCoinBalanceDetail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.AddressCoinBalanceDetail", addressCoinBalanceDetail$$serializer, 20);
        pluginGeneratedSerialDescriptor.addElement("coinId", true);
        pluginGeneratedSerialDescriptor.addElement("baseCoinId", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("symbol", true);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("chainName", true);
        pluginGeneratedSerialDescriptor.addElement("tokenType", true);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", true);
        pluginGeneratedSerialDescriptor.addElement("explorerUrl", true);
        pluginGeneratedSerialDescriptor.addElement("chainImageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("userAddress", true);
        pluginGeneratedSerialDescriptor.addElement("coinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("coinAmountOrigin", true);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("coinPriceVo", true);
        pluginGeneratedSerialDescriptor.addElement("isRiskType", true);
        pluginGeneratedSerialDescriptor.addElement("isHighQuality", true);
        pluginGeneratedSerialDescriptor.addElement("stableCoin", true);
        pluginGeneratedSerialDescriptor.addElement("aggregationType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(AddressCoinPriceInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AddressCoinBalanceDetail deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        String str;
        int i;
        Integer num;
        Long l;
        Long l2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        long j;
        AddressCoinPriceInfo addressCoinPriceInfo;
        Integer num2;
        Boolean bool2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Long l3;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        int i4 = 10;
        int i5 = 9;
        int i6 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, longSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            str4 = strDecodeStringElement2;
            AddressCoinPriceInfo addressCoinPriceInfo2 = (AddressCoinPriceInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, AddressCoinPriceInfo$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, booleanSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, intSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, booleanSerializer, null);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, intSerializer, null);
            bool2 = bool4;
            str8 = strDecodeStringElement6;
            str7 = strDecodeStringElement11;
            str12 = strDecodeStringElement8;
            str10 = strDecodeStringElement7;
            str11 = strDecodeStringElement9;
            str9 = strDecodeStringElement10;
            num2 = num3;
            bool = bool3;
            l2 = l4;
            l = l5;
            addressCoinPriceInfo = addressCoinPriceInfo2;
            j = jDecodeLongElement;
            str = str14;
            i = 1048575;
            str5 = strDecodeStringElement;
            str3 = strDecodeStringElement3;
            str2 = strDecodeStringElement5;
            str6 = strDecodeStringElement4;
        } else {
            int i7 = 19;
            Boolean bool5 = null;
            AddressCoinPriceInfo addressCoinPriceInfo3 = null;
            Integer num4 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String str15 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            Long l6 = null;
            Long l7 = null;
            String strDecodeStringElement21 = null;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            Boolean bool6 = null;
            String strDecodeStringElement22 = null;
            int i8 = 0;
            Integer num5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str13 = str15;
                        l3 = l6;
                        z = false;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 0:
                        str13 = str15;
                        l3 = l6;
                        l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l7);
                        i8 |= 1;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 1:
                        str13 = str15;
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l6);
                        i8 |= 2;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 2:
                        str13 = str15;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i8 |= 4;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 3:
                        str13 = str15;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i8 |= 8;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 4:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str15);
                        i8 |= 16;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 5:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i8 |= 32;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 6:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i8 |= 64;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 7:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i8 |= 128;
                        i7 = 19;
                        break;
                    case 8:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i6);
                        i8 |= 256;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 9:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i8 |= 512;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 10:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i8 |= 1024;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 11:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i8 |= 2048;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 12:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i8 |= 4096;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 13:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i8 |= 8192;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 14:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i8 |= 16384;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 15:
                        addressCoinPriceInfo3 = (AddressCoinPriceInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, AddressCoinPriceInfo$$serializer.INSTANCE, addressCoinPriceInfo3);
                        i2 = 32768;
                        i8 |= i2;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 16:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, bool5);
                        i2 = 65536;
                        i8 |= i2;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 17:
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, num4);
                        i2 = 131072;
                        i8 |= i2;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 18:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, bool6);
                        i2 = 262144;
                        i8 |= i2;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 19:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i7, IntSerializer.INSTANCE, num5);
                        i2 = 524288;
                        i8 |= i2;
                        str13 = str15;
                        l3 = l6;
                        str15 = str13;
                        l6 = l3;
                        i7 = 19;
                        i6 = 8;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str16 = str15;
            Long l8 = l6;
            bool = bool5;
            str = str16;
            i = i8;
            num = num5;
            l = l8;
            l2 = l7;
            str2 = strDecodeStringElement22;
            str3 = strDecodeStringElement18;
            str4 = strDecodeStringElement19;
            str5 = strDecodeStringElement20;
            str6 = strDecodeStringElement21;
            j = jDecodeLongElement2;
            addressCoinPriceInfo = addressCoinPriceInfo3;
            num2 = num4;
            bool2 = bool6;
            String str17 = strDecodeStringElement17;
            str7 = strDecodeStringElement12;
            str8 = str17;
            String str18 = strDecodeStringElement16;
            str9 = strDecodeStringElement13;
            str10 = str18;
            String str19 = strDecodeStringElement15;
            str11 = strDecodeStringElement14;
            str12 = str19;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AddressCoinBalanceDetail(i, l2, l, str5, str4, str, str3, str6, str2, j, str8, str10, str12, str11, str9, str7, addressCoinPriceInfo, bool, num2, bool2, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AddressCoinBalanceDetail addressCoinBalanceDetail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(addressCoinBalanceDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AddressCoinBalanceDetail.write$Self$OKWallet_wallet_impl(addressCoinBalanceDetail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
