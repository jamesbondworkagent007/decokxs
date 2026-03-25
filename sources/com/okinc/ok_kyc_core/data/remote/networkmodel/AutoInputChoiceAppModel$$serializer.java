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
public final /* synthetic */ class AutoInputChoiceAppModel$$serializer implements GeneratedSerializer<AutoInputChoiceAppModel> {
    public static final int $stable;
    public static final AutoInputChoiceAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AutoInputChoiceAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AutoInputChoiceAppModel$$serializer autoInputChoiceAppModel$$serializer = new AutoInputChoiceAppModel$$serializer();
        INSTANCE = autoInputChoiceAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.AutoInputChoiceAppModel", autoInputChoiceAppModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("ctaOnClick", true);
        pluginGeneratedSerialDescriptor.addElement("choices", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        pluginGeneratedSerialDescriptor.addElement("searchText", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(CTAButtonAppModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CardChoices$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AutoInputChoiceAppModel deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        Float f;
        Float f2;
        String strDecodeStringElement;
        Boolean bool;
        CardChoices cardChoices;
        CTAButtonAppModel cTAButtonAppModel;
        Boolean bool2;
        String str3;
        Boolean bool3;
        CardChoices cardChoices2;
        CTAButtonAppModel cTAButtonAppModel2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 8;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            CTAButtonAppModel cTAButtonAppModel3 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CTAButtonAppModel$$serializer.INSTANCE, null);
            CardChoices cardChoices3 = (CardChoices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CardChoices$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, null);
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            f = f4;
            str2 = str5;
            str = str4;
            bool2 = bool5;
            f2 = f3;
            strDecodeStringElement2 = strDecodeStringElement4;
            i = 2047;
            str3 = strDecodeStringElement3;
            bool = bool4;
            cardChoices = cardChoices3;
            cTAButtonAppModel = cTAButtonAppModel3;
        } else {
            int i7 = 0;
            boolean z = true;
            String str6 = null;
            Boolean bool6 = null;
            String str7 = null;
            Float f5 = null;
            Float f6 = null;
            String strDecodeStringElement5 = null;
            Boolean bool7 = null;
            CardChoices cardChoices4 = null;
            CTAButtonAppModel cTAButtonAppModel4 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        cTAButtonAppModel2 = cTAButtonAppModel4;
                        z = false;
                        cTAButtonAppModel4 = cTAButtonAppModel2;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 0:
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 1:
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        cTAButtonAppModel4 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CTAButtonAppModel$$serializer.INSTANCE, cTAButtonAppModel4);
                        i7 |= 2;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 2:
                        bool3 = bool7;
                        cardChoices4 = (CardChoices) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CardChoices$$serializer.INSTANCE, cardChoices4);
                        i7 |= 4;
                        cardChoices2 = cardChoices4;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 3:
                        i7 |= 8;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool7);
                        cardChoices2 = cardChoices4;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 4:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        cTAButtonAppModel2 = cTAButtonAppModel4;
                        cTAButtonAppModel4 = cTAButtonAppModel2;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 5:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool6);
                        i7 |= 32;
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        cTAButtonAppModel2 = cTAButtonAppModel4;
                        cTAButtonAppModel4 = cTAButtonAppModel2;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 6:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str6);
                        i7 |= 64;
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        cTAButtonAppModel2 = cTAButtonAppModel4;
                        cTAButtonAppModel4 = cTAButtonAppModel2;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 7:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str7);
                        i7 |= 128;
                        break;
                    case 8:
                        i7 |= 256;
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, FloatSerializer.INSTANCE, f6);
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 9:
                        i7 |= 512;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f5);
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 10:
                        i7 |= 1024;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        bool3 = bool7;
                        cardChoices2 = cardChoices4;
                        bool7 = bool3;
                        cardChoices4 = cardChoices2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool8 = bool7;
            i = i7;
            str = str6;
            str2 = str7;
            f = f5;
            f2 = f6;
            strDecodeStringElement = strDecodeStringElement5;
            bool = bool8;
            cardChoices = cardChoices4;
            cTAButtonAppModel = cTAButtonAppModel4;
            bool2 = bool6;
            str3 = strDecodeStringElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AutoInputChoiceAppModel(i, str3, cTAButtonAppModel, cardChoices, bool, strDecodeStringElement2, bool2, str, str2, f2, f, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.AutoInputChoiceAppModel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.AutoInputChoiceAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AutoInputChoiceAppModel autoInputChoiceAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(autoInputChoiceAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AutoInputChoiceAppModel.write$Self$OKCompliance_ok_compliance_impl(autoInputChoiceAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
