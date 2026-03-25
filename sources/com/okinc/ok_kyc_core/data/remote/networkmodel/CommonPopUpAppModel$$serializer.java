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
public final /* synthetic */ class CommonPopUpAppModel$$serializer implements GeneratedSerializer<CommonPopUpAppModel> {
    public static final int $stable;
    public static final CommonPopUpAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CommonPopUpAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CommonPopUpAppModel$$serializer commonPopUpAppModel$$serializer = new CommonPopUpAppModel$$serializer();
        INSTANCE = commonPopUpAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.CommonPopUpAppModel", commonPopUpAppModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("position", true);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("iconState", false);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("shouldShowCloseButton", true);
        pluginGeneratedSerialDescriptor.addElement("dialogBottomText", true);
        pluginGeneratedSerialDescriptor.addElement("allowClose", true);
        pluginGeneratedSerialDescriptor.addElement("isDismissable", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.CommonPopUpAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CommonPopUpAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(C43716ruY.KWHzl), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(CtaPopUp$$serializer.INSTANCE), kSerializerArr[6], BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(FreeTextAppModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CommonPopUpAppModel deserialize(@NotNull Decoder decoder) {
        CtaPopUp ctaPopUp;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        String str;
        String str2;
        String str3;
        List list;
        Boolean bool4;
        String str4;
        String str5;
        String str6;
        FreeTextAppModel freeTextAppModel;
        int i;
        String str7;
        DialogStyle dialogStyle;
        Boolean bool5;
        CtaPopUp ctaPopUp2;
        KSerializer[] kSerializerArr;
        Boolean bool6;
        String str8;
        Boolean bool7;
        CtaPopUp ctaPopUp3;
        String str9;
        DialogStyle dialogStyle2;
        String str10;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = CommonPopUpAppModel.$childSerializers;
        int i2 = 9;
        char c = '\b';
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DialogStyle dialogStyle3 = (DialogStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, C43716ruY.KWHzl, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            CtaPopUp ctaPopUp4 = (CtaPopUp) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, CtaPopUp$$serializer.INSTANCE, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr2[6], null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            FreeTextAppModel freeTextAppModel2 = (FreeTextAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FreeTextAppModel$$serializer.INSTANCE, null);
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            Boolean bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            list = list2;
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            bool3 = bool9;
            bool2 = bool8;
            freeTextAppModel = freeTextAppModel2;
            bool = bool10;
            str = str12;
            str4 = strDecodeStringElement;
            str5 = strDecodeStringElement2;
            dialogStyle = dialogStyle3;
            ctaPopUp = ctaPopUp4;
            str2 = str11;
            i = 32767;
        } else {
            int i3 = 14;
            boolean z = true;
            FreeTextAppModel freeTextAppModel3 = null;
            Boolean bool11 = null;
            String str13 = null;
            Boolean bool12 = null;
            String str14 = null;
            String str15 = null;
            List list3 = null;
            String str16 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            Boolean bool13 = null;
            CtaPopUp ctaPopUp5 = null;
            String str17 = null;
            DialogStyle dialogStyle4 = null;
            int i4 = 0;
            Boolean bool14 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        bool6 = bool14;
                        str8 = str16;
                        bool7 = bool13;
                        ctaPopUp3 = ctaPopUp5;
                        DialogStyle dialogStyle5 = dialogStyle4;
                        str9 = str17;
                        z = false;
                        dialogStyle2 = dialogStyle5;
                        ctaPopUp5 = ctaPopUp3;
                        bool13 = bool7;
                        str16 = str8;
                        kSerializerArr2 = kSerializerArr;
                        str17 = str9;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        dialogStyle4 = dialogStyle2;
                        bool14 = bool6;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        bool6 = bool14;
                        str8 = str16;
                        bool7 = bool13;
                        ctaPopUp3 = ctaPopUp5;
                        DialogStyle dialogStyle6 = dialogStyle4;
                        str9 = str17;
                        dialogStyle2 = (DialogStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, C43716ruY.KWHzl, dialogStyle6);
                        i4 |= 1;
                        ctaPopUp5 = ctaPopUp3;
                        bool13 = bool7;
                        str16 = str8;
                        kSerializerArr2 = kSerializerArr;
                        str17 = str9;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        dialogStyle4 = dialogStyle2;
                        bool14 = bool6;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        bool6 = bool14;
                        str8 = str16;
                        bool7 = bool13;
                        ctaPopUp3 = ctaPopUp5;
                        str10 = str17;
                        i4 |= 2;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        dialogStyle2 = dialogStyle4;
                        str9 = str10;
                        ctaPopUp5 = ctaPopUp3;
                        bool13 = bool7;
                        str16 = str8;
                        kSerializerArr2 = kSerializerArr;
                        str17 = str9;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        dialogStyle4 = dialogStyle2;
                        bool14 = bool6;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr2;
                        str8 = str16;
                        bool7 = bool13;
                        ctaPopUp3 = ctaPopUp5;
                        bool6 = bool14;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str17);
                        i4 |= 4;
                        dialogStyle2 = dialogStyle4;
                        str9 = str10;
                        ctaPopUp5 = ctaPopUp3;
                        bool13 = bool7;
                        str16 = str8;
                        kSerializerArr2 = kSerializerArr;
                        str17 = str9;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        dialogStyle4 = dialogStyle2;
                        bool14 = bool6;
                        break;
                    case 3:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str16);
                        i4 |= 8;
                        kSerializerArr2 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        break;
                    case 4:
                        bool5 = bool13;
                        ctaPopUp2 = ctaPopUp5;
                        i4 |= 16;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str14);
                        ctaPopUp5 = ctaPopUp2;
                        bool13 = bool5;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        break;
                    case 5:
                        bool5 = bool13;
                        ctaPopUp2 = (CtaPopUp) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, CtaPopUp$$serializer.INSTANCE, ctaPopUp5);
                        i4 |= 32;
                        ctaPopUp5 = ctaPopUp2;
                        bool13 = bool5;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        break;
                    case 6:
                        bool5 = bool13;
                        i4 |= 64;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr2[6], list3);
                        ctaPopUp2 = ctaPopUp5;
                        ctaPopUp5 = ctaPopUp2;
                        bool13 = bool5;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        break;
                    case 7:
                        i4 |= 128;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool13);
                        ctaPopUp2 = ctaPopUp5;
                        ctaPopUp5 = ctaPopUp2;
                        bool13 = bool5;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        break;
                    case 8:
                        freeTextAppModel3 = (FreeTextAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FreeTextAppModel$$serializer.INSTANCE, freeTextAppModel3);
                        i4 |= 256;
                        bool5 = bool13;
                        ctaPopUp2 = ctaPopUp5;
                        ctaPopUp5 = ctaPopUp2;
                        bool13 = bool5;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        break;
                    case 9:
                        i4 |= 512;
                        bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool12);
                        bool5 = bool13;
                        ctaPopUp2 = ctaPopUp5;
                        ctaPopUp5 = ctaPopUp2;
                        bool13 = bool5;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        break;
                    case 10:
                        i4 |= 1024;
                        bool5 = bool13;
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool11);
                        ctaPopUp2 = ctaPopUp5;
                        ctaPopUp5 = ctaPopUp2;
                        bool13 = bool5;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        break;
                    case 11:
                        i4 |= 2048;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        bool5 = bool13;
                        ctaPopUp2 = ctaPopUp5;
                        ctaPopUp5 = ctaPopUp2;
                        bool13 = bool5;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        break;
                    case 12:
                        bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, bool14);
                        i4 |= 4096;
                        bool5 = bool13;
                        ctaPopUp2 = ctaPopUp5;
                        ctaPopUp5 = ctaPopUp2;
                        bool13 = bool5;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        break;
                    case 13:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str13);
                        i4 |= 8192;
                        bool5 = bool13;
                        ctaPopUp2 = ctaPopUp5;
                        ctaPopUp5 = ctaPopUp2;
                        bool13 = bool5;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        break;
                    case 14:
                        i4 |= 16384;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str15);
                        bool5 = bool13;
                        ctaPopUp2 = ctaPopUp5;
                        ctaPopUp5 = ctaPopUp2;
                        bool13 = bool5;
                        i3 = 14;
                        i2 = 9;
                        c = '\b';
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str18 = str16;
            ctaPopUp = ctaPopUp5;
            bool = bool11;
            bool2 = bool13;
            bool3 = bool12;
            str = str14;
            str2 = str18;
            str3 = str15;
            list = list3;
            bool4 = bool14;
            str4 = strDecodeStringElement3;
            str5 = strDecodeStringElement4;
            str6 = str17;
            freeTextAppModel = freeTextAppModel3;
            i = i4;
            str7 = str13;
            dialogStyle = dialogStyle4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CommonPopUpAppModel(i, dialogStyle, str4, str6, str2, str, ctaPopUp, list, bool2, freeTextAppModel, bool3, bool, str5, bool4, str7, str3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CommonPopUpAppModel commonPopUpAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(commonPopUpAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CommonPopUpAppModel.write$Self$OKCompliance_ok_compliance_impl(commonPopUpAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
