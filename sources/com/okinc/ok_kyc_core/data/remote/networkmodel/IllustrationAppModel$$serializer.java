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
import o.C43788rvr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class IllustrationAppModel$$serializer implements GeneratedSerializer<IllustrationAppModel> {
    public static final int $stable;
    public static final IllustrationAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private IllustrationAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        IllustrationAppModel$$serializer illustrationAppModel$$serializer = new IllustrationAppModel$$serializer();
        INSTANCE = illustrationAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.IllustrationAppModel", illustrationAppModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("blackImageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("height", true);
        pluginGeneratedSerialDescriptor.addElement("width", true);
        pluginGeneratedSerialDescriptor.addElement("align", true);
        pluginGeneratedSerialDescriptor.addElement("androidAppIconId", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", true);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(C43788rvr.KWHzl), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final IllustrationAppModel deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        Boolean bool;
        String str4;
        Float f;
        Float f2;
        String str5;
        UIAlignment uIAlignment;
        String str6;
        String str7;
        String str8;
        String str9;
        int i;
        String str10;
        Boolean bool2;
        UIAlignment uIAlignment2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            UIAlignment uIAlignment3 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, C43788rvr.KWHzl, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, null);
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, null);
            uIAlignment = uIAlignment3;
            bool2 = bool4;
            str7 = strDecodeStringElement3;
            str = str20;
            str2 = str21;
            str10 = str19;
            str5 = str17;
            bool = bool3;
            str9 = str18;
            str4 = str22;
            str6 = strDecodeStringElement2;
            str8 = strDecodeStringElement;
            str3 = str16;
            i = 32767;
        } else {
            int i4 = 14;
            boolean z = true;
            String str23 = null;
            String str24 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str25 = null;
            Float f3 = null;
            Float f4 = null;
            String str26 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String strDecodeStringElement6 = null;
            int i5 = 0;
            UIAlignment uIAlignment4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        uIAlignment2 = uIAlignment4;
                        str11 = str27;
                        str12 = str28;
                        str13 = str29;
                        z = false;
                        str27 = str11;
                        str28 = str12;
                        str29 = str13;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 0:
                        uIAlignment2 = uIAlignment4;
                        str11 = str27;
                        str12 = str28;
                        str13 = str29;
                        i5 |= 1;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        str27 = str11;
                        str28 = str12;
                        str29 = str13;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 1:
                        uIAlignment2 = uIAlignment4;
                        str11 = str27;
                        str12 = str28;
                        str13 = str29;
                        i5 |= 2;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        str27 = str11;
                        str28 = str12;
                        str29 = str13;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 2:
                        str11 = str27;
                        str12 = str28;
                        uIAlignment2 = uIAlignment4;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str29);
                        i5 |= 4;
                        str27 = str11;
                        str28 = str12;
                        str29 = str13;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 3:
                        str14 = str27;
                        str15 = str28;
                        i5 |= 8;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str26);
                        str27 = str14;
                        str28 = str15;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        str14 = str27;
                        str15 = str28;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str23);
                        i5 |= 16;
                        str27 = str14;
                        str28 = str15;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 5:
                        str14 = str27;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str28);
                        i5 |= 32;
                        str27 = str14;
                        str28 = str15;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 6:
                        str14 = str27;
                        uIAlignment4 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, C43788rvr.KWHzl, uIAlignment4);
                        i5 |= 64;
                        str15 = str28;
                        str27 = str14;
                        str28 = str15;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 7:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str27);
                        i5 |= 128;
                        str15 = str28;
                        str27 = str14;
                        str28 = str15;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 8:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool5);
                        i5 |= 256;
                        str14 = str27;
                        str15 = str28;
                        str27 = str14;
                        str28 = str15;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 9:
                        i5 |= 512;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        str14 = str27;
                        str15 = str28;
                        str27 = str14;
                        str28 = str15;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 10:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool6);
                        i5 |= 1024;
                        str14 = str27;
                        str15 = str28;
                        str27 = str14;
                        str28 = str15;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 11:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str24);
                        i5 |= 2048;
                        str14 = str27;
                        str15 = str28;
                        str27 = str14;
                        str28 = str15;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 12:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str25);
                        i5 |= 4096;
                        str14 = str27;
                        str15 = str28;
                        str27 = str14;
                        str28 = str15;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 13:
                        i5 |= 8192;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, FloatSerializer.INSTANCE, f4);
                        str14 = str27;
                        str15 = str28;
                        str27 = str14;
                        str28 = str15;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 14:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, FloatSerializer.INSTANCE, f3);
                        i5 |= 16384;
                        str14 = str27;
                        str15 = str28;
                        str27 = str14;
                        str28 = str15;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str30 = str28;
            str = str27;
            str2 = str24;
            str3 = str29;
            bool = bool5;
            str4 = str25;
            f = f3;
            f2 = f4;
            str5 = str26;
            uIAlignment = uIAlignment4;
            str6 = strDecodeStringElement4;
            str7 = strDecodeStringElement5;
            str8 = strDecodeStringElement6;
            str9 = str23;
            i = i5;
            str10 = str30;
            bool2 = bool6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new IllustrationAppModel(i, str8, str6, str3, str5, str9, str10, uIAlignment, str, bool, str7, bool2, str2, str4, f2, f, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.IllustrationAppModel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.IllustrationAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull IllustrationAppModel illustrationAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(illustrationAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        IllustrationAppModel.write$Self$OKCompliance_ok_compliance_impl(illustrationAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
