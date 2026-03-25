package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestValidatorListItems$$serializer implements GeneratedSerializer<InvestValidatorListItems> {
    public static final int $stable;
    public static final InvestValidatorListItems$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestValidatorListItems$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestValidatorListItems$$serializer investValidatorListItems$$serializer = new InvestValidatorListItems$$serializer();
        INSTANCE = investValidatorListItems$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestValidatorListItems", investValidatorListItems$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("investmentId", true);
        pluginGeneratedSerialDescriptor.addElement("rate", true);
        pluginGeneratedSerialDescriptor.addElement("rateType", true);
        pluginGeneratedSerialDescriptor.addElement("stakedAmount", true);
        pluginGeneratedSerialDescriptor.addElement("tvl", true);
        pluginGeneratedSerialDescriptor.addElement("validatorName", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("providerPubkey", true);
        pluginGeneratedSerialDescriptor.addElement("commission", true);
        pluginGeneratedSerialDescriptor.addElement("totalDelegations", true);
        pluginGeneratedSerialDescriptor.addElement("recommended", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestValidatorListItems deserialize(@NotNull Decoder decoder) {
        Integer num;
        boolean zDecodeBooleanElement;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        String str7;
        String str8;
        Long l;
        String str9;
        String str10;
        String str11;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            str4 = str19;
            str = str17;
            str2 = str16;
            str6 = str15;
            str3 = str18;
            str7 = str14;
            i = 2047;
            l = l2;
            num = num2;
            str8 = str12;
            str5 = str13;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z = true;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            Long l3 = null;
            String str26 = null;
            String str27 = null;
            num = null;
            int i7 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str25;
                        str10 = str26;
                        str11 = str27;
                        z = false;
                        str27 = str11;
                        str26 = str10;
                        str25 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 0:
                        str9 = str25;
                        str10 = str26;
                        str11 = str27;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l3);
                        i7 |= 1;
                        str27 = str11;
                        str26 = str10;
                        str25 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 1:
                        str10 = str26;
                        str11 = str27;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str25);
                        i7 |= 2;
                        str27 = str11;
                        str26 = str10;
                        str25 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 2:
                        str10 = str26;
                        str11 = str27;
                        num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num);
                        i7 |= 4;
                        str9 = str25;
                        str27 = str11;
                        str26 = str10;
                        str25 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 3:
                        str10 = str26;
                        str11 = str27;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str24);
                        i7 |= 8;
                        str9 = str25;
                        str27 = str11;
                        str26 = str10;
                        str25 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 4:
                        str11 = str27;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str26);
                        i7 |= 16;
                        str9 = str25;
                        str10 = str26;
                        str27 = str11;
                        str26 = str10;
                        str25 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 5:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str27);
                        i7 |= 32;
                        str9 = str25;
                        str10 = str26;
                        str27 = str11;
                        str26 = str10;
                        str25 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 6:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str21);
                        i7 |= 64;
                        str9 = str25;
                        str10 = str26;
                        str11 = str27;
                        str27 = str11;
                        str26 = str10;
                        str25 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 7:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str20);
                        i7 |= 128;
                        str9 = str25;
                        str10 = str26;
                        str11 = str27;
                        str27 = str11;
                        str26 = str10;
                        str25 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 8:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str22);
                        i7 |= 256;
                        str9 = str25;
                        str10 = str26;
                        str11 = str27;
                        str27 = str11;
                        str26 = str10;
                        str25 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 9:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str23);
                        i7 |= 512;
                        break;
                    case 10:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i7 |= 1024;
                        str9 = str25;
                        str10 = str26;
                        str11 = str27;
                        str27 = str11;
                        str26 = str10;
                        str25 = str9;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str28 = str25;
            Long l4 = l3;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str = str20;
            str2 = str21;
            str3 = str22;
            str4 = str23;
            i = i7;
            str5 = str24;
            str6 = str27;
            str7 = str26;
            str8 = str28;
            l = l4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestValidatorListItems(i, l, str8, num, str5, str7, str6, str2, str, str3, str4, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestValidatorListItems investValidatorListItems) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investValidatorListItems, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestValidatorListItems.write$Self$OKDeFi_invest_biz(investValidatorListItems, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
