package com.okinc.business.defi.biz.net.bean;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class AddressCoinHistoryDetail$$serializer implements GeneratedSerializer<AddressCoinHistoryDetail> {
    public static final int $stable;
    public static final AddressCoinHistoryDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AddressCoinHistoryDetail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AddressCoinHistoryDetail$$serializer addressCoinHistoryDetail$$serializer = new AddressCoinHistoryDetail$$serializer();
        INSTANCE = addressCoinHistoryDetail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail", addressCoinHistoryDetail$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("txhash", true);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("from", true);
        pluginGeneratedSerialDescriptor.addElement("to", true);
        pluginGeneratedSerialDescriptor.addElement("txType", true);
        pluginGeneratedSerialDescriptor.addElement("coinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("coinSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("txTime", true);
        pluginGeneratedSerialDescriptor.addElement("txStatus", true);
        pluginGeneratedSerialDescriptor.addElement("rowId", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("chainSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("isShowPending", true);
        pluginGeneratedSerialDescriptor.addElement("serviceCharge", true);
        pluginGeneratedSerialDescriptor.addElement("orderType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), intSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(longSerializer), stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AddressCoinHistoryDetail deserialize(@NotNull Decoder decoder) {
        int i;
        Long l;
        int iDecodeIntElement;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String strDecodeStringElement;
        boolean z;
        int i2;
        int i3;
        String str8;
        Long l2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 11;
        int i6 = 10;
        int i7 = 9;
        int i8 = 7;
        char c = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, longSerializer, null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, longSerializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 16);
            str7 = strDecodeStringElement5;
            str6 = strDecodeStringElement4;
            str5 = strDecodeStringElement3;
            str9 = strDecodeStringElement2;
            l2 = l3;
            z = zDecodeBooleanElement;
            i2 = iDecodeIntElement2;
            i3 = iDecodeIntElement3;
            str4 = str15;
            l = l4;
            i = 131071;
            str8 = str20;
            str2 = str17;
            str3 = str16;
            str10 = str19;
            str = str18;
        } else {
            int i9 = 16;
            i = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            boolean z2 = true;
            String str21 = null;
            Long l5 = null;
            String str22 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            Long l6 = null;
            int iDecodeIntElement6 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str11 = str23;
                        str12 = str25;
                        str13 = str26;
                        str14 = str24;
                        z2 = false;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 0:
                        str11 = str23;
                        str12 = str25;
                        str13 = str26;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str24);
                        i |= 1;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 1:
                        str11 = str23;
                        str12 = str25;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str26);
                        i4 = i | 2;
                        i = i4;
                        str14 = str24;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 2:
                        str12 = str25;
                        i4 = i | 4;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str23);
                        i = i4;
                        str14 = str24;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 3:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str25);
                        i4 = i | 8;
                        str11 = str23;
                        str12 = str25;
                        i = i4;
                        str14 = str24;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 4:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i4 = i | 16;
                        str11 = str23;
                        str12 = str25;
                        i = i4;
                        str14 = str24;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 5:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str22);
                        i4 = i | 32;
                        str11 = str23;
                        str12 = str25;
                        i = i4;
                        str14 = str24;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 6:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str21);
                        i4 = i | 64;
                        str11 = str23;
                        str12 = str25;
                        i = i4;
                        str14 = str24;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 7:
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i8, LongSerializer.INSTANCE, l5);
                        i4 = i | 128;
                        str11 = str23;
                        str12 = str25;
                        i = i4;
                        str14 = str24;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 8:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i |= 256;
                        i9 = 16;
                        c = 6;
                        break;
                    case 9:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i7);
                        i |= 512;
                        str11 = str23;
                        str14 = str24;
                        str12 = str25;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 10:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i |= 1024;
                        str11 = str23;
                        str14 = str24;
                        str12 = str25;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 11:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i |= 2048;
                        str11 = str23;
                        str14 = str24;
                        str12 = str25;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 12:
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, LongSerializer.INSTANCE, l6);
                        i |= 4096;
                        str11 = str23;
                        str14 = str24;
                        str12 = str25;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 13:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i |= 8192;
                        str11 = str23;
                        str14 = str24;
                        str12 = str25;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 14:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                        i |= 16384;
                        str11 = str23;
                        str14 = str24;
                        str12 = str25;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 15:
                        i |= 32768;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        str11 = str23;
                        str14 = str24;
                        str12 = str25;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    case 16:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i9);
                        i = 65536 | i;
                        str11 = str23;
                        str14 = str24;
                        str12 = str25;
                        str13 = str26;
                        str24 = str14;
                        str25 = str12;
                        str23 = str11;
                        str26 = str13;
                        i9 = 16;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str27 = str26;
            l = l6;
            iDecodeIntElement = iDecodeIntElement6;
            str = str25;
            str2 = str23;
            str3 = str27;
            str4 = str24;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement9;
            strDecodeStringElement = strDecodeStringElement10;
            z = zDecodeBooleanElement2;
            i2 = iDecodeIntElement4;
            i3 = iDecodeIntElement5;
            str8 = str21;
            l2 = l5;
            str9 = strDecodeStringElement6;
            str10 = str22;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AddressCoinHistoryDetail(i, str4, str3, str2, str, i2, str10, str8, l2, i3, str9, str5, str6, l, str7, z, strDecodeStringElement, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AddressCoinHistoryDetail addressCoinHistoryDetail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(addressCoinHistoryDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AddressCoinHistoryDetail.write$Self$OKWallet_wallet_impl(addressCoinHistoryDetail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
