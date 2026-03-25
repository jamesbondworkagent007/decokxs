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
public final /* synthetic */ class NewFileUploaderAppModel$$serializer implements GeneratedSerializer<NewFileUploaderAppModel> {
    public static final int $stable;
    public static final NewFileUploaderAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NewFileUploaderAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NewFileUploaderAppModel$$serializer newFileUploaderAppModel$$serializer = new NewFileUploaderAppModel$$serializer();
        INSTANCE = newFileUploaderAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.NewFileUploaderAppModel", newFileUploaderAppModel$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("extensions", false);
        pluginGeneratedSerialDescriptor.addElement("files", true);
        pluginGeneratedSerialDescriptor.addElement("isShowCamera", true);
        pluginGeneratedSerialDescriptor.addElement("imageType", false);
        pluginGeneratedSerialDescriptor.addElement("limit", true);
        pluginGeneratedSerialDescriptor.addElement("tipsTitle", true);
        pluginGeneratedSerialDescriptor.addElement("fileSize", false);
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

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.NewFileUploaderAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = NewFileUploaderAppModel.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], BuiltinSerializersKt.getNullable(kSerializerArr[1]), BuiltinSerializersKt.getNullable(booleanSerializer), intSerializer, BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[9]), BuiltinSerializersKt.getNullable(kSerializerArr[10]), BuiltinSerializersKt.getNullable(kSerializerArr[11]), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NewFileUploaderAppModel deserialize(@NotNull Decoder decoder) {
        List list;
        Float f;
        Boolean bool;
        String str;
        Boolean bool2;
        Long l;
        List list2;
        int i;
        String str2;
        String str3;
        List list3;
        Boolean bool3;
        boolean z;
        List list4;
        int i2;
        List list5;
        String str4;
        Boolean bool4;
        Float f2;
        int i3;
        Boolean bool5;
        String str5;
        boolean z2;
        List list6;
        Long l2;
        List list7;
        KSerializer[] kSerializerArr;
        boolean zDecodeBooleanElement;
        List list8;
        Boolean bool6;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = NewFileUploaderAppModel.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr2[0], null);
            List list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr2[1], null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            List list11 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr2[9], null);
            List list12 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr2[10], null);
            List list13 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr2[11], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, booleanSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, floatSerializer, null);
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, floatSerializer, null);
            bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, booleanSerializer, null);
            z = zDecodeBooleanElement2;
            str2 = str6;
            i3 = iDecodeIntElement;
            f2 = f3;
            bool = bool9;
            list2 = list13;
            l = l3;
            str3 = strDecodeStringElement;
            list5 = list10;
            i2 = 524287;
            bool2 = bool8;
            list4 = list9;
            i = iDecodeIntElement2;
            str4 = str8;
            list3 = list11;
            bool4 = bool7;
            str = str7;
            list = list12;
        } else {
            int i5 = 0;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            boolean z3 = true;
            Boolean bool10 = null;
            String str9 = null;
            List list14 = null;
            Boolean bool11 = null;
            String str10 = null;
            String str11 = null;
            Float f4 = null;
            Boolean bool12 = null;
            List list15 = null;
            String strDecodeStringElement2 = null;
            Boolean bool13 = null;
            List list16 = null;
            Long l4 = null;
            List list17 = null;
            List list18 = null;
            Float f5 = null;
            boolean z4 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool5 = bool10;
                        str5 = str9;
                        z2 = z4;
                        list6 = list16;
                        l2 = l4;
                        list7 = list17;
                        kSerializerArr = kSerializerArr2;
                        z3 = false;
                        l4 = l2;
                        str9 = str5;
                        list16 = list6;
                        bool10 = bool5;
                        kSerializerArr2 = kSerializerArr;
                        z4 = z2;
                        list17 = list7;
                        break;
                    case 0:
                        bool5 = bool10;
                        str5 = str9;
                        z2 = z4;
                        list6 = list16;
                        l2 = l4;
                        list7 = list17;
                        kSerializerArr = kSerializerArr2;
                        list18 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr2[0], list18);
                        i5 |= 1;
                        l4 = l2;
                        str9 = str5;
                        list16 = list6;
                        bool10 = bool5;
                        kSerializerArr2 = kSerializerArr;
                        z4 = z2;
                        list17 = list7;
                        break;
                    case 1:
                        bool5 = bool10;
                        str5 = str9;
                        z2 = z4;
                        list6 = list16;
                        l2 = l4;
                        list17 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr2[1], list17);
                        i5 |= 2;
                        list7 = list17;
                        kSerializerArr = kSerializerArr2;
                        l4 = l2;
                        str9 = str5;
                        list16 = list6;
                        bool10 = bool5;
                        kSerializerArr2 = kSerializerArr;
                        z4 = z2;
                        list17 = list7;
                        break;
                    case 2:
                        bool5 = bool10;
                        z2 = z4;
                        list6 = list16;
                        l2 = l4;
                        str5 = str9;
                        bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool13);
                        i5 |= 4;
                        list7 = list17;
                        kSerializerArr = kSerializerArr2;
                        l4 = l2;
                        str9 = str5;
                        list16 = list6;
                        bool10 = bool5;
                        kSerializerArr2 = kSerializerArr;
                        z4 = z2;
                        list17 = list7;
                        break;
                    case 3:
                        bool5 = bool10;
                        z2 = z4;
                        list6 = list16;
                        l2 = l4;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i5 |= 8;
                        str5 = str9;
                        list7 = list17;
                        kSerializerArr = kSerializerArr2;
                        l4 = l2;
                        str9 = str5;
                        list16 = list6;
                        bool10 = bool5;
                        kSerializerArr2 = kSerializerArr;
                        z4 = z2;
                        list17 = list7;
                        break;
                    case 4:
                        bool5 = bool10;
                        z2 = z4;
                        list6 = list16;
                        i5 |= 16;
                        str5 = str9;
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, l4);
                        list7 = list17;
                        kSerializerArr = kSerializerArr2;
                        l4 = l2;
                        str9 = str5;
                        list16 = list6;
                        bool10 = bool5;
                        kSerializerArr2 = kSerializerArr;
                        z4 = z2;
                        list17 = list7;
                        break;
                    case 5:
                        zDecodeBooleanElement = z4;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str9);
                        i5 |= 32;
                        bool10 = bool10;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 6:
                        zDecodeBooleanElement = z4;
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i5 |= 64;
                        list8 = list16;
                        bool10 = bool10;
                        list16 = list8;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 7:
                        i5 |= 128;
                        list8 = list16;
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        bool10 = bool10;
                        list16 = list8;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 8:
                        bool6 = bool10;
                        zDecodeBooleanElement = z4;
                        i5 |= 256;
                        list8 = list16;
                        bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool12);
                        bool10 = bool6;
                        list16 = list8;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 9:
                        zDecodeBooleanElement = z4;
                        bool6 = bool10;
                        i5 |= 512;
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr2[9], list16);
                        bool10 = bool6;
                        list16 = list8;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 10:
                        zDecodeBooleanElement = z4;
                        list14 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr2[10], list14);
                        i5 |= 1024;
                        list8 = list16;
                        list16 = list8;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 11:
                        zDecodeBooleanElement = z4;
                        i5 |= 2048;
                        list15 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr2[11], list15);
                        list8 = list16;
                        list16 = list8;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 12:
                        zDecodeBooleanElement = z4;
                        i5 |= 4096;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        list8 = list16;
                        list16 = list8;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 13:
                        zDecodeBooleanElement = z4;
                        i5 |= 8192;
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, bool11);
                        list8 = list16;
                        list16 = list8;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 14:
                        zDecodeBooleanElement = z4;
                        i5 |= 16384;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str10);
                        list8 = list16;
                        list16 = list8;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 15:
                        zDecodeBooleanElement = z4;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str11);
                        i4 = 32768;
                        i5 |= i4;
                        list8 = list16;
                        list16 = list8;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 16:
                        zDecodeBooleanElement = z4;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, FloatSerializer.INSTANCE, f4);
                        i4 = 65536;
                        i5 |= i4;
                        list8 = list16;
                        list16 = list8;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 17:
                        zDecodeBooleanElement = z4;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, FloatSerializer.INSTANCE, f5);
                        i4 = 131072;
                        i5 |= i4;
                        list8 = list16;
                        list16 = list8;
                        z4 = zDecodeBooleanElement;
                        break;
                    case 18:
                        zDecodeBooleanElement = z4;
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, bool10);
                        i4 = 262144;
                        i5 |= i4;
                        list8 = list16;
                        list16 = list8;
                        z4 = zDecodeBooleanElement;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            boolean z5 = z4;
            list = list14;
            f = f5;
            bool = bool11;
            str = str10;
            bool2 = bool12;
            l = l4;
            list2 = list15;
            i = iDecodeIntElement3;
            str2 = str9;
            str3 = strDecodeStringElement2;
            list3 = list16;
            bool3 = bool10;
            z = z5;
            list4 = list18;
            i2 = i5;
            list5 = list17;
            str4 = str11;
            bool4 = bool13;
            int i6 = iDecodeIntElement4;
            f2 = f4;
            i3 = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NewFileUploaderAppModel(i2, list4, list5, bool4, i3, l, str2, i, z, bool2, list3, list, list2, str3, bool, str, str4, f2, f, bool3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NewFileUploaderAppModel newFileUploaderAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(newFileUploaderAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NewFileUploaderAppModel.write$Self$OKCompliance_ok_compliance_impl(newFileUploaderAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
