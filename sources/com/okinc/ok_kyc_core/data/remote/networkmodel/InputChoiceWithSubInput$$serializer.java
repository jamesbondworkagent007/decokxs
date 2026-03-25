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
public final /* synthetic */ class InputChoiceWithSubInput$$serializer implements GeneratedSerializer<InputChoiceWithSubInput> {
    public static final int $stable;
    public static final InputChoiceWithSubInput$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputChoiceWithSubInput$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputChoiceWithSubInput$$serializer inputChoiceWithSubInput$$serializer = new InputChoiceWithSubInput$$serializer();
        INSTANCE = inputChoiceWithSubInput$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("input-choice-with-sub-input", inputChoiceWithSubInput$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("valueName", true);
        pluginGeneratedSerialDescriptor.addElement("choices", true);
        pluginGeneratedSerialDescriptor.addElement("selectValue", true);
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
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(Choices$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Value$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputChoiceWithSubInput deserialize(@NotNull Decoder decoder) {
        String str;
        Boolean bool;
        Float f;
        String str2;
        Float f2;
        Choices choices;
        String str3;
        String str4;
        Boolean bool2;
        int i;
        Value value;
        String str5;
        Boolean bool3;
        Value value2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        String str6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            Choices choices2 = (Choices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Choices$$serializer.INSTANCE, null);
            Value value3 = (Value) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, Value$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            str2 = str11;
            bool = bool5;
            str6 = str9;
            str5 = str10;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            str3 = str8;
            str = str7;
            choices = choices2;
            bool2 = bool4;
            i = 4095;
            value = value3;
            str4 = strDecodeStringElement;
        } else {
            int i5 = 11;
            int i6 = 0;
            boolean z = true;
            String str12 = null;
            Boolean bool6 = null;
            Float f3 = null;
            String str13 = null;
            Float f4 = null;
            Choices choices3 = null;
            String str14 = null;
            String strDecodeStringElement2 = null;
            Boolean bool7 = null;
            Value value4 = null;
            String str15 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool3 = bool7;
                        value2 = value4;
                        z = false;
                        bool7 = bool3;
                        value4 = value2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 0:
                        bool3 = bool7;
                        value2 = value4;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        bool7 = bool3;
                        value4 = value2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 1:
                        bool3 = bool7;
                        value2 = value4;
                        i6 |= 2;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str15);
                        bool7 = bool3;
                        value4 = value2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 2:
                        bool3 = bool7;
                        value2 = value4;
                        i6 |= 4;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str14);
                        bool7 = bool3;
                        value4 = value2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 3:
                        bool3 = bool7;
                        value2 = value4;
                        i6 |= 8;
                        choices3 = (Choices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Choices$$serializer.INSTANCE, choices3);
                        bool7 = bool3;
                        value4 = value2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 4:
                        bool3 = bool7;
                        value2 = (Value) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, Value$$serializer.INSTANCE, value4);
                        i6 |= 16;
                        bool7 = bool3;
                        value4 = value2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 5:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool7);
                        i6 |= 32;
                        value2 = value4;
                        bool7 = bool3;
                        value4 = value2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 6:
                        i6 |= 64;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str6);
                        bool3 = bool7;
                        value2 = value4;
                        bool7 = bool3;
                        value4 = value2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 7:
                        i6 |= 128;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool6);
                        bool3 = bool7;
                        value2 = value4;
                        bool7 = bool3;
                        value4 = value2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 8:
                        i6 |= 256;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str12);
                        bool3 = bool7;
                        value2 = value4;
                        bool7 = bool3;
                        value4 = value2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 9:
                        i6 |= 512;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str13);
                        bool3 = bool7;
                        value2 = value4;
                        bool7 = bool3;
                        value4 = value2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 10:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f3);
                        i6 |= 1024;
                        break;
                    case 11:
                        i6 |= 2048;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, FloatSerializer.INSTANCE, f4);
                        bool3 = bool7;
                        value2 = value4;
                        bool7 = bool3;
                        value4 = value2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str15;
            bool = bool6;
            f = f3;
            str2 = str13;
            f2 = f4;
            choices = choices3;
            str3 = str14;
            str4 = strDecodeStringElement2;
            bool2 = bool7;
            i = i6;
            value = value4;
            str5 = str12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputChoiceWithSubInput(i, str4, str, str3, choices, value, bool2, str6, bool, str5, str2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceWithSubInput.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceWithSubInput, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputChoiceWithSubInput inputChoiceWithSubInput) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputChoiceWithSubInput, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputChoiceWithSubInput.write$Self$OKCompliance_ok_compliance_impl(inputChoiceWithSubInput, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
