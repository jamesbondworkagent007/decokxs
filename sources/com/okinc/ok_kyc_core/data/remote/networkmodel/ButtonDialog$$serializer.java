package com.okinc.ok_kyc_core.data.remote.networkmodel;

import java.util.List;
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
import o.C43716ruY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ButtonDialog$$serializer implements GeneratedSerializer<ButtonDialog> {
    public static final int $stable;
    public static final ButtonDialog$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ButtonDialog$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ButtonDialog$$serializer buttonDialog$$serializer = new ButtonDialog$$serializer();
        INSTANCE = buttonDialog$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog", buttonDialog$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("position", true);
        pluginGeneratedSerialDescriptor.addElement("pageId", true);
        pluginGeneratedSerialDescriptor.addElement("entryPageId", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("iconState", true);
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
        KSerializer[] kSerializerArr = ButtonDialog.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable(C43716ruY.KWHzl);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(CtaPopUp$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[9]), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(FreeTextAppModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(DialogCheckboxAppModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ButtonDialog deserialize(@NotNull Decoder decoder) {
        List list;
        Boolean bool;
        Boolean bool2;
        FreeTextAppModel freeTextAppModel;
        String str;
        Boolean bool3;
        Boolean bool4;
        String str2;
        String str3;
        int i;
        DialogCheckboxAppModel dialogCheckboxAppModel;
        String str4;
        Boolean bool5;
        CtaPopUp ctaPopUp;
        String str5;
        DialogStyle dialogStyle;
        KSerializer[] kSerializerArr;
        Boolean bool6;
        Boolean bool7;
        KSerializer[] kSerializerArr2;
        String str6;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        String str7;
        String str8;
        DialogStyle dialogStyle2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = ButtonDialog.$childSerializers;
        String str9 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DialogStyle dialogStyle3 = (DialogStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, C43716ruY.KWHzl, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            Boolean bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            CtaPopUp ctaPopUp2 = (CtaPopUp) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, CtaPopUp$$serializer.INSTANCE, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr3[9], null);
            Boolean bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            FreeTextAppModel freeTextAppModel2 = (FreeTextAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FreeTextAppModel$$serializer.INSTANCE, null);
            Boolean bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            dialogCheckboxAppModel = (DialogCheckboxAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, DialogCheckboxAppModel$$serializer.INSTANCE, null);
            bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, booleanSerializer, null);
            str = str13;
            list = list2;
            bool3 = bool12;
            bool2 = bool14;
            str5 = str11;
            ctaPopUp = ctaPopUp2;
            bool5 = bool11;
            str3 = str12;
            str2 = str14;
            str4 = str10;
            i = 32767;
            dialogStyle = dialogStyle3;
            freeTextAppModel = freeTextAppModel2;
            bool = bool13;
        } else {
            int i2 = 14;
            int i3 = 0;
            boolean z = true;
            String str15 = null;
            Boolean bool15 = null;
            String str16 = null;
            CtaPopUp ctaPopUp3 = null;
            List list3 = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            FreeTextAppModel freeTextAppModel3 = null;
            DialogCheckboxAppModel dialogCheckboxAppModel2 = null;
            Boolean bool18 = null;
            Boolean bool19 = null;
            String str17 = null;
            String str18 = null;
            DialogStyle dialogStyle4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        str6 = str15;
                        bool8 = bool15;
                        bool9 = bool18;
                        bool10 = bool19;
                        str7 = str17;
                        DialogStyle dialogStyle5 = dialogStyle4;
                        str8 = str18;
                        z = false;
                        dialogStyle2 = dialogStyle5;
                        bool19 = bool10;
                        str17 = str7;
                        str15 = str6;
                        bool18 = bool9;
                        bool15 = bool8;
                        str18 = str8;
                        kSerializerArr3 = kSerializerArr2;
                        dialogStyle4 = dialogStyle2;
                        i2 = 14;
                        break;
                    case 0:
                        kSerializerArr2 = kSerializerArr3;
                        str6 = str15;
                        bool8 = bool15;
                        bool9 = bool18;
                        bool10 = bool19;
                        str7 = str17;
                        DialogStyle dialogStyle6 = dialogStyle4;
                        str8 = str18;
                        dialogStyle2 = (DialogStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, C43716ruY.KWHzl, dialogStyle6);
                        i3 |= 1;
                        bool19 = bool10;
                        str17 = str7;
                        str15 = str6;
                        bool18 = bool9;
                        bool15 = bool8;
                        str18 = str8;
                        kSerializerArr3 = kSerializerArr2;
                        dialogStyle4 = dialogStyle2;
                        i2 = 14;
                        break;
                    case 1:
                        kSerializerArr2 = kSerializerArr3;
                        bool8 = bool15;
                        bool9 = bool18;
                        bool10 = bool19;
                        str7 = str17;
                        str6 = str15;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str18);
                        i3 |= 2;
                        dialogStyle2 = dialogStyle4;
                        str8 = str18;
                        bool19 = bool10;
                        str17 = str7;
                        str15 = str6;
                        bool18 = bool9;
                        bool15 = bool8;
                        str18 = str8;
                        kSerializerArr3 = kSerializerArr2;
                        dialogStyle4 = dialogStyle2;
                        i2 = 14;
                        break;
                    case 2:
                        kSerializerArr2 = kSerializerArr3;
                        bool8 = bool15;
                        bool9 = bool18;
                        bool10 = bool19;
                        str7 = str17;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str9);
                        i3 |= 4;
                        str6 = str15;
                        dialogStyle2 = dialogStyle4;
                        str8 = str18;
                        bool19 = bool10;
                        str17 = str7;
                        str15 = str6;
                        bool18 = bool9;
                        bool15 = bool8;
                        str18 = str8;
                        kSerializerArr3 = kSerializerArr2;
                        dialogStyle4 = dialogStyle2;
                        i2 = 14;
                        break;
                    case 3:
                        kSerializerArr2 = kSerializerArr3;
                        bool8 = bool15;
                        bool9 = bool18;
                        bool10 = bool19;
                        str7 = str17;
                        i3 |= 8;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str16);
                        str6 = str15;
                        dialogStyle2 = dialogStyle4;
                        str8 = str18;
                        bool19 = bool10;
                        str17 = str7;
                        str15 = str6;
                        bool18 = bool9;
                        bool15 = bool8;
                        str18 = str8;
                        kSerializerArr3 = kSerializerArr2;
                        dialogStyle4 = dialogStyle2;
                        i2 = 14;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr3;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str15);
                        i3 |= 16;
                        bool15 = bool15;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 14;
                        break;
                    case 5:
                        kSerializerArr = kSerializerArr3;
                        bool6 = bool18;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str17);
                        bool7 = bool19;
                        i3 |= 32;
                        bool15 = bool15;
                        bool19 = bool7;
                        bool18 = bool6;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 14;
                        break;
                    case 6:
                        kSerializerArr = kSerializerArr3;
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool19);
                        bool6 = bool18;
                        i3 |= 64;
                        bool15 = bool15;
                        bool19 = bool7;
                        bool18 = bool6;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 14;
                        break;
                    case 7:
                        kSerializerArr = kSerializerArr3;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool18);
                        i3 |= 128;
                        bool15 = bool15;
                        bool7 = bool19;
                        bool19 = bool7;
                        bool18 = bool6;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 14;
                        break;
                    case 8:
                        kSerializerArr = kSerializerArr3;
                        i3 |= 256;
                        bool6 = bool18;
                        ctaPopUp3 = (CtaPopUp) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, CtaPopUp$$serializer.INSTANCE, ctaPopUp3);
                        bool7 = bool19;
                        bool19 = bool7;
                        bool18 = bool6;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 14;
                        break;
                    case 9:
                        kSerializerArr = kSerializerArr3;
                        i3 |= 512;
                        bool6 = bool18;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr3[9], list3);
                        bool7 = bool19;
                        bool19 = bool7;
                        bool18 = bool6;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 14;
                        break;
                    case 10:
                        kSerializerArr = kSerializerArr3;
                        i3 |= 1024;
                        bool6 = bool18;
                        bool7 = bool19;
                        bool16 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool16);
                        bool19 = bool7;
                        bool18 = bool6;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 14;
                        break;
                    case 11:
                        i3 |= 2048;
                        kSerializerArr = kSerializerArr3;
                        freeTextAppModel3 = (FreeTextAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FreeTextAppModel$$serializer.INSTANCE, freeTextAppModel3);
                        bool6 = bool18;
                        bool7 = bool19;
                        bool19 = bool7;
                        bool18 = bool6;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 14;
                        break;
                    case 12:
                        kSerializerArr = kSerializerArr3;
                        i3 |= 4096;
                        bool6 = bool18;
                        bool7 = bool19;
                        bool17 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, bool17);
                        bool19 = bool7;
                        bool18 = bool6;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 14;
                        break;
                    case 13:
                        i3 |= 8192;
                        kSerializerArr = kSerializerArr3;
                        dialogCheckboxAppModel2 = (DialogCheckboxAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, DialogCheckboxAppModel$$serializer.INSTANCE, dialogCheckboxAppModel2);
                        bool6 = bool18;
                        bool7 = bool19;
                        bool19 = bool7;
                        bool18 = bool6;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 14;
                        break;
                    case 14:
                        Boolean bool20 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool15);
                        kSerializerArr = kSerializerArr3;
                        i3 |= 16384;
                        bool6 = bool18;
                        bool7 = bool19;
                        bool15 = bool20;
                        bool19 = bool7;
                        bool18 = bool6;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list3;
            bool = bool16;
            bool2 = bool17;
            freeTextAppModel = freeTextAppModel3;
            str = str15;
            bool3 = bool18;
            bool4 = bool15;
            str2 = str17;
            str3 = str16;
            i = i3;
            dialogCheckboxAppModel = dialogCheckboxAppModel2;
            str4 = str18;
            bool5 = bool19;
            ctaPopUp = ctaPopUp3;
            str5 = str9;
            dialogStyle = dialogStyle4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ButtonDialog(i, dialogStyle, str4, str5, str3, str, str2, bool5, bool3, ctaPopUp, list, bool, freeTextAppModel, bool2, dialogCheckboxAppModel, bool4, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ButtonDialog buttonDialog) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(buttonDialog, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ButtonDialog.write$Self$OKCompliance_ok_compliance_impl(buttonDialog, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
