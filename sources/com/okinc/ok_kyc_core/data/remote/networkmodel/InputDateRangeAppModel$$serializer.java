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
public final /* synthetic */ class InputDateRangeAppModel$$serializer implements GeneratedSerializer<InputDateRangeAppModel> {
    public static final int $stable;
    public static final InputDateRangeAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputDateRangeAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputDateRangeAppModel$$serializer inputDateRangeAppModel$$serializer = new InputDateRangeAppModel$$serializer();
        INSTANCE = inputDateRangeAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeAppModel", inputDateRangeAppModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("placeholder", true);
        pluginGeneratedSerialDescriptor.addElement("fieldValue", true);
        pluginGeneratedSerialDescriptor.addElement("dateFormat", true);
        pluginGeneratedSerialDescriptor.addElement("toPresentCheckboxText", true);
        pluginGeneratedSerialDescriptor.addElement("endDatePlaceholderIfToPresent", true);
        pluginGeneratedSerialDescriptor.addElement("rule", true);
        pluginGeneratedSerialDescriptor.addElement("enabled", true);
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
        InputDateRangeText$$serializer inputDateRangeText$$serializer = InputDateRangeText$$serializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(inputDateRangeText$$serializer), BuiltinSerializersKt.getNullable(inputDateRangeText$$serializer), BuiltinSerializersKt.getNullable(inputDateRangeText$$serializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(Rule$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputDateRangeAppModel deserialize(@NotNull Decoder decoder) {
        InputDateRangeText inputDateRangeText;
        InputDateRangeText inputDateRangeText2;
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        String str3;
        Float f;
        Boolean bool3;
        String str4;
        String str5;
        InputDateRangeText inputDateRangeText3;
        Rule rule;
        String str6;
        int i;
        Float f2;
        String str7;
        Boolean bool4;
        String str8;
        String str9;
        Boolean bool5;
        String str10;
        InputDateRangeText inputDateRangeText4;
        String str11;
        InputDateRangeText inputDateRangeText5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        String str12 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            InputDateRangeText$$serializer inputDateRangeText$$serializer = InputDateRangeText$$serializer.INSTANCE;
            InputDateRangeText inputDateRangeText6 = (InputDateRangeText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, inputDateRangeText$$serializer, null);
            InputDateRangeText inputDateRangeText7 = (InputDateRangeText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, inputDateRangeText$$serializer, null);
            InputDateRangeText inputDateRangeText8 = (InputDateRangeText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, inputDateRangeText$$serializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            Rule rule2 = (Rule) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, Rule$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            inputDateRangeText2 = inputDateRangeText8;
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            inputDateRangeText = inputDateRangeText6;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, null);
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, null);
            i = 32767;
            rule = rule2;
            bool2 = bool8;
            str4 = strDecodeStringElement;
            bool3 = bool6;
            str = str16;
            str2 = str15;
            str6 = str13;
            bool = bool7;
            str5 = str14;
            str3 = str17;
            inputDateRangeText3 = inputDateRangeText7;
        } else {
            int i4 = 14;
            int i5 = 0;
            boolean z = true;
            String str18 = null;
            InputDateRangeText inputDateRangeText9 = null;
            Rule rule3 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Float f3 = null;
            String str19 = null;
            Float f4 = null;
            String strDecodeStringElement2 = null;
            Boolean bool11 = null;
            String str20 = null;
            InputDateRangeText inputDateRangeText10 = null;
            InputDateRangeText inputDateRangeText11 = null;
            String str21 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str18;
                        bool5 = bool11;
                        str10 = str20;
                        inputDateRangeText4 = inputDateRangeText11;
                        str11 = str21;
                        inputDateRangeText5 = inputDateRangeText10;
                        z = false;
                        str20 = str10;
                        str21 = str11;
                        bool11 = bool5;
                        str18 = str9;
                        inputDateRangeText10 = inputDateRangeText5;
                        i2 = 10;
                        i3 = 9;
                        inputDateRangeText11 = inputDateRangeText4;
                        i4 = 14;
                        break;
                    case 0:
                        str9 = str18;
                        bool5 = bool11;
                        str10 = str20;
                        str11 = str21;
                        InputDateRangeText inputDateRangeText12 = inputDateRangeText11;
                        inputDateRangeText5 = inputDateRangeText10;
                        inputDateRangeText4 = (InputDateRangeText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, InputDateRangeText$$serializer.INSTANCE, inputDateRangeText12);
                        i5 |= 1;
                        str20 = str10;
                        str21 = str11;
                        bool11 = bool5;
                        str18 = str9;
                        inputDateRangeText10 = inputDateRangeText5;
                        i2 = 10;
                        i3 = 9;
                        inputDateRangeText11 = inputDateRangeText4;
                        i4 = 14;
                        break;
                    case 1:
                        str9 = str18;
                        str10 = str20;
                        str11 = str21;
                        bool5 = bool11;
                        i5 |= 2;
                        inputDateRangeText4 = inputDateRangeText11;
                        inputDateRangeText5 = (InputDateRangeText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InputDateRangeText$$serializer.INSTANCE, inputDateRangeText10);
                        str20 = str10;
                        str21 = str11;
                        bool11 = bool5;
                        str18 = str9;
                        inputDateRangeText10 = inputDateRangeText5;
                        i2 = 10;
                        i3 = 9;
                        inputDateRangeText11 = inputDateRangeText4;
                        i4 = 14;
                        break;
                    case 2:
                        str7 = str18;
                        inputDateRangeText9 = (InputDateRangeText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, InputDateRangeText$$serializer.INSTANCE, inputDateRangeText9);
                        i5 |= 4;
                        str18 = str7;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 3:
                        bool4 = bool11;
                        str8 = str20;
                        str7 = str18;
                        i5 |= 8;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str21);
                        bool11 = bool4;
                        str20 = str8;
                        str18 = str7;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        bool4 = bool11;
                        str8 = str20;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str18);
                        i5 |= 16;
                        str7 = str18;
                        bool11 = bool4;
                        str20 = str8;
                        str18 = str7;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 5:
                        bool4 = bool11;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str20);
                        i5 |= 32;
                        str7 = str18;
                        bool11 = bool4;
                        str20 = str8;
                        str18 = str7;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 6:
                        bool4 = bool11;
                        rule3 = (Rule) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, Rule$$serializer.INSTANCE, rule3);
                        i5 |= 64;
                        str7 = str18;
                        str8 = str20;
                        bool11 = bool4;
                        str20 = str8;
                        str18 = str7;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 7:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool11);
                        i5 |= 128;
                        str7 = str18;
                        str8 = str20;
                        bool11 = bool4;
                        str20 = str8;
                        str18 = str7;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 8:
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool9);
                        i5 |= 256;
                        str7 = str18;
                        bool4 = bool11;
                        str8 = str20;
                        bool11 = bool4;
                        str20 = str8;
                        str18 = str7;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 9:
                        i5 |= 512;
                        str7 = str18;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        bool4 = bool11;
                        str8 = str20;
                        bool11 = bool4;
                        str20 = str8;
                        str18 = str7;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 10:
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool10);
                        i5 |= 1024;
                        str7 = str18;
                        bool4 = bool11;
                        str8 = str20;
                        bool11 = bool4;
                        str20 = str8;
                        str18 = str7;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 11:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str12);
                        i5 |= 2048;
                        str7 = str18;
                        bool4 = bool11;
                        str8 = str20;
                        bool11 = bool4;
                        str20 = str8;
                        str18 = str7;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 12:
                        i5 |= 4096;
                        str7 = str18;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str19);
                        bool4 = bool11;
                        str8 = str20;
                        bool11 = bool4;
                        str20 = str8;
                        str18 = str7;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 13:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, FloatSerializer.INSTANCE, f3);
                        i5 |= 8192;
                        str7 = str18;
                        bool4 = bool11;
                        str8 = str20;
                        bool11 = bool4;
                        str20 = str8;
                        str18 = str7;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 14:
                        i5 |= 16384;
                        str7 = str18;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, FloatSerializer.INSTANCE, f4);
                        bool4 = bool11;
                        str8 = str20;
                        bool11 = bool4;
                        str20 = str8;
                        str18 = str7;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool12 = bool11;
            String str22 = str20;
            InputDateRangeText inputDateRangeText13 = inputDateRangeText11;
            InputDateRangeText inputDateRangeText14 = inputDateRangeText10;
            inputDateRangeText = inputDateRangeText13;
            inputDateRangeText2 = inputDateRangeText9;
            str = str12;
            str2 = str22;
            bool = bool9;
            bool2 = bool10;
            str3 = str19;
            f = f4;
            bool3 = bool12;
            str4 = strDecodeStringElement2;
            str5 = str18;
            inputDateRangeText3 = inputDateRangeText14;
            rule = rule3;
            str6 = str21;
            i = i5;
            f2 = f3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputDateRangeAppModel(i, inputDateRangeText, inputDateRangeText3, inputDateRangeText2, str6, str5, str2, rule, bool3, bool, str4, bool2, str, str3, f2, f, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeAppModel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputDateRangeAppModel inputDateRangeAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputDateRangeAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputDateRangeAppModel.write$Self$OKCompliance_ok_compliance_impl(inputDateRangeAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
