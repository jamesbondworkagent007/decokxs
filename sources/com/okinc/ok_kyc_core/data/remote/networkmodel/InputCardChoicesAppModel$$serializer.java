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
public final /* synthetic */ class InputCardChoicesAppModel$$serializer implements GeneratedSerializer<InputCardChoicesAppModel> {
    public static final int $stable;
    public static final InputCardChoicesAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InputCardChoicesAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InputCardChoicesAppModel$$serializer inputCardChoicesAppModel$$serializer = new InputCardChoicesAppModel$$serializer();
        INSTANCE = inputCardChoicesAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardChoicesAppModel", inputCardChoicesAppModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("valueName", true);
        pluginGeneratedSerialDescriptor.addElement("choices", true);
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
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(CardChoices$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InputCardChoicesAppModel deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        Boolean bool2;
        String str;
        Float f;
        String str2;
        String str3;
        String str4;
        String str5;
        CardChoices cardChoices;
        String str6;
        Float f2;
        int i;
        Boolean bool3;
        CardChoices cardChoices2;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        String str8 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            CardChoices cardChoices3 = (CardChoices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CardChoices$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            i = 2047;
            f2 = f4;
            f = f3;
            str2 = str11;
            bool2 = bool5;
            str4 = strDecodeStringElement2;
            cardChoices = cardChoices3;
            str = str12;
            bool = bool4;
            str6 = str10;
            str3 = str9;
            str5 = strDecodeStringElement;
        } else {
            int i6 = 0;
            boolean z = true;
            Boolean bool6 = null;
            String str13 = null;
            Float f5 = null;
            Float f6 = null;
            String str14 = null;
            String strDecodeStringElement3 = null;
            Boolean bool7 = null;
            CardChoices cardChoices4 = null;
            String str15 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        str7 = str15;
                        z = false;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        str15 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 0:
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        str7 = str15;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        str15 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 1:
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        str7 = str15;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str14);
                        i6 |= 2;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        str15 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 2:
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str15);
                        i6 |= 4;
                        str7 = str15;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        str15 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 3:
                        bool3 = bool7;
                        cardChoices4 = (CardChoices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CardChoices$$serializer.INSTANCE, cardChoices4);
                        i6 |= 8;
                        cardChoices2 = cardChoices4;
                        str7 = str15;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        str15 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 4:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool7);
                        i6 |= 16;
                        cardChoices2 = cardChoices4;
                        str7 = str15;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        str15 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 5:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        str7 = str15;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        str15 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 6:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool6);
                        i6 |= 64;
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        str7 = str15;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        str15 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 7:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str8);
                        i6 |= 128;
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        str7 = str15;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        str15 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 8:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str13);
                        i6 |= 256;
                        break;
                    case 9:
                        i6 |= 512;
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f6);
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        str7 = str15;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        str15 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 10:
                        i6 |= 1024;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f5);
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        str7 = str15;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        str15 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            CardChoices cardChoices5 = cardChoices4;
            String str16 = str15;
            bool = bool7;
            bool2 = bool6;
            str = str13;
            f = f6;
            str2 = str8;
            str3 = str14;
            str4 = strDecodeStringElement3;
            str5 = strDecodeStringElement4;
            cardChoices = cardChoices5;
            str6 = str16;
            f2 = f5;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InputCardChoicesAppModel(i, str5, str3, str6, cardChoices, bool, str4, bool2, str2, str, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardChoicesAppModel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardChoicesAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InputCardChoicesAppModel inputCardChoicesAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inputCardChoicesAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InputCardChoicesAppModel.write$Self$OKCompliance_ok_compliance_impl(inputCardChoicesAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
