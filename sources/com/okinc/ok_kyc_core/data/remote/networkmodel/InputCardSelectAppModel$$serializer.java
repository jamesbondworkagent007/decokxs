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
public final /* synthetic */ class InputCardSelectAppModel$$serializer implements GeneratedSerializer<InputCardSelectAppModel> {
    public static final int $stable;
    public static final InputCardSelectAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputCardSelectAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputCardSelectAppModel$$serializer inputCardSelectAppModel$$serializer = new InputCardSelectAppModel$$serializer();
        INSTANCE = inputCardSelectAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardSelectAppModel", inputCardSelectAppModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("choices", true);
        pluginGeneratedSerialDescriptor.addElement("alwaysShowTip", true);
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
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(Choices$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputCardSelectAppModel deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        String str;
        String str2;
        String str3;
        Float f;
        String str4;
        Boolean bool2;
        Float f2;
        Boolean bool3;
        int i;
        Choices choices;
        Boolean bool4;
        Choices choices2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 5;
        Boolean bool5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            Choices choices3 = (Choices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Choices$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, null);
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            str2 = str6;
            str = str5;
            bool = bool8;
            bool2 = bool7;
            f2 = f3;
            str3 = strDecodeStringElement2;
            bool3 = bool6;
            choices = choices3;
            i = 1023;
            str4 = strDecodeStringElement;
        } else {
            int i6 = 0;
            boolean z = true;
            Boolean bool9 = null;
            String str7 = null;
            Float f4 = null;
            String str8 = null;
            String strDecodeStringElement3 = null;
            Float f5 = null;
            Boolean bool10 = null;
            Choices choices4 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool4 = bool10;
                        choices2 = choices4;
                        z = false;
                        choices4 = choices2;
                        bool10 = bool4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 0:
                        bool4 = bool10;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        bool10 = bool4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 1:
                        bool4 = bool10;
                        choices4 = (Choices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Choices$$serializer.INSTANCE, choices4);
                        i6 |= 2;
                        bool10 = bool4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 2:
                        bool4 = bool10;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool5);
                        i6 |= 4;
                        bool10 = bool4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 3:
                        i6 |= 8;
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool10);
                        bool10 = bool4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 4:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        bool4 = bool10;
                        choices2 = choices4;
                        choices4 = choices2;
                        bool10 = bool4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 5:
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool9);
                        i6 |= 32;
                        bool4 = bool10;
                        choices2 = choices4;
                        choices4 = choices2;
                        bool10 = bool4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 6:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str7);
                        i6 |= 64;
                        break;
                    case 7:
                        i6 |= 128;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str8);
                        bool4 = bool10;
                        bool10 = bool4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 8:
                        i6 |= 256;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FloatSerializer.INSTANCE, f4);
                        bool4 = bool10;
                        bool10 = bool4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 9:
                        i6 |= 512;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f5);
                        bool4 = bool10;
                        bool10 = bool4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool11 = bool10;
            Choices choices5 = choices4;
            bool = bool9;
            str = str7;
            str2 = str8;
            str3 = strDecodeStringElement3;
            f = f5;
            str4 = strDecodeStringElement4;
            bool2 = bool11;
            f2 = f4;
            bool3 = bool5;
            i = i6;
            choices = choices5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputCardSelectAppModel(i, str4, choices, bool3, bool2, str3, bool, str, str2, f2, f, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardSelectAppModel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardSelectAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputCardSelectAppModel inputCardSelectAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputCardSelectAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputCardSelectAppModel.write$Self$OKCompliance_ok_compliance_impl(inputCardSelectAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
