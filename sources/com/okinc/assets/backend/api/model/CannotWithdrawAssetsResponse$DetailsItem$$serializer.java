package com.okinc.assets.backend.api.model;

import com.okinc.assets.backend.api.model.CannotWithdrawAssetsResponse;
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

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class CannotWithdrawAssetsResponse$DetailsItem$$serializer implements GeneratedSerializer<CannotWithdrawAssetsResponse.DetailsItem> {
    public static final int $stable;
    public static final CannotWithdrawAssetsResponse$DetailsItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CannotWithdrawAssetsResponse$DetailsItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CannotWithdrawAssetsResponse$DetailsItem$$serializer cannotWithdrawAssetsResponse$DetailsItem$$serializer = new CannotWithdrawAssetsResponse$DetailsItem$$serializer();
        INSTANCE = cannotWithdrawAssetsResponse$DetailsItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.assets.backend.api.model.CannotWithdrawAssetsResponse.DetailsItem", cannotWithdrawAssetsResponse$DetailsItem$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("amountStr", true);
        pluginGeneratedSerialDescriptor.addElement("amountValuation", true);
        pluginGeneratedSerialDescriptor.addElement("confirmations", true);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement("depositTime", true);
        pluginGeneratedSerialDescriptor.addElement("remainingAmountValuation", true);
        pluginGeneratedSerialDescriptor.addElement("timestamp", true);
        pluginGeneratedSerialDescriptor.addElement("cryptoWithdrawExpireTime", true);
        pluginGeneratedSerialDescriptor.addElement("totalLimitAmountValuation", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("category", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(intSerializer);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CannotWithdrawAssetsResponse.DetailsItem deserialize(@NotNull Decoder decoder) {
        String str;
        Long l;
        String str2;
        Long l2;
        Integer num;
        Integer num2;
        String str3;
        int i;
        Long l3;
        Integer num3;
        String str4;
        Integer num4;
        String str5;
        String str6;
        Integer num5;
        String str7;
        String str8;
        String str9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        int i3 = 7;
        int i4 = 8;
        Integer num6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, intSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, longSerializer, null);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            Integer num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, intSerializer, null);
            str2 = str14;
            num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            l2 = l6;
            num = num8;
            l = l5;
            str3 = str13;
            l3 = l4;
            str5 = str12;
            i = 4095;
            str = str10;
            num4 = num7;
            str4 = str11;
        } else {
            int i5 = 11;
            int i6 = 0;
            boolean z = true;
            Long l7 = null;
            Long l8 = null;
            String str15 = null;
            Long l9 = null;
            Integer num9 = null;
            Integer num10 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            Integer num11 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 11;
                        i2 = 9;
                        i3 = 7;
                        str19 = str19;
                        i4 = 8;
                        break;
                    case 0:
                        str6 = str17;
                        num5 = num11;
                        String str20 = str19;
                        str7 = str18;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str20);
                        i6 |= 1;
                        num11 = num5;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 1:
                        str9 = str18;
                        num5 = num11;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str17);
                        i6 |= 2;
                        str8 = str19;
                        str7 = str9;
                        num11 = num5;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 2:
                        str9 = str18;
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num11);
                        i6 |= 4;
                        str6 = str17;
                        str8 = str19;
                        str7 = str9;
                        num11 = num5;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 3:
                        str9 = str18;
                        i6 |= 8;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str16);
                        str6 = str17;
                        str8 = str19;
                        num5 = num11;
                        str7 = str9;
                        num11 = num5;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 4:
                        str9 = str18;
                        i6 |= 16;
                        num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num10);
                        str6 = str17;
                        str8 = str19;
                        num5 = num11;
                        str7 = str9;
                        num11 = num5;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 5:
                        str9 = str18;
                        l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l7);
                        i6 |= 32;
                        str6 = str17;
                        str8 = str19;
                        num5 = num11;
                        str7 = str9;
                        num11 = num5;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 6:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str18);
                        i6 |= 64;
                        str6 = str17;
                        str8 = str19;
                        num5 = num11;
                        str7 = str9;
                        num11 = num5;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 7:
                        i6 |= 128;
                        l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, LongSerializer.INSTANCE, l8);
                        str6 = str17;
                        str8 = str19;
                        num5 = num11;
                        str7 = str18;
                        num11 = num5;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 8:
                        i6 |= 256;
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, LongSerializer.INSTANCE, l9);
                        str6 = str17;
                        str8 = str19;
                        num5 = num11;
                        str7 = str18;
                        num11 = num5;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 9:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str15);
                        i6 |= 512;
                        i5 = 11;
                        break;
                    case 10:
                        i6 |= 1024;
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, num9);
                        str6 = str17;
                        str8 = str19;
                        num5 = num11;
                        str7 = str18;
                        num11 = num5;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 11:
                        i6 |= 2048;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, IntSerializer.INSTANCE, num6);
                        str6 = str17;
                        str8 = str19;
                        num5 = num11;
                        str7 = str18;
                        num11 = num5;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        str19 = str8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str21 = str17;
            str = str19;
            l = l8;
            str2 = str15;
            l2 = l9;
            num = num9;
            num2 = num6;
            str3 = str18;
            i = i6;
            l3 = l7;
            num3 = num11;
            str4 = str21;
            String str22 = str16;
            num4 = num10;
            str5 = str22;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CannotWithdrawAssetsResponse.DetailsItem(i, str, str4, num3, str5, num4, l3, str3, l, l2, str2, num, num2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CannotWithdrawAssetsResponse.DetailsItem detailsItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(detailsItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CannotWithdrawAssetsResponse.DetailsItem.write$Self$OKAssets_assets_pro_api(detailsItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
