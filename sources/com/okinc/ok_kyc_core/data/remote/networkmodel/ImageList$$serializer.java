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
public final /* synthetic */ class ImageList$$serializer implements GeneratedSerializer<ImageList> {
    public static final int $stable;
    public static final ImageList$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ImageList$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ImageList$$serializer imageList$$serializer = new ImageList$$serializer();
        INSTANCE = imageList$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("image-list", imageList$$serializer, 13);
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

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.ImageList.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = ImageList.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(C43788rvr.KWHzl);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(kSerializerArr[3]);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(intSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable9 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable10 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable11 = BuiltinSerializersKt.getNullable(stringSerializer);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, nullable9, nullable10, nullable11, BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ImageList deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        String str2;
        Boolean bool;
        String str3;
        Boolean bool2;
        String str4;
        Integer num2;
        Float f;
        List list;
        Float f2;
        UIAlignment uIAlignment;
        String str5;
        int i;
        String str6;
        KSerializer[] kSerializerArr;
        String str7;
        Integer num3;
        String str8;
        String str9;
        UIAlignment uIAlignment2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = ImageList.$childSerializers;
        int i2 = 9;
        String str10 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            UIAlignment uIAlignment3 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, C43788rvr.KWHzl, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, intSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            list = list2;
            str2 = str15;
            uIAlignment = uIAlignment3;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, null);
            num = num5;
            str4 = str14;
            str3 = str13;
            bool = bool3;
            bool2 = bool4;
            str = str12;
            f = f3;
            str5 = str11;
            num2 = num4;
            i = 8191;
        } else {
            int i3 = 12;
            int i4 = 0;
            boolean z = true;
            String str16 = null;
            Integer num6 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str17 = null;
            Float f4 = null;
            List list3 = null;
            Float f5 = null;
            UIAlignment uIAlignment4 = null;
            Integer num7 = null;
            String str18 = null;
            String str19 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        str7 = str16;
                        num3 = num7;
                        str8 = str18;
                        str9 = str19;
                        uIAlignment2 = uIAlignment4;
                        z = false;
                        str18 = str8;
                        num7 = num3;
                        kSerializerArr2 = kSerializerArr;
                        uIAlignment4 = uIAlignment2;
                        i2 = 9;
                        i3 = 12;
                        str19 = str9;
                        str16 = str7;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        str7 = str16;
                        num3 = num7;
                        str8 = str18;
                        String str20 = str19;
                        uIAlignment2 = uIAlignment4;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str20);
                        i4 |= 1;
                        str18 = str8;
                        num7 = num3;
                        kSerializerArr2 = kSerializerArr;
                        uIAlignment4 = uIAlignment2;
                        i2 = 9;
                        i3 = 12;
                        str19 = str9;
                        str16 = str7;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        num3 = num7;
                        str8 = str18;
                        str7 = str16;
                        i4 |= 2;
                        str9 = str19;
                        uIAlignment2 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, C43788rvr.KWHzl, uIAlignment4);
                        str18 = str8;
                        num7 = num3;
                        kSerializerArr2 = kSerializerArr;
                        uIAlignment4 = uIAlignment2;
                        i2 = 9;
                        i3 = 12;
                        str19 = str9;
                        str16 = str7;
                        break;
                    case 2:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num7);
                        i4 |= 4;
                        kSerializerArr2 = kSerializerArr2;
                        i2 = 9;
                        i3 = 12;
                        break;
                    case 3:
                        str6 = str18;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], list3);
                        i4 |= 8;
                        str18 = str6;
                        i2 = 9;
                        i3 = 12;
                        break;
                    case 4:
                        str6 = str18;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str16);
                        i4 |= 16;
                        str18 = str6;
                        i2 = 9;
                        i3 = 12;
                        break;
                    case 5:
                        str6 = str18;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num6);
                        i4 |= 32;
                        str18 = str6;
                        i2 = 9;
                        i3 = 12;
                        break;
                    case 6:
                        str6 = str18;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool5);
                        i4 |= 64;
                        str18 = str6;
                        i2 = 9;
                        i3 = 12;
                        break;
                    case 7:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str18);
                        i4 |= 128;
                        str18 = str6;
                        i2 = 9;
                        i3 = 12;
                        break;
                    case 8:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool6);
                        i4 |= 256;
                        str6 = str18;
                        str18 = str6;
                        i2 = 9;
                        i3 = 12;
                        break;
                    case 9:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str17);
                        i4 |= 512;
                        str6 = str18;
                        str18 = str6;
                        i2 = 9;
                        i3 = 12;
                        break;
                    case 10:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str10);
                        i4 |= 1024;
                        str6 = str18;
                        str18 = str6;
                        i2 = 9;
                        i3 = 12;
                        break;
                    case 11:
                        i4 |= 2048;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f4);
                        str6 = str18;
                        str18 = str6;
                        i2 = 9;
                        i3 = 12;
                        break;
                    case 12:
                        i4 |= 4096;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f5);
                        str6 = str18;
                        str18 = str6;
                        i2 = 9;
                        i3 = 12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str16;
            Integer num8 = num7;
            String str21 = str19;
            UIAlignment uIAlignment5 = uIAlignment4;
            num = num6;
            str2 = str10;
            bool = bool5;
            str3 = str18;
            bool2 = bool6;
            str4 = str17;
            num2 = num8;
            f = f4;
            list = list3;
            f2 = f5;
            uIAlignment = uIAlignment5;
            str5 = str21;
            i = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ImageList(i, str5, uIAlignment, num2, list, str, num, bool, str3, bool2, str4, str2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ImageList imageList) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(imageList, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ImageList.write$Self$OKCompliance_ok_compliance_impl(imageList, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
