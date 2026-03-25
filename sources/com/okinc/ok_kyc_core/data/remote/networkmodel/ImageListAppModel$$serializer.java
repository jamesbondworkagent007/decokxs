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
import o.C43788rvr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ImageListAppModel$$serializer implements GeneratedSerializer<ImageListAppModel> {
    public static final int $stable;
    public static final ImageListAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ImageListAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ImageListAppModel$$serializer imageListAppModel$$serializer = new ImageListAppModel$$serializer();
        INSTANCE = imageListAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.ImageListAppModel", imageListAppModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("adaptiveMode", true);
        pluginGeneratedSerialDescriptor.addElement("align", false);
        pluginGeneratedSerialDescriptor.addElement("height", true);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("width", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", true);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.ImageListAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = ImageListAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(C43788rvr.KWHzl), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ImageListAppModel deserialize(@NotNull Decoder decoder) {
        Float f;
        String str;
        Boolean bool;
        Boolean bool2;
        Integer num;
        String str2;
        UIAlignment uIAlignment;
        Float f2;
        String str3;
        String str4;
        Integer num2;
        int i;
        List list;
        String str5;
        List list2;
        int i2;
        KSerializer[] kSerializerArr;
        List list3;
        UIAlignment uIAlignment2;
        String str6;
        Integer num3;
        Float f3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = ImageListAppModel.$childSerializers;
        int i3 = 9;
        int i4 = 8;
        Float f4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            UIAlignment uIAlignment3 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, C43788rvr.KWHzl, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, intSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            str2 = str10;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, null);
            str = str9;
            str3 = strDecodeStringElement;
            bool = bool3;
            bool2 = bool4;
            i = 8191;
            str4 = str8;
            f2 = f5;
            str5 = str7;
            list = list4;
            uIAlignment = uIAlignment3;
            num = num4;
        } else {
            int i5 = 12;
            int i6 = 0;
            boolean z = true;
            Float f6 = null;
            String str11 = null;
            String str12 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Integer num5 = null;
            String str13 = null;
            List list5 = null;
            UIAlignment uIAlignment4 = null;
            String str14 = null;
            String strDecodeStringElement2 = null;
            Integer num6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        list3 = list5;
                        uIAlignment2 = uIAlignment4;
                        str6 = str14;
                        num3 = num6;
                        f3 = f6;
                        z = false;
                        num6 = num3;
                        list5 = list3;
                        uIAlignment4 = uIAlignment2;
                        f6 = f3;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        str14 = str6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        list3 = list5;
                        uIAlignment2 = uIAlignment4;
                        num3 = num6;
                        String str15 = str14;
                        f3 = f6;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str15);
                        i6 |= 1;
                        num6 = num3;
                        list5 = list3;
                        uIAlignment4 = uIAlignment2;
                        f6 = f3;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        str14 = str6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 1:
                        uIAlignment4 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, C43788rvr.KWHzl, uIAlignment4);
                        i6 |= 2;
                        kSerializerArr2 = kSerializerArr2;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 2:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num6);
                        i6 |= 4;
                        list2 = list5;
                        list5 = list2;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 3:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], list5);
                        i6 |= 8;
                        list5 = list2;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 4:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str11);
                        i6 |= 16;
                        list2 = list5;
                        list5 = list2;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 5:
                        i6 |= 32;
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num5);
                        list2 = list5;
                        list5 = list2;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 6:
                        i6 |= 64;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool5);
                        list2 = list5;
                        list5 = list2;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 7:
                        i6 |= 128;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        list2 = list5;
                        list5 = list2;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 8:
                        i6 |= 256;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool6);
                        list2 = list5;
                        list5 = list2;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 9:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str12);
                        i2 = i6 | 512;
                        i6 = i2;
                        list2 = list5;
                        list5 = list2;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 10:
                        i6 |= 1024;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str13);
                        list2 = list5;
                        list5 = list2;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 11:
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f6);
                        i2 = i6 | 2048;
                        i6 = i2;
                        list2 = list5;
                        list5 = list2;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    case 12:
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, FloatSerializer.INSTANCE, f4);
                        i2 = i6 | 4096;
                        i6 = i2;
                        list2 = list5;
                        list5 = list2;
                        i3 = 9;
                        i4 = 8;
                        i5 = 12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list6 = list5;
            UIAlignment uIAlignment5 = uIAlignment4;
            f = f4;
            str = str12;
            bool = bool5;
            bool2 = bool6;
            num = num5;
            str2 = str13;
            uIAlignment = uIAlignment5;
            f2 = f6;
            str3 = strDecodeStringElement2;
            str4 = str11;
            num2 = num6;
            i = i6;
            list = list6;
            str5 = str14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ImageListAppModel(i, str5, uIAlignment, num2, list, str4, num, bool, str3, bool2, str, str2, f2, f, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ImageListAppModel imageListAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(imageListAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ImageListAppModel.write$Self$OKCompliance_ok_compliance_impl(imageListAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
