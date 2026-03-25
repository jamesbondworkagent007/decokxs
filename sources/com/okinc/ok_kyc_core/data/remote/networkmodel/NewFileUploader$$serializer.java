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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class NewFileUploader$$serializer implements GeneratedSerializer<NewFileUploader> {
    public static final int $stable;
    public static final NewFileUploader$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NewFileUploader$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NewFileUploader$$serializer newFileUploader$$serializer = new NewFileUploader$$serializer();
        INSTANCE = newFileUploader$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("file-uploader-preview", newFileUploader$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("extensions", false);
        pluginGeneratedSerialDescriptor.addElement("files", true);
        pluginGeneratedSerialDescriptor.addElement("isShowCamera", true);
        pluginGeneratedSerialDescriptor.addElement("fileSize", false);
        pluginGeneratedSerialDescriptor.addElement("imageType", false);
        pluginGeneratedSerialDescriptor.addElement("limit", true);
        pluginGeneratedSerialDescriptor.addElement("tipsTitle", true);
        pluginGeneratedSerialDescriptor.addElement("shouldCallOcr", true);
        pluginGeneratedSerialDescriptor.addElement("shouldShowOnLoad", true);
        pluginGeneratedSerialDescriptor.addElement("viewIdsToShow", true);
        pluginGeneratedSerialDescriptor.addElement("viewIdsToHide", true);
        pluginGeneratedSerialDescriptor.addElement("viewIdsToCollapse", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.NewFileUploader.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = NewFileUploader.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], BuiltinSerializersKt.getNullable(kSerializerArr[1]), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(intSerializer), intSerializer, BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[9]), BuiltinSerializersKt.getNullable(kSerializerArr[10]), BuiltinSerializersKt.getNullable(kSerializerArr[11]), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NewFileUploader deserialize(@NotNull Decoder decoder) {
        List list;
        Boolean bool;
        String str;
        String str2;
        Float f;
        Boolean bool2;
        int i;
        List list2;
        Long l;
        Boolean bool3;
        Boolean bool4;
        String str3;
        List list3;
        Float f2;
        int i2;
        List list4;
        Boolean bool5;
        String str4;
        Integer num;
        List list5;
        Float f3;
        int i3;
        List list6;
        int i4;
        Float f4;
        Boolean bool6;
        int iDecodeIntElement;
        Long l2;
        Integer num2;
        List list7;
        Boolean bool7;
        List list8;
        KSerializer[] kSerializerArr;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = NewFileUploader.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr2[0], null);
            List list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr2[1], null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            Boolean bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            List list11 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr2[9], null);
            List list12 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr2[10], null);
            List list13 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr2[11], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            Boolean bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, booleanSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, floatSerializer, null);
            Float f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, floatSerializer, null);
            Boolean bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, booleanSerializer, null);
            list2 = list12;
            bool5 = bool10;
            f = f5;
            list = list13;
            list3 = list11;
            f2 = f6;
            str2 = str7;
            str3 = strDecodeStringElement;
            list4 = list10;
            bool3 = bool8;
            i = 524287;
            bool4 = bool9;
            i2 = iDecodeIntElement2;
            num = num3;
            list5 = list9;
            bool = bool12;
            str4 = str5;
            l = l3;
            str = str6;
            bool2 = bool11;
        } else {
            int i5 = 0;
            boolean z = true;
            Float f7 = null;
            Boolean bool13 = null;
            List list14 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            Float f8 = null;
            Boolean bool14 = null;
            List list15 = null;
            Boolean bool15 = null;
            String strDecodeStringElement2 = null;
            Long l4 = null;
            Integer num4 = null;
            List list16 = null;
            List list17 = null;
            Boolean bool16 = null;
            List list18 = null;
            Boolean bool17 = null;
            int i6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        f4 = f7;
                        bool6 = bool13;
                        iDecodeIntElement = i5;
                        l2 = l4;
                        num2 = num4;
                        list7 = list16;
                        bool7 = bool16;
                        list8 = list18;
                        kSerializerArr = kSerializerArr2;
                        z = false;
                        bool16 = bool7;
                        num4 = num2;
                        l4 = l2;
                        bool13 = bool6;
                        list18 = list8;
                        kSerializerArr2 = kSerializerArr;
                        i5 = iDecodeIntElement;
                        list16 = list7;
                        f7 = f4;
                        break;
                    case 0:
                        f4 = f7;
                        bool6 = bool13;
                        iDecodeIntElement = i5;
                        l2 = l4;
                        num2 = num4;
                        list7 = list16;
                        bool7 = bool16;
                        list8 = list18;
                        kSerializerArr = kSerializerArr2;
                        list17 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr2[0], list17);
                        i6 |= 1;
                        bool16 = bool7;
                        num4 = num2;
                        l4 = l2;
                        bool13 = bool6;
                        list18 = list8;
                        kSerializerArr2 = kSerializerArr;
                        i5 = iDecodeIntElement;
                        list16 = list7;
                        f7 = f4;
                        break;
                    case 1:
                        f4 = f7;
                        bool6 = bool13;
                        iDecodeIntElement = i5;
                        l2 = l4;
                        num2 = num4;
                        bool7 = bool16;
                        list8 = list18;
                        list16 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr2[1], list16);
                        i6 |= 2;
                        list7 = list16;
                        kSerializerArr = kSerializerArr2;
                        bool16 = bool7;
                        num4 = num2;
                        l4 = l2;
                        bool13 = bool6;
                        list18 = list8;
                        kSerializerArr2 = kSerializerArr;
                        i5 = iDecodeIntElement;
                        list16 = list7;
                        f7 = f4;
                        break;
                    case 2:
                        f4 = f7;
                        bool6 = bool13;
                        iDecodeIntElement = i5;
                        l2 = l4;
                        bool7 = bool16;
                        list8 = list18;
                        num2 = num4;
                        bool15 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool15);
                        i6 |= 4;
                        list7 = list16;
                        kSerializerArr = kSerializerArr2;
                        bool16 = bool7;
                        num4 = num2;
                        l4 = l2;
                        bool13 = bool6;
                        list18 = list8;
                        kSerializerArr2 = kSerializerArr;
                        i5 = iDecodeIntElement;
                        list16 = list7;
                        f7 = f4;
                        break;
                    case 3:
                        f4 = f7;
                        bool6 = bool13;
                        iDecodeIntElement = i5;
                        bool7 = bool16;
                        list8 = list18;
                        l2 = l4;
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num4);
                        i6 |= 8;
                        num2 = num4;
                        list7 = list16;
                        kSerializerArr = kSerializerArr2;
                        bool16 = bool7;
                        num4 = num2;
                        l4 = l2;
                        bool13 = bool6;
                        list18 = list8;
                        kSerializerArr2 = kSerializerArr;
                        i5 = iDecodeIntElement;
                        list16 = list7;
                        f7 = f4;
                        break;
                    case 4:
                        f4 = f7;
                        bool6 = bool13;
                        bool7 = bool16;
                        list8 = list18;
                        i6 |= 16;
                        l2 = l4;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        num2 = num4;
                        list7 = list16;
                        kSerializerArr = kSerializerArr2;
                        bool16 = bool7;
                        num4 = num2;
                        l4 = l2;
                        bool13 = bool6;
                        list18 = list8;
                        kSerializerArr2 = kSerializerArr;
                        i5 = iDecodeIntElement;
                        list16 = list7;
                        f7 = f4;
                        break;
                    case 5:
                        f4 = f7;
                        iDecodeIntElement = i5;
                        bool7 = bool16;
                        list8 = list18;
                        bool6 = bool13;
                        i6 |= 32;
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l4);
                        num2 = num4;
                        list7 = list16;
                        kSerializerArr = kSerializerArr2;
                        bool16 = bool7;
                        num4 = num2;
                        l4 = l2;
                        bool13 = bool6;
                        list18 = list8;
                        kSerializerArr2 = kSerializerArr;
                        i5 = iDecodeIntElement;
                        list16 = list7;
                        f7 = f4;
                        break;
                    case 6:
                        f4 = f7;
                        iDecodeIntElement = i5;
                        bool7 = bool16;
                        list8 = list18;
                        bool6 = bool13;
                        i6 |= 64;
                        l2 = l4;
                        num2 = num4;
                        list7 = list16;
                        kSerializerArr = kSerializerArr2;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str8);
                        bool16 = bool7;
                        num4 = num2;
                        l4 = l2;
                        bool13 = bool6;
                        list18 = list8;
                        kSerializerArr2 = kSerializerArr;
                        i5 = iDecodeIntElement;
                        list16 = list7;
                        f7 = f4;
                        break;
                    case 7:
                        f3 = f7;
                        i3 = i5;
                        bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool13);
                        i6 |= 128;
                        f7 = f3;
                        i5 = i3;
                        break;
                    case 8:
                        f3 = f7;
                        i3 = i5;
                        list6 = list18;
                        bool16 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool16);
                        i6 |= 256;
                        list18 = list6;
                        f7 = f3;
                        i5 = i3;
                        break;
                    case 9:
                        i3 = i5;
                        f3 = f7;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr2[9], list18);
                        i6 |= 512;
                        list18 = list6;
                        f7 = f3;
                        i5 = i3;
                        break;
                    case 10:
                        i3 = i5;
                        i6 |= 1024;
                        f3 = f7;
                        list15 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr2[10], list15);
                        list6 = list18;
                        list18 = list6;
                        f7 = f3;
                        i5 = i3;
                        break;
                    case 11:
                        i3 = i5;
                        f3 = f7;
                        i6 |= 2048;
                        list6 = list18;
                        list14 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr2[11], list14);
                        list18 = list6;
                        f7 = f3;
                        i5 = i3;
                        break;
                    case 12:
                        i3 = i5;
                        i6 |= 4096;
                        f3 = f7;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        list6 = list18;
                        list18 = list6;
                        f7 = f3;
                        i5 = i3;
                        break;
                    case 13:
                        i3 = i5;
                        f3 = f7;
                        i6 |= 8192;
                        list6 = list18;
                        bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, bool14);
                        list18 = list6;
                        f7 = f3;
                        i5 = i3;
                        break;
                    case 14:
                        i3 = i5;
                        f3 = f7;
                        i6 |= 16384;
                        list6 = list18;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str9);
                        list18 = list6;
                        f7 = f3;
                        i5 = i3;
                        break;
                    case 15:
                        i3 = i5;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str10);
                        i4 = 32768;
                        i6 = i4 | i6;
                        f3 = f7;
                        list6 = list18;
                        list18 = list6;
                        f7 = f3;
                        i5 = i3;
                        break;
                    case 16:
                        i3 = i5;
                        f8 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, FloatSerializer.INSTANCE, f8);
                        i4 = 65536;
                        i6 = i4 | i6;
                        f3 = f7;
                        list6 = list18;
                        list18 = list6;
                        f7 = f3;
                        i5 = i3;
                        break;
                    case 17:
                        i3 = i5;
                        f7 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, FloatSerializer.INSTANCE, f7);
                        i4 = 131072;
                        i6 = i4 | i6;
                        f3 = f7;
                        list6 = list18;
                        list18 = list6;
                        f7 = f3;
                        i5 = i3;
                        break;
                    case 18:
                        i3 = i5;
                        bool17 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, bool17);
                        i4 = 262144;
                        i6 = i4 | i6;
                        f3 = f7;
                        list6 = list18;
                        list18 = list6;
                        f7 = f3;
                        i5 = i3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool18 = bool13;
            list = list14;
            bool = bool17;
            str = str9;
            str2 = str10;
            f = f8;
            bool2 = bool14;
            i = i6;
            list2 = list15;
            l = l4;
            bool3 = bool15;
            bool4 = bool18;
            str3 = strDecodeStringElement2;
            list3 = list18;
            f2 = f7;
            i2 = i5;
            list4 = list16;
            bool5 = bool16;
            str4 = str8;
            num = num4;
            list5 = list17;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NewFileUploader(i, list5, list4, bool3, num, i2, l, str4, bool4, bool5, list3, list2, list, str3, bool2, str, str2, f, f2, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NewFileUploader newFileUploader) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(newFileUploader, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NewFileUploader.write$Self$OKCompliance_ok_compliance_impl(newFileUploader, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
