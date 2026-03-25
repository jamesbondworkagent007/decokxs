package com.okinc.ok_kyc_core.data.remote.networkmodel;

import java.util.ArrayList;
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
public final /* synthetic */ class AssetListAppModel$$serializer implements GeneratedSerializer<AssetListAppModel> {
    public static final int $stable;
    public static final AssetListAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AssetListAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AssetListAppModel$$serializer assetListAppModel$$serializer = new AssetListAppModel$$serializer();
        INSTANCE = assetListAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.AssetListAppModel", assetListAppModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("buttonText", true);
        pluginGeneratedSerialDescriptor.addElement("total", true);
        pluginGeneratedSerialDescriptor.addElement("current", true);
        pluginGeneratedSerialDescriptor.addElement("maxSize", false);
        pluginGeneratedSerialDescriptor.addElement("maxSizeWarning", true);
        pluginGeneratedSerialDescriptor.addElement("createCta", true);
        pluginGeneratedSerialDescriptor.addElement("fieldValue", false);
        pluginGeneratedSerialDescriptor.addElement("choices", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.AssetListAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AssetListAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(CTAButtonAppModel$$serializer.INSTANCE), kSerializerArr[6], BuiltinSerializersKt.getNullable(Choices$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AssetListAppModel deserialize(@NotNull Decoder decoder) {
        Float f;
        String str;
        ArrayList arrayList;
        String str2;
        Boolean bool;
        Float f2;
        CTAButtonAppModel cTAButtonAppModel;
        Boolean bool2;
        String str3;
        int i;
        int i2;
        Choices choices;
        String str4;
        String str5;
        String str6;
        String str7;
        ArrayList arrayList2;
        KSerializer[] kSerializerArr;
        Boolean bool3;
        String str8;
        ArrayList arrayList3;
        String str9;
        String str10;
        String str11;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = AssetListAppModel.$childSerializers;
        int i3 = 9;
        int i4 = 8;
        Float f3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            CTAButtonAppModel cTAButtonAppModel2 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, CTAButtonAppModel$$serializer.INSTANCE, null);
            ArrayList arrayList4 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr2[6], null);
            Choices choices2 = (Choices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, Choices$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            arrayList = arrayList4;
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, null);
            bool2 = bool5;
            choices = choices2;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, null);
            cTAButtonAppModel = cTAButtonAppModel2;
            bool = bool4;
            str3 = strDecodeStringElement;
            str5 = str15;
            str7 = str12;
            str = str16;
            i = iDecodeIntElement;
            str2 = str14;
            str6 = str13;
            i2 = 32767;
        } else {
            int i5 = 14;
            int i6 = 0;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            Boolean bool6 = null;
            Choices choices3 = null;
            String str17 = null;
            Boolean bool7 = null;
            Float f4 = null;
            String str18 = null;
            CTAButtonAppModel cTAButtonAppModel3 = null;
            String str19 = null;
            String strDecodeStringElement2 = null;
            ArrayList arrayList5 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        bool3 = bool6;
                        str8 = str19;
                        arrayList3 = arrayList5;
                        str9 = str21;
                        str10 = str22;
                        str11 = str20;
                        z = false;
                        arrayList5 = arrayList3;
                        str22 = str10;
                        str19 = str8;
                        kSerializerArr2 = kSerializerArr;
                        str20 = str11;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        str21 = str9;
                        bool6 = bool3;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        bool3 = bool6;
                        str8 = str19;
                        arrayList3 = arrayList5;
                        str10 = str22;
                        String str23 = str21;
                        str11 = str20;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str23);
                        i6 |= 1;
                        arrayList5 = arrayList3;
                        str22 = str10;
                        str19 = str8;
                        kSerializerArr2 = kSerializerArr;
                        str20 = str11;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        str21 = str9;
                        bool6 = bool3;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        str8 = str19;
                        arrayList3 = arrayList5;
                        str10 = str22;
                        bool3 = bool6;
                        i6 |= 2;
                        str9 = str21;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str20);
                        arrayList5 = arrayList3;
                        str22 = str10;
                        str19 = str8;
                        kSerializerArr2 = kSerializerArr;
                        str20 = str11;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        str21 = str9;
                        bool6 = bool3;
                        break;
                    case 2:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str19);
                        i6 |= 4;
                        kSerializerArr2 = kSerializerArr2;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 3:
                        arrayList2 = arrayList5;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i6 |= 8;
                        arrayList5 = arrayList2;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 4:
                        arrayList2 = arrayList5;
                        i6 |= 16;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str22);
                        arrayList5 = arrayList2;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 5:
                        arrayList2 = arrayList5;
                        i6 |= 32;
                        cTAButtonAppModel3 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, CTAButtonAppModel$$serializer.INSTANCE, cTAButtonAppModel3);
                        arrayList5 = arrayList2;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 6:
                        i6 |= 64;
                        arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr2[6], arrayList5);
                        arrayList5 = arrayList2;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 7:
                        choices3 = (Choices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, Choices$$serializer.INSTANCE, choices3);
                        i6 |= 128;
                        arrayList2 = arrayList5;
                        arrayList5 = arrayList2;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 8:
                        i6 |= 256;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        arrayList2 = arrayList5;
                        arrayList5 = arrayList2;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 9:
                        i6 |= 512;
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.INSTANCE, bool7);
                        arrayList2 = arrayList5;
                        arrayList5 = arrayList2;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 10:
                        i6 |= 1024;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str18);
                        arrayList2 = arrayList5;
                        arrayList5 = arrayList2;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 11:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str17);
                        i6 |= 2048;
                        arrayList2 = arrayList5;
                        arrayList5 = arrayList2;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 12:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, bool6);
                        i6 |= 4096;
                        arrayList2 = arrayList5;
                        arrayList5 = arrayList2;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 13:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, FloatSerializer.INSTANCE, f3);
                        i6 |= 8192;
                        arrayList2 = arrayList5;
                        arrayList5 = arrayList2;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 14:
                        i6 |= 16384;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, FloatSerializer.INSTANCE, f4);
                        arrayList2 = arrayList5;
                        arrayList5 = arrayList2;
                        i5 = 14;
                        i3 = 9;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str24 = str19;
            f = f3;
            str = str17;
            arrayList = arrayList5;
            str2 = str22;
            bool = bool7;
            f2 = f4;
            cTAButtonAppModel = cTAButtonAppModel3;
            bool2 = bool6;
            str3 = strDecodeStringElement2;
            i = iDecodeIntElement2;
            i2 = i6;
            choices = choices3;
            str4 = str24;
            str5 = str18;
            str6 = str20;
            str7 = str21;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AssetListAppModel(i2, str7, str6, str4, i, str2, cTAButtonAppModel, arrayList, choices, str3, bool, str5, str, bool2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AssetListAppModel assetListAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(assetListAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AssetListAppModel.write$Self$OKCompliance_ok_compliance_impl(assetListAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
