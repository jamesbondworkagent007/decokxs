package com.okinc.ok_kyc_core.data.remote.networkmodel;

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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class InputCardChoices$$serializer implements GeneratedSerializer<InputCardChoices> {
    public static final int $stable;
    public static final InputCardChoices$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputCardChoices$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputCardChoices$$serializer inputCardChoices$$serializer = new InputCardChoices$$serializer();
        INSTANCE = inputCardChoices$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("input-card-choice", inputCardChoices$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("valueName", true);
        pluginGeneratedSerialDescriptor.addElement("choices", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(CardChoicesData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputCardChoices deserialize(@NotNull Decoder decoder) {
        CardChoicesData cardChoicesData;
        int i;
        String str;
        String str2;
        Float f;
        Float f2;
        Boolean bool;
        String str3;
        String str4;
        String str5;
        Boolean bool2;
        String str6;
        String str7;
        String str8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        Float f3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            CardChoicesData cardChoicesData2 = (CardChoicesData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CardChoicesData$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            f = f4;
            str2 = str12;
            bool = bool4;
            str4 = str11;
            str = str13;
            bool2 = bool3;
            i = 2047;
            str3 = strDecodeStringElement;
            str6 = str10;
            str5 = str9;
            cardChoicesData = cardChoicesData2;
        } else {
            int i6 = 0;
            boolean z = true;
            String str14 = null;
            String str15 = null;
            Float f5 = null;
            Boolean bool5 = null;
            cardChoicesData = null;
            Boolean bool6 = null;
            String str16 = null;
            String str17 = null;
            String strDecodeStringElement2 = null;
            String str18 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str7 = str16;
                        str8 = str18;
                        z = false;
                        str18 = str8;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 0:
                        str7 = str16;
                        str8 = str18;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        str18 = str8;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 1:
                        str7 = str16;
                        str8 = str18;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str17);
                        i6 |= 2;
                        str18 = str8;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 2:
                        str8 = str18;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str16);
                        i6 |= 4;
                        str18 = str8;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 3:
                        str8 = str18;
                        cardChoicesData = (CardChoicesData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CardChoicesData$$serializer.INSTANCE, cardChoicesData);
                        i6 |= 8;
                        str7 = str16;
                        str18 = str8;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 4:
                        str8 = str18;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool5);
                        i6 |= 16;
                        str7 = str16;
                        str18 = str8;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 5:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str18);
                        i6 |= 32;
                        str7 = str16;
                        str18 = str8;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 6:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool6);
                        i6 |= 64;
                        str7 = str16;
                        str8 = str18;
                        str18 = str8;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 7:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str15);
                        i6 |= 128;
                        str7 = str16;
                        str8 = str18;
                        str18 = str8;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 8:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str14);
                        i6 |= 256;
                        str7 = str16;
                        str8 = str18;
                        str18 = str8;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 9:
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f5);
                        i6 |= 512;
                        break;
                    case 10:
                        i6 |= 1024;
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f3);
                        str7 = str16;
                        str8 = str18;
                        str18 = str8;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str19 = str16;
            String str20 = str17;
            i = i6;
            str = str14;
            str2 = str15;
            f = f5;
            f2 = f3;
            bool = bool6;
            str3 = strDecodeStringElement2;
            str4 = str18;
            str5 = str20;
            bool2 = bool5;
            str6 = str19;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputCardChoices(i, str3, str5, str6, cardChoicesData, bool2, str4, bool, str2, str, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardChoices.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardChoices, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputCardChoices inputCardChoices) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputCardChoices, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputCardChoices.write$Self$OKCompliance_ok_compliance_impl(inputCardChoices, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
