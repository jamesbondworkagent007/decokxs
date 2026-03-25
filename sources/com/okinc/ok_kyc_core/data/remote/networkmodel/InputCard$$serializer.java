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
public final /* synthetic */ class InputCard$$serializer implements GeneratedSerializer<InputCard> {
    public static final int $stable;
    public static final InputCard$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputCard$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputCard$$serializer inputCard$$serializer = new InputCard$$serializer();
        INSTANCE = inputCard$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("input-card", inputCard$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("valueName", true);
        pluginGeneratedSerialDescriptor.addElement("choices", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(Choices$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputCard deserialize(@NotNull Decoder decoder) {
        Choices choices;
        int i;
        Float f;
        String str;
        Float f2;
        Boolean bool;
        String str2;
        String str3;
        Boolean bool2;
        String str4;
        String str5;
        String str6;
        String str7;
        Boolean bool3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        Boolean bool4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            Choices choices2 = (Choices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Choices$$serializer.INSTANCE, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, null);
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            f2 = f4;
            str = str12;
            str2 = str11;
            bool2 = bool5;
            f = f3;
            str5 = str10;
            i = 2047;
            str3 = strDecodeStringElement;
            str6 = str9;
            str4 = str8;
            choices = choices2;
        } else {
            int i6 = 0;
            boolean z = true;
            Float f5 = null;
            String str13 = null;
            Float f6 = null;
            String str14 = null;
            choices = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String strDecodeStringElement2 = null;
            Boolean bool6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str7 = str16;
                        bool3 = bool6;
                        z = false;
                        bool6 = bool3;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 0:
                        str7 = str16;
                        bool3 = bool6;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        bool6 = bool3;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 1:
                        str7 = str16;
                        bool3 = bool6;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str17);
                        i6 |= 2;
                        bool6 = bool3;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 2:
                        bool3 = bool6;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str16);
                        i6 |= 4;
                        bool6 = bool3;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 3:
                        bool3 = bool6;
                        choices = (Choices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Choices$$serializer.INSTANCE, choices);
                        i6 |= 8;
                        str7 = str16;
                        bool6 = bool3;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 4:
                        bool3 = bool6;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str14);
                        i6 |= 16;
                        str7 = str16;
                        bool6 = bool3;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 5:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool6);
                        i6 |= 32;
                        str7 = str16;
                        bool6 = bool3;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 6:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str15);
                        i6 |= 64;
                        str7 = str16;
                        bool3 = bool6;
                        bool6 = bool3;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 7:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str13);
                        i6 |= 128;
                        str7 = str16;
                        bool3 = bool6;
                        bool6 = bool3;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 8:
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FloatSerializer.INSTANCE, f5);
                        i6 |= 256;
                        str7 = str16;
                        bool3 = bool6;
                        bool6 = bool3;
                        str16 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 9:
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f6);
                        i6 |= 512;
                        break;
                    case 10:
                        i6 |= 1024;
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool4);
                        str7 = str16;
                        bool3 = bool6;
                        bool6 = bool3;
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
            String str18 = str16;
            String str19 = str17;
            i = i6;
            f = f5;
            str = str13;
            f2 = f6;
            bool = bool4;
            str2 = str15;
            str3 = strDecodeStringElement2;
            bool2 = bool6;
            str4 = str19;
            str5 = str14;
            str6 = str18;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputCard(i, str3, str4, str6, choices, str5, bool2, str2, str, f, f2, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputCard.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.InputCard, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputCard inputCard) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputCard, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputCard.write$Self$OKCompliance_ok_compliance_impl(inputCard, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
