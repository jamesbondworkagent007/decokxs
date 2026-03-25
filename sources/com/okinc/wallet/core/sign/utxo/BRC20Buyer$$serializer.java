package com.okinc.wallet.core.sign.utxo;

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

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class BRC20Buyer$$serializer implements GeneratedSerializer<BRC20Buyer> {
    public static final int $stable;
    public static final BRC20Buyer$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BRC20Buyer$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BRC20Buyer$$serializer bRC20Buyer$$serializer = new BRC20Buyer$$serializer();
        INSTANCE = bRC20Buyer$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.core.sign.utxo.BRC20Buyer", bRC20Buyer$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("fee", true);
        pluginGeneratedSerialDescriptor.addElement("feeRate", true);
        pluginGeneratedSerialDescriptor.addElement("dummyOutAmount", true);
        pluginGeneratedSerialDescriptor.addElement("minOutput", true);
        pluginGeneratedSerialDescriptor.addElement("dustLimit", true);
        pluginGeneratedSerialDescriptor.addElement("sellerData", true);
        pluginGeneratedSerialDescriptor.addElement("changeAddress", true);
        pluginGeneratedSerialDescriptor.addElement("dummyOutAddress", true);
        pluginGeneratedSerialDescriptor.addElement("nftReceiverAddress", true);
        pluginGeneratedSerialDescriptor.addElement("dummyTxIn", true);
        pluginGeneratedSerialDescriptor.addElement("paymentTxIn", true);
        pluginGeneratedSerialDescriptor.addElement("nftTxIn", true);
        pluginGeneratedSerialDescriptor.addElement("signatureList", true);
        pluginGeneratedSerialDescriptor.addElement("psbtTx", true);
        pluginGeneratedSerialDescriptor.addElement("batchSize", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = BRC20Buyer.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[5]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[9]), BuiltinSerializersKt.getNullable(kSerializerArr[10]), BuiltinSerializersKt.getNullable(kSerializerArr[11]), BuiltinSerializersKt.getNullable(kSerializerArr[12]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BRC20Buyer deserialize(@NotNull Decoder decoder) {
        String str;
        List list;
        String str2;
        int i;
        List list2;
        String str3;
        Integer num;
        String str4;
        List list3;
        List list4;
        String str5;
        String str6;
        String str7;
        String str8;
        List list5;
        String str9;
        String str10;
        KSerializer[] kSerializerArr;
        String str11;
        List list6;
        List list7;
        String str12;
        String str13;
        String str14;
        KSerializer[] kSerializerArr2;
        String str15;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = BRC20Buyer.$childSerializers;
        Integer num2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            List list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr3[5], null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            List list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr3[9], null);
            List list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr3[10], null);
            List list11 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr3[11], null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr3[12], null);
            str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            list5 = list11;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, null);
            str6 = str22;
            str4 = str21;
            str3 = str19;
            str9 = str23;
            str2 = str20;
            str7 = str18;
            i = 32767;
            list = list9;
            list3 = list10;
            list4 = list8;
            str5 = str17;
            str = str16;
        } else {
            int i2 = 14;
            int i3 = 0;
            boolean z = true;
            List list12 = null;
            List list13 = null;
            String str24 = null;
            List list14 = null;
            String str25 = null;
            List list15 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            List list16 = null;
            String str31 = null;
            String str32 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list6 = list12;
                        list7 = list13;
                        str12 = str29;
                        str13 = str30;
                        str14 = str32;
                        kSerializerArr2 = kSerializerArr3;
                        str15 = str31;
                        z = false;
                        str29 = str12;
                        list13 = list7;
                        kSerializerArr3 = kSerializerArr2;
                        str31 = str15;
                        i2 = 14;
                        str32 = str14;
                        str30 = str13;
                        list12 = list6;
                        break;
                    case 0:
                        list6 = list12;
                        list7 = list13;
                        str12 = str29;
                        str13 = str30;
                        kSerializerArr2 = kSerializerArr3;
                        String str33 = str32;
                        str15 = str31;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str33);
                        i3 |= 1;
                        str29 = str12;
                        list13 = list7;
                        kSerializerArr3 = kSerializerArr2;
                        str31 = str15;
                        i2 = 14;
                        str32 = str14;
                        str30 = str13;
                        list12 = list6;
                        break;
                    case 1:
                        list6 = list12;
                        list7 = list13;
                        str12 = str29;
                        String str34 = str30;
                        kSerializerArr2 = kSerializerArr3;
                        str13 = str34;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str31);
                        i3 |= 2;
                        str14 = str32;
                        str15 = str31;
                        str29 = str12;
                        list13 = list7;
                        kSerializerArr3 = kSerializerArr2;
                        str31 = str15;
                        i2 = 14;
                        str32 = str14;
                        str30 = str13;
                        list12 = list6;
                        break;
                    case 2:
                        list6 = list12;
                        list7 = list13;
                        str12 = str29;
                        String str35 = str30;
                        kSerializerArr2 = kSerializerArr3;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str27);
                        str13 = str35;
                        i3 |= 4;
                        str14 = str32;
                        str15 = str31;
                        str29 = str12;
                        list13 = list7;
                        kSerializerArr3 = kSerializerArr2;
                        str31 = str15;
                        i2 = 14;
                        str32 = str14;
                        str30 = str13;
                        list12 = list6;
                        break;
                    case 3:
                        list6 = list12;
                        list7 = list13;
                        str12 = str29;
                        String str36 = str30;
                        kSerializerArr2 = kSerializerArr3;
                        i3 |= 8;
                        str13 = str36;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str26);
                        str14 = str32;
                        str15 = str31;
                        str29 = str12;
                        list13 = list7;
                        kSerializerArr3 = kSerializerArr2;
                        str31 = str15;
                        i2 = 14;
                        str32 = str14;
                        str30 = str13;
                        list12 = list6;
                        break;
                    case 4:
                        list6 = list12;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str25);
                        i3 |= 16;
                        list13 = list13;
                        kSerializerArr3 = kSerializerArr3;
                        i2 = 14;
                        str30 = str30;
                        list12 = list6;
                        break;
                    case 5:
                        List list17 = list12;
                        str10 = str29;
                        String str37 = str30;
                        kSerializerArr = kSerializerArr3;
                        list16 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr3[5], list16);
                        str11 = str37;
                        i3 |= 32;
                        list13 = list13;
                        list12 = list17;
                        str29 = str10;
                        i2 = 14;
                        KSerializer[] kSerializerArr4 = kSerializerArr;
                        str30 = str11;
                        kSerializerArr3 = kSerializerArr4;
                        break;
                    case 6:
                        List list18 = list12;
                        str10 = str29;
                        String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str30);
                        i3 |= 64;
                        kSerializerArr = kSerializerArr3;
                        str11 = str38;
                        list13 = list13;
                        list12 = list18;
                        str29 = str10;
                        i2 = 14;
                        KSerializer[] kSerializerArr42 = kSerializerArr;
                        str30 = str11;
                        kSerializerArr3 = kSerializerArr42;
                        break;
                    case 7:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str29);
                        i3 |= 128;
                        list12 = list12;
                        String str39 = str30;
                        kSerializerArr = kSerializerArr3;
                        str11 = str39;
                        str29 = str10;
                        i2 = 14;
                        KSerializer[] kSerializerArr422 = kSerializerArr;
                        str30 = str11;
                        kSerializerArr3 = kSerializerArr422;
                        break;
                    case 8:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str24);
                        i3 |= 256;
                        str10 = str29;
                        String str392 = str30;
                        kSerializerArr = kSerializerArr3;
                        str11 = str392;
                        str29 = str10;
                        i2 = 14;
                        KSerializer[] kSerializerArr4222 = kSerializerArr;
                        str30 = str11;
                        kSerializerArr3 = kSerializerArr4222;
                        break;
                    case 9:
                        list14 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr3[9], list14);
                        i3 |= 512;
                        str10 = str29;
                        String str3922 = str30;
                        kSerializerArr = kSerializerArr3;
                        str11 = str3922;
                        str29 = str10;
                        i2 = 14;
                        KSerializer[] kSerializerArr42222 = kSerializerArr;
                        str30 = str11;
                        kSerializerArr3 = kSerializerArr42222;
                        break;
                    case 10:
                        list13 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr3[10], list13);
                        i3 |= 1024;
                        str10 = str29;
                        String str39222 = str30;
                        kSerializerArr = kSerializerArr3;
                        str11 = str39222;
                        str29 = str10;
                        i2 = 14;
                        KSerializer[] kSerializerArr422222 = kSerializerArr;
                        str30 = str11;
                        kSerializerArr3 = kSerializerArr422222;
                        break;
                    case 11:
                        list12 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr3[11], list12);
                        i3 |= 2048;
                        str10 = str29;
                        String str392222 = str30;
                        kSerializerArr = kSerializerArr3;
                        str11 = str392222;
                        str29 = str10;
                        i2 = 14;
                        KSerializer[] kSerializerArr4222222 = kSerializerArr;
                        str30 = str11;
                        kSerializerArr3 = kSerializerArr4222222;
                        break;
                    case 12:
                        i3 |= 4096;
                        list15 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr3[12], list15);
                        str10 = str29;
                        String str3922222 = str30;
                        kSerializerArr = kSerializerArr3;
                        str11 = str3922222;
                        str29 = str10;
                        i2 = 14;
                        KSerializer[] kSerializerArr42222222 = kSerializerArr;
                        str30 = str11;
                        kSerializerArr3 = kSerializerArr42222222;
                        break;
                    case 13:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str28);
                        i3 |= 8192;
                        str10 = str29;
                        String str39222222 = str30;
                        kSerializerArr = kSerializerArr3;
                        str11 = str39222222;
                        str29 = str10;
                        i2 = 14;
                        KSerializer[] kSerializerArr422222222 = kSerializerArr;
                        str30 = str11;
                        kSerializerArr3 = kSerializerArr422222222;
                        break;
                    case 14:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IntSerializer.INSTANCE, num2);
                        i3 |= 16384;
                        str10 = str29;
                        String str392222222 = str30;
                        kSerializerArr = kSerializerArr3;
                        str11 = str392222222;
                        str29 = str10;
                        i2 = 14;
                        KSerializer[] kSerializerArr4222222222 = kSerializerArr;
                        str30 = str11;
                        kSerializerArr3 = kSerializerArr4222222222;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list19 = list12;
            String str40 = str29;
            String str41 = str32;
            String str42 = str31;
            str = str41;
            list = list14;
            str2 = str25;
            i = i3;
            list2 = list15;
            str3 = str26;
            num = num2;
            str4 = str30;
            list3 = list13;
            list4 = list16;
            str5 = str42;
            str6 = str40;
            str7 = str27;
            str8 = str28;
            list5 = list19;
            str9 = str24;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BRC20Buyer(i, str, str5, str7, str3, str2, list4, str4, str6, str9, list, list3, list5, list2, str8, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BRC20Buyer bRC20Buyer) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bRC20Buyer, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BRC20Buyer.write$Self$OKWalletCore_wallet_lib(bRC20Buyer, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
