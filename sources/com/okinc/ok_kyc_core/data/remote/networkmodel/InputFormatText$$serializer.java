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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class InputFormatText$$serializer implements GeneratedSerializer<InputFormatText> {
    public static final int $stable;
    public static final InputFormatText$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputFormatText$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputFormatText$$serializer inputFormatText$$serializer = new InputFormatText$$serializer();
        INSTANCE = inputFormatText$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("input-format-text-with-dependency", inputFormatText$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("placeholder", false);
        pluginGeneratedSerialDescriptor.addElement("rules", false);
        pluginGeneratedSerialDescriptor.addElement("enabled", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("format", true);
        pluginGeneratedSerialDescriptor.addElement("dependency", true);
        pluginGeneratedSerialDescriptor.addElement("minValidLength", true);
        pluginGeneratedSerialDescriptor.addElement("allowLetters", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputFormatText.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = InputFormatText.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[2]), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(InputFormat$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Dependency$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputFormatText deserialize(@NotNull Decoder decoder) {
        int i;
        Float f;
        Boolean bool;
        String str;
        Boolean bool2;
        String str2;
        Boolean bool3;
        String str3;
        Float f2;
        Boolean bool4;
        String str4;
        String str5;
        List list;
        InputFormat inputFormat;
        Integer num;
        Dependency dependency;
        Boolean bool5;
        String str6;
        Boolean bool6;
        InputFormat inputFormat2;
        KSerializer[] kSerializerArr;
        List list2;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = InputFormatText.$childSerializers;
        int i2 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr2[2], null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            InputFormat inputFormat3 = (InputFormat) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, InputFormat$$serializer.INSTANCE, null);
            Dependency dependency2 = (Dependency) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, Dependency$$serializer.INSTANCE, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, null);
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            Boolean bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, null);
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, null);
            bool4 = bool10;
            inputFormat = inputFormat3;
            str4 = strDecodeStringElement2;
            num = num2;
            dependency = dependency2;
            bool2 = bool9;
            bool = bool7;
            str = str9;
            bool3 = bool8;
            str2 = str10;
            list = list3;
            str5 = strDecodeStringElement;
            str3 = str8;
            i = 32767;
        } else {
            int i3 = 14;
            boolean z = true;
            Integer num3 = null;
            Dependency dependency3 = null;
            Float f3 = null;
            String str11 = null;
            Boolean bool11 = null;
            String str12 = null;
            Boolean bool12 = null;
            Float f4 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            InputFormat inputFormat4 = null;
            List list4 = null;
            Boolean bool13 = null;
            String str13 = null;
            int i4 = 0;
            Boolean bool14 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool5 = bool13;
                        str6 = str13;
                        z = false;
                        kSerializerArr2 = kSerializerArr2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 0:
                        bool6 = bool14;
                        inputFormat2 = inputFormat4;
                        bool5 = bool13;
                        kSerializerArr = kSerializerArr2;
                        String str14 = str13;
                        list2 = list4;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str14);
                        i4 |= 1;
                        str6 = str7;
                        bool14 = bool6;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 1:
                        bool6 = bool14;
                        inputFormat2 = inputFormat4;
                        bool5 = bool13;
                        kSerializerArr = kSerializerArr2;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        str7 = str13;
                        list2 = list4;
                        str6 = str7;
                        bool14 = bool6;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 2:
                        bool6 = bool14;
                        inputFormat2 = inputFormat4;
                        bool5 = bool13;
                        kSerializerArr = kSerializerArr2;
                        i4 |= 4;
                        str7 = str13;
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr2[2], list4);
                        str6 = str7;
                        bool14 = bool6;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 3:
                        inputFormat2 = inputFormat4;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool13);
                        i4 |= 8;
                        kSerializerArr = kSerializerArr2;
                        bool14 = bool14;
                        str6 = str13;
                        list2 = list4;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 4:
                        inputFormat2 = inputFormat4;
                        bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool12);
                        i4 |= 16;
                        bool5 = bool13;
                        str6 = str13;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 5:
                        inputFormat2 = (InputFormat) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, InputFormat$$serializer.INSTANCE, inputFormat4);
                        i4 |= 32;
                        bool5 = bool13;
                        str6 = str13;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 6:
                        dependency3 = (Dependency) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, Dependency$$serializer.INSTANCE, dependency3);
                        i4 |= 64;
                        inputFormat2 = inputFormat4;
                        bool5 = bool13;
                        str6 = str13;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 7:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, num3);
                        i4 |= 128;
                        inputFormat2 = inputFormat4;
                        bool5 = bool13;
                        str6 = str13;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 8:
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool11);
                        i4 |= 256;
                        inputFormat2 = inputFormat4;
                        bool5 = bool13;
                        str6 = str13;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 9:
                        i4 |= 512;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        inputFormat2 = inputFormat4;
                        bool5 = bool13;
                        str6 = str13;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 10:
                        bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool14);
                        i4 |= 1024;
                        inputFormat2 = inputFormat4;
                        bool5 = bool13;
                        str6 = str13;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 11:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str11);
                        i4 |= 2048;
                        inputFormat2 = inputFormat4;
                        bool5 = bool13;
                        str6 = str13;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 12:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str12);
                        i4 |= 4096;
                        inputFormat2 = inputFormat4;
                        bool5 = bool13;
                        str6 = str13;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 13:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, FloatSerializer.INSTANCE, f3);
                        i4 |= 8192;
                        inputFormat2 = inputFormat4;
                        bool5 = bool13;
                        str6 = str13;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    case 14:
                        i4 |= 16384;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f4);
                        inputFormat2 = inputFormat4;
                        bool5 = bool13;
                        str6 = str13;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        inputFormat4 = inputFormat2;
                        kSerializerArr2 = kSerializerArr;
                        list4 = list2;
                        i3 = 14;
                        bool13 = bool5;
                        str13 = str6;
                        i2 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            InputFormat inputFormat5 = inputFormat4;
            String str15 = str13;
            List list5 = list4;
            i = i4;
            f = f3;
            bool = bool13;
            str = str11;
            bool2 = bool11;
            str2 = str12;
            bool3 = bool12;
            str3 = str15;
            f2 = f4;
            bool4 = bool14;
            str4 = strDecodeStringElement3;
            str5 = strDecodeStringElement4;
            list = list5;
            inputFormat = inputFormat5;
            num = num3;
            dependency = dependency3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputFormatText(i, str3, str5, list, bool, bool3, inputFormat, dependency, num, bool2, str4, bool4, str, str2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputFormatText inputFormatText) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputFormatText, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputFormatText.write$Self$OKCompliance_ok_compliance_impl(inputFormatText, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
