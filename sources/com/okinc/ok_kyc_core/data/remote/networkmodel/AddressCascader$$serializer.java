package com.okinc.ok_kyc_core.data.remote.networkmodel;

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
public final /* synthetic */ class AddressCascader$$serializer implements GeneratedSerializer<AddressCascader> {
    public static final int $stable;
    public static final AddressCascader$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AddressCascader$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AddressCascader$$serializer addressCascader$$serializer = new AddressCascader$$serializer();
        INSTANCE = addressCascader$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("address-cascader", addressCascader$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("placeholder", true);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("enabled", true);
        pluginGeneratedSerialDescriptor.addElement("divisionTitle", true);
        pluginGeneratedSerialDescriptor.addElement("fieldValue", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(DivisionTitle$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(AddressCascaderFildValue$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AddressCascader deserialize(@NotNull Decoder decoder) {
        int i;
        Float f;
        Boolean bool;
        String str;
        Boolean bool2;
        Float f2;
        String str2;
        DivisionTitle divisionTitle;
        String str3;
        Boolean bool3;
        String str4;
        AddressCascaderFildValue addressCascaderFildValue;
        String str5;
        DivisionTitle divisionTitle2;
        Boolean bool4;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 8;
        Float f3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            DivisionTitle divisionTitle3 = (DivisionTitle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, DivisionTitle$$serializer.INSTANCE, null);
            AddressCascaderFildValue addressCascaderFildValue2 = (AddressCascaderFildValue) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, AddressCascaderFildValue$$serializer.INSTANCE, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            str3 = str10;
            bool = bool7;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            str = str9;
            str2 = strDecodeStringElement;
            bool2 = bool6;
            addressCascaderFildValue = addressCascaderFildValue2;
            f = f4;
            i = 4095;
            str4 = str7;
            bool3 = bool5;
            str5 = str8;
            divisionTitle = divisionTitle3;
        } else {
            int i6 = 11;
            int i7 = 0;
            boolean z = true;
            String str11 = null;
            Float f5 = null;
            Boolean bool8 = null;
            AddressCascaderFildValue addressCascaderFildValue3 = null;
            String str12 = null;
            Boolean bool9 = null;
            DivisionTitle divisionTitle4 = null;
            String strDecodeStringElement2 = null;
            Boolean bool10 = null;
            String str13 = null;
            String str14 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        divisionTitle2 = divisionTitle4;
                        bool4 = bool10;
                        str6 = str14;
                        z = false;
                        divisionTitle4 = divisionTitle2;
                        bool10 = bool4;
                        str14 = str6;
                        i6 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 0:
                        divisionTitle2 = divisionTitle4;
                        bool4 = bool10;
                        str6 = str14;
                        i7 |= 1;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str13);
                        divisionTitle4 = divisionTitle2;
                        bool10 = bool4;
                        str14 = str6;
                        i6 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 1:
                        divisionTitle2 = divisionTitle4;
                        bool4 = bool10;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str14);
                        i7 |= 2;
                        divisionTitle4 = divisionTitle2;
                        bool10 = bool4;
                        str14 = str6;
                        i6 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 2:
                        divisionTitle2 = divisionTitle4;
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool10);
                        i7 |= 4;
                        str6 = str14;
                        divisionTitle4 = divisionTitle2;
                        bool10 = bool4;
                        str14 = str6;
                        i6 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 3:
                        divisionTitle2 = (DivisionTitle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, DivisionTitle$$serializer.INSTANCE, divisionTitle4);
                        i7 |= 8;
                        bool4 = bool10;
                        str6 = str14;
                        divisionTitle4 = divisionTitle2;
                        bool10 = bool4;
                        str14 = str6;
                        i6 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 4:
                        i7 |= 16;
                        addressCascaderFildValue3 = (AddressCascaderFildValue) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, AddressCascaderFildValue$$serializer.INSTANCE, addressCascaderFildValue3);
                        divisionTitle2 = divisionTitle4;
                        bool4 = bool10;
                        str6 = str14;
                        divisionTitle4 = divisionTitle2;
                        bool10 = bool4;
                        str14 = str6;
                        i6 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 5:
                        i7 |= 32;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool9);
                        divisionTitle2 = divisionTitle4;
                        bool4 = bool10;
                        str6 = str14;
                        divisionTitle4 = divisionTitle2;
                        bool10 = bool4;
                        str14 = str6;
                        i6 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 6:
                        i7 |= 64;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        divisionTitle2 = divisionTitle4;
                        bool4 = bool10;
                        str6 = str14;
                        divisionTitle4 = divisionTitle2;
                        bool10 = bool4;
                        str14 = str6;
                        i6 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 7:
                        i7 |= 128;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.INSTANCE, bool8);
                        divisionTitle2 = divisionTitle4;
                        bool4 = bool10;
                        str6 = str14;
                        divisionTitle4 = divisionTitle2;
                        bool10 = bool4;
                        str14 = str6;
                        i6 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 8:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str12);
                        i7 |= 256;
                        i6 = 11;
                        break;
                    case 9:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str11);
                        i7 |= 512;
                        divisionTitle2 = divisionTitle4;
                        bool4 = bool10;
                        str6 = str14;
                        divisionTitle4 = divisionTitle2;
                        bool10 = bool4;
                        str14 = str6;
                        i6 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 10:
                        i7 |= 1024;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, FloatSerializer.INSTANCE, f5);
                        divisionTitle2 = divisionTitle4;
                        bool4 = bool10;
                        str6 = str14;
                        divisionTitle4 = divisionTitle2;
                        bool10 = bool4;
                        str14 = str6;
                        i6 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 11:
                        i7 |= 2048;
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, FloatSerializer.INSTANCE, f3);
                        divisionTitle2 = divisionTitle4;
                        bool4 = bool10;
                        str6 = str14;
                        divisionTitle4 = divisionTitle2;
                        bool10 = bool4;
                        str14 = str6;
                        i6 = 11;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            DivisionTitle divisionTitle5 = divisionTitle4;
            i = i7;
            f = f5;
            bool = bool8;
            str = str12;
            bool2 = bool9;
            f2 = f3;
            str2 = strDecodeStringElement2;
            divisionTitle = divisionTitle5;
            str3 = str11;
            bool3 = bool10;
            str4 = str13;
            addressCascaderFildValue = addressCascaderFildValue3;
            str5 = str14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AddressCascader(i, str4, str5, bool3, divisionTitle, addressCascaderFildValue, bool2, str2, bool, str, str3, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascader.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascader, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AddressCascader addressCascader) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(addressCascader, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AddressCascader.write$Self$OKCompliance_ok_compliance_impl(addressCascader, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
