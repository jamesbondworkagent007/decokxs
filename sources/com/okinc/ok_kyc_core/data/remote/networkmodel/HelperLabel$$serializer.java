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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43788rvr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class HelperLabel$$serializer implements GeneratedSerializer<HelperLabel> {
    public static final int $stable;
    public static final HelperLabel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private HelperLabel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HelperLabel$$serializer helperLabel$$serializer = new HelperLabel$$serializer();
        INSTANCE = helperLabel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("hyper-label", helperLabel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("textTagGap", true);
        pluginGeneratedSerialDescriptor.addElement("text", true);
        pluginGeneratedSerialDescriptor.addElement("tag", true);
        pluginGeneratedSerialDescriptor.addElement("align", true);
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
        KSerializer nullable = BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(HelperLabelText$$serializer.INSTANCE);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(HelperLabelTag$$serializer.INSTANCE);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(C43788rvr.KWHzl);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(booleanSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable9 = BuiltinSerializersKt.getNullable(stringSerializer);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, nullable9, BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final HelperLabel deserialize(@NotNull Decoder decoder) {
        UIAlignment uIAlignment;
        int i;
        String str;
        String str2;
        Float f;
        Float f2;
        Boolean bool;
        String str3;
        HelperLabelText helperLabelText;
        Integer num;
        Boolean bool2;
        HelperLabelTag helperLabelTag;
        HelperLabelTag helperLabelTag2;
        HelperLabelText helperLabelText2;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 8;
        Float f3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, null);
            HelperLabelText helperLabelText3 = (HelperLabelText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, HelperLabelText$$serializer.INSTANCE, null);
            HelperLabelTag helperLabelTag3 = (HelperLabelTag) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, HelperLabelTag$$serializer.INSTANCE, null);
            UIAlignment uIAlignment2 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, C43788rvr.KWHzl, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            f = f4;
            str2 = str6;
            bool = bool4;
            str3 = str5;
            str = str7;
            bool2 = bool3;
            i = 2047;
            num = num2;
            uIAlignment = uIAlignment2;
            helperLabelTag = helperLabelTag3;
            helperLabelText = helperLabelText3;
        } else {
            int i7 = 0;
            boolean z = true;
            String str8 = null;
            String str9 = null;
            Float f5 = null;
            Boolean bool5 = null;
            uIAlignment = null;
            Boolean bool6 = null;
            HelperLabelTag helperLabelTag4 = null;
            HelperLabelText helperLabelText4 = null;
            Integer num3 = null;
            String str10 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        helperLabelTag2 = helperLabelTag4;
                        helperLabelText2 = helperLabelText4;
                        str4 = str10;
                        z = false;
                        str10 = str4;
                        helperLabelTag4 = helperLabelTag2;
                        helperLabelText4 = helperLabelText2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 0:
                        helperLabelTag2 = helperLabelTag4;
                        helperLabelText2 = helperLabelText4;
                        str4 = str10;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num3);
                        i7 |= 1;
                        str10 = str4;
                        helperLabelTag4 = helperLabelTag2;
                        helperLabelText4 = helperLabelText2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 1:
                        helperLabelTag2 = helperLabelTag4;
                        str4 = str10;
                        helperLabelText4 = (HelperLabelText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, HelperLabelText$$serializer.INSTANCE, helperLabelText4);
                        i7 |= 2;
                        helperLabelText2 = helperLabelText4;
                        str10 = str4;
                        helperLabelTag4 = helperLabelTag2;
                        helperLabelText4 = helperLabelText2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 2:
                        str4 = str10;
                        helperLabelTag2 = (HelperLabelTag) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, HelperLabelTag$$serializer.INSTANCE, helperLabelTag4);
                        i7 |= 4;
                        helperLabelText2 = helperLabelText4;
                        str10 = str4;
                        helperLabelTag4 = helperLabelTag2;
                        helperLabelText4 = helperLabelText2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 3:
                        str4 = str10;
                        uIAlignment = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, C43788rvr.KWHzl, uIAlignment);
                        i7 |= 8;
                        helperLabelTag2 = helperLabelTag4;
                        helperLabelText2 = helperLabelText4;
                        str10 = str4;
                        helperLabelTag4 = helperLabelTag2;
                        helperLabelText4 = helperLabelText2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 4:
                        str4 = str10;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool5);
                        i7 |= 16;
                        helperLabelTag2 = helperLabelTag4;
                        helperLabelText2 = helperLabelText4;
                        str10 = str4;
                        helperLabelTag4 = helperLabelTag2;
                        helperLabelText4 = helperLabelText2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 5:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str10);
                        i7 |= 32;
                        helperLabelTag2 = helperLabelTag4;
                        helperLabelText2 = helperLabelText4;
                        str10 = str4;
                        helperLabelTag4 = helperLabelTag2;
                        helperLabelText4 = helperLabelText2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 6:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool6);
                        i7 |= 64;
                        helperLabelTag2 = helperLabelTag4;
                        helperLabelText2 = helperLabelText4;
                        str4 = str10;
                        str10 = str4;
                        helperLabelTag4 = helperLabelTag2;
                        helperLabelText4 = helperLabelText2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 7:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str9);
                        i7 |= 128;
                        helperLabelTag2 = helperLabelTag4;
                        helperLabelText2 = helperLabelText4;
                        str4 = str10;
                        str10 = str4;
                        helperLabelTag4 = helperLabelTag2;
                        helperLabelText4 = helperLabelText2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 8:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str8);
                        i7 |= 256;
                        helperLabelTag2 = helperLabelTag4;
                        helperLabelText2 = helperLabelText4;
                        str4 = str10;
                        str10 = str4;
                        helperLabelTag4 = helperLabelTag2;
                        helperLabelText4 = helperLabelText2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        break;
                    case 9:
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f5);
                        i7 |= 512;
                        break;
                    case 10:
                        i7 |= 1024;
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f3);
                        helperLabelTag2 = helperLabelTag4;
                        helperLabelText2 = helperLabelText4;
                        str4 = str10;
                        str10 = str4;
                        helperLabelTag4 = helperLabelTag2;
                        helperLabelText4 = helperLabelText2;
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
            HelperLabelTag helperLabelTag5 = helperLabelTag4;
            HelperLabelText helperLabelText5 = helperLabelText4;
            i = i7;
            str = str8;
            str2 = str9;
            f = f5;
            f2 = f3;
            bool = bool6;
            str3 = str10;
            helperLabelText = helperLabelText5;
            num = num3;
            bool2 = bool5;
            helperLabelTag = helperLabelTag5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HelperLabel(i, num, helperLabelText, helperLabelTag, uIAlignment, bool2, str3, bool, str2, str, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull HelperLabel helperLabel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(helperLabel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HelperLabel.write$Self$OKCompliance_ok_compliance_impl(helperLabel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
