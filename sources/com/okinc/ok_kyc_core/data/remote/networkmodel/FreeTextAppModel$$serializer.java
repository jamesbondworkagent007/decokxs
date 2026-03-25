package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.huawei.hms.push.constant.RemoteMessageConst;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43788rvr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class FreeTextAppModel$$serializer implements GeneratedSerializer<FreeTextAppModel> {
    public static final int $stable;
    public static final FreeTextAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FreeTextAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FreeTextAppModel$$serializer freeTextAppModel$$serializer = new FreeTextAppModel$$serializer();
        INSTANCE = freeTextAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel", freeTextAppModel$$serializer, 26);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("iconRenderColor", true);
        pluginGeneratedSerialDescriptor.addElement("iconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("iconDarkUrl", true);
        pluginGeneratedSerialDescriptor.addElement("iconHeight", true);
        pluginGeneratedSerialDescriptor.addElement("iconWidth", true);
        pluginGeneratedSerialDescriptor.addElement("iconPosition", true);
        pluginGeneratedSerialDescriptor.addElement("textContent", true);
        pluginGeneratedSerialDescriptor.addElement("richContent", true);
        pluginGeneratedSerialDescriptor.addElement("step", true);
        pluginGeneratedSerialDescriptor.addElement("textColor", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.ATTR_TTS_FONT_SIZE, true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.ATTR_TTS_FONT_WEIGHT, true);
        pluginGeneratedSerialDescriptor.addElement("lineHeight", true);
        pluginGeneratedSerialDescriptor.addElement("isBold", true);
        pluginGeneratedSerialDescriptor.addElement("align", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.ATTR_TTS_TEXT_ALIGN, true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
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
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        C43788rvr c43788rvr = C43788rvr.KWHzl;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(RichTextContent$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FreetextStep$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(c43788rvr), BuiltinSerializersKt.getNullable(c43788rvr), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FreeTextAppModel deserialize(@NotNull Decoder decoder) {
        UIAlignment uIAlignment;
        Integer num;
        String str;
        String str2;
        String str3;
        RichTextContent richTextContent;
        FreetextStep freetextStep;
        String str4;
        String str5;
        Float f;
        int i;
        UIAlignment uIAlignment2;
        String str6;
        Boolean bool;
        Boolean bool2;
        String str7;
        String str8;
        Float f2;
        String str9;
        String str10;
        Float f3;
        String str11;
        String str12;
        String str13;
        String str14;
        Boolean bool3;
        String str15;
        Integer num2;
        int i2;
        Boolean bool4;
        UIAlignment uIAlignment3;
        String str16;
        RichTextContent richTextContent2;
        FreetextStep freetextStep2;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            RichTextContent richTextContent3 = (RichTextContent) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, RichTextContent$$serializer.INSTANCE, null);
            FreetextStep freetextStep3 = (FreetextStep) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, FreetextStep$$serializer.INSTANCE, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, floatSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, booleanSerializer, null);
            C43788rvr c43788rvr = C43788rvr.KWHzl;
            UIAlignment uIAlignment4 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, c43788rvr, null);
            UIAlignment uIAlignment5 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, c43788rvr, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, booleanSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, booleanSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, stringSerializer, null);
            Float f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, floatSerializer, null);
            f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, floatSerializer, null);
            str8 = str36;
            str6 = str27;
            f = f5;
            str10 = str26;
            str5 = strDecodeStringElement;
            str13 = str37;
            richTextContent = richTextContent3;
            bool3 = bool7;
            uIAlignment2 = uIAlignment4;
            str14 = str29;
            str12 = strDecodeStringElement2;
            freetextStep = freetextStep3;
            str4 = str33;
            str15 = str31;
            str7 = str30;
            str11 = str28;
            uIAlignment = uIAlignment5;
            bool = bool6;
            str9 = str32;
            i = 67108863;
            bool2 = bool5;
            str2 = str34;
            f2 = f4;
            num = num3;
            str = str35;
        } else {
            boolean z = true;
            Boolean bool8 = null;
            UIAlignment uIAlignment6 = null;
            String str38 = null;
            UIAlignment uIAlignment7 = null;
            Float f6 = null;
            Integer num4 = null;
            Float f7 = null;
            String str39 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            String str40 = null;
            Float f8 = null;
            String str41 = null;
            RichTextContent richTextContent4 = null;
            FreetextStep freetextStep4 = null;
            String str42 = null;
            String str43 = null;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            String strDecodeStringElement3 = null;
            String str47 = null;
            String str48 = null;
            String strDecodeStringElement4 = null;
            String str49 = null;
            int i3 = 0;
            String str50 = null;
            while (z) {
                String str51 = str38;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool4 = bool8;
                        uIAlignment3 = uIAlignment6;
                        str16 = str41;
                        richTextContent2 = richTextContent4;
                        freetextStep2 = freetextStep4;
                        str17 = str42;
                        str18 = str43;
                        str19 = str44;
                        str20 = str45;
                        str21 = str46;
                        str22 = str47;
                        str23 = str48;
                        str24 = str49;
                        str25 = str51;
                        z = false;
                        str49 = str24;
                        bool8 = bool4;
                        uIAlignment6 = uIAlignment3;
                        str38 = str25;
                        str48 = str23;
                        str46 = str21;
                        str45 = str20;
                        str44 = str19;
                        str43 = str18;
                        str41 = str16;
                        str47 = str22;
                        richTextContent4 = richTextContent2;
                        freetextStep4 = freetextStep2;
                        str42 = str17;
                        break;
                    case 0:
                        bool4 = bool8;
                        uIAlignment3 = uIAlignment6;
                        str16 = str41;
                        richTextContent2 = richTextContent4;
                        freetextStep2 = freetextStep4;
                        str17 = str42;
                        str18 = str43;
                        str19 = str44;
                        str20 = str45;
                        str21 = str46;
                        str22 = str47;
                        str23 = str48;
                        str24 = str49;
                        str25 = str51;
                        i3 |= 1;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        str49 = str24;
                        bool8 = bool4;
                        uIAlignment6 = uIAlignment3;
                        str38 = str25;
                        str48 = str23;
                        str46 = str21;
                        str45 = str20;
                        str44 = str19;
                        str43 = str18;
                        str41 = str16;
                        str47 = str22;
                        richTextContent4 = richTextContent2;
                        freetextStep4 = freetextStep2;
                        str42 = str17;
                        break;
                    case 1:
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str49);
                        i3 |= 2;
                        bool8 = bool8;
                        uIAlignment6 = uIAlignment6;
                        str38 = str51;
                        str48 = str48;
                        break;
                    case 2:
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str48);
                        i3 |= 4;
                        bool8 = bool8;
                        uIAlignment6 = uIAlignment6;
                        str38 = str51;
                        str46 = str46;
                        break;
                    case 3:
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str46);
                        i3 |= 8;
                        bool8 = bool8;
                        uIAlignment6 = uIAlignment6;
                        str38 = str51;
                        str45 = str45;
                        break;
                    case 4:
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str45);
                        i3 |= 16;
                        bool8 = bool8;
                        uIAlignment6 = uIAlignment6;
                        str38 = str51;
                        str44 = str44;
                        break;
                    case 5:
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str44);
                        i3 |= 32;
                        bool8 = bool8;
                        uIAlignment6 = uIAlignment6;
                        str38 = str51;
                        str43 = str43;
                        break;
                    case 6:
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str43);
                        i3 |= 64;
                        bool8 = bool8;
                        uIAlignment6 = uIAlignment6;
                        str38 = str51;
                        str41 = str41;
                        break;
                    case 7:
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str41);
                        i3 |= 128;
                        bool8 = bool8;
                        uIAlignment6 = uIAlignment6;
                        str38 = str51;
                        str47 = str47;
                        break;
                    case 8:
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str47);
                        i3 |= 256;
                        bool8 = bool8;
                        uIAlignment6 = uIAlignment6;
                        str38 = str51;
                        richTextContent4 = richTextContent4;
                        break;
                    case 9:
                        richTextContent4 = (RichTextContent) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, RichTextContent$$serializer.INSTANCE, richTextContent4);
                        i3 |= 512;
                        bool8 = bool8;
                        uIAlignment6 = uIAlignment6;
                        str38 = str51;
                        freetextStep4 = freetextStep4;
                        break;
                    case 10:
                        str17 = str42;
                        freetextStep4 = (FreetextStep) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, FreetextStep$$serializer.INSTANCE, freetextStep4);
                        i3 |= 1024;
                        bool8 = bool8;
                        uIAlignment6 = uIAlignment6;
                        str38 = str51;
                        str42 = str17;
                        break;
                    case 11:
                        bool4 = bool8;
                        uIAlignment3 = uIAlignment6;
                        str25 = str51;
                        i3 |= 2048;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str42);
                        str16 = str41;
                        richTextContent2 = richTextContent4;
                        freetextStep2 = freetextStep4;
                        str18 = str43;
                        str19 = str44;
                        str20 = str45;
                        str21 = str46;
                        str22 = str47;
                        str23 = str48;
                        str24 = str49;
                        str49 = str24;
                        bool8 = bool4;
                        uIAlignment6 = uIAlignment3;
                        str38 = str25;
                        str48 = str23;
                        str46 = str21;
                        str45 = str20;
                        str44 = str19;
                        str43 = str18;
                        str41 = str16;
                        str47 = str22;
                        richTextContent4 = richTextContent2;
                        freetextStep4 = freetextStep2;
                        str42 = str17;
                        break;
                    case 12:
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str51);
                        i3 |= 4096;
                        bool8 = bool8;
                        uIAlignment6 = uIAlignment6;
                        break;
                    case 13:
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, num4);
                        i3 |= 8192;
                        bool8 = bool8;
                        str38 = str51;
                        break;
                    case 14:
                        num2 = num4;
                        i3 |= 16384;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str40);
                        str38 = str51;
                        num4 = num2;
                        break;
                    case 15:
                        num2 = num4;
                        f8 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, FloatSerializer.INSTANCE, f8);
                        i2 = 32768;
                        i3 = i2 | i3;
                        str38 = str51;
                        num4 = num2;
                        break;
                    case 16:
                        num2 = num4;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, bool8);
                        i2 = 65536;
                        i3 = i2 | i3;
                        str38 = str51;
                        num4 = num2;
                        break;
                    case 17:
                        num2 = num4;
                        uIAlignment6 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, C43788rvr.KWHzl, uIAlignment6);
                        i2 = 131072;
                        i3 = i2 | i3;
                        str38 = str51;
                        num4 = num2;
                        break;
                    case 18:
                        num2 = num4;
                        uIAlignment7 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, C43788rvr.KWHzl, uIAlignment7);
                        i2 = 262144;
                        i3 = i2 | i3;
                        str38 = str51;
                        num4 = num2;
                        break;
                    case 19:
                        num2 = num4;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, bool9);
                        i2 = 524288;
                        i3 = i2 | i3;
                        str38 = str51;
                        num4 = num2;
                        break;
                    case 20:
                        num2 = num4;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i2 = 1048576;
                        i3 = i2 | i3;
                        str38 = str51;
                        num4 = num2;
                        break;
                    case 21:
                        num2 = num4;
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, BooleanSerializer.INSTANCE, bool10);
                        i2 = 2097152;
                        i3 = i2 | i3;
                        str38 = str51;
                        num4 = num2;
                        break;
                    case 22:
                        num2 = num4;
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, str50);
                        i2 = 4194304;
                        i3 = i2 | i3;
                        str38 = str51;
                        num4 = num2;
                        break;
                    case 23:
                        num2 = num4;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, str39);
                        i2 = 8388608;
                        i3 = i2 | i3;
                        str38 = str51;
                        num4 = num2;
                        break;
                    case 24:
                        num2 = num4;
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, FloatSerializer.INSTANCE, f6);
                        i2 = 16777216;
                        i3 = i2 | i3;
                        str38 = str51;
                        num4 = num2;
                        break;
                    case 25:
                        num2 = num4;
                        f7 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, FloatSerializer.INSTANCE, f7);
                        i2 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i3 = i2 | i3;
                        str38 = str51;
                        num4 = num2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            uIAlignment = uIAlignment7;
            num = num4;
            str = str40;
            str2 = str38;
            str3 = str41;
            richTextContent = richTextContent4;
            freetextStep = freetextStep4;
            str4 = str42;
            str5 = strDecodeStringElement4;
            f = f6;
            i = i3;
            uIAlignment2 = uIAlignment6;
            str6 = str48;
            bool = bool9;
            bool2 = bool8;
            str7 = str44;
            str8 = str50;
            f2 = f8;
            str9 = str47;
            str10 = str49;
            f3 = f7;
            str11 = str46;
            str12 = strDecodeStringElement3;
            str13 = str39;
            str14 = str45;
            bool3 = bool10;
            str15 = str43;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FreeTextAppModel(i, str5, str10, str6, str11, str14, str7, str15, str3, str9, richTextContent, freetextStep, str4, str2, num, str, f2, bool2, uIAlignment2, uIAlignment, bool, str12, bool3, str8, str13, f, f3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FreeTextAppModel freeTextAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(freeTextAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FreeTextAppModel.write$Self$OKCompliance_ok_compliance_impl(freeTextAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
