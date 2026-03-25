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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import o.C43716ruY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ButtonDialogData$$serializer implements GeneratedSerializer<ButtonDialogData> {
    public static final int $stable;
    public static final ButtonDialogData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ButtonDialogData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ButtonDialogData$$serializer buttonDialogData$$serializer = new ButtonDialogData$$serializer();
        INSTANCE = buttonDialogData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialogData", buttonDialogData$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("position", true);
        pluginGeneratedSerialDescriptor.addElement("pageId", true);
        pluginGeneratedSerialDescriptor.addElement("entryPageId", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("isFullPage", true);
        pluginGeneratedSerialDescriptor.addElement("showOnPageLoad", true);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        pluginGeneratedSerialDescriptor.addElement("allowClose", true);
        pluginGeneratedSerialDescriptor.addElement("dialogBottomText", true);
        pluginGeneratedSerialDescriptor.addElement("shouldShowCloseButton", true);
        pluginGeneratedSerialDescriptor.addElement("dialogCheckbox", true);
        pluginGeneratedSerialDescriptor.addElement("isDismissable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(C43716ruY.KWHzl);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(CtaPopUpData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(JsonArraySerializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(FreeText$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(DialogCheckbox$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ButtonDialogData deserialize(@NotNull Decoder decoder) {
        FreeText freeText;
        Boolean bool;
        CtaPopUpData ctaPopUpData;
        Boolean bool2;
        Boolean bool3;
        DialogCheckbox dialogCheckbox;
        String str;
        Boolean bool4;
        String str2;
        String str3;
        int i;
        Boolean bool5;
        String str4;
        JsonArray jsonArray;
        DialogStyle dialogStyle;
        Boolean bool6;
        int i2;
        String str5;
        String str6;
        Boolean bool7;
        DialogStyle dialogStyle2;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 10;
        FreeText freeText2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DialogStyle dialogStyle3 = (DialogStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, C43716ruY.KWHzl, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            CtaPopUpData ctaPopUpData2 = (CtaPopUpData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, CtaPopUpData$$serializer.INSTANCE, null);
            JsonArray jsonArray2 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, JsonArraySerializer.INSTANCE, null);
            Boolean bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            FreeText freeText3 = (FreeText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, FreeText$$serializer.INSTANCE, null);
            Boolean bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            dialogCheckbox = (DialogCheckbox) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, DialogCheckbox$$serializer.INSTANCE, null);
            bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, booleanSerializer, null);
            freeText = freeText3;
            bool5 = bool10;
            bool = bool9;
            bool4 = bool8;
            bool2 = bool11;
            str3 = str9;
            dialogStyle = dialogStyle3;
            i = 16383;
            ctaPopUpData = ctaPopUpData2;
            str = str11;
            str4 = str10;
            str2 = str8;
            jsonArray = jsonArray2;
        } else {
            int i4 = 13;
            boolean z = true;
            String str12 = null;
            Boolean bool12 = null;
            CtaPopUpData ctaPopUpData3 = null;
            JsonArray jsonArray3 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            DialogCheckbox dialogCheckbox2 = null;
            String str13 = null;
            Boolean bool16 = null;
            String str14 = null;
            DialogStyle dialogStyle4 = null;
            int i5 = 0;
            String str15 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str5 = str12;
                        str6 = str13;
                        bool7 = bool16;
                        dialogStyle2 = dialogStyle4;
                        str7 = str14;
                        z = false;
                        bool16 = bool7;
                        str14 = str7;
                        i4 = 13;
                        dialogStyle4 = dialogStyle2;
                        str13 = str6;
                        str12 = str5;
                        i3 = 10;
                        break;
                    case 0:
                        str5 = str12;
                        str6 = str13;
                        bool7 = bool16;
                        DialogStyle dialogStyle5 = dialogStyle4;
                        str7 = str14;
                        dialogStyle2 = (DialogStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, C43716ruY.KWHzl, dialogStyle5);
                        i5 |= 1;
                        bool16 = bool7;
                        str14 = str7;
                        i4 = 13;
                        dialogStyle4 = dialogStyle2;
                        str13 = str6;
                        str12 = str5;
                        i3 = 10;
                        break;
                    case 1:
                        str6 = str13;
                        bool7 = bool16;
                        str5 = str12;
                        i5 |= 2;
                        dialogStyle2 = dialogStyle4;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str14);
                        bool16 = bool7;
                        str14 = str7;
                        i4 = 13;
                        dialogStyle4 = dialogStyle2;
                        str13 = str6;
                        str12 = str5;
                        i3 = 10;
                        break;
                    case 2:
                        i5 |= 4;
                        bool16 = bool16;
                        i4 = 13;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str13);
                        i3 = 10;
                        break;
                    case 3:
                        bool6 = bool16;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str12);
                        i5 |= 8;
                        bool16 = bool6;
                        i4 = 13;
                        i3 = 10;
                        break;
                    case 4:
                        bool6 = bool16;
                        i5 |= 16;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str15);
                        bool16 = bool6;
                        i4 = 13;
                        i3 = 10;
                        break;
                    case 5:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool16);
                        i5 |= 32;
                        bool16 = bool6;
                        i4 = 13;
                        i3 = 10;
                        break;
                    case 6:
                        bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool12);
                        i2 = i5 | 64;
                        i5 = i2;
                        bool6 = bool16;
                        bool16 = bool6;
                        i4 = 13;
                        i3 = 10;
                        break;
                    case 7:
                        i5 |= 128;
                        ctaPopUpData3 = (CtaPopUpData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, CtaPopUpData$$serializer.INSTANCE, ctaPopUpData3);
                        bool6 = bool16;
                        bool16 = bool6;
                        i4 = 13;
                        i3 = 10;
                        break;
                    case 8:
                        i5 |= 256;
                        jsonArray3 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, JsonArraySerializer.INSTANCE, jsonArray3);
                        bool6 = bool16;
                        bool16 = bool6;
                        i4 = 13;
                        i3 = 10;
                        break;
                    case 9:
                        i5 |= 512;
                        bool15 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, bool15);
                        bool6 = bool16;
                        bool16 = bool6;
                        i4 = 13;
                        i3 = 10;
                        break;
                    case 10:
                        freeText2 = (FreeText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FreeText$$serializer.INSTANCE, freeText2);
                        i2 = i5 | 1024;
                        i5 = i2;
                        bool6 = bool16;
                        bool16 = bool6;
                        i4 = 13;
                        i3 = 10;
                        break;
                    case 11:
                        i5 |= 2048;
                        bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, bool13);
                        bool6 = bool16;
                        bool16 = bool6;
                        i4 = 13;
                        i3 = 10;
                        break;
                    case 12:
                        i5 |= 4096;
                        dialogCheckbox2 = (DialogCheckbox) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, DialogCheckbox$$serializer.INSTANCE, dialogCheckbox2);
                        bool6 = bool16;
                        bool16 = bool6;
                        i4 = 13;
                        i3 = 10;
                        break;
                    case 13:
                        i5 |= 8192;
                        bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool14);
                        bool6 = bool16;
                        bool16 = bool6;
                        i4 = 13;
                        i3 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            freeText = freeText2;
            bool = bool12;
            ctaPopUpData = ctaPopUpData3;
            bool2 = bool13;
            bool3 = bool14;
            dialogCheckbox = dialogCheckbox2;
            str = str15;
            bool4 = bool16;
            str2 = str14;
            str3 = str13;
            i = i5;
            bool5 = bool15;
            str4 = str12;
            jsonArray = jsonArray3;
            dialogStyle = dialogStyle4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ButtonDialogData(i, dialogStyle, str2, str3, str4, str, bool4, bool, ctaPopUpData, jsonArray, bool5, freeText, bool2, dialogCheckbox, bool3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ButtonDialogData buttonDialogData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(buttonDialogData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ButtonDialogData.write$Self$OKCompliance_ok_compliance_impl(buttonDialogData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
