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
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import o.C43716ruY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class CommonPopUp$$serializer implements GeneratedSerializer<CommonPopUp> {
    public static final int $stable;
    public static final CommonPopUp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CommonPopUp$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CommonPopUp$$serializer commonPopUp$$serializer = new CommonPopUp$$serializer();
        INSTANCE = commonPopUp$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("generic-popup", commonPopUp$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("position", true);
        pluginGeneratedSerialDescriptor.addElement("ctaModel", true);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("iconState", false);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        pluginGeneratedSerialDescriptor.addElement("shouldShowCloseButton", true);
        pluginGeneratedSerialDescriptor.addElement("dialogBottomText", true);
        pluginGeneratedSerialDescriptor.addElement("allowClose", true);
        pluginGeneratedSerialDescriptor.addElement("isDismissable", true);
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
        return new KSerializer[]{BuiltinSerializersKt.getNullable(C43716ruY.KWHzl), BuiltinSerializersKt.getNullable(Cta$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(CtaPopUpData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(JsonArraySerializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(FreeText$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CommonPopUp deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        String str;
        Float f;
        Boolean bool2;
        String str2;
        Boolean bool3;
        Float f2;
        String str3;
        String str4;
        Boolean bool4;
        Boolean bool5;
        String str5;
        DialogStyle dialogStyle;
        JsonArray jsonArray;
        FreeText freeText;
        int i;
        String str6;
        Cta cta;
        CtaPopUpData ctaPopUpData;
        String str7;
        Boolean bool6;
        String str8;
        FreeText freeText2;
        Boolean bool7;
        String str9;
        String str10;
        String str11;
        Cta cta2;
        DialogStyle dialogStyle2;
        String str12;
        Boolean bool8;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Float f3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DialogStyle dialogStyle3 = (DialogStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, C43716ruY.KWHzl, null);
            cta = (Cta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            CtaPopUpData ctaPopUpData2 = (CtaPopUpData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, CtaPopUpData$$serializer.INSTANCE, null);
            jsonArray = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, JsonArraySerializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            FreeText freeText3 = (FreeText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, FreeText$$serializer.INSTANCE, null);
            Boolean bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            Boolean bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            Boolean bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, booleanSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, floatSerializer, null);
            Float f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, floatSerializer, null);
            Boolean bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, booleanSerializer, null);
            bool4 = bool9;
            i = 524287;
            str3 = str13;
            bool2 = bool11;
            f2 = f5;
            bool5 = bool10;
            ctaPopUpData = ctaPopUpData2;
            str6 = str14;
            str4 = strDecodeStringElement;
            dialogStyle = dialogStyle3;
            bool = bool13;
            freeText = freeText3;
            str7 = str15;
            f = f4;
            str2 = str16;
            str5 = str17;
            bool3 = bool12;
        } else {
            int i3 = 0;
            boolean z = true;
            String str18 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            JsonArray jsonArray2 = null;
            String str19 = null;
            String str20 = null;
            CtaPopUpData ctaPopUpData3 = null;
            Boolean bool16 = null;
            String str21 = null;
            Boolean bool17 = null;
            Float f6 = null;
            String strDecodeStringElement2 = null;
            FreeText freeText4 = null;
            Boolean bool18 = null;
            String str22 = null;
            String str23 = null;
            Cta cta3 = null;
            DialogStyle dialogStyle4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool6 = bool14;
                        str8 = str20;
                        freeText2 = freeText4;
                        bool7 = bool18;
                        str9 = str22;
                        str10 = str23;
                        DialogStyle dialogStyle5 = dialogStyle4;
                        str11 = str18;
                        cta2 = cta3;
                        z = false;
                        dialogStyle2 = dialogStyle5;
                        str23 = str10;
                        str22 = str9;
                        bool18 = bool7;
                        bool14 = bool6;
                        str18 = str11;
                        cta3 = cta2;
                        dialogStyle4 = dialogStyle2;
                        freeText4 = freeText2;
                        str20 = str8;
                        break;
                    case 0:
                        bool6 = bool14;
                        str8 = str20;
                        freeText2 = freeText4;
                        bool7 = bool18;
                        str9 = str22;
                        str10 = str23;
                        str11 = str18;
                        DialogStyle dialogStyle6 = dialogStyle4;
                        cta2 = cta3;
                        dialogStyle2 = (DialogStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, C43716ruY.KWHzl, dialogStyle6);
                        i3 |= 1;
                        str23 = str10;
                        str22 = str9;
                        bool18 = bool7;
                        bool14 = bool6;
                        str18 = str11;
                        cta3 = cta2;
                        dialogStyle4 = dialogStyle2;
                        freeText4 = freeText2;
                        str20 = str8;
                        break;
                    case 1:
                        bool6 = bool14;
                        str8 = str20;
                        freeText2 = freeText4;
                        bool7 = bool18;
                        str9 = str22;
                        str11 = str18;
                        str10 = str23;
                        cta3 = (Cta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, cta3);
                        i3 |= 2;
                        dialogStyle2 = dialogStyle4;
                        cta2 = cta3;
                        str23 = str10;
                        str22 = str9;
                        bool18 = bool7;
                        bool14 = bool6;
                        str18 = str11;
                        cta3 = cta2;
                        dialogStyle4 = dialogStyle2;
                        freeText4 = freeText2;
                        str20 = str8;
                        break;
                    case 2:
                        bool6 = bool14;
                        str8 = str20;
                        freeText2 = freeText4;
                        bool7 = bool18;
                        str9 = str22;
                        str11 = str18;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        str10 = str23;
                        dialogStyle2 = dialogStyle4;
                        cta2 = cta3;
                        str23 = str10;
                        str22 = str9;
                        bool18 = bool7;
                        bool14 = bool6;
                        str18 = str11;
                        cta3 = cta2;
                        dialogStyle4 = dialogStyle2;
                        freeText4 = freeText2;
                        str20 = str8;
                        break;
                    case 3:
                        bool6 = bool14;
                        str8 = str20;
                        freeText2 = freeText4;
                        bool7 = bool18;
                        str11 = str18;
                        str9 = str22;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str23);
                        i3 |= 8;
                        str10 = str23;
                        dialogStyle2 = dialogStyle4;
                        cta2 = cta3;
                        str23 = str10;
                        str22 = str9;
                        bool18 = bool7;
                        bool14 = bool6;
                        str18 = str11;
                        cta3 = cta2;
                        dialogStyle4 = dialogStyle2;
                        freeText4 = freeText2;
                        str20 = str8;
                        break;
                    case 4:
                        bool6 = bool14;
                        String str24 = str20;
                        freeText2 = freeText4;
                        bool7 = bool18;
                        str11 = str18;
                        str8 = str24;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str22);
                        i3 |= 16;
                        str9 = str22;
                        str10 = str23;
                        dialogStyle2 = dialogStyle4;
                        cta2 = cta3;
                        str23 = str10;
                        str22 = str9;
                        bool18 = bool7;
                        bool14 = bool6;
                        str18 = str11;
                        cta3 = cta2;
                        dialogStyle4 = dialogStyle2;
                        freeText4 = freeText2;
                        str20 = str8;
                        break;
                    case 5:
                        bool6 = bool14;
                        String str25 = str20;
                        freeText2 = freeText4;
                        str11 = str18;
                        bool7 = bool18;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str25);
                        i3 |= 32;
                        str9 = str22;
                        str10 = str23;
                        dialogStyle2 = dialogStyle4;
                        cta2 = cta3;
                        str23 = str10;
                        str22 = str9;
                        bool18 = bool7;
                        bool14 = bool6;
                        str18 = str11;
                        cta3 = cta2;
                        dialogStyle4 = dialogStyle2;
                        freeText4 = freeText2;
                        str20 = str8;
                        break;
                    case 6:
                        bool6 = bool14;
                        String str26 = str20;
                        freeText2 = freeText4;
                        str11 = str18;
                        i3 |= 64;
                        ctaPopUpData3 = (CtaPopUpData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, CtaPopUpData$$serializer.INSTANCE, ctaPopUpData3);
                        bool7 = bool18;
                        str9 = str22;
                        str10 = str23;
                        dialogStyle2 = dialogStyle4;
                        str8 = str26;
                        cta2 = cta3;
                        str23 = str10;
                        str22 = str9;
                        bool18 = bool7;
                        bool14 = bool6;
                        str18 = str11;
                        cta3 = cta2;
                        dialogStyle4 = dialogStyle2;
                        freeText4 = freeText2;
                        str20 = str8;
                        break;
                    case 7:
                        jsonArray2 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, JsonArraySerializer.INSTANCE, jsonArray2);
                        i3 |= 128;
                        bool14 = bool14;
                        str18 = str18;
                        freeText4 = freeText4;
                        str20 = str20;
                        break;
                    case 8:
                        str12 = str20;
                        bool8 = bool14;
                        bool18 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool18);
                        i3 |= 256;
                        str18 = str18;
                        freeText4 = freeText4;
                        bool14 = bool8;
                        str20 = str12;
                        break;
                    case 9:
                        str12 = str20;
                        bool8 = bool14;
                        i3 |= 512;
                        str18 = str18;
                        freeText4 = (FreeText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, FreeText$$serializer.INSTANCE, freeText4);
                        bool14 = bool8;
                        str20 = str12;
                        break;
                    case 10:
                        str12 = str20;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool14);
                        i3 |= 1024;
                        bool14 = bool8;
                        str20 = str12;
                        break;
                    case 11:
                        str12 = str20;
                        i3 |= 2048;
                        bool16 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, bool16);
                        bool8 = bool14;
                        bool14 = bool8;
                        str20 = str12;
                        break;
                    case 12:
                        str12 = str20;
                        i3 |= 4096;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str21);
                        bool8 = bool14;
                        bool14 = bool8;
                        str20 = str12;
                        break;
                    case 13:
                        str12 = str20;
                        i3 |= 8192;
                        bool17 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, bool17);
                        bool8 = bool14;
                        bool14 = bool8;
                        str20 = str12;
                        break;
                    case 14:
                        str12 = str20;
                        bool8 = bool14;
                        i3 |= 16384;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str19);
                        bool14 = bool8;
                        str20 = str12;
                        break;
                    case 15:
                        str12 = str20;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str18);
                        i2 = 32768;
                        i3 = i2 | i3;
                        bool8 = bool14;
                        bool14 = bool8;
                        str20 = str12;
                        break;
                    case 16:
                        str12 = str20;
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, FloatSerializer.INSTANCE, f3);
                        i2 = 65536;
                        i3 = i2 | i3;
                        bool8 = bool14;
                        bool14 = bool8;
                        str20 = str12;
                        break;
                    case 17:
                        str12 = str20;
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, FloatSerializer.INSTANCE, f6);
                        i2 = 131072;
                        i3 = i2 | i3;
                        bool8 = bool14;
                        bool14 = bool8;
                        str20 = str12;
                        break;
                    case 18:
                        str12 = str20;
                        bool15 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, bool15);
                        i2 = 262144;
                        i3 = i2 | i3;
                        bool8 = bool14;
                        bool14 = bool8;
                        str20 = str12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str27 = str20;
            bool = bool15;
            str = str19;
            f = f3;
            bool2 = bool16;
            str2 = str21;
            bool3 = bool17;
            f2 = f6;
            str3 = str23;
            str4 = strDecodeStringElement2;
            bool4 = bool18;
            bool5 = bool14;
            str5 = str18;
            dialogStyle = dialogStyle4;
            jsonArray = jsonArray2;
            freeText = freeText4;
            i = i3;
            str6 = str22;
            cta = cta3;
            ctaPopUpData = ctaPopUpData3;
            str7 = str27;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CommonPopUp(i, dialogStyle, cta, str4, str3, str6, str7, ctaPopUpData, jsonArray, bool4, freeText, bool5, bool2, str2, bool3, str, str5, f, f2, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.CommonPopUp.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.CommonPopUp, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CommonPopUp commonPopUp) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(commonPopUp, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CommonPopUp.write$Self$OKCompliance_ok_compliance_impl(commonPopUp, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
