package com.okinc.okpaymentapi.data.remote.model.management;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class EarnOption$$serializer implements GeneratedSerializer<EarnOption> {
    public static final int $stable;
    public static final EarnOption$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EarnOption$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EarnOption$$serializer earnOption$$serializer = new EarnOption$$serializer();
        INSTANCE = earnOption$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okpaymentapi.data.remote.model.management.EarnOption", earnOption$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement("productTypeId", true);
        pluginGeneratedSerialDescriptor.addElement("productTypeName", true);
        pluginGeneratedSerialDescriptor.addElement("savingTypeId", true);
        pluginGeneratedSerialDescriptor.addElement("savingTypeName", true);
        pluginGeneratedSerialDescriptor.addElement("eligibleAmountMax", true);
        pluginGeneratedSerialDescriptor.addElement("eligibleAmountMin", true);
        pluginGeneratedSerialDescriptor.addElement("earnMaxUnlimited", true);
        pluginGeneratedSerialDescriptor.addElement("toggle", true);
        pluginGeneratedSerialDescriptor.addElement("autoEarnEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("earnRate", true);
        pluginGeneratedSerialDescriptor.addElement("localizedText", true);
        pluginGeneratedSerialDescriptor.addElement("earnAgreementContext", true);
        pluginGeneratedSerialDescriptor.addElement("rewardType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(longSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(doubleSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(doubleSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LocalizedText$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EarnOption deserialize(@NotNull Decoder decoder) {
        Long l;
        Boolean bool;
        Double d;
        Boolean bool2;
        Boolean bool3;
        LocalizedText localizedText;
        Integer num;
        String str;
        String str2;
        String str3;
        Long l2;
        Long l3;
        Double d2;
        int i;
        String str4;
        String str5;
        Boolean bool4;
        Double d3;
        String str6;
        String str7;
        String str8;
        Boolean bool5;
        Double d4;
        String str9;
        Long l4;
        Long l5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        String str10 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, longSerializer, null);
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            Long l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
            Double d5 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, doubleSerializer, null);
            Double d6 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, doubleSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            l2 = l8;
            LocalizedText localizedText2 = (LocalizedText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, LocalizedText$$serializer.INSTANCE, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            localizedText = localizedText2;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, null);
            str4 = str14;
            str3 = str13;
            bool3 = bool8;
            bool = bool6;
            d2 = d6;
            d = d5;
            str = str12;
            bool2 = bool7;
            str2 = str11;
            l3 = l6;
            l = l7;
            i = 16383;
        } else {
            int i4 = 13;
            int i5 = 0;
            boolean z = true;
            Long l9 = null;
            String str15 = null;
            Double d7 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            String str16 = null;
            LocalizedText localizedText3 = null;
            Integer num2 = null;
            Boolean bool11 = null;
            Double d8 = null;
            String str17 = null;
            Long l10 = null;
            Long l11 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str7 = str15;
                        str8 = str10;
                        bool5 = bool11;
                        d4 = d8;
                        str9 = str17;
                        l4 = l10;
                        l5 = l9;
                        z = false;
                        bool11 = bool5;
                        d8 = d4;
                        str17 = str9;
                        str15 = str7;
                        l9 = l5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        l10 = l4;
                        str10 = str8;
                        break;
                    case 0:
                        str8 = str10;
                        bool5 = bool11;
                        d4 = d8;
                        str9 = str17;
                        l4 = l10;
                        l5 = l9;
                        str7 = str15;
                        l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l11);
                        i5 |= 1;
                        bool11 = bool5;
                        d8 = d4;
                        str17 = str9;
                        str15 = str7;
                        l9 = l5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        l10 = l4;
                        str10 = str8;
                        break;
                    case 1:
                        str8 = str10;
                        bool5 = bool11;
                        d4 = d8;
                        str9 = str17;
                        Long l12 = l10;
                        l5 = l9;
                        l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l12);
                        i5 |= 2;
                        str7 = str15;
                        bool11 = bool5;
                        d8 = d4;
                        str17 = str9;
                        str15 = str7;
                        l9 = l5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        l10 = l4;
                        str10 = str8;
                        break;
                    case 2:
                        str5 = str10;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str15);
                        i5 |= 4;
                        str10 = str5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        break;
                    case 3:
                        str5 = str10;
                        bool4 = bool11;
                        d3 = d8;
                        str6 = str17;
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, l9);
                        i5 |= 8;
                        bool11 = bool4;
                        d8 = d3;
                        str17 = str6;
                        str10 = str5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        break;
                    case 4:
                        bool4 = bool11;
                        d3 = d8;
                        str5 = str10;
                        i5 |= 16;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str17);
                        bool11 = bool4;
                        d8 = d3;
                        str17 = str6;
                        str10 = str5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        break;
                    case 5:
                        bool4 = bool11;
                        d3 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, DoubleSerializer.INSTANCE, d8);
                        i5 |= 32;
                        str5 = str10;
                        str6 = str17;
                        bool11 = bool4;
                        d8 = d3;
                        str17 = str6;
                        str10 = str5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        break;
                    case 6:
                        bool4 = bool11;
                        d7 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, DoubleSerializer.INSTANCE, d7);
                        i5 |= 64;
                        str5 = str10;
                        d3 = d8;
                        str6 = str17;
                        bool11 = bool4;
                        d8 = d3;
                        str17 = str6;
                        str10 = str5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        break;
                    case 7:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool11);
                        i5 |= 128;
                        str5 = str10;
                        d3 = d8;
                        str6 = str17;
                        bool11 = bool4;
                        d8 = d3;
                        str17 = str6;
                        str10 = str5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        break;
                    case 8:
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool9);
                        i5 |= 256;
                        str5 = str10;
                        bool4 = bool11;
                        d3 = d8;
                        str6 = str17;
                        bool11 = bool4;
                        d8 = d3;
                        str17 = str6;
                        str10 = str5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        break;
                    case 9:
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.INSTANCE, bool10);
                        i5 |= 512;
                        str5 = str10;
                        bool4 = bool11;
                        d3 = d8;
                        str6 = str17;
                        bool11 = bool4;
                        d8 = d3;
                        str17 = str6;
                        str10 = str5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        break;
                    case 10:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str10);
                        i5 |= 1024;
                        str5 = str10;
                        bool4 = bool11;
                        d3 = d8;
                        str6 = str17;
                        bool11 = bool4;
                        d8 = d3;
                        str17 = str6;
                        str10 = str5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        break;
                    case 11:
                        i5 |= 2048;
                        str5 = str10;
                        localizedText3 = (LocalizedText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, LocalizedText$$serializer.INSTANCE, localizedText3);
                        bool4 = bool11;
                        d3 = d8;
                        str6 = str17;
                        bool11 = bool4;
                        d8 = d3;
                        str17 = str6;
                        str10 = str5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        break;
                    case 12:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str16);
                        i5 |= 4096;
                        str5 = str10;
                        bool4 = bool11;
                        d3 = d8;
                        str6 = str17;
                        bool11 = bool4;
                        d8 = d3;
                        str17 = str6;
                        str10 = str5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        break;
                    case 13:
                        i5 |= 8192;
                        str5 = str10;
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, IntSerializer.INSTANCE, num2);
                        bool4 = bool11;
                        d3 = d8;
                        str6 = str17;
                        bool11 = bool4;
                        d8 = d3;
                        str17 = str6;
                        str10 = str5;
                        i2 = 10;
                        i3 = 9;
                        i4 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str18 = str10;
            String str19 = str17;
            Long l13 = l10;
            Long l14 = l9;
            Long l15 = l11;
            l = l13;
            bool = bool11;
            d = d8;
            bool2 = bool9;
            bool3 = bool10;
            localizedText = localizedText3;
            num = num2;
            str = str19;
            str2 = str15;
            str3 = str18;
            l2 = l14;
            l3 = l15;
            d2 = d7;
            i = i5;
            str4 = str16;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EarnOption(i, l3, l, str2, l2, str, d, d2, bool, bool2, bool3, str3, localizedText, str4, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EarnOption earnOption) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(earnOption, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EarnOption.write$Self$OKPayments_ok_payment_api(earnOption, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
