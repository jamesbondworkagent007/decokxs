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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class InputSSNAppModel$$serializer implements GeneratedSerializer<InputSSNAppModel> {
    public static final int $stable;
    public static final InputSSNAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputSSNAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputSSNAppModel$$serializer inputSSNAppModel$$serializer = new InputSSNAppModel$$serializer();
        INSTANCE = inputSSNAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.InputSSNAppModel", inputSSNAppModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("placeholder", true);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement(RequestParameters.PREFIX, true);
        pluginGeneratedSerialDescriptor.addElement("rules", false);
        pluginGeneratedSerialDescriptor.addElement("enabled", true);
        pluginGeneratedSerialDescriptor.addElement("showInput", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputSSNAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = InputSSNAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(booleanSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputSSNAppModel deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        Float f;
        Boolean bool2;
        Float f2;
        Boolean bool3;
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        List list;
        String str5;
        String str6;
        int i;
        List list2;
        String str7;
        Boolean bool4;
        KSerializer[] kSerializerArr;
        String str8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = InputSSNAppModel.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 8;
        Float f3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            str3 = str13;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, null);
            str = str12;
            str2 = strDecodeStringElement;
            bool = bool6;
            z = zDecodeBooleanElement;
            bool2 = bool7;
            f2 = f4;
            i = 8191;
            str4 = str11;
            str5 = str10;
            list = list3;
            bool3 = bool5;
            str6 = str9;
        } else {
            int i6 = 12;
            int i7 = 0;
            boolean zDecodeBooleanElement2 = false;
            String str14 = null;
            Boolean bool8 = null;
            Float f5 = null;
            Boolean bool9 = null;
            List list4 = null;
            String str15 = null;
            String strDecodeStringElement2 = null;
            String str16 = null;
            Boolean bool10 = null;
            String str17 = null;
            boolean z2 = true;
            String str18 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i6 = 12;
                        i2 = 10;
                        i4 = 7;
                        i5 = 8;
                        kSerializerArr2 = kSerializerArr2;
                        break;
                    case 0:
                        list2 = list4;
                        str7 = str15;
                        bool4 = bool10;
                        kSerializerArr = kSerializerArr2;
                        i7 |= 1;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str16);
                        str8 = str17;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool4;
                        str15 = str7;
                        str17 = str8;
                        list4 = list2;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 1:
                        list2 = list4;
                        str7 = str15;
                        bool4 = bool10;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str17);
                        kSerializerArr = kSerializerArr2;
                        i7 |= 2;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool4;
                        str15 = str7;
                        str17 = str8;
                        list4 = list2;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 2:
                        list2 = list4;
                        bool4 = bool10;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str15);
                        kSerializerArr = kSerializerArr2;
                        i7 |= 4;
                        str8 = str17;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool4;
                        str15 = str7;
                        str17 = str8;
                        list4 = list2;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 3:
                        bool4 = bool10;
                        kSerializerArr = kSerializerArr2;
                        i7 |= 8;
                        str7 = str15;
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], list4);
                        str8 = str17;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool4;
                        str15 = str7;
                        str17 = str8;
                        list4 = list2;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 4:
                        bool4 = bool10;
                        i7 |= 16;
                        kSerializerArr = kSerializerArr2;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool9);
                        list2 = list4;
                        str7 = str15;
                        str8 = str17;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool4;
                        str15 = str7;
                        str17 = str8;
                        list4 = list2;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 5:
                        bool4 = bool10;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i7 |= 32;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        str7 = str15;
                        str8 = str17;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool4;
                        str15 = str7;
                        str17 = str8;
                        list4 = list2;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 6:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool10);
                        kSerializerArr = kSerializerArr2;
                        i7 |= 64;
                        list2 = list4;
                        str7 = str15;
                        str8 = str17;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool4;
                        str15 = str7;
                        str17 = str8;
                        list4 = list2;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 7:
                        i7 |= 128;
                        kSerializerArr = kSerializerArr2;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        list2 = list4;
                        str7 = str15;
                        bool4 = bool10;
                        str8 = str17;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool4;
                        str15 = str7;
                        str17 = str8;
                        list4 = list2;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 8:
                        i7 |= 256;
                        kSerializerArr = kSerializerArr2;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool8);
                        list2 = list4;
                        str7 = str15;
                        bool4 = bool10;
                        str8 = str17;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool4;
                        str15 = str7;
                        str17 = str8;
                        list4 = list2;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 9:
                        i7 |= 512;
                        kSerializerArr = kSerializerArr2;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str18);
                        list2 = list4;
                        str7 = str15;
                        bool4 = bool10;
                        str8 = str17;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool4;
                        str15 = str7;
                        str17 = str8;
                        list4 = list2;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 10:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str14);
                        i7 |= 1024;
                        i6 = 12;
                        break;
                    case 11:
                        i7 |= 2048;
                        kSerializerArr = kSerializerArr2;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f5);
                        list2 = list4;
                        str7 = str15;
                        bool4 = bool10;
                        str8 = str17;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool4;
                        str15 = str7;
                        str17 = str8;
                        list4 = list2;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 12:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, FloatSerializer.INSTANCE, f3);
                        kSerializerArr = kSerializerArr2;
                        i7 |= 4096;
                        list2 = list4;
                        str7 = str15;
                        bool4 = bool10;
                        str8 = str17;
                        kSerializerArr2 = kSerializerArr;
                        bool10 = bool4;
                        str15 = str7;
                        str17 = str8;
                        list4 = list2;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list5 = list4;
            String str19 = str15;
            String str20 = str16;
            bool = bool10;
            f = f3;
            bool2 = bool8;
            f2 = f5;
            bool3 = bool9;
            str = str18;
            str2 = strDecodeStringElement2;
            z = zDecodeBooleanElement2;
            str3 = str14;
            str4 = str19;
            list = list5;
            str5 = str17;
            str6 = str20;
            i = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputSSNAppModel(i, str6, str5, str4, list, bool3, z, bool, str2, bool2, str, str3, f2, f, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputSSNAppModel inputSSNAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputSSNAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputSSNAppModel.write$Self$OKCompliance_ok_compliance_impl(inputSSNAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
