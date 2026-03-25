package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.liveness.lca.EopTrackEvent;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class EditCardAppModel$$serializer implements GeneratedSerializer<EditCardAppModel> {
    public static final int $stable;
    public static final EditCardAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EditCardAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EditCardAppModel$$serializer editCardAppModel$$serializer = new EditCardAppModel$$serializer();
        INSTANCE = editCardAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.EditCardAppModel", editCardAppModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("iconHeight", true);
        pluginGeneratedSerialDescriptor.addElement("iconWidth", true);
        pluginGeneratedSerialDescriptor.addElement("iconRenderColor", true);
        pluginGeneratedSerialDescriptor.addElement(EopTrackEvent.KEY_ERROR_MSG_HUMP, true);
        pluginGeneratedSerialDescriptor.addElement("step", true);
        pluginGeneratedSerialDescriptor.addElement("contentList", false);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("ctaArrow", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.EditCardAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = EditCardAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(FreetextStep$$serializer.INSTANCE), kSerializerArr[6], BuiltinSerializersKt.getNullable(CtaAppModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CTAButtonAppModel$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EditCardAppModel deserialize(@NotNull Decoder decoder) {
        Float f;
        String str;
        CtaAppModel ctaAppModel;
        FreetextStep freetextStep;
        String str2;
        String str3;
        String str4;
        int i;
        Boolean bool;
        String str5;
        List list;
        String str6;
        String str7;
        Boolean bool2;
        CTAButtonAppModel cTAButtonAppModel;
        Float f2;
        String str8;
        Boolean bool3;
        CtaAppModel ctaAppModel2;
        KSerializer[] kSerializerArr;
        CtaAppModel ctaAppModel3;
        int i2;
        KSerializer[] kSerializerArr2;
        List list2;
        Boolean bool4;
        Float f3;
        CtaAppModel ctaAppModel4;
        FreetextStep freetextStep2;
        String str9;
        String str10;
        String str11;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = EditCardAppModel.$childSerializers;
        Float f4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            FreetextStep freetextStep3 = (FreetextStep) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, FreetextStep$$serializer.INSTANCE, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr3[6], null);
            CtaAppModel ctaAppModel5 = (CtaAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, CtaAppModel$$serializer.INSTANCE, null);
            CTAButtonAppModel cTAButtonAppModel2 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, CTAButtonAppModel$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, booleanSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, null);
            bool = bool6;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, floatSerializer, null);
            i = 65535;
            freetextStep = freetextStep3;
            str6 = strDecodeStringElement;
            cTAButtonAppModel = cTAButtonAppModel2;
            bool2 = bool5;
            str4 = str18;
            str3 = str17;
            list = list3;
            ctaAppModel = ctaAppModel5;
            str7 = str13;
            str = str16;
            str5 = str14;
            str2 = str15;
            str8 = str12;
        } else {
            int i3 = 15;
            int i4 = 0;
            boolean z = true;
            List list4 = null;
            String str19 = null;
            Boolean bool7 = null;
            String str20 = null;
            String str21 = null;
            CTAButtonAppModel cTAButtonAppModel3 = null;
            String str22 = null;
            Float f5 = null;
            Boolean bool8 = null;
            String strDecodeStringElement2 = null;
            CtaAppModel ctaAppModel6 = null;
            FreetextStep freetextStep4 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        list2 = list4;
                        bool4 = bool7;
                        f3 = f4;
                        ctaAppModel4 = ctaAppModel6;
                        freetextStep2 = freetextStep4;
                        str9 = str23;
                        str10 = str25;
                        str11 = str24;
                        z = false;
                        ctaAppModel6 = ctaAppModel4;
                        freetextStep4 = freetextStep2;
                        str23 = str9;
                        list4 = list2;
                        f4 = f3;
                        str24 = str11;
                        bool7 = bool4;
                        i3 = 15;
                        str25 = str10;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 0:
                        kSerializerArr2 = kSerializerArr3;
                        list2 = list4;
                        bool4 = bool7;
                        f3 = f4;
                        ctaAppModel4 = ctaAppModel6;
                        freetextStep2 = freetextStep4;
                        str9 = str23;
                        String str26 = str25;
                        str11 = str24;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str26);
                        i4 |= 1;
                        ctaAppModel6 = ctaAppModel4;
                        freetextStep4 = freetextStep2;
                        str23 = str9;
                        list4 = list2;
                        f4 = f3;
                        str24 = str11;
                        bool7 = bool4;
                        i3 = 15;
                        str25 = str10;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 1:
                        kSerializerArr2 = kSerializerArr3;
                        list2 = list4;
                        bool4 = bool7;
                        f3 = f4;
                        ctaAppModel4 = ctaAppModel6;
                        freetextStep2 = freetextStep4;
                        str9 = str23;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str24);
                        i4 |= 2;
                        str10 = str25;
                        str11 = str24;
                        ctaAppModel6 = ctaAppModel4;
                        freetextStep4 = freetextStep2;
                        str23 = str9;
                        list4 = list2;
                        f4 = f3;
                        str24 = str11;
                        bool7 = bool4;
                        i3 = 15;
                        str25 = str10;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 2:
                        kSerializerArr2 = kSerializerArr3;
                        bool4 = bool7;
                        f3 = f4;
                        ctaAppModel4 = ctaAppModel6;
                        freetextStep2 = freetextStep4;
                        list2 = list4;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str23);
                        i4 |= 4;
                        str9 = str23;
                        str10 = str25;
                        str11 = str24;
                        ctaAppModel6 = ctaAppModel4;
                        freetextStep4 = freetextStep2;
                        str23 = str9;
                        list4 = list2;
                        f4 = f3;
                        str24 = str11;
                        bool7 = bool4;
                        i3 = 15;
                        str25 = str10;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 3:
                        kSerializerArr2 = kSerializerArr3;
                        bool4 = bool7;
                        f3 = f4;
                        ctaAppModel4 = ctaAppModel6;
                        freetextStep2 = freetextStep4;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str20);
                        list2 = list4;
                        i4 |= 8;
                        str9 = str23;
                        str10 = str25;
                        str11 = str24;
                        ctaAppModel6 = ctaAppModel4;
                        freetextStep4 = freetextStep2;
                        str23 = str9;
                        list4 = list2;
                        f4 = f3;
                        str24 = str11;
                        bool7 = bool4;
                        i3 = 15;
                        str25 = str10;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 4:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str19);
                        i4 |= 16;
                        kSerializerArr3 = kSerializerArr3;
                        f4 = f4;
                        bool7 = bool7;
                        i3 = 15;
                        break;
                    case 5:
                        bool3 = bool7;
                        ctaAppModel2 = ctaAppModel6;
                        kSerializerArr = kSerializerArr3;
                        freetextStep4 = (FreetextStep) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, FreetextStep$$serializer.INSTANCE, freetextStep4);
                        i4 |= 32;
                        f4 = f4;
                        ctaAppModel3 = ctaAppModel2;
                        bool7 = bool3;
                        ctaAppModel6 = ctaAppModel3;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 15;
                        break;
                    case 6:
                        list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr3[6], list4);
                        kSerializerArr = kSerializerArr3;
                        ctaAppModel3 = ctaAppModel6;
                        i4 |= 64;
                        f4 = f4;
                        bool7 = bool7;
                        ctaAppModel6 = ctaAppModel3;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 15;
                        break;
                    case 7:
                        bool3 = bool7;
                        ctaAppModel2 = (CtaAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, CtaAppModel$$serializer.INSTANCE, ctaAppModel6);
                        kSerializerArr = kSerializerArr3;
                        i4 |= 128;
                        f4 = f4;
                        ctaAppModel3 = ctaAppModel2;
                        bool7 = bool3;
                        ctaAppModel6 = ctaAppModel3;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 15;
                        break;
                    case 8:
                        kSerializerArr = kSerializerArr3;
                        i4 |= 256;
                        bool7 = bool7;
                        cTAButtonAppModel3 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, CTAButtonAppModel$$serializer.INSTANCE, cTAButtonAppModel3);
                        ctaAppModel3 = ctaAppModel6;
                        ctaAppModel6 = ctaAppModel3;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 15;
                        break;
                    case 9:
                        i4 |= 512;
                        kSerializerArr = kSerializerArr3;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        ctaAppModel3 = ctaAppModel6;
                        ctaAppModel6 = ctaAppModel3;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 15;
                        break;
                    case 10:
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool7);
                        i2 = i4 | 1024;
                        kSerializerArr = kSerializerArr3;
                        i4 = i2;
                        ctaAppModel3 = ctaAppModel6;
                        ctaAppModel6 = ctaAppModel3;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 15;
                        break;
                    case 11:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str21);
                        i2 = i4 | 2048;
                        kSerializerArr = kSerializerArr3;
                        i4 = i2;
                        ctaAppModel3 = ctaAppModel6;
                        ctaAppModel6 = ctaAppModel3;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 15;
                        break;
                    case 12:
                        kSerializerArr = kSerializerArr3;
                        i4 |= 4096;
                        ctaAppModel3 = ctaAppModel6;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str22);
                        ctaAppModel6 = ctaAppModel3;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 15;
                        break;
                    case 13:
                        i4 |= 8192;
                        kSerializerArr = kSerializerArr3;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, bool8);
                        ctaAppModel3 = ctaAppModel6;
                        ctaAppModel6 = ctaAppModel3;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 15;
                        break;
                    case 14:
                        kSerializerArr = kSerializerArr3;
                        i4 |= 16384;
                        ctaAppModel3 = ctaAppModel6;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, FloatSerializer.INSTANCE, f5);
                        ctaAppModel6 = ctaAppModel3;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 15;
                        break;
                    case 15:
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f4);
                        i2 = 32768 | i4;
                        kSerializerArr = kSerializerArr3;
                        i4 = i2;
                        ctaAppModel3 = ctaAppModel6;
                        ctaAppModel6 = ctaAppModel3;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 15;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            f = f4;
            str = str19;
            ctaAppModel = ctaAppModel6;
            freetextStep = freetextStep4;
            str2 = str20;
            str3 = str21;
            str4 = str22;
            i = i4;
            bool = bool8;
            str5 = str23;
            list = list4;
            str6 = strDecodeStringElement2;
            str7 = str24;
            bool2 = bool7;
            cTAButtonAppModel = cTAButtonAppModel3;
            f2 = f5;
            str8 = str25;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EditCardAppModel(i, str8, str7, str5, str2, str, freetextStep, list, ctaAppModel, cTAButtonAppModel, str6, bool2, str3, str4, bool, f2, f, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EditCardAppModel editCardAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(editCardAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EditCardAppModel.write$Self$OKCompliance_ok_compliance_impl(editCardAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
