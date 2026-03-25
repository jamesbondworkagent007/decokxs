package com.okinc.business.defi.wallet.home.escapebind.model;

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
public final /* synthetic */ class EscapeAccountDetail$$serializer implements GeneratedSerializer<EscapeAccountDetail> {
    public static final int $stable;
    public static final EscapeAccountDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EscapeAccountDetail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EscapeAccountDetail$$serializer escapeAccountDetail$$serializer = new EscapeAccountDetail$$serializer();
        INSTANCE = escapeAccountDetail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountDetail", escapeAccountDetail$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", true);
        pluginGeneratedSerialDescriptor.addElement("chainName", true);
        pluginGeneratedSerialDescriptor.addElement("coinId", true);
        pluginGeneratedSerialDescriptor.addElement("symbol", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("logo", true);
        pluginGeneratedSerialDescriptor.addElement("coinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("originalCoinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("decimalNum", true);
        pluginGeneratedSerialDescriptor.addElement("displayPrecision", true);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("riskType", true);
        pluginGeneratedSerialDescriptor.addElement("isMainCoin", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable9 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable10 = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, nullable9, nullable10, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EscapeAccountDetail deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        Integer num;
        Long l;
        int i;
        String str4;
        Integer num2;
        String str5;
        String str6;
        String str7;
        String str8;
        Boolean bool;
        String str9;
        Long l2;
        String str10;
        Integer num3;
        String str11;
        String str12;
        String str13;
        int i2;
        Integer num4;
        String str14;
        String str15;
        String str16;
        String str17;
        Long l3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 10;
        Integer num5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, longSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, intSerializer, null);
            Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, longSerializer, null);
            str8 = str27;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, BooleanSerializer.INSTANCE, null);
            l = l5;
            num2 = num6;
            str2 = str24;
            str = str23;
            num = num7;
            i = 32767;
            str4 = str22;
            str10 = str18;
            str5 = str25;
            str6 = str20;
            l2 = l4;
            str9 = str21;
            str7 = str19;
            str3 = str26;
        } else {
            int i4 = 14;
            int i5 = 0;
            boolean z = true;
            Long l6 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            Integer num8 = null;
            String str31 = null;
            Long l7 = null;
            Boolean bool2 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        num4 = num5;
                        str14 = str33;
                        str15 = str34;
                        str16 = str35;
                        str17 = str36;
                        l3 = l6;
                        z = false;
                        str34 = str15;
                        str35 = str16;
                        str33 = str14;
                        l6 = l3;
                        i4 = 14;
                        i3 = 10;
                        str36 = str17;
                        num5 = num4;
                        break;
                    case 0:
                        num4 = num5;
                        str14 = str33;
                        str15 = str34;
                        str17 = str36;
                        l3 = l6;
                        str16 = str35;
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str37);
                        i5 |= 1;
                        str34 = str15;
                        str35 = str16;
                        str33 = str14;
                        l6 = l3;
                        i4 = 14;
                        i3 = 10;
                        str36 = str17;
                        num5 = num4;
                        break;
                    case 1:
                        num4 = num5;
                        str14 = str33;
                        str15 = str34;
                        String str38 = str36;
                        l3 = l6;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str38);
                        i5 |= 2;
                        str16 = str35;
                        str34 = str15;
                        str35 = str16;
                        str33 = str14;
                        l6 = l3;
                        i4 = 14;
                        i3 = 10;
                        str36 = str17;
                        num5 = num4;
                        break;
                    case 2:
                        num4 = num5;
                        str14 = str33;
                        str15 = str34;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str28);
                        str16 = str35;
                        i5 |= 4;
                        str17 = str36;
                        l3 = l6;
                        str34 = str15;
                        str35 = str16;
                        str33 = str14;
                        l6 = l3;
                        i4 = 14;
                        i3 = 10;
                        str36 = str17;
                        num5 = num4;
                        break;
                    case 3:
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str32);
                        i5 |= 8;
                        num5 = num5;
                        i4 = 14;
                        i3 = 10;
                        break;
                    case 4:
                        num3 = num5;
                        str11 = str33;
                        str12 = str34;
                        str13 = str35;
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, l6);
                        i5 |= 16;
                        str35 = str13;
                        str34 = str12;
                        num5 = num3;
                        str33 = str11;
                        i4 = 14;
                        i3 = 10;
                        break;
                    case 5:
                        str11 = str33;
                        str12 = str34;
                        num3 = num5;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str35);
                        i5 |= 32;
                        str35 = str13;
                        str34 = str12;
                        num5 = num3;
                        str33 = str11;
                        i4 = 14;
                        i3 = 10;
                        break;
                    case 6:
                        str11 = str33;
                        str12 = str34;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str29);
                        i2 = i5 | 64;
                        num3 = num5;
                        i5 = i2;
                        str13 = str35;
                        str35 = str13;
                        str34 = str12;
                        num5 = num3;
                        str33 = str11;
                        i4 = 14;
                        i3 = 10;
                        break;
                    case 7:
                        str11 = str33;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str34);
                        i2 = i5 | 128;
                        num3 = num5;
                        i5 = i2;
                        str13 = str35;
                        str35 = str13;
                        str34 = str12;
                        num5 = num3;
                        str33 = str11;
                        i4 = 14;
                        i3 = 10;
                        break;
                    case 8:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str33);
                        num3 = num5;
                        i5 |= 256;
                        str12 = str34;
                        str13 = str35;
                        str35 = str13;
                        str34 = str12;
                        num5 = num3;
                        str33 = str11;
                        i4 = 14;
                        i3 = 10;
                        break;
                    case 9:
                        num3 = num5;
                        i5 |= 512;
                        str11 = str33;
                        str12 = str34;
                        str13 = str35;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str30);
                        str35 = str13;
                        str34 = str12;
                        num5 = num3;
                        str33 = str11;
                        i4 = 14;
                        i3 = 10;
                        break;
                    case 10:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, IntSerializer.INSTANCE, num5);
                        i5 |= 1024;
                        str11 = str33;
                        str12 = str34;
                        str13 = str35;
                        str35 = str13;
                        str34 = str12;
                        num5 = num3;
                        str33 = str11;
                        i4 = 14;
                        i3 = 10;
                        break;
                    case 11:
                        num3 = num5;
                        i5 |= 2048;
                        str11 = str33;
                        str12 = str34;
                        str13 = str35;
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, num8);
                        str35 = str13;
                        str34 = str12;
                        num5 = num3;
                        str33 = str11;
                        i4 = 14;
                        i3 = 10;
                        break;
                    case 12:
                        num3 = num5;
                        i5 |= 4096;
                        str11 = str33;
                        str12 = str34;
                        str13 = str35;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str31);
                        str35 = str13;
                        str34 = str12;
                        num5 = num3;
                        str33 = str11;
                        i4 = 14;
                        i3 = 10;
                        break;
                    case 13:
                        num3 = num5;
                        i5 |= 8192;
                        str11 = str33;
                        str12 = str34;
                        str13 = str35;
                        l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.INSTANCE, l7);
                        str35 = str13;
                        str34 = str12;
                        num5 = num3;
                        str33 = str11;
                        i4 = 14;
                        i3 = 10;
                        break;
                    case 14:
                        i5 |= 16384;
                        num3 = num5;
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool2);
                        str11 = str33;
                        str12 = str34;
                        str13 = str35;
                        str35 = str13;
                        str34 = str12;
                        num5 = num3;
                        str33 = str11;
                        i4 = 14;
                        i3 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Integer num9 = num5;
            str = str29;
            str2 = str34;
            str3 = str30;
            num = num8;
            l = l7;
            i = i5;
            str4 = str35;
            num2 = num9;
            str5 = str33;
            str6 = str28;
            str7 = str36;
            str8 = str31;
            bool = bool2;
            str9 = str32;
            l2 = l6;
            str10 = str37;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EscapeAccountDetail(i, str10, str7, str6, str9, l2, str4, str, str2, str5, str3, num2, num, str8, l, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EscapeAccountDetail escapeAccountDetail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(escapeAccountDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EscapeAccountDetail.write$Self$OKWallet_wallet_impl(escapeAccountDetail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
