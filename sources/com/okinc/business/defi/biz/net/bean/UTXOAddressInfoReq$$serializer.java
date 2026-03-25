package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class UTXOAddressInfoReq$$serializer implements GeneratedSerializer<UTXOAddressInfoReq> {
    public static final int $stable;
    public static final UTXOAddressInfoReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UTXOAddressInfoReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UTXOAddressInfoReq$$serializer uTXOAddressInfoReq$$serializer = new UTXOAddressInfoReq$$serializer();
        INSTANCE = uTXOAddressInfoReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq", uTXOAddressInfoReq$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("coinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("serviceCharge", true);
        pluginGeneratedSerialDescriptor.addElement("utxoType", true);
        pluginGeneratedSerialDescriptor.addElement("nftId", true);
        pluginGeneratedSerialDescriptor.addElement("from", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        pluginGeneratedSerialDescriptor.addElement("tick", true);
        pluginGeneratedSerialDescriptor.addElement("tid", true);
        pluginGeneratedSerialDescriptor.addElement("needFilteredUtxo", true);
        pluginGeneratedSerialDescriptor.addElement("batchDummyNum", true);
        pluginGeneratedSerialDescriptor.addElement("tempFeeRate", true);
        pluginGeneratedSerialDescriptor.addElement("protocolId", true);
        pluginGeneratedSerialDescriptor.addElement("txHash", true);
        pluginGeneratedSerialDescriptor.addElement("vout", true);
        pluginGeneratedSerialDescriptor.addElement("speedUpNeedUtxo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = UTXOAddressInfoReq.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[9]), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[15])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UTXOAddressInfoReq deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        List list;
        Integer num2;
        List list2;
        Integer num3;
        String str2;
        String str3;
        Integer num4;
        String str4;
        Integer num5;
        String str5;
        Integer num6;
        Integer num7;
        String str6;
        int i;
        String str7;
        KSerializer[] kSerializerArr;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        String str8;
        String str9;
        String str10;
        String str11;
        Integer num12;
        Integer num13;
        String str12;
        String str13;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = UTXOAddressInfoReq.$childSerializers;
        int i2 = 9;
        List list3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num14 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, intSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Integer num15 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, intSerializer, null);
            Integer num16 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr2[9], null);
            Integer num17 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, intSerializer, null);
            Integer num18 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            Integer num19 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, intSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            Integer num20 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, intSerializer, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr2[15], null);
            str = str20;
            num5 = num20;
            num2 = num17;
            str2 = str15;
            str7 = str18;
            num6 = num16;
            str6 = str19;
            num = num19;
            num3 = num18;
            list2 = list4;
            str5 = str14;
            num7 = num15;
            num4 = num14;
            str4 = str17;
            str3 = str16;
            i = 65535;
        } else {
            int i3 = 15;
            int i4 = 0;
            boolean z = true;
            Integer num21 = null;
            String str21 = null;
            Integer num22 = null;
            String str22 = null;
            String str23 = null;
            Integer num23 = null;
            List list5 = null;
            Integer num24 = null;
            Integer num25 = null;
            Integer num26 = null;
            Integer num27 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        num8 = num21;
                        num9 = num25;
                        num10 = num26;
                        num11 = num27;
                        str8 = str24;
                        str9 = str25;
                        str10 = str26;
                        str11 = str27;
                        z = false;
                        str25 = str9;
                        num25 = num9;
                        num26 = num10;
                        str24 = str8;
                        str27 = str11;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        num8 = num21;
                        num12 = num25;
                        num13 = num26;
                        num11 = num27;
                        str10 = str26;
                        str12 = str24;
                        i4 |= 1;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str25);
                        str13 = str27;
                        str27 = str13;
                        num25 = num12;
                        num26 = num13;
                        str24 = str12;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        num8 = num21;
                        num9 = num25;
                        num10 = num26;
                        num11 = num27;
                        str10 = str26;
                        str11 = str27;
                        i4 |= 2;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str24);
                        str9 = str25;
                        str25 = str9;
                        num25 = num9;
                        num26 = num10;
                        str24 = str8;
                        str27 = str11;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr2;
                        num8 = num21;
                        num12 = num25;
                        num13 = num26;
                        str10 = str26;
                        num11 = num27;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str27);
                        i4 |= 4;
                        str12 = str24;
                        str27 = str13;
                        num25 = num12;
                        num26 = num13;
                        str24 = str12;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 3:
                        kSerializerArr = kSerializerArr2;
                        num8 = num21;
                        num12 = num25;
                        num13 = num26;
                        str10 = str26;
                        i4 |= 8;
                        num11 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num27);
                        str12 = str24;
                        str13 = str27;
                        str27 = str13;
                        num25 = num12;
                        num26 = num13;
                        str24 = str12;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr2;
                        num12 = num25;
                        num13 = num26;
                        num8 = num21;
                        i4 |= 16;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str26);
                        num11 = num27;
                        str12 = str24;
                        str13 = str27;
                        str27 = str13;
                        num25 = num12;
                        num26 = num13;
                        str24 = str12;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 5:
                        num12 = num25;
                        kSerializerArr = kSerializerArr2;
                        num13 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num26);
                        i4 |= 32;
                        num8 = num21;
                        num11 = num27;
                        str12 = str24;
                        str10 = str26;
                        str13 = str27;
                        str27 = str13;
                        num25 = num12;
                        num26 = num13;
                        str24 = str12;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 6:
                        num12 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num25);
                        i4 |= 64;
                        kSerializerArr = kSerializerArr2;
                        num8 = num21;
                        num13 = num26;
                        num11 = num27;
                        str12 = str24;
                        str10 = str26;
                        str13 = str27;
                        str27 = str13;
                        num25 = num12;
                        num26 = num13;
                        str24 = str12;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 7:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str23);
                        i4 |= 128;
                        kSerializerArr = kSerializerArr2;
                        num8 = num21;
                        num12 = num25;
                        num13 = num26;
                        num11 = num27;
                        str12 = str24;
                        str10 = str26;
                        str13 = str27;
                        str27 = str13;
                        num25 = num12;
                        num26 = num13;
                        str24 = str12;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 8:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str22);
                        i4 |= 256;
                        kSerializerArr = kSerializerArr2;
                        num8 = num21;
                        num12 = num25;
                        num13 = num26;
                        num11 = num27;
                        str12 = str24;
                        str10 = str26;
                        str13 = str27;
                        str27 = str13;
                        num25 = num12;
                        num26 = num13;
                        str24 = str12;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 9:
                        i4 |= 512;
                        kSerializerArr = kSerializerArr2;
                        num8 = num21;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kSerializerArr2[i2], list5);
                        num12 = num25;
                        num13 = num26;
                        num11 = num27;
                        str12 = str24;
                        str10 = str26;
                        str13 = str27;
                        str27 = str13;
                        num25 = num12;
                        num26 = num13;
                        str24 = str12;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 10:
                        num23 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, num23);
                        i4 |= 1024;
                        kSerializerArr = kSerializerArr2;
                        num8 = num21;
                        num12 = num25;
                        num13 = num26;
                        num11 = num27;
                        str12 = str24;
                        str10 = str26;
                        str13 = str27;
                        str27 = str13;
                        num25 = num12;
                        num26 = num13;
                        str24 = str12;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 11:
                        i4 |= 2048;
                        kSerializerArr = kSerializerArr2;
                        num8 = num21;
                        num24 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, num24);
                        num12 = num25;
                        num13 = num26;
                        num11 = num27;
                        str12 = str24;
                        str10 = str26;
                        str13 = str27;
                        str27 = str13;
                        num25 = num12;
                        num26 = num13;
                        str24 = str12;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 12:
                        num22 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, num22);
                        i4 |= 4096;
                        kSerializerArr = kSerializerArr2;
                        num8 = num21;
                        num12 = num25;
                        num13 = num26;
                        num11 = num27;
                        str12 = str24;
                        str10 = str26;
                        str13 = str27;
                        str27 = str13;
                        num25 = num12;
                        num26 = num13;
                        str24 = str12;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 13:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str21);
                        i4 |= 8192;
                        kSerializerArr = kSerializerArr2;
                        num8 = num21;
                        num12 = num25;
                        num13 = num26;
                        num11 = num27;
                        str12 = str24;
                        str10 = str26;
                        str13 = str27;
                        str27 = str13;
                        num25 = num12;
                        num26 = num13;
                        str24 = str12;
                        num27 = num11;
                        str26 = str10;
                        num21 = num8;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 9;
                        i3 = 15;
                        break;
                    case 14:
                        num21 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, num21);
                        i4 |= 16384;
                        i3 = 15;
                        break;
                    case 15:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kSerializerArr2[i3], list3);
                        i4 |= 32768;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Integer num28 = num25;
            Integer num29 = num26;
            Integer num30 = num27;
            String str28 = str24;
            String str29 = str25;
            str = str21;
            num = num22;
            list = list3;
            num2 = num23;
            list2 = list5;
            num3 = num24;
            str2 = str28;
            str3 = str27;
            num4 = num30;
            str4 = str26;
            num5 = num21;
            str5 = str29;
            num6 = num28;
            num7 = num29;
            str6 = str22;
            i = i4;
            str7 = str23;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UTXOAddressInfoReq(i, str5, str2, str3, num4, str4, num7, num6, str7, str6, list2, num2, num3, num, str, num5, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UTXOAddressInfoReq uTXOAddressInfoReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(uTXOAddressInfoReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UTXOAddressInfoReq.write$Self$OKWallet_wallet_impl(uTXOAddressInfoReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
