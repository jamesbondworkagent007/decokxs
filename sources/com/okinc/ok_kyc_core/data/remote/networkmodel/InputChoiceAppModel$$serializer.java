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
public final /* synthetic */ class InputChoiceAppModel$$serializer implements GeneratedSerializer<InputChoiceAppModel> {
    public static final int $stable;
    public static final InputChoiceAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputChoiceAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputChoiceAppModel$$serializer inputChoiceAppModel$$serializer = new InputChoiceAppModel$$serializer();
        INSTANCE = inputChoiceAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceAppModel", inputChoiceAppModel$$serializer, 12);
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
        pluginGeneratedSerialDescriptor.addElement("searchText", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(Choices$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputChoiceAppModel deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        Boolean bool;
        String str2;
        Float f;
        Float f2;
        String strDecodeStringElement;
        String str3;
        Choices choices;
        String str4;
        String str5;
        String str6;
        Boolean bool2;
        Boolean bool3;
        String str7;
        String str8;
        Choices choices2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 8;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            Choices choices3 = (Choices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Choices$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            f2 = f3;
            str = str11;
            bool = bool5;
            str6 = strDecodeStringElement4;
            str2 = str12;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            bool2 = bool4;
            i = 4095;
            str3 = strDecodeStringElement3;
            str4 = str10;
            str5 = str9;
            choices = choices3;
        } else {
            int i7 = 11;
            int i8 = 0;
            boolean z = true;
            String str13 = null;
            Boolean bool6 = null;
            String str14 = null;
            Float f4 = null;
            Float f5 = null;
            String strDecodeStringElement5 = null;
            Boolean bool7 = null;
            String str15 = null;
            String str16 = null;
            String strDecodeStringElement6 = null;
            Choices choices4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool3 = bool7;
                        str7 = str15;
                        str8 = str16;
                        choices2 = choices4;
                        z = false;
                        str16 = str8;
                        bool7 = bool3;
                        choices4 = choices2;
                        str15 = str7;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 0:
                        bool3 = bool7;
                        str7 = str15;
                        choices2 = choices4;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i8 |= 1;
                        bool7 = bool3;
                        choices4 = choices2;
                        str15 = str7;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 1:
                        bool3 = bool7;
                        str7 = str15;
                        choices2 = choices4;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str16);
                        i8 |= 2;
                        bool7 = bool3;
                        choices4 = choices2;
                        str15 = str7;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 2:
                        bool3 = bool7;
                        choices2 = choices4;
                        i8 |= 4;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str15);
                        bool7 = bool3;
                        choices4 = choices2;
                        str15 = str7;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 3:
                        bool3 = bool7;
                        choices4 = (Choices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Choices$$serializer.INSTANCE, choices4);
                        i8 |= 8;
                        str7 = str15;
                        choices2 = choices4;
                        bool7 = bool3;
                        choices4 = choices2;
                        str15 = str7;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 4:
                        i8 |= 16;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool7);
                        str7 = str15;
                        choices2 = choices4;
                        bool7 = bool3;
                        choices4 = choices2;
                        str15 = str7;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 5:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i8 |= 32;
                        bool3 = bool7;
                        str7 = str15;
                        str8 = str16;
                        choices2 = choices4;
                        str16 = str8;
                        bool7 = bool3;
                        choices4 = choices2;
                        str15 = str7;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 6:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool6);
                        i8 |= 64;
                        bool3 = bool7;
                        str7 = str15;
                        str8 = str16;
                        choices2 = choices4;
                        str16 = str8;
                        bool7 = bool3;
                        choices4 = choices2;
                        str15 = str7;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 7:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str13);
                        i8 |= 128;
                        bool3 = bool7;
                        str7 = str15;
                        str8 = str16;
                        choices2 = choices4;
                        str16 = str8;
                        bool7 = bool3;
                        choices4 = choices2;
                        str15 = str7;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 8:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str14);
                        i8 |= 256;
                        bool3 = bool7;
                        str7 = str15;
                        str8 = str16;
                        choices2 = choices4;
                        str16 = str8;
                        bool7 = bool3;
                        choices4 = choices2;
                        str15 = str7;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 9:
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f5);
                        i8 |= 512;
                        break;
                    case 10:
                        i8 |= 1024;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f4);
                        bool3 = bool7;
                        str7 = str15;
                        choices2 = choices4;
                        bool7 = bool3;
                        choices4 = choices2;
                        str15 = str7;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 11:
                        i8 |= 2048;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i7);
                        bool3 = bool7;
                        str7 = str15;
                        choices2 = choices4;
                        bool7 = bool3;
                        choices4 = choices2;
                        str15 = str7;
                        i7 = 11;
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
            Boolean bool8 = bool7;
            String str17 = str15;
            String str18 = str16;
            i = i8;
            str = str13;
            bool = bool6;
            str2 = str14;
            f = f4;
            f2 = f5;
            strDecodeStringElement = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            choices = choices4;
            str4 = str17;
            str5 = str18;
            str6 = strDecodeStringElement2;
            bool2 = bool8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputChoiceAppModel(i, str3, str5, str4, choices, bool2, str6, bool, str, str2, f2, f, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceAppModel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputChoiceAppModel inputChoiceAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputChoiceAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputChoiceAppModel.write$Self$OKCompliance_ok_compliance_impl(inputChoiceAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
