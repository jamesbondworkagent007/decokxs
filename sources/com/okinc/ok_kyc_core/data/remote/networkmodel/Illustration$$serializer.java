package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
public final /* synthetic */ class Illustration$$serializer implements GeneratedSerializer<Illustration> {
    public static final int $stable;
    public static final Illustration$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Illustration$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Illustration$$serializer illustration$$serializer = new Illustration$$serializer();
        INSTANCE = illustration$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(TtmlNode.TAG_IMAGE, illustration$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("blackImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("height", false);
        pluginGeneratedSerialDescriptor.addElement("width", false);
        pluginGeneratedSerialDescriptor.addElement("align", true);
        pluginGeneratedSerialDescriptor.addElement("androidAppIconId", true);
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
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(C43788rvr.KWHzl), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Illustration deserialize(@NotNull Decoder decoder) {
        String str;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        String str5;
        Float f;
        Float f2;
        String str6;
        String str7;
        UIAlignment uIAlignment;
        String str8;
        int i;
        String str9;
        Boolean bool2;
        String str10;
        UIAlignment uIAlignment2;
        Boolean bool3;
        String str11;
        String str12;
        String str13;
        Boolean bool4;
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
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, null);
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, null);
            uIAlignment = uIAlignment3;
            bool = bool6;
            str3 = str21;
            str2 = str20;
            str4 = str22;
            str9 = str19;
            str6 = str17;
            bool2 = bool5;
            str10 = str18;
            str5 = str23;
            str7 = strDecodeStringElement2;
            str8 = strDecodeStringElement;
            str = str16;
            i = 32767;
        } else {
            int i4 = 14;
            boolean z = true;
            String str24 = null;
            Boolean bool7 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            Float f3 = null;
            Float f4 = null;
            String str28 = null;
            String strDecodeStringElement3 = null;
            Boolean bool8 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String strDecodeStringElement4 = null;
            int i5 = 0;
            UIAlignment uIAlignment4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        uIAlignment2 = uIAlignment4;
                        bool3 = bool8;
                        str11 = str29;
                        str12 = str30;
                        str13 = str31;
                        z = false;
                        str31 = str13;
                        str29 = str11;
                        str30 = str12;
                        bool8 = bool3;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 0:
                        uIAlignment2 = uIAlignment4;
                        bool3 = bool8;
                        str11 = str29;
                        str12 = str30;
                        str13 = str31;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        str31 = str13;
                        str29 = str11;
                        str30 = str12;
                        bool8 = bool3;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 1:
                        uIAlignment2 = uIAlignment4;
                        bool3 = bool8;
                        str11 = str29;
                        str12 = str30;
                        str13 = str31;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        str31 = str13;
                        str29 = str11;
                        str30 = str12;
                        bool8 = bool3;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 2:
                        uIAlignment2 = uIAlignment4;
                        str11 = str29;
                        str12 = str30;
                        bool3 = bool8;
                        i5 |= 4;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str31);
                        str29 = str11;
                        str30 = str12;
                        bool8 = bool3;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 3:
                        uIAlignment2 = uIAlignment4;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str28);
                        i5 |= 8;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        uIAlignment2 = uIAlignment4;
                        bool4 = bool8;
                        str14 = str29;
                        str15 = str30;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str24);
                        i5 |= 16;
                        bool8 = bool4;
                        str29 = str14;
                        str30 = str15;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 5:
                        bool4 = bool8;
                        str14 = str29;
                        uIAlignment2 = uIAlignment4;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str30);
                        i5 |= 32;
                        bool8 = bool4;
                        str29 = str14;
                        str30 = str15;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 6:
                        bool4 = bool8;
                        str14 = str29;
                        uIAlignment4 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, C43788rvr.KWHzl, uIAlignment4);
                        i5 |= 64;
                        uIAlignment2 = uIAlignment4;
                        str15 = str30;
                        bool8 = bool4;
                        str29 = str14;
                        str30 = str15;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 7:
                        bool4 = bool8;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str29);
                        i5 |= 128;
                        uIAlignment2 = uIAlignment4;
                        str15 = str30;
                        bool8 = bool4;
                        str29 = str14;
                        str30 = str15;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 8:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool8);
                        i5 |= 256;
                        uIAlignment2 = uIAlignment4;
                        str14 = str29;
                        str15 = str30;
                        bool8 = bool4;
                        str29 = str14;
                        str30 = str15;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 9:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str25);
                        i5 |= 512;
                        uIAlignment2 = uIAlignment4;
                        bool4 = bool8;
                        str14 = str29;
                        str15 = str30;
                        bool8 = bool4;
                        str29 = str14;
                        str30 = str15;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 10:
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool7);
                        i5 |= 1024;
                        uIAlignment2 = uIAlignment4;
                        bool4 = bool8;
                        str14 = str29;
                        str15 = str30;
                        bool8 = bool4;
                        str29 = str14;
                        str30 = str15;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 11:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str26);
                        i5 |= 2048;
                        uIAlignment2 = uIAlignment4;
                        bool4 = bool8;
                        str14 = str29;
                        str15 = str30;
                        bool8 = bool4;
                        str29 = str14;
                        str30 = str15;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 12:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str27);
                        i5 |= 4096;
                        uIAlignment2 = uIAlignment4;
                        bool4 = bool8;
                        str14 = str29;
                        str15 = str30;
                        bool8 = bool4;
                        str29 = str14;
                        str30 = str15;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 13:
                        i5 |= 8192;
                        uIAlignment2 = uIAlignment4;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, FloatSerializer.INSTANCE, f4);
                        bool4 = bool8;
                        str14 = str29;
                        str15 = str30;
                        bool8 = bool4;
                        str29 = str14;
                        str30 = str15;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 14:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, FloatSerializer.INSTANCE, f3);
                        i5 |= 16384;
                        uIAlignment2 = uIAlignment4;
                        bool4 = bool8;
                        str14 = str29;
                        str15 = str30;
                        bool8 = bool4;
                        str29 = str14;
                        str30 = str15;
                        uIAlignment4 = uIAlignment2;
                        i4 = 14;
                        i2 = 10;
                        i3 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool9 = bool8;
            String str32 = str30;
            str = str31;
            bool = bool7;
            str2 = str29;
            str3 = str25;
            str4 = str26;
            str5 = str27;
            f = f3;
            f2 = f4;
            str6 = str28;
            str7 = strDecodeStringElement3;
            uIAlignment = uIAlignment4;
            str8 = strDecodeStringElement4;
            i = i5;
            str9 = str32;
            bool2 = bool9;
            str10 = str24;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Illustration(i, str8, str7, str, str6, str10, str9, uIAlignment, str2, bool2, str3, bool, str4, str5, f2, f, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.Illustration.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.Illustration, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Illustration illustration) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(illustration, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Illustration.write$Self$OKCompliance_ok_compliance_impl(illustration, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
