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
public final /* synthetic */ class InputVerificationCodeAppModel$$serializer implements GeneratedSerializer<InputVerificationCodeAppModel> {
    public static final int $stable;
    public static final InputVerificationCodeAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputVerificationCodeAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputVerificationCodeAppModel$$serializer inputVerificationCodeAppModel$$serializer = new InputVerificationCodeAppModel$$serializer();
        INSTANCE = inputVerificationCodeAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.InputVerificationCodeAppModel", inputVerificationCodeAppModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("numOfDigits", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        pluginGeneratedSerialDescriptor.addElement("rules", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputVerificationCodeAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = InputVerificationCodeAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[2]), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputVerificationCodeAppModel deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        Float f;
        Float f2;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        Integer num;
        Boolean bool2;
        List list;
        Boolean bool3;
        List list2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InputVerificationCodeAppModel.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 5;
        int i6 = 8;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, null);
            list = list3;
            num = num2;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            str2 = str8;
            str = str7;
            bool = bool5;
            bool2 = bool4;
            f2 = f3;
            str4 = strDecodeStringElement;
            str3 = str6;
            i = 1023;
        } else {
            int i7 = 0;
            boolean z = true;
            Boolean bool6 = null;
            Float f4 = null;
            Float f5 = null;
            String str9 = null;
            String str10 = null;
            String strDecodeStringElement2 = null;
            Boolean bool7 = null;
            List list4 = null;
            Integer num3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool3 = bool7;
                        list2 = list4;
                        z = false;
                        bool7 = bool3;
                        list4 = list2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 0:
                        bool3 = bool7;
                        list2 = list4;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num3);
                        i7 |= 1;
                        bool7 = bool3;
                        list4 = list2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 1:
                        bool3 = bool7;
                        list2 = list4;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str10);
                        i7 |= 2;
                        bool7 = bool3;
                        list4 = list2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 2:
                        bool3 = bool7;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], list4);
                        i7 |= 4;
                        list2 = list4;
                        bool7 = bool3;
                        list4 = list2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 3:
                        i7 |= 8;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool7);
                        list2 = list4;
                        bool7 = bool3;
                        list4 = list2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 4:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        bool3 = bool7;
                        list2 = list4;
                        bool7 = bool3;
                        list4 = list2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 5:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool6);
                        i7 |= 32;
                        bool3 = bool7;
                        list2 = list4;
                        bool7 = bool3;
                        list4 = list2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 6:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str9);
                        i7 |= 64;
                        bool3 = bool7;
                        list2 = list4;
                        bool7 = bool3;
                        list4 = list2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 7:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str5);
                        i7 |= 128;
                        break;
                    case 8:
                        i7 |= 256;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, FloatSerializer.INSTANCE, f5);
                        bool3 = bool7;
                        list2 = list4;
                        bool7 = bool3;
                        list4 = list2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 9:
                        i7 |= 512;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f4);
                        bool3 = bool7;
                        list2 = list4;
                        bool7 = bool3;
                        list4 = list2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool8 = bool7;
            List list5 = list4;
            Integer num4 = num3;
            bool = bool6;
            f = f4;
            f2 = f5;
            str = str9;
            str2 = str5;
            str3 = str10;
            str4 = strDecodeStringElement2;
            i = i7;
            num = num4;
            bool2 = bool8;
            list = list5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputVerificationCodeAppModel(i, num, str3, list, bool2, str4, bool, str, str2, f2, f, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputVerificationCodeAppModel inputVerificationCodeAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputVerificationCodeAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputVerificationCodeAppModel.write$Self$OKCompliance_ok_compliance_impl(inputVerificationCodeAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
