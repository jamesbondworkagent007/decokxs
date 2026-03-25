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
public final /* synthetic */ class FreeText$$serializer implements GeneratedSerializer<FreeText> {
    public static final int $stable;
    public static final FreeText$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FreeText$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FreeText$$serializer freeText$$serializer = new FreeText$$serializer();
        INSTANCE = freeText$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("free-text", freeText$$serializer, 26);
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
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        C43788rvr c43788rvr = C43788rvr.KWHzl;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(RichTextContentData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FreetextStep$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(c43788rvr), BuiltinSerializersKt.getNullable(c43788rvr), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FreeText deserialize(@NotNull Decoder decoder) {
        UIAlignment uIAlignment;
        Integer num;
        String str;
        String str2;
        RichTextContentData richTextContentData;
        FreetextStep freetextStep;
        String str3;
        UIAlignment uIAlignment2;
        Float f;
        Boolean bool;
        String str4;
        String str5;
        int i;
        Boolean bool2;
        String str6;
        String str7;
        String str8;
        Boolean bool3;
        String str9;
        String str10;
        Float f2;
        String str11;
        String str12;
        Float f3;
        String str13;
        String str14;
        String str15;
        String str16;
        int i2;
        UIAlignment uIAlignment3;
        int i3;
        int i4;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        RichTextContentData richTextContentData2;
        FreetextStep freetextStep2;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        Integer num2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Float f4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            RichTextContentData richTextContentData3 = (RichTextContentData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, RichTextContentData$$serializer.INSTANCE, null);
            FreetextStep freetextStep3 = (FreetextStep) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, FreetextStep$$serializer.INSTANCE, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, floatSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, booleanSerializer, null);
            C43788rvr c43788rvr = C43788rvr.KWHzl;
            UIAlignment uIAlignment4 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, c43788rvr, null);
            UIAlignment uIAlignment5 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, c43788rvr, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, booleanSerializer, null);
            String str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, booleanSerializer, null);
            String str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, null);
            String str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, stringSerializer, null);
            Float f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, floatSerializer, null);
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, floatSerializer, null);
            str14 = str40;
            f = f6;
            str15 = str29;
            str11 = str31;
            str6 = str41;
            bool3 = bool5;
            str7 = str30;
            bool2 = bool6;
            str10 = strDecodeStringElement;
            freetextStep = freetextStep3;
            uIAlignment2 = uIAlignment4;
            str13 = str33;
            str3 = str36;
            str5 = str34;
            uIAlignment = uIAlignment5;
            str9 = str35;
            richTextContentData = richTextContentData3;
            str4 = str32;
            str12 = str39;
            i = 67108863;
            bool = bool4;
            str = str37;
            f3 = f5;
            num = num3;
            str8 = str38;
        } else {
            int i5 = 0;
            boolean z = true;
            String str42 = null;
            Integer num4 = null;
            String str43 = null;
            UIAlignment uIAlignment6 = null;
            String str44 = null;
            String str45 = null;
            Boolean bool7 = null;
            Float f7 = null;
            Float f8 = null;
            Boolean bool8 = null;
            UIAlignment uIAlignment7 = null;
            Boolean bool9 = null;
            String strDecodeStringElement2 = null;
            String str46 = null;
            String str47 = null;
            String str48 = null;
            RichTextContentData richTextContentData4 = null;
            FreetextStep freetextStep4 = null;
            String str49 = null;
            String str50 = null;
            String str51 = null;
            String str52 = null;
            String str53 = null;
            String str54 = null;
            String str55 = null;
            while (z) {
                Integer num5 = num4;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str17 = str42;
                        str18 = str43;
                        str19 = str46;
                        str20 = str47;
                        str21 = str48;
                        richTextContentData2 = richTextContentData4;
                        freetextStep2 = freetextStep4;
                        str22 = str49;
                        str23 = str50;
                        str24 = str51;
                        str25 = str52;
                        str26 = str53;
                        str27 = str54;
                        str28 = str55;
                        num2 = num5;
                        z = false;
                        str55 = str28;
                        str42 = str17;
                        str43 = str18;
                        num4 = num2;
                        str54 = str27;
                        str53 = str26;
                        str52 = str25;
                        str51 = str24;
                        str50 = str23;
                        str46 = str19;
                        str47 = str20;
                        str48 = str21;
                        richTextContentData4 = richTextContentData2;
                        freetextStep4 = freetextStep2;
                        str49 = str22;
                        break;
                    case 0:
                        str17 = str42;
                        str18 = str43;
                        str19 = str46;
                        str20 = str47;
                        str21 = str48;
                        richTextContentData2 = richTextContentData4;
                        freetextStep2 = freetextStep4;
                        str22 = str49;
                        str23 = str50;
                        str24 = str51;
                        str25 = str52;
                        str26 = str53;
                        str27 = str54;
                        str28 = str55;
                        num2 = num5;
                        i5 |= 1;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        str55 = str28;
                        str42 = str17;
                        str43 = str18;
                        num4 = num2;
                        str54 = str27;
                        str53 = str26;
                        str52 = str25;
                        str51 = str24;
                        str50 = str23;
                        str46 = str19;
                        str47 = str20;
                        str48 = str21;
                        richTextContentData4 = richTextContentData2;
                        freetextStep4 = freetextStep2;
                        str49 = str22;
                        break;
                    case 1:
                        str55 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str55);
                        i5 |= 2;
                        str42 = str42;
                        str43 = str43;
                        num4 = num5;
                        str53 = str53;
                        break;
                    case 2:
                        str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str53);
                        i5 |= 4;
                        str42 = str42;
                        str43 = str43;
                        num4 = num5;
                        str52 = str52;
                        break;
                    case 3:
                        str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str52);
                        i5 |= 8;
                        str42 = str42;
                        str43 = str43;
                        num4 = num5;
                        str51 = str51;
                        break;
                    case 4:
                        str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str51);
                        i5 |= 16;
                        str42 = str42;
                        str43 = str43;
                        num4 = num5;
                        str50 = str50;
                        break;
                    case 5:
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str50);
                        i5 |= 32;
                        str42 = str42;
                        str43 = str43;
                        num4 = num5;
                        str46 = str46;
                        break;
                    case 6:
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str46);
                        i5 |= 64;
                        str42 = str42;
                        str43 = str43;
                        num4 = num5;
                        str47 = str47;
                        break;
                    case 7:
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str47);
                        i5 |= 128;
                        str42 = str42;
                        str43 = str43;
                        num4 = num5;
                        str48 = str48;
                        break;
                    case 8:
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str48);
                        i5 |= 256;
                        str42 = str42;
                        str43 = str43;
                        num4 = num5;
                        richTextContentData4 = richTextContentData4;
                        break;
                    case 9:
                        richTextContentData4 = (RichTextContentData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, RichTextContentData$$serializer.INSTANCE, richTextContentData4);
                        i5 |= 512;
                        str42 = str42;
                        str43 = str43;
                        num4 = num5;
                        freetextStep4 = freetextStep4;
                        break;
                    case 10:
                        str22 = str49;
                        freetextStep4 = (FreetextStep) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, FreetextStep$$serializer.INSTANCE, freetextStep4);
                        i5 |= 1024;
                        str42 = str42;
                        str43 = str43;
                        num4 = num5;
                        str49 = str22;
                        break;
                    case 11:
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str49);
                        i5 |= 2048;
                        str42 = str42;
                        str43 = str43;
                        num4 = num5;
                        str54 = str54;
                        break;
                    case 12:
                        str17 = str42;
                        str18 = str43;
                        num2 = num5;
                        i5 |= 4096;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str54);
                        str19 = str46;
                        str20 = str47;
                        str21 = str48;
                        richTextContentData2 = richTextContentData4;
                        freetextStep2 = freetextStep4;
                        str22 = str49;
                        str23 = str50;
                        str24 = str51;
                        str25 = str52;
                        str26 = str53;
                        str28 = str55;
                        str55 = str28;
                        str42 = str17;
                        str43 = str18;
                        num4 = num2;
                        str54 = str27;
                        str53 = str26;
                        str52 = str25;
                        str51 = str24;
                        str50 = str23;
                        str46 = str19;
                        str47 = str20;
                        str48 = str21;
                        richTextContentData4 = richTextContentData2;
                        freetextStep4 = freetextStep2;
                        str49 = str22;
                        break;
                    case 13:
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, num5);
                        i5 |= 8192;
                        str42 = str42;
                        str43 = str43;
                        break;
                    case 14:
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str44);
                        i5 |= 16384;
                        str42 = str42;
                        num4 = num5;
                        break;
                    case 15:
                        str16 = str44;
                        i2 = 32768;
                        f8 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, FloatSerializer.INSTANCE, f8);
                        uIAlignment3 = uIAlignment7;
                        i3 = i2;
                        i5 |= i3;
                        uIAlignment7 = uIAlignment3;
                        num4 = num5;
                        str44 = str16;
                        break;
                    case 16:
                        str16 = str44;
                        i2 = 65536;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, bool8);
                        uIAlignment3 = uIAlignment7;
                        i3 = i2;
                        i5 |= i3;
                        uIAlignment7 = uIAlignment3;
                        num4 = num5;
                        str44 = str16;
                        break;
                    case 17:
                        str16 = str44;
                        i2 = 131072;
                        uIAlignment6 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, C43788rvr.KWHzl, uIAlignment6);
                        uIAlignment3 = uIAlignment7;
                        i3 = i2;
                        i5 |= i3;
                        uIAlignment7 = uIAlignment3;
                        num4 = num5;
                        str44 = str16;
                        break;
                    case 18:
                        str16 = str44;
                        uIAlignment3 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, C43788rvr.KWHzl, uIAlignment7);
                        i3 = 262144;
                        i5 |= i3;
                        uIAlignment7 = uIAlignment3;
                        num4 = num5;
                        str44 = str16;
                        break;
                    case 19:
                        str16 = str44;
                        i2 = 524288;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, bool9);
                        uIAlignment3 = uIAlignment7;
                        i3 = i2;
                        i5 |= i3;
                        uIAlignment7 = uIAlignment3;
                        num4 = num5;
                        str44 = str16;
                        break;
                    case 20:
                        str16 = str44;
                        i2 = 1048576;
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, str43);
                        uIAlignment3 = uIAlignment7;
                        i3 = i2;
                        i5 |= i3;
                        uIAlignment7 = uIAlignment3;
                        num4 = num5;
                        str44 = str16;
                        break;
                    case 21:
                        str16 = str44;
                        i4 = 2097152;
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, BooleanSerializer.INSTANCE, bool7);
                        uIAlignment3 = uIAlignment7;
                        i3 = i4;
                        i5 |= i3;
                        uIAlignment7 = uIAlignment3;
                        num4 = num5;
                        str44 = str16;
                        break;
                    case 22:
                        str16 = str44;
                        i4 = 4194304;
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, str45);
                        uIAlignment3 = uIAlignment7;
                        i3 = i4;
                        i5 |= i3;
                        uIAlignment7 = uIAlignment3;
                        num4 = num5;
                        str44 = str16;
                        break;
                    case 23:
                        str16 = str44;
                        str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, str42);
                        i4 = 8388608;
                        uIAlignment3 = uIAlignment7;
                        i3 = i4;
                        i5 |= i3;
                        uIAlignment7 = uIAlignment3;
                        num4 = num5;
                        str44 = str16;
                        break;
                    case 24:
                        str16 = str44;
                        i4 = 16777216;
                        f7 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, FloatSerializer.INSTANCE, f7);
                        uIAlignment3 = uIAlignment7;
                        i3 = i4;
                        i5 |= i3;
                        uIAlignment7 = uIAlignment3;
                        num4 = num5;
                        str44 = str16;
                        break;
                    case 25:
                        str16 = str44;
                        Float f9 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, FloatSerializer.INSTANCE, f4);
                        i4 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        f4 = f9;
                        uIAlignment3 = uIAlignment7;
                        i3 = i4;
                        i5 |= i3;
                        uIAlignment7 = uIAlignment3;
                        num4 = num5;
                        str44 = str16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            uIAlignment = uIAlignment7;
            num = num4;
            str = str54;
            str2 = str47;
            richTextContentData = richTextContentData4;
            freetextStep = freetextStep4;
            str3 = str49;
            uIAlignment2 = uIAlignment6;
            f = f7;
            bool = bool8;
            str4 = str51;
            str5 = str46;
            i = i5;
            bool2 = bool7;
            str6 = str42;
            str7 = str53;
            str8 = str44;
            bool3 = bool9;
            str9 = str48;
            str10 = strDecodeStringElement2;
            f2 = f4;
            str11 = str52;
            str12 = str43;
            f3 = f8;
            str13 = str50;
            str14 = str45;
            str15 = str55;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FreeText(i, str10, str15, str7, str11, str4, str13, str5, str2, str9, richTextContentData, freetextStep, str3, str, num, str8, f3, bool, uIAlignment2, uIAlignment, bool3, str12, bool2, str14, str6, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FreeText freeText) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(freeText, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FreeText.write$Self$OKCompliance_ok_compliance_impl(freeText, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
