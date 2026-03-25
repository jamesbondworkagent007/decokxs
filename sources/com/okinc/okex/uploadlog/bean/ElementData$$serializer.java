package com.okinc.okex.uploadlog.bean;

import com.okinc.localization2.bean.AppLocaleInfo;
import com.okinc.okex.uploadlog.bean.enums.FormValueType;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class ElementData$$serializer implements GeneratedSerializer<ElementData> {
    public static final int $stable;
    public static final ElementData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ElementData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ElementData$$serializer elementData$$serializer = new ElementData$$serializer();
        INSTANCE = elementData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.uploadlog.bean.ElementData", elementData$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement(AppLocaleInfo.KEY_DISPLAY_NAME, true);
        pluginGeneratedSerialDescriptor.addElement("defaultValue", true);
        pluginGeneratedSerialDescriptor.addElement("valueType", true);
        pluginGeneratedSerialDescriptor.addElement("isRequired", true);
        pluginGeneratedSerialDescriptor.addElement("placeholder", true);
        pluginGeneratedSerialDescriptor.addElement("fieldOptions", true);
        pluginGeneratedSerialDescriptor.addElement("formConditions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = ElementData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[7]), BuiltinSerializersKt.getNullable(kSerializerArr[8])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ElementData deserialize(@NotNull Decoder decoder) {
        String str;
        FormValueType formValueType;
        List list;
        String str2;
        String str3;
        String str4;
        List list2;
        String str5;
        int i;
        Boolean bool;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ElementData.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        int i4 = 7;
        String str7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            FormValueType formValueType2 = (FormValueType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            str5 = strDecodeStringElement;
            str2 = str11;
            bool = bool2;
            str = str10;
            str4 = str9;
            list = list3;
            i = 511;
            str3 = str8;
            formValueType = formValueType2;
        } else {
            int i5 = 0;
            boolean z = true;
            FormValueType formValueType3 = null;
            Boolean bool3 = null;
            List list4 = null;
            String str12 = null;
            String str13 = null;
            List list5 = null;
            String str14 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str6 = str14;
                        z = false;
                        str14 = str6;
                        i2 = 6;
                        i3 = 5;
                        i4 = 7;
                        break;
                    case 0:
                        str6 = str14;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        str14 = str6;
                        i2 = 6;
                        i3 = 5;
                        i4 = 7;
                        break;
                    case 1:
                        str6 = str14;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str7);
                        i5 |= 2;
                        str14 = str6;
                        i2 = 6;
                        i3 = 5;
                        i4 = 7;
                        break;
                    case 2:
                        str6 = str14;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str13);
                        i5 |= 4;
                        str14 = str6;
                        i2 = 6;
                        i3 = 5;
                        i4 = 7;
                        break;
                    case 3:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str14);
                        i5 |= 8;
                        str6 = str14;
                        str14 = str6;
                        i2 = 6;
                        i3 = 5;
                        i4 = 7;
                        break;
                    case 4:
                        formValueType3 = (FormValueType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], formValueType3);
                        i5 |= 16;
                        str6 = str14;
                        str14 = str6;
                        i2 = 6;
                        i3 = 5;
                        i4 = 7;
                        break;
                    case 5:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.INSTANCE, bool3);
                        i5 |= 32;
                        str6 = str14;
                        str14 = str6;
                        i2 = 6;
                        i3 = 5;
                        i4 = 7;
                        break;
                    case 6:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str12);
                        i5 |= 64;
                        str6 = str14;
                        str14 = str6;
                        i2 = 6;
                        i3 = 5;
                        i4 = 7;
                        break;
                    case 7:
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kSerializerArr[i4], list4);
                        i5 |= 128;
                        break;
                    case 8:
                        i5 |= 256;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], list5);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str14;
            formValueType = formValueType3;
            list = list4;
            str2 = str12;
            str3 = str7;
            str4 = str13;
            list2 = list5;
            str5 = strDecodeStringElement2;
            i = i5;
            bool = bool3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ElementData(i, str5, str3, str4, str, formValueType, bool, str2, list, list2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ElementData elementData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(elementData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ElementData.write$Self$OKSupport_support_impl(elementData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
