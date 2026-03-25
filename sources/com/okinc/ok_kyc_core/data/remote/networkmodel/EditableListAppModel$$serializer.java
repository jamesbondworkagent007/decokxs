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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class EditableListAppModel$$serializer implements GeneratedSerializer<EditableListAppModel> {
    public static final int $stable;
    public static final EditableListAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EditableListAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EditableListAppModel$$serializer editableListAppModel$$serializer = new EditableListAppModel$$serializer();
        INSTANCE = editableListAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.EditableListAppModel", editableListAppModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("count", true);
        pluginGeneratedSerialDescriptor.addElement("defaultCount", true);
        pluginGeneratedSerialDescriptor.addElement("deleteTopMargin", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("template", false);
        pluginGeneratedSerialDescriptor.addElement("values", true);
        pluginGeneratedSerialDescriptor.addElement("addMore", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        pluginGeneratedSerialDescriptor.addElement("idNum", false);
        pluginGeneratedSerialDescriptor.addElement("defaultModels", true);
        pluginGeneratedSerialDescriptor.addElement("copyModels", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.EditableListAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = EditableListAppModel.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, intSerializer, BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), kSerializerArr[4], BuiltinSerializersKt.getNullable(kSerializerArr[5]), BuiltinSerializersKt.getNullable(AddMore$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), intSerializer, kSerializerArr[14], BuiltinSerializersKt.getNullable(kSerializerArr[15])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EditableListAppModel deserialize(@NotNull Decoder decoder) {
        Float f;
        Boolean bool;
        int i;
        List list;
        List list2;
        Float f2;
        Float f3;
        String str;
        AddMore addMore;
        List list3;
        int i2;
        List list4;
        int i3;
        String str2;
        Boolean bool2;
        String str3;
        int i4;
        AddMore addMore2;
        List list5;
        List list6;
        List list7;
        Boolean bool3;
        KSerializer[] kSerializerArr;
        Float f4;
        Boolean bool4;
        int i5;
        List list8;
        List list9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = EditableListAppModel.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, floatSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            List list10 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr2[4], null);
            List list11 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr2[5], null);
            AddMore addMore3 = (AddMore) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, AddMore$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            Float f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            Float f7 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
            i = iDecodeIntElement2;
            List list12 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr2[14], null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr2[15], null);
            list4 = list12;
            bool2 = bool6;
            list2 = list11;
            str = strDecodeStringElement;
            bool = bool5;
            f3 = f6;
            str3 = str4;
            i2 = iDecodeIntElement3;
            f2 = f7;
            str2 = str5;
            i3 = iDecodeIntElement;
            i4 = 65535;
            list3 = list10;
            addMore = addMore3;
            f = f5;
        } else {
            int i6 = 15;
            boolean z = true;
            AddMore addMore4 = null;
            List list13 = null;
            List list14 = null;
            String str6 = null;
            Boolean bool7 = null;
            Float f8 = null;
            String str7 = null;
            String strDecodeStringElement2 = null;
            List list15 = null;
            List list16 = null;
            Float f9 = null;
            Boolean bool8 = null;
            int i7 = 0;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            Float f10 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        addMore2 = addMore4;
                        list5 = list13;
                        list6 = list15;
                        list7 = list16;
                        bool3 = bool8;
                        kSerializerArr = kSerializerArr2;
                        f4 = f9;
                        z = false;
                        f9 = f4;
                        bool4 = bool3;
                        list13 = list5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 0:
                        addMore2 = addMore4;
                        list5 = list13;
                        list6 = list15;
                        list7 = list16;
                        bool3 = bool8;
                        kSerializerArr = kSerializerArr2;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i7 |= 1;
                        bool4 = bool3;
                        list13 = list5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 1:
                        addMore2 = addMore4;
                        list5 = list13;
                        list6 = list15;
                        list7 = list16;
                        bool3 = bool8;
                        kSerializerArr = kSerializerArr2;
                        f4 = f9;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i7 |= 2;
                        f9 = f4;
                        bool4 = bool3;
                        list13 = list5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 2:
                        list6 = list15;
                        list7 = list16;
                        kSerializerArr = kSerializerArr2;
                        addMore2 = addMore4;
                        f9 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FloatSerializer.INSTANCE, f9);
                        i5 = i7 | 4;
                        bool4 = bool8;
                        list13 = list13;
                        i7 = i5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 3:
                        list8 = list13;
                        list7 = list16;
                        kSerializerArr = kSerializerArr2;
                        list6 = list15;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool8);
                        i5 = i7 | 8;
                        addMore2 = addMore4;
                        bool4 = bool8;
                        list13 = list8;
                        i7 = i5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 4:
                        list8 = list13;
                        list7 = list16;
                        kSerializerArr = kSerializerArr2;
                        i5 = i7 | 16;
                        addMore2 = addMore4;
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr2[4], list15);
                        bool4 = bool8;
                        list13 = list8;
                        i7 = i5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 5:
                        list9 = list13;
                        list16 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr2[5], list16);
                        addMore2 = addMore4;
                        i5 = i7 | 32;
                        list6 = list15;
                        list7 = list16;
                        list13 = list9;
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool8;
                        i7 = i5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 6:
                        list9 = list13;
                        addMore4 = (AddMore) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, AddMore$$serializer.INSTANCE, addMore4);
                        i5 = i7 | 64;
                        addMore2 = addMore4;
                        list6 = list15;
                        list7 = list16;
                        list13 = list9;
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool8;
                        i7 = i5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 7:
                        list9 = list13;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        addMore2 = addMore4;
                        i5 = i7 | 128;
                        list6 = list15;
                        list7 = list16;
                        list13 = list9;
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool8;
                        i7 = i5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 8:
                        list9 = list13;
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool7);
                        i5 = i7 | 256;
                        addMore2 = addMore4;
                        list6 = list15;
                        list7 = list16;
                        list13 = list9;
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool8;
                        i7 = i5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 9:
                        list9 = list13;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str7);
                        i5 = i7 | 512;
                        addMore2 = addMore4;
                        list6 = list15;
                        list7 = list16;
                        list13 = list9;
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool8;
                        i7 = i5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 10:
                        list9 = list13;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str6);
                        i5 = i7 | 1024;
                        addMore2 = addMore4;
                        list6 = list15;
                        list7 = list16;
                        list13 = list9;
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool8;
                        i7 = i5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 11:
                        list9 = list13;
                        f10 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f10);
                        i5 = i7 | 2048;
                        addMore2 = addMore4;
                        list6 = list15;
                        list7 = list16;
                        list13 = list9;
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool8;
                        i7 = i5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 12:
                        list9 = list13;
                        f8 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, FloatSerializer.INSTANCE, f8);
                        i5 = i7 | 4096;
                        addMore2 = addMore4;
                        list6 = list15;
                        list7 = list16;
                        list13 = list9;
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool8;
                        i7 = i5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 13:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
                        addMore2 = addMore4;
                        i5 = i7 | 8192;
                        list6 = list15;
                        list7 = list16;
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool8;
                        i7 = i5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 14:
                        list13 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr2[14], list13);
                        i5 = i7 | 16384;
                        addMore2 = addMore4;
                        list6 = list15;
                        list7 = list16;
                        kSerializerArr = kSerializerArr2;
                        bool4 = bool8;
                        i7 = i5;
                        bool8 = bool4;
                        addMore4 = addMore2;
                        list15 = list6;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 15;
                        list16 = list7;
                        break;
                    case 15:
                        list14 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, kSerializerArr2[i6], list14);
                        i7 |= 32768;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list17 = list15;
            f = f9;
            bool = bool8;
            i = iDecodeIntElement4;
            list = list14;
            list2 = list16;
            f2 = f8;
            f3 = f10;
            str = strDecodeStringElement2;
            addMore = addMore4;
            list3 = list17;
            i2 = iDecodeIntElement5;
            list4 = list13;
            i3 = iDecodeIntElement6;
            str2 = str6;
            bool2 = bool7;
            str3 = str7;
            i4 = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EditableListAppModel(i4, i3, i, f, bool, list3, list2, addMore, str, bool2, str3, str2, f3, f2, i2, list4, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EditableListAppModel editableListAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(editableListAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EditableListAppModel.write$Self$OKCompliance_ok_compliance_impl(editableListAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
