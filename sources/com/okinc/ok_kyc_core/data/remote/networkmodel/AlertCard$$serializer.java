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
public final /* synthetic */ class AlertCard$$serializer implements GeneratedSerializer<AlertCard> {
    public static final int $stable;
    public static final AlertCard$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AlertCard$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AlertCard$$serializer alertCard$$serializer = new AlertCard$$serializer();
        INSTANCE = alertCard$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("alert-card", alertCard$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_STYLE, true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("desc", true);
        pluginGeneratedSerialDescriptor.addElement("closable", true);
        pluginGeneratedSerialDescriptor.addElement("showIcon", true);
        pluginGeneratedSerialDescriptor.addElement("ctaArrow", true);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("cornerRadius", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", true);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(CTAButton$$serializer.INSTANCE);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(CtaPopUpData$$serializer.INSTANCE);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AlertCard deserialize(@NotNull Decoder decoder) {
        Float f;
        CTAButton cTAButton;
        Boolean bool;
        Boolean bool2;
        Float f2;
        CtaPopUpData ctaPopUpData;
        String str;
        String str2;
        Boolean bool3;
        Float f3;
        String str3;
        String str4;
        Boolean bool4;
        String str5;
        int i;
        String str6;
        String str7;
        CtaPopUpData ctaPopUpData2;
        String str8;
        Boolean bool5;
        String str9;
        CtaPopUpData ctaPopUpData3;
        String str10;
        CtaPopUpData ctaPopUpData4;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str11 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            CTAButton cTAButton2 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, CTAButton$$serializer.INSTANCE, null);
            CtaPopUpData ctaPopUpData5 = (CtaPopUpData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, CtaPopUpData$$serializer.INSTANCE, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, floatSerializer, null);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            Float f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, null);
            str3 = str17;
            f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, null);
            str = str16;
            ctaPopUpData = ctaPopUpData5;
            bool = bool8;
            str6 = str14;
            f2 = f5;
            bool2 = bool9;
            str2 = str12;
            i = 32767;
            cTAButton = cTAButton2;
            str5 = str15;
            f = f4;
            bool3 = bool7;
            bool4 = bool6;
            str4 = str13;
        } else {
            int i4 = 14;
            int i5 = 0;
            boolean z = true;
            String str18 = null;
            Boolean bool10 = null;
            Float f6 = null;
            CTAButton cTAButton3 = null;
            Boolean bool11 = null;
            String str19 = null;
            Boolean bool12 = null;
            Float f7 = null;
            String str20 = null;
            Float f8 = null;
            CtaPopUpData ctaPopUpData6 = null;
            String str21 = null;
            String str22 = null;
            Boolean bool13 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str7 = str11;
                        ctaPopUpData2 = ctaPopUpData6;
                        str8 = str21;
                        bool5 = bool13;
                        str9 = str18;
                        z = false;
                        str18 = str9;
                        str21 = str8;
                        bool13 = bool5;
                        ctaPopUpData6 = ctaPopUpData2;
                        str11 = str7;
                        i4 = 14;
                        break;
                    case 0:
                        str7 = str11;
                        ctaPopUpData2 = ctaPopUpData6;
                        String str23 = str21;
                        bool5 = bool13;
                        str9 = str18;
                        str8 = str23;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str22);
                        i5 |= 1;
                        str18 = str9;
                        str21 = str8;
                        bool13 = bool5;
                        ctaPopUpData6 = ctaPopUpData2;
                        str11 = str7;
                        i4 = 14;
                        break;
                    case 1:
                        str7 = str11;
                        ctaPopUpData2 = ctaPopUpData6;
                        bool5 = bool13;
                        String str24 = str21;
                        str9 = str18;
                        i5 |= 2;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str24);
                        str18 = str9;
                        str21 = str8;
                        bool13 = bool5;
                        ctaPopUpData6 = ctaPopUpData2;
                        str11 = str7;
                        i4 = 14;
                        break;
                    case 2:
                        str7 = str11;
                        ctaPopUpData2 = ctaPopUpData6;
                        bool5 = bool13;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str18);
                        i5 |= 4;
                        bool13 = bool5;
                        ctaPopUpData6 = ctaPopUpData2;
                        str11 = str7;
                        i4 = 14;
                        break;
                    case 3:
                        str7 = str11;
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool10);
                        i5 |= 8;
                        str11 = str7;
                        i4 = 14;
                        break;
                    case 4:
                        ctaPopUpData3 = ctaPopUpData6;
                        bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool13);
                        i5 |= 16;
                        str11 = str11;
                        ctaPopUpData6 = ctaPopUpData3;
                        i4 = 14;
                        break;
                    case 5:
                        str10 = str11;
                        ctaPopUpData4 = ctaPopUpData6;
                        cTAButton3 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, CTAButton$$serializer.INSTANCE, cTAButton3);
                        i2 = i5 | 32;
                        ctaPopUpData3 = ctaPopUpData4;
                        i5 = i2;
                        str11 = str10;
                        ctaPopUpData6 = ctaPopUpData3;
                        i4 = 14;
                        break;
                    case 6:
                        str10 = str11;
                        ctaPopUpData4 = (CtaPopUpData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, CtaPopUpData$$serializer.INSTANCE, ctaPopUpData6);
                        i2 = i5 | 64;
                        ctaPopUpData3 = ctaPopUpData4;
                        i5 = i2;
                        str11 = str10;
                        ctaPopUpData6 = ctaPopUpData3;
                        i4 = 14;
                        break;
                    case 7:
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, FloatSerializer.INSTANCE, f6);
                        i3 = i5 | 128;
                        i5 = i3;
                        ctaPopUpData3 = ctaPopUpData6;
                        ctaPopUpData6 = ctaPopUpData3;
                        i4 = 14;
                        break;
                    case 8:
                        i5 |= 256;
                        ctaPopUpData3 = ctaPopUpData6;
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool11);
                        ctaPopUpData6 = ctaPopUpData3;
                        i4 = 14;
                        break;
                    case 9:
                        i5 |= 512;
                        ctaPopUpData3 = ctaPopUpData6;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str19);
                        ctaPopUpData6 = ctaPopUpData3;
                        i4 = 14;
                        break;
                    case 10:
                        i5 |= 1024;
                        ctaPopUpData3 = ctaPopUpData6;
                        bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool12);
                        ctaPopUpData6 = ctaPopUpData3;
                        i4 = 14;
                        break;
                    case 11:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str11);
                        i3 = i5 | 2048;
                        i5 = i3;
                        ctaPopUpData3 = ctaPopUpData6;
                        ctaPopUpData6 = ctaPopUpData3;
                        i4 = 14;
                        break;
                    case 12:
                        i5 |= 4096;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str20);
                        ctaPopUpData3 = ctaPopUpData6;
                        ctaPopUpData6 = ctaPopUpData3;
                        i4 = 14;
                        break;
                    case 13:
                        i5 |= 8192;
                        f8 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, FloatSerializer.INSTANCE, f8);
                        ctaPopUpData3 = ctaPopUpData6;
                        ctaPopUpData6 = ctaPopUpData3;
                        i4 = 14;
                        break;
                    case 14:
                        i5 |= 16384;
                        ctaPopUpData3 = ctaPopUpData6;
                        f7 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, FloatSerializer.INSTANCE, f7);
                        ctaPopUpData6 = ctaPopUpData3;
                        i4 = 14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            f = f6;
            cTAButton = cTAButton3;
            bool = bool11;
            bool2 = bool12;
            f2 = f8;
            ctaPopUpData = ctaPopUpData6;
            str = str11;
            str2 = str22;
            bool3 = bool13;
            f3 = f7;
            str3 = str20;
            str4 = str21;
            bool4 = bool10;
            str5 = str19;
            i = i5;
            str6 = str18;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AlertCard(i, str2, str4, str6, bool4, bool3, cTAButton, ctaPopUpData, f, bool, str5, bool2, str, str3, f2, f3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AlertCard alertCard) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(alertCard, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AlertCard.write$Self$OKCompliance_ok_compliance_impl(alertCard, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
