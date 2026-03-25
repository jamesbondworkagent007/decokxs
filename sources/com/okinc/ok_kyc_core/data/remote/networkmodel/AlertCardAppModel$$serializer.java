package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
public final /* synthetic */ class AlertCardAppModel$$serializer implements GeneratedSerializer<AlertCardAppModel> {
    public static final int $stable;
    public static final AlertCardAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AlertCardAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AlertCardAppModel$$serializer alertCardAppModel$$serializer = new AlertCardAppModel$$serializer();
        INSTANCE = alertCardAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel", alertCardAppModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_STYLE, true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("desc", true);
        pluginGeneratedSerialDescriptor.addElement("closable", true);
        pluginGeneratedSerialDescriptor.addElement("showIcon", true);
        pluginGeneratedSerialDescriptor.addElement("ctaArrow", true);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("cornerRadius", true);
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
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(CTAButtonAppModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CtaPopUp$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AlertCardAppModel deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        Float f;
        String str;
        Float f2;
        CTAButtonAppModel cTAButtonAppModel;
        Boolean bool;
        Boolean bool2;
        Float f3;
        CtaPopUp ctaPopUp;
        String str2;
        String str3;
        Boolean bool3;
        String str4;
        String str5;
        Boolean bool4;
        int i;
        Boolean bool5;
        CtaPopUp ctaPopUp2;
        CtaPopUp ctaPopUp3;
        int i2;
        int i3;
        CtaPopUp ctaPopUp4;
        String str6;
        Boolean bool6;
        Boolean bool7;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 9;
        int i5 = 8;
        String str8 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            CTAButtonAppModel cTAButtonAppModel2 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, CTAButtonAppModel$$serializer.INSTANCE, null);
            CtaPopUp ctaPopUp5 = (CtaPopUp) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, CtaPopUp$$serializer.INSTANCE, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, floatSerializer, null);
            Boolean bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            Boolean bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            Float f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, null);
            str = str13;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, null);
            i = 32767;
            str3 = str12;
            cTAButtonAppModel = cTAButtonAppModel2;
            strDecodeStringElement = strDecodeStringElement2;
            f2 = f4;
            f3 = f5;
            bool2 = bool11;
            ctaPopUp = ctaPopUp5;
            bool = bool9;
            str2 = str11;
            bool3 = bool8;
            str5 = str9;
            bool4 = bool10;
            str4 = str10;
        } else {
            int i6 = 14;
            int i7 = 0;
            boolean z = true;
            String str14 = null;
            Float f6 = null;
            Float f7 = null;
            CTAButtonAppModel cTAButtonAppModel3 = null;
            Boolean bool12 = null;
            String str15 = null;
            Boolean bool13 = null;
            Float f8 = null;
            strDecodeStringElement = null;
            CtaPopUp ctaPopUp6 = null;
            String str16 = null;
            String str17 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        ctaPopUp4 = ctaPopUp6;
                        str6 = str16;
                        bool6 = bool14;
                        bool7 = bool15;
                        str7 = str14;
                        z = false;
                        bool15 = bool7;
                        bool14 = bool6;
                        ctaPopUp6 = ctaPopUp4;
                        str14 = str7;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        str16 = str6;
                        break;
                    case 0:
                        ctaPopUp4 = ctaPopUp6;
                        String str18 = str16;
                        bool6 = bool14;
                        bool7 = bool15;
                        str7 = str14;
                        str6 = str18;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str17);
                        i7 |= 1;
                        bool15 = bool7;
                        bool14 = bool6;
                        ctaPopUp6 = ctaPopUp4;
                        str14 = str7;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        str16 = str6;
                        break;
                    case 1:
                        ctaPopUp4 = ctaPopUp6;
                        bool6 = bool14;
                        bool7 = bool15;
                        String str19 = str16;
                        str7 = str14;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str19);
                        i7 |= 2;
                        bool15 = bool7;
                        bool14 = bool6;
                        ctaPopUp6 = ctaPopUp4;
                        str14 = str7;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        str16 = str6;
                        break;
                    case 2:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str14);
                        i7 |= 4;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 3:
                        bool5 = bool15;
                        ctaPopUp2 = ctaPopUp6;
                        i7 |= 8;
                        bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool14);
                        bool15 = bool5;
                        ctaPopUp6 = ctaPopUp2;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 4:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool15);
                        ctaPopUp2 = ctaPopUp6;
                        i7 |= 16;
                        bool15 = bool5;
                        ctaPopUp6 = ctaPopUp2;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 5:
                        ctaPopUp3 = ctaPopUp6;
                        cTAButtonAppModel3 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, CTAButtonAppModel$$serializer.INSTANCE, cTAButtonAppModel3);
                        i2 = i7 | 32;
                        ctaPopUp2 = ctaPopUp3;
                        i7 = i2;
                        bool5 = bool15;
                        bool15 = bool5;
                        ctaPopUp6 = ctaPopUp2;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 6:
                        ctaPopUp3 = (CtaPopUp) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, CtaPopUp$$serializer.INSTANCE, ctaPopUp6);
                        i2 = i7 | 64;
                        ctaPopUp2 = ctaPopUp3;
                        i7 = i2;
                        bool5 = bool15;
                        bool15 = bool5;
                        ctaPopUp6 = ctaPopUp2;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 7:
                        f7 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, FloatSerializer.INSTANCE, f7);
                        i3 = i7 | 128;
                        i7 = i3;
                        ctaPopUp2 = ctaPopUp6;
                        bool5 = bool15;
                        bool15 = bool5;
                        ctaPopUp6 = ctaPopUp2;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 8:
                        i7 |= 256;
                        bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool12);
                        ctaPopUp2 = ctaPopUp6;
                        bool5 = bool15;
                        bool15 = bool5;
                        ctaPopUp6 = ctaPopUp2;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 9:
                        i7 |= 512;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        ctaPopUp2 = ctaPopUp6;
                        bool5 = bool15;
                        bool15 = bool5;
                        ctaPopUp6 = ctaPopUp2;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 10:
                        i7 |= 1024;
                        bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool13);
                        ctaPopUp2 = ctaPopUp6;
                        bool5 = bool15;
                        bool15 = bool5;
                        ctaPopUp6 = ctaPopUp2;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 11:
                        i7 |= 2048;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str15);
                        ctaPopUp2 = ctaPopUp6;
                        bool5 = bool15;
                        bool15 = bool5;
                        ctaPopUp6 = ctaPopUp2;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 12:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str8);
                        i3 = i7 | 4096;
                        i7 = i3;
                        ctaPopUp2 = ctaPopUp6;
                        bool5 = bool15;
                        bool15 = bool5;
                        ctaPopUp6 = ctaPopUp2;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 13:
                        i7 |= 8192;
                        f8 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, FloatSerializer.INSTANCE, f8);
                        ctaPopUp2 = ctaPopUp6;
                        bool5 = bool15;
                        bool15 = bool5;
                        ctaPopUp6 = ctaPopUp2;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 14:
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, FloatSerializer.INSTANCE, f6);
                        i3 = i7 | 16384;
                        i7 = i3;
                        ctaPopUp2 = ctaPopUp6;
                        bool5 = bool15;
                        bool15 = bool5;
                        ctaPopUp6 = ctaPopUp2;
                        i6 = 14;
                        i4 = 9;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            CtaPopUp ctaPopUp7 = ctaPopUp6;
            f = f6;
            str = str8;
            f2 = f7;
            cTAButtonAppModel = cTAButtonAppModel3;
            bool = bool15;
            bool2 = bool13;
            f3 = f8;
            ctaPopUp = ctaPopUp7;
            str2 = str14;
            str3 = str15;
            bool3 = bool14;
            str4 = str16;
            str5 = str17;
            bool4 = bool12;
            i = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AlertCardAppModel(i, str5, str4, str2, bool3, bool, cTAButtonAppModel, ctaPopUp, f2, bool4, strDecodeStringElement, bool2, str3, str, f3, f, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AlertCardAppModel alertCardAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(alertCardAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AlertCardAppModel.write$Self$OKCompliance_ok_compliance_impl(alertCardAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
