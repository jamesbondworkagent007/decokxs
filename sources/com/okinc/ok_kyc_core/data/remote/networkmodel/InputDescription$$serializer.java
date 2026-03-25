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
public final /* synthetic */ class InputDescription$$serializer implements GeneratedSerializer<InputDescription> {
    public static final int $stable;
    public static final InputDescription$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputDescription$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputDescription$$serializer inputDescription$$serializer = new InputDescription$$serializer();
        INSTANCE = inputDescription$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("input-text-area", inputDescription$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("placeholder", true);
        pluginGeneratedSerialDescriptor.addElement("rules", false);
        pluginGeneratedSerialDescriptor.addElement("enabled", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDescription.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = InputDescription.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[2]), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputDescription deserialize(@NotNull Decoder decoder) {
        String str;
        Boolean bool;
        Float f;
        Float f2;
        String str2;
        String str3;
        String str4;
        Boolean bool2;
        Boolean bool3;
        List list;
        String str5;
        int i;
        KSerializer[] kSerializerArr;
        Boolean bool4;
        Boolean bool5;
        List list2;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = InputDescription.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 8;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr2[2], null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            i = 2047;
            str2 = str10;
            f = f4;
            f2 = f3;
            str = str9;
            bool = bool8;
            str3 = strDecodeStringElement2;
            bool3 = bool6;
            bool2 = bool7;
            str5 = str7;
            str4 = str8;
            list = list3;
        } else {
            int i7 = 0;
            boolean z = true;
            String str11 = null;
            Boolean bool9 = null;
            Float f5 = null;
            Float f6 = null;
            String str12 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            List list4 = null;
            String str13 = null;
            String str14 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool10;
                        bool5 = bool11;
                        list2 = list4;
                        str6 = str13;
                        z = false;
                        kSerializerArr2 = kSerializerArr;
                        str13 = str6;
                        bool10 = bool4;
                        bool11 = bool5;
                        list4 = list2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 0:
                        bool4 = bool10;
                        bool5 = bool11;
                        list2 = list4;
                        str6 = str13;
                        kSerializerArr = kSerializerArr2;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str14);
                        i7 |= 1;
                        kSerializerArr2 = kSerializerArr;
                        str13 = str6;
                        bool10 = bool4;
                        bool11 = bool5;
                        list4 = list2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 1:
                        bool4 = bool10;
                        bool5 = bool11;
                        list2 = list4;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str13);
                        i7 |= 2;
                        kSerializerArr = kSerializerArr2;
                        str6 = str13;
                        kSerializerArr2 = kSerializerArr;
                        str13 = str6;
                        bool10 = bool4;
                        bool11 = bool5;
                        list4 = list2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 2:
                        bool4 = bool10;
                        bool5 = bool11;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr2[2], list4);
                        i7 |= 4;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        str6 = str13;
                        kSerializerArr2 = kSerializerArr;
                        str13 = str6;
                        bool10 = bool4;
                        bool11 = bool5;
                        list4 = list2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 3:
                        bool4 = bool10;
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool11);
                        i7 |= 8;
                        kSerializerArr = kSerializerArr2;
                        bool5 = bool11;
                        list2 = list4;
                        str6 = str13;
                        kSerializerArr2 = kSerializerArr;
                        str13 = str6;
                        bool10 = bool4;
                        bool11 = bool5;
                        list4 = list2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 4:
                        i7 |= 16;
                        kSerializerArr = kSerializerArr2;
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool10);
                        bool5 = bool11;
                        list2 = list4;
                        str6 = str13;
                        kSerializerArr2 = kSerializerArr;
                        str13 = str6;
                        bool10 = bool4;
                        bool11 = bool5;
                        list4 = list2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 5:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 |= 32;
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool10;
                        bool5 = bool11;
                        list2 = list4;
                        str6 = str13;
                        kSerializerArr2 = kSerializerArr;
                        str13 = str6;
                        bool10 = bool4;
                        bool11 = bool5;
                        list4 = list2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 6:
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool9);
                        i7 |= 64;
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool10;
                        bool5 = bool11;
                        list2 = list4;
                        str6 = str13;
                        kSerializerArr2 = kSerializerArr;
                        str13 = str6;
                        bool10 = bool4;
                        bool11 = bool5;
                        list4 = list2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 7:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str11);
                        i7 |= 128;
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool10;
                        bool5 = bool11;
                        list2 = list4;
                        str6 = str13;
                        kSerializerArr2 = kSerializerArr;
                        str13 = str6;
                        bool10 = bool4;
                        bool11 = bool5;
                        list4 = list2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 8:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str12);
                        i7 |= 256;
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool10;
                        bool5 = bool11;
                        list2 = list4;
                        str6 = str13;
                        kSerializerArr2 = kSerializerArr;
                        str13 = str6;
                        bool10 = bool4;
                        bool11 = bool5;
                        list4 = list2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 9:
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f6);
                        i7 |= 512;
                        break;
                    case 10:
                        i7 |= 1024;
                        kSerializerArr = kSerializerArr2;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f5);
                        bool4 = bool10;
                        bool5 = bool11;
                        list2 = list4;
                        str6 = str13;
                        kSerializerArr2 = kSerializerArr;
                        str13 = str6;
                        bool10 = bool4;
                        bool11 = bool5;
                        list4 = list2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool12 = bool10;
            Boolean bool13 = bool11;
            List list5 = list4;
            str = str11;
            bool = bool9;
            f = f5;
            f2 = f6;
            str2 = str12;
            str3 = strDecodeStringElement;
            str4 = str13;
            bool2 = bool12;
            bool3 = bool13;
            list = list5;
            str5 = str14;
            i = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputDescription(i, str5, str4, list, bool3, bool2, str3, bool, str, str2, f2, f, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputDescription inputDescription) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputDescription, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputDescription.write$Self$OKCompliance_ok_compliance_impl(inputDescription, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
