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
public final /* synthetic */ class InputDateAppModel$$serializer implements GeneratedSerializer<InputDateAppModel> {
    public static final int $stable;
    public static final InputDateAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputDateAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputDateAppModel$$serializer inputDateAppModel$$serializer = new InputDateAppModel$$serializer();
        INSTANCE = inputDateAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateAppModel", inputDateAppModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("placeholder", true);
        pluginGeneratedSerialDescriptor.addElement("dateFormat", true);
        pluginGeneratedSerialDescriptor.addElement("rules", true);
        pluginGeneratedSerialDescriptor.addElement("enabled", true);
        pluginGeneratedSerialDescriptor.addElement("hiddenOnErrorItemIds", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = InputDateAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[5]), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputDateAppModel deserialize(@NotNull Decoder decoder) {
        Float f;
        Boolean bool;
        int i;
        String str;
        Float f2;
        Boolean bool2;
        String str2;
        String str3;
        List list;
        String str4;
        String str5;
        List list2;
        Boolean bool3;
        String str6;
        Boolean bool4;
        int i2;
        KSerializer[] kSerializerArr;
        String str7;
        Boolean bool5;
        String str8;
        String str9;
        List list3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = InputDateAppModel.$childSerializers;
        int i3 = 9;
        int i4 = 8;
        Float f3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr2[5], null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            str2 = str14;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, null);
            str = str13;
            str4 = strDecodeStringElement;
            bool2 = bool7;
            bool = bool8;
            bool3 = bool6;
            i = 8191;
            f = f4;
            str5 = str10;
            list = list5;
            list2 = list4;
            str6 = str12;
            str3 = str11;
        } else {
            int i5 = 12;
            int i6 = 0;
            boolean z = true;
            List list6 = null;
            List list7 = null;
            Boolean bool9 = null;
            String str15 = null;
            Float f5 = null;
            Boolean bool10 = null;
            String str16 = null;
            String str17 = null;
            Boolean bool11 = null;
            String str18 = null;
            String strDecodeStringElement2 = null;
            String str19 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        str7 = str17;
                        bool5 = bool11;
                        str8 = str18;
                        str9 = str19;
                        list3 = list6;
                        z = false;
                        bool11 = bool5;
                        str19 = str9;
                        str17 = str7;
                        list6 = list3;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        str18 = str8;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        str7 = str17;
                        bool5 = bool11;
                        str9 = str19;
                        String str20 = str18;
                        list3 = list6;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str20);
                        i6 |= 1;
                        bool11 = bool5;
                        str19 = str9;
                        str17 = str7;
                        list6 = list3;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        str18 = str8;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 1:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str17);
                        i6 |= 2;
                        kSerializerArr2 = kSerializerArr2;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 2:
                        bool4 = bool11;
                        i6 |= 4;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str19);
                        bool11 = bool4;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 3:
                        bool4 = bool11;
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], list7);
                        i6 |= 8;
                        bool11 = bool4;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 4:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool11);
                        i6 |= 16;
                        bool11 = bool4;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 5:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr2[5], list6);
                        i2 = i6 | 32;
                        i6 = i2;
                        bool4 = bool11;
                        bool11 = bool4;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 6:
                        i6 |= 64;
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool10);
                        bool4 = bool11;
                        bool11 = bool4;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 7:
                        i6 |= 128;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        bool4 = bool11;
                        bool11 = bool4;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 8:
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool9);
                        i2 = i6 | 256;
                        i6 = i2;
                        bool4 = bool11;
                        bool11 = bool4;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 9:
                        i6 |= 512;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str15);
                        bool4 = bool11;
                        bool11 = bool4;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 10:
                        i6 |= 1024;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str16);
                        bool4 = bool11;
                        bool11 = bool4;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 11:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f3);
                        i2 = i6 | 2048;
                        i6 = i2;
                        bool4 = bool11;
                        bool11 = bool4;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 12:
                        i6 |= 4096;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, FloatSerializer.INSTANCE, f5);
                        bool4 = bool11;
                        bool11 = bool4;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str21 = str17;
            f = f3;
            bool = bool9;
            i = i6;
            str = str15;
            f2 = f5;
            bool2 = bool10;
            str2 = str16;
            str3 = str21;
            list = list6;
            str4 = strDecodeStringElement2;
            str5 = str18;
            list2 = list7;
            bool3 = bool11;
            str6 = str19;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputDateAppModel(i, str5, str3, str6, list2, bool3, list, bool2, str4, bool, str, str2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputDateAppModel inputDateAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputDateAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputDateAppModel.write$Self$OKCompliance_ok_compliance_impl(inputDateAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
