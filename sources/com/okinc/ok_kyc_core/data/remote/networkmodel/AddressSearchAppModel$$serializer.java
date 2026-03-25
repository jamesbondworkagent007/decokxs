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
public final /* synthetic */ class AddressSearchAppModel$$serializer implements GeneratedSerializer<AddressSearchAppModel> {
    public static final int $stable;
    public static final AddressSearchAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AddressSearchAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AddressSearchAppModel$$serializer addressSearchAppModel$$serializer = new AddressSearchAppModel$$serializer();
        INSTANCE = addressSearchAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.AddressSearchAppModel", addressSearchAppModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("ctaButton", false);
        pluginGeneratedSerialDescriptor.addElement("placeholder", false);
        pluginGeneratedSerialDescriptor.addElement("addressAutoComplete", true);
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
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(CTAButtonAppModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(AddressAutoComplete$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AddressSearchAppModel deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        Boolean bool2;
        String str;
        Float f;
        String str2;
        CTAButtonAppModel cTAButtonAppModel;
        String str3;
        String str4;
        AddressAutoComplete addressAutoComplete;
        String str5;
        Float f2;
        int i;
        Boolean bool3;
        AddressAutoComplete addressAutoComplete2;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        String str7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            CTAButtonAppModel cTAButtonAppModel2 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CTAButtonAppModel$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            AddressAutoComplete addressAutoComplete3 = (AddressAutoComplete) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, AddressAutoComplete$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            f = f3;
            str2 = str9;
            bool2 = bool5;
            str3 = strDecodeStringElement2;
            addressAutoComplete = addressAutoComplete3;
            str = str10;
            bool = bool4;
            str5 = str8;
            cTAButtonAppModel = cTAButtonAppModel2;
            i = 2047;
            str4 = strDecodeStringElement;
        } else {
            int i6 = 0;
            boolean z = true;
            Boolean bool6 = null;
            String str11 = null;
            Float f4 = null;
            Float f5 = null;
            CTAButtonAppModel cTAButtonAppModel3 = null;
            String strDecodeStringElement3 = null;
            Boolean bool7 = null;
            AddressAutoComplete addressAutoComplete4 = null;
            String str12 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool3 = bool7;
                        addressAutoComplete2 = addressAutoComplete4;
                        str6 = str12;
                        z = false;
                        bool7 = bool3;
                        addressAutoComplete4 = addressAutoComplete2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 0:
                        bool3 = bool7;
                        addressAutoComplete2 = addressAutoComplete4;
                        str6 = str12;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        bool7 = bool3;
                        addressAutoComplete4 = addressAutoComplete2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 1:
                        bool3 = bool7;
                        addressAutoComplete2 = addressAutoComplete4;
                        str6 = str12;
                        cTAButtonAppModel3 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CTAButtonAppModel$$serializer.INSTANCE, cTAButtonAppModel3);
                        i6 |= 2;
                        bool7 = bool3;
                        addressAutoComplete4 = addressAutoComplete2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 2:
                        bool3 = bool7;
                        addressAutoComplete2 = addressAutoComplete4;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str12);
                        i6 |= 4;
                        str6 = str12;
                        bool7 = bool3;
                        addressAutoComplete4 = addressAutoComplete2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 3:
                        bool3 = bool7;
                        addressAutoComplete4 = (AddressAutoComplete) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, AddressAutoComplete$$serializer.INSTANCE, addressAutoComplete4);
                        i6 |= 8;
                        addressAutoComplete2 = addressAutoComplete4;
                        str6 = str12;
                        bool7 = bool3;
                        addressAutoComplete4 = addressAutoComplete2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 4:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool7);
                        i6 |= 16;
                        addressAutoComplete2 = addressAutoComplete4;
                        str6 = str12;
                        bool7 = bool3;
                        addressAutoComplete4 = addressAutoComplete2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 5:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        bool3 = bool7;
                        addressAutoComplete2 = addressAutoComplete4;
                        str6 = str12;
                        bool7 = bool3;
                        addressAutoComplete4 = addressAutoComplete2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 6:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool6);
                        i6 |= 64;
                        bool3 = bool7;
                        addressAutoComplete2 = addressAutoComplete4;
                        str6 = str12;
                        bool7 = bool3;
                        addressAutoComplete4 = addressAutoComplete2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 7:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str7);
                        i6 |= 128;
                        bool3 = bool7;
                        addressAutoComplete2 = addressAutoComplete4;
                        str6 = str12;
                        bool7 = bool3;
                        addressAutoComplete4 = addressAutoComplete2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 8:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str11);
                        i6 |= 256;
                        break;
                    case 9:
                        i6 |= 512;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f5);
                        bool3 = bool7;
                        addressAutoComplete2 = addressAutoComplete4;
                        str6 = str12;
                        bool7 = bool3;
                        addressAutoComplete4 = addressAutoComplete2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 10:
                        i6 |= 1024;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f4);
                        bool3 = bool7;
                        addressAutoComplete2 = addressAutoComplete4;
                        str6 = str12;
                        bool7 = bool3;
                        addressAutoComplete4 = addressAutoComplete2;
                        str12 = str6;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            AddressAutoComplete addressAutoComplete5 = addressAutoComplete4;
            String str13 = str12;
            bool = bool7;
            bool2 = bool6;
            str = str11;
            f = f5;
            str2 = str7;
            cTAButtonAppModel = cTAButtonAppModel3;
            str3 = strDecodeStringElement3;
            str4 = strDecodeStringElement4;
            addressAutoComplete = addressAutoComplete5;
            str5 = str13;
            f2 = f4;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AddressSearchAppModel(i, str4, cTAButtonAppModel, str5, addressAutoComplete, bool, str3, bool2, str2, str, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressSearchAppModel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.AddressSearchAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AddressSearchAppModel addressSearchAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(addressSearchAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AddressSearchAppModel.write$Self$OKCompliance_ok_compliance_impl(addressSearchAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
