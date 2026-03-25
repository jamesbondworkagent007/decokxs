package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class AddressTokenAsset$$serializer implements GeneratedSerializer<AddressTokenAsset> {
    public static final int $stable;
    public static final AddressTokenAsset$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AddressTokenAsset$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AddressTokenAsset$$serializer addressTokenAsset$$serializer = new AddressTokenAsset$$serializer();
        INSTANCE = addressTokenAsset$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.AddressTokenAsset", addressTokenAsset$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("coinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("coinAmountOrigin", true);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("symbol", true);
        pluginGeneratedSerialDescriptor.addElement("subBalanceType", true);
        pluginGeneratedSerialDescriptor.addElement("rank", true);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("voucherToken", true);
        pluginGeneratedSerialDescriptor.addElement("default", true);
        pluginGeneratedSerialDescriptor.addElement("coinBalanceDetails", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = AddressTokenAsset.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[10])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AddressTokenAsset deserialize(@NotNull Decoder decoder) {
        List list;
        String str;
        Boolean bool;
        String str2;
        Boolean bool2;
        int i;
        Integer num;
        String str3;
        String str4;
        String str5;
        String str6;
        Integer num2;
        Integer num3;
        Integer num4;
        KSerializer[] kSerializerArr;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = AddressTokenAsset.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 8;
        Boolean bool3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, intSerializer, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, intSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr2[10], null);
            str = str12;
            bool2 = bool5;
            str3 = str11;
            str6 = str10;
            bool = bool4;
            str5 = str8;
            i = 2047;
            num2 = num5;
            str4 = str9;
            num = num6;
        } else {
            int i5 = 10;
            int i6 = 0;
            boolean z = true;
            List list2 = null;
            String str13 = null;
            String str14 = null;
            Boolean bool6 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            Integer num7 = null;
            String str18 = null;
            Integer num8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 10;
                        kSerializerArr2 = kSerializerArr2;
                        break;
                    case 0:
                        num3 = num7;
                        num4 = num8;
                        kSerializerArr = kSerializerArr2;
                        i6 |= 1;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str18);
                        str7 = str17;
                        kSerializerArr2 = kSerializerArr;
                        num8 = num4;
                        num7 = num3;
                        str17 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 10;
                        break;
                    case 1:
                        num3 = num7;
                        num4 = num8;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str17);
                        i6 |= 2;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        num8 = num4;
                        num7 = num3;
                        str17 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 10;
                        break;
                    case 2:
                        num3 = num7;
                        num4 = num8;
                        i6 |= 4;
                        kSerializerArr = kSerializerArr2;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str16);
                        str7 = str17;
                        kSerializerArr2 = kSerializerArr;
                        num8 = num4;
                        num7 = num3;
                        str17 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 10;
                        break;
                    case 3:
                        num3 = num7;
                        num4 = num8;
                        i6 |= 8;
                        kSerializerArr = kSerializerArr2;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str15);
                        str7 = str17;
                        kSerializerArr2 = kSerializerArr;
                        num8 = num4;
                        num7 = num3;
                        str17 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 10;
                        break;
                    case 4:
                        num4 = num8;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num7);
                        i6 |= 16;
                        kSerializerArr = kSerializerArr2;
                        str7 = str17;
                        kSerializerArr2 = kSerializerArr;
                        num8 = num4;
                        num7 = num3;
                        str17 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 10;
                        break;
                    case 5:
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num8);
                        i6 |= 32;
                        kSerializerArr = kSerializerArr2;
                        str7 = str17;
                        num3 = num7;
                        kSerializerArr2 = kSerializerArr;
                        num8 = num4;
                        num7 = num3;
                        str17 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 10;
                        break;
                    case 6:
                        i6 |= 64;
                        kSerializerArr = kSerializerArr2;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str14);
                        str7 = str17;
                        num3 = num7;
                        num4 = num8;
                        kSerializerArr2 = kSerializerArr;
                        num8 = num4;
                        num7 = num3;
                        str17 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 10;
                        break;
                    case 7:
                        i6 |= 128;
                        kSerializerArr = kSerializerArr2;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str13);
                        str7 = str17;
                        num3 = num7;
                        num4 = num8;
                        kSerializerArr2 = kSerializerArr;
                        num8 = num4;
                        num7 = num3;
                        str17 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 10;
                        break;
                    case 8:
                        i6 |= 256;
                        kSerializerArr = kSerializerArr2;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool6);
                        str7 = str17;
                        num3 = num7;
                        num4 = num8;
                        kSerializerArr2 = kSerializerArr;
                        num8 = num4;
                        num7 = num3;
                        str17 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 10;
                        break;
                    case 9:
                        i6 |= 512;
                        kSerializerArr = kSerializerArr2;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool3);
                        str7 = str17;
                        num3 = num7;
                        num4 = num8;
                        kSerializerArr2 = kSerializerArr;
                        num8 = num4;
                        num7 = num3;
                        str17 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        i5 = 10;
                        break;
                    case 10:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr2[i5], list2);
                        i6 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str19 = str17;
            list = list2;
            str = str13;
            bool = bool6;
            str2 = str16;
            bool2 = bool3;
            i = i6;
            num = num8;
            str3 = str14;
            str4 = str19;
            str5 = str18;
            str6 = str15;
            num2 = num7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AddressTokenAsset(i, str5, str4, str2, str6, num2, num, str3, str, bool, bool2, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AddressTokenAsset addressTokenAsset) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(addressTokenAsset, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AddressTokenAsset.write$Self$OKWallet_wallet_impl(addressTokenAsset, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
