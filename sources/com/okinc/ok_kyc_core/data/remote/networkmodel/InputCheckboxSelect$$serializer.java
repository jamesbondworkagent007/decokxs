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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class InputCheckboxSelect$$serializer implements GeneratedSerializer<InputCheckboxSelect> {
    public static final int $stable;
    public static final InputCheckboxSelect$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputCheckboxSelect$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputCheckboxSelect$$serializer inputCheckboxSelect$$serializer = new InputCheckboxSelect$$serializer();
        INSTANCE = inputCheckboxSelect$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("input-checkbox-select", inputCheckboxSelect$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("groupedValues", true);
        pluginGeneratedSerialDescriptor.addElement("selectAllText", true);
        pluginGeneratedSerialDescriptor.addElement("enableSelectAll", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputCheckboxSelect.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer kSerializer = InputCheckboxSelect.$childSerializers[0];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(booleanSerializer);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{kSerializer, nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputCheckboxSelect deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        String str;
        Float f;
        Boolean bool2;
        Float f2;
        String str2;
        Boolean bool3;
        String str3;
        String str4;
        List list;
        int i;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InputCheckboxSelect.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 8;
        String str7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, null);
            str2 = str11;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            bool2 = bool6;
            str3 = str10;
            str = str9;
            f = f3;
            bool3 = bool5;
            list = list2;
            i = 1023;
            bool = bool4;
            str4 = str8;
        } else {
            boolean z = true;
            int i6 = 0;
            Float f4 = null;
            Boolean bool7 = null;
            Float f5 = null;
            bool = null;
            str = null;
            Boolean bool8 = null;
            String str12 = null;
            String str13 = null;
            List list3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str5 = str12;
                        str6 = str13;
                        z = false;
                        str13 = str6;
                        str12 = str5;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 0:
                        str5 = str12;
                        str6 = str13;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list3);
                        i6 |= 1;
                        str13 = str6;
                        str12 = str5;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 1:
                        str6 = str13;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str12);
                        i6 |= 2;
                        str5 = str12;
                        str13 = str6;
                        str12 = str5;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 2:
                        str6 = str13;
                        bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool);
                        i6 |= 4;
                        str5 = str12;
                        str13 = str6;
                        str12 = str5;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 3:
                        str6 = str13;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str);
                        i6 |= 8;
                        str5 = str12;
                        str13 = str6;
                        str12 = str5;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 4:
                        str6 = str13;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool8);
                        i6 |= 16;
                        str5 = str12;
                        str13 = str6;
                        str12 = str5;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 5:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str13);
                        i6 |= 32;
                        str5 = str12;
                        str13 = str6;
                        str12 = str5;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 6:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str7);
                        i6 |= 64;
                        str5 = str12;
                        str6 = str13;
                        str13 = str6;
                        str12 = str5;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 7:
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.INSTANCE, bool7);
                        i6 |= 128;
                        str5 = str12;
                        str6 = str13;
                        str13 = str6;
                        str12 = str5;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 8:
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, FloatSerializer.INSTANCE, f4);
                        i6 |= 256;
                        break;
                    case 9:
                        i6 |= 512;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f5);
                        str5 = str12;
                        str6 = str13;
                        str13 = str6;
                        str12 = str5;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str14 = str12;
            f = f4;
            bool2 = bool7;
            f2 = f5;
            str2 = str7;
            bool3 = bool8;
            str3 = str13;
            str4 = str14;
            list = list3;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputCheckboxSelect(i, list, str4, bool, str, bool3, str3, str2, bool2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputCheckboxSelect inputCheckboxSelect) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputCheckboxSelect, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputCheckboxSelect.write$Self$OKCompliance_ok_compliance_impl(inputCheckboxSelect, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
