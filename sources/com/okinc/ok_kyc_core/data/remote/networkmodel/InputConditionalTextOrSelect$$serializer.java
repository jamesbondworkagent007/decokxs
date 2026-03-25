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
public final /* synthetic */ class InputConditionalTextOrSelect$$serializer implements GeneratedSerializer<InputConditionalTextOrSelect> {
    public static final int $stable;
    public static final InputConditionalTextOrSelect$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputConditionalTextOrSelect$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputConditionalTextOrSelect$$serializer inputConditionalTextOrSelect$$serializer = new InputConditionalTextOrSelect$$serializer();
        INSTANCE = inputConditionalTextOrSelect$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("input-conditional-text-or-select", inputConditionalTextOrSelect$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("placeholder", true);
        pluginGeneratedSerialDescriptor.addElement("choices", false);
        pluginGeneratedSerialDescriptor.addElement("valueName", true);
        pluginGeneratedSerialDescriptor.addElement("rules", false);
        pluginGeneratedSerialDescriptor.addElement("enabled", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", false);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputConditionalTextOrSelect.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = InputConditionalTextOrSelect.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(Choices$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputConditionalTextOrSelect deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        Float f;
        Boolean bool2;
        Boolean bool3;
        String str;
        String str2;
        Float f2;
        String str3;
        String str4;
        String str5;
        Choices choices;
        int i;
        List list;
        String str6;
        KSerializer[] kSerializerArr;
        Boolean bool4;
        List list2;
        int i2;
        KSerializer[] kSerializerArr2;
        Boolean bool5;
        List list3;
        String str7;
        Choices choices2;
        String str8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = InputConditionalTextOrSelect.$childSerializers;
        int i3 = 9;
        int i4 = 8;
        Float f3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            Choices choices3 = (Choices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Choices$$serializer.INSTANCE, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr3[4], null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            str2 = str13;
            bool = bool8;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, null);
            str = str12;
            str4 = strDecodeStringElement;
            bool3 = bool7;
            str6 = str11;
            f = f4;
            str5 = str9;
            choices = choices3;
            bool2 = bool6;
            i = 8191;
            str3 = str10;
            list = list4;
        } else {
            int i5 = 12;
            int i6 = 0;
            String str14 = null;
            Boolean bool9 = null;
            String str15 = null;
            Boolean bool10 = null;
            String str16 = null;
            String str17 = null;
            Boolean bool11 = null;
            List list5 = null;
            String str18 = null;
            String strDecodeStringElement2 = null;
            Choices choices4 = null;
            boolean z = true;
            Float f5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        bool5 = bool11;
                        list3 = list5;
                        str7 = str18;
                        choices2 = choices4;
                        str8 = str14;
                        z = false;
                        choices4 = choices2;
                        bool11 = bool5;
                        list5 = list3;
                        str14 = str8;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        str18 = str7;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 0:
                        kSerializerArr2 = kSerializerArr3;
                        bool5 = bool11;
                        list3 = list5;
                        choices2 = choices4;
                        String str19 = str18;
                        str8 = str14;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str19);
                        i6 |= 1;
                        choices4 = choices2;
                        bool11 = bool5;
                        list5 = list3;
                        str14 = str8;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        str18 = str7;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr3;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str14);
                        i6 |= 2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 2:
                        bool4 = bool11;
                        list2 = list5;
                        kSerializerArr = kSerializerArr3;
                        i6 |= 4;
                        choices4 = (Choices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Choices$$serializer.INSTANCE, choices4);
                        bool11 = bool4;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 3:
                        bool4 = bool11;
                        list2 = list5;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str15);
                        i6 |= 8;
                        kSerializerArr = kSerializerArr3;
                        bool11 = bool4;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 4:
                        bool4 = bool11;
                        i6 |= 16;
                        kSerializerArr = kSerializerArr3;
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr3[4], list5);
                        bool11 = bool4;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 5:
                        kSerializerArr = kSerializerArr3;
                        i6 |= 32;
                        list2 = list5;
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool11);
                        bool11 = bool4;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 6:
                        i6 |= 64;
                        kSerializerArr = kSerializerArr3;
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool10);
                        bool4 = bool11;
                        list2 = list5;
                        bool11 = bool4;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 7:
                        i6 |= 128;
                        kSerializerArr = kSerializerArr3;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        bool4 = bool11;
                        list2 = list5;
                        bool11 = bool4;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 8:
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool9);
                        i2 = i6 | 256;
                        kSerializerArr = kSerializerArr3;
                        i6 = i2;
                        bool4 = bool11;
                        list2 = list5;
                        bool11 = bool4;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 9:
                        i6 |= 512;
                        kSerializerArr = kSerializerArr3;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str16);
                        bool4 = bool11;
                        list2 = list5;
                        bool11 = bool4;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 10:
                        i6 |= 1024;
                        kSerializerArr = kSerializerArr3;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str17);
                        bool4 = bool11;
                        list2 = list5;
                        bool11 = bool4;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 11:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f3);
                        i2 = i6 | 2048;
                        kSerializerArr = kSerializerArr3;
                        i6 = i2;
                        bool4 = bool11;
                        list2 = list5;
                        bool11 = bool4;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 12:
                        i6 |= 4096;
                        kSerializerArr = kSerializerArr3;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, FloatSerializer.INSTANCE, f5);
                        bool4 = bool11;
                        list2 = list5;
                        bool11 = bool4;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool12 = bool11;
            List list6 = list5;
            bool = bool9;
            f = f3;
            bool2 = bool12;
            bool3 = bool10;
            str = str16;
            str2 = str17;
            f2 = f5;
            str3 = str14;
            str4 = strDecodeStringElement2;
            str5 = str18;
            choices = choices4;
            i = i6;
            list = list6;
            str6 = str15;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputConditionalTextOrSelect(i, str5, str3, choices, str6, list, bool2, bool3, str4, bool, str, str2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputConditionalTextOrSelect inputConditionalTextOrSelect) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputConditionalTextOrSelect, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputConditionalTextOrSelect.write$Self$OKCompliance_ok_compliance_impl(inputConditionalTextOrSelect, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
