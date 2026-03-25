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
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class CtaCard$$serializer implements GeneratedSerializer<CtaCard> {
    public static final int $stable;
    public static final CtaCard$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CtaCard$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CtaCard$$serializer ctaCard$$serializer = new CtaCard$$serializer();
        INSTANCE = ctaCard$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("cta-card", ctaCard$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("tag", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("contentList", true);
        pluginGeneratedSerialDescriptor.addElement("backgroundType", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, true);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("dynamic", true);
        pluginGeneratedSerialDescriptor.addElement("cornerRadius", true);
        pluginGeneratedSerialDescriptor.addElement("paddingLeft", true);
        pluginGeneratedSerialDescriptor.addElement("paddingTop", true);
        pluginGeneratedSerialDescriptor.addElement("paddingRight", true);
        pluginGeneratedSerialDescriptor.addElement("paddingBottom", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
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
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(JsonArraySerializer.INSTANCE);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(CtaPopUpData$$serializer.INSTANCE);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(GroupDynamic$$serializer.INSTANCE);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CtaCard deserialize(@NotNull Decoder decoder) {
        Float f;
        GroupDynamic groupDynamic;
        Float f2;
        Float f3;
        Boolean bool;
        String str;
        Float f4;
        Boolean bool2;
        Float f5;
        Float f6;
        String str2;
        CtaPopUpData ctaPopUpData;
        String str3;
        String str4;
        String str5;
        int i;
        JsonArray jsonArray;
        String str6;
        String str7;
        Float f7;
        Boolean bool3;
        Float f8;
        String str8;
        Float f9;
        Float f10;
        int i2;
        Float f11;
        int i3;
        int i4;
        String str9;
        Boolean bool4;
        Float f12;
        String str10;
        GroupDynamic groupDynamic2;
        JsonArray jsonArray2;
        String str11;
        Float f13;
        Float f14;
        Boolean bool5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str12 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            JsonArray jsonArray3 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, JsonArraySerializer.INSTANCE, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            CtaPopUpData ctaPopUpData2 = (CtaPopUpData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, CtaPopUpData$$serializer.INSTANCE, null);
            GroupDynamic groupDynamic3 = (GroupDynamic) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, GroupDynamic$$serializer.INSTANCE, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f15 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, null);
            Float f16 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            Float f17 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            Float f18 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, booleanSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            i = 524287;
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, floatSerializer, null);
            f3 = f15;
            f7 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, floatSerializer, null);
            ctaPopUpData = ctaPopUpData2;
            f2 = f17;
            str = str15;
            str3 = str17;
            str4 = str13;
            bool = bool7;
            f = f16;
            groupDynamic = groupDynamic3;
            bool2 = bool6;
            jsonArray = jsonArray3;
            str2 = str14;
            str6 = str16;
            f4 = f18;
        } else {
            int i5 = 0;
            boolean z = true;
            String str18 = null;
            Boolean bool8 = null;
            Float f19 = null;
            Float f20 = null;
            CtaPopUpData ctaPopUpData3 = null;
            String str19 = null;
            String str20 = null;
            Float f21 = null;
            Float f22 = null;
            String str21 = null;
            Float f23 = null;
            GroupDynamic groupDynamic4 = null;
            JsonArray jsonArray4 = null;
            Boolean bool9 = null;
            String str22 = null;
            String str23 = null;
            Float f24 = null;
            Float f25 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str18;
                        bool4 = bool8;
                        f12 = f20;
                        str10 = str20;
                        groupDynamic2 = groupDynamic4;
                        jsonArray2 = jsonArray4;
                        str11 = str22;
                        f13 = f24;
                        f14 = f25;
                        bool5 = bool9;
                        z = false;
                        f24 = f13;
                        bool8 = bool4;
                        jsonArray4 = jsonArray2;
                        str20 = str10;
                        str18 = str9;
                        f25 = f14;
                        bool9 = bool5;
                        groupDynamic4 = groupDynamic2;
                        f20 = f12;
                        str22 = str11;
                        break;
                    case 0:
                        str9 = str18;
                        bool4 = bool8;
                        f12 = f20;
                        str10 = str20;
                        groupDynamic2 = groupDynamic4;
                        jsonArray2 = jsonArray4;
                        String str24 = str22;
                        f13 = f24;
                        f14 = f25;
                        bool5 = bool9;
                        str11 = str24;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str23);
                        i5 |= 1;
                        f24 = f13;
                        bool8 = bool4;
                        jsonArray4 = jsonArray2;
                        str20 = str10;
                        str18 = str9;
                        f25 = f14;
                        bool9 = bool5;
                        groupDynamic4 = groupDynamic2;
                        f20 = f12;
                        str22 = str11;
                        break;
                    case 1:
                        str9 = str18;
                        bool4 = bool8;
                        f12 = f20;
                        str10 = str20;
                        groupDynamic2 = groupDynamic4;
                        jsonArray2 = jsonArray4;
                        f13 = f24;
                        f14 = f25;
                        String str25 = str22;
                        bool5 = bool9;
                        i5 |= 2;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str25);
                        f24 = f13;
                        bool8 = bool4;
                        jsonArray4 = jsonArray2;
                        str20 = str10;
                        str18 = str9;
                        f25 = f14;
                        bool9 = bool5;
                        groupDynamic4 = groupDynamic2;
                        f20 = f12;
                        str22 = str11;
                        break;
                    case 2:
                        str9 = str18;
                        bool4 = bool8;
                        f12 = f20;
                        str10 = str20;
                        groupDynamic2 = groupDynamic4;
                        f13 = f24;
                        f14 = f25;
                        jsonArray2 = jsonArray4;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool9);
                        i5 |= 4;
                        str11 = str22;
                        bool5 = bool9;
                        f24 = f13;
                        bool8 = bool4;
                        jsonArray4 = jsonArray2;
                        str20 = str10;
                        str18 = str9;
                        f25 = f14;
                        bool9 = bool5;
                        groupDynamic4 = groupDynamic2;
                        f20 = f12;
                        str22 = str11;
                        break;
                    case 3:
                        str9 = str18;
                        bool4 = bool8;
                        f12 = f20;
                        String str26 = str20;
                        groupDynamic2 = groupDynamic4;
                        f13 = f24;
                        f14 = f25;
                        str10 = str26;
                        jsonArray4 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, JsonArraySerializer.INSTANCE, jsonArray4);
                        i5 |= 8;
                        jsonArray2 = jsonArray4;
                        str11 = str22;
                        bool5 = bool9;
                        f24 = f13;
                        bool8 = bool4;
                        jsonArray4 = jsonArray2;
                        str20 = str10;
                        str18 = str9;
                        f25 = f14;
                        bool9 = bool5;
                        groupDynamic4 = groupDynamic2;
                        f20 = f12;
                        str22 = str11;
                        break;
                    case 4:
                        bool4 = bool8;
                        f12 = f20;
                        String str27 = str20;
                        groupDynamic2 = groupDynamic4;
                        f13 = f24;
                        f14 = f25;
                        str9 = str18;
                        i5 |= 16;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str27);
                        jsonArray2 = jsonArray4;
                        str11 = str22;
                        bool5 = bool9;
                        f24 = f13;
                        bool8 = bool4;
                        jsonArray4 = jsonArray2;
                        str20 = str10;
                        str18 = str9;
                        f25 = f14;
                        bool9 = bool5;
                        groupDynamic4 = groupDynamic2;
                        f20 = f12;
                        str22 = str11;
                        break;
                    case 5:
                        bool4 = bool8;
                        f12 = f20;
                        String str28 = str20;
                        groupDynamic2 = groupDynamic4;
                        f13 = f24;
                        f14 = f25;
                        i5 |= 32;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str18);
                        jsonArray2 = jsonArray4;
                        str11 = str22;
                        str10 = str28;
                        bool5 = bool9;
                        f24 = f13;
                        bool8 = bool4;
                        jsonArray4 = jsonArray2;
                        str20 = str10;
                        str18 = str9;
                        f25 = f14;
                        bool9 = bool5;
                        groupDynamic4 = groupDynamic2;
                        f20 = f12;
                        str22 = str11;
                        break;
                    case 6:
                        bool4 = bool8;
                        f12 = f20;
                        String str29 = str20;
                        groupDynamic2 = groupDynamic4;
                        f13 = f24;
                        f14 = f25;
                        str9 = str18;
                        i5 |= 64;
                        jsonArray2 = jsonArray4;
                        str11 = str22;
                        str10 = str29;
                        ctaPopUpData3 = (CtaPopUpData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, CtaPopUpData$$serializer.INSTANCE, ctaPopUpData3);
                        bool5 = bool9;
                        f24 = f13;
                        bool8 = bool4;
                        jsonArray4 = jsonArray2;
                        str20 = str10;
                        str18 = str9;
                        f25 = f14;
                        bool9 = bool5;
                        groupDynamic4 = groupDynamic2;
                        f20 = f12;
                        str22 = str11;
                        break;
                    case 7:
                        i5 |= 128;
                        bool8 = bool8;
                        f25 = f25;
                        str20 = str20;
                        groupDynamic4 = (GroupDynamic) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, GroupDynamic$$serializer.INSTANCE, groupDynamic4);
                        f20 = f20;
                        break;
                    case 8:
                        bool3 = bool8;
                        f8 = f20;
                        str8 = str20;
                        f9 = f24;
                        f10 = f25;
                        i5 |= 256;
                        f22 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FloatSerializer.INSTANCE, f22);
                        f11 = f10;
                        bool8 = bool3;
                        f25 = f11;
                        f24 = f9;
                        f20 = f8;
                        str20 = str8;
                        break;
                    case 9:
                        bool3 = bool8;
                        f8 = f20;
                        str8 = str20;
                        f9 = f24;
                        f10 = f25;
                        f19 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, FloatSerializer.INSTANCE, f19);
                        i2 = i5 | 512;
                        i5 = i2;
                        f11 = f10;
                        bool8 = bool3;
                        f25 = f11;
                        f24 = f9;
                        f20 = f8;
                        str20 = str8;
                        break;
                    case 10:
                        bool3 = bool8;
                        f8 = f20;
                        str8 = str20;
                        f9 = f24;
                        f10 = f25;
                        i5 |= 1024;
                        f21 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, FloatSerializer.INSTANCE, f21);
                        f11 = f10;
                        bool8 = bool3;
                        f25 = f11;
                        f24 = f9;
                        f20 = f8;
                        str20 = str8;
                        break;
                    case 11:
                        bool3 = bool8;
                        str8 = str20;
                        f9 = f24;
                        f8 = f20;
                        f10 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f25);
                        i2 = i5 | 2048;
                        i5 = i2;
                        f11 = f10;
                        bool8 = bool3;
                        f25 = f11;
                        f24 = f9;
                        f20 = f8;
                        str20 = str8;
                        break;
                    case 12:
                        str8 = str20;
                        f8 = f20;
                        i5 |= 4096;
                        bool8 = bool8;
                        f9 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, FloatSerializer.INSTANCE, f24);
                        f11 = f25;
                        f25 = f11;
                        f24 = f9;
                        f20 = f8;
                        str20 = str8;
                        break;
                    case 13:
                        str8 = str20;
                        i5 |= 8192;
                        f8 = f20;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str21);
                        f9 = f24;
                        f11 = f25;
                        f25 = f11;
                        f24 = f9;
                        f20 = f8;
                        str20 = str8;
                        break;
                    case 14:
                        str8 = str20;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, BooleanSerializer.INSTANCE, bool8);
                        i3 = i5 | 16384;
                        f8 = f20;
                        i5 = i3;
                        f9 = f24;
                        f11 = f25;
                        f25 = f11;
                        f24 = f9;
                        f20 = f8;
                        str20 = str8;
                        break;
                    case 15:
                        str8 = str20;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str19);
                        i4 = 32768;
                        i3 = i4 | i5;
                        f8 = f20;
                        i5 = i3;
                        f9 = f24;
                        f11 = f25;
                        f25 = f11;
                        f24 = f9;
                        f20 = f8;
                        str20 = str8;
                        break;
                    case 16:
                        str8 = str20;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str12);
                        i4 = 65536;
                        i3 = i4 | i5;
                        f8 = f20;
                        i5 = i3;
                        f9 = f24;
                        f11 = f25;
                        f25 = f11;
                        f24 = f9;
                        f20 = f8;
                        str20 = str8;
                        break;
                    case 17:
                        str8 = str20;
                        f23 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, FloatSerializer.INSTANCE, f23);
                        i4 = 131072;
                        i3 = i4 | i5;
                        f8 = f20;
                        i5 = i3;
                        f9 = f24;
                        f11 = f25;
                        f25 = f11;
                        f24 = f9;
                        f20 = f8;
                        str20 = str8;
                        break;
                    case 18:
                        str8 = str20;
                        f20 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, FloatSerializer.INSTANCE, f20);
                        i4 = 262144;
                        i3 = i4 | i5;
                        f8 = f20;
                        i5 = i3;
                        f9 = f24;
                        f11 = f25;
                        f25 = f11;
                        f24 = f9;
                        f20 = f8;
                        str20 = str8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            f = f19;
            groupDynamic = groupDynamic4;
            f2 = f21;
            f3 = f22;
            bool = bool8;
            str = str20;
            f4 = f25;
            bool2 = bool9;
            f5 = f24;
            f6 = f23;
            str2 = str22;
            ctaPopUpData = ctaPopUpData3;
            str3 = str19;
            str4 = str23;
            str5 = str12;
            i = i5;
            jsonArray = jsonArray4;
            str6 = str21;
            str7 = str18;
            f7 = f20;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CtaCard(i, str4, str2, bool2, jsonArray, str, str7, ctaPopUpData, groupDynamic, f3, f, f2, f4, f5, str6, bool, str3, str5, f6, f7, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaCard.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.CtaCard, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CtaCard ctaCard) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(ctaCard, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CtaCard.write$Self$OKCompliance_ok_compliance_impl(ctaCard, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
