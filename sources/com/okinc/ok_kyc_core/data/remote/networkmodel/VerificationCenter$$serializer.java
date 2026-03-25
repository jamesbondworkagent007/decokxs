package com.okinc.ok_kyc_core.data.remote.networkmodel;

import java.util.HashMap;
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
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class VerificationCenter$$serializer implements GeneratedSerializer<VerificationCenter> {
    public static final int $stable;
    public static final VerificationCenter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private VerificationCenter$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        VerificationCenter$$serializer verificationCenter$$serializer = new VerificationCenter$$serializer();
        INSTANCE = verificationCenter$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("verificationCenter", verificationCenter$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("pageTitle", true);
        pluginGeneratedSerialDescriptor.addElement("notifications", true);
        pluginGeneratedSerialDescriptor.addElement("faqUrl", false);
        pluginGeneratedSerialDescriptor.addElement("canGoBack", false);
        pluginGeneratedSerialDescriptor.addElement("canClose", false);
        pluginGeneratedSerialDescriptor.addElement("skipCta", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("amplitudeParams", true);
        pluginGeneratedSerialDescriptor.addElement("pageStack", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.VerificationCenter.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = VerificationCenter.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{JsonArraySerializer.INSTANCE, BuiltinSerializersKt.getNullable(Cta$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(CTAButton$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[14]), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final VerificationCenter deserialize(@NotNull Decoder decoder) {
        JsonArray jsonArray;
        String str;
        String str2;
        CTAButton cTAButton;
        String str3;
        List list;
        String str4;
        Boolean bool;
        String str5;
        Boolean bool2;
        String str6;
        Cta cta;
        HashMap map;
        Boolean bool3;
        String str7;
        int i;
        Boolean bool4;
        String str8;
        HashMap map2;
        String str9;
        HashMap map3;
        KSerializer[] kSerializerArr;
        String str10;
        Boolean bool5;
        HashMap map4;
        String str11;
        String str12;
        List list2;
        JsonArray jsonArray2;
        Boolean bool6;
        Cta cta2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = VerificationCenter.$childSerializers;
        HashMap map5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            JsonArray jsonArray3 = (JsonArray) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, JsonArraySerializer.INSTANCE, null);
            Cta cta3 = (Cta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            CTAButton cTAButton2 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, CTAButton$$serializer.INSTANCE, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            map = (HashMap) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr2[14], null);
            str6 = str19;
            cta = cta3;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, booleanSerializer, null);
            cTAButton = cTAButton2;
            str3 = str15;
            bool3 = bool8;
            bool4 = bool9;
            str2 = str18;
            str7 = str17;
            str4 = str16;
            jsonArray = jsonArray3;
            list = list3;
            str = str14;
            bool2 = bool7;
            str5 = str13;
            i = 65535;
        } else {
            int i2 = 15;
            int i3 = 0;
            boolean z = true;
            String str20 = null;
            Boolean bool10 = null;
            String str21 = null;
            String str22 = null;
            CTAButton cTAButton3 = null;
            String str23 = null;
            Boolean bool11 = null;
            String str24 = null;
            Boolean bool12 = null;
            String str25 = null;
            String str26 = null;
            Cta cta4 = null;
            List list4 = null;
            JsonArray jsonArray4 = null;
            Boolean bool13 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        str10 = str20;
                        bool5 = bool10;
                        map4 = map5;
                        str11 = str25;
                        str12 = str26;
                        list2 = list4;
                        jsonArray2 = jsonArray4;
                        bool6 = bool13;
                        cta2 = cta4;
                        z = false;
                        str25 = str11;
                        bool13 = bool6;
                        list4 = list2;
                        str26 = str12;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool5;
                        str20 = str10;
                        cta4 = cta2;
                        map5 = map4;
                        jsonArray4 = jsonArray2;
                        i2 = 15;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        str10 = str20;
                        bool5 = bool10;
                        map4 = map5;
                        str11 = str25;
                        str12 = str26;
                        list2 = list4;
                        bool6 = bool13;
                        JsonArray jsonArray5 = jsonArray4;
                        cta2 = cta4;
                        jsonArray2 = (JsonArray) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, JsonArraySerializer.INSTANCE, jsonArray5);
                        i3 |= 1;
                        str25 = str11;
                        bool13 = bool6;
                        list4 = list2;
                        str26 = str12;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool5;
                        str20 = str10;
                        cta4 = cta2;
                        map5 = map4;
                        jsonArray4 = jsonArray2;
                        i2 = 15;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        str10 = str20;
                        bool5 = bool10;
                        map4 = map5;
                        str11 = str25;
                        list2 = list4;
                        bool6 = bool13;
                        str12 = str26;
                        i3 |= 2;
                        jsonArray2 = jsonArray4;
                        cta2 = (Cta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, cta4);
                        str25 = str11;
                        bool13 = bool6;
                        list4 = list2;
                        str26 = str12;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool5;
                        str20 = str10;
                        cta4 = cta2;
                        map5 = map4;
                        jsonArray4 = jsonArray2;
                        i2 = 15;
                        break;
                    case 2:
                        str10 = str20;
                        bool5 = bool10;
                        map4 = map5;
                        str11 = str25;
                        list2 = list4;
                        bool6 = bool13;
                        kSerializerArr = kSerializerArr2;
                        i3 |= 4;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str26);
                        jsonArray2 = jsonArray4;
                        cta2 = cta4;
                        str25 = str11;
                        bool13 = bool6;
                        list4 = list2;
                        str26 = str12;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool5;
                        str20 = str10;
                        cta4 = cta2;
                        map5 = map4;
                        jsonArray4 = jsonArray2;
                        i2 = 15;
                        break;
                    case 3:
                        str10 = str20;
                        bool5 = bool10;
                        map4 = map5;
                        str11 = str25;
                        bool6 = bool13;
                        i3 |= 8;
                        kSerializerArr = kSerializerArr2;
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], list4);
                        str12 = str26;
                        jsonArray2 = jsonArray4;
                        cta2 = cta4;
                        str25 = str11;
                        bool13 = bool6;
                        list4 = list2;
                        str26 = str12;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool5;
                        str20 = str10;
                        cta4 = cta2;
                        map5 = map4;
                        jsonArray4 = jsonArray2;
                        i2 = 15;
                        break;
                    case 4:
                        str8 = str20;
                        map2 = map5;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str25);
                        i3 |= 16;
                        bool10 = bool10;
                        str20 = str8;
                        map5 = map2;
                        i2 = 15;
                        break;
                    case 5:
                        str8 = str20;
                        map2 = map5;
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool10);
                        i3 |= 32;
                        str20 = str8;
                        map5 = map2;
                        i2 = 15;
                        break;
                    case 6:
                        bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool13);
                        i3 |= 64;
                        str9 = str20;
                        map5 = map5;
                        str20 = str9;
                        i2 = 15;
                        break;
                    case 7:
                        i3 |= 128;
                        map5 = map5;
                        cTAButton3 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, CTAButton$$serializer.INSTANCE, cTAButton3);
                        str9 = str20;
                        str20 = str9;
                        i2 = 15;
                        break;
                    case 8:
                        map3 = map5;
                        i3 |= 256;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str23);
                        str9 = str20;
                        map5 = map3;
                        str20 = str9;
                        i2 = 15;
                        break;
                    case 9:
                        map3 = map5;
                        i3 |= 512;
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, bool11);
                        str9 = str20;
                        map5 = map3;
                        str20 = str9;
                        i2 = 15;
                        break;
                    case 10:
                        map3 = map5;
                        i3 |= 1024;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str24);
                        str9 = str20;
                        map5 = map3;
                        str20 = str9;
                        i2 = 15;
                        break;
                    case 11:
                        i3 |= 2048;
                        map5 = map5;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str22);
                        str9 = str20;
                        str20 = str9;
                        i2 = 15;
                        break;
                    case 12:
                        i3 |= 4096;
                        map5 = map5;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str21);
                        str9 = str20;
                        str20 = str9;
                        i2 = 15;
                        break;
                    case 13:
                        map3 = map5;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str20);
                        i3 |= 8192;
                        map5 = map3;
                        str20 = str9;
                        i2 = 15;
                        break;
                    case 14:
                        i3 |= 16384;
                        map5 = (HashMap) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr2[14], map5);
                        str9 = str20;
                        str20 = str9;
                        i2 = 15;
                        break;
                    case 15:
                        Boolean bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool12);
                        i3 |= 32768;
                        str9 = str20;
                        bool12 = bool14;
                        str20 = str9;
                        i2 = 15;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            jsonArray = jsonArray4;
            str = str25;
            str2 = str21;
            cTAButton = cTAButton3;
            str3 = str23;
            list = list4;
            str4 = str24;
            bool = bool12;
            str5 = str26;
            bool2 = bool10;
            str6 = str20;
            cta = cta4;
            map = map5;
            bool3 = bool13;
            str7 = str22;
            i = i3;
            bool4 = bool11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new VerificationCenter(i, jsonArray, cta, str5, list, str, bool2, bool3, cTAButton, str3, bool4, str4, str7, str2, str6, map, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull VerificationCenter verificationCenter) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(verificationCenter, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        VerificationCenter.write$Self$OKCompliance_ok_compliance_impl(verificationCenter, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
