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

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class TextContentAppModel$$serializer implements GeneratedSerializer<TextContentAppModel> {
    public static final int $stable;
    public static final TextContentAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TextContentAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TextContentAppModel$$serializer textContentAppModel$$serializer = new TextContentAppModel$$serializer();
        INSTANCE = textContentAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.TextContentAppModel", textContentAppModel$$serializer, 12);
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

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.TextContentAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = TextContentAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[2]), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(C43788rvr.KWHzl), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TextContentAppModel deserialize(@NotNull Decoder decoder) {
        List list;
        Float f;
        String str;
        Float f2;
        Boolean bool;
        Boolean bool2;
        String str2;
        String str3;
        UIAlignment uIAlignment;
        String str4;
        List list2;
        String str5;
        int i;
        KSerializer[] kSerializerArr;
        UIAlignment uIAlignment2;
        List list3;
        String str6;
        String str7;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = TextContentAppModel.$childSerializers;
        int i3 = 9;
        int i4 = 7;
        int i5 = 8;
        Float f3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr2[2], null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], null);
            UIAlignment uIAlignment3 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, C43788rvr.KWHzl, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            Float f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            str = str11;
            bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            f2 = f4;
            str3 = str10;
            bool = bool3;
            str2 = strDecodeStringElement;
            f = f5;
            uIAlignment = uIAlignment3;
            i = 4095;
            str5 = str8;
            str4 = str9;
            list = list5;
            list2 = list4;
        } else {
            int i6 = 11;
            String str12 = null;
            String str13 = null;
            Float f6 = null;
            Boolean bool4 = null;
            String strDecodeStringElement2 = null;
            UIAlignment uIAlignment4 = null;
            String str14 = null;
            List list6 = null;
            String str15 = null;
            int i7 = 0;
            boolean z = true;
            Boolean bool5 = null;
            list = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        uIAlignment2 = uIAlignment4;
                        list3 = list6;
                        str6 = str15;
                        z = false;
                        str7 = str6;
                        kSerializerArr2 = kSerializerArr;
                        str15 = str7;
                        uIAlignment4 = uIAlignment2;
                        list6 = list3;
                        i6 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 0:
                        uIAlignment2 = uIAlignment4;
                        list3 = list6;
                        str6 = str15;
                        kSerializerArr = kSerializerArr2;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str14);
                        i7 |= 1;
                        str7 = str6;
                        kSerializerArr2 = kSerializerArr;
                        str15 = str7;
                        uIAlignment4 = uIAlignment2;
                        list6 = list3;
                        i6 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 1:
                        uIAlignment2 = uIAlignment4;
                        list3 = list6;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str15);
                        kSerializerArr = kSerializerArr2;
                        i7 |= 2;
                        kSerializerArr2 = kSerializerArr;
                        str15 = str7;
                        uIAlignment4 = uIAlignment2;
                        list6 = list3;
                        i6 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 2:
                        uIAlignment2 = uIAlignment4;
                        kSerializerArr = kSerializerArr2;
                        i7 |= 4;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr2[2], list6);
                        str7 = str15;
                        kSerializerArr2 = kSerializerArr;
                        str15 = str7;
                        uIAlignment4 = uIAlignment2;
                        list6 = list3;
                        i6 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 3:
                        uIAlignment2 = uIAlignment4;
                        i7 |= 8;
                        kSerializerArr = kSerializerArr2;
                        list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr2[3], list);
                        list3 = list6;
                        str7 = str15;
                        kSerializerArr2 = kSerializerArr;
                        str15 = str7;
                        uIAlignment4 = uIAlignment2;
                        list6 = list3;
                        i6 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr2;
                        i7 |= 16;
                        list3 = list6;
                        uIAlignment2 = (UIAlignment) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, C43788rvr.KWHzl, uIAlignment4);
                        str7 = str15;
                        kSerializerArr2 = kSerializerArr;
                        str15 = str7;
                        uIAlignment4 = uIAlignment2;
                        list6 = list3;
                        i6 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 5:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 |= 32;
                        kSerializerArr = kSerializerArr2;
                        uIAlignment2 = uIAlignment4;
                        list3 = list6;
                        str7 = str15;
                        kSerializerArr2 = kSerializerArr;
                        str15 = str7;
                        uIAlignment4 = uIAlignment2;
                        list6 = list3;
                        i6 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 6:
                        i7 |= 64;
                        kSerializerArr = kSerializerArr2;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool5);
                        uIAlignment2 = uIAlignment4;
                        list3 = list6;
                        str7 = str15;
                        kSerializerArr2 = kSerializerArr;
                        str15 = str7;
                        uIAlignment4 = uIAlignment2;
                        list6 = list3;
                        i6 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 7:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str12);
                        i2 = i7 | 128;
                        kSerializerArr = kSerializerArr2;
                        i7 = i2;
                        uIAlignment2 = uIAlignment4;
                        list3 = list6;
                        str7 = str15;
                        kSerializerArr2 = kSerializerArr;
                        str15 = str7;
                        uIAlignment4 = uIAlignment2;
                        list6 = list3;
                        i6 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 8:
                        i7 |= 256;
                        kSerializerArr = kSerializerArr2;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str13);
                        uIAlignment2 = uIAlignment4;
                        list3 = list6;
                        str7 = str15;
                        kSerializerArr2 = kSerializerArr;
                        str15 = str7;
                        uIAlignment4 = uIAlignment2;
                        list6 = list3;
                        i6 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 9:
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f6);
                        i7 |= 512;
                        i6 = 11;
                        break;
                    case 10:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, FloatSerializer.INSTANCE, f3);
                        i2 = i7 | 1024;
                        kSerializerArr = kSerializerArr2;
                        i7 = i2;
                        uIAlignment2 = uIAlignment4;
                        list3 = list6;
                        str7 = str15;
                        kSerializerArr2 = kSerializerArr;
                        str15 = str7;
                        uIAlignment4 = uIAlignment2;
                        list6 = list3;
                        i6 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 11:
                        i7 |= 2048;
                        kSerializerArr = kSerializerArr2;
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, BooleanSerializer.INSTANCE, bool4);
                        uIAlignment2 = uIAlignment4;
                        list3 = list6;
                        str7 = str15;
                        kSerializerArr2 = kSerializerArr;
                        str15 = str7;
                        uIAlignment4 = uIAlignment2;
                        list6 = list3;
                        i6 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            UIAlignment uIAlignment5 = uIAlignment4;
            f = f3;
            str = str13;
            f2 = f6;
            bool = bool5;
            bool2 = bool4;
            str2 = strDecodeStringElement2;
            str3 = str12;
            uIAlignment = uIAlignment5;
            str4 = str15;
            list2 = list6;
            str5 = str14;
            i = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TextContentAppModel(i, str5, str4, list2, list, uIAlignment, str2, bool, str3, str, f2, f, bool2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TextContentAppModel textContentAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(textContentAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TextContentAppModel.write$Self$OKCompliance_ok_compliance_impl(textContentAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
