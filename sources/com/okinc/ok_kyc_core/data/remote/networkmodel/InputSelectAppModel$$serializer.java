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
public final /* synthetic */ class InputSelectAppModel$$serializer implements GeneratedSerializer<InputSelectAppModel> {
    public static final int $stable;
    public static final InputSelectAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputSelectAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputSelectAppModel$$serializer inputSelectAppModel$$serializer = new InputSelectAppModel$$serializer();
        INSTANCE = inputSelectAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.InputSelectAppModel", inputSelectAppModel$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("placeholder", true);
        pluginGeneratedSerialDescriptor.addElement("choices", false);
        pluginGeneratedSerialDescriptor.addElement("enabled", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("valueName", true);
        pluginGeneratedSerialDescriptor.addElement("allowCustomValue", true);
        pluginGeneratedSerialDescriptor.addElement("customId", true);
        pluginGeneratedSerialDescriptor.addElement("countryFlagUrl", true);
        pluginGeneratedSerialDescriptor.addElement("textColor", true);
        pluginGeneratedSerialDescriptor.addElement("dialogBottomText", true);
        pluginGeneratedSerialDescriptor.addElement("editCtaButton", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        pluginGeneratedSerialDescriptor.addElement("isControlOtherViewShow", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), Choices$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(FreeTextAppModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CTAButtonAppModel$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputSelectAppModel deserialize(@NotNull Decoder decoder) {
        String str;
        Boolean bool;
        String str2;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        CTAButtonAppModel cTAButtonAppModel;
        Float f;
        Float f2;
        String str8;
        String str9;
        int i;
        Boolean bool5;
        Choices choices;
        FreeTextAppModel freeTextAppModel;
        FreeTextAppModel freeTextAppModel2;
        String str10;
        String str11;
        int i2;
        int i3;
        Float f3;
        String str12;
        String str13;
        Boolean bool6;
        Choices choices2;
        FreeTextAppModel freeTextAppModel3;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str19 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            Choices choices3 = (Choices) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, Choices$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            FreeTextAppModel freeTextAppModel4 = (FreeTextAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, FreeTextAppModel$$serializer.INSTANCE, null);
            CTAButtonAppModel cTAButtonAppModel2 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, CTAButtonAppModel$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            Boolean bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, booleanSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, floatSerializer, null);
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, floatSerializer, null);
            bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, booleanSerializer, null);
            str4 = strDecodeStringElement;
            str5 = str25;
            bool4 = bool7;
            f = f4;
            str2 = str27;
            str6 = str26;
            bool3 = bool10;
            bool2 = bool8;
            freeTextAppModel = freeTextAppModel4;
            choices = choices3;
            str3 = str23;
            bool = bool9;
            str = str22;
            cTAButtonAppModel = cTAButtonAppModel2;
            str9 = str24;
            str7 = str20;
            str8 = str21;
            i = 524287;
        } else {
            int i4 = 18;
            int i5 = 0;
            boolean z = true;
            Float f5 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            CTAButtonAppModel cTAButtonAppModel3 = null;
            Boolean bool13 = null;
            Float f6 = null;
            Boolean bool14 = null;
            String strDecodeStringElement2 = null;
            String str31 = null;
            String str32 = null;
            Boolean bool15 = null;
            Choices choices4 = null;
            String str33 = null;
            String str34 = null;
            FreeTextAppModel freeTextAppModel5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        f3 = f5;
                        str12 = str28;
                        str13 = str32;
                        bool6 = bool15;
                        choices2 = choices4;
                        String str35 = str34;
                        freeTextAppModel3 = freeTextAppModel5;
                        str14 = str29;
                        str15 = str31;
                        str16 = str33;
                        str17 = str35;
                        z = false;
                        str31 = str15;
                        f5 = f3;
                        choices4 = choices2;
                        bool15 = bool6;
                        str32 = str13;
                        str28 = str12;
                        str33 = str16;
                        str29 = str14;
                        str34 = str17;
                        freeTextAppModel5 = freeTextAppModel3;
                        i4 = 18;
                        break;
                    case 0:
                        f3 = f5;
                        str12 = str28;
                        str13 = str32;
                        bool6 = bool15;
                        choices2 = choices4;
                        freeTextAppModel3 = freeTextAppModel5;
                        str14 = str29;
                        str15 = str31;
                        String str36 = str34;
                        str16 = str33;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str36);
                        i5 |= 1;
                        str31 = str15;
                        f5 = f3;
                        choices4 = choices2;
                        bool15 = bool6;
                        str32 = str13;
                        str28 = str12;
                        str33 = str16;
                        str29 = str14;
                        str34 = str17;
                        freeTextAppModel5 = freeTextAppModel3;
                        i4 = 18;
                        break;
                    case 1:
                        f3 = f5;
                        str12 = str28;
                        str13 = str32;
                        bool6 = bool15;
                        freeTextAppModel3 = freeTextAppModel5;
                        str14 = str29;
                        str15 = str31;
                        choices2 = choices4;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str33);
                        i5 |= 2;
                        str17 = str34;
                        str16 = str33;
                        str31 = str15;
                        f5 = f3;
                        choices4 = choices2;
                        bool15 = bool6;
                        str32 = str13;
                        str28 = str12;
                        str33 = str16;
                        str29 = str14;
                        str34 = str17;
                        freeTextAppModel5 = freeTextAppModel3;
                        i4 = 18;
                        break;
                    case 2:
                        f3 = f5;
                        str12 = str28;
                        str13 = str32;
                        freeTextAppModel3 = freeTextAppModel5;
                        str14 = str29;
                        str15 = str31;
                        bool6 = bool15;
                        choices4 = (Choices) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, Choices$$serializer.INSTANCE, choices4);
                        i5 |= 4;
                        choices2 = choices4;
                        str17 = str34;
                        str16 = str33;
                        str31 = str15;
                        f5 = f3;
                        choices4 = choices2;
                        bool15 = bool6;
                        str32 = str13;
                        str28 = str12;
                        str33 = str16;
                        str29 = str14;
                        str34 = str17;
                        freeTextAppModel5 = freeTextAppModel3;
                        i4 = 18;
                        break;
                    case 3:
                        f3 = f5;
                        str12 = str28;
                        freeTextAppModel3 = freeTextAppModel5;
                        str14 = str29;
                        str15 = str31;
                        str13 = str32;
                        bool15 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool15);
                        i5 |= 8;
                        bool6 = bool15;
                        choices2 = choices4;
                        str17 = str34;
                        str16 = str33;
                        str31 = str15;
                        f5 = f3;
                        choices4 = choices2;
                        bool15 = bool6;
                        str32 = str13;
                        str28 = str12;
                        str33 = str16;
                        str29 = str14;
                        str34 = str17;
                        freeTextAppModel5 = freeTextAppModel3;
                        i4 = 18;
                        break;
                    case 4:
                        f3 = f5;
                        str12 = str28;
                        str18 = str32;
                        freeTextAppModel3 = freeTextAppModel5;
                        str14 = str29;
                        str15 = str31;
                        bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool12);
                        i5 |= 16;
                        str13 = str18;
                        bool6 = bool15;
                        choices2 = choices4;
                        str17 = str34;
                        str16 = str33;
                        str31 = str15;
                        f5 = f3;
                        choices4 = choices2;
                        bool15 = bool6;
                        str32 = str13;
                        str28 = str12;
                        str33 = str16;
                        str29 = str14;
                        str34 = str17;
                        freeTextAppModel5 = freeTextAppModel3;
                        i4 = 18;
                        break;
                    case 5:
                        f3 = f5;
                        str12 = str28;
                        str18 = str32;
                        freeTextAppModel3 = freeTextAppModel5;
                        str14 = str29;
                        str15 = str31;
                        i5 |= 32;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str30);
                        str13 = str18;
                        bool6 = bool15;
                        choices2 = choices4;
                        str17 = str34;
                        str16 = str33;
                        str31 = str15;
                        f5 = f3;
                        choices4 = choices2;
                        bool15 = bool6;
                        str32 = str13;
                        str28 = str12;
                        str33 = str16;
                        str29 = str14;
                        str34 = str17;
                        freeTextAppModel5 = freeTextAppModel3;
                        i4 = 18;
                        break;
                    case 6:
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool11);
                        i5 |= 64;
                        f5 = f5;
                        str28 = str28;
                        str29 = str29;
                        i4 = 18;
                        freeTextAppModel5 = freeTextAppModel5;
                        break;
                    case 7:
                        freeTextAppModel2 = freeTextAppModel5;
                        str10 = str28;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str32);
                        i5 |= 128;
                        str11 = str31;
                        f5 = f5;
                        str29 = str29;
                        freeTextAppModel5 = freeTextAppModel2;
                        str31 = str11;
                        str28 = str10;
                        i4 = 18;
                        break;
                    case 8:
                        Float f7 = f5;
                        freeTextAppModel2 = freeTextAppModel5;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str31);
                        str10 = str28;
                        i5 |= 256;
                        f5 = f7;
                        str29 = str29;
                        freeTextAppModel5 = freeTextAppModel2;
                        str31 = str11;
                        str28 = str10;
                        i4 = 18;
                        break;
                    case 9:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str28);
                        i5 |= 512;
                        str11 = str31;
                        str29 = str29;
                        freeTextAppModel5 = freeTextAppModel5;
                        f5 = f5;
                        str31 = str11;
                        str28 = str10;
                        i4 = 18;
                        break;
                    case 10:
                        i5 |= 1024;
                        str10 = str28;
                        f5 = f5;
                        str29 = str29;
                        freeTextAppModel5 = (FreeTextAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, FreeTextAppModel$$serializer.INSTANCE, freeTextAppModel5);
                        str11 = str31;
                        str31 = str11;
                        str28 = str10;
                        i4 = 18;
                        break;
                    case 11:
                        i5 |= 2048;
                        cTAButtonAppModel3 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, CTAButtonAppModel$$serializer.INSTANCE, cTAButtonAppModel3);
                        str10 = str28;
                        f5 = f5;
                        str11 = str31;
                        str31 = str11;
                        str28 = str10;
                        i4 = 18;
                        break;
                    case 12:
                        i5 |= 4096;
                        str10 = str28;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        str11 = str31;
                        str31 = str11;
                        str28 = str10;
                        i4 = 18;
                        break;
                    case 13:
                        i5 |= 8192;
                        str10 = str28;
                        bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, bool13);
                        str11 = str31;
                        str31 = str11;
                        str28 = str10;
                        i4 = 18;
                        break;
                    case 14:
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str29);
                        i2 = i5 | 16384;
                        str10 = str28;
                        i5 = i2;
                        str11 = str31;
                        str31 = str11;
                        str28 = str10;
                        i4 = 18;
                        break;
                    case 15:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str19);
                        i3 = 32768;
                        i2 = i3 | i5;
                        str10 = str28;
                        i5 = i2;
                        str11 = str31;
                        str31 = str11;
                        str28 = str10;
                        i4 = 18;
                        break;
                    case 16:
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, FloatSerializer.INSTANCE, f6);
                        i3 = 65536;
                        i2 = i3 | i5;
                        str10 = str28;
                        i5 = i2;
                        str11 = str31;
                        str31 = str11;
                        str28 = str10;
                        i4 = 18;
                        break;
                    case 17:
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, FloatSerializer.INSTANCE, f5);
                        i3 = 131072;
                        i2 = i3 | i5;
                        str10 = str28;
                        i5 = i2;
                        str11 = str31;
                        str31 = str11;
                        str28 = str10;
                        i4 = 18;
                        break;
                    case 18:
                        bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool14);
                        i3 = 262144;
                        i2 = i3 | i5;
                        str10 = str28;
                        i5 = i2;
                        str11 = str31;
                        str31 = str11;
                        str28 = str10;
                        i4 = 18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str30;
            bool = bool11;
            str2 = str19;
            bool2 = bool12;
            bool3 = bool13;
            bool4 = bool15;
            str3 = str32;
            str4 = strDecodeStringElement2;
            str5 = str28;
            str6 = str29;
            str7 = str34;
            cTAButtonAppModel = cTAButtonAppModel3;
            f = f6;
            f2 = f5;
            str8 = str33;
            str9 = str31;
            i = i5;
            bool5 = bool14;
            choices = choices4;
            freeTextAppModel = freeTextAppModel5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputSelectAppModel(i, str7, str8, choices, bool4, bool2, str, bool, str3, str9, str5, freeTextAppModel, cTAButtonAppModel, str4, bool3, str6, str2, f, f2, bool5, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputSelectAppModel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.InputSelectAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputSelectAppModel inputSelectAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputSelectAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputSelectAppModel.write$Self$OKCompliance_ok_compliance_impl(inputSelectAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
