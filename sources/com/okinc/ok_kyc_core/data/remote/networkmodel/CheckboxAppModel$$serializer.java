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
public final /* synthetic */ class CheckboxAppModel$$serializer implements GeneratedSerializer<CheckboxAppModel> {
    public static final int $stable;
    public static final CheckboxAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CheckboxAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CheckboxAppModel$$serializer checkboxAppModel$$serializer = new CheckboxAppModel$$serializer();
        INSTANCE = checkboxAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.CheckboxAppModel", checkboxAppModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("text", false);
        pluginGeneratedSerialDescriptor.addElement("isBold", true);
        pluginGeneratedSerialDescriptor.addElement("isCard", false);
        pluginGeneratedSerialDescriptor.addElement("richContent", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("checkHiddenItemIds", true);
        pluginGeneratedSerialDescriptor.addElement("uncheckHiddenItemIds", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.CheckboxAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = CheckboxAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(RichTextContent$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[5]), BuiltinSerializersKt.getNullable(kSerializerArr[6]), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CheckboxAppModel deserialize(@NotNull Decoder decoder) {
        String str;
        Boolean bool;
        List list;
        String str2;
        Boolean bool2;
        List list2;
        Float f;
        String str3;
        String str4;
        boolean z;
        RichTextContent richTextContent;
        Float f2;
        Boolean bool3;
        int i;
        KSerializer[] kSerializerArr;
        List list3;
        RichTextContent richTextContent2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = CheckboxAppModel.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 8;
        Float f3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, booleanSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            RichTextContent richTextContent3 = (RichTextContent) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, RichTextContent$$serializer.INSTANCE, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr2[5], null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr2[6], null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            list2 = list5;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, null);
            richTextContent = richTextContent3;
            str = str5;
            str3 = strDecodeStringElement2;
            bool3 = bool5;
            str2 = str6;
            list = list4;
            z = zDecodeBooleanElement;
            f = f4;
            bool2 = bool4;
            bool = bool6;
            str4 = strDecodeStringElement;
            i = 8191;
        } else {
            int i5 = 12;
            int i6 = 0;
            boolean zDecodeBooleanElement2 = false;
            String str7 = null;
            Boolean bool7 = null;
            String str8 = null;
            List list6 = null;
            Float f5 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            List list7 = null;
            Boolean bool8 = null;
            RichTextContent richTextContent4 = null;
            boolean z2 = true;
            Boolean bool9 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        list3 = list7;
                        richTextContent2 = richTextContent4;
                        z2 = false;
                        richTextContent4 = richTextContent2;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        list3 = list7;
                        richTextContent2 = richTextContent4;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        richTextContent4 = richTextContent2;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 1:
                        list3 = list7;
                        richTextContent2 = richTextContent4;
                        kSerializerArr = kSerializerArr2;
                        i6 |= 2;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, bool8);
                        richTextContent4 = richTextContent2;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 2:
                        list3 = list7;
                        richTextContent2 = richTextContent4;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i6 |= 4;
                        kSerializerArr = kSerializerArr2;
                        richTextContent4 = richTextContent2;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 3:
                        list3 = list7;
                        richTextContent2 = (RichTextContent) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, RichTextContent$$serializer.INSTANCE, richTextContent4);
                        i6 |= 8;
                        kSerializerArr = kSerializerArr2;
                        richTextContent4 = richTextContent2;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 4:
                        list3 = list7;
                        i6 |= 16;
                        kSerializerArr = kSerializerArr2;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool9);
                        richTextContent2 = richTextContent4;
                        richTextContent4 = richTextContent2;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 5:
                        i6 |= 32;
                        kSerializerArr = kSerializerArr2;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr2[5], list7);
                        richTextContent2 = richTextContent4;
                        richTextContent4 = richTextContent2;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 6:
                        i6 |= 64;
                        kSerializerArr = kSerializerArr2;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr2[6], list6);
                        list3 = list7;
                        richTextContent2 = richTextContent4;
                        richTextContent4 = richTextContent2;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 7:
                        i6 |= 128;
                        kSerializerArr = kSerializerArr2;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        list3 = list7;
                        richTextContent2 = richTextContent4;
                        richTextContent4 = richTextContent2;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 8:
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool7);
                        i6 |= 256;
                        kSerializerArr = kSerializerArr2;
                        list3 = list7;
                        richTextContent2 = richTextContent4;
                        richTextContent4 = richTextContent2;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 9:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str7);
                        i6 |= 512;
                        i5 = 12;
                        break;
                    case 10:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str8);
                        i6 |= 1024;
                        kSerializerArr = kSerializerArr2;
                        list3 = list7;
                        richTextContent2 = richTextContent4;
                        richTextContent4 = richTextContent2;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 11:
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f5);
                        i6 |= 2048;
                        kSerializerArr = kSerializerArr2;
                        list3 = list7;
                        richTextContent2 = richTextContent4;
                        richTextContent4 = richTextContent2;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 12:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, FloatSerializer.INSTANCE, f3);
                        i6 |= 4096;
                        kSerializerArr = kSerializerArr2;
                        list3 = list7;
                        richTextContent2 = richTextContent4;
                        richTextContent4 = richTextContent2;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list8 = list7;
            Boolean bool10 = bool8;
            RichTextContent richTextContent5 = richTextContent4;
            str = str7;
            bool = bool7;
            list = list8;
            str2 = str8;
            bool2 = bool10;
            list2 = list6;
            f = f5;
            str3 = strDecodeStringElement3;
            str4 = strDecodeStringElement4;
            z = zDecodeBooleanElement2;
            richTextContent = richTextContent5;
            f2 = f3;
            bool3 = bool9;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CheckboxAppModel(i, str4, bool2, z, richTextContent, bool3, list, list2, str3, bool, str, str2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CheckboxAppModel checkboxAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(checkboxAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CheckboxAppModel.write$Self$OKCompliance_ok_compliance_impl(checkboxAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
