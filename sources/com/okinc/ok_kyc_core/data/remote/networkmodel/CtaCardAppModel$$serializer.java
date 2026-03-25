package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
public final /* synthetic */ class CtaCardAppModel$$serializer implements GeneratedSerializer<CtaCardAppModel> {
    public static final int $stable;
    public static final CtaCardAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CtaCardAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CtaCardAppModel$$serializer ctaCardAppModel$$serializer = new CtaCardAppModel$$serializer();
        INSTANCE = ctaCardAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.CtaCardAppModel", ctaCardAppModel$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("tag", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("contentList", false);
        pluginGeneratedSerialDescriptor.addElement("backgroundType", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, true);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("dynamic", true);
        pluginGeneratedSerialDescriptor.addElement("cornerRadius", true);
        pluginGeneratedSerialDescriptor.addElement("paddingLeft", true);
        pluginGeneratedSerialDescriptor.addElement("paddingTop", true);
        pluginGeneratedSerialDescriptor.addElement("paddingRight", true);
        pluginGeneratedSerialDescriptor.addElement("paddingBottom", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaCardAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CtaCardAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), kSerializerArr[3], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(CtaPopUp$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(GroupDynamic$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CtaCardAppModel deserialize(@NotNull Decoder decoder) {
        GroupDynamic groupDynamic;
        Float f;
        String str;
        Float f2;
        Float f3;
        Float f4;
        Float f5;
        List list;
        CtaPopUp ctaPopUp;
        Boolean bool;
        String str2;
        String str3;
        Float f6;
        String str4;
        String str5;
        int i;
        String str6;
        String str7;
        Boolean bool2;
        Float f7;
        KSerializer[] kSerializerArr;
        Boolean bool3;
        Float f8;
        Float f9;
        Float f10;
        Float f11;
        int i2;
        int i3;
        KSerializer[] kSerializerArr2;
        CtaPopUp ctaPopUp2;
        Boolean bool4;
        Float f12;
        GroupDynamic groupDynamic2;
        List list2;
        String str8;
        Float f13;
        Float f14;
        Boolean bool5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = CtaCardAppModel.$childSerializers;
        String str9 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr3[3], null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            CtaPopUp ctaPopUp3 = (CtaPopUp) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, CtaPopUp$$serializer.INSTANCE, null);
            GroupDynamic groupDynamic3 = (GroupDynamic) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, GroupDynamic$$serializer.INSTANCE, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f15 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, null);
            Float f16 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            Float f17 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            Float f18 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, booleanSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            Float f19 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, floatSerializer, null);
            Float f20 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, floatSerializer, null);
            i = 524287;
            str5 = str15;
            f5 = f19;
            str4 = str12;
            f2 = f15;
            f = f20;
            str3 = str14;
            ctaPopUp = ctaPopUp3;
            str2 = str10;
            bool2 = bool7;
            list = list3;
            str = str13;
            groupDynamic = groupDynamic3;
            str7 = strDecodeStringElement;
            bool = bool6;
            f3 = f16;
            str6 = str11;
            f6 = f18;
            f7 = f17;
        } else {
            int i4 = 0;
            boolean z = true;
            CtaPopUp ctaPopUp4 = null;
            Boolean bool8 = null;
            Float f21 = null;
            Float f22 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            Float f23 = null;
            Float f24 = null;
            Float f25 = null;
            String strDecodeStringElement2 = null;
            GroupDynamic groupDynamic4 = null;
            List list4 = null;
            Boolean bool9 = null;
            String str19 = null;
            String str20 = null;
            Float f26 = null;
            Float f27 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        ctaPopUp2 = ctaPopUp4;
                        bool4 = bool8;
                        f12 = f21;
                        groupDynamic2 = groupDynamic4;
                        list2 = list4;
                        str8 = str19;
                        f13 = f26;
                        f14 = f27;
                        bool5 = bool9;
                        z = false;
                        groupDynamic4 = groupDynamic2;
                        f27 = f14;
                        bool8 = bool4;
                        f21 = f12;
                        list4 = list2;
                        ctaPopUp4 = ctaPopUp2;
                        f26 = f13;
                        bool9 = bool5;
                        kSerializerArr3 = kSerializerArr2;
                        str19 = str8;
                        break;
                    case 0:
                        kSerializerArr2 = kSerializerArr3;
                        ctaPopUp2 = ctaPopUp4;
                        bool4 = bool8;
                        f12 = f21;
                        groupDynamic2 = groupDynamic4;
                        list2 = list4;
                        String str21 = str19;
                        f13 = f26;
                        f14 = f27;
                        bool5 = bool9;
                        str8 = str21;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str20);
                        i4 |= 1;
                        groupDynamic4 = groupDynamic2;
                        f27 = f14;
                        bool8 = bool4;
                        f21 = f12;
                        list4 = list2;
                        ctaPopUp4 = ctaPopUp2;
                        f26 = f13;
                        bool9 = bool5;
                        kSerializerArr3 = kSerializerArr2;
                        str19 = str8;
                        break;
                    case 1:
                        kSerializerArr2 = kSerializerArr3;
                        ctaPopUp2 = ctaPopUp4;
                        bool4 = bool8;
                        f12 = f21;
                        groupDynamic2 = groupDynamic4;
                        list2 = list4;
                        f13 = f26;
                        f14 = f27;
                        String str22 = str19;
                        bool5 = bool9;
                        i4 |= 2;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str22);
                        groupDynamic4 = groupDynamic2;
                        f27 = f14;
                        bool8 = bool4;
                        f21 = f12;
                        list4 = list2;
                        ctaPopUp4 = ctaPopUp2;
                        f26 = f13;
                        bool9 = bool5;
                        kSerializerArr3 = kSerializerArr2;
                        str19 = str8;
                        break;
                    case 2:
                        kSerializerArr2 = kSerializerArr3;
                        ctaPopUp2 = ctaPopUp4;
                        bool4 = bool8;
                        f12 = f21;
                        groupDynamic2 = groupDynamic4;
                        f13 = f26;
                        f14 = f27;
                        list2 = list4;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool9);
                        i4 |= 4;
                        str8 = str19;
                        bool5 = bool9;
                        groupDynamic4 = groupDynamic2;
                        f27 = f14;
                        bool8 = bool4;
                        f21 = f12;
                        list4 = list2;
                        ctaPopUp4 = ctaPopUp2;
                        f26 = f13;
                        bool9 = bool5;
                        kSerializerArr3 = kSerializerArr2;
                        str19 = str8;
                        break;
                    case 3:
                        kSerializerArr2 = kSerializerArr3;
                        bool4 = bool8;
                        f12 = f21;
                        groupDynamic2 = groupDynamic4;
                        f13 = f26;
                        f14 = f27;
                        ctaPopUp2 = ctaPopUp4;
                        list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr2[3], list4);
                        i4 |= 8;
                        list2 = list4;
                        str8 = str19;
                        bool5 = bool9;
                        groupDynamic4 = groupDynamic2;
                        f27 = f14;
                        bool8 = bool4;
                        f21 = f12;
                        list4 = list2;
                        ctaPopUp4 = ctaPopUp2;
                        f26 = f13;
                        bool9 = bool5;
                        kSerializerArr3 = kSerializerArr2;
                        str19 = str8;
                        break;
                    case 4:
                        kSerializerArr2 = kSerializerArr3;
                        bool4 = bool8;
                        f12 = f21;
                        groupDynamic2 = groupDynamic4;
                        f13 = f26;
                        f14 = f27;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str17);
                        i4 |= 16;
                        ctaPopUp2 = ctaPopUp4;
                        list2 = list4;
                        str8 = str19;
                        bool5 = bool9;
                        groupDynamic4 = groupDynamic2;
                        f27 = f14;
                        bool8 = bool4;
                        f21 = f12;
                        list4 = list2;
                        ctaPopUp4 = ctaPopUp2;
                        f26 = f13;
                        bool9 = bool5;
                        kSerializerArr3 = kSerializerArr2;
                        str19 = str8;
                        break;
                    case 5:
                        kSerializerArr2 = kSerializerArr3;
                        bool4 = bool8;
                        f12 = f21;
                        groupDynamic2 = groupDynamic4;
                        f13 = f26;
                        f14 = f27;
                        ctaPopUp2 = ctaPopUp4;
                        i4 |= 32;
                        list2 = list4;
                        str8 = str19;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str18);
                        bool5 = bool9;
                        groupDynamic4 = groupDynamic2;
                        f27 = f14;
                        bool8 = bool4;
                        f21 = f12;
                        list4 = list2;
                        ctaPopUp4 = ctaPopUp2;
                        f26 = f13;
                        bool9 = bool5;
                        kSerializerArr3 = kSerializerArr2;
                        str19 = str8;
                        break;
                    case 6:
                        kSerializerArr = kSerializerArr3;
                        ctaPopUp4 = (CtaPopUp) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, CtaPopUp$$serializer.INSTANCE, ctaPopUp4);
                        i4 |= 64;
                        bool8 = bool8;
                        f21 = f21;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 7:
                        kSerializerArr = kSerializerArr3;
                        bool3 = bool8;
                        f8 = f27;
                        f9 = f26;
                        groupDynamic4 = (GroupDynamic) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, GroupDynamic$$serializer.INSTANCE, groupDynamic4);
                        i4 |= 128;
                        f21 = f21;
                        f27 = f8;
                        bool8 = bool3;
                        f26 = f9;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 8:
                        kSerializerArr = kSerializerArr3;
                        bool3 = bool8;
                        f10 = f21;
                        f11 = f26;
                        f8 = f27;
                        i4 |= 256;
                        f23 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FloatSerializer.INSTANCE, f23);
                        f9 = f11;
                        f21 = f10;
                        f27 = f8;
                        bool8 = bool3;
                        f26 = f9;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 9:
                        kSerializerArr = kSerializerArr3;
                        bool3 = bool8;
                        f10 = f21;
                        f11 = f26;
                        f8 = f27;
                        i4 |= 512;
                        f24 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, FloatSerializer.INSTANCE, f24);
                        f9 = f11;
                        f21 = f10;
                        f27 = f8;
                        bool8 = bool3;
                        f26 = f9;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 10:
                        kSerializerArr = kSerializerArr3;
                        bool3 = bool8;
                        f8 = f27;
                        f10 = f21;
                        f9 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, FloatSerializer.INSTANCE, f26);
                        i4 |= 1024;
                        f21 = f10;
                        f27 = f8;
                        bool8 = bool3;
                        f26 = f9;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 11:
                        kSerializerArr = kSerializerArr3;
                        bool3 = bool8;
                        f8 = f27;
                        i4 |= 2048;
                        f25 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f25);
                        f9 = f26;
                        f27 = f8;
                        bool8 = bool3;
                        f26 = f9;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 12:
                        kSerializerArr = kSerializerArr3;
                        bool3 = bool8;
                        i4 |= 4096;
                        f9 = f26;
                        f8 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, FloatSerializer.INSTANCE, f27);
                        f27 = f8;
                        bool8 = bool3;
                        f26 = f9;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 13:
                        kSerializerArr = kSerializerArr3;
                        i4 |= 8192;
                        bool3 = bool8;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        f9 = f26;
                        f8 = f27;
                        f27 = f8;
                        bool8 = bool3;
                        f26 = f9;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 14:
                        kSerializerArr = kSerializerArr3;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, BooleanSerializer.INSTANCE, bool8);
                        i2 = i4 | 16384;
                        bool3 = bool8;
                        i4 = i2;
                        f9 = f26;
                        f8 = f27;
                        f27 = f8;
                        bool8 = bool3;
                        f26 = f9;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 15:
                        kSerializerArr = kSerializerArr3;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str16);
                        i3 = 32768;
                        i2 = i3 | i4;
                        bool3 = bool8;
                        i4 = i2;
                        f9 = f26;
                        f8 = f27;
                        f27 = f8;
                        bool8 = bool3;
                        f26 = f9;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 16:
                        kSerializerArr = kSerializerArr3;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str9);
                        i3 = 65536;
                        i2 = i3 | i4;
                        bool3 = bool8;
                        i4 = i2;
                        f9 = f26;
                        f8 = f27;
                        f27 = f8;
                        bool8 = bool3;
                        f26 = f9;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 17:
                        kSerializerArr = kSerializerArr3;
                        f21 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, FloatSerializer.INSTANCE, f21);
                        i3 = 131072;
                        i2 = i3 | i4;
                        bool3 = bool8;
                        i4 = i2;
                        f9 = f26;
                        f8 = f27;
                        f27 = f8;
                        bool8 = bool3;
                        f26 = f9;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 18:
                        kSerializerArr = kSerializerArr3;
                        f22 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, FloatSerializer.INSTANCE, f22);
                        i3 = 262144;
                        i2 = i3 | i4;
                        bool3 = bool8;
                        i4 = i2;
                        f9 = f26;
                        f8 = f27;
                        f27 = f8;
                        bool8 = bool3;
                        f26 = f9;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            groupDynamic = groupDynamic4;
            f = f22;
            str = str18;
            f2 = f23;
            f3 = f24;
            f4 = f25;
            f5 = f21;
            list = list4;
            ctaPopUp = ctaPopUp4;
            bool = bool9;
            str2 = str20;
            str3 = str16;
            f6 = f27;
            str4 = str17;
            str5 = str9;
            i = i4;
            str6 = str19;
            str7 = strDecodeStringElement2;
            bool2 = bool8;
            f7 = f26;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CtaCardAppModel(i, str2, str6, bool, list, str4, str, ctaPopUp, groupDynamic, f2, f3, f7, f4, f6, str7, bool2, str3, str5, f5, f, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CtaCardAppModel ctaCardAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(ctaCardAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CtaCardAppModel.write$Self$OKCompliance_ok_compliance_impl(ctaCardAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
