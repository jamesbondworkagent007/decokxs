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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ListPickerPopUp$$serializer implements GeneratedSerializer<ListPickerPopUp> {
    public static final int $stable;
    public static final ListPickerPopUp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ListPickerPopUp$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ListPickerPopUp$$serializer listPickerPopUp$$serializer = new ListPickerPopUp$$serializer();
        INSTANCE = listPickerPopUp$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("list-picker-popup", listPickerPopUp$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("itemsTop", true);
        pluginGeneratedSerialDescriptor.addElement("choices", true);
        pluginGeneratedSerialDescriptor.addElement("additionalChoices", true);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        pluginGeneratedSerialDescriptor.addElement("defaultChoice", true);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUp.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = ListPickerPopUp.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        JsonArraySerializer jsonArraySerializer = JsonArraySerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(jsonArraySerializer), BuiltinSerializersKt.getNullable(kSerializerArr[2]), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(jsonArraySerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(Cta$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ListPickerPopUp deserialize(@NotNull Decoder decoder) {
        String str;
        Boolean bool;
        Float f;
        Boolean bool2;
        JsonArray jsonArray;
        String str2;
        Float f2;
        Cta cta;
        List list;
        String str3;
        JsonArray jsonArray2;
        List list2;
        String str4;
        String str5;
        int i;
        List list3;
        JsonArray jsonArray3;
        List list4;
        KSerializer[] kSerializerArr;
        JsonArray jsonArray4;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = ListPickerPopUp.$childSerializers;
        int i3 = 9;
        int i4 = 8;
        Float f3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            JsonArraySerializer jsonArraySerializer = JsonArraySerializer.INSTANCE;
            JsonArray jsonArray5 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, jsonArraySerializer, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr2[2], null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], null);
            JsonArray jsonArray6 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, jsonArraySerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            Cta cta2 = (Cta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, Cta$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, booleanSerializer, null);
            jsonArray = jsonArray6;
            str5 = str7;
            str3 = strDecodeStringElement2;
            bool2 = bool3;
            str2 = str8;
            f2 = f4;
            list2 = list6;
            str4 = strDecodeStringElement;
            jsonArray2 = jsonArray5;
            cta = cta2;
            str = str6;
            i = 16383;
            list = list5;
        } else {
            int i5 = 13;
            boolean z = true;
            String str9 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str10 = null;
            String str11 = null;
            Float f5 = null;
            List list7 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            JsonArray jsonArray7 = null;
            JsonArray jsonArray8 = null;
            List list8 = null;
            int i6 = 0;
            Cta cta3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list3 = list7;
                        jsonArray3 = jsonArray7;
                        list4 = list8;
                        kSerializerArr = kSerializerArr2;
                        z = false;
                        jsonArray7 = jsonArray3;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 13;
                        i3 = 9;
                        list8 = list4;
                        i4 = 8;
                        break;
                    case 0:
                        list3 = list7;
                        jsonArray3 = jsonArray7;
                        list4 = list8;
                        kSerializerArr = kSerializerArr2;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        jsonArray7 = jsonArray3;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 13;
                        i3 = 9;
                        list8 = list4;
                        i4 = 8;
                        break;
                    case 1:
                        jsonArray3 = jsonArray7;
                        list4 = list8;
                        kSerializerArr = kSerializerArr2;
                        list3 = list7;
                        i6 |= 2;
                        jsonArray8 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, JsonArraySerializer.INSTANCE, jsonArray8);
                        jsonArray7 = jsonArray3;
                        list7 = list3;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 13;
                        i3 = 9;
                        list8 = list4;
                        i4 = 8;
                        break;
                    case 2:
                        list4 = list8;
                        kSerializerArr = kSerializerArr2;
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr2[2], list7);
                        i6 |= 4;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 13;
                        i3 = 9;
                        list8 = list4;
                        i4 = 8;
                        break;
                    case 3:
                        jsonArray4 = jsonArray7;
                        i6 |= 8;
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], list8);
                        jsonArray7 = jsonArray4;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 4:
                        i6 |= 16;
                        jsonArray4 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, JsonArraySerializer.INSTANCE, jsonArray7);
                        jsonArray7 = jsonArray4;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 5:
                        i6 |= 32;
                        jsonArray4 = jsonArray7;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str9);
                        jsonArray7 = jsonArray4;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 6:
                        i6 |= 64;
                        cta3 = (Cta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, Cta$$serializer.INSTANCE, cta3);
                        jsonArray4 = jsonArray7;
                        jsonArray7 = jsonArray4;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 7:
                        i6 |= 128;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        jsonArray4 = jsonArray7;
                        jsonArray7 = jsonArray4;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 8:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool5);
                        i2 = i6 | 256;
                        i6 = i2;
                        jsonArray4 = jsonArray7;
                        jsonArray7 = jsonArray4;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 9:
                        i6 |= 512;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str10);
                        jsonArray4 = jsonArray7;
                        jsonArray7 = jsonArray4;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 10:
                        i6 |= 1024;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str11);
                        jsonArray4 = jsonArray7;
                        jsonArray7 = jsonArray4;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 11:
                        i6 |= 2048;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f5);
                        jsonArray4 = jsonArray7;
                        jsonArray7 = jsonArray4;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 12:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, FloatSerializer.INSTANCE, f3);
                        i2 = i6 | 4096;
                        i6 = i2;
                        jsonArray4 = jsonArray7;
                        jsonArray7 = jsonArray4;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 13:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool4);
                        i2 = i6 | 8192;
                        i6 = i2;
                        jsonArray4 = jsonArray7;
                        jsonArray7 = jsonArray4;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list9 = list7;
            str = str9;
            bool = bool4;
            f = f3;
            bool2 = bool5;
            jsonArray = jsonArray7;
            str2 = str11;
            f2 = f5;
            cta = cta3;
            list = list9;
            str3 = strDecodeStringElement4;
            jsonArray2 = jsonArray8;
            list2 = list8;
            str4 = strDecodeStringElement3;
            str5 = str10;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ListPickerPopUp(i, str4, jsonArray2, list, list2, jsonArray, str, cta, str3, bool2, str5, str2, f2, f, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ListPickerPopUp listPickerPopUp) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(listPickerPopUp, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ListPickerPopUp.write$Self$OKCompliance_ok_compliance_impl(listPickerPopUp, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
