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
public final /* synthetic */ class FileUploader$$serializer implements GeneratedSerializer<FileUploader> {
    public static final int $stable;
    public static final FileUploader$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FileUploader$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FileUploader$$serializer fileUploader$$serializer = new FileUploader$$serializer();
        INSTANCE = fileUploader$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("file-uploader", fileUploader$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("extensions", false);
        pluginGeneratedSerialDescriptor.addElement("files", true);
        pluginGeneratedSerialDescriptor.addElement("fileSize", false);
        pluginGeneratedSerialDescriptor.addElement("imageType", false);
        pluginGeneratedSerialDescriptor.addElement("limit", true);
        pluginGeneratedSerialDescriptor.addElement("shouldCallOcr", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.FileUploader.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = FileUploader.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], BuiltinSerializersKt.getNullable(kSerializerArr[1]), BuiltinSerializersKt.getNullable(intSerializer), intSerializer, BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FileUploader deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        Boolean bool;
        String str2;
        Float f;
        List list;
        Float f2;
        Boolean bool2;
        String str3;
        int i;
        List list2;
        Boolean bool3;
        Long l;
        int i2;
        Integer num2;
        List list3;
        KSerializer[] kSerializerArr;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = FileUploader.$childSerializers;
        int i3 = 10;
        int i4 = 9;
        Boolean bool4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr2[0], null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr2[1], null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            i2 = 8191;
            f = f4;
            list2 = list4;
            bool3 = bool7;
            f2 = f3;
            str2 = str5;
            bool = bool6;
            str3 = strDecodeStringElement;
            bool2 = bool5;
            i = iDecodeIntElement;
            str = str4;
            l = l2;
            list = list5;
            num = num3;
        } else {
            int i5 = 12;
            int i6 = 0;
            int iDecodeIntElement2 = 0;
            String str6 = null;
            Boolean bool8 = null;
            String str7 = null;
            Float f5 = null;
            Float f6 = null;
            Long l3 = null;
            String strDecodeStringElement2 = null;
            Integer num4 = null;
            List list6 = null;
            List list7 = null;
            boolean z = true;
            Boolean bool9 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        num2 = num4;
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        z = false;
                        num4 = num2;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        list7 = list3;
                        break;
                    case 0:
                        num2 = num4;
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr2[0], list6);
                        i6 |= 1;
                        num4 = num2;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        list7 = list3;
                        break;
                    case 1:
                        num2 = num4;
                        List list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr2[1], list7);
                        i6 |= 2;
                        kSerializerArr = kSerializerArr2;
                        list3 = list8;
                        num4 = num2;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        list7 = list3;
                        break;
                    case 2:
                        i6 |= 4;
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num4);
                        num4 = num2;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        list7 = list3;
                        break;
                    case 3:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i6 |= 8;
                        num2 = num4;
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        num4 = num2;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        list7 = list3;
                        break;
                    case 4:
                        i6 |= 16;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, l3);
                        num2 = num4;
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        num4 = num2;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        list7 = list3;
                        break;
                    case 5:
                        i6 |= 32;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool9);
                        num2 = num4;
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        num4 = num2;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        list7 = list3;
                        break;
                    case 6:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i6 |= 64;
                        num2 = num4;
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        num4 = num2;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        list7 = list3;
                        break;
                    case 7:
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool8);
                        i6 |= 128;
                        num2 = num4;
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        num4 = num2;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        list7 = list3;
                        break;
                    case 8:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str6);
                        i6 |= 256;
                        num2 = num4;
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        num4 = num2;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        list7 = list3;
                        break;
                    case 9:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str7);
                        i6 |= 512;
                        num2 = num4;
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        num4 = num2;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        list7 = list3;
                        break;
                    case 10:
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f6);
                        i6 |= 1024;
                        i5 = 12;
                        break;
                    case 11:
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f5);
                        i6 |= 2048;
                        num2 = num4;
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        num4 = num2;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        list7 = list3;
                        break;
                    case 12:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool4);
                        i6 |= 4096;
                        num2 = num4;
                        list3 = list7;
                        kSerializerArr = kSerializerArr2;
                        num4 = num2;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        list7 = list3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Integer num5 = num4;
            List list9 = list6;
            List list10 = list7;
            str = str6;
            num = num5;
            bool = bool8;
            str2 = str7;
            f = f5;
            list = list10;
            f2 = f6;
            bool2 = bool9;
            str3 = strDecodeStringElement2;
            i = iDecodeIntElement2;
            list2 = list9;
            bool3 = bool4;
            l = l3;
            i2 = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FileUploader(i2, list2, list, num, i, l, bool2, str3, bool, str, str2, f2, f, bool3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FileUploader fileUploader) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(fileUploader, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FileUploader.write$Self$OKCompliance_ok_compliance_impl(fileUploader, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
