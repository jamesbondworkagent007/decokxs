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
public final /* synthetic */ class AssetList$$serializer implements GeneratedSerializer<AssetList> {
    public static final int $stable;
    public static final AssetList$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AssetList$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AssetList$$serializer assetList$$serializer = new AssetList$$serializer();
        INSTANCE = assetList$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("asset-list", assetList$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("buttonText", true);
        pluginGeneratedSerialDescriptor.addElement("total", true);
        pluginGeneratedSerialDescriptor.addElement("current", true);
        pluginGeneratedSerialDescriptor.addElement("maxSize", true);
        pluginGeneratedSerialDescriptor.addElement("maxSizeWarning", true);
        pluginGeneratedSerialDescriptor.addElement("createCta", true);
        pluginGeneratedSerialDescriptor.addElement("fieldValue", true);
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

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.AssetList.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = AssetList.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(CTAButton$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[6]), BuiltinSerializersKt.getNullable(Choices$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AssetList deserialize(@NotNull Decoder decoder) {
        String str;
        Choices choices;
        String str2;
        Float f;
        Boolean bool;
        Float f2;
        String str3;
        Integer num;
        String str4;
        String str5;
        String str6;
        CTAButton cTAButton;
        Boolean bool2;
        String str7;
        ArrayList arrayList;
        int i;
        KSerializer[] kSerializerArr;
        String str8;
        String str9;
        Integer num2;
        CTAButton cTAButton2;
        String str10;
        String str11;
        String str12;
        String str13;
        KSerializer[] kSerializerArr2;
        CTAButton cTAButton3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = AssetList.$childSerializers;
        int i2 = 9;
        Float f3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            CTAButton cTAButton4 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, CTAButton$$serializer.INSTANCE, null);
            ArrayList arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr3[6], null);
            Choices choices2 = (Choices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, Choices$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            str = str14;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, null);
            bool = bool4;
            choices = choices2;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, null);
            bool2 = bool3;
            str5 = strDecodeStringElement;
            cTAButton = cTAButton4;
            str7 = str17;
            str4 = str18;
            str3 = str16;
            str2 = str19;
            arrayList = arrayList2;
            str6 = str15;
            i = 32767;
            num = num3;
        } else {
            int i3 = 14;
            int i4 = 0;
            boolean z = true;
            String str20 = null;
            Choices choices3 = null;
            String str21 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str22 = null;
            Float f4 = null;
            ArrayList arrayList3 = null;
            String str23 = null;
            Integer num4 = null;
            String strDecodeStringElement2 = null;
            CTAButton cTAButton5 = null;
            String str24 = null;
            String str25 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr3;
                        str8 = str20;
                        str9 = str23;
                        num2 = num4;
                        cTAButton2 = cTAButton5;
                        str10 = str25;
                        str11 = str24;
                        z = false;
                        str12 = str10;
                        str13 = str9;
                        str23 = str13;
                        cTAButton5 = cTAButton2;
                        num4 = num2;
                        str20 = str8;
                        kSerializerArr3 = kSerializerArr;
                        str24 = str11;
                        i3 = 14;
                        str25 = str12;
                        i2 = 9;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr3;
                        str8 = str20;
                        str9 = str23;
                        num2 = num4;
                        cTAButton2 = cTAButton5;
                        String str26 = str25;
                        str11 = str24;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str26);
                        i4 |= 1;
                        str12 = str10;
                        str13 = str9;
                        str23 = str13;
                        cTAButton5 = cTAButton2;
                        num4 = num2;
                        str20 = str8;
                        kSerializerArr3 = kSerializerArr;
                        str24 = str11;
                        i3 = 14;
                        str25 = str12;
                        i2 = 9;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr3;
                        str8 = str20;
                        num2 = num4;
                        cTAButton2 = cTAButton5;
                        str9 = str23;
                        i4 |= 2;
                        str10 = str25;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str24);
                        str12 = str10;
                        str13 = str9;
                        str23 = str13;
                        cTAButton5 = cTAButton2;
                        num4 = num2;
                        str20 = str8;
                        kSerializerArr3 = kSerializerArr;
                        str24 = str11;
                        i3 = 14;
                        str25 = str12;
                        i2 = 9;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr3;
                        str8 = str20;
                        cTAButton2 = cTAButton5;
                        num2 = num4;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str23);
                        i4 |= 4;
                        str12 = str25;
                        str11 = str24;
                        str23 = str13;
                        cTAButton5 = cTAButton2;
                        num4 = num2;
                        str20 = str8;
                        kSerializerArr3 = kSerializerArr;
                        str24 = str11;
                        i3 = 14;
                        str25 = str12;
                        i2 = 9;
                        break;
                    case 3:
                        kSerializerArr2 = kSerializerArr3;
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num4);
                        i4 |= 8;
                        str20 = str20;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 4:
                        kSerializerArr2 = kSerializerArr3;
                        cTAButton3 = cTAButton5;
                        i4 |= 16;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str22);
                        cTAButton5 = cTAButton3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 5:
                        kSerializerArr2 = kSerializerArr3;
                        cTAButton3 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, CTAButton$$serializer.INSTANCE, cTAButton5);
                        i4 |= 32;
                        cTAButton5 = cTAButton3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 6:
                        i4 |= 64;
                        kSerializerArr2 = kSerializerArr3;
                        arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr3[6], arrayList3);
                        cTAButton3 = cTAButton5;
                        cTAButton5 = cTAButton3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 7:
                        choices3 = (Choices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, Choices$$serializer.INSTANCE, choices3);
                        kSerializerArr2 = kSerializerArr3;
                        i4 |= 128;
                        cTAButton3 = cTAButton5;
                        cTAButton5 = cTAButton3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 8:
                        i4 |= 256;
                        kSerializerArr2 = kSerializerArr3;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        cTAButton3 = cTAButton5;
                        cTAButton5 = cTAButton3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 9:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool6);
                        i4 |= 512;
                        kSerializerArr2 = kSerializerArr3;
                        cTAButton3 = cTAButton5;
                        cTAButton5 = cTAButton3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 10:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str20);
                        i4 |= 1024;
                        kSerializerArr2 = kSerializerArr3;
                        cTAButton3 = cTAButton5;
                        cTAButton5 = cTAButton3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 11:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str21);
                        i4 |= 2048;
                        kSerializerArr2 = kSerializerArr3;
                        cTAButton3 = cTAButton5;
                        cTAButton5 = cTAButton3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 12:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, bool5);
                        i4 |= 4096;
                        kSerializerArr2 = kSerializerArr3;
                        cTAButton3 = cTAButton5;
                        cTAButton5 = cTAButton3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 13:
                        i4 |= 8192;
                        kSerializerArr2 = kSerializerArr3;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, FloatSerializer.INSTANCE, f4);
                        cTAButton3 = cTAButton5;
                        cTAButton5 = cTAButton3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        break;
                    case 14:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f3);
                        i4 |= 16384;
                        kSerializerArr2 = kSerializerArr3;
                        cTAButton3 = cTAButton5;
                        cTAButton5 = cTAButton3;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 14;
                        i2 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str27 = str20;
            String str28 = str23;
            CTAButton cTAButton6 = cTAButton5;
            String str29 = str25;
            String str30 = str24;
            str = str29;
            choices = choices3;
            str2 = str21;
            f = f3;
            bool = bool5;
            f2 = f4;
            str3 = str28;
            num = num4;
            str4 = str27;
            str5 = strDecodeStringElement2;
            str6 = str30;
            cTAButton = cTAButton6;
            bool2 = bool6;
            str7 = str22;
            arrayList = arrayList3;
            i = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AssetList(i, str, str6, str3, num, str7, cTAButton, arrayList, choices, str5, bool2, str4, str2, bool, f2, f, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AssetList assetList) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(assetList, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AssetList.write$Self$OKCompliance_ok_compliance_impl(assetList, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
