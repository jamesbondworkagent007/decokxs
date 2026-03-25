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
public final /* synthetic */ class FileUploaderAppModel$$serializer implements GeneratedSerializer<FileUploaderAppModel> {
    public static final int $stable;
    public static final FileUploaderAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FileUploaderAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FileUploaderAppModel$$serializer fileUploaderAppModel$$serializer = new FileUploaderAppModel$$serializer();
        INSTANCE = fileUploaderAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.FileUploaderAppModel", fileUploaderAppModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("extensions", false);
        pluginGeneratedSerialDescriptor.addElement("files", true);
        pluginGeneratedSerialDescriptor.addElement("imageType", false);
        pluginGeneratedSerialDescriptor.addElement("limit", true);
        pluginGeneratedSerialDescriptor.addElement("fileSize", false);
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

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.FileUploaderAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = FileUploaderAppModel.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], BuiltinSerializersKt.getNullable(kSerializerArr[1]), intSerializer, BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), intSerializer, booleanSerializer, stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FileUploaderAppModel deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        String str;
        List list;
        Boolean bool2;
        String str2;
        Float f;
        String str3;
        boolean z;
        int i;
        Float f2;
        int i2;
        Long l;
        List list2;
        int i3;
        Long l2;
        List list3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = FileUploaderAppModel.$childSerializers;
        int i4 = 10;
        int i5 = 9;
        int i6 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            f = f3;
            str = str5;
            bool2 = bool3;
            z = zDecodeBooleanElement;
            str2 = str4;
            i = iDecodeIntElement2;
            i3 = 8191;
            list2 = list5;
            i2 = iDecodeIntElement;
            str3 = strDecodeStringElement;
            l = l3;
            list = list4;
        } else {
            int i7 = 12;
            int i8 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement3 = 0;
            Boolean bool4 = null;
            String str6 = null;
            Boolean bool5 = null;
            String str7 = null;
            Long l4 = null;
            String strDecodeStringElement2 = null;
            List list6 = null;
            List list7 = null;
            boolean z2 = true;
            Float f4 = null;
            Float f5 = null;
            int iDecodeIntElement4 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        l2 = l4;
                        list3 = list7;
                        z2 = false;
                        l4 = l2;
                        list7 = list3;
                        i7 = 12;
                        i4 = 10;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 0:
                        l2 = l4;
                        list3 = list7;
                        i8 |= 1;
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list6);
                        l4 = l2;
                        list7 = list3;
                        i7 = 12;
                        i4 = 10;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 1:
                        l2 = l4;
                        i8 |= 2;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], list7);
                        l4 = l2;
                        list7 = list3;
                        i7 = 12;
                        i4 = 10;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 2:
                        l2 = l4;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i8 |= 4;
                        list3 = list7;
                        l4 = l2;
                        list7 = list3;
                        i7 = 12;
                        i4 = 10;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 3:
                        i8 |= 8;
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, l4);
                        list3 = list7;
                        l4 = l2;
                        list7 = list3;
                        i7 = 12;
                        i4 = 10;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 4:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i8 |= 16;
                        l2 = l4;
                        list3 = list7;
                        l4 = l2;
                        list7 = list3;
                        i7 = 12;
                        i4 = 10;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i8 |= 32;
                        l2 = l4;
                        list3 = list7;
                        l4 = l2;
                        list7 = list3;
                        i7 = 12;
                        i4 = 10;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 6:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i8 |= 64;
                        l2 = l4;
                        list3 = list7;
                        l4 = l2;
                        list7 = list3;
                        i7 = 12;
                        i4 = 10;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 7:
                        i8 |= 128;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool5);
                        l2 = l4;
                        list3 = list7;
                        l4 = l2;
                        list7 = list3;
                        i7 = 12;
                        i4 = 10;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 8:
                        i8 |= 256;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str7);
                        l2 = l4;
                        list3 = list7;
                        l4 = l2;
                        list7 = list3;
                        i7 = 12;
                        i4 = 10;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 9:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str6);
                        i8 |= 512;
                        i7 = 12;
                        break;
                    case 10:
                        i8 |= 1024;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, FloatSerializer.INSTANCE, f5);
                        l2 = l4;
                        list3 = list7;
                        l4 = l2;
                        list7 = list3;
                        i7 = 12;
                        i4 = 10;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 11:
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f4);
                        i8 |= 2048;
                        l2 = l4;
                        list3 = list7;
                        l4 = l2;
                        list7 = list3;
                        i7 = 12;
                        i4 = 10;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 12:
                        i8 |= 4096;
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i7, BooleanSerializer.INSTANCE, bool4);
                        l2 = l4;
                        list3 = list7;
                        l4 = l2;
                        list7 = list3;
                        i7 = 12;
                        i4 = 10;
                        i5 = 9;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Long l5 = l4;
            bool = bool4;
            str = str6;
            list = list6;
            bool2 = bool5;
            str2 = str7;
            f = f5;
            str3 = strDecodeStringElement2;
            z = zDecodeBooleanElement2;
            i = iDecodeIntElement3;
            f2 = f4;
            i2 = iDecodeIntElement4;
            l = l5;
            list2 = list7;
            i3 = i8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FileUploaderAppModel(i3, list, list2, i2, l, i, z, str3, bool2, str2, str, f, f2, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FileUploaderAppModel fileUploaderAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(fileUploaderAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FileUploaderAppModel.write$Self$OKCompliance_ok_compliance_impl(fileUploaderAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
