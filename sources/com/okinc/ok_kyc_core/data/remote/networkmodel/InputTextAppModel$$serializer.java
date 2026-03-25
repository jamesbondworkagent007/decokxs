package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.alibaba.sdk.android.oss.common.RequestParameters;
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
public final /* synthetic */ class InputTextAppModel$$serializer implements GeneratedSerializer<InputTextAppModel> {
    public static final int $stable;
    public static final InputTextAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputTextAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputTextAppModel$$serializer inputTextAppModel$$serializer = new InputTextAppModel$$serializer();
        INSTANCE = inputTextAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.InputTextAppModel", inputTextAppModel$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("tip", true);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("placeholder", true);
        pluginGeneratedSerialDescriptor.addElement(RequestParameters.PREFIX, true);
        pluginGeneratedSerialDescriptor.addElement("suffix", true);
        pluginGeneratedSerialDescriptor.addElement("precision", true);
        pluginGeneratedSerialDescriptor.addElement("isNumber", true);
        pluginGeneratedSerialDescriptor.addElement("rules", false);
        pluginGeneratedSerialDescriptor.addElement("enabled", true);
        pluginGeneratedSerialDescriptor.addElement("addressAutoComplete", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = InputTextAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[7]), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(AddressAutoComplete$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputTextAppModel deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        Boolean bool2;
        String str;
        String str2;
        String str3;
        Integer num;
        Float f;
        Boolean bool3;
        String str4;
        String str5;
        Boolean bool4;
        String str6;
        String str7;
        int i;
        Float f2;
        List list;
        AddressAutoComplete addressAutoComplete;
        String str8;
        Boolean bool5;
        Boolean bool6;
        List list2;
        KSerializer[] kSerializerArr;
        Boolean bool7;
        Boolean bool8;
        int i2;
        KSerializer[] kSerializerArr2;
        Boolean bool9;
        String str9;
        Boolean bool10;
        Boolean bool11;
        List list3;
        Boolean bool12;
        String str10;
        String str11;
        String str12;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = InputTextAppModel.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr3[7], null);
            Boolean bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            AddressAutoComplete addressAutoComplete2 = (AddressAutoComplete) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, AddressAutoComplete$$serializer.INSTANCE, null);
            Boolean bool15 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            Boolean bool16 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, floatSerializer, null);
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, floatSerializer, null);
            addressAutoComplete = addressAutoComplete2;
            bool2 = bool13;
            str2 = str18;
            bool4 = bool15;
            str3 = str19;
            bool3 = bool16;
            str5 = strDecodeStringElement;
            list = list4;
            str8 = str15;
            bool = bool14;
            i = 131071;
            num = num2;
            str4 = str17;
            str6 = str14;
            str = str16;
            str7 = str13;
        } else {
            int i3 = 16;
            boolean z = true;
            String str20 = null;
            Boolean bool17 = null;
            String str21 = null;
            Float f3 = null;
            String str22 = null;
            String str23 = null;
            Integer num3 = null;
            Float f4 = null;
            AddressAutoComplete addressAutoComplete3 = null;
            String strDecodeStringElement2 = null;
            Boolean bool18 = null;
            List list5 = null;
            Boolean bool19 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            int i4 = 0;
            Boolean bool20 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        bool9 = bool20;
                        str9 = str20;
                        bool10 = bool17;
                        bool11 = bool18;
                        list3 = list5;
                        bool12 = bool19;
                        str10 = str24;
                        str11 = str26;
                        str12 = str25;
                        z = false;
                        bool18 = bool11;
                        bool19 = bool12;
                        list5 = list3;
                        bool17 = bool10;
                        str24 = str10;
                        str20 = str9;
                        bool20 = bool9;
                        str25 = str12;
                        i3 = 16;
                        str26 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 0:
                        kSerializerArr2 = kSerializerArr3;
                        bool9 = bool20;
                        str9 = str20;
                        bool10 = bool17;
                        bool11 = bool18;
                        list3 = list5;
                        bool12 = bool19;
                        str10 = str24;
                        String str27 = str26;
                        str12 = str25;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str27);
                        i4 |= 1;
                        bool18 = bool11;
                        bool19 = bool12;
                        list5 = list3;
                        bool17 = bool10;
                        str24 = str10;
                        str20 = str9;
                        bool20 = bool9;
                        str25 = str12;
                        i3 = 16;
                        str26 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 1:
                        kSerializerArr2 = kSerializerArr3;
                        bool9 = bool20;
                        str9 = str20;
                        bool10 = bool17;
                        bool11 = bool18;
                        list3 = list5;
                        bool12 = bool19;
                        str10 = str24;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str25);
                        i4 |= 2;
                        str11 = str26;
                        str12 = str25;
                        bool18 = bool11;
                        bool19 = bool12;
                        list5 = list3;
                        bool17 = bool10;
                        str24 = str10;
                        str20 = str9;
                        bool20 = bool9;
                        str25 = str12;
                        i3 = 16;
                        str26 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 2:
                        kSerializerArr2 = kSerializerArr3;
                        bool9 = bool20;
                        bool10 = bool17;
                        bool11 = bool18;
                        list3 = list5;
                        bool12 = bool19;
                        str9 = str20;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str24);
                        i4 |= 4;
                        str10 = str24;
                        str11 = str26;
                        str12 = str25;
                        bool18 = bool11;
                        bool19 = bool12;
                        list5 = list3;
                        bool17 = bool10;
                        str24 = str10;
                        str20 = str9;
                        bool20 = bool9;
                        str25 = str12;
                        i3 = 16;
                        str26 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 3:
                        kSerializerArr2 = kSerializerArr3;
                        bool9 = bool20;
                        bool10 = bool17;
                        bool11 = bool18;
                        list3 = list5;
                        bool12 = bool19;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str21);
                        i4 |= 8;
                        str9 = str20;
                        str10 = str24;
                        str11 = str26;
                        str12 = str25;
                        bool18 = bool11;
                        bool19 = bool12;
                        list5 = list3;
                        bool17 = bool10;
                        str24 = str10;
                        str20 = str9;
                        bool20 = bool9;
                        str25 = str12;
                        i3 = 16;
                        str26 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 4:
                        kSerializerArr2 = kSerializerArr3;
                        bool9 = bool20;
                        bool10 = bool17;
                        bool11 = bool18;
                        list3 = list5;
                        bool12 = bool19;
                        i4 |= 16;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str20);
                        str10 = str24;
                        str11 = str26;
                        str12 = str25;
                        bool18 = bool11;
                        bool19 = bool12;
                        list5 = list3;
                        bool17 = bool10;
                        str24 = str10;
                        str20 = str9;
                        bool20 = bool9;
                        str25 = str12;
                        i3 = 16;
                        str26 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 5:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num3);
                        i4 |= 32;
                        bool17 = bool17;
                        kSerializerArr3 = kSerializerArr3;
                        bool20 = bool20;
                        i3 = 16;
                        break;
                    case 6:
                        bool5 = bool17;
                        bool6 = bool18;
                        list2 = list5;
                        kSerializerArr = kSerializerArr3;
                        bool19 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool19);
                        i4 |= 64;
                        bool20 = bool20;
                        bool7 = bool6;
                        bool17 = bool5;
                        bool18 = bool7;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 16;
                        break;
                    case 7:
                        i4 |= 128;
                        kSerializerArr = kSerializerArr3;
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr3[7], list5);
                        bool7 = bool18;
                        bool17 = bool17;
                        bool20 = bool20;
                        bool18 = bool7;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 16;
                        break;
                    case 8:
                        bool5 = bool17;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool18);
                        kSerializerArr = kSerializerArr3;
                        i4 |= 256;
                        bool20 = bool20;
                        list2 = list5;
                        bool7 = bool6;
                        bool17 = bool5;
                        bool18 = bool7;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 16;
                        break;
                    case 9:
                        bool8 = bool17;
                        i4 |= 512;
                        kSerializerArr = kSerializerArr3;
                        addressAutoComplete3 = (AddressAutoComplete) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, AddressAutoComplete$$serializer.INSTANCE, addressAutoComplete3);
                        bool17 = bool8;
                        bool7 = bool18;
                        list2 = list5;
                        bool18 = bool7;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 16;
                        break;
                    case 10:
                        bool8 = bool17;
                        bool20 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool20);
                        kSerializerArr = kSerializerArr3;
                        i4 |= 1024;
                        bool17 = bool8;
                        bool7 = bool18;
                        list2 = list5;
                        bool18 = bool7;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 16;
                        break;
                    case 11:
                        i4 |= 2048;
                        kSerializerArr = kSerializerArr3;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        bool7 = bool18;
                        list2 = list5;
                        bool18 = bool7;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 16;
                        break;
                    case 12:
                        bool17 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, bool17);
                        i4 |= 4096;
                        kSerializerArr = kSerializerArr3;
                        bool7 = bool18;
                        list2 = list5;
                        bool18 = bool7;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 16;
                        break;
                    case 13:
                        i4 |= 8192;
                        kSerializerArr = kSerializerArr3;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str22);
                        bool7 = bool18;
                        list2 = list5;
                        bool18 = bool7;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 16;
                        break;
                    case 14:
                        i4 |= 16384;
                        kSerializerArr = kSerializerArr3;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str23);
                        bool7 = bool18;
                        list2 = list5;
                        bool18 = bool7;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 16;
                        break;
                    case 15:
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, FloatSerializer.INSTANCE, f4);
                        i2 = 32768;
                        i4 |= i2;
                        kSerializerArr = kSerializerArr3;
                        bool7 = bool18;
                        list2 = list5;
                        bool18 = bool7;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 16;
                        break;
                    case 16:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f3);
                        i2 = 65536;
                        i4 |= i2;
                        kSerializerArr = kSerializerArr3;
                        bool7 = bool18;
                        list2 = list5;
                        bool18 = bool7;
                        list5 = list2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            bool = bool18;
            bool2 = bool19;
            str = str21;
            str2 = str22;
            str3 = str23;
            num = num3;
            f = f4;
            bool3 = bool17;
            str4 = str20;
            str5 = strDecodeStringElement2;
            bool4 = bool20;
            str6 = str25;
            str7 = str26;
            i = i4;
            f2 = f3;
            list = list5;
            addressAutoComplete = addressAutoComplete3;
            str8 = str24;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputTextAppModel(i, str7, str6, str8, str, str4, num, bool2, list, bool, addressAutoComplete, bool4, str5, bool3, str2, str3, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputTextAppModel inputTextAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputTextAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputTextAppModel.write$Self$OKCompliance_ok_compliance_impl(inputTextAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
