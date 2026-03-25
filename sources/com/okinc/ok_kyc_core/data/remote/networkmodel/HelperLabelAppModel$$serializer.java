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
public final /* synthetic */ class HelperLabelAppModel$$serializer implements GeneratedSerializer<HelperLabelAppModel> {
    public static final int $stable;
    public static final HelperLabelAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private HelperLabelAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HelperLabelAppModel$$serializer helperLabelAppModel$$serializer = new HelperLabelAppModel$$serializer();
        INSTANCE = helperLabelAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelAppModel", helperLabelAppModel$$serializer, 11);
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
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(HelperLabelText$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(HelperLabelTag$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(C43788rvr.KWHzl), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final HelperLabelAppModel deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        UIAlignment uIAlignment;
        String str;
        Float f;
        String str2;
        Float f2;
        String str3;
        int i;
        HelperLabelTag helperLabelTag;
        Integer num;
        Boolean bool2;
        Boolean bool3;
        UIAlignment uIAlignment2;
        HelperLabelTag helperLabelTag2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 5;
        HelperLabelText helperLabelText = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, null);
            HelperLabelText helperLabelText2 = (HelperLabelText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, HelperLabelText$$serializer.INSTANCE, null);
            HelperLabelTag helperLabelTag3 = (HelperLabelTag) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, HelperLabelTag$$serializer.INSTANCE, null);
            UIAlignment uIAlignment3 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, C43788rvr.KWHzl, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            f = f3;
            str = str4;
            bool2 = bool5;
            str3 = strDecodeStringElement;
            uIAlignment = uIAlignment3;
            str2 = str5;
            bool = bool4;
            helperLabelTag = helperLabelTag3;
            helperLabelText = helperLabelText2;
            i = 2047;
            num = num2;
        } else {
            int i7 = 0;
            boolean z = true;
            Boolean bool6 = null;
            String str6 = null;
            Float f4 = null;
            String str7 = null;
            Float f5 = null;
            String strDecodeStringElement2 = null;
            Boolean bool7 = null;
            UIAlignment uIAlignment4 = null;
            HelperLabelTag helperLabelTag4 = null;
            Integer num3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool3 = bool7;
                        uIAlignment2 = uIAlignment4;
                        helperLabelTag2 = helperLabelTag4;
                        z = false;
                        bool7 = bool3;
                        uIAlignment4 = uIAlignment2;
                        helperLabelTag4 = helperLabelTag2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 0:
                        bool3 = bool7;
                        uIAlignment2 = uIAlignment4;
                        helperLabelTag2 = helperLabelTag4;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num3);
                        i7 |= 1;
                        bool7 = bool3;
                        uIAlignment4 = uIAlignment2;
                        helperLabelTag4 = helperLabelTag2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 1:
                        bool3 = bool7;
                        uIAlignment2 = uIAlignment4;
                        helperLabelTag2 = helperLabelTag4;
                        helperLabelText = (HelperLabelText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, HelperLabelText$$serializer.INSTANCE, helperLabelText);
                        i7 |= 2;
                        bool7 = bool3;
                        uIAlignment4 = uIAlignment2;
                        helperLabelTag4 = helperLabelTag2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 2:
                        bool3 = bool7;
                        uIAlignment2 = uIAlignment4;
                        helperLabelTag4 = (HelperLabelTag) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, HelperLabelTag$$serializer.INSTANCE, helperLabelTag4);
                        i7 |= 4;
                        helperLabelTag2 = helperLabelTag4;
                        bool7 = bool3;
                        uIAlignment4 = uIAlignment2;
                        helperLabelTag4 = helperLabelTag2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 3:
                        bool3 = bool7;
                        uIAlignment4 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, C43788rvr.KWHzl, uIAlignment4);
                        i7 |= 8;
                        uIAlignment2 = uIAlignment4;
                        helperLabelTag2 = helperLabelTag4;
                        bool7 = bool3;
                        uIAlignment4 = uIAlignment2;
                        helperLabelTag4 = helperLabelTag2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 4:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool7);
                        i7 |= 16;
                        uIAlignment2 = uIAlignment4;
                        helperLabelTag2 = helperLabelTag4;
                        bool7 = bool3;
                        uIAlignment4 = uIAlignment2;
                        helperLabelTag4 = helperLabelTag2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 5:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i7 |= 32;
                        bool3 = bool7;
                        uIAlignment2 = uIAlignment4;
                        helperLabelTag2 = helperLabelTag4;
                        bool7 = bool3;
                        uIAlignment4 = uIAlignment2;
                        helperLabelTag4 = helperLabelTag2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 6:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool6);
                        i7 |= 64;
                        bool3 = bool7;
                        uIAlignment2 = uIAlignment4;
                        helperLabelTag2 = helperLabelTag4;
                        bool7 = bool3;
                        uIAlignment4 = uIAlignment2;
                        helperLabelTag4 = helperLabelTag2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 7:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str6);
                        i7 |= 128;
                        bool3 = bool7;
                        uIAlignment2 = uIAlignment4;
                        helperLabelTag2 = helperLabelTag4;
                        bool7 = bool3;
                        uIAlignment4 = uIAlignment2;
                        helperLabelTag4 = helperLabelTag2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 8:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str7);
                        i7 |= 256;
                        break;
                    case 9:
                        i7 |= 512;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f4);
                        bool3 = bool7;
                        uIAlignment2 = uIAlignment4;
                        helperLabelTag2 = helperLabelTag4;
                        bool7 = bool3;
                        uIAlignment4 = uIAlignment2;
                        helperLabelTag4 = helperLabelTag2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 10:
                        i7 |= 1024;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f5);
                        bool3 = bool7;
                        uIAlignment2 = uIAlignment4;
                        helperLabelTag2 = helperLabelTag4;
                        bool7 = bool3;
                        uIAlignment4 = uIAlignment2;
                        helperLabelTag4 = helperLabelTag2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            HelperLabelTag helperLabelTag5 = helperLabelTag4;
            Integer num4 = num3;
            bool = bool7;
            uIAlignment = uIAlignment4;
            str = str6;
            f = f4;
            str2 = str7;
            f2 = f5;
            str3 = strDecodeStringElement2;
            i = i7;
            helperLabelTag = helperLabelTag5;
            num = num4;
            bool2 = bool6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HelperLabelAppModel(i, num, helperLabelText, helperLabelTag, uIAlignment, bool, str3, bool2, str, str2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelAppModel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull HelperLabelAppModel helperLabelAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(helperLabelAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HelperLabelAppModel.write$Self$OKCompliance_ok_compliance_impl(helperLabelAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
