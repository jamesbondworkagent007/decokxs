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
import o.C43788rvr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class TextContent$$serializer implements GeneratedSerializer<TextContent> {
    public static final int $stable;
    public static final TextContent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TextContent$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TextContent$$serializer textContent$$serializer = new TextContent$$serializer();
        INSTANCE = textContent$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("text-content", textContent$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("richContent", true);
        pluginGeneratedSerialDescriptor.addElement("align", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.TextContent.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = TextContent.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(kSerializerArr[2]);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(kSerializerArr[3]);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(C43788rvr.KWHzl);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable9 = BuiltinSerializersKt.getNullable(stringSerializer);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, nullable9, BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TextContent deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        Boolean bool2;
        String str;
        String str2;
        Float f;
        Float f2;
        String str3;
        int i;
        List list;
        String str4;
        List list2;
        UIAlignment uIAlignment;
        String str5;
        UIAlignment uIAlignment2;
        int i2;
        KSerializer[] kSerializerArr;
        String str6;
        String str7;
        List list3;
        UIAlignment uIAlignment3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = TextContent.$childSerializers;
        int i3 = 9;
        int i4 = 8;
        Boolean bool3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr2[2], null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], null);
            UIAlignment uIAlignment4 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, C43788rvr.KWHzl, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            str2 = str12;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            f = f3;
            str = str11;
            bool2 = bool4;
            str4 = str10;
            f2 = f4;
            i = 4095;
            str5 = str8;
            list2 = list5;
            list = list4;
            uIAlignment = uIAlignment4;
            str3 = str9;
        } else {
            int i5 = 11;
            Boolean bool5 = null;
            String str13 = null;
            String str14 = null;
            Float f5 = null;
            Float f6 = null;
            String str15 = null;
            UIAlignment uIAlignment5 = null;
            String str16 = null;
            List list6 = null;
            int i6 = 0;
            boolean z = true;
            String str17 = null;
            List list7 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        str6 = str15;
                        str7 = str16;
                        list3 = list6;
                        uIAlignment3 = uIAlignment5;
                        z = false;
                        str15 = str6;
                        list6 = list3;
                        uIAlignment5 = uIAlignment3;
                        i5 = 11;
                        i3 = 9;
                        i4 = 8;
                        str16 = str7;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        str6 = str15;
                        list3 = list6;
                        String str18 = str16;
                        uIAlignment3 = uIAlignment5;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str18);
                        i6 |= 1;
                        str15 = str6;
                        list6 = list3;
                        uIAlignment5 = uIAlignment3;
                        i5 = 11;
                        i3 = 9;
                        i4 = 8;
                        str16 = str7;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 1:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str15);
                        i6 |= 2;
                        kSerializerArr2 = kSerializerArr2;
                        i5 = 11;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 2:
                        uIAlignment2 = uIAlignment5;
                        i6 |= 4;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr2[2], list6);
                        uIAlignment5 = uIAlignment2;
                        i5 = 11;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 3:
                        uIAlignment2 = uIAlignment5;
                        i6 |= 8;
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], list7);
                        uIAlignment5 = uIAlignment2;
                        i5 = 11;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 4:
                        uIAlignment2 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, C43788rvr.KWHzl, uIAlignment5);
                        i6 |= 16;
                        uIAlignment5 = uIAlignment2;
                        i5 = 11;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 5:
                        i6 |= 32;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str17);
                        uIAlignment2 = uIAlignment5;
                        uIAlignment5 = uIAlignment2;
                        i5 = 11;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 6:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool5);
                        i2 = i6 | 64;
                        i6 = i2;
                        uIAlignment2 = uIAlignment5;
                        uIAlignment5 = uIAlignment2;
                        i5 = 11;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 7:
                        i6 |= 128;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str13);
                        uIAlignment2 = uIAlignment5;
                        uIAlignment5 = uIAlignment2;
                        i5 = 11;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 8:
                        i6 |= 256;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str14);
                        uIAlignment2 = uIAlignment5;
                        uIAlignment5 = uIAlignment2;
                        i5 = 11;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 9:
                        i6 |= 512;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f5);
                        uIAlignment2 = uIAlignment5;
                        uIAlignment5 = uIAlignment2;
                        i5 = 11;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 10:
                        i6 |= 1024;
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, FloatSerializer.INSTANCE, f6);
                        uIAlignment2 = uIAlignment5;
                        uIAlignment5 = uIAlignment2;
                        i5 = 11;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 11:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool3);
                        i2 = i6 | 2048;
                        i6 = i2;
                        uIAlignment2 = uIAlignment5;
                        uIAlignment5 = uIAlignment2;
                        i5 = 11;
                        i3 = 9;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str19 = str15;
            bool = bool3;
            bool2 = bool5;
            str = str13;
            str2 = str14;
            f = f5;
            f2 = f6;
            str3 = str19;
            i = i6;
            list = list6;
            str4 = str17;
            list2 = list7;
            uIAlignment = uIAlignment5;
            str5 = str16;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TextContent(i, str5, str3, list, list2, uIAlignment, str4, bool2, str, str2, f, f2, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TextContent textContent) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(textContent, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TextContent.write$Self$OKCompliance_ok_compliance_impl(textContent, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
