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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class AccordionAppModel$$serializer implements GeneratedSerializer<AccordionAppModel> {
    public static final int $stable;
    public static final AccordionAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AccordionAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AccordionAppModel$$serializer accordionAppModel$$serializer = new AccordionAppModel$$serializer();
        INSTANCE = accordionAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.AccordionAppModel", accordionAppModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("sectionTitle", false);
        pluginGeneratedSerialDescriptor.addElement("contentList", true);
        pluginGeneratedSerialDescriptor.addElement("sectionTitleStyle", false);
        pluginGeneratedSerialDescriptor.addElement("contentListStyle", false);
        pluginGeneratedSerialDescriptor.addElement("isCollapsed", true);
        pluginGeneratedSerialDescriptor.addElement("backgroundStyle", true);
        pluginGeneratedSerialDescriptor.addElement("contentListType", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.AccordionAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AccordionAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        TextStyle$$serializer textStyle$$serializer = TextStyle$$serializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[1], BuiltinSerializersKt.getNullable(textStyle$$serializer), BuiltinSerializersKt.getNullable(textStyle$$serializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AccordionAppModel deserialize(@NotNull Decoder decoder) {
        String str;
        TextStyle textStyle;
        TextStyle textStyle2;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        Float f;
        List list;
        Boolean bool2;
        Float f2;
        String str6;
        int i;
        Boolean bool3;
        KSerializer[] kSerializerArr;
        String str7;
        TextStyle textStyle3;
        String str8;
        Boolean bool4;
        List list2;
        TextStyle textStyle4;
        int i2;
        TextStyle textStyle5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = AccordionAppModel.$childSerializers;
        int i3 = 10;
        int i4 = 9;
        String str9 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr2[1], null);
            TextStyle$$serializer textStyle$$serializer = TextStyle$$serializer.INSTANCE;
            TextStyle textStyle6 = (TextStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, textStyle$$serializer, null);
            TextStyle textStyle7 = (TextStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, textStyle$$serializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            list = list3;
            str2 = str10;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, null);
            str3 = str14;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, null);
            textStyle = textStyle7;
            bool2 = bool7;
            str5 = str13;
            str6 = strDecodeStringElement;
            str4 = str12;
            str = str11;
            bool3 = bool6;
            bool = bool5;
            textStyle2 = textStyle6;
            i = 16383;
        } else {
            int i5 = 13;
            int i6 = 0;
            boolean z = true;
            String str15 = null;
            TextStyle textStyle8 = null;
            Boolean bool8 = null;
            String str16 = null;
            Float f3 = null;
            Boolean bool9 = null;
            Float f4 = null;
            String strDecodeStringElement2 = null;
            String str17 = null;
            Boolean bool10 = null;
            List list4 = null;
            String str18 = null;
            TextStyle textStyle9 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        str7 = str15;
                        textStyle3 = textStyle8;
                        str8 = str17;
                        bool4 = bool10;
                        list2 = list4;
                        textStyle4 = textStyle9;
                        z = false;
                        i2 = i6;
                        textStyle5 = textStyle4;
                        i6 = i2;
                        textStyle8 = textStyle3;
                        str15 = str7;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 0:
                        str7 = str15;
                        textStyle3 = textStyle8;
                        str8 = str17;
                        bool4 = bool10;
                        list2 = list4;
                        textStyle4 = textStyle9;
                        kSerializerArr = kSerializerArr2;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str18);
                        i6 |= 1;
                        i2 = i6;
                        textStyle5 = textStyle4;
                        i6 = i2;
                        textStyle8 = textStyle3;
                        str15 = str7;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 1:
                        str7 = str15;
                        textStyle3 = textStyle8;
                        str8 = str17;
                        bool4 = bool10;
                        textStyle4 = textStyle9;
                        i2 = i6 | 2;
                        kSerializerArr = kSerializerArr2;
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr2[1], list4);
                        textStyle5 = textStyle4;
                        i6 = i2;
                        textStyle8 = textStyle3;
                        str15 = str7;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 2:
                        str7 = str15;
                        str8 = str17;
                        bool4 = bool10;
                        kSerializerArr = kSerializerArr2;
                        i6 |= 4;
                        textStyle8 = textStyle8;
                        list2 = list4;
                        textStyle5 = (TextStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TextStyle$$serializer.INSTANCE, textStyle9);
                        str15 = str7;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 3:
                        str8 = str17;
                        bool4 = bool10;
                        kSerializerArr = kSerializerArr2;
                        i6 |= 8;
                        str15 = str15;
                        list2 = list4;
                        textStyle8 = (TextStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, TextStyle$$serializer.INSTANCE, textStyle8);
                        textStyle5 = textStyle9;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 4:
                        str8 = str17;
                        kSerializerArr = kSerializerArr2;
                        i6 |= 16;
                        str15 = str15;
                        list2 = list4;
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool10);
                        textStyle5 = textStyle9;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 5:
                        str8 = str17;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str15);
                        kSerializerArr = kSerializerArr2;
                        i6 |= 32;
                        bool4 = bool10;
                        list2 = list4;
                        textStyle5 = textStyle9;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 6:
                        kSerializerArr = kSerializerArr2;
                        i6 |= 64;
                        bool4 = bool10;
                        list2 = list4;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str17);
                        textStyle5 = textStyle9;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 7:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i6 |= 128;
                        kSerializerArr = kSerializerArr2;
                        str8 = str17;
                        bool4 = bool10;
                        list2 = list4;
                        textStyle5 = textStyle9;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 8:
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool8);
                        i6 |= 256;
                        kSerializerArr = kSerializerArr2;
                        str8 = str17;
                        bool4 = bool10;
                        list2 = list4;
                        textStyle5 = textStyle9;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 9:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str16);
                        i6 |= 512;
                        kSerializerArr = kSerializerArr2;
                        str8 = str17;
                        bool4 = bool10;
                        list2 = list4;
                        textStyle5 = textStyle9;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 10:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str9);
                        i6 |= 1024;
                        kSerializerArr = kSerializerArr2;
                        str8 = str17;
                        bool4 = bool10;
                        list2 = list4;
                        textStyle5 = textStyle9;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 11:
                        i6 |= 2048;
                        kSerializerArr = kSerializerArr2;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, bool9);
                        str8 = str17;
                        bool4 = bool10;
                        list2 = list4;
                        textStyle5 = textStyle9;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 12:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, FloatSerializer.INSTANCE, f3);
                        i6 |= 4096;
                        kSerializerArr = kSerializerArr2;
                        str8 = str17;
                        bool4 = bool10;
                        list2 = list4;
                        textStyle5 = textStyle9;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 13:
                        i6 |= 8192;
                        kSerializerArr = kSerializerArr2;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, FloatSerializer.INSTANCE, f4);
                        str8 = str17;
                        bool4 = bool10;
                        list2 = list4;
                        textStyle5 = textStyle9;
                        kSerializerArr2 = kSerializerArr;
                        textStyle9 = textStyle5;
                        str17 = str8;
                        bool10 = bool4;
                        list4 = list2;
                        i5 = 13;
                        i3 = 10;
                        i4 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str15;
            textStyle = textStyle8;
            Boolean bool11 = bool10;
            textStyle2 = textStyle9;
            str2 = str18;
            str3 = str9;
            str4 = str17;
            bool = bool11;
            str5 = str16;
            f = f3;
            list = list4;
            bool2 = bool9;
            f2 = f4;
            str6 = strDecodeStringElement2;
            i = i6;
            bool3 = bool8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AccordionAppModel(i, str2, list, textStyle2, textStyle, bool, str, str4, str6, bool3, str5, str3, bool2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AccordionAppModel accordionAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(accordionAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AccordionAppModel.write$Self$OKCompliance_ok_compliance_impl(accordionAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
