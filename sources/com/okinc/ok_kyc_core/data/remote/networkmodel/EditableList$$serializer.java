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
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class EditableList$$serializer implements GeneratedSerializer<EditableList> {
    public static final int $stable;
    public static final EditableList$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EditableList$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EditableList$$serializer editableList$$serializer = new EditableList$$serializer();
        INSTANCE = editableList$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("editable-list", editableList$$serializer, 13);
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
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.EditableList.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = EditableList.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), JsonArraySerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[5]), BuiltinSerializersKt.getNullable(AddMore$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EditableList deserialize(@NotNull Decoder decoder) {
        JsonArray jsonArray;
        String str;
        Boolean bool;
        List list;
        Float f;
        AddMore addMore;
        Float f2;
        Integer num;
        String str2;
        String str3;
        Integer num2;
        Boolean bool2;
        Float f3;
        int i;
        Boolean bool3;
        int i2;
        int i3;
        KSerializer[] kSerializerArr;
        Integer num3;
        Integer num4;
        Float f4;
        Boolean bool4;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = EditableList.$childSerializers;
        int i4 = 7;
        int i5 = 8;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, intSerializer, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, intSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, floatSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            JsonArray jsonArray2 = (JsonArray) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, JsonArraySerializer.INSTANCE, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr2[5], null);
            AddMore addMore2 = (AddMore) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, AddMore$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            Float f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            list = list2;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, null);
            bool = bool6;
            str2 = strDecodeStringElement;
            addMore = addMore2;
            bool2 = bool5;
            str = str7;
            str3 = str6;
            f = f6;
            num2 = num5;
            i = 8191;
            jsonArray = jsonArray2;
            f3 = f5;
            num = num6;
        } else {
            int i6 = 12;
            int i7 = 0;
            boolean z = true;
            String str8 = null;
            JsonArray jsonArray3 = null;
            Boolean bool7 = null;
            List list3 = null;
            Float f7 = null;
            AddMore addMore3 = null;
            Float f8 = null;
            Integer num7 = null;
            String strDecodeStringElement2 = null;
            Integer num8 = null;
            Float f9 = null;
            Boolean bool8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        num3 = num7;
                        num4 = num8;
                        f4 = f9;
                        bool4 = bool8;
                        str4 = str8;
                        z = false;
                        bool8 = bool4;
                        f9 = f4;
                        num7 = num3;
                        str8 = str4;
                        i4 = 7;
                        i5 = 8;
                        i6 = 12;
                        num8 = num4;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        num3 = num7;
                        f4 = f9;
                        bool4 = bool8;
                        Integer num9 = num8;
                        str4 = str8;
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num9);
                        i7 |= 1;
                        bool8 = bool4;
                        f9 = f4;
                        num7 = num3;
                        str8 = str4;
                        i4 = 7;
                        i5 = 8;
                        i6 = 12;
                        num8 = num4;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 1:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num7);
                        i7 |= 2;
                        kSerializerArr2 = kSerializerArr2;
                        i4 = 7;
                        i5 = 8;
                        i6 = 12;
                        break;
                    case 2:
                        f9 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FloatSerializer.INSTANCE, f9);
                        bool3 = bool8;
                        i7 |= 4;
                        bool8 = bool3;
                        i4 = 7;
                        i5 = 8;
                        i6 = 12;
                        break;
                    case 3:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool8);
                        i7 |= 8;
                        bool8 = bool3;
                        i4 = 7;
                        i5 = 8;
                        i6 = 12;
                        break;
                    case 4:
                        jsonArray3 = (JsonArray) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, JsonArraySerializer.INSTANCE, jsonArray3);
                        i2 = i7 | 16;
                        i7 = i2;
                        bool3 = bool8;
                        bool8 = bool3;
                        i4 = 7;
                        i5 = 8;
                        i6 = 12;
                        break;
                    case 5:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr2[5], list3);
                        i2 = i7 | 32;
                        i7 = i2;
                        bool3 = bool8;
                        bool8 = bool3;
                        i4 = 7;
                        i5 = 8;
                        i6 = 12;
                        break;
                    case 6:
                        i7 |= 64;
                        bool3 = bool8;
                        addMore3 = (AddMore) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, AddMore$$serializer.INSTANCE, addMore3);
                        bool8 = bool3;
                        i4 = 7;
                        i5 = 8;
                        i6 = 12;
                        break;
                    case 7:
                        i7 |= 128;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        bool3 = bool8;
                        bool8 = bool3;
                        i4 = 7;
                        i5 = 8;
                        i6 = 12;
                        break;
                    case 8:
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool7);
                        i3 = i7 | 256;
                        i7 = i3;
                        bool3 = bool8;
                        bool8 = bool3;
                        i4 = 7;
                        i5 = 8;
                        i6 = 12;
                        break;
                    case 9:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str8);
                        i3 = i7 | 512;
                        i7 = i3;
                        bool3 = bool8;
                        bool8 = bool3;
                        i4 = 7;
                        i5 = 8;
                        i6 = 12;
                        break;
                    case 10:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str5);
                        i3 = i7 | 1024;
                        i7 = i3;
                        bool3 = bool8;
                        bool8 = bool3;
                        i4 = 7;
                        i5 = 8;
                        i6 = 12;
                        break;
                    case 11:
                        i7 |= 2048;
                        bool3 = bool8;
                        f7 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f7);
                        bool8 = bool3;
                        i4 = 7;
                        i5 = 8;
                        i6 = 12;
                        break;
                    case 12:
                        i7 |= 4096;
                        bool3 = bool8;
                        f8 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, FloatSerializer.INSTANCE, f8);
                        bool8 = bool3;
                        i4 = 7;
                        i5 = 8;
                        i6 = 12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Integer num10 = num7;
            jsonArray = jsonArray3;
            str = str5;
            bool = bool7;
            list = list3;
            f = f7;
            addMore = addMore3;
            f2 = f8;
            num = num10;
            str2 = strDecodeStringElement2;
            str3 = str8;
            num2 = num8;
            bool2 = bool8;
            int i8 = i7;
            f3 = f9;
            i = i8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EditableList(i, num2, num, f3, bool2, jsonArray, list, addMore, str2, bool, str3, str, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EditableList editableList) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(editableList, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EditableList.write$Self$OKCompliance_ok_compliance_impl(editableList, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
