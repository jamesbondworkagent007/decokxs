package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.liveness.lca.EopTrackEvent;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class EditCard$$serializer implements GeneratedSerializer<EditCard> {
    public static final int $stable;
    public static final EditCard$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EditCard$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EditCard$$serializer editCard$$serializer = new EditCard$$serializer();
        INSTANCE = editCard$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("edit-card", editCard$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("iconHeight", true);
        pluginGeneratedSerialDescriptor.addElement("iconWidth", true);
        pluginGeneratedSerialDescriptor.addElement("iconRenderColor", true);
        pluginGeneratedSerialDescriptor.addElement(EopTrackEvent.KEY_ERROR_MSG_HUMP, true);
        pluginGeneratedSerialDescriptor.addElement("step", true);
        pluginGeneratedSerialDescriptor.addElement("contentList", false);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("ctaArrow", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(FreetextStep$$serializer.INSTANCE), JsonArraySerializer.INSTANCE, BuiltinSerializersKt.getNullable(Cta$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CTAButton$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EditCard deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        JsonArray jsonArray;
        String str;
        Float f;
        String str2;
        String str3;
        Cta cta;
        Float f2;
        FreetextStep freetextStep;
        String str4;
        Boolean bool2;
        CTAButton cTAButton;
        String str5;
        int i;
        String str6;
        String str7;
        String str8;
        JsonArray jsonArray2;
        Cta cta2;
        int i2;
        String str9;
        Float f3;
        Cta cta3;
        JsonArray jsonArray3;
        String str10;
        String str11;
        FreetextStep freetextStep2;
        FreetextStep freetextStep3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 10;
        Boolean bool3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            FreetextStep freetextStep4 = (FreetextStep) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, FreetextStep$$serializer.INSTANCE, null);
            JsonArray jsonArray4 = (JsonArray) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, JsonArraySerializer.INSTANCE, null);
            Cta cta4 = (Cta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, Cta$$serializer.INSTANCE, null);
            CTAButton cTAButton2 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, CTAButton$$serializer.INSTANCE, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, booleanSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, null);
            bool2 = bool5;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, floatSerializer, null);
            bool = bool4;
            str5 = str17;
            jsonArray = jsonArray4;
            str6 = str19;
            str = str18;
            str7 = str14;
            i = 65535;
            freetextStep = freetextStep4;
            cta = cta4;
            cTAButton = cTAButton2;
            str4 = str12;
            str3 = str16;
            str8 = str15;
            str2 = str13;
        } else {
            int i4 = 15;
            int i5 = 0;
            boolean z = true;
            String str20 = null;
            Float f4 = null;
            Boolean bool6 = null;
            String str21 = null;
            CTAButton cTAButton3 = null;
            String str22 = null;
            String str23 = null;
            Float f5 = null;
            String str24 = null;
            Cta cta5 = null;
            JsonArray jsonArray5 = null;
            FreetextStep freetextStep5 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str20;
                        f3 = f4;
                        cta3 = cta5;
                        jsonArray3 = jsonArray5;
                        str10 = str25;
                        str11 = str26;
                        freetextStep2 = freetextStep5;
                        z = false;
                        str25 = str10;
                        jsonArray5 = jsonArray3;
                        str20 = str9;
                        cta5 = cta3;
                        f4 = f3;
                        freetextStep5 = freetextStep2;
                        i4 = 15;
                        i3 = 10;
                        str26 = str11;
                        break;
                    case 0:
                        str9 = str20;
                        f3 = f4;
                        cta3 = cta5;
                        jsonArray3 = jsonArray5;
                        str10 = str25;
                        String str28 = str26;
                        freetextStep2 = freetextStep5;
                        str11 = str28;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str27);
                        i5 |= 1;
                        str25 = str10;
                        jsonArray5 = jsonArray3;
                        str20 = str9;
                        cta5 = cta3;
                        f4 = f3;
                        freetextStep5 = freetextStep2;
                        i4 = 15;
                        i3 = 10;
                        str26 = str11;
                        break;
                    case 1:
                        str9 = str20;
                        f3 = f4;
                        cta3 = cta5;
                        jsonArray3 = jsonArray5;
                        str10 = str25;
                        String str29 = str26;
                        freetextStep2 = freetextStep5;
                        i5 |= 2;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str29);
                        str25 = str10;
                        jsonArray5 = jsonArray3;
                        str20 = str9;
                        cta5 = cta3;
                        f4 = f3;
                        freetextStep5 = freetextStep2;
                        i4 = 15;
                        i3 = 10;
                        str26 = str11;
                        break;
                    case 2:
                        f3 = f4;
                        cta3 = cta5;
                        jsonArray3 = jsonArray5;
                        freetextStep3 = freetextStep5;
                        str9 = str20;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str25);
                        i5 |= 4;
                        str10 = str25;
                        str11 = str26;
                        freetextStep2 = freetextStep3;
                        str25 = str10;
                        jsonArray5 = jsonArray3;
                        str20 = str9;
                        cta5 = cta3;
                        f4 = f3;
                        freetextStep5 = freetextStep2;
                        i4 = 15;
                        i3 = 10;
                        str26 = str11;
                        break;
                    case 3:
                        f3 = f4;
                        cta3 = cta5;
                        jsonArray3 = jsonArray5;
                        freetextStep3 = freetextStep5;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str21);
                        str9 = str20;
                        i5 |= 8;
                        str10 = str25;
                        str11 = str26;
                        freetextStep2 = freetextStep3;
                        str25 = str10;
                        jsonArray5 = jsonArray3;
                        str20 = str9;
                        cta5 = cta3;
                        f4 = f3;
                        freetextStep5 = freetextStep2;
                        i4 = 15;
                        i3 = 10;
                        str26 = str11;
                        break;
                    case 4:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str20);
                        i5 |= 16;
                        f4 = f4;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 5:
                        jsonArray2 = jsonArray5;
                        cta2 = cta5;
                        freetextStep5 = (FreetextStep) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, FreetextStep$$serializer.INSTANCE, freetextStep5);
                        i5 |= 32;
                        f4 = f4;
                        jsonArray5 = jsonArray2;
                        cta5 = cta2;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 6:
                        jsonArray2 = (JsonArray) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, JsonArraySerializer.INSTANCE, jsonArray5);
                        cta2 = cta5;
                        i5 |= 64;
                        f4 = f4;
                        jsonArray5 = jsonArray2;
                        cta5 = cta2;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 7:
                        cta2 = (Cta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, Cta$$serializer.INSTANCE, cta5);
                        i5 |= 128;
                        jsonArray2 = jsonArray5;
                        jsonArray5 = jsonArray2;
                        cta5 = cta2;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 8:
                        i5 |= 256;
                        cta2 = cta5;
                        jsonArray2 = jsonArray5;
                        cTAButton3 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, CTAButton$$serializer.INSTANCE, cTAButton3);
                        jsonArray5 = jsonArray2;
                        cta5 = cta2;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 9:
                        i5 |= 512;
                        cta2 = cta5;
                        jsonArray2 = jsonArray5;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str22);
                        jsonArray5 = jsonArray2;
                        cta5 = cta2;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 10:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.INSTANCE, bool3);
                        i2 = i5 | 1024;
                        i5 = i2;
                        cta2 = cta5;
                        jsonArray2 = jsonArray5;
                        jsonArray5 = jsonArray2;
                        cta5 = cta2;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 11:
                        i5 |= 2048;
                        cta2 = cta5;
                        jsonArray2 = jsonArray5;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str23);
                        jsonArray5 = jsonArray2;
                        cta5 = cta2;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 12:
                        i5 |= 4096;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str24);
                        cta2 = cta5;
                        jsonArray2 = jsonArray5;
                        jsonArray5 = jsonArray2;
                        cta5 = cta2;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 13:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, bool6);
                        i2 = i5 | 8192;
                        i5 = i2;
                        cta2 = cta5;
                        jsonArray2 = jsonArray5;
                        jsonArray5 = jsonArray2;
                        cta5 = cta2;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 14:
                        i5 |= 16384;
                        cta2 = cta5;
                        jsonArray2 = jsonArray5;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, FloatSerializer.INSTANCE, f5);
                        jsonArray5 = jsonArray2;
                        cta5 = cta2;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 15:
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, FloatSerializer.INSTANCE, f4);
                        i2 = 32768 | i5;
                        i5 = i2;
                        cta2 = cta5;
                        jsonArray2 = jsonArray5;
                        jsonArray5 = jsonArray2;
                        cta5 = cta2;
                        i4 = 15;
                        i3 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            bool = bool3;
            jsonArray = jsonArray5;
            str = str23;
            f = f5;
            str2 = str26;
            str3 = str20;
            cta = cta5;
            f2 = f4;
            freetextStep = freetextStep5;
            str4 = str27;
            bool2 = bool6;
            cTAButton = cTAButton3;
            str5 = str22;
            i = i5;
            str6 = str24;
            str7 = str25;
            str8 = str21;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EditCard(i, str4, str2, str7, str8, str3, freetextStep, jsonArray, cta, cTAButton, str5, bool, str, str6, bool2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.EditCard.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.EditCard, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EditCard editCard) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(editCard, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EditCard.write$Self$OKCompliance_ok_compliance_impl(editCard, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
